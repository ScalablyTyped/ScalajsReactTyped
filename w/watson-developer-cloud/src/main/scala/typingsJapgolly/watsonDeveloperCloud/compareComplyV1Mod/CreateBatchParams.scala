package typingsJapgolly.watsonDeveloperCloud.compareComplyV1Mod

import typingsJapgolly.ibmCloudSdkCore.esLibHelperMod.FileObject
import typingsJapgolly.node.NodeJS.ReadableStream
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.watsonDeveloperCloud.compareComplyV1Mod.CreateBatchConstants.Function
import typingsJapgolly.watsonDeveloperCloud.compareComplyV1Mod.CreateBatchConstants.Model
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `createBatch` operation. */
trait CreateBatchParams extends StObject {
  
  /** The Compare and Comply method to run across the submitted input documents. */
  var _function: Function | String
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  /** The geographical location of the Cloud Object Storage input bucket as listed on the **Endpoint** tab of your Cloud Object Storage instance; for example, `us-geo`, `eu-geo`, or `ap-geo`. */
  var input_bucket_location: String
  
  /** The name of the Cloud Object Storage input bucket. */
  var input_bucket_name: String
  
  /** A JSON file containing the input Cloud Object Storage credentials. At a minimum, the credentials must enable `READ` permissions on the bucket defined by the `input_bucket_name` parameter. */
  var input_credentials_file: ReadableStream | FileObject | Buffer
  
  /** The analysis model to be used by the service. For the **Element classification** and **Compare two documents** methods, the default is `contracts`. For the **Extract tables** method, the default is `tables`. These defaults apply to the standalone methods as well as to the methods' use in batch-processing requests. */
  var model: js.UndefOr[Model | String] = js.undefined
  
  /** The geographical location of the Cloud Object Storage output bucket as listed on the **Endpoint** tab of your Cloud Object Storage instance; for example, `us-geo`, `eu-geo`, or `ap-geo`. */
  var output_bucket_location: String
  
  /** The name of the Cloud Object Storage output bucket. */
  var output_bucket_name: String
  
  /** A JSON file that lists the Cloud Object Storage output credentials. At a minimum, the credentials must enable `READ` and `WRITE` permissions on the bucket defined by the `output_bucket_name` parameter. */
  var output_credentials_file: ReadableStream | FileObject | Buffer
  
  var return_response: js.UndefOr[Boolean] = js.undefined
}
object CreateBatchParams {
  
  inline def apply(
    _function: Function | String,
    input_bucket_location: String,
    input_bucket_name: String,
    input_credentials_file: ReadableStream | FileObject | Buffer,
    output_bucket_location: String,
    output_bucket_name: String,
    output_credentials_file: ReadableStream | FileObject | Buffer
  ): CreateBatchParams = {
    val __obj = js.Dynamic.literal(_function = _function.asInstanceOf[js.Any], input_bucket_location = input_bucket_location.asInstanceOf[js.Any], input_bucket_name = input_bucket_name.asInstanceOf[js.Any], input_credentials_file = input_credentials_file.asInstanceOf[js.Any], output_bucket_location = output_bucket_location.asInstanceOf[js.Any], output_bucket_name = output_bucket_name.asInstanceOf[js.Any], output_credentials_file = output_credentials_file.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBatchParams]
  }
  
  extension [Self <: CreateBatchParams](x: Self) {
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setInput_bucket_location(value: String): Self = StObject.set(x, "input_bucket_location", value.asInstanceOf[js.Any])
    
    inline def setInput_bucket_name(value: String): Self = StObject.set(x, "input_bucket_name", value.asInstanceOf[js.Any])
    
    inline def setInput_credentials_file(value: ReadableStream | FileObject | Buffer): Self = StObject.set(x, "input_credentials_file", value.asInstanceOf[js.Any])
    
    inline def setModel(value: Model | String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setOutput_bucket_location(value: String): Self = StObject.set(x, "output_bucket_location", value.asInstanceOf[js.Any])
    
    inline def setOutput_bucket_name(value: String): Self = StObject.set(x, "output_bucket_name", value.asInstanceOf[js.Any])
    
    inline def setOutput_credentials_file(value: ReadableStream | FileObject | Buffer): Self = StObject.set(x, "output_credentials_file", value.asInstanceOf[js.Any])
    
    inline def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    inline def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
    
    inline def set_function(value: Function | String): Self = StObject.set(x, "_function", value.asInstanceOf[js.Any])
  }
}
