package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Starting point for creating an ad in an ad group. */
trait AdBuilderSpace extends StObject {
  
  /** Returns a new expanded text ad builder associated with the ad group. */
  def expandedTextAdBuilder(): ExpandedTextAdBuilder
  
  /** Returns a new image ad builder associated with the ad group. */
  def imageAdBuilder(): ImageAdBuilder
  
  /** Returns a new responsive Display ad builder associated with the ad group. */
  def responsiveDisplayAdBuilder(): ResponsiveDisplayAdBuilder
  
  /** Returns a new responsive Search ad builder associated with the ad group. */
  def responsiveSearchAdBuilder(): ResponsiveSearchAdBuilder
}
object AdBuilderSpace {
  
  inline def apply(
    expandedTextAdBuilder: CallbackTo[ExpandedTextAdBuilder],
    imageAdBuilder: CallbackTo[ImageAdBuilder],
    responsiveDisplayAdBuilder: CallbackTo[ResponsiveDisplayAdBuilder],
    responsiveSearchAdBuilder: CallbackTo[ResponsiveSearchAdBuilder]
  ): AdBuilderSpace = {
    val __obj = js.Dynamic.literal(expandedTextAdBuilder = expandedTextAdBuilder.toJsFn, imageAdBuilder = imageAdBuilder.toJsFn, responsiveDisplayAdBuilder = responsiveDisplayAdBuilder.toJsFn, responsiveSearchAdBuilder = responsiveSearchAdBuilder.toJsFn)
    __obj.asInstanceOf[AdBuilderSpace]
  }
  
  extension [Self <: AdBuilderSpace](x: Self) {
    
    inline def setExpandedTextAdBuilder(value: CallbackTo[ExpandedTextAdBuilder]): Self = StObject.set(x, "expandedTextAdBuilder", value.toJsFn)
    
    inline def setImageAdBuilder(value: CallbackTo[ImageAdBuilder]): Self = StObject.set(x, "imageAdBuilder", value.toJsFn)
    
    inline def setResponsiveDisplayAdBuilder(value: CallbackTo[ResponsiveDisplayAdBuilder]): Self = StObject.set(x, "responsiveDisplayAdBuilder", value.toJsFn)
    
    inline def setResponsiveSearchAdBuilder(value: CallbackTo[ResponsiveSearchAdBuilder]): Self = StObject.set(x, "responsiveSearchAdBuilder", value.toJsFn)
  }
}
