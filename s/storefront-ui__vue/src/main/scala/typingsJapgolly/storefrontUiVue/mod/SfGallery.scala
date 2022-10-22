package typingsJapgolly.storefrontUiVue.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.glidejsGlide.mod.Options
import typingsJapgolly.std.ClientRect
import typingsJapgolly.storefrontUiVue.storefrontUiVueStrings._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SfGallery extends Shortcut {
  
  @JSImport("@storefront-ui/vue", "SfGallery")
  @js.native
  val ^ : Constructor = js.native
  
  trait Computed extends StObject {
    
    var mapPictures: js.Array[Image]
    
    var updatedSliderOptions: Options
  }
  object Computed {
    
    inline def apply(mapPictures: js.Array[Image], updatedSliderOptions: Options): Computed = {
      val __obj = js.Dynamic.literal(mapPictures = mapPictures.asInstanceOf[js.Any], updatedSliderOptions = updatedSliderOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[Computed]
    }
    
    extension [Self <: Computed](x: Self) {
      
      inline def setMapPictures(value: js.Array[Image]): Self = StObject.set(x, "mapPictures", value.asInstanceOf[js.Any])
      
      inline def setMapPicturesVarargs(value: Image*): Self = StObject.set(x, "mapPictures", js.Array(value*))
      
      inline def setUpdatedSliderOptions(value: Options): Self = StObject.set(x, "updatedSliderOptions", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VueConstructor * / any */ trait Constructor extends StObject {
    
    var computed: Computed
    
    def data(): Data
    
    var methods: Methods
    
    var props: Props
  }
  object Constructor {
    
    inline def apply(computed: Computed, data: CallbackTo[Data], methods: Methods, props: Props): Constructor = {
      val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], data = data.toJsFn, methods = methods.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[Constructor]
    }
    
    extension [Self <: Constructor](x: Self) {
      
      inline def setComputed(value: Computed): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
      
      inline def setData(value: CallbackTo[Data]): Self = StObject.set(x, "data", value.toJsFn)
      
      inline def setMethods(value: Methods): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setProps(value: Props): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  trait Data extends StObject {
    
    var activeIndex: Double
    
    var eventHover: js.Object
    
    var glide: Null
    
    var pictureSelected: String
    
    var positionStatic: js.Object
    
    var style: String
  }
  object Data {
    
    inline def apply(
      activeIndex: Double,
      eventHover: js.Object,
      glide: Null,
      pictureSelected: String,
      positionStatic: js.Object,
      style: String
    ): Data = {
      val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], eventHover = eventHover.asInstanceOf[js.Any], glide = glide.asInstanceOf[js.Any], pictureSelected = pictureSelected.asInstanceOf[js.Any], positionStatic = positionStatic.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
      
      inline def setEventHover(value: js.Object): Self = StObject.set(x, "eventHover", value.asInstanceOf[js.Any])
      
      inline def setGlide(value: Null): Self = StObject.set(x, "glide", value.asInstanceOf[js.Any])
      
      inline def setPictureSelected(value: String): Self = StObject.set(x, "pictureSelected", value.asInstanceOf[js.Any])
      
      inline def setPositionStatic(value: js.Object): Self = StObject.set(x, "positionStatic", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  trait Methods extends StObject {
    
    def go(index: Double): Unit
    
    def moveZoom($event: Any, index: Double): Unit
    
    def positionObject(index: Double): ClientRect | _empty
    
    def removeZoom(index: Double): Unit
    
    def startZoom(picture: Image): Unit
  }
  object Methods {
    
    inline def apply(
      go: Double => Callback,
      moveZoom: (Any, Double) => Callback,
      positionObject: Double => ClientRect | _empty,
      removeZoom: Double => Callback,
      startZoom: Image => Callback
    ): Methods = {
      val __obj = js.Dynamic.literal(go = js.Any.fromFunction1((t0: Double) => go(t0).runNow()), moveZoom = js.Any.fromFunction2((t0: Any, t1: Double) => (moveZoom(t0, t1)).runNow()), positionObject = js.Any.fromFunction1(positionObject), removeZoom = js.Any.fromFunction1((t0: Double) => removeZoom(t0).runNow()), startZoom = js.Any.fromFunction1((t0: Image) => startZoom(t0).runNow()))
      __obj.asInstanceOf[Methods]
    }
    
    extension [Self <: Methods](x: Self) {
      
      inline def setGo(value: Double => Callback): Self = StObject.set(x, "go", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setMoveZoom(value: (Any, Double) => Callback): Self = StObject.set(x, "moveZoom", js.Any.fromFunction2((t0: Any, t1: Double) => (value(t0, t1)).runNow()))
      
      inline def setPositionObject(value: Double => ClientRect | _empty): Self = StObject.set(x, "positionObject", js.Any.fromFunction1(value))
      
      inline def setRemoveZoom(value: Double => Callback): Self = StObject.set(x, "removeZoom", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setStartZoom(value: Image => Callback): Self = StObject.set(x, "startZoom", js.Any.fromFunction1((t0: Image) => value(t0).runNow()))
    }
  }
  
  trait Props extends StObject {
    
    var current: Double
    
    var enableZoom: Boolean
    
    var imageHeight: Double | String
    
    var imageWidth: Double | String
    
    var images: js.Array[Image]
    
    var outsideZoom: Boolean
    
    var sliderOptions: Options
    
    var thumbHeight: Double | String
    
    var thumbWidth: Double | String
  }
  object Props {
    
    inline def apply(
      current: Double,
      enableZoom: Boolean,
      imageHeight: Double | String,
      imageWidth: Double | String,
      images: js.Array[Image],
      outsideZoom: Boolean,
      sliderOptions: Options,
      thumbHeight: Double | String,
      thumbWidth: Double | String
    ): Props = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], enableZoom = enableZoom.asInstanceOf[js.Any], imageHeight = imageHeight.asInstanceOf[js.Any], imageWidth = imageWidth.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], outsideZoom = outsideZoom.asInstanceOf[js.Any], sliderOptions = sliderOptions.asInstanceOf[js.Any], thumbHeight = thumbHeight.asInstanceOf[js.Any], thumbWidth = thumbWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setEnableZoom(value: Boolean): Self = StObject.set(x, "enableZoom", value.asInstanceOf[js.Any])
      
      inline def setImageHeight(value: Double | String): Self = StObject.set(x, "imageHeight", value.asInstanceOf[js.Any])
      
      inline def setImageWidth(value: Double | String): Self = StObject.set(x, "imageWidth", value.asInstanceOf[js.Any])
      
      inline def setImages(value: js.Array[Image]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      inline def setImagesVarargs(value: Image*): Self = StObject.set(x, "images", js.Array(value*))
      
      inline def setOutsideZoom(value: Boolean): Self = StObject.set(x, "outsideZoom", value.asInstanceOf[js.Any])
      
      inline def setSliderOptions(value: Options): Self = StObject.set(x, "sliderOptions", value.asInstanceOf[js.Any])
      
      inline def setThumbHeight(value: Double | String): Self = StObject.set(x, "thumbHeight", value.asInstanceOf[js.Any])
      
      inline def setThumbWidth(value: Double | String): Self = StObject.set(x, "thumbWidth", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Constructor
  
  /* This means you don't have to write `^`, but can instead just say `SfGallery.foo` */
  override def _to: Constructor = ^
}
