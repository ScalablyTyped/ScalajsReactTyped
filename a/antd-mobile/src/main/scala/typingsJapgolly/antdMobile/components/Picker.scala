package typingsJapgolly.antdMobile.components

import typingsJapgolly.antdMobile.anon.columnsArrayPickerColumnv
import typingsJapgolly.antdMobile.esComponentsPickerPickerMod.PickerActions
import typingsJapgolly.antdMobile.esComponentsPickerViewPickerViewMod.PickerColumn
import typingsJapgolly.antdMobile.esComponentsPickerViewPickerViewMod.PickerValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Picker {
  
  inline def apply(
    columns: js.Array[PickerColumn] | (js.Function1[/* value */ js.Array[PickerValue], js.Array[PickerColumn]])
  ): SharedBuilder_columnsArrayPickerColumnv_1942552892[PickerActions] = {
    val __props = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any])
    new SharedBuilder_columnsArrayPickerColumnv_1942552892[PickerActions](js.Array(this.component, __props.asInstanceOf[columnsArrayPickerColumnv]))
  }
  
  object Type {
    
    inline def apply(
      columns: js.Array[PickerColumn] | (js.Function1[/* value */ js.Array[PickerValue], js.Array[PickerColumn]])
    ): SharedBuilder_columnsArrayPickerColumnv_1942552892[PickerActions] = {
      val __props = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any])
      new SharedBuilder_columnsArrayPickerColumnv_1942552892[PickerActions](js.Array(this.component, __props.asInstanceOf[columnsArrayPickerColumnv]))
    }
    
    @JSImport("antd-mobile", "Picker.type")
    @js.native
    val component: js.Object = js.native
    
    def withProps(p: columnsArrayPickerColumnv): SharedBuilder_columnsArrayPickerColumnv_1942552892[PickerActions] = new SharedBuilder_columnsArrayPickerColumnv_1942552892[PickerActions](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("antd-mobile", "Picker")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: columnsArrayPickerColumnv): SharedBuilder_columnsArrayPickerColumnv_1942552892[PickerActions] = new SharedBuilder_columnsArrayPickerColumnv_1942552892[PickerActions](js.Array(this.component, p.asInstanceOf[js.Any]))
}
