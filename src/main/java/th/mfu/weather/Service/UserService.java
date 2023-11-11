package th.mfu.weather.Service;

import th.mfu.weather.DTO.UserDTO;
import th.mfu.weather.DTO.LoginDTO;
import th.mfu.weather.response.LoginResponse;

public interface UserService {
    String addUser(UserDTO userDTO);
    LoginResponse loginUser(LoginDTO loginDTO);
}