//package models
//
//import com.google.common.collect.Table
//
//import play.api.db.slick.Config.driver.simple._
//
//
//
//case class Commit (id: Option[Int],
//                   name: String,
//
//                   comments: String
//                    )
//
//class CommitTable(tag:Tag) extends Table[Commit](tag,"CommentsTable"){
//
//  def id = column[Int]("ID",O.PrimaryKey,O.AutoInc)
//
//  def name = column[String]("NAME",O.Default(""))
//
//  def comments = column[String]("COMMENTS",O.Default(""))
//
//  def * =(id.?, name, comments) <>(Commit.tupled, Commit.unapply _)
//}