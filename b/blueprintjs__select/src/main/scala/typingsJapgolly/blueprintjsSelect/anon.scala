package typingsJapgolly.blueprintjsSelect

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.facade.React.RefHandle
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLUListElement
import typingsJapgolly.blueprintjsCore.libEsmCommonIntentMod.Intent
import typingsJapgolly.blueprintjsCore.libEsmCommonPropsMod.HTMLInputProps
import typingsJapgolly.blueprintjsCore.libEsmCommonPropsMod.MaybeElement
import typingsJapgolly.blueprintjsCore.libEsmComponentsFormsInputGroupMod.InputGroupProps2
import typingsJapgolly.blueprintjsCore.libEsmComponentsPopoverPopoverMod.PopoverInteractionKind
import typingsJapgolly.blueprintjsCore.libEsmComponentsPopoverPopoverSharedPropsMod.PopoverPosition
import typingsJapgolly.blueprintjsCore.libEsmComponentsTagInputTagInputMod.TagInputAddMethod
import typingsJapgolly.blueprintjsCore.libEsmComponentsTagTagMod.TagProps
import typingsJapgolly.blueprintjsIcons.libEsmGenerated16pxBlueprintIcons16Mod.BlueprintIcons16Id
import typingsJapgolly.blueprintjsPopover2.libEsmPopover2Mod.Popover2InteractionKind
import typingsJapgolly.blueprintjsPopover2.libEsmPopupKindMod.PopupKind
import typingsJapgolly.blueprintjsPopover2.mod.Popover2
import typingsJapgolly.blueprintjsSelect.`libEsm@ExamplesFilmsMod`.Film
import typingsJapgolly.blueprintjsSelect.blueprintjsSelectBooleans.`false`
import typingsJapgolly.blueprintjsSelect.blueprintjsSelectStrings.first
import typingsJapgolly.blueprintjsSelect.blueprintjsSelectStrings.last
import typingsJapgolly.blueprintjsSelect.libEsmCommonItemListRendererMod.ItemListRenderer
import typingsJapgolly.blueprintjsSelect.libEsmCommonItemListRendererMod.ItemListRendererProps
import typingsJapgolly.blueprintjsSelect.libEsmCommonItemRendererMod.ItemRenderer
import typingsJapgolly.blueprintjsSelect.libEsmCommonItemRendererMod.ItemRendererProps
import typingsJapgolly.blueprintjsSelect.libEsmCommonListItemsPropsMod.ItemsEqualProp
import typingsJapgolly.blueprintjsSelect.libEsmCommonListItemsUtilsMod.CreateNewItem
import typingsJapgolly.blueprintjsSelect.libEsmCommonPredicateMod.ItemListPredicate
import typingsJapgolly.blueprintjsSelect.libEsmCommonPredicateMod.ItemPredicate
import typingsJapgolly.popperJs.mod.Boundary
import typingsJapgolly.popperJs.mod.Modifiers
import typingsJapgolly.popperJs.mod.Placement
import typingsJapgolly.react.mod.FormEventHandler
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.HTMLProps
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CreatedItems extends StObject {
    
    var createdItems: js.Array[Film]
    
    var items: js.Array[Film]
  }
  object CreatedItems {
    
    inline def apply(createdItems: js.Array[Film], items: js.Array[Film]): CreatedItems = {
      val __obj = js.Dynamic.literal(createdItems = createdItems.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreatedItems]
    }
    
    extension [Self <: CreatedItems](x: Self) {
      
      inline def setCreatedItems(value: js.Array[Film]): Self = StObject.set(x, "createdItems", value.asInstanceOf[js.Any])
      
      inline def setCreatedItemsVarargs(value: Film*): Self = StObject.set(x, "createdItems", js.Array(value*))
      
      inline def setItems(value: js.Array[Film]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: Film*): Self = StObject.set(x, "items", js.Array(value*))
    }
  }
  
  trait Disabled extends StObject {
    
    var disabled: Boolean
    
    var fill: Boolean
    
    var placeholder: String
  }
  object Disabled {
    
    inline def apply(disabled: Boolean, fill: Boolean, placeholder: String): Disabled = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any])
      __obj.asInstanceOf[Disabled]
    }
    
    extension [Self <: Disabled](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    }
  }
  
  trait Fill extends StObject {
    
    var fill: Boolean
    
    var placeholder: String
  }
  object Fill {
    
    inline def apply(fill: Boolean, placeholder: String): Fill = {
      val __obj = js.Dynamic.literal(fill = fill.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fill]
    }
    
    extension [Self <: Fill](x: Self) {
      
      inline def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@blueprintjs/core.@blueprintjs/core.IPopoverProps> */
  trait PartialIPopoverProps extends StObject {
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var backdropProps: js.UndefOr[HTMLProps[HTMLDivElement]] = js.undefined
    
    var boundary: js.UndefOr[Boundary] = js.undefined
    
    var canEscapeKeyClose: js.UndefOr[Boolean] = js.undefined
    
    var captureDismiss: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var content: js.UndefOr[String | Element] = js.undefined
    
    var defaultIsOpen: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var enforceFocus: js.UndefOr[Boolean] = js.undefined
    
    var fill: js.UndefOr[Boolean] = js.undefined
    
    var hasBackdrop: js.UndefOr[Boolean] = js.undefined
    
    var hoverCloseDelay: js.UndefOr[Double] = js.undefined
    
    var hoverOpenDelay: js.UndefOr[Double] = js.undefined
    
    var inheritDarkTheme: js.UndefOr[Boolean] = js.undefined
    
    var interactionKind: js.UndefOr[PopoverInteractionKind] = js.undefined
    
    var isOpen: js.UndefOr[Boolean] = js.undefined
    
    var `lazy`: js.UndefOr[Boolean] = js.undefined
    
    var minimal: js.UndefOr[Boolean] = js.undefined
    
    var modifiers: js.UndefOr[Modifiers] = js.undefined
    
    var onClose: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLElement], Unit]] = js.undefined
    
    var onClosed: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.undefined
    
    var onClosing: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.undefined
    
    var onInteraction: js.UndefOr[
        js.Function2[/* nextOpenState */ Boolean, /* e */ js.UndefOr[ReactEventFrom[HTMLElement]], Unit]
      ] = js.undefined
    
    var onOpened: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.undefined
    
    var onOpening: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.undefined
    
    var openOnTargetFocus: js.UndefOr[Boolean] = js.undefined
    
    var placement: js.UndefOr[Placement] = js.undefined
    
    var popoverClassName: js.UndefOr[String] = js.undefined
    
    var popoverRef: js.UndefOr[Ref[HTMLElement]] = js.undefined
    
    var portalClassName: js.UndefOr[String] = js.undefined
    
    var portalContainer: js.UndefOr[HTMLElement] = js.undefined
    
    var position: js.UndefOr[PopoverPosition] = js.undefined
    
    var shouldReturnFocusOnClose: js.UndefOr[Boolean] = js.undefined
    
    var target: js.UndefOr[String | Element] = js.undefined
    
    var targetClassName: js.UndefOr[String] = js.undefined
    
    var targetProps: js.UndefOr[HTMLAttributes[HTMLElement]] = js.undefined
    
    var targetTagName: js.UndefOr[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176, starting with typingsJapgolly.blueprintjsSelect.blueprintjsSelectStrings.a, typingsJapgolly.blueprintjsSelect.blueprintjsSelectStrings.abbr, typingsJapgolly.blueprintjsSelect.blueprintjsSelectStrings.address */ Any
      ] = js.undefined
    
    var transitionDuration: js.UndefOr[Double] = js.undefined
    
    var usePortal: js.UndefOr[Boolean] = js.undefined
    
    var wrapperTagName: js.UndefOr[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176, starting with typingsJapgolly.blueprintjsSelect.blueprintjsSelectStrings.a, typingsJapgolly.blueprintjsSelect.blueprintjsSelectStrings.abbr, typingsJapgolly.blueprintjsSelect.blueprintjsSelectStrings.address */ Any
      ] = js.undefined
  }
  object PartialIPopoverProps {
    
    inline def apply(): PartialIPopoverProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialIPopoverProps]
    }
    
    extension [Self <: PartialIPopoverProps](x: Self) {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setBackdropProps(value: HTMLProps[HTMLDivElement]): Self = StObject.set(x, "backdropProps", value.asInstanceOf[js.Any])
      
      inline def setBackdropPropsUndefined: Self = StObject.set(x, "backdropProps", js.undefined)
      
      inline def setBoundary(value: Boundary): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
      
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
      
      inline def setContent(value: String | Element): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVdomElement(value: VdomElement): Self = StObject.set(x, "content", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDefaultIsOpen(value: Boolean): Self = StObject.set(x, "defaultIsOpen", value.asInstanceOf[js.Any])
      
      inline def setDefaultIsOpenUndefined: Self = StObject.set(x, "defaultIsOpen", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setEnforceFocus(value: Boolean): Self = StObject.set(x, "enforceFocus", value.asInstanceOf[js.Any])
      
      inline def setEnforceFocusUndefined: Self = StObject.set(x, "enforceFocus", js.undefined)
      
      inline def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setHasBackdrop(value: Boolean): Self = StObject.set(x, "hasBackdrop", value.asInstanceOf[js.Any])
      
      inline def setHasBackdropUndefined: Self = StObject.set(x, "hasBackdrop", js.undefined)
      
      inline def setHoverCloseDelay(value: Double): Self = StObject.set(x, "hoverCloseDelay", value.asInstanceOf[js.Any])
      
      inline def setHoverCloseDelayUndefined: Self = StObject.set(x, "hoverCloseDelay", js.undefined)
      
      inline def setHoverOpenDelay(value: Double): Self = StObject.set(x, "hoverOpenDelay", value.asInstanceOf[js.Any])
      
      inline def setHoverOpenDelayUndefined: Self = StObject.set(x, "hoverOpenDelay", js.undefined)
      
      inline def setInheritDarkTheme(value: Boolean): Self = StObject.set(x, "inheritDarkTheme", value.asInstanceOf[js.Any])
      
      inline def setInheritDarkThemeUndefined: Self = StObject.set(x, "inheritDarkTheme", js.undefined)
      
      inline def setInteractionKind(value: PopoverInteractionKind): Self = StObject.set(x, "interactionKind", value.asInstanceOf[js.Any])
      
      inline def setInteractionKindUndefined: Self = StObject.set(x, "interactionKind", js.undefined)
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      inline def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
      
      inline def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
      
      inline def setMinimal(value: Boolean): Self = StObject.set(x, "minimal", value.asInstanceOf[js.Any])
      
      inline def setMinimalUndefined: Self = StObject.set(x, "minimal", js.undefined)
      
      inline def setModifiers(value: Modifiers): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
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
      
      inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
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
      
      inline def setShouldReturnFocusOnClose(value: Boolean): Self = StObject.set(x, "shouldReturnFocusOnClose", value.asInstanceOf[js.Any])
      
      inline def setShouldReturnFocusOnCloseUndefined: Self = StObject.set(x, "shouldReturnFocusOnClose", js.undefined)
      
      inline def setTarget(value: String | Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetClassName(value: String): Self = StObject.set(x, "targetClassName", value.asInstanceOf[js.Any])
      
      inline def setTargetClassNameUndefined: Self = StObject.set(x, "targetClassName", js.undefined)
      
      inline def setTargetProps(value: HTMLAttributes[HTMLElement]): Self = StObject.set(x, "targetProps", value.asInstanceOf[js.Any])
      
      inline def setTargetPropsUndefined: Self = StObject.set(x, "targetProps", js.undefined)
      
      inline def setTargetTagName(
        value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176, starting with typingsJapgolly.blueprintjsSelect.blueprintjsSelectStrings.a, typingsJapgolly.blueprintjsSelect.blueprintjsSelectStrings.abbr, typingsJapgolly.blueprintjsSelect.blueprintjsSelectStrings.address */ Any
      ): Self = StObject.set(x, "targetTagName", value.asInstanceOf[js.Any])
      
      inline def setTargetTagNameUndefined: Self = StObject.set(x, "targetTagName", js.undefined)
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTargetVdomElement(value: VdomElement): Self = StObject.set(x, "target", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTransitionDuration(value: Double): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
      
      inline def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
      
      inline def setUsePortal(value: Boolean): Self = StObject.set(x, "usePortal", value.asInstanceOf[js.Any])
      
      inline def setUsePortalUndefined: Self = StObject.set(x, "usePortal", js.undefined)
      
      inline def setWrapperTagName(
        value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176, starting with typingsJapgolly.blueprintjsSelect.blueprintjsSelectStrings.a, typingsJapgolly.blueprintjsSelect.blueprintjsSelectStrings.abbr, typingsJapgolly.blueprintjsSelect.blueprintjsSelectStrings.address */ Any
      ): Self = StObject.set(x, "wrapperTagName", value.asInstanceOf[js.Any])
      
      inline def setWrapperTagNameUndefined: Self = StObject.set(x, "wrapperTagName", js.undefined)
    }
  }
  
  /* Inlined std.Partial<std.Omit<@blueprintjs/popover2.@blueprintjs/popover2.Popover2Props<react.react.HTMLProps<std.HTMLElement>>, 'content' | 'defaultIsOpen' | 'disabled' | 'fill' | 'renderTarget' | 'targetTagName'>> */
  trait PartialOmitPopover2PropsH extends StObject {
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var backdropProps: js.UndefOr[HTMLProps[HTMLDivElement]] = js.undefined
    
    var boundary: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Boundary */ Any
      ] = js.undefined
    
    var canEscapeKeyClose: js.UndefOr[Boolean] = js.undefined
    
    var captureDismiss: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var enforceFocus: js.UndefOr[Boolean] = js.undefined
    
    var hasBackdrop: js.UndefOr[Boolean] = js.undefined
    
    var hoverCloseDelay: js.UndefOr[Double] = js.undefined
    
    var hoverOpenDelay: js.UndefOr[Double] = js.undefined
    
    var inheritDarkTheme: js.UndefOr[Boolean] = js.undefined
    
    var interactionKind: js.UndefOr[Popover2InteractionKind] = js.undefined
    
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
    
    var popupKind: js.UndefOr[PopupKind] = js.undefined
    
    var portalClassName: js.UndefOr[String] = js.undefined
    
    var portalContainer: js.UndefOr[HTMLElement] = js.undefined
    
    var position: js.UndefOr[PopoverPosition] = js.undefined
    
    var positioningStrategy: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PositioningStrategy */ Any
      ] = js.undefined
    
    var rootBoundary: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RootBoundary */ Any
      ] = js.undefined
    
    var shouldReturnFocusOnClose: js.UndefOr[Boolean] = js.undefined
    
    var transitionDuration: js.UndefOr[Double] = js.undefined
    
    var usePortal: js.UndefOr[Boolean] = js.undefined
  }
  object PartialOmitPopover2PropsH {
    
    inline def apply(): PartialOmitPopover2PropsH = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOmitPopover2PropsH]
    }
    
    extension [Self <: PartialOmitPopover2PropsH](x: Self) {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setBackdropProps(value: HTMLProps[HTMLDivElement]): Self = StObject.set(x, "backdropProps", value.asInstanceOf[js.Any])
      
      inline def setBackdropPropsUndefined: Self = StObject.set(x, "backdropProps", js.undefined)
      
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
      
      inline def setEnforceFocus(value: Boolean): Self = StObject.set(x, "enforceFocus", value.asInstanceOf[js.Any])
      
      inline def setEnforceFocusUndefined: Self = StObject.set(x, "enforceFocus", js.undefined)
      
      inline def setHasBackdrop(value: Boolean): Self = StObject.set(x, "hasBackdrop", value.asInstanceOf[js.Any])
      
      inline def setHasBackdropUndefined: Self = StObject.set(x, "hasBackdrop", js.undefined)
      
      inline def setHoverCloseDelay(value: Double): Self = StObject.set(x, "hoverCloseDelay", value.asInstanceOf[js.Any])
      
      inline def setHoverCloseDelayUndefined: Self = StObject.set(x, "hoverCloseDelay", js.undefined)
      
      inline def setHoverOpenDelay(value: Double): Self = StObject.set(x, "hoverOpenDelay", value.asInstanceOf[js.Any])
      
      inline def setHoverOpenDelayUndefined: Self = StObject.set(x, "hoverOpenDelay", js.undefined)
      
      inline def setInheritDarkTheme(value: Boolean): Self = StObject.set(x, "inheritDarkTheme", value.asInstanceOf[js.Any])
      
      inline def setInheritDarkThemeUndefined: Self = StObject.set(x, "inheritDarkTheme", js.undefined)
      
      inline def setInteractionKind(value: Popover2InteractionKind): Self = StObject.set(x, "interactionKind", value.asInstanceOf[js.Any])
      
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
      
      inline def setPopupKind(value: PopupKind): Self = StObject.set(x, "popupKind", value.asInstanceOf[js.Any])
      
      inline def setPopupKindUndefined: Self = StObject.set(x, "popupKind", js.undefined)
      
      inline def setPortalClassName(value: String): Self = StObject.set(x, "portalClassName", value.asInstanceOf[js.Any])
      
      inline def setPortalClassNameUndefined: Self = StObject.set(x, "portalClassName", js.undefined)
      
      inline def setPortalContainer(value: HTMLElement): Self = StObject.set(x, "portalContainer", value.asInstanceOf[js.Any])
      
      inline def setPortalContainerUndefined: Self = StObject.set(x, "portalContainer", js.undefined)
      
      inline def setPosition(value: PopoverPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setPositioningStrategy(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PositioningStrategy */ Any
      ): Self = StObject.set(x, "positioningStrategy", value.asInstanceOf[js.Any])
      
      inline def setPositioningStrategyUndefined: Self = StObject.set(x, "positioningStrategy", js.undefined)
      
      inline def setRootBoundary(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RootBoundary */ Any
      ): Self = StObject.set(x, "rootBoundary", value.asInstanceOf[js.Any])
      
      inline def setRootBoundaryUndefined: Self = StObject.set(x, "rootBoundary", js.undefined)
      
      inline def setShouldReturnFocusOnClose(value: Boolean): Self = StObject.set(x, "shouldReturnFocusOnClose", value.asInstanceOf[js.Any])
      
      inline def setShouldReturnFocusOnCloseUndefined: Self = StObject.set(x, "shouldReturnFocusOnClose", js.undefined)
      
      inline def setTransitionDuration(value: Double): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
      
      inline def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
      
      inline def setUsePortal(value: Boolean): Self = StObject.set(x, "usePortal", value.asInstanceOf[js.Any])
      
      inline def setUsePortalUndefined: Self = StObject.set(x, "usePortal", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@blueprintjs/core.@blueprintjs/core.OverlayProps> */
  trait PartialOverlayProps extends StObject {
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var backdropClassName: js.UndefOr[String] = js.undefined
    
    var backdropProps: js.UndefOr[HTMLProps[HTMLDivElement]] = js.undefined
    
    var canEscapeKeyClose: js.UndefOr[Boolean] = js.undefined
    
    var canOutsideClickClose: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var enforceFocus: js.UndefOr[Boolean] = js.undefined
    
    var hasBackdrop: js.UndefOr[Boolean] = js.undefined
    
    var isOpen: js.UndefOr[Boolean] = js.undefined
    
    var `lazy`: js.UndefOr[Boolean] = js.undefined
    
    var onClose: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLElement], Unit]] = js.undefined
    
    var onClosed: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.undefined
    
    var onClosing: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.undefined
    
    var onOpened: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.undefined
    
    var onOpening: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.undefined
    
    var portalClassName: js.UndefOr[String] = js.undefined
    
    var portalContainer: js.UndefOr[HTMLElement] = js.undefined
    
    var shouldReturnFocusOnClose: js.UndefOr[Boolean] = js.undefined
    
    var transitionDuration: js.UndefOr[Double] = js.undefined
    
    var transitionName: js.UndefOr[String] = js.undefined
    
    var usePortal: js.UndefOr[Boolean] = js.undefined
  }
  object PartialOverlayProps {
    
    inline def apply(): PartialOverlayProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOverlayProps]
    }
    
    extension [Self <: PartialOverlayProps](x: Self) {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setBackdropClassName(value: String): Self = StObject.set(x, "backdropClassName", value.asInstanceOf[js.Any])
      
      inline def setBackdropClassNameUndefined: Self = StObject.set(x, "backdropClassName", js.undefined)
      
      inline def setBackdropProps(value: HTMLProps[HTMLDivElement]): Self = StObject.set(x, "backdropProps", value.asInstanceOf[js.Any])
      
      inline def setBackdropPropsUndefined: Self = StObject.set(x, "backdropProps", js.undefined)
      
      inline def setCanEscapeKeyClose(value: Boolean): Self = StObject.set(x, "canEscapeKeyClose", value.asInstanceOf[js.Any])
      
      inline def setCanEscapeKeyCloseUndefined: Self = StObject.set(x, "canEscapeKeyClose", js.undefined)
      
      inline def setCanOutsideClickClose(value: Boolean): Self = StObject.set(x, "canOutsideClickClose", value.asInstanceOf[js.Any])
      
      inline def setCanOutsideClickCloseUndefined: Self = StObject.set(x, "canOutsideClickClose", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setEnforceFocus(value: Boolean): Self = StObject.set(x, "enforceFocus", value.asInstanceOf[js.Any])
      
      inline def setEnforceFocusUndefined: Self = StObject.set(x, "enforceFocus", js.undefined)
      
      inline def setHasBackdrop(value: Boolean): Self = StObject.set(x, "hasBackdrop", value.asInstanceOf[js.Any])
      
      inline def setHasBackdropUndefined: Self = StObject.set(x, "hasBackdrop", js.undefined)
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      inline def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
      
      inline def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
      
      inline def setOnClose(value: /* event */ ReactEventFrom[HTMLElement] => Callback): Self = StObject.set(x, "onClose", js.Any.fromFunction1((t0: /* event */ ReactEventFrom[HTMLElement]) => value(t0).runNow()))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnClosed(value: /* node */ HTMLElement => Callback): Self = StObject.set(x, "onClosed", js.Any.fromFunction1((t0: /* node */ HTMLElement) => value(t0).runNow()))
      
      inline def setOnClosedUndefined: Self = StObject.set(x, "onClosed", js.undefined)
      
      inline def setOnClosing(value: /* node */ HTMLElement => Callback): Self = StObject.set(x, "onClosing", js.Any.fromFunction1((t0: /* node */ HTMLElement) => value(t0).runNow()))
      
      inline def setOnClosingUndefined: Self = StObject.set(x, "onClosing", js.undefined)
      
      inline def setOnOpened(value: /* node */ HTMLElement => Callback): Self = StObject.set(x, "onOpened", js.Any.fromFunction1((t0: /* node */ HTMLElement) => value(t0).runNow()))
      
      inline def setOnOpenedUndefined: Self = StObject.set(x, "onOpened", js.undefined)
      
      inline def setOnOpening(value: /* node */ HTMLElement => Callback): Self = StObject.set(x, "onOpening", js.Any.fromFunction1((t0: /* node */ HTMLElement) => value(t0).runNow()))
      
      inline def setOnOpeningUndefined: Self = StObject.set(x, "onOpening", js.undefined)
      
      inline def setPortalClassName(value: String): Self = StObject.set(x, "portalClassName", value.asInstanceOf[js.Any])
      
      inline def setPortalClassNameUndefined: Self = StObject.set(x, "portalClassName", js.undefined)
      
      inline def setPortalContainer(value: HTMLElement): Self = StObject.set(x, "portalContainer", value.asInstanceOf[js.Any])
      
      inline def setPortalContainerUndefined: Self = StObject.set(x, "portalContainer", js.undefined)
      
      inline def setShouldReturnFocusOnClose(value: Boolean): Self = StObject.set(x, "shouldReturnFocusOnClose", value.asInstanceOf[js.Any])
      
      inline def setShouldReturnFocusOnCloseUndefined: Self = StObject.set(x, "shouldReturnFocusOnClose", js.undefined)
      
      inline def setTransitionDuration(value: Double): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
      
      inline def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
      
      inline def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      inline def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
      
      inline def setUsePortal(value: Boolean): Self = StObject.set(x, "usePortal", value.asInstanceOf[js.Any])
      
      inline def setUsePortalUndefined: Self = StObject.set(x, "usePortal", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@blueprintjs/select.@blueprintjs/select/lib/esm/components/suggest/suggest2.Suggest2Props<any>> */
  trait PartialSuggest2Propsany extends StObject {
    
    var activeItem: js.UndefOr[Any | CreateNewItem | Null] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var closeOnSelect: js.UndefOr[Boolean] = js.undefined
    
    var createNewItemFromQuery: js.UndefOr[js.Function1[/* query */ String, Any | js.Array[Any]]] = js.undefined
    
    var createNewItemPosition: js.UndefOr[first | last] = js.undefined
    
    var createNewItemRenderer: js.UndefOr[
        js.Function3[
          /* query */ String, 
          /* active */ Boolean, 
          /* handleClick */ MouseEventHandler[HTMLElement], 
          js.UndefOr[Element]
        ]
      ] = js.undefined
    
    var defaultSelectedItem: js.UndefOr[Any] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var fill: js.UndefOr[Boolean] = js.undefined
    
    var initialContent: js.UndefOr[Node | Null] = js.undefined
    
    var inputProps: js.UndefOr[InputGroupProps2] = js.undefined
    
    var inputValueRenderer: js.UndefOr[js.Function1[/* item */ Any, String]] = js.undefined
    
    var itemDisabled: js.UndefOr[
        (/* keyof any */ String) | (js.Function2[/* item */ Any, /* index */ Double, Boolean])
      ] = js.undefined
    
    var itemListPredicate: js.UndefOr[ItemListPredicate[Any]] = js.undefined
    
    var itemListRenderer: js.UndefOr[ItemListRenderer[Any]] = js.undefined
    
    var itemPredicate: js.UndefOr[ItemPredicate[Any]] = js.undefined
    
    var itemRenderer: js.UndefOr[ItemRenderer[Any]] = js.undefined
    
    var items: js.UndefOr[js.Array[Any]] = js.undefined
    
    var itemsEqual: js.UndefOr[ItemsEqualProp[Any]] = js.undefined
    
    var menuProps: js.UndefOr[HTMLAttributes[HTMLUListElement]] = js.undefined
    
    var noResults: js.UndefOr[Node] = js.undefined
    
    var onActiveItemChange: js.UndefOr[js.Function2[/* activeItem */ Any | Null, /* isCreateNewItem */ Boolean, Unit]] = js.undefined
    
    var onItemSelect: js.UndefOr[
        js.Function2[/* item */ Any, /* event */ js.UndefOr[ReactEventFrom[HTMLElement]], Unit]
      ] = js.undefined
    
    var onItemsPaste: js.UndefOr[js.Function1[/* items */ js.Array[Any], Unit]] = js.undefined
    
    var onQueryChange: js.UndefOr[
        js.Function2[/* query */ String, /* event */ js.UndefOr[ReactEventFrom[HTMLInputElement]], Unit]
      ] = js.undefined
    
    var openOnKeyDown: js.UndefOr[Boolean] = js.undefined
    
    var popoverContentProps: js.UndefOr[HTMLAttributes[HTMLDivElement]] = js.undefined
    
    var popoverProps: js.UndefOr[PartialOmitPopover2PropsH] = js.undefined
    
    var popoverRef: js.UndefOr[RefHandle[Popover2[HTMLProps[HTMLDivElement]]]] = js.undefined
    
    var query: js.UndefOr[String] = js.undefined
    
    var resetOnClose: js.UndefOr[Boolean] = js.undefined
    
    var resetOnQuery: js.UndefOr[Boolean] = js.undefined
    
    var resetOnSelect: js.UndefOr[Boolean] = js.undefined
    
    var scrollToActiveItem: js.UndefOr[Boolean] = js.undefined
    
    var selectedItem: js.UndefOr[Any | Null] = js.undefined
  }
  object PartialSuggest2Propsany {
    
    inline def apply(): PartialSuggest2Propsany = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSuggest2Propsany]
    }
    
    extension [Self <: PartialSuggest2Propsany](x: Self) {
      
      inline def setActiveItem(value: Any | CreateNewItem): Self = StObject.set(x, "activeItem", value.asInstanceOf[js.Any])
      
      inline def setActiveItemNull: Self = StObject.set(x, "activeItem", null)
      
      inline def setActiveItemUndefined: Self = StObject.set(x, "activeItem", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCloseOnSelect(value: Boolean): Self = StObject.set(x, "closeOnSelect", value.asInstanceOf[js.Any])
      
      inline def setCloseOnSelectUndefined: Self = StObject.set(x, "closeOnSelect", js.undefined)
      
      inline def setCreateNewItemFromQuery(value: /* query */ String => Any | js.Array[Any]): Self = StObject.set(x, "createNewItemFromQuery", js.Any.fromFunction1(value))
      
      inline def setCreateNewItemFromQueryUndefined: Self = StObject.set(x, "createNewItemFromQuery", js.undefined)
      
      inline def setCreateNewItemPosition(value: first | last): Self = StObject.set(x, "createNewItemPosition", value.asInstanceOf[js.Any])
      
      inline def setCreateNewItemPositionUndefined: Self = StObject.set(x, "createNewItemPosition", js.undefined)
      
      inline def setCreateNewItemRenderer(
        value: (/* query */ String, /* active */ Boolean, /* handleClick */ MouseEventHandler[HTMLElement]) => js.UndefOr[Element]
      ): Self = StObject.set(x, "createNewItemRenderer", js.Any.fromFunction3(value))
      
      inline def setCreateNewItemRendererUndefined: Self = StObject.set(x, "createNewItemRenderer", js.undefined)
      
      inline def setDefaultSelectedItem(value: Any): Self = StObject.set(x, "defaultSelectedItem", value.asInstanceOf[js.Any])
      
      inline def setDefaultSelectedItemUndefined: Self = StObject.set(x, "defaultSelectedItem", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setInitialContent(value: VdomNode): Self = StObject.set(x, "initialContent", value.rawNode.asInstanceOf[js.Any])
      
      inline def setInitialContentNull: Self = StObject.set(x, "initialContent", null)
      
      inline def setInitialContentUndefined: Self = StObject.set(x, "initialContent", js.undefined)
      
      inline def setInitialContentVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "initialContent", js.Array(value*))
      
      inline def setInitialContentVdomElement(value: VdomElement): Self = StObject.set(x, "initialContent", value.rawElement.asInstanceOf[js.Any])
      
      inline def setInputProps(value: InputGroupProps2): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
      
      inline def setInputPropsUndefined: Self = StObject.set(x, "inputProps", js.undefined)
      
      inline def setInputValueRenderer(value: /* item */ Any => String): Self = StObject.set(x, "inputValueRenderer", js.Any.fromFunction1(value))
      
      inline def setInputValueRendererUndefined: Self = StObject.set(x, "inputValueRenderer", js.undefined)
      
      inline def setItemDisabled(value: (/* keyof any */ String) | (js.Function2[/* item */ Any, /* index */ Double, Boolean])): Self = StObject.set(x, "itemDisabled", value.asInstanceOf[js.Any])
      
      inline def setItemDisabledFunction2(value: (/* item */ Any, /* index */ Double) => Boolean): Self = StObject.set(x, "itemDisabled", js.Any.fromFunction2(value))
      
      inline def setItemDisabledUndefined: Self = StObject.set(x, "itemDisabled", js.undefined)
      
      inline def setItemListPredicate(value: (/* query */ String, /* items */ js.Array[Any]) => js.Array[Any]): Self = StObject.set(x, "itemListPredicate", js.Any.fromFunction2(value))
      
      inline def setItemListPredicateUndefined: Self = StObject.set(x, "itemListPredicate", js.undefined)
      
      inline def setItemListRenderer(value: /* itemListProps */ ItemListRendererProps[Any] => Element | Null): Self = StObject.set(x, "itemListRenderer", js.Any.fromFunction1(value))
      
      inline def setItemListRendererUndefined: Self = StObject.set(x, "itemListRenderer", js.undefined)
      
      inline def setItemPredicate(
        value: (/* query */ String, Any, /* index */ js.UndefOr[Double], /* exactMatch */ js.UndefOr[Boolean]) => Boolean
      ): Self = StObject.set(x, "itemPredicate", js.Any.fromFunction4(value))
      
      inline def setItemPredicateUndefined: Self = StObject.set(x, "itemPredicate", js.undefined)
      
      inline def setItemRenderer(value: (Any, /* itemProps */ ItemRendererProps) => Element | Null): Self = StObject.set(x, "itemRenderer", js.Any.fromFunction2(value))
      
      inline def setItemRendererUndefined: Self = StObject.set(x, "itemRenderer", js.undefined)
      
      inline def setItems(value: js.Array[Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsEqual(value: ItemsEqualProp[Any]): Self = StObject.set(x, "itemsEqual", value.asInstanceOf[js.Any])
      
      inline def setItemsEqualFunction2(value: (Any, Any) => Boolean): Self = StObject.set(x, "itemsEqual", js.Any.fromFunction2(value))
      
      inline def setItemsEqualUndefined: Self = StObject.set(x, "itemsEqual", js.undefined)
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: Any*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setMenuProps(value: HTMLAttributes[HTMLUListElement]): Self = StObject.set(x, "menuProps", value.asInstanceOf[js.Any])
      
      inline def setMenuPropsUndefined: Self = StObject.set(x, "menuProps", js.undefined)
      
      inline def setNoResults(value: VdomNode): Self = StObject.set(x, "noResults", value.rawNode.asInstanceOf[js.Any])
      
      inline def setNoResultsNull: Self = StObject.set(x, "noResults", null)
      
      inline def setNoResultsUndefined: Self = StObject.set(x, "noResults", js.undefined)
      
      inline def setNoResultsVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "noResults", js.Array(value*))
      
      inline def setNoResultsVdomElement(value: VdomElement): Self = StObject.set(x, "noResults", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnActiveItemChange(value: (/* activeItem */ Any | Null, /* isCreateNewItem */ Boolean) => Callback): Self = StObject.set(x, "onActiveItemChange", js.Any.fromFunction2((t0: /* activeItem */ Any | Null, t1: /* isCreateNewItem */ Boolean) => (value(t0, t1)).runNow()))
      
      inline def setOnActiveItemChangeUndefined: Self = StObject.set(x, "onActiveItemChange", js.undefined)
      
      inline def setOnItemSelect(value: (/* item */ Any, /* event */ js.UndefOr[ReactEventFrom[HTMLElement]]) => Callback): Self = StObject.set(x, "onItemSelect", js.Any.fromFunction2((t0: /* item */ Any, t1: /* event */ js.UndefOr[ReactEventFrom[HTMLElement]]) => (value(t0, t1)).runNow()))
      
      inline def setOnItemSelectUndefined: Self = StObject.set(x, "onItemSelect", js.undefined)
      
      inline def setOnItemsPaste(value: /* items */ js.Array[Any] => Callback): Self = StObject.set(x, "onItemsPaste", js.Any.fromFunction1((t0: /* items */ js.Array[Any]) => value(t0).runNow()))
      
      inline def setOnItemsPasteUndefined: Self = StObject.set(x, "onItemsPaste", js.undefined)
      
      inline def setOnQueryChange(value: (/* query */ String, /* event */ js.UndefOr[ReactEventFrom[HTMLInputElement]]) => Callback): Self = StObject.set(x, "onQueryChange", js.Any.fromFunction2((t0: /* query */ String, t1: /* event */ js.UndefOr[ReactEventFrom[HTMLInputElement]]) => (value(t0, t1)).runNow()))
      
      inline def setOnQueryChangeUndefined: Self = StObject.set(x, "onQueryChange", js.undefined)
      
      inline def setOpenOnKeyDown(value: Boolean): Self = StObject.set(x, "openOnKeyDown", value.asInstanceOf[js.Any])
      
      inline def setOpenOnKeyDownUndefined: Self = StObject.set(x, "openOnKeyDown", js.undefined)
      
      inline def setPopoverContentProps(value: HTMLAttributes[HTMLDivElement]): Self = StObject.set(x, "popoverContentProps", value.asInstanceOf[js.Any])
      
      inline def setPopoverContentPropsUndefined: Self = StObject.set(x, "popoverContentProps", js.undefined)
      
      inline def setPopoverProps(value: PartialOmitPopover2PropsH): Self = StObject.set(x, "popoverProps", value.asInstanceOf[js.Any])
      
      inline def setPopoverPropsUndefined: Self = StObject.set(x, "popoverProps", js.undefined)
      
      inline def setPopoverRef(value: RefHandle[Popover2[HTMLProps[HTMLDivElement]]]): Self = StObject.set(x, "popoverRef", value.asInstanceOf[js.Any])
      
      inline def setPopoverRefUndefined: Self = StObject.set(x, "popoverRef", js.undefined)
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setResetOnClose(value: Boolean): Self = StObject.set(x, "resetOnClose", value.asInstanceOf[js.Any])
      
      inline def setResetOnCloseUndefined: Self = StObject.set(x, "resetOnClose", js.undefined)
      
      inline def setResetOnQuery(value: Boolean): Self = StObject.set(x, "resetOnQuery", value.asInstanceOf[js.Any])
      
      inline def setResetOnQueryUndefined: Self = StObject.set(x, "resetOnQuery", js.undefined)
      
      inline def setResetOnSelect(value: Boolean): Self = StObject.set(x, "resetOnSelect", value.asInstanceOf[js.Any])
      
      inline def setResetOnSelectUndefined: Self = StObject.set(x, "resetOnSelect", js.undefined)
      
      inline def setScrollToActiveItem(value: Boolean): Self = StObject.set(x, "scrollToActiveItem", value.asInstanceOf[js.Any])
      
      inline def setScrollToActiveItemUndefined: Self = StObject.set(x, "scrollToActiveItem", js.undefined)
      
      inline def setSelectedItem(value: Any): Self = StObject.set(x, "selectedItem", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemNull: Self = StObject.set(x, "selectedItem", null)
      
      inline def setSelectedItemUndefined: Self = StObject.set(x, "selectedItem", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@blueprintjs/select.@blueprintjs/select/lib/esm/components/suggest/suggest.SuggestProps<any>> */
  trait PartialSuggestPropsany extends StObject {
    
    var activeItem: js.UndefOr[Any | CreateNewItem | Null] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var closeOnSelect: js.UndefOr[Boolean] = js.undefined
    
    var createNewItemFromQuery: js.UndefOr[js.Function1[/* query */ String, Any | js.Array[Any]]] = js.undefined
    
    var createNewItemPosition: js.UndefOr[first | last] = js.undefined
    
    var createNewItemRenderer: js.UndefOr[
        js.Function3[
          /* query */ String, 
          /* active */ Boolean, 
          /* handleClick */ MouseEventHandler[HTMLElement], 
          js.UndefOr[Element]
        ]
      ] = js.undefined
    
    var defaultSelectedItem: js.UndefOr[Any] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var fill: js.UndefOr[Boolean] = js.undefined
    
    var initialContent: js.UndefOr[Node | Null] = js.undefined
    
    var inputProps: js.UndefOr[InputGroupProps2] = js.undefined
    
    var inputValueRenderer: js.UndefOr[js.Function1[/* item */ Any, String]] = js.undefined
    
    var itemDisabled: js.UndefOr[
        (/* keyof any */ String) | (js.Function2[/* item */ Any, /* index */ Double, Boolean])
      ] = js.undefined
    
    var itemListPredicate: js.UndefOr[ItemListPredicate[Any]] = js.undefined
    
    var itemListRenderer: js.UndefOr[ItemListRenderer[Any]] = js.undefined
    
    var itemPredicate: js.UndefOr[ItemPredicate[Any]] = js.undefined
    
    var itemRenderer: js.UndefOr[ItemRenderer[Any]] = js.undefined
    
    var items: js.UndefOr[js.Array[Any]] = js.undefined
    
    var itemsEqual: js.UndefOr[ItemsEqualProp[Any]] = js.undefined
    
    var noResults: js.UndefOr[Node] = js.undefined
    
    var onActiveItemChange: js.UndefOr[js.Function2[/* activeItem */ Any | Null, /* isCreateNewItem */ Boolean, Unit]] = js.undefined
    
    var onItemSelect: js.UndefOr[
        js.Function2[/* item */ Any, /* event */ js.UndefOr[ReactEventFrom[HTMLElement]], Unit]
      ] = js.undefined
    
    var onItemsPaste: js.UndefOr[js.Function1[/* items */ js.Array[Any], Unit]] = js.undefined
    
    var onQueryChange: js.UndefOr[
        js.Function2[/* query */ String, /* event */ js.UndefOr[ReactEventFrom[HTMLInputElement]], Unit]
      ] = js.undefined
    
    var openOnKeyDown: js.UndefOr[Boolean] = js.undefined
    
    var popoverProps: js.UndefOr[PartialIPopoverProps & js.Object] = js.undefined
    
    var query: js.UndefOr[String] = js.undefined
    
    var resetOnClose: js.UndefOr[Boolean] = js.undefined
    
    var resetOnQuery: js.UndefOr[Boolean] = js.undefined
    
    var resetOnSelect: js.UndefOr[Boolean] = js.undefined
    
    var scrollToActiveItem: js.UndefOr[Boolean] = js.undefined
    
    var selectedItem: js.UndefOr[Any | Null] = js.undefined
  }
  object PartialSuggestPropsany {
    
    inline def apply(): PartialSuggestPropsany = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSuggestPropsany]
    }
    
    extension [Self <: PartialSuggestPropsany](x: Self) {
      
      inline def setActiveItem(value: Any | CreateNewItem): Self = StObject.set(x, "activeItem", value.asInstanceOf[js.Any])
      
      inline def setActiveItemNull: Self = StObject.set(x, "activeItem", null)
      
      inline def setActiveItemUndefined: Self = StObject.set(x, "activeItem", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCloseOnSelect(value: Boolean): Self = StObject.set(x, "closeOnSelect", value.asInstanceOf[js.Any])
      
      inline def setCloseOnSelectUndefined: Self = StObject.set(x, "closeOnSelect", js.undefined)
      
      inline def setCreateNewItemFromQuery(value: /* query */ String => Any | js.Array[Any]): Self = StObject.set(x, "createNewItemFromQuery", js.Any.fromFunction1(value))
      
      inline def setCreateNewItemFromQueryUndefined: Self = StObject.set(x, "createNewItemFromQuery", js.undefined)
      
      inline def setCreateNewItemPosition(value: first | last): Self = StObject.set(x, "createNewItemPosition", value.asInstanceOf[js.Any])
      
      inline def setCreateNewItemPositionUndefined: Self = StObject.set(x, "createNewItemPosition", js.undefined)
      
      inline def setCreateNewItemRenderer(
        value: (/* query */ String, /* active */ Boolean, /* handleClick */ MouseEventHandler[HTMLElement]) => js.UndefOr[Element]
      ): Self = StObject.set(x, "createNewItemRenderer", js.Any.fromFunction3(value))
      
      inline def setCreateNewItemRendererUndefined: Self = StObject.set(x, "createNewItemRenderer", js.undefined)
      
      inline def setDefaultSelectedItem(value: Any): Self = StObject.set(x, "defaultSelectedItem", value.asInstanceOf[js.Any])
      
      inline def setDefaultSelectedItemUndefined: Self = StObject.set(x, "defaultSelectedItem", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setInitialContent(value: VdomNode): Self = StObject.set(x, "initialContent", value.rawNode.asInstanceOf[js.Any])
      
      inline def setInitialContentNull: Self = StObject.set(x, "initialContent", null)
      
      inline def setInitialContentUndefined: Self = StObject.set(x, "initialContent", js.undefined)
      
      inline def setInitialContentVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "initialContent", js.Array(value*))
      
      inline def setInitialContentVdomElement(value: VdomElement): Self = StObject.set(x, "initialContent", value.rawElement.asInstanceOf[js.Any])
      
      inline def setInputProps(value: InputGroupProps2): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
      
      inline def setInputPropsUndefined: Self = StObject.set(x, "inputProps", js.undefined)
      
      inline def setInputValueRenderer(value: /* item */ Any => String): Self = StObject.set(x, "inputValueRenderer", js.Any.fromFunction1(value))
      
      inline def setInputValueRendererUndefined: Self = StObject.set(x, "inputValueRenderer", js.undefined)
      
      inline def setItemDisabled(value: (/* keyof any */ String) | (js.Function2[/* item */ Any, /* index */ Double, Boolean])): Self = StObject.set(x, "itemDisabled", value.asInstanceOf[js.Any])
      
      inline def setItemDisabledFunction2(value: (/* item */ Any, /* index */ Double) => Boolean): Self = StObject.set(x, "itemDisabled", js.Any.fromFunction2(value))
      
      inline def setItemDisabledUndefined: Self = StObject.set(x, "itemDisabled", js.undefined)
      
      inline def setItemListPredicate(value: (/* query */ String, /* items */ js.Array[Any]) => js.Array[Any]): Self = StObject.set(x, "itemListPredicate", js.Any.fromFunction2(value))
      
      inline def setItemListPredicateUndefined: Self = StObject.set(x, "itemListPredicate", js.undefined)
      
      inline def setItemListRenderer(value: /* itemListProps */ ItemListRendererProps[Any] => Element | Null): Self = StObject.set(x, "itemListRenderer", js.Any.fromFunction1(value))
      
      inline def setItemListRendererUndefined: Self = StObject.set(x, "itemListRenderer", js.undefined)
      
      inline def setItemPredicate(
        value: (/* query */ String, Any, /* index */ js.UndefOr[Double], /* exactMatch */ js.UndefOr[Boolean]) => Boolean
      ): Self = StObject.set(x, "itemPredicate", js.Any.fromFunction4(value))
      
      inline def setItemPredicateUndefined: Self = StObject.set(x, "itemPredicate", js.undefined)
      
      inline def setItemRenderer(value: (Any, /* itemProps */ ItemRendererProps) => Element | Null): Self = StObject.set(x, "itemRenderer", js.Any.fromFunction2(value))
      
      inline def setItemRendererUndefined: Self = StObject.set(x, "itemRenderer", js.undefined)
      
      inline def setItems(value: js.Array[Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsEqual(value: ItemsEqualProp[Any]): Self = StObject.set(x, "itemsEqual", value.asInstanceOf[js.Any])
      
      inline def setItemsEqualFunction2(value: (Any, Any) => Boolean): Self = StObject.set(x, "itemsEqual", js.Any.fromFunction2(value))
      
      inline def setItemsEqualUndefined: Self = StObject.set(x, "itemsEqual", js.undefined)
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: Any*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setNoResults(value: VdomNode): Self = StObject.set(x, "noResults", value.rawNode.asInstanceOf[js.Any])
      
      inline def setNoResultsNull: Self = StObject.set(x, "noResults", null)
      
      inline def setNoResultsUndefined: Self = StObject.set(x, "noResults", js.undefined)
      
      inline def setNoResultsVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "noResults", js.Array(value*))
      
      inline def setNoResultsVdomElement(value: VdomElement): Self = StObject.set(x, "noResults", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnActiveItemChange(value: (/* activeItem */ Any | Null, /* isCreateNewItem */ Boolean) => Callback): Self = StObject.set(x, "onActiveItemChange", js.Any.fromFunction2((t0: /* activeItem */ Any | Null, t1: /* isCreateNewItem */ Boolean) => (value(t0, t1)).runNow()))
      
      inline def setOnActiveItemChangeUndefined: Self = StObject.set(x, "onActiveItemChange", js.undefined)
      
      inline def setOnItemSelect(value: (/* item */ Any, /* event */ js.UndefOr[ReactEventFrom[HTMLElement]]) => Callback): Self = StObject.set(x, "onItemSelect", js.Any.fromFunction2((t0: /* item */ Any, t1: /* event */ js.UndefOr[ReactEventFrom[HTMLElement]]) => (value(t0, t1)).runNow()))
      
      inline def setOnItemSelectUndefined: Self = StObject.set(x, "onItemSelect", js.undefined)
      
      inline def setOnItemsPaste(value: /* items */ js.Array[Any] => Callback): Self = StObject.set(x, "onItemsPaste", js.Any.fromFunction1((t0: /* items */ js.Array[Any]) => value(t0).runNow()))
      
      inline def setOnItemsPasteUndefined: Self = StObject.set(x, "onItemsPaste", js.undefined)
      
      inline def setOnQueryChange(value: (/* query */ String, /* event */ js.UndefOr[ReactEventFrom[HTMLInputElement]]) => Callback): Self = StObject.set(x, "onQueryChange", js.Any.fromFunction2((t0: /* query */ String, t1: /* event */ js.UndefOr[ReactEventFrom[HTMLInputElement]]) => (value(t0, t1)).runNow()))
      
      inline def setOnQueryChangeUndefined: Self = StObject.set(x, "onQueryChange", js.undefined)
      
      inline def setOpenOnKeyDown(value: Boolean): Self = StObject.set(x, "openOnKeyDown", value.asInstanceOf[js.Any])
      
      inline def setOpenOnKeyDownUndefined: Self = StObject.set(x, "openOnKeyDown", js.undefined)
      
      inline def setPopoverProps(value: PartialIPopoverProps & js.Object): Self = StObject.set(x, "popoverProps", value.asInstanceOf[js.Any])
      
      inline def setPopoverPropsUndefined: Self = StObject.set(x, "popoverProps", js.undefined)
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setResetOnClose(value: Boolean): Self = StObject.set(x, "resetOnClose", value.asInstanceOf[js.Any])
      
      inline def setResetOnCloseUndefined: Self = StObject.set(x, "resetOnClose", js.undefined)
      
      inline def setResetOnQuery(value: Boolean): Self = StObject.set(x, "resetOnQuery", value.asInstanceOf[js.Any])
      
      inline def setResetOnQueryUndefined: Self = StObject.set(x, "resetOnQuery", js.undefined)
      
      inline def setResetOnSelect(value: Boolean): Self = StObject.set(x, "resetOnSelect", value.asInstanceOf[js.Any])
      
      inline def setResetOnSelectUndefined: Self = StObject.set(x, "resetOnSelect", js.undefined)
      
      inline def setScrollToActiveItem(value: Boolean): Self = StObject.set(x, "scrollToActiveItem", value.asInstanceOf[js.Any])
      
      inline def setScrollToActiveItemUndefined: Self = StObject.set(x, "scrollToActiveItem", js.undefined)
      
      inline def setSelectedItem(value: Any): Self = StObject.set(x, "selectedItem", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemNull: Self = StObject.set(x, "selectedItem", null)
      
      inline def setSelectedItemUndefined: Self = StObject.set(x, "selectedItem", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@blueprintjs/core.@blueprintjs/core.TagInputProps> */
  trait PartialTagInputProps extends StObject {
    
    var addOnBlur: js.UndefOr[Boolean] = js.undefined
    
    var addOnPaste: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var fill: js.UndefOr[Boolean] = js.undefined
    
    var inputProps: js.UndefOr[HTMLInputProps] = js.undefined
    
    var inputRef: js.UndefOr[Ref[HTMLInputElement]] = js.undefined
    
    var inputValue: js.UndefOr[String] = js.undefined
    
    var intent: js.UndefOr[Intent] = js.undefined
    
    var large: js.UndefOr[Boolean] = js.undefined
    
    var leftIcon: js.UndefOr[BlueprintIcons16Id | MaybeElement] = js.undefined
    
    var onAdd: js.UndefOr[
        js.Function2[/* values */ js.Array[String], /* method */ TagInputAddMethod, Boolean | Unit]
      ] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* values */ js.Array[Node], Boolean | Unit]] = js.undefined
    
    var onInputChange: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.undefined
    
    var onKeyDown: js.UndefOr[
        js.Function2[
          /* event */ ReactKeyboardEventFrom[HTMLElement], 
          /* index */ js.UndefOr[Double], 
          Unit
        ]
      ] = js.undefined
    
    var onKeyUp: js.UndefOr[
        js.Function2[
          /* event */ ReactKeyboardEventFrom[HTMLElement], 
          /* index */ js.UndefOr[Double], 
          Unit
        ]
      ] = js.undefined
    
    var onRemove: js.UndefOr[js.Function2[/* value */ Node, /* index */ Double, Unit]] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var rightElement: js.UndefOr[Element] = js.undefined
    
    var separator: js.UndefOr[String | js.RegExp | `false`] = js.undefined
    
    var tagProps: js.UndefOr[TagProps | (js.Function2[/* value */ Node, /* index */ Double, TagProps])] = js.undefined
    
    var values: js.UndefOr[js.Array[Node]] = js.undefined
  }
  object PartialTagInputProps {
    
    inline def apply(): PartialTagInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialTagInputProps]
    }
    
    extension [Self <: PartialTagInputProps](x: Self) {
      
      inline def setAddOnBlur(value: Boolean): Self = StObject.set(x, "addOnBlur", value.asInstanceOf[js.Any])
      
      inline def setAddOnBlurUndefined: Self = StObject.set(x, "addOnBlur", js.undefined)
      
      inline def setAddOnPaste(value: Boolean): Self = StObject.set(x, "addOnPaste", value.asInstanceOf[js.Any])
      
      inline def setAddOnPasteUndefined: Self = StObject.set(x, "addOnPaste", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setInputProps(value: HTMLInputProps): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
      
      inline def setInputPropsUndefined: Self = StObject.set(x, "inputProps", js.undefined)
      
      inline def setInputRef(value: Ref[HTMLInputElement]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
      
      inline def setInputRefFunction1(value: HTMLInputElement | Null => Callback): Self = StObject.set(x, "inputRef", js.Any.fromFunction1((t0: HTMLInputElement | Null) => value(t0).runNow()))
      
      inline def setInputRefNull: Self = StObject.set(x, "inputRef", null)
      
      inline def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
      
      inline def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
      
      inline def setInputValueUndefined: Self = StObject.set(x, "inputValue", js.undefined)
      
      inline def setIntent(value: Intent): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
      
      inline def setIntentUndefined: Self = StObject.set(x, "intent", js.undefined)
      
      inline def setLarge(value: Boolean): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
      
      inline def setLargeUndefined: Self = StObject.set(x, "large", js.undefined)
      
      inline def setLeftIcon(value: BlueprintIcons16Id | MaybeElement): Self = StObject.set(x, "leftIcon", value.asInstanceOf[js.Any])
      
      inline def setLeftIconNull: Self = StObject.set(x, "leftIcon", null)
      
      inline def setLeftIconUndefined: Self = StObject.set(x, "leftIcon", js.undefined)
      
      inline def setLeftIconVdomElement(value: VdomElement): Self = StObject.set(x, "leftIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnAdd(value: (/* values */ js.Array[String], /* method */ TagInputAddMethod) => Boolean | Unit): Self = StObject.set(x, "onAdd", js.Any.fromFunction2(value))
      
      inline def setOnAddUndefined: Self = StObject.set(x, "onAdd", js.undefined)
      
      inline def setOnChange(value: /* values */ js.Array[Node] => Boolean | Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnInputChange(value: ReactEventFrom[HTMLInputElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onInputChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnInputChangeUndefined: Self = StObject.set(x, "onInputChange", js.undefined)
      
      inline def setOnKeyDown(
        value: (/* event */ ReactKeyboardEventFrom[HTMLElement], /* index */ js.UndefOr[Double]) => Callback
      ): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction2((t0: /* event */ ReactKeyboardEventFrom[HTMLElement], t1: /* index */ js.UndefOr[Double]) => (value(t0, t1)).runNow()))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnKeyUp(
        value: (/* event */ ReactKeyboardEventFrom[HTMLElement], /* index */ js.UndefOr[Double]) => Callback
      ): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction2((t0: /* event */ ReactKeyboardEventFrom[HTMLElement], t1: /* index */ js.UndefOr[Double]) => (value(t0, t1)).runNow()))
      
      inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      inline def setOnRemove(value: (/* value */ Node, /* index */ Double) => Callback): Self = StObject.set(x, "onRemove", js.Any.fromFunction2((t0: /* value */ Node, t1: /* index */ Double) => (value(t0, t1)).runNow()))
      
      inline def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setRightElement(value: VdomElement): Self = StObject.set(x, "rightElement", value.rawElement.asInstanceOf[js.Any])
      
      inline def setRightElementUndefined: Self = StObject.set(x, "rightElement", js.undefined)
      
      inline def setSeparator(value: String | js.RegExp | `false`): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      inline def setTagProps(value: TagProps | (js.Function2[/* value */ Node, /* index */ Double, TagProps])): Self = StObject.set(x, "tagProps", value.asInstanceOf[js.Any])
      
      inline def setTagPropsFunction2(value: (/* value */ Node, /* index */ Double) => TagProps): Self = StObject.set(x, "tagProps", js.Any.fromFunction2(value))
      
      inline def setTagPropsUndefined: Self = StObject.set(x, "tagProps", js.undefined)
      
      inline def setValues(value: js.Array[Node]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      inline def setValuesVarargs(value: Node*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
  
  /* Inlined std.Readonly<{  children :react.react.ReactNode | undefined}> */
  trait ReadonlychildrenReactNode extends StObject {
    
    val children: js.UndefOr[Node] = js.undefined
  }
  object ReadonlychildrenReactNode {
    
    inline def apply(): ReadonlychildrenReactNode = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlychildrenReactNode]
    }
    
    extension [Self <: ReadonlychildrenReactNode](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  trait ResetOnQuery extends StObject {
    
    var disabled: Boolean
    
    var resetOnQuery: Boolean
  }
  object ResetOnQuery {
    
    inline def apply(disabled: Boolean, resetOnQuery: Boolean): ResetOnQuery = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], resetOnQuery = resetOnQuery.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResetOnQuery]
    }
    
    extension [Self <: ResetOnQuery](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setResetOnQuery(value: Boolean): Self = StObject.set(x, "resetOnQuery", value.asInstanceOf[js.Any])
    }
  }
}
