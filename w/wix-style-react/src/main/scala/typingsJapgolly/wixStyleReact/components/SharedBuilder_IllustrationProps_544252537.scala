package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_IllustrationProps_544252537 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
  
  inline def illustration(value: String | Node): this.type = set("illustration", value.asInstanceOf[js.Any])
  
  inline def illustrationNull: this.type = set("illustration", null)
  
  inline def illustrationVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("illustration", js.Array(value*))
  
  inline def illustrationVdomElement(value: VdomElement): this.type = set("illustration", value.rawElement.asInstanceOf[js.Any])
}
