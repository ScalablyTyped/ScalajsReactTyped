package typingsJapgolly.reactImageCrop

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLImageElement
import org.scalajs.dom.MouseEvent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactImageCrop.anon.Height
import typingsJapgolly.reactImageCrop.reactImageCropStrings.Percentsign
import typingsJapgolly.reactImageCrop.reactImageCropStrings.`use-credentials`
import typingsJapgolly.reactImageCrop.reactImageCropStrings.anonymous
import typingsJapgolly.reactImageCrop.reactImageCropStrings.px
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-image-crop", JSImport.Namespace)
  @js.native
  open class ^ () extends ReactCrop
  @JSImport("react-image-crop", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def containCrop(prevCrop: Crop, crop: Crop, imageWidth: Double, imageHeight: Double): Crop = (^.asInstanceOf[js.Dynamic].applyDynamic("containCrop")(prevCrop.asInstanceOf[js.Any], crop.asInstanceOf[js.Any], imageWidth.asInstanceOf[js.Any], imageHeight.asInstanceOf[js.Any])).asInstanceOf[Crop]
  
  inline def makeAspectCrop(crop: Crop, imageWidth: Double, imageHeight: Double): Crop = (^.asInstanceOf[js.Dynamic].applyDynamic("makeAspectCrop")(crop.asInstanceOf[js.Any], imageWidth.asInstanceOf[js.Any], imageHeight.asInstanceOf[js.Any])).asInstanceOf[Crop]
  
  trait Crop extends StObject {
    
    var aspect: js.UndefOr[Double] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var unit: js.UndefOr[px | Percentsign] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object Crop {
    
    inline def apply(): Crop = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Crop]
    }
    
    extension [Self <: Crop](x: Self) {
      
      inline def setAspect(value: Double): Self = StObject.set(x, "aspect", value.asInstanceOf[js.Any])
      
      inline def setAspectUndefined: Self = StObject.set(x, "aspect", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setUnit(value: px | Percentsign): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait PercentCrop
    extends StObject
       with Crop {
    
    @JSName("unit")
    var unit_PercentCrop: js.UndefOr[Percentsign] = js.undefined
  }
  object PercentCrop {
    
    inline def apply(): PercentCrop = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PercentCrop]
    }
    
    extension [Self <: PercentCrop](x: Self) {
      
      inline def setUnit(value: Percentsign): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    }
  }
  
  @js.native
  trait ReactCrop
    extends Component[ReactCropProps, js.Object, Any] {
    
    def createCropSelection(): Node = js.native
    
    def crossOverCheck(): Unit = js.native
    
    def dragCrop(): Crop = js.native
    
    def getCropStyle(): CSSProperties = js.native
    
    def getNewSize(): Height = js.native
    
    def makeNewCrop(): Crop = js.native
    
    def onComponentKeyDown(e: MouseEvent): Unit = js.native
    
    def onComponentMouseTouchDown(e: MouseEvent): Unit = js.native
    
    def onCropMouseTouchDown(e: MouseEvent): Unit = js.native
    
    def onDocMouseTouchEnd(e: MouseEvent): Unit = js.native
    
    def onDocMouseTouchMove(e: MouseEvent): Unit = js.native
    
    def onImageLoad(image: HTMLImageElement): Unit = js.native
    
    def resizeCrop(): Crop = js.native
    
    def resolveCrop(crop: Crop, imageWidth: Double, imageHeight: Double): Crop = js.native
    
    def straightenYPath(clientX: Double): Double = js.native
  }
  
  trait ReactCropProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var circularCrop: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var crop: js.UndefOr[Crop] = js.undefined
    
    var crossorigin: js.UndefOr[anonymous | `use-credentials`] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var imageAlt: js.UndefOr[String] = js.undefined
    
    var imageStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var keepSelection: js.UndefOr[Boolean] = js.undefined
    
    var locked: js.UndefOr[Boolean] = js.undefined
    
    var maxHeight: js.UndefOr[Double] = js.undefined
    
    var maxWidth: js.UndefOr[Double] = js.undefined
    
    var minHeight: js.UndefOr[Double] = js.undefined
    
    var minWidth: js.UndefOr[Double] = js.undefined
    
    def onChange(crop: Crop, percentCrop: PercentCrop): Unit
    
    var onComplete: js.UndefOr[js.Function2[/* crop */ Crop, /* percentCrop */ PercentCrop, Unit]] = js.undefined
    
    var onDragEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onDragStart: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onImageError: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLImageElement], Unit]] = js.undefined
    
    var onImageLoaded: js.UndefOr[js.Function1[/* target */ HTMLImageElement, Unit]] = js.undefined
    
    var renderComponent: js.UndefOr[Node] = js.undefined
    
    var renderSelectionAddon: js.UndefOr[js.Function1[/* state */ Any, Node]] = js.undefined
    
    var ruleOfThirds: js.UndefOr[Boolean] = js.undefined
    
    var src: String
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object ReactCropProps {
    
    inline def apply(onChange: (Crop, PercentCrop) => Callback, src: String): ReactCropProps = {
      val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction2((t0: Crop, t1: PercentCrop) => (onChange(t0, t1)).runNow()), src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactCropProps]
    }
    
    extension [Self <: ReactCropProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setCircularCrop(value: Boolean): Self = StObject.set(x, "circularCrop", value.asInstanceOf[js.Any])
      
      inline def setCircularCropUndefined: Self = StObject.set(x, "circularCrop", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCrop(value: Crop): Self = StObject.set(x, "crop", value.asInstanceOf[js.Any])
      
      inline def setCropUndefined: Self = StObject.set(x, "crop", js.undefined)
      
      inline def setCrossorigin(value: anonymous | `use-credentials`): Self = StObject.set(x, "crossorigin", value.asInstanceOf[js.Any])
      
      inline def setCrossoriginUndefined: Self = StObject.set(x, "crossorigin", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setImageAlt(value: String): Self = StObject.set(x, "imageAlt", value.asInstanceOf[js.Any])
      
      inline def setImageAltUndefined: Self = StObject.set(x, "imageAlt", js.undefined)
      
      inline def setImageStyle(value: CSSProperties): Self = StObject.set(x, "imageStyle", value.asInstanceOf[js.Any])
      
      inline def setImageStyleUndefined: Self = StObject.set(x, "imageStyle", js.undefined)
      
      inline def setKeepSelection(value: Boolean): Self = StObject.set(x, "keepSelection", value.asInstanceOf[js.Any])
      
      inline def setKeepSelectionUndefined: Self = StObject.set(x, "keepSelection", js.undefined)
      
      inline def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
      
      inline def setLockedUndefined: Self = StObject.set(x, "locked", js.undefined)
      
      inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setOnChange(value: (Crop, PercentCrop) => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction2((t0: Crop, t1: PercentCrop) => (value(t0, t1)).runNow()))
      
      inline def setOnComplete(value: (/* crop */ Crop, /* percentCrop */ PercentCrop) => Callback): Self = StObject.set(x, "onComplete", js.Any.fromFunction2((t0: /* crop */ Crop, t1: /* percentCrop */ PercentCrop) => (value(t0, t1)).runNow()))
      
      inline def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
      
      inline def setOnDragEnd(value: Callback): Self = StObject.set(x, "onDragEnd", value.toJsFn)
      
      inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      inline def setOnDragStart(value: Callback): Self = StObject.set(x, "onDragStart", value.toJsFn)
      
      inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      inline def setOnImageError(value: /* event */ ReactEventFrom[HTMLImageElement] => Callback): Self = StObject.set(x, "onImageError", js.Any.fromFunction1((t0: /* event */ ReactEventFrom[HTMLImageElement]) => value(t0).runNow()))
      
      inline def setOnImageErrorUndefined: Self = StObject.set(x, "onImageError", js.undefined)
      
      inline def setOnImageLoaded(value: /* target */ HTMLImageElement => Callback): Self = StObject.set(x, "onImageLoaded", js.Any.fromFunction1((t0: /* target */ HTMLImageElement) => value(t0).runNow()))
      
      inline def setOnImageLoadedUndefined: Self = StObject.set(x, "onImageLoaded", js.undefined)
      
      inline def setRenderComponent(value: VdomNode): Self = StObject.set(x, "renderComponent", value.rawNode.asInstanceOf[js.Any])
      
      inline def setRenderComponentNull: Self = StObject.set(x, "renderComponent", null)
      
      inline def setRenderComponentUndefined: Self = StObject.set(x, "renderComponent", js.undefined)
      
      inline def setRenderComponentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "renderComponent", js.Array(value*))
      
      inline def setRenderComponentVdomElement(value: VdomElement): Self = StObject.set(x, "renderComponent", value.rawElement.asInstanceOf[js.Any])
      
      inline def setRenderSelectionAddon(value: /* state */ Any => Node): Self = StObject.set(x, "renderSelectionAddon", js.Any.fromFunction1(value))
      
      inline def setRenderSelectionAddonUndefined: Self = StObject.set(x, "renderSelectionAddon", js.undefined)
      
      inline def setRuleOfThirds(value: Boolean): Self = StObject.set(x, "ruleOfThirds", value.asInstanceOf[js.Any])
      
      inline def setRuleOfThirdsUndefined: Self = StObject.set(x, "ruleOfThirds", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
