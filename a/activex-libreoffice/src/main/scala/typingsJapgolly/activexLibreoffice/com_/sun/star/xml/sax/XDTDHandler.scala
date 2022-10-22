package typingsJapgolly.activexLibreoffice.com_.sun.star.xml.sax

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * receives events according to the DTD of the document.
  *
  * The SAX parser may report these events in any order, regardless of the order in which the notations and unparsed entities were declared; however, all
  * DTD events must be reported after the document handler's `startDocument` event, and before the first `startElement` event. It is up to the application
  * to store the information for future use (perhaps in a hash table or object tree). If the application encounters attributes of type "NOTATION",
  * "ENTITY", or "ENTITIES", it can use the information that it obtained through this interface to find the entity and/or notation that corresponds with
  * the attribute value.
  */
trait XDTDHandler
  extends StObject
     with XInterface {
  
  /** receives notification of a notation declaration event. */
  def notationDecl(sName: String, sPublicId: String, sSystemId: String): Unit
  
  /** receives notification of an unparsed entity declaration event. */
  def unparsedEntityDecl(sName: String, sPublicId: String, sSystemId: String, sNotationName: String): Unit
}
object XDTDHandler {
  
  inline def apply(
    acquire: Callback,
    notationDecl: (String, String, String) => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    unparsedEntityDecl: (String, String, String, String) => Callback
  ): XDTDHandler = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, notationDecl = js.Any.fromFunction3((t0: String, t1: String, t2: String) => (notationDecl(t0, t1, t2)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, unparsedEntityDecl = js.Any.fromFunction4((t0: String, t1: String, t2: String, t3: String) => (unparsedEntityDecl(t0, t1, t2, t3)).runNow()))
    __obj.asInstanceOf[XDTDHandler]
  }
  
  extension [Self <: XDTDHandler](x: Self) {
    
    inline def setNotationDecl(value: (String, String, String) => Callback): Self = StObject.set(x, "notationDecl", js.Any.fromFunction3((t0: String, t1: String, t2: String) => (value(t0, t1, t2)).runNow()))
    
    inline def setUnparsedEntityDecl(value: (String, String, String, String) => Callback): Self = StObject.set(x, "unparsedEntityDecl", js.Any.fromFunction4((t0: String, t1: String, t2: String, t3: String) => (value(t0, t1, t2, t3)).runNow()))
  }
}
