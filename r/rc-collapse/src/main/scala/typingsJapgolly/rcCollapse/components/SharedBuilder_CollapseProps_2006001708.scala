package typingsJapgolly.rcCollapse.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.rcCollapse.esInterfaceMod.CollapsibleType
import typingsJapgolly.rcMotion.esCssmotionMod.CSSMotionProps
import typingsJapgolly.react.mod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_CollapseProps_2006001708[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def accordion(value: Boolean): this.type = set("accordion", value.asInstanceOf[js.Any])
  
  inline def activeKey(value: Key | js.Array[Key]): this.type = set("activeKey", value.asInstanceOf[js.Any])
  
  inline def activeKeyVarargs(value: Key*): this.type = set("activeKey", js.Array(value*))
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def collapsible(value: CollapsibleType): this.type = set("collapsible", value.asInstanceOf[js.Any])
  
  inline def defaultActiveKey(value: Key | js.Array[Key]): this.type = set("defaultActiveKey", value.asInstanceOf[js.Any])
  
  inline def defaultActiveKeyVarargs(value: Key*): this.type = set("defaultActiveKey", js.Array(value*))
  
  inline def destroyInactivePanel(value: Boolean): this.type = set("destroyInactivePanel", value.asInstanceOf[js.Any])
  
  inline def expandIcon(value: /* props */ js.Object => Node): this.type = set("expandIcon", js.Any.fromFunction1(value))
  
  inline def onChange(value: /* key */ Key | js.Array[Key] => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* key */ Key | js.Array[Key]) => value(t0).runNow()))
  
  inline def openMotion(value: CSSMotionProps): this.type = set("openMotion", value.asInstanceOf[js.Any])
  
  inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  
  inline def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
}
