package typingsJapgolly.dexie.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.dexie.mod.IntervalTreeNode
  - typingsJapgolly.dexie.mod.EmptyRange
*/
trait IntervalTree extends StObject
object IntervalTree {
  
  inline def EmptyRange(): typingsJapgolly.dexie.mod.EmptyRange = {
    val __obj = js.Dynamic.literal(d = 0)
    __obj.asInstanceOf[typingsJapgolly.dexie.mod.EmptyRange]
  }
  
  inline def IntervalTreeNode(d: Double, from: IndexableType, to: IndexableType): typingsJapgolly.dexie.mod.IntervalTreeNode = {
    val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], l = null, r = null)
    __obj.asInstanceOf[typingsJapgolly.dexie.mod.IntervalTreeNode]
  }
}
