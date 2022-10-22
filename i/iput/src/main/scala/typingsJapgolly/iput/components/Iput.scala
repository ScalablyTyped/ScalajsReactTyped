package typingsJapgolly.iput.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.iput.mod.IputProp
import typingsJapgolly.iput.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Iput {
  
  @JSImport("iput", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def defaultValue(value: String | js.Array[String]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    inline def defaultValueVarargs(value: String*): this.type = set("defaultValue", js.Array(value*))
    
    inline def isError(value: CallbackTo[Boolean]): this.type = set("isError", value.toJsFn)
    
    inline def onChange(value: /* value */ String => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* value */ String) => value(t0).runNow()))
  }
  
  implicit def make(companion: Iput.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IputProp): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
