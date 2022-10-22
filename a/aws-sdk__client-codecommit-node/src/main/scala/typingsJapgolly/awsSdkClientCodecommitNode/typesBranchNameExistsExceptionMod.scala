package typingsJapgolly.awsSdkClientCodecommitNode

import typingsJapgolly.awsSdkClientCodecommitNode.typesCreateBranchExceptionsUnionMod.CreateBranchExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBranchNameExistsExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_BranchNameExistsExceptionDetails> * / any */ trait BranchNameExistsException
    extends StObject
       with CreateBranchExceptionsUnion {
    
    var name: typingsJapgolly.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.BranchNameExistsException
  }
  object BranchNameExistsException {
    
    inline def apply(): BranchNameExistsException = {
      val __obj = js.Dynamic.literal(name = "BranchNameExistsException")
      __obj.asInstanceOf[BranchNameExistsException]
    }
    
    extension [Self <: BranchNameExistsException](x: Self) {
      
      inline def setName(
        value: typingsJapgolly.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.BranchNameExistsException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait BranchNameExistsExceptionDetails extends StObject
}
