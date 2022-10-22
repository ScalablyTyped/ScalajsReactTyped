package typingsJapgolly.awsSdkClientSqsNode

import typingsJapgolly.awsSdkClientSqsNode.typesCreateQueueExceptionsUnionMod.CreateQueueExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesQueueNameExistsMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_QueueNameExistsDetails> * / any */ trait QueueNameExists
    extends StObject
       with CreateQueueExceptionsUnion {
    
    var name: typingsJapgolly.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.QueueNameExists
  }
  object QueueNameExists {
    
    inline def apply(): QueueNameExists = {
      val __obj = js.Dynamic.literal(name = "QueueNameExists")
      __obj.asInstanceOf[QueueNameExists]
    }
    
    extension [Self <: QueueNameExists](x: Self) {
      
      inline def setName(value: typingsJapgolly.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.QueueNameExists): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait QueueNameExistsDetails extends StObject
}
