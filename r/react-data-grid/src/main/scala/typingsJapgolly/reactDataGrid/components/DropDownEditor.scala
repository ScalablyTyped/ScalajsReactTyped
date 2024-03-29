package typingsJapgolly.reactDataGrid.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactDataGrid.AdazzleReactDataGridPlugins.DropDownEditorProps
import typingsJapgolly.reactDataGrid.anon.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DropDownEditor {
  
  inline def apply(options: js.Array[String | Text]): Default[
    typingsJapgolly.reactDataGrid.global.AdazzleReactDataGridPlugins.Editors.DropDownEditor
  ] = {
    val __props = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    new Default[
    typingsJapgolly.reactDataGrid.global.AdazzleReactDataGridPlugins.Editors.DropDownEditor
  ](js.Array(this.component, __props.asInstanceOf[DropDownEditorProps]))
  }
  
  @JSGlobal("AdazzleReactDataGridPlugins.Editors.DropDownEditor")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: DropDownEditorProps): Default[
    typingsJapgolly.reactDataGrid.global.AdazzleReactDataGridPlugins.Editors.DropDownEditor
  ] = new Default[
    typingsJapgolly.reactDataGrid.global.AdazzleReactDataGridPlugins.Editors.DropDownEditor
  ](js.Array(this.component, p.asInstanceOf[js.Any]))
}
