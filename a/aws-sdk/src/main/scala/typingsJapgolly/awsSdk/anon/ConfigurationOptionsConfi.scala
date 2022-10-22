package typingsJapgolly.awsSdk.anon

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.awsSdkStrings.latest_
import typingsJapgolly.awsSdk.awsSdkStrings.legacy_
import typingsJapgolly.awsSdk.awsSdkStrings.regional_
import typingsJapgolly.awsSdk.awsSdkStrings.v2_
import typingsJapgolly.awsSdk.awsSdkStrings.v3
import typingsJapgolly.awsSdk.awsSdkStrings.v4
import typingsJapgolly.awsSdk.clientsAccessanalyzerMod.ClientConfiguration
import typingsJapgolly.awsSdk.libConfigBaseMod.HTTPOptions
import typingsJapgolly.awsSdk.libConfigBaseMod.Logger
import typingsJapgolly.awsSdk.libConfigBaseMod.ParamValidation
import typingsJapgolly.awsSdk.libConfigBaseMod.RetryDelayOptions
import typingsJapgolly.awsSdk.libConfigServicePlaceholdersMod.ConfigurationServiceApiVersions
import typingsJapgolly.awsSdk.libCredentialsCredentialProviderChainMod.CredentialProviderChain
import typingsJapgolly.awsSdk.libCredentialsMod.Credentials
import typingsJapgolly.awsSdk.libCredentialsMod.CredentialsOptions
import typingsJapgolly.awsSdk.libTokenMod.Token
import typingsJapgolly.awsSdk.libTokenTokenProviderChainMod.TokenProviderChain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/lib/config-base.ConfigurationOptions & aws-sdk.aws-sdk/lib/config_service_placeholders.ConfigurationServicePlaceholders & aws-sdk.aws-sdk/lib/config.APIVersions & {[key: string] : any} */
trait ConfigurationOptionsConfi
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  /**
    * AWS access key ID.
    *
    * @deprecated
    */
  var accessKeyId: js.UndefOr[String] = js.undefined
  
  var accessanalyzer: js.UndefOr[ClientConfiguration] = js.undefined
  
  var account: js.UndefOr[typingsJapgolly.awsSdk.clientsAccountMod.ClientConfiguration] = js.undefined
  
  var acm: js.UndefOr[typingsJapgolly.awsSdk.clientsAcmMod.ClientConfiguration] = js.undefined
  
  var acmpca: js.UndefOr[typingsJapgolly.awsSdk.clientsAcmpcaMod.ClientConfiguration] = js.undefined
  
  var alexaforbusiness: js.UndefOr[typingsJapgolly.awsSdk.clientsAlexaforbusinessMod.ClientConfiguration] = js.undefined
  
  var amp: js.UndefOr[typingsJapgolly.awsSdk.clientsAmpMod.ClientConfiguration] = js.undefined
  
  var amplify: js.UndefOr[typingsJapgolly.awsSdk.clientsAmplifyMod.ClientConfiguration] = js.undefined
  
  var amplifybackend: js.UndefOr[typingsJapgolly.awsSdk.clientsAmplifybackendMod.ClientConfiguration] = js.undefined
  
  var amplifyuibuilder: js.UndefOr[typingsJapgolly.awsSdk.clientsAmplifyuibuilderMod.ClientConfiguration] = js.undefined
  
  /**
    * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in all services (unless overridden by apiVersions). Specify \'latest\' to use the latest possible version.
    */
  var apiVersion: js.UndefOr[latest_ | String] = js.undefined
  
  /**
    * A map of service identifiers (the lowercase service class name) with the API version to use when instantiating a service. Specify 'latest' for each individual that can use the latest available version.
    */
  var apiVersions: js.UndefOr[ConfigurationServiceApiVersions] = js.undefined
  
  var apigateway: js.UndefOr[typingsJapgolly.awsSdk.clientsApigatewayMod.ClientConfiguration] = js.undefined
  
  var apigatewaymanagementapi: js.UndefOr[typingsJapgolly.awsSdk.clientsApigatewaymanagementapiMod.ClientConfiguration] = js.undefined
  
  var apigatewayv2: js.UndefOr[typingsJapgolly.awsSdk.clientsApigatewayv2Mod.ClientConfiguration] = js.undefined
  
  var appconfig: js.UndefOr[typingsJapgolly.awsSdk.clientsAppconfigMod.ClientConfiguration] = js.undefined
  
  var appconfigdata: js.UndefOr[typingsJapgolly.awsSdk.clientsAppconfigdataMod.ClientConfiguration] = js.undefined
  
  var appflow: js.UndefOr[typingsJapgolly.awsSdk.clientsAppflowMod.ClientConfiguration] = js.undefined
  
  var appintegrations: js.UndefOr[typingsJapgolly.awsSdk.clientsAppintegrationsMod.ClientConfiguration] = js.undefined
  
  var applicationautoscaling: js.UndefOr[typingsJapgolly.awsSdk.clientsApplicationautoscalingMod.ClientConfiguration] = js.undefined
  
  var applicationcostprofiler: js.UndefOr[typingsJapgolly.awsSdk.clientsApplicationcostprofilerMod.ClientConfiguration] = js.undefined
  
  var applicationinsights: js.UndefOr[typingsJapgolly.awsSdk.clientsApplicationinsightsMod.ClientConfiguration] = js.undefined
  
  var appmesh: js.UndefOr[typingsJapgolly.awsSdk.clientsAppmeshMod.ClientConfiguration] = js.undefined
  
  var apprunner: js.UndefOr[typingsJapgolly.awsSdk.clientsApprunnerMod.ClientConfiguration] = js.undefined
  
  var appstream: js.UndefOr[typingsJapgolly.awsSdk.clientsAppstreamMod.ClientConfiguration] = js.undefined
  
  var appsync: js.UndefOr[typingsJapgolly.awsSdk.clientsAppsyncMod.ClientConfiguration] = js.undefined
  
  var athena: js.UndefOr[typingsJapgolly.awsSdk.clientsAthenaMod.ClientConfiguration] = js.undefined
  
  var auditmanager: js.UndefOr[typingsJapgolly.awsSdk.clientsAuditmanagerMod.ClientConfiguration] = js.undefined
  
  var augmentedairuntime: js.UndefOr[typingsJapgolly.awsSdk.clientsAugmentedairuntimeMod.ClientConfiguration] = js.undefined
  
  var autoscaling: js.UndefOr[typingsJapgolly.awsSdk.clientsAutoscalingMod.ClientConfiguration] = js.undefined
  
  var autoscalingplans: js.UndefOr[typingsJapgolly.awsSdk.clientsAutoscalingplansMod.ClientConfiguration] = js.undefined
  
  var backup: js.UndefOr[typingsJapgolly.awsSdk.clientsBackupMod.ClientConfiguration] = js.undefined
  
  var backupgateway: js.UndefOr[typingsJapgolly.awsSdk.clientsBackupgatewayMod.ClientConfiguration] = js.undefined
  
  var backupstorage: js.UndefOr[typingsJapgolly.awsSdk.clientsBackupstorageMod.ClientConfiguration] = js.undefined
  
  var batch: js.UndefOr[typingsJapgolly.awsSdk.clientsBatchMod.ClientConfiguration] = js.undefined
  
  var billingconductor: js.UndefOr[typingsJapgolly.awsSdk.clientsBillingconductorMod.ClientConfiguration] = js.undefined
  
  var braket: js.UndefOr[typingsJapgolly.awsSdk.clientsBraketMod.ClientConfiguration] = js.undefined
  
  var budgets: js.UndefOr[typingsJapgolly.awsSdk.clientsBudgetsMod.ClientConfiguration] = js.undefined
  
  var chime: js.UndefOr[typingsJapgolly.awsSdk.clientsChimeMod.ClientConfiguration] = js.undefined
  
  var chimesdkidentity: js.UndefOr[typingsJapgolly.awsSdk.clientsChimesdkidentityMod.ClientConfiguration] = js.undefined
  
  var chimesdkmediapipelines: js.UndefOr[typingsJapgolly.awsSdk.clientsChimesdkmediapipelinesMod.ClientConfiguration] = js.undefined
  
  var chimesdkmeetings: js.UndefOr[typingsJapgolly.awsSdk.clientsChimesdkmeetingsMod.ClientConfiguration] = js.undefined
  
  var chimesdkmessaging: js.UndefOr[typingsJapgolly.awsSdk.clientsChimesdkmessagingMod.ClientConfiguration] = js.undefined
  
  var cloud9: js.UndefOr[typingsJapgolly.awsSdk.clientsCloud9Mod.ClientConfiguration] = js.undefined
  
  var cloudcontrol: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudcontrolMod.ClientConfiguration] = js.undefined
  
  var clouddirectory: js.UndefOr[typingsJapgolly.awsSdk.clientsClouddirectoryMod.ClientConfiguration] = js.undefined
  
  var cloudformation: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudformationMod.ClientConfiguration] = js.undefined
  
  var cloudfront: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudfrontMod.ClientConfiguration] = js.undefined
  
  var cloudhsm: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudhsmMod.ClientConfiguration] = js.undefined
  
  var cloudhsmv2: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudhsmv2Mod.ClientConfiguration] = js.undefined
  
  var cloudsearch: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudsearchMod.ClientConfiguration] = js.undefined
  
  var cloudsearchdomain: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudsearchdomainMod.ClientConfiguration] = js.undefined
  
  var cloudtrail: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudtrailMod.ClientConfiguration] = js.undefined
  
  var cloudwatch: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudwatchMod.ClientConfiguration] = js.undefined
  
  var cloudwatchevents: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudwatcheventsMod.ClientConfiguration] = js.undefined
  
  var cloudwatchlogs: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudwatchlogsMod.ClientConfiguration] = js.undefined
  
  var codeartifact: js.UndefOr[typingsJapgolly.awsSdk.clientsCodeartifactMod.ClientConfiguration] = js.undefined
  
  var codebuild: js.UndefOr[typingsJapgolly.awsSdk.clientsCodebuildMod.ClientConfiguration] = js.undefined
  
  var codecommit: js.UndefOr[typingsJapgolly.awsSdk.clientsCodecommitMod.ClientConfiguration] = js.undefined
  
  var codedeploy: js.UndefOr[typingsJapgolly.awsSdk.clientsCodedeployMod.ClientConfiguration] = js.undefined
  
  var codeguruprofiler: js.UndefOr[typingsJapgolly.awsSdk.clientsCodeguruprofilerMod.ClientConfiguration] = js.undefined
  
  var codegurureviewer: js.UndefOr[typingsJapgolly.awsSdk.clientsCodegurureviewerMod.ClientConfiguration] = js.undefined
  
  var codepipeline: js.UndefOr[typingsJapgolly.awsSdk.clientsCodepipelineMod.ClientConfiguration] = js.undefined
  
  var codestar: js.UndefOr[typingsJapgolly.awsSdk.clientsCodestarMod.ClientConfiguration] = js.undefined
  
  var codestarconnections: js.UndefOr[typingsJapgolly.awsSdk.clientsCodestarconnectionsMod.ClientConfiguration] = js.undefined
  
  var codestarnotifications: js.UndefOr[typingsJapgolly.awsSdk.clientsCodestarnotificationsMod.ClientConfiguration] = js.undefined
  
  var cognitoidentity: js.UndefOr[typingsJapgolly.awsSdk.clientsCognitoidentityMod.ClientConfiguration] = js.undefined
  
  var cognitoidentityserviceprovider: js.UndefOr[
    typingsJapgolly.awsSdk.clientsCognitoidentityserviceproviderMod.ClientConfiguration
  ] = js.undefined
  
  var cognitosync: js.UndefOr[typingsJapgolly.awsSdk.clientsCognitosyncMod.ClientConfiguration] = js.undefined
  
  var comprehend: js.UndefOr[typingsJapgolly.awsSdk.clientsComprehendMod.ClientConfiguration] = js.undefined
  
  var comprehendmedical: js.UndefOr[typingsJapgolly.awsSdk.clientsComprehendmedicalMod.ClientConfiguration] = js.undefined
  
  /**
    * Whether to compute checksums for payload bodies when the service accepts it.
    * Currently supported in S3 only.
    */
  var computeChecksums: js.UndefOr[Boolean] = js.undefined
  
  var computeoptimizer: js.UndefOr[typingsJapgolly.awsSdk.clientsComputeoptimizerMod.ClientConfiguration] = js.undefined
  
  var configservice: js.UndefOr[typingsJapgolly.awsSdk.clientsConfigserviceMod.ClientConfiguration] = js.undefined
  
  var connect: js.UndefOr[typingsJapgolly.awsSdk.clientsConnectMod.ClientConfiguration] = js.undefined
  
  var connectcampaigns: js.UndefOr[typingsJapgolly.awsSdk.clientsConnectcampaignsMod.ClientConfiguration] = js.undefined
  
  var connectcases: js.UndefOr[typingsJapgolly.awsSdk.clientsConnectcasesMod.ClientConfiguration] = js.undefined
  
  var connectcontactlens: js.UndefOr[typingsJapgolly.awsSdk.clientsConnectcontactlensMod.ClientConfiguration] = js.undefined
  
  var connectparticipant: js.UndefOr[typingsJapgolly.awsSdk.clientsConnectparticipantMod.ClientConfiguration] = js.undefined
  
  var controltower: js.UndefOr[typingsJapgolly.awsSdk.clientsControltowerMod.ClientConfiguration] = js.undefined
  
  /**
    * Whether types are converted when parsing response data.
    */
  var convertResponseTypes: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to apply a clock skew correction and retry requests that fail because of an skewed client clock.
    */
  var correctClockSkew: js.UndefOr[Boolean] = js.undefined
  
  var costexplorer: js.UndefOr[typingsJapgolly.awsSdk.clientsCostexplorerMod.ClientConfiguration] = js.undefined
  
  /**
    * The provider chain used to resolve credentials if no static credentials property is set.
    */
  var credentialProvider: js.UndefOr[CredentialProviderChain] = js.undefined
  
  /**
    * The AWS credentials to sign requests with.
    */
  var credentials: js.UndefOr[Credentials | CredentialsOptions | Null] = js.undefined
  
  var cur: js.UndefOr[typingsJapgolly.awsSdk.clientsCurMod.ClientConfiguration] = js.undefined
  
  /**
    * Sets a custom User-Agent string.
    * In node environments this will set the User-Agent header, but
    * browser environments this will set the X-Amz-User-Agent header.
    */
  var customUserAgent: js.UndefOr[String] = js.undefined
  
  var customerprofiles: js.UndefOr[typingsJapgolly.awsSdk.clientsCustomerprofilesMod.ClientConfiguration] = js.undefined
  
  var databrew: js.UndefOr[typingsJapgolly.awsSdk.clientsDatabrewMod.ClientConfiguration] = js.undefined
  
  var dataexchange: js.UndefOr[typingsJapgolly.awsSdk.clientsDataexchangeMod.ClientConfiguration] = js.undefined
  
  var datapipeline: js.UndefOr[typingsJapgolly.awsSdk.clientsDatapipelineMod.ClientConfiguration] = js.undefined
  
  var datasync: js.UndefOr[typingsJapgolly.awsSdk.clientsDatasyncMod.ClientConfiguration] = js.undefined
  
  var dax: js.UndefOr[typingsJapgolly.awsSdk.clientsDaxMod.ClientConfiguration] = js.undefined
  
  var detective: js.UndefOr[typingsJapgolly.awsSdk.clientsDetectiveMod.ClientConfiguration] = js.undefined
  
  var devicefarm: js.UndefOr[typingsJapgolly.awsSdk.clientsDevicefarmMod.ClientConfiguration] = js.undefined
  
  var devopsguru: js.UndefOr[typingsJapgolly.awsSdk.clientsDevopsguruMod.ClientConfiguration] = js.undefined
  
  var directconnect: js.UndefOr[typingsJapgolly.awsSdk.clientsDirectconnectMod.ClientConfiguration] = js.undefined
  
  var directoryservice: js.UndefOr[typingsJapgolly.awsSdk.clientsDirectoryserviceMod.ClientConfiguration] = js.undefined
  
  var discovery: js.UndefOr[typingsJapgolly.awsSdk.clientsDiscoveryMod.ClientConfiguration] = js.undefined
  
  var dlm: js.UndefOr[typingsJapgolly.awsSdk.clientsDlmMod.ClientConfiguration] = js.undefined
  
  var dms: js.UndefOr[typingsJapgolly.awsSdk.clientsDmsMod.ClientConfiguration] = js.undefined
  
  var docdb: js.UndefOr[typingsJapgolly.awsSdk.clientsDocdbMod.ClientConfiguration] = js.undefined
  
  var drs: js.UndefOr[typingsJapgolly.awsSdk.clientsDrsMod.ClientConfiguration] = js.undefined
  
  /**
    * Whether to validate the CRC32 checksum of HTTP response bodies returned
    * by DynamoDB.
    */
  var dynamoDbCrc32: js.UndefOr[Boolean] = js.undefined
  
  var dynamodb: js.UndefOr[typingsJapgolly.awsSdk.clientsDynamodbMod.ClientConfiguration] = js.undefined
  
  var dynamodbstreams: js.UndefOr[typingsJapgolly.awsSdk.clientsDynamodbstreamsMod.ClientConfiguration] = js.undefined
  
  var ebs: js.UndefOr[typingsJapgolly.awsSdk.clientsEbsMod.ClientConfiguration] = js.undefined
  
  var ec2: js.UndefOr[typingsJapgolly.awsSdk.clientsEc2Mod.ClientConfiguration] = js.undefined
  
  var ec2instanceconnect: js.UndefOr[typingsJapgolly.awsSdk.clientsEc2instanceconnectMod.ClientConfiguration] = js.undefined
  
  var ecr: js.UndefOr[typingsJapgolly.awsSdk.clientsEcrMod.ClientConfiguration] = js.undefined
  
  var ecrpublic: js.UndefOr[typingsJapgolly.awsSdk.clientsEcrpublicMod.ClientConfiguration] = js.undefined
  
  var ecs: js.UndefOr[typingsJapgolly.awsSdk.clientsEcsMod.ClientConfiguration] = js.undefined
  
  var efs: js.UndefOr[typingsJapgolly.awsSdk.clientsEfsMod.ClientConfiguration] = js.undefined
  
  var eks: js.UndefOr[typingsJapgolly.awsSdk.clientsEksMod.ClientConfiguration] = js.undefined
  
  var elasticache: js.UndefOr[typingsJapgolly.awsSdk.clientsElasticacheMod.ClientConfiguration] = js.undefined
  
  var elasticbeanstalk: js.UndefOr[typingsJapgolly.awsSdk.clientsElasticbeanstalkMod.ClientConfiguration] = js.undefined
  
  var elasticinference: js.UndefOr[typingsJapgolly.awsSdk.clientsElasticinferenceMod.ClientConfiguration] = js.undefined
  
  var elastictranscoder: js.UndefOr[typingsJapgolly.awsSdk.clientsElastictranscoderMod.ClientConfiguration] = js.undefined
  
  var elb: js.UndefOr[typingsJapgolly.awsSdk.clientsElbMod.ClientConfiguration] = js.undefined
  
  var elbv2: js.UndefOr[typingsJapgolly.awsSdk.clientsElbv2Mod.ClientConfiguration] = js.undefined
  
  var emr: js.UndefOr[typingsJapgolly.awsSdk.clientsEmrMod.ClientConfiguration] = js.undefined
  
  var emrcontainers: js.UndefOr[typingsJapgolly.awsSdk.clientsEmrcontainersMod.ClientConfiguration] = js.undefined
  
  var emrserverless: js.UndefOr[typingsJapgolly.awsSdk.clientsEmrserverlessMod.ClientConfiguration] = js.undefined
  
  /**
    * The size of the global cache storing endpoints from endpoint
    * discovery operations. Once endpoint cache is created, updating this setting
    * cannot change existing cache size.
    */
  var endpointCacheSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Whether to enable endpoint discovery for operations that allow optionally using an endpoint returned by 
    * the service.
    */
  var endpointDiscoveryEnabled: js.UndefOr[Boolean] = js.undefined
  
  var es: js.UndefOr[typingsJapgolly.awsSdk.clientsEsMod.ClientConfiguration] = js.undefined
  
  var eventbridge: js.UndefOr[typingsJapgolly.awsSdk.clientsEventbridgeMod.ClientConfiguration] = js.undefined
  
  var evidently: js.UndefOr[typingsJapgolly.awsSdk.clientsEvidentlyMod.ClientConfiguration] = js.undefined
  
  var finspace: js.UndefOr[typingsJapgolly.awsSdk.clientsFinspaceMod.ClientConfiguration] = js.undefined
  
  var finspacedata: js.UndefOr[typingsJapgolly.awsSdk.clientsFinspacedataMod.ClientConfiguration] = js.undefined
  
  var firehose: js.UndefOr[typingsJapgolly.awsSdk.clientsFirehoseMod.ClientConfiguration] = js.undefined
  
  var fis: js.UndefOr[typingsJapgolly.awsSdk.clientsFisMod.ClientConfiguration] = js.undefined
  
  var fms: js.UndefOr[typingsJapgolly.awsSdk.clientsFmsMod.ClientConfiguration] = js.undefined
  
  var forecastqueryservice: js.UndefOr[typingsJapgolly.awsSdk.clientsForecastqueryserviceMod.ClientConfiguration] = js.undefined
  
  var forecastservice: js.UndefOr[typingsJapgolly.awsSdk.clientsForecastserviceMod.ClientConfiguration] = js.undefined
  
  var frauddetector: js.UndefOr[typingsJapgolly.awsSdk.clientsFrauddetectorMod.ClientConfiguration] = js.undefined
  
  var fsx: js.UndefOr[typingsJapgolly.awsSdk.clientsFsxMod.ClientConfiguration] = js.undefined
  
  var gamelift: js.UndefOr[typingsJapgolly.awsSdk.clientsGameliftMod.ClientConfiguration] = js.undefined
  
  var gamesparks: js.UndefOr[typingsJapgolly.awsSdk.clientsGamesparksMod.ClientConfiguration] = js.undefined
  
  var glacier: js.UndefOr[typingsJapgolly.awsSdk.clientsGlacierMod.ClientConfiguration] = js.undefined
  
  var globalaccelerator: js.UndefOr[typingsJapgolly.awsSdk.clientsGlobalacceleratorMod.ClientConfiguration] = js.undefined
  
  var glue: js.UndefOr[typingsJapgolly.awsSdk.clientsGlueMod.ClientConfiguration] = js.undefined
  
  var grafana: js.UndefOr[typingsJapgolly.awsSdk.clientsGrafanaMod.ClientConfiguration] = js.undefined
  
  var greengrass: js.UndefOr[typingsJapgolly.awsSdk.clientsGreengrassMod.ClientConfiguration] = js.undefined
  
  var greengrassv2: js.UndefOr[typingsJapgolly.awsSdk.clientsGreengrassv2Mod.ClientConfiguration] = js.undefined
  
  var groundstation: js.UndefOr[typingsJapgolly.awsSdk.clientsGroundstationMod.ClientConfiguration] = js.undefined
  
  var guardduty: js.UndefOr[typingsJapgolly.awsSdk.clientsGuarddutyMod.ClientConfiguration] = js.undefined
  
  var health: js.UndefOr[typingsJapgolly.awsSdk.clientsHealthMod.ClientConfiguration] = js.undefined
  
  var healthlake: js.UndefOr[typingsJapgolly.awsSdk.clientsHealthlakeMod.ClientConfiguration] = js.undefined
  
  var honeycode: js.UndefOr[typingsJapgolly.awsSdk.clientsHoneycodeMod.ClientConfiguration] = js.undefined
  
  /**
    * Whether to marshal request parameters to the prefix of hostname.
    */
  var hostPrefixEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A set of options to pass to the low-level HTTP request.
    */
  var httpOptions: js.UndefOr[HTTPOptions] = js.undefined
  
  var iam: js.UndefOr[typingsJapgolly.awsSdk.clientsIamMod.ClientConfiguration] = js.undefined
  
  var identitystore: js.UndefOr[typingsJapgolly.awsSdk.clientsIdentitystoreMod.ClientConfiguration] = js.undefined
  
  var imagebuilder: js.UndefOr[typingsJapgolly.awsSdk.clientsImagebuilderMod.ClientConfiguration] = js.undefined
  
  var importexport: js.UndefOr[typingsJapgolly.awsSdk.clientsImportexportMod.ClientConfiguration] = js.undefined
  
  var inspector: js.UndefOr[typingsJapgolly.awsSdk.clientsInspectorMod.ClientConfiguration] = js.undefined
  
  var inspector2: js.UndefOr[typingsJapgolly.awsSdk.clientsInspector2Mod.ClientConfiguration] = js.undefined
  
  var iot: js.UndefOr[typingsJapgolly.awsSdk.clientsIotMod.ClientConfiguration] = js.undefined
  
  var iot1clickdevicesservice: js.UndefOr[typingsJapgolly.awsSdk.clientsIot1clickdevicesserviceMod.ClientConfiguration] = js.undefined
  
  var iot1clickprojects: js.UndefOr[typingsJapgolly.awsSdk.clientsIot1clickprojectsMod.ClientConfiguration] = js.undefined
  
  var iotanalytics: js.UndefOr[typingsJapgolly.awsSdk.clientsIotanalyticsMod.ClientConfiguration] = js.undefined
  
  var iotdata: js.UndefOr[typingsJapgolly.awsSdk.clientsIotdataMod.ClientConfiguration] = js.undefined
  
  var iotdeviceadvisor: js.UndefOr[typingsJapgolly.awsSdk.clientsIotdeviceadvisorMod.ClientConfiguration] = js.undefined
  
  var iotevents: js.UndefOr[typingsJapgolly.awsSdk.clientsIoteventsMod.ClientConfiguration] = js.undefined
  
  var ioteventsdata: js.UndefOr[typingsJapgolly.awsSdk.clientsIoteventsdataMod.ClientConfiguration] = js.undefined
  
  var iotfleethub: js.UndefOr[typingsJapgolly.awsSdk.clientsIotfleethubMod.ClientConfiguration] = js.undefined
  
  var iotfleetwise: js.UndefOr[typingsJapgolly.awsSdk.clientsIotfleetwiseMod.ClientConfiguration] = js.undefined
  
  var iotjobsdataplane: js.UndefOr[typingsJapgolly.awsSdk.clientsIotjobsdataplaneMod.ClientConfiguration] = js.undefined
  
  var iotsecuretunneling: js.UndefOr[typingsJapgolly.awsSdk.clientsIotsecuretunnelingMod.ClientConfiguration] = js.undefined
  
  var iotsitewise: js.UndefOr[typingsJapgolly.awsSdk.clientsIotsitewiseMod.ClientConfiguration] = js.undefined
  
  var iotthingsgraph: js.UndefOr[typingsJapgolly.awsSdk.clientsIotthingsgraphMod.ClientConfiguration] = js.undefined
  
  var iottwinmaker: js.UndefOr[typingsJapgolly.awsSdk.clientsIottwinmakerMod.ClientConfiguration] = js.undefined
  
  var iotwireless: js.UndefOr[typingsJapgolly.awsSdk.clientsIotwirelessMod.ClientConfiguration] = js.undefined
  
  var ivs: js.UndefOr[typingsJapgolly.awsSdk.clientsIvsMod.ClientConfiguration] = js.undefined
  
  var ivschat: js.UndefOr[typingsJapgolly.awsSdk.clientsIvschatMod.ClientConfiguration] = js.undefined
  
  var kafka: js.UndefOr[typingsJapgolly.awsSdk.clientsKafkaMod.ClientConfiguration] = js.undefined
  
  var kafkaconnect: js.UndefOr[typingsJapgolly.awsSdk.clientsKafkaconnectMod.ClientConfiguration] = js.undefined
  
  var kendra: js.UndefOr[typingsJapgolly.awsSdk.clientsKendraMod.ClientConfiguration] = js.undefined
  
  var keyspaces: js.UndefOr[typingsJapgolly.awsSdk.clientsKeyspacesMod.ClientConfiguration] = js.undefined
  
  var kinesis: js.UndefOr[typingsJapgolly.awsSdk.clientsKinesisMod.ClientConfiguration] = js.undefined
  
  var kinesisanalytics: js.UndefOr[typingsJapgolly.awsSdk.clientsKinesisanalyticsMod.ClientConfiguration] = js.undefined
  
  var kinesisanalyticsv2: js.UndefOr[typingsJapgolly.awsSdk.clientsKinesisanalyticsv2Mod.ClientConfiguration] = js.undefined
  
  var kinesisvideo: js.UndefOr[typingsJapgolly.awsSdk.clientsKinesisvideoMod.ClientConfiguration] = js.undefined
  
  var kinesisvideoarchivedmedia: js.UndefOr[typingsJapgolly.awsSdk.clientsKinesisvideoarchivedmediaMod.ClientConfiguration] = js.undefined
  
  var kinesisvideomedia: js.UndefOr[typingsJapgolly.awsSdk.clientsKinesisvideomediaMod.ClientConfiguration] = js.undefined
  
  var kinesisvideosignalingchannels: js.UndefOr[
    typingsJapgolly.awsSdk.clientsKinesisvideosignalingchannelsMod.ClientConfiguration
  ] = js.undefined
  
  var kms: js.UndefOr[typingsJapgolly.awsSdk.clientsKmsMod.ClientConfiguration] = js.undefined
  
  var lakeformation: js.UndefOr[typingsJapgolly.awsSdk.clientsLakeformationMod.ClientConfiguration] = js.undefined
  
  var lambda: js.UndefOr[typingsJapgolly.awsSdk.clientsLambdaMod.ClientConfiguration] = js.undefined
  
  var lexmodelbuildingservice: js.UndefOr[typingsJapgolly.awsSdk.clientsLexmodelbuildingserviceMod.ClientConfiguration] = js.undefined
  
  var lexmodelsv2: js.UndefOr[typingsJapgolly.awsSdk.clientsLexmodelsv2Mod.ClientConfiguration] = js.undefined
  
  var lexruntime: js.UndefOr[typingsJapgolly.awsSdk.clientsLexruntimeMod.ClientConfiguration] = js.undefined
  
  var lexruntimev2: js.UndefOr[typingsJapgolly.awsSdk.clientsLexruntimev2Mod.ClientConfiguration] = js.undefined
  
  var licensemanager: js.UndefOr[typingsJapgolly.awsSdk.clientsLicensemanagerMod.ClientConfiguration] = js.undefined
  
  var licensemanagerusersubscriptions: js.UndefOr[
    typingsJapgolly.awsSdk.clientsLicensemanagerusersubscriptionsMod.ClientConfiguration
  ] = js.undefined
  
  var lightsail: js.UndefOr[typingsJapgolly.awsSdk.clientsLightsailMod.ClientConfiguration] = js.undefined
  
  var location: js.UndefOr[typingsJapgolly.awsSdk.clientsLocationMod.ClientConfiguration] = js.undefined
  
  /**
    * An object that responds to .write() (like a stream) or .log() (like the console object) in order to log information about requests.
    */
  var logger: js.UndefOr[Logger] = js.undefined
  
  var lookoutequipment: js.UndefOr[typingsJapgolly.awsSdk.clientsLookoutequipmentMod.ClientConfiguration] = js.undefined
  
  var lookoutmetrics: js.UndefOr[typingsJapgolly.awsSdk.clientsLookoutmetricsMod.ClientConfiguration] = js.undefined
  
  var lookoutvision: js.UndefOr[typingsJapgolly.awsSdk.clientsLookoutvisionMod.ClientConfiguration] = js.undefined
  
  var m2: js.UndefOr[typingsJapgolly.awsSdk.clientsM2Mod.ClientConfiguration] = js.undefined
  
  var machinelearning: js.UndefOr[typingsJapgolly.awsSdk.clientsMachinelearningMod.ClientConfiguration] = js.undefined
  
  var macie: js.UndefOr[typingsJapgolly.awsSdk.clientsMacieMod.ClientConfiguration] = js.undefined
  
  var macie2: js.UndefOr[typingsJapgolly.awsSdk.clientsMacie2Mod.ClientConfiguration] = js.undefined
  
  var managedblockchain: js.UndefOr[typingsJapgolly.awsSdk.clientsManagedblockchainMod.ClientConfiguration] = js.undefined
  
  var marketplacecatalog: js.UndefOr[typingsJapgolly.awsSdk.clientsMarketplacecatalogMod.ClientConfiguration] = js.undefined
  
  var marketplacecommerceanalytics: js.UndefOr[
    typingsJapgolly.awsSdk.clientsMarketplacecommerceanalyticsMod.ClientConfiguration
  ] = js.undefined
  
  var marketplaceentitlementservice: js.UndefOr[
    typingsJapgolly.awsSdk.clientsMarketplaceentitlementserviceMod.ClientConfiguration
  ] = js.undefined
  
  var marketplacemetering: js.UndefOr[typingsJapgolly.awsSdk.clientsMarketplacemeteringMod.ClientConfiguration] = js.undefined
  
  /**
    * The maximum amount of redirects to follow for a service request.
    */
  var maxRedirects: js.UndefOr[Double] = js.undefined
  
  /**
    * The maximum amount of retries to perform for a service request.
    */
  var maxRetries: js.UndefOr[Double] = js.undefined
  
  var mediaconnect: js.UndefOr[typingsJapgolly.awsSdk.clientsMediaconnectMod.ClientConfiguration] = js.undefined
  
  var mediaconvert: js.UndefOr[typingsJapgolly.awsSdk.clientsMediaconvertMod.ClientConfiguration] = js.undefined
  
  var medialive: js.UndefOr[typingsJapgolly.awsSdk.clientsMedialiveMod.ClientConfiguration] = js.undefined
  
  var mediapackage: js.UndefOr[typingsJapgolly.awsSdk.clientsMediapackageMod.ClientConfiguration] = js.undefined
  
  var mediapackagevod: js.UndefOr[typingsJapgolly.awsSdk.clientsMediapackagevodMod.ClientConfiguration] = js.undefined
  
  var mediastore: js.UndefOr[typingsJapgolly.awsSdk.clientsMediastoreMod.ClientConfiguration] = js.undefined
  
  var mediastoredata: js.UndefOr[typingsJapgolly.awsSdk.clientsMediastoredataMod.ClientConfiguration] = js.undefined
  
  var mediatailor: js.UndefOr[typingsJapgolly.awsSdk.clientsMediatailorMod.ClientConfiguration] = js.undefined
  
  var memorydb: js.UndefOr[typingsJapgolly.awsSdk.clientsMemorydbMod.ClientConfiguration] = js.undefined
  
  var mgn: js.UndefOr[typingsJapgolly.awsSdk.clientsMgnMod.ClientConfiguration] = js.undefined
  
  var migrationhub: js.UndefOr[typingsJapgolly.awsSdk.clientsMigrationhubMod.ClientConfiguration] = js.undefined
  
  var migrationhubconfig: js.UndefOr[typingsJapgolly.awsSdk.clientsMigrationhubconfigMod.ClientConfiguration] = js.undefined
  
  var migrationhuborchestrator: js.UndefOr[typingsJapgolly.awsSdk.clientsMigrationhuborchestratorMod.ClientConfiguration] = js.undefined
  
  var migrationhubrefactorspaces: js.UndefOr[typingsJapgolly.awsSdk.clientsMigrationhubrefactorspacesMod.ClientConfiguration] = js.undefined
  
  var migrationhubstrategy: js.UndefOr[typingsJapgolly.awsSdk.clientsMigrationhubstrategyMod.ClientConfiguration] = js.undefined
  
  var mobile: js.UndefOr[typingsJapgolly.awsSdk.clientsMobileMod.ClientConfiguration] = js.undefined
  
  var mobileanalytics: js.UndefOr[typingsJapgolly.awsSdk.clientsMobileanalyticsMod.ClientConfiguration] = js.undefined
  
  var mq: js.UndefOr[typingsJapgolly.awsSdk.clientsMqMod.ClientConfiguration] = js.undefined
  
  var mturk: js.UndefOr[typingsJapgolly.awsSdk.clientsMturkMod.ClientConfiguration] = js.undefined
  
  var mwaa: js.UndefOr[typingsJapgolly.awsSdk.clientsMwaaMod.ClientConfiguration] = js.undefined
  
  var neptune: js.UndefOr[typingsJapgolly.awsSdk.clientsNeptuneMod.ClientConfiguration] = js.undefined
  
  var networkfirewall: js.UndefOr[typingsJapgolly.awsSdk.clientsNetworkfirewallMod.ClientConfiguration] = js.undefined
  
  var networkmanager: js.UndefOr[typingsJapgolly.awsSdk.clientsNetworkmanagerMod.ClientConfiguration] = js.undefined
  
  var nimble: js.UndefOr[typingsJapgolly.awsSdk.clientsNimbleMod.ClientConfiguration] = js.undefined
  
  var opensearch: js.UndefOr[typingsJapgolly.awsSdk.clientsOpensearchMod.ClientConfiguration] = js.undefined
  
  var opsworks: js.UndefOr[typingsJapgolly.awsSdk.clientsOpsworksMod.ClientConfiguration] = js.undefined
  
  var opsworkscm: js.UndefOr[typingsJapgolly.awsSdk.clientsOpsworkscmMod.ClientConfiguration] = js.undefined
  
  var organizations: js.UndefOr[typingsJapgolly.awsSdk.clientsOrganizationsMod.ClientConfiguration] = js.undefined
  
  var outposts: js.UndefOr[typingsJapgolly.awsSdk.clientsOutpostsMod.ClientConfiguration] = js.undefined
  
  var panorama: js.UndefOr[typingsJapgolly.awsSdk.clientsPanoramaMod.ClientConfiguration] = js.undefined
  
  /**
    * Returns whether input parameters should be validated against the operation description before sending the request.
    * Defaults to true.
    * Pass a map to enable any of the following specific validation features: min|max|pattern|enum
    */
  var paramValidation: js.UndefOr[ParamValidation | Boolean] = js.undefined
  
  var personalize: js.UndefOr[typingsJapgolly.awsSdk.clientsPersonalizeMod.ClientConfiguration] = js.undefined
  
  var personalizeevents: js.UndefOr[typingsJapgolly.awsSdk.clientsPersonalizeeventsMod.ClientConfiguration] = js.undefined
  
  var personalizeruntime: js.UndefOr[typingsJapgolly.awsSdk.clientsPersonalizeruntimeMod.ClientConfiguration] = js.undefined
  
  var pi: js.UndefOr[typingsJapgolly.awsSdk.clientsPiMod.ClientConfiguration] = js.undefined
  
  var pinpoint: js.UndefOr[typingsJapgolly.awsSdk.clientsPinpointMod.ClientConfiguration] = js.undefined
  
  var pinpointemail: js.UndefOr[typingsJapgolly.awsSdk.clientsPinpointemailMod.ClientConfiguration] = js.undefined
  
  var pinpointsmsvoice: js.UndefOr[typingsJapgolly.awsSdk.clientsPinpointsmsvoiceMod.ClientConfiguration] = js.undefined
  
  var pinpointsmsvoicev2: js.UndefOr[typingsJapgolly.awsSdk.clientsPinpointsmsvoicev2Mod.ClientConfiguration] = js.undefined
  
  var polly: js.UndefOr[typingsJapgolly.awsSdk.clientsPollyMod.ClientConfiguration] = js.undefined
  
  var pricing: js.UndefOr[typingsJapgolly.awsSdk.clientsPricingMod.ClientConfiguration] = js.undefined
  
  var privatenetworks: js.UndefOr[typingsJapgolly.awsSdk.clientsPrivatenetworksMod.ClientConfiguration] = js.undefined
  
  var proton: js.UndefOr[typingsJapgolly.awsSdk.clientsProtonMod.ClientConfiguration] = js.undefined
  
  var qldb: js.UndefOr[typingsJapgolly.awsSdk.clientsQldbMod.ClientConfiguration] = js.undefined
  
  var qldbsession: js.UndefOr[typingsJapgolly.awsSdk.clientsQldbsessionMod.ClientConfiguration] = js.undefined
  
  var quicksight: js.UndefOr[typingsJapgolly.awsSdk.clientsQuicksightMod.ClientConfiguration] = js.undefined
  
  var ram: js.UndefOr[typingsJapgolly.awsSdk.clientsRamMod.ClientConfiguration] = js.undefined
  
  var rbin: js.UndefOr[typingsJapgolly.awsSdk.clientsRbinMod.ClientConfiguration] = js.undefined
  
  var rds: js.UndefOr[typingsJapgolly.awsSdk.clientsRdsMod.ClientConfiguration] = js.undefined
  
  var rdsdataservice: js.UndefOr[typingsJapgolly.awsSdk.clientsRdsdataserviceMod.ClientConfiguration] = js.undefined
  
  var redshift: js.UndefOr[typingsJapgolly.awsSdk.clientsRedshiftMod.ClientConfiguration] = js.undefined
  
  var redshiftdata: js.UndefOr[typingsJapgolly.awsSdk.clientsRedshiftdataMod.ClientConfiguration] = js.undefined
  
  var redshiftserverless: js.UndefOr[typingsJapgolly.awsSdk.clientsRedshiftserverlessMod.ClientConfiguration] = js.undefined
  
  /**
    * The region to send service requests to.
    */
  var region: js.UndefOr[String] = js.undefined
  
  var rekognition: js.UndefOr[typingsJapgolly.awsSdk.clientsRekognitionMod.ClientConfiguration] = js.undefined
  
  var resiliencehub: js.UndefOr[typingsJapgolly.awsSdk.clientsResiliencehubMod.ClientConfiguration] = js.undefined
  
  var resourcegroups: js.UndefOr[typingsJapgolly.awsSdk.clientsResourcegroupsMod.ClientConfiguration] = js.undefined
  
  var resourcegroupstaggingapi: js.UndefOr[typingsJapgolly.awsSdk.clientsResourcegroupstaggingapiMod.ClientConfiguration] = js.undefined
  
  /**
    * Returns A set of options to configure the retry delay on retryable errors.
    */
  var retryDelayOptions: js.UndefOr[RetryDelayOptions] = js.undefined
  
  var robomaker: js.UndefOr[typingsJapgolly.awsSdk.clientsRobomakerMod.ClientConfiguration] = js.undefined
  
  var rolesanywhere: js.UndefOr[typingsJapgolly.awsSdk.clientsRolesanywhereMod.ClientConfiguration] = js.undefined
  
  var route53: js.UndefOr[typingsJapgolly.awsSdk.clientsRoute53Mod.ClientConfiguration] = js.undefined
  
  var route53domains: js.UndefOr[typingsJapgolly.awsSdk.clientsRoute53domainsMod.ClientConfiguration] = js.undefined
  
  var route53recoverycluster: js.UndefOr[typingsJapgolly.awsSdk.clientsRoute53recoveryclusterMod.ClientConfiguration] = js.undefined
  
  var route53recoverycontrolconfig: js.UndefOr[
    typingsJapgolly.awsSdk.clientsRoute53recoverycontrolconfigMod.ClientConfiguration
  ] = js.undefined
  
  var route53recoveryreadiness: js.UndefOr[typingsJapgolly.awsSdk.clientsRoute53recoveryreadinessMod.ClientConfiguration] = js.undefined
  
  var route53resolver: js.UndefOr[typingsJapgolly.awsSdk.clientsRoute53resolverMod.ClientConfiguration] = js.undefined
  
  var rum: js.UndefOr[typingsJapgolly.awsSdk.clientsRumMod.ClientConfiguration] = js.undefined
  
  var s3: js.UndefOr[typingsJapgolly.awsSdk.clientsS3Mod.ClientConfiguration] = js.undefined
  
  /**
    * Whether the provided endpoint addresses an individual bucket.
    * false if it addresses the root API endpoint.
    */
  var s3BucketEndpoint: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to disable S3 body signing when using signature version v4.
    */
  var s3DisableBodySigning: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to force path style URLs for S3 objects.
    */
  var s3ForcePathStyle: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When region is set to 'us-east-1', whether to send s3 request to global endpoints
    * or 'us-east-1' regional endpoints. This config is only applicable to S3 client;
    * Defaults to 'legacy'
    */
  var s3UsEast1RegionalEndpoint: js.UndefOr[regional_ | legacy_] = js.undefined
  
  /**
    * Whether to override the request region with the region inferred
    * from requested resource's ARN. Only available for S3 buckets
    * Defaults to `true`
    */
  var s3UseArnRegion: js.UndefOr[Boolean] = js.undefined
  
  var s3control: js.UndefOr[typingsJapgolly.awsSdk.clientsS3controlMod.ClientConfiguration] = js.undefined
  
  var s3outposts: js.UndefOr[typingsJapgolly.awsSdk.clientsS3outpostsMod.ClientConfiguration] = js.undefined
  
  var sagemaker: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.ClientConfiguration] = js.undefined
  
  var sagemakeredge: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakeredgeMod.ClientConfiguration] = js.undefined
  
  var sagemakerfeaturestoreruntime: js.UndefOr[
    typingsJapgolly.awsSdk.clientsSagemakerfeaturestoreruntimeMod.ClientConfiguration
  ] = js.undefined
  
  var sagemakerruntime: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerruntimeMod.ClientConfiguration] = js.undefined
  
  var savingsplans: js.UndefOr[typingsJapgolly.awsSdk.clientsSavingsplansMod.ClientConfiguration] = js.undefined
  
  var schemas: js.UndefOr[typingsJapgolly.awsSdk.clientsSchemasMod.ClientConfiguration] = js.undefined
  
  /**
    * AWS secret access key.
    *
    * @deprecated
    */
  var secretAccessKey: js.UndefOr[String] = js.undefined
  
  var secretsmanager: js.UndefOr[typingsJapgolly.awsSdk.clientsSecretsmanagerMod.ClientConfiguration] = js.undefined
  
  var securityhub: js.UndefOr[typingsJapgolly.awsSdk.clientsSecurityhubMod.ClientConfiguration] = js.undefined
  
  var serverlessapplicationrepository: js.UndefOr[
    typingsJapgolly.awsSdk.clientsServerlessapplicationrepositoryMod.ClientConfiguration
  ] = js.undefined
  
  var servicecatalog: js.UndefOr[typingsJapgolly.awsSdk.clientsServicecatalogMod.ClientConfiguration] = js.undefined
  
  var servicecatalogappregistry: js.UndefOr[typingsJapgolly.awsSdk.clientsServicecatalogappregistryMod.ClientConfiguration] = js.undefined
  
  var servicediscovery: js.UndefOr[typingsJapgolly.awsSdk.clientsServicediscoveryMod.ClientConfiguration] = js.undefined
  
  var servicequotas: js.UndefOr[typingsJapgolly.awsSdk.clientsServicequotasMod.ClientConfiguration] = js.undefined
  
  var ses: js.UndefOr[typingsJapgolly.awsSdk.clientsSesMod.ClientConfiguration] = js.undefined
  
  /**
    * AWS session token.
    *
    * @deprecated
    */
  var sessionToken: js.UndefOr[String] = js.undefined
  
  var sesv2: js.UndefOr[typingsJapgolly.awsSdk.clientsSesv2Mod.ClientConfiguration] = js.undefined
  
  var shield: js.UndefOr[typingsJapgolly.awsSdk.clientsShieldMod.ClientConfiguration] = js.undefined
  
  /**
    * Whether the signature to sign requests with (overriding the API configuration) is cached.
    */
  var signatureCache: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The signature version to sign requests with (overriding the API configuration).
    * Possible values: 'v2'|'v3'|'v4'
    */
  var signatureVersion: js.UndefOr[v2_ | v3 | v4 | String] = js.undefined
  
  var signer: js.UndefOr[typingsJapgolly.awsSdk.clientsSignerMod.ClientConfiguration] = js.undefined
  
  var simpledb: js.UndefOr[typingsJapgolly.awsSdk.clientsSimpledbMod.ClientConfiguration] = js.undefined
  
  var sms: js.UndefOr[typingsJapgolly.awsSdk.clientsSmsMod.ClientConfiguration] = js.undefined
  
  var snowball: js.UndefOr[typingsJapgolly.awsSdk.clientsSnowballMod.ClientConfiguration] = js.undefined
  
  var snowdevicemanagement: js.UndefOr[typingsJapgolly.awsSdk.clientsSnowdevicemanagementMod.ClientConfiguration] = js.undefined
  
  var sns: js.UndefOr[typingsJapgolly.awsSdk.clientsSnsMod.ClientConfiguration] = js.undefined
  
  var sqs: js.UndefOr[typingsJapgolly.awsSdk.clientsSqsMod.ClientConfiguration] = js.undefined
  
  /**
    * Whether SSL is enabled for requests.
    */
  var sslEnabled: js.UndefOr[Boolean] = js.undefined
  
  var ssm: js.UndefOr[typingsJapgolly.awsSdk.clientsSsmMod.ClientConfiguration] = js.undefined
  
  var ssmcontacts: js.UndefOr[typingsJapgolly.awsSdk.clientsSsmcontactsMod.ClientConfiguration] = js.undefined
  
  var ssmincidents: js.UndefOr[typingsJapgolly.awsSdk.clientsSsmincidentsMod.ClientConfiguration] = js.undefined
  
  var sso: js.UndefOr[typingsJapgolly.awsSdk.clientsSsoMod.ClientConfiguration] = js.undefined
  
  var ssoadmin: js.UndefOr[typingsJapgolly.awsSdk.clientsSsoadminMod.ClientConfiguration] = js.undefined
  
  var ssooidc: js.UndefOr[typingsJapgolly.awsSdk.clientsSsooidcMod.ClientConfiguration] = js.undefined
  
  var stepfunctions: js.UndefOr[typingsJapgolly.awsSdk.clientsStepfunctionsMod.ClientConfiguration] = js.undefined
  
  var storagegateway: js.UndefOr[typingsJapgolly.awsSdk.clientsStoragegatewayMod.ClientConfiguration] = js.undefined
  
  var sts: js.UndefOr[typingsJapgolly.awsSdk.clientsStsMod.ClientConfiguration] = js.undefined
  
  /**
    * Whether to send sts request to global endpoints or
    * regional endpoints. 
    */
  var stsRegionalEndpoints: js.UndefOr[legacy_ | regional_] = js.undefined
  
  var support: js.UndefOr[typingsJapgolly.awsSdk.clientsSupportMod.ClientConfiguration] = js.undefined
  
  var supportapp: js.UndefOr[typingsJapgolly.awsSdk.clientsSupportappMod.ClientConfiguration] = js.undefined
  
  var swf: js.UndefOr[typingsJapgolly.awsSdk.clientsSwfMod.ClientConfiguration] = js.undefined
  
  var synthetics: js.UndefOr[typingsJapgolly.awsSdk.clientsSyntheticsMod.ClientConfiguration] = js.undefined
  
  /**
    * An offset value in milliseconds to apply to all signing times.
    */
  var systemClockOffset: js.UndefOr[Double] = js.undefined
  
  var textract: js.UndefOr[typingsJapgolly.awsSdk.clientsTextractMod.ClientConfiguration] = js.undefined
  
  var timestreamquery: js.UndefOr[typingsJapgolly.awsSdk.clientsTimestreamqueryMod.ClientConfiguration] = js.undefined
  
  var timestreamwrite: js.UndefOr[typingsJapgolly.awsSdk.clientsTimestreamwriteMod.ClientConfiguration] = js.undefined
  
  /**
    * The Token to authenticate requests with.
    */
  var token: js.UndefOr[Token | Null] = js.undefined
  
  /**
    * The provider chain used to resolve token if no static token property is set.
    */
  var tokenProvider: js.UndefOr[TokenProviderChain] = js.undefined
  
  var transcribeservice: js.UndefOr[typingsJapgolly.awsSdk.clientsTranscribeserviceMod.ClientConfiguration] = js.undefined
  
  var transfer: js.UndefOr[typingsJapgolly.awsSdk.clientsTransferMod.ClientConfiguration] = js.undefined
  
  var translate: js.UndefOr[typingsJapgolly.awsSdk.clientsTranslateMod.ClientConfiguration] = js.undefined
  
  /**
    * Whether to use the Accelerate endpoint with the S3 service.
    */
  var useAccelerateEndpoint: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enables IPv6 dualstack endpoint.
    */
  var useDualstackEndpoint: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enables FIPS compatible endpoints.
    */
  var useFipsEndpoint: js.UndefOr[Boolean] = js.undefined
  
  var voiceid: js.UndefOr[typingsJapgolly.awsSdk.clientsVoiceidMod.ClientConfiguration] = js.undefined
  
  var waf: js.UndefOr[typingsJapgolly.awsSdk.clientsWafMod.ClientConfiguration] = js.undefined
  
  var wafregional: js.UndefOr[typingsJapgolly.awsSdk.clientsWafregionalMod.ClientConfiguration] = js.undefined
  
  var wafv2: js.UndefOr[typingsJapgolly.awsSdk.clientsWafv2Mod.ClientConfiguration] = js.undefined
  
  var wellarchitected: js.UndefOr[typingsJapgolly.awsSdk.clientsWellarchitectedMod.ClientConfiguration] = js.undefined
  
  var wisdom: js.UndefOr[typingsJapgolly.awsSdk.clientsWisdomMod.ClientConfiguration] = js.undefined
  
  var workdocs: js.UndefOr[typingsJapgolly.awsSdk.clientsWorkdocsMod.ClientConfiguration] = js.undefined
  
  var worklink: js.UndefOr[typingsJapgolly.awsSdk.clientsWorklinkMod.ClientConfiguration] = js.undefined
  
  var workmail: js.UndefOr[typingsJapgolly.awsSdk.clientsWorkmailMod.ClientConfiguration] = js.undefined
  
  var workmailmessageflow: js.UndefOr[typingsJapgolly.awsSdk.clientsWorkmailmessageflowMod.ClientConfiguration] = js.undefined
  
  var workspaces: js.UndefOr[typingsJapgolly.awsSdk.clientsWorkspacesMod.ClientConfiguration] = js.undefined
  
  var workspacesweb: js.UndefOr[typingsJapgolly.awsSdk.clientsWorkspaceswebMod.ClientConfiguration] = js.undefined
  
  var xray: js.UndefOr[typingsJapgolly.awsSdk.clientsXrayMod.ClientConfiguration] = js.undefined
}
object ConfigurationOptionsConfi {
  
  inline def apply(Object: js.Object): ConfigurationOptionsConfi = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, Object)
    __obj.asInstanceOf[ConfigurationOptionsConfi]
  }
  
  extension [Self <: ConfigurationOptionsConfi](x: Self) {
    
    inline def setAccessKeyId(value: String): Self = StObject.set(x, "accessKeyId", value.asInstanceOf[js.Any])
    
    inline def setAccessKeyIdUndefined: Self = StObject.set(x, "accessKeyId", js.undefined)
    
    inline def setAccessanalyzer(value: ClientConfiguration): Self = StObject.set(x, "accessanalyzer", value.asInstanceOf[js.Any])
    
    inline def setAccessanalyzerUndefined: Self = StObject.set(x, "accessanalyzer", js.undefined)
    
    inline def setAccount(value: typingsJapgolly.awsSdk.clientsAccountMod.ClientConfiguration): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
    inline def setAcm(value: typingsJapgolly.awsSdk.clientsAcmMod.ClientConfiguration): Self = StObject.set(x, "acm", value.asInstanceOf[js.Any])
    
    inline def setAcmUndefined: Self = StObject.set(x, "acm", js.undefined)
    
    inline def setAcmpca(value: typingsJapgolly.awsSdk.clientsAcmpcaMod.ClientConfiguration): Self = StObject.set(x, "acmpca", value.asInstanceOf[js.Any])
    
    inline def setAcmpcaUndefined: Self = StObject.set(x, "acmpca", js.undefined)
    
    inline def setAlexaforbusiness(value: typingsJapgolly.awsSdk.clientsAlexaforbusinessMod.ClientConfiguration): Self = StObject.set(x, "alexaforbusiness", value.asInstanceOf[js.Any])
    
    inline def setAlexaforbusinessUndefined: Self = StObject.set(x, "alexaforbusiness", js.undefined)
    
    inline def setAmp(value: typingsJapgolly.awsSdk.clientsAmpMod.ClientConfiguration): Self = StObject.set(x, "amp", value.asInstanceOf[js.Any])
    
    inline def setAmpUndefined: Self = StObject.set(x, "amp", js.undefined)
    
    inline def setAmplify(value: typingsJapgolly.awsSdk.clientsAmplifyMod.ClientConfiguration): Self = StObject.set(x, "amplify", value.asInstanceOf[js.Any])
    
    inline def setAmplifyUndefined: Self = StObject.set(x, "amplify", js.undefined)
    
    inline def setAmplifybackend(value: typingsJapgolly.awsSdk.clientsAmplifybackendMod.ClientConfiguration): Self = StObject.set(x, "amplifybackend", value.asInstanceOf[js.Any])
    
    inline def setAmplifybackendUndefined: Self = StObject.set(x, "amplifybackend", js.undefined)
    
    inline def setAmplifyuibuilder(value: typingsJapgolly.awsSdk.clientsAmplifyuibuilderMod.ClientConfiguration): Self = StObject.set(x, "amplifyuibuilder", value.asInstanceOf[js.Any])
    
    inline def setAmplifyuibuilderUndefined: Self = StObject.set(x, "amplifyuibuilder", js.undefined)
    
    inline def setApiVersion(value: latest_ | String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    inline def setApiVersions(value: ConfigurationServiceApiVersions): Self = StObject.set(x, "apiVersions", value.asInstanceOf[js.Any])
    
    inline def setApiVersionsUndefined: Self = StObject.set(x, "apiVersions", js.undefined)
    
    inline def setApigateway(value: typingsJapgolly.awsSdk.clientsApigatewayMod.ClientConfiguration): Self = StObject.set(x, "apigateway", value.asInstanceOf[js.Any])
    
    inline def setApigatewayUndefined: Self = StObject.set(x, "apigateway", js.undefined)
    
    inline def setApigatewaymanagementapi(value: typingsJapgolly.awsSdk.clientsApigatewaymanagementapiMod.ClientConfiguration): Self = StObject.set(x, "apigatewaymanagementapi", value.asInstanceOf[js.Any])
    
    inline def setApigatewaymanagementapiUndefined: Self = StObject.set(x, "apigatewaymanagementapi", js.undefined)
    
    inline def setApigatewayv2(value: typingsJapgolly.awsSdk.clientsApigatewayv2Mod.ClientConfiguration): Self = StObject.set(x, "apigatewayv2", value.asInstanceOf[js.Any])
    
    inline def setApigatewayv2Undefined: Self = StObject.set(x, "apigatewayv2", js.undefined)
    
    inline def setAppconfig(value: typingsJapgolly.awsSdk.clientsAppconfigMod.ClientConfiguration): Self = StObject.set(x, "appconfig", value.asInstanceOf[js.Any])
    
    inline def setAppconfigUndefined: Self = StObject.set(x, "appconfig", js.undefined)
    
    inline def setAppconfigdata(value: typingsJapgolly.awsSdk.clientsAppconfigdataMod.ClientConfiguration): Self = StObject.set(x, "appconfigdata", value.asInstanceOf[js.Any])
    
    inline def setAppconfigdataUndefined: Self = StObject.set(x, "appconfigdata", js.undefined)
    
    inline def setAppflow(value: typingsJapgolly.awsSdk.clientsAppflowMod.ClientConfiguration): Self = StObject.set(x, "appflow", value.asInstanceOf[js.Any])
    
    inline def setAppflowUndefined: Self = StObject.set(x, "appflow", js.undefined)
    
    inline def setAppintegrations(value: typingsJapgolly.awsSdk.clientsAppintegrationsMod.ClientConfiguration): Self = StObject.set(x, "appintegrations", value.asInstanceOf[js.Any])
    
    inline def setAppintegrationsUndefined: Self = StObject.set(x, "appintegrations", js.undefined)
    
    inline def setApplicationautoscaling(value: typingsJapgolly.awsSdk.clientsApplicationautoscalingMod.ClientConfiguration): Self = StObject.set(x, "applicationautoscaling", value.asInstanceOf[js.Any])
    
    inline def setApplicationautoscalingUndefined: Self = StObject.set(x, "applicationautoscaling", js.undefined)
    
    inline def setApplicationcostprofiler(value: typingsJapgolly.awsSdk.clientsApplicationcostprofilerMod.ClientConfiguration): Self = StObject.set(x, "applicationcostprofiler", value.asInstanceOf[js.Any])
    
    inline def setApplicationcostprofilerUndefined: Self = StObject.set(x, "applicationcostprofiler", js.undefined)
    
    inline def setApplicationinsights(value: typingsJapgolly.awsSdk.clientsApplicationinsightsMod.ClientConfiguration): Self = StObject.set(x, "applicationinsights", value.asInstanceOf[js.Any])
    
    inline def setApplicationinsightsUndefined: Self = StObject.set(x, "applicationinsights", js.undefined)
    
    inline def setAppmesh(value: typingsJapgolly.awsSdk.clientsAppmeshMod.ClientConfiguration): Self = StObject.set(x, "appmesh", value.asInstanceOf[js.Any])
    
    inline def setAppmeshUndefined: Self = StObject.set(x, "appmesh", js.undefined)
    
    inline def setApprunner(value: typingsJapgolly.awsSdk.clientsApprunnerMod.ClientConfiguration): Self = StObject.set(x, "apprunner", value.asInstanceOf[js.Any])
    
    inline def setApprunnerUndefined: Self = StObject.set(x, "apprunner", js.undefined)
    
    inline def setAppstream(value: typingsJapgolly.awsSdk.clientsAppstreamMod.ClientConfiguration): Self = StObject.set(x, "appstream", value.asInstanceOf[js.Any])
    
    inline def setAppstreamUndefined: Self = StObject.set(x, "appstream", js.undefined)
    
    inline def setAppsync(value: typingsJapgolly.awsSdk.clientsAppsyncMod.ClientConfiguration): Self = StObject.set(x, "appsync", value.asInstanceOf[js.Any])
    
    inline def setAppsyncUndefined: Self = StObject.set(x, "appsync", js.undefined)
    
    inline def setAthena(value: typingsJapgolly.awsSdk.clientsAthenaMod.ClientConfiguration): Self = StObject.set(x, "athena", value.asInstanceOf[js.Any])
    
    inline def setAthenaUndefined: Self = StObject.set(x, "athena", js.undefined)
    
    inline def setAuditmanager(value: typingsJapgolly.awsSdk.clientsAuditmanagerMod.ClientConfiguration): Self = StObject.set(x, "auditmanager", value.asInstanceOf[js.Any])
    
    inline def setAuditmanagerUndefined: Self = StObject.set(x, "auditmanager", js.undefined)
    
    inline def setAugmentedairuntime(value: typingsJapgolly.awsSdk.clientsAugmentedairuntimeMod.ClientConfiguration): Self = StObject.set(x, "augmentedairuntime", value.asInstanceOf[js.Any])
    
    inline def setAugmentedairuntimeUndefined: Self = StObject.set(x, "augmentedairuntime", js.undefined)
    
    inline def setAutoscaling(value: typingsJapgolly.awsSdk.clientsAutoscalingMod.ClientConfiguration): Self = StObject.set(x, "autoscaling", value.asInstanceOf[js.Any])
    
    inline def setAutoscalingUndefined: Self = StObject.set(x, "autoscaling", js.undefined)
    
    inline def setAutoscalingplans(value: typingsJapgolly.awsSdk.clientsAutoscalingplansMod.ClientConfiguration): Self = StObject.set(x, "autoscalingplans", value.asInstanceOf[js.Any])
    
    inline def setAutoscalingplansUndefined: Self = StObject.set(x, "autoscalingplans", js.undefined)
    
    inline def setBackup(value: typingsJapgolly.awsSdk.clientsBackupMod.ClientConfiguration): Self = StObject.set(x, "backup", value.asInstanceOf[js.Any])
    
    inline def setBackupUndefined: Self = StObject.set(x, "backup", js.undefined)
    
    inline def setBackupgateway(value: typingsJapgolly.awsSdk.clientsBackupgatewayMod.ClientConfiguration): Self = StObject.set(x, "backupgateway", value.asInstanceOf[js.Any])
    
    inline def setBackupgatewayUndefined: Self = StObject.set(x, "backupgateway", js.undefined)
    
    inline def setBackupstorage(value: typingsJapgolly.awsSdk.clientsBackupstorageMod.ClientConfiguration): Self = StObject.set(x, "backupstorage", value.asInstanceOf[js.Any])
    
    inline def setBackupstorageUndefined: Self = StObject.set(x, "backupstorage", js.undefined)
    
    inline def setBatch(value: typingsJapgolly.awsSdk.clientsBatchMod.ClientConfiguration): Self = StObject.set(x, "batch", value.asInstanceOf[js.Any])
    
    inline def setBatchUndefined: Self = StObject.set(x, "batch", js.undefined)
    
    inline def setBillingconductor(value: typingsJapgolly.awsSdk.clientsBillingconductorMod.ClientConfiguration): Self = StObject.set(x, "billingconductor", value.asInstanceOf[js.Any])
    
    inline def setBillingconductorUndefined: Self = StObject.set(x, "billingconductor", js.undefined)
    
    inline def setBraket(value: typingsJapgolly.awsSdk.clientsBraketMod.ClientConfiguration): Self = StObject.set(x, "braket", value.asInstanceOf[js.Any])
    
    inline def setBraketUndefined: Self = StObject.set(x, "braket", js.undefined)
    
    inline def setBudgets(value: typingsJapgolly.awsSdk.clientsBudgetsMod.ClientConfiguration): Self = StObject.set(x, "budgets", value.asInstanceOf[js.Any])
    
    inline def setBudgetsUndefined: Self = StObject.set(x, "budgets", js.undefined)
    
    inline def setChime(value: typingsJapgolly.awsSdk.clientsChimeMod.ClientConfiguration): Self = StObject.set(x, "chime", value.asInstanceOf[js.Any])
    
    inline def setChimeUndefined: Self = StObject.set(x, "chime", js.undefined)
    
    inline def setChimesdkidentity(value: typingsJapgolly.awsSdk.clientsChimesdkidentityMod.ClientConfiguration): Self = StObject.set(x, "chimesdkidentity", value.asInstanceOf[js.Any])
    
    inline def setChimesdkidentityUndefined: Self = StObject.set(x, "chimesdkidentity", js.undefined)
    
    inline def setChimesdkmediapipelines(value: typingsJapgolly.awsSdk.clientsChimesdkmediapipelinesMod.ClientConfiguration): Self = StObject.set(x, "chimesdkmediapipelines", value.asInstanceOf[js.Any])
    
    inline def setChimesdkmediapipelinesUndefined: Self = StObject.set(x, "chimesdkmediapipelines", js.undefined)
    
    inline def setChimesdkmeetings(value: typingsJapgolly.awsSdk.clientsChimesdkmeetingsMod.ClientConfiguration): Self = StObject.set(x, "chimesdkmeetings", value.asInstanceOf[js.Any])
    
    inline def setChimesdkmeetingsUndefined: Self = StObject.set(x, "chimesdkmeetings", js.undefined)
    
    inline def setChimesdkmessaging(value: typingsJapgolly.awsSdk.clientsChimesdkmessagingMod.ClientConfiguration): Self = StObject.set(x, "chimesdkmessaging", value.asInstanceOf[js.Any])
    
    inline def setChimesdkmessagingUndefined: Self = StObject.set(x, "chimesdkmessaging", js.undefined)
    
    inline def setCloud9(value: typingsJapgolly.awsSdk.clientsCloud9Mod.ClientConfiguration): Self = StObject.set(x, "cloud9", value.asInstanceOf[js.Any])
    
    inline def setCloud9Undefined: Self = StObject.set(x, "cloud9", js.undefined)
    
    inline def setCloudcontrol(value: typingsJapgolly.awsSdk.clientsCloudcontrolMod.ClientConfiguration): Self = StObject.set(x, "cloudcontrol", value.asInstanceOf[js.Any])
    
    inline def setCloudcontrolUndefined: Self = StObject.set(x, "cloudcontrol", js.undefined)
    
    inline def setClouddirectory(value: typingsJapgolly.awsSdk.clientsClouddirectoryMod.ClientConfiguration): Self = StObject.set(x, "clouddirectory", value.asInstanceOf[js.Any])
    
    inline def setClouddirectoryUndefined: Self = StObject.set(x, "clouddirectory", js.undefined)
    
    inline def setCloudformation(value: typingsJapgolly.awsSdk.clientsCloudformationMod.ClientConfiguration): Self = StObject.set(x, "cloudformation", value.asInstanceOf[js.Any])
    
    inline def setCloudformationUndefined: Self = StObject.set(x, "cloudformation", js.undefined)
    
    inline def setCloudfront(value: typingsJapgolly.awsSdk.clientsCloudfrontMod.ClientConfiguration): Self = StObject.set(x, "cloudfront", value.asInstanceOf[js.Any])
    
    inline def setCloudfrontUndefined: Self = StObject.set(x, "cloudfront", js.undefined)
    
    inline def setCloudhsm(value: typingsJapgolly.awsSdk.clientsCloudhsmMod.ClientConfiguration): Self = StObject.set(x, "cloudhsm", value.asInstanceOf[js.Any])
    
    inline def setCloudhsmUndefined: Self = StObject.set(x, "cloudhsm", js.undefined)
    
    inline def setCloudhsmv2(value: typingsJapgolly.awsSdk.clientsCloudhsmv2Mod.ClientConfiguration): Self = StObject.set(x, "cloudhsmv2", value.asInstanceOf[js.Any])
    
    inline def setCloudhsmv2Undefined: Self = StObject.set(x, "cloudhsmv2", js.undefined)
    
    inline def setCloudsearch(value: typingsJapgolly.awsSdk.clientsCloudsearchMod.ClientConfiguration): Self = StObject.set(x, "cloudsearch", value.asInstanceOf[js.Any])
    
    inline def setCloudsearchUndefined: Self = StObject.set(x, "cloudsearch", js.undefined)
    
    inline def setCloudsearchdomain(value: typingsJapgolly.awsSdk.clientsCloudsearchdomainMod.ClientConfiguration): Self = StObject.set(x, "cloudsearchdomain", value.asInstanceOf[js.Any])
    
    inline def setCloudsearchdomainUndefined: Self = StObject.set(x, "cloudsearchdomain", js.undefined)
    
    inline def setCloudtrail(value: typingsJapgolly.awsSdk.clientsCloudtrailMod.ClientConfiguration): Self = StObject.set(x, "cloudtrail", value.asInstanceOf[js.Any])
    
    inline def setCloudtrailUndefined: Self = StObject.set(x, "cloudtrail", js.undefined)
    
    inline def setCloudwatch(value: typingsJapgolly.awsSdk.clientsCloudwatchMod.ClientConfiguration): Self = StObject.set(x, "cloudwatch", value.asInstanceOf[js.Any])
    
    inline def setCloudwatchUndefined: Self = StObject.set(x, "cloudwatch", js.undefined)
    
    inline def setCloudwatchevents(value: typingsJapgolly.awsSdk.clientsCloudwatcheventsMod.ClientConfiguration): Self = StObject.set(x, "cloudwatchevents", value.asInstanceOf[js.Any])
    
    inline def setCloudwatcheventsUndefined: Self = StObject.set(x, "cloudwatchevents", js.undefined)
    
    inline def setCloudwatchlogs(value: typingsJapgolly.awsSdk.clientsCloudwatchlogsMod.ClientConfiguration): Self = StObject.set(x, "cloudwatchlogs", value.asInstanceOf[js.Any])
    
    inline def setCloudwatchlogsUndefined: Self = StObject.set(x, "cloudwatchlogs", js.undefined)
    
    inline def setCodeartifact(value: typingsJapgolly.awsSdk.clientsCodeartifactMod.ClientConfiguration): Self = StObject.set(x, "codeartifact", value.asInstanceOf[js.Any])
    
    inline def setCodeartifactUndefined: Self = StObject.set(x, "codeartifact", js.undefined)
    
    inline def setCodebuild(value: typingsJapgolly.awsSdk.clientsCodebuildMod.ClientConfiguration): Self = StObject.set(x, "codebuild", value.asInstanceOf[js.Any])
    
    inline def setCodebuildUndefined: Self = StObject.set(x, "codebuild", js.undefined)
    
    inline def setCodecommit(value: typingsJapgolly.awsSdk.clientsCodecommitMod.ClientConfiguration): Self = StObject.set(x, "codecommit", value.asInstanceOf[js.Any])
    
    inline def setCodecommitUndefined: Self = StObject.set(x, "codecommit", js.undefined)
    
    inline def setCodedeploy(value: typingsJapgolly.awsSdk.clientsCodedeployMod.ClientConfiguration): Self = StObject.set(x, "codedeploy", value.asInstanceOf[js.Any])
    
    inline def setCodedeployUndefined: Self = StObject.set(x, "codedeploy", js.undefined)
    
    inline def setCodeguruprofiler(value: typingsJapgolly.awsSdk.clientsCodeguruprofilerMod.ClientConfiguration): Self = StObject.set(x, "codeguruprofiler", value.asInstanceOf[js.Any])
    
    inline def setCodeguruprofilerUndefined: Self = StObject.set(x, "codeguruprofiler", js.undefined)
    
    inline def setCodegurureviewer(value: typingsJapgolly.awsSdk.clientsCodegurureviewerMod.ClientConfiguration): Self = StObject.set(x, "codegurureviewer", value.asInstanceOf[js.Any])
    
    inline def setCodegurureviewerUndefined: Self = StObject.set(x, "codegurureviewer", js.undefined)
    
    inline def setCodepipeline(value: typingsJapgolly.awsSdk.clientsCodepipelineMod.ClientConfiguration): Self = StObject.set(x, "codepipeline", value.asInstanceOf[js.Any])
    
    inline def setCodepipelineUndefined: Self = StObject.set(x, "codepipeline", js.undefined)
    
    inline def setCodestar(value: typingsJapgolly.awsSdk.clientsCodestarMod.ClientConfiguration): Self = StObject.set(x, "codestar", value.asInstanceOf[js.Any])
    
    inline def setCodestarUndefined: Self = StObject.set(x, "codestar", js.undefined)
    
    inline def setCodestarconnections(value: typingsJapgolly.awsSdk.clientsCodestarconnectionsMod.ClientConfiguration): Self = StObject.set(x, "codestarconnections", value.asInstanceOf[js.Any])
    
    inline def setCodestarconnectionsUndefined: Self = StObject.set(x, "codestarconnections", js.undefined)
    
    inline def setCodestarnotifications(value: typingsJapgolly.awsSdk.clientsCodestarnotificationsMod.ClientConfiguration): Self = StObject.set(x, "codestarnotifications", value.asInstanceOf[js.Any])
    
    inline def setCodestarnotificationsUndefined: Self = StObject.set(x, "codestarnotifications", js.undefined)
    
    inline def setCognitoidentity(value: typingsJapgolly.awsSdk.clientsCognitoidentityMod.ClientConfiguration): Self = StObject.set(x, "cognitoidentity", value.asInstanceOf[js.Any])
    
    inline def setCognitoidentityUndefined: Self = StObject.set(x, "cognitoidentity", js.undefined)
    
    inline def setCognitoidentityserviceprovider(value: typingsJapgolly.awsSdk.clientsCognitoidentityserviceproviderMod.ClientConfiguration): Self = StObject.set(x, "cognitoidentityserviceprovider", value.asInstanceOf[js.Any])
    
    inline def setCognitoidentityserviceproviderUndefined: Self = StObject.set(x, "cognitoidentityserviceprovider", js.undefined)
    
    inline def setCognitosync(value: typingsJapgolly.awsSdk.clientsCognitosyncMod.ClientConfiguration): Self = StObject.set(x, "cognitosync", value.asInstanceOf[js.Any])
    
    inline def setCognitosyncUndefined: Self = StObject.set(x, "cognitosync", js.undefined)
    
    inline def setComprehend(value: typingsJapgolly.awsSdk.clientsComprehendMod.ClientConfiguration): Self = StObject.set(x, "comprehend", value.asInstanceOf[js.Any])
    
    inline def setComprehendUndefined: Self = StObject.set(x, "comprehend", js.undefined)
    
    inline def setComprehendmedical(value: typingsJapgolly.awsSdk.clientsComprehendmedicalMod.ClientConfiguration): Self = StObject.set(x, "comprehendmedical", value.asInstanceOf[js.Any])
    
    inline def setComprehendmedicalUndefined: Self = StObject.set(x, "comprehendmedical", js.undefined)
    
    inline def setComputeChecksums(value: Boolean): Self = StObject.set(x, "computeChecksums", value.asInstanceOf[js.Any])
    
    inline def setComputeChecksumsUndefined: Self = StObject.set(x, "computeChecksums", js.undefined)
    
    inline def setComputeoptimizer(value: typingsJapgolly.awsSdk.clientsComputeoptimizerMod.ClientConfiguration): Self = StObject.set(x, "computeoptimizer", value.asInstanceOf[js.Any])
    
    inline def setComputeoptimizerUndefined: Self = StObject.set(x, "computeoptimizer", js.undefined)
    
    inline def setConfigservice(value: typingsJapgolly.awsSdk.clientsConfigserviceMod.ClientConfiguration): Self = StObject.set(x, "configservice", value.asInstanceOf[js.Any])
    
    inline def setConfigserviceUndefined: Self = StObject.set(x, "configservice", js.undefined)
    
    inline def setConnect(value: typingsJapgolly.awsSdk.clientsConnectMod.ClientConfiguration): Self = StObject.set(x, "connect", value.asInstanceOf[js.Any])
    
    inline def setConnectUndefined: Self = StObject.set(x, "connect", js.undefined)
    
    inline def setConnectcampaigns(value: typingsJapgolly.awsSdk.clientsConnectcampaignsMod.ClientConfiguration): Self = StObject.set(x, "connectcampaigns", value.asInstanceOf[js.Any])
    
    inline def setConnectcampaignsUndefined: Self = StObject.set(x, "connectcampaigns", js.undefined)
    
    inline def setConnectcases(value: typingsJapgolly.awsSdk.clientsConnectcasesMod.ClientConfiguration): Self = StObject.set(x, "connectcases", value.asInstanceOf[js.Any])
    
    inline def setConnectcasesUndefined: Self = StObject.set(x, "connectcases", js.undefined)
    
    inline def setConnectcontactlens(value: typingsJapgolly.awsSdk.clientsConnectcontactlensMod.ClientConfiguration): Self = StObject.set(x, "connectcontactlens", value.asInstanceOf[js.Any])
    
    inline def setConnectcontactlensUndefined: Self = StObject.set(x, "connectcontactlens", js.undefined)
    
    inline def setConnectparticipant(value: typingsJapgolly.awsSdk.clientsConnectparticipantMod.ClientConfiguration): Self = StObject.set(x, "connectparticipant", value.asInstanceOf[js.Any])
    
    inline def setConnectparticipantUndefined: Self = StObject.set(x, "connectparticipant", js.undefined)
    
    inline def setControltower(value: typingsJapgolly.awsSdk.clientsControltowerMod.ClientConfiguration): Self = StObject.set(x, "controltower", value.asInstanceOf[js.Any])
    
    inline def setControltowerUndefined: Self = StObject.set(x, "controltower", js.undefined)
    
    inline def setConvertResponseTypes(value: Boolean): Self = StObject.set(x, "convertResponseTypes", value.asInstanceOf[js.Any])
    
    inline def setConvertResponseTypesUndefined: Self = StObject.set(x, "convertResponseTypes", js.undefined)
    
    inline def setCorrectClockSkew(value: Boolean): Self = StObject.set(x, "correctClockSkew", value.asInstanceOf[js.Any])
    
    inline def setCorrectClockSkewUndefined: Self = StObject.set(x, "correctClockSkew", js.undefined)
    
    inline def setCostexplorer(value: typingsJapgolly.awsSdk.clientsCostexplorerMod.ClientConfiguration): Self = StObject.set(x, "costexplorer", value.asInstanceOf[js.Any])
    
    inline def setCostexplorerUndefined: Self = StObject.set(x, "costexplorer", js.undefined)
    
    inline def setCredentialProvider(value: CredentialProviderChain): Self = StObject.set(x, "credentialProvider", value.asInstanceOf[js.Any])
    
    inline def setCredentialProviderUndefined: Self = StObject.set(x, "credentialProvider", js.undefined)
    
    inline def setCredentials(value: Credentials | CredentialsOptions): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    inline def setCredentialsNull: Self = StObject.set(x, "credentials", null)
    
    inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
    
    inline def setCur(value: typingsJapgolly.awsSdk.clientsCurMod.ClientConfiguration): Self = StObject.set(x, "cur", value.asInstanceOf[js.Any])
    
    inline def setCurUndefined: Self = StObject.set(x, "cur", js.undefined)
    
    inline def setCustomUserAgent(value: String): Self = StObject.set(x, "customUserAgent", value.asInstanceOf[js.Any])
    
    inline def setCustomUserAgentUndefined: Self = StObject.set(x, "customUserAgent", js.undefined)
    
    inline def setCustomerprofiles(value: typingsJapgolly.awsSdk.clientsCustomerprofilesMod.ClientConfiguration): Self = StObject.set(x, "customerprofiles", value.asInstanceOf[js.Any])
    
    inline def setCustomerprofilesUndefined: Self = StObject.set(x, "customerprofiles", js.undefined)
    
    inline def setDatabrew(value: typingsJapgolly.awsSdk.clientsDatabrewMod.ClientConfiguration): Self = StObject.set(x, "databrew", value.asInstanceOf[js.Any])
    
    inline def setDatabrewUndefined: Self = StObject.set(x, "databrew", js.undefined)
    
    inline def setDataexchange(value: typingsJapgolly.awsSdk.clientsDataexchangeMod.ClientConfiguration): Self = StObject.set(x, "dataexchange", value.asInstanceOf[js.Any])
    
    inline def setDataexchangeUndefined: Self = StObject.set(x, "dataexchange", js.undefined)
    
    inline def setDatapipeline(value: typingsJapgolly.awsSdk.clientsDatapipelineMod.ClientConfiguration): Self = StObject.set(x, "datapipeline", value.asInstanceOf[js.Any])
    
    inline def setDatapipelineUndefined: Self = StObject.set(x, "datapipeline", js.undefined)
    
    inline def setDatasync(value: typingsJapgolly.awsSdk.clientsDatasyncMod.ClientConfiguration): Self = StObject.set(x, "datasync", value.asInstanceOf[js.Any])
    
    inline def setDatasyncUndefined: Self = StObject.set(x, "datasync", js.undefined)
    
    inline def setDax(value: typingsJapgolly.awsSdk.clientsDaxMod.ClientConfiguration): Self = StObject.set(x, "dax", value.asInstanceOf[js.Any])
    
    inline def setDaxUndefined: Self = StObject.set(x, "dax", js.undefined)
    
    inline def setDetective(value: typingsJapgolly.awsSdk.clientsDetectiveMod.ClientConfiguration): Self = StObject.set(x, "detective", value.asInstanceOf[js.Any])
    
    inline def setDetectiveUndefined: Self = StObject.set(x, "detective", js.undefined)
    
    inline def setDevicefarm(value: typingsJapgolly.awsSdk.clientsDevicefarmMod.ClientConfiguration): Self = StObject.set(x, "devicefarm", value.asInstanceOf[js.Any])
    
    inline def setDevicefarmUndefined: Self = StObject.set(x, "devicefarm", js.undefined)
    
    inline def setDevopsguru(value: typingsJapgolly.awsSdk.clientsDevopsguruMod.ClientConfiguration): Self = StObject.set(x, "devopsguru", value.asInstanceOf[js.Any])
    
    inline def setDevopsguruUndefined: Self = StObject.set(x, "devopsguru", js.undefined)
    
    inline def setDirectconnect(value: typingsJapgolly.awsSdk.clientsDirectconnectMod.ClientConfiguration): Self = StObject.set(x, "directconnect", value.asInstanceOf[js.Any])
    
    inline def setDirectconnectUndefined: Self = StObject.set(x, "directconnect", js.undefined)
    
    inline def setDirectoryservice(value: typingsJapgolly.awsSdk.clientsDirectoryserviceMod.ClientConfiguration): Self = StObject.set(x, "directoryservice", value.asInstanceOf[js.Any])
    
    inline def setDirectoryserviceUndefined: Self = StObject.set(x, "directoryservice", js.undefined)
    
    inline def setDiscovery(value: typingsJapgolly.awsSdk.clientsDiscoveryMod.ClientConfiguration): Self = StObject.set(x, "discovery", value.asInstanceOf[js.Any])
    
    inline def setDiscoveryUndefined: Self = StObject.set(x, "discovery", js.undefined)
    
    inline def setDlm(value: typingsJapgolly.awsSdk.clientsDlmMod.ClientConfiguration): Self = StObject.set(x, "dlm", value.asInstanceOf[js.Any])
    
    inline def setDlmUndefined: Self = StObject.set(x, "dlm", js.undefined)
    
    inline def setDms(value: typingsJapgolly.awsSdk.clientsDmsMod.ClientConfiguration): Self = StObject.set(x, "dms", value.asInstanceOf[js.Any])
    
    inline def setDmsUndefined: Self = StObject.set(x, "dms", js.undefined)
    
    inline def setDocdb(value: typingsJapgolly.awsSdk.clientsDocdbMod.ClientConfiguration): Self = StObject.set(x, "docdb", value.asInstanceOf[js.Any])
    
    inline def setDocdbUndefined: Self = StObject.set(x, "docdb", js.undefined)
    
    inline def setDrs(value: typingsJapgolly.awsSdk.clientsDrsMod.ClientConfiguration): Self = StObject.set(x, "drs", value.asInstanceOf[js.Any])
    
    inline def setDrsUndefined: Self = StObject.set(x, "drs", js.undefined)
    
    inline def setDynamoDbCrc32(value: Boolean): Self = StObject.set(x, "dynamoDbCrc32", value.asInstanceOf[js.Any])
    
    inline def setDynamoDbCrc32Undefined: Self = StObject.set(x, "dynamoDbCrc32", js.undefined)
    
    inline def setDynamodb(value: typingsJapgolly.awsSdk.clientsDynamodbMod.ClientConfiguration): Self = StObject.set(x, "dynamodb", value.asInstanceOf[js.Any])
    
    inline def setDynamodbUndefined: Self = StObject.set(x, "dynamodb", js.undefined)
    
    inline def setDynamodbstreams(value: typingsJapgolly.awsSdk.clientsDynamodbstreamsMod.ClientConfiguration): Self = StObject.set(x, "dynamodbstreams", value.asInstanceOf[js.Any])
    
    inline def setDynamodbstreamsUndefined: Self = StObject.set(x, "dynamodbstreams", js.undefined)
    
    inline def setEbs(value: typingsJapgolly.awsSdk.clientsEbsMod.ClientConfiguration): Self = StObject.set(x, "ebs", value.asInstanceOf[js.Any])
    
    inline def setEbsUndefined: Self = StObject.set(x, "ebs", js.undefined)
    
    inline def setEc2(value: typingsJapgolly.awsSdk.clientsEc2Mod.ClientConfiguration): Self = StObject.set(x, "ec2", value.asInstanceOf[js.Any])
    
    inline def setEc2Undefined: Self = StObject.set(x, "ec2", js.undefined)
    
    inline def setEc2instanceconnect(value: typingsJapgolly.awsSdk.clientsEc2instanceconnectMod.ClientConfiguration): Self = StObject.set(x, "ec2instanceconnect", value.asInstanceOf[js.Any])
    
    inline def setEc2instanceconnectUndefined: Self = StObject.set(x, "ec2instanceconnect", js.undefined)
    
    inline def setEcr(value: typingsJapgolly.awsSdk.clientsEcrMod.ClientConfiguration): Self = StObject.set(x, "ecr", value.asInstanceOf[js.Any])
    
    inline def setEcrUndefined: Self = StObject.set(x, "ecr", js.undefined)
    
    inline def setEcrpublic(value: typingsJapgolly.awsSdk.clientsEcrpublicMod.ClientConfiguration): Self = StObject.set(x, "ecrpublic", value.asInstanceOf[js.Any])
    
    inline def setEcrpublicUndefined: Self = StObject.set(x, "ecrpublic", js.undefined)
    
    inline def setEcs(value: typingsJapgolly.awsSdk.clientsEcsMod.ClientConfiguration): Self = StObject.set(x, "ecs", value.asInstanceOf[js.Any])
    
    inline def setEcsUndefined: Self = StObject.set(x, "ecs", js.undefined)
    
    inline def setEfs(value: typingsJapgolly.awsSdk.clientsEfsMod.ClientConfiguration): Self = StObject.set(x, "efs", value.asInstanceOf[js.Any])
    
    inline def setEfsUndefined: Self = StObject.set(x, "efs", js.undefined)
    
    inline def setEks(value: typingsJapgolly.awsSdk.clientsEksMod.ClientConfiguration): Self = StObject.set(x, "eks", value.asInstanceOf[js.Any])
    
    inline def setEksUndefined: Self = StObject.set(x, "eks", js.undefined)
    
    inline def setElasticache(value: typingsJapgolly.awsSdk.clientsElasticacheMod.ClientConfiguration): Self = StObject.set(x, "elasticache", value.asInstanceOf[js.Any])
    
    inline def setElasticacheUndefined: Self = StObject.set(x, "elasticache", js.undefined)
    
    inline def setElasticbeanstalk(value: typingsJapgolly.awsSdk.clientsElasticbeanstalkMod.ClientConfiguration): Self = StObject.set(x, "elasticbeanstalk", value.asInstanceOf[js.Any])
    
    inline def setElasticbeanstalkUndefined: Self = StObject.set(x, "elasticbeanstalk", js.undefined)
    
    inline def setElasticinference(value: typingsJapgolly.awsSdk.clientsElasticinferenceMod.ClientConfiguration): Self = StObject.set(x, "elasticinference", value.asInstanceOf[js.Any])
    
    inline def setElasticinferenceUndefined: Self = StObject.set(x, "elasticinference", js.undefined)
    
    inline def setElastictranscoder(value: typingsJapgolly.awsSdk.clientsElastictranscoderMod.ClientConfiguration): Self = StObject.set(x, "elastictranscoder", value.asInstanceOf[js.Any])
    
    inline def setElastictranscoderUndefined: Self = StObject.set(x, "elastictranscoder", js.undefined)
    
    inline def setElb(value: typingsJapgolly.awsSdk.clientsElbMod.ClientConfiguration): Self = StObject.set(x, "elb", value.asInstanceOf[js.Any])
    
    inline def setElbUndefined: Self = StObject.set(x, "elb", js.undefined)
    
    inline def setElbv2(value: typingsJapgolly.awsSdk.clientsElbv2Mod.ClientConfiguration): Self = StObject.set(x, "elbv2", value.asInstanceOf[js.Any])
    
    inline def setElbv2Undefined: Self = StObject.set(x, "elbv2", js.undefined)
    
    inline def setEmr(value: typingsJapgolly.awsSdk.clientsEmrMod.ClientConfiguration): Self = StObject.set(x, "emr", value.asInstanceOf[js.Any])
    
    inline def setEmrUndefined: Self = StObject.set(x, "emr", js.undefined)
    
    inline def setEmrcontainers(value: typingsJapgolly.awsSdk.clientsEmrcontainersMod.ClientConfiguration): Self = StObject.set(x, "emrcontainers", value.asInstanceOf[js.Any])
    
    inline def setEmrcontainersUndefined: Self = StObject.set(x, "emrcontainers", js.undefined)
    
    inline def setEmrserverless(value: typingsJapgolly.awsSdk.clientsEmrserverlessMod.ClientConfiguration): Self = StObject.set(x, "emrserverless", value.asInstanceOf[js.Any])
    
    inline def setEmrserverlessUndefined: Self = StObject.set(x, "emrserverless", js.undefined)
    
    inline def setEndpointCacheSize(value: Double): Self = StObject.set(x, "endpointCacheSize", value.asInstanceOf[js.Any])
    
    inline def setEndpointCacheSizeUndefined: Self = StObject.set(x, "endpointCacheSize", js.undefined)
    
    inline def setEndpointDiscoveryEnabled(value: Boolean): Self = StObject.set(x, "endpointDiscoveryEnabled", value.asInstanceOf[js.Any])
    
    inline def setEndpointDiscoveryEnabledUndefined: Self = StObject.set(x, "endpointDiscoveryEnabled", js.undefined)
    
    inline def setEs(value: typingsJapgolly.awsSdk.clientsEsMod.ClientConfiguration): Self = StObject.set(x, "es", value.asInstanceOf[js.Any])
    
    inline def setEsUndefined: Self = StObject.set(x, "es", js.undefined)
    
    inline def setEventbridge(value: typingsJapgolly.awsSdk.clientsEventbridgeMod.ClientConfiguration): Self = StObject.set(x, "eventbridge", value.asInstanceOf[js.Any])
    
    inline def setEventbridgeUndefined: Self = StObject.set(x, "eventbridge", js.undefined)
    
    inline def setEvidently(value: typingsJapgolly.awsSdk.clientsEvidentlyMod.ClientConfiguration): Self = StObject.set(x, "evidently", value.asInstanceOf[js.Any])
    
    inline def setEvidentlyUndefined: Self = StObject.set(x, "evidently", js.undefined)
    
    inline def setFinspace(value: typingsJapgolly.awsSdk.clientsFinspaceMod.ClientConfiguration): Self = StObject.set(x, "finspace", value.asInstanceOf[js.Any])
    
    inline def setFinspaceUndefined: Self = StObject.set(x, "finspace", js.undefined)
    
    inline def setFinspacedata(value: typingsJapgolly.awsSdk.clientsFinspacedataMod.ClientConfiguration): Self = StObject.set(x, "finspacedata", value.asInstanceOf[js.Any])
    
    inline def setFinspacedataUndefined: Self = StObject.set(x, "finspacedata", js.undefined)
    
    inline def setFirehose(value: typingsJapgolly.awsSdk.clientsFirehoseMod.ClientConfiguration): Self = StObject.set(x, "firehose", value.asInstanceOf[js.Any])
    
    inline def setFirehoseUndefined: Self = StObject.set(x, "firehose", js.undefined)
    
    inline def setFis(value: typingsJapgolly.awsSdk.clientsFisMod.ClientConfiguration): Self = StObject.set(x, "fis", value.asInstanceOf[js.Any])
    
    inline def setFisUndefined: Self = StObject.set(x, "fis", js.undefined)
    
    inline def setFms(value: typingsJapgolly.awsSdk.clientsFmsMod.ClientConfiguration): Self = StObject.set(x, "fms", value.asInstanceOf[js.Any])
    
    inline def setFmsUndefined: Self = StObject.set(x, "fms", js.undefined)
    
    inline def setForecastqueryservice(value: typingsJapgolly.awsSdk.clientsForecastqueryserviceMod.ClientConfiguration): Self = StObject.set(x, "forecastqueryservice", value.asInstanceOf[js.Any])
    
    inline def setForecastqueryserviceUndefined: Self = StObject.set(x, "forecastqueryservice", js.undefined)
    
    inline def setForecastservice(value: typingsJapgolly.awsSdk.clientsForecastserviceMod.ClientConfiguration): Self = StObject.set(x, "forecastservice", value.asInstanceOf[js.Any])
    
    inline def setForecastserviceUndefined: Self = StObject.set(x, "forecastservice", js.undefined)
    
    inline def setFrauddetector(value: typingsJapgolly.awsSdk.clientsFrauddetectorMod.ClientConfiguration): Self = StObject.set(x, "frauddetector", value.asInstanceOf[js.Any])
    
    inline def setFrauddetectorUndefined: Self = StObject.set(x, "frauddetector", js.undefined)
    
    inline def setFsx(value: typingsJapgolly.awsSdk.clientsFsxMod.ClientConfiguration): Self = StObject.set(x, "fsx", value.asInstanceOf[js.Any])
    
    inline def setFsxUndefined: Self = StObject.set(x, "fsx", js.undefined)
    
    inline def setGamelift(value: typingsJapgolly.awsSdk.clientsGameliftMod.ClientConfiguration): Self = StObject.set(x, "gamelift", value.asInstanceOf[js.Any])
    
    inline def setGameliftUndefined: Self = StObject.set(x, "gamelift", js.undefined)
    
    inline def setGamesparks(value: typingsJapgolly.awsSdk.clientsGamesparksMod.ClientConfiguration): Self = StObject.set(x, "gamesparks", value.asInstanceOf[js.Any])
    
    inline def setGamesparksUndefined: Self = StObject.set(x, "gamesparks", js.undefined)
    
    inline def setGlacier(value: typingsJapgolly.awsSdk.clientsGlacierMod.ClientConfiguration): Self = StObject.set(x, "glacier", value.asInstanceOf[js.Any])
    
    inline def setGlacierUndefined: Self = StObject.set(x, "glacier", js.undefined)
    
    inline def setGlobalaccelerator(value: typingsJapgolly.awsSdk.clientsGlobalacceleratorMod.ClientConfiguration): Self = StObject.set(x, "globalaccelerator", value.asInstanceOf[js.Any])
    
    inline def setGlobalacceleratorUndefined: Self = StObject.set(x, "globalaccelerator", js.undefined)
    
    inline def setGlue(value: typingsJapgolly.awsSdk.clientsGlueMod.ClientConfiguration): Self = StObject.set(x, "glue", value.asInstanceOf[js.Any])
    
    inline def setGlueUndefined: Self = StObject.set(x, "glue", js.undefined)
    
    inline def setGrafana(value: typingsJapgolly.awsSdk.clientsGrafanaMod.ClientConfiguration): Self = StObject.set(x, "grafana", value.asInstanceOf[js.Any])
    
    inline def setGrafanaUndefined: Self = StObject.set(x, "grafana", js.undefined)
    
    inline def setGreengrass(value: typingsJapgolly.awsSdk.clientsGreengrassMod.ClientConfiguration): Self = StObject.set(x, "greengrass", value.asInstanceOf[js.Any])
    
    inline def setGreengrassUndefined: Self = StObject.set(x, "greengrass", js.undefined)
    
    inline def setGreengrassv2(value: typingsJapgolly.awsSdk.clientsGreengrassv2Mod.ClientConfiguration): Self = StObject.set(x, "greengrassv2", value.asInstanceOf[js.Any])
    
    inline def setGreengrassv2Undefined: Self = StObject.set(x, "greengrassv2", js.undefined)
    
    inline def setGroundstation(value: typingsJapgolly.awsSdk.clientsGroundstationMod.ClientConfiguration): Self = StObject.set(x, "groundstation", value.asInstanceOf[js.Any])
    
    inline def setGroundstationUndefined: Self = StObject.set(x, "groundstation", js.undefined)
    
    inline def setGuardduty(value: typingsJapgolly.awsSdk.clientsGuarddutyMod.ClientConfiguration): Self = StObject.set(x, "guardduty", value.asInstanceOf[js.Any])
    
    inline def setGuarddutyUndefined: Self = StObject.set(x, "guardduty", js.undefined)
    
    inline def setHealth(value: typingsJapgolly.awsSdk.clientsHealthMod.ClientConfiguration): Self = StObject.set(x, "health", value.asInstanceOf[js.Any])
    
    inline def setHealthUndefined: Self = StObject.set(x, "health", js.undefined)
    
    inline def setHealthlake(value: typingsJapgolly.awsSdk.clientsHealthlakeMod.ClientConfiguration): Self = StObject.set(x, "healthlake", value.asInstanceOf[js.Any])
    
    inline def setHealthlakeUndefined: Self = StObject.set(x, "healthlake", js.undefined)
    
    inline def setHoneycode(value: typingsJapgolly.awsSdk.clientsHoneycodeMod.ClientConfiguration): Self = StObject.set(x, "honeycode", value.asInstanceOf[js.Any])
    
    inline def setHoneycodeUndefined: Self = StObject.set(x, "honeycode", js.undefined)
    
    inline def setHostPrefixEnabled(value: Boolean): Self = StObject.set(x, "hostPrefixEnabled", value.asInstanceOf[js.Any])
    
    inline def setHostPrefixEnabledUndefined: Self = StObject.set(x, "hostPrefixEnabled", js.undefined)
    
    inline def setHttpOptions(value: HTTPOptions): Self = StObject.set(x, "httpOptions", value.asInstanceOf[js.Any])
    
    inline def setHttpOptionsUndefined: Self = StObject.set(x, "httpOptions", js.undefined)
    
    inline def setIam(value: typingsJapgolly.awsSdk.clientsIamMod.ClientConfiguration): Self = StObject.set(x, "iam", value.asInstanceOf[js.Any])
    
    inline def setIamUndefined: Self = StObject.set(x, "iam", js.undefined)
    
    inline def setIdentitystore(value: typingsJapgolly.awsSdk.clientsIdentitystoreMod.ClientConfiguration): Self = StObject.set(x, "identitystore", value.asInstanceOf[js.Any])
    
    inline def setIdentitystoreUndefined: Self = StObject.set(x, "identitystore", js.undefined)
    
    inline def setImagebuilder(value: typingsJapgolly.awsSdk.clientsImagebuilderMod.ClientConfiguration): Self = StObject.set(x, "imagebuilder", value.asInstanceOf[js.Any])
    
    inline def setImagebuilderUndefined: Self = StObject.set(x, "imagebuilder", js.undefined)
    
    inline def setImportexport(value: typingsJapgolly.awsSdk.clientsImportexportMod.ClientConfiguration): Self = StObject.set(x, "importexport", value.asInstanceOf[js.Any])
    
    inline def setImportexportUndefined: Self = StObject.set(x, "importexport", js.undefined)
    
    inline def setInspector(value: typingsJapgolly.awsSdk.clientsInspectorMod.ClientConfiguration): Self = StObject.set(x, "inspector", value.asInstanceOf[js.Any])
    
    inline def setInspector2(value: typingsJapgolly.awsSdk.clientsInspector2Mod.ClientConfiguration): Self = StObject.set(x, "inspector2", value.asInstanceOf[js.Any])
    
    inline def setInspector2Undefined: Self = StObject.set(x, "inspector2", js.undefined)
    
    inline def setInspectorUndefined: Self = StObject.set(x, "inspector", js.undefined)
    
    inline def setIot(value: typingsJapgolly.awsSdk.clientsIotMod.ClientConfiguration): Self = StObject.set(x, "iot", value.asInstanceOf[js.Any])
    
    inline def setIot1clickdevicesservice(value: typingsJapgolly.awsSdk.clientsIot1clickdevicesserviceMod.ClientConfiguration): Self = StObject.set(x, "iot1clickdevicesservice", value.asInstanceOf[js.Any])
    
    inline def setIot1clickdevicesserviceUndefined: Self = StObject.set(x, "iot1clickdevicesservice", js.undefined)
    
    inline def setIot1clickprojects(value: typingsJapgolly.awsSdk.clientsIot1clickprojectsMod.ClientConfiguration): Self = StObject.set(x, "iot1clickprojects", value.asInstanceOf[js.Any])
    
    inline def setIot1clickprojectsUndefined: Self = StObject.set(x, "iot1clickprojects", js.undefined)
    
    inline def setIotUndefined: Self = StObject.set(x, "iot", js.undefined)
    
    inline def setIotanalytics(value: typingsJapgolly.awsSdk.clientsIotanalyticsMod.ClientConfiguration): Self = StObject.set(x, "iotanalytics", value.asInstanceOf[js.Any])
    
    inline def setIotanalyticsUndefined: Self = StObject.set(x, "iotanalytics", js.undefined)
    
    inline def setIotdata(value: typingsJapgolly.awsSdk.clientsIotdataMod.ClientConfiguration): Self = StObject.set(x, "iotdata", value.asInstanceOf[js.Any])
    
    inline def setIotdataUndefined: Self = StObject.set(x, "iotdata", js.undefined)
    
    inline def setIotdeviceadvisor(value: typingsJapgolly.awsSdk.clientsIotdeviceadvisorMod.ClientConfiguration): Self = StObject.set(x, "iotdeviceadvisor", value.asInstanceOf[js.Any])
    
    inline def setIotdeviceadvisorUndefined: Self = StObject.set(x, "iotdeviceadvisor", js.undefined)
    
    inline def setIotevents(value: typingsJapgolly.awsSdk.clientsIoteventsMod.ClientConfiguration): Self = StObject.set(x, "iotevents", value.asInstanceOf[js.Any])
    
    inline def setIoteventsUndefined: Self = StObject.set(x, "iotevents", js.undefined)
    
    inline def setIoteventsdata(value: typingsJapgolly.awsSdk.clientsIoteventsdataMod.ClientConfiguration): Self = StObject.set(x, "ioteventsdata", value.asInstanceOf[js.Any])
    
    inline def setIoteventsdataUndefined: Self = StObject.set(x, "ioteventsdata", js.undefined)
    
    inline def setIotfleethub(value: typingsJapgolly.awsSdk.clientsIotfleethubMod.ClientConfiguration): Self = StObject.set(x, "iotfleethub", value.asInstanceOf[js.Any])
    
    inline def setIotfleethubUndefined: Self = StObject.set(x, "iotfleethub", js.undefined)
    
    inline def setIotfleetwise(value: typingsJapgolly.awsSdk.clientsIotfleetwiseMod.ClientConfiguration): Self = StObject.set(x, "iotfleetwise", value.asInstanceOf[js.Any])
    
    inline def setIotfleetwiseUndefined: Self = StObject.set(x, "iotfleetwise", js.undefined)
    
    inline def setIotjobsdataplane(value: typingsJapgolly.awsSdk.clientsIotjobsdataplaneMod.ClientConfiguration): Self = StObject.set(x, "iotjobsdataplane", value.asInstanceOf[js.Any])
    
    inline def setIotjobsdataplaneUndefined: Self = StObject.set(x, "iotjobsdataplane", js.undefined)
    
    inline def setIotsecuretunneling(value: typingsJapgolly.awsSdk.clientsIotsecuretunnelingMod.ClientConfiguration): Self = StObject.set(x, "iotsecuretunneling", value.asInstanceOf[js.Any])
    
    inline def setIotsecuretunnelingUndefined: Self = StObject.set(x, "iotsecuretunneling", js.undefined)
    
    inline def setIotsitewise(value: typingsJapgolly.awsSdk.clientsIotsitewiseMod.ClientConfiguration): Self = StObject.set(x, "iotsitewise", value.asInstanceOf[js.Any])
    
    inline def setIotsitewiseUndefined: Self = StObject.set(x, "iotsitewise", js.undefined)
    
    inline def setIotthingsgraph(value: typingsJapgolly.awsSdk.clientsIotthingsgraphMod.ClientConfiguration): Self = StObject.set(x, "iotthingsgraph", value.asInstanceOf[js.Any])
    
    inline def setIotthingsgraphUndefined: Self = StObject.set(x, "iotthingsgraph", js.undefined)
    
    inline def setIottwinmaker(value: typingsJapgolly.awsSdk.clientsIottwinmakerMod.ClientConfiguration): Self = StObject.set(x, "iottwinmaker", value.asInstanceOf[js.Any])
    
    inline def setIottwinmakerUndefined: Self = StObject.set(x, "iottwinmaker", js.undefined)
    
    inline def setIotwireless(value: typingsJapgolly.awsSdk.clientsIotwirelessMod.ClientConfiguration): Self = StObject.set(x, "iotwireless", value.asInstanceOf[js.Any])
    
    inline def setIotwirelessUndefined: Self = StObject.set(x, "iotwireless", js.undefined)
    
    inline def setIvs(value: typingsJapgolly.awsSdk.clientsIvsMod.ClientConfiguration): Self = StObject.set(x, "ivs", value.asInstanceOf[js.Any])
    
    inline def setIvsUndefined: Self = StObject.set(x, "ivs", js.undefined)
    
    inline def setIvschat(value: typingsJapgolly.awsSdk.clientsIvschatMod.ClientConfiguration): Self = StObject.set(x, "ivschat", value.asInstanceOf[js.Any])
    
    inline def setIvschatUndefined: Self = StObject.set(x, "ivschat", js.undefined)
    
    inline def setKafka(value: typingsJapgolly.awsSdk.clientsKafkaMod.ClientConfiguration): Self = StObject.set(x, "kafka", value.asInstanceOf[js.Any])
    
    inline def setKafkaUndefined: Self = StObject.set(x, "kafka", js.undefined)
    
    inline def setKafkaconnect(value: typingsJapgolly.awsSdk.clientsKafkaconnectMod.ClientConfiguration): Self = StObject.set(x, "kafkaconnect", value.asInstanceOf[js.Any])
    
    inline def setKafkaconnectUndefined: Self = StObject.set(x, "kafkaconnect", js.undefined)
    
    inline def setKendra(value: typingsJapgolly.awsSdk.clientsKendraMod.ClientConfiguration): Self = StObject.set(x, "kendra", value.asInstanceOf[js.Any])
    
    inline def setKendraUndefined: Self = StObject.set(x, "kendra", js.undefined)
    
    inline def setKeyspaces(value: typingsJapgolly.awsSdk.clientsKeyspacesMod.ClientConfiguration): Self = StObject.set(x, "keyspaces", value.asInstanceOf[js.Any])
    
    inline def setKeyspacesUndefined: Self = StObject.set(x, "keyspaces", js.undefined)
    
    inline def setKinesis(value: typingsJapgolly.awsSdk.clientsKinesisMod.ClientConfiguration): Self = StObject.set(x, "kinesis", value.asInstanceOf[js.Any])
    
    inline def setKinesisUndefined: Self = StObject.set(x, "kinesis", js.undefined)
    
    inline def setKinesisanalytics(value: typingsJapgolly.awsSdk.clientsKinesisanalyticsMod.ClientConfiguration): Self = StObject.set(x, "kinesisanalytics", value.asInstanceOf[js.Any])
    
    inline def setKinesisanalyticsUndefined: Self = StObject.set(x, "kinesisanalytics", js.undefined)
    
    inline def setKinesisanalyticsv2(value: typingsJapgolly.awsSdk.clientsKinesisanalyticsv2Mod.ClientConfiguration): Self = StObject.set(x, "kinesisanalyticsv2", value.asInstanceOf[js.Any])
    
    inline def setKinesisanalyticsv2Undefined: Self = StObject.set(x, "kinesisanalyticsv2", js.undefined)
    
    inline def setKinesisvideo(value: typingsJapgolly.awsSdk.clientsKinesisvideoMod.ClientConfiguration): Self = StObject.set(x, "kinesisvideo", value.asInstanceOf[js.Any])
    
    inline def setKinesisvideoUndefined: Self = StObject.set(x, "kinesisvideo", js.undefined)
    
    inline def setKinesisvideoarchivedmedia(value: typingsJapgolly.awsSdk.clientsKinesisvideoarchivedmediaMod.ClientConfiguration): Self = StObject.set(x, "kinesisvideoarchivedmedia", value.asInstanceOf[js.Any])
    
    inline def setKinesisvideoarchivedmediaUndefined: Self = StObject.set(x, "kinesisvideoarchivedmedia", js.undefined)
    
    inline def setKinesisvideomedia(value: typingsJapgolly.awsSdk.clientsKinesisvideomediaMod.ClientConfiguration): Self = StObject.set(x, "kinesisvideomedia", value.asInstanceOf[js.Any])
    
    inline def setKinesisvideomediaUndefined: Self = StObject.set(x, "kinesisvideomedia", js.undefined)
    
    inline def setKinesisvideosignalingchannels(value: typingsJapgolly.awsSdk.clientsKinesisvideosignalingchannelsMod.ClientConfiguration): Self = StObject.set(x, "kinesisvideosignalingchannels", value.asInstanceOf[js.Any])
    
    inline def setKinesisvideosignalingchannelsUndefined: Self = StObject.set(x, "kinesisvideosignalingchannels", js.undefined)
    
    inline def setKms(value: typingsJapgolly.awsSdk.clientsKmsMod.ClientConfiguration): Self = StObject.set(x, "kms", value.asInstanceOf[js.Any])
    
    inline def setKmsUndefined: Self = StObject.set(x, "kms", js.undefined)
    
    inline def setLakeformation(value: typingsJapgolly.awsSdk.clientsLakeformationMod.ClientConfiguration): Self = StObject.set(x, "lakeformation", value.asInstanceOf[js.Any])
    
    inline def setLakeformationUndefined: Self = StObject.set(x, "lakeformation", js.undefined)
    
    inline def setLambda(value: typingsJapgolly.awsSdk.clientsLambdaMod.ClientConfiguration): Self = StObject.set(x, "lambda", value.asInstanceOf[js.Any])
    
    inline def setLambdaUndefined: Self = StObject.set(x, "lambda", js.undefined)
    
    inline def setLexmodelbuildingservice(value: typingsJapgolly.awsSdk.clientsLexmodelbuildingserviceMod.ClientConfiguration): Self = StObject.set(x, "lexmodelbuildingservice", value.asInstanceOf[js.Any])
    
    inline def setLexmodelbuildingserviceUndefined: Self = StObject.set(x, "lexmodelbuildingservice", js.undefined)
    
    inline def setLexmodelsv2(value: typingsJapgolly.awsSdk.clientsLexmodelsv2Mod.ClientConfiguration): Self = StObject.set(x, "lexmodelsv2", value.asInstanceOf[js.Any])
    
    inline def setLexmodelsv2Undefined: Self = StObject.set(x, "lexmodelsv2", js.undefined)
    
    inline def setLexruntime(value: typingsJapgolly.awsSdk.clientsLexruntimeMod.ClientConfiguration): Self = StObject.set(x, "lexruntime", value.asInstanceOf[js.Any])
    
    inline def setLexruntimeUndefined: Self = StObject.set(x, "lexruntime", js.undefined)
    
    inline def setLexruntimev2(value: typingsJapgolly.awsSdk.clientsLexruntimev2Mod.ClientConfiguration): Self = StObject.set(x, "lexruntimev2", value.asInstanceOf[js.Any])
    
    inline def setLexruntimev2Undefined: Self = StObject.set(x, "lexruntimev2", js.undefined)
    
    inline def setLicensemanager(value: typingsJapgolly.awsSdk.clientsLicensemanagerMod.ClientConfiguration): Self = StObject.set(x, "licensemanager", value.asInstanceOf[js.Any])
    
    inline def setLicensemanagerUndefined: Self = StObject.set(x, "licensemanager", js.undefined)
    
    inline def setLicensemanagerusersubscriptions(value: typingsJapgolly.awsSdk.clientsLicensemanagerusersubscriptionsMod.ClientConfiguration): Self = StObject.set(x, "licensemanagerusersubscriptions", value.asInstanceOf[js.Any])
    
    inline def setLicensemanagerusersubscriptionsUndefined: Self = StObject.set(x, "licensemanagerusersubscriptions", js.undefined)
    
    inline def setLightsail(value: typingsJapgolly.awsSdk.clientsLightsailMod.ClientConfiguration): Self = StObject.set(x, "lightsail", value.asInstanceOf[js.Any])
    
    inline def setLightsailUndefined: Self = StObject.set(x, "lightsail", js.undefined)
    
    inline def setLocation(value: typingsJapgolly.awsSdk.clientsLocationMod.ClientConfiguration): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    
    inline def setLookoutequipment(value: typingsJapgolly.awsSdk.clientsLookoutequipmentMod.ClientConfiguration): Self = StObject.set(x, "lookoutequipment", value.asInstanceOf[js.Any])
    
    inline def setLookoutequipmentUndefined: Self = StObject.set(x, "lookoutequipment", js.undefined)
    
    inline def setLookoutmetrics(value: typingsJapgolly.awsSdk.clientsLookoutmetricsMod.ClientConfiguration): Self = StObject.set(x, "lookoutmetrics", value.asInstanceOf[js.Any])
    
    inline def setLookoutmetricsUndefined: Self = StObject.set(x, "lookoutmetrics", js.undefined)
    
    inline def setLookoutvision(value: typingsJapgolly.awsSdk.clientsLookoutvisionMod.ClientConfiguration): Self = StObject.set(x, "lookoutvision", value.asInstanceOf[js.Any])
    
    inline def setLookoutvisionUndefined: Self = StObject.set(x, "lookoutvision", js.undefined)
    
    inline def setM2(value: typingsJapgolly.awsSdk.clientsM2Mod.ClientConfiguration): Self = StObject.set(x, "m2", value.asInstanceOf[js.Any])
    
    inline def setM2Undefined: Self = StObject.set(x, "m2", js.undefined)
    
    inline def setMachinelearning(value: typingsJapgolly.awsSdk.clientsMachinelearningMod.ClientConfiguration): Self = StObject.set(x, "machinelearning", value.asInstanceOf[js.Any])
    
    inline def setMachinelearningUndefined: Self = StObject.set(x, "machinelearning", js.undefined)
    
    inline def setMacie(value: typingsJapgolly.awsSdk.clientsMacieMod.ClientConfiguration): Self = StObject.set(x, "macie", value.asInstanceOf[js.Any])
    
    inline def setMacie2(value: typingsJapgolly.awsSdk.clientsMacie2Mod.ClientConfiguration): Self = StObject.set(x, "macie2", value.asInstanceOf[js.Any])
    
    inline def setMacie2Undefined: Self = StObject.set(x, "macie2", js.undefined)
    
    inline def setMacieUndefined: Self = StObject.set(x, "macie", js.undefined)
    
    inline def setManagedblockchain(value: typingsJapgolly.awsSdk.clientsManagedblockchainMod.ClientConfiguration): Self = StObject.set(x, "managedblockchain", value.asInstanceOf[js.Any])
    
    inline def setManagedblockchainUndefined: Self = StObject.set(x, "managedblockchain", js.undefined)
    
    inline def setMarketplacecatalog(value: typingsJapgolly.awsSdk.clientsMarketplacecatalogMod.ClientConfiguration): Self = StObject.set(x, "marketplacecatalog", value.asInstanceOf[js.Any])
    
    inline def setMarketplacecatalogUndefined: Self = StObject.set(x, "marketplacecatalog", js.undefined)
    
    inline def setMarketplacecommerceanalytics(value: typingsJapgolly.awsSdk.clientsMarketplacecommerceanalyticsMod.ClientConfiguration): Self = StObject.set(x, "marketplacecommerceanalytics", value.asInstanceOf[js.Any])
    
    inline def setMarketplacecommerceanalyticsUndefined: Self = StObject.set(x, "marketplacecommerceanalytics", js.undefined)
    
    inline def setMarketplaceentitlementservice(value: typingsJapgolly.awsSdk.clientsMarketplaceentitlementserviceMod.ClientConfiguration): Self = StObject.set(x, "marketplaceentitlementservice", value.asInstanceOf[js.Any])
    
    inline def setMarketplaceentitlementserviceUndefined: Self = StObject.set(x, "marketplaceentitlementservice", js.undefined)
    
    inline def setMarketplacemetering(value: typingsJapgolly.awsSdk.clientsMarketplacemeteringMod.ClientConfiguration): Self = StObject.set(x, "marketplacemetering", value.asInstanceOf[js.Any])
    
    inline def setMarketplacemeteringUndefined: Self = StObject.set(x, "marketplacemetering", js.undefined)
    
    inline def setMaxRedirects(value: Double): Self = StObject.set(x, "maxRedirects", value.asInstanceOf[js.Any])
    
    inline def setMaxRedirectsUndefined: Self = StObject.set(x, "maxRedirects", js.undefined)
    
    inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
    
    inline def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
    
    inline def setMediaconnect(value: typingsJapgolly.awsSdk.clientsMediaconnectMod.ClientConfiguration): Self = StObject.set(x, "mediaconnect", value.asInstanceOf[js.Any])
    
    inline def setMediaconnectUndefined: Self = StObject.set(x, "mediaconnect", js.undefined)
    
    inline def setMediaconvert(value: typingsJapgolly.awsSdk.clientsMediaconvertMod.ClientConfiguration): Self = StObject.set(x, "mediaconvert", value.asInstanceOf[js.Any])
    
    inline def setMediaconvertUndefined: Self = StObject.set(x, "mediaconvert", js.undefined)
    
    inline def setMedialive(value: typingsJapgolly.awsSdk.clientsMedialiveMod.ClientConfiguration): Self = StObject.set(x, "medialive", value.asInstanceOf[js.Any])
    
    inline def setMedialiveUndefined: Self = StObject.set(x, "medialive", js.undefined)
    
    inline def setMediapackage(value: typingsJapgolly.awsSdk.clientsMediapackageMod.ClientConfiguration): Self = StObject.set(x, "mediapackage", value.asInstanceOf[js.Any])
    
    inline def setMediapackageUndefined: Self = StObject.set(x, "mediapackage", js.undefined)
    
    inline def setMediapackagevod(value: typingsJapgolly.awsSdk.clientsMediapackagevodMod.ClientConfiguration): Self = StObject.set(x, "mediapackagevod", value.asInstanceOf[js.Any])
    
    inline def setMediapackagevodUndefined: Self = StObject.set(x, "mediapackagevod", js.undefined)
    
    inline def setMediastore(value: typingsJapgolly.awsSdk.clientsMediastoreMod.ClientConfiguration): Self = StObject.set(x, "mediastore", value.asInstanceOf[js.Any])
    
    inline def setMediastoreUndefined: Self = StObject.set(x, "mediastore", js.undefined)
    
    inline def setMediastoredata(value: typingsJapgolly.awsSdk.clientsMediastoredataMod.ClientConfiguration): Self = StObject.set(x, "mediastoredata", value.asInstanceOf[js.Any])
    
    inline def setMediastoredataUndefined: Self = StObject.set(x, "mediastoredata", js.undefined)
    
    inline def setMediatailor(value: typingsJapgolly.awsSdk.clientsMediatailorMod.ClientConfiguration): Self = StObject.set(x, "mediatailor", value.asInstanceOf[js.Any])
    
    inline def setMediatailorUndefined: Self = StObject.set(x, "mediatailor", js.undefined)
    
    inline def setMemorydb(value: typingsJapgolly.awsSdk.clientsMemorydbMod.ClientConfiguration): Self = StObject.set(x, "memorydb", value.asInstanceOf[js.Any])
    
    inline def setMemorydbUndefined: Self = StObject.set(x, "memorydb", js.undefined)
    
    inline def setMgn(value: typingsJapgolly.awsSdk.clientsMgnMod.ClientConfiguration): Self = StObject.set(x, "mgn", value.asInstanceOf[js.Any])
    
    inline def setMgnUndefined: Self = StObject.set(x, "mgn", js.undefined)
    
    inline def setMigrationhub(value: typingsJapgolly.awsSdk.clientsMigrationhubMod.ClientConfiguration): Self = StObject.set(x, "migrationhub", value.asInstanceOf[js.Any])
    
    inline def setMigrationhubUndefined: Self = StObject.set(x, "migrationhub", js.undefined)
    
    inline def setMigrationhubconfig(value: typingsJapgolly.awsSdk.clientsMigrationhubconfigMod.ClientConfiguration): Self = StObject.set(x, "migrationhubconfig", value.asInstanceOf[js.Any])
    
    inline def setMigrationhubconfigUndefined: Self = StObject.set(x, "migrationhubconfig", js.undefined)
    
    inline def setMigrationhuborchestrator(value: typingsJapgolly.awsSdk.clientsMigrationhuborchestratorMod.ClientConfiguration): Self = StObject.set(x, "migrationhuborchestrator", value.asInstanceOf[js.Any])
    
    inline def setMigrationhuborchestratorUndefined: Self = StObject.set(x, "migrationhuborchestrator", js.undefined)
    
    inline def setMigrationhubrefactorspaces(value: typingsJapgolly.awsSdk.clientsMigrationhubrefactorspacesMod.ClientConfiguration): Self = StObject.set(x, "migrationhubrefactorspaces", value.asInstanceOf[js.Any])
    
    inline def setMigrationhubrefactorspacesUndefined: Self = StObject.set(x, "migrationhubrefactorspaces", js.undefined)
    
    inline def setMigrationhubstrategy(value: typingsJapgolly.awsSdk.clientsMigrationhubstrategyMod.ClientConfiguration): Self = StObject.set(x, "migrationhubstrategy", value.asInstanceOf[js.Any])
    
    inline def setMigrationhubstrategyUndefined: Self = StObject.set(x, "migrationhubstrategy", js.undefined)
    
    inline def setMobile(value: typingsJapgolly.awsSdk.clientsMobileMod.ClientConfiguration): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
    
    inline def setMobileUndefined: Self = StObject.set(x, "mobile", js.undefined)
    
    inline def setMobileanalytics(value: typingsJapgolly.awsSdk.clientsMobileanalyticsMod.ClientConfiguration): Self = StObject.set(x, "mobileanalytics", value.asInstanceOf[js.Any])
    
    inline def setMobileanalyticsUndefined: Self = StObject.set(x, "mobileanalytics", js.undefined)
    
    inline def setMq(value: typingsJapgolly.awsSdk.clientsMqMod.ClientConfiguration): Self = StObject.set(x, "mq", value.asInstanceOf[js.Any])
    
    inline def setMqUndefined: Self = StObject.set(x, "mq", js.undefined)
    
    inline def setMturk(value: typingsJapgolly.awsSdk.clientsMturkMod.ClientConfiguration): Self = StObject.set(x, "mturk", value.asInstanceOf[js.Any])
    
    inline def setMturkUndefined: Self = StObject.set(x, "mturk", js.undefined)
    
    inline def setMwaa(value: typingsJapgolly.awsSdk.clientsMwaaMod.ClientConfiguration): Self = StObject.set(x, "mwaa", value.asInstanceOf[js.Any])
    
    inline def setMwaaUndefined: Self = StObject.set(x, "mwaa", js.undefined)
    
    inline def setNeptune(value: typingsJapgolly.awsSdk.clientsNeptuneMod.ClientConfiguration): Self = StObject.set(x, "neptune", value.asInstanceOf[js.Any])
    
    inline def setNeptuneUndefined: Self = StObject.set(x, "neptune", js.undefined)
    
    inline def setNetworkfirewall(value: typingsJapgolly.awsSdk.clientsNetworkfirewallMod.ClientConfiguration): Self = StObject.set(x, "networkfirewall", value.asInstanceOf[js.Any])
    
    inline def setNetworkfirewallUndefined: Self = StObject.set(x, "networkfirewall", js.undefined)
    
    inline def setNetworkmanager(value: typingsJapgolly.awsSdk.clientsNetworkmanagerMod.ClientConfiguration): Self = StObject.set(x, "networkmanager", value.asInstanceOf[js.Any])
    
    inline def setNetworkmanagerUndefined: Self = StObject.set(x, "networkmanager", js.undefined)
    
    inline def setNimble(value: typingsJapgolly.awsSdk.clientsNimbleMod.ClientConfiguration): Self = StObject.set(x, "nimble", value.asInstanceOf[js.Any])
    
    inline def setNimbleUndefined: Self = StObject.set(x, "nimble", js.undefined)
    
    inline def setOpensearch(value: typingsJapgolly.awsSdk.clientsOpensearchMod.ClientConfiguration): Self = StObject.set(x, "opensearch", value.asInstanceOf[js.Any])
    
    inline def setOpensearchUndefined: Self = StObject.set(x, "opensearch", js.undefined)
    
    inline def setOpsworks(value: typingsJapgolly.awsSdk.clientsOpsworksMod.ClientConfiguration): Self = StObject.set(x, "opsworks", value.asInstanceOf[js.Any])
    
    inline def setOpsworksUndefined: Self = StObject.set(x, "opsworks", js.undefined)
    
    inline def setOpsworkscm(value: typingsJapgolly.awsSdk.clientsOpsworkscmMod.ClientConfiguration): Self = StObject.set(x, "opsworkscm", value.asInstanceOf[js.Any])
    
    inline def setOpsworkscmUndefined: Self = StObject.set(x, "opsworkscm", js.undefined)
    
    inline def setOrganizations(value: typingsJapgolly.awsSdk.clientsOrganizationsMod.ClientConfiguration): Self = StObject.set(x, "organizations", value.asInstanceOf[js.Any])
    
    inline def setOrganizationsUndefined: Self = StObject.set(x, "organizations", js.undefined)
    
    inline def setOutposts(value: typingsJapgolly.awsSdk.clientsOutpostsMod.ClientConfiguration): Self = StObject.set(x, "outposts", value.asInstanceOf[js.Any])
    
    inline def setOutpostsUndefined: Self = StObject.set(x, "outposts", js.undefined)
    
    inline def setPanorama(value: typingsJapgolly.awsSdk.clientsPanoramaMod.ClientConfiguration): Self = StObject.set(x, "panorama", value.asInstanceOf[js.Any])
    
    inline def setPanoramaUndefined: Self = StObject.set(x, "panorama", js.undefined)
    
    inline def setParamValidation(value: ParamValidation | Boolean): Self = StObject.set(x, "paramValidation", value.asInstanceOf[js.Any])
    
    inline def setParamValidationUndefined: Self = StObject.set(x, "paramValidation", js.undefined)
    
    inline def setPersonalize(value: typingsJapgolly.awsSdk.clientsPersonalizeMod.ClientConfiguration): Self = StObject.set(x, "personalize", value.asInstanceOf[js.Any])
    
    inline def setPersonalizeUndefined: Self = StObject.set(x, "personalize", js.undefined)
    
    inline def setPersonalizeevents(value: typingsJapgolly.awsSdk.clientsPersonalizeeventsMod.ClientConfiguration): Self = StObject.set(x, "personalizeevents", value.asInstanceOf[js.Any])
    
    inline def setPersonalizeeventsUndefined: Self = StObject.set(x, "personalizeevents", js.undefined)
    
    inline def setPersonalizeruntime(value: typingsJapgolly.awsSdk.clientsPersonalizeruntimeMod.ClientConfiguration): Self = StObject.set(x, "personalizeruntime", value.asInstanceOf[js.Any])
    
    inline def setPersonalizeruntimeUndefined: Self = StObject.set(x, "personalizeruntime", js.undefined)
    
    inline def setPi(value: typingsJapgolly.awsSdk.clientsPiMod.ClientConfiguration): Self = StObject.set(x, "pi", value.asInstanceOf[js.Any])
    
    inline def setPiUndefined: Self = StObject.set(x, "pi", js.undefined)
    
    inline def setPinpoint(value: typingsJapgolly.awsSdk.clientsPinpointMod.ClientConfiguration): Self = StObject.set(x, "pinpoint", value.asInstanceOf[js.Any])
    
    inline def setPinpointUndefined: Self = StObject.set(x, "pinpoint", js.undefined)
    
    inline def setPinpointemail(value: typingsJapgolly.awsSdk.clientsPinpointemailMod.ClientConfiguration): Self = StObject.set(x, "pinpointemail", value.asInstanceOf[js.Any])
    
    inline def setPinpointemailUndefined: Self = StObject.set(x, "pinpointemail", js.undefined)
    
    inline def setPinpointsmsvoice(value: typingsJapgolly.awsSdk.clientsPinpointsmsvoiceMod.ClientConfiguration): Self = StObject.set(x, "pinpointsmsvoice", value.asInstanceOf[js.Any])
    
    inline def setPinpointsmsvoiceUndefined: Self = StObject.set(x, "pinpointsmsvoice", js.undefined)
    
    inline def setPinpointsmsvoicev2(value: typingsJapgolly.awsSdk.clientsPinpointsmsvoicev2Mod.ClientConfiguration): Self = StObject.set(x, "pinpointsmsvoicev2", value.asInstanceOf[js.Any])
    
    inline def setPinpointsmsvoicev2Undefined: Self = StObject.set(x, "pinpointsmsvoicev2", js.undefined)
    
    inline def setPolly(value: typingsJapgolly.awsSdk.clientsPollyMod.ClientConfiguration): Self = StObject.set(x, "polly", value.asInstanceOf[js.Any])
    
    inline def setPollyUndefined: Self = StObject.set(x, "polly", js.undefined)
    
    inline def setPricing(value: typingsJapgolly.awsSdk.clientsPricingMod.ClientConfiguration): Self = StObject.set(x, "pricing", value.asInstanceOf[js.Any])
    
    inline def setPricingUndefined: Self = StObject.set(x, "pricing", js.undefined)
    
    inline def setPrivatenetworks(value: typingsJapgolly.awsSdk.clientsPrivatenetworksMod.ClientConfiguration): Self = StObject.set(x, "privatenetworks", value.asInstanceOf[js.Any])
    
    inline def setPrivatenetworksUndefined: Self = StObject.set(x, "privatenetworks", js.undefined)
    
    inline def setProton(value: typingsJapgolly.awsSdk.clientsProtonMod.ClientConfiguration): Self = StObject.set(x, "proton", value.asInstanceOf[js.Any])
    
    inline def setProtonUndefined: Self = StObject.set(x, "proton", js.undefined)
    
    inline def setQldb(value: typingsJapgolly.awsSdk.clientsQldbMod.ClientConfiguration): Self = StObject.set(x, "qldb", value.asInstanceOf[js.Any])
    
    inline def setQldbUndefined: Self = StObject.set(x, "qldb", js.undefined)
    
    inline def setQldbsession(value: typingsJapgolly.awsSdk.clientsQldbsessionMod.ClientConfiguration): Self = StObject.set(x, "qldbsession", value.asInstanceOf[js.Any])
    
    inline def setQldbsessionUndefined: Self = StObject.set(x, "qldbsession", js.undefined)
    
    inline def setQuicksight(value: typingsJapgolly.awsSdk.clientsQuicksightMod.ClientConfiguration): Self = StObject.set(x, "quicksight", value.asInstanceOf[js.Any])
    
    inline def setQuicksightUndefined: Self = StObject.set(x, "quicksight", js.undefined)
    
    inline def setRam(value: typingsJapgolly.awsSdk.clientsRamMod.ClientConfiguration): Self = StObject.set(x, "ram", value.asInstanceOf[js.Any])
    
    inline def setRamUndefined: Self = StObject.set(x, "ram", js.undefined)
    
    inline def setRbin(value: typingsJapgolly.awsSdk.clientsRbinMod.ClientConfiguration): Self = StObject.set(x, "rbin", value.asInstanceOf[js.Any])
    
    inline def setRbinUndefined: Self = StObject.set(x, "rbin", js.undefined)
    
    inline def setRds(value: typingsJapgolly.awsSdk.clientsRdsMod.ClientConfiguration): Self = StObject.set(x, "rds", value.asInstanceOf[js.Any])
    
    inline def setRdsUndefined: Self = StObject.set(x, "rds", js.undefined)
    
    inline def setRdsdataservice(value: typingsJapgolly.awsSdk.clientsRdsdataserviceMod.ClientConfiguration): Self = StObject.set(x, "rdsdataservice", value.asInstanceOf[js.Any])
    
    inline def setRdsdataserviceUndefined: Self = StObject.set(x, "rdsdataservice", js.undefined)
    
    inline def setRedshift(value: typingsJapgolly.awsSdk.clientsRedshiftMod.ClientConfiguration): Self = StObject.set(x, "redshift", value.asInstanceOf[js.Any])
    
    inline def setRedshiftUndefined: Self = StObject.set(x, "redshift", js.undefined)
    
    inline def setRedshiftdata(value: typingsJapgolly.awsSdk.clientsRedshiftdataMod.ClientConfiguration): Self = StObject.set(x, "redshiftdata", value.asInstanceOf[js.Any])
    
    inline def setRedshiftdataUndefined: Self = StObject.set(x, "redshiftdata", js.undefined)
    
    inline def setRedshiftserverless(value: typingsJapgolly.awsSdk.clientsRedshiftserverlessMod.ClientConfiguration): Self = StObject.set(x, "redshiftserverless", value.asInstanceOf[js.Any])
    
    inline def setRedshiftserverlessUndefined: Self = StObject.set(x, "redshiftserverless", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setRekognition(value: typingsJapgolly.awsSdk.clientsRekognitionMod.ClientConfiguration): Self = StObject.set(x, "rekognition", value.asInstanceOf[js.Any])
    
    inline def setRekognitionUndefined: Self = StObject.set(x, "rekognition", js.undefined)
    
    inline def setResiliencehub(value: typingsJapgolly.awsSdk.clientsResiliencehubMod.ClientConfiguration): Self = StObject.set(x, "resiliencehub", value.asInstanceOf[js.Any])
    
    inline def setResiliencehubUndefined: Self = StObject.set(x, "resiliencehub", js.undefined)
    
    inline def setResourcegroups(value: typingsJapgolly.awsSdk.clientsResourcegroupsMod.ClientConfiguration): Self = StObject.set(x, "resourcegroups", value.asInstanceOf[js.Any])
    
    inline def setResourcegroupsUndefined: Self = StObject.set(x, "resourcegroups", js.undefined)
    
    inline def setResourcegroupstaggingapi(value: typingsJapgolly.awsSdk.clientsResourcegroupstaggingapiMod.ClientConfiguration): Self = StObject.set(x, "resourcegroupstaggingapi", value.asInstanceOf[js.Any])
    
    inline def setResourcegroupstaggingapiUndefined: Self = StObject.set(x, "resourcegroupstaggingapi", js.undefined)
    
    inline def setRetryDelayOptions(value: RetryDelayOptions): Self = StObject.set(x, "retryDelayOptions", value.asInstanceOf[js.Any])
    
    inline def setRetryDelayOptionsUndefined: Self = StObject.set(x, "retryDelayOptions", js.undefined)
    
    inline def setRobomaker(value: typingsJapgolly.awsSdk.clientsRobomakerMod.ClientConfiguration): Self = StObject.set(x, "robomaker", value.asInstanceOf[js.Any])
    
    inline def setRobomakerUndefined: Self = StObject.set(x, "robomaker", js.undefined)
    
    inline def setRolesanywhere(value: typingsJapgolly.awsSdk.clientsRolesanywhereMod.ClientConfiguration): Self = StObject.set(x, "rolesanywhere", value.asInstanceOf[js.Any])
    
    inline def setRolesanywhereUndefined: Self = StObject.set(x, "rolesanywhere", js.undefined)
    
    inline def setRoute53(value: typingsJapgolly.awsSdk.clientsRoute53Mod.ClientConfiguration): Self = StObject.set(x, "route53", value.asInstanceOf[js.Any])
    
    inline def setRoute53Undefined: Self = StObject.set(x, "route53", js.undefined)
    
    inline def setRoute53domains(value: typingsJapgolly.awsSdk.clientsRoute53domainsMod.ClientConfiguration): Self = StObject.set(x, "route53domains", value.asInstanceOf[js.Any])
    
    inline def setRoute53domainsUndefined: Self = StObject.set(x, "route53domains", js.undefined)
    
    inline def setRoute53recoverycluster(value: typingsJapgolly.awsSdk.clientsRoute53recoveryclusterMod.ClientConfiguration): Self = StObject.set(x, "route53recoverycluster", value.asInstanceOf[js.Any])
    
    inline def setRoute53recoveryclusterUndefined: Self = StObject.set(x, "route53recoverycluster", js.undefined)
    
    inline def setRoute53recoverycontrolconfig(value: typingsJapgolly.awsSdk.clientsRoute53recoverycontrolconfigMod.ClientConfiguration): Self = StObject.set(x, "route53recoverycontrolconfig", value.asInstanceOf[js.Any])
    
    inline def setRoute53recoverycontrolconfigUndefined: Self = StObject.set(x, "route53recoverycontrolconfig", js.undefined)
    
    inline def setRoute53recoveryreadiness(value: typingsJapgolly.awsSdk.clientsRoute53recoveryreadinessMod.ClientConfiguration): Self = StObject.set(x, "route53recoveryreadiness", value.asInstanceOf[js.Any])
    
    inline def setRoute53recoveryreadinessUndefined: Self = StObject.set(x, "route53recoveryreadiness", js.undefined)
    
    inline def setRoute53resolver(value: typingsJapgolly.awsSdk.clientsRoute53resolverMod.ClientConfiguration): Self = StObject.set(x, "route53resolver", value.asInstanceOf[js.Any])
    
    inline def setRoute53resolverUndefined: Self = StObject.set(x, "route53resolver", js.undefined)
    
    inline def setRum(value: typingsJapgolly.awsSdk.clientsRumMod.ClientConfiguration): Self = StObject.set(x, "rum", value.asInstanceOf[js.Any])
    
    inline def setRumUndefined: Self = StObject.set(x, "rum", js.undefined)
    
    inline def setS3(value: typingsJapgolly.awsSdk.clientsS3Mod.ClientConfiguration): Self = StObject.set(x, "s3", value.asInstanceOf[js.Any])
    
    inline def setS3BucketEndpoint(value: Boolean): Self = StObject.set(x, "s3BucketEndpoint", value.asInstanceOf[js.Any])
    
    inline def setS3BucketEndpointUndefined: Self = StObject.set(x, "s3BucketEndpoint", js.undefined)
    
    inline def setS3DisableBodySigning(value: Boolean): Self = StObject.set(x, "s3DisableBodySigning", value.asInstanceOf[js.Any])
    
    inline def setS3DisableBodySigningUndefined: Self = StObject.set(x, "s3DisableBodySigning", js.undefined)
    
    inline def setS3ForcePathStyle(value: Boolean): Self = StObject.set(x, "s3ForcePathStyle", value.asInstanceOf[js.Any])
    
    inline def setS3ForcePathStyleUndefined: Self = StObject.set(x, "s3ForcePathStyle", js.undefined)
    
    inline def setS3Undefined: Self = StObject.set(x, "s3", js.undefined)
    
    inline def setS3UsEast1RegionalEndpoint(value: regional_ | legacy_): Self = StObject.set(x, "s3UsEast1RegionalEndpoint", value.asInstanceOf[js.Any])
    
    inline def setS3UsEast1RegionalEndpointUndefined: Self = StObject.set(x, "s3UsEast1RegionalEndpoint", js.undefined)
    
    inline def setS3UseArnRegion(value: Boolean): Self = StObject.set(x, "s3UseArnRegion", value.asInstanceOf[js.Any])
    
    inline def setS3UseArnRegionUndefined: Self = StObject.set(x, "s3UseArnRegion", js.undefined)
    
    inline def setS3control(value: typingsJapgolly.awsSdk.clientsS3controlMod.ClientConfiguration): Self = StObject.set(x, "s3control", value.asInstanceOf[js.Any])
    
    inline def setS3controlUndefined: Self = StObject.set(x, "s3control", js.undefined)
    
    inline def setS3outposts(value: typingsJapgolly.awsSdk.clientsS3outpostsMod.ClientConfiguration): Self = StObject.set(x, "s3outposts", value.asInstanceOf[js.Any])
    
    inline def setS3outpostsUndefined: Self = StObject.set(x, "s3outposts", js.undefined)
    
    inline def setSagemaker(value: typingsJapgolly.awsSdk.clientsSagemakerMod.ClientConfiguration): Self = StObject.set(x, "sagemaker", value.asInstanceOf[js.Any])
    
    inline def setSagemakerUndefined: Self = StObject.set(x, "sagemaker", js.undefined)
    
    inline def setSagemakeredge(value: typingsJapgolly.awsSdk.clientsSagemakeredgeMod.ClientConfiguration): Self = StObject.set(x, "sagemakeredge", value.asInstanceOf[js.Any])
    
    inline def setSagemakeredgeUndefined: Self = StObject.set(x, "sagemakeredge", js.undefined)
    
    inline def setSagemakerfeaturestoreruntime(value: typingsJapgolly.awsSdk.clientsSagemakerfeaturestoreruntimeMod.ClientConfiguration): Self = StObject.set(x, "sagemakerfeaturestoreruntime", value.asInstanceOf[js.Any])
    
    inline def setSagemakerfeaturestoreruntimeUndefined: Self = StObject.set(x, "sagemakerfeaturestoreruntime", js.undefined)
    
    inline def setSagemakerruntime(value: typingsJapgolly.awsSdk.clientsSagemakerruntimeMod.ClientConfiguration): Self = StObject.set(x, "sagemakerruntime", value.asInstanceOf[js.Any])
    
    inline def setSagemakerruntimeUndefined: Self = StObject.set(x, "sagemakerruntime", js.undefined)
    
    inline def setSavingsplans(value: typingsJapgolly.awsSdk.clientsSavingsplansMod.ClientConfiguration): Self = StObject.set(x, "savingsplans", value.asInstanceOf[js.Any])
    
    inline def setSavingsplansUndefined: Self = StObject.set(x, "savingsplans", js.undefined)
    
    inline def setSchemas(value: typingsJapgolly.awsSdk.clientsSchemasMod.ClientConfiguration): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
    
    inline def setSchemasUndefined: Self = StObject.set(x, "schemas", js.undefined)
    
    inline def setSecretAccessKey(value: String): Self = StObject.set(x, "secretAccessKey", value.asInstanceOf[js.Any])
    
    inline def setSecretAccessKeyUndefined: Self = StObject.set(x, "secretAccessKey", js.undefined)
    
    inline def setSecretsmanager(value: typingsJapgolly.awsSdk.clientsSecretsmanagerMod.ClientConfiguration): Self = StObject.set(x, "secretsmanager", value.asInstanceOf[js.Any])
    
    inline def setSecretsmanagerUndefined: Self = StObject.set(x, "secretsmanager", js.undefined)
    
    inline def setSecurityhub(value: typingsJapgolly.awsSdk.clientsSecurityhubMod.ClientConfiguration): Self = StObject.set(x, "securityhub", value.asInstanceOf[js.Any])
    
    inline def setSecurityhubUndefined: Self = StObject.set(x, "securityhub", js.undefined)
    
    inline def setServerlessapplicationrepository(value: typingsJapgolly.awsSdk.clientsServerlessapplicationrepositoryMod.ClientConfiguration): Self = StObject.set(x, "serverlessapplicationrepository", value.asInstanceOf[js.Any])
    
    inline def setServerlessapplicationrepositoryUndefined: Self = StObject.set(x, "serverlessapplicationrepository", js.undefined)
    
    inline def setServicecatalog(value: typingsJapgolly.awsSdk.clientsServicecatalogMod.ClientConfiguration): Self = StObject.set(x, "servicecatalog", value.asInstanceOf[js.Any])
    
    inline def setServicecatalogUndefined: Self = StObject.set(x, "servicecatalog", js.undefined)
    
    inline def setServicecatalogappregistry(value: typingsJapgolly.awsSdk.clientsServicecatalogappregistryMod.ClientConfiguration): Self = StObject.set(x, "servicecatalogappregistry", value.asInstanceOf[js.Any])
    
    inline def setServicecatalogappregistryUndefined: Self = StObject.set(x, "servicecatalogappregistry", js.undefined)
    
    inline def setServicediscovery(value: typingsJapgolly.awsSdk.clientsServicediscoveryMod.ClientConfiguration): Self = StObject.set(x, "servicediscovery", value.asInstanceOf[js.Any])
    
    inline def setServicediscoveryUndefined: Self = StObject.set(x, "servicediscovery", js.undefined)
    
    inline def setServicequotas(value: typingsJapgolly.awsSdk.clientsServicequotasMod.ClientConfiguration): Self = StObject.set(x, "servicequotas", value.asInstanceOf[js.Any])
    
    inline def setServicequotasUndefined: Self = StObject.set(x, "servicequotas", js.undefined)
    
    inline def setSes(value: typingsJapgolly.awsSdk.clientsSesMod.ClientConfiguration): Self = StObject.set(x, "ses", value.asInstanceOf[js.Any])
    
    inline def setSesUndefined: Self = StObject.set(x, "ses", js.undefined)
    
    inline def setSessionToken(value: String): Self = StObject.set(x, "sessionToken", value.asInstanceOf[js.Any])
    
    inline def setSessionTokenUndefined: Self = StObject.set(x, "sessionToken", js.undefined)
    
    inline def setSesv2(value: typingsJapgolly.awsSdk.clientsSesv2Mod.ClientConfiguration): Self = StObject.set(x, "sesv2", value.asInstanceOf[js.Any])
    
    inline def setSesv2Undefined: Self = StObject.set(x, "sesv2", js.undefined)
    
    inline def setShield(value: typingsJapgolly.awsSdk.clientsShieldMod.ClientConfiguration): Self = StObject.set(x, "shield", value.asInstanceOf[js.Any])
    
    inline def setShieldUndefined: Self = StObject.set(x, "shield", js.undefined)
    
    inline def setSignatureCache(value: Boolean): Self = StObject.set(x, "signatureCache", value.asInstanceOf[js.Any])
    
    inline def setSignatureCacheUndefined: Self = StObject.set(x, "signatureCache", js.undefined)
    
    inline def setSignatureVersion(value: v2_ | v3 | v4 | String): Self = StObject.set(x, "signatureVersion", value.asInstanceOf[js.Any])
    
    inline def setSignatureVersionUndefined: Self = StObject.set(x, "signatureVersion", js.undefined)
    
    inline def setSigner(value: typingsJapgolly.awsSdk.clientsSignerMod.ClientConfiguration): Self = StObject.set(x, "signer", value.asInstanceOf[js.Any])
    
    inline def setSignerUndefined: Self = StObject.set(x, "signer", js.undefined)
    
    inline def setSimpledb(value: typingsJapgolly.awsSdk.clientsSimpledbMod.ClientConfiguration): Self = StObject.set(x, "simpledb", value.asInstanceOf[js.Any])
    
    inline def setSimpledbUndefined: Self = StObject.set(x, "simpledb", js.undefined)
    
    inline def setSms(value: typingsJapgolly.awsSdk.clientsSmsMod.ClientConfiguration): Self = StObject.set(x, "sms", value.asInstanceOf[js.Any])
    
    inline def setSmsUndefined: Self = StObject.set(x, "sms", js.undefined)
    
    inline def setSnowball(value: typingsJapgolly.awsSdk.clientsSnowballMod.ClientConfiguration): Self = StObject.set(x, "snowball", value.asInstanceOf[js.Any])
    
    inline def setSnowballUndefined: Self = StObject.set(x, "snowball", js.undefined)
    
    inline def setSnowdevicemanagement(value: typingsJapgolly.awsSdk.clientsSnowdevicemanagementMod.ClientConfiguration): Self = StObject.set(x, "snowdevicemanagement", value.asInstanceOf[js.Any])
    
    inline def setSnowdevicemanagementUndefined: Self = StObject.set(x, "snowdevicemanagement", js.undefined)
    
    inline def setSns(value: typingsJapgolly.awsSdk.clientsSnsMod.ClientConfiguration): Self = StObject.set(x, "sns", value.asInstanceOf[js.Any])
    
    inline def setSnsUndefined: Self = StObject.set(x, "sns", js.undefined)
    
    inline def setSqs(value: typingsJapgolly.awsSdk.clientsSqsMod.ClientConfiguration): Self = StObject.set(x, "sqs", value.asInstanceOf[js.Any])
    
    inline def setSqsUndefined: Self = StObject.set(x, "sqs", js.undefined)
    
    inline def setSslEnabled(value: Boolean): Self = StObject.set(x, "sslEnabled", value.asInstanceOf[js.Any])
    
    inline def setSslEnabledUndefined: Self = StObject.set(x, "sslEnabled", js.undefined)
    
    inline def setSsm(value: typingsJapgolly.awsSdk.clientsSsmMod.ClientConfiguration): Self = StObject.set(x, "ssm", value.asInstanceOf[js.Any])
    
    inline def setSsmUndefined: Self = StObject.set(x, "ssm", js.undefined)
    
    inline def setSsmcontacts(value: typingsJapgolly.awsSdk.clientsSsmcontactsMod.ClientConfiguration): Self = StObject.set(x, "ssmcontacts", value.asInstanceOf[js.Any])
    
    inline def setSsmcontactsUndefined: Self = StObject.set(x, "ssmcontacts", js.undefined)
    
    inline def setSsmincidents(value: typingsJapgolly.awsSdk.clientsSsmincidentsMod.ClientConfiguration): Self = StObject.set(x, "ssmincidents", value.asInstanceOf[js.Any])
    
    inline def setSsmincidentsUndefined: Self = StObject.set(x, "ssmincidents", js.undefined)
    
    inline def setSso(value: typingsJapgolly.awsSdk.clientsSsoMod.ClientConfiguration): Self = StObject.set(x, "sso", value.asInstanceOf[js.Any])
    
    inline def setSsoUndefined: Self = StObject.set(x, "sso", js.undefined)
    
    inline def setSsoadmin(value: typingsJapgolly.awsSdk.clientsSsoadminMod.ClientConfiguration): Self = StObject.set(x, "ssoadmin", value.asInstanceOf[js.Any])
    
    inline def setSsoadminUndefined: Self = StObject.set(x, "ssoadmin", js.undefined)
    
    inline def setSsooidc(value: typingsJapgolly.awsSdk.clientsSsooidcMod.ClientConfiguration): Self = StObject.set(x, "ssooidc", value.asInstanceOf[js.Any])
    
    inline def setSsooidcUndefined: Self = StObject.set(x, "ssooidc", js.undefined)
    
    inline def setStepfunctions(value: typingsJapgolly.awsSdk.clientsStepfunctionsMod.ClientConfiguration): Self = StObject.set(x, "stepfunctions", value.asInstanceOf[js.Any])
    
    inline def setStepfunctionsUndefined: Self = StObject.set(x, "stepfunctions", js.undefined)
    
    inline def setStoragegateway(value: typingsJapgolly.awsSdk.clientsStoragegatewayMod.ClientConfiguration): Self = StObject.set(x, "storagegateway", value.asInstanceOf[js.Any])
    
    inline def setStoragegatewayUndefined: Self = StObject.set(x, "storagegateway", js.undefined)
    
    inline def setSts(value: typingsJapgolly.awsSdk.clientsStsMod.ClientConfiguration): Self = StObject.set(x, "sts", value.asInstanceOf[js.Any])
    
    inline def setStsRegionalEndpoints(value: legacy_ | regional_): Self = StObject.set(x, "stsRegionalEndpoints", value.asInstanceOf[js.Any])
    
    inline def setStsRegionalEndpointsUndefined: Self = StObject.set(x, "stsRegionalEndpoints", js.undefined)
    
    inline def setStsUndefined: Self = StObject.set(x, "sts", js.undefined)
    
    inline def setSupport(value: typingsJapgolly.awsSdk.clientsSupportMod.ClientConfiguration): Self = StObject.set(x, "support", value.asInstanceOf[js.Any])
    
    inline def setSupportUndefined: Self = StObject.set(x, "support", js.undefined)
    
    inline def setSupportapp(value: typingsJapgolly.awsSdk.clientsSupportappMod.ClientConfiguration): Self = StObject.set(x, "supportapp", value.asInstanceOf[js.Any])
    
    inline def setSupportappUndefined: Self = StObject.set(x, "supportapp", js.undefined)
    
    inline def setSwf(value: typingsJapgolly.awsSdk.clientsSwfMod.ClientConfiguration): Self = StObject.set(x, "swf", value.asInstanceOf[js.Any])
    
    inline def setSwfUndefined: Self = StObject.set(x, "swf", js.undefined)
    
    inline def setSynthetics(value: typingsJapgolly.awsSdk.clientsSyntheticsMod.ClientConfiguration): Self = StObject.set(x, "synthetics", value.asInstanceOf[js.Any])
    
    inline def setSyntheticsUndefined: Self = StObject.set(x, "synthetics", js.undefined)
    
    inline def setSystemClockOffset(value: Double): Self = StObject.set(x, "systemClockOffset", value.asInstanceOf[js.Any])
    
    inline def setSystemClockOffsetUndefined: Self = StObject.set(x, "systemClockOffset", js.undefined)
    
    inline def setTextract(value: typingsJapgolly.awsSdk.clientsTextractMod.ClientConfiguration): Self = StObject.set(x, "textract", value.asInstanceOf[js.Any])
    
    inline def setTextractUndefined: Self = StObject.set(x, "textract", js.undefined)
    
    inline def setTimestreamquery(value: typingsJapgolly.awsSdk.clientsTimestreamqueryMod.ClientConfiguration): Self = StObject.set(x, "timestreamquery", value.asInstanceOf[js.Any])
    
    inline def setTimestreamqueryUndefined: Self = StObject.set(x, "timestreamquery", js.undefined)
    
    inline def setTimestreamwrite(value: typingsJapgolly.awsSdk.clientsTimestreamwriteMod.ClientConfiguration): Self = StObject.set(x, "timestreamwrite", value.asInstanceOf[js.Any])
    
    inline def setTimestreamwriteUndefined: Self = StObject.set(x, "timestreamwrite", js.undefined)
    
    inline def setToken(value: Token): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenNull: Self = StObject.set(x, "token", null)
    
    inline def setTokenProvider(value: TokenProviderChain): Self = StObject.set(x, "tokenProvider", value.asInstanceOf[js.Any])
    
    inline def setTokenProviderUndefined: Self = StObject.set(x, "tokenProvider", js.undefined)
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    
    inline def setTranscribeservice(value: typingsJapgolly.awsSdk.clientsTranscribeserviceMod.ClientConfiguration): Self = StObject.set(x, "transcribeservice", value.asInstanceOf[js.Any])
    
    inline def setTranscribeserviceUndefined: Self = StObject.set(x, "transcribeservice", js.undefined)
    
    inline def setTransfer(value: typingsJapgolly.awsSdk.clientsTransferMod.ClientConfiguration): Self = StObject.set(x, "transfer", value.asInstanceOf[js.Any])
    
    inline def setTransferUndefined: Self = StObject.set(x, "transfer", js.undefined)
    
    inline def setTranslate(value: typingsJapgolly.awsSdk.clientsTranslateMod.ClientConfiguration): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
    
    inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
    
    inline def setUseAccelerateEndpoint(value: Boolean): Self = StObject.set(x, "useAccelerateEndpoint", value.asInstanceOf[js.Any])
    
    inline def setUseAccelerateEndpointUndefined: Self = StObject.set(x, "useAccelerateEndpoint", js.undefined)
    
    inline def setUseDualstackEndpoint(value: Boolean): Self = StObject.set(x, "useDualstackEndpoint", value.asInstanceOf[js.Any])
    
    inline def setUseDualstackEndpointUndefined: Self = StObject.set(x, "useDualstackEndpoint", js.undefined)
    
    inline def setUseFipsEndpoint(value: Boolean): Self = StObject.set(x, "useFipsEndpoint", value.asInstanceOf[js.Any])
    
    inline def setUseFipsEndpointUndefined: Self = StObject.set(x, "useFipsEndpoint", js.undefined)
    
    inline def setVoiceid(value: typingsJapgolly.awsSdk.clientsVoiceidMod.ClientConfiguration): Self = StObject.set(x, "voiceid", value.asInstanceOf[js.Any])
    
    inline def setVoiceidUndefined: Self = StObject.set(x, "voiceid", js.undefined)
    
    inline def setWaf(value: typingsJapgolly.awsSdk.clientsWafMod.ClientConfiguration): Self = StObject.set(x, "waf", value.asInstanceOf[js.Any])
    
    inline def setWafUndefined: Self = StObject.set(x, "waf", js.undefined)
    
    inline def setWafregional(value: typingsJapgolly.awsSdk.clientsWafregionalMod.ClientConfiguration): Self = StObject.set(x, "wafregional", value.asInstanceOf[js.Any])
    
    inline def setWafregionalUndefined: Self = StObject.set(x, "wafregional", js.undefined)
    
    inline def setWafv2(value: typingsJapgolly.awsSdk.clientsWafv2Mod.ClientConfiguration): Self = StObject.set(x, "wafv2", value.asInstanceOf[js.Any])
    
    inline def setWafv2Undefined: Self = StObject.set(x, "wafv2", js.undefined)
    
    inline def setWellarchitected(value: typingsJapgolly.awsSdk.clientsWellarchitectedMod.ClientConfiguration): Self = StObject.set(x, "wellarchitected", value.asInstanceOf[js.Any])
    
    inline def setWellarchitectedUndefined: Self = StObject.set(x, "wellarchitected", js.undefined)
    
    inline def setWisdom(value: typingsJapgolly.awsSdk.clientsWisdomMod.ClientConfiguration): Self = StObject.set(x, "wisdom", value.asInstanceOf[js.Any])
    
    inline def setWisdomUndefined: Self = StObject.set(x, "wisdom", js.undefined)
    
    inline def setWorkdocs(value: typingsJapgolly.awsSdk.clientsWorkdocsMod.ClientConfiguration): Self = StObject.set(x, "workdocs", value.asInstanceOf[js.Any])
    
    inline def setWorkdocsUndefined: Self = StObject.set(x, "workdocs", js.undefined)
    
    inline def setWorklink(value: typingsJapgolly.awsSdk.clientsWorklinkMod.ClientConfiguration): Self = StObject.set(x, "worklink", value.asInstanceOf[js.Any])
    
    inline def setWorklinkUndefined: Self = StObject.set(x, "worklink", js.undefined)
    
    inline def setWorkmail(value: typingsJapgolly.awsSdk.clientsWorkmailMod.ClientConfiguration): Self = StObject.set(x, "workmail", value.asInstanceOf[js.Any])
    
    inline def setWorkmailUndefined: Self = StObject.set(x, "workmail", js.undefined)
    
    inline def setWorkmailmessageflow(value: typingsJapgolly.awsSdk.clientsWorkmailmessageflowMod.ClientConfiguration): Self = StObject.set(x, "workmailmessageflow", value.asInstanceOf[js.Any])
    
    inline def setWorkmailmessageflowUndefined: Self = StObject.set(x, "workmailmessageflow", js.undefined)
    
    inline def setWorkspaces(value: typingsJapgolly.awsSdk.clientsWorkspacesMod.ClientConfiguration): Self = StObject.set(x, "workspaces", value.asInstanceOf[js.Any])
    
    inline def setWorkspacesUndefined: Self = StObject.set(x, "workspaces", js.undefined)
    
    inline def setWorkspacesweb(value: typingsJapgolly.awsSdk.clientsWorkspaceswebMod.ClientConfiguration): Self = StObject.set(x, "workspacesweb", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceswebUndefined: Self = StObject.set(x, "workspacesweb", js.undefined)
    
    inline def setXray(value: typingsJapgolly.awsSdk.clientsXrayMod.ClientConfiguration): Self = StObject.set(x, "xray", value.asInstanceOf[js.Any])
    
    inline def setXrayUndefined: Self = StObject.set(x, "xray", js.undefined)
  }
}
