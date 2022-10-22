package typingsJapgolly.activexLibreoffice.com_.sun.star.embed

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.io.XInputStream
import typingsJapgolly.activexLibreoffice.com_.sun.star.io.XStream
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This service provides a simple functionality to allow read/write the storages in OLE storage format. */
trait OLESimpleStorage
  extends StObject
     with XOLESimpleStorage {
  
  /**
    * is used to initialize the object on it's creation.
    * @param xInputStream [in] the InputStream that contains data in OLE storage format.
    * @param bNoTempCopy [in] specifies whether a temporary copy should be created during substreams opening. If the copy is not created the storage must stay
    */
  def createFromInputStream(xInputStream: XInputStream, bNoTempCopy: Boolean): Unit
  
  /**
    * is used to initialize the object on it's creation.
    * @param xStream [in] the Stream that contains data in OLE storage format.
    * @param bNoTempCopy [in] specifies whether a temporary copy should be created during substreams opening. If the copy is not created the storage must stay
    */
  def createFromStream(xStream: XStream, bNoTempCopy: Boolean): Unit
}
object OLESimpleStorage {
  
  inline def apply(
    ClassID: SafeArray[Double],
    ClassName: String,
    ElementNames: SafeArray[String],
    ElementType: `type`,
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    commit: Callback,
    createFromInputStream: (XInputStream, Boolean) => Callback,
    createFromStream: (XStream, Boolean) => Callback,
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
  ): OLESimpleStorage = {
    val __obj = js.Dynamic.literal(ClassID = ClassID.asInstanceOf[js.Any], ClassName = ClassName.asInstanceOf[js.Any], ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), commit = commit.toJsFn, createFromInputStream = js.Any.fromFunction2((t0: XInputStream, t1: Boolean) => (createFromInputStream(t0, t1)).runNow()), createFromStream = js.Any.fromFunction2((t0: XStream, t1: Boolean) => (createFromStream(t0, t1)).runNow()), dispose = dispose.toJsFn, getByName = js.Any.fromFunction1(getByName), getClassID = getClassID.toJsFn, getClassName = getClassName.toJsFn, getElementNames = getElementNames.toJsFn, getElementType = getElementType.toJsFn, hasByName = js.Any.fromFunction1(hasByName), hasElements = hasElements.toJsFn, insertByName = js.Any.fromFunction2((t0: String, t1: Any) => (insertByName(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeByName = js.Any.fromFunction1((t0: String) => removeByName(t0).runNow()), removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), replaceByName = js.Any.fromFunction2((t0: String, t1: Any) => (replaceByName(t0, t1)).runNow()), revert = revert.toJsFn, setClassInfo = js.Any.fromFunction2((t0: SeqEquiv[Double], t1: String) => (setClassInfo(t0, t1)).runNow()))
    __obj.asInstanceOf[OLESimpleStorage]
  }
  
  extension [Self <: OLESimpleStorage](x: Self) {
    
    inline def setCreateFromInputStream(value: (XInputStream, Boolean) => Callback): Self = StObject.set(x, "createFromInputStream", js.Any.fromFunction2((t0: XInputStream, t1: Boolean) => (value(t0, t1)).runNow()))
    
    inline def setCreateFromStream(value: (XStream, Boolean) => Callback): Self = StObject.set(x, "createFromStream", js.Any.fromFunction2((t0: XStream, t1: Boolean) => (value(t0, t1)).runNow()))
  }
}
