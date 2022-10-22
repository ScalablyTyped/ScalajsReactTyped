package typingsJapgolly.awsSdk

import typingsJapgolly.awsSdk.anon.ConfigurationOptionsConfi
import typingsJapgolly.awsSdk.awsSdkBooleans.`true`
import typingsJapgolly.awsSdk.awsSdkStrings.latest_
import typingsJapgolly.awsSdk.clientsAccessanalyzerMod.ClientConfiguration
import typingsJapgolly.awsSdk.libConfigBaseMod.ConfigurationOptions
import typingsJapgolly.awsSdk.libConfigServicePlaceholdersMod.ConfigurationServiceApiVersions
import typingsJapgolly.awsSdk.libConfigServicePlaceholdersMod.ConfigurationServicePlaceholders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libConfigMod {
  
  @JSImport("aws-sdk/lib/config", "Config")
  @js.native
  /**
    * Creates a new configuration object.
    * This is the object that passes option data along to service requests, including credentials, security, region information, and some service specific settings.
    */
  open class Config ()
    extends typingsJapgolly.awsSdk.libConfigBaseMod.ConfigBase {
    def this(options: ConfigurationOptions & ConfigurationServicePlaceholders & APIVersions) = this()
    
    /**
      * Updates the current configuration object with new options.
      *
      * @param {ConfigurationOptions} options - a map of option keys and values.
      * @param {boolean} allowUnknownKeys - Whether unknown keys can be set on the configuration object.
      */
    @JSName("update")
    def update_true(options: ConfigurationOptionsConfi, allowUnknownKeys: `true`): Unit = js.native
  }
  
  @JSImport("aws-sdk/lib/config", "ConfigBase")
  @js.native
  open class ConfigBase ()
    extends typingsJapgolly.awsSdk.libConfigBaseMod.ConfigBase {
    def this(options: ConfigurationOptions) = this()
  }
  
  trait APIVersions extends StObject {
    
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in all services (unless overridden by apiVersions). Specify \'latest\' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[latest_ | String] = js.undefined
    
    /**
      * A map of service identifiers (the lowercase service class name) with the API version to use when instantiating a service. Specify 'latest' for each individual that can use the latest available version.
      */
    var apiVersions: js.UndefOr[ConfigurationServiceApiVersions] = js.undefined
  }
  object APIVersions {
    
    inline def apply(): APIVersions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[APIVersions]
    }
    
    extension [Self <: APIVersions](x: Self) {
      
      inline def setApiVersion(value: latest_ | String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      inline def setApiVersions(value: ConfigurationServiceApiVersions): Self = StObject.set(x, "apiVersions", value.asInstanceOf[js.Any])
      
      inline def setApiVersionsUndefined: Self = StObject.set(x, "apiVersions", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.awsSdk.libConfigServicePlaceholdersMod.ConfigurationServicePlaceholders because Inheritance from two classes. Inlined acm, apigateway, applicationautoscaling, appstream, autoscaling, batch, budgets, clouddirectory, cloudformation, cloudfront, cloudhsm, cloudsearch, cloudsearchdomain, cloudtrail, cloudwatch, cloudwatchevents, cloudwatchlogs, codebuild, codecommit, codedeploy, codepipeline, cognitoidentity, cognitoidentityserviceprovider, cognitosync, configservice, cur, datapipeline, devicefarm, directconnect, directoryservice, discovery, dms, dynamodb, dynamodbstreams, ec2, ecr, ecs, efs, elasticache, elasticbeanstalk, elb, elbv2, emr, es, elastictranscoder, firehose, gamelift, glacier, health, iam, importexport, inspector, iot, iotdata, kinesis, kinesisanalytics, kms, lambda, lexruntime, lightsail, machinelearning, marketplacecommerceanalytics, marketplacemetering, mturk, mobileanalytics, opsworks, opsworkscm, organizations, pinpoint, polly, rds, redshift, rekognition, resourcegroupstaggingapi, route53, route53domains, s3, s3control, servicecatalog, ses, shield, simpledb, sms, snowball, sns, sqs, ssm, storagegateway, stepfunctions, sts, support, swf, xray, waf, wafregional, workdocs, workspaces, codestar, lexmodelbuildingservice, marketplaceentitlementservice, athena, greengrass, dax, migrationhub, cloudhsmv2, glue, mobile, pricing, costexplorer, mediaconvert, medialive, mediapackage, mediastore, mediastoredata, appsync, guardduty, mq, comprehend, iotjobsdataplane, kinesisvideoarchivedmedia, kinesisvideomedia, kinesisvideo, sagemakerruntime, sagemaker, translate, resourcegroups, alexaforbusiness, cloud9, serverlessapplicationrepository, servicediscovery, workmail, autoscalingplans, transcribeservice, connect, acmpca, fms, secretsmanager, iotanalytics, iot1clickdevicesservice, iot1clickprojects, pi, neptune, mediatailor, eks, macie, dlm, signer, chime, pinpointemail, ram, route53resolver, pinpointsmsvoice, quicksight, rdsdataservice, amplify, datasync, robomaker, transfer, globalaccelerator, comprehendmedical, kinesisanalyticsv2, mediaconnect, fsx, securityhub, appmesh, licensemanager, kafka, apigatewaymanagementapi, apigatewayv2, docdb, backup, worklink, textract, managedblockchain, mediapackagevod, groundstation, iotthingsgraph, iotevents, ioteventsdata, personalize, personalizeevents, personalizeruntime, applicationinsights, servicequotas, ec2instanceconnect, eventbridge, lakeformation, forecastservice, forecastqueryservice, qldb, qldbsession, workmailmessageflow, codestarnotifications, savingsplans, sso, ssooidc, marketplacecatalog, dataexchange, sesv2, migrationhubconfig, connectparticipant, appconfig, iotsecuretunneling, wafv2, elasticinference, imagebuilder, schemas, accessanalyzer, codegurureviewer, codeguruprofiler, computeoptimizer, frauddetector, kendra, networkmanager, outposts, augmentedairuntime, ebs, kinesisvideosignalingchannels, detective, codestarconnections, synthetics, iotsitewise, macie2, codeartifact, honeycode, ivs, braket, identitystore, appflow, redshiftdata, ssoadmin, timestreamquery, timestreamwrite, s3outposts, databrew, servicecatalogappregistry, networkfirewall, mwaa, amplifybackend, appintegrations, connectcontactlens, devopsguru, ecrpublic, lookoutvision, sagemakerfeaturestoreruntime, customerprofiles, auditmanager, emrcontainers, healthlake, sagemakeredge, amp, greengrassv2, iotdeviceadvisor, iotfleethub, iotwireless, location, wellarchitected, lexmodelsv2, lexruntimev2, fis, lookoutmetrics, mgn, lookoutequipment, nimble, finspace, finspacedata, ssmcontacts, ssmincidents, applicationcostprofiler, apprunner, proton, route53recoverycluster, route53recoverycontrolconfig, route53recoveryreadiness, chimesdkidentity, chimesdkmessaging, snowdevicemanagement, memorydb, opensearch, kafkaconnect, voiceid, wisdom, account, cloudcontrol, grafana, panorama, chimesdkmeetings, resiliencehub, migrationhubstrategy, appconfigdata, drs, migrationhubrefactorspaces, evidently, inspector2, rbin, rum, backupgateway, iottwinmaker, workspacesweb, amplifyuibuilder, keyspaces, billingconductor, gamesparks, pinpointsmsvoicev2, ivschat, chimesdkmediapipelines, emrserverless, m2, connectcampaigns, redshiftserverless, rolesanywhere, licensemanagerusersubscriptions, backupstorage, privatenetworks, supportapp, controltower, iotfleetwise, migrationhuborchestrator, connectcases */ @js.native
  trait GlobalConfigInstance
    extends Config
       with APIVersions {
    
    var accessanalyzer: js.UndefOr[ClientConfiguration] = js.native
    
    var account: js.UndefOr[typingsJapgolly.awsSdk.clientsAccountMod.ClientConfiguration] = js.native
    
    var acm: js.UndefOr[typingsJapgolly.awsSdk.clientsAcmMod.ClientConfiguration] = js.native
    
    var acmpca: js.UndefOr[typingsJapgolly.awsSdk.clientsAcmpcaMod.ClientConfiguration] = js.native
    
    var alexaforbusiness: js.UndefOr[typingsJapgolly.awsSdk.clientsAlexaforbusinessMod.ClientConfiguration] = js.native
    
    var amp: js.UndefOr[typingsJapgolly.awsSdk.clientsAmpMod.ClientConfiguration] = js.native
    
    var amplify: js.UndefOr[typingsJapgolly.awsSdk.clientsAmplifyMod.ClientConfiguration] = js.native
    
    var amplifybackend: js.UndefOr[typingsJapgolly.awsSdk.clientsAmplifybackendMod.ClientConfiguration] = js.native
    
    var amplifyuibuilder: js.UndefOr[typingsJapgolly.awsSdk.clientsAmplifyuibuilderMod.ClientConfiguration] = js.native
    
    var apigateway: js.UndefOr[typingsJapgolly.awsSdk.clientsApigatewayMod.ClientConfiguration] = js.native
    
    var apigatewaymanagementapi: js.UndefOr[typingsJapgolly.awsSdk.clientsApigatewaymanagementapiMod.ClientConfiguration] = js.native
    
    var apigatewayv2: js.UndefOr[typingsJapgolly.awsSdk.clientsApigatewayv2Mod.ClientConfiguration] = js.native
    
    var appconfig: js.UndefOr[typingsJapgolly.awsSdk.clientsAppconfigMod.ClientConfiguration] = js.native
    
    var appconfigdata: js.UndefOr[typingsJapgolly.awsSdk.clientsAppconfigdataMod.ClientConfiguration] = js.native
    
    var appflow: js.UndefOr[typingsJapgolly.awsSdk.clientsAppflowMod.ClientConfiguration] = js.native
    
    var appintegrations: js.UndefOr[typingsJapgolly.awsSdk.clientsAppintegrationsMod.ClientConfiguration] = js.native
    
    var applicationautoscaling: js.UndefOr[typingsJapgolly.awsSdk.clientsApplicationautoscalingMod.ClientConfiguration] = js.native
    
    var applicationcostprofiler: js.UndefOr[typingsJapgolly.awsSdk.clientsApplicationcostprofilerMod.ClientConfiguration] = js.native
    
    var applicationinsights: js.UndefOr[typingsJapgolly.awsSdk.clientsApplicationinsightsMod.ClientConfiguration] = js.native
    
    var appmesh: js.UndefOr[typingsJapgolly.awsSdk.clientsAppmeshMod.ClientConfiguration] = js.native
    
    var apprunner: js.UndefOr[typingsJapgolly.awsSdk.clientsApprunnerMod.ClientConfiguration] = js.native
    
    var appstream: js.UndefOr[typingsJapgolly.awsSdk.clientsAppstreamMod.ClientConfiguration] = js.native
    
    var appsync: js.UndefOr[typingsJapgolly.awsSdk.clientsAppsyncMod.ClientConfiguration] = js.native
    
    var athena: js.UndefOr[typingsJapgolly.awsSdk.clientsAthenaMod.ClientConfiguration] = js.native
    
    var auditmanager: js.UndefOr[typingsJapgolly.awsSdk.clientsAuditmanagerMod.ClientConfiguration] = js.native
    
    var augmentedairuntime: js.UndefOr[typingsJapgolly.awsSdk.clientsAugmentedairuntimeMod.ClientConfiguration] = js.native
    
    var autoscaling: js.UndefOr[typingsJapgolly.awsSdk.clientsAutoscalingMod.ClientConfiguration] = js.native
    
    var autoscalingplans: js.UndefOr[typingsJapgolly.awsSdk.clientsAutoscalingplansMod.ClientConfiguration] = js.native
    
    var backup: js.UndefOr[typingsJapgolly.awsSdk.clientsBackupMod.ClientConfiguration] = js.native
    
    var backupgateway: js.UndefOr[typingsJapgolly.awsSdk.clientsBackupgatewayMod.ClientConfiguration] = js.native
    
    var backupstorage: js.UndefOr[typingsJapgolly.awsSdk.clientsBackupstorageMod.ClientConfiguration] = js.native
    
    var batch: js.UndefOr[typingsJapgolly.awsSdk.clientsBatchMod.ClientConfiguration] = js.native
    
    var billingconductor: js.UndefOr[typingsJapgolly.awsSdk.clientsBillingconductorMod.ClientConfiguration] = js.native
    
    var braket: js.UndefOr[typingsJapgolly.awsSdk.clientsBraketMod.ClientConfiguration] = js.native
    
    var budgets: js.UndefOr[typingsJapgolly.awsSdk.clientsBudgetsMod.ClientConfiguration] = js.native
    
    var chime: js.UndefOr[typingsJapgolly.awsSdk.clientsChimeMod.ClientConfiguration] = js.native
    
    var chimesdkidentity: js.UndefOr[typingsJapgolly.awsSdk.clientsChimesdkidentityMod.ClientConfiguration] = js.native
    
    var chimesdkmediapipelines: js.UndefOr[typingsJapgolly.awsSdk.clientsChimesdkmediapipelinesMod.ClientConfiguration] = js.native
    
    var chimesdkmeetings: js.UndefOr[typingsJapgolly.awsSdk.clientsChimesdkmeetingsMod.ClientConfiguration] = js.native
    
    var chimesdkmessaging: js.UndefOr[typingsJapgolly.awsSdk.clientsChimesdkmessagingMod.ClientConfiguration] = js.native
    
    var cloud9: js.UndefOr[typingsJapgolly.awsSdk.clientsCloud9Mod.ClientConfiguration] = js.native
    
    var cloudcontrol: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudcontrolMod.ClientConfiguration] = js.native
    
    var clouddirectory: js.UndefOr[typingsJapgolly.awsSdk.clientsClouddirectoryMod.ClientConfiguration] = js.native
    
    var cloudformation: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudformationMod.ClientConfiguration] = js.native
    
    var cloudfront: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudfrontMod.ClientConfiguration] = js.native
    
    var cloudhsm: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudhsmMod.ClientConfiguration] = js.native
    
    var cloudhsmv2: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudhsmv2Mod.ClientConfiguration] = js.native
    
    var cloudsearch: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudsearchMod.ClientConfiguration] = js.native
    
    var cloudsearchdomain: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudsearchdomainMod.ClientConfiguration] = js.native
    
    var cloudtrail: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudtrailMod.ClientConfiguration] = js.native
    
    var cloudwatch: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudwatchMod.ClientConfiguration] = js.native
    
    var cloudwatchevents: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudwatcheventsMod.ClientConfiguration] = js.native
    
    var cloudwatchlogs: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudwatchlogsMod.ClientConfiguration] = js.native
    
    var codeartifact: js.UndefOr[typingsJapgolly.awsSdk.clientsCodeartifactMod.ClientConfiguration] = js.native
    
    var codebuild: js.UndefOr[typingsJapgolly.awsSdk.clientsCodebuildMod.ClientConfiguration] = js.native
    
    var codecommit: js.UndefOr[typingsJapgolly.awsSdk.clientsCodecommitMod.ClientConfiguration] = js.native
    
    var codedeploy: js.UndefOr[typingsJapgolly.awsSdk.clientsCodedeployMod.ClientConfiguration] = js.native
    
    var codeguruprofiler: js.UndefOr[typingsJapgolly.awsSdk.clientsCodeguruprofilerMod.ClientConfiguration] = js.native
    
    var codegurureviewer: js.UndefOr[typingsJapgolly.awsSdk.clientsCodegurureviewerMod.ClientConfiguration] = js.native
    
    var codepipeline: js.UndefOr[typingsJapgolly.awsSdk.clientsCodepipelineMod.ClientConfiguration] = js.native
    
    var codestar: js.UndefOr[typingsJapgolly.awsSdk.clientsCodestarMod.ClientConfiguration] = js.native
    
    var codestarconnections: js.UndefOr[typingsJapgolly.awsSdk.clientsCodestarconnectionsMod.ClientConfiguration] = js.native
    
    var codestarnotifications: js.UndefOr[typingsJapgolly.awsSdk.clientsCodestarnotificationsMod.ClientConfiguration] = js.native
    
    var cognitoidentity: js.UndefOr[typingsJapgolly.awsSdk.clientsCognitoidentityMod.ClientConfiguration] = js.native
    
    var cognitoidentityserviceprovider: js.UndefOr[
        typingsJapgolly.awsSdk.clientsCognitoidentityserviceproviderMod.ClientConfiguration
      ] = js.native
    
    var cognitosync: js.UndefOr[typingsJapgolly.awsSdk.clientsCognitosyncMod.ClientConfiguration] = js.native
    
    var comprehend: js.UndefOr[typingsJapgolly.awsSdk.clientsComprehendMod.ClientConfiguration] = js.native
    
    var comprehendmedical: js.UndefOr[typingsJapgolly.awsSdk.clientsComprehendmedicalMod.ClientConfiguration] = js.native
    
    var computeoptimizer: js.UndefOr[typingsJapgolly.awsSdk.clientsComputeoptimizerMod.ClientConfiguration] = js.native
    
    var configservice: js.UndefOr[typingsJapgolly.awsSdk.clientsConfigserviceMod.ClientConfiguration] = js.native
    
    var connect: js.UndefOr[typingsJapgolly.awsSdk.clientsConnectMod.ClientConfiguration] = js.native
    
    var connectcampaigns: js.UndefOr[typingsJapgolly.awsSdk.clientsConnectcampaignsMod.ClientConfiguration] = js.native
    
    var connectcases: js.UndefOr[typingsJapgolly.awsSdk.clientsConnectcasesMod.ClientConfiguration] = js.native
    
    var connectcontactlens: js.UndefOr[typingsJapgolly.awsSdk.clientsConnectcontactlensMod.ClientConfiguration] = js.native
    
    var connectparticipant: js.UndefOr[typingsJapgolly.awsSdk.clientsConnectparticipantMod.ClientConfiguration] = js.native
    
    var controltower: js.UndefOr[typingsJapgolly.awsSdk.clientsControltowerMod.ClientConfiguration] = js.native
    
    var costexplorer: js.UndefOr[typingsJapgolly.awsSdk.clientsCostexplorerMod.ClientConfiguration] = js.native
    
    var cur: js.UndefOr[typingsJapgolly.awsSdk.clientsCurMod.ClientConfiguration] = js.native
    
    var customerprofiles: js.UndefOr[typingsJapgolly.awsSdk.clientsCustomerprofilesMod.ClientConfiguration] = js.native
    
    var databrew: js.UndefOr[typingsJapgolly.awsSdk.clientsDatabrewMod.ClientConfiguration] = js.native
    
    var dataexchange: js.UndefOr[typingsJapgolly.awsSdk.clientsDataexchangeMod.ClientConfiguration] = js.native
    
    var datapipeline: js.UndefOr[typingsJapgolly.awsSdk.clientsDatapipelineMod.ClientConfiguration] = js.native
    
    var datasync: js.UndefOr[typingsJapgolly.awsSdk.clientsDatasyncMod.ClientConfiguration] = js.native
    
    var dax: js.UndefOr[typingsJapgolly.awsSdk.clientsDaxMod.ClientConfiguration] = js.native
    
    var detective: js.UndefOr[typingsJapgolly.awsSdk.clientsDetectiveMod.ClientConfiguration] = js.native
    
    var devicefarm: js.UndefOr[typingsJapgolly.awsSdk.clientsDevicefarmMod.ClientConfiguration] = js.native
    
    var devopsguru: js.UndefOr[typingsJapgolly.awsSdk.clientsDevopsguruMod.ClientConfiguration] = js.native
    
    var directconnect: js.UndefOr[typingsJapgolly.awsSdk.clientsDirectconnectMod.ClientConfiguration] = js.native
    
    var directoryservice: js.UndefOr[typingsJapgolly.awsSdk.clientsDirectoryserviceMod.ClientConfiguration] = js.native
    
    var discovery: js.UndefOr[typingsJapgolly.awsSdk.clientsDiscoveryMod.ClientConfiguration] = js.native
    
    var dlm: js.UndefOr[typingsJapgolly.awsSdk.clientsDlmMod.ClientConfiguration] = js.native
    
    var dms: js.UndefOr[typingsJapgolly.awsSdk.clientsDmsMod.ClientConfiguration] = js.native
    
    var docdb: js.UndefOr[typingsJapgolly.awsSdk.clientsDocdbMod.ClientConfiguration] = js.native
    
    var drs: js.UndefOr[typingsJapgolly.awsSdk.clientsDrsMod.ClientConfiguration] = js.native
    
    var dynamodb: js.UndefOr[typingsJapgolly.awsSdk.clientsDynamodbMod.ClientConfiguration] = js.native
    
    var dynamodbstreams: js.UndefOr[typingsJapgolly.awsSdk.clientsDynamodbstreamsMod.ClientConfiguration] = js.native
    
    var ebs: js.UndefOr[typingsJapgolly.awsSdk.clientsEbsMod.ClientConfiguration] = js.native
    
    var ec2: js.UndefOr[typingsJapgolly.awsSdk.clientsEc2Mod.ClientConfiguration] = js.native
    
    var ec2instanceconnect: js.UndefOr[typingsJapgolly.awsSdk.clientsEc2instanceconnectMod.ClientConfiguration] = js.native
    
    var ecr: js.UndefOr[typingsJapgolly.awsSdk.clientsEcrMod.ClientConfiguration] = js.native
    
    var ecrpublic: js.UndefOr[typingsJapgolly.awsSdk.clientsEcrpublicMod.ClientConfiguration] = js.native
    
    var ecs: js.UndefOr[typingsJapgolly.awsSdk.clientsEcsMod.ClientConfiguration] = js.native
    
    var efs: js.UndefOr[typingsJapgolly.awsSdk.clientsEfsMod.ClientConfiguration] = js.native
    
    var eks: js.UndefOr[typingsJapgolly.awsSdk.clientsEksMod.ClientConfiguration] = js.native
    
    var elasticache: js.UndefOr[typingsJapgolly.awsSdk.clientsElasticacheMod.ClientConfiguration] = js.native
    
    var elasticbeanstalk: js.UndefOr[typingsJapgolly.awsSdk.clientsElasticbeanstalkMod.ClientConfiguration] = js.native
    
    var elasticinference: js.UndefOr[typingsJapgolly.awsSdk.clientsElasticinferenceMod.ClientConfiguration] = js.native
    
    var elastictranscoder: js.UndefOr[typingsJapgolly.awsSdk.clientsElastictranscoderMod.ClientConfiguration] = js.native
    
    var elb: js.UndefOr[typingsJapgolly.awsSdk.clientsElbMod.ClientConfiguration] = js.native
    
    var elbv2: js.UndefOr[typingsJapgolly.awsSdk.clientsElbv2Mod.ClientConfiguration] = js.native
    
    var emr: js.UndefOr[typingsJapgolly.awsSdk.clientsEmrMod.ClientConfiguration] = js.native
    
    var emrcontainers: js.UndefOr[typingsJapgolly.awsSdk.clientsEmrcontainersMod.ClientConfiguration] = js.native
    
    var emrserverless: js.UndefOr[typingsJapgolly.awsSdk.clientsEmrserverlessMod.ClientConfiguration] = js.native
    
    var es: js.UndefOr[typingsJapgolly.awsSdk.clientsEsMod.ClientConfiguration] = js.native
    
    var eventbridge: js.UndefOr[typingsJapgolly.awsSdk.clientsEventbridgeMod.ClientConfiguration] = js.native
    
    var evidently: js.UndefOr[typingsJapgolly.awsSdk.clientsEvidentlyMod.ClientConfiguration] = js.native
    
    var finspace: js.UndefOr[typingsJapgolly.awsSdk.clientsFinspaceMod.ClientConfiguration] = js.native
    
    var finspacedata: js.UndefOr[typingsJapgolly.awsSdk.clientsFinspacedataMod.ClientConfiguration] = js.native
    
    var firehose: js.UndefOr[typingsJapgolly.awsSdk.clientsFirehoseMod.ClientConfiguration] = js.native
    
    var fis: js.UndefOr[typingsJapgolly.awsSdk.clientsFisMod.ClientConfiguration] = js.native
    
    var fms: js.UndefOr[typingsJapgolly.awsSdk.clientsFmsMod.ClientConfiguration] = js.native
    
    var forecastqueryservice: js.UndefOr[typingsJapgolly.awsSdk.clientsForecastqueryserviceMod.ClientConfiguration] = js.native
    
    var forecastservice: js.UndefOr[typingsJapgolly.awsSdk.clientsForecastserviceMod.ClientConfiguration] = js.native
    
    var frauddetector: js.UndefOr[typingsJapgolly.awsSdk.clientsFrauddetectorMod.ClientConfiguration] = js.native
    
    var fsx: js.UndefOr[typingsJapgolly.awsSdk.clientsFsxMod.ClientConfiguration] = js.native
    
    var gamelift: js.UndefOr[typingsJapgolly.awsSdk.clientsGameliftMod.ClientConfiguration] = js.native
    
    var gamesparks: js.UndefOr[typingsJapgolly.awsSdk.clientsGamesparksMod.ClientConfiguration] = js.native
    
    var glacier: js.UndefOr[typingsJapgolly.awsSdk.clientsGlacierMod.ClientConfiguration] = js.native
    
    var globalaccelerator: js.UndefOr[typingsJapgolly.awsSdk.clientsGlobalacceleratorMod.ClientConfiguration] = js.native
    
    var glue: js.UndefOr[typingsJapgolly.awsSdk.clientsGlueMod.ClientConfiguration] = js.native
    
    var grafana: js.UndefOr[typingsJapgolly.awsSdk.clientsGrafanaMod.ClientConfiguration] = js.native
    
    var greengrass: js.UndefOr[typingsJapgolly.awsSdk.clientsGreengrassMod.ClientConfiguration] = js.native
    
    var greengrassv2: js.UndefOr[typingsJapgolly.awsSdk.clientsGreengrassv2Mod.ClientConfiguration] = js.native
    
    var groundstation: js.UndefOr[typingsJapgolly.awsSdk.clientsGroundstationMod.ClientConfiguration] = js.native
    
    var guardduty: js.UndefOr[typingsJapgolly.awsSdk.clientsGuarddutyMod.ClientConfiguration] = js.native
    
    var health: js.UndefOr[typingsJapgolly.awsSdk.clientsHealthMod.ClientConfiguration] = js.native
    
    var healthlake: js.UndefOr[typingsJapgolly.awsSdk.clientsHealthlakeMod.ClientConfiguration] = js.native
    
    var honeycode: js.UndefOr[typingsJapgolly.awsSdk.clientsHoneycodeMod.ClientConfiguration] = js.native
    
    var iam: js.UndefOr[typingsJapgolly.awsSdk.clientsIamMod.ClientConfiguration] = js.native
    
    var identitystore: js.UndefOr[typingsJapgolly.awsSdk.clientsIdentitystoreMod.ClientConfiguration] = js.native
    
    var imagebuilder: js.UndefOr[typingsJapgolly.awsSdk.clientsImagebuilderMod.ClientConfiguration] = js.native
    
    var importexport: js.UndefOr[typingsJapgolly.awsSdk.clientsImportexportMod.ClientConfiguration] = js.native
    
    var inspector: js.UndefOr[typingsJapgolly.awsSdk.clientsInspectorMod.ClientConfiguration] = js.native
    
    var inspector2: js.UndefOr[typingsJapgolly.awsSdk.clientsInspector2Mod.ClientConfiguration] = js.native
    
    var iot: js.UndefOr[typingsJapgolly.awsSdk.clientsIotMod.ClientConfiguration] = js.native
    
    var iot1clickdevicesservice: js.UndefOr[typingsJapgolly.awsSdk.clientsIot1clickdevicesserviceMod.ClientConfiguration] = js.native
    
    var iot1clickprojects: js.UndefOr[typingsJapgolly.awsSdk.clientsIot1clickprojectsMod.ClientConfiguration] = js.native
    
    var iotanalytics: js.UndefOr[typingsJapgolly.awsSdk.clientsIotanalyticsMod.ClientConfiguration] = js.native
    
    var iotdata: js.UndefOr[typingsJapgolly.awsSdk.clientsIotdataMod.ClientConfiguration] = js.native
    
    var iotdeviceadvisor: js.UndefOr[typingsJapgolly.awsSdk.clientsIotdeviceadvisorMod.ClientConfiguration] = js.native
    
    var iotevents: js.UndefOr[typingsJapgolly.awsSdk.clientsIoteventsMod.ClientConfiguration] = js.native
    
    var ioteventsdata: js.UndefOr[typingsJapgolly.awsSdk.clientsIoteventsdataMod.ClientConfiguration] = js.native
    
    var iotfleethub: js.UndefOr[typingsJapgolly.awsSdk.clientsIotfleethubMod.ClientConfiguration] = js.native
    
    var iotfleetwise: js.UndefOr[typingsJapgolly.awsSdk.clientsIotfleetwiseMod.ClientConfiguration] = js.native
    
    var iotjobsdataplane: js.UndefOr[typingsJapgolly.awsSdk.clientsIotjobsdataplaneMod.ClientConfiguration] = js.native
    
    var iotsecuretunneling: js.UndefOr[typingsJapgolly.awsSdk.clientsIotsecuretunnelingMod.ClientConfiguration] = js.native
    
    var iotsitewise: js.UndefOr[typingsJapgolly.awsSdk.clientsIotsitewiseMod.ClientConfiguration] = js.native
    
    var iotthingsgraph: js.UndefOr[typingsJapgolly.awsSdk.clientsIotthingsgraphMod.ClientConfiguration] = js.native
    
    var iottwinmaker: js.UndefOr[typingsJapgolly.awsSdk.clientsIottwinmakerMod.ClientConfiguration] = js.native
    
    var iotwireless: js.UndefOr[typingsJapgolly.awsSdk.clientsIotwirelessMod.ClientConfiguration] = js.native
    
    var ivs: js.UndefOr[typingsJapgolly.awsSdk.clientsIvsMod.ClientConfiguration] = js.native
    
    var ivschat: js.UndefOr[typingsJapgolly.awsSdk.clientsIvschatMod.ClientConfiguration] = js.native
    
    var kafka: js.UndefOr[typingsJapgolly.awsSdk.clientsKafkaMod.ClientConfiguration] = js.native
    
    var kafkaconnect: js.UndefOr[typingsJapgolly.awsSdk.clientsKafkaconnectMod.ClientConfiguration] = js.native
    
    var kendra: js.UndefOr[typingsJapgolly.awsSdk.clientsKendraMod.ClientConfiguration] = js.native
    
    var keyspaces: js.UndefOr[typingsJapgolly.awsSdk.clientsKeyspacesMod.ClientConfiguration] = js.native
    
    var kinesis: js.UndefOr[typingsJapgolly.awsSdk.clientsKinesisMod.ClientConfiguration] = js.native
    
    var kinesisanalytics: js.UndefOr[typingsJapgolly.awsSdk.clientsKinesisanalyticsMod.ClientConfiguration] = js.native
    
    var kinesisanalyticsv2: js.UndefOr[typingsJapgolly.awsSdk.clientsKinesisanalyticsv2Mod.ClientConfiguration] = js.native
    
    var kinesisvideo: js.UndefOr[typingsJapgolly.awsSdk.clientsKinesisvideoMod.ClientConfiguration] = js.native
    
    var kinesisvideoarchivedmedia: js.UndefOr[typingsJapgolly.awsSdk.clientsKinesisvideoarchivedmediaMod.ClientConfiguration] = js.native
    
    var kinesisvideomedia: js.UndefOr[typingsJapgolly.awsSdk.clientsKinesisvideomediaMod.ClientConfiguration] = js.native
    
    var kinesisvideosignalingchannels: js.UndefOr[
        typingsJapgolly.awsSdk.clientsKinesisvideosignalingchannelsMod.ClientConfiguration
      ] = js.native
    
    var kms: js.UndefOr[typingsJapgolly.awsSdk.clientsKmsMod.ClientConfiguration] = js.native
    
    var lakeformation: js.UndefOr[typingsJapgolly.awsSdk.clientsLakeformationMod.ClientConfiguration] = js.native
    
    var lambda: js.UndefOr[typingsJapgolly.awsSdk.clientsLambdaMod.ClientConfiguration] = js.native
    
    var lexmodelbuildingservice: js.UndefOr[typingsJapgolly.awsSdk.clientsLexmodelbuildingserviceMod.ClientConfiguration] = js.native
    
    var lexmodelsv2: js.UndefOr[typingsJapgolly.awsSdk.clientsLexmodelsv2Mod.ClientConfiguration] = js.native
    
    var lexruntime: js.UndefOr[typingsJapgolly.awsSdk.clientsLexruntimeMod.ClientConfiguration] = js.native
    
    var lexruntimev2: js.UndefOr[typingsJapgolly.awsSdk.clientsLexruntimev2Mod.ClientConfiguration] = js.native
    
    var licensemanager: js.UndefOr[typingsJapgolly.awsSdk.clientsLicensemanagerMod.ClientConfiguration] = js.native
    
    var licensemanagerusersubscriptions: js.UndefOr[
        typingsJapgolly.awsSdk.clientsLicensemanagerusersubscriptionsMod.ClientConfiguration
      ] = js.native
    
    var lightsail: js.UndefOr[typingsJapgolly.awsSdk.clientsLightsailMod.ClientConfiguration] = js.native
    
    var location: js.UndefOr[typingsJapgolly.awsSdk.clientsLocationMod.ClientConfiguration] = js.native
    
    var lookoutequipment: js.UndefOr[typingsJapgolly.awsSdk.clientsLookoutequipmentMod.ClientConfiguration] = js.native
    
    var lookoutmetrics: js.UndefOr[typingsJapgolly.awsSdk.clientsLookoutmetricsMod.ClientConfiguration] = js.native
    
    var lookoutvision: js.UndefOr[typingsJapgolly.awsSdk.clientsLookoutvisionMod.ClientConfiguration] = js.native
    
    var m2: js.UndefOr[typingsJapgolly.awsSdk.clientsM2Mod.ClientConfiguration] = js.native
    
    var machinelearning: js.UndefOr[typingsJapgolly.awsSdk.clientsMachinelearningMod.ClientConfiguration] = js.native
    
    var macie: js.UndefOr[typingsJapgolly.awsSdk.clientsMacieMod.ClientConfiguration] = js.native
    
    var macie2: js.UndefOr[typingsJapgolly.awsSdk.clientsMacie2Mod.ClientConfiguration] = js.native
    
    var managedblockchain: js.UndefOr[typingsJapgolly.awsSdk.clientsManagedblockchainMod.ClientConfiguration] = js.native
    
    var marketplacecatalog: js.UndefOr[typingsJapgolly.awsSdk.clientsMarketplacecatalogMod.ClientConfiguration] = js.native
    
    var marketplacecommerceanalytics: js.UndefOr[
        typingsJapgolly.awsSdk.clientsMarketplacecommerceanalyticsMod.ClientConfiguration
      ] = js.native
    
    var marketplaceentitlementservice: js.UndefOr[
        typingsJapgolly.awsSdk.clientsMarketplaceentitlementserviceMod.ClientConfiguration
      ] = js.native
    
    var marketplacemetering: js.UndefOr[typingsJapgolly.awsSdk.clientsMarketplacemeteringMod.ClientConfiguration] = js.native
    
    var mediaconnect: js.UndefOr[typingsJapgolly.awsSdk.clientsMediaconnectMod.ClientConfiguration] = js.native
    
    var mediaconvert: js.UndefOr[typingsJapgolly.awsSdk.clientsMediaconvertMod.ClientConfiguration] = js.native
    
    var medialive: js.UndefOr[typingsJapgolly.awsSdk.clientsMedialiveMod.ClientConfiguration] = js.native
    
    var mediapackage: js.UndefOr[typingsJapgolly.awsSdk.clientsMediapackageMod.ClientConfiguration] = js.native
    
    var mediapackagevod: js.UndefOr[typingsJapgolly.awsSdk.clientsMediapackagevodMod.ClientConfiguration] = js.native
    
    var mediastore: js.UndefOr[typingsJapgolly.awsSdk.clientsMediastoreMod.ClientConfiguration] = js.native
    
    var mediastoredata: js.UndefOr[typingsJapgolly.awsSdk.clientsMediastoredataMod.ClientConfiguration] = js.native
    
    var mediatailor: js.UndefOr[typingsJapgolly.awsSdk.clientsMediatailorMod.ClientConfiguration] = js.native
    
    var memorydb: js.UndefOr[typingsJapgolly.awsSdk.clientsMemorydbMod.ClientConfiguration] = js.native
    
    var mgn: js.UndefOr[typingsJapgolly.awsSdk.clientsMgnMod.ClientConfiguration] = js.native
    
    var migrationhub: js.UndefOr[typingsJapgolly.awsSdk.clientsMigrationhubMod.ClientConfiguration] = js.native
    
    var migrationhubconfig: js.UndefOr[typingsJapgolly.awsSdk.clientsMigrationhubconfigMod.ClientConfiguration] = js.native
    
    var migrationhuborchestrator: js.UndefOr[typingsJapgolly.awsSdk.clientsMigrationhuborchestratorMod.ClientConfiguration] = js.native
    
    var migrationhubrefactorspaces: js.UndefOr[typingsJapgolly.awsSdk.clientsMigrationhubrefactorspacesMod.ClientConfiguration] = js.native
    
    var migrationhubstrategy: js.UndefOr[typingsJapgolly.awsSdk.clientsMigrationhubstrategyMod.ClientConfiguration] = js.native
    
    var mobile: js.UndefOr[typingsJapgolly.awsSdk.clientsMobileMod.ClientConfiguration] = js.native
    
    var mobileanalytics: js.UndefOr[typingsJapgolly.awsSdk.clientsMobileanalyticsMod.ClientConfiguration] = js.native
    
    var mq: js.UndefOr[typingsJapgolly.awsSdk.clientsMqMod.ClientConfiguration] = js.native
    
    var mturk: js.UndefOr[typingsJapgolly.awsSdk.clientsMturkMod.ClientConfiguration] = js.native
    
    var mwaa: js.UndefOr[typingsJapgolly.awsSdk.clientsMwaaMod.ClientConfiguration] = js.native
    
    var neptune: js.UndefOr[typingsJapgolly.awsSdk.clientsNeptuneMod.ClientConfiguration] = js.native
    
    var networkfirewall: js.UndefOr[typingsJapgolly.awsSdk.clientsNetworkfirewallMod.ClientConfiguration] = js.native
    
    var networkmanager: js.UndefOr[typingsJapgolly.awsSdk.clientsNetworkmanagerMod.ClientConfiguration] = js.native
    
    var nimble: js.UndefOr[typingsJapgolly.awsSdk.clientsNimbleMod.ClientConfiguration] = js.native
    
    var opensearch: js.UndefOr[typingsJapgolly.awsSdk.clientsOpensearchMod.ClientConfiguration] = js.native
    
    var opsworks: js.UndefOr[typingsJapgolly.awsSdk.clientsOpsworksMod.ClientConfiguration] = js.native
    
    var opsworkscm: js.UndefOr[typingsJapgolly.awsSdk.clientsOpsworkscmMod.ClientConfiguration] = js.native
    
    var organizations: js.UndefOr[typingsJapgolly.awsSdk.clientsOrganizationsMod.ClientConfiguration] = js.native
    
    var outposts: js.UndefOr[typingsJapgolly.awsSdk.clientsOutpostsMod.ClientConfiguration] = js.native
    
    var panorama: js.UndefOr[typingsJapgolly.awsSdk.clientsPanoramaMod.ClientConfiguration] = js.native
    
    var personalize: js.UndefOr[typingsJapgolly.awsSdk.clientsPersonalizeMod.ClientConfiguration] = js.native
    
    var personalizeevents: js.UndefOr[typingsJapgolly.awsSdk.clientsPersonalizeeventsMod.ClientConfiguration] = js.native
    
    var personalizeruntime: js.UndefOr[typingsJapgolly.awsSdk.clientsPersonalizeruntimeMod.ClientConfiguration] = js.native
    
    var pi: js.UndefOr[typingsJapgolly.awsSdk.clientsPiMod.ClientConfiguration] = js.native
    
    var pinpoint: js.UndefOr[typingsJapgolly.awsSdk.clientsPinpointMod.ClientConfiguration] = js.native
    
    var pinpointemail: js.UndefOr[typingsJapgolly.awsSdk.clientsPinpointemailMod.ClientConfiguration] = js.native
    
    var pinpointsmsvoice: js.UndefOr[typingsJapgolly.awsSdk.clientsPinpointsmsvoiceMod.ClientConfiguration] = js.native
    
    var pinpointsmsvoicev2: js.UndefOr[typingsJapgolly.awsSdk.clientsPinpointsmsvoicev2Mod.ClientConfiguration] = js.native
    
    var polly: js.UndefOr[typingsJapgolly.awsSdk.clientsPollyMod.ClientConfiguration] = js.native
    
    var pricing: js.UndefOr[typingsJapgolly.awsSdk.clientsPricingMod.ClientConfiguration] = js.native
    
    var privatenetworks: js.UndefOr[typingsJapgolly.awsSdk.clientsPrivatenetworksMod.ClientConfiguration] = js.native
    
    var proton: js.UndefOr[typingsJapgolly.awsSdk.clientsProtonMod.ClientConfiguration] = js.native
    
    var qldb: js.UndefOr[typingsJapgolly.awsSdk.clientsQldbMod.ClientConfiguration] = js.native
    
    var qldbsession: js.UndefOr[typingsJapgolly.awsSdk.clientsQldbsessionMod.ClientConfiguration] = js.native
    
    var quicksight: js.UndefOr[typingsJapgolly.awsSdk.clientsQuicksightMod.ClientConfiguration] = js.native
    
    var ram: js.UndefOr[typingsJapgolly.awsSdk.clientsRamMod.ClientConfiguration] = js.native
    
    var rbin: js.UndefOr[typingsJapgolly.awsSdk.clientsRbinMod.ClientConfiguration] = js.native
    
    var rds: js.UndefOr[typingsJapgolly.awsSdk.clientsRdsMod.ClientConfiguration] = js.native
    
    var rdsdataservice: js.UndefOr[typingsJapgolly.awsSdk.clientsRdsdataserviceMod.ClientConfiguration] = js.native
    
    var redshift: js.UndefOr[typingsJapgolly.awsSdk.clientsRedshiftMod.ClientConfiguration] = js.native
    
    var redshiftdata: js.UndefOr[typingsJapgolly.awsSdk.clientsRedshiftdataMod.ClientConfiguration] = js.native
    
    var redshiftserverless: js.UndefOr[typingsJapgolly.awsSdk.clientsRedshiftserverlessMod.ClientConfiguration] = js.native
    
    var rekognition: js.UndefOr[typingsJapgolly.awsSdk.clientsRekognitionMod.ClientConfiguration] = js.native
    
    var resiliencehub: js.UndefOr[typingsJapgolly.awsSdk.clientsResiliencehubMod.ClientConfiguration] = js.native
    
    var resourcegroups: js.UndefOr[typingsJapgolly.awsSdk.clientsResourcegroupsMod.ClientConfiguration] = js.native
    
    var resourcegroupstaggingapi: js.UndefOr[typingsJapgolly.awsSdk.clientsResourcegroupstaggingapiMod.ClientConfiguration] = js.native
    
    var robomaker: js.UndefOr[typingsJapgolly.awsSdk.clientsRobomakerMod.ClientConfiguration] = js.native
    
    var rolesanywhere: js.UndefOr[typingsJapgolly.awsSdk.clientsRolesanywhereMod.ClientConfiguration] = js.native
    
    var route53: js.UndefOr[typingsJapgolly.awsSdk.clientsRoute53Mod.ClientConfiguration] = js.native
    
    var route53domains: js.UndefOr[typingsJapgolly.awsSdk.clientsRoute53domainsMod.ClientConfiguration] = js.native
    
    var route53recoverycluster: js.UndefOr[typingsJapgolly.awsSdk.clientsRoute53recoveryclusterMod.ClientConfiguration] = js.native
    
    var route53recoverycontrolconfig: js.UndefOr[
        typingsJapgolly.awsSdk.clientsRoute53recoverycontrolconfigMod.ClientConfiguration
      ] = js.native
    
    var route53recoveryreadiness: js.UndefOr[typingsJapgolly.awsSdk.clientsRoute53recoveryreadinessMod.ClientConfiguration] = js.native
    
    var route53resolver: js.UndefOr[typingsJapgolly.awsSdk.clientsRoute53resolverMod.ClientConfiguration] = js.native
    
    var rum: js.UndefOr[typingsJapgolly.awsSdk.clientsRumMod.ClientConfiguration] = js.native
    
    var s3: js.UndefOr[typingsJapgolly.awsSdk.clientsS3Mod.ClientConfiguration] = js.native
    
    var s3control: js.UndefOr[typingsJapgolly.awsSdk.clientsS3controlMod.ClientConfiguration] = js.native
    
    var s3outposts: js.UndefOr[typingsJapgolly.awsSdk.clientsS3outpostsMod.ClientConfiguration] = js.native
    
    var sagemaker: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.ClientConfiguration] = js.native
    
    var sagemakeredge: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakeredgeMod.ClientConfiguration] = js.native
    
    var sagemakerfeaturestoreruntime: js.UndefOr[
        typingsJapgolly.awsSdk.clientsSagemakerfeaturestoreruntimeMod.ClientConfiguration
      ] = js.native
    
    var sagemakerruntime: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerruntimeMod.ClientConfiguration] = js.native
    
    var savingsplans: js.UndefOr[typingsJapgolly.awsSdk.clientsSavingsplansMod.ClientConfiguration] = js.native
    
    var schemas: js.UndefOr[typingsJapgolly.awsSdk.clientsSchemasMod.ClientConfiguration] = js.native
    
    var secretsmanager: js.UndefOr[typingsJapgolly.awsSdk.clientsSecretsmanagerMod.ClientConfiguration] = js.native
    
    var securityhub: js.UndefOr[typingsJapgolly.awsSdk.clientsSecurityhubMod.ClientConfiguration] = js.native
    
    var serverlessapplicationrepository: js.UndefOr[
        typingsJapgolly.awsSdk.clientsServerlessapplicationrepositoryMod.ClientConfiguration
      ] = js.native
    
    var servicecatalog: js.UndefOr[typingsJapgolly.awsSdk.clientsServicecatalogMod.ClientConfiguration] = js.native
    
    var servicecatalogappregistry: js.UndefOr[typingsJapgolly.awsSdk.clientsServicecatalogappregistryMod.ClientConfiguration] = js.native
    
    var servicediscovery: js.UndefOr[typingsJapgolly.awsSdk.clientsServicediscoveryMod.ClientConfiguration] = js.native
    
    var servicequotas: js.UndefOr[typingsJapgolly.awsSdk.clientsServicequotasMod.ClientConfiguration] = js.native
    
    var ses: js.UndefOr[typingsJapgolly.awsSdk.clientsSesMod.ClientConfiguration] = js.native
    
    var sesv2: js.UndefOr[typingsJapgolly.awsSdk.clientsSesv2Mod.ClientConfiguration] = js.native
    
    var shield: js.UndefOr[typingsJapgolly.awsSdk.clientsShieldMod.ClientConfiguration] = js.native
    
    var signer: js.UndefOr[typingsJapgolly.awsSdk.clientsSignerMod.ClientConfiguration] = js.native
    
    var simpledb: js.UndefOr[typingsJapgolly.awsSdk.clientsSimpledbMod.ClientConfiguration] = js.native
    
    var sms: js.UndefOr[typingsJapgolly.awsSdk.clientsSmsMod.ClientConfiguration] = js.native
    
    var snowball: js.UndefOr[typingsJapgolly.awsSdk.clientsSnowballMod.ClientConfiguration] = js.native
    
    var snowdevicemanagement: js.UndefOr[typingsJapgolly.awsSdk.clientsSnowdevicemanagementMod.ClientConfiguration] = js.native
    
    var sns: js.UndefOr[typingsJapgolly.awsSdk.clientsSnsMod.ClientConfiguration] = js.native
    
    var sqs: js.UndefOr[typingsJapgolly.awsSdk.clientsSqsMod.ClientConfiguration] = js.native
    
    var ssm: js.UndefOr[typingsJapgolly.awsSdk.clientsSsmMod.ClientConfiguration] = js.native
    
    var ssmcontacts: js.UndefOr[typingsJapgolly.awsSdk.clientsSsmcontactsMod.ClientConfiguration] = js.native
    
    var ssmincidents: js.UndefOr[typingsJapgolly.awsSdk.clientsSsmincidentsMod.ClientConfiguration] = js.native
    
    var sso: js.UndefOr[typingsJapgolly.awsSdk.clientsSsoMod.ClientConfiguration] = js.native
    
    var ssoadmin: js.UndefOr[typingsJapgolly.awsSdk.clientsSsoadminMod.ClientConfiguration] = js.native
    
    var ssooidc: js.UndefOr[typingsJapgolly.awsSdk.clientsSsooidcMod.ClientConfiguration] = js.native
    
    var stepfunctions: js.UndefOr[typingsJapgolly.awsSdk.clientsStepfunctionsMod.ClientConfiguration] = js.native
    
    var storagegateway: js.UndefOr[typingsJapgolly.awsSdk.clientsStoragegatewayMod.ClientConfiguration] = js.native
    
    var sts: js.UndefOr[typingsJapgolly.awsSdk.clientsStsMod.ClientConfiguration] = js.native
    
    var support: js.UndefOr[typingsJapgolly.awsSdk.clientsSupportMod.ClientConfiguration] = js.native
    
    var supportapp: js.UndefOr[typingsJapgolly.awsSdk.clientsSupportappMod.ClientConfiguration] = js.native
    
    var swf: js.UndefOr[typingsJapgolly.awsSdk.clientsSwfMod.ClientConfiguration] = js.native
    
    var synthetics: js.UndefOr[typingsJapgolly.awsSdk.clientsSyntheticsMod.ClientConfiguration] = js.native
    
    var textract: js.UndefOr[typingsJapgolly.awsSdk.clientsTextractMod.ClientConfiguration] = js.native
    
    var timestreamquery: js.UndefOr[typingsJapgolly.awsSdk.clientsTimestreamqueryMod.ClientConfiguration] = js.native
    
    var timestreamwrite: js.UndefOr[typingsJapgolly.awsSdk.clientsTimestreamwriteMod.ClientConfiguration] = js.native
    
    var transcribeservice: js.UndefOr[typingsJapgolly.awsSdk.clientsTranscribeserviceMod.ClientConfiguration] = js.native
    
    var transfer: js.UndefOr[typingsJapgolly.awsSdk.clientsTransferMod.ClientConfiguration] = js.native
    
    var translate: js.UndefOr[typingsJapgolly.awsSdk.clientsTranslateMod.ClientConfiguration] = js.native
    
    var voiceid: js.UndefOr[typingsJapgolly.awsSdk.clientsVoiceidMod.ClientConfiguration] = js.native
    
    var waf: js.UndefOr[typingsJapgolly.awsSdk.clientsWafMod.ClientConfiguration] = js.native
    
    var wafregional: js.UndefOr[typingsJapgolly.awsSdk.clientsWafregionalMod.ClientConfiguration] = js.native
    
    var wafv2: js.UndefOr[typingsJapgolly.awsSdk.clientsWafv2Mod.ClientConfiguration] = js.native
    
    var wellarchitected: js.UndefOr[typingsJapgolly.awsSdk.clientsWellarchitectedMod.ClientConfiguration] = js.native
    
    var wisdom: js.UndefOr[typingsJapgolly.awsSdk.clientsWisdomMod.ClientConfiguration] = js.native
    
    var workdocs: js.UndefOr[typingsJapgolly.awsSdk.clientsWorkdocsMod.ClientConfiguration] = js.native
    
    var worklink: js.UndefOr[typingsJapgolly.awsSdk.clientsWorklinkMod.ClientConfiguration] = js.native
    
    var workmail: js.UndefOr[typingsJapgolly.awsSdk.clientsWorkmailMod.ClientConfiguration] = js.native
    
    var workmailmessageflow: js.UndefOr[typingsJapgolly.awsSdk.clientsWorkmailmessageflowMod.ClientConfiguration] = js.native
    
    var workspaces: js.UndefOr[typingsJapgolly.awsSdk.clientsWorkspacesMod.ClientConfiguration] = js.native
    
    var workspacesweb: js.UndefOr[typingsJapgolly.awsSdk.clientsWorkspaceswebMod.ClientConfiguration] = js.native
    
    var xray: js.UndefOr[typingsJapgolly.awsSdk.clientsXrayMod.ClientConfiguration] = js.native
  }
}
