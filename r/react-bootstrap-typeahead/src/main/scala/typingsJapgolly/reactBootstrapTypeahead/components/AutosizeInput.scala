package typingsJapgolly.reactBootstrapTypeahead.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.reactBootstrapTypeahead.mod.AutosizeInputProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AutosizeInput {
  
  inline def apply(style: CSSProperties): Builder = {
    val __props = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[AutosizeInputProps]))
  }
  
  @JSImport("react-bootstrap-typeahead", "AutosizeInput")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactBootstrapTypeahead.mod.AutosizeInput] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def inputClassName(value: String): this.type = set("inputClassName", value.asInstanceOf[js.Any])
    
    inline def inputRef(value: LegacyRef[HTMLInputElement]): this.type = set("inputRef", value.asInstanceOf[js.Any])
    
    inline def inputRefFunction1(value: HTMLInputElement | Null => Callback): this.type = set("inputRef", js.Any.fromFunction1((t0: HTMLInputElement | Null) => value(t0).runNow()))
    
    inline def inputRefNull: this.type = set("inputRef", null)
    
    inline def inputStyle(value: CSSProperties): this.type = set("inputStyle", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AutosizeInputProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
