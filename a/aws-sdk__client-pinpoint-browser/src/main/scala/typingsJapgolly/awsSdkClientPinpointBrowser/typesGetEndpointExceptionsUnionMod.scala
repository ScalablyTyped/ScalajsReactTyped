package typingsJapgolly.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetEndpointExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesBadRequestExceptionMod.BadRequestException
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesInternalServerErrorExceptionMod.InternalServerErrorException
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesForbiddenExceptionMod.ForbiddenException
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesNotFoundExceptionMod.NotFoundException
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesMethodNotAllowedExceptionMod.MethodNotAllowedException
    - typingsJapgolly.awsSdkClientPinpointBrowser.typesTooManyRequestsExceptionMod.TooManyRequestsException
  */
  trait GetEndpointExceptionsUnion extends StObject
  object GetEndpointExceptionsUnion {
    
    inline def BadRequestException(): typingsJapgolly.awsSdkClientPinpointBrowser.typesBadRequestExceptionMod.BadRequestException = {
      val __obj = js.Dynamic.literal(name = "BadRequestException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesBadRequestExceptionMod.BadRequestException]
    }
    
    inline def ForbiddenException(): typingsJapgolly.awsSdkClientPinpointBrowser.typesForbiddenExceptionMod.ForbiddenException = {
      val __obj = js.Dynamic.literal(name = "ForbiddenException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesForbiddenExceptionMod.ForbiddenException]
    }
    
    inline def InternalServerErrorException(): typingsJapgolly.awsSdkClientPinpointBrowser.typesInternalServerErrorExceptionMod.InternalServerErrorException = {
      val __obj = js.Dynamic.literal(name = "InternalServerErrorException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesInternalServerErrorExceptionMod.InternalServerErrorException]
    }
    
    inline def MethodNotAllowedException(): typingsJapgolly.awsSdkClientPinpointBrowser.typesMethodNotAllowedExceptionMod.MethodNotAllowedException = {
      val __obj = js.Dynamic.literal(name = "MethodNotAllowedException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesMethodNotAllowedExceptionMod.MethodNotAllowedException]
    }
    
    inline def NotFoundException(): typingsJapgolly.awsSdkClientPinpointBrowser.typesNotFoundExceptionMod.NotFoundException = {
      val __obj = js.Dynamic.literal(name = "NotFoundException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesNotFoundExceptionMod.NotFoundException]
    }
    
    inline def TooManyRequestsException(): typingsJapgolly.awsSdkClientPinpointBrowser.typesTooManyRequestsExceptionMod.TooManyRequestsException = {
      val __obj = js.Dynamic.literal(name = "TooManyRequestsException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientPinpointBrowser.typesTooManyRequestsExceptionMod.TooManyRequestsException]
    }
  }
}
