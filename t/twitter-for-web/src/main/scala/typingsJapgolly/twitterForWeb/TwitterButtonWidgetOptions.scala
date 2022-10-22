package typingsJapgolly.twitterForWeb

import typingsJapgolly.twitterForWeb.twitterForWebStrings.large
import typingsJapgolly.twitterForWeb.twitterForWebStrings.left
import typingsJapgolly.twitterForWeb.twitterForWebStrings.medium
import typingsJapgolly.twitterForWeb.twitterForWebStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The interface for additional configuration for button widgets.
  */
trait TwitterButtonWidgetOptions
  extends StObject
     with TwitterWidgetOptions {
  
  /**
    * The alignment of the button within an iframe; use this to ensure flush layout when aligning buttons against opposite edges of your grid.
    */
  var align: js.UndefOr[left | right] = js.undefined
  
  /**
    * Share button and Follow button only. (Vertical count only available for share buttons.)
    */
  var count: js.UndefOr[String] = js.undefined
  
  /**
    * If the canonical URL to be counted is different from the URL to be shared, you can provide this URL to reference the count. (Share button only.)
    */
  var counturl: js.UndefOr[String] = js.undefined
  
  /**
    * medium or large
    */
  var size: js.UndefOr[medium | large] = js.undefined
  
  /**
    * The default, highlighted text a user sees in the Tweet Web Intent.
    */
  var text: js.UndefOr[String] = js.undefined
}
object TwitterButtonWidgetOptions {
  
  inline def apply(): TwitterButtonWidgetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TwitterButtonWidgetOptions]
  }
  
  extension [Self <: TwitterButtonWidgetOptions](x: Self) {
    
    inline def setAlign(value: left | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setCounturl(value: String): Self = StObject.set(x, "counturl", value.asInstanceOf[js.Any])
    
    inline def setCounturlUndefined: Self = StObject.set(x, "counturl", js.undefined)
    
    inline def setSize(value: medium | large): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
