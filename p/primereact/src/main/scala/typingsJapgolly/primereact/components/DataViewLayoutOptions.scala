package typingsJapgolly.primereact.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.primereact.dataviewDataviewMod.DataViewLayoutOptionsChangeParams
import typingsJapgolly.primereact.dataviewDataviewMod.DataViewLayoutOptionsProps
import typingsJapgolly.primereact.dataviewDataviewMod.DataViewLayoutType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DataViewLayoutOptions {
  
  inline def apply(onChange: DataViewLayoutOptionsChangeParams => Callback): Builder = {
    val __props = js.Dynamic.literal(onChange = js.Any.fromFunction1((t0: DataViewLayoutOptionsChangeParams) => onChange(t0).runNow()))
    new Builder(js.Array(this.component, __props.asInstanceOf[DataViewLayoutOptionsProps]))
  }
  
  @JSImport("primereact", "DataViewLayoutOptions")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.primereact.mod.DataViewLayoutOptions] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def layout(value: DataViewLayoutType): this.type = set("layout", value.asInstanceOf[js.Any])
    
    inline def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DataViewLayoutOptionsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
