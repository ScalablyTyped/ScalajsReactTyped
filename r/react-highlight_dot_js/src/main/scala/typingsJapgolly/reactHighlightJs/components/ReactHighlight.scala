package typingsJapgolly.reactHighlightJs.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactHighlightJs.reactHighlightMod.HighlightProps
import typingsJapgolly.reactHighlightJs.reactHighlightMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactHighlight {
  
  inline def apply(language: String): Builder = {
    val __props = js.Dynamic.literal(language = language.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[HighlightProps]))
  }
  
  @JSImport("react-highlight", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: HighlightProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
