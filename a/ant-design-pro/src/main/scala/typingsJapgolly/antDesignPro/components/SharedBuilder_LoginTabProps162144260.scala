package typingsJapgolly.antDesignPro.components

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
open class SharedBuilder_LoginTabProps162144260[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def tab(value: VdomNode): this.type = set("tab", value.rawNode.asInstanceOf[js.Any])
  
  inline def tabNull: this.type = set("tab", null)
  
  inline def tabVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("tab", js.Array(value*))
  
  inline def tabVdomElement(value: VdomElement): this.type = set("tab", value.rawElement.asInstanceOf[js.Any])
}
