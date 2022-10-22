package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * supplies access to the cursor in the view.
  *
  * This cursor is the same instance that is available in the user interface.
  * @see TextDocumentView
  */
trait XTextViewCursorSupplier
  extends StObject
     with XInterface {
  
  /** @returns the cursor of the document view. */
  val ViewCursor: XTextViewCursor
  
  /** @returns the cursor of the document view. */
  def getViewCursor(): XTextViewCursor
}
object XTextViewCursorSupplier {
  
  inline def apply(
    ViewCursor: XTextViewCursor,
    acquire: Callback,
    getViewCursor: CallbackTo[XTextViewCursor],
    queryInterface: `type` => Any,
    release: Callback
  ): XTextViewCursorSupplier = {
    val __obj = js.Dynamic.literal(ViewCursor = ViewCursor.asInstanceOf[js.Any], acquire = acquire.toJsFn, getViewCursor = getViewCursor.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XTextViewCursorSupplier]
  }
  
  extension [Self <: XTextViewCursorSupplier](x: Self) {
    
    inline def setGetViewCursor(value: CallbackTo[XTextViewCursor]): Self = StObject.set(x, "getViewCursor", value.toJsFn)
    
    inline def setViewCursor(value: XTextViewCursor): Self = StObject.set(x, "ViewCursor", value.asInstanceOf[js.Any])
  }
}
