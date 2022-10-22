package typingsJapgolly.awsSdkMiddlewareEndpoint

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdkMiddlewareEndpoint.anon.Headers
import typingsJapgolly.awsSdkMiddlewareEndpoint.distTypesAdaptorsGetEndpointFromInstructionsMod.EndpointParameterInstructionsSupplier
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesIntegrationTestsIntegrationTestTypesMod {
  
  trait EndpointExpectation extends StObject {
    
    var endpoint: Headers
  }
  object EndpointExpectation {
    
    inline def apply(endpoint: Headers): EndpointExpectation = {
      val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndpointExpectation]
    }
    
    extension [Self <: EndpointExpectation](x: Self) {
      
      inline def setEndpoint(value: Headers): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    }
  }
  
  trait EndpointTestCase extends StObject {
    
    var documentation: js.UndefOr[String] = js.undefined
    
    var expect: EndpointExpectation | ErrorExpectation
    
    var operationInputs: js.UndefOr[js.Array[OperationInput]] = js.undefined
    
    var params: js.UndefOr[Record[String, Boolean | String | Any]] = js.undefined
    
    var tags: js.UndefOr[js.Array[String]] = js.undefined
  }
  object EndpointTestCase {
    
    inline def apply(expect: EndpointExpectation | ErrorExpectation): EndpointTestCase = {
      val __obj = js.Dynamic.literal(expect = expect.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndpointTestCase]
    }
    
    extension [Self <: EndpointTestCase](x: Self) {
      
      inline def setDocumentation(value: String): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
      
      inline def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
      
      inline def setExpect(value: EndpointExpectation | ErrorExpectation): Self = StObject.set(x, "expect", value.asInstanceOf[js.Any])
      
      inline def setOperationInputs(value: js.Array[OperationInput]): Self = StObject.set(x, "operationInputs", value.asInstanceOf[js.Any])
      
      inline def setOperationInputsUndefined: Self = StObject.set(x, "operationInputs", js.undefined)
      
      inline def setOperationInputsVarargs(value: OperationInput*): Self = StObject.set(x, "operationInputs", js.Array(value*))
      
      inline def setParams(value: Record[String, Boolean | String | Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    }
  }
  
  trait ErrorExpectation extends StObject {
    
    var error: String
  }
  object ErrorExpectation {
    
    inline def apply(error: String): ErrorExpectation = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorExpectation]
    }
    
    extension [Self <: ErrorExpectation](x: Self) {
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  trait OperationInput extends StObject {
    
    var builtInParams: js.UndefOr[Record[String, String | Boolean | Any]] = js.undefined
    
    var clientParams: js.UndefOr[Record[String, String | Boolean | Any]] = js.undefined
    
    var operationName: String
    
    var operationParams: js.UndefOr[Record[String, String | Boolean | Any]] = js.undefined
  }
  object OperationInput {
    
    inline def apply(operationName: String): OperationInput = {
      val __obj = js.Dynamic.literal(operationName = operationName.asInstanceOf[js.Any])
      __obj.asInstanceOf[OperationInput]
    }
    
    extension [Self <: OperationInput](x: Self) {
      
      inline def setBuiltInParams(value: Record[String, String | Boolean | Any]): Self = StObject.set(x, "builtInParams", value.asInstanceOf[js.Any])
      
      inline def setBuiltInParamsUndefined: Self = StObject.set(x, "builtInParams", js.undefined)
      
      inline def setClientParams(value: Record[String, String | Boolean | Any]): Self = StObject.set(x, "clientParams", value.asInstanceOf[js.Any])
      
      inline def setClientParamsUndefined: Self = StObject.set(x, "clientParams", js.undefined)
      
      inline def setOperationName(value: String): Self = StObject.set(x, "operationName", value.asInstanceOf[js.Any])
      
      inline def setOperationParams(value: Record[String, String | Boolean | Any]): Self = StObject.set(x, "operationParams", value.asInstanceOf[js.Any])
      
      inline def setOperationParamsUndefined: Self = StObject.set(x, "operationParams", js.undefined)
    }
  }
  
  type ServiceNamespace = StringDictionary[EndpointParameterInstructionsSupplier]
}
