package typingsJapgolly.awsSdkClientCodecommitNode

import typingsJapgolly.awsSdkClientCodecommitNode.typesCreatePullRequestExceptionsUnionMod.CreatePullRequestExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTargetRequiredExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_TargetRequiredExceptionDetails> * / any */ trait TargetRequiredException
    extends StObject
       with CreatePullRequestExceptionsUnion {
    
    var name: typingsJapgolly.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.TargetRequiredException
  }
  object TargetRequiredException {
    
    inline def apply(): TargetRequiredException = {
      val __obj = js.Dynamic.literal(name = "TargetRequiredException")
      __obj.asInstanceOf[TargetRequiredException]
    }
    
    extension [Self <: TargetRequiredException](x: Self) {
      
      inline def setName(
        value: typingsJapgolly.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.TargetRequiredException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait TargetRequiredExceptionDetails extends StObject
}
