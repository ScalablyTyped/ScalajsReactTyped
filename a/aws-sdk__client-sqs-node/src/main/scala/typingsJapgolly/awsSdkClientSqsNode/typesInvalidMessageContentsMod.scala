package typingsJapgolly.awsSdkClientSqsNode

import typingsJapgolly.awsSdkClientSqsNode.typesSendMessageExceptionsUnionMod.SendMessageExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidMessageContentsMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidMessageContentsDetails> * / any */ trait InvalidMessageContents
    extends StObject
       with SendMessageExceptionsUnion {
    
    var name: typingsJapgolly.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.InvalidMessageContents
  }
  object InvalidMessageContents {
    
    inline def apply(): InvalidMessageContents = {
      val __obj = js.Dynamic.literal(name = "InvalidMessageContents")
      __obj.asInstanceOf[InvalidMessageContents]
    }
    
    extension [Self <: InvalidMessageContents](x: Self) {
      
      inline def setName(value: typingsJapgolly.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.InvalidMessageContents): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait InvalidMessageContentsDetails extends StObject
}
