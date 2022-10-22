package typingsJapgolly.griddleReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.griddleReact.mod.components.TableBodyProps
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableBody {
  
  @JSImport("griddle-react", "components.TableBody")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.griddleReact.mod.components.TableBody] {
    
    inline def Row(value: Any): this.type = set("Row", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def rowIds(value: js.Array[Double]): this.type = set("rowIds", value.asInstanceOf[js.Any])
    
    inline def rowIdsVarargs(value: Double*): this.type = set("rowIds", js.Array(value*))
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: TableBody.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TableBodyProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
