package typingsJapgolly.reactDataGrid.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.ExcelColumn
import typingsJapgolly.reactDataGrid.AdazzleReactDataGridPlugins.AutoCompleteEditorProps
import typingsJapgolly.reactDataGrid.anon.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AutoComplete {
  
  @JSGlobal("AdazzleReactDataGridPlugins.Editors.AutoComplete")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[
          typingsJapgolly.reactDataGrid.global.AdazzleReactDataGridPlugins.Editors.AutoComplete
        ] {
    
    inline def column(value: ExcelColumn): this.type = set("column", value.asInstanceOf[js.Any])
    
    inline def editorDisplayValue(value: (/* column */ ExcelColumn, /* value */ Any) => String): this.type = set("editorDisplayValue", js.Any.fromFunction2(value))
    
    inline def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def label(value: Any): this.type = set("label", value.asInstanceOf[js.Any])
    
    inline def onCommit(value: Callback): this.type = set("onCommit", value.toJsFn)
    
    inline def onFocus(value: Callback): this.type = set("onFocus", value.toJsFn)
    
    inline def onKeyDown(value: Callback): this.type = set("onKeyDown", value.toJsFn)
    
    inline def options(value: js.Array[Id]): this.type = set("options", value.asInstanceOf[js.Any])
    
    inline def optionsVarargs(value: Id*): this.type = set("options", js.Array(value*))
    
    inline def resultIdentifier(value: String): this.type = set("resultIdentifier", value.asInstanceOf[js.Any])
    
    inline def search(value: String): this.type = set("search", value.asInstanceOf[js.Any])
    
    inline def value(value: Any): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def valueParams(value: js.Array[String]): this.type = set("valueParams", value.asInstanceOf[js.Any])
    
    inline def valueParamsVarargs(value: String*): this.type = set("valueParams", js.Array(value*))
  }
  
  implicit def make(companion: AutoComplete.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: AutoCompleteEditorProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
