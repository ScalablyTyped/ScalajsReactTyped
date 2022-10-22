package typingsJapgolly.googleAppsScript.GoogleAppsScript.Document

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object representing a bookmark.
  *
  *     // Insert a bookmark at the cursor position and log its ID.
  *     var doc = DocumentApp.getActiveDocument();
  *     var cursor = doc.getCursor();
  *     var bookmark = doc.addBookmark(cursor);
  *     Logger.log(bookmark.getId());
  */
trait Bookmark extends StObject {
  
  def getId(): String
  
  def getPosition(): Position
  
  def remove(): Unit
}
object Bookmark {
  
  inline def apply(getId: CallbackTo[String], getPosition: CallbackTo[Position], remove: Callback): Bookmark = {
    val __obj = js.Dynamic.literal(getId = getId.toJsFn, getPosition = getPosition.toJsFn, remove = remove.toJsFn)
    __obj.asInstanceOf[Bookmark]
  }
  
  extension [Self <: Bookmark](x: Self) {
    
    inline def setGetId(value: CallbackTo[String]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetPosition(value: CallbackTo[Position]): Self = StObject.set(x, "getPosition", value.toJsFn)
    
    inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
  }
}
