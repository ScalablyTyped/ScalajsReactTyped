package typingsJapgolly.reactNativeMaps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Frame extends StObject {
  
  var frame: typingsJapgolly.reactNativeMaps.libSharedTypesMod.Frame
  
  var point: typingsJapgolly.reactNativeMaps.libSharedTypesMod.Point
}
object Frame {
  
  inline def apply(
    frame: typingsJapgolly.reactNativeMaps.libSharedTypesMod.Frame,
    point: typingsJapgolly.reactNativeMaps.libSharedTypesMod.Point
  ): Frame = {
    val __obj = js.Dynamic.literal(frame = frame.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frame]
  }
  
  extension [Self <: Frame](x: Self) {
    
    inline def setFrame(value: typingsJapgolly.reactNativeMaps.libSharedTypesMod.Frame): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    inline def setPoint(value: typingsJapgolly.reactNativeMaps.libSharedTypesMod.Point): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
  }
}
