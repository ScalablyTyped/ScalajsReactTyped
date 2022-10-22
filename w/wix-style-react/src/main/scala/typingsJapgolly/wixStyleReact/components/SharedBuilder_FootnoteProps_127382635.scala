package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_FootnoteProps_127382635 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
  
  inline def footnote(value: VdomNode): this.type = set("footnote", value.rawNode.asInstanceOf[js.Any])
  
  inline def footnoteNull: this.type = set("footnote", null)
  
  inline def footnoteVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("footnote", js.Array(value*))
  
  inline def footnoteVdomElement(value: VdomElement): this.type = set("footnote", value.rawElement.asInstanceOf[js.Any])
}
