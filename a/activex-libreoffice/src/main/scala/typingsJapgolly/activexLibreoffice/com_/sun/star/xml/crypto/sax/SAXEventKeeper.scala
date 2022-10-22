package typingsJapgolly.activexLibreoffice.com_.sun.star.xml.crypto.sax

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XInitialization
import typingsJapgolly.activexLibreoffice.com_.sun.star.xml.sax.XAttributeList
import typingsJapgolly.activexLibreoffice.com_.sun.star.xml.sax.XDocumentHandler
import typingsJapgolly.activexLibreoffice.com_.sun.star.xml.sax.XLocator
import typingsJapgolly.activexLibreoffice.com_.sun.star.xml.wrapper.XXMLElementWrapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Service of {@link SAXEventKeeper} */
trait SAXEventKeeper
  extends StObject
     with XSecuritySAXEventKeeper
     with XReferenceResolvedBroadcaster
     with XSAXEventKeeperStatusChangeBroadcaster
     with XDocumentHandler
     with XInitialization
object SAXEventKeeper {
  
  inline def apply(
    CurrentBlockingNode: XXMLElementWrapper,
    acquire: Callback,
    addBlocker: CallbackTo[Double],
    addElementCollector: CallbackTo[Double],
    addReferenceResolvedListener: (Double, XReferenceResolvedListener) => Callback,
    addSAXEventKeeperStatusChangeListener: XSAXEventKeeperStatusChangeListener => Callback,
    addSecurityElementCollector: (ElementMarkPriority, Boolean) => Double,
    characters: String => Callback,
    endDocument: Callback,
    endElement: String => Callback,
    getCurrentBlockingNode: CallbackTo[XXMLElementWrapper],
    getElement: Double => XXMLElementWrapper,
    ignorableWhitespace: String => Callback,
    initialize: SeqEquiv[Any] => Callback,
    isBlocking: CallbackTo[Boolean],
    printBufferNodeTree: CallbackTo[String],
    processingInstruction: (String, String) => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeBlocker: Double => Callback,
    removeElementCollector: Double => Callback,
    removeReferenceResolvedListener: (Double, XReferenceResolvedListener) => Callback,
    removeSAXEventKeeperStatusChangeListener: XSAXEventKeeperStatusChangeListener => Callback,
    setDocumentLocator: XLocator => Callback,
    setElement: (Double, XXMLElementWrapper) => Callback,
    setNextHandler: XDocumentHandler => XDocumentHandler,
    setSecurityId: (Double, Double) => Callback,
    startDocument: Callback,
    startElement: (String, XAttributeList) => Callback
  ): SAXEventKeeper = {
    val __obj = js.Dynamic.literal(CurrentBlockingNode = CurrentBlockingNode.asInstanceOf[js.Any], acquire = acquire.toJsFn, addBlocker = addBlocker.toJsFn, addElementCollector = addElementCollector.toJsFn, addReferenceResolvedListener = js.Any.fromFunction2((t0: Double, t1: XReferenceResolvedListener) => (addReferenceResolvedListener(t0, t1)).runNow()), addSAXEventKeeperStatusChangeListener = js.Any.fromFunction1((t0: XSAXEventKeeperStatusChangeListener) => addSAXEventKeeperStatusChangeListener(t0).runNow()), addSecurityElementCollector = js.Any.fromFunction2(addSecurityElementCollector), characters = js.Any.fromFunction1((t0: String) => characters(t0).runNow()), endDocument = endDocument.toJsFn, endElement = js.Any.fromFunction1((t0: String) => endElement(t0).runNow()), getCurrentBlockingNode = getCurrentBlockingNode.toJsFn, getElement = js.Any.fromFunction1(getElement), ignorableWhitespace = js.Any.fromFunction1((t0: String) => ignorableWhitespace(t0).runNow()), initialize = js.Any.fromFunction1((t0: SeqEquiv[Any]) => initialize(t0).runNow()), isBlocking = isBlocking.toJsFn, printBufferNodeTree = printBufferNodeTree.toJsFn, processingInstruction = js.Any.fromFunction2((t0: String, t1: String) => (processingInstruction(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeBlocker = js.Any.fromFunction1((t0: Double) => removeBlocker(t0).runNow()), removeElementCollector = js.Any.fromFunction1((t0: Double) => removeElementCollector(t0).runNow()), removeReferenceResolvedListener = js.Any.fromFunction2((t0: Double, t1: XReferenceResolvedListener) => (removeReferenceResolvedListener(t0, t1)).runNow()), removeSAXEventKeeperStatusChangeListener = js.Any.fromFunction1((t0: XSAXEventKeeperStatusChangeListener) => removeSAXEventKeeperStatusChangeListener(t0).runNow()), setDocumentLocator = js.Any.fromFunction1((t0: XLocator) => setDocumentLocator(t0).runNow()), setElement = js.Any.fromFunction2((t0: Double, t1: XXMLElementWrapper) => (setElement(t0, t1)).runNow()), setNextHandler = js.Any.fromFunction1(setNextHandler), setSecurityId = js.Any.fromFunction2((t0: Double, t1: Double) => (setSecurityId(t0, t1)).runNow()), startDocument = startDocument.toJsFn, startElement = js.Any.fromFunction2((t0: String, t1: XAttributeList) => (startElement(t0, t1)).runNow()))
    __obj.asInstanceOf[SAXEventKeeper]
  }
}
