package typingsJapgolly.awsSdk.clientsWafregionalMod

import typingsJapgolly.awsSdk.awsSdkStrings.Country_
import typingsJapgolly.awsSdk.awsSdkStrings.IP
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Action = String

type ActivatedRules = js.Array[ActivatedRule]

type ByteMatchSetSummaries = js.Array[ByteMatchSetSummary]

type ByteMatchSetUpdates = js.Array[ByteMatchSetUpdate]

type ByteMatchTargetString = Buffer | js.typedarray.Uint8Array | Blob | String

type ByteMatchTuples = js.Array[ByteMatchTuple]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.INSERT
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE
  - java.lang.String
*/
type ChangeAction = _ChangeAction | String

type ChangeToken = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PROVISIONED
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.INSYNC
  - java.lang.String
*/
type ChangeTokenStatus = _ChangeTokenStatus | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.EQ
  - typingsJapgolly.awsSdk.awsSdkStrings.NE
  - typingsJapgolly.awsSdk.awsSdkStrings.LE
  - typingsJapgolly.awsSdk.awsSdkStrings.LT
  - typingsJapgolly.awsSdk.awsSdkStrings.GE
  - typingsJapgolly.awsSdk.awsSdkStrings.GT
  - java.lang.String
*/
type ComparisonOperator = _ComparisonOperator | String

type Country = String

type ExcludedRules = js.Array[ExcludedRule]

type GeoMatchConstraintType = Country_ | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AF
  - typingsJapgolly.awsSdk.awsSdkStrings.AX
  - typingsJapgolly.awsSdk.awsSdkStrings.AL
  - typingsJapgolly.awsSdk.awsSdkStrings.DZ
  - typingsJapgolly.awsSdk.awsSdkStrings.AS
  - typingsJapgolly.awsSdk.awsSdkStrings.AD
  - typingsJapgolly.awsSdk.awsSdkStrings.AO
  - typingsJapgolly.awsSdk.awsSdkStrings.AI
  - typingsJapgolly.awsSdk.awsSdkStrings.AQ
  - typingsJapgolly.awsSdk.awsSdkStrings.AG
  - typingsJapgolly.awsSdk.awsSdkStrings.AR
  - typingsJapgolly.awsSdk.awsSdkStrings.AM
  - typingsJapgolly.awsSdk.awsSdkStrings.AW
  - typingsJapgolly.awsSdk.awsSdkStrings.AU
  - typingsJapgolly.awsSdk.awsSdkStrings.AT
  - typingsJapgolly.awsSdk.awsSdkStrings.AZ
  - typingsJapgolly.awsSdk.awsSdkStrings.BS
  - typingsJapgolly.awsSdk.awsSdkStrings.BH
  - typingsJapgolly.awsSdk.awsSdkStrings.BD
  - typingsJapgolly.awsSdk.awsSdkStrings.BB
  - typingsJapgolly.awsSdk.awsSdkStrings.BY
  - typingsJapgolly.awsSdk.awsSdkStrings.BE
  - typingsJapgolly.awsSdk.awsSdkStrings.BZ
  - typingsJapgolly.awsSdk.awsSdkStrings.BJ
  - typingsJapgolly.awsSdk.awsSdkStrings.BM
  - typingsJapgolly.awsSdk.awsSdkStrings.BT
  - typingsJapgolly.awsSdk.awsSdkStrings.BO
  - typingsJapgolly.awsSdk.awsSdkStrings.BQ
  - typingsJapgolly.awsSdk.awsSdkStrings.BA
  - typingsJapgolly.awsSdk.awsSdkStrings.BW
  - typingsJapgolly.awsSdk.awsSdkStrings.BV
  - typingsJapgolly.awsSdk.awsSdkStrings.BR
  - typingsJapgolly.awsSdk.awsSdkStrings.IO
  - typingsJapgolly.awsSdk.awsSdkStrings.BN
  - typingsJapgolly.awsSdk.awsSdkStrings.BG
  - typingsJapgolly.awsSdk.awsSdkStrings.BF
  - typingsJapgolly.awsSdk.awsSdkStrings.BI
  - typingsJapgolly.awsSdk.awsSdkStrings.KH
  - typingsJapgolly.awsSdk.awsSdkStrings.CM
  - typingsJapgolly.awsSdk.awsSdkStrings.CA
  - typingsJapgolly.awsSdk.awsSdkStrings.CV
  - typingsJapgolly.awsSdk.awsSdkStrings.KY
  - typingsJapgolly.awsSdk.awsSdkStrings.CF
  - typingsJapgolly.awsSdk.awsSdkStrings.TD
  - typingsJapgolly.awsSdk.awsSdkStrings.CL
  - typingsJapgolly.awsSdk.awsSdkStrings.CN
  - typingsJapgolly.awsSdk.awsSdkStrings.CX
  - typingsJapgolly.awsSdk.awsSdkStrings.CC
  - typingsJapgolly.awsSdk.awsSdkStrings.CO
  - typingsJapgolly.awsSdk.awsSdkStrings.KM
  - typingsJapgolly.awsSdk.awsSdkStrings.CG
  - typingsJapgolly.awsSdk.awsSdkStrings.CD
  - typingsJapgolly.awsSdk.awsSdkStrings.CK
  - typingsJapgolly.awsSdk.awsSdkStrings.CR
  - typingsJapgolly.awsSdk.awsSdkStrings.CI
  - typingsJapgolly.awsSdk.awsSdkStrings.HR
  - typingsJapgolly.awsSdk.awsSdkStrings.CU
  - typingsJapgolly.awsSdk.awsSdkStrings.CW
  - typingsJapgolly.awsSdk.awsSdkStrings.CY
  - typingsJapgolly.awsSdk.awsSdkStrings.CZ
  - typingsJapgolly.awsSdk.awsSdkStrings.DK
  - typingsJapgolly.awsSdk.awsSdkStrings.DJ
  - typingsJapgolly.awsSdk.awsSdkStrings.DM
  - typingsJapgolly.awsSdk.awsSdkStrings.DO
  - typingsJapgolly.awsSdk.awsSdkStrings.EC
  - typingsJapgolly.awsSdk.awsSdkStrings.EG
  - typingsJapgolly.awsSdk.awsSdkStrings.SV
  - typingsJapgolly.awsSdk.awsSdkStrings.GQ
  - typingsJapgolly.awsSdk.awsSdkStrings.ER
  - typingsJapgolly.awsSdk.awsSdkStrings.EE
  - typingsJapgolly.awsSdk.awsSdkStrings.ET
  - typingsJapgolly.awsSdk.awsSdkStrings.FK
  - typingsJapgolly.awsSdk.awsSdkStrings.FO
  - typingsJapgolly.awsSdk.awsSdkStrings.FJ
  - typingsJapgolly.awsSdk.awsSdkStrings.FI
  - typingsJapgolly.awsSdk.awsSdkStrings.FR
  - typingsJapgolly.awsSdk.awsSdkStrings.GF
  - typingsJapgolly.awsSdk.awsSdkStrings.PF
  - typingsJapgolly.awsSdk.awsSdkStrings.TF
  - typingsJapgolly.awsSdk.awsSdkStrings.GA
  - typingsJapgolly.awsSdk.awsSdkStrings.GM
  - typingsJapgolly.awsSdk.awsSdkStrings.GE
  - typingsJapgolly.awsSdk.awsSdkStrings.DE
  - typingsJapgolly.awsSdk.awsSdkStrings.GH
  - typingsJapgolly.awsSdk.awsSdkStrings.GI
  - typingsJapgolly.awsSdk.awsSdkStrings.GR
  - typingsJapgolly.awsSdk.awsSdkStrings.GL
  - typingsJapgolly.awsSdk.awsSdkStrings.GD
  - typingsJapgolly.awsSdk.awsSdkStrings.GP
  - typingsJapgolly.awsSdk.awsSdkStrings.GU
  - typingsJapgolly.awsSdk.awsSdkStrings.GT
  - typingsJapgolly.awsSdk.awsSdkStrings.GG
  - typingsJapgolly.awsSdk.awsSdkStrings.GN
  - typingsJapgolly.awsSdk.awsSdkStrings.GW
  - typingsJapgolly.awsSdk.awsSdkStrings.GY
  - typingsJapgolly.awsSdk.awsSdkStrings.HT
  - typingsJapgolly.awsSdk.awsSdkStrings.HM
  - typingsJapgolly.awsSdk.awsSdkStrings.VA
  - typingsJapgolly.awsSdk.awsSdkStrings.HN
  - typingsJapgolly.awsSdk.awsSdkStrings.HK
  - typingsJapgolly.awsSdk.awsSdkStrings.HU
  - typingsJapgolly.awsSdk.awsSdkStrings.IS
  - typingsJapgolly.awsSdk.awsSdkStrings.IN
  - typingsJapgolly.awsSdk.awsSdkStrings.ID
  - typingsJapgolly.awsSdk.awsSdkStrings.IR
  - typingsJapgolly.awsSdk.awsSdkStrings.IQ
  - typingsJapgolly.awsSdk.awsSdkStrings.IE
  - typingsJapgolly.awsSdk.awsSdkStrings.IM
  - typingsJapgolly.awsSdk.awsSdkStrings.IL
  - typingsJapgolly.awsSdk.awsSdkStrings.IT
  - typingsJapgolly.awsSdk.awsSdkStrings.JM
  - typingsJapgolly.awsSdk.awsSdkStrings.JP
  - typingsJapgolly.awsSdk.awsSdkStrings.JE
  - typingsJapgolly.awsSdk.awsSdkStrings.JO
  - typingsJapgolly.awsSdk.awsSdkStrings.KZ
  - typingsJapgolly.awsSdk.awsSdkStrings.KE
  - typingsJapgolly.awsSdk.awsSdkStrings.KI
  - typingsJapgolly.awsSdk.awsSdkStrings.KP
  - typingsJapgolly.awsSdk.awsSdkStrings.KR
  - typingsJapgolly.awsSdk.awsSdkStrings.KW
  - typingsJapgolly.awsSdk.awsSdkStrings.KG
  - typingsJapgolly.awsSdk.awsSdkStrings.LA
  - typingsJapgolly.awsSdk.awsSdkStrings.LV
  - typingsJapgolly.awsSdk.awsSdkStrings.LB
  - typingsJapgolly.awsSdk.awsSdkStrings.LS
  - typingsJapgolly.awsSdk.awsSdkStrings.LR
  - typingsJapgolly.awsSdk.awsSdkStrings.LY
  - typingsJapgolly.awsSdk.awsSdkStrings.LI
  - typingsJapgolly.awsSdk.awsSdkStrings.LT
  - typingsJapgolly.awsSdk.awsSdkStrings.LU
  - typingsJapgolly.awsSdk.awsSdkStrings.MO
  - typingsJapgolly.awsSdk.awsSdkStrings.MK
  - typingsJapgolly.awsSdk.awsSdkStrings.MG
  - typingsJapgolly.awsSdk.awsSdkStrings.MW
  - typingsJapgolly.awsSdk.awsSdkStrings.MY
  - typingsJapgolly.awsSdk.awsSdkStrings.MV
  - typingsJapgolly.awsSdk.awsSdkStrings.ML
  - typingsJapgolly.awsSdk.awsSdkStrings.MT
  - typingsJapgolly.awsSdk.awsSdkStrings.MH
  - typingsJapgolly.awsSdk.awsSdkStrings.MQ
  - typingsJapgolly.awsSdk.awsSdkStrings.MR
  - typingsJapgolly.awsSdk.awsSdkStrings.MU
  - typingsJapgolly.awsSdk.awsSdkStrings.YT
  - typingsJapgolly.awsSdk.awsSdkStrings.MX
  - typingsJapgolly.awsSdk.awsSdkStrings.FM
  - typingsJapgolly.awsSdk.awsSdkStrings.MD
  - typingsJapgolly.awsSdk.awsSdkStrings.MC
  - typingsJapgolly.awsSdk.awsSdkStrings.MN
  - typingsJapgolly.awsSdk.awsSdkStrings.ME
  - typingsJapgolly.awsSdk.awsSdkStrings.MS
  - typingsJapgolly.awsSdk.awsSdkStrings.MA
  - typingsJapgolly.awsSdk.awsSdkStrings.MZ
  - typingsJapgolly.awsSdk.awsSdkStrings.MM
  - typingsJapgolly.awsSdk.awsSdkStrings.NA
  - typingsJapgolly.awsSdk.awsSdkStrings.NR
  - typingsJapgolly.awsSdk.awsSdkStrings.NP
  - typingsJapgolly.awsSdk.awsSdkStrings.NL
  - typingsJapgolly.awsSdk.awsSdkStrings.NC
  - typingsJapgolly.awsSdk.awsSdkStrings.NZ
  - typingsJapgolly.awsSdk.awsSdkStrings.NI
  - typingsJapgolly.awsSdk.awsSdkStrings.NE
  - typingsJapgolly.awsSdk.awsSdkStrings.NG
  - typingsJapgolly.awsSdk.awsSdkStrings.NU
  - typingsJapgolly.awsSdk.awsSdkStrings.NF
  - typingsJapgolly.awsSdk.awsSdkStrings.MP
  - typingsJapgolly.awsSdk.awsSdkStrings.NO
  - typingsJapgolly.awsSdk.awsSdkStrings.OM
  - typingsJapgolly.awsSdk.awsSdkStrings.PK
  - typingsJapgolly.awsSdk.awsSdkStrings.PW
  - typingsJapgolly.awsSdk.awsSdkStrings.PS
  - typingsJapgolly.awsSdk.awsSdkStrings.PA
  - typingsJapgolly.awsSdk.awsSdkStrings.PG
  - typingsJapgolly.awsSdk.awsSdkStrings.PY
  - typingsJapgolly.awsSdk.awsSdkStrings.PE
  - typingsJapgolly.awsSdk.awsSdkStrings.PH
  - typingsJapgolly.awsSdk.awsSdkStrings.PN
  - typingsJapgolly.awsSdk.awsSdkStrings.PL
  - typingsJapgolly.awsSdk.awsSdkStrings.PT
  - typingsJapgolly.awsSdk.awsSdkStrings.PR
  - typingsJapgolly.awsSdk.awsSdkStrings.QA
  - typingsJapgolly.awsSdk.awsSdkStrings.RE
  - typingsJapgolly.awsSdk.awsSdkStrings.RO
  - typingsJapgolly.awsSdk.awsSdkStrings.RU
  - typingsJapgolly.awsSdk.awsSdkStrings.RW
  - typingsJapgolly.awsSdk.awsSdkStrings.BL
  - typingsJapgolly.awsSdk.awsSdkStrings.SH
  - typingsJapgolly.awsSdk.awsSdkStrings.KN
  - typingsJapgolly.awsSdk.awsSdkStrings.LC
  - typingsJapgolly.awsSdk.awsSdkStrings.MF
  - typingsJapgolly.awsSdk.awsSdkStrings.PM
  - typingsJapgolly.awsSdk.awsSdkStrings.VC
  - typingsJapgolly.awsSdk.awsSdkStrings.WS
  - typingsJapgolly.awsSdk.awsSdkStrings.SM
  - typingsJapgolly.awsSdk.awsSdkStrings.ST
  - typingsJapgolly.awsSdk.awsSdkStrings.SA
  - typingsJapgolly.awsSdk.awsSdkStrings.SN
  - typingsJapgolly.awsSdk.awsSdkStrings.RS
  - typingsJapgolly.awsSdk.awsSdkStrings.SC
  - typingsJapgolly.awsSdk.awsSdkStrings.SL
  - typingsJapgolly.awsSdk.awsSdkStrings.SG
  - typingsJapgolly.awsSdk.awsSdkStrings.SX
  - typingsJapgolly.awsSdk.awsSdkStrings.SK
  - typingsJapgolly.awsSdk.awsSdkStrings.SI
  - typingsJapgolly.awsSdk.awsSdkStrings.SB
  - typingsJapgolly.awsSdk.awsSdkStrings.SO
  - typingsJapgolly.awsSdk.awsSdkStrings.ZA
  - typingsJapgolly.awsSdk.awsSdkStrings.GS
  - typingsJapgolly.awsSdk.awsSdkStrings.SS
  - typingsJapgolly.awsSdk.awsSdkStrings.ES
  - typingsJapgolly.awsSdk.awsSdkStrings.LK
  - typingsJapgolly.awsSdk.awsSdkStrings.SD
  - typingsJapgolly.awsSdk.awsSdkStrings.SR
  - typingsJapgolly.awsSdk.awsSdkStrings.SJ
  - typingsJapgolly.awsSdk.awsSdkStrings.SZ
  - typingsJapgolly.awsSdk.awsSdkStrings.SE
  - typingsJapgolly.awsSdk.awsSdkStrings.CH
  - typingsJapgolly.awsSdk.awsSdkStrings.SY
  - typingsJapgolly.awsSdk.awsSdkStrings.TW
  - typingsJapgolly.awsSdk.awsSdkStrings.TJ
  - typingsJapgolly.awsSdk.awsSdkStrings.TZ
  - typingsJapgolly.awsSdk.awsSdkStrings.TH
  - typingsJapgolly.awsSdk.awsSdkStrings.TL
  - typingsJapgolly.awsSdk.awsSdkStrings.TG
  - typingsJapgolly.awsSdk.awsSdkStrings.TK
  - typingsJapgolly.awsSdk.awsSdkStrings.TO
  - typingsJapgolly.awsSdk.awsSdkStrings.TT
  - typingsJapgolly.awsSdk.awsSdkStrings.TN
  - typingsJapgolly.awsSdk.awsSdkStrings.TR
  - typingsJapgolly.awsSdk.awsSdkStrings.TM
  - typingsJapgolly.awsSdk.awsSdkStrings.TC
  - typingsJapgolly.awsSdk.awsSdkStrings.TV
  - typingsJapgolly.awsSdk.awsSdkStrings.UG
  - typingsJapgolly.awsSdk.awsSdkStrings.UA
  - typingsJapgolly.awsSdk.awsSdkStrings.AE
  - typingsJapgolly.awsSdk.awsSdkStrings.GB
  - typingsJapgolly.awsSdk.awsSdkStrings.US
  - typingsJapgolly.awsSdk.awsSdkStrings.UM
  - typingsJapgolly.awsSdk.awsSdkStrings.UY
  - typingsJapgolly.awsSdk.awsSdkStrings.UZ
  - typingsJapgolly.awsSdk.awsSdkStrings.VU
  - typingsJapgolly.awsSdk.awsSdkStrings.VE
  - typingsJapgolly.awsSdk.awsSdkStrings.VN
  - typingsJapgolly.awsSdk.awsSdkStrings.VG
  - typingsJapgolly.awsSdk.awsSdkStrings.VI
  - typingsJapgolly.awsSdk.awsSdkStrings.WF
  - typingsJapgolly.awsSdk.awsSdkStrings.EH
  - typingsJapgolly.awsSdk.awsSdkStrings.YE
  - typingsJapgolly.awsSdk.awsSdkStrings.ZM
  - typingsJapgolly.awsSdk.awsSdkStrings.ZW
  - java.lang.String
*/
type GeoMatchConstraintValue = _GeoMatchConstraintValue | String

type GeoMatchConstraints = js.Array[GeoMatchConstraint]

type GeoMatchSetSummaries = js.Array[GeoMatchSetSummary]

type GeoMatchSetUpdates = js.Array[GeoMatchSetUpdate]

type GetSampledRequestsMaxItems = Double

type HTTPHeaders = js.Array[HTTPHeader]

type HTTPMethod = String

type HTTPVersion = String

type HeaderName = String

type HeaderValue = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.IPV4
  - typingsJapgolly.awsSdk.awsSdkStrings.IPV6
  - java.lang.String
*/
type IPSetDescriptorType = _IPSetDescriptorType | String

type IPSetDescriptorValue = String

type IPSetDescriptors = js.Array[IPSetDescriptor]

type IPSetSummaries = js.Array[IPSetSummary]

type IPSetUpdates = js.Array[IPSetUpdate]

type IPString = String

type IgnoreUnsupportedType = Boolean

type LogDestinationConfigs = js.Array[ResourceArn]

type LoggingConfigurations = js.Array[LoggingConfiguration]

type ManagedKey = String

type ManagedKeys = js.Array[ManagedKey]

type MatchFieldData = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.URI
  - typingsJapgolly.awsSdk.awsSdkStrings.QUERY_STRING
  - typingsJapgolly.awsSdk.awsSdkStrings.HEADER
  - typingsJapgolly.awsSdk.awsSdkStrings.METHOD
  - typingsJapgolly.awsSdk.awsSdkStrings.BODY
  - typingsJapgolly.awsSdk.awsSdkStrings.SINGLE_QUERY_ARG
  - typingsJapgolly.awsSdk.awsSdkStrings.ALL_QUERY_ARGS
  - java.lang.String
*/
type MatchFieldType = _MatchFieldType | String

type MetricName = String

type Negated = Boolean

type NextMarker = String

type PaginationLimit = Double

type PolicyString = String

type PopulationSize = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.EXACTLY
  - typingsJapgolly.awsSdk.awsSdkStrings.STARTS_WITH
  - typingsJapgolly.awsSdk.awsSdkStrings.ENDS_WITH
  - typingsJapgolly.awsSdk.awsSdkStrings.CONTAINS
  - typingsJapgolly.awsSdk.awsSdkStrings.CONTAINS_WORD
  - java.lang.String
*/
type PositionalConstraint = _PositionalConstraint | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.IPMatch
  - typingsJapgolly.awsSdk.awsSdkStrings.ByteMatch
  - typingsJapgolly.awsSdk.awsSdkStrings.SqlInjectionMatch
  - typingsJapgolly.awsSdk.awsSdkStrings.GeoMatch
  - typingsJapgolly.awsSdk.awsSdkStrings.SizeConstraint
  - typingsJapgolly.awsSdk.awsSdkStrings.XssMatch
  - typingsJapgolly.awsSdk.awsSdkStrings.RegexMatch
  - java.lang.String
*/
type PredicateType = _PredicateType | String

type Predicates = js.Array[Predicate]

type RateKey = IP | String

type RateLimit = Double

type RedactedFields = js.Array[FieldToMatch]

type RegexMatchSetSummaries = js.Array[RegexMatchSetSummary]

type RegexMatchSetUpdates = js.Array[RegexMatchSetUpdate]

type RegexMatchTuples = js.Array[RegexMatchTuple]

type RegexPatternSetSummaries = js.Array[RegexPatternSetSummary]

type RegexPatternSetUpdates = js.Array[RegexPatternSetUpdate]

type RegexPatternString = String

type RegexPatternStrings = js.Array[RegexPatternString]

type ResourceArn = String

type ResourceArns = js.Array[ResourceArn]

type ResourceId = String

type ResourceName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.APPLICATION_LOAD_BALANCER
  - typingsJapgolly.awsSdk.awsSdkStrings.API_GATEWAY
  - java.lang.String
*/
type ResourceType = _ResourceType | String

type RuleGroupSummaries = js.Array[RuleGroupSummary]

type RuleGroupUpdates = js.Array[RuleGroupUpdate]

type RulePriority = Double

type RuleSummaries = js.Array[RuleSummary]

type RuleUpdates = js.Array[RuleUpdate]

type S3BucketName = String

type S3ObjectUrl = String

type SampleWeight = Double

type SampledHTTPRequests = js.Array[SampledHTTPRequest]

type Size = Double

type SizeConstraintSetSummaries = js.Array[SizeConstraintSetSummary]

type SizeConstraintSetUpdates = js.Array[SizeConstraintSetUpdate]

type SizeConstraints = js.Array[SizeConstraint]

type SqlInjectionMatchSetSummaries = js.Array[SqlInjectionMatchSetSummary]

type SqlInjectionMatchSetUpdates = js.Array[SqlInjectionMatchSetUpdate]

type SqlInjectionMatchTuples = js.Array[SqlInjectionMatchTuple]

type SubscribedRuleGroupSummaries = js.Array[SubscribedRuleGroupSummary]

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NONE
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPRESS_WHITE_SPACE
  - typingsJapgolly.awsSdk.awsSdkStrings.HTML_ENTITY_DECODE
  - typingsJapgolly.awsSdk.awsSdkStrings.LOWERCASE
  - typingsJapgolly.awsSdk.awsSdkStrings.CMD_LINE
  - typingsJapgolly.awsSdk.awsSdkStrings.URL_DECODE
  - java.lang.String
*/
type TextTransformation = _TextTransformation | String

type Timestamp = js.Date

type URIString = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.BLOCK
  - typingsJapgolly.awsSdk.awsSdkStrings.ALLOW
  - typingsJapgolly.awsSdk.awsSdkStrings.COUNT
  - java.lang.String
*/
type WafActionType = _WafActionType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NONE
  - typingsJapgolly.awsSdk.awsSdkStrings.COUNT
  - java.lang.String
*/
type WafOverrideActionType = _WafOverrideActionType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.REGULAR
  - typingsJapgolly.awsSdk.awsSdkStrings.RATE_BASED
  - typingsJapgolly.awsSdk.awsSdkStrings.GROUP
  - java.lang.String
*/
type WafRuleType = _WafRuleType | String

type WebACLSummaries = js.Array[WebACLSummary]

type WebACLUpdates = js.Array[WebACLUpdate]

type XssMatchSetSummaries = js.Array[XssMatchSetSummary]

type XssMatchSetUpdates = js.Array[XssMatchSetUpdate]

type XssMatchTuples = js.Array[XssMatchTuple]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2016-11-28`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
