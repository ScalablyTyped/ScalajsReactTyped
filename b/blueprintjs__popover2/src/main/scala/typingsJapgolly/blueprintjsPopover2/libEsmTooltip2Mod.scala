package typingsJapgolly.blueprintjsPopover2

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import typingsJapgolly.blueprintjsCore.libEsmCommonIntentMod.Intent
import typingsJapgolly.blueprintjsCore.libEsmComponentsPopoverPopoverSharedPropsMod.PopoverPosition
import typingsJapgolly.blueprintjsPopover2.anon.PartialTooltip2PropsHTMLP
import typingsJapgolly.blueprintjsPopover2.blueprintjsPopover2Strings.`hover-target`
import typingsJapgolly.blueprintjsPopover2.blueprintjsPopover2Strings.hover
import typingsJapgolly.blueprintjsPopover2.libEsmPopover2SharedPropsMod.Popover2TargetProps
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmTooltip2Mod {
  
  @JSImport("@blueprintjs/popover2/lib/esm/tooltip2", "Tooltip2")
  @js.native
  open class Tooltip2[T] protected ()
    extends PureComponent[Tooltip2Props[T], js.Object, Any] {
    def this(props: Tooltip2Props[T]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Tooltip2Props[T], context: Any) = this()
    
    /* private */ var popover: Any = js.native
    
    /* private */ var renderPopover: Any = js.native
    
    def reposition(): Unit = js.native
  }
  /* static members */
  object Tooltip2 {
    
    @JSImport("@blueprintjs/popover2/lib/esm/tooltip2", "Tooltip2")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/popover2/lib/esm/tooltip2", "Tooltip2.defaultProps")
    @js.native
    def defaultProps: PartialTooltip2PropsHTMLP = js.native
    inline def defaultProps_=(x: PartialTooltip2PropsHTMLP): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/popover2/lib/esm/tooltip2", "Tooltip2.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  /* Inlined parent std.Omit<@blueprintjs/popover2.@blueprintjs/popover2/lib/esm/popover2SharedProps.Popover2SharedProps<TProps>, 'shouldReturnFocusOnClose'> */
  /* Inlined parent @blueprintjs/core.@blueprintjs/core.IntentProps */
  trait ITooltip2Props[TProps] extends StObject {
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var boundary: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Boundary */ Any
      ] = js.undefined
    
    var canEscapeKeyClose: js.UndefOr[Boolean] = js.undefined
    
    var captureDismiss: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * The content that will be displayed inside of the tooltip.
      */
    var content: Element | String
    
    var defaultIsOpen: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var enforceFocus: js.UndefOr[Boolean] = js.undefined
    
    var fill: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The amount of time in milliseconds the tooltip should remain open after
      * the user hovers off the trigger. The timer is canceled if the user mouses
      * over the target before it expires.
      *
      * @default 0
      */
    var hoverCloseDelay: js.UndefOr[Double] = js.undefined
    
    /**
      * The amount of time in milliseconds the tooltip should wait before opening
      * after the user hovers over the trigger. The timer is canceled if the user
      * mouses away from the target before it expires.
      *
      * @default 100
      */
    var hoverOpenDelay: js.UndefOr[Double] = js.undefined
    
    var inheritDarkTheme: js.UndefOr[Boolean] = js.undefined
    
    /** Visual intent color to apply to element. */
    var intent: js.UndefOr[Intent] = js.undefined
    
    /**
      * The kind of hover interaction that triggers the display of the tooltip.
      * Tooltips do not support click interactions.
      *
      * @default PopoverInteractionKind.HOVER_TARGET_ONLY
      */
    var interactionKind: js.UndefOr[hover | `hover-target`] = js.undefined
    
    var isOpen: js.UndefOr[Boolean] = js.undefined
    
    var `lazy`: js.UndefOr[Boolean] = js.undefined
    
    var matchTargetWidth: js.UndefOr[Boolean] = js.undefined
    
    var minimal: js.UndefOr[Boolean] = js.undefined
    
    var modifiers: js.UndefOr[
        Partial[
          /* import warning: importer.ImportType#apply Failed type conversion: {[ M in @blueprintjs/popover2.@blueprintjs/popover2/lib/esm/popover2SharedProps.StrictModifierNames ]: std.Partial<std.Omit<react-popper.react-popper.StrictModifier<M>, 'name'>>} */ js.Any
        ]
      ] = js.undefined
    
    var modifiersCustom: js.UndefOr[
        js.Array[
          Partial[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Modifier<any, object> */ Any
          ]
        ]
      ] = js.undefined
    
    var onClose: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLElement], Unit]] = js.undefined
    
    var onClosed: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.undefined
    
    var onClosing: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.undefined
    
    var onInteraction: js.UndefOr[
        js.Function2[/* nextOpenState */ Boolean, /* e */ js.UndefOr[ReactEventFrom[HTMLElement]], Unit]
      ] = js.undefined
    
    var onOpened: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.undefined
    
    var onOpening: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.undefined
    
    var openOnTargetFocus: js.UndefOr[Boolean] = js.undefined
    
    var placement: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Placement */ Any
      ] = js.undefined
    
    var popoverClassName: js.UndefOr[String] = js.undefined
    
    var popoverRef: js.UndefOr[Ref[HTMLElement]] = js.undefined
    
    var portalClassName: js.UndefOr[String] = js.undefined
    
    var portalContainer: js.UndefOr[HTMLElement] = js.undefined
    
    var position: js.UndefOr[PopoverPosition] = js.undefined
    
    var renderTarget: js.UndefOr[js.Function1[/* props */ Popover2TargetProps & TProps, Element]] = js.undefined
    
    var rootBoundary: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RootBoundary */ Any
      ] = js.undefined
    
    var targetTagName: js.UndefOr[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176, starting with typingsJapgolly.blueprintjsPopover2.blueprintjsPopover2Strings.a, typingsJapgolly.blueprintjsPopover2.blueprintjsPopover2Strings.abbr, typingsJapgolly.blueprintjsPopover2.blueprintjsPopover2Strings.address */ Any
      ] = js.undefined
    
    /**
      * Indicates how long (in milliseconds) the tooltip's appear/disappear
      * transition takes. This is used by React `CSSTransition` to know when a
      * transition completes and must match the duration of the animation in CSS.
      * Only set this prop if you override Blueprint's default transitions with
      * new transitions of a different length.
      *
      * @default 100
      */
    var transitionDuration: js.UndefOr[Double] = js.undefined
    
    var usePortal: js.UndefOr[Boolean] = js.undefined
  }
  object ITooltip2Props {
    
    inline def apply[TProps](content: Element | String): ITooltip2Props[TProps] = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITooltip2Props[TProps]]
    }
    
    extension [Self <: ITooltip2Props[?], TProps](x: Self & ITooltip2Props[TProps]) {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setBoundary(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Boundary */ Any
      ): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
      
      inline def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
      
      inline def setCanEscapeKeyClose(value: Boolean): Self = StObject.set(x, "canEscapeKeyClose", value.asInstanceOf[js.Any])
      
      inline def setCanEscapeKeyCloseUndefined: Self = StObject.set(x, "canEscapeKeyClose", js.undefined)
      
      inline def setCaptureDismiss(value: Boolean): Self = StObject.set(x, "captureDismiss", value.asInstanceOf[js.Any])
      
      inline def setCaptureDismissUndefined: Self = StObject.set(x, "captureDismiss", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: Element | String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentVdomElement(value: VdomElement): Self = StObject.set(x, "content", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDefaultIsOpen(value: Boolean): Self = StObject.set(x, "defaultIsOpen", value.asInstanceOf[js.Any])
      
      inline def setDefaultIsOpenUndefined: Self = StObject.set(x, "defaultIsOpen", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setEnforceFocus(value: Boolean): Self = StObject.set(x, "enforceFocus", value.asInstanceOf[js.Any])
      
      inline def setEnforceFocusUndefined: Self = StObject.set(x, "enforceFocus", js.undefined)
      
      inline def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setHoverCloseDelay(value: Double): Self = StObject.set(x, "hoverCloseDelay", value.asInstanceOf[js.Any])
      
      inline def setHoverCloseDelayUndefined: Self = StObject.set(x, "hoverCloseDelay", js.undefined)
      
      inline def setHoverOpenDelay(value: Double): Self = StObject.set(x, "hoverOpenDelay", value.asInstanceOf[js.Any])
      
      inline def setHoverOpenDelayUndefined: Self = StObject.set(x, "hoverOpenDelay", js.undefined)
      
      inline def setInheritDarkTheme(value: Boolean): Self = StObject.set(x, "inheritDarkTheme", value.asInstanceOf[js.Any])
      
      inline def setInheritDarkThemeUndefined: Self = StObject.set(x, "inheritDarkTheme", js.undefined)
      
      inline def setIntent(value: Intent): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
      
      inline def setIntentUndefined: Self = StObject.set(x, "intent", js.undefined)
      
      inline def setInteractionKind(value: hover | `hover-target`): Self = StObject.set(x, "interactionKind", value.asInstanceOf[js.Any])
      
      inline def setInteractionKindUndefined: Self = StObject.set(x, "interactionKind", js.undefined)
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      inline def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
      
      inline def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
      
      inline def setMatchTargetWidth(value: Boolean): Self = StObject.set(x, "matchTargetWidth", value.asInstanceOf[js.Any])
      
      inline def setMatchTargetWidthUndefined: Self = StObject.set(x, "matchTargetWidth", js.undefined)
      
      inline def setMinimal(value: Boolean): Self = StObject.set(x, "minimal", value.asInstanceOf[js.Any])
      
      inline def setMinimalUndefined: Self = StObject.set(x, "minimal", js.undefined)
      
      inline def setModifiers(
        value: Partial[
              /* import warning: importer.ImportType#apply Failed type conversion: {[ M in @blueprintjs/popover2.@blueprintjs/popover2/lib/esm/popover2SharedProps.StrictModifierNames ]: std.Partial<std.Omit<react-popper.react-popper.StrictModifier<M>, 'name'>>} */ js.Any
            ]
      ): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      inline def setModifiersCustom(
        value: js.Array[
              Partial[
                /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Modifier<any, object> */ Any
              ]
            ]
      ): Self = StObject.set(x, "modifiersCustom", value.asInstanceOf[js.Any])
      
      inline def setModifiersCustomUndefined: Self = StObject.set(x, "modifiersCustom", js.undefined)
      
      inline def setModifiersCustomVarargs(
        value: (Partial[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Modifier<any, object> */ Any
            ])*
      ): Self = StObject.set(x, "modifiersCustom", js.Array(value*))
      
      inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
      
      inline def setOnClose(value: /* event */ ReactEventFrom[HTMLElement] => Callback): Self = StObject.set(x, "onClose", js.Any.fromFunction1((t0: /* event */ ReactEventFrom[HTMLElement]) => value(t0).runNow()))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnClosed(value: /* node */ HTMLElement => Callback): Self = StObject.set(x, "onClosed", js.Any.fromFunction1((t0: /* node */ HTMLElement) => value(t0).runNow()))
      
      inline def setOnClosedUndefined: Self = StObject.set(x, "onClosed", js.undefined)
      
      inline def setOnClosing(value: /* node */ HTMLElement => Callback): Self = StObject.set(x, "onClosing", js.Any.fromFunction1((t0: /* node */ HTMLElement) => value(t0).runNow()))
      
      inline def setOnClosingUndefined: Self = StObject.set(x, "onClosing", js.undefined)
      
      inline def setOnInteraction(value: (/* nextOpenState */ Boolean, /* e */ js.UndefOr[ReactEventFrom[HTMLElement]]) => Callback): Self = StObject.set(x, "onInteraction", js.Any.fromFunction2((t0: /* nextOpenState */ Boolean, t1: /* e */ js.UndefOr[ReactEventFrom[HTMLElement]]) => (value(t0, t1)).runNow()))
      
      inline def setOnInteractionUndefined: Self = StObject.set(x, "onInteraction", js.undefined)
      
      inline def setOnOpened(value: /* node */ HTMLElement => Callback): Self = StObject.set(x, "onOpened", js.Any.fromFunction1((t0: /* node */ HTMLElement) => value(t0).runNow()))
      
      inline def setOnOpenedUndefined: Self = StObject.set(x, "onOpened", js.undefined)
      
      inline def setOnOpening(value: /* node */ HTMLElement => Callback): Self = StObject.set(x, "onOpening", js.Any.fromFunction1((t0: /* node */ HTMLElement) => value(t0).runNow()))
      
      inline def setOnOpeningUndefined: Self = StObject.set(x, "onOpening", js.undefined)
      
      inline def setOpenOnTargetFocus(value: Boolean): Self = StObject.set(x, "openOnTargetFocus", value.asInstanceOf[js.Any])
      
      inline def setOpenOnTargetFocusUndefined: Self = StObject.set(x, "openOnTargetFocus", js.undefined)
      
      inline def setPlacement(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Placement */ Any
      ): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setPopoverClassName(value: String): Self = StObject.set(x, "popoverClassName", value.asInstanceOf[js.Any])
      
      inline def setPopoverClassNameUndefined: Self = StObject.set(x, "popoverClassName", js.undefined)
      
      inline def setPopoverRef(value: Ref[HTMLElement]): Self = StObject.set(x, "popoverRef", value.asInstanceOf[js.Any])
      
      inline def setPopoverRefFunction1(value: HTMLElement | Null => Callback): Self = StObject.set(x, "popoverRef", js.Any.fromFunction1((t0: HTMLElement | Null) => value(t0).runNow()))
      
      inline def setPopoverRefNull: Self = StObject.set(x, "popoverRef", null)
      
      inline def setPopoverRefUndefined: Self = StObject.set(x, "popoverRef", js.undefined)
      
      inline def setPortalClassName(value: String): Self = StObject.set(x, "portalClassName", value.asInstanceOf[js.Any])
      
      inline def setPortalClassNameUndefined: Self = StObject.set(x, "portalClassName", js.undefined)
      
      inline def setPortalContainer(value: HTMLElement): Self = StObject.set(x, "portalContainer", value.asInstanceOf[js.Any])
      
      inline def setPortalContainerUndefined: Self = StObject.set(x, "portalContainer", js.undefined)
      
      inline def setPosition(value: PopoverPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setRenderTarget(value: /* props */ Popover2TargetProps & TProps => Element): Self = StObject.set(x, "renderTarget", js.Any.fromFunction1(value))
      
      inline def setRenderTargetUndefined: Self = StObject.set(x, "renderTarget", js.undefined)
      
      inline def setRootBoundary(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RootBoundary */ Any
      ): Self = StObject.set(x, "rootBoundary", value.asInstanceOf[js.Any])
      
      inline def setRootBoundaryUndefined: Self = StObject.set(x, "rootBoundary", js.undefined)
      
      inline def setTargetTagName(
        value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176, starting with typingsJapgolly.blueprintjsPopover2.blueprintjsPopover2Strings.a, typingsJapgolly.blueprintjsPopover2.blueprintjsPopover2Strings.abbr, typingsJapgolly.blueprintjsPopover2.blueprintjsPopover2Strings.address */ Any
      ): Self = StObject.set(x, "targetTagName", value.asInstanceOf[js.Any])
      
      inline def setTargetTagNameUndefined: Self = StObject.set(x, "targetTagName", js.undefined)
      
      inline def setTransitionDuration(value: Double): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
      
      inline def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
      
      inline def setUsePortal(value: Boolean): Self = StObject.set(x, "usePortal", value.asInstanceOf[js.Any])
      
      inline def setUsePortalUndefined: Self = StObject.set(x, "usePortal", js.undefined)
    }
  }
  
  type Tooltip2Props[TProps] = ITooltip2Props[TProps]
}
