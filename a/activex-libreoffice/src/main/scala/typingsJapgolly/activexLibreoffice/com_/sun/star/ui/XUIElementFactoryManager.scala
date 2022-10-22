package typingsJapgolly.activexLibreoffice.com_.sun.star.ui

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides a unified interface for the new-style service {@link XUIElementFactoryManager} .
  * @since LibreOffice 4.1
  */
trait XUIElementFactoryManager
  extends StObject
     with XUIElementFactory
     with XUIElementFactoryRegistration
object XUIElementFactoryManager {
  
  inline def apply(
    RegisteredFactories: SafeArray[SafeArray[PropertyValue]],
    acquire: Callback,
    createUIElement: (String, SeqEquiv[PropertyValue]) => XUIElement,
    deregisterFactory: (String, String, String) => Callback,
    getFactory: (String, String) => XUIElementFactory,
    getRegisteredFactories: CallbackTo[SafeArray[SafeArray[PropertyValue]]],
    queryInterface: `type` => Any,
    registerFactory: (String, String, String, String) => Callback,
    release: Callback
  ): XUIElementFactoryManager = {
    val __obj = js.Dynamic.literal(RegisteredFactories = RegisteredFactories.asInstanceOf[js.Any], acquire = acquire.toJsFn, createUIElement = js.Any.fromFunction2(createUIElement), deregisterFactory = js.Any.fromFunction3((t0: String, t1: String, t2: String) => (deregisterFactory(t0, t1, t2)).runNow()), getFactory = js.Any.fromFunction2(getFactory), getRegisteredFactories = getRegisteredFactories.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), registerFactory = js.Any.fromFunction4((t0: String, t1: String, t2: String, t3: String) => (registerFactory(t0, t1, t2, t3)).runNow()), release = release.toJsFn)
    __obj.asInstanceOf[XUIElementFactoryManager]
  }
}
