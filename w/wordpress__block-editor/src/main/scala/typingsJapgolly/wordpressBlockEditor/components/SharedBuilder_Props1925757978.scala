package typingsJapgolly.wordpressBlockEditor.components

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
open class SharedBuilder_Props1925757978 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def fallback(value: VdomNode): this.type = set("fallback", value.rawNode.asInstanceOf[js.Any])
  
  inline def fallbackNull: this.type = set("fallback", null)
  
  inline def fallbackVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("fallback", js.Array(value*))
  
  inline def fallbackVdomElement(value: VdomElement): this.type = set("fallback", value.rawElement.asInstanceOf[js.Any])
}
