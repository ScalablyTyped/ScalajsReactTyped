package typingsJapgolly.sharepoint.SPClientTemplates

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderContextFieldInForm
  extends StObject
     with RenderContextForm {
  
  var CurrentFieldSchema: FieldSchemaInForm
  
  var CurrentFieldValue: Any
  
  var CurrentGroup: Group
  
  var CurrentGroupIdx: Double
  
  var CurrentItems: js.Array[Item]
}
object RenderContextFieldInForm {
  
  inline def apply(
    CurrentFieldSchema: FieldSchemaInForm,
    CurrentFieldValue: Any,
    CurrentGroup: Group,
    CurrentGroupIdx: Double,
    CurrentItem: Item,
    CurrentItems: js.Array[Item],
    FieldControlModes: StringDictionary[ClientControlMode],
    FormContext: ClientFormContext,
    FormUniqueId: String,
    ListData: ListDataInForm,
    ListSchema: ListSchemaInForm
  ): RenderContextFieldInForm = {
    val __obj = js.Dynamic.literal(CurrentFieldSchema = CurrentFieldSchema.asInstanceOf[js.Any], CurrentFieldValue = CurrentFieldValue.asInstanceOf[js.Any], CurrentGroup = CurrentGroup.asInstanceOf[js.Any], CurrentGroupIdx = CurrentGroupIdx.asInstanceOf[js.Any], CurrentItem = CurrentItem.asInstanceOf[js.Any], CurrentItems = CurrentItems.asInstanceOf[js.Any], FieldControlModes = FieldControlModes.asInstanceOf[js.Any], FormContext = FormContext.asInstanceOf[js.Any], FormUniqueId = FormUniqueId.asInstanceOf[js.Any], ListData = ListData.asInstanceOf[js.Any], ListSchema = ListSchema.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderContextFieldInForm]
  }
  
  extension [Self <: RenderContextFieldInForm](x: Self) {
    
    inline def setCurrentFieldSchema(value: FieldSchemaInForm): Self = StObject.set(x, "CurrentFieldSchema", value.asInstanceOf[js.Any])
    
    inline def setCurrentFieldValue(value: Any): Self = StObject.set(x, "CurrentFieldValue", value.asInstanceOf[js.Any])
    
    inline def setCurrentGroup(value: Group): Self = StObject.set(x, "CurrentGroup", value.asInstanceOf[js.Any])
    
    inline def setCurrentGroupIdx(value: Double): Self = StObject.set(x, "CurrentGroupIdx", value.asInstanceOf[js.Any])
    
    inline def setCurrentItems(value: js.Array[Item]): Self = StObject.set(x, "CurrentItems", value.asInstanceOf[js.Any])
    
    inline def setCurrentItemsVarargs(value: Item*): Self = StObject.set(x, "CurrentItems", js.Array(value*))
  }
}
