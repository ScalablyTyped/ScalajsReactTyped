package typingsJapgolly.firebaseFirestore.anon

import typingsJapgolly.firebaseFirestore.distFirestoreSrcLiteApiUserDataReaderMod.UserDataSource
import typingsJapgolly.firebaseFirestore.distFirestoreSrcModelDocumentKeyMod.DocumentKey
import typingsJapgolly.firebaseFirestore.distFirestoreSrcModelPathMod.FieldPath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@firebase/firestore.@firebase/firestore/dist/firestore/src/lite-api/user_data_reader.ContextSettings> */
trait PartialContextSettings extends StObject {
  
  var arrayElement: js.UndefOr[Boolean] = js.undefined
  
  var dataSource: js.UndefOr[UserDataSource] = js.undefined
  
  var hasConverter: js.UndefOr[Boolean] = js.undefined
  
  var methodName: js.UndefOr[String] = js.undefined
  
  var path: js.UndefOr[FieldPath] = js.undefined
  
  var targetDoc: js.UndefOr[DocumentKey] = js.undefined
}
object PartialContextSettings {
  
  inline def apply(): PartialContextSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialContextSettings]
  }
  
  extension [Self <: PartialContextSettings](x: Self) {
    
    inline def setArrayElement(value: Boolean): Self = StObject.set(x, "arrayElement", value.asInstanceOf[js.Any])
    
    inline def setArrayElementUndefined: Self = StObject.set(x, "arrayElement", js.undefined)
    
    inline def setDataSource(value: UserDataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setHasConverter(value: Boolean): Self = StObject.set(x, "hasConverter", value.asInstanceOf[js.Any])
    
    inline def setHasConverterUndefined: Self = StObject.set(x, "hasConverter", js.undefined)
    
    inline def setMethodName(value: String): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
    
    inline def setMethodNameUndefined: Self = StObject.set(x, "methodName", js.undefined)
    
    inline def setPath(value: FieldPath): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setTargetDoc(value: DocumentKey): Self = StObject.set(x, "targetDoc", value.asInstanceOf[js.Any])
    
    inline def setTargetDocUndefined: Self = StObject.set(x, "targetDoc", js.undefined)
  }
}
