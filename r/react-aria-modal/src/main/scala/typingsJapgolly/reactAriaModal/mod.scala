package typingsJapgolly.reactAriaModal

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Node
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.reactAriaModal.anon.PickAriaModalPropstitleId
import typingsJapgolly.reactAriaModal.anon.PickAriaModalPropstitleTe
import typingsJapgolly.reactAriaModal.reactAriaModalBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-aria-modal", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[
          AriaModalProps & (RequiredAriaTypes[PickAriaModalPropstitleId, PickAriaModalPropstitleTe]), 
          js.Object, 
          Any
        ]
  /* static members */
  object default {
    
    @JSImport("react-aria-modal", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def renderTo(node: String): ElementType = ^.asInstanceOf[js.Dynamic].applyDynamic("renderTo")(node.asInstanceOf[js.Any]).asInstanceOf[ElementType]
    inline def renderTo(node: HTMLElement): ElementType = ^.asInstanceOf[js.Dynamic].applyDynamic("renderTo")(node.asInstanceOf[js.Any]).asInstanceOf[ElementType]
  }
  
  type AriaModal = PureComponent[
    AriaModalProps & (RequiredAriaTypes[PickAriaModalPropstitleId, PickAriaModalPropstitleTe]), 
    js.Object, 
    Any
  ]
  
  trait AriaModalProps extends StObject {
    
    /**
      * If true, the modal will receive a role of alertdialog,
      * instead of its default dialog.
      */
    var alert: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Provide your main application node here (which the modal should
      * render outside of), and when the modal is open this application
      * node will receive the attribute `aria-hidden="true"`.
      * This can help screen readers understand what's going on.
      */
    var applicationNode: js.UndefOr[Node | Element] = js.undefined
    
    var children: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.undefined
    
    /**
      * Apply a class to the dialog in order to custom-style it.
      *
      * Be aware that, _by default_, this module does apply various
      * inline styles to the dialog element in order position it.
      * To disable _all inline styles_, see `includeDefaultStyles`.
      */
    var dialogClass: js.UndefOr[String] = js.undefined
    
    /**
      * Choose your own id attribute for the dialog element.
      *
      * Default: `react-aria-modal-dialog`.
      */
    var dialogId: js.UndefOr[String] = js.undefined
    
    /**
      * Customize properties of the style prop that is passed to the dialog.
      */
    var dialogStyle: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * By default, the Escape key exits the modal. Pass `false`, and it won't.
      */
    var escapeExits: js.UndefOr[Boolean] = js.undefined
    
    /**
      * By default, when the modal activates its first focusable child will
      * receive focus. However, if `focusDialog` is true, the dialog itself
      * will receive initial focus — and that focus will be hidden.
      * (This is essentially what Bootstrap does with their modal.)
      */
    var focusDialog: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Customize properties of the focusTrapOptions prop that is passed to the modal dialog's focus trap.
      * For example, you can use this prop if you need better control of where focus is returned.
      */
    var focusTrapOptions: js.UndefOr[js.Object] = js.undefined
    
    /**
      * If true, the modal dialog's focus trap will be paused.
      * You won't typically need to use this prop. It used to be that the typical reason for pausing a focus trap was to enable nested focus traps;
      * but as of focus-trap v4, the pausing and unpausing of hierachical traps is handled automatically.
      */
    var focusTrapPaused: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Same as `applicationNode`, but a function that returns the node
      * instead of the node itself. This can be useful or necessary in
      * a variety of situations, one of which is server-side React
      * rendering. The function will not be called until after the
      * component mounts, so it is safe to use browser globals
      * and refer to DOM nodes within it (e.g. `document.getElementById(..)`),
      * without ruining your server-side rendering.
      */
    var getApplicationNode: js.UndefOr[js.Function0[Node | Element]] = js.undefined
    
    /**
      * By default, styles are applied inline to the dialog and underlay
      * portions of the component. However, you can disable all inline
      * styles by setting `includeDefaultStyles` to false. If set, you
      * must specify all styles externally, including positioning.
      * This is helpful if your project uses external CSS assets.
      *
      * _Note_: underlayStyle and dialogStyle can still be set inline,
      * but these will be the only styles applied.
      */
    var includeDefaultStyles: js.UndefOr[Boolean] = js.undefined
    
    /**
      * By default, when the modal activates its first focusable child will
      * receive focus. If, instead, you want to identify a specific element
      * that should receive initial focus, pass a selector string to this
      * prop. (That selector is passed to `document.querySelector()` to find
      * the DOM node.)
      */
    var initialFocus: js.UndefOr[String] = js.undefined
    
    /**
      * By default, the modal is active when mounted, deactivated when unmounted.
      * However, you can also control its active/inactive state by changing
      * its mounted property instead.
      */
    var mounted: js.UndefOr[Boolean] = js.undefined
    
    /**
      * This function is called in the modal's `componentDidMount()` lifecycle method.
      * You can use it to do whatever diverse and sundry things you feel like
      * doing after the modal activates.
      */
    var onEnter: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * This function needs to handles the state change of exiting (or deactivating) the modal.
      * Maybe it's just a wrapper around `setState()`; or maybe you use some more involved
      * Flux-inspired state management — whatever the case, this module leaves the state
      * management up to you instead of making assumptions.
      * That also makes it easier to create your own "close modal" buttons; because you
      * have the function that closes the modal right there, written by you, at your disposal.
      */
    var onExit: js.UndefOr[
        js.Function1[/* event */ ReactMouseEventFrom[Element] | ReactKeyboardEventFrom[Element], Unit]
      ] = js.undefined
    
    /**
      * If true, the modal dialog will prevent any scrolling behind the modal window.
      */
    var scrollDisabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The `id` of the element that should be used as the modal's accessible
      * title. This value is passed to the modal's `aria-labelledby` attribute.
      * You must use either `titleId` or `titleText`, but not both.
      */
    var titleId: js.UndefOr[String] = js.undefined
    
    /**
      * A string to use as the modal's accessible title. This value is passed
      * to the modal's `aria-label` attribute. You must use either `titleId` or
      * `titleText`, but not both.
      */
    var titleText: js.UndefOr[String] = js.undefined
    
    /**
      * Apply a class to the underlay in order to custom-style it.
      * This module does apply various inline styles, though, so be aware that
      * overriding some styles might be difficult. If, for example, you want
      * to change the underlay's color, you should probably use the
      * `underlayColor` prop instead of a class.
      * If you would rather control all CSS, see `includeDefaultStyles`.
      */
    var underlayClass: js.UndefOr[String] = js.undefined
    
    /**
      * By default, a click on the underlay will exit the modal.
      * Pass `false`, and clicking on the underlay will do nothing.
      */
    var underlayClickExits: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If you want to change the underlay's color, you can
      * do that with this prop. If `false`, no background color will be
      * applied with inline styles. Presumably you will apply then
      * yourself via an `underlayClass`.
      *
      * Default: rgba(0,0,0,0.5)
      */
    var underlayColor: js.UndefOr[String | `false`] = js.undefined
    
    /**
      * Customize properties of the `style` prop that is passed to the underlay.
      * The best way to add some vertical displacement to the dialog is to add
      * top & bottom padding to the underlay.
      * This is illustrated in the demo examples.
      */
    var underlayStyle: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * If `true`, the modal's contents will be vertically (as well as horizontally) centered.
      */
    var verticallyCenter: js.UndefOr[Boolean] = js.undefined
  }
  object AriaModalProps {
    
    inline def apply(): AriaModalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AriaModalProps]
    }
    
    extension [Self <: AriaModalProps](x: Self) {
      
      inline def setAlert(value: Boolean): Self = StObject.set(x, "alert", value.asInstanceOf[js.Any])
      
      inline def setAlertUndefined: Self = StObject.set(x, "alert", js.undefined)
      
      inline def setApplicationNode(value: Node | Element): Self = StObject.set(x, "applicationNode", value.asInstanceOf[js.Any])
      
      inline def setApplicationNodeUndefined: Self = StObject.set(x, "applicationNode", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDialogClass(value: String): Self = StObject.set(x, "dialogClass", value.asInstanceOf[js.Any])
      
      inline def setDialogClassUndefined: Self = StObject.set(x, "dialogClass", js.undefined)
      
      inline def setDialogId(value: String): Self = StObject.set(x, "dialogId", value.asInstanceOf[js.Any])
      
      inline def setDialogIdUndefined: Self = StObject.set(x, "dialogId", js.undefined)
      
      inline def setDialogStyle(value: CSSProperties): Self = StObject.set(x, "dialogStyle", value.asInstanceOf[js.Any])
      
      inline def setDialogStyleUndefined: Self = StObject.set(x, "dialogStyle", js.undefined)
      
      inline def setEscapeExits(value: Boolean): Self = StObject.set(x, "escapeExits", value.asInstanceOf[js.Any])
      
      inline def setEscapeExitsUndefined: Self = StObject.set(x, "escapeExits", js.undefined)
      
      inline def setFocusDialog(value: Boolean): Self = StObject.set(x, "focusDialog", value.asInstanceOf[js.Any])
      
      inline def setFocusDialogUndefined: Self = StObject.set(x, "focusDialog", js.undefined)
      
      inline def setFocusTrapOptions(value: js.Object): Self = StObject.set(x, "focusTrapOptions", value.asInstanceOf[js.Any])
      
      inline def setFocusTrapOptionsUndefined: Self = StObject.set(x, "focusTrapOptions", js.undefined)
      
      inline def setFocusTrapPaused(value: Boolean): Self = StObject.set(x, "focusTrapPaused", value.asInstanceOf[js.Any])
      
      inline def setFocusTrapPausedUndefined: Self = StObject.set(x, "focusTrapPaused", js.undefined)
      
      inline def setGetApplicationNode(value: CallbackTo[Node | Element]): Self = StObject.set(x, "getApplicationNode", value.toJsFn)
      
      inline def setGetApplicationNodeUndefined: Self = StObject.set(x, "getApplicationNode", js.undefined)
      
      inline def setIncludeDefaultStyles(value: Boolean): Self = StObject.set(x, "includeDefaultStyles", value.asInstanceOf[js.Any])
      
      inline def setIncludeDefaultStylesUndefined: Self = StObject.set(x, "includeDefaultStyles", js.undefined)
      
      inline def setInitialFocus(value: String): Self = StObject.set(x, "initialFocus", value.asInstanceOf[js.Any])
      
      inline def setInitialFocusUndefined: Self = StObject.set(x, "initialFocus", js.undefined)
      
      inline def setMounted(value: Boolean): Self = StObject.set(x, "mounted", value.asInstanceOf[js.Any])
      
      inline def setMountedUndefined: Self = StObject.set(x, "mounted", js.undefined)
      
      inline def setOnEnter(value: Callback): Self = StObject.set(x, "onEnter", value.toJsFn)
      
      inline def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
      
      inline def setOnExit(value: /* event */ ReactMouseEventFrom[Element] | ReactKeyboardEventFrom[Element] => Callback): Self = StObject.set(x, "onExit", js.Any.fromFunction1((t0: /* event */ ReactMouseEventFrom[Element] | ReactKeyboardEventFrom[Element]) => value(t0).runNow()))
      
      inline def setOnExitUndefined: Self = StObject.set(x, "onExit", js.undefined)
      
      inline def setScrollDisabled(value: Boolean): Self = StObject.set(x, "scrollDisabled", value.asInstanceOf[js.Any])
      
      inline def setScrollDisabledUndefined: Self = StObject.set(x, "scrollDisabled", js.undefined)
      
      inline def setTitleId(value: String): Self = StObject.set(x, "titleId", value.asInstanceOf[js.Any])
      
      inline def setTitleIdUndefined: Self = StObject.set(x, "titleId", js.undefined)
      
      inline def setTitleText(value: String): Self = StObject.set(x, "titleText", value.asInstanceOf[js.Any])
      
      inline def setTitleTextUndefined: Self = StObject.set(x, "titleText", js.undefined)
      
      inline def setUnderlayClass(value: String): Self = StObject.set(x, "underlayClass", value.asInstanceOf[js.Any])
      
      inline def setUnderlayClassUndefined: Self = StObject.set(x, "underlayClass", js.undefined)
      
      inline def setUnderlayClickExits(value: Boolean): Self = StObject.set(x, "underlayClickExits", value.asInstanceOf[js.Any])
      
      inline def setUnderlayClickExitsUndefined: Self = StObject.set(x, "underlayClickExits", js.undefined)
      
      inline def setUnderlayColor(value: String | `false`): Self = StObject.set(x, "underlayColor", value.asInstanceOf[js.Any])
      
      inline def setUnderlayColorUndefined: Self = StObject.set(x, "underlayColor", js.undefined)
      
      inline def setUnderlayStyle(value: CSSProperties): Self = StObject.set(x, "underlayStyle", value.asInstanceOf[js.Any])
      
      inline def setUnderlayStyleUndefined: Self = StObject.set(x, "underlayStyle", js.undefined)
      
      inline def setVerticallyCenter(value: Boolean): Self = StObject.set(x, "verticallyCenter", value.asInstanceOf[js.Any])
      
      inline def setVerticallyCenterUndefined: Self = StObject.set(x, "verticallyCenter", js.undefined)
    }
  }
  
  type RequiredAriaTypes[T, U] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: -? T[K]} */ js.Any
}
