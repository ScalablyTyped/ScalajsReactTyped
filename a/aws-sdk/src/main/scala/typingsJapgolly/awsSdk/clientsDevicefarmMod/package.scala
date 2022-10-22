package typingsJapgolly.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.awsSdkStrings.MONTHLY
import typingsJapgolly.awsSdk.awsSdkStrings.RECURRING
import typingsJapgolly.awsSdk.awsSdkStrings.USD
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AWSAccountNumber = java.lang.String

type AccountsCleanup = scala.Boolean

type AmazonResourceName = java.lang.String

type AmazonResourceNames = js.Array[AmazonResourceName]

type AndroidPaths = js.Array[String]

type AppPackagesCleanup = scala.Boolean

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SCREENSHOT
  - typingsJapgolly.awsSdk.awsSdkStrings.FILE
  - typingsJapgolly.awsSdk.awsSdkStrings.LOG
  - java.lang.String
*/
type ArtifactCategory = _ArtifactCategory | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.UNKNOWN
  - typingsJapgolly.awsSdk.awsSdkStrings.SCREENSHOT
  - typingsJapgolly.awsSdk.awsSdkStrings.DEVICE_LOG
  - typingsJapgolly.awsSdk.awsSdkStrings.MESSAGE_LOG
  - typingsJapgolly.awsSdk.awsSdkStrings.VIDEO_LOG
  - typingsJapgolly.awsSdk.awsSdkStrings.RESULT_LOG
  - typingsJapgolly.awsSdk.awsSdkStrings.SERVICE_LOG
  - typingsJapgolly.awsSdk.awsSdkStrings.WEBKIT_LOG
  - typingsJapgolly.awsSdk.awsSdkStrings.INSTRUMENTATION_OUTPUT
  - typingsJapgolly.awsSdk.awsSdkStrings.EXERCISER_MONKEY_OUTPUT
  - typingsJapgolly.awsSdk.awsSdkStrings.CALABASH_JSON_OUTPUT
  - typingsJapgolly.awsSdk.awsSdkStrings.CALABASH_PRETTY_OUTPUT
  - typingsJapgolly.awsSdk.awsSdkStrings.CALABASH_STANDARD_OUTPUT
  - typingsJapgolly.awsSdk.awsSdkStrings.CALABASH_JAVA_XML_OUTPUT
  - typingsJapgolly.awsSdk.awsSdkStrings.AUTOMATION_OUTPUT
  - typingsJapgolly.awsSdk.awsSdkStrings.APPIUM_SERVER_OUTPUT
  - typingsJapgolly.awsSdk.awsSdkStrings.APPIUM_JAVA_OUTPUT
  - typingsJapgolly.awsSdk.awsSdkStrings.APPIUM_JAVA_XML_OUTPUT
  - typingsJapgolly.awsSdk.awsSdkStrings.APPIUM_PYTHON_OUTPUT
  - typingsJapgolly.awsSdk.awsSdkStrings.APPIUM_PYTHON_XML_OUTPUT
  - typingsJapgolly.awsSdk.awsSdkStrings.EXPLORER_EVENT_LOG
  - typingsJapgolly.awsSdk.awsSdkStrings.EXPLORER_SUMMARY_LOG
  - typingsJapgolly.awsSdk.awsSdkStrings.APPLICATION_CRASH_REPORT
  - typingsJapgolly.awsSdk.awsSdkStrings.XCTEST_LOG
  - typingsJapgolly.awsSdk.awsSdkStrings.VIDEO
  - typingsJapgolly.awsSdk.awsSdkStrings.CUSTOMER_ARTIFACT
  - typingsJapgolly.awsSdk.awsSdkStrings.CUSTOMER_ARTIFACT_LOG
  - typingsJapgolly.awsSdk.awsSdkStrings.TESTSPEC_OUTPUT
  - java.lang.String
*/
type ArtifactType = _ArtifactType | java.lang.String

type Artifacts = js.Array[Artifact]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.METERED
  - typingsJapgolly.awsSdk.awsSdkStrings.UNMETERED
  - java.lang.String
*/
type BillingMethod = _BillingMethod | java.lang.String

type Boolean = scala.Boolean

type ClientId = java.lang.String

type ContentType = java.lang.String

type CurrencyCode = USD | java.lang.String

type DateTime = js.Date

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ARN
  - typingsJapgolly.awsSdk.awsSdkStrings.PLATFORM
  - typingsJapgolly.awsSdk.awsSdkStrings.FORM_FACTOR
  - typingsJapgolly.awsSdk.awsSdkStrings.MANUFACTURER
  - typingsJapgolly.awsSdk.awsSdkStrings.REMOTE_ACCESS_ENABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.REMOTE_DEBUG_ENABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.APPIUM_VERSION
  - typingsJapgolly.awsSdk.awsSdkStrings.INSTANCE_ARN
  - typingsJapgolly.awsSdk.awsSdkStrings.INSTANCE_LABELS
  - typingsJapgolly.awsSdk.awsSdkStrings.FLEET_TYPE
  - typingsJapgolly.awsSdk.awsSdkStrings.OS_VERSION
  - typingsJapgolly.awsSdk.awsSdkStrings.MODEL
  - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABILITY
  - java.lang.String
*/
type DeviceAttribute = _DeviceAttribute | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.TEMPORARY_NOT_AVAILABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.BUSY
  - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.HIGHLY_AVAILABLE
  - java.lang.String
*/
type DeviceAvailability = _DeviceAvailability | java.lang.String

type DeviceFarmArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ARN
  - typingsJapgolly.awsSdk.awsSdkStrings.PLATFORM
  - typingsJapgolly.awsSdk.awsSdkStrings.OS_VERSION
  - typingsJapgolly.awsSdk.awsSdkStrings.MODEL
  - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABILITY
  - typingsJapgolly.awsSdk.awsSdkStrings.FORM_FACTOR
  - typingsJapgolly.awsSdk.awsSdkStrings.MANUFACTURER
  - typingsJapgolly.awsSdk.awsSdkStrings.REMOTE_ACCESS_ENABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.REMOTE_DEBUG_ENABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.INSTANCE_ARN
  - typingsJapgolly.awsSdk.awsSdkStrings.INSTANCE_LABELS
  - typingsJapgolly.awsSdk.awsSdkStrings.FLEET_TYPE
  - java.lang.String
*/
type DeviceFilterAttribute = _DeviceFilterAttribute | java.lang.String

type DeviceFilterValues = js.Array[String]

type DeviceFilters = js.Array[DeviceFilter]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PHONE
  - typingsJapgolly.awsSdk.awsSdkStrings.TABLET
  - java.lang.String
*/
type DeviceFormFactor = _DeviceFormFactor | java.lang.String

type DeviceHostPaths = js.Array[String]

type DeviceInstances = js.Array[DeviceInstance]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ANDROID
  - typingsJapgolly.awsSdk.awsSdkStrings.IOS
  - java.lang.String
*/
type DevicePlatform = _DevicePlatform | java.lang.String

type DevicePoolCompatibilityResults = js.Array[DevicePoolCompatibilityResult]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CURATED
  - typingsJapgolly.awsSdk.awsSdkStrings.PRIVATE
  - java.lang.String
*/
type DevicePoolType = _DevicePoolType | java.lang.String

type DevicePools = js.Array[DevicePool]

type Devices = js.Array[Device]

type Double = scala.Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.PASSED
  - typingsJapgolly.awsSdk.awsSdkStrings.WARNED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.SKIPPED
  - typingsJapgolly.awsSdk.awsSdkStrings.ERRORED
  - typingsJapgolly.awsSdk.awsSdkStrings.STOPPED
  - java.lang.String
*/
type ExecutionResult = _ExecutionResult | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PARSING_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.VPC_ENDPOINT_SETUP_FAILED
  - java.lang.String
*/
type ExecutionResultCode = _ExecutionResultCode | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING_CONCURRENCY
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING_DEVICE
  - typingsJapgolly.awsSdk.awsSdkStrings.PROCESSING
  - typingsJapgolly.awsSdk.awsSdkStrings.SCHEDULING
  - typingsJapgolly.awsSdk.awsSdkStrings.PREPARING
  - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
  - typingsJapgolly.awsSdk.awsSdkStrings.STOPPING
  - java.lang.String
*/
type ExecutionStatus = _ExecutionStatus | java.lang.String

type Filter = java.lang.String

type HostAddress = java.lang.String

type IncompatibilityMessages = js.Array[IncompatibilityMessage]

type InstanceLabels = js.Array[String]

type InstanceProfiles = js.Array[InstanceProfile]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_USE
  - typingsJapgolly.awsSdk.awsSdkStrings.PREPARING
  - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.NOT_AVAILABLE
  - java.lang.String
*/
type InstanceStatus = _InstanceStatus | java.lang.String

type Integer = scala.Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.INTERACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.NO_VIDEO
  - typingsJapgolly.awsSdk.awsSdkStrings.VIDEO_ONLY
  - java.lang.String
*/
type InteractionMode = _InteractionMode | java.lang.String

type IosPaths = js.Array[String]

type JobTimeoutMinutes = scala.Double

type Jobs = js.Array[Job]

type Long = scala.Double

type MaxPageSize = scala.Double

type MaxSlotMap = StringDictionary[Integer]

type Message = java.lang.String

type Metadata = java.lang.String

type Name = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CURATED
  - typingsJapgolly.awsSdk.awsSdkStrings.PRIVATE
  - java.lang.String
*/
type NetworkProfileType = _NetworkProfileType | java.lang.String

type NetworkProfiles = js.Array[NetworkProfile]

type NonEmptyString = java.lang.String

type OfferingIdentifier = java.lang.String

type OfferingPromotionIdentifier = java.lang.String

type OfferingPromotions = js.Array[OfferingPromotion]

type OfferingStatusMap = StringDictionary[OfferingStatus]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PURCHASE
  - typingsJapgolly.awsSdk.awsSdkStrings.RENEW
  - typingsJapgolly.awsSdk.awsSdkStrings.SYSTEM
  - java.lang.String
*/
type OfferingTransactionType = _OfferingTransactionType | java.lang.String

type OfferingTransactions = js.Array[OfferingTransaction]

type OfferingType = RECURRING | java.lang.String

type Offerings = js.Array[Offering]

type PackageIds = js.Array[String]

type PaginationToken = java.lang.String

type PercentInteger = scala.Double

type Problems = js.Array[Problem]

type Projects = js.Array[Project]

type PurchasedDevicesMap = StringDictionary[Integer]

type RecurringChargeFrequency = MONTHLY | java.lang.String

type RecurringCharges = js.Array[RecurringCharge]

type RemoteAccessSessions = js.Array[RemoteAccessSession]

type ResourceDescription = java.lang.String

type ResourceId = java.lang.String

type ResourceName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.EQUALS
  - typingsJapgolly.awsSdk.awsSdkStrings.LESS_THAN
  - typingsJapgolly.awsSdk.awsSdkStrings.LESS_THAN_OR_EQUALS
  - typingsJapgolly.awsSdk.awsSdkStrings.GREATER_THAN
  - typingsJapgolly.awsSdk.awsSdkStrings.GREATER_THAN_OR_EQUALS
  - typingsJapgolly.awsSdk.awsSdkStrings.IN
  - typingsJapgolly.awsSdk.awsSdkStrings.NOT_IN
  - typingsJapgolly.awsSdk.awsSdkStrings.CONTAINS
  - java.lang.String
*/
type RuleOperator = _RuleOperator | java.lang.String

type Rules = js.Array[Rule]

type Runs = js.Array[Run]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CPU
  - typingsJapgolly.awsSdk.awsSdkStrings.MEMORY
  - typingsJapgolly.awsSdk.awsSdkStrings.THREADS
  - typingsJapgolly.awsSdk.awsSdkStrings.RX_RATE
  - typingsJapgolly.awsSdk.awsSdkStrings.TX_RATE
  - typingsJapgolly.awsSdk.awsSdkStrings.RX
  - typingsJapgolly.awsSdk.awsSdkStrings.TX
  - typingsJapgolly.awsSdk.awsSdkStrings.NATIVE_FRAMES
  - typingsJapgolly.awsSdk.awsSdkStrings.NATIVE_FPS
  - typingsJapgolly.awsSdk.awsSdkStrings.NATIVE_MIN_DRAWTIME
  - typingsJapgolly.awsSdk.awsSdkStrings.NATIVE_AVG_DRAWTIME
  - typingsJapgolly.awsSdk.awsSdkStrings.NATIVE_MAX_DRAWTIME
  - typingsJapgolly.awsSdk.awsSdkStrings.OPENGL_FRAMES
  - typingsJapgolly.awsSdk.awsSdkStrings.OPENGL_FPS
  - typingsJapgolly.awsSdk.awsSdkStrings.OPENGL_MIN_DRAWTIME
  - typingsJapgolly.awsSdk.awsSdkStrings.OPENGL_AVG_DRAWTIME
  - typingsJapgolly.awsSdk.awsSdkStrings.OPENGL_MAX_DRAWTIME
  - java.lang.String
*/
type SampleType = _SampleType | java.lang.String

type Samples = js.Array[Sample]

type SecurityGroupId = java.lang.String

type SecurityGroupIds = js.Array[NonEmptyString]

type SensitiveString = java.lang.String

type SensitiveURL = java.lang.String

type ServiceDnsName = java.lang.String

type SkipAppResign = scala.Boolean

type SshPublicKey = java.lang.String

type String = java.lang.String

type SubnetId = java.lang.String

type SubnetIds = js.Array[NonEmptyString]

type Suites = js.Array[Suite]

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = java.lang.String

type TestGridProjects = js.Array[TestGridProject]

type TestGridSessionActions = js.Array[TestGridSessionAction]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.VIDEO
  - typingsJapgolly.awsSdk.awsSdkStrings.LOG
  - java.lang.String
*/
type TestGridSessionArtifactCategory = _TestGridSessionArtifactCategory | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.UNKNOWN
  - typingsJapgolly.awsSdk.awsSdkStrings.VIDEO
  - typingsJapgolly.awsSdk.awsSdkStrings.SELENIUM_LOG
  - java.lang.String
*/
type TestGridSessionArtifactType = _TestGridSessionArtifactType | java.lang.String

type TestGridSessionArtifacts = js.Array[TestGridSessionArtifact]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.CLOSED
  - typingsJapgolly.awsSdk.awsSdkStrings.ERRORED
  - java.lang.String
*/
type TestGridSessionStatus = _TestGridSessionStatus | java.lang.String

type TestGridSessions = js.Array[TestGridSession]

type TestGridUrlExpiresInSecondsInput = scala.Double

type TestParameters = StringDictionary[String]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.BUILTIN_FUZZ
  - typingsJapgolly.awsSdk.awsSdkStrings.BUILTIN_EXPLORER
  - typingsJapgolly.awsSdk.awsSdkStrings.WEB_PERFORMANCE_PROFILE
  - typingsJapgolly.awsSdk.awsSdkStrings.APPIUM_JAVA_JUNIT
  - typingsJapgolly.awsSdk.awsSdkStrings.APPIUM_JAVA_TESTNG
  - typingsJapgolly.awsSdk.awsSdkStrings.APPIUM_PYTHON
  - typingsJapgolly.awsSdk.awsSdkStrings.APPIUM_NODE
  - typingsJapgolly.awsSdk.awsSdkStrings.APPIUM_RUBY
  - typingsJapgolly.awsSdk.awsSdkStrings.APPIUM_WEB_JAVA_JUNIT
  - typingsJapgolly.awsSdk.awsSdkStrings.APPIUM_WEB_JAVA_TESTNG
  - typingsJapgolly.awsSdk.awsSdkStrings.APPIUM_WEB_PYTHON
  - typingsJapgolly.awsSdk.awsSdkStrings.APPIUM_WEB_NODE
  - typingsJapgolly.awsSdk.awsSdkStrings.APPIUM_WEB_RUBY
  - typingsJapgolly.awsSdk.awsSdkStrings.CALABASH
  - typingsJapgolly.awsSdk.awsSdkStrings.INSTRUMENTATION
  - typingsJapgolly.awsSdk.awsSdkStrings.UIAUTOMATION
  - typingsJapgolly.awsSdk.awsSdkStrings.UIAUTOMATOR
  - typingsJapgolly.awsSdk.awsSdkStrings.XCTEST
  - typingsJapgolly.awsSdk.awsSdkStrings.XCTEST_UI
  - typingsJapgolly.awsSdk.awsSdkStrings.REMOTE_ACCESS_RECORD
  - typingsJapgolly.awsSdk.awsSdkStrings.REMOTE_ACCESS_REPLAY
  - java.lang.String
*/
type TestType = _TestType | java.lang.String

type Tests = js.Array[Test]

type TransactionIdentifier = java.lang.String

type URL = java.lang.String

type UniqueProblems = js.Array[UniqueProblem]

type UniqueProblemsByExecutionResultMap = StringDictionary[UniqueProblems]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CURATED
  - typingsJapgolly.awsSdk.awsSdkStrings.PRIVATE
  - java.lang.String
*/
type UploadCategory = _UploadCategory | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.INITIALIZED
  - typingsJapgolly.awsSdk.awsSdkStrings.PROCESSING
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type UploadStatus = _UploadStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ANDROID_APP
  - typingsJapgolly.awsSdk.awsSdkStrings.IOS_APP
  - typingsJapgolly.awsSdk.awsSdkStrings.WEB_APP
  - typingsJapgolly.awsSdk.awsSdkStrings.EXTERNAL_DATA
  - typingsJapgolly.awsSdk.awsSdkStrings.APPIUM_JAVA_JUNIT_TEST_PACKAGE
  - typingsJapgolly.awsSdk.awsSdkStrings.APPIUM_JAVA_TESTNG_TEST_PACKAGE
  - typingsJapgolly.awsSdk.awsSdkStrings.APPIUM_PYTHON_TEST_PACKAGE
  - typingsJapgolly.awsSdk.awsSdkStrings.APPIUM_NODE_TEST_PACKAGE
  - typingsJapgolly.awsSdk.awsSdkStrings.APPIUM_RUBY_TEST_PACKAGE
  - typingsJapgolly.awsSdk.awsSdkStrings.APPIUM_WEB_JAVA_JUNIT_TEST_PACKAGE
  - typingsJapgolly.awsSdk.awsSdkStrings.APPIUM_WEB_JAVA_TESTNG_TEST_PACKAGE
  - typingsJapgolly.awsSdk.awsSdkStrings.APPIUM_WEB_PYTHON_TEST_PACKAGE
  - typingsJapgolly.awsSdk.awsSdkStrings.APPIUM_WEB_NODE_TEST_PACKAGE
  - typingsJapgolly.awsSdk.awsSdkStrings.APPIUM_WEB_RUBY_TEST_PACKAGE
  - typingsJapgolly.awsSdk.awsSdkStrings.CALABASH_TEST_PACKAGE
  - typingsJapgolly.awsSdk.awsSdkStrings.INSTRUMENTATION_TEST_PACKAGE
  - typingsJapgolly.awsSdk.awsSdkStrings.UIAUTOMATION_TEST_PACKAGE
  - typingsJapgolly.awsSdk.awsSdkStrings.UIAUTOMATOR_TEST_PACKAGE
  - typingsJapgolly.awsSdk.awsSdkStrings.XCTEST_TEST_PACKAGE
  - typingsJapgolly.awsSdk.awsSdkStrings.XCTEST_UI_TEST_PACKAGE
  - typingsJapgolly.awsSdk.awsSdkStrings.APPIUM_JAVA_JUNIT_TEST_SPEC
  - typingsJapgolly.awsSdk.awsSdkStrings.APPIUM_JAVA_TESTNG_TEST_SPEC
  - typingsJapgolly.awsSdk.awsSdkStrings.APPIUM_PYTHON_TEST_SPEC
  - typingsJapgolly.awsSdk.awsSdkStrings.APPIUM_NODE_TEST_SPEC
  - typingsJapgolly.awsSdk.awsSdkStrings.APPIUM_RUBY_TEST_SPEC
  - typingsJapgolly.awsSdk.awsSdkStrings.APPIUM_WEB_JAVA_JUNIT_TEST_SPEC
  - typingsJapgolly.awsSdk.awsSdkStrings.APPIUM_WEB_JAVA_TESTNG_TEST_SPEC
  - typingsJapgolly.awsSdk.awsSdkStrings.APPIUM_WEB_PYTHON_TEST_SPEC
  - typingsJapgolly.awsSdk.awsSdkStrings.APPIUM_WEB_NODE_TEST_SPEC
  - typingsJapgolly.awsSdk.awsSdkStrings.APPIUM_WEB_RUBY_TEST_SPEC
  - typingsJapgolly.awsSdk.awsSdkStrings.INSTRUMENTATION_TEST_SPEC
  - typingsJapgolly.awsSdk.awsSdkStrings.XCTEST_UI_TEST_SPEC
  - java.lang.String
*/
type UploadType = _UploadType | java.lang.String

type Uploads = js.Array[Upload]

type VPCEConfigurationDescription = java.lang.String

type VPCEConfigurationName = java.lang.String

type VPCEConfigurations = js.Array[VPCEConfiguration]

type VPCEServiceName = java.lang.String

type VideoCapture = scala.Boolean

type VpcSecurityGroupIds = js.Array[SecurityGroupId]

type VpcSubnetIds = js.Array[SubnetId]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2015-06-23`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
