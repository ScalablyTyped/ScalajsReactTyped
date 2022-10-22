package typingsJapgolly.awsSdkClientSqsNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesChangeMessageVisibilityExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdkClientSqsNode.typesMessageNotInflightMod.MessageNotInflight
    - typingsJapgolly.awsSdkClientSqsNode.typesReceiptHandleIsInvalidMod.ReceiptHandleIsInvalid
  */
  trait ChangeMessageVisibilityExceptionsUnion extends StObject
  object ChangeMessageVisibilityExceptionsUnion {
    
    inline def MessageNotInflight(): typingsJapgolly.awsSdkClientSqsNode.typesMessageNotInflightMod.MessageNotInflight = {
      val __obj = js.Dynamic.literal(name = "MessageNotInflight")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientSqsNode.typesMessageNotInflightMod.MessageNotInflight]
    }
    
    inline def ReceiptHandleIsInvalid(): typingsJapgolly.awsSdkClientSqsNode.typesReceiptHandleIsInvalidMod.ReceiptHandleIsInvalid = {
      val __obj = js.Dynamic.literal(name = "ReceiptHandleIsInvalid")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientSqsNode.typesReceiptHandleIsInvalidMod.ReceiptHandleIsInvalid]
    }
  }
}
