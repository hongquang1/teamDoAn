package Mlem.com.Common.Entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class MyUserDetails implements UserDetails {

	private User user;
	
	public MyUserDetails(User user) {
		this.user = user;
	}

//	@Override
//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		Set<Role> roles = user.getRoles();
//		List<SimpleGrantedAuthority> authorities = new ArrayList<>();
//		
//		for (Role role : roles) {
//			authorities.add(new SimpleGrantedAuthority(role.getName()));
//		}
//		
//		return authorities;
//	}


	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

//	@Override
//	public boolean isEnabled() {
//		return user.isEnable();
//	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

}