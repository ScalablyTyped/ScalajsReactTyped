package typingsJapgolly.awsSdkClientKmsNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUntagResourceExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException
    - typingsJapgolly.awsSdkClientKmsNode.typesNotFoundExceptionMod.NotFoundException
    - typingsJapgolly.awsSdkClientKmsNode.typesInvalidArnExceptionMod.InvalidArnException
    - typingsJapgolly.awsSdkClientKmsNode.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
    - typingsJapgolly.awsSdkClientKmsNode.typesTagExceptionMod.TagException
  */
  trait UntagResourceExceptionsUnion extends StObject
  object UntagResourceExceptionsUnion {
    
    inline def InvalidArnException(): typingsJapgolly.awsSdkClientKmsNode.typesInvalidArnExceptionMod.InvalidArnException = {
      val __obj = js.Dynamic.literal(name = "InvalidArnException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsNode.typesInvalidArnExceptionMod.InvalidArnException]
    }
    
    inline def KMSInternalException(): typingsJapgolly.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException = {
      val __obj = js.Dynamic.literal(name = "KMSInternalException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException]
    }
    
    inline def KMSInvalidStateException(): typingsJapgolly.awsSdkClientKmsNode.typesKmsinvalidstateexceptionMod.KMSInvalidStateException = {
      val __obj = js.Dynamic.literal(name = "KMSInvalidStateException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsNode.typesKmsinvalidstateexceptionMod.KMSInvalidStateException]
    }
    
    inline def NotFoundException(): typingsJapgolly.awsSdkClientKmsNode.typesNotFoundExceptionMod.NotFoundException = {
      val __obj = js.Dynamic.literal(name = "NotFoundException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsNode.typesNotFoundExceptionMod.NotFoundException]
    }
    
    inline def TagException(): typingsJapgolly.awsSdkClientKmsNode.typesTagExceptionMod.TagException = {
      val __obj = js.Dynamic.literal(name = "TagException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsNode.typesTagExceptionMod.TagException]
    }
  }
}
