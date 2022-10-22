package typingsJapgolly.reactNativeWindows.rntypesMod

import typingsJapgolly.react.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointPropType extends StObject {
  
  var x: Double
  
  var y: Double
}
object PointPropType {
  
  @JSImport("react-native-windows/rntypes", "PointPropType")
  @js.native
  val ^ : Validator[PointPropType] = js.native
  
  extension [Self <: PointPropType](x: Self) {
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
