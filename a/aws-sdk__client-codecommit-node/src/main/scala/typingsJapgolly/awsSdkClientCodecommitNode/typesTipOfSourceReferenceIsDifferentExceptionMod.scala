package typingsJapgolly.awsSdkClientCodecommitNode

import typingsJapgolly.awsSdkClientCodecommitNode.typesMergePullRequestByFastForwardExceptionsUnionMod.MergePullRequestByFastForwardExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTipOfSourceReferenceIsDifferentExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_TipOfSourceReferenceIsDifferentExceptionDetails> * / any */ trait TipOfSourceReferenceIsDifferentException
    extends StObject
       with MergePullRequestByFastForwardExceptionsUnion {
    
    var name: typingsJapgolly.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.TipOfSourceReferenceIsDifferentException
  }
  object TipOfSourceReferenceIsDifferentException {
    
    inline def apply(): TipOfSourceReferenceIsDifferentException = {
      val __obj = js.Dynamic.literal(name = "TipOfSourceReferenceIsDifferentException")
      __obj.asInstanceOf[TipOfSourceReferenceIsDifferentException]
    }
    
    extension [Self <: TipOfSourceReferenceIsDifferentException](x: Self) {
      
      inline def setName(
        value: typingsJapgolly.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.TipOfSourceReferenceIsDifferentException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait TipOfSourceReferenceIsDifferentExceptionDetails extends StObject
}
