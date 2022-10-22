package typingsJapgolly.awsSdkClientCodecommitNode

import typingsJapgolly.awsSdkClientCodecommitNode.typesPutRepositoryTriggersExceptionsUnionMod.PutRepositoryTriggersExceptionsUnion
import typingsJapgolly.awsSdkClientCodecommitNode.typesTestRepositoryTriggersExceptionsUnionMod.TestRepositoryTriggersExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRepositoryTriggerBranchNameListRequiredExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_RepositoryTriggerBranchNameListRequiredExceptionDetails> * / any */ trait RepositoryTriggerBranchNameListRequiredException
    extends StObject
       with PutRepositoryTriggersExceptionsUnion
       with TestRepositoryTriggersExceptionsUnion {
    
    var name: typingsJapgolly.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.RepositoryTriggerBranchNameListRequiredException
  }
  object RepositoryTriggerBranchNameListRequiredException {
    
    inline def apply(): RepositoryTriggerBranchNameListRequiredException = {
      val __obj = js.Dynamic.literal(name = "RepositoryTriggerBranchNameListRequiredException")
      __obj.asInstanceOf[RepositoryTriggerBranchNameListRequiredException]
    }
    
    extension [Self <: RepositoryTriggerBranchNameListRequiredException](x: Self) {
      
      inline def setName(
        value: typingsJapgolly.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.RepositoryTriggerBranchNameListRequiredException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait RepositoryTriggerBranchNameListRequiredExceptionDetails extends StObject
}
