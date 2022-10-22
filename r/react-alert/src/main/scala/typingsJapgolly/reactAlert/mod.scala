package typingsJapgolly.reactAlert

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.Context
import typingsJapgolly.reactAlert.anon.Margin
import typingsJapgolly.reactAlert.reactAlertStrings.`bottom center`
import typingsJapgolly.reactAlert.reactAlertStrings.`bottom left`
import typingsJapgolly.reactAlert.reactAlertStrings.`bottom right`
import typingsJapgolly.reactAlert.reactAlertStrings.`middle left`
import typingsJapgolly.reactAlert.reactAlertStrings.`middle right`
import typingsJapgolly.reactAlert.reactAlertStrings.`top center`
import typingsJapgolly.reactAlert.reactAlertStrings.`top left`
import typingsJapgolly.reactAlert.reactAlertStrings.`top right`
import typingsJapgolly.reactAlert.reactAlertStrings.alert
import typingsJapgolly.reactAlert.reactAlertStrings.error
import typingsJapgolly.reactAlert.reactAlertStrings.fade
import typingsJapgolly.reactAlert.reactAlertStrings.info
import typingsJapgolly.reactAlert.reactAlertStrings.middle
import typingsJapgolly.reactAlert.reactAlertStrings.scale
import typingsJapgolly.reactAlert.reactAlertStrings.success
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-alert", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-alert", "Provider")
  @js.native
  open class Provider protected ()
    extends Component[AlertProviderProps, js.Object, Any] {
    def this(props: AlertProviderProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: AlertProviderProps, context: Any) = this()
  }
  
  @JSImport("react-alert", "positions")
  @js.native
  val positions: Positions_ = js.native
  
  @JSImport("react-alert", "transitions")
  @js.native
  val transitions: Transitions_ = js.native
  
  @JSImport("react-alert", "types")
  @js.native
  val types: Types_ = js.native
  
  inline def useAlert[T /* <: AlertContainer */](): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useAlert")().asInstanceOf[T]
  inline def useAlert[T /* <: AlertContainer */](context: Context[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useAlert")(context.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def withAlert[P /* <: InjectedAlertProps */](): js.Function1[/* c */ ComponentType[P], ComponentType[Omit[P, alert]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withAlert")().asInstanceOf[js.Function1[/* c */ ComponentType[P], ComponentType[Omit[P, alert]]]]
  
  inline def withAlert_alert[P /* <: InjectedAlertProps */](
    context: Context[
      /* import warning: importer.ImportType#apply Failed type conversion: P['alert'] */ js.Any
    ]
  ): js.Function1[/* c */ ComponentType[P], ComponentType[Omit[P, alert]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withAlert")(context.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* c */ ComponentType[P], ComponentType[Omit[P, alert]]]]
  
  type AlertContainer = AlertContainerFactory[AlertCustomOptions]
  
  @js.native
  trait AlertContainerFactory[T] extends StObject {
    
    def error(): AlertInstance = js.native
    def error(message: Node): AlertInstance = js.native
    def error(message: Node, options: T): AlertInstance = js.native
    def error(message: Unit, options: T): AlertInstance = js.native
    
    def info(): AlertInstance = js.native
    def info(message: Node): AlertInstance = js.native
    def info(message: Node, options: T): AlertInstance = js.native
    def info(message: Unit, options: T): AlertInstance = js.native
    
    def remove(alert: AlertInstance): Unit = js.native
    
    def removeAll(): Unit = js.native
    
    def show(): AlertInstance = js.native
    def show(message: Node): AlertInstance = js.native
    def show(message: Node, options: T): AlertInstance = js.native
    def show(message: Unit, options: T): AlertInstance = js.native
    
    def success(): AlertInstance = js.native
    def success(message: Node): AlertInstance = js.native
    def success(message: Node, options: T): AlertInstance = js.native
    def success(message: Unit, options: T): AlertInstance = js.native
  }
  
  trait AlertCustomOptions
    extends StObject
       with AlertOptions {
    
    /**
      * Callback that will be executed after this alert is removed.
      */
    var onClose: js.UndefOr[js.Function0[js.UndefOr[Unit]]] = js.undefined
    
    /**
      * Callback that will be executed after this alert open.
      */
    var onOpen: js.UndefOr[js.Function0[js.UndefOr[Unit]]] = js.undefined
  }
  object AlertCustomOptions {
    
    inline def apply(): AlertCustomOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlertCustomOptions]
    }
    
    extension [Self <: AlertCustomOptions](x: Self) {
      
      inline def setOnClose(value: CallbackTo[js.UndefOr[Unit]]): Self = StObject.set(x, "onClose", value.toJsFn)
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnOpen(value: CallbackTo[js.UndefOr[Unit]]): Self = StObject.set(x, "onOpen", value.toJsFn)
      
      inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
    }
  }
  
  trait AlertInstance extends StObject {
    
    /**
      * A function that closes the alert.
      */
    def close(): Unit
    
    var id: Double
    
    /**
      * The alert message.
      */
    var message: Node
    
    var options: AlertOptions
  }
  object AlertInstance {
    
    inline def apply(close: Callback, id: Double, options: AlertOptions): AlertInstance = {
      val __obj = js.Dynamic.literal(close = close.toJsFn, id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], message = null)
      __obj.asInstanceOf[AlertInstance]
    }
    
    extension [Self <: AlertInstance](x: Self) {
      
      inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: VdomNode): Self = StObject.set(x, "message", value.rawNode.asInstanceOf[js.Any])
      
      inline def setMessageNull: Self = StObject.set(x, "message", null)
      
      inline def setMessageVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "message", js.Array(value*))
      
      inline def setMessageVdomElement(value: VdomElement): Self = StObject.set(x, "message", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOptions(value: AlertOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  trait AlertOptions extends StObject {
    
    /**
      * Style to be applied in the alerts container.
      *
      * Default: {
      *   zIndex: 100,
      * }
      */
    var containerStyle: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * The margin of each alert.
      *
      * Default: '10px'
      */
    var offset: js.UndefOr[String] = js.undefined
    
    /**
      * The position of the alerts in the page.
      *
      * Default: positions.TOP_CENTER
      */
    var position: js.UndefOr[AlertPosition] = js.undefined
    
    /**
      * Timeout to alert remove itself, if set to 0 it never removes itself.
      *
      * Default: 0
      */
    var timeout: js.UndefOr[Double] = js.undefined
    
    /**
      * The transition animation.
      *
      * Default: transitions.FADE
      */
    var transition: js.UndefOr[AlertTransition] = js.undefined
    
    /**
      * The default alert type used when calling this.props.alert.show.
      *
      * Default: types.INFO
      */
    var `type`: js.UndefOr[AlertType] = js.undefined
  }
  object AlertOptions {
    
    inline def apply(): AlertOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlertOptions]
    }
    
    extension [Self <: AlertOptions](x: Self) {
      
      inline def setContainerStyle(value: CSSProperties): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
      
      inline def setOffset(value: String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setPosition(value: AlertPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setTransition(value: AlertTransition): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
      
      inline def setType(value: AlertType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactAlert.reactAlertStrings.`middle left`
    - typingsJapgolly.reactAlert.reactAlertStrings.middle
    - typingsJapgolly.reactAlert.reactAlertStrings.`middle right`
    - typingsJapgolly.reactAlert.reactAlertStrings.`top left`
    - typingsJapgolly.reactAlert.reactAlertStrings.`top center`
    - typingsJapgolly.reactAlert.reactAlertStrings.`top right`
    - typingsJapgolly.reactAlert.reactAlertStrings.`bottom left`
    - typingsJapgolly.reactAlert.reactAlertStrings.`bottom center`
    - typingsJapgolly.reactAlert.reactAlertStrings.`bottom right`
  */
  trait AlertPosition extends StObject
  object AlertPosition {
    
    inline def `bottom center`: typingsJapgolly.reactAlert.reactAlertStrings.`bottom center` = ("bottom center").asInstanceOf[typingsJapgolly.reactAlert.reactAlertStrings.`bottom center`]
    
    inline def `bottom left`: typingsJapgolly.reactAlert.reactAlertStrings.`bottom left` = ("bottom left").asInstanceOf[typingsJapgolly.reactAlert.reactAlertStrings.`bottom left`]
    
    inline def `bottom right`: typingsJapgolly.reactAlert.reactAlertStrings.`bottom right` = ("bottom right").asInstanceOf[typingsJapgolly.reactAlert.reactAlertStrings.`bottom right`]
    
    inline def middle: typingsJapgolly.reactAlert.reactAlertStrings.middle = "middle".asInstanceOf[typingsJapgolly.reactAlert.reactAlertStrings.middle]
    
    inline def `middle left`: typingsJapgolly.reactAlert.reactAlertStrings.`middle left` = ("middle left").asInstanceOf[typingsJapgolly.reactAlert.reactAlertStrings.`middle left`]
    
    inline def `middle right`: typingsJapgolly.reactAlert.reactAlertStrings.`middle right` = ("middle right").asInstanceOf[typingsJapgolly.reactAlert.reactAlertStrings.`middle right`]
    
    inline def `top center`: typingsJapgolly.reactAlert.reactAlertStrings.`top center` = ("top center").asInstanceOf[typingsJapgolly.reactAlert.reactAlertStrings.`top center`]
    
    inline def `top left`: typingsJapgolly.reactAlert.reactAlertStrings.`top left` = ("top left").asInstanceOf[typingsJapgolly.reactAlert.reactAlertStrings.`top left`]
    
    inline def `top right`: typingsJapgolly.reactAlert.reactAlertStrings.`top right` = ("top right").asInstanceOf[typingsJapgolly.reactAlert.reactAlertStrings.`top right`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactAlert.reactAlertStrings.`top left`
    - typingsJapgolly.reactAlert.reactAlertStrings.`top center`
    - typingsJapgolly.reactAlert.reactAlertStrings.`top right`
    - typingsJapgolly.reactAlert.reactAlertStrings.`bottom left`
    - typingsJapgolly.reactAlert.reactAlertStrings.`bottom center`
    - typingsJapgolly.reactAlert.reactAlertStrings.`bottom right`
  */
  trait AlertPositionV4 extends StObject
  object AlertPositionV4 {
    
    inline def `bottom center`: typingsJapgolly.reactAlert.reactAlertStrings.`bottom center` = ("bottom center").asInstanceOf[typingsJapgolly.reactAlert.reactAlertStrings.`bottom center`]
    
    inline def `bottom left`: typingsJapgolly.reactAlert.reactAlertStrings.`bottom left` = ("bottom left").asInstanceOf[typingsJapgolly.reactAlert.reactAlertStrings.`bottom left`]
    
    inline def `bottom right`: typingsJapgolly.reactAlert.reactAlertStrings.`bottom right` = ("bottom right").asInstanceOf[typingsJapgolly.reactAlert.reactAlertStrings.`bottom right`]
    
    inline def `top center`: typingsJapgolly.reactAlert.reactAlertStrings.`top center` = ("top center").asInstanceOf[typingsJapgolly.reactAlert.reactAlertStrings.`top center`]
    
    inline def `top left`: typingsJapgolly.reactAlert.reactAlertStrings.`top left` = ("top left").asInstanceOf[typingsJapgolly.reactAlert.reactAlertStrings.`top left`]
    
    inline def `top right`: typingsJapgolly.reactAlert.reactAlertStrings.`top right` = ("top right").asInstanceOf[typingsJapgolly.reactAlert.reactAlertStrings.`top right`]
  }
  
  trait AlertProviderProps
    extends StObject
       with AlertOptions {
    
    /**
      * Explicit children for future @types/react.
      *
      * See: https://github.com/DefinitelyTyped/DefinitelyTyped/pull/59306.
      */
    var children: js.UndefOr[Node] = js.undefined
    
    var context: js.UndefOr[Context[AlertContainer]] = js.undefined
    
    /**
      * The alert template to be used.
      */
    var template: ComponentType[AlertTemplateProps]
  }
  object AlertProviderProps {
    
    inline def apply(template: ComponentType[AlertTemplateProps]): AlertProviderProps = {
      val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
      __obj.asInstanceOf[AlertProviderProps]
    }
    
    extension [Self <: AlertProviderProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setContext(value: Context[AlertContainer]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setTemplate(value: ComponentType[AlertTemplateProps]): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Omit<react-alert.react-alert.AlertInstance, 'id'> */
  trait AlertTemplateProps extends StObject {
    
    var close: js.Function0[Unit]
    
    var message: Node
    
    var options: AlertOptions
    
    /**
      * The style contains only the margin given as offset.
      */
    var style: Margin
  }
  object AlertTemplateProps {
    
    inline def apply(close: Callback, options: AlertOptions, style: Margin): AlertTemplateProps = {
      val __obj = js.Dynamic.literal(close = close.toJsFn, options = options.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], message = null)
      __obj.asInstanceOf[AlertTemplateProps]
    }
    
    extension [Self <: AlertTemplateProps](x: Self) {
      
      inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
      
      inline def setMessage(value: VdomNode): Self = StObject.set(x, "message", value.rawNode.asInstanceOf[js.Any])
      
      inline def setMessageNull: Self = StObject.set(x, "message", null)
      
      inline def setMessageVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "message", js.Array(value*))
      
      inline def setMessageVdomElement(value: VdomElement): Self = StObject.set(x, "message", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOptions(value: AlertOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: Margin): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactAlert.reactAlertStrings.fade
    - typingsJapgolly.reactAlert.reactAlertStrings.scale
  */
  trait AlertTransition extends StObject
  object AlertTransition {
    
    inline def fade: typingsJapgolly.reactAlert.reactAlertStrings.fade = "fade".asInstanceOf[typingsJapgolly.reactAlert.reactAlertStrings.fade]
    
    inline def scale: typingsJapgolly.reactAlert.reactAlertStrings.scale = "scale".asInstanceOf[typingsJapgolly.reactAlert.reactAlertStrings.scale]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactAlert.reactAlertStrings.info
    - typingsJapgolly.reactAlert.reactAlertStrings.success
    - typingsJapgolly.reactAlert.reactAlertStrings.error
  */
  trait AlertType extends StObject
  object AlertType {
    
    inline def error: typingsJapgolly.reactAlert.reactAlertStrings.error = "error".asInstanceOf[typingsJapgolly.reactAlert.reactAlertStrings.error]
    
    inline def info: typingsJapgolly.reactAlert.reactAlertStrings.info = "info".asInstanceOf[typingsJapgolly.reactAlert.reactAlertStrings.info]
    
    inline def success: typingsJapgolly.reactAlert.reactAlertStrings.success = "success".asInstanceOf[typingsJapgolly.reactAlert.reactAlertStrings.success]
  }
  
  trait InjectedAlertProps extends StObject {
    
    var alert: AlertContainer
  }
  object InjectedAlertProps {
    
    inline def apply(alert: AlertContainer): InjectedAlertProps = {
      val __obj = js.Dynamic.literal(alert = alert.asInstanceOf[js.Any])
      __obj.asInstanceOf[InjectedAlertProps]
    }
    
    extension [Self <: InjectedAlertProps](x: Self) {
      
      inline def setAlert(value: AlertContainer): Self = StObject.set(x, "alert", value.asInstanceOf[js.Any])
    }
  }
  
  trait Positions_ extends StObject {
    
    var BOTTOM_CENTER: `bottom center`
    
    var BOTTOM_LEFT: `bottom left`
    
    var BOTTOM_RIGHT: `bottom right`
    
    var MIDDLE: middle
    
    var MIDDLE_LEFT: `middle left`
    
    var MIDDLE_RIGHT: `middle right`
    
    var TOP_CENTER: `top center`
    
    var TOP_LEFT: `top left`
    
    var TOP_RIGHT: `top right`
  }
  object Positions_ {
    
    inline def apply(): Positions_ = {
      val __obj = js.Dynamic.literal(BOTTOM_CENTER = "bottom center", BOTTOM_LEFT = "bottom left", BOTTOM_RIGHT = "bottom right", MIDDLE = "middle", MIDDLE_LEFT = "middle left", MIDDLE_RIGHT = "middle right", TOP_CENTER = "top center", TOP_LEFT = "top left", TOP_RIGHT = "top right")
      __obj.asInstanceOf[Positions_]
    }
    
    extension [Self <: Positions_](x: Self) {
      
      inline def setBOTTOM_CENTER(value: `bottom center`): Self = StObject.set(x, "BOTTOM_CENTER", value.asInstanceOf[js.Any])
      
      inline def setBOTTOM_LEFT(value: `bottom left`): Self = StObject.set(x, "BOTTOM_LEFT", value.asInstanceOf[js.Any])
      
      inline def setBOTTOM_RIGHT(value: `bottom right`): Self = StObject.set(x, "BOTTOM_RIGHT", value.asInstanceOf[js.Any])
      
      inline def setMIDDLE(value: middle): Self = StObject.set(x, "MIDDLE", value.asInstanceOf[js.Any])
      
      inline def setMIDDLE_LEFT(value: `middle left`): Self = StObject.set(x, "MIDDLE_LEFT", value.asInstanceOf[js.Any])
      
      inline def setMIDDLE_RIGHT(value: `middle right`): Self = StObject.set(x, "MIDDLE_RIGHT", value.asInstanceOf[js.Any])
      
      inline def setTOP_CENTER(value: `top center`): Self = StObject.set(x, "TOP_CENTER", value.asInstanceOf[js.Any])
      
      inline def setTOP_LEFT(value: `top left`): Self = StObject.set(x, "TOP_LEFT", value.asInstanceOf[js.Any])
      
      inline def setTOP_RIGHT(value: `top right`): Self = StObject.set(x, "TOP_RIGHT", value.asInstanceOf[js.Any])
    }
  }
  
  trait Transitions_ extends StObject {
    
    var FADE: fade
    
    var SCALE: scale
  }
  object Transitions_ {
    
    inline def apply(): Transitions_ = {
      val __obj = js.Dynamic.literal(FADE = "fade", SCALE = "scale")
      __obj.asInstanceOf[Transitions_]
    }
    
    extension [Self <: Transitions_](x: Self) {
      
      inline def setFADE(value: fade): Self = StObject.set(x, "FADE", value.asInstanceOf[js.Any])
      
      inline def setSCALE(value: scale): Self = StObject.set(x, "SCALE", value.asInstanceOf[js.Any])
    }
  }
  
  trait Types_ extends StObject {
    
    var ERROR: error
    
    var INFO: info
    
    var SUCCESS: success
  }
  object Types_ {
    
    inline def apply(): Types_ = {
      val __obj = js.Dynamic.literal(ERROR = "error", INFO = "info", SUCCESS = "success")
      __obj.asInstanceOf[Types_]
    }
    
    extension [Self <: Types_](x: Self) {
      
      inline def setERROR(value: error): Self = StObject.set(x, "ERROR", value.asInstanceOf[js.Any])
      
      inline def setINFO(value: info): Self = StObject.set(x, "INFO", value.asInstanceOf[js.Any])
      
      inline def setSUCCESS(value: success): Self = StObject.set(x, "SUCCESS", value.asInstanceOf[js.Any])
    }
  }
}
