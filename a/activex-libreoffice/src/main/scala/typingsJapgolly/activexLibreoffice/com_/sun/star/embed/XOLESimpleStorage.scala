package typingsJapgolly.activexLibreoffice.com_.sun.star.embed

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameContainer
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface allows to access and change contents of OLE storages.
  *
  * This is a simple container allowing the access to OLE storages. The subcomponents are either OLE storages themselves or streams.
  */
trait XOLESimpleStorage
  extends StObject
     with XNameContainer
     with XComponent
     with XTransactedObject
     with XClassifiedObject
object XOLESimpleStorage {
  
  inline def apply(
    ClassID: SafeArray[Double],
    ClassName: String,
    ElementNames: SafeArray[String],
    ElementType: `type`,
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    commit: Callback,
    dispose: Callback,
    getByName: String => Any,
    getClassID: CallbackTo[SafeArray[Double]],
    getClassName: CallbackTo[String],
    getElementNames: CallbackTo[SafeArray[String]],
    getElementType: CallbackTo[`type`],
    hasByName: String => Boolean,
    hasElements: CallbackTo[Boolean],
    insertByName: (String, Any) => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeByName: String => Callback,
    removeEventListener: XEventListener => Callback,
    replaceByName: (String, Any) => Callback,
    revert: Callback,
    setClassInfo: (SeqEquiv[Double], String) => Callback
  ): XOLESimpleStorage = {
    val __obj = js.Dynamic.literal(ClassID = ClassID.asInstanceOf[js.Any], ClassName = ClassName.asInstanceOf[js.Any], ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), commit = commit.toJsFn, dispose = dispose.toJsFn, getByName = js.Any.fromFunction1(getByName), getClassID = getClassID.toJsFn, getClassName = getClassName.toJsFn, getElementNames = getElementNames.toJsFn, getElementType = getElementType.toJsFn, hasByName = js.Any.fromFunction1(hasByName), hasElements = hasElements.toJsFn, insertByName = js.Any.fromFunction2((t0: String, t1: Any) => (insertByName(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeByName = js.Any.fromFunction1((t0: String) => removeByName(t0).runNow()), removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), replaceByName = js.Any.fromFunction2((t0: String, t1: Any) => (replaceByName(t0, t1)).runNow()), revert = revert.toJsFn, setClassInfo = js.Any.fromFunction2((t0: SeqEquiv[Double], t1: String) => (setClassInfo(t0, t1)).runNow()))
    __obj.asInstanceOf[XOLESimpleStorage]
  }
}
