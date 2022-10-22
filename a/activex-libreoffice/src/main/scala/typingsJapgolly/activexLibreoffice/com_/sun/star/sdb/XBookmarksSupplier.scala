package typingsJapgolly.activexLibreoffice.com_.sun.star.sdb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides access to the collection of all bookmarks associated with a data source. */
trait XBookmarksSupplier
  extends StObject
     with XInterface {
  
  /** @returns the collection of all bookmarks associated with a data source A bookmark is simply a string specifying the location of the bookmarked document. */
  val Bookmarks: XNameAccess
  
  /** @returns the collection of all bookmarks associated with a data source A bookmark is simply a string specifying the location of the bookmarked document. */
  def getBookmarks(): XNameAccess
}
object XBookmarksSupplier {
  
  inline def apply(
    Bookmarks: XNameAccess,
    acquire: Callback,
    getBookmarks: CallbackTo[XNameAccess],
    queryInterface: `type` => Any,
    release: Callback
  ): XBookmarksSupplier = {
    val __obj = js.Dynamic.literal(Bookmarks = Bookmarks.asInstanceOf[js.Any], acquire = acquire.toJsFn, getBookmarks = getBookmarks.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XBookmarksSupplier]
  }
  
  extension [Self <: XBookmarksSupplier](x: Self) {
    
    inline def setBookmarks(value: XNameAccess): Self = StObject.set(x, "Bookmarks", value.asInstanceOf[js.Any])
    
    inline def setGetBookmarks(value: CallbackTo[XNameAccess]): Self = StObject.set(x, "getBookmarks", value.toJsFn)
  }
}
