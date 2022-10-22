package typingsJapgolly.ol

import typingsJapgolly.ol.eventsMod.EventsKey
import typingsJapgolly.ol.extentMod.Extent
import typingsJapgolly.ol.olStrings.imageloadend
import typingsJapgolly.ol.olStrings.imageloaderror
import typingsJapgolly.ol.olStrings.imageloadstart
import typingsJapgolly.ol.pluggableMapMod.FrameState
import typingsJapgolly.ol.projMod.ProjectionLike
import typingsJapgolly.ol.sourceSourceMod.AttributionLike
import typingsJapgolly.ol.sourceStateMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceImageMod {
  
  @JSImport("ol/source/Image", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("ol/source/Image", JSImport.Default)
  @js.native
  open class default protected () extends ImageSource {
    def this(options: Options) = this()
  }
  
  @JSImport("ol/source/Image", "ImageSourceEvent")
  @js.native
  open class ImageSourceEvent protected ()
    extends typingsJapgolly.ol.eventsEventMod.default {
    def this(`type`: String, image: typingsJapgolly.ol.imageMod.default) = this()
    
    /**
      * The image related to the event.
      */
    var image: typingsJapgolly.ol.imageMod.default = js.native
  }
  
  @js.native
  sealed trait ImageSourceEventType extends StObject
  @JSImport("ol/source/Image", "ImageSourceEventType")
  @js.native
  object ImageSourceEventType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ImageSourceEventType & String] = js.native
    
    @js.native
    sealed trait IMAGELOADEND
      extends StObject
         with ImageSourceEventType
    /* "imageloadend" */ val IMAGELOADEND: typingsJapgolly.ol.sourceImageMod.ImageSourceEventType.IMAGELOADEND & String = js.native
    
    @js.native
    sealed trait IMAGELOADERROR
      extends StObject
         with ImageSourceEventType
    /* "imageloaderror" */ val IMAGELOADERROR: typingsJapgolly.ol.sourceImageMod.ImageSourceEventType.IMAGELOADERROR & String = js.native
    
    @js.native
    sealed trait IMAGELOADSTART
      extends StObject
         with ImageSourceEventType
    /* "imageloadstart" */ val IMAGELOADSTART: typingsJapgolly.ol.sourceImageMod.ImageSourceEventType.IMAGELOADSTART & String = js.native
  }
  
  inline def defaultImageLoadFunction(image: typingsJapgolly.ol.imageMod.default, src: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultImageLoadFunction")(image.asInstanceOf[js.Any], src.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @js.native
  trait ImageSource
    extends typingsJapgolly.ol.sourceSourceMod.default {
    
    /* protected */ def findNearestResolution(resolution: Double): Double = js.native
    
    def getImage(
      extent: Extent,
      resolution: Double,
      pixelRatio: Double,
      projection: typingsJapgolly.ol.projProjectionMod.default
    ): typingsJapgolly.ol.imageBaseMod.default = js.native
    
    /* protected */ def getImageInternal(
      extent: Extent,
      resolution: Double,
      pixelRatio: Double,
      projection: typingsJapgolly.ol.projProjectionMod.default
    ): typingsJapgolly.ol.imageBaseMod.default = js.native
    
    /**
      * Handle image change events.
      */
    /* protected */ def handleImageChange(event: typingsJapgolly.ol.eventsEventMod.default): Unit = js.native
    
    @JSName("on")
    def on_imageloadend(`type`: imageloadend, listener: js.Function1[/* evt */ ImageSourceEvent, Unit]): EventsKey = js.native
    @JSName("on")
    def on_imageloaderror(`type`: imageloaderror, listener: js.Function1[/* evt */ ImageSourceEvent, Unit]): EventsKey = js.native
    @JSName("on")
    def on_imageloadstart(`type`: imageloadstart, listener: js.Function1[/* evt */ ImageSourceEvent, Unit]): EventsKey = js.native
    
    @JSName("once")
    def once_imageloadend(`type`: imageloadend, listener: js.Function1[/* evt */ ImageSourceEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_imageloaderror(`type`: imageloaderror, listener: js.Function1[/* evt */ ImageSourceEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_imageloadstart(`type`: imageloadstart, listener: js.Function1[/* evt */ ImageSourceEvent, Unit]): EventsKey = js.native
    
    @JSName("un")
    def un_imageloadend(`type`: imageloadend, listener: js.Function1[/* evt */ ImageSourceEvent, Unit]): Unit = js.native
    @JSName("un")
    def un_imageloaderror(`type`: imageloaderror, listener: js.Function1[/* evt */ ImageSourceEvent, Unit]): Unit = js.native
    @JSName("un")
    def un_imageloadstart(`type`: imageloadstart, listener: js.Function1[/* evt */ ImageSourceEvent, Unit]): Unit = js.native
  }
  
  trait Options extends StObject {
    
    var attributions: js.UndefOr[AttributionLike] = js.undefined
    
    var imageSmoothing: js.UndefOr[Boolean] = js.undefined
    
    var projection: js.UndefOr[ProjectionLike] = js.undefined
    
    var resolutions: js.UndefOr[js.Array[Double]] = js.undefined
    
    var state: js.UndefOr[State] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAttributions(value: AttributionLike): Self = StObject.set(x, "attributions", value.asInstanceOf[js.Any])
      
      inline def setAttributionsFunction1(value: /* p0 */ FrameState => String | js.Array[String]): Self = StObject.set(x, "attributions", js.Any.fromFunction1(value))
      
      inline def setAttributionsUndefined: Self = StObject.set(x, "attributions", js.undefined)
      
      inline def setAttributionsVarargs(value: String*): Self = StObject.set(x, "attributions", js.Array(value*))
      
      inline def setImageSmoothing(value: Boolean): Self = StObject.set(x, "imageSmoothing", value.asInstanceOf[js.Any])
      
      inline def setImageSmoothingUndefined: Self = StObject.set(x, "imageSmoothing", js.undefined)
      
      inline def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      
      inline def setResolutions(value: js.Array[Double]): Self = StObject.set(x, "resolutions", value.asInstanceOf[js.Any])
      
      inline def setResolutionsUndefined: Self = StObject.set(x, "resolutions", js.undefined)
      
      inline def setResolutionsVarargs(value: Double*): Self = StObject.set(x, "resolutions", js.Array(value*))
      
      inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
}
