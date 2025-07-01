import github_profile
import requests


def test_github_profile():
    assert github_profile.get_profile_info("karthik").lower() == "karthik ram"
    assert github_profile.get_profile_info("karth06") == "karthik"