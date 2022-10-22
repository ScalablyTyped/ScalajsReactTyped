package typingsJapgolly.brainhubeuReactCarousel

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.facade.React.RefHandle
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import typingsJapgolly.brainhubeuReactCarousel.mod.CarouselPluginTypes
import typingsJapgolly.brainhubeuReactCarousel.mod.PluginStrategy
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AfterCarouselItems extends StObject {
    
    var afterCarouselItems: js.UndefOr[js.Function0[Element]] = js.undefined
    
    var beforeCarouselItems: js.UndefOr[js.Function0[Element]] = js.undefined
    
    var carouselClassNames: js.UndefOr[js.Function0[js.Array[String]]] = js.undefined
    
    var carouselCustomProps: js.UndefOr[js.Function0[Record[String, js.Function0[Any]]]] = js.undefined
    
    var itemClassNames: js.UndefOr[js.Function0[js.Array[String]]] = js.undefined
    
    var plugin: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var slideCustomProps: js.UndefOr[js.Function0[Record[String, js.Function0[Any]]]] = js.undefined
    
    var strategies: js.UndefOr[js.Function0[Record[String, PluginStrategy]]] = js.undefined
    
    var trackCustomProps: js.UndefOr[js.Function0[Record[String, js.Function0[Any]]]] = js.undefined
  }
  object AfterCarouselItems {
    
    inline def apply(): AfterCarouselItems = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AfterCarouselItems]
    }
    
    extension [Self <: AfterCarouselItems](x: Self) {
      
      inline def setAfterCarouselItems(value: CallbackTo[Element]): Self = StObject.set(x, "afterCarouselItems", value.toJsFn)
      
      inline def setAfterCarouselItemsUndefined: Self = StObject.set(x, "afterCarouselItems", js.undefined)
      
      inline def setBeforeCarouselItems(value: CallbackTo[Element]): Self = StObject.set(x, "beforeCarouselItems", value.toJsFn)
      
      inline def setBeforeCarouselItemsUndefined: Self = StObject.set(x, "beforeCarouselItems", js.undefined)
      
      inline def setCarouselClassNames(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "carouselClassNames", value.toJsFn)
      
      inline def setCarouselClassNamesUndefined: Self = StObject.set(x, "carouselClassNames", js.undefined)
      
      inline def setCarouselCustomProps(value: CallbackTo[Record[String, js.Function0[Any]]]): Self = StObject.set(x, "carouselCustomProps", value.toJsFn)
      
      inline def setCarouselCustomPropsUndefined: Self = StObject.set(x, "carouselCustomProps", js.undefined)
      
      inline def setItemClassNames(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "itemClassNames", value.toJsFn)
      
      inline def setItemClassNamesUndefined: Self = StObject.set(x, "itemClassNames", js.undefined)
      
      inline def setPlugin(value: Callback): Self = StObject.set(x, "plugin", value.toJsFn)
      
      inline def setPluginUndefined: Self = StObject.set(x, "plugin", js.undefined)
      
      inline def setSlideCustomProps(value: CallbackTo[Record[String, js.Function0[Any]]]): Self = StObject.set(x, "slideCustomProps", value.toJsFn)
      
      inline def setSlideCustomPropsUndefined: Self = StObject.set(x, "slideCustomProps", js.undefined)
      
      inline def setStrategies(value: CallbackTo[Record[String, PluginStrategy]]): Self = StObject.set(x, "strategies", value.toJsFn)
      
      inline def setStrategiesUndefined: Self = StObject.set(x, "strategies", js.undefined)
      
      inline def setTrackCustomProps(value: CallbackTo[Record[String, js.Function0[Any]]]): Self = StObject.set(x, "trackCustomProps", value.toJsFn)
      
      inline def setTrackCustomPropsUndefined: Self = StObject.set(x, "trackCustomProps", js.undefined)
    }
  }
  
  trait CarouselProps extends StObject {
    
    var carouselProps: typingsJapgolly.brainhubeuReactCarousel.mod.CarouselProps
    
    var options: js.UndefOr[Any] = js.undefined
    
    var refs: Record[String, RefHandle[HTMLElement]]
  }
  object CarouselProps {
    
    inline def apply(
      carouselProps: typingsJapgolly.brainhubeuReactCarousel.mod.CarouselProps,
      refs: Record[String, RefHandle[HTMLElement]]
    ): CarouselProps = {
      val __obj = js.Dynamic.literal(carouselProps = carouselProps.asInstanceOf[js.Any], refs = refs.asInstanceOf[js.Any])
      __obj.asInstanceOf[CarouselProps]
    }
    
    extension [Self <: CarouselProps](x: Self) {
      
      inline def setCarouselProps(value: typingsJapgolly.brainhubeuReactCarousel.mod.CarouselProps): Self = StObject.set(x, "carouselProps", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setRefs(value: Record[String, RefHandle[HTMLElement]]): Self = StObject.set(x, "refs", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Pick<@brainhubeu/react-carousel.@brainhubeu/react-carousel.CarouselProps, std.Exclude<keyof @brainhubeu/react-carousel.@brainhubeu/react-carousel.CarouselProps, 'breakpoints'>> */
  trait PickCarouselPropsExcludek extends StObject {
    
    var animationSpeed: js.UndefOr[Double] = js.undefined
    
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
  object PickCarouselPropsExcludek {
    
    inline def apply(): PickCarouselPropsExcludek = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickCarouselPropsExcludek]
    }
    
    extension [Self <: PickCarouselPropsExcludek](x: Self) {
      
      inline def setAnimationSpeed(value: Double): Self = StObject.set(x, "animationSpeed", value.asInstanceOf[js.Any])
      
      inline def setAnimationSpeedUndefined: Self = StObject.set(x, "animationSpeed", js.undefined)
      
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
}
