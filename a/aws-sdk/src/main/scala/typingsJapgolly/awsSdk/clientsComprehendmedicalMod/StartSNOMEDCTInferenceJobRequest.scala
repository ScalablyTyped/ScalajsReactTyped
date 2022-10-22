package typingsJapgolly.awsSdk.clientsComprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartSNOMEDCTInferenceJobRequest extends StObject {
  
  /**
    *  A unique identifier for the request. If you don't set the client request token, Amazon Comprehend Medical generates one. 
    */
  var ClientRequestToken: js.UndefOr[ClientRequestTokenString] = js.undefined
  
  /**
    *  The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that grants Amazon Comprehend Medical read access to your input data. 
    */
  var DataAccessRoleArn: IamRoleArn
  
  var InputDataConfig: typingsJapgolly.awsSdk.clientsComprehendmedicalMod.InputDataConfig
  
  /**
    *  The user generated name the asynchronous InferSNOMEDCT job. 
    */
  var JobName: js.UndefOr[typingsJapgolly.awsSdk.clientsComprehendmedicalMod.JobName] = js.undefined
  
  /**
    *  An AWS Key Management Service key used to encrypt your output files. If you do not specify a key, the files are written in plain text. 
    */
  var KMSKey: js.UndefOr[typingsJapgolly.awsSdk.clientsComprehendmedicalMod.KMSKey] = js.undefined
  
  /**
    *  The language of the input documents. All documents must be in the same language. 
    */
  var LanguageCode: typingsJapgolly.awsSdk.clientsComprehendmedicalMod.LanguageCode
  
  var OutputDataConfig: typingsJapgolly.awsSdk.clientsComprehendmedicalMod.OutputDataConfig
}
object StartSNOMEDCTInferenceJobRequest {
  
  inline def apply(
    DataAccessRoleArn: IamRoleArn,
    InputDataConfig: InputDataConfig,
    LanguageCode: LanguageCode,
    OutputDataConfig: OutputDataConfig
  ): StartSNOMEDCTInferenceJobRequest = {
    val __obj = js.Dynamic.literal(DataAccessRoleArn = DataAccessRoleArn.asInstanceOf[js.Any], InputDataConfig = InputDataConfig.asInstanceOf[js.Any], LanguageCode = LanguageCode.asInstanceOf[js.Any], OutputDataConfig = OutputDataConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartSNOMEDCTInferenceJobRequest]
  }
  
  extension [Self <: StartSNOMEDCTInferenceJobRequest](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestTokenString): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setDataAccessRoleArn(value: IamRoleArn): Self = StObject.set(x, "DataAccessRoleArn", value.asInstanceOf[js.Any])
    
    inline def setInputDataConfig(value: InputDataConfig): Self = StObject.set(x, "InputDataConfig", value.asInstanceOf[js.Any])
    
    inline def setJobName(value: JobName): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    inline def setJobNameUndefined: Self = StObject.set(x, "JobName", js.undefined)
    
    inline def setKMSKey(value: KMSKey): Self = StObject.set(x, "KMSKey", value.asInstanceOf[js.Any])
    
    inline def setKMSKeyUndefined: Self = StObject.set(x, "KMSKey", js.undefined)
    
    inline def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setOutputDataConfig(value: OutputDataConfig): Self = StObject.set(x, "OutputDataConfig", value.asInstanceOf[js.Any])
  }
}
