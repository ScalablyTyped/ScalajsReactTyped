package typingsJapgolly.awsSdkClientCodecommitNode

import typingsJapgolly.awsSdkClientCodecommitNode.typesPutRepositoryTriggersExceptionsUnionMod.PutRepositoryTriggersExceptionsUnion
import typingsJapgolly.awsSdkClientCodecommitNode.typesTestRepositoryTriggersExceptionsUnionMod.TestRepositoryTriggersExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidRepositoryTriggerNameExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidRepositoryTriggerNameExceptionDetails> * / any */ trait InvalidRepositoryTriggerNameException
    extends StObject
       with PutRepositoryTriggersExceptionsUnion
       with TestRepositoryTriggersExceptionsUnion {
    
    var name: typingsJapgolly.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidRepositoryTriggerNameException
  }
  object InvalidRepositoryTriggerNameException {
    
    inline def apply(): InvalidRepositoryTriggerNameException = {
      val __obj = js.Dynamic.literal(name = "InvalidRepositoryTriggerNameException")
      __obj.asInstanceOf[InvalidRepositoryTriggerNameException]
    }
    
    extension [Self <: InvalidRepositoryTriggerNameException](x: Self) {
      
      inline def setName(
        value: typingsJapgolly.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidRepositoryTriggerNameException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait InvalidRepositoryTriggerNameExceptionDetails extends StObject
}
