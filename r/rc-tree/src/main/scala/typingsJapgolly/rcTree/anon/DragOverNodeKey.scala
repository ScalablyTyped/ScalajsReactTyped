package typingsJapgolly.rcTree.anon

import typingsJapgolly.rcTree.rcTreeInts.`-1`
import typingsJapgolly.rcTree.rcTreeInts.`0`
import typingsJapgolly.rcTree.rcTreeInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragOverNodeKey extends StObject {
  
  var dragOverNodeKey: typingsJapgolly.rcTree.esInterfaceMod.Key
  
  var dropAllowed: Boolean
  
  var dropContainerKey: typingsJapgolly.rcTree.esInterfaceMod.Key
  
  var dropLevelOffset: Double
  
  var dropPosition: `-1` | `0` | `1`
  
  var dropTargetKey: typingsJapgolly.rcTree.esInterfaceMod.Key
  
  var dropTargetPos: String
}
object DragOverNodeKey {
  
  inline def apply(
    dragOverNodeKey: typingsJapgolly.rcTree.esInterfaceMod.Key,
    dropAllowed: Boolean,
    dropContainerKey: typingsJapgolly.rcTree.esInterfaceMod.Key,
    dropLevelOffset: Double,
    dropPosition: `-1` | `0` | `1`,
    dropTargetKey: typingsJapgolly.rcTree.esInterfaceMod.Key,
    dropTargetPos: String
  ): DragOverNodeKey = {
    val __obj = js.Dynamic.literal(dragOverNodeKey = dragOverNodeKey.asInstanceOf[js.Any], dropAllowed = dropAllowed.asInstanceOf[js.Any], dropContainerKey = dropContainerKey.asInstanceOf[js.Any], dropLevelOffset = dropLevelOffset.asInstanceOf[js.Any], dropPosition = dropPosition.asInstanceOf[js.Any], dropTargetKey = dropTargetKey.asInstanceOf[js.Any], dropTargetPos = dropTargetPos.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragOverNodeKey]
  }
  
  extension [Self <: DragOverNodeKey](x: Self) {
    
    inline def setDragOverNodeKey(value: typingsJapgolly.rcTree.esInterfaceMod.Key): Self = StObject.set(x, "dragOverNodeKey", value.asInstanceOf[js.Any])
    
    inline def setDropAllowed(value: Boolean): Self = StObject.set(x, "dropAllowed", value.asInstanceOf[js.Any])
    
    inline def setDropContainerKey(value: typingsJapgolly.rcTree.esInterfaceMod.Key): Self = StObject.set(x, "dropContainerKey", value.asInstanceOf[js.Any])
    
    inline def setDropLevelOffset(value: Double): Self = StObject.set(x, "dropLevelOffset", value.asInstanceOf[js.Any])
    
    inline def setDropPosition(value: `-1` | `0` | `1`): Self = StObject.set(x, "dropPosition", value.asInstanceOf[js.Any])
    
    inline def setDropTargetKey(value: typingsJapgolly.rcTree.esInterfaceMod.Key): Self = StObject.set(x, "dropTargetKey", value.asInstanceOf[js.Any])
    
    inline def setDropTargetPos(value: String): Self = StObject.set(x, "dropTargetPos", value.asInstanceOf[js.Any])
  }
}
