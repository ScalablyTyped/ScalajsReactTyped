package typingsJapgolly.brainhubeuReactCarousel

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.NumberDictionary
import typingsJapgolly.brainhubeuReactCarousel.anon.AfterCarouselItems
import typingsJapgolly.brainhubeuReactCarousel.anon.PickCarouselPropsExcludek
import typingsJapgolly.brainhubeuReactCarousel.brainhubeuReactCarouselStrings.img
import typingsJapgolly.brainhubeuReactCarousel.brainhubeuReactCarouselStrings.key
import typingsJapgolly.brainhubeuReactCarousel.brainhubeuReactCarouselStrings.ref
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.react.mod.ReactComponentElement
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.Exclude
import typingsJapgolly.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@brainhubeu/react-carousel", JSImport.Default)
  @js.native
  open class default protected ()
    extends Component[CarouselProps, js.Object, Any] {
    def this(props: CarouselProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: CarouselProps, context: Any) = this()
  }
  
  @JSImport("@brainhubeu/react-carousel", "Dots")
  @js.native
  open class Dots protected ()
    extends Component[DotsProps, js.Object, Any] {
    def this(props: DotsProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: DotsProps, context: Any) = this()
  }
  
  @JSImport("@brainhubeu/react-carousel", "arrowsPlugin")
  @js.native
  val arrowsPlugin: CarouselPluginFunc = js.native
  
  @JSImport("@brainhubeu/react-carousel", "autoplayPlugin")
  @js.native
  val autoplayPlugin: CarouselPluginFunc = js.native
  
  @JSImport("@brainhubeu/react-carousel", "centeredPlugin")
  @js.native
  val centeredPlugin: CarouselPluginFunc = js.native
  
  @JSImport("@brainhubeu/react-carousel", "clickToChangePlugin")
  @js.native
  val clickToChangePlugin: CarouselPluginFunc = js.native
  
  @JSImport("@brainhubeu/react-carousel", "fastSwipePlugin")
  @js.native
  val fastSwipePlugin: CarouselPluginFunc = js.native
  
  @JSImport("@brainhubeu/react-carousel", "infinitePlugin")
  @js.native
  val infinitePlugin: CarouselPluginFunc = js.native
  
  @JSImport("@brainhubeu/react-carousel", "rtlPlugin")
  @js.native
  val rtlPlugin: CarouselPluginFunc = js.native
  
  @JSImport("@brainhubeu/react-carousel", "slidesToScrollPlugin")
  @js.native
  val slidesToScrollPlugin: CarouselPluginFunc = js.native
  
  @JSImport("@brainhubeu/react-carousel", "slidesToShowPlugin")
  @js.native
  val slidesToShowPlugin: CarouselPluginFunc = js.native
  
  type CarouselBreakpoints = NumberDictionary[PickCarouselPropsExcludek]
  
  type CarouselPluginFunc = js.Function1[
    /* hasOptionsCarouselPropsRefs */ typingsJapgolly.brainhubeuReactCarousel.anon.CarouselProps, 
    AfterCarouselItems
  ]
  
  trait CarouselPluginTypes extends StObject {
    
    var options: js.UndefOr[Any] = js.undefined
    
    var resolve: CarouselPluginFunc
  }
  object CarouselPluginTypes {
    
    inline def apply(
      resolve: /* hasOptionsCarouselPropsRefs */ typingsJapgolly.brainhubeuReactCarousel.anon.CarouselProps => AfterCarouselItems
    ): CarouselPluginTypes = {
      val __obj = js.Dynamic.literal(resolve = js.Any.fromFunction1(resolve))
      __obj.asInstanceOf[CarouselPluginTypes]
    }
    
    extension [Self <: CarouselPluginTypes](x: Self) {
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setResolve(
        value: /* hasOptionsCarouselPropsRefs */ typingsJapgolly.brainhubeuReactCarousel.anon.CarouselProps => AfterCarouselItems
      ): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
    }
  }
  
  trait CarouselProps extends StObject {
    
    var animationSpeed: js.UndefOr[Double] = js.undefined
    
    var breakpoints: js.UndefOr[CarouselBreakpoints] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var draggable: js.UndefOr[Boolean] = js.undefined
    
    var itemWidth: js.UndefOr[Double] = js.undefined
    
    var offset: js.UndefOr[Double] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
    
    var plugins: js.UndefOr[js.Array[String | CarouselPluginTypes]] = js.undefined
    
    var slides: js.UndefOr[js.Array[Element]] = js.undefined
    
    var value: js.UndefOr[Double] = js.undefined
  }
  object CarouselProps {
    
    inline def apply(): CarouselProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CarouselProps]
    }
    
    extension [Self <: CarouselProps](x: Self) {
      
      inline def setAnimationSpeed(value: Double): Self = StObject.set(x, "animationSpeed", value.asInstanceOf[js.Any])
      
      inline def setAnimationSpeedUndefined: Self = StObject.set(x, "animationSpeed", js.undefined)
      
      inline def setBreakpoints(value: CarouselBreakpoints): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
      
      inline def setBreakpointsUndefined: Self = StObject.set(x, "breakpoints", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setItemWidth(value: Double): Self = StObject.set(x, "itemWidth", value.asInstanceOf[js.Any])
      
      inline def setItemWidthUndefined: Self = StObject.set(x, "itemWidth", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOnChange(value: /* value */ Double => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* value */ Double) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setPlugins(value: js.Array[String | CarouselPluginTypes]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: (String | CarouselPluginTypes)*): Self = StObject.set(x, "plugins", js.Array(value*))
      
      inline def setSlides(value: js.Array[Element]): Self = StObject.set(x, "slides", value.asInstanceOf[js.Any])
      
      inline def setSlidesUndefined: Self = StObject.set(x, "slides", js.undefined)
      
      inline def setSlidesVarargs(value: Element*): Self = StObject.set(x, "slides", js.Array(value*))
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait DotsProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var number: js.UndefOr[Double] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
    
    var rtl: js.UndefOr[Boolean] = js.undefined
    
    var thumbnails: js.UndefOr[js.Array[ImgProps]] = js.undefined
    
    var value: js.UndefOr[Double] = js.undefined
  }
  object DotsProps {
    
    inline def apply(): DotsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DotsProps]
    }
    
    extension [Self <: DotsProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
      
      inline def setOnChange(value: /* value */ Double => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* value */ Double) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      inline def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      inline def setThumbnails(value: js.Array[ImgProps]): Self = StObject.set(x, "thumbnails", value.asInstanceOf[js.Any])
      
      inline def setThumbnailsUndefined: Self = StObject.set(x, "thumbnails", js.undefined)
      
      inline def setThumbnailsVarargs(value: ImgProps*): Self = StObject.set(x, "thumbnails", js.Array(value*))
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type ImgProps = ReactComponentElement[
    img, 
    Pick[
      ComponentProps[img], 
      Exclude[/* keyof react.react.ComponentProps<'img'> */ String, key | ref]
    ]
  ]
  
  type PluginStrategy = js.Function2[/* originalValue */ Double, /* previousValue */ Double, Double]
}
