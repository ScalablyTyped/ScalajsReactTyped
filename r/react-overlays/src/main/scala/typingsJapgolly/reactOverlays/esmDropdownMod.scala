package typingsJapgolly.reactOverlays

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.Event
import typingsJapgolly.propTypes.mod.ReactNodeLike
import typingsJapgolly.propTypes.mod.Requireable
import typingsJapgolly.propTypes.mod.Validator
import typingsJapgolly.react.mod.KeyboardEventHandler
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactOverlays.esmDropdownContextMod.DropDirection
import typingsJapgolly.reactOverlays.esmDropdownMenuMod.DropdownMenuProps
import typingsJapgolly.reactOverlays.esmDropdownToggleMod.DropdownToggleProps
import typingsJapgolly.reactOverlays.reactOverlaysBooleans.`false`
import typingsJapgolly.reactOverlays.reactOverlaysBooleans.`true`
import typingsJapgolly.reactOverlays.reactOverlaysStrings.keyboard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmDropdownMod {
  
  object default {
    
    /**
      * @displayName Dropdown
      * @public
      */
    inline def apply(
      hasDropAlignEndDefaultShowRawShowRawOnToggleItemSelectorFocusFirstItemOnShowChildren: DropdownProps
    ): Element = ^.asInstanceOf[js.Dynamic].apply(hasDropAlignEndDefaultShowRawShowRawOnToggleItemSelectorFocusFirstItemOnShowChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-overlays/esm/Dropdown", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* was `typeof DropdownMenu` */
    object Menu {
      
      /**
        * Also exported as `<Dropdown.Menu>` from `Dropdown`.
        *
        * @displayName DropdownMenu
        * @memberOf Dropdown
        */
      inline def apply(hasChildrenOptions: DropdownMenuProps): Element = ^.asInstanceOf[js.Dynamic].apply(hasChildrenOptions.asInstanceOf[js.Any]).asInstanceOf[Element]
      
      @JSImport("react-overlays/esm/Dropdown", "default.Menu")
      @js.native
      val ^ : js.Any = js.native
      
      object defaultProps {
        
        @JSImport("react-overlays/esm/Dropdown", "default.Menu.defaultProps")
        @js.native
        val ^ : js.Any = js.native
        
        @JSImport("react-overlays/esm/Dropdown", "default.Menu.defaultProps.usePopper")
        @js.native
        def usePopper: Boolean = js.native
        inline def usePopper_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("usePopper")(x.asInstanceOf[js.Any])
      }
      
      @JSImport("react-overlays/esm/Dropdown", "default.Menu.displayName")
      @js.native
      def displayName: String = js.native
      inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
      
      object propTypes {
        
        @JSImport("react-overlays/esm/Dropdown", "default.Menu.propTypes")
        @js.native
        val ^ : js.Any = js.native
        
        /**
          * Aligns the dropdown menu to the 'end' of it's placement position.
          * Generally this is provided by the parent `Dropdown` component,
          * but may also be specified as a prop directly.
          */
        @JSImport("react-overlays/esm/Dropdown", "default.Menu.propTypes.alignEnd")
        @js.native
        def alignEnd: Requireable[Boolean] = js.native
        inline def alignEnd_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("alignEnd")(x.asInstanceOf[js.Any])
        
        /**
          * A render prop that returns a Menu element. The `props`
          * argument should spread through to **a component that can accept a ref**.
          *
          * @type {Function ({
          *   show: boolean,
          *   alignEnd: boolean,
          *   close: (?SyntheticEvent) => void,
          *   placement: Placement,
          *   update: () => void,
          *   forceUpdate: () => void,
          *   props: {
          *     ref: (?HTMLElement) => void,
          *     style: { [string]: string | number },
          *     aria-labelledby: ?string
          *   },
          *   arrowProps: {
          *     ref: (?HTMLElement) => void,
          *     style: { [string]: string | number },
          *   },
          * }) => React.Element}
          */
        @JSImport("react-overlays/esm/Dropdown", "default.Menu.propTypes.children")
        @js.native
        def children: Validator[js.Function1[/* repeated */ Any, Any]] = js.native
        inline def children_=(x: Validator[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
        
        /**
          * Enables the Popper.js `flip` modifier, allowing the Dropdown to
          * automatically adjust it's placement in case of overlap with the viewport or toggle.
          * Refer to the [flip docs](https://popper.js.org/popper-documentation.html#modifiers..flip.enabled) for more info
          */
        @JSImport("react-overlays/esm/Dropdown", "default.Menu.propTypes.flip")
        @js.native
        def flip: Requireable[Boolean] = js.native
        inline def flip_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("flip")(x.asInstanceOf[js.Any])
        
        /**
          * A set of popper options and props passed directly to react-popper's Popper component.
          */
        @JSImport("react-overlays/esm/Dropdown", "default.Menu.propTypes.popperConfig")
        @js.native
        def popperConfig: Requireable[js.Object] = js.native
        inline def popperConfig_=(x: Requireable[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("popperConfig")(x.asInstanceOf[js.Any])
        
        /**
          * Override the default event used by RootCloseWrapper.
          */
        @JSImport("react-overlays/esm/Dropdown", "default.Menu.propTypes.rootCloseEvent")
        @js.native
        def rootCloseEvent: Requireable[String] = js.native
        inline def rootCloseEvent_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rootCloseEvent")(x.asInstanceOf[js.Any])
        
        /**
          * Controls the visible state of the menu, generally this is
          * provided by the parent `Dropdown` component,
          * but may also be specified as a prop directly.
          */
        @JSImport("react-overlays/esm/Dropdown", "default.Menu.propTypes.show")
        @js.native
        def show: Requireable[Boolean] = js.native
        inline def show_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("show")(x.asInstanceOf[js.Any])
        
        @JSImport("react-overlays/esm/Dropdown", "default.Menu.propTypes.usePopper")
        @js.native
        def usePopper: Requireable[Boolean] = js.native
        inline def usePopper_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("usePopper")(x.asInstanceOf[js.Any])
      }
    }
    
    /* was `typeof DropdownToggle` */
    object Toggle {
      
      /**
        * Also exported as `<Dropdown.Toggle>` from `Dropdown`.
        *
        * @displayName DropdownToggle
        * @memberOf Dropdown
        */
      inline def apply(hasChildren: DropdownToggleProps): Element = ^.asInstanceOf[js.Dynamic].apply(hasChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
      
      @JSImport("react-overlays/esm/Dropdown", "default.Toggle")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-overlays/esm/Dropdown", "default.Toggle.displayName")
      @js.native
      def displayName: String = js.native
      inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
      
      object propTypes {
        
        @JSImport("react-overlays/esm/Dropdown", "default.Toggle.propTypes")
        @js.native
        val ^ : js.Any = js.native
        
        /**
          * A render prop that returns a Toggle element. The `props`
          * argument should spread through to **a component that can accept a ref**. Use
          * the `onToggle` argument to toggle the menu open or closed
          *
          * @type {Function ({
          *   show: boolean,
          *   toggle: (show: boolean) => void,
          *   props: {
          *     ref: (?HTMLElement) => void,
          *     aria-haspopup: true
          *     aria-expanded: boolean
          *   },
          * }) => React.Element}
          */
        @JSImport("react-overlays/esm/Dropdown", "default.Toggle.propTypes.children")
        @js.native
        def children: Validator[js.Function1[/* repeated */ Any, Any]] = js.native
        inline def children_=(x: Validator[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      }
    }
    
    @JSImport("react-overlays/esm/Dropdown", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    object propTypes {
      
      @JSImport("react-overlays/esm/Dropdown", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Align the menu to the 'end' side of the placement side of the Dropdown toggle. The default placement is `top-start` or `bottom-start`.
        */
      @JSImport("react-overlays/esm/Dropdown", "default.propTypes.alignEnd")
      @js.native
      def alignEnd: Requireable[Boolean] = js.native
      inline def alignEnd_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("alignEnd")(x.asInstanceOf[js.Any])
      
      /**
        * A render prop that returns the root dropdown element. The `props`
        * argument should spread through to an element containing _both_ the
        * menu and toggle in order to handle keyboard events for focus management.
        *
        * @type {Function ({
        *   props: {
        *     onKeyDown: (SyntheticEvent) => void,
        *   },
        * }) => React.Element}
        */
      @JSImport("react-overlays/esm/Dropdown", "default.propTypes.children")
      @js.native
      def children: Requireable[ReactNodeLike] = js.native
      inline def children_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      /**
        * Sets the initial show position of the Dropdown.
        */
      @JSImport("react-overlays/esm/Dropdown", "default.propTypes.defaultShow")
      @js.native
      def defaultShow: Requireable[Boolean] = js.native
      inline def defaultShow_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultShow")(x.asInstanceOf[js.Any])
      
      /**
        * Determines the direction and location of the Menu in relation to it's Toggle.
        */
      @JSImport("react-overlays/esm/Dropdown", "default.propTypes.drop")
      @js.native
      def drop: Requireable[String] = js.native
      inline def drop_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("drop")(x.asInstanceOf[js.Any])
      
      /**
        * Controls the focus behavior for when the Dropdown is opened. Set to
        * `true` to always focus the first menu item, `keyboard` to focus only when
        * navigating via the keyboard, or `false` to disable completely
        *
        * The Default behavior is `false` **unless** the Menu has a `role="menu"`
        * where it will default to `keyboard` to match the recommended [ARIA Authoring practices](https://www.w3.org/TR/wai-aria-practices-1.1/#menubutton).
        */
      @JSImport("react-overlays/esm/Dropdown", "default.propTypes.focusFirstItemOnShow")
      @js.native
      def focusFirstItemOnShow: Requireable[String | Boolean] = js.native
      inline def focusFirstItemOnShow_=(x: Requireable[String | Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("focusFirstItemOnShow")(x.asInstanceOf[js.Any])
      
      /**
        * A css slector string that will return __focusable__ menu items.
        * Selectors should be relative to the menu component:
        * e.g. ` > li:not('.disabled')`
        */
      @JSImport("react-overlays/esm/Dropdown", "default.propTypes.itemSelector")
      @js.native
      def itemSelector: Requireable[String] = js.native
      inline def itemSelector_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("itemSelector")(x.asInstanceOf[js.Any])
      
      /**
        * A callback fired when the Dropdown wishes to change visibility. Called with the requested
        * `show` value, the DOM event, and the source that fired it: `'click'`,`'keydown'`,`'rootClose'`, or `'select'`.
        *
        * ```ts static
        * function(
        *   isOpen: boolean,
        *   event: SyntheticEvent,
        * ): void
        * ```
        *
        * @controllable show
        */
      @JSImport("react-overlays/esm/Dropdown", "default.propTypes.onToggle")
      @js.native
      def onToggle: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onToggle_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onToggle")(x.asInstanceOf[js.Any])
      
      /**
        * Whether or not the Dropdown is visible.
        *
        * @controllable onToggle
        */
      @JSImport("react-overlays/esm/Dropdown", "default.propTypes.show")
      @js.native
      def show: Requireable[Boolean] = js.native
      inline def show_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("show")(x.asInstanceOf[js.Any])
    }
  }
  
  trait DropdownInjectedProps extends StObject {
    
    var onKeyDown: KeyboardEventHandler[org.scalajs.dom.Element]
  }
  object DropdownInjectedProps {
    
    inline def apply(onKeyDown: ReactKeyboardEventFrom[org.scalajs.dom.Element & org.scalajs.dom.Element] => Callback): DropdownInjectedProps = {
      val __obj = js.Dynamic.literal(onKeyDown = js.Any.fromFunction1((t0: ReactKeyboardEventFrom[org.scalajs.dom.Element & org.scalajs.dom.Element]) => onKeyDown(t0).runNow()))
      __obj.asInstanceOf[DropdownInjectedProps]
    }
    
    extension [Self <: DropdownInjectedProps](x: Self) {
      
      inline def setOnKeyDown(value: ReactKeyboardEventFrom[org.scalajs.dom.Element & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[org.scalajs.dom.Element & org.scalajs.dom.Element]) => value(t0).runNow()))
    }
  }
  
  @js.native
  trait DropdownProps extends StObject {
    
    var alignEnd: js.UndefOr[Boolean] = js.native
    
    var children: Node = js.native
    
    var defaultShow: js.UndefOr[Boolean] = js.native
    
    var drop: js.UndefOr[DropDirection] = js.native
    
    var focusFirstItemOnShow: js.UndefOr[`false` | `true` | keyboard] = js.native
    
    var itemSelector: js.UndefOr[String] = js.native
    
    def onToggle(nextShow: Boolean): Unit = js.native
    def onToggle(nextShow: Boolean, event: ReactEventFrom[org.scalajs.dom.Element]): Unit = js.native
    def onToggle(nextShow: Boolean, event: Event): Unit = js.native
    
    var show: js.UndefOr[Boolean] = js.native
  }
}
