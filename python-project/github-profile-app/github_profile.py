import requests


def get_profile_info(username: str) -> str:
    a=""
    if True:
        print("this executes anyways")
    
    url = f"https://api.github.com/users/{username}"
    try:
        response = requests.get(url)
        if response.status_code == 200:
            data = response.json()
            return data["name"]
    except Exception as e:
        print("Error:", e)


if __name__ == "__main__":
    user = "karth06"
    user_info_data = get_profile_info(user)
    print(user_info_data)
