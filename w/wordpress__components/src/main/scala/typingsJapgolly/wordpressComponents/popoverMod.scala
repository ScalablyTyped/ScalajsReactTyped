package typingsJapgolly.wordpressComponents

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.DOMRect
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLSpanElement
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.HTMLProps
import typingsJapgolly.std.ClientRect
import typingsJapgolly.wordpressComponents.anon.Slot
import typingsJapgolly.wordpressComponents.popoverMod.Popover.Props
import typingsJapgolly.wordpressComponents.wordpressComponentsBooleans.`false`
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.container
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.firstElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popoverMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/popover", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] & Slot = js.native
    
    type _To = ComponentType[Props] & Slot
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] & Slot = ^
  }
  
  object Popover {
    
    /**
      * The direction in which the popover should open relative to its parent
      * node. Specify y- and x-axis as a space-separated string.
      */
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`top left`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`top right`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`top center`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`middle left`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`middle right`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`middle center`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`bottom left`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`bottom right`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`bottom center`
    */
    trait Position extends StObject
    object Position {
      
      inline def `bottom center`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`bottom center` = ("bottom center").asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`bottom center`]
      
      inline def `bottom left`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`bottom left` = ("bottom left").asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`bottom left`]
      
      inline def `bottom right`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`bottom right` = ("bottom right").asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`bottom right`]
      
      inline def `middle center`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`middle center` = ("middle center").asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`middle center`]
      
      inline def `middle left`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`middle left` = ("middle left").asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`middle left`]
      
      inline def `middle right`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`middle right` = ("middle right").asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`middle right`]
      
      inline def `top center`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`top center` = ("top center").asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`top center`]
      
      inline def `top left`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`top left` = ("top left").asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`top left`]
      
      inline def `top right`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`top right` = ("top right").asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`top right`]
    }
    
    trait Props
      extends StObject
         with HTMLProps[HTMLDivElement] {
      
      /**
        * A custom `DOMRect` object at which to position the popover.
        */
      var anchorRect: js.UndefOr[DOMRect | ClientRect] = js.undefined
      
      /**
        * Should the popover have an animation?
        * @defaultValue true
        */
      var animate: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The content to be displayed within the popover.
        */
      @JSName("children")
      var children_Props: Node
      
      /**
        * Opt-in prop to show popovers fullscreen on mobile.
        */
      var expandOnMobile: js.UndefOr[Boolean] = js.undefined
      
      /**
        * By default, the first tabblable element in the popover will receive
        * focus when it mounts. This is the same as setting focusOnMount to
        * `"firstElement"`. If you want to focus the container instead, you can
        * set focusOnMount to `"container"`.
        *
        * Set this prop to `false` to disable focus changing entirely. This
        * should only be set when an appropriately accessible substitute
        * behavior exists.
        *
        * @defaultValue "firstElement"
        */
      var focusOnMount: js.UndefOr[firstElement | container | `false`] = js.undefined
      
      /**
        * Function that should return a `DOMRect` of where to position the
        * popover.
        */
      var getAnchorRect: js.UndefOr[
            js.Function1[
              /* currentAnchorElement */ HTMLSpanElement | Null, 
              js.UndefOr[DOMRect | ClientRect]
            ]
          ] = js.undefined
      
      /**
        * Set this to customize the text that is shown in popover's header
        * when it is fullscreen on mobile.
        */
      var headerTitle: js.UndefOr[String] = js.undefined
      
      /**
        * Set this to hide the arrow which visually indicates what the popover
        * is anchored to. Note that the arrow will not display if `position` is
        * set to `"middle center"`.
        */
      var noArrow: js.UndefOr[Boolean] = js.undefined
      
      /**
        * A callback invoked when the user clicks outside the opened popover,
        * passing the click event. The popover should be closed in response to
        * this interaction.
        *
        * @deprecated  use `onFocusOutside`
        */
      var onClickOutside: js.UndefOr[js.Function0[Unit]] = js.undefined
      
      /**
        * A callback invoked when the popover should be closed.
        */
      var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
      
      /**
        * A callback invoked when the focus leaves the opened popover. This
        * should only be provided in advanced use-cases when a Popover should
        * close under specific circumstances; for example, if the new
        * `document.activeElement` is content of or otherwise controlling
        * Popover visibility.
        *
        * Defaults to `onClose` when not provided.
        */
      var onFocusOutside: js.UndefOr[js.Function1[/* event */ ReactFocusEventFrom[Element], Unit]] = js.undefined
      
      /**
        * The direction in which the popover should open relative to its
        * parent node. Specify y- and x-axis as a space-separated string.
        * @defaultValue "top center"
        */
      var position: js.UndefOr[Position] = js.undefined
    }
    object Props {
      
      inline def apply(): Props = {
        val __obj = js.Dynamic.literal(children = null)
        __obj.asInstanceOf[Props]
      }
      
      extension [Self <: Props](x: Self) {
        
        inline def setAnchorRect(value: DOMRect | ClientRect): Self = StObject.set(x, "anchorRect", value.asInstanceOf[js.Any])
        
        inline def setAnchorRectUndefined: Self = StObject.set(x, "anchorRect", js.undefined)
        
        inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
        
        inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
        
        inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
        
        inline def setChildrenNull: Self = StObject.set(x, "children", null)
        
        inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
        
        inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
        
        inline def setExpandOnMobile(value: Boolean): Self = StObject.set(x, "expandOnMobile", value.asInstanceOf[js.Any])
        
        inline def setExpandOnMobileUndefined: Self = StObject.set(x, "expandOnMobile", js.undefined)
        
        inline def setFocusOnMount(value: firstElement | container | `false`): Self = StObject.set(x, "focusOnMount", value.asInstanceOf[js.Any])
        
        inline def setFocusOnMountUndefined: Self = StObject.set(x, "focusOnMount", js.undefined)
        
        inline def setGetAnchorRect(value: /* currentAnchorElement */ HTMLSpanElement | Null => js.UndefOr[DOMRect | ClientRect]): Self = StObject.set(x, "getAnchorRect", js.Any.fromFunction1(value))
        
        inline def setGetAnchorRectUndefined: Self = StObject.set(x, "getAnchorRect", js.undefined)
        
        inline def setHeaderTitle(value: String): Self = StObject.set(x, "headerTitle", value.asInstanceOf[js.Any])
        
        inline def setHeaderTitleUndefined: Self = StObject.set(x, "headerTitle", js.undefined)
        
        inline def setNoArrow(value: Boolean): Self = StObject.set(x, "noArrow", value.asInstanceOf[js.Any])
        
        inline def setNoArrowUndefined: Self = StObject.set(x, "noArrow", js.undefined)
        
        inline def setOnClickOutside(value: Callback): Self = StObject.set(x, "onClickOutside", value.toJsFn)
        
        inline def setOnClickOutsideUndefined: Self = StObject.set(x, "onClickOutside", js.undefined)
        
        inline def setOnClose(value: Callback): Self = StObject.set(x, "onClose", value.toJsFn)
        
        inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
        
        inline def setOnFocusOutside(value: /* event */ ReactFocusEventFrom[Element] => Callback): Self = StObject.set(x, "onFocusOutside", js.Any.fromFunction1((t0: /* event */ ReactFocusEventFrom[Element]) => value(t0).runNow()))
        
        inline def setOnFocusOutsideUndefined: Self = StObject.set(x, "onFocusOutside", js.undefined)
        
        inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
        
        inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      }
    }
  }
}
