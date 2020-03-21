package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object augmentedairuntimeMod {
  type Boolean = scala.Boolean
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.augmentedairuntimeMod.ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.FreeOfPersonallyIdentifiableInformation
    - typingsJapgolly.awsSdk.awsSdkStrings.FreeOfAdultContent
    - java.lang.String
  */
  type ContentClassifier = typingsJapgolly.awsSdk.augmentedairuntimeMod._ContentClassifier | java.lang.String
  type ContentClassifiers = js.Array[typingsJapgolly.awsSdk.augmentedairuntimeMod.ContentClassifier]
  type FailureReason = java.lang.String
  type FlowDefinitionArn = java.lang.String
  type HumanLoopArn = java.lang.String
  type HumanLoopName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
    - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
    - typingsJapgolly.awsSdk.awsSdkStrings.Completed_
    - typingsJapgolly.awsSdk.awsSdkStrings.Stopped_
    - typingsJapgolly.awsSdk.awsSdkStrings.Stopping_
    - java.lang.String
  */
  type HumanLoopStatus = typingsJapgolly.awsSdk.augmentedairuntimeMod._HumanLoopStatus | java.lang.String
  type HumanLoopSummaries = js.Array[typingsJapgolly.awsSdk.augmentedairuntimeMod.HumanLoopSummary]
  type InputContent = java.lang.String
  type MaxResults = scala.Double
  type NextToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Ascending_
    - typingsJapgolly.awsSdk.awsSdkStrings.Descending_
    - java.lang.String
  */
  type SortOrder = typingsJapgolly.awsSdk.augmentedairuntimeMod._SortOrder | java.lang.String
  type String = java.lang.String
  type Timestamp = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2019-11-07`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.augmentedairuntimeMod._apiVersion | java.lang.String
}
