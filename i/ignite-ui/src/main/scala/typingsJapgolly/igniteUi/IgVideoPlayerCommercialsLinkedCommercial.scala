package typingsJapgolly.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgVideoPlayerCommercialsLinkedCommercial
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * Gets/Sets the link to open on linked commercial click.
    *
    */
  var link: js.UndefOr[String] = js.undefined
  
  /**
    * Gets/Sets the sources of the linked commercial video.
    *
    */
  var sources: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * Gets/Sets the second in the video at which the linked commercial should play.
    *
    */
  var startTime: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets/Sets the tooltip for the linked commercial bookmark.
    *
    */
  var title: js.UndefOr[String] = js.undefined
}
object IgVideoPlayerCommercialsLinkedCommercial {
  
  inline def apply(): IgVideoPlayerCommercialsLinkedCommercial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgVideoPlayerCommercialsLinkedCommercial]
  }
  
  extension [Self <: IgVideoPlayerCommercialsLinkedCommercial](x: Self) {
    
    inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setSources(value: js.Array[Any]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    inline def setSourcesVarargs(value: Any*): Self = StObject.set(x, "sources", js.Array(value*))
    
    inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
