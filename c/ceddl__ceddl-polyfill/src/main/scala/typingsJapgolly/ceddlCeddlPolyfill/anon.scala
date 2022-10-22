package typingsJapgolly.ceddlCeddlPolyfill

import typingsJapgolly.ceddlCeddlPolyfill.mod.BooleanField
import typingsJapgolly.ceddlCeddlPolyfill.mod.ListField
import typingsJapgolly.ceddlCeddlPolyfill.mod.ModelField
import typingsJapgolly.ceddlCeddlPolyfill.mod.NumberField
import typingsJapgolly.ceddlCeddlPolyfill.mod.StringField
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ArrayField extends StObject {
    
    var ArrayField: typingsJapgolly.ceddlCeddlPolyfill.mod.ArrayField
    
    var BooleanField: typingsJapgolly.ceddlCeddlPolyfill.mod.BooleanField
    
    var ListField: typingsJapgolly.ceddlCeddlPolyfill.mod.ListField
    
    var ModelField: typingsJapgolly.ceddlCeddlPolyfill.mod.ModelField
    
    var NumberField: typingsJapgolly.ceddlCeddlPolyfill.mod.NumberField
    
    var StringField: typingsJapgolly.ceddlCeddlPolyfill.mod.StringField
  }
  object ArrayField {
    
    inline def apply(
      ArrayField: typingsJapgolly.ceddlCeddlPolyfill.mod.ArrayField,
      BooleanField: BooleanField,
      ListField: ListField,
      ModelField: ModelField,
      NumberField: NumberField,
      StringField: StringField
    ): ArrayField = {
      val __obj = js.Dynamic.literal(ArrayField = ArrayField.asInstanceOf[js.Any], BooleanField = BooleanField.asInstanceOf[js.Any], ListField = ListField.asInstanceOf[js.Any], ModelField = ModelField.asInstanceOf[js.Any], NumberField = NumberField.asInstanceOf[js.Any], StringField = StringField.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArrayField]
    }
    
    extension [Self <: ArrayField](x: Self) {
      
      inline def setArrayField(value: typingsJapgolly.ceddlCeddlPolyfill.mod.ArrayField): Self = StObject.set(x, "ArrayField", value.asInstanceOf[js.Any])
      
      inline def setBooleanField(value: BooleanField): Self = StObject.set(x, "BooleanField", value.asInstanceOf[js.Any])
      
      inline def setListField(value: ListField): Self = StObject.set(x, "ListField", value.asInstanceOf[js.Any])
      
      inline def setModelField(value: ModelField): Self = StObject.set(x, "ModelField", value.asInstanceOf[js.Any])
      
      inline def setNumberField(value: NumberField): Self = StObject.set(x, "NumberField", value.asInstanceOf[js.Any])
      
      inline def setStringField(value: StringField): Self = StObject.set(x, "StringField", value.asInstanceOf[js.Any])
    }
  }
  
  trait FieldType extends StObject {
    
    var fieldType: js.UndefOr[StringField | BooleanField | NumberField] = js.undefined
    
    var foreignModel: js.UndefOr[String] = js.undefined
    
    var pattern: js.UndefOr[String] = js.undefined
    
    // only used when ArrayField
    var required: Boolean
    
    var `type`: StringField | BooleanField | ModelField | ListField | NumberField | typingsJapgolly.ceddlCeddlPolyfill.mod.ArrayField
  }
  object FieldType {
    
    inline def apply(
      required: Boolean,
      `type`: StringField | BooleanField | ModelField | ListField | NumberField | typingsJapgolly.ceddlCeddlPolyfill.mod.ArrayField
    ): FieldType = {
      val __obj = js.Dynamic.literal(required = required.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldType]
    }
    
    extension [Self <: FieldType](x: Self) {
      
      inline def setFieldType(value: StringField | BooleanField | NumberField): Self = StObject.set(x, "fieldType", value.asInstanceOf[js.Any])
      
      inline def setFieldTypeUndefined: Self = StObject.set(x, "fieldType", js.undefined)
      
      inline def setForeignModel(value: String): Self = StObject.set(x, "foreignModel", value.asInstanceOf[js.Any])
      
      inline def setForeignModelUndefined: Self = StObject.set(x, "foreignModel", js.undefined)
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setType(
        value: StringField | BooleanField | ModelField | ListField | NumberField | typingsJapgolly.ceddlCeddlPolyfill.mod.ArrayField
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
