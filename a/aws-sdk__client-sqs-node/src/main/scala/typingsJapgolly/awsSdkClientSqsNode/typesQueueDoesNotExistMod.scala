package typingsJapgolly.awsSdkClientSqsNode

import typingsJapgolly.awsSdkClientSqsNode.typesPurgeQueueExceptionsUnionMod.PurgeQueueExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesQueueDoesNotExistMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_QueueDoesNotExistDetails> * / any */ trait QueueDoesNotExist
    extends StObject
       with PurgeQueueExceptionsUnion {
    
    var name: typingsJapgolly.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.QueueDoesNotExist
  }
  object QueueDoesNotExist {
    
    inline def apply(): QueueDoesNotExist = {
      val __obj = js.Dynamic.literal(name = "QueueDoesNotExist")
      __obj.asInstanceOf[QueueDoesNotExist]
    }
    
    extension [Self <: QueueDoesNotExist](x: Self) {
      
      inline def setName(value: typingsJapgolly.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.QueueDoesNotExist): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait QueueDoesNotExistDetails extends StObject
}
