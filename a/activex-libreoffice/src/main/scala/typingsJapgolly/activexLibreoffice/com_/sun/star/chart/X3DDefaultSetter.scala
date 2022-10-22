package typingsJapgolly.activexLibreoffice.com_.sun.star.chart

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it easy to set suitable defaults for illumination and rotation for 3D charts
  * @see Dim3DDiagram
  */
trait X3DDefaultSetter
  extends StObject
     with XInterface {
  
  /** The result may depend on the current chart type and the current shade mode. */
  def set3DSettingsToDefault(): Unit
  
  /**
    * set suitable defaults for the illumination of the current 3D chart. The result may dependent on other 3D settings as rotation or shade mode. It may
    * depend on the current chart type also.
    */
  def setDefaultIllumination(): Unit
  
  /** sets a suitable default for the rotation of the current 3D chart. The result may depend on the current chart type. */
  def setDefaultRotation(): Unit
}
object X3DDefaultSetter {
  
  inline def apply(
    acquire: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    set3DSettingsToDefault: Callback,
    setDefaultIllumination: Callback,
    setDefaultRotation: Callback
  ): X3DDefaultSetter = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, set3DSettingsToDefault = set3DSettingsToDefault.toJsFn, setDefaultIllumination = setDefaultIllumination.toJsFn, setDefaultRotation = setDefaultRotation.toJsFn)
    __obj.asInstanceOf[X3DDefaultSetter]
  }
  
  extension [Self <: X3DDefaultSetter](x: Self) {
    
    inline def setSet3DSettingsToDefault(value: Callback): Self = StObject.set(x, "set3DSettingsToDefault", value.toJsFn)
    
    inline def setSetDefaultIllumination(value: Callback): Self = StObject.set(x, "setDefaultIllumination", value.toJsFn)
    
    inline def setSetDefaultRotation(value: Callback): Self = StObject.set(x, "setDefaultRotation", value.toJsFn)
  }
}
