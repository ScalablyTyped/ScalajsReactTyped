package typingsJapgolly.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDatasetFieldValueIsEqualMod {
  
  inline def apply(ds: DataSet, fieldName: String, value: Any): Boolean = (^.asInstanceOf[js.Dynamic].apply(ds.asInstanceOf[js.Any], fieldName.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("@nginstack/engine/lib/dataset/fieldValueIsEqual", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type DataSet = typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^
}
