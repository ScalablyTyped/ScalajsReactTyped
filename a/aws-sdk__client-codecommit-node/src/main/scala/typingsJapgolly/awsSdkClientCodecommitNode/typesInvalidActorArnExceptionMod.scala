package typingsJapgolly.awsSdkClientCodecommitNode

import typingsJapgolly.awsSdkClientCodecommitNode.typesDescribePullRequestEventsExceptionsUnionMod.DescribePullRequestEventsExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidActorArnExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidActorArnExceptionDetails> * / any */ trait InvalidActorArnException
    extends StObject
       with DescribePullRequestEventsExceptionsUnion {
    
    var name: typingsJapgolly.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidActorArnException
  }
  object InvalidActorArnException {
    
    inline def apply(): InvalidActorArnException = {
      val __obj = js.Dynamic.literal(name = "InvalidActorArnException")
      __obj.asInstanceOf[InvalidActorArnException]
    }
    
    extension [Self <: InvalidActorArnException](x: Self) {
      
      inline def setName(
        value: typingsJapgolly.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidActorArnException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait InvalidActorArnExceptionDetails extends StObject
}
