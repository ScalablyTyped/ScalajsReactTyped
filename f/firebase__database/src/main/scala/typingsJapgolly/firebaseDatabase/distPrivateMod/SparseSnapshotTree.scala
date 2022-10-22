package typingsJapgolly.firebaseDatabase.distPrivateMod

import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Helper class to store a sparse set of snapshots.
  */
trait SparseSnapshotTree extends StObject {
  
  val children: Map[String, SparseSnapshotTree]
  
  var value: Node2 | Null
}
object SparseSnapshotTree {
  
  inline def apply(children: Map[String, SparseSnapshotTree]): SparseSnapshotTree = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], value = null)
    __obj.asInstanceOf[SparseSnapshotTree]
  }
  
  extension [Self <: SparseSnapshotTree](x: Self) {
    
    inline def setChildren(value: Map[String, SparseSnapshotTree]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Node2): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
  }
}
