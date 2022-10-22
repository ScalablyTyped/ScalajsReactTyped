package typingsJapgolly.awsSdkClientDynamodbNode

import typingsJapgolly.awsSdkClientDynamodbNode.typesCreateBackupExceptionsUnionMod.CreateBackupExceptionsUnion
import typingsJapgolly.awsSdkClientDynamodbNode.typesDeleteBackupExceptionsUnionMod.DeleteBackupExceptionsUnion
import typingsJapgolly.awsSdkClientDynamodbNode.typesRestoreTableFromBackupExceptionsUnionMod.RestoreTableFromBackupExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBackupInUseExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_BackupInUseExceptionDetails> * / any */ trait BackupInUseException
    extends StObject
       with CreateBackupExceptionsUnion
       with DeleteBackupExceptionsUnion
       with RestoreTableFromBackupExceptionsUnion {
    
    var name: typingsJapgolly.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.BackupInUseException
  }
  object BackupInUseException {
    
    inline def apply(): BackupInUseException = {
      val __obj = js.Dynamic.literal(name = "BackupInUseException")
      __obj.asInstanceOf[BackupInUseException]
    }
    
    extension [Self <: BackupInUseException](x: Self) {
      
      inline def setName(
        value: typingsJapgolly.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.BackupInUseException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait BackupInUseExceptionDetails extends StObject {
    
    /**
      * _ErrorMessage shape
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object BackupInUseExceptionDetails {
    
    inline def apply(): BackupInUseExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BackupInUseExceptionDetails]
    }
    
    extension [Self <: BackupInUseExceptionDetails](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
