package typingsJapgolly.reactNativeMaps.anon

import typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.`callout-inside-press`
import typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.`marker-inside-overlay-press`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Action extends StObject {
  
  /**
    * Apple Maps: `callout-inside-press`
    *
    * Google Maps: `marker-inside-overlay-press`
    */
  var action: `callout-inside-press` | `marker-inside-overlay-press`
  
  var frame: typingsJapgolly.reactNativeMaps.libSharedTypesMod.Frame
  
  var id: String
  
  var point: typingsJapgolly.reactNativeMaps.libSharedTypesMod.Point
}
object Action {
  
  inline def apply(
    action: `callout-inside-press` | `marker-inside-overlay-press`,
    frame: typingsJapgolly.reactNativeMaps.libSharedTypesMod.Frame,
    id: String,
    point: typingsJapgolly.reactNativeMaps.libSharedTypesMod.Point
  ): Action = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  
  extension [Self <: Action](x: Self) {
    
    inline def setAction(value: `callout-inside-press` | `marker-inside-overlay-press`): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setFrame(value: typingsJapgolly.reactNativeMaps.libSharedTypesMod.Frame): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setPoint(value: typingsJapgolly.reactNativeMaps.libSharedTypesMod.Point): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
  }
}
