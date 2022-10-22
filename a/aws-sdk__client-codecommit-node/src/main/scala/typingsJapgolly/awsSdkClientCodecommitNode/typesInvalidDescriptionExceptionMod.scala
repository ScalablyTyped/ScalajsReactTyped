package typingsJapgolly.awsSdkClientCodecommitNode

import typingsJapgolly.awsSdkClientCodecommitNode.typesCreatePullRequestExceptionsUnionMod.CreatePullRequestExceptionsUnion
import typingsJapgolly.awsSdkClientCodecommitNode.typesUpdatePullRequestDescriptionExceptionsUnionMod.UpdatePullRequestDescriptionExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidDescriptionExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidDescriptionExceptionDetails> * / any */ trait InvalidDescriptionException
    extends StObject
       with CreatePullRequestExceptionsUnion
       with UpdatePullRequestDescriptionExceptionsUnion {
    
    var name: typingsJapgolly.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidDescriptionException
  }
  object InvalidDescriptionException {
    
    inline def apply(): InvalidDescriptionException = {
      val __obj = js.Dynamic.literal(name = "InvalidDescriptionException")
      __obj.asInstanceOf[InvalidDescriptionException]
    }
    
    extension [Self <: InvalidDescriptionException](x: Self) {
      
      inline def setName(
        value: typingsJapgolly.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidDescriptionException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait InvalidDescriptionExceptionDetails extends StObject
}
