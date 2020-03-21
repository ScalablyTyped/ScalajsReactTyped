package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object devicefarmMod {
  type AWSAccountNumber = java.lang.String
  type AccountsCleanup = scala.Boolean
  type AmazonResourceName = java.lang.String
  type AmazonResourceNames = js.Array[typingsJapgolly.awsSdk.devicefarmMod.AmazonResourceName]
  type AndroidPaths = js.Array[typingsJapgolly.awsSdk.devicefarmMod.String]
  type AppPackagesCleanup = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SCREENSHOT
    - typingsJapgolly.awsSdk.awsSdkStrings.FILE
    - typingsJapgolly.awsSdk.awsSdkStrings.LOG
    - java.lang.String
  */
  type ArtifactCategory = typingsJapgolly.awsSdk.devicefarmMod._ArtifactCategory | java.lang.String
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
  type ArtifactType = typingsJapgolly.awsSdk.devicefarmMod._ArtifactType | java.lang.String
  type Artifacts = js.Array[typingsJapgolly.awsSdk.devicefarmMod.Artifact]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.METERED
    - typingsJapgolly.awsSdk.awsSdkStrings.UNMETERED
    - java.lang.String
  */
  type BillingMethod = typingsJapgolly.awsSdk.devicefarmMod._BillingMethod | java.lang.String
  type Boolean = scala.Boolean
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.devicefarmMod.ClientApiVersions
  type ClientId = java.lang.String
  type ContentType = java.lang.String
  type CurrencyCode = typingsJapgolly.awsSdk.awsSdkStrings.USD | java.lang.String
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
  type DeviceAttribute = typingsJapgolly.awsSdk.devicefarmMod._DeviceAttribute | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.TEMPORARY_NOT_AVAILABLE
    - typingsJapgolly.awsSdk.awsSdkStrings.BUSY
    - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE
    - typingsJapgolly.awsSdk.awsSdkStrings.HIGHLY_AVAILABLE
    - java.lang.String
  */
  type DeviceAvailability = typingsJapgolly.awsSdk.devicefarmMod._DeviceAvailability | java.lang.String
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
  type DeviceFilterAttribute = typingsJapgolly.awsSdk.devicefarmMod._DeviceFilterAttribute | java.lang.String
  type DeviceFilterValues = js.Array[typingsJapgolly.awsSdk.devicefarmMod.String]
  type DeviceFilters = js.Array[typingsJapgolly.awsSdk.devicefarmMod.DeviceFilter]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PHONE
    - typingsJapgolly.awsSdk.awsSdkStrings.TABLET
    - java.lang.String
  */
  type DeviceFormFactor = typingsJapgolly.awsSdk.devicefarmMod._DeviceFormFactor | java.lang.String
  type DeviceHostPaths = js.Array[typingsJapgolly.awsSdk.devicefarmMod.String]
  type DeviceInstances = js.Array[typingsJapgolly.awsSdk.devicefarmMod.DeviceInstance]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ANDROID
    - typingsJapgolly.awsSdk.awsSdkStrings.IOS
    - java.lang.String
  */
  type DevicePlatform = typingsJapgolly.awsSdk.devicefarmMod._DevicePlatform | java.lang.String
  type DevicePoolCompatibilityResults = js.Array[typingsJapgolly.awsSdk.devicefarmMod.DevicePoolCompatibilityResult]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CURATED
    - typingsJapgolly.awsSdk.awsSdkStrings.PRIVATE
    - java.lang.String
  */
  type DevicePoolType = typingsJapgolly.awsSdk.devicefarmMod._DevicePoolType | java.lang.String
  type DevicePools = js.Array[typingsJapgolly.awsSdk.devicefarmMod.DevicePool]
  type Devices = js.Array[typingsJapgolly.awsSdk.devicefarmMod.Device]
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
  type ExecutionResult = typingsJapgolly.awsSdk.devicefarmMod._ExecutionResult | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PARSING_FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.VPC_ENDPOINT_SETUP_FAILED
    - java.lang.String
  */
  type ExecutionResultCode = typingsJapgolly.awsSdk.devicefarmMod._ExecutionResultCode | java.lang.String
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
  type ExecutionStatus = typingsJapgolly.awsSdk.devicefarmMod._ExecutionStatus | java.lang.String
  type Filter = java.lang.String
  type HostAddress = java.lang.String
  type IncompatibilityMessages = js.Array[typingsJapgolly.awsSdk.devicefarmMod.IncompatibilityMessage]
  type InstanceLabels = js.Array[typingsJapgolly.awsSdk.devicefarmMod.String]
  type InstanceProfiles = js.Array[typingsJapgolly.awsSdk.devicefarmMod.InstanceProfile]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.IN_USE
    - typingsJapgolly.awsSdk.awsSdkStrings.PREPARING
    - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE
    - typingsJapgolly.awsSdk.awsSdkStrings.NOT_AVAILABLE
    - java.lang.String
  */
  type InstanceStatus = typingsJapgolly.awsSdk.devicefarmMod._InstanceStatus | java.lang.String
  type Integer = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.INTERACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.NO_VIDEO
    - typingsJapgolly.awsSdk.awsSdkStrings.VIDEO_ONLY
    - java.lang.String
  */
  type InteractionMode = typingsJapgolly.awsSdk.devicefarmMod._InteractionMode | java.lang.String
  type IosPaths = js.Array[typingsJapgolly.awsSdk.devicefarmMod.String]
  type JobTimeoutMinutes = scala.Double
  type Jobs = js.Array[typingsJapgolly.awsSdk.devicefarmMod.Job]
  type Long = scala.Double
  type MaxPageSize = scala.Double
  type MaxSlotMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.devicefarmMod.Integer]
  type Message = java.lang.String
  type Metadata = java.lang.String
  type Name = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CURATED
    - typingsJapgolly.awsSdk.awsSdkStrings.PRIVATE
    - java.lang.String
  */
  type NetworkProfileType = typingsJapgolly.awsSdk.devicefarmMod._NetworkProfileType | java.lang.String
  type NetworkProfiles = js.Array[typingsJapgolly.awsSdk.devicefarmMod.NetworkProfile]
  type OfferingIdentifier = java.lang.String
  type OfferingPromotionIdentifier = java.lang.String
  type OfferingPromotions = js.Array[typingsJapgolly.awsSdk.devicefarmMod.OfferingPromotion]
  type OfferingStatusMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.devicefarmMod.OfferingStatus]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PURCHASE
    - typingsJapgolly.awsSdk.awsSdkStrings.RENEW
    - typingsJapgolly.awsSdk.awsSdkStrings.SYSTEM
    - java.lang.String
  */
  type OfferingTransactionType = typingsJapgolly.awsSdk.devicefarmMod._OfferingTransactionType | java.lang.String
  type OfferingTransactions = js.Array[typingsJapgolly.awsSdk.devicefarmMod.OfferingTransaction]
  type OfferingType = typingsJapgolly.awsSdk.awsSdkStrings.RECURRING | java.lang.String
  type Offerings = js.Array[typingsJapgolly.awsSdk.devicefarmMod.Offering]
  type PackageIds = js.Array[typingsJapgolly.awsSdk.devicefarmMod.String]
  type PaginationToken = java.lang.String
  type PercentInteger = scala.Double
  type Problems = js.Array[typingsJapgolly.awsSdk.devicefarmMod.Problem]
  type Projects = js.Array[typingsJapgolly.awsSdk.devicefarmMod.Project]
  type PurchasedDevicesMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.devicefarmMod.Integer]
  type RecurringChargeFrequency = typingsJapgolly.awsSdk.awsSdkStrings.MONTHLY | java.lang.String
  type RecurringCharges = js.Array[typingsJapgolly.awsSdk.devicefarmMod.RecurringCharge]
  type RemoteAccessSessions = js.Array[typingsJapgolly.awsSdk.devicefarmMod.RemoteAccessSession]
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
  type RuleOperator = typingsJapgolly.awsSdk.devicefarmMod._RuleOperator | java.lang.String
  type Rules = js.Array[typingsJapgolly.awsSdk.devicefarmMod.Rule]
  type Runs = js.Array[typingsJapgolly.awsSdk.devicefarmMod.Run]
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
  type SampleType = typingsJapgolly.awsSdk.devicefarmMod._SampleType | java.lang.String
  type Samples = js.Array[typingsJapgolly.awsSdk.devicefarmMod.Sample]
  type ServiceDnsName = java.lang.String
  type SkipAppResign = scala.Boolean
  type SshPublicKey = java.lang.String
  type String = java.lang.String
  type Suites = js.Array[typingsJapgolly.awsSdk.devicefarmMod.Suite]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsJapgolly.awsSdk.devicefarmMod.TagKey]
  type TagList = js.Array[typingsJapgolly.awsSdk.devicefarmMod.Tag]
  type TagValue = java.lang.String
  type TestGridProjects = js.Array[typingsJapgolly.awsSdk.devicefarmMod.TestGridProject]
  type TestGridSessionActions = js.Array[typingsJapgolly.awsSdk.devicefarmMod.TestGridSessionAction]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.VIDEO
    - typingsJapgolly.awsSdk.awsSdkStrings.LOG
    - java.lang.String
  */
  type TestGridSessionArtifactCategory = typingsJapgolly.awsSdk.devicefarmMod._TestGridSessionArtifactCategory | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.UNKNOWN
    - typingsJapgolly.awsSdk.awsSdkStrings.VIDEO
    - typingsJapgolly.awsSdk.awsSdkStrings.SELENIUM_LOG
    - java.lang.String
  */
  type TestGridSessionArtifactType = typingsJapgolly.awsSdk.devicefarmMod._TestGridSessionArtifactType | java.lang.String
  type TestGridSessionArtifacts = js.Array[typingsJapgolly.awsSdk.devicefarmMod.TestGridSessionArtifact]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.CLOSED
    - typingsJapgolly.awsSdk.awsSdkStrings.ERRORED
    - java.lang.String
  */
  type TestGridSessionStatus = typingsJapgolly.awsSdk.devicefarmMod._TestGridSessionStatus | java.lang.String
  type TestGridSessions = js.Array[typingsJapgolly.awsSdk.devicefarmMod.TestGridSession]
  type TestGridUrlExpiresInSecondsInput = scala.Double
  type TestParameters = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.devicefarmMod.String]
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
  type TestType = typingsJapgolly.awsSdk.devicefarmMod._TestType | java.lang.String
  type Tests = js.Array[typingsJapgolly.awsSdk.devicefarmMod.Test]
  type TransactionIdentifier = java.lang.String
  type URL = java.lang.String
  type UniqueProblems = js.Array[typingsJapgolly.awsSdk.devicefarmMod.UniqueProblem]
  type UniqueProblemsByExecutionResultMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.devicefarmMod.UniqueProblems]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CURATED
    - typingsJapgolly.awsSdk.awsSdkStrings.PRIVATE
    - java.lang.String
  */
  type UploadCategory = typingsJapgolly.awsSdk.devicefarmMod._UploadCategory | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.INITIALIZED
    - typingsJapgolly.awsSdk.awsSdkStrings.PROCESSING
    - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type UploadStatus = typingsJapgolly.awsSdk.devicefarmMod._UploadStatus | java.lang.String
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
  type UploadType = typingsJapgolly.awsSdk.devicefarmMod._UploadType | java.lang.String
  type Uploads = js.Array[typingsJapgolly.awsSdk.devicefarmMod.Upload]
  type VPCEConfigurationDescription = java.lang.String
  type VPCEConfigurationName = java.lang.String
  type VPCEConfigurations = js.Array[typingsJapgolly.awsSdk.devicefarmMod.VPCEConfiguration]
  type VPCEServiceName = java.lang.String
  type VideoCapture = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2015-06-23`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.devicefarmMod._apiVersion | java.lang.String
}
