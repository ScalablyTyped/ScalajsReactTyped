package typingsJapgolly.blueprintjsPopover2.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.blueprintjsCore.libEsmComponentsPopoverPopoverSharedPropsMod.PopoverPosition
import typingsJapgolly.blueprintjsPopover2.libEsmPopover2Mod.IPopover2Props
import typingsJapgolly.blueprintjsPopover2.libEsmPopover2Mod.Popover2InteractionKind
import typingsJapgolly.blueprintjsPopover2.libEsmPopover2SharedPropsMod.Popover2TargetProps
import typingsJapgolly.blueprintjsPopover2.libEsmPopupKindMod.PopupKind
import typingsJapgolly.react.mod.HTMLProps
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Popover2 {
  
  inline def apply[T](): Builder[T] = {
    val __props = js.Dynamic.literal()
    new Builder[T](js.Array(this.component, __props.asInstanceOf[IPopover2Props[T]]))
  }
  
  @JSImport("@blueprintjs/popover2", "Popover2")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[T] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.blueprintjsPopover2.mod.Popover2[T]] {
    
    inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def backdropProps(value: HTMLProps[HTMLDivElement]): this.type = set("backdropProps", value.asInstanceOf[js.Any])
    
    inline def boundary(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Boundary */ Any
    ): this.type = set("boundary", value.asInstanceOf[js.Any])
    
    inline def canEscapeKeyClose(value: Boolean): this.type = set("canEscapeKeyClose", value.asInstanceOf[js.Any])
    
    inline def captureDismiss(value: Boolean): this.type = set("captureDismiss", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def content(value: String | Element): this.type = set("content", value.asInstanceOf[js.Any])
    
    inline def contentVdomElement(value: VdomElement): this.type = set("content", value.rawElement.asInstanceOf[js.Any])
    
    inline def defaultIsOpen(value: Boolean): this.type = set("defaultIsOpen", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def enforceFocus(value: Boolean): this.type = set("enforceFocus", value.asInstanceOf[js.Any])
    
    inline def fill(value: Boolean): this.type = set("fill", value.asInstanceOf[js.Any])
    
    inline def hasBackdrop(value: Boolean): this.type = set("hasBackdrop", value.asInstanceOf[js.Any])
    
    inline def hoverCloseDelay(value: Double): this.type = set("hoverCloseDelay", value.asInstanceOf[js.Any])
    
    inline def hoverOpenDelay(value: Double): this.type = set("hoverOpenDelay", value.asInstanceOf[js.Any])
    
    inline def inheritDarkTheme(value: Boolean): this.type = set("inheritDarkTheme", value.asInstanceOf[js.Any])
    
    inline def interactionKind(value: Popover2InteractionKind): this.type = set("interactionKind", value.asInstanceOf[js.Any])
    
    inline def isOpen(value: Boolean): this.type = set("isOpen", value.asInstanceOf[js.Any])
    
    inline def `lazy`(value: Boolean): this.type = set("lazy", value.asInstanceOf[js.Any])
    
    inline def matchTargetWidth(value: Boolean): this.type = set("matchTargetWidth", value.asInstanceOf[js.Any])
    
    inline def minimal(value: Boolean): this.type = set("minimal", value.asInstanceOf[js.Any])
    
    inline def modifiers(
      value: Partial[
          /* import warning: importer.ImportType#apply Failed type conversion: {[ M in @blueprintjs/popover2.@blueprintjs/popover2/lib/esm/popover2SharedProps.StrictModifierNames ]: std.Partial<std.Omit<react-popper.react-popper.StrictModifier<M>, 'name'>>} */ js.Any
        ]
    ): this.type = set("modifiers", value.asInstanceOf[js.Any])
    
    inline def modifiersCustom(
      value: js.Array[
          Partial[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Modifier<any, object> */ Any
          ]
        ]
    ): this.type = set("modifiersCustom", value.asInstanceOf[js.Any])
    
    inline def modifiersCustomVarargs(
      value: (Partial[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Modifier<any, object> */ Any
        ])*
    ): this.type = set("modifiersCustom", js.Array(value*))
    
    inline def onClose(value: /* event */ ReactEventFrom[HTMLElement] => Callback): this.type = set("onClose", js.Any.fromFunction1((t0: /* event */ ReactEventFrom[HTMLElement]) => value(t0).runNow()))
    
    inline def onClosed(value: /* node */ HTMLElement => Callback): this.type = set("onClosed", js.Any.fromFunction1((t0: /* node */ HTMLElement) => value(t0).runNow()))
    
    inline def onClosing(value: /* node */ HTMLElement => Callback): this.type = set("onClosing", js.Any.fromFunction1((t0: /* node */ HTMLElement) => value(t0).runNow()))
    
    inline def onInteraction(value: (/* nextOpenState */ Boolean, /* e */ js.UndefOr[ReactEventFrom[HTMLElement]]) => Callback): this.type = set("onInteraction", js.Any.fromFunction2((t0: /* nextOpenState */ Boolean, t1: /* e */ js.UndefOr[ReactEventFrom[HTMLElement]]) => (value(t0, t1)).runNow()))
    
    inline def onOpened(value: /* node */ HTMLElement => Callback): this.type = set("onOpened", js.Any.fromFunction1((t0: /* node */ HTMLElement) => value(t0).runNow()))
    
    inline def onOpening(value: /* node */ HTMLElement => Callback): this.type = set("onOpening", js.Any.fromFunction1((t0: /* node */ HTMLElement) => value(t0).runNow()))
    
    inline def openOnTargetFocus(value: Boolean): this.type = set("openOnTargetFocus", value.asInstanceOf[js.Any])
    
    inline def placement(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Placement */ Any
    ): this.type = set("placement", value.asInstanceOf[js.Any])
    
    inline def popoverClassName(value: String): this.type = set("popoverClassName", value.asInstanceOf[js.Any])
    
    inline def popoverRef(value: Ref[HTMLElement]): this.type = set("popoverRef", value.asInstanceOf[js.Any])
    
    inline def popoverRefFunction1(value: HTMLElement | Null => Callback): this.type = set("popoverRef", js.Any.fromFunction1((t0: HTMLElement | Null) => value(t0).runNow()))
    
    inline def popoverRefNull: this.type = set("popoverRef", null)
    
    inline def popupKind(value: PopupKind): this.type = set("popupKind", value.asInstanceOf[js.Any])
    
    inline def portalClassName(value: String): this.type = set("portalClassName", value.asInstanceOf[js.Any])
    
    inline def portalContainer(value: HTMLElement): this.type = set("portalContainer", value.asInstanceOf[js.Any])
    
    inline def position(value: PopoverPosition): this.type = set("position", value.asInstanceOf[js.Any])
    
    inline def positioningStrategy(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PositioningStrategy */ Any
    ): this.type = set("positioningStrategy", value.asInstanceOf[js.Any])
    
    inline def renderTarget(value: /* props */ Popover2TargetProps & T => Element): this.type = set("renderTarget", js.Any.fromFunction1(value))
    
    inline def rootBoundary(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RootBoundary */ Any
    ): this.type = set("rootBoundary", value.asInstanceOf[js.Any])
    
    inline def shouldReturnFocusOnClose(value: Boolean): this.type = set("shouldReturnFocusOnClose", value.asInstanceOf[js.Any])
    
    inline def targetTagName(
      value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176, starting with typingsJapgolly.blueprintjsPopover2.blueprintjsPopover2Strings.a, typingsJapgolly.blueprintjsPopover2.blueprintjsPopover2Strings.abbr, typingsJapgolly.blueprintjsPopover2.blueprintjsPopover2Strings.address */ Any
    ): this.type = set("targetTagName", value.asInstanceOf[js.Any])
    
    inline def transitionDuration(value: Double): this.type = set("transitionDuration", value.asInstanceOf[js.Any])
    
    inline def usePortal(value: Boolean): this.type = set("usePortal", value.asInstanceOf[js.Any])
  }
  
  implicit def make[T](companion: Popover2.type): Builder[T] = new Builder[T](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps[T](p: IPopover2Props[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
