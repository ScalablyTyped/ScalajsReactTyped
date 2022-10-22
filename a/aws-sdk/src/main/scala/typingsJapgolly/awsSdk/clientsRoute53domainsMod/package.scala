package typingsJapgolly.awsSdk.clientsRoute53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccountId = java.lang.String

type AddressLine = java.lang.String

type BillingRecords = js.Array[BillingRecord]

type Boolean = scala.Boolean

type City = java.lang.String

type ContactName = java.lang.String

type ContactNumber = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PERSON
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPANY
  - typingsJapgolly.awsSdk.awsSdkStrings.ASSOCIATION
  - typingsJapgolly.awsSdk.awsSdkStrings.PUBLIC_BODY
  - typingsJapgolly.awsSdk.awsSdkStrings.RESELLER
  - java.lang.String
*/
type ContactType = _ContactType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AC
  - typingsJapgolly.awsSdk.awsSdkStrings.AD
  - typingsJapgolly.awsSdk.awsSdkStrings.AE
  - typingsJapgolly.awsSdk.awsSdkStrings.AF
  - typingsJapgolly.awsSdk.awsSdkStrings.AG
  - typingsJapgolly.awsSdk.awsSdkStrings.AI
  - typingsJapgolly.awsSdk.awsSdkStrings.AL
  - typingsJapgolly.awsSdk.awsSdkStrings.AM
  - typingsJapgolly.awsSdk.awsSdkStrings.AN
  - typingsJapgolly.awsSdk.awsSdkStrings.AO
  - typingsJapgolly.awsSdk.awsSdkStrings.AQ
  - typingsJapgolly.awsSdk.awsSdkStrings.AR
  - typingsJapgolly.awsSdk.awsSdkStrings.AS
  - typingsJapgolly.awsSdk.awsSdkStrings.AT
  - typingsJapgolly.awsSdk.awsSdkStrings.AU
  - typingsJapgolly.awsSdk.awsSdkStrings.AW
  - typingsJapgolly.awsSdk.awsSdkStrings.AX
  - typingsJapgolly.awsSdk.awsSdkStrings.AZ
  - typingsJapgolly.awsSdk.awsSdkStrings.BA
  - typingsJapgolly.awsSdk.awsSdkStrings.BB
  - typingsJapgolly.awsSdk.awsSdkStrings.BD
  - typingsJapgolly.awsSdk.awsSdkStrings.BE
  - typingsJapgolly.awsSdk.awsSdkStrings.BF
  - typingsJapgolly.awsSdk.awsSdkStrings.BG
  - typingsJapgolly.awsSdk.awsSdkStrings.BH
  - typingsJapgolly.awsSdk.awsSdkStrings.BI
  - typingsJapgolly.awsSdk.awsSdkStrings.BJ
  - typingsJapgolly.awsSdk.awsSdkStrings.BL
  - typingsJapgolly.awsSdk.awsSdkStrings.BM
  - typingsJapgolly.awsSdk.awsSdkStrings.BN
  - typingsJapgolly.awsSdk.awsSdkStrings.BO
  - typingsJapgolly.awsSdk.awsSdkStrings.BQ
  - typingsJapgolly.awsSdk.awsSdkStrings.BR
  - typingsJapgolly.awsSdk.awsSdkStrings.BS
  - typingsJapgolly.awsSdk.awsSdkStrings.BT
  - typingsJapgolly.awsSdk.awsSdkStrings.BV
  - typingsJapgolly.awsSdk.awsSdkStrings.BW
  - typingsJapgolly.awsSdk.awsSdkStrings.BY
  - typingsJapgolly.awsSdk.awsSdkStrings.BZ
  - typingsJapgolly.awsSdk.awsSdkStrings.CA
  - typingsJapgolly.awsSdk.awsSdkStrings.CC
  - typingsJapgolly.awsSdk.awsSdkStrings.CD
  - typingsJapgolly.awsSdk.awsSdkStrings.CF
  - typingsJapgolly.awsSdk.awsSdkStrings.CG
  - typingsJapgolly.awsSdk.awsSdkStrings.CH
  - typingsJapgolly.awsSdk.awsSdkStrings.CI
  - typingsJapgolly.awsSdk.awsSdkStrings.CK
  - typingsJapgolly.awsSdk.awsSdkStrings.CL
  - typingsJapgolly.awsSdk.awsSdkStrings.CM
  - typingsJapgolly.awsSdk.awsSdkStrings.CN
  - typingsJapgolly.awsSdk.awsSdkStrings.CO
  - typingsJapgolly.awsSdk.awsSdkStrings.CR
  - typingsJapgolly.awsSdk.awsSdkStrings.CU
  - typingsJapgolly.awsSdk.awsSdkStrings.CV
  - typingsJapgolly.awsSdk.awsSdkStrings.CW
  - typingsJapgolly.awsSdk.awsSdkStrings.CX
  - typingsJapgolly.awsSdk.awsSdkStrings.CY
  - typingsJapgolly.awsSdk.awsSdkStrings.CZ
  - typingsJapgolly.awsSdk.awsSdkStrings.DE
  - typingsJapgolly.awsSdk.awsSdkStrings.DJ
  - typingsJapgolly.awsSdk.awsSdkStrings.DK
  - typingsJapgolly.awsSdk.awsSdkStrings.DM
  - typingsJapgolly.awsSdk.awsSdkStrings.DO
  - typingsJapgolly.awsSdk.awsSdkStrings.DZ
  - typingsJapgolly.awsSdk.awsSdkStrings.EC
  - typingsJapgolly.awsSdk.awsSdkStrings.EE
  - typingsJapgolly.awsSdk.awsSdkStrings.EG
  - typingsJapgolly.awsSdk.awsSdkStrings.EH
  - typingsJapgolly.awsSdk.awsSdkStrings.ER
  - typingsJapgolly.awsSdk.awsSdkStrings.ES
  - typingsJapgolly.awsSdk.awsSdkStrings.ET
  - typingsJapgolly.awsSdk.awsSdkStrings.FI
  - typingsJapgolly.awsSdk.awsSdkStrings.FJ
  - typingsJapgolly.awsSdk.awsSdkStrings.FK
  - typingsJapgolly.awsSdk.awsSdkStrings.FM
  - typingsJapgolly.awsSdk.awsSdkStrings.FO
  - typingsJapgolly.awsSdk.awsSdkStrings.FR
  - typingsJapgolly.awsSdk.awsSdkStrings.GA
  - typingsJapgolly.awsSdk.awsSdkStrings.GB
  - typingsJapgolly.awsSdk.awsSdkStrings.GD
  - typingsJapgolly.awsSdk.awsSdkStrings.GE
  - typingsJapgolly.awsSdk.awsSdkStrings.GF
  - typingsJapgolly.awsSdk.awsSdkStrings.GG
  - typingsJapgolly.awsSdk.awsSdkStrings.GH
  - typingsJapgolly.awsSdk.awsSdkStrings.GI
  - typingsJapgolly.awsSdk.awsSdkStrings.GL
  - typingsJapgolly.awsSdk.awsSdkStrings.GM
  - typingsJapgolly.awsSdk.awsSdkStrings.GN
  - typingsJapgolly.awsSdk.awsSdkStrings.GP
  - typingsJapgolly.awsSdk.awsSdkStrings.GQ
  - typingsJapgolly.awsSdk.awsSdkStrings.GR
  - typingsJapgolly.awsSdk.awsSdkStrings.GS
  - typingsJapgolly.awsSdk.awsSdkStrings.GT
  - typingsJapgolly.awsSdk.awsSdkStrings.GU
  - typingsJapgolly.awsSdk.awsSdkStrings.GW
  - typingsJapgolly.awsSdk.awsSdkStrings.GY
  - typingsJapgolly.awsSdk.awsSdkStrings.HK
  - typingsJapgolly.awsSdk.awsSdkStrings.HM
  - typingsJapgolly.awsSdk.awsSdkStrings.HN
  - typingsJapgolly.awsSdk.awsSdkStrings.HR
  - typingsJapgolly.awsSdk.awsSdkStrings.HT
  - typingsJapgolly.awsSdk.awsSdkStrings.HU
  - typingsJapgolly.awsSdk.awsSdkStrings.ID
  - typingsJapgolly.awsSdk.awsSdkStrings.IE
  - typingsJapgolly.awsSdk.awsSdkStrings.IL
  - typingsJapgolly.awsSdk.awsSdkStrings.IM
  - typingsJapgolly.awsSdk.awsSdkStrings.IN
  - typingsJapgolly.awsSdk.awsSdkStrings.IO
  - typingsJapgolly.awsSdk.awsSdkStrings.IQ
  - typingsJapgolly.awsSdk.awsSdkStrings.IR
  - typingsJapgolly.awsSdk.awsSdkStrings.IS
  - typingsJapgolly.awsSdk.awsSdkStrings.IT
  - typingsJapgolly.awsSdk.awsSdkStrings.JE
  - typingsJapgolly.awsSdk.awsSdkStrings.JM
  - typingsJapgolly.awsSdk.awsSdkStrings.JO
  - typingsJapgolly.awsSdk.awsSdkStrings.JP
  - typingsJapgolly.awsSdk.awsSdkStrings.KE
  - typingsJapgolly.awsSdk.awsSdkStrings.KG
  - typingsJapgolly.awsSdk.awsSdkStrings.KH
  - typingsJapgolly.awsSdk.awsSdkStrings.KI
  - typingsJapgolly.awsSdk.awsSdkStrings.KM
  - typingsJapgolly.awsSdk.awsSdkStrings.KN
  - typingsJapgolly.awsSdk.awsSdkStrings.KP
  - typingsJapgolly.awsSdk.awsSdkStrings.KR
  - typingsJapgolly.awsSdk.awsSdkStrings.KW
  - typingsJapgolly.awsSdk.awsSdkStrings.KY
  - typingsJapgolly.awsSdk.awsSdkStrings.KZ
  - typingsJapgolly.awsSdk.awsSdkStrings.LA
  - typingsJapgolly.awsSdk.awsSdkStrings.LB
  - typingsJapgolly.awsSdk.awsSdkStrings.LC
  - typingsJapgolly.awsSdk.awsSdkStrings.LI
  - typingsJapgolly.awsSdk.awsSdkStrings.LK
  - typingsJapgolly.awsSdk.awsSdkStrings.LR
  - typingsJapgolly.awsSdk.awsSdkStrings.LS
  - typingsJapgolly.awsSdk.awsSdkStrings.LT
  - typingsJapgolly.awsSdk.awsSdkStrings.LU
  - typingsJapgolly.awsSdk.awsSdkStrings.LV
  - typingsJapgolly.awsSdk.awsSdkStrings.LY
  - typingsJapgolly.awsSdk.awsSdkStrings.MA
  - typingsJapgolly.awsSdk.awsSdkStrings.MC
  - typingsJapgolly.awsSdk.awsSdkStrings.MD
  - typingsJapgolly.awsSdk.awsSdkStrings.ME
  - typingsJapgolly.awsSdk.awsSdkStrings.MF
  - typingsJapgolly.awsSdk.awsSdkStrings.MG
  - typingsJapgolly.awsSdk.awsSdkStrings.MH
  - typingsJapgolly.awsSdk.awsSdkStrings.MK
  - typingsJapgolly.awsSdk.awsSdkStrings.ML
  - typingsJapgolly.awsSdk.awsSdkStrings.MM
  - typingsJapgolly.awsSdk.awsSdkStrings.MN
  - typingsJapgolly.awsSdk.awsSdkStrings.MO
  - typingsJapgolly.awsSdk.awsSdkStrings.MP
  - typingsJapgolly.awsSdk.awsSdkStrings.MQ
  - typingsJapgolly.awsSdk.awsSdkStrings.MR
  - typingsJapgolly.awsSdk.awsSdkStrings.MS
  - typingsJapgolly.awsSdk.awsSdkStrings.MT
  - typingsJapgolly.awsSdk.awsSdkStrings.MU
  - typingsJapgolly.awsSdk.awsSdkStrings.MV
  - typingsJapgolly.awsSdk.awsSdkStrings.MW
  - typingsJapgolly.awsSdk.awsSdkStrings.MX
  - typingsJapgolly.awsSdk.awsSdkStrings.MY
  - typingsJapgolly.awsSdk.awsSdkStrings.MZ
  - typingsJapgolly.awsSdk.awsSdkStrings.NA
  - typingsJapgolly.awsSdk.awsSdkStrings.NC
  - typingsJapgolly.awsSdk.awsSdkStrings.NE
  - typingsJapgolly.awsSdk.awsSdkStrings.NF
  - typingsJapgolly.awsSdk.awsSdkStrings.NG
  - typingsJapgolly.awsSdk.awsSdkStrings.NI
  - typingsJapgolly.awsSdk.awsSdkStrings.NL
  - typingsJapgolly.awsSdk.awsSdkStrings.NO
  - typingsJapgolly.awsSdk.awsSdkStrings.NP
  - typingsJapgolly.awsSdk.awsSdkStrings.NR
  - typingsJapgolly.awsSdk.awsSdkStrings.NU
  - typingsJapgolly.awsSdk.awsSdkStrings.NZ
  - typingsJapgolly.awsSdk.awsSdkStrings.OM
  - typingsJapgolly.awsSdk.awsSdkStrings.PA
  - typingsJapgolly.awsSdk.awsSdkStrings.PE
  - typingsJapgolly.awsSdk.awsSdkStrings.PF
  - typingsJapgolly.awsSdk.awsSdkStrings.PG
  - typingsJapgolly.awsSdk.awsSdkStrings.PH
  - typingsJapgolly.awsSdk.awsSdkStrings.PK
  - typingsJapgolly.awsSdk.awsSdkStrings.PL
  - typingsJapgolly.awsSdk.awsSdkStrings.PM
  - typingsJapgolly.awsSdk.awsSdkStrings.PN
  - typingsJapgolly.awsSdk.awsSdkStrings.PR
  - typingsJapgolly.awsSdk.awsSdkStrings.PS
  - typingsJapgolly.awsSdk.awsSdkStrings.PT
  - typingsJapgolly.awsSdk.awsSdkStrings.PW
  - typingsJapgolly.awsSdk.awsSdkStrings.PY
  - typingsJapgolly.awsSdk.awsSdkStrings.QA
  - typingsJapgolly.awsSdk.awsSdkStrings.RE
  - typingsJapgolly.awsSdk.awsSdkStrings.RO
  - typingsJapgolly.awsSdk.awsSdkStrings.RS
  - typingsJapgolly.awsSdk.awsSdkStrings.RU
  - typingsJapgolly.awsSdk.awsSdkStrings.RW
  - typingsJapgolly.awsSdk.awsSdkStrings.SA
  - typingsJapgolly.awsSdk.awsSdkStrings.SB
  - typingsJapgolly.awsSdk.awsSdkStrings.SC
  - typingsJapgolly.awsSdk.awsSdkStrings.SD
  - typingsJapgolly.awsSdk.awsSdkStrings.SE
  - typingsJapgolly.awsSdk.awsSdkStrings.SG
  - typingsJapgolly.awsSdk.awsSdkStrings.SH
  - typingsJapgolly.awsSdk.awsSdkStrings.SI
  - typingsJapgolly.awsSdk.awsSdkStrings.SJ
  - typingsJapgolly.awsSdk.awsSdkStrings.SK
  - typingsJapgolly.awsSdk.awsSdkStrings.SL
  - typingsJapgolly.awsSdk.awsSdkStrings.SM
  - typingsJapgolly.awsSdk.awsSdkStrings.SN
  - typingsJapgolly.awsSdk.awsSdkStrings.SO
  - typingsJapgolly.awsSdk.awsSdkStrings.SR
  - typingsJapgolly.awsSdk.awsSdkStrings.SS
  - typingsJapgolly.awsSdk.awsSdkStrings.ST
  - typingsJapgolly.awsSdk.awsSdkStrings.SV
  - typingsJapgolly.awsSdk.awsSdkStrings.SX
  - typingsJapgolly.awsSdk.awsSdkStrings.SY
  - typingsJapgolly.awsSdk.awsSdkStrings.SZ
  - typingsJapgolly.awsSdk.awsSdkStrings.TC
  - typingsJapgolly.awsSdk.awsSdkStrings.TD
  - typingsJapgolly.awsSdk.awsSdkStrings.TF
  - typingsJapgolly.awsSdk.awsSdkStrings.TG
  - typingsJapgolly.awsSdk.awsSdkStrings.TH
  - typingsJapgolly.awsSdk.awsSdkStrings.TJ
  - typingsJapgolly.awsSdk.awsSdkStrings.TK
  - typingsJapgolly.awsSdk.awsSdkStrings.TL
  - typingsJapgolly.awsSdk.awsSdkStrings.TM
  - typingsJapgolly.awsSdk.awsSdkStrings.TN
  - typingsJapgolly.awsSdk.awsSdkStrings.TO
  - typingsJapgolly.awsSdk.awsSdkStrings.TP
  - typingsJapgolly.awsSdk.awsSdkStrings.TR
  - typingsJapgolly.awsSdk.awsSdkStrings.TT
  - typingsJapgolly.awsSdk.awsSdkStrings.TV
  - typingsJapgolly.awsSdk.awsSdkStrings.TW
  - typingsJapgolly.awsSdk.awsSdkStrings.TZ
  - typingsJapgolly.awsSdk.awsSdkStrings.UA
  - typingsJapgolly.awsSdk.awsSdkStrings.UG
  - typingsJapgolly.awsSdk.awsSdkStrings.US
  - typingsJapgolly.awsSdk.awsSdkStrings.UY
  - typingsJapgolly.awsSdk.awsSdkStrings.UZ
  - typingsJapgolly.awsSdk.awsSdkStrings.VA
  - typingsJapgolly.awsSdk.awsSdkStrings.VC
  - typingsJapgolly.awsSdk.awsSdkStrings.VE
  - typingsJapgolly.awsSdk.awsSdkStrings.VG
  - typingsJapgolly.awsSdk.awsSdkStrings.VI
  - typingsJapgolly.awsSdk.awsSdkStrings.VN
  - typingsJapgolly.awsSdk.awsSdkStrings.VU
  - typingsJapgolly.awsSdk.awsSdkStrings.WF
  - typingsJapgolly.awsSdk.awsSdkStrings.WS
  - typingsJapgolly.awsSdk.awsSdkStrings.YE
  - typingsJapgolly.awsSdk.awsSdkStrings.YT
  - typingsJapgolly.awsSdk.awsSdkStrings.ZA
  - typingsJapgolly.awsSdk.awsSdkStrings.ZM
  - typingsJapgolly.awsSdk.awsSdkStrings.ZW
  - java.lang.String
*/
type CountryCode = _CountryCode | java.lang.String

type Currency = java.lang.String

type CurrentExpiryYear = Double

type DNSSec = java.lang.String

type DomainAuthCode = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE_RESERVED
  - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE_PREORDER
  - typingsJapgolly.awsSdk.awsSdkStrings.UNAVAILABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.UNAVAILABLE_PREMIUM
  - typingsJapgolly.awsSdk.awsSdkStrings.UNAVAILABLE_RESTRICTED
  - typingsJapgolly.awsSdk.awsSdkStrings.RESERVED
  - typingsJapgolly.awsSdk.awsSdkStrings.DONT_KNOW
  - java.lang.String
*/
type DomainAvailability = _DomainAvailability | java.lang.String

type DomainName = java.lang.String

type DomainPriceList = js.Array[DomainPrice]

type DomainPriceName = java.lang.String

type DomainStatus = java.lang.String

type DomainStatusList = js.Array[DomainStatus]

type DomainSuggestionsList = js.Array[DomainSuggestion]

type DomainSummaryList = js.Array[DomainSummary]

type DurationInYears = Double

type Email = java.lang.String

type ErrorMessage = java.lang.String

type ExtraParamList = js.Array[ExtraParam]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DUNS_NUMBER
  - typingsJapgolly.awsSdk.awsSdkStrings.BRAND_NUMBER
  - typingsJapgolly.awsSdk.awsSdkStrings.BIRTH_DEPARTMENT
  - typingsJapgolly.awsSdk.awsSdkStrings.BIRTH_DATE_IN_YYYY_MM_DD
  - typingsJapgolly.awsSdk.awsSdkStrings.BIRTH_COUNTRY
  - typingsJapgolly.awsSdk.awsSdkStrings.BIRTH_CITY
  - typingsJapgolly.awsSdk.awsSdkStrings.DOCUMENT_NUMBER
  - typingsJapgolly.awsSdk.awsSdkStrings.AU_ID_NUMBER
  - typingsJapgolly.awsSdk.awsSdkStrings.AU_ID_TYPE
  - typingsJapgolly.awsSdk.awsSdkStrings.CA_LEGAL_TYPE
  - typingsJapgolly.awsSdk.awsSdkStrings.CA_BUSINESS_ENTITY_TYPE
  - typingsJapgolly.awsSdk.awsSdkStrings.CA_LEGAL_REPRESENTATIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.CA_LEGAL_REPRESENTATIVE_CAPACITY
  - typingsJapgolly.awsSdk.awsSdkStrings.ES_IDENTIFICATION
  - typingsJapgolly.awsSdk.awsSdkStrings.ES_IDENTIFICATION_TYPE
  - typingsJapgolly.awsSdk.awsSdkStrings.ES_LEGAL_FORM
  - typingsJapgolly.awsSdk.awsSdkStrings.FI_BUSINESS_NUMBER
  - typingsJapgolly.awsSdk.awsSdkStrings.FI_ID_NUMBER
  - typingsJapgolly.awsSdk.awsSdkStrings.FI_NATIONALITY
  - typingsJapgolly.awsSdk.awsSdkStrings.FI_ORGANIZATION_TYPE
  - typingsJapgolly.awsSdk.awsSdkStrings.IT_NATIONALITY
  - typingsJapgolly.awsSdk.awsSdkStrings.IT_PIN
  - typingsJapgolly.awsSdk.awsSdkStrings.IT_REGISTRANT_ENTITY_TYPE
  - typingsJapgolly.awsSdk.awsSdkStrings.RU_PASSPORT_DATA
  - typingsJapgolly.awsSdk.awsSdkStrings.SE_ID_NUMBER
  - typingsJapgolly.awsSdk.awsSdkStrings.SG_ID_NUMBER
  - typingsJapgolly.awsSdk.awsSdkStrings.VAT_NUMBER
  - typingsJapgolly.awsSdk.awsSdkStrings.UK_CONTACT_TYPE
  - typingsJapgolly.awsSdk.awsSdkStrings.UK_COMPANY_NUMBER
  - typingsJapgolly.awsSdk.awsSdkStrings.EU_COUNTRY_OF_CITIZENSHIP
  - java.lang.String
*/
type ExtraParamName = _ExtraParamName | java.lang.String

type ExtraParamValue = java.lang.String

type FIAuthKey = java.lang.String

type FilterConditions = js.Array[FilterCondition]

type GlueIp = java.lang.String

type GlueIpList = js.Array[GlueIp]

type HostName = java.lang.String

type Integer = Double

type InvoiceId = java.lang.String

type LangCode = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DomainName
  - typingsJapgolly.awsSdk.awsSdkStrings.Expiry
  - java.lang.String
*/
type ListDomainsAttributeName = _ListDomainsAttributeName | java.lang.String

type NameserverList = js.Array[Nameserver]

type OperationId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SUBMITTED
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCESSFUL
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type OperationStatus = _OperationStatus | java.lang.String

type OperationSummaryList = js.Array[OperationSummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.REGISTER_DOMAIN
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_DOMAIN
  - typingsJapgolly.awsSdk.awsSdkStrings.TRANSFER_IN_DOMAIN
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_DOMAIN_CONTACT
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_NAMESERVER
  - typingsJapgolly.awsSdk.awsSdkStrings.CHANGE_PRIVACY_PROTECTION
  - typingsJapgolly.awsSdk.awsSdkStrings.DOMAIN_LOCK
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLE_AUTORENEW
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLE_AUTORENEW
  - typingsJapgolly.awsSdk.awsSdkStrings.ADD_DNSSEC
  - typingsJapgolly.awsSdk.awsSdkStrings.REMOVE_DNSSEC
  - typingsJapgolly.awsSdk.awsSdkStrings.EXPIRE_DOMAIN
  - typingsJapgolly.awsSdk.awsSdkStrings.TRANSFER_OUT_DOMAIN
  - typingsJapgolly.awsSdk.awsSdkStrings.CHANGE_DOMAIN_OWNER
  - typingsJapgolly.awsSdk.awsSdkStrings.RENEW_DOMAIN
  - typingsJapgolly.awsSdk.awsSdkStrings.PUSH_DOMAIN
  - typingsJapgolly.awsSdk.awsSdkStrings.INTERNAL_TRANSFER_OUT_DOMAIN
  - typingsJapgolly.awsSdk.awsSdkStrings.INTERNAL_TRANSFER_IN_DOMAIN
  - java.lang.String
*/
type OperationType = _OperationType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.LE
  - typingsJapgolly.awsSdk.awsSdkStrings.GE
  - typingsJapgolly.awsSdk.awsSdkStrings.BEGINS_WITH
  - java.lang.String
*/
type Operator = _Operator | java.lang.String

type PageMarker = java.lang.String

type PageMaxItems = Double

type Price = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.DONE
  - typingsJapgolly.awsSdk.awsSdkStrings.EXPIRED
  - java.lang.String
*/
type ReachabilityStatus = _ReachabilityStatus | java.lang.String

type RegistrarName = java.lang.String

type RegistrarUrl = java.lang.String

type RegistrarWhoIsServer = java.lang.String

type RegistryDomainId = java.lang.String

type Reseller = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ASC
  - typingsJapgolly.awsSdk.awsSdkStrings.DESC
  - java.lang.String
*/
type SortOrder = _SortOrder | java.lang.String

type State = java.lang.String

type String = java.lang.String

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = java.lang.String

type Timestamp = js.Date

type TldName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.TRANSFERABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.UNTRANSFERABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.DONT_KNOW
  - java.lang.String
*/
type Transferable = _Transferable | java.lang.String

type Value = java.lang.String

type Values = js.Array[Value]

type ZipCode = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2014-05-15`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
