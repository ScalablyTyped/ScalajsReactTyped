package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * offers an easy way to insert bookmarks by name.
  * @see Text
  */
trait XBookmarkInsertTool
  extends StObject
     with XInterface {
  
  /** inserts a bookmark at the specified text position. */
  def insertNewBookmark(xTextRange: XTextRange, aName: String): XTextContent
}
object XBookmarkInsertTool {
  
  inline def apply(
    acquire: Callback,
    insertNewBookmark: (XTextRange, String) => XTextContent,
    queryInterface: `type` => Any,
    release: Callback
  ): XBookmarkInsertTool = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, insertNewBookmark = js.Any.fromFunction2(insertNewBookmark), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XBookmarkInsertTool]
  }
  
  extension [Self <: XBookmarkInsertTool](x: Self) {
    
    inline def setInsertNewBookmark(value: (XTextRange, String) => XTextContent): Self = StObject.set(x, "insertNewBookmark", js.Any.fromFunction2(value))
  }
}
