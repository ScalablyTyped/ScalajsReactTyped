package typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcProtosFirestoreProtoApiMod.firestoreV1ApiClientInterfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentMask extends StObject {
  
  var fieldPaths: js.UndefOr[js.Array[String]] = js.undefined
}
object DocumentMask {
  
  inline def apply(): DocumentMask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentMask]
  }
  
  extension [Self <: DocumentMask](x: Self) {
    
    inline def setFieldPaths(value: js.Array[String]): Self = StObject.set(x, "fieldPaths", value.asInstanceOf[js.Any])
    
    inline def setFieldPathsUndefined: Self = StObject.set(x, "fieldPaths", js.undefined)
    
    inline def setFieldPathsVarargs(value: String*): Self = StObject.set(x, "fieldPaths", js.Array(value*))
  }
}
