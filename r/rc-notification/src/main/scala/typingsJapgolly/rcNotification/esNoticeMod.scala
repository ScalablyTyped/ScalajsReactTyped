package typingsJapgolly.rcNotification

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.Key
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.std.Record
import typingsJapgolly.std.VoidFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esNoticeMod extends Shortcut {
  
  @JSImport("rc-notification/es/Notice", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[NoticeProps & RefAttributes[HTMLDivElement]] = js.native
  
  trait NoticeConfig extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var closable: js.UndefOr[Boolean] = js.undefined
    
    var closeIcon: js.UndefOr[Node] = js.undefined
    
    var content: js.UndefOr[Node] = js.undefined
    
    var duration: js.UndefOr[Double | Null] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onClose: js.UndefOr[VoidFunction] = js.undefined
    
    /** @private Internal usage. Do not override in your code */
    var props: js.UndefOr[HTMLAttributes[HTMLDivElement] & (Record[String, Any])] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object NoticeConfig {
    
    inline def apply(): NoticeConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NoticeConfig]
    }
    
    extension [Self <: NoticeConfig](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
      
      inline def setClosableUndefined: Self = StObject.set(x, "closable", js.undefined)
      
      inline def setCloseIcon(value: VdomNode): Self = StObject.set(x, "closeIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setCloseIconNull: Self = StObject.set(x, "closeIcon", null)
      
      inline def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
      
      inline def setCloseIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "closeIcon", js.Array(value*))
      
      inline def setCloseIconVdomElement(value: VdomElement): Self = StObject.set(x, "closeIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setContent(value: VdomNode): Self = StObject.set(x, "content", value.rawNode.asInstanceOf[js.Any])
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setContentVdomElement(value: VdomElement): Self = StObject.set(x, "content", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationNull: Self = StObject.set(x, "duration", null)
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setOnClick(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnClose(value: Callback): Self = StObject.set(x, "onClose", value.toJsFn)
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setProps(value: HTMLAttributes[HTMLDivElement] & (Record[String, Any])): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  /* Inlined parent std.Omit<rc-notification.rc-notification/es/Notice.NoticeConfig, 'onClose'> */
  trait NoticeProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var closable: js.UndefOr[Boolean] = js.undefined
    
    var closeIcon: js.UndefOr[Node] = js.undefined
    
    var content: js.UndefOr[Node] = js.undefined
    
    var duration: js.UndefOr[Double | Null] = js.undefined
    
    var eventKey: Key
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onNoticeClose: js.UndefOr[js.Function1[/* key */ Key, Unit]] = js.undefined
    
    var prefixCls: String
    
    var props: js.UndefOr[HTMLAttributes[HTMLDivElement] & (Record[String, Any])] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object NoticeProps {
    
    inline def apply(eventKey: Key, prefixCls: String): NoticeProps = {
      val __obj = js.Dynamic.literal(eventKey = eventKey.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[NoticeProps]
    }
    
    extension [Self <: NoticeProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
      
      inline def setClosableUndefined: Self = StObject.set(x, "closable", js.undefined)
      
      inline def setCloseIcon(value: VdomNode): Self = StObject.set(x, "closeIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setCloseIconNull: Self = StObject.set(x, "closeIcon", null)
      
      inline def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
      
      inline def setCloseIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "closeIcon", js.Array(value*))
      
      inline def setCloseIconVdomElement(value: VdomElement): Self = StObject.set(x, "closeIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setContent(value: VdomNode): Self = StObject.set(x, "content", value.rawNode.asInstanceOf[js.Any])
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setContentVdomElement(value: VdomElement): Self = StObject.set(x, "content", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationNull: Self = StObject.set(x, "duration", null)
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEventKey(value: Key): Self = StObject.set(x, "eventKey", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnNoticeClose(value: /* key */ Key => Callback): Self = StObject.set(x, "onNoticeClose", js.Any.fromFunction1((t0: /* key */ Key) => value(t0).runNow()))
      
      inline def setOnNoticeCloseUndefined: Self = StObject.set(x, "onNoticeClose", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setProps(value: HTMLAttributes[HTMLDivElement] & (Record[String, Any])): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[NoticeProps & RefAttributes[HTMLDivElement]]
  
  /* This means you don't have to write `default`, but can instead just say `esNoticeMod.foo` */
  override def _to: ForwardRefExoticComponent[NoticeProps & RefAttributes[HTMLDivElement]] = default
}
