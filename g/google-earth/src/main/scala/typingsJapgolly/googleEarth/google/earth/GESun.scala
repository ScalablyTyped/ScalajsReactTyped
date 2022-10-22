package typingsJapgolly.googleEarth.google.earth

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GESun extends StObject {
  
  /**
    *  Specifies whether the feature is drawn in the 3D viewer when it is initially loaded.
    *  In order for a feature to be visible, the visibility property and all of its ancestors must also be set to 1.
    */
  def getVisibility(): Boolean
  
  /**
    *  Specifies whether the feature is drawn in the 3D viewer when it is initially loaded.
    *  In order for a feature to be visible, the visibility property and all of its ancestors must also be set to 1.
    */
  def setVisibility(visibility: Boolean): Unit
}
object GESun {
  
  inline def apply(getVisibility: CallbackTo[Boolean], setVisibility: Boolean => Callback): GESun = {
    val __obj = js.Dynamic.literal(getVisibility = getVisibility.toJsFn, setVisibility = js.Any.fromFunction1((t0: Boolean) => setVisibility(t0).runNow()))
    __obj.asInstanceOf[GESun]
  }
  
  extension [Self <: GESun](x: Self) {
    
    inline def setGetVisibility(value: CallbackTo[Boolean]): Self = StObject.set(x, "getVisibility", value.toJsFn)
    
    inline def setSetVisibility(value: Boolean => Callback): Self = StObject.set(x, "setVisibility", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
  }
}
