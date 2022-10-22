package typingsJapgolly.firebaseFirestore.anon

import typingsJapgolly.firebaseFirestore.distFirestoreSrcLiteApiFieldPathMod.FieldPath
import typingsJapgolly.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.SetOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MergeFields
  extends StObject
     with SetOptions {
  
  val mergeFields: js.UndefOr[js.Array[String | FieldPath]] = js.undefined
}
object MergeFields {
  
  inline def apply(): MergeFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergeFields]
  }
  
  extension [Self <: MergeFields](x: Self) {
    
    inline def setMergeFields(value: js.Array[String | FieldPath]): Self = StObject.set(x, "mergeFields", value.asInstanceOf[js.Any])
    
    inline def setMergeFieldsUndefined: Self = StObject.set(x, "mergeFields", js.undefined)
    
    inline def setMergeFieldsVarargs(value: (String | FieldPath)*): Self = StObject.set(x, "mergeFields", js.Array(value*))
  }
}
