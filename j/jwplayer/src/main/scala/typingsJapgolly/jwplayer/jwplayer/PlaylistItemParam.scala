package typingsJapgolly.jwplayer.jwplayer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaylistItemParam extends StObject {
  
  var index: Double
  
  var item: Any
}
object PlaylistItemParam {
  
  inline def apply(index: Double, item: Any): PlaylistItemParam = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaylistItemParam]
  }
  
  extension [Self <: PlaylistItemParam](x: Self) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
