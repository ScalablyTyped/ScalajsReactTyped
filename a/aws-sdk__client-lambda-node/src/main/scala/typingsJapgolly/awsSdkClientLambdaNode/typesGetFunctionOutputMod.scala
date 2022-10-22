package typingsJapgolly.awsSdkClientLambdaNode

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdkClientLambdaNode.typesConcurrencyMod.UnmarshalledConcurrency
import typingsJapgolly.awsSdkClientLambdaNode.typesFunctionCodeLocationMod.UnmarshalledFunctionCodeLocation
import typingsJapgolly.awsSdkClientLambdaNode.typesFunctionConfigurationMod.UnmarshalledFunctionConfiguration
import typingsJapgolly.awsSdkClientLambdaNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetFunctionOutputMod {
  
  trait GetFunctionOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>The function's code.</p>
      */
    var Code: js.UndefOr[UnmarshalledFunctionCodeLocation] = js.undefined
    
    /**
      * <p>The concurrent execution limit set for this function. For more information, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/concurrent-executions.html">Managing Concurrency</a>.</p>
      */
    var Concurrency: js.UndefOr[UnmarshalledConcurrency] = js.undefined
    
    /**
      * <p>The function's configuration.</p>
      */
    var Configuration: js.UndefOr[UnmarshalledFunctionConfiguration] = js.undefined
    
    /**
      * <p>Returns the list of tags associated with the function. For more information, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/tagging.html">Tagging Lambda Functions</a> in the <b>AWS Lambda Developer Guide</b>.</p>
      */
    var Tags: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object GetFunctionOutput {
    
    inline def apply($metadata: ResponseMetadata): GetFunctionOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetFunctionOutput]
    }
    
    extension [Self <: GetFunctionOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setCode(value: UnmarshalledFunctionCodeLocation): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
      
      inline def setConcurrency(value: UnmarshalledConcurrency): Self = StObject.set(x, "Concurrency", value.asInstanceOf[js.Any])
      
      inline def setConcurrencyUndefined: Self = StObject.set(x, "Concurrency", js.undefined)
      
      inline def setConfiguration(value: UnmarshalledFunctionConfiguration): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
      
      inline def setConfigurationUndefined: Self = StObject.set(x, "Configuration", js.undefined)
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    }
  }
}
