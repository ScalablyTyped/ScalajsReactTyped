package typingsJapgolly.antDesignPro.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignPro.libNoticeIconNoticeIconTabMod.NoticeIconData
import typingsJapgolly.antDesignPro.libNoticeIconNoticeIconTabMod.NoticeIconTabProps
import typingsJapgolly.antDesignPro.libNoticeIconNoticeIconTabMod.default
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NoticeIconTab {
  
  inline def apply(locale: Any, onClear: Any => Callback, onClick: Any => Callback, onViewMore: Any => Callback): Builder = {
    val __props = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], onClear = js.Any.fromFunction1((t0: Any) => onClear(t0).runNow()), onClick = js.Any.fromFunction1((t0: Any) => onClick(t0).runNow()), onViewMore = js.Any.fromFunction1((t0: Any) => onViewMore(t0).runNow()))
    new Builder(js.Array(this.component, __props.asInstanceOf[NoticeIconTabProps]))
  }
  
  @JSImport("ant-design-pro/lib/NoticeIcon/NoticeIconTab", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def count(value: Double): this.type = set("count", value.asInstanceOf[js.Any])
    
    inline def data(value: js.Array[Any]): this.type = set("data", value.asInstanceOf[js.Any])
    
    inline def dataVarargs(value: Any*): this.type = set("data", js.Array(value*))
    
    inline def emptyImage(value: String): this.type = set("emptyImage", value.asInstanceOf[js.Any])
    
    inline def emptyText(value: VdomNode): this.type = set("emptyText", value.rawNode.asInstanceOf[js.Any])
    
    inline def emptyTextNull: this.type = set("emptyText", null)
    
    inline def emptyTextVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("emptyText", js.Array(value*))
    
    inline def emptyTextVdomElement(value: VdomElement): this.type = set("emptyText", value.rawElement.asInstanceOf[js.Any])
    
    inline def list(value: js.Array[NoticeIconData]): this.type = set("list", value.asInstanceOf[js.Any])
    
    inline def listVarargs(value: NoticeIconData*): this.type = set("list", js.Array(value*))
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def showClear(value: Boolean): this.type = set("showClear", value.asInstanceOf[js.Any])
    
    inline def showViewMore(value: Boolean): this.type = set("showViewMore", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: NoticeIconTabProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
