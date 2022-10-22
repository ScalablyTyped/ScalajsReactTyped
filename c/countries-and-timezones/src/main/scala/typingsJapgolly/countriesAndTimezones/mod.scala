package typingsJapgolly.countriesAndTimezones

import typingsJapgolly.countriesAndTimezones.anon.RecordCountryCodeCountry
import typingsJapgolly.countriesAndTimezones.anon.RecordTimezoneNameTimezon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("countries-and-timezones", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAllCountries(): RecordCountryCodeCountry = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllCountries")().asInstanceOf[RecordCountryCodeCountry]
  inline def getAllCountries(options: Options): RecordCountryCodeCountry = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllCountries")(options.asInstanceOf[js.Any]).asInstanceOf[RecordCountryCodeCountry]
  
  inline def getAllTimezones(): RecordTimezoneNameTimezon = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllTimezones")().asInstanceOf[RecordTimezoneNameTimezon]
  inline def getAllTimezones(options: Options): RecordTimezoneNameTimezon = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllTimezones")(options.asInstanceOf[js.Any]).asInstanceOf[RecordTimezoneNameTimezon]
  
  inline def getCountriesForTimezone(name: String): js.Array[Country] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getCountriesForTimezone")(name.asInstanceOf[js.Any]).asInstanceOf[js.Array[Country] | Null]
  inline def getCountriesForTimezone(name: String, options: Options): js.Array[Country] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getCountriesForTimezone")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Country] | Null]
  inline def getCountriesForTimezone(name: TimezoneName): js.Array[Country] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCountriesForTimezone")(name.asInstanceOf[js.Any]).asInstanceOf[js.Array[Country]]
  inline def getCountriesForTimezone(name: TimezoneName, options: Options): js.Array[Country] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCountriesForTimezone")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Country]]
  
  inline def getCountriesForTimezone_Array(name: String): js.Array[Country] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCountriesForTimezone")(name.asInstanceOf[js.Any]).asInstanceOf[js.Array[Country]]
  inline def getCountriesForTimezone_Array(name: String, options: Options): js.Array[Country] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCountriesForTimezone")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Country]]
  
  inline def getCountry(id: String): Country | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getCountry")(id.asInstanceOf[js.Any]).asInstanceOf[Country | Null]
  inline def getCountry(id: String, options: Options): Country | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getCountry")(id.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Country | Null]
  inline def getCountry(id: CountryCode): Country = ^.asInstanceOf[js.Dynamic].applyDynamic("getCountry")(id.asInstanceOf[js.Any]).asInstanceOf[Country]
  inline def getCountry(id: CountryCode, options: Options): Country = (^.asInstanceOf[js.Dynamic].applyDynamic("getCountry")(id.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Country]
  
  inline def getCountryForTimezone(name: String): Country | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getCountryForTimezone")(name.asInstanceOf[js.Any]).asInstanceOf[Country | Null]
  inline def getCountryForTimezone(name: String, options: Options): Country | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getCountryForTimezone")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Country | Null]
  inline def getCountryForTimezone(name: TimezoneName): Country = ^.asInstanceOf[js.Dynamic].applyDynamic("getCountryForTimezone")(name.asInstanceOf[js.Any]).asInstanceOf[Country]
  inline def getCountryForTimezone(name: TimezoneName, options: Options): Country = (^.asInstanceOf[js.Dynamic].applyDynamic("getCountryForTimezone")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Country]
  
  inline def getTimezone(name: String): Timezone | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getTimezone")(name.asInstanceOf[js.Any]).asInstanceOf[Timezone | Null]
  inline def getTimezone(name: TimezoneName): Timezone = ^.asInstanceOf[js.Dynamic].applyDynamic("getTimezone")(name.asInstanceOf[js.Any]).asInstanceOf[Timezone]
  
  inline def getTimezonesForCountry(id: String): js.Array[Timezone] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getTimezonesForCountry")(id.asInstanceOf[js.Any]).asInstanceOf[js.Array[Timezone] | Null]
  inline def getTimezonesForCountry(id: String, options: Options): js.Array[Timezone] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getTimezonesForCountry")(id.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Timezone] | Null]
  inline def getTimezonesForCountry(id: CountryCode): js.Array[Timezone] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTimezonesForCountry")(id.asInstanceOf[js.Any]).asInstanceOf[js.Array[Timezone]]
  inline def getTimezonesForCountry(id: CountryCode, options: Options): js.Array[Timezone] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTimezonesForCountry")(id.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Timezone]]
  
  trait Country extends StObject {
    
    var id: CountryCode
    
    var name: String
    
    var timezones: js.Array[TimezoneName]
  }
  object Country {
    
    extension [Self <: Country](x: Self) {
      
      inline def setId(value: CountryCode): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTimezones(value: js.Array[TimezoneName]): Self = StObject.set(x, "timezones", value.asInstanceOf[js.Any])
      
      inline def setTimezonesVarargs(value: TimezoneName*): Self = StObject.set(x, "timezones", js.Array(value*))
    }
  }
  
  /* keyof countries-and-timezones.anon.AD */ /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AD
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AE
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AF
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AG
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AI
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AL
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AM
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AO
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AQ
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AR
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AS
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AT
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AU
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AW
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AX
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AZ
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.BA
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.BB
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.BD
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.BE
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.BF
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.BG
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.BH
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.BI
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.BJ
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.BL
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.BM
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.BN
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.BO
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.BQ
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.BR
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.BS
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.BT
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.BV
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.BW
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.BY
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.BZ
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.CA
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.CC
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.CD
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.CF
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.CG
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.CH
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.CI
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.CK
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.CL
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.CM
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.CN
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.CO
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.CR
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.CU
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.CV
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.CW
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.CX
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.CY
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.CZ
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.DE
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.DJ
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.DK
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.DM
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.DO
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.DZ
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EC
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EE
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EG
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EH
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.ER
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.ES
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.ET
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.FI
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.FJ
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.FK
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.FM
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.FO
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.FR
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.GA
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.GB
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.GD
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.GE
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.GF
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.GG
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.GH
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.GI
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.GL
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.GM
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.GN
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.GP
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.GQ
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.GR
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.GS
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.GT
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.GU
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.GW
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.GY
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.HK
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.HM
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.HN
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.HR
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.HT
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.HU
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.ID
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.IE
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.IL
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.IM
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.IN
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.IO
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.IQ
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.IR
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.IS
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.IT
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.JE
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.JM
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.JO
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.JP
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.KE
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.KG
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.KH
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.KI
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.KM
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.KN
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.KP
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.KR
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.KW
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.KY
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.KZ
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.LA
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.LB
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.LC
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.LI
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.LK
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.LR
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.LS
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.LT
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.LU
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.LV
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.LY
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.MA
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.MC
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.MD
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.ME
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.MF
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.MG
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.MH
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.MK
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.ML
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.MM
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.MN
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.MO
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.MP
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.MQ
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.MR
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.MS
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.MT
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.MU
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.MV
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.MW
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.MX
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.MY
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.MZ
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.NA
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.NC
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.NE
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.NF
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.NG
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.NI
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.NL
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.NO
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.NP
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.NR
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.NU
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.NZ
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.OM
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.PA
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.PE
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.PF
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.PG
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.PH
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.PK
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.PL
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.PM
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.PN
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.PR
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.PS
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.PT
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.PW
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.PY
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.QA
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.RE
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.RO
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.RS
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.RU
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.RW
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.SA
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.SB
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.SC
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.SD
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.SE
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.SG
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.SH
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.SI
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.SJ
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.SK
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.SL
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.SM
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.SN
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.SO
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.SR
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.SS
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.ST
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.SV
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.SX
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.SY
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.SZ
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.TC
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.TD
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.TF
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.TG
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.TH
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.TJ
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.TK
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.TL
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.TM
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.TN
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.TO
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.TR
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.TT
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.TV
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.TW
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.TZ
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.UA
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.UG
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.UM
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.US
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.UY
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.UZ
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.VA
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.VC
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.VE
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.VG
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.VI
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.VN
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.VU
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.WF
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.WS
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.YE
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.YT
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.ZA
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.ZM
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.ZW
  */
  trait CountryCode extends StObject
  
  trait Options extends StObject {
    
    var deprecated: Boolean
  }
  object Options {
    
    inline def apply(deprecated: Boolean): Options = {
      val __obj = js.Dynamic.literal(deprecated = deprecated.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    }
  }
  
  trait Timezone extends StObject {
    
    var aliasOf: String | Null
    
    var countries: js.Array[CountryCode]
    
    var deprecated: js.UndefOr[Boolean] = js.undefined
    
    var dstOffset: Double
    
    var dstOffsetStr: String
    
    var name: String
    
    var utcOffset: Double
    
    var utcOffsetStr: String
  }
  object Timezone {
    
    inline def apply(
      countries: js.Array[CountryCode],
      dstOffset: Double,
      dstOffsetStr: String,
      name: String,
      utcOffset: Double,
      utcOffsetStr: String
    ): Timezone = {
      val __obj = js.Dynamic.literal(countries = countries.asInstanceOf[js.Any], dstOffset = dstOffset.asInstanceOf[js.Any], dstOffsetStr = dstOffsetStr.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], utcOffset = utcOffset.asInstanceOf[js.Any], utcOffsetStr = utcOffsetStr.asInstanceOf[js.Any], aliasOf = null)
      __obj.asInstanceOf[Timezone]
    }
    
    extension [Self <: Timezone](x: Self) {
      
      inline def setAliasOf(value: String): Self = StObject.set(x, "aliasOf", value.asInstanceOf[js.Any])
      
      inline def setAliasOfNull: Self = StObject.set(x, "aliasOf", null)
      
      inline def setCountries(value: js.Array[CountryCode]): Self = StObject.set(x, "countries", value.asInstanceOf[js.Any])
      
      inline def setCountriesVarargs(value: CountryCode*): Self = StObject.set(x, "countries", js.Array(value*))
      
      inline def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
      
      inline def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
      
      inline def setDstOffset(value: Double): Self = StObject.set(x, "dstOffset", value.asInstanceOf[js.Any])
      
      inline def setDstOffsetStr(value: String): Self = StObject.set(x, "dstOffsetStr", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setUtcOffset(value: Double): Self = StObject.set(x, "utcOffset", value.asInstanceOf[js.Any])
      
      inline def setUtcOffsetStr(value: String): Self = StObject.set(x, "utcOffsetStr", value.asInstanceOf[js.Any])
    }
  }
  
  /* keyof countries-and-timezones.anon.AfricaAbidjan */ /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashAbidjan
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashAccra
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashAddis_Ababa
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashAlgiers
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashAsmara
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashAsmera
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashBamako
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashBangui
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashBanjul
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashBissau
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashBlantyre
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashBrazzaville
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashBujumbura
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashCairo
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashCasablanca
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashCeuta
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashConakry
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashDakar
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashDar_es_Salaam
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashDjibouti
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashDouala
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashEl_Aaiun
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashFreetown
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashGaborone
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashHarare
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashJohannesburg
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashJuba
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashKampala
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashKhartoum
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashKigali
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashKinshasa
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashLagos
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashLibreville
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashLome
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashLuanda
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashLubumbashi
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashLusaka
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashMalabo
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashMaputo
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashMaseru
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashMbabane
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashMogadishu
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashMonrovia
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashNairobi
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashNdjamena
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashNiamey
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashNouakchott
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashOuagadougou
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.`AfricaSlashPorto-Novo`
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashSao_Tome
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashTimbuktu
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashTripoli
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashTunis
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashWindhoek
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashAdak
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashAnchorage
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashAnguilla
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashAntigua
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashAraguaina
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashArgentinaSlashBuenos_Aires
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashArgentinaSlashCatamarca
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashArgentinaSlashComodRivadavia
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashArgentinaSlashCordoba
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashArgentinaSlashJujuy
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashArgentinaSlashLa_Rioja
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashArgentinaSlashMendoza
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashArgentinaSlashRio_Gallegos
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashArgentinaSlashSalta
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashArgentinaSlashSan_Juan
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashArgentinaSlashSan_Luis
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashArgentinaSlashTucuman
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashArgentinaSlashUshuaia
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashAruba
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashAsuncion
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashAtikokan
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashAtka
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashBahia
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashBahia_Banderas
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashBarbados
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashBelem
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashBelize
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.`AmericaSlashBlanc-Sablon`
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashBoa_Vista
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashBogota
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashBoise
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashBuenos_Aires
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashCambridge_Bay
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashCampo_Grande
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashCancun
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashCaracas
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashCatamarca
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashCayenne
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashCayman
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashChicago
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashChihuahua
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashCoral_Harbour
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashCordoba
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashCosta_Rica
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashCreston
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashCuiaba
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashCuracao
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashDanmarkshavn
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashDawson
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashDawson_Creek
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashDenver
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashDetroit
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashDominica
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashEdmonton
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashEirunepe
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashEl_Salvador
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashEnsenada
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashFort_Nelson
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashFort_Wayne
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashFortaleza
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashGlace_Bay
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashGodthab
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashGoose_Bay
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashGrand_Turk
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashGrenada
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashGuadeloupe
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashGuatemala
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashGuayaquil
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashGuyana
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashHalifax
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashHavana
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashHermosillo
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashIndianaSlashIndianapolis
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashIndianaSlashKnox
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashIndianaSlashMarengo
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashIndianaSlashPetersburg
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashIndianaSlashTell_City
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashIndianaSlashVevay
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashIndianaSlashVincennes
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashIndianaSlashWinamac
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashIndianapolis
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashInuvik
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashIqaluit
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashJamaica
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashJujuy
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashJuneau
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashKentuckySlashLouisville
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashKentuckySlashMonticello
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashKnox_IN
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashKralendijk
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashLa_Paz
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashLima
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashLos_Angeles
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashLouisville
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashLower_Princes
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashMaceio
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashManagua
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashManaus
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashMarigot
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashMartinique
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashMatamoros
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashMazatlan
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashMendoza
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashMenominee
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashMerida
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashMetlakatla
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashMexico_City
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashMiquelon
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashMoncton
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashMonterrey
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashMontevideo
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashMontreal
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashMontserrat
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashNassau
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashNew_York
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashNipigon
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashNome
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashNoronha
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashNorth_DakotaSlashBeulah
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashNorth_DakotaSlashCenter
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashNorth_DakotaSlashNew_Salem
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashNuuk
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashOjinaga
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashPanama
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashPangnirtung
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashParamaribo
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashPhoenix
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.`AmericaSlashPort-au-Prince`
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashPort_of_Spain
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashPorto_Acre
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashPorto_Velho
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashPuerto_Rico
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashPunta_Arenas
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashRainy_River
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashRankin_Inlet
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashRecife
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashRegina
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashResolute
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashRio_Branco
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashRosario
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashSanta_Isabel
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashSantarem
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashSantiago
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashSanto_Domingo
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashSao_Paulo
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashScoresbysund
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashShiprock
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashSitka
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashSt_Barthelemy
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashSt_Johns
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashSt_Kitts
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashSt_Lucia
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashSt_Thomas
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashSt_Vincent
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashSwift_Current
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashTegucigalpa
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashThule
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashThunder_Bay
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashTijuana
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashToronto
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashTortola
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashVancouver
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashVirgin
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashWhitehorse
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashWinnipeg
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashYakutat
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashYellowknife
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AntarcticaSlashCasey
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AntarcticaSlashDavis
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AntarcticaSlashDumontDUrville
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AntarcticaSlashMacquarie
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AntarcticaSlashMawson
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AntarcticaSlashMcMurdo
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AntarcticaSlashPalmer
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AntarcticaSlashRothera
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AntarcticaSlashSouth_Pole
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AntarcticaSlashSyowa
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AntarcticaSlashTroll
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AntarcticaSlashVostok
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.ArcticSlashLongyearbyen
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashAden
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashAlmaty
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashAmman
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashAnadyr
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashAqtau
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashAqtobe
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashAshgabat
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashAshkhabad
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashAtyrau
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashBaghdad
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashBahrain
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashBaku
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashBangkok
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashBarnaul
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashBeirut
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashBishkek
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashBrunei
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashCalcutta
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashChita
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashChoibalsan
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashChongqing
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashChungking
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashColombo
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashDacca
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashDamascus
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashDhaka
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashDili
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashDubai
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashDushanbe
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashFamagusta
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashGaza
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashHarbin
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashHebron
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashHo_Chi_Minh
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashHong_Kong
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashHovd
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashIrkutsk
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashIstanbul
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashJakarta
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashJayapura
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashJerusalem
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashKabul
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashKamchatka
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashKarachi
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashKashgar
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashKathmandu
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashKatmandu
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashKhandyga
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashKolkata
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashKrasnoyarsk
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashKuala_Lumpur
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashKuching
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashKuwait
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashMacao
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashMacau
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashMagadan
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashMakassar
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashManila
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashMuscat
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashNicosia
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashNovokuznetsk
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashNovosibirsk
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashOmsk
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashOral
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashPhnom_Penh
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashPontianak
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashPyongyang
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashQatar
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashQostanay
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashQyzylorda
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashRangoon
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashRiyadh
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashSaigon
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashSakhalin
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashSamarkand
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashSeoul
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashShanghai
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashSingapore
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashSrednekolymsk
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashTaipei
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashTashkent
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashTbilisi
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashTehran
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashTel_Aviv
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashThimbu
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashThimphu
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashTokyo
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashTomsk
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashUjung_Pandang
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashUlaanbaatar
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashUlan_Bator
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashUrumqi
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.`AsiaSlashUst-Nera`
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashVientiane
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashVladivostok
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashYakutsk
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashYangon
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashYekaterinburg
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashYerevan
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AtlanticSlashAzores
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AtlanticSlashBermuda
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AtlanticSlashCanary
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AtlanticSlashCape_Verde
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AtlanticSlashFaeroe
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AtlanticSlashFaroe
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AtlanticSlashJan_Mayen
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AtlanticSlashMadeira
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AtlanticSlashReykjavik
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AtlanticSlashSouth_Georgia
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AtlanticSlashSt_Helena
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AtlanticSlashStanley
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AustraliaSlashACT
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AustraliaSlashAdelaide
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AustraliaSlashBrisbane
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AustraliaSlashBroken_Hill
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AustraliaSlashCanberra
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AustraliaSlashCurrie
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AustraliaSlashDarwin
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AustraliaSlashEucla
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AustraliaSlashHobart
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AustraliaSlashLHI
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AustraliaSlashLindeman
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AustraliaSlashLord_Howe
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AustraliaSlashMelbourne
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AustraliaSlashNSW
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AustraliaSlashNorth
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AustraliaSlashPerth
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AustraliaSlashQueensland
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AustraliaSlashSouth
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AustraliaSlashSydney
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AustraliaSlashTasmania
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AustraliaSlashVictoria
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AustraliaSlashWest
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AustraliaSlashYancowinna
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.BrazilSlashAcre
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.BrazilSlashDeNoronha
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.BrazilSlashEast
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.BrazilSlashWest
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.CET
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.CST6CDT
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.CanadaSlashAtlantic
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.CanadaSlashCentral
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.CanadaSlashEastern
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.CanadaSlashMountain
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.CanadaSlashNewfoundland
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.CanadaSlashPacific
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.CanadaSlashSaskatchewan
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.CanadaSlashYukon
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.ChileSlashContinental
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.ChileSlashEasterIsland
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.Cuba
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EET
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EST
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EST5EDT
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.Egypt
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.Eire
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EtcSlashGMT
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EtcSlashGMTPlussign0
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EtcSlashGMTPlussign1
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EtcSlashGMTPlussign10
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EtcSlashGMTPlussign11
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EtcSlashGMTPlussign12
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EtcSlashGMTPlussign2
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EtcSlashGMTPlussign3
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EtcSlashGMTPlussign4
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EtcSlashGMTPlussign5
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EtcSlashGMTPlussign6
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EtcSlashGMTPlussign7
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EtcSlashGMTPlussign8
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EtcSlashGMTPlussign9
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.`EtcSlashGMT-0`
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.`EtcSlashGMT-1`
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.`EtcSlashGMT-10`
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.`EtcSlashGMT-11`
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.`EtcSlashGMT-12`
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.`EtcSlashGMT-13`
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.`EtcSlashGMT-14`
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.`EtcSlashGMT-2`
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.`EtcSlashGMT-3`
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.`EtcSlashGMT-4`
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.`EtcSlashGMT-5`
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.`EtcSlashGMT-6`
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.`EtcSlashGMT-7`
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.`EtcSlashGMT-8`
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.`EtcSlashGMT-9`
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EtcSlashGMT0
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EtcSlashGreenwich
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EtcSlashUCT
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EtcSlashUTC
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EtcSlashUniversal
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EtcSlashZulu
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashAmsterdam
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashAndorra
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashAstrakhan
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashAthens
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashBelfast
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashBelgrade
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashBerlin
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashBratislava
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashBrussels
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashBucharest
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashBudapest
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashBusingen
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashChisinau
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashCopenhagen
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashDublin
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashGibraltar
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashGuernsey
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashHelsinki
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashIsle_of_Man
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashIstanbul
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashJersey
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashKaliningrad
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashKiev
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashKirov
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashLisbon
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashLjubljana
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashLondon
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashLuxembourg
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashMadrid
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashMalta
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashMariehamn
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashMinsk
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashMonaco
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashMoscow
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashNicosia
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashOslo
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashParis
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashPodgorica
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashPrague
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashRiga
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashRome
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashSamara
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashSan_Marino
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashSarajevo
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashSaratov
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashSimferopol
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashSkopje
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashSofia
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashStockholm
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashTallinn
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashTirane
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashTiraspol
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashUlyanovsk
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashUzhgorod
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashVaduz
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashVatican
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashVienna
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashVilnius
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashVolgograd
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashWarsaw
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashZagreb
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashZaporozhye
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashZurich
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.Factory
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.GB
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.`GB-Eire`
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.GMT
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.GMTPlussign0
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.`GMT-0`
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.GMT0
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.Greenwich
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.HST
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.Hongkong
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.Iceland
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.IndianSlashAntananarivo
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.IndianSlashChagos
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.IndianSlashChristmas
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.IndianSlashCocos
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.IndianSlashComoro
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.IndianSlashKerguelen
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.IndianSlashMahe
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.IndianSlashMaldives
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.IndianSlashMauritius
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.IndianSlashMayotte
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.IndianSlashReunion
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.Iran
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.Israel
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.Jamaica
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.Japan
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.Kwajalein
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.Libya
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.MET
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.MST
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.MST7MDT
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.MexicoSlashBajaNorte
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.MexicoSlashBajaSur
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.MexicoSlashGeneral
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.NZ
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.`NZ-CHAT`
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.Navajo
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.PRC
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.PST8PDT
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashApia
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashAuckland
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashBougainville
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashChatham
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashChuuk
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashEaster
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashEfate
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashEnderbury
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashFakaofo
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashFiji
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashFunafuti
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashGalapagos
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashGambier
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashGuadalcanal
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashGuam
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashHonolulu
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashJohnston
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashKanton
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashKiritimati
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashKosrae
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashKwajalein
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashMajuro
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashMarquesas
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashMidway
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashNauru
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashNiue
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashNorfolk
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashNoumea
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashPago_Pago
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashPalau
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashPitcairn
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashPohnpei
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashPonape
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashPort_Moresby
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashRarotonga
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashSaipan
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashSamoa
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashTahiti
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashTarawa
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashTongatapu
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashTruk
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashWake
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashWallis
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashYap
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.Poland
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.Portugal
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.ROC
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.ROK
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.Singapore
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.Turkey
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.UCT
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.USSlashAlaska
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.USSlashAleutian
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.USSlashArizona
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.USSlashCentral
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.`USSlashEast-Indiana`
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.USSlashEastern
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.USSlashHawaii
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.`USSlashIndiana-Starke`
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.USSlashMichigan
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.USSlashMountain
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.USSlashPacific
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.USSlashSamoa
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.UTC
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.Universal
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.`W-SU`
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.WET
    - typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.Zulu
  */
  trait TimezoneName extends StObject
}
