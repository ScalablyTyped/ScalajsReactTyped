package typingsJapgolly.reactLazyload

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Element
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-lazyload", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-lazyload", JSImport.Default)
  @js.native
  open class default protected ()
    extends Component[LazyLoadProps, js.Object, Any] {
    def this(props: japgolly.scalajs.react.facade.React.Component[LazyLoadProps & js.Object, js.Object]) = this()
  }
  
  inline def forceCheck(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forceCheck")().asInstanceOf[Unit]
  
  inline def forceVisible(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forceVisible")().asInstanceOf[Unit]
  
  inline def lazyload(option: js.Object): japgolly.scalajs.react.facade.React.Component[LazyLoadProps & js.Object, js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("lazyload")(option.asInstanceOf[js.Any]).asInstanceOf[japgolly.scalajs.react.facade.React.Component[LazyLoadProps & js.Object, js.Object]]
  
  trait LazyLoadProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var classNamePrefix: js.UndefOr[String] = js.undefined
    
    var debounce: js.UndefOr[Double | Boolean] = js.undefined
    
    var height: js.UndefOr[Double | String] = js.undefined
    
    var offset: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    var once: js.UndefOr[Boolean] = js.undefined
    
    var overflow: js.UndefOr[Boolean] = js.undefined
    
    var placeholder: js.UndefOr[Node] = js.undefined
    
    var preventLoading: js.UndefOr[Boolean] = js.undefined
    
    var resize: js.UndefOr[Boolean] = js.undefined
    
    var scroll: js.UndefOr[Boolean] = js.undefined
    
    var scrollContainer: js.UndefOr[String | Element] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var throttle: js.UndefOr[Double | Boolean] = js.undefined
    
    var unmountIfInvisible: js.UndefOr[Boolean] = js.undefined
  }
  object LazyLoadProps {
    
    inline def apply(): LazyLoadProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LazyLoadProps]
    }
    
    extension [Self <: LazyLoadProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNamePrefix(value: String): Self = StObject.set(x, "classNamePrefix", value.asInstanceOf[js.Any])
      
      inline def setClassNamePrefixUndefined: Self = StObject.set(x, "classNamePrefix", js.undefined)
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDebounce(value: Double | Boolean): Self = StObject.set(x, "debounce", value.asInstanceOf[js.Any])
      
      inline def setDebounceUndefined: Self = StObject.set(x, "debounce", js.undefined)
      
      inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setOffset(value: Double | js.Array[Double]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOffsetVarargs(value: Double*): Self = StObject.set(x, "offset", js.Array(value*))
      
      inline def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
      
      inline def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
      
      inline def setOverflow(value: Boolean): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      inline def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
      
      inline def setPlaceholder(value: VdomNode): Self = StObject.set(x, "placeholder", value.rawNode.asInstanceOf[js.Any])
      
      inline def setPlaceholderNull: Self = StObject.set(x, "placeholder", null)
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPlaceholderVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "placeholder", js.Array(value*))
      
      inline def setPlaceholderVdomElement(value: VdomElement): Self = StObject.set(x, "placeholder", value.rawElement.asInstanceOf[js.Any])
      
      inline def setPreventLoading(value: Boolean): Self = StObject.set(x, "preventLoading", value.asInstanceOf[js.Any])
      
      inline def setPreventLoadingUndefined: Self = StObject.set(x, "preventLoading", js.undefined)
      
      inline def setResize(value: Boolean): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      inline def setScroll(value: Boolean): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
      
      inline def setScrollContainer(value: String | Element): Self = StObject.set(x, "scrollContainer", value.asInstanceOf[js.Any])
      
      inline def setScrollContainerUndefined: Self = StObject.set(x, "scrollContainer", js.undefined)
      
      inline def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setThrottle(value: Double | Boolean): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
      
      inline def setThrottleUndefined: Self = StObject.set(x, "throttle", js.undefined)
      
      inline def setUnmountIfInvisible(value: Boolean): Self = StObject.set(x, "unmountIfInvisible", value.asInstanceOf[js.Any])
      
      inline def setUnmountIfInvisibleUndefined: Self = StObject.set(x, "unmountIfInvisible", js.undefined)
    }
  }
  
  type LazyLoad_ = japgolly.scalajs.react.facade.React.Component[LazyLoadProps & js.Object, js.Object]
}
