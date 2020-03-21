package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object wafv2Mod {
  type Action = java.lang.String
  type Boolean = scala.Boolean
  type CapacityUnit = scala.Double
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.wafv2Mod.ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.EQ
    - typingsJapgolly.awsSdk.awsSdkStrings.NE
    - typingsJapgolly.awsSdk.awsSdkStrings.LE
    - typingsJapgolly.awsSdk.awsSdkStrings.LT
    - typingsJapgolly.awsSdk.awsSdkStrings.GE
    - typingsJapgolly.awsSdk.awsSdkStrings.GT
    - java.lang.String
  */
  type ComparisonOperator = typingsJapgolly.awsSdk.wafv2Mod._ComparisonOperator | java.lang.String
  type ConsumedCapacity = scala.Double
  type Country = java.lang.String
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
  type CountryCode = typingsJapgolly.awsSdk.wafv2Mod._CountryCode | java.lang.String
  type CountryCodes = js.Array[typingsJapgolly.awsSdk.wafv2Mod.CountryCode]
  type EntityDescription = java.lang.String
  type EntityId = java.lang.String
  type EntityName = java.lang.String
  type ExcludedRules = js.Array[typingsJapgolly.awsSdk.wafv2Mod.ExcludedRule]
  type FieldToMatchData = java.lang.String
  type HTTPHeaders = js.Array[typingsJapgolly.awsSdk.wafv2Mod.HTTPHeader]
  type HTTPMethod = java.lang.String
  type HTTPVersion = java.lang.String
  type HeaderName = java.lang.String
  type HeaderValue = java.lang.String
  type IPAddress = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.IPV4
    - typingsJapgolly.awsSdk.awsSdkStrings.IPV6
    - java.lang.String
  */
  type IPAddressVersion = typingsJapgolly.awsSdk.wafv2Mod._IPAddressVersion | java.lang.String
  type IPAddresses = js.Array[typingsJapgolly.awsSdk.wafv2Mod.IPAddress]
  type IPSetSummaries = js.Array[typingsJapgolly.awsSdk.wafv2Mod.IPSetSummary]
  type IPString = java.lang.String
  type ListMaxItems = scala.Double
  type LockToken = java.lang.String
  type LogDestinationConfigs = js.Array[typingsJapgolly.awsSdk.wafv2Mod.ResourceArn]
  type LoggingConfigurations = js.Array[typingsJapgolly.awsSdk.wafv2Mod.LoggingConfiguration]
  type ManagedRuleGroupSummaries = js.Array[typingsJapgolly.awsSdk.wafv2Mod.ManagedRuleGroupSummary]
  type MetricName = java.lang.String
  type NextMarker = java.lang.String
  type PaginationLimit = scala.Double
  type PopulationSize = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.EXACTLY
    - typingsJapgolly.awsSdk.awsSdkStrings.STARTS_WITH
    - typingsJapgolly.awsSdk.awsSdkStrings.ENDS_WITH
    - typingsJapgolly.awsSdk.awsSdkStrings.CONTAINS
    - typingsJapgolly.awsSdk.awsSdkStrings.CONTAINS_WORD
    - java.lang.String
  */
  type PositionalConstraint = typingsJapgolly.awsSdk.wafv2Mod._PositionalConstraint | java.lang.String
  type RateBasedStatementAggregateKeyType = typingsJapgolly.awsSdk.awsSdkStrings.IP | java.lang.String
  type RateLimit = scala.Double
  type RedactedFields = js.Array[typingsJapgolly.awsSdk.wafv2Mod.FieldToMatch]
  type RegexPatternSetSummaries = js.Array[typingsJapgolly.awsSdk.wafv2Mod.RegexPatternSetSummary]
  type RegexPatternString = java.lang.String
  type RegularExpressionList = js.Array[typingsJapgolly.awsSdk.wafv2Mod.Regex]
  type ResourceArn = java.lang.String
  type ResourceArns = js.Array[typingsJapgolly.awsSdk.wafv2Mod.ResourceArn]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.APPLICATION_LOAD_BALANCER
    - typingsJapgolly.awsSdk.awsSdkStrings.API_GATEWAY
    - java.lang.String
  */
  type ResourceType = typingsJapgolly.awsSdk.wafv2Mod._ResourceType | java.lang.String
  type RuleGroupSummaries = js.Array[typingsJapgolly.awsSdk.wafv2Mod.RuleGroupSummary]
  type RulePriority = scala.Double
  type RuleSummaries = js.Array[typingsJapgolly.awsSdk.wafv2Mod.RuleSummary]
  type Rules = js.Array[typingsJapgolly.awsSdk.wafv2Mod.Rule]
  type SampleWeight = scala.Double
  type SampledHTTPRequests = js.Array[typingsJapgolly.awsSdk.wafv2Mod.SampledHTTPRequest]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CLOUDFRONT
    - typingsJapgolly.awsSdk.awsSdkStrings.REGIONAL
    - java.lang.String
  */
  type Scope = typingsJapgolly.awsSdk.wafv2Mod._Scope | java.lang.String
  type SearchString = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.wafv2Mod.Blob | java.lang.String
  type Size = scala.Double
  type Statements = js.Array[typingsJapgolly.awsSdk.wafv2Mod.Statement]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsJapgolly.awsSdk.wafv2Mod.TagKey]
  type TagList = js.Array[typingsJapgolly.awsSdk.wafv2Mod.Tag]
  type TagValue = java.lang.String
  type TextTransformationPriority = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NONE
    - typingsJapgolly.awsSdk.awsSdkStrings.COMPRESS_WHITE_SPACE
    - typingsJapgolly.awsSdk.awsSdkStrings.HTML_ENTITY_DECODE
    - typingsJapgolly.awsSdk.awsSdkStrings.LOWERCASE
    - typingsJapgolly.awsSdk.awsSdkStrings.CMD_LINE
    - typingsJapgolly.awsSdk.awsSdkStrings.URL_DECODE
    - java.lang.String
  */
  type TextTransformationType = typingsJapgolly.awsSdk.wafv2Mod._TextTransformationType | java.lang.String
  type TextTransformations = js.Array[typingsJapgolly.awsSdk.wafv2Mod.TextTransformation]
  type Timestamp = js.Date
  type URIString = java.lang.String
  type VendorName = java.lang.String
  type WebACLSummaries = js.Array[typingsJapgolly.awsSdk.wafv2Mod.WebACLSummary]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2019-07-29`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.wafv2Mod._apiVersion | java.lang.String
}
