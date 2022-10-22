package typingsJapgolly.reactSticky

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.facade.React.Element
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-sticky", "Sticky")
  @js.native
  open class Sticky protected ()
    extends Component[StickyProps, js.Object, Any] {
    def this(props: StickyProps) = this()
    def this(props: StickyProps, context: Any) = this()
  }
  @JSImport("react-sticky", "Sticky")
  @js.native
  val Sticky: ComponentClassP[StickyProps & js.Object] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-sticky", "StickyContainer")
  @js.native
  open class StickyContainer protected ()
    extends Component[HTMLAttributes[HTMLDivElement], js.Object, Any] {
    def this(props: HTMLAttributes[HTMLDivElement]) = this()
    def this(props: HTMLAttributes[HTMLDivElement], context: Any) = this()
  }
  @JSImport("react-sticky", "StickyContainer")
  @js.native
  val StickyContainer: ComponentClassP[HTMLAttributes[HTMLDivElement] & js.Object] = js.native
  
  trait StickyChildArgs extends StObject {
    
    var calculatedHeight: Double
    
    var distanceFromBottom: Double
    
    var distanceFromTop: Double
    
    var isSticky: Boolean
    
    var style: CSSProperties
    
    var wasSticky: Boolean
  }
  object StickyChildArgs {
    
    inline def apply(
      calculatedHeight: Double,
      distanceFromBottom: Double,
      distanceFromTop: Double,
      isSticky: Boolean,
      style: CSSProperties,
      wasSticky: Boolean
    ): StickyChildArgs = {
      val __obj = js.Dynamic.literal(calculatedHeight = calculatedHeight.asInstanceOf[js.Any], distanceFromBottom = distanceFromBottom.asInstanceOf[js.Any], distanceFromTop = distanceFromTop.asInstanceOf[js.Any], isSticky = isSticky.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], wasSticky = wasSticky.asInstanceOf[js.Any])
      __obj.asInstanceOf[StickyChildArgs]
    }
    
    extension [Self <: StickyChildArgs](x: Self) {
      
      inline def setCalculatedHeight(value: Double): Self = StObject.set(x, "calculatedHeight", value.asInstanceOf[js.Any])
      
      inline def setDistanceFromBottom(value: Double): Self = StObject.set(x, "distanceFromBottom", value.asInstanceOf[js.Any])
      
      inline def setDistanceFromTop(value: Double): Self = StObject.set(x, "distanceFromTop", value.asInstanceOf[js.Any])
      
      inline def setIsSticky(value: Boolean): Self = StObject.set(x, "isSticky", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setWasSticky(value: Boolean): Self = StObject.set(x, "wasSticky", value.asInstanceOf[js.Any])
    }
  }
  
  trait StickyProps extends StObject {
    
    var bottomOffset: js.UndefOr[Double] = js.undefined
    
    def children(args: StickyChildArgs): Element
    
    var className: js.UndefOr[String] = js.undefined
    
    var disableCompensation: js.UndefOr[Boolean] = js.undefined
    
    var disableHardwareAcceleration: js.UndefOr[Boolean] = js.undefined
    
    var isActive: js.UndefOr[Boolean] = js.undefined
    
    var onStickyStateChange: js.UndefOr[js.Function1[/* isSticky */ Boolean, Unit]] = js.undefined
    
    var relative: js.UndefOr[Boolean] = js.undefined
    
    var stickyClassName: js.UndefOr[String] = js.undefined
    
    var stickyStyle: js.UndefOr[Any] = js.undefined
    
    var style: js.UndefOr[Any] = js.undefined
    
    var topOffset: js.UndefOr[Double] = js.undefined
  }
  object StickyProps {
    
    inline def apply(children: StickyChildArgs => Element): StickyProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[StickyProps]
    }
    
    extension [Self <: StickyProps](x: Self) {
      
      inline def setBottomOffset(value: Double): Self = StObject.set(x, "bottomOffset", value.asInstanceOf[js.Any])
      
      inline def setBottomOffsetUndefined: Self = StObject.set(x, "bottomOffset", js.undefined)
      
      inline def setChildren(value: StickyChildArgs => Element): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisableCompensation(value: Boolean): Self = StObject.set(x, "disableCompensation", value.asInstanceOf[js.Any])
      
      inline def setDisableCompensationUndefined: Self = StObject.set(x, "disableCompensation", js.undefined)
      
      inline def setDisableHardwareAcceleration(value: Boolean): Self = StObject.set(x, "disableHardwareAcceleration", value.asInstanceOf[js.Any])
      
      inline def setDisableHardwareAccelerationUndefined: Self = StObject.set(x, "disableHardwareAcceleration", js.undefined)
      
      inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
      
      inline def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
      
      inline def setOnStickyStateChange(value: /* isSticky */ Boolean => Callback): Self = StObject.set(x, "onStickyStateChange", js.Any.fromFunction1((t0: /* isSticky */ Boolean) => value(t0).runNow()))
      
      inline def setOnStickyStateChangeUndefined: Self = StObject.set(x, "onStickyStateChange", js.undefined)
      
      inline def setRelative(value: Boolean): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      inline def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
      
      inline def setStickyClassName(value: String): Self = StObject.set(x, "stickyClassName", value.asInstanceOf[js.Any])
      
      inline def setStickyClassNameUndefined: Self = StObject.set(x, "stickyClassName", js.undefined)
      
      inline def setStickyStyle(value: Any): Self = StObject.set(x, "stickyStyle", value.asInstanceOf[js.Any])
      
      inline def setStickyStyleUndefined: Self = StObject.set(x, "stickyStyle", js.undefined)
      
      inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTopOffset(value: Double): Self = StObject.set(x, "topOffset", value.asInstanceOf[js.Any])
      
      inline def setTopOffsetUndefined: Self = StObject.set(x, "topOffset", js.undefined)
    }
  }
}
