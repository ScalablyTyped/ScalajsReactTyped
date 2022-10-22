package typingsJapgolly.antd.components

import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_TimelineItemProps_1840960613 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
  
  inline def dot(value: VdomNode): this.type = set("dot", value.rawNode.asInstanceOf[js.Any])
  
  inline def dotNull: this.type = set("dot", null)
  
  inline def dotVarargs(
    value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
  ): this.type = set("dot", js.Array(value*))
  
  inline def dotVdomElement(value: VdomElement): this.type = set("dot", value.rawElement.asInstanceOf[js.Any])
  
  inline def label(value: VdomNode): this.type = set("label", value.rawNode.asInstanceOf[js.Any])
  
  inline def labelNull: this.type = set("label", null)
  
  inline def labelVarargs(
    value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
  ): this.type = set("label", js.Array(value*))
  
  inline def labelVdomElement(value: VdomElement): this.type = set("label", value.rawElement.asInstanceOf[js.Any])
  
  inline def pending(value: Boolean): this.type = set("pending", value.asInstanceOf[js.Any])
  
  inline def position(value: String): this.type = set("position", value.asInstanceOf[js.Any])
  
  inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  
  inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
}
