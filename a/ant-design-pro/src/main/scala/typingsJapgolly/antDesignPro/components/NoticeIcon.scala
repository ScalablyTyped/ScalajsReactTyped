package typingsJapgolly.antDesignPro.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.MouseEvent
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignPro.anon.Dictkey
import typingsJapgolly.antDesignPro.libNoticeIconMod.NoticeIconProps
import typingsJapgolly.antDesignPro.libNoticeIconNoticeIconTabMod.NoticeIconData
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NoticeIcon {
  
  @JSImport("ant-design-pro", "NoticeIcon")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.antDesignPro.mod.NoticeIcon] {
    
    inline def bell(value: VdomNode): this.type = set("bell", value.rawNode.asInstanceOf[js.Any])
    
    inline def bellNull: this.type = set("bell", null)
    
    inline def bellVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("bell", js.Array(value*))
    
    inline def bellVdomElement(value: VdomElement): this.type = set("bell", value.rawElement.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def clearClose(value: Boolean): this.type = set("clearClose", value.asInstanceOf[js.Any])
    
    inline def count(value: Double): this.type = set("count", value.asInstanceOf[js.Any])
    
    inline def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
    
    inline def locale(value: Dictkey): this.type = set("locale", value.asInstanceOf[js.Any])
    
    inline def onClear(value: /* tabName */ String => Callback): this.type = set("onClear", js.Any.fromFunction1((t0: /* tabName */ String) => value(t0).runNow()))
    
    inline def onItemClick(value: (/* item */ NoticeIconData, NoticeIconProps) => Callback): this.type = set("onItemClick", js.Any.fromFunction2((t0: /* item */ NoticeIconData, t1: NoticeIconProps) => (value(t0, t1)).runNow()))
    
    inline def onPopupVisibleChange(value: /* visible */ Boolean => Callback): this.type = set("onPopupVisibleChange", js.Any.fromFunction1((t0: /* visible */ Boolean) => value(t0).runNow()))
    
    inline def onTabChange(value: /* tabTile */ String => Callback): this.type = set("onTabChange", js.Any.fromFunction1((t0: /* tabTile */ String) => value(t0).runNow()))
    
    inline def onViewMore(value: (NoticeIconProps, /* e */ MouseEvent) => Callback): this.type = set("onViewMore", js.Any.fromFunction2((t0: NoticeIconProps, t1: /* e */ MouseEvent) => (value(t0, t1)).runNow()))
    
    inline def popupVisible(value: Boolean): this.type = set("popupVisible", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: NoticeIcon.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: NoticeIconProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
