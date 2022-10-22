package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.Locale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is a factory to get {@link XAnyCompare} service implementations.
  * @since OOo 1.1.2
  */
trait AnyCompareFactory
  extends StObject
     with XAnyCompareFactory {
  
  def createWithLocale(aLocale: Locale): Unit
}
object AnyCompareFactory {
  
  inline def apply(
    acquire: Callback,
    createAnyCompareByName: String => XAnyCompare,
    createWithLocale: Locale => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): AnyCompareFactory = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, createAnyCompareByName = js.Any.fromFunction1(createAnyCompareByName), createWithLocale = js.Any.fromFunction1((t0: Locale) => createWithLocale(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[AnyCompareFactory]
  }
  
  extension [Self <: AnyCompareFactory](x: Self) {
    
    inline def setCreateWithLocale(value: Locale => Callback): Self = StObject.set(x, "createWithLocale", js.Any.fromFunction1((t0: Locale) => value(t0).runNow()))
  }
}
