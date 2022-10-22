package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.dndListTypesMod.SharedStylePropsArg
import typingsJapgolly.styletronStandard.mod.StyleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_AsOverrideProps_1593839454[C /* <: ElementType */] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def $as(value: C): this.type = set("$as", value.asInstanceOf[js.Any])
  
  inline def $style(value: StyleObject | (js.Function1[SharedStylePropsArg, StyleObject])): this.type = set("$style", value.asInstanceOf[js.Any])
  
  inline def $styleFunction1(value: SharedStylePropsArg => StyleObject): this.type = set("$style", js.Any.fromFunction1(value))
  
  inline def $value(value: VdomNode): this.type = set("$value", value.rawNode.asInstanceOf[js.Any])
  
  inline def $valueNull: this.type = set("$value", null)
  
  inline def $valueVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("$value", js.Array(value*))
  
  inline def $valueVdomElement(value: VdomElement): this.type = set("$value", value.rawElement.asInstanceOf[js.Any])
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
}
