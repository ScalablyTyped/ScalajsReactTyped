package typingsJapgolly.activexLibreoffice.com_.sun.star.ui

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides functions to retrieve and change user interface element structure data and to update its visible representation.
  * @since OOo 2.0
  */
trait XUIElementSettings
  extends StObject
     with XInterface {
  
  /**
    * provides a {@link UIElementSettings} instance that provides access to the structure of user interface element if the user interface element type
    * supports it.
    * @param bWriteable must be `TRUE` if the retrieved settings should be a writable. Otherwise `FALSE` should be provided to get a shareable reference to th
    * @returns the current settings of the user interface element.
    */
  def getSettings(bWriteable: Boolean): XIndexAccess
  
  /**
    * set changes to the structure of the user interface element.
    * @param UISettings new data settings for the configurable user interface element.  User interface elements cannot be changed directly. The changed struct
    * @see com.sun.star.ui.UIElementSettings
    */
  def setSettings(UISettings: XIndexAccess): Unit
  
  /**
    * forces the user interface element to retrieve new settings from its configuration source.
    *
    * This is not done automatically as configurable user interface elements are controlled by layout managers. It is more efficient to let the responsible
    * layout manager to control the update process in a single task.
    */
  def updateSettings(): Unit
}
object XUIElementSettings {
  
  inline def apply(
    acquire: Callback,
    getSettings: Boolean => XIndexAccess,
    queryInterface: `type` => Any,
    release: Callback,
    setSettings: XIndexAccess => Callback,
    updateSettings: Callback
  ): XUIElementSettings = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, getSettings = js.Any.fromFunction1(getSettings), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setSettings = js.Any.fromFunction1((t0: XIndexAccess) => setSettings(t0).runNow()), updateSettings = updateSettings.toJsFn)
    __obj.asInstanceOf[XUIElementSettings]
  }
  
  extension [Self <: XUIElementSettings](x: Self) {
    
    inline def setGetSettings(value: Boolean => XIndexAccess): Self = StObject.set(x, "getSettings", js.Any.fromFunction1(value))
    
    inline def setSetSettings(value: XIndexAccess => Callback): Self = StObject.set(x, "setSettings", js.Any.fromFunction1((t0: XIndexAccess) => value(t0).runNow()))
    
    inline def setUpdateSettings(value: Callback): Self = StObject.set(x, "updateSettings", value.toJsFn)
  }
}
