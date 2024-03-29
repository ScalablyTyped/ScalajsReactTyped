package typingsJapgolly.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgVideoPlayerBanner
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * Gets/Sets whether to apply animation effects when showing or hiding the banner. If set to true, the animation is played for banner.duration in milliseconds.
    *
    */
  var animate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets/Sets whether to automatically hide the banner. If set to true, the banner is hidden after [hidedelay](ui.igvideoplayer#options:banners.hidedelay) in milliseconds.
    *
    */
  var autohide: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets/Sets whether the user will be able to close the banner or not.
    *
    */
  var closeBanner: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets/Sets the banner specific css class, that will be applied on the banner grid.
    *
    */
  var css: js.UndefOr[String] = js.undefined
  
  /**
    * Gets/Sets the banner animation duration.
    *
    */
  var duration: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets/Sets the banner height
    *
    */
  var height: js.UndefOr[Double | String] = js.undefined
  
  /**
    * Gets/Sets the banner autohide delay in milliseconds. It is taken into account only if the banner.autohide option is set to true.
    *
    */
  var hidedelay: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets/Sets the banner image url.
    *
    */
  var imageUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Gets/Sets the banner link that will open in new window.
    *
    */
  var link: js.UndefOr[String] = js.undefined
  
  /**
    * Gets/Sets an array of numbers. Each number specifies on which second in the movie the banner will pop.
    *
    */
  var times: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * Gets/Sets whether the banner is visible or not.
    *
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets/Sets the banner width
    *
    */
  var width: js.UndefOr[Double | String] = js.undefined
}
object IgVideoPlayerBanner {
  
  inline def apply(): IgVideoPlayerBanner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgVideoPlayerBanner]
  }
  
  extension [Self <: IgVideoPlayerBanner](x: Self) {
    
    inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setAutohide(value: Boolean): Self = StObject.set(x, "autohide", value.asInstanceOf[js.Any])
    
    inline def setAutohideUndefined: Self = StObject.set(x, "autohide", js.undefined)
    
    inline def setCloseBanner(value: Boolean): Self = StObject.set(x, "closeBanner", value.asInstanceOf[js.Any])
    
    inline def setCloseBannerUndefined: Self = StObject.set(x, "closeBanner", js.undefined)
    
    inline def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHidedelay(value: Double): Self = StObject.set(x, "hidedelay", value.asInstanceOf[js.Any])
    
    inline def setHidedelayUndefined: Self = StObject.set(x, "hidedelay", js.undefined)
    
    inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
    
    inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setTimes(value: js.Array[Any]): Self = StObject.set(x, "times", value.asInstanceOf[js.Any])
    
    inline def setTimesUndefined: Self = StObject.set(x, "times", js.undefined)
    
    inline def setTimesVarargs(value: Any*): Self = StObject.set(x, "times", js.Array(value*))
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
