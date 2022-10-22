package typingsJapgolly.googleEarth.google.earth

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GENavigationControl extends StObject {
  
  /**
    * Specifies the size of the navigation control.
    *
    * See also:
    *
    * * GEPlugin.NAVIGATION_CONTROL_LARGE
    * * GEPlugin.NAVIGATION_CONTROL_SMALL
    */
  def getControlType(): GENavigationControlEnum
  
  /**
    * The position of the navigation controls in Google Earth
    */
  def getScreenXY(): KmlVec2
  
  /**
    * Whether Street View is enabled in the navigation controls.
    */
  def getStreetViewEnabled(): Boolean
  
  /**
    * Whether the control is always visible, always hidden, or visible only when the user intends to use the control.
    *
    * See also:
    *
    * * GEPlugin.VISIBILITY_SHOW
    * * GEPlugin.VISIBILITY_HIDE
    * * GEPlugin.VISIBILITY_AUTO
    */
  def getVisibility(): GEVisibilityEnum
  
  /**
    * Specifies the size of the navigation control.
    *
    * See also:
    *
    * * GEPlugin.NAVIGATION_CONTROL_LARGE
    * * GEPlugin.NAVIGATION_CONTROL_SMALL
    */
  def setControlType(controlType: GENavigationControlEnum): Unit
  
  /**
    * Enables or disables user-initiated entry to Street View imagery.
    * When true, the Pegman icon is present in the navigation controls, allowing a user to drag the Pegman onto a street to initiate Street View.
    * Users can also zoom down to ground level to enter Street View when this is set to true.
    */
  def setStreetViewEnabled(streetViewEnabled: Boolean): Unit
  
  /**
    * Whether the control is always visible, always hidden, or visible only when the user intends to use the control.
    *
    * See also:
    *
    * * GEPlugin.VISIBILITY_SHOW
    * * GEPlugin.VISIBILITY_HIDE
    * * GEPlugin.VISIBILITY_AUTO
    */
  def setVisibility(visibility: GEVisibilityEnum): Unit
}
object GENavigationControl {
  
  inline def apply(
    getControlType: CallbackTo[GENavigationControlEnum],
    getScreenXY: CallbackTo[KmlVec2],
    getStreetViewEnabled: CallbackTo[Boolean],
    getVisibility: CallbackTo[GEVisibilityEnum],
    setControlType: GENavigationControlEnum => Callback,
    setStreetViewEnabled: Boolean => Callback,
    setVisibility: GEVisibilityEnum => Callback
  ): GENavigationControl = {
    val __obj = js.Dynamic.literal(getControlType = getControlType.toJsFn, getScreenXY = getScreenXY.toJsFn, getStreetViewEnabled = getStreetViewEnabled.toJsFn, getVisibility = getVisibility.toJsFn, setControlType = js.Any.fromFunction1((t0: GENavigationControlEnum) => setControlType(t0).runNow()), setStreetViewEnabled = js.Any.fromFunction1((t0: Boolean) => setStreetViewEnabled(t0).runNow()), setVisibility = js.Any.fromFunction1((t0: GEVisibilityEnum) => setVisibility(t0).runNow()))
    __obj.asInstanceOf[GENavigationControl]
  }
  
  extension [Self <: GENavigationControl](x: Self) {
    
    inline def setGetControlType(value: CallbackTo[GENavigationControlEnum]): Self = StObject.set(x, "getControlType", value.toJsFn)
    
    inline def setGetScreenXY(value: CallbackTo[KmlVec2]): Self = StObject.set(x, "getScreenXY", value.toJsFn)
    
    inline def setGetStreetViewEnabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "getStreetViewEnabled", value.toJsFn)
    
    inline def setGetVisibility(value: CallbackTo[GEVisibilityEnum]): Self = StObject.set(x, "getVisibility", value.toJsFn)
    
    inline def setSetControlType(value: GENavigationControlEnum => Callback): Self = StObject.set(x, "setControlType", js.Any.fromFunction1((t0: GENavigationControlEnum) => value(t0).runNow()))
    
    inline def setSetStreetViewEnabled(value: Boolean => Callback): Self = StObject.set(x, "setStreetViewEnabled", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetVisibility(value: GEVisibilityEnum => Callback): Self = StObject.set(x, "setVisibility", js.Any.fromFunction1((t0: GEVisibilityEnum) => value(t0).runNow()))
  }
}
