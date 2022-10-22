package typingsJapgolly.winrt.Windows.UI.Input.Inking

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrt.Windows.Foundation.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IInkStroke extends StObject {
  
  var boundingRect: Rect
  
  var drawingAttributes: InkDrawingAttributes
  
  def getRenderingSegments(): IVectorView[InkStrokeRenderingSegment]
  
  var recognized: Boolean
  
  var selected: Boolean
}
object IInkStroke {
  
  inline def apply(
    boundingRect: Rect,
    drawingAttributes: InkDrawingAttributes,
    getRenderingSegments: CallbackTo[IVectorView[InkStrokeRenderingSegment]],
    recognized: Boolean,
    selected: Boolean
  ): IInkStroke = {
    val __obj = js.Dynamic.literal(boundingRect = boundingRect.asInstanceOf[js.Any], drawingAttributes = drawingAttributes.asInstanceOf[js.Any], getRenderingSegments = getRenderingSegments.toJsFn, recognized = recognized.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInkStroke]
  }
  
  extension [Self <: IInkStroke](x: Self) {
    
    inline def setBoundingRect(value: Rect): Self = StObject.set(x, "boundingRect", value.asInstanceOf[js.Any])
    
    inline def setDrawingAttributes(value: InkDrawingAttributes): Self = StObject.set(x, "drawingAttributes", value.asInstanceOf[js.Any])
    
    inline def setGetRenderingSegments(value: CallbackTo[IVectorView[InkStrokeRenderingSegment]]): Self = StObject.set(x, "getRenderingSegments", value.toJsFn)
    
    inline def setRecognized(value: Boolean): Self = StObject.set(x, "recognized", value.asInstanceOf[js.Any])
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
  }
}
