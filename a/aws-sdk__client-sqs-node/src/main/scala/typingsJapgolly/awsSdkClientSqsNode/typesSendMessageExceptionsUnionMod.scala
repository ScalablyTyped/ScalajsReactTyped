package typingsJapgolly.awsSdkClientSqsNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSendMessageExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdkClientSqsNode.typesInvalidMessageContentsMod.InvalidMessageContents
    - typingsJapgolly.awsSdkClientSqsNode.typesUnsupportedOperationMod.UnsupportedOperation
  */
  trait SendMessageExceptionsUnion extends StObject
  object SendMessageExceptionsUnion {
    
    inline def InvalidMessageContents(): typingsJapgolly.awsSdkClientSqsNode.typesInvalidMessageContentsMod.InvalidMessageContents = {
      val __obj = js.Dynamic.literal(name = "InvalidMessageContents")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientSqsNode.typesInvalidMessageContentsMod.InvalidMessageContents]
    }
    
    inline def UnsupportedOperation(): typingsJapgolly.awsSdkClientSqsNode.typesUnsupportedOperationMod.UnsupportedOperation = {
      val __obj = js.Dynamic.literal(name = "UnsupportedOperation")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientSqsNode.typesUnsupportedOperationMod.UnsupportedOperation]
    }
  }
}
