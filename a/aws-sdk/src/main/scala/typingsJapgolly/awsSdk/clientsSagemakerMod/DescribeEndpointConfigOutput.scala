package typingsJapgolly.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEndpointConfigOutput extends StObject {
  
  /**
    * Returns the description of an endpoint configuration created using the  CreateEndpointConfig  API.
    */
  var AsyncInferenceConfig: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.AsyncInferenceConfig] = js.undefined
  
  /**
    * A timestamp that shows when the endpoint configuration was created.
    */
  var CreationTime: js.Date
  
  var DataCaptureConfig: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.DataCaptureConfig] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the endpoint configuration.
    */
  var EndpointConfigArn: typingsJapgolly.awsSdk.clientsSagemakerMod.EndpointConfigArn
  
  /**
    * Name of the SageMaker endpoint configuration.
    */
  var EndpointConfigName: typingsJapgolly.awsSdk.clientsSagemakerMod.EndpointConfigName
  
  /**
    * The configuration parameters for an explainer.
    */
  var ExplainerConfig: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.ExplainerConfig] = js.undefined
  
  /**
    * Amazon Web Services KMS key ID Amazon SageMaker uses to encrypt data when storing it on the ML storage volume attached to the instance.
    */
  var KmsKeyId: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.KmsKeyId] = js.undefined
  
  /**
    * An array of ProductionVariant objects, one for each model that you want to host at this endpoint.
    */
  var ProductionVariants: ProductionVariantList
}
object DescribeEndpointConfigOutput {
  
  inline def apply(
    CreationTime: js.Date,
    EndpointConfigArn: EndpointConfigArn,
    EndpointConfigName: EndpointConfigName,
    ProductionVariants: ProductionVariantList
  ): DescribeEndpointConfigOutput = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], EndpointConfigArn = EndpointConfigArn.asInstanceOf[js.Any], EndpointConfigName = EndpointConfigName.asInstanceOf[js.Any], ProductionVariants = ProductionVariants.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEndpointConfigOutput]
  }
  
  extension [Self <: DescribeEndpointConfigOutput](x: Self) {
    
    inline def setAsyncInferenceConfig(value: AsyncInferenceConfig): Self = StObject.set(x, "AsyncInferenceConfig", value.asInstanceOf[js.Any])
    
    inline def setAsyncInferenceConfigUndefined: Self = StObject.set(x, "AsyncInferenceConfig", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setDataCaptureConfig(value: DataCaptureConfig): Self = StObject.set(x, "DataCaptureConfig", value.asInstanceOf[js.Any])
    
    inline def setDataCaptureConfigUndefined: Self = StObject.set(x, "DataCaptureConfig", js.undefined)
    
    inline def setEndpointConfigArn(value: EndpointConfigArn): Self = StObject.set(x, "EndpointConfigArn", value.asInstanceOf[js.Any])
    
    inline def setEndpointConfigName(value: EndpointConfigName): Self = StObject.set(x, "EndpointConfigName", value.asInstanceOf[js.Any])
    
    inline def setExplainerConfig(value: ExplainerConfig): Self = StObject.set(x, "ExplainerConfig", value.asInstanceOf[js.Any])
    
    inline def setExplainerConfigUndefined: Self = StObject.set(x, "ExplainerConfig", js.undefined)
    
    inline def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setProductionVariants(value: ProductionVariantList): Self = StObject.set(x, "ProductionVariants", value.asInstanceOf[js.Any])
    
    inline def setProductionVariantsVarargs(value: ProductionVariant*): Self = StObject.set(x, "ProductionVariants", js.Array(value*))
  }
}
