package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to perform cursor movements between pages. */
trait XPageCursor
  extends StObject
     with XInterface {
  
  /** @returns the number of the page within the document of this cursor. */
  val Page: Double
  
  /** @returns the number of the page within the document of this cursor. */
  def getPage(): Double
  
  /**
    * moves the cursor to the end of the current page.
    * @see XPageCursor.jumpToEndOfPreviousPage
    */
  def jumpToEndOfPage(): Boolean
  
  /** moves the cursor to the first page. */
  def jumpToFirstPage(): Boolean
  
  /** moves the cursor to the last page. */
  def jumpToLastPage(): Boolean
  
  /**
    * moves the cursor to the next page.
    * @see XPageCursor.jumpToPreviousPage
    */
  def jumpToNextPage(): Boolean
  
  /** moves the cursor to the specified page. */
  def jumpToPage(nPage: Double): Boolean
  
  /**
    * moves the cursor to the previous page.
    * @see XPageCursor.jumpToNextPage
    */
  def jumpToPreviousPage(): Boolean
  
  /** moves the cursor to the start of the current page. */
  def jumpToStartOfPage(): Boolean
}
object XPageCursor {
  
  inline def apply(
    Page: Double,
    acquire: Callback,
    getPage: CallbackTo[Double],
    jumpToEndOfPage: CallbackTo[Boolean],
    jumpToFirstPage: CallbackTo[Boolean],
    jumpToLastPage: CallbackTo[Boolean],
    jumpToNextPage: CallbackTo[Boolean],
    jumpToPage: Double => Boolean,
    jumpToPreviousPage: CallbackTo[Boolean],
    jumpToStartOfPage: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback
  ): XPageCursor = {
    val __obj = js.Dynamic.literal(Page = Page.asInstanceOf[js.Any], acquire = acquire.toJsFn, getPage = getPage.toJsFn, jumpToEndOfPage = jumpToEndOfPage.toJsFn, jumpToFirstPage = jumpToFirstPage.toJsFn, jumpToLastPage = jumpToLastPage.toJsFn, jumpToNextPage = jumpToNextPage.toJsFn, jumpToPage = js.Any.fromFunction1(jumpToPage), jumpToPreviousPage = jumpToPreviousPage.toJsFn, jumpToStartOfPage = jumpToStartOfPage.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XPageCursor]
  }
  
  extension [Self <: XPageCursor](x: Self) {
    
    inline def setGetPage(value: CallbackTo[Double]): Self = StObject.set(x, "getPage", value.toJsFn)
    
    inline def setJumpToEndOfPage(value: CallbackTo[Boolean]): Self = StObject.set(x, "jumpToEndOfPage", value.toJsFn)
    
    inline def setJumpToFirstPage(value: CallbackTo[Boolean]): Self = StObject.set(x, "jumpToFirstPage", value.toJsFn)
    
    inline def setJumpToLastPage(value: CallbackTo[Boolean]): Self = StObject.set(x, "jumpToLastPage", value.toJsFn)
    
    inline def setJumpToNextPage(value: CallbackTo[Boolean]): Self = StObject.set(x, "jumpToNextPage", value.toJsFn)
    
    inline def setJumpToPage(value: Double => Boolean): Self = StObject.set(x, "jumpToPage", js.Any.fromFunction1(value))
    
    inline def setJumpToPreviousPage(value: CallbackTo[Boolean]): Self = StObject.set(x, "jumpToPreviousPage", value.toJsFn)
    
    inline def setJumpToStartOfPage(value: CallbackTo[Boolean]): Self = StObject.set(x, "jumpToStartOfPage", value.toJsFn)
    
    inline def setPage(value: Double): Self = StObject.set(x, "Page", value.asInstanceOf[js.Any])
  }
}
