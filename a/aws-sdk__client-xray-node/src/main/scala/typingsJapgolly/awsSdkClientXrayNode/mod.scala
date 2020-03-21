package typingsJapgolly.awsSdkClientXrayNode

import typingsJapgolly.awsSdkClientXrayNode.typesBatchGetTracesInputMod.BatchGetTracesInput
import typingsJapgolly.awsSdkClientXrayNode.typesCreateSamplingRuleInputMod.CreateSamplingRuleInput
import typingsJapgolly.awsSdkClientXrayNode.typesDeleteSamplingRuleInputMod.DeleteSamplingRuleInput
import typingsJapgolly.awsSdkClientXrayNode.typesGetEncryptionConfigInputMod.GetEncryptionConfigInput
import typingsJapgolly.awsSdkClientXrayNode.typesGetSamplingRulesInputMod.GetSamplingRulesInput
import typingsJapgolly.awsSdkClientXrayNode.typesGetSamplingStatisticSummariesInputMod.GetSamplingStatisticSummariesInput
import typingsJapgolly.awsSdkClientXrayNode.typesGetSamplingTargetsInputMod.GetSamplingTargetsInput
import typingsJapgolly.awsSdkClientXrayNode.typesGetServiceGraphInputMod.GetServiceGraphInput
import typingsJapgolly.awsSdkClientXrayNode.typesGetTraceGraphInputMod.GetTraceGraphInput
import typingsJapgolly.awsSdkClientXrayNode.typesGetTraceSummariesInputMod.GetTraceSummariesInput
import typingsJapgolly.awsSdkClientXrayNode.typesPutEncryptionConfigInputMod.PutEncryptionConfigInput
import typingsJapgolly.awsSdkClientXrayNode.typesPutTelemetryRecordsInputMod.PutTelemetryRecordsInput
import typingsJapgolly.awsSdkClientXrayNode.typesPutTraceSegmentsInputMod.PutTraceSegmentsInput
import typingsJapgolly.awsSdkClientXrayNode.typesUpdateSamplingRuleInputMod.UpdateSamplingRuleInput
import typingsJapgolly.awsSdkClientXrayNode.xrayconfigurationMod.XRayConfiguration
import typingsJapgolly.awsSdkClientXrayNode.xrayconfigurationMod.XRayResolvableConfiguration
import typingsJapgolly.awsSdkClientXrayNode.xrayconfigurationMod.XRayResolvedConfiguration
import typingsJapgolly.awsSdkTypes.clientMod.ConfigurationPropertyDefinition
import typingsJapgolly.awsSdkTypes.credentialsMod.Credentials
import typingsJapgolly.awsSdkTypes.cryptoMod.HashConstructor
import typingsJapgolly.awsSdkTypes.httpMod.HttpEndpoint
import typingsJapgolly.awsSdkTypes.httpMod.HttpHandler
import typingsJapgolly.awsSdkTypes.httpMod.HttpOptions
import typingsJapgolly.awsSdkTypes.marshallerMod.RequestSerializer
import typingsJapgolly.awsSdkTypes.middlewareMod.Terminalware
import typingsJapgolly.awsSdkTypes.signatureMod.RequestSigner
import typingsJapgolly.awsSdkTypes.unmarshallerMod.ResponseParser
import typingsJapgolly.awsSdkTypes.unmarshallerMod.StreamCollector
import typingsJapgolly.awsSdkTypes.utilMod.Decoder
import typingsJapgolly.awsSdkTypes.utilMod.DelayDecider
import typingsJapgolly.awsSdkTypes.utilMod.Encoder
import typingsJapgolly.awsSdkTypes.utilMod.Provider
import typingsJapgolly.awsSdkTypes.utilMod.RetryDecider
import typingsJapgolly.awsSdkTypes.utilMod.UrlParser
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-xray-node", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class BatchGetTracesCommand protected ()
    extends typingsJapgolly.awsSdkClientXrayNode.batchGetTracesCommandMod.BatchGetTracesCommand {
    def this(input: BatchGetTracesInput) = this()
  }
  
  @js.native
  class CreateSamplingRuleCommand protected ()
    extends typingsJapgolly.awsSdkClientXrayNode.createSamplingRuleCommandMod.CreateSamplingRuleCommand {
    def this(input: CreateSamplingRuleInput) = this()
  }
  
  @js.native
  class DeleteSamplingRuleCommand protected ()
    extends typingsJapgolly.awsSdkClientXrayNode.deleteSamplingRuleCommandMod.DeleteSamplingRuleCommand {
    def this(input: DeleteSamplingRuleInput) = this()
  }
  
  @js.native
  class GetEncryptionConfigCommand protected ()
    extends typingsJapgolly.awsSdkClientXrayNode.getEncryptionConfigCommandMod.GetEncryptionConfigCommand {
    def this(input: GetEncryptionConfigInput) = this()
  }
  
  @js.native
  class GetSamplingRulesCommand protected ()
    extends typingsJapgolly.awsSdkClientXrayNode.getSamplingRulesCommandMod.GetSamplingRulesCommand {
    def this(input: GetSamplingRulesInput) = this()
  }
  
  @js.native
  class GetSamplingStatisticSummariesCommand protected ()
    extends typingsJapgolly.awsSdkClientXrayNode.getSamplingStatisticSummariesCommandMod.GetSamplingStatisticSummariesCommand {
    def this(input: GetSamplingStatisticSummariesInput) = this()
  }
  
  @js.native
  class GetSamplingTargetsCommand protected ()
    extends typingsJapgolly.awsSdkClientXrayNode.getSamplingTargetsCommandMod.GetSamplingTargetsCommand {
    def this(input: GetSamplingTargetsInput) = this()
  }
  
  @js.native
  class GetServiceGraphCommand protected ()
    extends typingsJapgolly.awsSdkClientXrayNode.getServiceGraphCommandMod.GetServiceGraphCommand {
    def this(input: GetServiceGraphInput) = this()
  }
  
  @js.native
  class GetTraceGraphCommand protected ()
    extends typingsJapgolly.awsSdkClientXrayNode.getTraceGraphCommandMod.GetTraceGraphCommand {
    def this(input: GetTraceGraphInput) = this()
  }
  
  @js.native
  class GetTraceSummariesCommand protected ()
    extends typingsJapgolly.awsSdkClientXrayNode.getTraceSummariesCommandMod.GetTraceSummariesCommand {
    def this(input: GetTraceSummariesInput) = this()
  }
  
  @js.native
  class PutEncryptionConfigCommand protected ()
    extends typingsJapgolly.awsSdkClientXrayNode.putEncryptionConfigCommandMod.PutEncryptionConfigCommand {
    def this(input: PutEncryptionConfigInput) = this()
  }
  
  @js.native
  class PutTelemetryRecordsCommand protected ()
    extends typingsJapgolly.awsSdkClientXrayNode.putTelemetryRecordsCommandMod.PutTelemetryRecordsCommand {
    def this(input: PutTelemetryRecordsInput) = this()
  }
  
  @js.native
  class PutTraceSegmentsCommand protected ()
    extends typingsJapgolly.awsSdkClientXrayNode.putTraceSegmentsCommandMod.PutTraceSegmentsCommand {
    def this(input: PutTraceSegmentsInput) = this()
  }
  
  @js.native
  class UpdateSamplingRuleCommand protected ()
    extends typingsJapgolly.awsSdkClientXrayNode.updateSamplingRuleCommandMod.UpdateSamplingRuleCommand {
    def this(input: UpdateSamplingRuleInput) = this()
  }
  
  @js.native
  class XRay ()
    extends typingsJapgolly.awsSdkClientXrayNode.xrayMod.XRay
  
  @js.native
  class XRayClient protected ()
    extends typingsJapgolly.awsSdkClientXrayNode.xrayclientMod.XRayClient {
    def this(configuration: XRayConfiguration) = this()
  }
  
  @js.native
  object configurationProperties extends js.Object {
    val _user_injected_http_handler: ConfigurationPropertyDefinition[_, Boolean, XRayResolvableConfiguration, XRayResolvedConfiguration] = js.native
    val base64Decoder: ConfigurationPropertyDefinition[js.UndefOr[Decoder], Decoder, XRayResolvableConfiguration, XRayResolvedConfiguration] = js.native
    val base64Encoder: ConfigurationPropertyDefinition[js.UndefOr[Encoder], Encoder, XRayResolvableConfiguration, XRayResolvedConfiguration] = js.native
    val bodyLengthChecker: ConfigurationPropertyDefinition[
        js.Function1[/* body */ _, js.UndefOr[Double]], 
        js.Function1[/* body */ _, js.UndefOr[Double]], 
        XRayResolvableConfiguration, 
        XRayResolvedConfiguration
      ] = js.native
    val credentials: ConfigurationPropertyDefinition[
        js.UndefOr[Credentials | Provider[Credentials]], 
        Provider[Credentials], 
        XRayResolvableConfiguration, 
        XRayResolvedConfiguration
      ] = js.native
    val delayDecider: ConfigurationPropertyDefinition[
        js.UndefOr[DelayDecider], 
        js.UndefOr[DelayDecider], 
        XRayResolvableConfiguration, 
        XRayResolvedConfiguration
      ] = js.native
    val endpoint: ConfigurationPropertyDefinition[
        js.UndefOr[String | HttpEndpoint | Provider[HttpEndpoint]], 
        Provider[HttpEndpoint], 
        XRayResolvableConfiguration, 
        XRayResolvedConfiguration
      ] = js.native
    val endpointProvider: ConfigurationPropertyDefinition[js.UndefOr[_], _, XRayResolvableConfiguration, XRayResolvedConfiguration] = js.native
    val handler: ConfigurationPropertyDefinition[
        js.UndefOr[Terminalware[_, Readable]], 
        Terminalware[_, Readable], 
        XRayResolvableConfiguration, 
        XRayResolvedConfiguration
      ] = js.native
    val httpHandler: ConfigurationPropertyDefinition[
        js.UndefOr[HttpHandler[Readable, HttpOptions]], 
        HttpHandler[Readable, HttpOptions], 
        XRayResolvableConfiguration, 
        XRayResolvedConfiguration
      ] = js.native
    val maxRedirects: ConfigurationPropertyDefinition[js.UndefOr[Double], Double, XRayResolvableConfiguration, XRayResolvedConfiguration] = js.native
    val maxRetries: ConfigurationPropertyDefinition[js.UndefOr[Double], Double, XRayResolvableConfiguration, XRayResolvedConfiguration] = js.native
    val parser: ConfigurationPropertyDefinition[
        ResponseParser[Readable], 
        ResponseParser[Readable], 
        XRayResolvableConfiguration, 
        XRayResolvedConfiguration
      ] = js.native
    val profile: ConfigurationPropertyDefinition[
        js.UndefOr[String], 
        js.UndefOr[String], 
        XRayResolvableConfiguration, 
        XRayResolvedConfiguration
      ] = js.native
    val region: ConfigurationPropertyDefinition[
        js.UndefOr[String | Provider[String]], 
        Provider[String], 
        XRayResolvableConfiguration, 
        XRayResolvedConfiguration
      ] = js.native
    val retryDecider: ConfigurationPropertyDefinition[
        js.UndefOr[RetryDecider], 
        js.UndefOr[RetryDecider], 
        XRayResolvableConfiguration, 
        XRayResolvedConfiguration
      ] = js.native
    val serializer: ConfigurationPropertyDefinition[
        Provider[RequestSerializer[Readable]], 
        Provider[RequestSerializer[Readable]], 
        XRayResolvableConfiguration, 
        XRayResolvedConfiguration
      ] = js.native
    val sha256: ConfigurationPropertyDefinition[
        js.UndefOr[HashConstructor], 
        HashConstructor, 
        XRayResolvableConfiguration, 
        XRayResolvedConfiguration
      ] = js.native
    val signer: ConfigurationPropertyDefinition[
        js.UndefOr[RequestSigner], 
        RequestSigner, 
        XRayResolvableConfiguration, 
        XRayResolvedConfiguration
      ] = js.native
    val signingName: ConfigurationPropertyDefinition[js.UndefOr[String], String, XRayResolvableConfiguration, XRayResolvedConfiguration] = js.native
    val sslEnabled: ConfigurationPropertyDefinition[js.UndefOr[Boolean], Boolean, XRayResolvableConfiguration, XRayResolvedConfiguration] = js.native
    val streamCollector: ConfigurationPropertyDefinition[
        js.UndefOr[StreamCollector[Readable]], 
        StreamCollector[Readable], 
        XRayResolvableConfiguration, 
        XRayResolvedConfiguration
      ] = js.native
    val urlParser: ConfigurationPropertyDefinition[
        js.UndefOr[UrlParser], 
        UrlParser, 
        XRayResolvableConfiguration, 
        XRayResolvedConfiguration
      ] = js.native
    val utf8Decoder: ConfigurationPropertyDefinition[js.UndefOr[Decoder], Decoder, XRayResolvableConfiguration, XRayResolvedConfiguration] = js.native
    val utf8Encoder: ConfigurationPropertyDefinition[js.UndefOr[Encoder], Encoder, XRayResolvableConfiguration, XRayResolvedConfiguration] = js.native
  }
  
}

