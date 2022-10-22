package typingsJapgolly.html2canvas

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Document
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLCanvasElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.html2canvas.anon.PartialOptions
import typingsJapgolly.html2canvas.distTypesCoreCacheStorageMod.Cache
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("html2canvas", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(element: HTMLElement): js.Promise[HTMLCanvasElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any]).asInstanceOf[js.Promise[HTMLCanvasElement]]
  inline def default(element: HTMLElement, options: PartialOptions): js.Promise[HTMLCanvasElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HTMLCanvasElement]]
  
  /* Inlined html2canvas.html2canvas/dist/types/dom/document-cloner.CloneOptions & html2canvas.html2canvas/dist/types/dom/document-cloner.WindowOptions & html2canvas.html2canvas/dist/types/render/canvas/canvas-renderer.RenderOptions & html2canvas.html2canvas/dist/types/core/context.ContextOptions & {  backgroundColor :string | null,   foreignObjectRendering :boolean,   removeContainer :boolean | undefined} */
  trait Options extends StObject {
    
    var allowTaint: js.UndefOr[Boolean] & Boolean
    
    var backgroundColor: String | Null
    
    var cache: js.UndefOr[Cache] = js.undefined
    
    var canvas: js.UndefOr[HTMLCanvasElement] = js.undefined
    
    var foreignObjectRendering: Boolean
    
    var height: Double
    
    var ignoreElements: js.UndefOr[js.Function1[/* element */ Element, Boolean]] = js.undefined
    
    var imageTimeout: Double
    
    var logging: Boolean
    
    var onclone: js.UndefOr[js.Function2[/* document */ Document, /* element */ HTMLElement, Unit]] = js.undefined
    
    var proxy: js.UndefOr[String] = js.undefined
    
    var removeContainer: js.UndefOr[Boolean] = js.undefined
    
    var scale: Double
    
    var scrollX: Double
    
    var scrollY: Double
    
    var useCORS: Boolean
    
    var width: Double
    
    var windowHeight: Double
    
    var windowWidth: Double
    
    var x: Double
    
    var y: Double
  }
  object Options {
    
    inline def apply(
      allowTaint: js.UndefOr[Boolean] & Boolean,
      foreignObjectRendering: Boolean,
      height: Double,
      imageTimeout: Double,
      logging: Boolean,
      scale: Double,
      scrollX: Double,
      scrollY: Double,
      useCORS: Boolean,
      width: Double,
      windowHeight: Double,
      windowWidth: Double,
      x: Double,
      y: Double
    ): Options = {
      val __obj = js.Dynamic.literal(allowTaint = allowTaint.asInstanceOf[js.Any], foreignObjectRendering = foreignObjectRendering.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], imageTimeout = imageTimeout.asInstanceOf[js.Any], logging = logging.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], scrollX = scrollX.asInstanceOf[js.Any], scrollY = scrollY.asInstanceOf[js.Any], useCORS = useCORS.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], windowHeight = windowHeight.asInstanceOf[js.Any], windowWidth = windowWidth.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], backgroundColor = null)
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAllowTaint(value: js.UndefOr[Boolean] & Boolean): Self = StObject.set(x, "allowTaint", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorNull: Self = StObject.set(x, "backgroundColor", null)
      
      inline def setCache(value: Cache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setCanvas(value: HTMLCanvasElement): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
      
      inline def setCanvasUndefined: Self = StObject.set(x, "canvas", js.undefined)
      
      inline def setForeignObjectRendering(value: Boolean): Self = StObject.set(x, "foreignObjectRendering", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setIgnoreElements(value: /* element */ Element => Boolean): Self = StObject.set(x, "ignoreElements", js.Any.fromFunction1(value))
      
      inline def setIgnoreElementsUndefined: Self = StObject.set(x, "ignoreElements", js.undefined)
      
      inline def setImageTimeout(value: Double): Self = StObject.set(x, "imageTimeout", value.asInstanceOf[js.Any])
      
      inline def setLogging(value: Boolean): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
      
      inline def setOnclone(value: (/* document */ Document, /* element */ HTMLElement) => Callback): Self = StObject.set(x, "onclone", js.Any.fromFunction2((t0: /* document */ Document, t1: /* element */ HTMLElement) => (value(t0, t1)).runNow()))
      
      inline def setOncloneUndefined: Self = StObject.set(x, "onclone", js.undefined)
      
      inline def setProxy(value: String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      inline def setRemoveContainer(value: Boolean): Self = StObject.set(x, "removeContainer", value.asInstanceOf[js.Any])
      
      inline def setRemoveContainerUndefined: Self = StObject.set(x, "removeContainer", js.undefined)
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScrollX(value: Double): Self = StObject.set(x, "scrollX", value.asInstanceOf[js.Any])
      
      inline def setScrollY(value: Double): Self = StObject.set(x, "scrollY", value.asInstanceOf[js.Any])
      
      inline def setUseCORS(value: Boolean): Self = StObject.set(x, "useCORS", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWindowHeight(value: Double): Self = StObject.set(x, "windowHeight", value.asInstanceOf[js.Any])
      
      inline def setWindowWidth(value: Double): Self = StObject.set(x, "windowWidth", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
