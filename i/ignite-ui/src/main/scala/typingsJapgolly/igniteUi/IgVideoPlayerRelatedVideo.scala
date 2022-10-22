package typingsJapgolly.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgVideoPlayerRelatedVideo
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * Gets/Sets custom CSS class to be applied on the related video element.
    *
    */
  var css: js.UndefOr[String] = js.undefined
  
  /**
    * Gets/Sets the height of the related video image.
    *
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets/Sets the URL of the related video image.
    *
    */
  var imageUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Gets/Sets a link to a page that will play the related video. It will be opened in a new window. If there are sources also, the link property has a priority.
    *
    */
  var link: js.UndefOr[String] = js.undefined
  
  /**
    * Gets/Sets the sources of the related video.
    *
    */
  var sources: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * Gets/Sets the title of the video.
    *
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * Gets/Sets the width of the related video image.
    *
    */
  var width: js.UndefOr[Double] = js.undefined
}
object IgVideoPlayerRelatedVideo {
  
  inline def apply(): IgVideoPlayerRelatedVideo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgVideoPlayerRelatedVideo]
  }
  
  extension [Self <: IgVideoPlayerRelatedVideo](x: Self) {
    
    inline def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
    
    inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setSources(value: js.Array[Any]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    inline def setSourcesVarargs(value: Any*): Self = StObject.set(x, "sources", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
