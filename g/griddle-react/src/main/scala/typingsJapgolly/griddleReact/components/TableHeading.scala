package typingsJapgolly.griddleReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.griddleReact.mod.components.TableHeadingProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableHeading {
  
  inline def apply(TableHeadingCell: Any): Builder = {
    val __props = js.Dynamic.literal(TableHeadingCell = TableHeadingCell.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TableHeadingProps]))
  }
  
  @JSImport("griddle-react", "components.TableHeading")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.griddleReact.mod.components.TableHeading] {
    
    inline def columnIds(value: js.Array[Double]): this.type = set("columnIds", value.asInstanceOf[js.Any])
    
    inline def columnIdsVarargs(value: Double*): this.type = set("columnIds", js.Array(value*))
    
    inline def columnTitles(value: js.Array[String]): this.type = set("columnTitles", value.asInstanceOf[js.Any])
    
    inline def columnTitlesVarargs(value: String*): this.type = set("columnTitles", js.Array(value*))
  }
  
  def withProps(p: TableHeadingProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
