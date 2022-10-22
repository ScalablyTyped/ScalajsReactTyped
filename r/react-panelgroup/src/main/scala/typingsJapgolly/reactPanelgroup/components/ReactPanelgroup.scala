package typingsJapgolly.reactPanelgroup.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactPanelgroup.mod.PanelWidth
import typingsJapgolly.reactPanelgroup.mod.PropTypes
import typingsJapgolly.reactPanelgroup.mod.default
import typingsJapgolly.reactPanelgroup.reactPanelgroupStrings.column
import typingsJapgolly.reactPanelgroup.reactPanelgroupStrings.row
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactPanelgroup {
  
  @JSImport("react-panelgroup", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def borderColor(value: String): this.type = set("borderColor", value.asInstanceOf[js.Any])
    
    inline def direction(value: row | column): this.type = set("direction", value.asInstanceOf[js.Any])
    
    inline def onUpdate(value: /* data */ PanelWidth => Callback): this.type = set("onUpdate", js.Any.fromFunction1((t0: /* data */ PanelWidth) => value(t0).runNow()))
    
    inline def panelColor(value: String): this.type = set("panelColor", value.asInstanceOf[js.Any])
    
    inline def panelWidths(value: js.Array[PanelWidth | Null]): this.type = set("panelWidths", value.asInstanceOf[js.Any])
    
    inline def panelWidthsVarargs(value: (PanelWidth | Null)*): this.type = set("panelWidths", js.Array(value*))
    
    inline def spacing(value: Double): this.type = set("spacing", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactPanelgroup.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PropTypes): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
