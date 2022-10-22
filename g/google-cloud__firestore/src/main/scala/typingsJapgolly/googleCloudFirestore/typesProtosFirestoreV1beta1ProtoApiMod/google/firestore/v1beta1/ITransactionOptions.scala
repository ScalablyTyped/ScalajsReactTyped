package typingsJapgolly.googleCloudFirestore.typesProtosFirestoreV1beta1ProtoApiMod.google.firestore.v1beta1

import typingsJapgolly.googleCloudFirestore.typesProtosFirestoreV1beta1ProtoApiMod.google.firestore.v1beta1.TransactionOptions.IReadOnly
import typingsJapgolly.googleCloudFirestore.typesProtosFirestoreV1beta1ProtoApiMod.google.firestore.v1beta1.TransactionOptions.IReadWrite
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a TransactionOptions. */
trait ITransactionOptions extends StObject {
  
  /** TransactionOptions readOnly */
  var readOnly: js.UndefOr[IReadOnly | Null] = js.undefined
  
  /** TransactionOptions readWrite */
  var readWrite: js.UndefOr[IReadWrite | Null] = js.undefined
}
object ITransactionOptions {
  
  inline def apply(): ITransactionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITransactionOptions]
  }
  
  extension [Self <: ITransactionOptions](x: Self) {
    
    inline def setReadOnly(value: IReadOnly): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyNull: Self = StObject.set(x, "readOnly", null)
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setReadWrite(value: IReadWrite): Self = StObject.set(x, "readWrite", value.asInstanceOf[js.Any])
    
    inline def setReadWriteNull: Self = StObject.set(x, "readWrite", null)
    
    inline def setReadWriteUndefined: Self = StObject.set(x, "readWrite", js.undefined)
  }
}
