package typingsJapgolly.awsSdkClientCodecommitNode

import typingsJapgolly.awsSdkClientCodecommitNode.typesGetMergeConflictsExceptionsUnionMod.GetMergeConflictsExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidSourceCommitSpecifierExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidSourceCommitSpecifierExceptionDetails> * / any */ trait InvalidSourceCommitSpecifierException
    extends StObject
       with GetMergeConflictsExceptionsUnion {
    
    var name: typingsJapgolly.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidSourceCommitSpecifierException
  }
  object InvalidSourceCommitSpecifierException {
    
    inline def apply(): InvalidSourceCommitSpecifierException = {
      val __obj = js.Dynamic.literal(name = "InvalidSourceCommitSpecifierException")
      __obj.asInstanceOf[InvalidSourceCommitSpecifierException]
    }
    
    extension [Self <: InvalidSourceCommitSpecifierException](x: Self) {
      
      inline def setName(
        value: typingsJapgolly.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidSourceCommitSpecifierException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait InvalidSourceCommitSpecifierExceptionDetails extends StObject
}
