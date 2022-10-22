package typingsJapgolly.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgVideoPlayerCommercials
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * Customizes the ad message settings of the commercial. Ad message shows the duration of the commercial and pops up when the commercial starts playing.
    *
    */
  var adMessage: js.UndefOr[IgVideoPlayerCommercialsAdMessage] = js.undefined
  
  /**
    * Gets/Sets whether the commercials will play againg during the repetitive video plays.
    *
    */
  var alwaysPlayCommercials: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets/Sets an array of embedded commercials objects. An embedded commercial is an ad that is contained in the original video file. It is suitable when you want to mark some sections of the video as commercials.
    *
    */
  var embeddedCommercials: js.UndefOr[js.Array[IgVideoPlayerCommercialsEmbeddedCommercial]] = js.undefined
  
  /**
    * Gets/Sets an array of linked commercial objects. A linked commercial is a separate video file that will be played in the specified position of the original movie clip by [startTime](ui.igvideoplayer#options:commercials.linkedCommercials.startTime). This feature is useful if you have frequently changing outside commercial sources.
    *
    */
  var linkedCommercials: js.UndefOr[js.Array[IgVideoPlayerCommercialsLinkedCommercial]] = js.undefined
  
  /**
    * Gets/Sets whether to show commercial locations or not.
    *
    */
  var showBookmarks: js.UndefOr[Boolean] = js.undefined
}
object IgVideoPlayerCommercials {
  
  inline def apply(): IgVideoPlayerCommercials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgVideoPlayerCommercials]
  }
  
  extension [Self <: IgVideoPlayerCommercials](x: Self) {
    
    inline def setAdMessage(value: IgVideoPlayerCommercialsAdMessage): Self = StObject.set(x, "adMessage", value.asInstanceOf[js.Any])
    
    inline def setAdMessageUndefined: Self = StObject.set(x, "adMessage", js.undefined)
    
    inline def setAlwaysPlayCommercials(value: Boolean): Self = StObject.set(x, "alwaysPlayCommercials", value.asInstanceOf[js.Any])
    
    inline def setAlwaysPlayCommercialsUndefined: Self = StObject.set(x, "alwaysPlayCommercials", js.undefined)
    
    inline def setEmbeddedCommercials(value: js.Array[IgVideoPlayerCommercialsEmbeddedCommercial]): Self = StObject.set(x, "embeddedCommercials", value.asInstanceOf[js.Any])
    
    inline def setEmbeddedCommercialsUndefined: Self = StObject.set(x, "embeddedCommercials", js.undefined)
    
    inline def setEmbeddedCommercialsVarargs(value: IgVideoPlayerCommercialsEmbeddedCommercial*): Self = StObject.set(x, "embeddedCommercials", js.Array(value*))
    
    inline def setLinkedCommercials(value: js.Array[IgVideoPlayerCommercialsLinkedCommercial]): Self = StObject.set(x, "linkedCommercials", value.asInstanceOf[js.Any])
    
    inline def setLinkedCommercialsUndefined: Self = StObject.set(x, "linkedCommercials", js.undefined)
    
    inline def setLinkedCommercialsVarargs(value: IgVideoPlayerCommercialsLinkedCommercial*): Self = StObject.set(x, "linkedCommercials", js.Array(value*))
    
    inline def setShowBookmarks(value: Boolean): Self = StObject.set(x, "showBookmarks", value.asInstanceOf[js.Any])
    
    inline def setShowBookmarksUndefined: Self = StObject.set(x, "showBookmarks", js.undefined)
  }
}
