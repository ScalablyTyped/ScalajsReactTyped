package typingsJapgolly.httpStringParser

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("http-string-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseHeaders(headerLines: js.Array[String]): StringDictionary[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseHeaders")(headerLines.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[String]]
  
  inline def parseRequest(requestString: String): ParseRequestResult = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRequest")(requestString.asInstanceOf[js.Any]).asInstanceOf[ParseRequestResult]
  
  inline def parseRequestLine(requestLineString: String): ParseRequestLineResult = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRequestLine")(requestLineString.asInstanceOf[js.Any]).asInstanceOf[ParseRequestLineResult]
  
  inline def parseResponse(responseString: String): ParseResponseResult = ^.asInstanceOf[js.Dynamic].applyDynamic("parseResponse")(responseString.asInstanceOf[js.Any]).asInstanceOf[ParseResponseResult]
  
  inline def parseStatusLine(statusLine: String): ParseStatusLineResult = ^.asInstanceOf[js.Dynamic].applyDynamic("parseStatusLine")(statusLine.asInstanceOf[js.Any]).asInstanceOf[ParseStatusLineResult]
  
  trait ParseRequestLineResult extends StObject {
    
    var method: String
    
    var protocol: String
    
    var uri: String
  }
  object ParseRequestLineResult {
    
    inline def apply(method: String, protocol: String, uri: String): ParseRequestLineResult = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseRequestLineResult]
    }
    
    extension [Self <: ParseRequestLineResult](x: Self) {
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParseRequestResult extends StObject {
    
    var body: String
    
    var headers: StringDictionary[String]
    
    var method: String
    
    var uri: String
  }
  object ParseRequestResult {
    
    inline def apply(body: String, headers: StringDictionary[String], method: String, uri: String): ParseRequestResult = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseRequestResult]
    }
    
    extension [Self <: ParseRequestResult](x: Self) {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParseResponseResult extends StObject {
    
    var body: String
    
    var headers: StringDictionary[String]
    
    var statusCode: String
    
    var statusMessage: String
  }
  object ParseResponseResult {
    
    inline def apply(body: String, headers: StringDictionary[String], statusCode: String, statusMessage: String): ParseResponseResult = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseResponseResult]
    }
    
    extension [Self <: ParseResponseResult](x: Self) {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: String): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParseStatusLineResult extends StObject {
    
    var protocol: String
    
    var statusCode: String
    
    var statusMessage: String
  }
  object ParseStatusLineResult {
    
    inline def apply(protocol: String, statusCode: String, statusMessage: String): ParseStatusLineResult = {
      val __obj = js.Dynamic.literal(protocol = protocol.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseStatusLineResult]
    }
    
    extension [Self <: ParseStatusLineResult](x: Self) {
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: String): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    }
  }
}
