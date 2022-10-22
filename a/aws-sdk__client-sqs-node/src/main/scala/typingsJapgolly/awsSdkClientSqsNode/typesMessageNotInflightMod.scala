package typingsJapgolly.awsSdkClientSqsNode

import typingsJapgolly.awsSdkClientSqsNode.typesChangeMessageVisibilityExceptionsUnionMod.ChangeMessageVisibilityExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMessageNotInflightMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_MessageNotInflightDetails> * / any */ trait MessageNotInflight
    extends StObject
       with ChangeMessageVisibilityExceptionsUnion {
    
    var name: typingsJapgolly.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.MessageNotInflight
  }
  object MessageNotInflight {
    
    inline def apply(): MessageNotInflight = {
      val __obj = js.Dynamic.literal(name = "MessageNotInflight")
      __obj.asInstanceOf[MessageNotInflight]
    }
    
    extension [Self <: MessageNotInflight](x: Self) {
      
      inline def setName(value: typingsJapgolly.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.MessageNotInflight): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait MessageNotInflightDetails extends StObject
}
