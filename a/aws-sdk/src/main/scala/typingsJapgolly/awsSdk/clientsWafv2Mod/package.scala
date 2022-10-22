package typingsJapgolly.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Action = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ALLOW
  - typingsJapgolly.awsSdk.awsSdkStrings.BLOCK
  - typingsJapgolly.awsSdk.awsSdkStrings.COUNT
  - typingsJapgolly.awsSdk.awsSdkStrings.CAPTCHA
  - typingsJapgolly.awsSdk.awsSdkStrings.EXCLUDED_AS_COUNT
  - java.lang.String
*/
type ActionValue = _ActionValue | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.MATCH
  - typingsJapgolly.awsSdk.awsSdkStrings.NO_MATCH
  - typingsJapgolly.awsSdk.awsSdkStrings.EVALUATE_AS_STRING
  - java.lang.String
*/
type BodyParsingFallbackBehavior = _BodyParsingFallbackBehavior | String

type Boolean = scala.Boolean

type CapacityUnit = Double

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

type Conditions = js.Array[Condition]

type ConsumedCapacity = Double

type CookieNames = js.Array[SingleCookieName]

type Country = String

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
  - typingsJapgolly.awsSdk.awsSdkStrings.XK
  - java.lang.String
*/
type CountryCode = _CountryCode | String

type CountryCodes = js.Array[CountryCode]

type CustomHTTPHeaderName = String

type CustomHTTPHeaderValue = String

type CustomHTTPHeaders = js.Array[CustomHTTPHeader]

type CustomResponseBodies = StringDictionary[CustomResponseBody]

type DownloadUrl = String

type EntityDescription = String

type EntityId = String

type EntityName = String

type ExcludedRules = js.Array[ExcludedRule]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.TOKEN_MISSING
  - typingsJapgolly.awsSdk.awsSdkStrings.TOKEN_EXPIRED
  - java.lang.String
*/
type FailureReason = _FailureReason | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.MATCH
  - typingsJapgolly.awsSdk.awsSdkStrings.NO_MATCH
  - java.lang.String
*/
type FallbackBehavior = _FallbackBehavior | String

type FieldIdentifier = String

type FieldToMatchData = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.KEEP
  - typingsJapgolly.awsSdk.awsSdkStrings.DROP
  - java.lang.String
*/
type FilterBehavior = _FilterBehavior | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.MEETS_ALL
  - typingsJapgolly.awsSdk.awsSdkStrings.MEETS_ANY
  - java.lang.String
*/
type FilterRequirement = _FilterRequirement | String

type Filters = js.Array[Filter]

type FirewallManagerRuleGroups = js.Array[FirewallManagerRuleGroup]

type ForwardedIPHeaderName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.FIRST
  - typingsJapgolly.awsSdk.awsSdkStrings.LAST
  - typingsJapgolly.awsSdk.awsSdkStrings.ANY
  - java.lang.String
*/
type ForwardedIPPosition = _ForwardedIPPosition | String

type HTTPHeaders = js.Array[HTTPHeader]

type HTTPMethod = String

type HTTPVersion = String

type HeaderName = String

type HeaderNames = js.Array[FieldToMatchData]

type HeaderValue = String

type IPAddress = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.IPV4
  - typingsJapgolly.awsSdk.awsSdkStrings.IPV6
  - java.lang.String
*/
type IPAddressVersion = _IPAddressVersion | String

type IPAddresses = js.Array[IPAddress]

type IPSetSummaries = js.Array[IPSetSummary]

type IPString = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ALL
  - typingsJapgolly.awsSdk.awsSdkStrings.KEY
  - typingsJapgolly.awsSdk.awsSdkStrings.VALUE
  - java.lang.String
*/
type JsonMatchScope = _JsonMatchScope | String

type JsonPointerPath = String

type JsonPointerPaths = js.Array[JsonPointerPath]

type LabelMatchKey = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.LABEL
  - typingsJapgolly.awsSdk.awsSdkStrings.NAMESPACE
  - java.lang.String
*/
type LabelMatchScope = _LabelMatchScope | String

type LabelName = String

type LabelSummaries = js.Array[LabelSummary]

type Labels = js.Array[Label]

type ListMaxItems = Double

type LockToken = String

type LogDestinationConfigs = js.Array[ResourceArn]

type LoggingConfigurations = js.Array[LoggingConfiguration]

type LoginPathString = String

type ManagedRuleGroupConfigs = js.Array[ManagedRuleGroupConfig]

type ManagedRuleGroupSummaries = js.Array[ManagedRuleGroupSummary]

type ManagedRuleGroupVersions = js.Array[ManagedRuleGroupVersion]

type ManagedRuleSetSummaries = js.Array[ManagedRuleSetSummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ALL
  - typingsJapgolly.awsSdk.awsSdkStrings.KEY
  - typingsJapgolly.awsSdk.awsSdkStrings.VALUE
  - java.lang.String
*/
type MapMatchScope = _MapMatchScope | String

type MetricName = String

type NextMarker = String

type OutputUrl = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CONTINUE
  - typingsJapgolly.awsSdk.awsSdkStrings.MATCH
  - typingsJapgolly.awsSdk.awsSdkStrings.NO_MATCH
  - java.lang.String
*/
type OversizeHandling = _OversizeHandling | String

type PaginationLimit = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.JSON
  - typingsJapgolly.awsSdk.awsSdkStrings.FORM_ENCODED
  - java.lang.String
*/
type PayloadType = _PayloadType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.IOS
  - typingsJapgolly.awsSdk.awsSdkStrings.ANDROID
  - java.lang.String
*/
type Platform = _Platform | String

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

type PublishedVersions = StringDictionary[ManagedRuleSetVersion]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.IP
  - typingsJapgolly.awsSdk.awsSdkStrings.FORWARDED_IP
  - java.lang.String
*/
type RateBasedStatementAggregateKeyType = _RateBasedStatementAggregateKeyType | String

type RateLimit = Double

type RedactedFields = js.Array[FieldToMatch]

type RegexPatternSetSummaries = js.Array[RegexPatternSetSummary]

type RegexPatternString = String

type RegularExpressionList = js.Array[Regex]

type ReleaseNotes = String

type ReleaseSummaries = js.Array[ReleaseSummary]

type ResourceArn = String

type ResourceArns = js.Array[ResourceArn]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.APPLICATION_LOAD_BALANCER
  - typingsJapgolly.awsSdk.awsSdkStrings.API_GATEWAY
  - typingsJapgolly.awsSdk.awsSdkStrings.APPSYNC
  - typingsJapgolly.awsSdk.awsSdkStrings.COGNITO_USER_POOL
  - java.lang.String
*/
type ResourceType = _ResourceType | String

type ResponseCode = Double

type ResponseContent = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.TEXT_PLAIN
  - typingsJapgolly.awsSdk.awsSdkStrings.TEXT_HTML
  - typingsJapgolly.awsSdk.awsSdkStrings.APPLICATION_JSON
  - java.lang.String
*/
type ResponseContentType = _ResponseContentType | String

type ResponseStatusCode = Double

type RuleGroupSummaries = js.Array[RuleGroupSummary]

type RulePriority = Double

type RuleSummaries = js.Array[RuleSummary]

type Rules = js.Array[Rule]

type SampleWeight = Double

type SampledHTTPRequests = js.Array[SampledHTTPRequest]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CLOUDFRONT
  - typingsJapgolly.awsSdk.awsSdkStrings.REGIONAL
  - java.lang.String
*/
type Scope = _Scope | String

type SearchString = Buffer | js.typedarray.Uint8Array | Blob | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.LOW
  - typingsJapgolly.awsSdk.awsSdkStrings.HIGH
  - java.lang.String
*/
type SensitivityLevel = _SensitivityLevel | String

type SingleCookieName = String

type Size = Double

type SolveTimestamp = Double

type Statements = js.Array[Statement]

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = String

type TextTransformationPriority = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NONE
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPRESS_WHITE_SPACE
  - typingsJapgolly.awsSdk.awsSdkStrings.HTML_ENTITY_DECODE
  - typingsJapgolly.awsSdk.awsSdkStrings.LOWERCASE
  - typingsJapgolly.awsSdk.awsSdkStrings.CMD_LINE
  - typingsJapgolly.awsSdk.awsSdkStrings.URL_DECODE
  - typingsJapgolly.awsSdk.awsSdkStrings.BASE64_DECODE
  - typingsJapgolly.awsSdk.awsSdkStrings.HEX_DECODE
  - typingsJapgolly.awsSdk.awsSdkStrings.MD5
  - typingsJapgolly.awsSdk.awsSdkStrings.REPLACE_COMMENTS
  - typingsJapgolly.awsSdk.awsSdkStrings.ESCAPE_SEQ_DECODE
  - typingsJapgolly.awsSdk.awsSdkStrings.SQL_HEX_DECODE
  - typingsJapgolly.awsSdk.awsSdkStrings.CSS_DECODE
  - typingsJapgolly.awsSdk.awsSdkStrings.JS_DECODE
  - typingsJapgolly.awsSdk.awsSdkStrings.NORMALIZE_PATH
  - typingsJapgolly.awsSdk.awsSdkStrings.NORMALIZE_PATH_WIN
  - typingsJapgolly.awsSdk.awsSdkStrings.REMOVE_NULLS
  - typingsJapgolly.awsSdk.awsSdkStrings.REPLACE_NULLS
  - typingsJapgolly.awsSdk.awsSdkStrings.BASE64_DECODE_EXT
  - typingsJapgolly.awsSdk.awsSdkStrings.URL_DECODE_UNI
  - typingsJapgolly.awsSdk.awsSdkStrings.UTF8_TO_UNICODE
  - java.lang.String
*/
type TextTransformationType = _TextTransformationType | String

type TextTransformations = js.Array[TextTransformation]

type TimeWindowDay = Double

type TimeWindowSecond = Double

type Timestamp = js.Date

type URIString = String

type VendorName = String

type VersionKeyString = String

type VersionsToPublish = StringDictionary[VersionToPublish]

type WebACLSummaries = js.Array[WebACLSummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2019-07-29`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
