package typingsJapgolly.reactDataGrid.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.ExcelColumn
import typingsJapgolly.reactDataGrid.AdazzleReactDataGridPlugins.AutoCompleteTokensEditorProps
import typingsJapgolly.reactDataGrid.anon.Caption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AutoCompleteTokensEditor {
  
  inline def apply(options: js.Array[String | Caption]): Builder = {
    val __props = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[AutoCompleteTokensEditorProps]))
  }
  
  @JSGlobal("AdazzleReactDataGridPlugins.Editors.AutoCompleteTokensEditor")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[
          typingsJapgolly.reactDataGrid.global.AdazzleReactDataGridPlugins.Editors.AutoCompleteTokensEditor
        ] {
    
    inline def column(value: ExcelColumn): this.type = set("column", value.asInstanceOf[js.Any])
    
    inline def value(value: js.Array[Any]): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def valueVarargs(value: Any*): this.type = set("value", js.Array(value*))
  }
  
  def withProps(p: AutoCompleteTokensEditorProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
