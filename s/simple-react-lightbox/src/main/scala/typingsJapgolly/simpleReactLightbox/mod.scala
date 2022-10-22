package typingsJapgolly.simpleReactLightbox

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.simpleReactLightbox.anon.AutoplaySpeed
import typingsJapgolly.simpleReactLightbox.anon.BackgroundColor
import typingsJapgolly.simpleReactLightbox.anon.CaptionAlignment
import typingsJapgolly.simpleReactLightbox.anon.Children
import typingsJapgolly.simpleReactLightbox.anon.CloseLightbox
import typingsJapgolly.simpleReactLightbox.anon.Current
import typingsJapgolly.simpleReactLightbox.anon.FillColor
import typingsJapgolly.simpleReactLightbox.anon.ReadonlyCallbackCountSlid
import typingsJapgolly.simpleReactLightbox.anon.ReadonlyCallbackOpen
import typingsJapgolly.simpleReactLightbox.anon.ReadonlyCallbackSlideChan
import typingsJapgolly.simpleReactLightbox.anon.ShowThumbnails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("simple-react-lightbox", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasChildren: Children): typingsJapgolly.react.mod.global.JSX.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasChildren.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.react.mod.global.JSX.Element]
  
  inline def SRLWrapper(hasOptionsCallbacksElementsChildren: SRLWrapperProps): typingsJapgolly.react.mod.global.JSX.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SRLWrapper")(hasOptionsCallbacksElementsChildren.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.react.mod.global.JSX.Element]
  
  inline def useLightbox(): CloseLightbox = ^.asInstanceOf[js.Dynamic].applyDynamic("useLightbox")().asInstanceOf[CloseLightbox]
  
  trait CallbackCountSlides extends StObject {
    
    var totalSlide: Double
  }
  object CallbackCountSlides {
    
    inline def apply(totalSlide: Double): CallbackCountSlides = {
      val __obj = js.Dynamic.literal(totalSlide = totalSlide.asInstanceOf[js.Any])
      __obj.asInstanceOf[CallbackCountSlides]
    }
    
    extension [Self <: CallbackCountSlides](x: Self) {
      
      inline def setTotalSlide(value: Double): Self = StObject.set(x, "totalSlide", value.asInstanceOf[js.Any])
    }
  }
  
  trait CallbackOpen extends StObject {
    
    var currentSlide: Slide
    
    var opened: Boolean
  }
  object CallbackOpen {
    
    inline def apply(currentSlide: Slide, opened: Boolean): CallbackOpen = {
      val __obj = js.Dynamic.literal(currentSlide = currentSlide.asInstanceOf[js.Any], opened = opened.asInstanceOf[js.Any])
      __obj.asInstanceOf[CallbackOpen]
    }
    
    extension [Self <: CallbackOpen](x: Self) {
      
      inline def setCurrentSlide(value: Slide): Self = StObject.set(x, "currentSlide", value.asInstanceOf[js.Any])
      
      inline def setOpened(value: Boolean): Self = StObject.set(x, "opened", value.asInstanceOf[js.Any])
    }
  }
  
  trait CallbackSlideChange extends StObject {
    
    var action: String
    
    var index: Double
    
    var slides: Current
  }
  object CallbackSlideChange {
    
    inline def apply(action: String, index: Double, slides: Current): CallbackSlideChange = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], slides = slides.asInstanceOf[js.Any])
      __obj.asInstanceOf[CallbackSlideChange]
    }
    
    extension [Self <: CallbackSlideChange](x: Self) {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setSlides(value: Current): Self = StObject.set(x, "slides", value.asInstanceOf[js.Any])
    }
  }
  
  trait Callbacks extends StObject {
    
    var onCountSlides: js.UndefOr[js.Function1[/* hasTotalSlide */ ReadonlyCallbackCountSlid, Unit]] = js.undefined
    
    var onLightboxClosed: js.UndefOr[js.Function1[/* hasCurrentSlideOpened */ ReadonlyCallbackOpen, Unit]] = js.undefined
    
    var onLightboxOpened: js.UndefOr[js.Function1[/* hasCurrentSlideOpened */ ReadonlyCallbackOpen, Unit]] = js.undefined
    
    var onSlideChange: js.UndefOr[
        js.Function1[/* hasIndexActionHasPreviousNextCurrent */ ReadonlyCallbackSlideChan, Unit]
      ] = js.undefined
  }
  object Callbacks {
    
    inline def apply(): Callbacks = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Callbacks]
    }
    
    extension [Self <: Callbacks](x: Self) {
      
      inline def setOnCountSlides(value: /* hasTotalSlide */ ReadonlyCallbackCountSlid => Callback): Self = StObject.set(x, "onCountSlides", js.Any.fromFunction1((t0: /* hasTotalSlide */ ReadonlyCallbackCountSlid) => value(t0).runNow()))
      
      inline def setOnCountSlidesUndefined: Self = StObject.set(x, "onCountSlides", js.undefined)
      
      inline def setOnLightboxClosed(value: /* hasCurrentSlideOpened */ ReadonlyCallbackOpen => Callback): Self = StObject.set(x, "onLightboxClosed", js.Any.fromFunction1((t0: /* hasCurrentSlideOpened */ ReadonlyCallbackOpen) => value(t0).runNow()))
      
      inline def setOnLightboxClosedUndefined: Self = StObject.set(x, "onLightboxClosed", js.undefined)
      
      inline def setOnLightboxOpened(value: /* hasCurrentSlideOpened */ ReadonlyCallbackOpen => Callback): Self = StObject.set(x, "onLightboxOpened", js.Any.fromFunction1((t0: /* hasCurrentSlideOpened */ ReadonlyCallbackOpen) => value(t0).runNow()))
      
      inline def setOnLightboxOpenedUndefined: Self = StObject.set(x, "onLightboxOpened", js.undefined)
      
      inline def setOnSlideChange(value: /* hasIndexActionHasPreviousNextCurrent */ ReadonlyCallbackSlideChan => Callback): Self = StObject.set(x, "onSlideChange", js.Any.fromFunction1((t0: /* hasIndexActionHasPreviousNextCurrent */ ReadonlyCallbackSlideChan) => value(t0).runNow()))
      
      inline def setOnSlideChangeUndefined: Self = StObject.set(x, "onSlideChange", js.undefined)
    }
  }
  
  trait Element extends StObject {
    
    var autoplay: js.UndefOr[Boolean] = js.undefined
    
    var caption: js.UndefOr[String] = js.undefined
    
    var height: js.UndefOr[String | Double] = js.undefined
    
    var showControls: js.UndefOr[Boolean] = js.undefined
    
    var src: String
    
    var thumbnail: js.UndefOr[String] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object Element {
    
    inline def apply(src: String): Element = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[Element]
    }
    
    extension [Self <: Element](x: Self) {
      
      inline def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      inline def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
      
      inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setShowControls(value: Boolean): Self = StObject.set(x, "showControls", value.asInstanceOf[js.Any])
      
      inline def setShowControlsUndefined: Self = StObject.set(x, "showControls", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setThumbnail(value: String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
      
      inline def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type Elements = js.Array[Element]
  
  trait SRLWrapperOptions extends StObject {
    
    var buttons: js.UndefOr[BackgroundColor] = js.undefined
    
    var caption: js.UndefOr[CaptionAlignment] = js.undefined
    
    var progressBar: js.UndefOr[FillColor] = js.undefined
    
    var settings: js.UndefOr[AutoplaySpeed] = js.undefined
    
    var thumbnails: js.UndefOr[ShowThumbnails] = js.undefined
  }
  object SRLWrapperOptions {
    
    inline def apply(): SRLWrapperOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SRLWrapperOptions]
    }
    
    extension [Self <: SRLWrapperOptions](x: Self) {
      
      inline def setButtons(value: BackgroundColor): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
      
      inline def setCaption(value: CaptionAlignment): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
      
      inline def setProgressBar(value: FillColor): Self = StObject.set(x, "progressBar", value.asInstanceOf[js.Any])
      
      inline def setProgressBarUndefined: Self = StObject.set(x, "progressBar", js.undefined)
      
      inline def setSettings(value: AutoplaySpeed): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
      
      inline def setThumbnails(value: ShowThumbnails): Self = StObject.set(x, "thumbnails", value.asInstanceOf[js.Any])
      
      inline def setThumbnailsUndefined: Self = StObject.set(x, "thumbnails", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.simpleReactLightbox.anon.WrapperWithElementsoption
    - typingsJapgolly.simpleReactLightbox.anon.WrapperWithChildrenoption
  */
  trait SRLWrapperProps extends StObject
  object SRLWrapperProps {
    
    inline def WrapperWithChildrenoption(): typingsJapgolly.simpleReactLightbox.anon.WrapperWithChildrenoption = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[typingsJapgolly.simpleReactLightbox.anon.WrapperWithChildrenoption]
    }
    
    inline def WrapperWithElementsoption(elements: Elements): typingsJapgolly.simpleReactLightbox.anon.WrapperWithElementsoption = {
      val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.simpleReactLightbox.anon.WrapperWithElementsoption]
    }
  }
  
  trait Slide extends StObject {
    
    var caption: String
    
    var height: Double
    
    var id: String
    
    var source: String
    
    var thumbnail: String
    
    var `type`: String
    
    var width: Double
  }
  object Slide {
    
    inline def apply(
      caption: String,
      height: Double,
      id: String,
      source: String,
      thumbnail: String,
      `type`: String,
      width: Double
    ): Slide = {
      val __obj = js.Dynamic.literal(caption = caption.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Slide]
    }
    
    extension [Self <: Slide](x: Self) {
      
      inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setThumbnail(value: String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait WrapperWithChildren extends StObject {
    
    var children: Node
    
    var elements: js.UndefOr[scala.Nothing] = js.undefined
  }
  object WrapperWithChildren {
    
    inline def apply(): WrapperWithChildren = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[WrapperWithChildren]
    }
    
    extension [Self <: WrapperWithChildren](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  trait WrapperWithElements extends StObject {
    
    var children: js.UndefOr[scala.Nothing] = js.undefined
    
    var elements: Elements
  }
  object WrapperWithElements {
    
    inline def apply(elements: Elements): WrapperWithElements = {
      val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
      __obj.asInstanceOf[WrapperWithElements]
    }
    
    extension [Self <: WrapperWithElements](x: Self) {
      
      inline def setElements(value: Elements): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
      
      inline def setElementsVarargs(value: Element*): Self = StObject.set(x, "elements", js.Array(value*))
    }
  }
}
