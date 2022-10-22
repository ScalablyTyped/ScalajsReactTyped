package typingsJapgolly.awsSdkClientCodecommitNode

import typingsJapgolly.awsSdkClientCodecommitNode.typesPutRepositoryTriggersExceptionsUnionMod.PutRepositoryTriggersExceptionsUnion
import typingsJapgolly.awsSdkClientCodecommitNode.typesTestRepositoryTriggersExceptionsUnionMod.TestRepositoryTriggersExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMaximumRepositoryTriggersExceededExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_MaximumRepositoryTriggersExceededExceptionDetails> * / any */ trait MaximumRepositoryTriggersExceededException
    extends StObject
       with PutRepositoryTriggersExceptionsUnion
       with TestRepositoryTriggersExceptionsUnion {
    
    var name: typingsJapgolly.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.MaximumRepositoryTriggersExceededException
  }
  object MaximumRepositoryTriggersExceededException {
    
    inline def apply(): MaximumRepositoryTriggersExceededException = {
      val __obj = js.Dynamic.literal(name = "MaximumRepositoryTriggersExceededException")
      __obj.asInstanceOf[MaximumRepositoryTriggersExceededException]
    }
    
    extension [Self <: MaximumRepositoryTriggersExceededException](x: Self) {
      
      inline def setName(
        value: typingsJapgolly.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.MaximumRepositoryTriggersExceededException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait MaximumRepositoryTriggersExceededExceptionDetails extends StObject
}
