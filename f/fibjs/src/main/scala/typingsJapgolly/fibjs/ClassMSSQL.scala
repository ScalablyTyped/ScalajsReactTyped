package typingsJapgolly.fibjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Class_MSSQL")
@js.native
class ClassMSSQL () extends ClassDbConnection {
  /**
  	 * 
  	 * @brief 选择当前数据库连接的缺省数据库
  	 * @param dbName 指定数据库名
  	 * 
  	 * 
  	 * @async
  	 */
  def use(dbName: String): Unit = js.native
}

