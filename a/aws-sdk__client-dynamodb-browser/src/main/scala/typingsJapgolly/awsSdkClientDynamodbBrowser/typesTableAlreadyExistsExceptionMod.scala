package typingsJapgolly.awsSdkClientDynamodbBrowser

import typingsJapgolly.awsSdkClientDynamodbBrowser.typesRestoreTableFromBackupExceptionsUnionMod.RestoreTableFromBackupExceptionsUnion
import typingsJapgolly.awsSdkClientDynamodbBrowser.typesRestoreTableToPointInTimeExceptionsUnionMod.RestoreTableToPointInTimeExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTableAlreadyExistsExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_TableAlreadyExistsExceptionDetails> * / any */ trait TableAlreadyExistsException
    extends StObject
       with RestoreTableFromBackupExceptionsUnion
       with RestoreTableToPointInTimeExceptionsUnion {
    
    var name: typingsJapgolly.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.TableAlreadyExistsException
  }
  object TableAlreadyExistsException {
    
    inline def apply(): TableAlreadyExistsException = {
      val __obj = js.Dynamic.literal(name = "TableAlreadyExistsException")
      __obj.asInstanceOf[TableAlreadyExistsException]
    }
    
    extension [Self <: TableAlreadyExistsException](x: Self) {
      
      inline def setName(
        value: typingsJapgolly.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.TableAlreadyExistsException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait TableAlreadyExistsExceptionDetails extends StObject {
    
    /**
      * _ErrorMessage shape
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object TableAlreadyExistsExceptionDetails {
    
    inline def apply(): TableAlreadyExistsExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableAlreadyExistsExceptionDetails]
    }
    
    extension [Self <: TableAlreadyExistsExceptionDetails](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
