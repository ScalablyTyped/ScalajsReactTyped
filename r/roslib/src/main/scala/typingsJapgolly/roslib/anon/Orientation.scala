package typingsJapgolly.roslib.anon

import typingsJapgolly.roslib.mod.QuaternionLike
import typingsJapgolly.roslib.mod.Vector3Like
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Orientation extends StObject {
  
  var orientation: js.UndefOr[QuaternionLike | Null] = js.undefined
  
  var position: js.UndefOr[Vector3Like | Null] = js.undefined
}
object Orientation {
  
  inline def apply(): Orientation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Orientation]
  }
  
  extension [Self <: Orientation](x: Self) {
    
    inline def setOrientation(value: QuaternionLike): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationNull: Self = StObject.set(x, "orientation", null)
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setPosition(value: Vector3Like): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionNull: Self = StObject.set(x, "position", null)
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
