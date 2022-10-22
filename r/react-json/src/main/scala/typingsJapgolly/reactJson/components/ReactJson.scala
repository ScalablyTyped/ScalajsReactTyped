package typingsJapgolly.reactJson.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactJson.mod.JsonProperties
import typingsJapgolly.reactJson.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactJson {
  
  inline def apply(value: Any): Builder = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[JsonProperties]))
  }
  
  @JSImport("react-json", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[^] {
    
    inline def onChange(value: /* value */ Any => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* value */ Any) => value(t0).runNow()))
  }
  
  def withProps(p: JsonProperties): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
