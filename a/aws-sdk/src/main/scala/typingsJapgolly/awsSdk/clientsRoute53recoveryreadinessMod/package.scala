package typingsJapgolly.awsSdk.clientsRoute53recoveryreadinessMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type CrossAccountAuthorization = String

type LastAuditTimestamp = js.Date

type MaxResults = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.READY
  - typingsJapgolly.awsSdk.awsSdkStrings.NOT_READY
  - typingsJapgolly.awsSdk.awsSdkStrings.UNKNOWN
  - typingsJapgolly.awsSdk.awsSdkStrings.NOT_AUTHORIZED
  - java.lang.String
*/
type Readiness = _Readiness | String

type ReadinessCheckTimestamp = js.Date

type Tags = StringDictionary[string]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2019-12-02`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String

type listOfCellOutput = js.Array[CellOutput]

type listOfCrossAccountAuthorization = js.Array[CrossAccountAuthorization]

type listOfListRulesOutput = js.Array[ListRulesOutput]

type listOfMessage = js.Array[Message]

type listOfReadinessCheckOutput = js.Array[ReadinessCheckOutput]

type listOfReadinessCheckSummary = js.Array[ReadinessCheckSummary]

type listOfRecommendation = js.Array[Recommendation]

type listOfRecoveryGroupOutput = js.Array[RecoveryGroupOutput]

type listOfResource = js.Array[Resource]

type listOfResourceResult = js.Array[ResourceResult]

type listOfResourceSetOutput = js.Array[ResourceSetOutput]

type listOfRuleResult = js.Array[RuleResult]

type listOfString = js.Array[string]

type string = String

type stringMax256 = String

type stringMax64 = String

type stringMax64PatternAAZAZ09Z = String

type stringPatternAWSAZaZ09AZaZ09 = String
