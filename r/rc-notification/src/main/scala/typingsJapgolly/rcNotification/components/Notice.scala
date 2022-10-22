package typingsJapgolly.rcNotification.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.rcNotification.esNoticeMod.NoticeProps
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.Key
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Notice {
  
  inline def apply(eventKey: Key, prefixCls: String): Builder = {
    val __props = js.Dynamic.literal(eventKey = eventKey.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[NoticeProps & RefAttributes[HTMLDivElement]]))
  }
  
  @JSImport("rc-notification", "Notice")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[HTMLDivElement] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def closable(value: Boolean): this.type = set("closable", value.asInstanceOf[js.Any])
    
    inline def closeIcon(value: VdomNode): this.type = set("closeIcon", value.rawNode.asInstanceOf[js.Any])
    
    inline def closeIconNull: this.type = set("closeIcon", null)
    
    inline def closeIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("closeIcon", js.Array(value*))
    
    inline def closeIconVdomElement(value: VdomElement): this.type = set("closeIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def content(value: VdomNode): this.type = set("content", value.rawNode.asInstanceOf[js.Any])
    
    inline def contentNull: this.type = set("content", null)
    
    inline def contentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("content", js.Array(value*))
    
    inline def contentVdomElement(value: VdomElement): this.type = set("content", value.rawElement.asInstanceOf[js.Any])
    
    inline def duration(value: Double): this.type = set("duration", value.asInstanceOf[js.Any])
    
    inline def durationNull: this.type = set("duration", null)
    
    inline def onClick(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onNoticeClose(value: /* key */ Key => Callback): this.type = set("onNoticeClose", js.Any.fromFunction1((t0: /* key */ Key) => value(t0).runNow()))
    
    inline def props(value: HTMLAttributes[HTMLDivElement] & (Record[String, Any])): this.type = set("props", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: NoticeProps & RefAttributes[HTMLDivElement]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
