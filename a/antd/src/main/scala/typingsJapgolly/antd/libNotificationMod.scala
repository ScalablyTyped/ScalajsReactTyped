package typingsJapgolly.antd

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNotificationMod extends Shortcut {
  
  @JSImport("antd/lib/notification", JSImport.Default)
  @js.native
  val default: NotificationApi = js.native
  
  trait ArgsProps extends StObject {
    
    var bottom: js.UndefOr[Double] = js.undefined
    
    var btn: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var closeIcon: js.UndefOr[Node] = js.undefined
    
    var description: js.UndefOr[Node] = js.undefined
    
    var duration: js.UndefOr[Double | Null] = js.undefined
    
    var getContainer: js.UndefOr[js.Function0[HTMLElement]] = js.undefined
    
    var icon: js.UndefOr[Node] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
    
    var maxCount: js.UndefOr[Double] = js.undefined
    
    var message: Node
    
    var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var placement: js.UndefOr[NotificationPlacement] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var props: js.UndefOr[DivProps] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var top: js.UndefOr[Double] = js.undefined
    
    val `type`: js.UndefOr[IconType] = js.undefined
  }
  object ArgsProps {
    
    inline def apply(): ArgsProps = {
      val __obj = js.Dynamic.literal(message = null)
      __obj.asInstanceOf[ArgsProps]
    }
    
    extension [Self <: ArgsProps](x: Self) {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setBtn(value: VdomNode): Self = StObject.set(x, "btn", value.rawNode.asInstanceOf[js.Any])
      
      inline def setBtnNull: Self = StObject.set(x, "btn", null)
      
      inline def setBtnUndefined: Self = StObject.set(x, "btn", js.undefined)
      
      inline def setBtnVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "btn", js.Array(value*))
      
      inline def setBtnVdomElement(value: VdomElement): Self = StObject.set(x, "btn", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCloseIcon(value: VdomNode): Self = StObject.set(x, "closeIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setCloseIconNull: Self = StObject.set(x, "closeIcon", null)
      
      inline def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
      
      inline def setCloseIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "closeIcon", js.Array(value*))
      
      inline def setCloseIconVdomElement(value: VdomElement): Self = StObject.set(x, "closeIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDescription(value: VdomNode): Self = StObject.set(x, "description", value.rawNode.asInstanceOf[js.Any])
      
      inline def setDescriptionNull: Self = StObject.set(x, "description", null)
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDescriptionVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "description", js.Array(value*))
      
      inline def setDescriptionVdomElement(value: VdomElement): Self = StObject.set(x, "description", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationNull: Self = StObject.set(x, "duration", null)
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setGetContainer(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "getContainer", value.toJsFn)
      
      inline def setGetContainerUndefined: Self = StObject.set(x, "getContainer", js.undefined)
      
      inline def setIcon(value: VdomNode): Self = StObject.set(x, "icon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setIconNull: Self = StObject.set(x, "icon", null)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "icon", js.Array(value*))
      
      inline def setIconVdomElement(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setMaxCount(value: Double): Self = StObject.set(x, "maxCount", value.asInstanceOf[js.Any])
      
      inline def setMaxCountUndefined: Self = StObject.set(x, "maxCount", js.undefined)
      
      inline def setMessage(value: VdomNode): Self = StObject.set(x, "message", value.rawNode.asInstanceOf[js.Any])
      
      inline def setMessageNull: Self = StObject.set(x, "message", null)
      
      inline def setMessageVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "message", js.Array(value*))
      
      inline def setMessageVdomElement(value: VdomElement): Self = StObject.set(x, "message", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnClick(value: Callback): Self = StObject.set(x, "onClick", value.toJsFn)
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnClose(value: Callback): Self = StObject.set(x, "onClose", value.toJsFn)
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setPlacement(value: NotificationPlacement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setProps(value: DivProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      inline def setType(value: IconType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ConfigProps extends StObject {
    
    var bottom: js.UndefOr[Double] = js.undefined
    
    var closeIcon: js.UndefOr[Node] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var getContainer: js.UndefOr[js.Function0[HTMLElement]] = js.undefined
    
    var maxCount: js.UndefOr[Double] = js.undefined
    
    var placement: js.UndefOr[NotificationPlacement] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var props: js.UndefOr[DivProps] = js.undefined
    
    var rtl: js.UndefOr[Boolean] = js.undefined
    
    var top: js.UndefOr[Double] = js.undefined
  }
  object ConfigProps {
    
    inline def apply(): ConfigProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigProps]
    }
    
    extension [Self <: ConfigProps](x: Self) {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setCloseIcon(value: VdomNode): Self = StObject.set(x, "closeIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setCloseIconNull: Self = StObject.set(x, "closeIcon", null)
      
      inline def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
      
      inline def setCloseIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "closeIcon", js.Array(value*))
      
      inline def setCloseIconVdomElement(value: VdomElement): Self = StObject.set(x, "closeIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setGetContainer(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "getContainer", value.toJsFn)
      
      inline def setGetContainerUndefined: Self = StObject.set(x, "getContainer", js.undefined)
      
      inline def setMaxCount(value: Double): Self = StObject.set(x, "maxCount", value.asInstanceOf[js.Any])
      
      inline def setMaxCountUndefined: Self = StObject.set(x, "maxCount", js.undefined)
      
      inline def setPlacement(value: NotificationPlacement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setProps(value: DivProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      inline def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  trait DivProps
    extends StObject
       with HTMLProps[HTMLDivElement] {
    
    var `data-testid`: js.UndefOr[String] = js.undefined
  }
  object DivProps {
    
    inline def apply(): DivProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DivProps]
    }
    
    extension [Self <: DivProps](x: Self) {
      
      inline def `setData-testid`(value: String): Self = StObject.set(x, "data-testid", value.asInstanceOf[js.Any])
      
      inline def `setData-testidUndefined`: Self = StObject.set(x, "data-testid", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.antd.antdStrings.success
    - typingsJapgolly.antd.antdStrings.info
    - typingsJapgolly.antd.antdStrings.error
    - typingsJapgolly.antd.antdStrings.warning
  */
  trait IconType extends StObject
  object IconType {
    
    inline def error: typingsJapgolly.antd.antdStrings.error = "error".asInstanceOf[typingsJapgolly.antd.antdStrings.error]
    
    inline def info: typingsJapgolly.antd.antdStrings.info = "info".asInstanceOf[typingsJapgolly.antd.antdStrings.info]
    
    inline def success: typingsJapgolly.antd.antdStrings.success = "success".asInstanceOf[typingsJapgolly.antd.antdStrings.success]
    
    inline def warning: typingsJapgolly.antd.antdStrings.warning = "warning".asInstanceOf[typingsJapgolly.antd.antdStrings.warning]
  }
  
  trait NotificationApi
    extends StObject
       with NotificationInstance {
    
    def close(key: String): Unit
    
    def config(options: ConfigProps): Unit
    
    def destroy(): Unit
    
    def useNotification(): js.Tuple2[NotificationInstance, Element]
    
    def warn(args: ArgsProps): Unit
  }
  object NotificationApi {
    
    inline def apply(
      close: String => Callback,
      config: ConfigProps => Callback,
      destroy: Callback,
      error: ArgsProps => Callback,
      info: ArgsProps => Callback,
      open: ArgsProps => Callback,
      success: ArgsProps => Callback,
      useNotification: CallbackTo[js.Tuple2[NotificationInstance, Element]],
      warn: ArgsProps => Callback,
      warning: ArgsProps => Callback
    ): NotificationApi = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction1((t0: String) => close(t0).runNow()), config = js.Any.fromFunction1((t0: ConfigProps) => config(t0).runNow()), destroy = destroy.toJsFn, error = js.Any.fromFunction1((t0: ArgsProps) => error(t0).runNow()), info = js.Any.fromFunction1((t0: ArgsProps) => info(t0).runNow()), open = js.Any.fromFunction1((t0: ArgsProps) => open(t0).runNow()), success = js.Any.fromFunction1((t0: ArgsProps) => success(t0).runNow()), useNotification = useNotification.toJsFn, warn = js.Any.fromFunction1((t0: ArgsProps) => warn(t0).runNow()), warning = js.Any.fromFunction1((t0: ArgsProps) => warning(t0).runNow()))
      __obj.asInstanceOf[NotificationApi]
    }
    
    extension [Self <: NotificationApi](x: Self) {
      
      inline def setClose(value: String => Callback): Self = StObject.set(x, "close", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setConfig(value: ConfigProps => Callback): Self = StObject.set(x, "config", js.Any.fromFunction1((t0: ConfigProps) => value(t0).runNow()))
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setUseNotification(value: CallbackTo[js.Tuple2[NotificationInstance, Element]]): Self = StObject.set(x, "useNotification", value.toJsFn)
      
      inline def setWarn(value: ArgsProps => Callback): Self = StObject.set(x, "warn", js.Any.fromFunction1((t0: ArgsProps) => value(t0).runNow()))
    }
  }
  
  trait NotificationInstance extends StObject {
    
    def error(args: ArgsProps): Unit
    
    def info(args: ArgsProps): Unit
    
    def open(args: ArgsProps): Unit
    
    def success(args: ArgsProps): Unit
    
    def warning(args: ArgsProps): Unit
  }
  object NotificationInstance {
    
    inline def apply(
      error: ArgsProps => Callback,
      info: ArgsProps => Callback,
      open: ArgsProps => Callback,
      success: ArgsProps => Callback,
      warning: ArgsProps => Callback
    ): NotificationInstance = {
      val __obj = js.Dynamic.literal(error = js.Any.fromFunction1((t0: ArgsProps) => error(t0).runNow()), info = js.Any.fromFunction1((t0: ArgsProps) => info(t0).runNow()), open = js.Any.fromFunction1((t0: ArgsProps) => open(t0).runNow()), success = js.Any.fromFunction1((t0: ArgsProps) => success(t0).runNow()), warning = js.Any.fromFunction1((t0: ArgsProps) => warning(t0).runNow()))
      __obj.asInstanceOf[NotificationInstance]
    }
    
    extension [Self <: NotificationInstance](x: Self) {
      
      inline def setError(value: ArgsProps => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: ArgsProps) => value(t0).runNow()))
      
      inline def setInfo(value: ArgsProps => Callback): Self = StObject.set(x, "info", js.Any.fromFunction1((t0: ArgsProps) => value(t0).runNow()))
      
      inline def setOpen(value: ArgsProps => Callback): Self = StObject.set(x, "open", js.Any.fromFunction1((t0: ArgsProps) => value(t0).runNow()))
      
      inline def setSuccess(value: ArgsProps => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: ArgsProps) => value(t0).runNow()))
      
      inline def setWarning(value: ArgsProps => Callback): Self = StObject.set(x, "warning", js.Any.fromFunction1((t0: ArgsProps) => value(t0).runNow()))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.antd.antdStrings.top
    - typingsJapgolly.antd.antdStrings.topLeft
    - typingsJapgolly.antd.antdStrings.topRight
    - typingsJapgolly.antd.antdStrings.bottom
    - typingsJapgolly.antd.antdStrings.bottomLeft
    - typingsJapgolly.antd.antdStrings.bottomRight
  */
  trait NotificationPlacement extends StObject
  object NotificationPlacement {
    
    inline def bottom: typingsJapgolly.antd.antdStrings.bottom = "bottom".asInstanceOf[typingsJapgolly.antd.antdStrings.bottom]
    
    inline def bottomLeft: typingsJapgolly.antd.antdStrings.bottomLeft = "bottomLeft".asInstanceOf[typingsJapgolly.antd.antdStrings.bottomLeft]
    
    inline def bottomRight: typingsJapgolly.antd.antdStrings.bottomRight = "bottomRight".asInstanceOf[typingsJapgolly.antd.antdStrings.bottomRight]
    
    inline def top: typingsJapgolly.antd.antdStrings.top = "top".asInstanceOf[typingsJapgolly.antd.antdStrings.top]
    
    inline def topLeft: typingsJapgolly.antd.antdStrings.topLeft = "topLeft".asInstanceOf[typingsJapgolly.antd.antdStrings.topLeft]
    
    inline def topRight: typingsJapgolly.antd.antdStrings.topRight = "topRight".asInstanceOf[typingsJapgolly.antd.antdStrings.topRight]
  }
  
  type _To = NotificationApi
  
  /* This means you don't have to write `default`, but can instead just say `libNotificationMod.foo` */
  override def _to: NotificationApi = default
}
