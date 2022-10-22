package typingsJapgolly.activexLibreoffice.com_.sun.star.xml.dom

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.xml.sax.XAttributeList
import typingsJapgolly.activexLibreoffice.com_.sun.star.xml.sax.XDocumentHandler
import typingsJapgolly.activexLibreoffice.com_.sun.star.xml.sax.XLocator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides a unified interface for the {@link SAXDocumentBuilder} service to implement.
  * @since LibreOffice 4.0
  */
trait XSAXDocumentBuilder2
  extends StObject
     with XSAXDocumentBuilder
     with XDocumentHandler
object XSAXDocumentBuilder2 {
  
  inline def apply(
    Document: XDocument,
    DocumentFragment: XDocumentFragment,
    State: SAXDocumentBuilderState,
    acquire: Callback,
    characters: String => Callback,
    endDocument: Callback,
    endDocumentFragment: Callback,
    endElement: String => Callback,
    getDocument: CallbackTo[XDocument],
    getDocumentFragment: CallbackTo[XDocumentFragment],
    getState: CallbackTo[SAXDocumentBuilderState],
    ignorableWhitespace: String => Callback,
    processingInstruction: (String, String) => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    reset: Callback,
    setDocumentLocator: XLocator => Callback,
    startDocument: Callback,
    startDocumentFragment: XDocument => Callback,
    startElement: (String, XAttributeList) => Callback
  ): XSAXDocumentBuilder2 = {
    val __obj = js.Dynamic.literal(Document = Document.asInstanceOf[js.Any], DocumentFragment = DocumentFragment.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], acquire = acquire.toJsFn, characters = js.Any.fromFunction1((t0: String) => characters(t0).runNow()), endDocument = endDocument.toJsFn, endDocumentFragment = endDocumentFragment.toJsFn, endElement = js.Any.fromFunction1((t0: String) => endElement(t0).runNow()), getDocument = getDocument.toJsFn, getDocumentFragment = getDocumentFragment.toJsFn, getState = getState.toJsFn, ignorableWhitespace = js.Any.fromFunction1((t0: String) => ignorableWhitespace(t0).runNow()), processingInstruction = js.Any.fromFunction2((t0: String, t1: String) => (processingInstruction(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, reset = reset.toJsFn, setDocumentLocator = js.Any.fromFunction1((t0: XLocator) => setDocumentLocator(t0).runNow()), startDocument = startDocument.toJsFn, startDocumentFragment = js.Any.fromFunction1((t0: XDocument) => startDocumentFragment(t0).runNow()), startElement = js.Any.fromFunction2((t0: String, t1: XAttributeList) => (startElement(t0, t1)).runNow()))
    __obj.asInstanceOf[XSAXDocumentBuilder2]
  }
}
