package typingsJapgolly.formol.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.formol.mod.ConditionalProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Conditional {
  
  @JSImport("formol", "Conditional")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def context(value: Any): this.type = set("context", value.asInstanceOf[js.Any])
    
    inline def readOnly(value: (js.Function1[Any, Boolean]) | Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
    
    inline def readOnlyFunction1(value: Any => Boolean): this.type = set("readOnly", js.Any.fromFunction1(value))
    
    inline def show(value: (js.Function1[Any, Boolean]) | Boolean): this.type = set("show", value.asInstanceOf[js.Any])
    
    inline def showFunction1(value: Any => Boolean): this.type = set("show", js.Any.fromFunction1(value))
    
    inline def value(value: Any => Any): this.type = set("value", js.Any.fromFunction1(value))
  }
  
  implicit def make(companion: Conditional.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ConditionalProps[Any]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
