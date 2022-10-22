package typingsJapgolly.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTestingDatasetAddFieldsMod {
  
  inline def apply(ds: DataSet, fields: js.Array[FieldObj]): DataSet = (^.asInstanceOf[js.Dynamic].apply(ds.asInstanceOf[js.Any], fields.asInstanceOf[js.Any])).asInstanceOf[DataSet]
  
  @JSImport("@nginstack/engine/lib/testing/dataset/addFields", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type DataSet = typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^
  
  trait FieldObj extends StObject {
    
    var name: String
    
    var size: js.UndefOr[Double] = js.undefined
    
    var `type`: String
  }
  object FieldObj {
    
    inline def apply(name: String, `type`: String): FieldObj = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldObj]
    }
    
    extension [Self <: FieldObj](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
