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
open class SharedBuilder_HeaderProps1894569066[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
  
  inline def subtitle(value: VdomNode): this.type = set("subtitle", value.rawNode.asInstanceOf[js.Any])
  
  inline def subtitleNull: this.type = set("subtitle", null)
  
  inline def subtitleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("subtitle", js.Array(value*))
  
  inline def subtitleVdomElement(value: VdomElement): this.type = set("subtitle", value.rawElement.asInstanceOf[js.Any])
  
  inline def suffix(value: VdomNode): this.type = set("suffix", value.rawNode.asInstanceOf[js.Any])
  
  inline def suffixNull: this.type = set("suffix", null)
  
  inline def suffixVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("suffix", js.Array(value*))
  
  inline def suffixVdomElement(value: VdomElement): this.type = set("suffix", value.rawElement.asInstanceOf[js.Any])
  
  inline def title(value: VdomNode): this.type = set("title", value.rawNode.asInstanceOf[js.Any])
  
  inline def titleNull: this.type = set("title", null)
  
  inline def titleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("title", js.Array(value*))
  
  inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
}
