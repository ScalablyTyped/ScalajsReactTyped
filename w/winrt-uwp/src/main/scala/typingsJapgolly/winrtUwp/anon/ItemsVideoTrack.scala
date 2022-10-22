package typingsJapgolly.winrtUwp.anon

import typingsJapgolly.winrtUwp.Windows.Media.Core.VideoTrack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemsVideoTrack extends StObject {
  
  /** The video tracks that start at startIndex in the list. */ var items: VideoTrack
  
  /** The number of video tracks retrieved. */ var returnValue: Double
}
object ItemsVideoTrack {
  
  inline def apply(items: VideoTrack, returnValue: Double): ItemsVideoTrack = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsVideoTrack]
  }
  
  extension [Self <: ItemsVideoTrack](x: Self) {
    
    inline def setItems(value: VideoTrack): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setReturnValue(value: Double): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
