package typingsJapgolly.antd

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.antd.antdStrings.error
import typingsJapgolly.antd.antdStrings.info
import typingsJapgolly.antd.antdStrings.loading
import typingsJapgolly.antd.antdStrings.success
import typingsJapgolly.antd.antdStrings.warning
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Key
import typingsJapgolly.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMessageMod {
  
  @JSImport("antd/lib/message", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("antd/lib/message", JSImport.Default)
  @js.native
  val default: MessageApi = js.native
  
  inline def attachTypeApi(originalApi: MessageApi, `type`: NoticeType): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("attachTypeApi")(originalApi.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getKeyThenIncreaseKey(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getKeyThenIncreaseKey")().asInstanceOf[Double]
  
  @JSImport("antd/lib/message", "typeList")
  @js.native
  val typeList: js.Array[success | warning | error | loading | info] = js.native
  
  trait ArgsProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var content: Any
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var getPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ HTMLElement, HTMLElement]] = js.undefined
    
    var icon: js.UndefOr[Node] = js.undefined
    
    var key: js.UndefOr[String | Double] = js.undefined
    
    var onClick: js.UndefOr[js.Function1[/* e */ ReactMouseEventFrom[HTMLDivElement], Unit]] = js.undefined
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var rootPrefixCls: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var `type`: js.UndefOr[NoticeType] = js.undefined
  }
  object ArgsProps {
    
    inline def apply(content: Any): ArgsProps = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArgsProps]
    }
    
    extension [Self <: ArgsProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: Any): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setGetPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): Self = StObject.set(x, "getPopupContainer", js.Any.fromFunction1(value))
      
      inline def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
      
      inline def setIcon(value: VdomNode): Self = StObject.set(x, "icon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setIconNull: Self = StObject.set(x, "icon", null)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "icon", js.Array(value*))
      
      inline def setIconVdomElement(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setKey(value: String | Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setOnClick(value: /* e */ ReactMouseEventFrom[HTMLDivElement] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: /* e */ ReactMouseEventFrom[HTMLDivElement]) => value(t0).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnClose(value: Callback): Self = StObject.set(x, "onClose", value.toJsFn)
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setRootPrefixCls(value: String): Self = StObject.set(x, "rootPrefixCls", value.asInstanceOf[js.Any])
      
      inline def setRootPrefixClsUndefined: Self = StObject.set(x, "rootPrefixCls", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setType(value: NoticeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type ConfigContent = Node
  
  type ConfigDuration = Double | js.Function0[Unit]
  
  type ConfigOnClose = js.Function0[Unit]
  
  trait ConfigOptions extends StObject {
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var getContainer: js.UndefOr[js.Function0[HTMLElement]] = js.undefined
    
    var maxCount: js.UndefOr[Double] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var rtl: js.UndefOr[Boolean] = js.undefined
    
    var top: js.UndefOr[Double] = js.undefined
    
    var transitionName: js.UndefOr[String] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    extension [Self <: ConfigOptions](x: Self) {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setGetContainer(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "getContainer", value.toJsFn)
      
      inline def setGetContainerUndefined: Self = StObject.set(x, "getContainer", js.undefined)
      
      inline def setMaxCount(value: Double): Self = StObject.set(x, "maxCount", value.asInstanceOf[js.Any])
      
      inline def setMaxCountUndefined: Self = StObject.set(x, "maxCount", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      inline def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      inline def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      inline def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
    }
  }
  
  type JointContent = ConfigContent | ArgsProps
  
  @js.native
  trait MessageApi
    extends StObject
       with MessageInstance {
    
    def config(options: ConfigOptions): Unit = js.native
    
    def destroy(): Unit = js.native
    def destroy(messageKey: Key): Unit = js.native
    
    def useMessage(): js.Tuple2[MessageInstance, Element] = js.native
    
    def warn(content: JointContent): MessageType = js.native
    def warn(content: JointContent, duration: Unit, onClose: ConfigOnClose): MessageType = js.native
    def warn(content: JointContent, duration: ConfigDuration): MessageType = js.native
    def warn(content: JointContent, duration: ConfigDuration, onClose: ConfigOnClose): MessageType = js.native
  }
  
  @js.native
  trait MessageInstance extends StObject {
    
    def error(content: JointContent): MessageType = js.native
    def error(content: JointContent, duration: Unit, onClose: ConfigOnClose): MessageType = js.native
    def error(content: JointContent, duration: ConfigDuration): MessageType = js.native
    def error(content: JointContent, duration: ConfigDuration, onClose: ConfigOnClose): MessageType = js.native
    
    def info(content: JointContent): MessageType = js.native
    def info(content: JointContent, duration: Unit, onClose: ConfigOnClose): MessageType = js.native
    def info(content: JointContent, duration: ConfigDuration): MessageType = js.native
    def info(content: JointContent, duration: ConfigDuration, onClose: ConfigOnClose): MessageType = js.native
    
    def loading(content: JointContent): MessageType = js.native
    def loading(content: JointContent, duration: Unit, onClose: ConfigOnClose): MessageType = js.native
    def loading(content: JointContent, duration: ConfigDuration): MessageType = js.native
    def loading(content: JointContent, duration: ConfigDuration, onClose: ConfigOnClose): MessageType = js.native
    
    def open(args: ArgsProps): MessageType = js.native
    
    def success(content: JointContent): MessageType = js.native
    def success(content: JointContent, duration: Unit, onClose: ConfigOnClose): MessageType = js.native
    def success(content: JointContent, duration: ConfigDuration): MessageType = js.native
    def success(content: JointContent, duration: ConfigDuration, onClose: ConfigOnClose): MessageType = js.native
    
    def warning(content: JointContent): MessageType = js.native
    def warning(content: JointContent, duration: Unit, onClose: ConfigOnClose): MessageType = js.native
    def warning(content: JointContent, duration: ConfigDuration): MessageType = js.native
    def warning(content: JointContent, duration: ConfigDuration, onClose: ConfigOnClose): MessageType = js.native
  }
  
  @js.native
  trait MessageType
    extends StObject
       with PromiseLike[Any] {
    
    def apply(): Unit = js.native
  }
  
  /* keyof antd.anon.Loading */ /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.antd.antdStrings.info
    - typingsJapgolly.antd.antdStrings.success
    - typingsJapgolly.antd.antdStrings.error
    - typingsJapgolly.antd.antdStrings.warning
    - typingsJapgolly.antd.antdStrings.loading
  */
  trait NoticeType extends StObject
  
  type ThenableArgument = js.Function1[/* val */ Any, Unit]
}
