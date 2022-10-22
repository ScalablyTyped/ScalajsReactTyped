package typingsJapgolly.reactFloater

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.reactFloater.anon.CSSPropertieslengthnumber
import typingsJapgolly.reactFloater.anon.Offset
import typingsJapgolly.reactFloater.anon.ZIndex
import typingsJapgolly.reactFloater.libTypesPopperMod.PopperInstance
import typingsJapgolly.reactFloater.libTypesPopperMod.PopperModifiers
import typingsJapgolly.reactFloater.libTypesPopperMod.PopperPlacement
import typingsJapgolly.reactFloater.reactFloaterStrings.center
import typingsJapgolly.reactFloater.reactFloaterStrings.click
import typingsJapgolly.reactFloater.reactFloaterStrings.component
import typingsJapgolly.reactFloater.reactFloaterStrings.content
import typingsJapgolly.reactFloater.reactFloaterStrings.floater
import typingsJapgolly.reactFloater.reactFloaterStrings.hover
import typingsJapgolly.reactFloater.reactFloaterStrings.wrapper
import typingsJapgolly.std.Record
import typingsJapgolly.typeFest.sourcePartialDeepMod.PartialDeep
import typingsJapgolly.typeFest.sourceRequireExactlyOneMod.RequireExactlyOne
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactFloater.reactFloaterStrings.open
    - typingsJapgolly.reactFloater.reactFloaterStrings.close
  */
  trait Action extends StObject
  object Action {
    
    inline def close: typingsJapgolly.reactFloater.reactFloaterStrings.close = "close".asInstanceOf[typingsJapgolly.reactFloater.reactFloaterStrings.close]
    
    inline def open: typingsJapgolly.reactFloater.reactFloaterStrings.open = "open".asInstanceOf[typingsJapgolly.reactFloater.reactFloaterStrings.open]
  }
  
  trait BaseProps extends StObject {
    
    /**
      * Open the Floater automatically.
      * @default false
      */
    var autoOpen: js.UndefOr[Boolean] = js.undefined
    
    var callback: js.UndefOr[js.Function2[/* action */ Action, /* props */ Props, Unit]] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    /**
      * A React element or function to be used as the custom UI for the Floater.
      * The prop closeFloater will be available in your component.
      */
    var component: FunctionComponent[RenderProps] | Element
    
    var content: Node
    
    /**
      * Log some actions.
      * @default false
      */
    var debug: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Disable placement adjustments on scroll/resize.
      * @default false
      */
    var disableFlip: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Disable the conversion of hover to click on mobile.
      * @default false
      */
    var disableHoverToClick: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The event type that will trigger the Floater.
      * Unused in controlled mode.
      * @default click
      */
    var event: js.UndefOr[click | hover] = js.undefined
    
    /**
      *  The amount of time (in seconds) that the floater should wait after a mouseLeave event before hiding.
      *  Only valid for event type hover.
      *  @default 0.4
      *  */
    var eventDelay: js.UndefOr[Double] = js.undefined
    
    var footer: js.UndefOr[Node] = js.undefined
    
    var getPopper: js.UndefOr[js.Function2[/* popper */ PopperInstance, /* origin */ floater | wrapper, Unit]] = js.undefined
    
    /**
      * Hide the arrow.
      * @default false
      */
    var hideArrow: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var modifiers: js.UndefOr[PopperModifiers] = js.undefined
    
    /**
      * The distance between the target and the Floater in pixels.
      * @default 15
      */
    var offset: js.UndefOr[Double] = js.undefined
    
    var open: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The placement of the Floater
      * This will be updated automatically if there's no space available unless the "disableFlip" is set to true
      * @default bottom
      */
    var placement: js.UndefOr[PlacementOptions] = js.undefined
    
    var portalElement: js.UndefOr[SelectorOrElement] = js.undefined
    
    /**
      * Show a button to close the Floater.
      * @default false
      */
    var showCloseButton: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var styles: js.UndefOr[PartialDeep[Styles, js.Object]] = js.undefined
    
    var target: js.UndefOr[SelectorOrElement] = js.undefined
    
    var title: js.UndefOr[Node] = js.undefined
    
    var wrapperOptions: js.UndefOr[Offset] = js.undefined
  }
  object BaseProps {
    
    inline def apply(component: FunctionComponent[RenderProps] | Element): BaseProps = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], content = null)
      __obj.asInstanceOf[BaseProps]
    }
    
    extension [Self <: BaseProps](x: Self) {
      
      inline def setAutoOpen(value: Boolean): Self = StObject.set(x, "autoOpen", value.asInstanceOf[js.Any])
      
      inline def setAutoOpenUndefined: Self = StObject.set(x, "autoOpen", js.undefined)
      
      inline def setCallback(value: (/* action */ Action, /* props */ Props) => Callback): Self = StObject.set(x, "callback", js.Any.fromFunction2((t0: /* action */ Action, t1: /* props */ Props) => (value(t0, t1)).runNow()))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setComponent(value: FunctionComponent[RenderProps] | Element): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentVdomElement(value: VdomElement): Self = StObject.set(x, "component", value.rawElement.asInstanceOf[js.Any])
      
      inline def setContent(value: VdomNode): Self = StObject.set(x, "content", value.rawNode.asInstanceOf[js.Any])
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
      
      inline def setContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setContentVdomElement(value: VdomElement): Self = StObject.set(x, "content", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDisableFlip(value: Boolean): Self = StObject.set(x, "disableFlip", value.asInstanceOf[js.Any])
      
      inline def setDisableFlipUndefined: Self = StObject.set(x, "disableFlip", js.undefined)
      
      inline def setDisableHoverToClick(value: Boolean): Self = StObject.set(x, "disableHoverToClick", value.asInstanceOf[js.Any])
      
      inline def setDisableHoverToClickUndefined: Self = StObject.set(x, "disableHoverToClick", js.undefined)
      
      inline def setEvent(value: click | hover): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventDelay(value: Double): Self = StObject.set(x, "eventDelay", value.asInstanceOf[js.Any])
      
      inline def setEventDelayUndefined: Self = StObject.set(x, "eventDelay", js.undefined)
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setFooter(value: VdomNode): Self = StObject.set(x, "footer", value.rawNode.asInstanceOf[js.Any])
      
      inline def setFooterNull: Self = StObject.set(x, "footer", null)
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setFooterVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "footer", js.Array(value*))
      
      inline def setFooterVdomElement(value: VdomElement): Self = StObject.set(x, "footer", value.rawElement.asInstanceOf[js.Any])
      
      inline def setGetPopper(value: (/* popper */ PopperInstance, /* origin */ floater | wrapper) => Callback): Self = StObject.set(x, "getPopper", js.Any.fromFunction2((t0: /* popper */ PopperInstance, t1: /* origin */ floater | wrapper) => (value(t0, t1)).runNow()))
      
      inline def setGetPopperUndefined: Self = StObject.set(x, "getPopper", js.undefined)
      
      inline def setHideArrow(value: Boolean): Self = StObject.set(x, "hideArrow", value.asInstanceOf[js.Any])
      
      inline def setHideArrowUndefined: Self = StObject.set(x, "hideArrow", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setModifiers(value: PopperModifiers): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setPlacement(value: PlacementOptions): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setPortalElement(value: SelectorOrElement): Self = StObject.set(x, "portalElement", value.asInstanceOf[js.Any])
      
      inline def setPortalElementNull: Self = StObject.set(x, "portalElement", null)
      
      inline def setPortalElementUndefined: Self = StObject.set(x, "portalElement", js.undefined)
      
      inline def setShowCloseButton(value: Boolean): Self = StObject.set(x, "showCloseButton", value.asInstanceOf[js.Any])
      
      inline def setShowCloseButtonUndefined: Self = StObject.set(x, "showCloseButton", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStyles(value: PartialDeep[Styles, js.Object]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTarget(value: SelectorOrElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetNull: Self = StObject.set(x, "target", null)
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTitle(value: VdomNode): Self = StObject.set(x, "title", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "title", js.Array(value*))
      
      inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
      
      inline def setWrapperOptions(value: Offset): Self = StObject.set(x, "wrapperOptions", value.asInstanceOf[js.Any])
      
      inline def setWrapperOptionsUndefined: Self = StObject.set(x, "wrapperOptions", js.undefined)
    }
  }
  
  trait CustomComponent extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var closeFn: HandlerFunction[HTMLElement]
  }
  object CustomComponent {
    
    inline def apply(closeFn: /* event */ ReactEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): CustomComponent = {
      val __obj = js.Dynamic.literal(closeFn = js.Any.fromFunction1((t0: /* event */ ReactEventFrom[HTMLElement & org.scalajs.dom.Element]) => closeFn(t0).runNow()))
      __obj.asInstanceOf[CustomComponent]
    }
    
    extension [Self <: CustomComponent](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setCloseFn(value: /* event */ ReactEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "closeFn", js.Any.fromFunction1((t0: /* event */ ReactEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    }
  }
  
  type HandlerFunction[T] = js.Function1[/* event */ ReactEventFrom[T & org.scalajs.dom.Element], Unit]
  
  trait LogOptions extends StObject {
    
    var data: Any
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var title: String
  }
  object LogOptions {
    
    inline def apply(data: Any, title: String): LogOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogOptions]
    }
    
    extension [Self <: LogOptions](x: Self) {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  type PlacementOptions = PopperPlacement | center
  
  type PlainObject[T] = Record[String, T]
  
  type Props = RequireExactlyOne[BaseProps, content | component]
  
  trait RenderProps extends StObject {
    
    var closeFn: HandlerFunction[HTMLElement]
  }
  object RenderProps {
    
    inline def apply(closeFn: /* event */ ReactEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): RenderProps = {
      val __obj = js.Dynamic.literal(closeFn = js.Any.fromFunction1((t0: /* event */ ReactEventFrom[HTMLElement & org.scalajs.dom.Element]) => closeFn(t0).runNow()))
      __obj.asInstanceOf[RenderProps]
    }
    
    extension [Self <: RenderProps](x: Self) {
      
      inline def setCloseFn(value: /* event */ ReactEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "closeFn", js.Any.fromFunction1((t0: /* event */ ReactEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    }
  }
  
  type SelectorOrElement = String | Null | HTMLElement
  
  trait State extends StObject {
    
    var currentPlacement: PlacementOptions
    
    var positionWrapper: Boolean
    
    var status: Statuses
    
    var statusWrapper: Statuses
  }
  object State {
    
    inline def apply(
      currentPlacement: PlacementOptions,
      positionWrapper: Boolean,
      status: Statuses,
      statusWrapper: Statuses
    ): State = {
      val __obj = js.Dynamic.literal(currentPlacement = currentPlacement.asInstanceOf[js.Any], positionWrapper = positionWrapper.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusWrapper = statusWrapper.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setCurrentPlacement(value: PlacementOptions): Self = StObject.set(x, "currentPlacement", value.asInstanceOf[js.Any])
      
      inline def setPositionWrapper(value: Boolean): Self = StObject.set(x, "positionWrapper", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Statuses): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusWrapper(value: Statuses): Self = StObject.set(x, "statusWrapper", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined type-fest.type-fest.ValueOf<{ readonly INIT :'init',  readonly IDLE :'idle',  readonly RENDER :'render',  readonly OPENING :'opening',  readonly OPEN :'open',  readonly CLOSING :'closing',  readonly ERROR :'error'}, keyof { readonly INIT :'init',  readonly IDLE :'idle',  readonly RENDER :'render',  readonly OPENING :'opening',  readonly OPEN :'open',  readonly CLOSING :'closing',  readonly ERROR :'error'}> */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactFloater.reactFloaterStrings.idle
    - typingsJapgolly.reactFloater.reactFloaterStrings.opening
    - typingsJapgolly.reactFloater.reactFloaterStrings.render
    - typingsJapgolly.reactFloater.reactFloaterStrings.closing
    - typingsJapgolly.reactFloater.reactFloaterStrings.open
    - typingsJapgolly.reactFloater.reactFloaterStrings.init
    - typingsJapgolly.reactFloater.reactFloaterStrings.error
  */
  trait Statuses extends StObject
  object Statuses {
    
    inline def closing: typingsJapgolly.reactFloater.reactFloaterStrings.closing = "closing".asInstanceOf[typingsJapgolly.reactFloater.reactFloaterStrings.closing]
    
    inline def error: typingsJapgolly.reactFloater.reactFloaterStrings.error = "error".asInstanceOf[typingsJapgolly.reactFloater.reactFloaterStrings.error]
    
    inline def idle: typingsJapgolly.reactFloater.reactFloaterStrings.idle = "idle".asInstanceOf[typingsJapgolly.reactFloater.reactFloaterStrings.idle]
    
    inline def init: typingsJapgolly.reactFloater.reactFloaterStrings.init = "init".asInstanceOf[typingsJapgolly.reactFloater.reactFloaterStrings.init]
    
    inline def open: typingsJapgolly.reactFloater.reactFloaterStrings.open = "open".asInstanceOf[typingsJapgolly.reactFloater.reactFloaterStrings.open]
    
    inline def opening: typingsJapgolly.reactFloater.reactFloaterStrings.opening = "opening".asInstanceOf[typingsJapgolly.reactFloater.reactFloaterStrings.opening]
    
    inline def render: typingsJapgolly.reactFloater.reactFloaterStrings.render = "render".asInstanceOf[typingsJapgolly.reactFloater.reactFloaterStrings.render]
  }
  
  trait Styles extends StObject {
    
    var arrow: CSSPropertieslengthnumber
    
    var close: CSSProperties
    
    var container: CSSProperties
    
    var content: CSSProperties
    
    var floater: CSSProperties
    
    var floaterCentered: CSSProperties
    
    var floaterClosing: CSSProperties
    
    var floaterOpening: CSSProperties
    
    var floaterWithAnimation: CSSProperties
    
    var floaterWithComponent: CSSProperties
    
    var footer: CSSProperties
    
    var options: ZIndex
    
    var title: CSSProperties
    
    var wrapper: CSSProperties
    
    var wrapperPosition: CSSProperties
  }
  object Styles {
    
    inline def apply(
      arrow: CSSPropertieslengthnumber,
      close: CSSProperties,
      container: CSSProperties,
      content: CSSProperties,
      floater: CSSProperties,
      floaterCentered: CSSProperties,
      floaterClosing: CSSProperties,
      floaterOpening: CSSProperties,
      floaterWithAnimation: CSSProperties,
      floaterWithComponent: CSSProperties,
      footer: CSSProperties,
      options: ZIndex,
      title: CSSProperties,
      wrapper: CSSProperties,
      wrapperPosition: CSSProperties
    ): Styles = {
      val __obj = js.Dynamic.literal(arrow = arrow.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], floater = floater.asInstanceOf[js.Any], floaterCentered = floaterCentered.asInstanceOf[js.Any], floaterClosing = floaterClosing.asInstanceOf[js.Any], floaterOpening = floaterOpening.asInstanceOf[js.Any], floaterWithAnimation = floaterWithAnimation.asInstanceOf[js.Any], floaterWithComponent = floaterWithComponent.asInstanceOf[js.Any], footer = footer.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any], wrapperPosition = wrapperPosition.asInstanceOf[js.Any])
      __obj.asInstanceOf[Styles]
    }
    
    extension [Self <: Styles](x: Self) {
      
      inline def setArrow(value: CSSPropertieslengthnumber): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
      
      inline def setClose(value: CSSProperties): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setContainer(value: CSSProperties): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContent(value: CSSProperties): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setFloater(value: CSSProperties): Self = StObject.set(x, "floater", value.asInstanceOf[js.Any])
      
      inline def setFloaterCentered(value: CSSProperties): Self = StObject.set(x, "floaterCentered", value.asInstanceOf[js.Any])
      
      inline def setFloaterClosing(value: CSSProperties): Self = StObject.set(x, "floaterClosing", value.asInstanceOf[js.Any])
      
      inline def setFloaterOpening(value: CSSProperties): Self = StObject.set(x, "floaterOpening", value.asInstanceOf[js.Any])
      
      inline def setFloaterWithAnimation(value: CSSProperties): Self = StObject.set(x, "floaterWithAnimation", value.asInstanceOf[js.Any])
      
      inline def setFloaterWithComponent(value: CSSProperties): Self = StObject.set(x, "floaterWithComponent", value.asInstanceOf[js.Any])
      
      inline def setFooter(value: CSSProperties): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: ZIndex): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: CSSProperties): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setWrapper(value: CSSProperties): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
      
      inline def setWrapperPosition(value: CSSProperties): Self = StObject.set(x, "wrapperPosition", value.asInstanceOf[js.Any])
    }
  }
  
  object global {
    
    trait Window extends StObject {
      
      var ReactFloaterDebug: js.UndefOr[Boolean] = js.undefined
    }
    object Window {
      
      inline def apply(): Window = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Window]
      }
      
      extension [Self <: Window](x: Self) {
        
        inline def setReactFloaterDebug(value: Boolean): Self = StObject.set(x, "ReactFloaterDebug", value.asInstanceOf[js.Any])
        
        inline def setReactFloaterDebugUndefined: Self = StObject.set(x, "ReactFloaterDebug", js.undefined)
      }
    }
  }
}
