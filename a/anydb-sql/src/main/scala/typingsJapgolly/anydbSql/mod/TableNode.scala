package typingsJapgolly.anydbSql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableNode extends StObject {
  
  def join(table: TableNode): JoinTableNode
  
  def leftJoin(table: TableNode): JoinTableNode
}
object TableNode {
  
  inline def apply(join: TableNode => JoinTableNode, leftJoin: TableNode => JoinTableNode): TableNode = {
    val __obj = js.Dynamic.literal(join = js.Any.fromFunction1(join), leftJoin = js.Any.fromFunction1(leftJoin))
    __obj.asInstanceOf[TableNode]
  }
  
  extension [Self <: TableNode](x: Self) {
    
    inline def setJoin(value: TableNode => JoinTableNode): Self = StObject.set(x, "join", js.Any.fromFunction1(value))
    
    inline def setLeftJoin(value: TableNode => JoinTableNode): Self = StObject.set(x, "leftJoin", js.Any.fromFunction1(value))
  }
}
