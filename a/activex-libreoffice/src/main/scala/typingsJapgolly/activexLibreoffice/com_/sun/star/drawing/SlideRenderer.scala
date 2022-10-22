package typingsJapgolly.activexLibreoffice.com_.sun.star.drawing

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Size
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XBitmap
import typingsJapgolly.activexLibreoffice.com_.sun.star.rendering.XCanvas
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Create preview bitmaps for single slides. */
trait SlideRenderer
  extends StObject
     with XSlideRenderer {
  
  /** Create a new {@link SlideRenderer} object. */
  def create(): Unit
}
object SlideRenderer {
  
  inline def apply(
    calculatePreviewSize: (Double, Size) => Size,
    create: Callback,
    createPreview: (XDrawPage, Size, Double) => XBitmap,
    createPreviewForCanvas: (XDrawPage, Size, Double, XCanvas) => typingsJapgolly.activexLibreoffice.com_.sun.star.rendering.XBitmap
  ): SlideRenderer = {
    val __obj = js.Dynamic.literal(calculatePreviewSize = js.Any.fromFunction2(calculatePreviewSize), create = create.toJsFn, createPreview = js.Any.fromFunction3(createPreview), createPreviewForCanvas = js.Any.fromFunction4(createPreviewForCanvas))
    __obj.asInstanceOf[SlideRenderer]
  }
  
  extension [Self <: SlideRenderer](x: Self) {
    
    inline def setCreate(value: Callback): Self = StObject.set(x, "create", value.toJsFn)
  }
}
