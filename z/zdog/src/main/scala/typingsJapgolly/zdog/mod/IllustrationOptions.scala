package typingsJapgolly.zdog.mod

import org.scalajs.dom.HTMLCanvasElement
import org.scalajs.dom.SVGSVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IllustrationOptions
  extends StObject
     with AnchorOptions
     with DraggerOptions {
  
  /**
    * Centers the scene in the element.
    * @default true
    * @see {@link https://zzz.dog/api#illustration-centered Zdog API}
    */
  val centered: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enables dragging to rotate on an item.
    * @default false
    * @see {@link https://zzz.dog/api#illustration-dragrotate Zdog API}
    */
  val dragRotate: js.UndefOr[Boolean | Anchor] = js.undefined
  
  /**
    * The HTML element to render on, either a <canvas> or an  <svg>.
    * @see {@link https://zzz.dog/api#illustration-element Zdog API}
    */
  val element: String | HTMLCanvasElement | SVGSVGElement
  
  val onPrerender: js.UndefOr[PrerenderListener] = js.undefined
  
  val onResize: js.UndefOr[ResizeListener] = js.undefined
  
  /**
    * Enables fluid resizing of element.
    * @default false
    * @see {@link https://zzz.dog/api#illustration-resize Zdog API}
    */
  val resize: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enlarges or shrinks the displayed size of the rendering.
    * Whereas {@link Anchor#scale scale} will change the size of item geometry, `zoom` changes item geometry and {@link Shape#stroke stroke} size.
    * @default 1
    * @see {@link https://zzz.dog/api#illustration-zoom Zdog API}
    */
  val zoom: js.UndefOr[Double] = js.undefined
}
object IllustrationOptions {
  
  inline def apply(element: String | HTMLCanvasElement | SVGSVGElement): IllustrationOptions = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[IllustrationOptions]
  }
  
  extension [Self <: IllustrationOptions](x: Self) {
    
    inline def setCentered(value: Boolean): Self = StObject.set(x, "centered", value.asInstanceOf[js.Any])
    
    inline def setCenteredUndefined: Self = StObject.set(x, "centered", js.undefined)
    
    inline def setDragRotate(value: Boolean | Anchor): Self = StObject.set(x, "dragRotate", value.asInstanceOf[js.Any])
    
    inline def setDragRotateUndefined: Self = StObject.set(x, "dragRotate", js.undefined)
    
    inline def setElement(value: String | HTMLCanvasElement | SVGSVGElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setOnPrerender(value: PrerenderListener): Self = StObject.set(x, "onPrerender", value.asInstanceOf[js.Any])
    
    inline def setOnPrerenderUndefined: Self = StObject.set(x, "onPrerender", js.undefined)
    
    inline def setOnResize(value: ResizeListener): Self = StObject.set(x, "onResize", value.asInstanceOf[js.Any])
    
    inline def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
    
    inline def setResize(value: Boolean): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
    
    inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
    
    inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
