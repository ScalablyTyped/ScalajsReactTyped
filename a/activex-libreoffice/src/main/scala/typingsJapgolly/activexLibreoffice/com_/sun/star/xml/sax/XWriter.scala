package typingsJapgolly.activexLibreoffice.com_.sun.star.xml.sax

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.io.XActiveDataSource
import typingsJapgolly.activexLibreoffice.com_.sun.star.io.XOutputStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides a unified interface for the new-style {@link Writer} service to implement.
  * @since LibreOffice 4.0
  */
trait XWriter
  extends StObject
     with XActiveDataSource
     with XExtendedDocumentHandler
object XWriter {
  
  inline def apply(
    OutputStream: XOutputStream,
    acquire: Callback,
    allowLineBreak: Callback,
    characters: String => Callback,
    comment: String => Callback,
    endCDATA: Callback,
    endDocument: Callback,
    endElement: String => Callback,
    getOutputStream: CallbackTo[XOutputStream],
    ignorableWhitespace: String => Callback,
    processingInstruction: (String, String) => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    setDocumentLocator: XLocator => Callback,
    setOutputStream: XOutputStream => Callback,
    startCDATA: Callback,
    startDocument: Callback,
    startElement: (String, XAttributeList) => Callback,
    unknown: String => Callback
  ): XWriter = {
    val __obj = js.Dynamic.literal(OutputStream = OutputStream.asInstanceOf[js.Any], acquire = acquire.toJsFn, allowLineBreak = allowLineBreak.toJsFn, characters = js.Any.fromFunction1((t0: String) => characters(t0).runNow()), comment = js.Any.fromFunction1((t0: String) => comment(t0).runNow()), endCDATA = endCDATA.toJsFn, endDocument = endDocument.toJsFn, endElement = js.Any.fromFunction1((t0: String) => endElement(t0).runNow()), getOutputStream = getOutputStream.toJsFn, ignorableWhitespace = js.Any.fromFunction1((t0: String) => ignorableWhitespace(t0).runNow()), processingInstruction = js.Any.fromFunction2((t0: String, t1: String) => (processingInstruction(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setDocumentLocator = js.Any.fromFunction1((t0: XLocator) => setDocumentLocator(t0).runNow()), setOutputStream = js.Any.fromFunction1((t0: XOutputStream) => setOutputStream(t0).runNow()), startCDATA = startCDATA.toJsFn, startDocument = startDocument.toJsFn, startElement = js.Any.fromFunction2((t0: String, t1: XAttributeList) => (startElement(t0, t1)).runNow()), unknown = js.Any.fromFunction1((t0: String) => unknown(t0).runNow()))
    __obj.asInstanceOf[XWriter]
  }
}
