package typingsJapgolly.antd.components

import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antd.libBadgeRibbonMod.RibbonPlacement
import typingsJapgolly.antd.libUtilColorsMod.PresetColorType
import typingsJapgolly.antd.libUtilTypeMod.LiteralUnion
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_RibbonProps1895949547 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def color(value: LiteralUnion[PresetColorType, String]): this.type = set("color", value.asInstanceOf[js.Any])
  
  inline def placement(value: RibbonPlacement): this.type = set("placement", value.asInstanceOf[js.Any])
  
  inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  
  inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  
  inline def text(value: VdomNode): this.type = set("text", value.rawNode.asInstanceOf[js.Any])
  
  inline def textNull: this.type = set("text", null)
  
  inline def textVarargs(
    value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
  ): this.type = set("text", js.Array(value*))
  
  inline def textVdomElement(value: VdomElement): this.type = set("text", value.rawElement.asInstanceOf[js.Any])
}
