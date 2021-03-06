USE [db_DoAn_ver1]
GO
/****** Object:  Table [dbo].[Users]    Script Date: 15/05/2021 12:28:29 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Users](
	[user_id] [int] IDENTITY(1000000,1) NOT NULL,
	[role] [int] NOT NULL,
	[email] [varchar](50) NOT NULL,
	[full_name] [nvarchar](50) NOT NULL,
	[gender] [varchar](4) NULL,
	[enable] [bit] NULL,
	[avatar] [varchar](50) NULL,
	[auth_provider] [varchar](10) NULL
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Users] ON 

INSERT [dbo].[Users] ([user_id], [role], [email], [full_name], [gender], [enable], [avatar], [auth_provider]) VALUES (1000003, 0, N'quangnhde140289@fpt.edu.vn', N'Nguyen Hong Quang (K14 DN)', NULL, 0, NULL, N'0')
INSERT [dbo].[Users] ([user_id], [role], [email], [full_name], [gender], [enable], [avatar], [auth_provider]) VALUES (1000001, 0, N'quangnhde140289@fpt.edu.vn', N'Nguyen Hong Quang (K14 DN)', NULL, 0, NULL, N'1')
INSERT [dbo].[Users] ([user_id], [role], [email], [full_name], [gender], [enable], [avatar], [auth_provider]) VALUES (1000004, 0, N'khaiqt74@gmail.com', N'Khải Phan', NULL, 0, NULL, N'1')
SET IDENTITY_INSERT [dbo].[Users] OFF
GO
