package typingsJapgolly.activexLibreoffice.com_.sun.star.ui

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.frame.XFrame
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies a configurable user interface element that supports persistence.
  *
  * Configurable user interface elements are: menubarpopupmenutoolbarstatusbar
  * @since OOo 2.0
  */
trait ConfigurableUIElement
  extends StObject
     with UIElement
     with XUIElementSettings {
  
  /**
    * specifies the configuration source of this user interface element.
    *
    * If the property {@link Persistent} is `TRUE` changes on the structure of the user interface element are written back to configuration source. When
    * this property is changed, afterwards {@link XUIElementSettings.updateSettings()} must be called so the user interface element tries to retrieve its
    * settings from the new user interface configuration manager.
    */
  var ConfigurationSource: XUIConfigurationManager
  
  /** specifies if the user interface element stores changes of its structure to its creator source defined by the property {@link ConfigurationSource} . */
  var Persistent: Boolean
}
object ConfigurableUIElement {
  
  inline def apply(
    ConfigurationSource: XUIConfigurationManager,
    Frame: XFrame,
    Persistent: Boolean,
    RealInterface: XInterface,
    ResourceURL: String,
    Type: Double,
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    dispose: Callback,
    getRealInterface: CallbackTo[XInterface],
    getSettings: Boolean => XIndexAccess,
    initialize: SeqEquiv[Any] => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeEventListener: XEventListener => Callback,
    setSettings: XIndexAccess => Callback,
    update: Callback,
    updateSettings: Callback
  ): ConfigurableUIElement = {
    val __obj = js.Dynamic.literal(ConfigurationSource = ConfigurationSource.asInstanceOf[js.Any], Frame = Frame.asInstanceOf[js.Any], Persistent = Persistent.asInstanceOf[js.Any], RealInterface = RealInterface.asInstanceOf[js.Any], ResourceURL = ResourceURL.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), dispose = dispose.toJsFn, getRealInterface = getRealInterface.toJsFn, getSettings = js.Any.fromFunction1(getSettings), initialize = js.Any.fromFunction1((t0: SeqEquiv[Any]) => initialize(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), setSettings = js.Any.fromFunction1((t0: XIndexAccess) => setSettings(t0).runNow()), update = update.toJsFn, updateSettings = updateSettings.toJsFn)
    __obj.asInstanceOf[ConfigurableUIElement]
  }
  
  extension [Self <: ConfigurableUIElement](x: Self) {
    
    inline def setConfigurationSource(value: XUIConfigurationManager): Self = StObject.set(x, "ConfigurationSource", value.asInstanceOf[js.Any])
    
    inline def setPersistent(value: Boolean): Self = StObject.set(x, "Persistent", value.asInstanceOf[js.Any])
  }
}
