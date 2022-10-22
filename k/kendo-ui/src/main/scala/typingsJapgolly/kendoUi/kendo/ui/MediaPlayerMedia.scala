package typingsJapgolly.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaPlayerMedia extends StObject {
  
  var source: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object MediaPlayerMedia {
  
  inline def apply(): MediaPlayerMedia = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaPlayerMedia]
  }
  
  extension [Self <: MediaPlayerMedia](x: Self) {
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
