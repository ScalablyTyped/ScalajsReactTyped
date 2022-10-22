package typingsJapgolly.activexLibreoffice.com_.sun.star.form

import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is fired if a database record is going to be deleted.
  *
  * Please do **not** use anymore, this struct is deprecated.
  * @deprecated Deprecated
  */
trait DatabaseDeleteEvent
  extends StObject
     with EventObject {
  
  var Bookmarks: SafeArray[Any]
}
object DatabaseDeleteEvent {
  
  inline def apply(Bookmarks: SafeArray[Any], Source: XInterface): DatabaseDeleteEvent = {
    val __obj = js.Dynamic.literal(Bookmarks = Bookmarks.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseDeleteEvent]
  }
  
  extension [Self <: DatabaseDeleteEvent](x: Self) {
    
    inline def setBookmarks(value: SafeArray[Any]): Self = StObject.set(x, "Bookmarks", value.asInstanceOf[js.Any])
  }
}
