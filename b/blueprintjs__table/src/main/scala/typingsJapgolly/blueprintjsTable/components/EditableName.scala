package typingsJapgolly.blueprintjsTable.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.blueprintjsCore.libEsmCommonIntentMod.Intent
import typingsJapgolly.blueprintjsTable.libEsmHeadersEditableNameMod.IEditableNameProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object EditableName {
  
  @JSImport("@blueprintjs/table", "EditableName")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.blueprintjsTable.mod.EditableName] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def index(value: Double): this.type = set("index", value.asInstanceOf[js.Any])
    
    inline def intent(value: Intent): this.type = set("intent", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def onCancel(value: (/* value */ String, /* columnIndex */ js.UndefOr[Double]) => Callback): this.type = set("onCancel", js.Any.fromFunction2((t0: /* value */ String, t1: /* columnIndex */ js.UndefOr[Double]) => (value(t0, t1)).runNow()))
    
    inline def onChange(value: (/* value */ String, /* columnIndex */ js.UndefOr[Double]) => Callback): this.type = set("onChange", js.Any.fromFunction2((t0: /* value */ String, t1: /* columnIndex */ js.UndefOr[Double]) => (value(t0, t1)).runNow()))
    
    inline def onConfirm(value: (/* value */ String, /* columnIndex */ js.UndefOr[Double]) => Callback): this.type = set("onConfirm", js.Any.fromFunction2((t0: /* value */ String, t1: /* columnIndex */ js.UndefOr[Double]) => (value(t0, t1)).runNow()))
  }
  
  implicit def make(companion: EditableName.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IEditableNameProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
