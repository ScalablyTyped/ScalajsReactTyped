package typingsJapgolly.mongodb.mod

import typingsJapgolly.bson.mod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropCollectionOptions
  extends StObject
     with CommandOperationOptions {
  
  /** @experimental */
  var encryptedFields: js.UndefOr[Document] = js.undefined
}
object DropCollectionOptions {
  
  inline def apply(): DropCollectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropCollectionOptions]
  }
  
  extension [Self <: DropCollectionOptions](x: Self) {
    
    inline def setEncryptedFields(value: Document): Self = StObject.set(x, "encryptedFields", value.asInstanceOf[js.Any])
    
    inline def setEncryptedFieldsUndefined: Self = StObject.set(x, "encryptedFields", js.undefined)
  }
}
