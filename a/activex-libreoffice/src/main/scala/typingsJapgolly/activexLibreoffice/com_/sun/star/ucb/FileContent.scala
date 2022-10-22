package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertiesChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertiesChangeNotifier
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyContainer
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfoChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfoChangeNotifier
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XChild
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A File {@link Content} represents either a directory or a file in the local file system.
  *
  * Whether a content represents a folder or a file can be determined by inspecting its property **IsFolder** or **IsDocument** .
  * @see com.sun.star.ucb.FileContentProvider
  */
trait FileContent
  extends StObject
     with XComponent
     with XContent
     with XContentCreator
     with XCommandProcessor2
     with XPropertiesChangeNotifier
     with XPropertyContainer
     with XPropertySetInfoChangeNotifier
     with XCommandInfoChangeNotifier
     with XChild
object FileContent {
  
  inline def apply(
    ContentType: String,
    Identifier: XContentIdentifier,
    Parent: XInterface,
    abort: Double => Callback,
    acquire: Callback,
    addCommandInfoChangeListener: XCommandInfoChangeListener => Callback,
    addContentEventListener: XContentEventListener => Callback,
    addEventListener: XEventListener => Callback,
    addPropertiesChangeListener: (SeqEquiv[String], XPropertiesChangeListener) => Callback,
    addProperty: (String, Double, Any) => Callback,
    addPropertySetInfoChangeListener: XPropertySetInfoChangeListener => Callback,
    createCommandIdentifier: CallbackTo[Double],
    createNewContent: ContentInfo => XContent,
    dispose: Callback,
    execute: (Command, Double, XCommandEnvironment) => Any,
    getContentType: CallbackTo[String],
    getIdentifier: CallbackTo[XContentIdentifier],
    getParent: CallbackTo[XInterface],
    queryCreatableContentsInfo: CallbackTo[SafeArray[ContentInfo]],
    queryInterface: `type` => Any,
    release: Callback,
    releaseCommandIdentifier: Double => Callback,
    removeCommandInfoChangeListener: XCommandInfoChangeListener => Callback,
    removeContentEventListener: XContentEventListener => Callback,
    removeEventListener: XEventListener => Callback,
    removePropertiesChangeListener: (SeqEquiv[String], XPropertiesChangeListener) => Callback,
    removeProperty: String => Callback,
    removePropertySetInfoChangeListener: XPropertySetInfoChangeListener => Callback,
    setParent: XInterface => Callback
  ): FileContent = {
    val __obj = js.Dynamic.literal(ContentType = ContentType.asInstanceOf[js.Any], Identifier = Identifier.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], abort = js.Any.fromFunction1((t0: Double) => abort(t0).runNow()), acquire = acquire.toJsFn, addCommandInfoChangeListener = js.Any.fromFunction1((t0: XCommandInfoChangeListener) => addCommandInfoChangeListener(t0).runNow()), addContentEventListener = js.Any.fromFunction1((t0: XContentEventListener) => addContentEventListener(t0).runNow()), addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addPropertiesChangeListener = js.Any.fromFunction2((t0: SeqEquiv[String], t1: XPropertiesChangeListener) => (addPropertiesChangeListener(t0, t1)).runNow()), addProperty = js.Any.fromFunction3((t0: String, t1: Double, t2: Any) => (addProperty(t0, t1, t2)).runNow()), addPropertySetInfoChangeListener = js.Any.fromFunction1((t0: XPropertySetInfoChangeListener) => addPropertySetInfoChangeListener(t0).runNow()), createCommandIdentifier = createCommandIdentifier.toJsFn, createNewContent = js.Any.fromFunction1(createNewContent), dispose = dispose.toJsFn, execute = js.Any.fromFunction3(execute), getContentType = getContentType.toJsFn, getIdentifier = getIdentifier.toJsFn, getParent = getParent.toJsFn, queryCreatableContentsInfo = queryCreatableContentsInfo.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, releaseCommandIdentifier = js.Any.fromFunction1((t0: Double) => releaseCommandIdentifier(t0).runNow()), removeCommandInfoChangeListener = js.Any.fromFunction1((t0: XCommandInfoChangeListener) => removeCommandInfoChangeListener(t0).runNow()), removeContentEventListener = js.Any.fromFunction1((t0: XContentEventListener) => removeContentEventListener(t0).runNow()), removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removePropertiesChangeListener = js.Any.fromFunction2((t0: SeqEquiv[String], t1: XPropertiesChangeListener) => (removePropertiesChangeListener(t0, t1)).runNow()), removeProperty = js.Any.fromFunction1((t0: String) => removeProperty(t0).runNow()), removePropertySetInfoChangeListener = js.Any.fromFunction1((t0: XPropertySetInfoChangeListener) => removePropertySetInfoChangeListener(t0).runNow()), setParent = js.Any.fromFunction1((t0: XInterface) => setParent(t0).runNow()))
    __obj.asInstanceOf[FileContent]
  }
}
