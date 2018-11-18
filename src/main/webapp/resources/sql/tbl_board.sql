/*tbl_board 생성 */
create table tbl_board(
	bno number constraint bno_pk primary key,
	title varchar2(200) not null,
	content clob,
	writer varchar2(50) not null,
	regdate date default sysdate,
	viewcnt number default 0
);

/*tbl_board 시퀀스 */
create sequence bno_seq
 increment by 1 start with 1 nocache;
 
/*tbl_board 게시물 등록 */
insert into tbl_board(title, content, writer)
values ('제목입니다', '내용입니다','user01');

select * from TBL_BOARD where bno =1;

select
	*
from 
	TBL_BOARD
where 
	bno > 0 
order by bno desc;

update TBL_BOARD set title='수정된 제목'
where bno =1;

delete from tbl_board
where bno =1;
