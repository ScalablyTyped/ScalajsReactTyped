package typingsJapgolly.gapiYoutube.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemCount extends StObject {
  
  /**
    * The number of videos in the playlist.
    */
  var itemCount: Double
}
object ItemCount {
  
  inline def apply(itemCount: Double): ItemCount = {
    val __obj = js.Dynamic.literal(itemCount = itemCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemCount]
  }
  
  extension [Self <: ItemCount](x: Self) {
    
    inline def setItemCount(value: Double): Self = StObject.set(x, "itemCount", value.asInstanceOf[js.Any])
  }
}
