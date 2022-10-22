package typingsJapgolly.activexLibreoffice.com_.sun.star.view

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides access to the view settings of the object. */
trait XViewSettingsSupplier
  extends StObject
     with XInterface {
  
  /** @returns an interface to the {@link ViewSettings} .  Subclasses might be returned instead, offering more settings. */
  val ViewSettings: XPropertySet
  
  /** @returns an interface to the {@link ViewSettings} .  Subclasses might be returned instead, offering more settings. */
  def getViewSettings(): XPropertySet
}
object XViewSettingsSupplier {
  
  inline def apply(
    ViewSettings: XPropertySet,
    acquire: Callback,
    getViewSettings: CallbackTo[XPropertySet],
    queryInterface: `type` => Any,
    release: Callback
  ): XViewSettingsSupplier = {
    val __obj = js.Dynamic.literal(ViewSettings = ViewSettings.asInstanceOf[js.Any], acquire = acquire.toJsFn, getViewSettings = getViewSettings.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XViewSettingsSupplier]
  }
  
  extension [Self <: XViewSettingsSupplier](x: Self) {
    
    inline def setGetViewSettings(value: CallbackTo[XPropertySet]): Self = StObject.set(x, "getViewSettings", value.toJsFn)
    
    inline def setViewSettings(value: XPropertySet): Self = StObject.set(x, "ViewSettings", value.asInstanceOf[js.Any])
  }
}
