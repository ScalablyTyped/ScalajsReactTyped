package typingsJapgolly.antDesignReactNative

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignReactNative.anon.OnSelect
import typingsJapgolly.antDesignReactNative.anon.TypeofPopoverItem
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.auto
import typingsJapgolly.antDesignReactNative.libPopoverStyleMod.PopoverStyle
import typingsJapgolly.antDesignReactNative.libStyleMod.WithThemeStyles
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeModalPopover.libPopoverGeometryMod.Placement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPopoverMod {
  
  @JSImport("@ant-design/react-native/lib/popover", JSImport.Default)
  @js.native
  open class default () extends Popover
  /* static members */
  object default {
    
    @JSImport("@ant-design/react-native/lib/popover", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/popover", "default.Item")
    @js.native
    def Item: TypeofPopoverItem = js.native
    inline def Item_=(x: TypeofPopoverItem): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/react-native/lib/popover", "default.defaultProps")
    @js.native
    def defaultProps: OnSelect = js.native
    inline def defaultProps_=(x: OnSelect): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@ant-design/react-native/lib/popover", "PopoverItem")
  @js.native
  open class PopoverItem protected ()
    extends PureComponent[PopoverItemProps, js.Object, Any] {
    def this(props: PopoverItemProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PopoverItemProps, context: Any) = this()
  }
  /* static members */
  object PopoverItem {
    
    @JSImport("@ant-design/react-native/lib/popover", "PopoverItem")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/popover", "PopoverItem.displayName")
    @js.native
    def displayName: typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.PopoverItem = js.native
    inline def displayName_=(x: typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.PopoverItem): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Popover extends PureComponent[PopoverProps, Any, Any] {
    
    def onSelect(value: Any, closePopover: Any): Unit = js.native
    
    def renderOverlay(closePopover: Any): Node = js.native
  }
  
  trait PopoverItemProps
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var value: Any
  }
  object PopoverItemProps {
    
    inline def apply(value: Any): PopoverItemProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopoverItemProps]
    }
    
    extension [Self <: PopoverItemProps](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait PopoverProps
    extends StObject
       with WithThemeStyles[PopoverStyle] {
    
    var children: Node
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var easing: js.UndefOr[js.Function1[/* show */ Boolean, js.Function1[/* value */ Double, Double]]] = js.undefined
    
    var onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onSelect: js.UndefOr[js.Function2[/* node */ Any, /* index */ js.UndefOr[Double], Unit]] = js.undefined
    
    var overlay: Node
    
    var placement: js.UndefOr[Placement | auto] = js.undefined
    
    var renderOverlayComponent: js.UndefOr[js.Function2[/* node */ Node, /* closePopover */ js.Function0[Unit], Node]] = js.undefined
    
    var triggerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var useNativeDriver: js.UndefOr[Boolean] = js.undefined
  }
  object PopoverProps {
    
    inline def apply(): PopoverProps = {
      val __obj = js.Dynamic.literal(children = null, overlay = null)
      __obj.asInstanceOf[PopoverProps]
    }
    
    extension [Self <: PopoverProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEasing(value: /* show */ Boolean => js.Function1[/* value */ Double, Double]): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setOnDismiss(value: Callback): Self = StObject.set(x, "onDismiss", value.toJsFn)
      
      inline def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
      
      inline def setOnSelect(value: (/* node */ Any, /* index */ js.UndefOr[Double]) => Callback): Self = StObject.set(x, "onSelect", js.Any.fromFunction2((t0: /* node */ Any, t1: /* index */ js.UndefOr[Double]) => (value(t0, t1)).runNow()))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOverlay(value: VdomNode): Self = StObject.set(x, "overlay", value.rawNode.asInstanceOf[js.Any])
      
      inline def setOverlayNull: Self = StObject.set(x, "overlay", null)
      
      inline def setOverlayVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "overlay", js.Array(value*))
      
      inline def setOverlayVdomElement(value: VdomElement): Self = StObject.set(x, "overlay", value.rawElement.asInstanceOf[js.Any])
      
      inline def setPlacement(value: Placement | auto): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setRenderOverlayComponent(value: (/* node */ Node, /* closePopover */ js.Function0[Unit]) => Node): Self = StObject.set(x, "renderOverlayComponent", js.Any.fromFunction2(value))
      
      inline def setRenderOverlayComponentUndefined: Self = StObject.set(x, "renderOverlayComponent", js.undefined)
      
      inline def setTriggerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "triggerStyle", value.asInstanceOf[js.Any])
      
      inline def setTriggerStyleNull: Self = StObject.set(x, "triggerStyle", null)
      
      inline def setTriggerStyleUndefined: Self = StObject.set(x, "triggerStyle", js.undefined)
      
      inline def setUseNativeDriver(value: Boolean): Self = StObject.set(x, "useNativeDriver", value.asInstanceOf[js.Any])
      
      inline def setUseNativeDriverUndefined: Self = StObject.set(x, "useNativeDriver", js.undefined)
    }
  }
}
