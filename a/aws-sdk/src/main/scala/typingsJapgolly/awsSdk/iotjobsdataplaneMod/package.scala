package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object iotjobsdataplaneMod {
  type ApproximateSecondsBeforeTimedOut = scala.Double
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.iotjobsdataplaneMod.ClientApiVersions
  type DescribeJobExecutionJobId = java.lang.String
  type DetailsKey = java.lang.String
  type DetailsMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.iotjobsdataplaneMod.DetailsValue]
  type DetailsValue = java.lang.String
  type ExecutionNumber = scala.Double
  type ExpectedVersion = scala.Double
  type IncludeExecutionState = scala.Boolean
  type IncludeJobDocument = scala.Boolean
  type JobDocument = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.QUEUED
    - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.TIMED_OUT
    - typingsJapgolly.awsSdk.awsSdkStrings.REJECTED
    - typingsJapgolly.awsSdk.awsSdkStrings.REMOVED
    - typingsJapgolly.awsSdk.awsSdkStrings.CANCELED
    - java.lang.String
  */
  type JobExecutionStatus = typingsJapgolly.awsSdk.iotjobsdataplaneMod._JobExecutionStatus | java.lang.String
  type JobExecutionSummaryList = js.Array[typingsJapgolly.awsSdk.iotjobsdataplaneMod.JobExecutionSummary]
  type JobId = java.lang.String
  type LastUpdatedAt = scala.Double
  type QueuedAt = scala.Double
  type StartedAt = scala.Double
  type StepTimeoutInMinutes = scala.Double
  type ThingName = java.lang.String
  type VersionNumber = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2017-09-29`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.iotjobsdataplaneMod._apiVersion | java.lang.String
}
