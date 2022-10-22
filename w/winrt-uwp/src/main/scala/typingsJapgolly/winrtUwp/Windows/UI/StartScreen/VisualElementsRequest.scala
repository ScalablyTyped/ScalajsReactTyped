package typingsJapgolly.winrtUwp.Windows.UI.StartScreen

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides a method to delay the display of the Pin to Start flyout, as well as methods through which you can set the visual elements of the secondary tile to be presented in that flyout as well as alternate versions of the tile that can also be presented as options. */
trait VisualElementsRequest extends StObject {
  
  /** Gets a set of objects that provide alternate logo images, background and foreground colors, and display name. These alternates are shown to the user in the Pin to Start flyout. */
  var alternateVisualElements: IVectorView[SecondaryTileVisualElements]
  
  /** Gets the approximate time at which the deferral will time-out. */
  var deadline: js.Date
  
  /**
    * Retrieves a deferral object, which allows the app time to provide information and assets used in the Pin to Start flyout.
    * @return The deferral object.
    */
  def getDeferral(): VisualElementsRequestDeferral
  
  /** Gets a copy of the parent secondary tile's SecondaryTileVisualElements object. The visual elements properties can be set or read through this object. When deferral is complete (or the handler returns without a deferral), the properties in this object are verified and then reflected in the Pin to Start flyout. */
  var visualElements: SecondaryTileVisualElements
}
object VisualElementsRequest {
  
  inline def apply(
    alternateVisualElements: IVectorView[SecondaryTileVisualElements],
    deadline: js.Date,
    getDeferral: CallbackTo[VisualElementsRequestDeferral],
    visualElements: SecondaryTileVisualElements
  ): VisualElementsRequest = {
    val __obj = js.Dynamic.literal(alternateVisualElements = alternateVisualElements.asInstanceOf[js.Any], deadline = deadline.asInstanceOf[js.Any], getDeferral = getDeferral.toJsFn, visualElements = visualElements.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisualElementsRequest]
  }
  
  extension [Self <: VisualElementsRequest](x: Self) {
    
    inline def setAlternateVisualElements(value: IVectorView[SecondaryTileVisualElements]): Self = StObject.set(x, "alternateVisualElements", value.asInstanceOf[js.Any])
    
    inline def setDeadline(value: js.Date): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
    
    inline def setGetDeferral(value: CallbackTo[VisualElementsRequestDeferral]): Self = StObject.set(x, "getDeferral", value.toJsFn)
    
    inline def setVisualElements(value: SecondaryTileVisualElements): Self = StObject.set(x, "visualElements", value.asInstanceOf[js.Any])
  }
}
