package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * gives access to the mark of a document index entry.
  * @see DocumentIndexMark
  */
trait XDocumentIndexMark
  extends StObject
     with XTextContent {
  
  /**
    * @returns the explicitly set string for the index mark.
    * @see setMarkEntry
    */
  var MarkEntry: String
  
  /**
    * @returns the explicitly set string for the index mark.
    * @see setMarkEntry
    */
  def getMarkEntry(): String
  
  /**
    * sets an explicit string for this index mark to use in the index.
    *
    * If empty, the string of the {@link TextRange} to which the {@link TextContent} refers is used in the index.
    */
  def setMarkEntry(aIndexEntry: String): Unit
}
object XDocumentIndexMark {
  
  inline def apply(
    Anchor: XTextRange,
    MarkEntry: String,
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    attach: XTextRange => Callback,
    dispose: Callback,
    getAnchor: CallbackTo[XTextRange],
    getMarkEntry: CallbackTo[String],
    queryInterface: `type` => Any,
    release: Callback,
    removeEventListener: XEventListener => Callback,
    setMarkEntry: String => Callback
  ): XDocumentIndexMark = {
    val __obj = js.Dynamic.literal(Anchor = Anchor.asInstanceOf[js.Any], MarkEntry = MarkEntry.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), attach = js.Any.fromFunction1((t0: XTextRange) => attach(t0).runNow()), dispose = dispose.toJsFn, getAnchor = getAnchor.toJsFn, getMarkEntry = getMarkEntry.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), setMarkEntry = js.Any.fromFunction1((t0: String) => setMarkEntry(t0).runNow()))
    __obj.asInstanceOf[XDocumentIndexMark]
  }
  
  extension [Self <: XDocumentIndexMark](x: Self) {
    
    inline def setGetMarkEntry(value: CallbackTo[String]): Self = StObject.set(x, "getMarkEntry", value.toJsFn)
    
    inline def setMarkEntry(value: String): Self = StObject.set(x, "MarkEntry", value.asInstanceOf[js.Any])
    
    inline def setSetMarkEntry(value: String => Callback): Self = StObject.set(x, "setMarkEntry", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
