package typingsJapgolly.reactFileInput.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactFileInput.mod.FileInputProps
import typingsJapgolly.reactFileInput.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactFileInput {
  
  inline def apply(
    accept: String,
    className: String,
    name: String,
    onChange: ReactEventFrom[Any & Element] => Callback,
    placeholder: String
  ): Builder = {
    val __props = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onChange = js.Any.fromFunction1((t0: ReactEventFrom[Any & Element]) => onChange(t0).runNow()), placeholder = placeholder.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[FileInputProps]))
  }
  
  @JSImport("react-file-input", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[^] {
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: FileInputProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
