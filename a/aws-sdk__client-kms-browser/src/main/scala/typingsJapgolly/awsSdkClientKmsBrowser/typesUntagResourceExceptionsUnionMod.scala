package typingsJapgolly.awsSdkClientKmsBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUntagResourceExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod.KMSInternalException
    - typingsJapgolly.awsSdkClientKmsBrowser.typesNotFoundExceptionMod.NotFoundException
    - typingsJapgolly.awsSdkClientKmsBrowser.typesInvalidArnExceptionMod.InvalidArnException
    - typingsJapgolly.awsSdkClientKmsBrowser.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
    - typingsJapgolly.awsSdkClientKmsBrowser.typesTagExceptionMod.TagException
  */
  trait UntagResourceExceptionsUnion extends StObject
  object UntagResourceExceptionsUnion {
    
    inline def InvalidArnException(): typingsJapgolly.awsSdkClientKmsBrowser.typesInvalidArnExceptionMod.InvalidArnException = {
      val __obj = js.Dynamic.literal(name = "InvalidArnException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsBrowser.typesInvalidArnExceptionMod.InvalidArnException]
    }
    
    inline def KMSInternalException(): typingsJapgolly.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod.KMSInternalException = {
      val __obj = js.Dynamic.literal(name = "KMSInternalException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod.KMSInternalException]
    }
    
    inline def KMSInvalidStateException(): typingsJapgolly.awsSdkClientKmsBrowser.typesKmsinvalidstateexceptionMod.KMSInvalidStateException = {
      val __obj = js.Dynamic.literal(name = "KMSInvalidStateException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsBrowser.typesKmsinvalidstateexceptionMod.KMSInvalidStateException]
    }
    
    inline def NotFoundException(): typingsJapgolly.awsSdkClientKmsBrowser.typesNotFoundExceptionMod.NotFoundException = {
      val __obj = js.Dynamic.literal(name = "NotFoundException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsBrowser.typesNotFoundExceptionMod.NotFoundException]
    }
    
    inline def TagException(): typingsJapgolly.awsSdkClientKmsBrowser.typesTagExceptionMod.TagException = {
      val __obj = js.Dynamic.literal(name = "TagException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsBrowser.typesTagExceptionMod.TagException]
    }
  }
}
