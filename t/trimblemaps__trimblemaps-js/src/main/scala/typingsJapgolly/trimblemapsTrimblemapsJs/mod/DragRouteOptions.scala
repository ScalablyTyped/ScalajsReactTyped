package typingsJapgolly.trimblemapsTrimblemapsJs.mod

import typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsInts.`0`
import typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsInts.`1`
import typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsInts.`2`
import typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.altKey
import typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.ctrlKey
import typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.shiftKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragRouteOptions extends StObject {
  
  var snapKey: js.UndefOr[shiftKey | ctrlKey | altKey] = js.undefined
  
  var snapMode: js.UndefOr[`0` | `1` | `2`] = js.undefined
  
  var viaPointModifierKey: js.UndefOr[altKey | ctrlKey | shiftKey] = js.undefined
}
object DragRouteOptions {
  
  inline def apply(): DragRouteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DragRouteOptions]
  }
  
  extension [Self <: DragRouteOptions](x: Self) {
    
    inline def setSnapKey(value: shiftKey | ctrlKey | altKey): Self = StObject.set(x, "snapKey", value.asInstanceOf[js.Any])
    
    inline def setSnapKeyUndefined: Self = StObject.set(x, "snapKey", js.undefined)
    
    inline def setSnapMode(value: `0` | `1` | `2`): Self = StObject.set(x, "snapMode", value.asInstanceOf[js.Any])
    
    inline def setSnapModeUndefined: Self = StObject.set(x, "snapMode", js.undefined)
    
    inline def setViaPointModifierKey(value: altKey | ctrlKey | shiftKey): Self = StObject.set(x, "viaPointModifierKey", value.asInstanceOf[js.Any])
    
    inline def setViaPointModifierKeyUndefined: Self = StObject.set(x, "viaPointModifierKey", js.undefined)
  }
}
