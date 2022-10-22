package typingsJapgolly.awsSdkClientSqsNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDeleteMessageExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdkClientSqsNode.typesInvalidIdFormatMod.InvalidIdFormat
    - typingsJapgolly.awsSdkClientSqsNode.typesReceiptHandleIsInvalidMod.ReceiptHandleIsInvalid
  */
  trait DeleteMessageExceptionsUnion extends StObject
  object DeleteMessageExceptionsUnion {
    
    inline def InvalidIdFormat(): typingsJapgolly.awsSdkClientSqsNode.typesInvalidIdFormatMod.InvalidIdFormat = {
      val __obj = js.Dynamic.literal(name = "InvalidIdFormat")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientSqsNode.typesInvalidIdFormatMod.InvalidIdFormat]
    }
    
    inline def ReceiptHandleIsInvalid(): typingsJapgolly.awsSdkClientSqsNode.typesReceiptHandleIsInvalidMod.ReceiptHandleIsInvalid = {
      val __obj = js.Dynamic.literal(name = "ReceiptHandleIsInvalid")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientSqsNode.typesReceiptHandleIsInvalidMod.ReceiptHandleIsInvalid]
    }
  }
}
