package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object accessanalyzerMod {
  type ActionList = js.Array[typingsJapgolly.awsSdk.accessanalyzerMod.String]
  type AnalyzedResourcesList = js.Array[typingsJapgolly.awsSdk.accessanalyzerMod.AnalyzedResourceSummary]
  type AnalyzerArn = java.lang.String
  type AnalyzersList = js.Array[typingsJapgolly.awsSdk.accessanalyzerMod.AnalyzerSummary]
  type ArchiveRulesList = js.Array[typingsJapgolly.awsSdk.accessanalyzerMod.ArchiveRuleSummary]
  type Boolean = scala.Boolean
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.accessanalyzerMod.ClientApiVersions
  type ConditionKeyMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.accessanalyzerMod.String]
  type FilterCriteriaMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.accessanalyzerMod.Criterion]
  type FindingId = java.lang.String
  type FindingIdList = js.Array[typingsJapgolly.awsSdk.accessanalyzerMod.FindingId]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.ARCHIVED
    - typingsJapgolly.awsSdk.awsSdkStrings.RESOLVED
    - java.lang.String
  */
  type FindingStatus = typingsJapgolly.awsSdk.accessanalyzerMod._FindingStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.ARCHIVED
    - java.lang.String
  */
  type FindingStatusUpdate = typingsJapgolly.awsSdk.accessanalyzerMod._FindingStatusUpdate | java.lang.String
  type FindingsList = js.Array[typingsJapgolly.awsSdk.accessanalyzerMod.FindingSummary]
  type InlineArchiveRulesList = js.Array[typingsJapgolly.awsSdk.accessanalyzerMod.InlineArchiveRule]
  type Integer = scala.Double
  type Name = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ASC
    - typingsJapgolly.awsSdk.awsSdkStrings.DESC
    - java.lang.String
  */
  type OrderBy = typingsJapgolly.awsSdk.accessanalyzerMod._OrderBy | java.lang.String
  type PrincipalMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.accessanalyzerMod.String]
  type ResourceArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonIAMColonColonRole
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonKMSColonColonKey
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonLambdaColonColonFunction
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonLambdaColonColonLayerVersion
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonS3ColonColonBucket
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSColonColonSQSColonColonQueue
    - java.lang.String
  */
  type ResourceType = typingsJapgolly.awsSdk.accessanalyzerMod._ResourceType | java.lang.String
  type SharedViaList = js.Array[typingsJapgolly.awsSdk.accessanalyzerMod.String]
  type String = java.lang.String
  type TagKeys = js.Array[typingsJapgolly.awsSdk.accessanalyzerMod.String]
  type TagsMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.accessanalyzerMod.String]
  type Timestamp = js.Date
  type Token = java.lang.String
  type Type = typingsJapgolly.awsSdk.awsSdkStrings.ACCOUNT | java.lang.String
  type ValueList = js.Array[typingsJapgolly.awsSdk.accessanalyzerMod.String]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2019-11-01`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.accessanalyzerMod._apiVersion | java.lang.String
}
