package typingsJapgolly.activexLibreoffice.com_.sun.star.frame

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XMultiComponentFactory
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XComponentContext
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * a factory to create User Interface controllers.
  *
  * A user interface controller can be registered for a command URL. A certain user interface controller will be created when a user interface element
  * contains a registered command URL.
  * @see PopupMenuControllerFactory
  * @see StatusbarControllerFactory
  * @see ToolbarControllerFactory
  * @since LibreOffice 4.1
  */
trait XUIControllerFactory
  extends StObject
     with XMultiComponentFactory
     with XUIControllerRegistration
object XUIControllerFactory {
  
  inline def apply(
    AvailableServiceNames: SafeArray[String],
    acquire: Callback,
    createInstanceWithArgumentsAndContext: (String, SeqEquiv[Any], XComponentContext) => XInterface,
    createInstanceWithContext: (String, XComponentContext) => XInterface,
    deregisterController: (String, String) => Callback,
    getAvailableServiceNames: CallbackTo[SafeArray[String]],
    hasController: (String, String) => Boolean,
    queryInterface: `type` => Any,
    registerController: (String, String, String) => Callback,
    release: Callback
  ): XUIControllerFactory = {
    val __obj = js.Dynamic.literal(AvailableServiceNames = AvailableServiceNames.asInstanceOf[js.Any], acquire = acquire.toJsFn, createInstanceWithArgumentsAndContext = js.Any.fromFunction3(createInstanceWithArgumentsAndContext), createInstanceWithContext = js.Any.fromFunction2(createInstanceWithContext), deregisterController = js.Any.fromFunction2((t0: String, t1: String) => (deregisterController(t0, t1)).runNow()), getAvailableServiceNames = getAvailableServiceNames.toJsFn, hasController = js.Any.fromFunction2(hasController), queryInterface = js.Any.fromFunction1(queryInterface), registerController = js.Any.fromFunction3((t0: String, t1: String, t2: String) => (registerController(t0, t1, t2)).runNow()), release = release.toJsFn)
    __obj.asInstanceOf[XUIControllerFactory]
  }
}
