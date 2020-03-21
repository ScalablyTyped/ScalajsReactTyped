package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object connectMod {
  type ARN = java.lang.String
  type AfterContactWorkTimeLimit = scala.Double
  type AgentFirstName = java.lang.String
  type AgentLastName = java.lang.String
  type AgentUsername = java.lang.String
  type AttributeName = java.lang.String
  type AttributeValue = java.lang.String
  type Attributes = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.connectMod.AttributeValue]
  type AutoAccept = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.VOICE
    - typingsJapgolly.awsSdk.awsSdkStrings.CHAT
    - java.lang.String
  */
  type Channel = typingsJapgolly.awsSdk.connectMod._Channel | java.lang.String
  type Channels = js.Array[typingsJapgolly.awsSdk.connectMod.Channel]
  type ChatContent = java.lang.String
  type ChatContentType = java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.connectMod.ClientApiVersions
  type ClientToken = java.lang.String
  type Comparison = typingsJapgolly.awsSdk.awsSdkStrings.LT | java.lang.String
  type ContactFlowId = java.lang.String
  type ContactFlowName = java.lang.String
  type ContactFlowSummaryList = js.Array[typingsJapgolly.awsSdk.connectMod.ContactFlowSummary]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CONTACT_FLOW
    - typingsJapgolly.awsSdk.awsSdkStrings.CUSTOMER_QUEUE
    - typingsJapgolly.awsSdk.awsSdkStrings.CUSTOMER_HOLD
    - typingsJapgolly.awsSdk.awsSdkStrings.CUSTOMER_WHISPER
    - typingsJapgolly.awsSdk.awsSdkStrings.AGENT_HOLD
    - typingsJapgolly.awsSdk.awsSdkStrings.AGENT_WHISPER
    - typingsJapgolly.awsSdk.awsSdkStrings.OUTBOUND_WHISPER
    - typingsJapgolly.awsSdk.awsSdkStrings.AGENT_TRANSFER
    - typingsJapgolly.awsSdk.awsSdkStrings.QUEUE_TRANSFER
    - java.lang.String
  */
  type ContactFlowType = typingsJapgolly.awsSdk.connectMod._ContactFlowType | java.lang.String
  type ContactFlowTypes = js.Array[typingsJapgolly.awsSdk.connectMod.ContactFlowType]
  type ContactId = java.lang.String
  type CurrentMetricDataCollections = js.Array[typingsJapgolly.awsSdk.connectMod.CurrentMetricData]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.AGENTS_ONLINE
    - typingsJapgolly.awsSdk.awsSdkStrings.AGENTS_AVAILABLE
    - typingsJapgolly.awsSdk.awsSdkStrings.AGENTS_ON_CALL
    - typingsJapgolly.awsSdk.awsSdkStrings.AGENTS_NON_PRODUCTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.AGENTS_AFTER_CONTACT_WORK
    - typingsJapgolly.awsSdk.awsSdkStrings.AGENTS_ERROR
    - typingsJapgolly.awsSdk.awsSdkStrings.AGENTS_STAFFED
    - typingsJapgolly.awsSdk.awsSdkStrings.CONTACTS_IN_QUEUE
    - typingsJapgolly.awsSdk.awsSdkStrings.OLDEST_CONTACT_AGE
    - typingsJapgolly.awsSdk.awsSdkStrings.CONTACTS_SCHEDULED
    - typingsJapgolly.awsSdk.awsSdkStrings.AGENTS_ON_CONTACT
    - typingsJapgolly.awsSdk.awsSdkStrings.SLOTS_ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.SLOTS_AVAILABLE
    - java.lang.String
  */
  type CurrentMetricName = typingsJapgolly.awsSdk.connectMod._CurrentMetricName | java.lang.String
  type CurrentMetricResults = js.Array[typingsJapgolly.awsSdk.connectMod.CurrentMetricResult]
  type CurrentMetrics = js.Array[typingsJapgolly.awsSdk.connectMod.CurrentMetric]
  type DirectoryUserId = java.lang.String
  type DisplayName = java.lang.String
  type Email = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.QUEUE
    - typingsJapgolly.awsSdk.awsSdkStrings.CHANNEL
    - java.lang.String
  */
  type Grouping = typingsJapgolly.awsSdk.connectMod._Grouping | java.lang.String
  type Groupings = js.Array[typingsJapgolly.awsSdk.connectMod.Grouping]
  type HierarchyGroupId = java.lang.String
  type HierarchyGroupName = java.lang.String
  type HierarchyGroupSummaryList = js.Array[typingsJapgolly.awsSdk.connectMod.HierarchyGroupSummary]
  type HierarchyLevelId = java.lang.String
  type HierarchyLevelName = java.lang.String
  type HistoricalMetricDataCollections = js.Array[typingsJapgolly.awsSdk.connectMod.HistoricalMetricData]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CONTACTS_QUEUED
    - typingsJapgolly.awsSdk.awsSdkStrings.CONTACTS_HANDLED
    - typingsJapgolly.awsSdk.awsSdkStrings.CONTACTS_ABANDONED
    - typingsJapgolly.awsSdk.awsSdkStrings.CONTACTS_CONSULTED
    - typingsJapgolly.awsSdk.awsSdkStrings.CONTACTS_AGENT_HUNG_UP_FIRST
    - typingsJapgolly.awsSdk.awsSdkStrings.CONTACTS_HANDLED_INCOMING
    - typingsJapgolly.awsSdk.awsSdkStrings.CONTACTS_HANDLED_OUTBOUND
    - typingsJapgolly.awsSdk.awsSdkStrings.CONTACTS_HOLD_ABANDONS
    - typingsJapgolly.awsSdk.awsSdkStrings.CONTACTS_TRANSFERRED_IN
    - typingsJapgolly.awsSdk.awsSdkStrings.CONTACTS_TRANSFERRED_OUT
    - typingsJapgolly.awsSdk.awsSdkStrings.CONTACTS_TRANSFERRED_IN_FROM_QUEUE
    - typingsJapgolly.awsSdk.awsSdkStrings.CONTACTS_TRANSFERRED_OUT_FROM_QUEUE
    - typingsJapgolly.awsSdk.awsSdkStrings.CONTACTS_MISSED
    - typingsJapgolly.awsSdk.awsSdkStrings.CALLBACK_CONTACTS_HANDLED
    - typingsJapgolly.awsSdk.awsSdkStrings.API_CONTACTS_HANDLED
    - typingsJapgolly.awsSdk.awsSdkStrings.OCCUPANCY
    - typingsJapgolly.awsSdk.awsSdkStrings.HANDLE_TIME
    - typingsJapgolly.awsSdk.awsSdkStrings.AFTER_CONTACT_WORK_TIME
    - typingsJapgolly.awsSdk.awsSdkStrings.QUEUED_TIME
    - typingsJapgolly.awsSdk.awsSdkStrings.ABANDON_TIME
    - typingsJapgolly.awsSdk.awsSdkStrings.QUEUE_ANSWER_TIME
    - typingsJapgolly.awsSdk.awsSdkStrings.HOLD_TIME
    - typingsJapgolly.awsSdk.awsSdkStrings.INTERACTION_TIME
    - typingsJapgolly.awsSdk.awsSdkStrings.INTERACTION_AND_HOLD_TIME
    - typingsJapgolly.awsSdk.awsSdkStrings.SERVICE_LEVEL
    - java.lang.String
  */
  type HistoricalMetricName = typingsJapgolly.awsSdk.connectMod._HistoricalMetricName | java.lang.String
  type HistoricalMetricResults = js.Array[typingsJapgolly.awsSdk.connectMod.HistoricalMetricResult]
  type HistoricalMetrics = js.Array[typingsJapgolly.awsSdk.connectMod.HistoricalMetric]
  type HoursOfOperationId = java.lang.String
  type HoursOfOperationName = java.lang.String
  type HoursOfOperationSummaryList = js.Array[typingsJapgolly.awsSdk.connectMod.HoursOfOperationSummary]
  type InstanceId = java.lang.String
  type MaxResult100 = scala.Double
  type MaxResult1000 = scala.Double
  type NextToken = java.lang.String
  type ParticipantId = java.lang.String
  type ParticipantToken = java.lang.String
  type Password = java.lang.String
  type PhoneNumber = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.AF
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
    - typingsJapgolly.awsSdk.awsSdkStrings.BA
    - typingsJapgolly.awsSdk.awsSdkStrings.BW
    - typingsJapgolly.awsSdk.awsSdkStrings.BR
    - typingsJapgolly.awsSdk.awsSdkStrings.IO
    - typingsJapgolly.awsSdk.awsSdkStrings.VG
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
    - typingsJapgolly.awsSdk.awsSdkStrings.CK
    - typingsJapgolly.awsSdk.awsSdkStrings.CR
    - typingsJapgolly.awsSdk.awsSdkStrings.HR
    - typingsJapgolly.awsSdk.awsSdkStrings.CU
    - typingsJapgolly.awsSdk.awsSdkStrings.CW
    - typingsJapgolly.awsSdk.awsSdkStrings.CY
    - typingsJapgolly.awsSdk.awsSdkStrings.CZ
    - typingsJapgolly.awsSdk.awsSdkStrings.CD
    - typingsJapgolly.awsSdk.awsSdkStrings.DK
    - typingsJapgolly.awsSdk.awsSdkStrings.DJ
    - typingsJapgolly.awsSdk.awsSdkStrings.DM
    - typingsJapgolly.awsSdk.awsSdkStrings.DO
    - typingsJapgolly.awsSdk.awsSdkStrings.TL
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
    - typingsJapgolly.awsSdk.awsSdkStrings.PF
    - typingsJapgolly.awsSdk.awsSdkStrings.GA
    - typingsJapgolly.awsSdk.awsSdkStrings.GM
    - typingsJapgolly.awsSdk.awsSdkStrings.GE
    - typingsJapgolly.awsSdk.awsSdkStrings.DE
    - typingsJapgolly.awsSdk.awsSdkStrings.GH
    - typingsJapgolly.awsSdk.awsSdkStrings.GI
    - typingsJapgolly.awsSdk.awsSdkStrings.GR
    - typingsJapgolly.awsSdk.awsSdkStrings.GL
    - typingsJapgolly.awsSdk.awsSdkStrings.GD
    - typingsJapgolly.awsSdk.awsSdkStrings.GU
    - typingsJapgolly.awsSdk.awsSdkStrings.GT
    - typingsJapgolly.awsSdk.awsSdkStrings.GG
    - typingsJapgolly.awsSdk.awsSdkStrings.GN
    - typingsJapgolly.awsSdk.awsSdkStrings.GW
    - typingsJapgolly.awsSdk.awsSdkStrings.GY
    - typingsJapgolly.awsSdk.awsSdkStrings.HT
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
    - typingsJapgolly.awsSdk.awsSdkStrings.CI
    - typingsJapgolly.awsSdk.awsSdkStrings.JM
    - typingsJapgolly.awsSdk.awsSdkStrings.JP
    - typingsJapgolly.awsSdk.awsSdkStrings.JE
    - typingsJapgolly.awsSdk.awsSdkStrings.JO
    - typingsJapgolly.awsSdk.awsSdkStrings.KZ
    - typingsJapgolly.awsSdk.awsSdkStrings.KE
    - typingsJapgolly.awsSdk.awsSdkStrings.KI
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
    - typingsJapgolly.awsSdk.awsSdkStrings.AN
    - typingsJapgolly.awsSdk.awsSdkStrings.NC
    - typingsJapgolly.awsSdk.awsSdkStrings.NZ
    - typingsJapgolly.awsSdk.awsSdkStrings.NI
    - typingsJapgolly.awsSdk.awsSdkStrings.NE
    - typingsJapgolly.awsSdk.awsSdkStrings.NG
    - typingsJapgolly.awsSdk.awsSdkStrings.NU
    - typingsJapgolly.awsSdk.awsSdkStrings.KP
    - typingsJapgolly.awsSdk.awsSdkStrings.MP
    - typingsJapgolly.awsSdk.awsSdkStrings.NO
    - typingsJapgolly.awsSdk.awsSdkStrings.OM
    - typingsJapgolly.awsSdk.awsSdkStrings.PK
    - typingsJapgolly.awsSdk.awsSdkStrings.PW
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
    - typingsJapgolly.awsSdk.awsSdkStrings.CG
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
    - typingsJapgolly.awsSdk.awsSdkStrings.KR
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
    - typingsJapgolly.awsSdk.awsSdkStrings.TG
    - typingsJapgolly.awsSdk.awsSdkStrings.TK
    - typingsJapgolly.awsSdk.awsSdkStrings.TO
    - typingsJapgolly.awsSdk.awsSdkStrings.TT
    - typingsJapgolly.awsSdk.awsSdkStrings.TN
    - typingsJapgolly.awsSdk.awsSdkStrings.TR
    - typingsJapgolly.awsSdk.awsSdkStrings.TM
    - typingsJapgolly.awsSdk.awsSdkStrings.TC
    - typingsJapgolly.awsSdk.awsSdkStrings.TV
    - typingsJapgolly.awsSdk.awsSdkStrings.VI
    - typingsJapgolly.awsSdk.awsSdkStrings.UG
    - typingsJapgolly.awsSdk.awsSdkStrings.UA
    - typingsJapgolly.awsSdk.awsSdkStrings.AE
    - typingsJapgolly.awsSdk.awsSdkStrings.GB
    - typingsJapgolly.awsSdk.awsSdkStrings.US
    - typingsJapgolly.awsSdk.awsSdkStrings.UY
    - typingsJapgolly.awsSdk.awsSdkStrings.UZ
    - typingsJapgolly.awsSdk.awsSdkStrings.VU
    - typingsJapgolly.awsSdk.awsSdkStrings.VA
    - typingsJapgolly.awsSdk.awsSdkStrings.VE
    - typingsJapgolly.awsSdk.awsSdkStrings.VN
    - typingsJapgolly.awsSdk.awsSdkStrings.WF
    - typingsJapgolly.awsSdk.awsSdkStrings.EH
    - typingsJapgolly.awsSdk.awsSdkStrings.YE
    - typingsJapgolly.awsSdk.awsSdkStrings.ZM
    - typingsJapgolly.awsSdk.awsSdkStrings.ZW
    - java.lang.String
  */
  type PhoneNumberCountryCode = typingsJapgolly.awsSdk.connectMod._PhoneNumberCountryCode | java.lang.String
  type PhoneNumberCountryCodes = js.Array[typingsJapgolly.awsSdk.connectMod.PhoneNumberCountryCode]
  type PhoneNumberId = java.lang.String
  type PhoneNumberSummaryList = js.Array[typingsJapgolly.awsSdk.connectMod.PhoneNumberSummary]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.TOLL_FREE
    - typingsJapgolly.awsSdk.awsSdkStrings.DID
    - java.lang.String
  */
  type PhoneNumberType = typingsJapgolly.awsSdk.connectMod._PhoneNumberType | java.lang.String
  type PhoneNumberTypes = js.Array[typingsJapgolly.awsSdk.connectMod.PhoneNumberType]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SOFT_PHONE
    - typingsJapgolly.awsSdk.awsSdkStrings.DESK_PHONE
    - java.lang.String
  */
  type PhoneType = typingsJapgolly.awsSdk.connectMod._PhoneType | java.lang.String
  type QueueId = java.lang.String
  type QueueName = java.lang.String
  type QueueSummaryList = js.Array[typingsJapgolly.awsSdk.connectMod.QueueSummary]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.STANDARD
    - typingsJapgolly.awsSdk.awsSdkStrings.AGENT
    - java.lang.String
  */
  type QueueType = typingsJapgolly.awsSdk.connectMod._QueueType | java.lang.String
  type QueueTypes = js.Array[typingsJapgolly.awsSdk.connectMod.QueueType]
  type Queues = js.Array[typingsJapgolly.awsSdk.connectMod.QueueId]
  type RoutingProfileId = java.lang.String
  type RoutingProfileName = java.lang.String
  type RoutingProfileSummaryList = js.Array[typingsJapgolly.awsSdk.connectMod.RoutingProfileSummary]
  type SecurityProfileId = java.lang.String
  type SecurityProfileIds = js.Array[typingsJapgolly.awsSdk.connectMod.SecurityProfileId]
  type SecurityProfileName = java.lang.String
  type SecurityProfileSummaryList = js.Array[typingsJapgolly.awsSdk.connectMod.SecurityProfileSummary]
  type SecurityToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SUM
    - typingsJapgolly.awsSdk.awsSdkStrings.MAX
    - typingsJapgolly.awsSdk.awsSdkStrings.AVG
    - java.lang.String
  */
  type Statistic = typingsJapgolly.awsSdk.connectMod._Statistic | java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsJapgolly.awsSdk.connectMod.TagKey]
  type TagMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.connectMod.TagValue]
  type TagValue = java.lang.String
  type ThresholdValue = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SECONDS
    - typingsJapgolly.awsSdk.awsSdkStrings.COUNT
    - typingsJapgolly.awsSdk.awsSdkStrings.PERCENT
    - java.lang.String
  */
  type Unit = typingsJapgolly.awsSdk.connectMod._Unit | java.lang.String
  type UserId = java.lang.String
  type UserSummaryList = js.Array[typingsJapgolly.awsSdk.connectMod.UserSummary]
  type Value = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2017-08-08`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.connectMod._apiVersion | java.lang.String
  type timestamp = js.Date
}
