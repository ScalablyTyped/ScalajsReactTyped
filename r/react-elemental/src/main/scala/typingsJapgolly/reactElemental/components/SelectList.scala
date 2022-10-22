package typingsJapgolly.reactElemental.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactElemental.mod.SelectListProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SelectList {
  
  @JSImport("react-elemental", "SelectList")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactElemental.mod.SelectList] {
    
    inline def error(value: String): this.type = set("error", value.asInstanceOf[js.Any])
    
    inline def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def onChange(value: /* value */ String => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* value */ String) => value(t0).runNow()))
    
    inline def options(value: js.Array[typingsJapgolly.reactElemental.anon.Label]): this.type = set("options", value.asInstanceOf[js.Any])
    
    inline def optionsVarargs(value: typingsJapgolly.reactElemental.anon.Label*): this.type = set("options", js.Array(value*))
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def width(value: Double | String): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: SelectList.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SelectListProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
