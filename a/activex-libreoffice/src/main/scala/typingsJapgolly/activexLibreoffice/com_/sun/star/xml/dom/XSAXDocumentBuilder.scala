package typingsJapgolly.activexLibreoffice.com_.sun.star.xml.dom

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Builds a new dom tree */
trait XSAXDocumentBuilder
  extends StObject
     with XInterface {
  
  val Document: XDocument
  
  val DocumentFragment: XDocumentFragment
  
  val State: SAXDocumentBuilderState
  
  def endDocumentFragment(): Unit
  
  def getDocument(): XDocument
  
  def getDocumentFragment(): XDocumentFragment
  
  def getState(): SAXDocumentBuilderState
  
  def reset(): Unit
  
  def startDocumentFragment(ownerDoc: XDocument): Unit
}
object XSAXDocumentBuilder {
  
  inline def apply(
    Document: XDocument,
    DocumentFragment: XDocumentFragment,
    State: SAXDocumentBuilderState,
    acquire: Callback,
    endDocumentFragment: Callback,
    getDocument: CallbackTo[XDocument],
    getDocumentFragment: CallbackTo[XDocumentFragment],
    getState: CallbackTo[SAXDocumentBuilderState],
    queryInterface: `type` => Any,
    release: Callback,
    reset: Callback,
    startDocumentFragment: XDocument => Callback
  ): XSAXDocumentBuilder = {
    val __obj = js.Dynamic.literal(Document = Document.asInstanceOf[js.Any], DocumentFragment = DocumentFragment.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], acquire = acquire.toJsFn, endDocumentFragment = endDocumentFragment.toJsFn, getDocument = getDocument.toJsFn, getDocumentFragment = getDocumentFragment.toJsFn, getState = getState.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, reset = reset.toJsFn, startDocumentFragment = js.Any.fromFunction1((t0: XDocument) => startDocumentFragment(t0).runNow()))
    __obj.asInstanceOf[XSAXDocumentBuilder]
  }
  
  extension [Self <: XSAXDocumentBuilder](x: Self) {
    
    inline def setDocument(value: XDocument): Self = StObject.set(x, "Document", value.asInstanceOf[js.Any])
    
    inline def setDocumentFragment(value: XDocumentFragment): Self = StObject.set(x, "DocumentFragment", value.asInstanceOf[js.Any])
    
    inline def setEndDocumentFragment(value: Callback): Self = StObject.set(x, "endDocumentFragment", value.toJsFn)
    
    inline def setGetDocument(value: CallbackTo[XDocument]): Self = StObject.set(x, "getDocument", value.toJsFn)
    
    inline def setGetDocumentFragment(value: CallbackTo[XDocumentFragment]): Self = StObject.set(x, "getDocumentFragment", value.toJsFn)
    
    inline def setGetState(value: CallbackTo[SAXDocumentBuilderState]): Self = StObject.set(x, "getState", value.toJsFn)
    
    inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
    
    inline def setStartDocumentFragment(value: XDocument => Callback): Self = StObject.set(x, "startDocumentFragment", js.Any.fromFunction1((t0: XDocument) => value(t0).runNow()))
    
    inline def setState(value: SAXDocumentBuilderState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
  }
}
