package typingsJapgolly.maximMazurokGapiClientDatastore.gapi.client.datastore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BeginTransactionRequest extends StObject {
  
  /** The ID of the database against which to make the request. '(default)' is not allowed; please use empty string '' to refer the default database. */
  var databaseId: js.UndefOr[String] = js.undefined
  
  /** Options for a new transaction. */
  var transactionOptions: js.UndefOr[TransactionOptions] = js.undefined
}
object BeginTransactionRequest {
  
  inline def apply(): BeginTransactionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeginTransactionRequest]
  }
  
  extension [Self <: BeginTransactionRequest](x: Self) {
    
    inline def setDatabaseId(value: String): Self = StObject.set(x, "databaseId", value.asInstanceOf[js.Any])
    
    inline def setDatabaseIdUndefined: Self = StObject.set(x, "databaseId", js.undefined)
    
    inline def setTransactionOptions(value: TransactionOptions): Self = StObject.set(x, "transactionOptions", value.asInstanceOf[js.Any])
    
    inline def setTransactionOptionsUndefined: Self = StObject.set(x, "transactionOptions", js.undefined)
  }
}
