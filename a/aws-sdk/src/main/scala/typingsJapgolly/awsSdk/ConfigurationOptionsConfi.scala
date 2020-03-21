package typingsJapgolly.awsSdk

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.accessanalyzerMod.ClientConfiguration
import typingsJapgolly.awsSdk.awsSdkStrings.latest_
import typingsJapgolly.awsSdk.awsSdkStrings.legacy_
import typingsJapgolly.awsSdk.awsSdkStrings.regional_
import typingsJapgolly.awsSdk.awsSdkStrings.v2_
import typingsJapgolly.awsSdk.awsSdkStrings.v3
import typingsJapgolly.awsSdk.awsSdkStrings.v4
import typingsJapgolly.awsSdk.configMod.HTTPOptions
import typingsJapgolly.awsSdk.configMod.Logger
import typingsJapgolly.awsSdk.configMod.ParamValidation
import typingsJapgolly.awsSdk.configMod.RetryDelayOptions
import typingsJapgolly.awsSdk.configServicePlaceholdersMod.ConfigurationServiceApiVersions
import typingsJapgolly.awsSdk.credentialProviderChainMod.CredentialProviderChain
import typingsJapgolly.awsSdk.credentialsMod.Credentials
import typingsJapgolly.awsSdk.credentialsMod.CredentialsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/lib/config.ConfigurationOptions & aws-sdk.aws-sdk/lib/config_service_placeholders.ConfigurationServicePlaceholders & aws-sdk.aws-sdk/lib/config.APIVersions & {[key: string] : any} */
@js.native
trait ConfigurationOptionsConfi
  extends /* key */ StringDictionary[js.Any] {
  /**
    * AWS access key ID.
    *
    * @deprecated
    */
  var accessKeyId: js.UndefOr[String] = js.native
  var accessanalyzer: js.UndefOr[ClientConfiguration] = js.native
  var acm: js.UndefOr[typingsJapgolly.awsSdk.acmMod.ClientConfiguration] = js.native
  var acmpca: js.UndefOr[typingsJapgolly.awsSdk.acmpcaMod.ClientConfiguration] = js.native
  var alexaforbusiness: js.UndefOr[typingsJapgolly.awsSdk.alexaforbusinessMod.ClientConfiguration] = js.native
  var amplify: js.UndefOr[typingsJapgolly.awsSdk.amplifyMod.ClientConfiguration] = js.native
  /**
    * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in all services (unless overridden by apiVersions). Specify \'latest\' to use the latest possible version.
    */
  var apiVersion: js.UndefOr[latest_ | String] = js.native
  /**
    * A map of service identifiers (the lowercase service class name) with the API version to use when instantiating a service. Specify 'latest' for each individual that can use the latest available version.
    */
  var apiVersions: js.UndefOr[ConfigurationServiceApiVersions] = js.native
  var apigateway: js.UndefOr[typingsJapgolly.awsSdk.apigatewayMod.ClientConfiguration] = js.native
  var apigatewaymanagementapi: js.UndefOr[typingsJapgolly.awsSdk.apigatewaymanagementapiMod.ClientConfiguration] = js.native
  var apigatewayv2: js.UndefOr[typingsJapgolly.awsSdk.apigatewayv2Mod.ClientConfiguration] = js.native
  var appconfig: js.UndefOr[typingsJapgolly.awsSdk.appconfigMod.ClientConfiguration] = js.native
  var applicationautoscaling: js.UndefOr[typingsJapgolly.awsSdk.applicationautoscalingMod.ClientConfiguration] = js.native
  var applicationinsights: js.UndefOr[typingsJapgolly.awsSdk.applicationinsightsMod.ClientConfiguration] = js.native
  var appmesh: js.UndefOr[typingsJapgolly.awsSdk.appmeshMod.ClientConfiguration] = js.native
  var appstream: js.UndefOr[typingsJapgolly.awsSdk.appstreamMod.ClientConfiguration] = js.native
  var appsync: js.UndefOr[typingsJapgolly.awsSdk.appsyncMod.ClientConfiguration] = js.native
  var athena: js.UndefOr[typingsJapgolly.awsSdk.athenaMod.ClientConfiguration] = js.native
  var augmentedairuntime: js.UndefOr[typingsJapgolly.awsSdk.augmentedairuntimeMod.ClientConfiguration] = js.native
  var autoscaling: js.UndefOr[typingsJapgolly.awsSdk.autoscalingMod.ClientConfiguration] = js.native
  var autoscalingplans: js.UndefOr[typingsJapgolly.awsSdk.autoscalingplansMod.ClientConfiguration] = js.native
  var backup: js.UndefOr[typingsJapgolly.awsSdk.backupMod.ClientConfiguration] = js.native
  var batch: js.UndefOr[typingsJapgolly.awsSdk.batchMod.ClientConfiguration] = js.native
  var budgets: js.UndefOr[typingsJapgolly.awsSdk.budgetsMod.ClientConfiguration] = js.native
  var chime: js.UndefOr[typingsJapgolly.awsSdk.chimeMod.ClientConfiguration] = js.native
  var cloud9: js.UndefOr[typingsJapgolly.awsSdk.cloud9Mod.ClientConfiguration] = js.native
  var clouddirectory: js.UndefOr[typingsJapgolly.awsSdk.clouddirectoryMod.ClientConfiguration] = js.native
  var cloudformation: js.UndefOr[typingsJapgolly.awsSdk.cloudformationMod.ClientConfiguration] = js.native
  var cloudfront: js.UndefOr[typingsJapgolly.awsSdk.cloudfrontMod.ClientConfiguration] = js.native
  var cloudhsm: js.UndefOr[typingsJapgolly.awsSdk.cloudhsmMod.ClientConfiguration] = js.native
  var cloudhsmv2: js.UndefOr[typingsJapgolly.awsSdk.cloudhsmv2Mod.ClientConfiguration] = js.native
  var cloudsearch: js.UndefOr[typingsJapgolly.awsSdk.cloudsearchMod.ClientConfiguration] = js.native
  var cloudsearchdomain: js.UndefOr[typingsJapgolly.awsSdk.cloudsearchdomainMod.ClientConfiguration] = js.native
  var cloudtrail: js.UndefOr[typingsJapgolly.awsSdk.cloudtrailMod.ClientConfiguration] = js.native
  var cloudwatch: js.UndefOr[typingsJapgolly.awsSdk.cloudwatchMod.ClientConfiguration] = js.native
  var cloudwatchevents: js.UndefOr[typingsJapgolly.awsSdk.cloudwatcheventsMod.ClientConfiguration] = js.native
  var cloudwatchlogs: js.UndefOr[typingsJapgolly.awsSdk.cloudwatchlogsMod.ClientConfiguration] = js.native
  var codebuild: js.UndefOr[typingsJapgolly.awsSdk.codebuildMod.ClientConfiguration] = js.native
  var codecommit: js.UndefOr[typingsJapgolly.awsSdk.codecommitMod.ClientConfiguration] = js.native
  var codedeploy: js.UndefOr[typingsJapgolly.awsSdk.codedeployMod.ClientConfiguration] = js.native
  var codeguruprofiler: js.UndefOr[typingsJapgolly.awsSdk.codeguruprofilerMod.ClientConfiguration] = js.native
  var codegurureviewer: js.UndefOr[typingsJapgolly.awsSdk.codegurureviewerMod.ClientConfiguration] = js.native
  var codepipeline: js.UndefOr[typingsJapgolly.awsSdk.codepipelineMod.ClientConfiguration] = js.native
  var codestar: js.UndefOr[typingsJapgolly.awsSdk.codestarMod.ClientConfiguration] = js.native
  var codestarconnections: js.UndefOr[typingsJapgolly.awsSdk.codestarconnectionsMod.ClientConfiguration] = js.native
  var codestarnotifications: js.UndefOr[typingsJapgolly.awsSdk.codestarnotificationsMod.ClientConfiguration] = js.native
  var cognitoidentity: js.UndefOr[typingsJapgolly.awsSdk.cognitoidentityMod.ClientConfiguration] = js.native
  var cognitoidentityserviceprovider: js.UndefOr[typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod.ClientConfiguration] = js.native
  var cognitosync: js.UndefOr[typingsJapgolly.awsSdk.cognitosyncMod.ClientConfiguration] = js.native
  var comprehend: js.UndefOr[typingsJapgolly.awsSdk.comprehendMod.ClientConfiguration] = js.native
  var comprehendmedical: js.UndefOr[typingsJapgolly.awsSdk.comprehendmedicalMod.ClientConfiguration] = js.native
  /**
    * Whether to compute checksums for payload bodies when the service accepts it.
    * Currently supported in S3 only.
    */
  var computeChecksums: js.UndefOr[Boolean] = js.native
  var computeoptimizer: js.UndefOr[typingsJapgolly.awsSdk.computeoptimizerMod.ClientConfiguration] = js.native
  var configservice: js.UndefOr[typingsJapgolly.awsSdk.configserviceMod.ClientConfiguration] = js.native
  var connect: js.UndefOr[typingsJapgolly.awsSdk.connectMod.ClientConfiguration] = js.native
  var connectparticipant: js.UndefOr[typingsJapgolly.awsSdk.connectparticipantMod.ClientConfiguration] = js.native
  /**
    * Whether types are converted when parsing response data.
    */
  var convertResponseTypes: js.UndefOr[Boolean] = js.native
  /**
    * Whether to apply a clock skew correction and retry requests that fail because of an skewed client clock.
    */
  var correctClockSkew: js.UndefOr[Boolean] = js.native
  var costexplorer: js.UndefOr[typingsJapgolly.awsSdk.costexplorerMod.ClientConfiguration] = js.native
  /**
    * The provider chain used to resolve credentials if no static credentials property is set.
    */
  var credentialProvider: js.UndefOr[CredentialProviderChain] = js.native
  /**
    * The AWS credentials to sign requests with.
    */
  var credentials: js.UndefOr[Credentials | CredentialsOptions | Null] = js.native
  var cur: js.UndefOr[typingsJapgolly.awsSdk.curMod.ClientConfiguration] = js.native
  /**
    * Sets a custom User-Agent string.
    * In node environments this will set the User-Agent header, but
    * browser environments this will set the X-Amz-User-Agent header.
    */
  var customUserAgent: js.UndefOr[String] = js.native
  var dataexchange: js.UndefOr[typingsJapgolly.awsSdk.dataexchangeMod.ClientConfiguration] = js.native
  var datapipeline: js.UndefOr[typingsJapgolly.awsSdk.datapipelineMod.ClientConfiguration] = js.native
  var datasync: js.UndefOr[typingsJapgolly.awsSdk.datasyncMod.ClientConfiguration] = js.native
  var dax: js.UndefOr[typingsJapgolly.awsSdk.daxMod.ClientConfiguration] = js.native
  var detective: js.UndefOr[typingsJapgolly.awsSdk.detectiveMod.ClientConfiguration] = js.native
  var devicefarm: js.UndefOr[typingsJapgolly.awsSdk.devicefarmMod.ClientConfiguration] = js.native
  var directconnect: js.UndefOr[typingsJapgolly.awsSdk.directconnectMod.ClientConfiguration] = js.native
  var directoryservice: js.UndefOr[typingsJapgolly.awsSdk.directoryserviceMod.ClientConfiguration] = js.native
  var discovery: js.UndefOr[typingsJapgolly.awsSdk.discoveryMod.ClientConfiguration] = js.native
  var dlm: js.UndefOr[typingsJapgolly.awsSdk.dlmMod.ClientConfiguration] = js.native
  var dms: js.UndefOr[typingsJapgolly.awsSdk.dmsMod.ClientConfiguration] = js.native
  var docdb: js.UndefOr[typingsJapgolly.awsSdk.docdbMod.ClientConfiguration] = js.native
  /**
    * Whether to validate the CRC32 checksum of HTTP response bodies returned
    * by DynamoDB.
    */
  var dynamoDbCrc32: js.UndefOr[Boolean] = js.native
  var dynamodb: js.UndefOr[typingsJapgolly.awsSdk.dynamodbMod.ClientConfiguration] = js.native
  var dynamodbstreams: js.UndefOr[typingsJapgolly.awsSdk.dynamodbstreamsMod.ClientConfiguration] = js.native
  var ebs: js.UndefOr[typingsJapgolly.awsSdk.ebsMod.ClientConfiguration] = js.native
  var ec2: js.UndefOr[typingsJapgolly.awsSdk.ec2Mod.ClientConfiguration] = js.native
  var ec2instanceconnect: js.UndefOr[typingsJapgolly.awsSdk.ec2instanceconnectMod.ClientConfiguration] = js.native
  var ecr: js.UndefOr[typingsJapgolly.awsSdk.ecrMod.ClientConfiguration] = js.native
  var ecs: js.UndefOr[typingsJapgolly.awsSdk.ecsMod.ClientConfiguration] = js.native
  var efs: js.UndefOr[typingsJapgolly.awsSdk.efsMod.ClientConfiguration] = js.native
  var eks: js.UndefOr[typingsJapgolly.awsSdk.eksMod.ClientConfiguration] = js.native
  var elasticache: js.UndefOr[typingsJapgolly.awsSdk.elasticacheMod.ClientConfiguration] = js.native
  var elasticbeanstalk: js.UndefOr[typingsJapgolly.awsSdk.elasticbeanstalkMod.ClientConfiguration] = js.native
  var elasticinference: js.UndefOr[typingsJapgolly.awsSdk.elasticinferenceMod.ClientConfiguration] = js.native
  var elastictranscoder: js.UndefOr[typingsJapgolly.awsSdk.elastictranscoderMod.ClientConfiguration] = js.native
  var elb: js.UndefOr[typingsJapgolly.awsSdk.elbMod.ClientConfiguration] = js.native
  var elbv2: js.UndefOr[typingsJapgolly.awsSdk.elbv2Mod.ClientConfiguration] = js.native
  var emr: js.UndefOr[typingsJapgolly.awsSdk.emrMod.ClientConfiguration] = js.native
  /**
    * The size of the global cache storing endpoints from endpoint
    * discovery operations. Once endpoint cache is created, updating this setting
    * cannot change existing cache size.
    */
  var endpointCacheSize: js.UndefOr[Double] = js.native
  /**
    * Whether to enable endpoint discovery for operations that allow optionally using an endpoint returned by 
    * the service.
    */
  var endpointDiscoveryEnabled: js.UndefOr[Boolean] = js.native
  var es: js.UndefOr[typingsJapgolly.awsSdk.esMod.ClientConfiguration] = js.native
  var eventbridge: js.UndefOr[typingsJapgolly.awsSdk.eventbridgeMod.ClientConfiguration] = js.native
  var firehose: js.UndefOr[typingsJapgolly.awsSdk.firehoseMod.ClientConfiguration] = js.native
  var fms: js.UndefOr[typingsJapgolly.awsSdk.fmsMod.ClientConfiguration] = js.native
  var forecastqueryservice: js.UndefOr[typingsJapgolly.awsSdk.forecastqueryserviceMod.ClientConfiguration] = js.native
  var forecastservice: js.UndefOr[typingsJapgolly.awsSdk.forecastserviceMod.ClientConfiguration] = js.native
  var frauddetector: js.UndefOr[typingsJapgolly.awsSdk.frauddetectorMod.ClientConfiguration] = js.native
  var fsx: js.UndefOr[typingsJapgolly.awsSdk.fsxMod.ClientConfiguration] = js.native
  var gamelift: js.UndefOr[typingsJapgolly.awsSdk.gameliftMod.ClientConfiguration] = js.native
  var glacier: js.UndefOr[typingsJapgolly.awsSdk.glacierMod.ClientConfiguration] = js.native
  var globalaccelerator: js.UndefOr[typingsJapgolly.awsSdk.globalacceleratorMod.ClientConfiguration] = js.native
  var glue: js.UndefOr[typingsJapgolly.awsSdk.glueMod.ClientConfiguration] = js.native
  var greengrass: js.UndefOr[typingsJapgolly.awsSdk.greengrassMod.ClientConfiguration] = js.native
  var groundstation: js.UndefOr[typingsJapgolly.awsSdk.groundstationMod.ClientConfiguration] = js.native
  var guardduty: js.UndefOr[typingsJapgolly.awsSdk.guarddutyMod.ClientConfiguration] = js.native
  var health: js.UndefOr[typingsJapgolly.awsSdk.healthMod.ClientConfiguration] = js.native
  /**
    *  whether to marshal request parameters to the prefix of hostname.
    */
  var hostPrefixEnabled: js.UndefOr[Boolean] = js.native
  /**
    * A set of options to pass to the low-level HTTP request.
    */
  var httpOptions: js.UndefOr[HTTPOptions] = js.native
  var iam: js.UndefOr[typingsJapgolly.awsSdk.iamMod.ClientConfiguration] = js.native
  var imagebuilder: js.UndefOr[typingsJapgolly.awsSdk.imagebuilderMod.ClientConfiguration] = js.native
  var importexport: js.UndefOr[typingsJapgolly.awsSdk.importexportMod.ClientConfiguration] = js.native
  var inspector: js.UndefOr[typingsJapgolly.awsSdk.inspectorMod.ClientConfiguration] = js.native
  var iot: js.UndefOr[typingsJapgolly.awsSdk.iotMod.ClientConfiguration] = js.native
  var iot1clickdevicesservice: js.UndefOr[typingsJapgolly.awsSdk.iot1clickdevicesserviceMod.ClientConfiguration] = js.native
  var iot1clickprojects: js.UndefOr[typingsJapgolly.awsSdk.iot1clickprojectsMod.ClientConfiguration] = js.native
  var iotanalytics: js.UndefOr[typingsJapgolly.awsSdk.iotanalyticsMod.ClientConfiguration] = js.native
  var iotdata: js.UndefOr[typingsJapgolly.awsSdk.iotdataMod.ClientConfiguration] = js.native
  var iotevents: js.UndefOr[typingsJapgolly.awsSdk.ioteventsMod.ClientConfiguration] = js.native
  var ioteventsdata: js.UndefOr[typingsJapgolly.awsSdk.ioteventsdataMod.ClientConfiguration] = js.native
  var iotjobsdataplane: js.UndefOr[typingsJapgolly.awsSdk.iotjobsdataplaneMod.ClientConfiguration] = js.native
  var iotsecuretunneling: js.UndefOr[typingsJapgolly.awsSdk.iotsecuretunnelingMod.ClientConfiguration] = js.native
  var iotthingsgraph: js.UndefOr[typingsJapgolly.awsSdk.iotthingsgraphMod.ClientConfiguration] = js.native
  var kafka: js.UndefOr[typingsJapgolly.awsSdk.kafkaMod.ClientConfiguration] = js.native
  var kendra: js.UndefOr[typingsJapgolly.awsSdk.kendraMod.ClientConfiguration] = js.native
  var kinesis: js.UndefOr[typingsJapgolly.awsSdk.kinesisMod.ClientConfiguration] = js.native
  var kinesisanalytics: js.UndefOr[typingsJapgolly.awsSdk.kinesisanalyticsMod.ClientConfiguration] = js.native
  var kinesisanalyticsv2: js.UndefOr[typingsJapgolly.awsSdk.kinesisanalyticsv2Mod.ClientConfiguration] = js.native
  var kinesisvideo: js.UndefOr[typingsJapgolly.awsSdk.kinesisvideoMod.ClientConfiguration] = js.native
  var kinesisvideoarchivedmedia: js.UndefOr[typingsJapgolly.awsSdk.kinesisvideoarchivedmediaMod.ClientConfiguration] = js.native
  var kinesisvideomedia: js.UndefOr[typingsJapgolly.awsSdk.kinesisvideomediaMod.ClientConfiguration] = js.native
  var kinesisvideosignalingchannels: js.UndefOr[typingsJapgolly.awsSdk.kinesisvideosignalingchannelsMod.ClientConfiguration] = js.native
  var kms: js.UndefOr[typingsJapgolly.awsSdk.kmsMod.ClientConfiguration] = js.native
  var lakeformation: js.UndefOr[typingsJapgolly.awsSdk.lakeformationMod.ClientConfiguration] = js.native
  var lambda: js.UndefOr[typingsJapgolly.awsSdk.lambdaMod.ClientConfiguration] = js.native
  var lexmodelbuildingservice: js.UndefOr[typingsJapgolly.awsSdk.lexmodelbuildingserviceMod.ClientConfiguration] = js.native
  var lexruntime: js.UndefOr[typingsJapgolly.awsSdk.lexruntimeMod.ClientConfiguration] = js.native
  var licensemanager: js.UndefOr[typingsJapgolly.awsSdk.licensemanagerMod.ClientConfiguration] = js.native
  var lightsail: js.UndefOr[typingsJapgolly.awsSdk.lightsailMod.ClientConfiguration] = js.native
  /**
    * An object that responds to .write() (like a stream) or .log() (like the console object) in order to log information about requests.
    */
  var logger: js.UndefOr[Logger] = js.native
  var machinelearning: js.UndefOr[typingsJapgolly.awsSdk.machinelearningMod.ClientConfiguration] = js.native
  var macie: js.UndefOr[typingsJapgolly.awsSdk.macieMod.ClientConfiguration] = js.native
  var managedblockchain: js.UndefOr[typingsJapgolly.awsSdk.managedblockchainMod.ClientConfiguration] = js.native
  var marketplacecatalog: js.UndefOr[typingsJapgolly.awsSdk.marketplacecatalogMod.ClientConfiguration] = js.native
  var marketplacecommerceanalytics: js.UndefOr[typingsJapgolly.awsSdk.marketplacecommerceanalyticsMod.ClientConfiguration] = js.native
  var marketplaceentitlementservice: js.UndefOr[typingsJapgolly.awsSdk.marketplaceentitlementserviceMod.ClientConfiguration] = js.native
  var marketplacemetering: js.UndefOr[typingsJapgolly.awsSdk.marketplacemeteringMod.ClientConfiguration] = js.native
  /**
    * The maximum amount of redirects to follow for a service request.
    */
  var maxRedirects: js.UndefOr[Double] = js.native
  /**
    * The maximum amount of retries to perform for a service request.
    */
  var maxRetries: js.UndefOr[Double] = js.native
  var mediaconnect: js.UndefOr[typingsJapgolly.awsSdk.mediaconnectMod.ClientConfiguration] = js.native
  var mediaconvert: js.UndefOr[typingsJapgolly.awsSdk.mediaconvertMod.ClientConfiguration] = js.native
  var medialive: js.UndefOr[typingsJapgolly.awsSdk.medialiveMod.ClientConfiguration] = js.native
  var mediapackage: js.UndefOr[typingsJapgolly.awsSdk.mediapackageMod.ClientConfiguration] = js.native
  var mediapackagevod: js.UndefOr[typingsJapgolly.awsSdk.mediapackagevodMod.ClientConfiguration] = js.native
  var mediastore: js.UndefOr[typingsJapgolly.awsSdk.mediastoreMod.ClientConfiguration] = js.native
  var mediastoredata: js.UndefOr[typingsJapgolly.awsSdk.mediastoredataMod.ClientConfiguration] = js.native
  var mediatailor: js.UndefOr[typingsJapgolly.awsSdk.mediatailorMod.ClientConfiguration] = js.native
  var migrationhub: js.UndefOr[typingsJapgolly.awsSdk.migrationhubMod.ClientConfiguration] = js.native
  var migrationhubconfig: js.UndefOr[typingsJapgolly.awsSdk.migrationhubconfigMod.ClientConfiguration] = js.native
  var mobile: js.UndefOr[typingsJapgolly.awsSdk.mobileMod.ClientConfiguration] = js.native
  var mobileanalytics: js.UndefOr[typingsJapgolly.awsSdk.mobileanalyticsMod.ClientConfiguration] = js.native
  var mq: js.UndefOr[typingsJapgolly.awsSdk.mqMod.ClientConfiguration] = js.native
  var mturk: js.UndefOr[typingsJapgolly.awsSdk.mturkMod.ClientConfiguration] = js.native
  var neptune: js.UndefOr[typingsJapgolly.awsSdk.neptuneMod.ClientConfiguration] = js.native
  var networkmanager: js.UndefOr[typingsJapgolly.awsSdk.networkmanagerMod.ClientConfiguration] = js.native
  var opsworks: js.UndefOr[typingsJapgolly.awsSdk.opsworksMod.ClientConfiguration] = js.native
  var opsworkscm: js.UndefOr[typingsJapgolly.awsSdk.opsworkscmMod.ClientConfiguration] = js.native
  var organizations: js.UndefOr[typingsJapgolly.awsSdk.organizationsMod.ClientConfiguration] = js.native
  var outposts: js.UndefOr[typingsJapgolly.awsSdk.outpostsMod.ClientConfiguration] = js.native
  /**
    * Returns whether input parameters should be validated against the operation description before sending the request.
    * Defaults to true.
    * Pass a map to enable any of the following specific validation features: min|max|pattern|enum
    */
  var paramValidation: js.UndefOr[ParamValidation | Boolean] = js.native
  var personalize: js.UndefOr[typingsJapgolly.awsSdk.personalizeMod.ClientConfiguration] = js.native
  var personalizeevents: js.UndefOr[typingsJapgolly.awsSdk.personalizeeventsMod.ClientConfiguration] = js.native
  var personalizeruntime: js.UndefOr[typingsJapgolly.awsSdk.personalizeruntimeMod.ClientConfiguration] = js.native
  var pi: js.UndefOr[typingsJapgolly.awsSdk.piMod.ClientConfiguration] = js.native
  var pinpoint: js.UndefOr[typingsJapgolly.awsSdk.pinpointMod.ClientConfiguration] = js.native
  var pinpointemail: js.UndefOr[typingsJapgolly.awsSdk.pinpointemailMod.ClientConfiguration] = js.native
  var pinpointsmsvoice: js.UndefOr[typingsJapgolly.awsSdk.pinpointsmsvoiceMod.ClientConfiguration] = js.native
  var polly: js.UndefOr[typingsJapgolly.awsSdk.pollyMod.ClientConfiguration] = js.native
  var pricing: js.UndefOr[typingsJapgolly.awsSdk.pricingMod.ClientConfiguration] = js.native
  var qldb: js.UndefOr[typingsJapgolly.awsSdk.qldbMod.ClientConfiguration] = js.native
  var qldbsession: js.UndefOr[typingsJapgolly.awsSdk.qldbsessionMod.ClientConfiguration] = js.native
  var quicksight: js.UndefOr[typingsJapgolly.awsSdk.quicksightMod.ClientConfiguration] = js.native
  var ram: js.UndefOr[typingsJapgolly.awsSdk.ramMod.ClientConfiguration] = js.native
  var rds: js.UndefOr[typingsJapgolly.awsSdk.rdsMod.ClientConfiguration] = js.native
  var rdsdataservice: js.UndefOr[typingsJapgolly.awsSdk.rdsdataserviceMod.ClientConfiguration] = js.native
  var redshift: js.UndefOr[typingsJapgolly.awsSdk.redshiftMod.ClientConfiguration] = js.native
  /**
    * The region to send service requests to.
    */
  var region: js.UndefOr[String] = js.native
  var rekognition: js.UndefOr[typingsJapgolly.awsSdk.rekognitionMod.ClientConfiguration] = js.native
  var resourcegroups: js.UndefOr[typingsJapgolly.awsSdk.resourcegroupsMod.ClientConfiguration] = js.native
  var resourcegroupstaggingapi: js.UndefOr[typingsJapgolly.awsSdk.resourcegroupstaggingapiMod.ClientConfiguration] = js.native
  /**
    * Returns A set of options to configure the retry delay on retryable errors.
    */
  var retryDelayOptions: js.UndefOr[RetryDelayOptions] = js.native
  var robomaker: js.UndefOr[typingsJapgolly.awsSdk.robomakerMod.ClientConfiguration] = js.native
  var route53: js.UndefOr[typingsJapgolly.awsSdk.route53Mod.ClientConfiguration] = js.native
  var route53domains: js.UndefOr[typingsJapgolly.awsSdk.route53domainsMod.ClientConfiguration] = js.native
  var route53resolver: js.UndefOr[typingsJapgolly.awsSdk.route53resolverMod.ClientConfiguration] = js.native
  var s3: js.UndefOr[typingsJapgolly.awsSdk.s3Mod.ClientConfiguration] = js.native
  /**
    * Whether the provided endpoint addresses an individual bucket.
    * false if it addresses the root API endpoint.
    */
  var s3BucketEndpoint: js.UndefOr[Boolean] = js.native
  /**
    * Whether to disable S3 body signing when using signature version v4.
    */
  var s3DisableBodySigning: js.UndefOr[Boolean] = js.native
  /**
    * Whether to force path style URLs for S3 objects.
    */
  var s3ForcePathStyle: js.UndefOr[Boolean] = js.native
  /**
    * when region is set to 'us-east-1', whether to send s3 request to global endpoints
    * or 'us-east-1' regional endpoints. This config is only applicable to S3 client;
    * Defaults to 'legacy'
    */
  var s3UsEast1RegionalEndpoint: js.UndefOr[regional_ | legacy_] = js.native
  /**
    * whether to override the request region with the region inferred
    * from requested resource's ARN. Only available for S3 buckets
    * Defaults to `true`
    */
  var s3UseArnRegion: js.UndefOr[Boolean] = js.native
  var s3control: js.UndefOr[typingsJapgolly.awsSdk.s3controlMod.ClientConfiguration] = js.native
  var sagemaker: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.ClientConfiguration] = js.native
  var sagemakerruntime: js.UndefOr[typingsJapgolly.awsSdk.sagemakerruntimeMod.ClientConfiguration] = js.native
  var savingsplans: js.UndefOr[typingsJapgolly.awsSdk.savingsplansMod.ClientConfiguration] = js.native
  var schemas: js.UndefOr[typingsJapgolly.awsSdk.schemasMod.ClientConfiguration] = js.native
  /**
    * AWS secret access key.
    *
    * @deprecated
    */
  var secretAccessKey: js.UndefOr[String] = js.native
  var secretsmanager: js.UndefOr[typingsJapgolly.awsSdk.secretsmanagerMod.ClientConfiguration] = js.native
  var securityhub: js.UndefOr[typingsJapgolly.awsSdk.securityhubMod.ClientConfiguration] = js.native
  var serverlessapplicationrepository: js.UndefOr[typingsJapgolly.awsSdk.serverlessapplicationrepositoryMod.ClientConfiguration] = js.native
  var servicecatalog: js.UndefOr[typingsJapgolly.awsSdk.servicecatalogMod.ClientConfiguration] = js.native
  var servicediscovery: js.UndefOr[typingsJapgolly.awsSdk.servicediscoveryMod.ClientConfiguration] = js.native
  var servicequotas: js.UndefOr[typingsJapgolly.awsSdk.servicequotasMod.ClientConfiguration] = js.native
  var ses: js.UndefOr[typingsJapgolly.awsSdk.sesMod.ClientConfiguration] = js.native
  /**
    * AWS session token.
    *
    * @deprecated
    */
  var sessionToken: js.UndefOr[String] = js.native
  var sesv2: js.UndefOr[typingsJapgolly.awsSdk.sesv2Mod.ClientConfiguration] = js.native
  var shield: js.UndefOr[typingsJapgolly.awsSdk.shieldMod.ClientConfiguration] = js.native
  /**
    * Whether the signature to sign requests with (overriding the API configuration) is cached.
    */
  var signatureCache: js.UndefOr[Boolean] = js.native
  /**
    * The signature version to sign requests with (overriding the API configuration).
    * Possible values: 'v2'|'v3'|'v4'
    */
  var signatureVersion: js.UndefOr[v2_ | v3 | v4 | String] = js.native
  var signer: js.UndefOr[typingsJapgolly.awsSdk.signerMod.ClientConfiguration] = js.native
  var simpledb: js.UndefOr[typingsJapgolly.awsSdk.simpledbMod.ClientConfiguration] = js.native
  var sms: js.UndefOr[typingsJapgolly.awsSdk.smsMod.ClientConfiguration] = js.native
  var snowball: js.UndefOr[typingsJapgolly.awsSdk.snowballMod.ClientConfiguration] = js.native
  var sns: js.UndefOr[typingsJapgolly.awsSdk.snsMod.ClientConfiguration] = js.native
  var sqs: js.UndefOr[typingsJapgolly.awsSdk.sqsMod.ClientConfiguration] = js.native
  /**
    * Whether SSL is enabled for requests.
    */
  var sslEnabled: js.UndefOr[Boolean] = js.native
  var ssm: js.UndefOr[typingsJapgolly.awsSdk.ssmMod.ClientConfiguration] = js.native
  var sso: js.UndefOr[typingsJapgolly.awsSdk.ssoMod.ClientConfiguration] = js.native
  var ssooidc: js.UndefOr[typingsJapgolly.awsSdk.ssooidcMod.ClientConfiguration] = js.native
  var stepfunctions: js.UndefOr[typingsJapgolly.awsSdk.stepfunctionsMod.ClientConfiguration] = js.native
  var storagegateway: js.UndefOr[typingsJapgolly.awsSdk.storagegatewayMod.ClientConfiguration] = js.native
  var sts: js.UndefOr[typingsJapgolly.awsSdk.stsMod.ClientConfiguration] = js.native
  /**
    * whether to send sts request to global endpoints or
    * regional endpoints. 
    */
  var stsRegionalEndpoints: js.UndefOr[legacy_ | regional_] = js.native
  var support: js.UndefOr[typingsJapgolly.awsSdk.supportMod.ClientConfiguration] = js.native
  var swf: js.UndefOr[typingsJapgolly.awsSdk.swfMod.ClientConfiguration] = js.native
  /**
    * An offset value in milliseconds to apply to all signing times.
    */
  var systemClockOffset: js.UndefOr[Double] = js.native
  var textract: js.UndefOr[typingsJapgolly.awsSdk.textractMod.ClientConfiguration] = js.native
  var transcribeservice: js.UndefOr[typingsJapgolly.awsSdk.transcribeserviceMod.ClientConfiguration] = js.native
  var transfer: js.UndefOr[typingsJapgolly.awsSdk.transferMod.ClientConfiguration] = js.native
  var translate: js.UndefOr[typingsJapgolly.awsSdk.translateMod.ClientConfiguration] = js.native
  /**
    * Whether to use the Accelerate endpoint with the S3 service.
    */
  var useAccelerateEndpoint: js.UndefOr[Boolean] = js.native
  var waf: js.UndefOr[typingsJapgolly.awsSdk.wafMod.ClientConfiguration] = js.native
  var wafregional: js.UndefOr[typingsJapgolly.awsSdk.wafregionalMod.ClientConfiguration] = js.native
  var wafv2: js.UndefOr[typingsJapgolly.awsSdk.wafv2Mod.ClientConfiguration] = js.native
  var workdocs: js.UndefOr[typingsJapgolly.awsSdk.workdocsMod.ClientConfiguration] = js.native
  var worklink: js.UndefOr[typingsJapgolly.awsSdk.worklinkMod.ClientConfiguration] = js.native
  var workmail: js.UndefOr[typingsJapgolly.awsSdk.workmailMod.ClientConfiguration] = js.native
  var workmailmessageflow: js.UndefOr[typingsJapgolly.awsSdk.workmailmessageflowMod.ClientConfiguration] = js.native
  var workspaces: js.UndefOr[typingsJapgolly.awsSdk.workspacesMod.ClientConfiguration] = js.native
  var xray: js.UndefOr[typingsJapgolly.awsSdk.xrayMod.ClientConfiguration] = js.native
}

object ConfigurationOptionsConfi {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    accessKeyId: String = null,
    accessanalyzer: ClientConfiguration = null,
    acm: typingsJapgolly.awsSdk.acmMod.ClientConfiguration = null,
    acmpca: typingsJapgolly.awsSdk.acmpcaMod.ClientConfiguration = null,
    alexaforbusiness: typingsJapgolly.awsSdk.alexaforbusinessMod.ClientConfiguration = null,
    amplify: typingsJapgolly.awsSdk.amplifyMod.ClientConfiguration = null,
    apiVersion: latest_ | String = null,
    apiVersions: ConfigurationServiceApiVersions = null,
    apigateway: typingsJapgolly.awsSdk.apigatewayMod.ClientConfiguration = null,
    apigatewaymanagementapi: typingsJapgolly.awsSdk.apigatewaymanagementapiMod.ClientConfiguration = null,
    apigatewayv2: typingsJapgolly.awsSdk.apigatewayv2Mod.ClientConfiguration = null,
    appconfig: typingsJapgolly.awsSdk.appconfigMod.ClientConfiguration = null,
    applicationautoscaling: typingsJapgolly.awsSdk.applicationautoscalingMod.ClientConfiguration = null,
    applicationinsights: typingsJapgolly.awsSdk.applicationinsightsMod.ClientConfiguration = null,
    appmesh: typingsJapgolly.awsSdk.appmeshMod.ClientConfiguration = null,
    appstream: typingsJapgolly.awsSdk.appstreamMod.ClientConfiguration = null,
    appsync: typingsJapgolly.awsSdk.appsyncMod.ClientConfiguration = null,
    athena: typingsJapgolly.awsSdk.athenaMod.ClientConfiguration = null,
    augmentedairuntime: typingsJapgolly.awsSdk.augmentedairuntimeMod.ClientConfiguration = null,
    autoscaling: typingsJapgolly.awsSdk.autoscalingMod.ClientConfiguration = null,
    autoscalingplans: typingsJapgolly.awsSdk.autoscalingplansMod.ClientConfiguration = null,
    backup: typingsJapgolly.awsSdk.backupMod.ClientConfiguration = null,
    batch: typingsJapgolly.awsSdk.batchMod.ClientConfiguration = null,
    budgets: typingsJapgolly.awsSdk.budgetsMod.ClientConfiguration = null,
    chime: typingsJapgolly.awsSdk.chimeMod.ClientConfiguration = null,
    cloud9: typingsJapgolly.awsSdk.cloud9Mod.ClientConfiguration = null,
    clouddirectory: typingsJapgolly.awsSdk.clouddirectoryMod.ClientConfiguration = null,
    cloudformation: typingsJapgolly.awsSdk.cloudformationMod.ClientConfiguration = null,
    cloudfront: typingsJapgolly.awsSdk.cloudfrontMod.ClientConfiguration = null,
    cloudhsm: typingsJapgolly.awsSdk.cloudhsmMod.ClientConfiguration = null,
    cloudhsmv2: typingsJapgolly.awsSdk.cloudhsmv2Mod.ClientConfiguration = null,
    cloudsearch: typingsJapgolly.awsSdk.cloudsearchMod.ClientConfiguration = null,
    cloudsearchdomain: typingsJapgolly.awsSdk.cloudsearchdomainMod.ClientConfiguration = null,
    cloudtrail: typingsJapgolly.awsSdk.cloudtrailMod.ClientConfiguration = null,
    cloudwatch: typingsJapgolly.awsSdk.cloudwatchMod.ClientConfiguration = null,
    cloudwatchevents: typingsJapgolly.awsSdk.cloudwatcheventsMod.ClientConfiguration = null,
    cloudwatchlogs: typingsJapgolly.awsSdk.cloudwatchlogsMod.ClientConfiguration = null,
    codebuild: typingsJapgolly.awsSdk.codebuildMod.ClientConfiguration = null,
    codecommit: typingsJapgolly.awsSdk.codecommitMod.ClientConfiguration = null,
    codedeploy: typingsJapgolly.awsSdk.codedeployMod.ClientConfiguration = null,
    codeguruprofiler: typingsJapgolly.awsSdk.codeguruprofilerMod.ClientConfiguration = null,
    codegurureviewer: typingsJapgolly.awsSdk.codegurureviewerMod.ClientConfiguration = null,
    codepipeline: typingsJapgolly.awsSdk.codepipelineMod.ClientConfiguration = null,
    codestar: typingsJapgolly.awsSdk.codestarMod.ClientConfiguration = null,
    codestarconnections: typingsJapgolly.awsSdk.codestarconnectionsMod.ClientConfiguration = null,
    codestarnotifications: typingsJapgolly.awsSdk.codestarnotificationsMod.ClientConfiguration = null,
    cognitoidentity: typingsJapgolly.awsSdk.cognitoidentityMod.ClientConfiguration = null,
    cognitoidentityserviceprovider: typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod.ClientConfiguration = null,
    cognitosync: typingsJapgolly.awsSdk.cognitosyncMod.ClientConfiguration = null,
    comprehend: typingsJapgolly.awsSdk.comprehendMod.ClientConfiguration = null,
    comprehendmedical: typingsJapgolly.awsSdk.comprehendmedicalMod.ClientConfiguration = null,
    computeChecksums: js.UndefOr[Boolean] = js.undefined,
    computeoptimizer: typingsJapgolly.awsSdk.computeoptimizerMod.ClientConfiguration = null,
    configservice: typingsJapgolly.awsSdk.configserviceMod.ClientConfiguration = null,
    connect: typingsJapgolly.awsSdk.connectMod.ClientConfiguration = null,
    connectparticipant: typingsJapgolly.awsSdk.connectparticipantMod.ClientConfiguration = null,
    convertResponseTypes: js.UndefOr[Boolean] = js.undefined,
    correctClockSkew: js.UndefOr[Boolean] = js.undefined,
    costexplorer: typingsJapgolly.awsSdk.costexplorerMod.ClientConfiguration = null,
    credentialProvider: CredentialProviderChain = null,
    credentials: Credentials | CredentialsOptions = null,
    cur: typingsJapgolly.awsSdk.curMod.ClientConfiguration = null,
    customUserAgent: String = null,
    dataexchange: typingsJapgolly.awsSdk.dataexchangeMod.ClientConfiguration = null,
    datapipeline: typingsJapgolly.awsSdk.datapipelineMod.ClientConfiguration = null,
    datasync: typingsJapgolly.awsSdk.datasyncMod.ClientConfiguration = null,
    dax: typingsJapgolly.awsSdk.daxMod.ClientConfiguration = null,
    detective: typingsJapgolly.awsSdk.detectiveMod.ClientConfiguration = null,
    devicefarm: typingsJapgolly.awsSdk.devicefarmMod.ClientConfiguration = null,
    directconnect: typingsJapgolly.awsSdk.directconnectMod.ClientConfiguration = null,
    directoryservice: typingsJapgolly.awsSdk.directoryserviceMod.ClientConfiguration = null,
    discovery: typingsJapgolly.awsSdk.discoveryMod.ClientConfiguration = null,
    dlm: typingsJapgolly.awsSdk.dlmMod.ClientConfiguration = null,
    dms: typingsJapgolly.awsSdk.dmsMod.ClientConfiguration = null,
    docdb: typingsJapgolly.awsSdk.docdbMod.ClientConfiguration = null,
    dynamoDbCrc32: js.UndefOr[Boolean] = js.undefined,
    dynamodb: typingsJapgolly.awsSdk.dynamodbMod.ClientConfiguration = null,
    dynamodbstreams: typingsJapgolly.awsSdk.dynamodbstreamsMod.ClientConfiguration = null,
    ebs: typingsJapgolly.awsSdk.ebsMod.ClientConfiguration = null,
    ec2: typingsJapgolly.awsSdk.ec2Mod.ClientConfiguration = null,
    ec2instanceconnect: typingsJapgolly.awsSdk.ec2instanceconnectMod.ClientConfiguration = null,
    ecr: typingsJapgolly.awsSdk.ecrMod.ClientConfiguration = null,
    ecs: typingsJapgolly.awsSdk.ecsMod.ClientConfiguration = null,
    efs: typingsJapgolly.awsSdk.efsMod.ClientConfiguration = null,
    eks: typingsJapgolly.awsSdk.eksMod.ClientConfiguration = null,
    elasticache: typingsJapgolly.awsSdk.elasticacheMod.ClientConfiguration = null,
    elasticbeanstalk: typingsJapgolly.awsSdk.elasticbeanstalkMod.ClientConfiguration = null,
    elasticinference: typingsJapgolly.awsSdk.elasticinferenceMod.ClientConfiguration = null,
    elastictranscoder: typingsJapgolly.awsSdk.elastictranscoderMod.ClientConfiguration = null,
    elb: typingsJapgolly.awsSdk.elbMod.ClientConfiguration = null,
    elbv2: typingsJapgolly.awsSdk.elbv2Mod.ClientConfiguration = null,
    emr: typingsJapgolly.awsSdk.emrMod.ClientConfiguration = null,
    endpointCacheSize: Int | Double = null,
    endpointDiscoveryEnabled: js.UndefOr[Boolean] = js.undefined,
    es: typingsJapgolly.awsSdk.esMod.ClientConfiguration = null,
    eventbridge: typingsJapgolly.awsSdk.eventbridgeMod.ClientConfiguration = null,
    firehose: typingsJapgolly.awsSdk.firehoseMod.ClientConfiguration = null,
    fms: typingsJapgolly.awsSdk.fmsMod.ClientConfiguration = null,
    forecastqueryservice: typingsJapgolly.awsSdk.forecastqueryserviceMod.ClientConfiguration = null,
    forecastservice: typingsJapgolly.awsSdk.forecastserviceMod.ClientConfiguration = null,
    frauddetector: typingsJapgolly.awsSdk.frauddetectorMod.ClientConfiguration = null,
    fsx: typingsJapgolly.awsSdk.fsxMod.ClientConfiguration = null,
    gamelift: typingsJapgolly.awsSdk.gameliftMod.ClientConfiguration = null,
    glacier: typingsJapgolly.awsSdk.glacierMod.ClientConfiguration = null,
    globalaccelerator: typingsJapgolly.awsSdk.globalacceleratorMod.ClientConfiguration = null,
    glue: typingsJapgolly.awsSdk.glueMod.ClientConfiguration = null,
    greengrass: typingsJapgolly.awsSdk.greengrassMod.ClientConfiguration = null,
    groundstation: typingsJapgolly.awsSdk.groundstationMod.ClientConfiguration = null,
    guardduty: typingsJapgolly.awsSdk.guarddutyMod.ClientConfiguration = null,
    health: typingsJapgolly.awsSdk.healthMod.ClientConfiguration = null,
    hostPrefixEnabled: js.UndefOr[Boolean] = js.undefined,
    httpOptions: HTTPOptions = null,
    iam: typingsJapgolly.awsSdk.iamMod.ClientConfiguration = null,
    imagebuilder: typingsJapgolly.awsSdk.imagebuilderMod.ClientConfiguration = null,
    importexport: typingsJapgolly.awsSdk.importexportMod.ClientConfiguration = null,
    inspector: typingsJapgolly.awsSdk.inspectorMod.ClientConfiguration = null,
    iot: typingsJapgolly.awsSdk.iotMod.ClientConfiguration = null,
    iot1clickdevicesservice: typingsJapgolly.awsSdk.iot1clickdevicesserviceMod.ClientConfiguration = null,
    iot1clickprojects: typingsJapgolly.awsSdk.iot1clickprojectsMod.ClientConfiguration = null,
    iotanalytics: typingsJapgolly.awsSdk.iotanalyticsMod.ClientConfiguration = null,
    iotdata: typingsJapgolly.awsSdk.iotdataMod.ClientConfiguration = null,
    iotevents: typingsJapgolly.awsSdk.ioteventsMod.ClientConfiguration = null,
    ioteventsdata: typingsJapgolly.awsSdk.ioteventsdataMod.ClientConfiguration = null,
    iotjobsdataplane: typingsJapgolly.awsSdk.iotjobsdataplaneMod.ClientConfiguration = null,
    iotsecuretunneling: typingsJapgolly.awsSdk.iotsecuretunnelingMod.ClientConfiguration = null,
    iotthingsgraph: typingsJapgolly.awsSdk.iotthingsgraphMod.ClientConfiguration = null,
    kafka: typingsJapgolly.awsSdk.kafkaMod.ClientConfiguration = null,
    kendra: typingsJapgolly.awsSdk.kendraMod.ClientConfiguration = null,
    kinesis: typingsJapgolly.awsSdk.kinesisMod.ClientConfiguration = null,
    kinesisanalytics: typingsJapgolly.awsSdk.kinesisanalyticsMod.ClientConfiguration = null,
    kinesisanalyticsv2: typingsJapgolly.awsSdk.kinesisanalyticsv2Mod.ClientConfiguration = null,
    kinesisvideo: typingsJapgolly.awsSdk.kinesisvideoMod.ClientConfiguration = null,
    kinesisvideoarchivedmedia: typingsJapgolly.awsSdk.kinesisvideoarchivedmediaMod.ClientConfiguration = null,
    kinesisvideomedia: typingsJapgolly.awsSdk.kinesisvideomediaMod.ClientConfiguration = null,
    kinesisvideosignalingchannels: typingsJapgolly.awsSdk.kinesisvideosignalingchannelsMod.ClientConfiguration = null,
    kms: typingsJapgolly.awsSdk.kmsMod.ClientConfiguration = null,
    lakeformation: typingsJapgolly.awsSdk.lakeformationMod.ClientConfiguration = null,
    lambda: typingsJapgolly.awsSdk.lambdaMod.ClientConfiguration = null,
    lexmodelbuildingservice: typingsJapgolly.awsSdk.lexmodelbuildingserviceMod.ClientConfiguration = null,
    lexruntime: typingsJapgolly.awsSdk.lexruntimeMod.ClientConfiguration = null,
    licensemanager: typingsJapgolly.awsSdk.licensemanagerMod.ClientConfiguration = null,
    lightsail: typingsJapgolly.awsSdk.lightsailMod.ClientConfiguration = null,
    logger: Logger = null,
    machinelearning: typingsJapgolly.awsSdk.machinelearningMod.ClientConfiguration = null,
    macie: typingsJapgolly.awsSdk.macieMod.ClientConfiguration = null,
    managedblockchain: typingsJapgolly.awsSdk.managedblockchainMod.ClientConfiguration = null,
    marketplacecatalog: typingsJapgolly.awsSdk.marketplacecatalogMod.ClientConfiguration = null,
    marketplacecommerceanalytics: typingsJapgolly.awsSdk.marketplacecommerceanalyticsMod.ClientConfiguration = null,
    marketplaceentitlementservice: typingsJapgolly.awsSdk.marketplaceentitlementserviceMod.ClientConfiguration = null,
    marketplacemetering: typingsJapgolly.awsSdk.marketplacemeteringMod.ClientConfiguration = null,
    maxRedirects: Int | Double = null,
    maxRetries: Int | Double = null,
    mediaconnect: typingsJapgolly.awsSdk.mediaconnectMod.ClientConfiguration = null,
    mediaconvert: typingsJapgolly.awsSdk.mediaconvertMod.ClientConfiguration = null,
    medialive: typingsJapgolly.awsSdk.medialiveMod.ClientConfiguration = null,
    mediapackage: typingsJapgolly.awsSdk.mediapackageMod.ClientConfiguration = null,
    mediapackagevod: typingsJapgolly.awsSdk.mediapackagevodMod.ClientConfiguration = null,
    mediastore: typingsJapgolly.awsSdk.mediastoreMod.ClientConfiguration = null,
    mediastoredata: typingsJapgolly.awsSdk.mediastoredataMod.ClientConfiguration = null,
    mediatailor: typingsJapgolly.awsSdk.mediatailorMod.ClientConfiguration = null,
    migrationhub: typingsJapgolly.awsSdk.migrationhubMod.ClientConfiguration = null,
    migrationhubconfig: typingsJapgolly.awsSdk.migrationhubconfigMod.ClientConfiguration = null,
    mobile: typingsJapgolly.awsSdk.mobileMod.ClientConfiguration = null,
    mobileanalytics: typingsJapgolly.awsSdk.mobileanalyticsMod.ClientConfiguration = null,
    mq: typingsJapgolly.awsSdk.mqMod.ClientConfiguration = null,
    mturk: typingsJapgolly.awsSdk.mturkMod.ClientConfiguration = null,
    neptune: typingsJapgolly.awsSdk.neptuneMod.ClientConfiguration = null,
    networkmanager: typingsJapgolly.awsSdk.networkmanagerMod.ClientConfiguration = null,
    opsworks: typingsJapgolly.awsSdk.opsworksMod.ClientConfiguration = null,
    opsworkscm: typingsJapgolly.awsSdk.opsworkscmMod.ClientConfiguration = null,
    organizations: typingsJapgolly.awsSdk.organizationsMod.ClientConfiguration = null,
    outposts: typingsJapgolly.awsSdk.outpostsMod.ClientConfiguration = null,
    paramValidation: ParamValidation | Boolean = null,
    personalize: typingsJapgolly.awsSdk.personalizeMod.ClientConfiguration = null,
    personalizeevents: typingsJapgolly.awsSdk.personalizeeventsMod.ClientConfiguration = null,
    personalizeruntime: typingsJapgolly.awsSdk.personalizeruntimeMod.ClientConfiguration = null,
    pi: typingsJapgolly.awsSdk.piMod.ClientConfiguration = null,
    pinpoint: typingsJapgolly.awsSdk.pinpointMod.ClientConfiguration = null,
    pinpointemail: typingsJapgolly.awsSdk.pinpointemailMod.ClientConfiguration = null,
    pinpointsmsvoice: typingsJapgolly.awsSdk.pinpointsmsvoiceMod.ClientConfiguration = null,
    polly: typingsJapgolly.awsSdk.pollyMod.ClientConfiguration = null,
    pricing: typingsJapgolly.awsSdk.pricingMod.ClientConfiguration = null,
    qldb: typingsJapgolly.awsSdk.qldbMod.ClientConfiguration = null,
    qldbsession: typingsJapgolly.awsSdk.qldbsessionMod.ClientConfiguration = null,
    quicksight: typingsJapgolly.awsSdk.quicksightMod.ClientConfiguration = null,
    ram: typingsJapgolly.awsSdk.ramMod.ClientConfiguration = null,
    rds: typingsJapgolly.awsSdk.rdsMod.ClientConfiguration = null,
    rdsdataservice: typingsJapgolly.awsSdk.rdsdataserviceMod.ClientConfiguration = null,
    redshift: typingsJapgolly.awsSdk.redshiftMod.ClientConfiguration = null,
    region: String = null,
    rekognition: typingsJapgolly.awsSdk.rekognitionMod.ClientConfiguration = null,
    resourcegroups: typingsJapgolly.awsSdk.resourcegroupsMod.ClientConfiguration = null,
    resourcegroupstaggingapi: typingsJapgolly.awsSdk.resourcegroupstaggingapiMod.ClientConfiguration = null,
    retryDelayOptions: RetryDelayOptions = null,
    robomaker: typingsJapgolly.awsSdk.robomakerMod.ClientConfiguration = null,
    route53: typingsJapgolly.awsSdk.route53Mod.ClientConfiguration = null,
    route53domains: typingsJapgolly.awsSdk.route53domainsMod.ClientConfiguration = null,
    route53resolver: typingsJapgolly.awsSdk.route53resolverMod.ClientConfiguration = null,
    s3: typingsJapgolly.awsSdk.s3Mod.ClientConfiguration = null,
    s3BucketEndpoint: js.UndefOr[Boolean] = js.undefined,
    s3DisableBodySigning: js.UndefOr[Boolean] = js.undefined,
    s3ForcePathStyle: js.UndefOr[Boolean] = js.undefined,
    s3UsEast1RegionalEndpoint: regional_ | legacy_ = null,
    s3UseArnRegion: js.UndefOr[Boolean] = js.undefined,
    s3control: typingsJapgolly.awsSdk.s3controlMod.ClientConfiguration = null,
    sagemaker: typingsJapgolly.awsSdk.sagemakerMod.ClientConfiguration = null,
    sagemakerruntime: typingsJapgolly.awsSdk.sagemakerruntimeMod.ClientConfiguration = null,
    savingsplans: typingsJapgolly.awsSdk.savingsplansMod.ClientConfiguration = null,
    schemas: typingsJapgolly.awsSdk.schemasMod.ClientConfiguration = null,
    secretAccessKey: String = null,
    secretsmanager: typingsJapgolly.awsSdk.secretsmanagerMod.ClientConfiguration = null,
    securityhub: typingsJapgolly.awsSdk.securityhubMod.ClientConfiguration = null,
    serverlessapplicationrepository: typingsJapgolly.awsSdk.serverlessapplicationrepositoryMod.ClientConfiguration = null,
    servicecatalog: typingsJapgolly.awsSdk.servicecatalogMod.ClientConfiguration = null,
    servicediscovery: typingsJapgolly.awsSdk.servicediscoveryMod.ClientConfiguration = null,
    servicequotas: typingsJapgolly.awsSdk.servicequotasMod.ClientConfiguration = null,
    ses: typingsJapgolly.awsSdk.sesMod.ClientConfiguration = null,
    sessionToken: String = null,
    sesv2: typingsJapgolly.awsSdk.sesv2Mod.ClientConfiguration = null,
    shield: typingsJapgolly.awsSdk.shieldMod.ClientConfiguration = null,
    signatureCache: js.UndefOr[Boolean] = js.undefined,
    signatureVersion: v2_ | v3 | v4 | String = null,
    signer: typingsJapgolly.awsSdk.signerMod.ClientConfiguration = null,
    simpledb: typingsJapgolly.awsSdk.simpledbMod.ClientConfiguration = null,
    sms: typingsJapgolly.awsSdk.smsMod.ClientConfiguration = null,
    snowball: typingsJapgolly.awsSdk.snowballMod.ClientConfiguration = null,
    sns: typingsJapgolly.awsSdk.snsMod.ClientConfiguration = null,
    sqs: typingsJapgolly.awsSdk.sqsMod.ClientConfiguration = null,
    sslEnabled: js.UndefOr[Boolean] = js.undefined,
    ssm: typingsJapgolly.awsSdk.ssmMod.ClientConfiguration = null,
    sso: typingsJapgolly.awsSdk.ssoMod.ClientConfiguration = null,
    ssooidc: typingsJapgolly.awsSdk.ssooidcMod.ClientConfiguration = null,
    stepfunctions: typingsJapgolly.awsSdk.stepfunctionsMod.ClientConfiguration = null,
    storagegateway: typingsJapgolly.awsSdk.storagegatewayMod.ClientConfiguration = null,
    sts: typingsJapgolly.awsSdk.stsMod.ClientConfiguration = null,
    stsRegionalEndpoints: legacy_ | regional_ = null,
    support: typingsJapgolly.awsSdk.supportMod.ClientConfiguration = null,
    swf: typingsJapgolly.awsSdk.swfMod.ClientConfiguration = null,
    systemClockOffset: Int | Double = null,
    textract: typingsJapgolly.awsSdk.textractMod.ClientConfiguration = null,
    transcribeservice: typingsJapgolly.awsSdk.transcribeserviceMod.ClientConfiguration = null,
    transfer: typingsJapgolly.awsSdk.transferMod.ClientConfiguration = null,
    translate: typingsJapgolly.awsSdk.translateMod.ClientConfiguration = null,
    useAccelerateEndpoint: js.UndefOr[Boolean] = js.undefined,
    waf: typingsJapgolly.awsSdk.wafMod.ClientConfiguration = null,
    wafregional: typingsJapgolly.awsSdk.wafregionalMod.ClientConfiguration = null,
    wafv2: typingsJapgolly.awsSdk.wafv2Mod.ClientConfiguration = null,
    workdocs: typingsJapgolly.awsSdk.workdocsMod.ClientConfiguration = null,
    worklink: typingsJapgolly.awsSdk.worklinkMod.ClientConfiguration = null,
    workmail: typingsJapgolly.awsSdk.workmailMod.ClientConfiguration = null,
    workmailmessageflow: typingsJapgolly.awsSdk.workmailmessageflowMod.ClientConfiguration = null,
    workspaces: typingsJapgolly.awsSdk.workspacesMod.ClientConfiguration = null,
    xray: typingsJapgolly.awsSdk.xrayMod.ClientConfiguration = null
  ): ConfigurationOptionsConfi = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (accessKeyId != null) __obj.updateDynamic("accessKeyId")(accessKeyId.asInstanceOf[js.Any])
    if (accessanalyzer != null) __obj.updateDynamic("accessanalyzer")(accessanalyzer.asInstanceOf[js.Any])
    if (acm != null) __obj.updateDynamic("acm")(acm.asInstanceOf[js.Any])
    if (acmpca != null) __obj.updateDynamic("acmpca")(acmpca.asInstanceOf[js.Any])
    if (alexaforbusiness != null) __obj.updateDynamic("alexaforbusiness")(alexaforbusiness.asInstanceOf[js.Any])
    if (amplify != null) __obj.updateDynamic("amplify")(amplify.asInstanceOf[js.Any])
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (apiVersions != null) __obj.updateDynamic("apiVersions")(apiVersions.asInstanceOf[js.Any])
    if (apigateway != null) __obj.updateDynamic("apigateway")(apigateway.asInstanceOf[js.Any])
    if (apigatewaymanagementapi != null) __obj.updateDynamic("apigatewaymanagementapi")(apigatewaymanagementapi.asInstanceOf[js.Any])
    if (apigatewayv2 != null) __obj.updateDynamic("apigatewayv2")(apigatewayv2.asInstanceOf[js.Any])
    if (appconfig != null) __obj.updateDynamic("appconfig")(appconfig.asInstanceOf[js.Any])
    if (applicationautoscaling != null) __obj.updateDynamic("applicationautoscaling")(applicationautoscaling.asInstanceOf[js.Any])
    if (applicationinsights != null) __obj.updateDynamic("applicationinsights")(applicationinsights.asInstanceOf[js.Any])
    if (appmesh != null) __obj.updateDynamic("appmesh")(appmesh.asInstanceOf[js.Any])
    if (appstream != null) __obj.updateDynamic("appstream")(appstream.asInstanceOf[js.Any])
    if (appsync != null) __obj.updateDynamic("appsync")(appsync.asInstanceOf[js.Any])
    if (athena != null) __obj.updateDynamic("athena")(athena.asInstanceOf[js.Any])
    if (augmentedairuntime != null) __obj.updateDynamic("augmentedairuntime")(augmentedairuntime.asInstanceOf[js.Any])
    if (autoscaling != null) __obj.updateDynamic("autoscaling")(autoscaling.asInstanceOf[js.Any])
    if (autoscalingplans != null) __obj.updateDynamic("autoscalingplans")(autoscalingplans.asInstanceOf[js.Any])
    if (backup != null) __obj.updateDynamic("backup")(backup.asInstanceOf[js.Any])
    if (batch != null) __obj.updateDynamic("batch")(batch.asInstanceOf[js.Any])
    if (budgets != null) __obj.updateDynamic("budgets")(budgets.asInstanceOf[js.Any])
    if (chime != null) __obj.updateDynamic("chime")(chime.asInstanceOf[js.Any])
    if (cloud9 != null) __obj.updateDynamic("cloud9")(cloud9.asInstanceOf[js.Any])
    if (clouddirectory != null) __obj.updateDynamic("clouddirectory")(clouddirectory.asInstanceOf[js.Any])
    if (cloudformation != null) __obj.updateDynamic("cloudformation")(cloudformation.asInstanceOf[js.Any])
    if (cloudfront != null) __obj.updateDynamic("cloudfront")(cloudfront.asInstanceOf[js.Any])
    if (cloudhsm != null) __obj.updateDynamic("cloudhsm")(cloudhsm.asInstanceOf[js.Any])
    if (cloudhsmv2 != null) __obj.updateDynamic("cloudhsmv2")(cloudhsmv2.asInstanceOf[js.Any])
    if (cloudsearch != null) __obj.updateDynamic("cloudsearch")(cloudsearch.asInstanceOf[js.Any])
    if (cloudsearchdomain != null) __obj.updateDynamic("cloudsearchdomain")(cloudsearchdomain.asInstanceOf[js.Any])
    if (cloudtrail != null) __obj.updateDynamic("cloudtrail")(cloudtrail.asInstanceOf[js.Any])
    if (cloudwatch != null) __obj.updateDynamic("cloudwatch")(cloudwatch.asInstanceOf[js.Any])
    if (cloudwatchevents != null) __obj.updateDynamic("cloudwatchevents")(cloudwatchevents.asInstanceOf[js.Any])
    if (cloudwatchlogs != null) __obj.updateDynamic("cloudwatchlogs")(cloudwatchlogs.asInstanceOf[js.Any])
    if (codebuild != null) __obj.updateDynamic("codebuild")(codebuild.asInstanceOf[js.Any])
    if (codecommit != null) __obj.updateDynamic("codecommit")(codecommit.asInstanceOf[js.Any])
    if (codedeploy != null) __obj.updateDynamic("codedeploy")(codedeploy.asInstanceOf[js.Any])
    if (codeguruprofiler != null) __obj.updateDynamic("codeguruprofiler")(codeguruprofiler.asInstanceOf[js.Any])
    if (codegurureviewer != null) __obj.updateDynamic("codegurureviewer")(codegurureviewer.asInstanceOf[js.Any])
    if (codepipeline != null) __obj.updateDynamic("codepipeline")(codepipeline.asInstanceOf[js.Any])
    if (codestar != null) __obj.updateDynamic("codestar")(codestar.asInstanceOf[js.Any])
    if (codestarconnections != null) __obj.updateDynamic("codestarconnections")(codestarconnections.asInstanceOf[js.Any])
    if (codestarnotifications != null) __obj.updateDynamic("codestarnotifications")(codestarnotifications.asInstanceOf[js.Any])
    if (cognitoidentity != null) __obj.updateDynamic("cognitoidentity")(cognitoidentity.asInstanceOf[js.Any])
    if (cognitoidentityserviceprovider != null) __obj.updateDynamic("cognitoidentityserviceprovider")(cognitoidentityserviceprovider.asInstanceOf[js.Any])
    if (cognitosync != null) __obj.updateDynamic("cognitosync")(cognitosync.asInstanceOf[js.Any])
    if (comprehend != null) __obj.updateDynamic("comprehend")(comprehend.asInstanceOf[js.Any])
    if (comprehendmedical != null) __obj.updateDynamic("comprehendmedical")(comprehendmedical.asInstanceOf[js.Any])
    if (!js.isUndefined(computeChecksums)) __obj.updateDynamic("computeChecksums")(computeChecksums.asInstanceOf[js.Any])
    if (computeoptimizer != null) __obj.updateDynamic("computeoptimizer")(computeoptimizer.asInstanceOf[js.Any])
    if (configservice != null) __obj.updateDynamic("configservice")(configservice.asInstanceOf[js.Any])
    if (connect != null) __obj.updateDynamic("connect")(connect.asInstanceOf[js.Any])
    if (connectparticipant != null) __obj.updateDynamic("connectparticipant")(connectparticipant.asInstanceOf[js.Any])
    if (!js.isUndefined(convertResponseTypes)) __obj.updateDynamic("convertResponseTypes")(convertResponseTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(correctClockSkew)) __obj.updateDynamic("correctClockSkew")(correctClockSkew.asInstanceOf[js.Any])
    if (costexplorer != null) __obj.updateDynamic("costexplorer")(costexplorer.asInstanceOf[js.Any])
    if (credentialProvider != null) __obj.updateDynamic("credentialProvider")(credentialProvider.asInstanceOf[js.Any])
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (cur != null) __obj.updateDynamic("cur")(cur.asInstanceOf[js.Any])
    if (customUserAgent != null) __obj.updateDynamic("customUserAgent")(customUserAgent.asInstanceOf[js.Any])
    if (dataexchange != null) __obj.updateDynamic("dataexchange")(dataexchange.asInstanceOf[js.Any])
    if (datapipeline != null) __obj.updateDynamic("datapipeline")(datapipeline.asInstanceOf[js.Any])
    if (datasync != null) __obj.updateDynamic("datasync")(datasync.asInstanceOf[js.Any])
    if (dax != null) __obj.updateDynamic("dax")(dax.asInstanceOf[js.Any])
    if (detective != null) __obj.updateDynamic("detective")(detective.asInstanceOf[js.Any])
    if (devicefarm != null) __obj.updateDynamic("devicefarm")(devicefarm.asInstanceOf[js.Any])
    if (directconnect != null) __obj.updateDynamic("directconnect")(directconnect.asInstanceOf[js.Any])
    if (directoryservice != null) __obj.updateDynamic("directoryservice")(directoryservice.asInstanceOf[js.Any])
    if (discovery != null) __obj.updateDynamic("discovery")(discovery.asInstanceOf[js.Any])
    if (dlm != null) __obj.updateDynamic("dlm")(dlm.asInstanceOf[js.Any])
    if (dms != null) __obj.updateDynamic("dms")(dms.asInstanceOf[js.Any])
    if (docdb != null) __obj.updateDynamic("docdb")(docdb.asInstanceOf[js.Any])
    if (!js.isUndefined(dynamoDbCrc32)) __obj.updateDynamic("dynamoDbCrc32")(dynamoDbCrc32.asInstanceOf[js.Any])
    if (dynamodb != null) __obj.updateDynamic("dynamodb")(dynamodb.asInstanceOf[js.Any])
    if (dynamodbstreams != null) __obj.updateDynamic("dynamodbstreams")(dynamodbstreams.asInstanceOf[js.Any])
    if (ebs != null) __obj.updateDynamic("ebs")(ebs.asInstanceOf[js.Any])
    if (ec2 != null) __obj.updateDynamic("ec2")(ec2.asInstanceOf[js.Any])
    if (ec2instanceconnect != null) __obj.updateDynamic("ec2instanceconnect")(ec2instanceconnect.asInstanceOf[js.Any])
    if (ecr != null) __obj.updateDynamic("ecr")(ecr.asInstanceOf[js.Any])
    if (ecs != null) __obj.updateDynamic("ecs")(ecs.asInstanceOf[js.Any])
    if (efs != null) __obj.updateDynamic("efs")(efs.asInstanceOf[js.Any])
    if (eks != null) __obj.updateDynamic("eks")(eks.asInstanceOf[js.Any])
    if (elasticache != null) __obj.updateDynamic("elasticache")(elasticache.asInstanceOf[js.Any])
    if (elasticbeanstalk != null) __obj.updateDynamic("elasticbeanstalk")(elasticbeanstalk.asInstanceOf[js.Any])
    if (elasticinference != null) __obj.updateDynamic("elasticinference")(elasticinference.asInstanceOf[js.Any])
    if (elastictranscoder != null) __obj.updateDynamic("elastictranscoder")(elastictranscoder.asInstanceOf[js.Any])
    if (elb != null) __obj.updateDynamic("elb")(elb.asInstanceOf[js.Any])
    if (elbv2 != null) __obj.updateDynamic("elbv2")(elbv2.asInstanceOf[js.Any])
    if (emr != null) __obj.updateDynamic("emr")(emr.asInstanceOf[js.Any])
    if (endpointCacheSize != null) __obj.updateDynamic("endpointCacheSize")(endpointCacheSize.asInstanceOf[js.Any])
    if (!js.isUndefined(endpointDiscoveryEnabled)) __obj.updateDynamic("endpointDiscoveryEnabled")(endpointDiscoveryEnabled.asInstanceOf[js.Any])
    if (es != null) __obj.updateDynamic("es")(es.asInstanceOf[js.Any])
    if (eventbridge != null) __obj.updateDynamic("eventbridge")(eventbridge.asInstanceOf[js.Any])
    if (firehose != null) __obj.updateDynamic("firehose")(firehose.asInstanceOf[js.Any])
    if (fms != null) __obj.updateDynamic("fms")(fms.asInstanceOf[js.Any])
    if (forecastqueryservice != null) __obj.updateDynamic("forecastqueryservice")(forecastqueryservice.asInstanceOf[js.Any])
    if (forecastservice != null) __obj.updateDynamic("forecastservice")(forecastservice.asInstanceOf[js.Any])
    if (frauddetector != null) __obj.updateDynamic("frauddetector")(frauddetector.asInstanceOf[js.Any])
    if (fsx != null) __obj.updateDynamic("fsx")(fsx.asInstanceOf[js.Any])
    if (gamelift != null) __obj.updateDynamic("gamelift")(gamelift.asInstanceOf[js.Any])
    if (glacier != null) __obj.updateDynamic("glacier")(glacier.asInstanceOf[js.Any])
    if (globalaccelerator != null) __obj.updateDynamic("globalaccelerator")(globalaccelerator.asInstanceOf[js.Any])
    if (glue != null) __obj.updateDynamic("glue")(glue.asInstanceOf[js.Any])
    if (greengrass != null) __obj.updateDynamic("greengrass")(greengrass.asInstanceOf[js.Any])
    if (groundstation != null) __obj.updateDynamic("groundstation")(groundstation.asInstanceOf[js.Any])
    if (guardduty != null) __obj.updateDynamic("guardduty")(guardduty.asInstanceOf[js.Any])
    if (health != null) __obj.updateDynamic("health")(health.asInstanceOf[js.Any])
    if (!js.isUndefined(hostPrefixEnabled)) __obj.updateDynamic("hostPrefixEnabled")(hostPrefixEnabled.asInstanceOf[js.Any])
    if (httpOptions != null) __obj.updateDynamic("httpOptions")(httpOptions.asInstanceOf[js.Any])
    if (iam != null) __obj.updateDynamic("iam")(iam.asInstanceOf[js.Any])
    if (imagebuilder != null) __obj.updateDynamic("imagebuilder")(imagebuilder.asInstanceOf[js.Any])
    if (importexport != null) __obj.updateDynamic("importexport")(importexport.asInstanceOf[js.Any])
    if (inspector != null) __obj.updateDynamic("inspector")(inspector.asInstanceOf[js.Any])
    if (iot != null) __obj.updateDynamic("iot")(iot.asInstanceOf[js.Any])
    if (iot1clickdevicesservice != null) __obj.updateDynamic("iot1clickdevicesservice")(iot1clickdevicesservice.asInstanceOf[js.Any])
    if (iot1clickprojects != null) __obj.updateDynamic("iot1clickprojects")(iot1clickprojects.asInstanceOf[js.Any])
    if (iotanalytics != null) __obj.updateDynamic("iotanalytics")(iotanalytics.asInstanceOf[js.Any])
    if (iotdata != null) __obj.updateDynamic("iotdata")(iotdata.asInstanceOf[js.Any])
    if (iotevents != null) __obj.updateDynamic("iotevents")(iotevents.asInstanceOf[js.Any])
    if (ioteventsdata != null) __obj.updateDynamic("ioteventsdata")(ioteventsdata.asInstanceOf[js.Any])
    if (iotjobsdataplane != null) __obj.updateDynamic("iotjobsdataplane")(iotjobsdataplane.asInstanceOf[js.Any])
    if (iotsecuretunneling != null) __obj.updateDynamic("iotsecuretunneling")(iotsecuretunneling.asInstanceOf[js.Any])
    if (iotthingsgraph != null) __obj.updateDynamic("iotthingsgraph")(iotthingsgraph.asInstanceOf[js.Any])
    if (kafka != null) __obj.updateDynamic("kafka")(kafka.asInstanceOf[js.Any])
    if (kendra != null) __obj.updateDynamic("kendra")(kendra.asInstanceOf[js.Any])
    if (kinesis != null) __obj.updateDynamic("kinesis")(kinesis.asInstanceOf[js.Any])
    if (kinesisanalytics != null) __obj.updateDynamic("kinesisanalytics")(kinesisanalytics.asInstanceOf[js.Any])
    if (kinesisanalyticsv2 != null) __obj.updateDynamic("kinesisanalyticsv2")(kinesisanalyticsv2.asInstanceOf[js.Any])
    if (kinesisvideo != null) __obj.updateDynamic("kinesisvideo")(kinesisvideo.asInstanceOf[js.Any])
    if (kinesisvideoarchivedmedia != null) __obj.updateDynamic("kinesisvideoarchivedmedia")(kinesisvideoarchivedmedia.asInstanceOf[js.Any])
    if (kinesisvideomedia != null) __obj.updateDynamic("kinesisvideomedia")(kinesisvideomedia.asInstanceOf[js.Any])
    if (kinesisvideosignalingchannels != null) __obj.updateDynamic("kinesisvideosignalingchannels")(kinesisvideosignalingchannels.asInstanceOf[js.Any])
    if (kms != null) __obj.updateDynamic("kms")(kms.asInstanceOf[js.Any])
    if (lakeformation != null) __obj.updateDynamic("lakeformation")(lakeformation.asInstanceOf[js.Any])
    if (lambda != null) __obj.updateDynamic("lambda")(lambda.asInstanceOf[js.Any])
    if (lexmodelbuildingservice != null) __obj.updateDynamic("lexmodelbuildingservice")(lexmodelbuildingservice.asInstanceOf[js.Any])
    if (lexruntime != null) __obj.updateDynamic("lexruntime")(lexruntime.asInstanceOf[js.Any])
    if (licensemanager != null) __obj.updateDynamic("licensemanager")(licensemanager.asInstanceOf[js.Any])
    if (lightsail != null) __obj.updateDynamic("lightsail")(lightsail.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (machinelearning != null) __obj.updateDynamic("machinelearning")(machinelearning.asInstanceOf[js.Any])
    if (macie != null) __obj.updateDynamic("macie")(macie.asInstanceOf[js.Any])
    if (managedblockchain != null) __obj.updateDynamic("managedblockchain")(managedblockchain.asInstanceOf[js.Any])
    if (marketplacecatalog != null) __obj.updateDynamic("marketplacecatalog")(marketplacecatalog.asInstanceOf[js.Any])
    if (marketplacecommerceanalytics != null) __obj.updateDynamic("marketplacecommerceanalytics")(marketplacecommerceanalytics.asInstanceOf[js.Any])
    if (marketplaceentitlementservice != null) __obj.updateDynamic("marketplaceentitlementservice")(marketplaceentitlementservice.asInstanceOf[js.Any])
    if (marketplacemetering != null) __obj.updateDynamic("marketplacemetering")(marketplacemetering.asInstanceOf[js.Any])
    if (maxRedirects != null) __obj.updateDynamic("maxRedirects")(maxRedirects.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (mediaconnect != null) __obj.updateDynamic("mediaconnect")(mediaconnect.asInstanceOf[js.Any])
    if (mediaconvert != null) __obj.updateDynamic("mediaconvert")(mediaconvert.asInstanceOf[js.Any])
    if (medialive != null) __obj.updateDynamic("medialive")(medialive.asInstanceOf[js.Any])
    if (mediapackage != null) __obj.updateDynamic("mediapackage")(mediapackage.asInstanceOf[js.Any])
    if (mediapackagevod != null) __obj.updateDynamic("mediapackagevod")(mediapackagevod.asInstanceOf[js.Any])
    if (mediastore != null) __obj.updateDynamic("mediastore")(mediastore.asInstanceOf[js.Any])
    if (mediastoredata != null) __obj.updateDynamic("mediastoredata")(mediastoredata.asInstanceOf[js.Any])
    if (mediatailor != null) __obj.updateDynamic("mediatailor")(mediatailor.asInstanceOf[js.Any])
    if (migrationhub != null) __obj.updateDynamic("migrationhub")(migrationhub.asInstanceOf[js.Any])
    if (migrationhubconfig != null) __obj.updateDynamic("migrationhubconfig")(migrationhubconfig.asInstanceOf[js.Any])
    if (mobile != null) __obj.updateDynamic("mobile")(mobile.asInstanceOf[js.Any])
    if (mobileanalytics != null) __obj.updateDynamic("mobileanalytics")(mobileanalytics.asInstanceOf[js.Any])
    if (mq != null) __obj.updateDynamic("mq")(mq.asInstanceOf[js.Any])
    if (mturk != null) __obj.updateDynamic("mturk")(mturk.asInstanceOf[js.Any])
    if (neptune != null) __obj.updateDynamic("neptune")(neptune.asInstanceOf[js.Any])
    if (networkmanager != null) __obj.updateDynamic("networkmanager")(networkmanager.asInstanceOf[js.Any])
    if (opsworks != null) __obj.updateDynamic("opsworks")(opsworks.asInstanceOf[js.Any])
    if (opsworkscm != null) __obj.updateDynamic("opsworkscm")(opsworkscm.asInstanceOf[js.Any])
    if (organizations != null) __obj.updateDynamic("organizations")(organizations.asInstanceOf[js.Any])
    if (outposts != null) __obj.updateDynamic("outposts")(outposts.asInstanceOf[js.Any])
    if (paramValidation != null) __obj.updateDynamic("paramValidation")(paramValidation.asInstanceOf[js.Any])
    if (personalize != null) __obj.updateDynamic("personalize")(personalize.asInstanceOf[js.Any])
    if (personalizeevents != null) __obj.updateDynamic("personalizeevents")(personalizeevents.asInstanceOf[js.Any])
    if (personalizeruntime != null) __obj.updateDynamic("personalizeruntime")(personalizeruntime.asInstanceOf[js.Any])
    if (pi != null) __obj.updateDynamic("pi")(pi.asInstanceOf[js.Any])
    if (pinpoint != null) __obj.updateDynamic("pinpoint")(pinpoint.asInstanceOf[js.Any])
    if (pinpointemail != null) __obj.updateDynamic("pinpointemail")(pinpointemail.asInstanceOf[js.Any])
    if (pinpointsmsvoice != null) __obj.updateDynamic("pinpointsmsvoice")(pinpointsmsvoice.asInstanceOf[js.Any])
    if (polly != null) __obj.updateDynamic("polly")(polly.asInstanceOf[js.Any])
    if (pricing != null) __obj.updateDynamic("pricing")(pricing.asInstanceOf[js.Any])
    if (qldb != null) __obj.updateDynamic("qldb")(qldb.asInstanceOf[js.Any])
    if (qldbsession != null) __obj.updateDynamic("qldbsession")(qldbsession.asInstanceOf[js.Any])
    if (quicksight != null) __obj.updateDynamic("quicksight")(quicksight.asInstanceOf[js.Any])
    if (ram != null) __obj.updateDynamic("ram")(ram.asInstanceOf[js.Any])
    if (rds != null) __obj.updateDynamic("rds")(rds.asInstanceOf[js.Any])
    if (rdsdataservice != null) __obj.updateDynamic("rdsdataservice")(rdsdataservice.asInstanceOf[js.Any])
    if (redshift != null) __obj.updateDynamic("redshift")(redshift.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (rekognition != null) __obj.updateDynamic("rekognition")(rekognition.asInstanceOf[js.Any])
    if (resourcegroups != null) __obj.updateDynamic("resourcegroups")(resourcegroups.asInstanceOf[js.Any])
    if (resourcegroupstaggingapi != null) __obj.updateDynamic("resourcegroupstaggingapi")(resourcegroupstaggingapi.asInstanceOf[js.Any])
    if (retryDelayOptions != null) __obj.updateDynamic("retryDelayOptions")(retryDelayOptions.asInstanceOf[js.Any])
    if (robomaker != null) __obj.updateDynamic("robomaker")(robomaker.asInstanceOf[js.Any])
    if (route53 != null) __obj.updateDynamic("route53")(route53.asInstanceOf[js.Any])
    if (route53domains != null) __obj.updateDynamic("route53domains")(route53domains.asInstanceOf[js.Any])
    if (route53resolver != null) __obj.updateDynamic("route53resolver")(route53resolver.asInstanceOf[js.Any])
    if (s3 != null) __obj.updateDynamic("s3")(s3.asInstanceOf[js.Any])
    if (!js.isUndefined(s3BucketEndpoint)) __obj.updateDynamic("s3BucketEndpoint")(s3BucketEndpoint.asInstanceOf[js.Any])
    if (!js.isUndefined(s3DisableBodySigning)) __obj.updateDynamic("s3DisableBodySigning")(s3DisableBodySigning.asInstanceOf[js.Any])
    if (!js.isUndefined(s3ForcePathStyle)) __obj.updateDynamic("s3ForcePathStyle")(s3ForcePathStyle.asInstanceOf[js.Any])
    if (s3UsEast1RegionalEndpoint != null) __obj.updateDynamic("s3UsEast1RegionalEndpoint")(s3UsEast1RegionalEndpoint.asInstanceOf[js.Any])
    if (!js.isUndefined(s3UseArnRegion)) __obj.updateDynamic("s3UseArnRegion")(s3UseArnRegion.asInstanceOf[js.Any])
    if (s3control != null) __obj.updateDynamic("s3control")(s3control.asInstanceOf[js.Any])
    if (sagemaker != null) __obj.updateDynamic("sagemaker")(sagemaker.asInstanceOf[js.Any])
    if (sagemakerruntime != null) __obj.updateDynamic("sagemakerruntime")(sagemakerruntime.asInstanceOf[js.Any])
    if (savingsplans != null) __obj.updateDynamic("savingsplans")(savingsplans.asInstanceOf[js.Any])
    if (schemas != null) __obj.updateDynamic("schemas")(schemas.asInstanceOf[js.Any])
    if (secretAccessKey != null) __obj.updateDynamic("secretAccessKey")(secretAccessKey.asInstanceOf[js.Any])
    if (secretsmanager != null) __obj.updateDynamic("secretsmanager")(secretsmanager.asInstanceOf[js.Any])
    if (securityhub != null) __obj.updateDynamic("securityhub")(securityhub.asInstanceOf[js.Any])
    if (serverlessapplicationrepository != null) __obj.updateDynamic("serverlessapplicationrepository")(serverlessapplicationrepository.asInstanceOf[js.Any])
    if (servicecatalog != null) __obj.updateDynamic("servicecatalog")(servicecatalog.asInstanceOf[js.Any])
    if (servicediscovery != null) __obj.updateDynamic("servicediscovery")(servicediscovery.asInstanceOf[js.Any])
    if (servicequotas != null) __obj.updateDynamic("servicequotas")(servicequotas.asInstanceOf[js.Any])
    if (ses != null) __obj.updateDynamic("ses")(ses.asInstanceOf[js.Any])
    if (sessionToken != null) __obj.updateDynamic("sessionToken")(sessionToken.asInstanceOf[js.Any])
    if (sesv2 != null) __obj.updateDynamic("sesv2")(sesv2.asInstanceOf[js.Any])
    if (shield != null) __obj.updateDynamic("shield")(shield.asInstanceOf[js.Any])
    if (!js.isUndefined(signatureCache)) __obj.updateDynamic("signatureCache")(signatureCache.asInstanceOf[js.Any])
    if (signatureVersion != null) __obj.updateDynamic("signatureVersion")(signatureVersion.asInstanceOf[js.Any])
    if (signer != null) __obj.updateDynamic("signer")(signer.asInstanceOf[js.Any])
    if (simpledb != null) __obj.updateDynamic("simpledb")(simpledb.asInstanceOf[js.Any])
    if (sms != null) __obj.updateDynamic("sms")(sms.asInstanceOf[js.Any])
    if (snowball != null) __obj.updateDynamic("snowball")(snowball.asInstanceOf[js.Any])
    if (sns != null) __obj.updateDynamic("sns")(sns.asInstanceOf[js.Any])
    if (sqs != null) __obj.updateDynamic("sqs")(sqs.asInstanceOf[js.Any])
    if (!js.isUndefined(sslEnabled)) __obj.updateDynamic("sslEnabled")(sslEnabled.asInstanceOf[js.Any])
    if (ssm != null) __obj.updateDynamic("ssm")(ssm.asInstanceOf[js.Any])
    if (sso != null) __obj.updateDynamic("sso")(sso.asInstanceOf[js.Any])
    if (ssooidc != null) __obj.updateDynamic("ssooidc")(ssooidc.asInstanceOf[js.Any])
    if (stepfunctions != null) __obj.updateDynamic("stepfunctions")(stepfunctions.asInstanceOf[js.Any])
    if (storagegateway != null) __obj.updateDynamic("storagegateway")(storagegateway.asInstanceOf[js.Any])
    if (sts != null) __obj.updateDynamic("sts")(sts.asInstanceOf[js.Any])
    if (stsRegionalEndpoints != null) __obj.updateDynamic("stsRegionalEndpoints")(stsRegionalEndpoints.asInstanceOf[js.Any])
    if (support != null) __obj.updateDynamic("support")(support.asInstanceOf[js.Any])
    if (swf != null) __obj.updateDynamic("swf")(swf.asInstanceOf[js.Any])
    if (systemClockOffset != null) __obj.updateDynamic("systemClockOffset")(systemClockOffset.asInstanceOf[js.Any])
    if (textract != null) __obj.updateDynamic("textract")(textract.asInstanceOf[js.Any])
    if (transcribeservice != null) __obj.updateDynamic("transcribeservice")(transcribeservice.asInstanceOf[js.Any])
    if (transfer != null) __obj.updateDynamic("transfer")(transfer.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate.asInstanceOf[js.Any])
    if (!js.isUndefined(useAccelerateEndpoint)) __obj.updateDynamic("useAccelerateEndpoint")(useAccelerateEndpoint.asInstanceOf[js.Any])
    if (waf != null) __obj.updateDynamic("waf")(waf.asInstanceOf[js.Any])
    if (wafregional != null) __obj.updateDynamic("wafregional")(wafregional.asInstanceOf[js.Any])
    if (wafv2 != null) __obj.updateDynamic("wafv2")(wafv2.asInstanceOf[js.Any])
    if (workdocs != null) __obj.updateDynamic("workdocs")(workdocs.asInstanceOf[js.Any])
    if (worklink != null) __obj.updateDynamic("worklink")(worklink.asInstanceOf[js.Any])
    if (workmail != null) __obj.updateDynamic("workmail")(workmail.asInstanceOf[js.Any])
    if (workmailmessageflow != null) __obj.updateDynamic("workmailmessageflow")(workmailmessageflow.asInstanceOf[js.Any])
    if (workspaces != null) __obj.updateDynamic("workspaces")(workspaces.asInstanceOf[js.Any])
    if (xray != null) __obj.updateDynamic("xray")(xray.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationOptionsConfi]
  }
}

