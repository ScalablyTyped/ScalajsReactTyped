package typingsJapgolly.awsSdkClientCodecommitNode

import typingsJapgolly.awsSdkClientCodecommitNode.typesPutFileExceptionsUnionMod.PutFileExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDirectoryNameConflictsWithFileNameExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_DirectoryNameConflictsWithFileNameExceptionDetails> * / any */ trait DirectoryNameConflictsWithFileNameException
    extends StObject
       with PutFileExceptionsUnion {
    
    var name: typingsJapgolly.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.DirectoryNameConflictsWithFileNameException
  }
  object DirectoryNameConflictsWithFileNameException {
    
    inline def apply(): DirectoryNameConflictsWithFileNameException = {
      val __obj = js.Dynamic.literal(name = "DirectoryNameConflictsWithFileNameException")
      __obj.asInstanceOf[DirectoryNameConflictsWithFileNameException]
    }
    
    extension [Self <: DirectoryNameConflictsWithFileNameException](x: Self) {
      
      inline def setName(
        value: typingsJapgolly.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.DirectoryNameConflictsWithFileNameException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait DirectoryNameConflictsWithFileNameExceptionDetails extends StObject
}
