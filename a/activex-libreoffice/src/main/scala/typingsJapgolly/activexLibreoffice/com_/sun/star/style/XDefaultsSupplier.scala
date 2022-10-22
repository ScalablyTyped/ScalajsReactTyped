package typingsJapgolly.activexLibreoffice.com_.sun.star.style

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface provides access to an XPropertySet of defaults. This can either be the parent of an XPropertySet or the global property defaults for a
  * document.
  */
trait XDefaultsSupplier
  extends StObject
     with XInterface {
  
  /** This method returns an XPropertySet of defaults. */
  val Defaults: XPropertySet
  
  /** This method returns an XPropertySet of defaults. */
  def getDefaults(): XPropertySet
}
object XDefaultsSupplier {
  
  inline def apply(
    Defaults: XPropertySet,
    acquire: Callback,
    getDefaults: CallbackTo[XPropertySet],
    queryInterface: `type` => Any,
    release: Callback
  ): XDefaultsSupplier = {
    val __obj = js.Dynamic.literal(Defaults = Defaults.asInstanceOf[js.Any], acquire = acquire.toJsFn, getDefaults = getDefaults.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XDefaultsSupplier]
  }
  
  extension [Self <: XDefaultsSupplier](x: Self) {
    
    inline def setDefaults(value: XPropertySet): Self = StObject.set(x, "Defaults", value.asInstanceOf[js.Any])
    
    inline def setGetDefaults(value: CallbackTo[XPropertySet]): Self = StObject.set(x, "getDefaults", value.toJsFn)
  }
}
