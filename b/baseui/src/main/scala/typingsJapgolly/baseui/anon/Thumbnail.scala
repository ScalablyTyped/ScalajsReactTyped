package typingsJapgolly.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Thumbnail extends StObject {
  
  val thumbnail: js.UndefOr[String] = js.undefined
}
object Thumbnail {
  
  inline def apply(): Thumbnail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Thumbnail]
  }
  
  extension [Self <: Thumbnail](x: Self) {
    
    inline def setThumbnail(value: String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    inline def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
  }
}
