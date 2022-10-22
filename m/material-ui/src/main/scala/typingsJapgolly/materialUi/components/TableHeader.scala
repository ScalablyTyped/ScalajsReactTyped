package typingsJapgolly.materialUi.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.materialUi.MaterialUI.Table.TableHeaderProps
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableHeader {
  
  @JSImport("material-ui", "TableHeader")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.materialUi.mod.TableHeader] {
    
    inline def adjustForCheckbox(value: Boolean): this.type = set("adjustForCheckbox", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def displaySelectAll(value: Boolean): this.type = set("displaySelectAll", value.asInstanceOf[js.Any])
    
    inline def enableSelectAll(value: Boolean): this.type = set("enableSelectAll", value.asInstanceOf[js.Any])
    
    inline def onSelectAll(value: /* checked */ Boolean => Callback): this.type = set("onSelectAll", js.Any.fromFunction1((t0: /* checked */ Boolean) => value(t0).runNow()))
    
    inline def selectAllSelected(value: Boolean): this.type = set("selectAllSelected", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: TableHeader.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TableHeaderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
