package typingsJapgolly.nodeSql2.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Query[T]
  extends StObject
     with Queryable[T] {
  
  def from(statement: String): Query[T] = js.native
  def from(table: TableNode): Query[T] = js.native
  
  def group(nodes: Any*): Query[T] = js.native
  
  def limit(l: Double): Query[T] = js.native
  
  def offset(o: Double): Query[T] = js.native
  
  def order(criteria: OrderByValueNode*): Query[T] = js.native
  
  var resultType: T = js.native
  
  def update(o: js.Object): ModifyingQuery = js.native
  def update(o: StringDictionary[Any]): ModifyingQuery = js.native
}
