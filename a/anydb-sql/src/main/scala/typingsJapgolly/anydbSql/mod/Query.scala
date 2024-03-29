package typingsJapgolly.anydbSql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Query[T]
  extends StObject
     with Executable[T]
     with Queryable[T] {
  
  def from(statement: String): Query[T] = js.native
  def from(table: TableNode): Query[T] = js.native
  
  def group(nodes: Any*): GroupQuery[T] = js.native
  @JSName("group")
  def group_Group(nodes: Any*): Group[Query[T]] = js.native
  
  def limit(l: Double): Query[T] = js.native
  
  def offset(o: Double): Query[T] = js.native
  
  def order(criteria: OrderByValueNode*): Query[T] = js.native
  
  def update(o: js.Object): ModifyingQuery = js.native
  def update(o: Dictionary[Any]): ModifyingQuery = js.native
}
