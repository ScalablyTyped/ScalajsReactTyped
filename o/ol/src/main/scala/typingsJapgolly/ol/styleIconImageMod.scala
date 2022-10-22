package typingsJapgolly.ol

import org.scalajs.dom.HTMLCanvasElement
import org.scalajs.dom.HTMLImageElement
import typingsJapgolly.ol.colorMod.Color
import typingsJapgolly.ol.imageStateMod.ImageState
import typingsJapgolly.ol.sizeMod.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styleIconImageMod {
  
  @JSImport("ol/style/IconImage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ol/style/IconImage", JSImport.Default)
  @js.native
  open class default protected () extends IconImage {
    def this(
      image: HTMLCanvasElement,
      src: String,
      size: Size,
      crossOrigin: String,
      imageState: ImageState,
      color: Color
    ) = this()
    def this(
      image: HTMLCanvasElement,
      src: Unit,
      size: Size,
      crossOrigin: String,
      imageState: ImageState,
      color: Color
    ) = this()
    def this(
      image: HTMLImageElement,
      src: String,
      size: Size,
      crossOrigin: String,
      imageState: ImageState,
      color: Color
    ) = this()
    def this(
      image: HTMLImageElement,
      src: Unit,
      size: Size,
      crossOrigin: String,
      imageState: ImageState,
      color: Color
    ) = this()
  }
  
  inline def get(
    image: HTMLCanvasElement,
    src: String,
    size: Size,
    crossOrigin: String,
    imageState: ImageState,
    color: Color
  ): IconImage = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(image.asInstanceOf[js.Any], src.asInstanceOf[js.Any], size.asInstanceOf[js.Any], crossOrigin.asInstanceOf[js.Any], imageState.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[IconImage]
  inline def get(
    image: HTMLImageElement,
    src: String,
    size: Size,
    crossOrigin: String,
    imageState: ImageState,
    color: Color
  ): IconImage = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(image.asInstanceOf[js.Any], src.asInstanceOf[js.Any], size.asInstanceOf[js.Any], crossOrigin.asInstanceOf[js.Any], imageState.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[IconImage]
  
  @js.native
  trait IconImage
    extends typingsJapgolly.ol.eventsTargetMod.default {
    
    def getHitDetectionImage(): HTMLImageElement | HTMLCanvasElement = js.native
    
    def getImage(pixelRatio: Double): HTMLImageElement | HTMLCanvasElement = js.native
    
    def getImageState(): ImageState = js.native
    
    def getPixelRatio(pixelRatio: Double): Double = js.native
    
    /**
      * Get the size of the icon (in pixels).
      */
    def getSize(): Size = js.native
    
    def getSrc(): js.UndefOr[String] = js.native
    
    /**
      * Load not yet loaded URI.
      */
    def load(): Unit = js.native
  }
}
