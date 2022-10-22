package typingsJapgolly.libphonenumberJs

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.libphonenumberJs.anon.Tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @JSImport("libphonenumber-js/types", "ParseError")
  @js.native
  open class ParseError () extends StObject {
    
    var message: String = js.native
  }
  
  @JSImport("libphonenumber-js/types", "PhoneNumber")
  @js.native
  open class PhoneNumber protected () extends StObject {
    def this(
      countryCallingCodeOrCountry: CountryCallingCode,
      nationalNumber: NationalNumber,
      metadata: MetadataJson
    ) = this()
    def this(countryCallingCodeOrCountry: CountryCode, nationalNumber: NationalNumber, metadata: MetadataJson) = this()
    
    var carrierCode: js.UndefOr[CarrierCode] = js.native
    
    var country: js.UndefOr[CountryCode] = js.native
    
    var countryCallingCode: CountryCallingCode = js.native
    
    var ext: js.UndefOr[Extension] = js.native
    
    def format(format: NumberFormat): String = js.native
    def format(format: NumberFormat, options: FormatNumberOptions): String = js.native
    
    def formatInternational(): String = js.native
    def formatInternational(options: FormatNumberOptionsWithoutIDD): String = js.native
    
    def formatNational(): String = js.native
    def formatNational(options: FormatNumberOptionsWithoutIDD): String = js.native
    
    def getType(): NumberType = js.native
    
    def getURI(): String = js.native
    def getURI(options: FormatNumberOptionsWithoutIDD): String = js.native
    
    def isEqual(phoneNumber: PhoneNumber): Boolean = js.native
    
    def isNonGeographic(): Boolean = js.native
    
    def isPossible(): Boolean = js.native
    
    def isValid(): Boolean = js.native
    
    var nationalNumber: NationalNumber = js.native
    
    var number: E164Number = js.native
    
    def setExt(ext: Extension): Unit = js.native
  }
  
  type CarrierCode = Tagged[String, typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.CarrierCode]
  
  /* Inlined {[ country in libphonenumber-js.libphonenumber-js/types.CountryCode ]:? std.Array<any>} */
  trait Countries extends StObject {
    
    var AC: js.UndefOr[js.Array[Any]] = js.undefined
    
    var AD: js.UndefOr[js.Array[Any]] = js.undefined
    
    var AE: js.UndefOr[js.Array[Any]] = js.undefined
    
    var AF: js.UndefOr[js.Array[Any]] = js.undefined
    
    var AG: js.UndefOr[js.Array[Any]] = js.undefined
    
    var AI: js.UndefOr[js.Array[Any]] = js.undefined
    
    var AL: js.UndefOr[js.Array[Any]] = js.undefined
    
    var AM: js.UndefOr[js.Array[Any]] = js.undefined
    
    var AO: js.UndefOr[js.Array[Any]] = js.undefined
    
    var AR: js.UndefOr[js.Array[Any]] = js.undefined
    
    var AS: js.UndefOr[js.Array[Any]] = js.undefined
    
    var AT: js.UndefOr[js.Array[Any]] = js.undefined
    
    var AU: js.UndefOr[js.Array[Any]] = js.undefined
    
    var AW: js.UndefOr[js.Array[Any]] = js.undefined
    
    var AX: js.UndefOr[js.Array[Any]] = js.undefined
    
    var AZ: js.UndefOr[js.Array[Any]] = js.undefined
    
    var BA: js.UndefOr[js.Array[Any]] = js.undefined
    
    var BB: js.UndefOr[js.Array[Any]] = js.undefined
    
    var BD: js.UndefOr[js.Array[Any]] = js.undefined
    
    var BE: js.UndefOr[js.Array[Any]] = js.undefined
    
    var BF: js.UndefOr[js.Array[Any]] = js.undefined
    
    var BG: js.UndefOr[js.Array[Any]] = js.undefined
    
    var BH: js.UndefOr[js.Array[Any]] = js.undefined
    
    var BI: js.UndefOr[js.Array[Any]] = js.undefined
    
    var BJ: js.UndefOr[js.Array[Any]] = js.undefined
    
    var BL: js.UndefOr[js.Array[Any]] = js.undefined
    
    var BM: js.UndefOr[js.Array[Any]] = js.undefined
    
    var BN: js.UndefOr[js.Array[Any]] = js.undefined
    
    var BO: js.UndefOr[js.Array[Any]] = js.undefined
    
    var BQ: js.UndefOr[js.Array[Any]] = js.undefined
    
    var BR: js.UndefOr[js.Array[Any]] = js.undefined
    
    var BS: js.UndefOr[js.Array[Any]] = js.undefined
    
    var BT: js.UndefOr[js.Array[Any]] = js.undefined
    
    var BW: js.UndefOr[js.Array[Any]] = js.undefined
    
    var BY: js.UndefOr[js.Array[Any]] = js.undefined
    
    var BZ: js.UndefOr[js.Array[Any]] = js.undefined
    
    var CA: js.UndefOr[js.Array[Any]] = js.undefined
    
    var CC: js.UndefOr[js.Array[Any]] = js.undefined
    
    var CD: js.UndefOr[js.Array[Any]] = js.undefined
    
    var CF: js.UndefOr[js.Array[Any]] = js.undefined
    
    var CG: js.UndefOr[js.Array[Any]] = js.undefined
    
    var CH: js.UndefOr[js.Array[Any]] = js.undefined
    
    var CI: js.UndefOr[js.Array[Any]] = js.undefined
    
    var CK: js.UndefOr[js.Array[Any]] = js.undefined
    
    var CL: js.UndefOr[js.Array[Any]] = js.undefined
    
    var CM: js.UndefOr[js.Array[Any]] = js.undefined
    
    var CN: js.UndefOr[js.Array[Any]] = js.undefined
    
    var CO: js.UndefOr[js.Array[Any]] = js.undefined
    
    var CR: js.UndefOr[js.Array[Any]] = js.undefined
    
    var CU: js.UndefOr[js.Array[Any]] = js.undefined
    
    var CV: js.UndefOr[js.Array[Any]] = js.undefined
    
    var CW: js.UndefOr[js.Array[Any]] = js.undefined
    
    var CX: js.UndefOr[js.Array[Any]] = js.undefined
    
    var CY: js.UndefOr[js.Array[Any]] = js.undefined
    
    var CZ: js.UndefOr[js.Array[Any]] = js.undefined
    
    var DE: js.UndefOr[js.Array[Any]] = js.undefined
    
    var DJ: js.UndefOr[js.Array[Any]] = js.undefined
    
    var DK: js.UndefOr[js.Array[Any]] = js.undefined
    
    var DM: js.UndefOr[js.Array[Any]] = js.undefined
    
    var DO: js.UndefOr[js.Array[Any]] = js.undefined
    
    var DZ: js.UndefOr[js.Array[Any]] = js.undefined
    
    var EC: js.UndefOr[js.Array[Any]] = js.undefined
    
    var EE: js.UndefOr[js.Array[Any]] = js.undefined
    
    var EG: js.UndefOr[js.Array[Any]] = js.undefined
    
    var EH: js.UndefOr[js.Array[Any]] = js.undefined
    
    var ER: js.UndefOr[js.Array[Any]] = js.undefined
    
    var ES: js.UndefOr[js.Array[Any]] = js.undefined
    
    var ET: js.UndefOr[js.Array[Any]] = js.undefined
    
    var FI: js.UndefOr[js.Array[Any]] = js.undefined
    
    var FJ: js.UndefOr[js.Array[Any]] = js.undefined
    
    var FK: js.UndefOr[js.Array[Any]] = js.undefined
    
    var FM: js.UndefOr[js.Array[Any]] = js.undefined
    
    var FO: js.UndefOr[js.Array[Any]] = js.undefined
    
    var FR: js.UndefOr[js.Array[Any]] = js.undefined
    
    var GA: js.UndefOr[js.Array[Any]] = js.undefined
    
    var GB: js.UndefOr[js.Array[Any]] = js.undefined
    
    var GD: js.UndefOr[js.Array[Any]] = js.undefined
    
    var GE: js.UndefOr[js.Array[Any]] = js.undefined
    
    var GF: js.UndefOr[js.Array[Any]] = js.undefined
    
    var GG: js.UndefOr[js.Array[Any]] = js.undefined
    
    var GH: js.UndefOr[js.Array[Any]] = js.undefined
    
    var GI: js.UndefOr[js.Array[Any]] = js.undefined
    
    var GL: js.UndefOr[js.Array[Any]] = js.undefined
    
    var GM: js.UndefOr[js.Array[Any]] = js.undefined
    
    var GN: js.UndefOr[js.Array[Any]] = js.undefined
    
    var GP: js.UndefOr[js.Array[Any]] = js.undefined
    
    var GQ: js.UndefOr[js.Array[Any]] = js.undefined
    
    var GR: js.UndefOr[js.Array[Any]] = js.undefined
    
    var GT: js.UndefOr[js.Array[Any]] = js.undefined
    
    var GU: js.UndefOr[js.Array[Any]] = js.undefined
    
    var GW: js.UndefOr[js.Array[Any]] = js.undefined
    
    var GY: js.UndefOr[js.Array[Any]] = js.undefined
    
    var HK: js.UndefOr[js.Array[Any]] = js.undefined
    
    var HN: js.UndefOr[js.Array[Any]] = js.undefined
    
    var HR: js.UndefOr[js.Array[Any]] = js.undefined
    
    var HT: js.UndefOr[js.Array[Any]] = js.undefined
    
    var HU: js.UndefOr[js.Array[Any]] = js.undefined
    
    var ID: js.UndefOr[js.Array[Any]] = js.undefined
    
    var IE: js.UndefOr[js.Array[Any]] = js.undefined
    
    var IL: js.UndefOr[js.Array[Any]] = js.undefined
    
    var IM: js.UndefOr[js.Array[Any]] = js.undefined
    
    var IN: js.UndefOr[js.Array[Any]] = js.undefined
    
    var IO: js.UndefOr[js.Array[Any]] = js.undefined
    
    var IQ: js.UndefOr[js.Array[Any]] = js.undefined
    
    var IR: js.UndefOr[js.Array[Any]] = js.undefined
    
    var IS: js.UndefOr[js.Array[Any]] = js.undefined
    
    var IT: js.UndefOr[js.Array[Any]] = js.undefined
    
    var JE: js.UndefOr[js.Array[Any]] = js.undefined
    
    var JM: js.UndefOr[js.Array[Any]] = js.undefined
    
    var JO: js.UndefOr[js.Array[Any]] = js.undefined
    
    var JP: js.UndefOr[js.Array[Any]] = js.undefined
    
    var KE: js.UndefOr[js.Array[Any]] = js.undefined
    
    var KG: js.UndefOr[js.Array[Any]] = js.undefined
    
    var KH: js.UndefOr[js.Array[Any]] = js.undefined
    
    var KI: js.UndefOr[js.Array[Any]] = js.undefined
    
    var KM: js.UndefOr[js.Array[Any]] = js.undefined
    
    var KN: js.UndefOr[js.Array[Any]] = js.undefined
    
    var KP: js.UndefOr[js.Array[Any]] = js.undefined
    
    var KR: js.UndefOr[js.Array[Any]] = js.undefined
    
    var KW: js.UndefOr[js.Array[Any]] = js.undefined
    
    var KY: js.UndefOr[js.Array[Any]] = js.undefined
    
    var KZ: js.UndefOr[js.Array[Any]] = js.undefined
    
    var LA: js.UndefOr[js.Array[Any]] = js.undefined
    
    var LB: js.UndefOr[js.Array[Any]] = js.undefined
    
    var LC: js.UndefOr[js.Array[Any]] = js.undefined
    
    var LI: js.UndefOr[js.Array[Any]] = js.undefined
    
    var LK: js.UndefOr[js.Array[Any]] = js.undefined
    
    var LR: js.UndefOr[js.Array[Any]] = js.undefined
    
    var LS: js.UndefOr[js.Array[Any]] = js.undefined
    
    var LT: js.UndefOr[js.Array[Any]] = js.undefined
    
    var LU: js.UndefOr[js.Array[Any]] = js.undefined
    
    var LV: js.UndefOr[js.Array[Any]] = js.undefined
    
    var LY: js.UndefOr[js.Array[Any]] = js.undefined
    
    var MA: js.UndefOr[js.Array[Any]] = js.undefined
    
    var MC: js.UndefOr[js.Array[Any]] = js.undefined
    
    var MD: js.UndefOr[js.Array[Any]] = js.undefined
    
    var ME: js.UndefOr[js.Array[Any]] = js.undefined
    
    var MF: js.UndefOr[js.Array[Any]] = js.undefined
    
    var MG: js.UndefOr[js.Array[Any]] = js.undefined
    
    var MH: js.UndefOr[js.Array[Any]] = js.undefined
    
    var MK: js.UndefOr[js.Array[Any]] = js.undefined
    
    var ML: js.UndefOr[js.Array[Any]] = js.undefined
    
    var MM: js.UndefOr[js.Array[Any]] = js.undefined
    
    var MN: js.UndefOr[js.Array[Any]] = js.undefined
    
    var MO: js.UndefOr[js.Array[Any]] = js.undefined
    
    var MP: js.UndefOr[js.Array[Any]] = js.undefined
    
    var MQ: js.UndefOr[js.Array[Any]] = js.undefined
    
    var MR: js.UndefOr[js.Array[Any]] = js.undefined
    
    var MS: js.UndefOr[js.Array[Any]] = js.undefined
    
    var MT: js.UndefOr[js.Array[Any]] = js.undefined
    
    var MU: js.UndefOr[js.Array[Any]] = js.undefined
    
    var MV: js.UndefOr[js.Array[Any]] = js.undefined
    
    var MW: js.UndefOr[js.Array[Any]] = js.undefined
    
    var MX: js.UndefOr[js.Array[Any]] = js.undefined
    
    var MY: js.UndefOr[js.Array[Any]] = js.undefined
    
    var MZ: js.UndefOr[js.Array[Any]] = js.undefined
    
    var NA: js.UndefOr[js.Array[Any]] = js.undefined
    
    var NC: js.UndefOr[js.Array[Any]] = js.undefined
    
    var NE: js.UndefOr[js.Array[Any]] = js.undefined
    
    var NF: js.UndefOr[js.Array[Any]] = js.undefined
    
    var NG: js.UndefOr[js.Array[Any]] = js.undefined
    
    var NI: js.UndefOr[js.Array[Any]] = js.undefined
    
    var NL: js.UndefOr[js.Array[Any]] = js.undefined
    
    var NO: js.UndefOr[js.Array[Any]] = js.undefined
    
    var NP: js.UndefOr[js.Array[Any]] = js.undefined
    
    var NR: js.UndefOr[js.Array[Any]] = js.undefined
    
    var NU: js.UndefOr[js.Array[Any]] = js.undefined
    
    var NZ: js.UndefOr[js.Array[Any]] = js.undefined
    
    var OM: js.UndefOr[js.Array[Any]] = js.undefined
    
    var PA: js.UndefOr[js.Array[Any]] = js.undefined
    
    var PE: js.UndefOr[js.Array[Any]] = js.undefined
    
    var PF: js.UndefOr[js.Array[Any]] = js.undefined
    
    var PG: js.UndefOr[js.Array[Any]] = js.undefined
    
    var PH: js.UndefOr[js.Array[Any]] = js.undefined
    
    var PK: js.UndefOr[js.Array[Any]] = js.undefined
    
    var PL: js.UndefOr[js.Array[Any]] = js.undefined
    
    var PM: js.UndefOr[js.Array[Any]] = js.undefined
    
    var PR: js.UndefOr[js.Array[Any]] = js.undefined
    
    var PS: js.UndefOr[js.Array[Any]] = js.undefined
    
    var PT: js.UndefOr[js.Array[Any]] = js.undefined
    
    var PW: js.UndefOr[js.Array[Any]] = js.undefined
    
    var PY: js.UndefOr[js.Array[Any]] = js.undefined
    
    var QA: js.UndefOr[js.Array[Any]] = js.undefined
    
    var RE: js.UndefOr[js.Array[Any]] = js.undefined
    
    var RO: js.UndefOr[js.Array[Any]] = js.undefined
    
    var RS: js.UndefOr[js.Array[Any]] = js.undefined
    
    var RU: js.UndefOr[js.Array[Any]] = js.undefined
    
    var RW: js.UndefOr[js.Array[Any]] = js.undefined
    
    var SA: js.UndefOr[js.Array[Any]] = js.undefined
    
    var SB: js.UndefOr[js.Array[Any]] = js.undefined
    
    var SC: js.UndefOr[js.Array[Any]] = js.undefined
    
    var SD: js.UndefOr[js.Array[Any]] = js.undefined
    
    var SE: js.UndefOr[js.Array[Any]] = js.undefined
    
    var SG: js.UndefOr[js.Array[Any]] = js.undefined
    
    var SH: js.UndefOr[js.Array[Any]] = js.undefined
    
    var SI: js.UndefOr[js.Array[Any]] = js.undefined
    
    var SJ: js.UndefOr[js.Array[Any]] = js.undefined
    
    var SK: js.UndefOr[js.Array[Any]] = js.undefined
    
    var SL: js.UndefOr[js.Array[Any]] = js.undefined
    
    var SM: js.UndefOr[js.Array[Any]] = js.undefined
    
    var SN: js.UndefOr[js.Array[Any]] = js.undefined
    
    var SO: js.UndefOr[js.Array[Any]] = js.undefined
    
    var SR: js.UndefOr[js.Array[Any]] = js.undefined
    
    var SS: js.UndefOr[js.Array[Any]] = js.undefined
    
    var ST: js.UndefOr[js.Array[Any]] = js.undefined
    
    var SV: js.UndefOr[js.Array[Any]] = js.undefined
    
    var SX: js.UndefOr[js.Array[Any]] = js.undefined
    
    var SY: js.UndefOr[js.Array[Any]] = js.undefined
    
    var SZ: js.UndefOr[js.Array[Any]] = js.undefined
    
    var TA: js.UndefOr[js.Array[Any]] = js.undefined
    
    var TC: js.UndefOr[js.Array[Any]] = js.undefined
    
    var TD: js.UndefOr[js.Array[Any]] = js.undefined
    
    var TG: js.UndefOr[js.Array[Any]] = js.undefined
    
    var TH: js.UndefOr[js.Array[Any]] = js.undefined
    
    var TJ: js.UndefOr[js.Array[Any]] = js.undefined
    
    var TK: js.UndefOr[js.Array[Any]] = js.undefined
    
    var TL: js.UndefOr[js.Array[Any]] = js.undefined
    
    var TM: js.UndefOr[js.Array[Any]] = js.undefined
    
    var TN: js.UndefOr[js.Array[Any]] = js.undefined
    
    var TO: js.UndefOr[js.Array[Any]] = js.undefined
    
    var TR: js.UndefOr[js.Array[Any]] = js.undefined
    
    var TT: js.UndefOr[js.Array[Any]] = js.undefined
    
    var TV: js.UndefOr[js.Array[Any]] = js.undefined
    
    var TW: js.UndefOr[js.Array[Any]] = js.undefined
    
    var TZ: js.UndefOr[js.Array[Any]] = js.undefined
    
    var UA: js.UndefOr[js.Array[Any]] = js.undefined
    
    var UG: js.UndefOr[js.Array[Any]] = js.undefined
    
    var US: js.UndefOr[js.Array[Any]] = js.undefined
    
    var UY: js.UndefOr[js.Array[Any]] = js.undefined
    
    var UZ: js.UndefOr[js.Array[Any]] = js.undefined
    
    var VA: js.UndefOr[js.Array[Any]] = js.undefined
    
    var VC: js.UndefOr[js.Array[Any]] = js.undefined
    
    var VE: js.UndefOr[js.Array[Any]] = js.undefined
    
    var VG: js.UndefOr[js.Array[Any]] = js.undefined
    
    var VI: js.UndefOr[js.Array[Any]] = js.undefined
    
    var VN: js.UndefOr[js.Array[Any]] = js.undefined
    
    var VU: js.UndefOr[js.Array[Any]] = js.undefined
    
    var WF: js.UndefOr[js.Array[Any]] = js.undefined
    
    var WS: js.UndefOr[js.Array[Any]] = js.undefined
    
    var XK: js.UndefOr[js.Array[Any]] = js.undefined
    
    var YE: js.UndefOr[js.Array[Any]] = js.undefined
    
    var YT: js.UndefOr[js.Array[Any]] = js.undefined
    
    var ZA: js.UndefOr[js.Array[Any]] = js.undefined
    
    var ZM: js.UndefOr[js.Array[Any]] = js.undefined
    
    var ZW: js.UndefOr[js.Array[Any]] = js.undefined
  }
  object Countries {
    
    inline def apply(): Countries = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Countries]
    }
    
    extension [Self <: Countries](x: Self) {
      
      inline def setAC(value: js.Array[Any]): Self = StObject.set(x, "AC", value.asInstanceOf[js.Any])
      
      inline def setACUndefined: Self = StObject.set(x, "AC", js.undefined)
      
      inline def setACVarargs(value: Any*): Self = StObject.set(x, "AC", js.Array(value*))
      
      inline def setAD(value: js.Array[Any]): Self = StObject.set(x, "AD", value.asInstanceOf[js.Any])
      
      inline def setADUndefined: Self = StObject.set(x, "AD", js.undefined)
      
      inline def setADVarargs(value: Any*): Self = StObject.set(x, "AD", js.Array(value*))
      
      inline def setAE(value: js.Array[Any]): Self = StObject.set(x, "AE", value.asInstanceOf[js.Any])
      
      inline def setAEUndefined: Self = StObject.set(x, "AE", js.undefined)
      
      inline def setAEVarargs(value: Any*): Self = StObject.set(x, "AE", js.Array(value*))
      
      inline def setAF(value: js.Array[Any]): Self = StObject.set(x, "AF", value.asInstanceOf[js.Any])
      
      inline def setAFUndefined: Self = StObject.set(x, "AF", js.undefined)
      
      inline def setAFVarargs(value: Any*): Self = StObject.set(x, "AF", js.Array(value*))
      
      inline def setAG(value: js.Array[Any]): Self = StObject.set(x, "AG", value.asInstanceOf[js.Any])
      
      inline def setAGUndefined: Self = StObject.set(x, "AG", js.undefined)
      
      inline def setAGVarargs(value: Any*): Self = StObject.set(x, "AG", js.Array(value*))
      
      inline def setAI(value: js.Array[Any]): Self = StObject.set(x, "AI", value.asInstanceOf[js.Any])
      
      inline def setAIUndefined: Self = StObject.set(x, "AI", js.undefined)
      
      inline def setAIVarargs(value: Any*): Self = StObject.set(x, "AI", js.Array(value*))
      
      inline def setAL(value: js.Array[Any]): Self = StObject.set(x, "AL", value.asInstanceOf[js.Any])
      
      inline def setALUndefined: Self = StObject.set(x, "AL", js.undefined)
      
      inline def setALVarargs(value: Any*): Self = StObject.set(x, "AL", js.Array(value*))
      
      inline def setAM(value: js.Array[Any]): Self = StObject.set(x, "AM", value.asInstanceOf[js.Any])
      
      inline def setAMUndefined: Self = StObject.set(x, "AM", js.undefined)
      
      inline def setAMVarargs(value: Any*): Self = StObject.set(x, "AM", js.Array(value*))
      
      inline def setAO(value: js.Array[Any]): Self = StObject.set(x, "AO", value.asInstanceOf[js.Any])
      
      inline def setAOUndefined: Self = StObject.set(x, "AO", js.undefined)
      
      inline def setAOVarargs(value: Any*): Self = StObject.set(x, "AO", js.Array(value*))
      
      inline def setAR(value: js.Array[Any]): Self = StObject.set(x, "AR", value.asInstanceOf[js.Any])
      
      inline def setARUndefined: Self = StObject.set(x, "AR", js.undefined)
      
      inline def setARVarargs(value: Any*): Self = StObject.set(x, "AR", js.Array(value*))
      
      inline def setAS(value: js.Array[Any]): Self = StObject.set(x, "AS", value.asInstanceOf[js.Any])
      
      inline def setASUndefined: Self = StObject.set(x, "AS", js.undefined)
      
      inline def setASVarargs(value: Any*): Self = StObject.set(x, "AS", js.Array(value*))
      
      inline def setAT(value: js.Array[Any]): Self = StObject.set(x, "AT", value.asInstanceOf[js.Any])
      
      inline def setATUndefined: Self = StObject.set(x, "AT", js.undefined)
      
      inline def setATVarargs(value: Any*): Self = StObject.set(x, "AT", js.Array(value*))
      
      inline def setAU(value: js.Array[Any]): Self = StObject.set(x, "AU", value.asInstanceOf[js.Any])
      
      inline def setAUUndefined: Self = StObject.set(x, "AU", js.undefined)
      
      inline def setAUVarargs(value: Any*): Self = StObject.set(x, "AU", js.Array(value*))
      
      inline def setAW(value: js.Array[Any]): Self = StObject.set(x, "AW", value.asInstanceOf[js.Any])
      
      inline def setAWUndefined: Self = StObject.set(x, "AW", js.undefined)
      
      inline def setAWVarargs(value: Any*): Self = StObject.set(x, "AW", js.Array(value*))
      
      inline def setAX(value: js.Array[Any]): Self = StObject.set(x, "AX", value.asInstanceOf[js.Any])
      
      inline def setAXUndefined: Self = StObject.set(x, "AX", js.undefined)
      
      inline def setAXVarargs(value: Any*): Self = StObject.set(x, "AX", js.Array(value*))
      
      inline def setAZ(value: js.Array[Any]): Self = StObject.set(x, "AZ", value.asInstanceOf[js.Any])
      
      inline def setAZUndefined: Self = StObject.set(x, "AZ", js.undefined)
      
      inline def setAZVarargs(value: Any*): Self = StObject.set(x, "AZ", js.Array(value*))
      
      inline def setBA(value: js.Array[Any]): Self = StObject.set(x, "BA", value.asInstanceOf[js.Any])
      
      inline def setBAUndefined: Self = StObject.set(x, "BA", js.undefined)
      
      inline def setBAVarargs(value: Any*): Self = StObject.set(x, "BA", js.Array(value*))
      
      inline def setBB(value: js.Array[Any]): Self = StObject.set(x, "BB", value.asInstanceOf[js.Any])
      
      inline def setBBUndefined: Self = StObject.set(x, "BB", js.undefined)
      
      inline def setBBVarargs(value: Any*): Self = StObject.set(x, "BB", js.Array(value*))
      
      inline def setBD(value: js.Array[Any]): Self = StObject.set(x, "BD", value.asInstanceOf[js.Any])
      
      inline def setBDUndefined: Self = StObject.set(x, "BD", js.undefined)
      
      inline def setBDVarargs(value: Any*): Self = StObject.set(x, "BD", js.Array(value*))
      
      inline def setBE(value: js.Array[Any]): Self = StObject.set(x, "BE", value.asInstanceOf[js.Any])
      
      inline def setBEUndefined: Self = StObject.set(x, "BE", js.undefined)
      
      inline def setBEVarargs(value: Any*): Self = StObject.set(x, "BE", js.Array(value*))
      
      inline def setBF(value: js.Array[Any]): Self = StObject.set(x, "BF", value.asInstanceOf[js.Any])
      
      inline def setBFUndefined: Self = StObject.set(x, "BF", js.undefined)
      
      inline def setBFVarargs(value: Any*): Self = StObject.set(x, "BF", js.Array(value*))
      
      inline def setBG(value: js.Array[Any]): Self = StObject.set(x, "BG", value.asInstanceOf[js.Any])
      
      inline def setBGUndefined: Self = StObject.set(x, "BG", js.undefined)
      
      inline def setBGVarargs(value: Any*): Self = StObject.set(x, "BG", js.Array(value*))
      
      inline def setBH(value: js.Array[Any]): Self = StObject.set(x, "BH", value.asInstanceOf[js.Any])
      
      inline def setBHUndefined: Self = StObject.set(x, "BH", js.undefined)
      
      inline def setBHVarargs(value: Any*): Self = StObject.set(x, "BH", js.Array(value*))
      
      inline def setBI(value: js.Array[Any]): Self = StObject.set(x, "BI", value.asInstanceOf[js.Any])
      
      inline def setBIUndefined: Self = StObject.set(x, "BI", js.undefined)
      
      inline def setBIVarargs(value: Any*): Self = StObject.set(x, "BI", js.Array(value*))
      
      inline def setBJ(value: js.Array[Any]): Self = StObject.set(x, "BJ", value.asInstanceOf[js.Any])
      
      inline def setBJUndefined: Self = StObject.set(x, "BJ", js.undefined)
      
      inline def setBJVarargs(value: Any*): Self = StObject.set(x, "BJ", js.Array(value*))
      
      inline def setBL(value: js.Array[Any]): Self = StObject.set(x, "BL", value.asInstanceOf[js.Any])
      
      inline def setBLUndefined: Self = StObject.set(x, "BL", js.undefined)
      
      inline def setBLVarargs(value: Any*): Self = StObject.set(x, "BL", js.Array(value*))
      
      inline def setBM(value: js.Array[Any]): Self = StObject.set(x, "BM", value.asInstanceOf[js.Any])
      
      inline def setBMUndefined: Self = StObject.set(x, "BM", js.undefined)
      
      inline def setBMVarargs(value: Any*): Self = StObject.set(x, "BM", js.Array(value*))
      
      inline def setBN(value: js.Array[Any]): Self = StObject.set(x, "BN", value.asInstanceOf[js.Any])
      
      inline def setBNUndefined: Self = StObject.set(x, "BN", js.undefined)
      
      inline def setBNVarargs(value: Any*): Self = StObject.set(x, "BN", js.Array(value*))
      
      inline def setBO(value: js.Array[Any]): Self = StObject.set(x, "BO", value.asInstanceOf[js.Any])
      
      inline def setBOUndefined: Self = StObject.set(x, "BO", js.undefined)
      
      inline def setBOVarargs(value: Any*): Self = StObject.set(x, "BO", js.Array(value*))
      
      inline def setBQ(value: js.Array[Any]): Self = StObject.set(x, "BQ", value.asInstanceOf[js.Any])
      
      inline def setBQUndefined: Self = StObject.set(x, "BQ", js.undefined)
      
      inline def setBQVarargs(value: Any*): Self = StObject.set(x, "BQ", js.Array(value*))
      
      inline def setBR(value: js.Array[Any]): Self = StObject.set(x, "BR", value.asInstanceOf[js.Any])
      
      inline def setBRUndefined: Self = StObject.set(x, "BR", js.undefined)
      
      inline def setBRVarargs(value: Any*): Self = StObject.set(x, "BR", js.Array(value*))
      
      inline def setBS(value: js.Array[Any]): Self = StObject.set(x, "BS", value.asInstanceOf[js.Any])
      
      inline def setBSUndefined: Self = StObject.set(x, "BS", js.undefined)
      
      inline def setBSVarargs(value: Any*): Self = StObject.set(x, "BS", js.Array(value*))
      
      inline def setBT(value: js.Array[Any]): Self = StObject.set(x, "BT", value.asInstanceOf[js.Any])
      
      inline def setBTUndefined: Self = StObject.set(x, "BT", js.undefined)
      
      inline def setBTVarargs(value: Any*): Self = StObject.set(x, "BT", js.Array(value*))
      
      inline def setBW(value: js.Array[Any]): Self = StObject.set(x, "BW", value.asInstanceOf[js.Any])
      
      inline def setBWUndefined: Self = StObject.set(x, "BW", js.undefined)
      
      inline def setBWVarargs(value: Any*): Self = StObject.set(x, "BW", js.Array(value*))
      
      inline def setBY(value: js.Array[Any]): Self = StObject.set(x, "BY", value.asInstanceOf[js.Any])
      
      inline def setBYUndefined: Self = StObject.set(x, "BY", js.undefined)
      
      inline def setBYVarargs(value: Any*): Self = StObject.set(x, "BY", js.Array(value*))
      
      inline def setBZ(value: js.Array[Any]): Self = StObject.set(x, "BZ", value.asInstanceOf[js.Any])
      
      inline def setBZUndefined: Self = StObject.set(x, "BZ", js.undefined)
      
      inline def setBZVarargs(value: Any*): Self = StObject.set(x, "BZ", js.Array(value*))
      
      inline def setCA(value: js.Array[Any]): Self = StObject.set(x, "CA", value.asInstanceOf[js.Any])
      
      inline def setCAUndefined: Self = StObject.set(x, "CA", js.undefined)
      
      inline def setCAVarargs(value: Any*): Self = StObject.set(x, "CA", js.Array(value*))
      
      inline def setCC(value: js.Array[Any]): Self = StObject.set(x, "CC", value.asInstanceOf[js.Any])
      
      inline def setCCUndefined: Self = StObject.set(x, "CC", js.undefined)
      
      inline def setCCVarargs(value: Any*): Self = StObject.set(x, "CC", js.Array(value*))
      
      inline def setCD(value: js.Array[Any]): Self = StObject.set(x, "CD", value.asInstanceOf[js.Any])
      
      inline def setCDUndefined: Self = StObject.set(x, "CD", js.undefined)
      
      inline def setCDVarargs(value: Any*): Self = StObject.set(x, "CD", js.Array(value*))
      
      inline def setCF(value: js.Array[Any]): Self = StObject.set(x, "CF", value.asInstanceOf[js.Any])
      
      inline def setCFUndefined: Self = StObject.set(x, "CF", js.undefined)
      
      inline def setCFVarargs(value: Any*): Self = StObject.set(x, "CF", js.Array(value*))
      
      inline def setCG(value: js.Array[Any]): Self = StObject.set(x, "CG", value.asInstanceOf[js.Any])
      
      inline def setCGUndefined: Self = StObject.set(x, "CG", js.undefined)
      
      inline def setCGVarargs(value: Any*): Self = StObject.set(x, "CG", js.Array(value*))
      
      inline def setCH(value: js.Array[Any]): Self = StObject.set(x, "CH", value.asInstanceOf[js.Any])
      
      inline def setCHUndefined: Self = StObject.set(x, "CH", js.undefined)
      
      inline def setCHVarargs(value: Any*): Self = StObject.set(x, "CH", js.Array(value*))
      
      inline def setCI(value: js.Array[Any]): Self = StObject.set(x, "CI", value.asInstanceOf[js.Any])
      
      inline def setCIUndefined: Self = StObject.set(x, "CI", js.undefined)
      
      inline def setCIVarargs(value: Any*): Self = StObject.set(x, "CI", js.Array(value*))
      
      inline def setCK(value: js.Array[Any]): Self = StObject.set(x, "CK", value.asInstanceOf[js.Any])
      
      inline def setCKUndefined: Self = StObject.set(x, "CK", js.undefined)
      
      inline def setCKVarargs(value: Any*): Self = StObject.set(x, "CK", js.Array(value*))
      
      inline def setCL(value: js.Array[Any]): Self = StObject.set(x, "CL", value.asInstanceOf[js.Any])
      
      inline def setCLUndefined: Self = StObject.set(x, "CL", js.undefined)
      
      inline def setCLVarargs(value: Any*): Self = StObject.set(x, "CL", js.Array(value*))
      
      inline def setCM(value: js.Array[Any]): Self = StObject.set(x, "CM", value.asInstanceOf[js.Any])
      
      inline def setCMUndefined: Self = StObject.set(x, "CM", js.undefined)
      
      inline def setCMVarargs(value: Any*): Self = StObject.set(x, "CM", js.Array(value*))
      
      inline def setCN(value: js.Array[Any]): Self = StObject.set(x, "CN", value.asInstanceOf[js.Any])
      
      inline def setCNUndefined: Self = StObject.set(x, "CN", js.undefined)
      
      inline def setCNVarargs(value: Any*): Self = StObject.set(x, "CN", js.Array(value*))
      
      inline def setCO(value: js.Array[Any]): Self = StObject.set(x, "CO", value.asInstanceOf[js.Any])
      
      inline def setCOUndefined: Self = StObject.set(x, "CO", js.undefined)
      
      inline def setCOVarargs(value: Any*): Self = StObject.set(x, "CO", js.Array(value*))
      
      inline def setCR(value: js.Array[Any]): Self = StObject.set(x, "CR", value.asInstanceOf[js.Any])
      
      inline def setCRUndefined: Self = StObject.set(x, "CR", js.undefined)
      
      inline def setCRVarargs(value: Any*): Self = StObject.set(x, "CR", js.Array(value*))
      
      inline def setCU(value: js.Array[Any]): Self = StObject.set(x, "CU", value.asInstanceOf[js.Any])
      
      inline def setCUUndefined: Self = StObject.set(x, "CU", js.undefined)
      
      inline def setCUVarargs(value: Any*): Self = StObject.set(x, "CU", js.Array(value*))
      
      inline def setCV(value: js.Array[Any]): Self = StObject.set(x, "CV", value.asInstanceOf[js.Any])
      
      inline def setCVUndefined: Self = StObject.set(x, "CV", js.undefined)
      
      inline def setCVVarargs(value: Any*): Self = StObject.set(x, "CV", js.Array(value*))
      
      inline def setCW(value: js.Array[Any]): Self = StObject.set(x, "CW", value.asInstanceOf[js.Any])
      
      inline def setCWUndefined: Self = StObject.set(x, "CW", js.undefined)
      
      inline def setCWVarargs(value: Any*): Self = StObject.set(x, "CW", js.Array(value*))
      
      inline def setCX(value: js.Array[Any]): Self = StObject.set(x, "CX", value.asInstanceOf[js.Any])
      
      inline def setCXUndefined: Self = StObject.set(x, "CX", js.undefined)
      
      inline def setCXVarargs(value: Any*): Self = StObject.set(x, "CX", js.Array(value*))
      
      inline def setCY(value: js.Array[Any]): Self = StObject.set(x, "CY", value.asInstanceOf[js.Any])
      
      inline def setCYUndefined: Self = StObject.set(x, "CY", js.undefined)
      
      inline def setCYVarargs(value: Any*): Self = StObject.set(x, "CY", js.Array(value*))
      
      inline def setCZ(value: js.Array[Any]): Self = StObject.set(x, "CZ", value.asInstanceOf[js.Any])
      
      inline def setCZUndefined: Self = StObject.set(x, "CZ", js.undefined)
      
      inline def setCZVarargs(value: Any*): Self = StObject.set(x, "CZ", js.Array(value*))
      
      inline def setDE(value: js.Array[Any]): Self = StObject.set(x, "DE", value.asInstanceOf[js.Any])
      
      inline def setDEUndefined: Self = StObject.set(x, "DE", js.undefined)
      
      inline def setDEVarargs(value: Any*): Self = StObject.set(x, "DE", js.Array(value*))
      
      inline def setDJ(value: js.Array[Any]): Self = StObject.set(x, "DJ", value.asInstanceOf[js.Any])
      
      inline def setDJUndefined: Self = StObject.set(x, "DJ", js.undefined)
      
      inline def setDJVarargs(value: Any*): Self = StObject.set(x, "DJ", js.Array(value*))
      
      inline def setDK(value: js.Array[Any]): Self = StObject.set(x, "DK", value.asInstanceOf[js.Any])
      
      inline def setDKUndefined: Self = StObject.set(x, "DK", js.undefined)
      
      inline def setDKVarargs(value: Any*): Self = StObject.set(x, "DK", js.Array(value*))
      
      inline def setDM(value: js.Array[Any]): Self = StObject.set(x, "DM", value.asInstanceOf[js.Any])
      
      inline def setDMUndefined: Self = StObject.set(x, "DM", js.undefined)
      
      inline def setDMVarargs(value: Any*): Self = StObject.set(x, "DM", js.Array(value*))
      
      inline def setDO(value: js.Array[Any]): Self = StObject.set(x, "DO", value.asInstanceOf[js.Any])
      
      inline def setDOUndefined: Self = StObject.set(x, "DO", js.undefined)
      
      inline def setDOVarargs(value: Any*): Self = StObject.set(x, "DO", js.Array(value*))
      
      inline def setDZ(value: js.Array[Any]): Self = StObject.set(x, "DZ", value.asInstanceOf[js.Any])
      
      inline def setDZUndefined: Self = StObject.set(x, "DZ", js.undefined)
      
      inline def setDZVarargs(value: Any*): Self = StObject.set(x, "DZ", js.Array(value*))
      
      inline def setEC(value: js.Array[Any]): Self = StObject.set(x, "EC", value.asInstanceOf[js.Any])
      
      inline def setECUndefined: Self = StObject.set(x, "EC", js.undefined)
      
      inline def setECVarargs(value: Any*): Self = StObject.set(x, "EC", js.Array(value*))
      
      inline def setEE(value: js.Array[Any]): Self = StObject.set(x, "EE", value.asInstanceOf[js.Any])
      
      inline def setEEUndefined: Self = StObject.set(x, "EE", js.undefined)
      
      inline def setEEVarargs(value: Any*): Self = StObject.set(x, "EE", js.Array(value*))
      
      inline def setEG(value: js.Array[Any]): Self = StObject.set(x, "EG", value.asInstanceOf[js.Any])
      
      inline def setEGUndefined: Self = StObject.set(x, "EG", js.undefined)
      
      inline def setEGVarargs(value: Any*): Self = StObject.set(x, "EG", js.Array(value*))
      
      inline def setEH(value: js.Array[Any]): Self = StObject.set(x, "EH", value.asInstanceOf[js.Any])
      
      inline def setEHUndefined: Self = StObject.set(x, "EH", js.undefined)
      
      inline def setEHVarargs(value: Any*): Self = StObject.set(x, "EH", js.Array(value*))
      
      inline def setER(value: js.Array[Any]): Self = StObject.set(x, "ER", value.asInstanceOf[js.Any])
      
      inline def setERUndefined: Self = StObject.set(x, "ER", js.undefined)
      
      inline def setERVarargs(value: Any*): Self = StObject.set(x, "ER", js.Array(value*))
      
      inline def setES(value: js.Array[Any]): Self = StObject.set(x, "ES", value.asInstanceOf[js.Any])
      
      inline def setESUndefined: Self = StObject.set(x, "ES", js.undefined)
      
      inline def setESVarargs(value: Any*): Self = StObject.set(x, "ES", js.Array(value*))
      
      inline def setET(value: js.Array[Any]): Self = StObject.set(x, "ET", value.asInstanceOf[js.Any])
      
      inline def setETUndefined: Self = StObject.set(x, "ET", js.undefined)
      
      inline def setETVarargs(value: Any*): Self = StObject.set(x, "ET", js.Array(value*))
      
      inline def setFI(value: js.Array[Any]): Self = StObject.set(x, "FI", value.asInstanceOf[js.Any])
      
      inline def setFIUndefined: Self = StObject.set(x, "FI", js.undefined)
      
      inline def setFIVarargs(value: Any*): Self = StObject.set(x, "FI", js.Array(value*))
      
      inline def setFJ(value: js.Array[Any]): Self = StObject.set(x, "FJ", value.asInstanceOf[js.Any])
      
      inline def setFJUndefined: Self = StObject.set(x, "FJ", js.undefined)
      
      inline def setFJVarargs(value: Any*): Self = StObject.set(x, "FJ", js.Array(value*))
      
      inline def setFK(value: js.Array[Any]): Self = StObject.set(x, "FK", value.asInstanceOf[js.Any])
      
      inline def setFKUndefined: Self = StObject.set(x, "FK", js.undefined)
      
      inline def setFKVarargs(value: Any*): Self = StObject.set(x, "FK", js.Array(value*))
      
      inline def setFM(value: js.Array[Any]): Self = StObject.set(x, "FM", value.asInstanceOf[js.Any])
      
      inline def setFMUndefined: Self = StObject.set(x, "FM", js.undefined)
      
      inline def setFMVarargs(value: Any*): Self = StObject.set(x, "FM", js.Array(value*))
      
      inline def setFO(value: js.Array[Any]): Self = StObject.set(x, "FO", value.asInstanceOf[js.Any])
      
      inline def setFOUndefined: Self = StObject.set(x, "FO", js.undefined)
      
      inline def setFOVarargs(value: Any*): Self = StObject.set(x, "FO", js.Array(value*))
      
      inline def setFR(value: js.Array[Any]): Self = StObject.set(x, "FR", value.asInstanceOf[js.Any])
      
      inline def setFRUndefined: Self = StObject.set(x, "FR", js.undefined)
      
      inline def setFRVarargs(value: Any*): Self = StObject.set(x, "FR", js.Array(value*))
      
      inline def setGA(value: js.Array[Any]): Self = StObject.set(x, "GA", value.asInstanceOf[js.Any])
      
      inline def setGAUndefined: Self = StObject.set(x, "GA", js.undefined)
      
      inline def setGAVarargs(value: Any*): Self = StObject.set(x, "GA", js.Array(value*))
      
      inline def setGB(value: js.Array[Any]): Self = StObject.set(x, "GB", value.asInstanceOf[js.Any])
      
      inline def setGBUndefined: Self = StObject.set(x, "GB", js.undefined)
      
      inline def setGBVarargs(value: Any*): Self = StObject.set(x, "GB", js.Array(value*))
      
      inline def setGD(value: js.Array[Any]): Self = StObject.set(x, "GD", value.asInstanceOf[js.Any])
      
      inline def setGDUndefined: Self = StObject.set(x, "GD", js.undefined)
      
      inline def setGDVarargs(value: Any*): Self = StObject.set(x, "GD", js.Array(value*))
      
      inline def setGE(value: js.Array[Any]): Self = StObject.set(x, "GE", value.asInstanceOf[js.Any])
      
      inline def setGEUndefined: Self = StObject.set(x, "GE", js.undefined)
      
      inline def setGEVarargs(value: Any*): Self = StObject.set(x, "GE", js.Array(value*))
      
      inline def setGF(value: js.Array[Any]): Self = StObject.set(x, "GF", value.asInstanceOf[js.Any])
      
      inline def setGFUndefined: Self = StObject.set(x, "GF", js.undefined)
      
      inline def setGFVarargs(value: Any*): Self = StObject.set(x, "GF", js.Array(value*))
      
      inline def setGG(value: js.Array[Any]): Self = StObject.set(x, "GG", value.asInstanceOf[js.Any])
      
      inline def setGGUndefined: Self = StObject.set(x, "GG", js.undefined)
      
      inline def setGGVarargs(value: Any*): Self = StObject.set(x, "GG", js.Array(value*))
      
      inline def setGH(value: js.Array[Any]): Self = StObject.set(x, "GH", value.asInstanceOf[js.Any])
      
      inline def setGHUndefined: Self = StObject.set(x, "GH", js.undefined)
      
      inline def setGHVarargs(value: Any*): Self = StObject.set(x, "GH", js.Array(value*))
      
      inline def setGI(value: js.Array[Any]): Self = StObject.set(x, "GI", value.asInstanceOf[js.Any])
      
      inline def setGIUndefined: Self = StObject.set(x, "GI", js.undefined)
      
      inline def setGIVarargs(value: Any*): Self = StObject.set(x, "GI", js.Array(value*))
      
      inline def setGL(value: js.Array[Any]): Self = StObject.set(x, "GL", value.asInstanceOf[js.Any])
      
      inline def setGLUndefined: Self = StObject.set(x, "GL", js.undefined)
      
      inline def setGLVarargs(value: Any*): Self = StObject.set(x, "GL", js.Array(value*))
      
      inline def setGM(value: js.Array[Any]): Self = StObject.set(x, "GM", value.asInstanceOf[js.Any])
      
      inline def setGMUndefined: Self = StObject.set(x, "GM", js.undefined)
      
      inline def setGMVarargs(value: Any*): Self = StObject.set(x, "GM", js.Array(value*))
      
      inline def setGN(value: js.Array[Any]): Self = StObject.set(x, "GN", value.asInstanceOf[js.Any])
      
      inline def setGNUndefined: Self = StObject.set(x, "GN", js.undefined)
      
      inline def setGNVarargs(value: Any*): Self = StObject.set(x, "GN", js.Array(value*))
      
      inline def setGP(value: js.Array[Any]): Self = StObject.set(x, "GP", value.asInstanceOf[js.Any])
      
      inline def setGPUndefined: Self = StObject.set(x, "GP", js.undefined)
      
      inline def setGPVarargs(value: Any*): Self = StObject.set(x, "GP", js.Array(value*))
      
      inline def setGQ(value: js.Array[Any]): Self = StObject.set(x, "GQ", value.asInstanceOf[js.Any])
      
      inline def setGQUndefined: Self = StObject.set(x, "GQ", js.undefined)
      
      inline def setGQVarargs(value: Any*): Self = StObject.set(x, "GQ", js.Array(value*))
      
      inline def setGR(value: js.Array[Any]): Self = StObject.set(x, "GR", value.asInstanceOf[js.Any])
      
      inline def setGRUndefined: Self = StObject.set(x, "GR", js.undefined)
      
      inline def setGRVarargs(value: Any*): Self = StObject.set(x, "GR", js.Array(value*))
      
      inline def setGT(value: js.Array[Any]): Self = StObject.set(x, "GT", value.asInstanceOf[js.Any])
      
      inline def setGTUndefined: Self = StObject.set(x, "GT", js.undefined)
      
      inline def setGTVarargs(value: Any*): Self = StObject.set(x, "GT", js.Array(value*))
      
      inline def setGU(value: js.Array[Any]): Self = StObject.set(x, "GU", value.asInstanceOf[js.Any])
      
      inline def setGUUndefined: Self = StObject.set(x, "GU", js.undefined)
      
      inline def setGUVarargs(value: Any*): Self = StObject.set(x, "GU", js.Array(value*))
      
      inline def setGW(value: js.Array[Any]): Self = StObject.set(x, "GW", value.asInstanceOf[js.Any])
      
      inline def setGWUndefined: Self = StObject.set(x, "GW", js.undefined)
      
      inline def setGWVarargs(value: Any*): Self = StObject.set(x, "GW", js.Array(value*))
      
      inline def setGY(value: js.Array[Any]): Self = StObject.set(x, "GY", value.asInstanceOf[js.Any])
      
      inline def setGYUndefined: Self = StObject.set(x, "GY", js.undefined)
      
      inline def setGYVarargs(value: Any*): Self = StObject.set(x, "GY", js.Array(value*))
      
      inline def setHK(value: js.Array[Any]): Self = StObject.set(x, "HK", value.asInstanceOf[js.Any])
      
      inline def setHKUndefined: Self = StObject.set(x, "HK", js.undefined)
      
      inline def setHKVarargs(value: Any*): Self = StObject.set(x, "HK", js.Array(value*))
      
      inline def setHN(value: js.Array[Any]): Self = StObject.set(x, "HN", value.asInstanceOf[js.Any])
      
      inline def setHNUndefined: Self = StObject.set(x, "HN", js.undefined)
      
      inline def setHNVarargs(value: Any*): Self = StObject.set(x, "HN", js.Array(value*))
      
      inline def setHR(value: js.Array[Any]): Self = StObject.set(x, "HR", value.asInstanceOf[js.Any])
      
      inline def setHRUndefined: Self = StObject.set(x, "HR", js.undefined)
      
      inline def setHRVarargs(value: Any*): Self = StObject.set(x, "HR", js.Array(value*))
      
      inline def setHT(value: js.Array[Any]): Self = StObject.set(x, "HT", value.asInstanceOf[js.Any])
      
      inline def setHTUndefined: Self = StObject.set(x, "HT", js.undefined)
      
      inline def setHTVarargs(value: Any*): Self = StObject.set(x, "HT", js.Array(value*))
      
      inline def setHU(value: js.Array[Any]): Self = StObject.set(x, "HU", value.asInstanceOf[js.Any])
      
      inline def setHUUndefined: Self = StObject.set(x, "HU", js.undefined)
      
      inline def setHUVarargs(value: Any*): Self = StObject.set(x, "HU", js.Array(value*))
      
      inline def setID(value: js.Array[Any]): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
      
      inline def setIDUndefined: Self = StObject.set(x, "ID", js.undefined)
      
      inline def setIDVarargs(value: Any*): Self = StObject.set(x, "ID", js.Array(value*))
      
      inline def setIE(value: js.Array[Any]): Self = StObject.set(x, "IE", value.asInstanceOf[js.Any])
      
      inline def setIEUndefined: Self = StObject.set(x, "IE", js.undefined)
      
      inline def setIEVarargs(value: Any*): Self = StObject.set(x, "IE", js.Array(value*))
      
      inline def setIL(value: js.Array[Any]): Self = StObject.set(x, "IL", value.asInstanceOf[js.Any])
      
      inline def setILUndefined: Self = StObject.set(x, "IL", js.undefined)
      
      inline def setILVarargs(value: Any*): Self = StObject.set(x, "IL", js.Array(value*))
      
      inline def setIM(value: js.Array[Any]): Self = StObject.set(x, "IM", value.asInstanceOf[js.Any])
      
      inline def setIMUndefined: Self = StObject.set(x, "IM", js.undefined)
      
      inline def setIMVarargs(value: Any*): Self = StObject.set(x, "IM", js.Array(value*))
      
      inline def setIN(value: js.Array[Any]): Self = StObject.set(x, "IN", value.asInstanceOf[js.Any])
      
      inline def setINUndefined: Self = StObject.set(x, "IN", js.undefined)
      
      inline def setINVarargs(value: Any*): Self = StObject.set(x, "IN", js.Array(value*))
      
      inline def setIO(value: js.Array[Any]): Self = StObject.set(x, "IO", value.asInstanceOf[js.Any])
      
      inline def setIOUndefined: Self = StObject.set(x, "IO", js.undefined)
      
      inline def setIOVarargs(value: Any*): Self = StObject.set(x, "IO", js.Array(value*))
      
      inline def setIQ(value: js.Array[Any]): Self = StObject.set(x, "IQ", value.asInstanceOf[js.Any])
      
      inline def setIQUndefined: Self = StObject.set(x, "IQ", js.undefined)
      
      inline def setIQVarargs(value: Any*): Self = StObject.set(x, "IQ", js.Array(value*))
      
      inline def setIR(value: js.Array[Any]): Self = StObject.set(x, "IR", value.asInstanceOf[js.Any])
      
      inline def setIRUndefined: Self = StObject.set(x, "IR", js.undefined)
      
      inline def setIRVarargs(value: Any*): Self = StObject.set(x, "IR", js.Array(value*))
      
      inline def setIS(value: js.Array[Any]): Self = StObject.set(x, "IS", value.asInstanceOf[js.Any])
      
      inline def setISUndefined: Self = StObject.set(x, "IS", js.undefined)
      
      inline def setISVarargs(value: Any*): Self = StObject.set(x, "IS", js.Array(value*))
      
      inline def setIT(value: js.Array[Any]): Self = StObject.set(x, "IT", value.asInstanceOf[js.Any])
      
      inline def setITUndefined: Self = StObject.set(x, "IT", js.undefined)
      
      inline def setITVarargs(value: Any*): Self = StObject.set(x, "IT", js.Array(value*))
      
      inline def setJE(value: js.Array[Any]): Self = StObject.set(x, "JE", value.asInstanceOf[js.Any])
      
      inline def setJEUndefined: Self = StObject.set(x, "JE", js.undefined)
      
      inline def setJEVarargs(value: Any*): Self = StObject.set(x, "JE", js.Array(value*))
      
      inline def setJM(value: js.Array[Any]): Self = StObject.set(x, "JM", value.asInstanceOf[js.Any])
      
      inline def setJMUndefined: Self = StObject.set(x, "JM", js.undefined)
      
      inline def setJMVarargs(value: Any*): Self = StObject.set(x, "JM", js.Array(value*))
      
      inline def setJO(value: js.Array[Any]): Self = StObject.set(x, "JO", value.asInstanceOf[js.Any])
      
      inline def setJOUndefined: Self = StObject.set(x, "JO", js.undefined)
      
      inline def setJOVarargs(value: Any*): Self = StObject.set(x, "JO", js.Array(value*))
      
      inline def setJP(value: js.Array[Any]): Self = StObject.set(x, "JP", value.asInstanceOf[js.Any])
      
      inline def setJPUndefined: Self = StObject.set(x, "JP", js.undefined)
      
      inline def setJPVarargs(value: Any*): Self = StObject.set(x, "JP", js.Array(value*))
      
      inline def setKE(value: js.Array[Any]): Self = StObject.set(x, "KE", value.asInstanceOf[js.Any])
      
      inline def setKEUndefined: Self = StObject.set(x, "KE", js.undefined)
      
      inline def setKEVarargs(value: Any*): Self = StObject.set(x, "KE", js.Array(value*))
      
      inline def setKG(value: js.Array[Any]): Self = StObject.set(x, "KG", value.asInstanceOf[js.Any])
      
      inline def setKGUndefined: Self = StObject.set(x, "KG", js.undefined)
      
      inline def setKGVarargs(value: Any*): Self = StObject.set(x, "KG", js.Array(value*))
      
      inline def setKH(value: js.Array[Any]): Self = StObject.set(x, "KH", value.asInstanceOf[js.Any])
      
      inline def setKHUndefined: Self = StObject.set(x, "KH", js.undefined)
      
      inline def setKHVarargs(value: Any*): Self = StObject.set(x, "KH", js.Array(value*))
      
      inline def setKI(value: js.Array[Any]): Self = StObject.set(x, "KI", value.asInstanceOf[js.Any])
      
      inline def setKIUndefined: Self = StObject.set(x, "KI", js.undefined)
      
      inline def setKIVarargs(value: Any*): Self = StObject.set(x, "KI", js.Array(value*))
      
      inline def setKM(value: js.Array[Any]): Self = StObject.set(x, "KM", value.asInstanceOf[js.Any])
      
      inline def setKMUndefined: Self = StObject.set(x, "KM", js.undefined)
      
      inline def setKMVarargs(value: Any*): Self = StObject.set(x, "KM", js.Array(value*))
      
      inline def setKN(value: js.Array[Any]): Self = StObject.set(x, "KN", value.asInstanceOf[js.Any])
      
      inline def setKNUndefined: Self = StObject.set(x, "KN", js.undefined)
      
      inline def setKNVarargs(value: Any*): Self = StObject.set(x, "KN", js.Array(value*))
      
      inline def setKP(value: js.Array[Any]): Self = StObject.set(x, "KP", value.asInstanceOf[js.Any])
      
      inline def setKPUndefined: Self = StObject.set(x, "KP", js.undefined)
      
      inline def setKPVarargs(value: Any*): Self = StObject.set(x, "KP", js.Array(value*))
      
      inline def setKR(value: js.Array[Any]): Self = StObject.set(x, "KR", value.asInstanceOf[js.Any])
      
      inline def setKRUndefined: Self = StObject.set(x, "KR", js.undefined)
      
      inline def setKRVarargs(value: Any*): Self = StObject.set(x, "KR", js.Array(value*))
      
      inline def setKW(value: js.Array[Any]): Self = StObject.set(x, "KW", value.asInstanceOf[js.Any])
      
      inline def setKWUndefined: Self = StObject.set(x, "KW", js.undefined)
      
      inline def setKWVarargs(value: Any*): Self = StObject.set(x, "KW", js.Array(value*))
      
      inline def setKY(value: js.Array[Any]): Self = StObject.set(x, "KY", value.asInstanceOf[js.Any])
      
      inline def setKYUndefined: Self = StObject.set(x, "KY", js.undefined)
      
      inline def setKYVarargs(value: Any*): Self = StObject.set(x, "KY", js.Array(value*))
      
      inline def setKZ(value: js.Array[Any]): Self = StObject.set(x, "KZ", value.asInstanceOf[js.Any])
      
      inline def setKZUndefined: Self = StObject.set(x, "KZ", js.undefined)
      
      inline def setKZVarargs(value: Any*): Self = StObject.set(x, "KZ", js.Array(value*))
      
      inline def setLA(value: js.Array[Any]): Self = StObject.set(x, "LA", value.asInstanceOf[js.Any])
      
      inline def setLAUndefined: Self = StObject.set(x, "LA", js.undefined)
      
      inline def setLAVarargs(value: Any*): Self = StObject.set(x, "LA", js.Array(value*))
      
      inline def setLB(value: js.Array[Any]): Self = StObject.set(x, "LB", value.asInstanceOf[js.Any])
      
      inline def setLBUndefined: Self = StObject.set(x, "LB", js.undefined)
      
      inline def setLBVarargs(value: Any*): Self = StObject.set(x, "LB", js.Array(value*))
      
      inline def setLC(value: js.Array[Any]): Self = StObject.set(x, "LC", value.asInstanceOf[js.Any])
      
      inline def setLCUndefined: Self = StObject.set(x, "LC", js.undefined)
      
      inline def setLCVarargs(value: Any*): Self = StObject.set(x, "LC", js.Array(value*))
      
      inline def setLI(value: js.Array[Any]): Self = StObject.set(x, "LI", value.asInstanceOf[js.Any])
      
      inline def setLIUndefined: Self = StObject.set(x, "LI", js.undefined)
      
      inline def setLIVarargs(value: Any*): Self = StObject.set(x, "LI", js.Array(value*))
      
      inline def setLK(value: js.Array[Any]): Self = StObject.set(x, "LK", value.asInstanceOf[js.Any])
      
      inline def setLKUndefined: Self = StObject.set(x, "LK", js.undefined)
      
      inline def setLKVarargs(value: Any*): Self = StObject.set(x, "LK", js.Array(value*))
      
      inline def setLR(value: js.Array[Any]): Self = StObject.set(x, "LR", value.asInstanceOf[js.Any])
      
      inline def setLRUndefined: Self = StObject.set(x, "LR", js.undefined)
      
      inline def setLRVarargs(value: Any*): Self = StObject.set(x, "LR", js.Array(value*))
      
      inline def setLS(value: js.Array[Any]): Self = StObject.set(x, "LS", value.asInstanceOf[js.Any])
      
      inline def setLSUndefined: Self = StObject.set(x, "LS", js.undefined)
      
      inline def setLSVarargs(value: Any*): Self = StObject.set(x, "LS", js.Array(value*))
      
      inline def setLT(value: js.Array[Any]): Self = StObject.set(x, "LT", value.asInstanceOf[js.Any])
      
      inline def setLTUndefined: Self = StObject.set(x, "LT", js.undefined)
      
      inline def setLTVarargs(value: Any*): Self = StObject.set(x, "LT", js.Array(value*))
      
      inline def setLU(value: js.Array[Any]): Self = StObject.set(x, "LU", value.asInstanceOf[js.Any])
      
      inline def setLUUndefined: Self = StObject.set(x, "LU", js.undefined)
      
      inline def setLUVarargs(value: Any*): Self = StObject.set(x, "LU", js.Array(value*))
      
      inline def setLV(value: js.Array[Any]): Self = StObject.set(x, "LV", value.asInstanceOf[js.Any])
      
      inline def setLVUndefined: Self = StObject.set(x, "LV", js.undefined)
      
      inline def setLVVarargs(value: Any*): Self = StObject.set(x, "LV", js.Array(value*))
      
      inline def setLY(value: js.Array[Any]): Self = StObject.set(x, "LY", value.asInstanceOf[js.Any])
      
      inline def setLYUndefined: Self = StObject.set(x, "LY", js.undefined)
      
      inline def setLYVarargs(value: Any*): Self = StObject.set(x, "LY", js.Array(value*))
      
      inline def setMA(value: js.Array[Any]): Self = StObject.set(x, "MA", value.asInstanceOf[js.Any])
      
      inline def setMAUndefined: Self = StObject.set(x, "MA", js.undefined)
      
      inline def setMAVarargs(value: Any*): Self = StObject.set(x, "MA", js.Array(value*))
      
      inline def setMC(value: js.Array[Any]): Self = StObject.set(x, "MC", value.asInstanceOf[js.Any])
      
      inline def setMCUndefined: Self = StObject.set(x, "MC", js.undefined)
      
      inline def setMCVarargs(value: Any*): Self = StObject.set(x, "MC", js.Array(value*))
      
      inline def setMD(value: js.Array[Any]): Self = StObject.set(x, "MD", value.asInstanceOf[js.Any])
      
      inline def setMDUndefined: Self = StObject.set(x, "MD", js.undefined)
      
      inline def setMDVarargs(value: Any*): Self = StObject.set(x, "MD", js.Array(value*))
      
      inline def setME(value: js.Array[Any]): Self = StObject.set(x, "ME", value.asInstanceOf[js.Any])
      
      inline def setMEUndefined: Self = StObject.set(x, "ME", js.undefined)
      
      inline def setMEVarargs(value: Any*): Self = StObject.set(x, "ME", js.Array(value*))
      
      inline def setMF(value: js.Array[Any]): Self = StObject.set(x, "MF", value.asInstanceOf[js.Any])
      
      inline def setMFUndefined: Self = StObject.set(x, "MF", js.undefined)
      
      inline def setMFVarargs(value: Any*): Self = StObject.set(x, "MF", js.Array(value*))
      
      inline def setMG(value: js.Array[Any]): Self = StObject.set(x, "MG", value.asInstanceOf[js.Any])
      
      inline def setMGUndefined: Self = StObject.set(x, "MG", js.undefined)
      
      inline def setMGVarargs(value: Any*): Self = StObject.set(x, "MG", js.Array(value*))
      
      inline def setMH(value: js.Array[Any]): Self = StObject.set(x, "MH", value.asInstanceOf[js.Any])
      
      inline def setMHUndefined: Self = StObject.set(x, "MH", js.undefined)
      
      inline def setMHVarargs(value: Any*): Self = StObject.set(x, "MH", js.Array(value*))
      
      inline def setMK(value: js.Array[Any]): Self = StObject.set(x, "MK", value.asInstanceOf[js.Any])
      
      inline def setMKUndefined: Self = StObject.set(x, "MK", js.undefined)
      
      inline def setMKVarargs(value: Any*): Self = StObject.set(x, "MK", js.Array(value*))
      
      inline def setML(value: js.Array[Any]): Self = StObject.set(x, "ML", value.asInstanceOf[js.Any])
      
      inline def setMLUndefined: Self = StObject.set(x, "ML", js.undefined)
      
      inline def setMLVarargs(value: Any*): Self = StObject.set(x, "ML", js.Array(value*))
      
      inline def setMM(value: js.Array[Any]): Self = StObject.set(x, "MM", value.asInstanceOf[js.Any])
      
      inline def setMMUndefined: Self = StObject.set(x, "MM", js.undefined)
      
      inline def setMMVarargs(value: Any*): Self = StObject.set(x, "MM", js.Array(value*))
      
      inline def setMN(value: js.Array[Any]): Self = StObject.set(x, "MN", value.asInstanceOf[js.Any])
      
      inline def setMNUndefined: Self = StObject.set(x, "MN", js.undefined)
      
      inline def setMNVarargs(value: Any*): Self = StObject.set(x, "MN", js.Array(value*))
      
      inline def setMO(value: js.Array[Any]): Self = StObject.set(x, "MO", value.asInstanceOf[js.Any])
      
      inline def setMOUndefined: Self = StObject.set(x, "MO", js.undefined)
      
      inline def setMOVarargs(value: Any*): Self = StObject.set(x, "MO", js.Array(value*))
      
      inline def setMP(value: js.Array[Any]): Self = StObject.set(x, "MP", value.asInstanceOf[js.Any])
      
      inline def setMPUndefined: Self = StObject.set(x, "MP", js.undefined)
      
      inline def setMPVarargs(value: Any*): Self = StObject.set(x, "MP", js.Array(value*))
      
      inline def setMQ(value: js.Array[Any]): Self = StObject.set(x, "MQ", value.asInstanceOf[js.Any])
      
      inline def setMQUndefined: Self = StObject.set(x, "MQ", js.undefined)
      
      inline def setMQVarargs(value: Any*): Self = StObject.set(x, "MQ", js.Array(value*))
      
      inline def setMR(value: js.Array[Any]): Self = StObject.set(x, "MR", value.asInstanceOf[js.Any])
      
      inline def setMRUndefined: Self = StObject.set(x, "MR", js.undefined)
      
      inline def setMRVarargs(value: Any*): Self = StObject.set(x, "MR", js.Array(value*))
      
      inline def setMS(value: js.Array[Any]): Self = StObject.set(x, "MS", value.asInstanceOf[js.Any])
      
      inline def setMSUndefined: Self = StObject.set(x, "MS", js.undefined)
      
      inline def setMSVarargs(value: Any*): Self = StObject.set(x, "MS", js.Array(value*))
      
      inline def setMT(value: js.Array[Any]): Self = StObject.set(x, "MT", value.asInstanceOf[js.Any])
      
      inline def setMTUndefined: Self = StObject.set(x, "MT", js.undefined)
      
      inline def setMTVarargs(value: Any*): Self = StObject.set(x, "MT", js.Array(value*))
      
      inline def setMU(value: js.Array[Any]): Self = StObject.set(x, "MU", value.asInstanceOf[js.Any])
      
      inline def setMUUndefined: Self = StObject.set(x, "MU", js.undefined)
      
      inline def setMUVarargs(value: Any*): Self = StObject.set(x, "MU", js.Array(value*))
      
      inline def setMV(value: js.Array[Any]): Self = StObject.set(x, "MV", value.asInstanceOf[js.Any])
      
      inline def setMVUndefined: Self = StObject.set(x, "MV", js.undefined)
      
      inline def setMVVarargs(value: Any*): Self = StObject.set(x, "MV", js.Array(value*))
      
      inline def setMW(value: js.Array[Any]): Self = StObject.set(x, "MW", value.asInstanceOf[js.Any])
      
      inline def setMWUndefined: Self = StObject.set(x, "MW", js.undefined)
      
      inline def setMWVarargs(value: Any*): Self = StObject.set(x, "MW", js.Array(value*))
      
      inline def setMX(value: js.Array[Any]): Self = StObject.set(x, "MX", value.asInstanceOf[js.Any])
      
      inline def setMXUndefined: Self = StObject.set(x, "MX", js.undefined)
      
      inline def setMXVarargs(value: Any*): Self = StObject.set(x, "MX", js.Array(value*))
      
      inline def setMY(value: js.Array[Any]): Self = StObject.set(x, "MY", value.asInstanceOf[js.Any])
      
      inline def setMYUndefined: Self = StObject.set(x, "MY", js.undefined)
      
      inline def setMYVarargs(value: Any*): Self = StObject.set(x, "MY", js.Array(value*))
      
      inline def setMZ(value: js.Array[Any]): Self = StObject.set(x, "MZ", value.asInstanceOf[js.Any])
      
      inline def setMZUndefined: Self = StObject.set(x, "MZ", js.undefined)
      
      inline def setMZVarargs(value: Any*): Self = StObject.set(x, "MZ", js.Array(value*))
      
      inline def setNA(value: js.Array[Any]): Self = StObject.set(x, "NA", value.asInstanceOf[js.Any])
      
      inline def setNAUndefined: Self = StObject.set(x, "NA", js.undefined)
      
      inline def setNAVarargs(value: Any*): Self = StObject.set(x, "NA", js.Array(value*))
      
      inline def setNC(value: js.Array[Any]): Self = StObject.set(x, "NC", value.asInstanceOf[js.Any])
      
      inline def setNCUndefined: Self = StObject.set(x, "NC", js.undefined)
      
      inline def setNCVarargs(value: Any*): Self = StObject.set(x, "NC", js.Array(value*))
      
      inline def setNE(value: js.Array[Any]): Self = StObject.set(x, "NE", value.asInstanceOf[js.Any])
      
      inline def setNEUndefined: Self = StObject.set(x, "NE", js.undefined)
      
      inline def setNEVarargs(value: Any*): Self = StObject.set(x, "NE", js.Array(value*))
      
      inline def setNF(value: js.Array[Any]): Self = StObject.set(x, "NF", value.asInstanceOf[js.Any])
      
      inline def setNFUndefined: Self = StObject.set(x, "NF", js.undefined)
      
      inline def setNFVarargs(value: Any*): Self = StObject.set(x, "NF", js.Array(value*))
      
      inline def setNG(value: js.Array[Any]): Self = StObject.set(x, "NG", value.asInstanceOf[js.Any])
      
      inline def setNGUndefined: Self = StObject.set(x, "NG", js.undefined)
      
      inline def setNGVarargs(value: Any*): Self = StObject.set(x, "NG", js.Array(value*))
      
      inline def setNI(value: js.Array[Any]): Self = StObject.set(x, "NI", value.asInstanceOf[js.Any])
      
      inline def setNIUndefined: Self = StObject.set(x, "NI", js.undefined)
      
      inline def setNIVarargs(value: Any*): Self = StObject.set(x, "NI", js.Array(value*))
      
      inline def setNL(value: js.Array[Any]): Self = StObject.set(x, "NL", value.asInstanceOf[js.Any])
      
      inline def setNLUndefined: Self = StObject.set(x, "NL", js.undefined)
      
      inline def setNLVarargs(value: Any*): Self = StObject.set(x, "NL", js.Array(value*))
      
      inline def setNO(value: js.Array[Any]): Self = StObject.set(x, "NO", value.asInstanceOf[js.Any])
      
      inline def setNOUndefined: Self = StObject.set(x, "NO", js.undefined)
      
      inline def setNOVarargs(value: Any*): Self = StObject.set(x, "NO", js.Array(value*))
      
      inline def setNP(value: js.Array[Any]): Self = StObject.set(x, "NP", value.asInstanceOf[js.Any])
      
      inline def setNPUndefined: Self = StObject.set(x, "NP", js.undefined)
      
      inline def setNPVarargs(value: Any*): Self = StObject.set(x, "NP", js.Array(value*))
      
      inline def setNR(value: js.Array[Any]): Self = StObject.set(x, "NR", value.asInstanceOf[js.Any])
      
      inline def setNRUndefined: Self = StObject.set(x, "NR", js.undefined)
      
      inline def setNRVarargs(value: Any*): Self = StObject.set(x, "NR", js.Array(value*))
      
      inline def setNU(value: js.Array[Any]): Self = StObject.set(x, "NU", value.asInstanceOf[js.Any])
      
      inline def setNUUndefined: Self = StObject.set(x, "NU", js.undefined)
      
      inline def setNUVarargs(value: Any*): Self = StObject.set(x, "NU", js.Array(value*))
      
      inline def setNZ(value: js.Array[Any]): Self = StObject.set(x, "NZ", value.asInstanceOf[js.Any])
      
      inline def setNZUndefined: Self = StObject.set(x, "NZ", js.undefined)
      
      inline def setNZVarargs(value: Any*): Self = StObject.set(x, "NZ", js.Array(value*))
      
      inline def setOM(value: js.Array[Any]): Self = StObject.set(x, "OM", value.asInstanceOf[js.Any])
      
      inline def setOMUndefined: Self = StObject.set(x, "OM", js.undefined)
      
      inline def setOMVarargs(value: Any*): Self = StObject.set(x, "OM", js.Array(value*))
      
      inline def setPA(value: js.Array[Any]): Self = StObject.set(x, "PA", value.asInstanceOf[js.Any])
      
      inline def setPAUndefined: Self = StObject.set(x, "PA", js.undefined)
      
      inline def setPAVarargs(value: Any*): Self = StObject.set(x, "PA", js.Array(value*))
      
      inline def setPE(value: js.Array[Any]): Self = StObject.set(x, "PE", value.asInstanceOf[js.Any])
      
      inline def setPEUndefined: Self = StObject.set(x, "PE", js.undefined)
      
      inline def setPEVarargs(value: Any*): Self = StObject.set(x, "PE", js.Array(value*))
      
      inline def setPF(value: js.Array[Any]): Self = StObject.set(x, "PF", value.asInstanceOf[js.Any])
      
      inline def setPFUndefined: Self = StObject.set(x, "PF", js.undefined)
      
      inline def setPFVarargs(value: Any*): Self = StObject.set(x, "PF", js.Array(value*))
      
      inline def setPG(value: js.Array[Any]): Self = StObject.set(x, "PG", value.asInstanceOf[js.Any])
      
      inline def setPGUndefined: Self = StObject.set(x, "PG", js.undefined)
      
      inline def setPGVarargs(value: Any*): Self = StObject.set(x, "PG", js.Array(value*))
      
      inline def setPH(value: js.Array[Any]): Self = StObject.set(x, "PH", value.asInstanceOf[js.Any])
      
      inline def setPHUndefined: Self = StObject.set(x, "PH", js.undefined)
      
      inline def setPHVarargs(value: Any*): Self = StObject.set(x, "PH", js.Array(value*))
      
      inline def setPK(value: js.Array[Any]): Self = StObject.set(x, "PK", value.asInstanceOf[js.Any])
      
      inline def setPKUndefined: Self = StObject.set(x, "PK", js.undefined)
      
      inline def setPKVarargs(value: Any*): Self = StObject.set(x, "PK", js.Array(value*))
      
      inline def setPL(value: js.Array[Any]): Self = StObject.set(x, "PL", value.asInstanceOf[js.Any])
      
      inline def setPLUndefined: Self = StObject.set(x, "PL", js.undefined)
      
      inline def setPLVarargs(value: Any*): Self = StObject.set(x, "PL", js.Array(value*))
      
      inline def setPM(value: js.Array[Any]): Self = StObject.set(x, "PM", value.asInstanceOf[js.Any])
      
      inline def setPMUndefined: Self = StObject.set(x, "PM", js.undefined)
      
      inline def setPMVarargs(value: Any*): Self = StObject.set(x, "PM", js.Array(value*))
      
      inline def setPR(value: js.Array[Any]): Self = StObject.set(x, "PR", value.asInstanceOf[js.Any])
      
      inline def setPRUndefined: Self = StObject.set(x, "PR", js.undefined)
      
      inline def setPRVarargs(value: Any*): Self = StObject.set(x, "PR", js.Array(value*))
      
      inline def setPS(value: js.Array[Any]): Self = StObject.set(x, "PS", value.asInstanceOf[js.Any])
      
      inline def setPSUndefined: Self = StObject.set(x, "PS", js.undefined)
      
      inline def setPSVarargs(value: Any*): Self = StObject.set(x, "PS", js.Array(value*))
      
      inline def setPT(value: js.Array[Any]): Self = StObject.set(x, "PT", value.asInstanceOf[js.Any])
      
      inline def setPTUndefined: Self = StObject.set(x, "PT", js.undefined)
      
      inline def setPTVarargs(value: Any*): Self = StObject.set(x, "PT", js.Array(value*))
      
      inline def setPW(value: js.Array[Any]): Self = StObject.set(x, "PW", value.asInstanceOf[js.Any])
      
      inline def setPWUndefined: Self = StObject.set(x, "PW", js.undefined)
      
      inline def setPWVarargs(value: Any*): Self = StObject.set(x, "PW", js.Array(value*))
      
      inline def setPY(value: js.Array[Any]): Self = StObject.set(x, "PY", value.asInstanceOf[js.Any])
      
      inline def setPYUndefined: Self = StObject.set(x, "PY", js.undefined)
      
      inline def setPYVarargs(value: Any*): Self = StObject.set(x, "PY", js.Array(value*))
      
      inline def setQA(value: js.Array[Any]): Self = StObject.set(x, "QA", value.asInstanceOf[js.Any])
      
      inline def setQAUndefined: Self = StObject.set(x, "QA", js.undefined)
      
      inline def setQAVarargs(value: Any*): Self = StObject.set(x, "QA", js.Array(value*))
      
      inline def setRE(value: js.Array[Any]): Self = StObject.set(x, "RE", value.asInstanceOf[js.Any])
      
      inline def setREUndefined: Self = StObject.set(x, "RE", js.undefined)
      
      inline def setREVarargs(value: Any*): Self = StObject.set(x, "RE", js.Array(value*))
      
      inline def setRO(value: js.Array[Any]): Self = StObject.set(x, "RO", value.asInstanceOf[js.Any])
      
      inline def setROUndefined: Self = StObject.set(x, "RO", js.undefined)
      
      inline def setROVarargs(value: Any*): Self = StObject.set(x, "RO", js.Array(value*))
      
      inline def setRS(value: js.Array[Any]): Self = StObject.set(x, "RS", value.asInstanceOf[js.Any])
      
      inline def setRSUndefined: Self = StObject.set(x, "RS", js.undefined)
      
      inline def setRSVarargs(value: Any*): Self = StObject.set(x, "RS", js.Array(value*))
      
      inline def setRU(value: js.Array[Any]): Self = StObject.set(x, "RU", value.asInstanceOf[js.Any])
      
      inline def setRUUndefined: Self = StObject.set(x, "RU", js.undefined)
      
      inline def setRUVarargs(value: Any*): Self = StObject.set(x, "RU", js.Array(value*))
      
      inline def setRW(value: js.Array[Any]): Self = StObject.set(x, "RW", value.asInstanceOf[js.Any])
      
      inline def setRWUndefined: Self = StObject.set(x, "RW", js.undefined)
      
      inline def setRWVarargs(value: Any*): Self = StObject.set(x, "RW", js.Array(value*))
      
      inline def setSA(value: js.Array[Any]): Self = StObject.set(x, "SA", value.asInstanceOf[js.Any])
      
      inline def setSAUndefined: Self = StObject.set(x, "SA", js.undefined)
      
      inline def setSAVarargs(value: Any*): Self = StObject.set(x, "SA", js.Array(value*))
      
      inline def setSB(value: js.Array[Any]): Self = StObject.set(x, "SB", value.asInstanceOf[js.Any])
      
      inline def setSBUndefined: Self = StObject.set(x, "SB", js.undefined)
      
      inline def setSBVarargs(value: Any*): Self = StObject.set(x, "SB", js.Array(value*))
      
      inline def setSC(value: js.Array[Any]): Self = StObject.set(x, "SC", value.asInstanceOf[js.Any])
      
      inline def setSCUndefined: Self = StObject.set(x, "SC", js.undefined)
      
      inline def setSCVarargs(value: Any*): Self = StObject.set(x, "SC", js.Array(value*))
      
      inline def setSD(value: js.Array[Any]): Self = StObject.set(x, "SD", value.asInstanceOf[js.Any])
      
      inline def setSDUndefined: Self = StObject.set(x, "SD", js.undefined)
      
      inline def setSDVarargs(value: Any*): Self = StObject.set(x, "SD", js.Array(value*))
      
      inline def setSE(value: js.Array[Any]): Self = StObject.set(x, "SE", value.asInstanceOf[js.Any])
      
      inline def setSEUndefined: Self = StObject.set(x, "SE", js.undefined)
      
      inline def setSEVarargs(value: Any*): Self = StObject.set(x, "SE", js.Array(value*))
      
      inline def setSG(value: js.Array[Any]): Self = StObject.set(x, "SG", value.asInstanceOf[js.Any])
      
      inline def setSGUndefined: Self = StObject.set(x, "SG", js.undefined)
      
      inline def setSGVarargs(value: Any*): Self = StObject.set(x, "SG", js.Array(value*))
      
      inline def setSH(value: js.Array[Any]): Self = StObject.set(x, "SH", value.asInstanceOf[js.Any])
      
      inline def setSHUndefined: Self = StObject.set(x, "SH", js.undefined)
      
      inline def setSHVarargs(value: Any*): Self = StObject.set(x, "SH", js.Array(value*))
      
      inline def setSI(value: js.Array[Any]): Self = StObject.set(x, "SI", value.asInstanceOf[js.Any])
      
      inline def setSIUndefined: Self = StObject.set(x, "SI", js.undefined)
      
      inline def setSIVarargs(value: Any*): Self = StObject.set(x, "SI", js.Array(value*))
      
      inline def setSJ(value: js.Array[Any]): Self = StObject.set(x, "SJ", value.asInstanceOf[js.Any])
      
      inline def setSJUndefined: Self = StObject.set(x, "SJ", js.undefined)
      
      inline def setSJVarargs(value: Any*): Self = StObject.set(x, "SJ", js.Array(value*))
      
      inline def setSK(value: js.Array[Any]): Self = StObject.set(x, "SK", value.asInstanceOf[js.Any])
      
      inline def setSKUndefined: Self = StObject.set(x, "SK", js.undefined)
      
      inline def setSKVarargs(value: Any*): Self = StObject.set(x, "SK", js.Array(value*))
      
      inline def setSL(value: js.Array[Any]): Self = StObject.set(x, "SL", value.asInstanceOf[js.Any])
      
      inline def setSLUndefined: Self = StObject.set(x, "SL", js.undefined)
      
      inline def setSLVarargs(value: Any*): Self = StObject.set(x, "SL", js.Array(value*))
      
      inline def setSM(value: js.Array[Any]): Self = StObject.set(x, "SM", value.asInstanceOf[js.Any])
      
      inline def setSMUndefined: Self = StObject.set(x, "SM", js.undefined)
      
      inline def setSMVarargs(value: Any*): Self = StObject.set(x, "SM", js.Array(value*))
      
      inline def setSN(value: js.Array[Any]): Self = StObject.set(x, "SN", value.asInstanceOf[js.Any])
      
      inline def setSNUndefined: Self = StObject.set(x, "SN", js.undefined)
      
      inline def setSNVarargs(value: Any*): Self = StObject.set(x, "SN", js.Array(value*))
      
      inline def setSO(value: js.Array[Any]): Self = StObject.set(x, "SO", value.asInstanceOf[js.Any])
      
      inline def setSOUndefined: Self = StObject.set(x, "SO", js.undefined)
      
      inline def setSOVarargs(value: Any*): Self = StObject.set(x, "SO", js.Array(value*))
      
      inline def setSR(value: js.Array[Any]): Self = StObject.set(x, "SR", value.asInstanceOf[js.Any])
      
      inline def setSRUndefined: Self = StObject.set(x, "SR", js.undefined)
      
      inline def setSRVarargs(value: Any*): Self = StObject.set(x, "SR", js.Array(value*))
      
      inline def setSS(value: js.Array[Any]): Self = StObject.set(x, "SS", value.asInstanceOf[js.Any])
      
      inline def setSSUndefined: Self = StObject.set(x, "SS", js.undefined)
      
      inline def setSSVarargs(value: Any*): Self = StObject.set(x, "SS", js.Array(value*))
      
      inline def setST(value: js.Array[Any]): Self = StObject.set(x, "ST", value.asInstanceOf[js.Any])
      
      inline def setSTUndefined: Self = StObject.set(x, "ST", js.undefined)
      
      inline def setSTVarargs(value: Any*): Self = StObject.set(x, "ST", js.Array(value*))
      
      inline def setSV(value: js.Array[Any]): Self = StObject.set(x, "SV", value.asInstanceOf[js.Any])
      
      inline def setSVUndefined: Self = StObject.set(x, "SV", js.undefined)
      
      inline def setSVVarargs(value: Any*): Self = StObject.set(x, "SV", js.Array(value*))
      
      inline def setSX(value: js.Array[Any]): Self = StObject.set(x, "SX", value.asInstanceOf[js.Any])
      
      inline def setSXUndefined: Self = StObject.set(x, "SX", js.undefined)
      
      inline def setSXVarargs(value: Any*): Self = StObject.set(x, "SX", js.Array(value*))
      
      inline def setSY(value: js.Array[Any]): Self = StObject.set(x, "SY", value.asInstanceOf[js.Any])
      
      inline def setSYUndefined: Self = StObject.set(x, "SY", js.undefined)
      
      inline def setSYVarargs(value: Any*): Self = StObject.set(x, "SY", js.Array(value*))
      
      inline def setSZ(value: js.Array[Any]): Self = StObject.set(x, "SZ", value.asInstanceOf[js.Any])
      
      inline def setSZUndefined: Self = StObject.set(x, "SZ", js.undefined)
      
      inline def setSZVarargs(value: Any*): Self = StObject.set(x, "SZ", js.Array(value*))
      
      inline def setTA(value: js.Array[Any]): Self = StObject.set(x, "TA", value.asInstanceOf[js.Any])
      
      inline def setTAUndefined: Self = StObject.set(x, "TA", js.undefined)
      
      inline def setTAVarargs(value: Any*): Self = StObject.set(x, "TA", js.Array(value*))
      
      inline def setTC(value: js.Array[Any]): Self = StObject.set(x, "TC", value.asInstanceOf[js.Any])
      
      inline def setTCUndefined: Self = StObject.set(x, "TC", js.undefined)
      
      inline def setTCVarargs(value: Any*): Self = StObject.set(x, "TC", js.Array(value*))
      
      inline def setTD(value: js.Array[Any]): Self = StObject.set(x, "TD", value.asInstanceOf[js.Any])
      
      inline def setTDUndefined: Self = StObject.set(x, "TD", js.undefined)
      
      inline def setTDVarargs(value: Any*): Self = StObject.set(x, "TD", js.Array(value*))
      
      inline def setTG(value: js.Array[Any]): Self = StObject.set(x, "TG", value.asInstanceOf[js.Any])
      
      inline def setTGUndefined: Self = StObject.set(x, "TG", js.undefined)
      
      inline def setTGVarargs(value: Any*): Self = StObject.set(x, "TG", js.Array(value*))
      
      inline def setTH(value: js.Array[Any]): Self = StObject.set(x, "TH", value.asInstanceOf[js.Any])
      
      inline def setTHUndefined: Self = StObject.set(x, "TH", js.undefined)
      
      inline def setTHVarargs(value: Any*): Self = StObject.set(x, "TH", js.Array(value*))
      
      inline def setTJ(value: js.Array[Any]): Self = StObject.set(x, "TJ", value.asInstanceOf[js.Any])
      
      inline def setTJUndefined: Self = StObject.set(x, "TJ", js.undefined)
      
      inline def setTJVarargs(value: Any*): Self = StObject.set(x, "TJ", js.Array(value*))
      
      inline def setTK(value: js.Array[Any]): Self = StObject.set(x, "TK", value.asInstanceOf[js.Any])
      
      inline def setTKUndefined: Self = StObject.set(x, "TK", js.undefined)
      
      inline def setTKVarargs(value: Any*): Self = StObject.set(x, "TK", js.Array(value*))
      
      inline def setTL(value: js.Array[Any]): Self = StObject.set(x, "TL", value.asInstanceOf[js.Any])
      
      inline def setTLUndefined: Self = StObject.set(x, "TL", js.undefined)
      
      inline def setTLVarargs(value: Any*): Self = StObject.set(x, "TL", js.Array(value*))
      
      inline def setTM(value: js.Array[Any]): Self = StObject.set(x, "TM", value.asInstanceOf[js.Any])
      
      inline def setTMUndefined: Self = StObject.set(x, "TM", js.undefined)
      
      inline def setTMVarargs(value: Any*): Self = StObject.set(x, "TM", js.Array(value*))
      
      inline def setTN(value: js.Array[Any]): Self = StObject.set(x, "TN", value.asInstanceOf[js.Any])
      
      inline def setTNUndefined: Self = StObject.set(x, "TN", js.undefined)
      
      inline def setTNVarargs(value: Any*): Self = StObject.set(x, "TN", js.Array(value*))
      
      inline def setTO(value: js.Array[Any]): Self = StObject.set(x, "TO", value.asInstanceOf[js.Any])
      
      inline def setTOUndefined: Self = StObject.set(x, "TO", js.undefined)
      
      inline def setTOVarargs(value: Any*): Self = StObject.set(x, "TO", js.Array(value*))
      
      inline def setTR(value: js.Array[Any]): Self = StObject.set(x, "TR", value.asInstanceOf[js.Any])
      
      inline def setTRUndefined: Self = StObject.set(x, "TR", js.undefined)
      
      inline def setTRVarargs(value: Any*): Self = StObject.set(x, "TR", js.Array(value*))
      
      inline def setTT(value: js.Array[Any]): Self = StObject.set(x, "TT", value.asInstanceOf[js.Any])
      
      inline def setTTUndefined: Self = StObject.set(x, "TT", js.undefined)
      
      inline def setTTVarargs(value: Any*): Self = StObject.set(x, "TT", js.Array(value*))
      
      inline def setTV(value: js.Array[Any]): Self = StObject.set(x, "TV", value.asInstanceOf[js.Any])
      
      inline def setTVUndefined: Self = StObject.set(x, "TV", js.undefined)
      
      inline def setTVVarargs(value: Any*): Self = StObject.set(x, "TV", js.Array(value*))
      
      inline def setTW(value: js.Array[Any]): Self = StObject.set(x, "TW", value.asInstanceOf[js.Any])
      
      inline def setTWUndefined: Self = StObject.set(x, "TW", js.undefined)
      
      inline def setTWVarargs(value: Any*): Self = StObject.set(x, "TW", js.Array(value*))
      
      inline def setTZ(value: js.Array[Any]): Self = StObject.set(x, "TZ", value.asInstanceOf[js.Any])
      
      inline def setTZUndefined: Self = StObject.set(x, "TZ", js.undefined)
      
      inline def setTZVarargs(value: Any*): Self = StObject.set(x, "TZ", js.Array(value*))
      
      inline def setUA(value: js.Array[Any]): Self = StObject.set(x, "UA", value.asInstanceOf[js.Any])
      
      inline def setUAUndefined: Self = StObject.set(x, "UA", js.undefined)
      
      inline def setUAVarargs(value: Any*): Self = StObject.set(x, "UA", js.Array(value*))
      
      inline def setUG(value: js.Array[Any]): Self = StObject.set(x, "UG", value.asInstanceOf[js.Any])
      
      inline def setUGUndefined: Self = StObject.set(x, "UG", js.undefined)
      
      inline def setUGVarargs(value: Any*): Self = StObject.set(x, "UG", js.Array(value*))
      
      inline def setUS(value: js.Array[Any]): Self = StObject.set(x, "US", value.asInstanceOf[js.Any])
      
      inline def setUSUndefined: Self = StObject.set(x, "US", js.undefined)
      
      inline def setUSVarargs(value: Any*): Self = StObject.set(x, "US", js.Array(value*))
      
      inline def setUY(value: js.Array[Any]): Self = StObject.set(x, "UY", value.asInstanceOf[js.Any])
      
      inline def setUYUndefined: Self = StObject.set(x, "UY", js.undefined)
      
      inline def setUYVarargs(value: Any*): Self = StObject.set(x, "UY", js.Array(value*))
      
      inline def setUZ(value: js.Array[Any]): Self = StObject.set(x, "UZ", value.asInstanceOf[js.Any])
      
      inline def setUZUndefined: Self = StObject.set(x, "UZ", js.undefined)
      
      inline def setUZVarargs(value: Any*): Self = StObject.set(x, "UZ", js.Array(value*))
      
      inline def setVA(value: js.Array[Any]): Self = StObject.set(x, "VA", value.asInstanceOf[js.Any])
      
      inline def setVAUndefined: Self = StObject.set(x, "VA", js.undefined)
      
      inline def setVAVarargs(value: Any*): Self = StObject.set(x, "VA", js.Array(value*))
      
      inline def setVC(value: js.Array[Any]): Self = StObject.set(x, "VC", value.asInstanceOf[js.Any])
      
      inline def setVCUndefined: Self = StObject.set(x, "VC", js.undefined)
      
      inline def setVCVarargs(value: Any*): Self = StObject.set(x, "VC", js.Array(value*))
      
      inline def setVE(value: js.Array[Any]): Self = StObject.set(x, "VE", value.asInstanceOf[js.Any])
      
      inline def setVEUndefined: Self = StObject.set(x, "VE", js.undefined)
      
      inline def setVEVarargs(value: Any*): Self = StObject.set(x, "VE", js.Array(value*))
      
      inline def setVG(value: js.Array[Any]): Self = StObject.set(x, "VG", value.asInstanceOf[js.Any])
      
      inline def setVGUndefined: Self = StObject.set(x, "VG", js.undefined)
      
      inline def setVGVarargs(value: Any*): Self = StObject.set(x, "VG", js.Array(value*))
      
      inline def setVI(value: js.Array[Any]): Self = StObject.set(x, "VI", value.asInstanceOf[js.Any])
      
      inline def setVIUndefined: Self = StObject.set(x, "VI", js.undefined)
      
      inline def setVIVarargs(value: Any*): Self = StObject.set(x, "VI", js.Array(value*))
      
      inline def setVN(value: js.Array[Any]): Self = StObject.set(x, "VN", value.asInstanceOf[js.Any])
      
      inline def setVNUndefined: Self = StObject.set(x, "VN", js.undefined)
      
      inline def setVNVarargs(value: Any*): Self = StObject.set(x, "VN", js.Array(value*))
      
      inline def setVU(value: js.Array[Any]): Self = StObject.set(x, "VU", value.asInstanceOf[js.Any])
      
      inline def setVUUndefined: Self = StObject.set(x, "VU", js.undefined)
      
      inline def setVUVarargs(value: Any*): Self = StObject.set(x, "VU", js.Array(value*))
      
      inline def setWF(value: js.Array[Any]): Self = StObject.set(x, "WF", value.asInstanceOf[js.Any])
      
      inline def setWFUndefined: Self = StObject.set(x, "WF", js.undefined)
      
      inline def setWFVarargs(value: Any*): Self = StObject.set(x, "WF", js.Array(value*))
      
      inline def setWS(value: js.Array[Any]): Self = StObject.set(x, "WS", value.asInstanceOf[js.Any])
      
      inline def setWSUndefined: Self = StObject.set(x, "WS", js.undefined)
      
      inline def setWSVarargs(value: Any*): Self = StObject.set(x, "WS", js.Array(value*))
      
      inline def setXK(value: js.Array[Any]): Self = StObject.set(x, "XK", value.asInstanceOf[js.Any])
      
      inline def setXKUndefined: Self = StObject.set(x, "XK", js.undefined)
      
      inline def setXKVarargs(value: Any*): Self = StObject.set(x, "XK", js.Array(value*))
      
      inline def setYE(value: js.Array[Any]): Self = StObject.set(x, "YE", value.asInstanceOf[js.Any])
      
      inline def setYEUndefined: Self = StObject.set(x, "YE", js.undefined)
      
      inline def setYEVarargs(value: Any*): Self = StObject.set(x, "YE", js.Array(value*))
      
      inline def setYT(value: js.Array[Any]): Self = StObject.set(x, "YT", value.asInstanceOf[js.Any])
      
      inline def setYTUndefined: Self = StObject.set(x, "YT", js.undefined)
      
      inline def setYTVarargs(value: Any*): Self = StObject.set(x, "YT", js.Array(value*))
      
      inline def setZA(value: js.Array[Any]): Self = StObject.set(x, "ZA", value.asInstanceOf[js.Any])
      
      inline def setZAUndefined: Self = StObject.set(x, "ZA", js.undefined)
      
      inline def setZAVarargs(value: Any*): Self = StObject.set(x, "ZA", js.Array(value*))
      
      inline def setZM(value: js.Array[Any]): Self = StObject.set(x, "ZM", value.asInstanceOf[js.Any])
      
      inline def setZMUndefined: Self = StObject.set(x, "ZM", js.undefined)
      
      inline def setZMVarargs(value: Any*): Self = StObject.set(x, "ZM", js.Array(value*))
      
      inline def setZW(value: js.Array[Any]): Self = StObject.set(x, "ZW", value.asInstanceOf[js.Any])
      
      inline def setZWUndefined: Self = StObject.set(x, "ZW", js.undefined)
      
      inline def setZWVarargs(value: Any*): Self = StObject.set(x, "ZW", js.Array(value*))
    }
  }
  
  type CountryCallingCode = Tagged[
    String, 
    typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.CountryCallingCode
  ]
  
  type CountryCallingCodes = StringDictionary[js.Array[CountryCode]]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.AC
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.AD
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.AE
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.AF
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.AG
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.AI
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.AL
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.AM
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.AO
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.AR
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.AS
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.AT
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.AU
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.AW
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.AX
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.AZ
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.BA
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.BB
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.BD
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.BE
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.BF
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.BG
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.BH
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.BI
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.BJ
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.BL
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.BM
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.BN
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.BO
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.BQ
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.BR
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.BS
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.BT
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.BW
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.BY
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.BZ
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.CA
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.CC
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.CD
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.CF
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.CG
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.CH
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.CI
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.CK
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.CL
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.CM
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.CN
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.CO
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.CR
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.CU
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.CV
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.CW
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.CX
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.CY
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.CZ
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.DE
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.DJ
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.DK
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.DM
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.DO
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.DZ
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.EC
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.EE
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.EG
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.EH
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.ER
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.ES
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.ET
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.FI
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.FJ
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.FK
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.FM
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.FO
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.FR
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.GA
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.GB
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.GD
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.GE
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.GF
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.GG
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.GH
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.GI
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.GL
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.GM
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.GN
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.GP
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.GQ
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.GR
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.GT
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.GU
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.GW
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.GY
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.HK
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.HN
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.HR
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.HT
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.HU
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.ID
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.IE
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.IL
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.IM
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.IN
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.IO
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.IQ
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.IR
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.IS
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.IT
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.JE
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.JM
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.JO
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.JP
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.KE
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.KG
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.KH
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.KI
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.KM
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.KN
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.KP
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.KR
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.KW
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.KY
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.KZ
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.LA
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.LB
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.LC
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.LI
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.LK
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.LR
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.LS
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.LT
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.LU
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.LV
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.LY
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.MA
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.MC
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.MD
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.ME
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.MF
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.MG
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.MH
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.MK
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.ML
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.MM
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.MN
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.MO
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.MP
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.MQ
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.MR
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.MS
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.MT
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.MU
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.MV
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.MW
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.MX
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.MY
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.MZ
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.NA
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.NC
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.NE
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.NF
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.NG
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.NI
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.NL
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.NO
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.NP
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.NR
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.NU
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.NZ
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.OM
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.PA
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.PE
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.PF
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.PG
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.PH
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.PK
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.PL
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.PM
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.PR
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.PS
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.PT
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.PW
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.PY
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.QA
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.RE
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.RO
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.RS
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.RU
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.RW
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.SA
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.SB
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.SC
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.SD
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.SE
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.SG
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.SH
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.SI
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.SJ
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.SK
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.SL
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.SM
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.SN
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.SO
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.SR
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.SS
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.ST
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.SV
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.SX
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.SY
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.SZ
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.TA
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.TC
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.TD
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.TG
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.TH
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.TJ
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.TK
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.TL
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.TM
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.TN
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.TO
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.TR
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.TT
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.TV
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.TW
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.TZ
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.UA
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.UG
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.US
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.UY
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.UZ
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.VA
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.VC
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.VE
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.VG
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.VI
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.VN
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.VU
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.WF
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.WS
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.XK
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.YE
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.YT
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.ZA
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.ZM
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.ZW
  */
  trait CountryCode extends StObject
  object CountryCode {
    
    inline def AC: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.AC = "AC".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.AC]
    
    inline def AD: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.AD = "AD".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.AD]
    
    inline def AE: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.AE = "AE".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.AE]
    
    inline def AF: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.AF = "AF".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.AF]
    
    inline def AG: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.AG = "AG".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.AG]
    
    inline def AI: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.AI = "AI".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.AI]
    
    inline def AL: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.AL = "AL".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.AL]
    
    inline def AM: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.AM = "AM".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.AM]
    
    inline def AO: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.AO = "AO".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.AO]
    
    inline def AR: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.AR = "AR".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.AR]
    
    inline def AS: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.AS = "AS".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.AS]
    
    inline def AT: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.AT = "AT".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.AT]
    
    inline def AU: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.AU = "AU".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.AU]
    
    inline def AW: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.AW = "AW".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.AW]
    
    inline def AX: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.AX = "AX".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.AX]
    
    inline def AZ: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.AZ = "AZ".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.AZ]
    
    inline def BA: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.BA = "BA".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.BA]
    
    inline def BB: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.BB = "BB".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.BB]
    
    inline def BD: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.BD = "BD".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.BD]
    
    inline def BE: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.BE = "BE".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.BE]
    
    inline def BF: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.BF = "BF".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.BF]
    
    inline def BG: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.BG = "BG".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.BG]
    
    inline def BH: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.BH = "BH".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.BH]
    
    inline def BI: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.BI = "BI".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.BI]
    
    inline def BJ: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.BJ = "BJ".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.BJ]
    
    inline def BL: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.BL = "BL".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.BL]
    
    inline def BM: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.BM = "BM".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.BM]
    
    inline def BN: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.BN = "BN".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.BN]
    
    inline def BO: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.BO = "BO".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.BO]
    
    inline def BQ: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.BQ = "BQ".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.BQ]
    
    inline def BR: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.BR = "BR".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.BR]
    
    inline def BS: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.BS = "BS".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.BS]
    
    inline def BT: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.BT = "BT".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.BT]
    
    inline def BW: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.BW = "BW".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.BW]
    
    inline def BY: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.BY = "BY".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.BY]
    
    inline def BZ: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.BZ = "BZ".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.BZ]
    
    inline def CA: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.CA = "CA".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.CA]
    
    inline def CC: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.CC = "CC".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.CC]
    
    inline def CD: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.CD = "CD".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.CD]
    
    inline def CF: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.CF = "CF".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.CF]
    
    inline def CG: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.CG = "CG".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.CG]
    
    inline def CH: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.CH = "CH".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.CH]
    
    inline def CI: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.CI = "CI".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.CI]
    
    inline def CK: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.CK = "CK".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.CK]
    
    inline def CL: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.CL = "CL".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.CL]
    
    inline def CM: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.CM = "CM".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.CM]
    
    inline def CN: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.CN = "CN".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.CN]
    
    inline def CO: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.CO = "CO".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.CO]
    
    inline def CR: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.CR = "CR".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.CR]
    
    inline def CU: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.CU = "CU".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.CU]
    
    inline def CV: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.CV = "CV".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.CV]
    
    inline def CW: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.CW = "CW".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.CW]
    
    inline def CX: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.CX = "CX".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.CX]
    
    inline def CY: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.CY = "CY".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.CY]
    
    inline def CZ: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.CZ = "CZ".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.CZ]
    
    inline def DE: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.DE = "DE".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.DE]
    
    inline def DJ: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.DJ = "DJ".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.DJ]
    
    inline def DK: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.DK = "DK".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.DK]
    
    inline def DM: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.DM = "DM".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.DM]
    
    inline def DO: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.DO = "DO".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.DO]
    
    inline def DZ: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.DZ = "DZ".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.DZ]
    
    inline def EC: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.EC = "EC".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.EC]
    
    inline def EE: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.EE = "EE".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.EE]
    
    inline def EG: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.EG = "EG".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.EG]
    
    inline def EH: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.EH = "EH".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.EH]
    
    inline def ER: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.ER = "ER".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.ER]
    
    inline def ES: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.ES = "ES".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.ES]
    
    inline def ET: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.ET = "ET".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.ET]
    
    inline def FI: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.FI = "FI".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.FI]
    
    inline def FJ: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.FJ = "FJ".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.FJ]
    
    inline def FK: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.FK = "FK".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.FK]
    
    inline def FM: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.FM = "FM".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.FM]
    
    inline def FO: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.FO = "FO".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.FO]
    
    inline def FR: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.FR = "FR".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.FR]
    
    inline def GA: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.GA = "GA".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.GA]
    
    inline def GB: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.GB = "GB".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.GB]
    
    inline def GD: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.GD = "GD".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.GD]
    
    inline def GE: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.GE = "GE".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.GE]
    
    inline def GF: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.GF = "GF".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.GF]
    
    inline def GG: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.GG = "GG".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.GG]
    
    inline def GH: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.GH = "GH".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.GH]
    
    inline def GI: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.GI = "GI".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.GI]
    
    inline def GL: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.GL = "GL".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.GL]
    
    inline def GM: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.GM = "GM".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.GM]
    
    inline def GN: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.GN = "GN".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.GN]
    
    inline def GP: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.GP = "GP".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.GP]
    
    inline def GQ: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.GQ = "GQ".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.GQ]
    
    inline def GR: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.GR = "GR".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.GR]
    
    inline def GT: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.GT = "GT".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.GT]
    
    inline def GU: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.GU = "GU".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.GU]
    
    inline def GW: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.GW = "GW".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.GW]
    
    inline def GY: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.GY = "GY".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.GY]
    
    inline def HK: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.HK = "HK".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.HK]
    
    inline def HN: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.HN = "HN".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.HN]
    
    inline def HR: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.HR = "HR".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.HR]
    
    inline def HT: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.HT = "HT".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.HT]
    
    inline def HU: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.HU = "HU".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.HU]
    
    inline def ID: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.ID = "ID".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.ID]
    
    inline def IE: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.IE = "IE".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.IE]
    
    inline def IL: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.IL = "IL".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.IL]
    
    inline def IM: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.IM = "IM".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.IM]
    
    inline def IN: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.IN = "IN".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.IN]
    
    inline def IO: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.IO = "IO".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.IO]
    
    inline def IQ: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.IQ = "IQ".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.IQ]
    
    inline def IR: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.IR = "IR".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.IR]
    
    inline def IS: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.IS = "IS".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.IS]
    
    inline def IT: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.IT = "IT".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.IT]
    
    inline def JE: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.JE = "JE".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.JE]
    
    inline def JM: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.JM = "JM".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.JM]
    
    inline def JO: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.JO = "JO".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.JO]
    
    inline def JP: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.JP = "JP".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.JP]
    
    inline def KE: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.KE = "KE".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.KE]
    
    inline def KG: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.KG = "KG".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.KG]
    
    inline def KH: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.KH = "KH".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.KH]
    
    inline def KI: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.KI = "KI".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.KI]
    
    inline def KM: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.KM = "KM".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.KM]
    
    inline def KN: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.KN = "KN".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.KN]
    
    inline def KP: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.KP = "KP".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.KP]
    
    inline def KR: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.KR = "KR".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.KR]
    
    inline def KW: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.KW = "KW".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.KW]
    
    inline def KY: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.KY = "KY".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.KY]
    
    inline def KZ: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.KZ = "KZ".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.KZ]
    
    inline def LA: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.LA = "LA".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.LA]
    
    inline def LB: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.LB = "LB".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.LB]
    
    inline def LC: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.LC = "LC".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.LC]
    
    inline def LI: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.LI = "LI".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.LI]
    
    inline def LK: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.LK = "LK".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.LK]
    
    inline def LR: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.LR = "LR".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.LR]
    
    inline def LS: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.LS = "LS".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.LS]
    
    inline def LT: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.LT = "LT".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.LT]
    
    inline def LU: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.LU = "LU".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.LU]
    
    inline def LV: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.LV = "LV".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.LV]
    
    inline def LY: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.LY = "LY".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.LY]
    
    inline def MA: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.MA = "MA".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.MA]
    
    inline def MC: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.MC = "MC".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.MC]
    
    inline def MD: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.MD = "MD".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.MD]
    
    inline def ME: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.ME = "ME".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.ME]
    
    inline def MF: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.MF = "MF".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.MF]
    
    inline def MG: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.MG = "MG".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.MG]
    
    inline def MH: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.MH = "MH".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.MH]
    
    inline def MK: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.MK = "MK".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.MK]
    
    inline def ML: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.ML = "ML".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.ML]
    
    inline def MM: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.MM = "MM".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.MM]
    
    inline def MN: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.MN = "MN".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.MN]
    
    inline def MO: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.MO = "MO".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.MO]
    
    inline def MP: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.MP = "MP".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.MP]
    
    inline def MQ: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.MQ = "MQ".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.MQ]
    
    inline def MR: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.MR = "MR".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.MR]
    
    inline def MS: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.MS = "MS".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.MS]
    
    inline def MT: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.MT = "MT".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.MT]
    
    inline def MU: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.MU = "MU".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.MU]
    
    inline def MV: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.MV = "MV".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.MV]
    
    inline def MW: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.MW = "MW".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.MW]
    
    inline def MX: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.MX = "MX".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.MX]
    
    inline def MY: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.MY = "MY".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.MY]
    
    inline def MZ: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.MZ = "MZ".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.MZ]
    
    inline def NA: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.NA = "NA".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.NA]
    
    inline def NC: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.NC = "NC".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.NC]
    
    inline def NE: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.NE = "NE".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.NE]
    
    inline def NF: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.NF = "NF".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.NF]
    
    inline def NG: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.NG = "NG".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.NG]
    
    inline def NI: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.NI = "NI".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.NI]
    
    inline def NL: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.NL = "NL".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.NL]
    
    inline def NO: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.NO = "NO".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.NO]
    
    inline def NP: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.NP = "NP".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.NP]
    
    inline def NR: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.NR = "NR".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.NR]
    
    inline def NU: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.NU = "NU".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.NU]
    
    inline def NZ: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.NZ = "NZ".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.NZ]
    
    inline def OM: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.OM = "OM".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.OM]
    
    inline def PA: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.PA = "PA".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.PA]
    
    inline def PE: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.PE = "PE".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.PE]
    
    inline def PF: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.PF = "PF".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.PF]
    
    inline def PG: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.PG = "PG".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.PG]
    
    inline def PH: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.PH = "PH".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.PH]
    
    inline def PK: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.PK = "PK".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.PK]
    
    inline def PL: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.PL = "PL".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.PL]
    
    inline def PM: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.PM = "PM".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.PM]
    
    inline def PR: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.PR = "PR".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.PR]
    
    inline def PS: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.PS = "PS".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.PS]
    
    inline def PT: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.PT = "PT".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.PT]
    
    inline def PW: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.PW = "PW".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.PW]
    
    inline def PY: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.PY = "PY".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.PY]
    
    inline def QA: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.QA = "QA".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.QA]
    
    inline def RE: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.RE = "RE".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.RE]
    
    inline def RO: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.RO = "RO".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.RO]
    
    inline def RS: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.RS = "RS".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.RS]
    
    inline def RU: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.RU = "RU".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.RU]
    
    inline def RW: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.RW = "RW".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.RW]
    
    inline def SA: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.SA = "SA".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.SA]
    
    inline def SB: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.SB = "SB".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.SB]
    
    inline def SC: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.SC = "SC".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.SC]
    
    inline def SD: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.SD = "SD".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.SD]
    
    inline def SE: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.SE = "SE".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.SE]
    
    inline def SG: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.SG = "SG".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.SG]
    
    inline def SH: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.SH = "SH".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.SH]
    
    inline def SI: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.SI = "SI".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.SI]
    
    inline def SJ: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.SJ = "SJ".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.SJ]
    
    inline def SK: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.SK = "SK".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.SK]
    
    inline def SL: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.SL = "SL".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.SL]
    
    inline def SM: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.SM = "SM".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.SM]
    
    inline def SN: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.SN = "SN".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.SN]
    
    inline def SO: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.SO = "SO".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.SO]
    
    inline def SR: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.SR = "SR".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.SR]
    
    inline def SS: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.SS = "SS".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.SS]
    
    inline def ST: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.ST = "ST".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.ST]
    
    inline def SV: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.SV = "SV".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.SV]
    
    inline def SX: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.SX = "SX".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.SX]
    
    inline def SY: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.SY = "SY".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.SY]
    
    inline def SZ: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.SZ = "SZ".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.SZ]
    
    inline def TA: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.TA = "TA".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.TA]
    
    inline def TC: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.TC = "TC".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.TC]
    
    inline def TD: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.TD = "TD".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.TD]
    
    inline def TG: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.TG = "TG".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.TG]
    
    inline def TH: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.TH = "TH".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.TH]
    
    inline def TJ: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.TJ = "TJ".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.TJ]
    
    inline def TK: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.TK = "TK".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.TK]
    
    inline def TL: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.TL = "TL".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.TL]
    
    inline def TM: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.TM = "TM".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.TM]
    
    inline def TN: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.TN = "TN".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.TN]
    
    inline def TO: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.TO = "TO".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.TO]
    
    inline def TR: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.TR = "TR".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.TR]
    
    inline def TT: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.TT = "TT".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.TT]
    
    inline def TV: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.TV = "TV".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.TV]
    
    inline def TW: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.TW = "TW".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.TW]
    
    inline def TZ: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.TZ = "TZ".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.TZ]
    
    inline def UA: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.UA = "UA".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.UA]
    
    inline def UG: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.UG = "UG".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.UG]
    
    inline def US: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.US = "US".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.US]
    
    inline def UY: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.UY = "UY".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.UY]
    
    inline def UZ: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.UZ = "UZ".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.UZ]
    
    inline def VA: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.VA = "VA".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.VA]
    
    inline def VC: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.VC = "VC".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.VC]
    
    inline def VE: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.VE = "VE".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.VE]
    
    inline def VG: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.VG = "VG".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.VG]
    
    inline def VI: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.VI = "VI".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.VI]
    
    inline def VN: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.VN = "VN".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.VN]
    
    inline def VU: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.VU = "VU".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.VU]
    
    inline def WF: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.WF = "WF".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.WF]
    
    inline def WS: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.WS = "WS".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.WS]
    
    inline def XK: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.XK = "XK".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.XK]
    
    inline def YE: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.YE = "YE".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.YE]
    
    inline def YT: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.YT = "YT".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.YT]
    
    inline def ZA: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.ZA = "ZA".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.ZA]
    
    inline def ZM: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.ZM = "ZM".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.ZM]
    
    inline def ZW: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.ZW = "ZW".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.ZW]
  }
  
  type E164Number = Tagged[String, typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.E164Number]
  
  /* Inlined {[ country in libphonenumber-js.libphonenumber-js/types.CountryCode ]: libphonenumber-js.libphonenumber-js/types.NationalNumber} */
  trait Examples extends StObject {
    
    var AC: NationalNumber
    
    var AD: NationalNumber
    
    var AE: NationalNumber
    
    var AF: NationalNumber
    
    var AG: NationalNumber
    
    var AI: NationalNumber
    
    var AL: NationalNumber
    
    var AM: NationalNumber
    
    var AO: NationalNumber
    
    var AR: NationalNumber
    
    var AS: NationalNumber
    
    var AT: NationalNumber
    
    var AU: NationalNumber
    
    var AW: NationalNumber
    
    var AX: NationalNumber
    
    var AZ: NationalNumber
    
    var BA: NationalNumber
    
    var BB: NationalNumber
    
    var BD: NationalNumber
    
    var BE: NationalNumber
    
    var BF: NationalNumber
    
    var BG: NationalNumber
    
    var BH: NationalNumber
    
    var BI: NationalNumber
    
    var BJ: NationalNumber
    
    var BL: NationalNumber
    
    var BM: NationalNumber
    
    var BN: NationalNumber
    
    var BO: NationalNumber
    
    var BQ: NationalNumber
    
    var BR: NationalNumber
    
    var BS: NationalNumber
    
    var BT: NationalNumber
    
    var BW: NationalNumber
    
    var BY: NationalNumber
    
    var BZ: NationalNumber
    
    var CA: NationalNumber
    
    var CC: NationalNumber
    
    var CD: NationalNumber
    
    var CF: NationalNumber
    
    var CG: NationalNumber
    
    var CH: NationalNumber
    
    var CI: NationalNumber
    
    var CK: NationalNumber
    
    var CL: NationalNumber
    
    var CM: NationalNumber
    
    var CN: NationalNumber
    
    var CO: NationalNumber
    
    var CR: NationalNumber
    
    var CU: NationalNumber
    
    var CV: NationalNumber
    
    var CW: NationalNumber
    
    var CX: NationalNumber
    
    var CY: NationalNumber
    
    var CZ: NationalNumber
    
    var DE: NationalNumber
    
    var DJ: NationalNumber
    
    var DK: NationalNumber
    
    var DM: NationalNumber
    
    var DO: NationalNumber
    
    var DZ: NationalNumber
    
    var EC: NationalNumber
    
    var EE: NationalNumber
    
    var EG: NationalNumber
    
    var EH: NationalNumber
    
    var ER: NationalNumber
    
    var ES: NationalNumber
    
    var ET: NationalNumber
    
    var FI: NationalNumber
    
    var FJ: NationalNumber
    
    var FK: NationalNumber
    
    var FM: NationalNumber
    
    var FO: NationalNumber
    
    var FR: NationalNumber
    
    var GA: NationalNumber
    
    var GB: NationalNumber
    
    var GD: NationalNumber
    
    var GE: NationalNumber
    
    var GF: NationalNumber
    
    var GG: NationalNumber
    
    var GH: NationalNumber
    
    var GI: NationalNumber
    
    var GL: NationalNumber
    
    var GM: NationalNumber
    
    var GN: NationalNumber
    
    var GP: NationalNumber
    
    var GQ: NationalNumber
    
    var GR: NationalNumber
    
    var GT: NationalNumber
    
    var GU: NationalNumber
    
    var GW: NationalNumber
    
    var GY: NationalNumber
    
    var HK: NationalNumber
    
    var HN: NationalNumber
    
    var HR: NationalNumber
    
    var HT: NationalNumber
    
    var HU: NationalNumber
    
    var ID: NationalNumber
    
    var IE: NationalNumber
    
    var IL: NationalNumber
    
    var IM: NationalNumber
    
    var IN: NationalNumber
    
    var IO: NationalNumber
    
    var IQ: NationalNumber
    
    var IR: NationalNumber
    
    var IS: NationalNumber
    
    var IT: NationalNumber
    
    var JE: NationalNumber
    
    var JM: NationalNumber
    
    var JO: NationalNumber
    
    var JP: NationalNumber
    
    var KE: NationalNumber
    
    var KG: NationalNumber
    
    var KH: NationalNumber
    
    var KI: NationalNumber
    
    var KM: NationalNumber
    
    var KN: NationalNumber
    
    var KP: NationalNumber
    
    var KR: NationalNumber
    
    var KW: NationalNumber
    
    var KY: NationalNumber
    
    var KZ: NationalNumber
    
    var LA: NationalNumber
    
    var LB: NationalNumber
    
    var LC: NationalNumber
    
    var LI: NationalNumber
    
    var LK: NationalNumber
    
    var LR: NationalNumber
    
    var LS: NationalNumber
    
    var LT: NationalNumber
    
    var LU: NationalNumber
    
    var LV: NationalNumber
    
    var LY: NationalNumber
    
    var MA: NationalNumber
    
    var MC: NationalNumber
    
    var MD: NationalNumber
    
    var ME: NationalNumber
    
    var MF: NationalNumber
    
    var MG: NationalNumber
    
    var MH: NationalNumber
    
    var MK: NationalNumber
    
    var ML: NationalNumber
    
    var MM: NationalNumber
    
    var MN: NationalNumber
    
    var MO: NationalNumber
    
    var MP: NationalNumber
    
    var MQ: NationalNumber
    
    var MR: NationalNumber
    
    var MS: NationalNumber
    
    var MT: NationalNumber
    
    var MU: NationalNumber
    
    var MV: NationalNumber
    
    var MW: NationalNumber
    
    var MX: NationalNumber
    
    var MY: NationalNumber
    
    var MZ: NationalNumber
    
    var NA: NationalNumber
    
    var NC: NationalNumber
    
    var NE: NationalNumber
    
    var NF: NationalNumber
    
    var NG: NationalNumber
    
    var NI: NationalNumber
    
    var NL: NationalNumber
    
    var NO: NationalNumber
    
    var NP: NationalNumber
    
    var NR: NationalNumber
    
    var NU: NationalNumber
    
    var NZ: NationalNumber
    
    var OM: NationalNumber
    
    var PA: NationalNumber
    
    var PE: NationalNumber
    
    var PF: NationalNumber
    
    var PG: NationalNumber
    
    var PH: NationalNumber
    
    var PK: NationalNumber
    
    var PL: NationalNumber
    
    var PM: NationalNumber
    
    var PR: NationalNumber
    
    var PS: NationalNumber
    
    var PT: NationalNumber
    
    var PW: NationalNumber
    
    var PY: NationalNumber
    
    var QA: NationalNumber
    
    var RE: NationalNumber
    
    var RO: NationalNumber
    
    var RS: NationalNumber
    
    var RU: NationalNumber
    
    var RW: NationalNumber
    
    var SA: NationalNumber
    
    var SB: NationalNumber
    
    var SC: NationalNumber
    
    var SD: NationalNumber
    
    var SE: NationalNumber
    
    var SG: NationalNumber
    
    var SH: NationalNumber
    
    var SI: NationalNumber
    
    var SJ: NationalNumber
    
    var SK: NationalNumber
    
    var SL: NationalNumber
    
    var SM: NationalNumber
    
    var SN: NationalNumber
    
    var SO: NationalNumber
    
    var SR: NationalNumber
    
    var SS: NationalNumber
    
    var ST: NationalNumber
    
    var SV: NationalNumber
    
    var SX: NationalNumber
    
    var SY: NationalNumber
    
    var SZ: NationalNumber
    
    var TA: NationalNumber
    
    var TC: NationalNumber
    
    var TD: NationalNumber
    
    var TG: NationalNumber
    
    var TH: NationalNumber
    
    var TJ: NationalNumber
    
    var TK: NationalNumber
    
    var TL: NationalNumber
    
    var TM: NationalNumber
    
    var TN: NationalNumber
    
    var TO: NationalNumber
    
    var TR: NationalNumber
    
    var TT: NationalNumber
    
    var TV: NationalNumber
    
    var TW: NationalNumber
    
    var TZ: NationalNumber
    
    var UA: NationalNumber
    
    var UG: NationalNumber
    
    var US: NationalNumber
    
    var UY: NationalNumber
    
    var UZ: NationalNumber
    
    var VA: NationalNumber
    
    var VC: NationalNumber
    
    var VE: NationalNumber
    
    var VG: NationalNumber
    
    var VI: NationalNumber
    
    var VN: NationalNumber
    
    var VU: NationalNumber
    
    var WF: NationalNumber
    
    var WS: NationalNumber
    
    var XK: NationalNumber
    
    var YE: NationalNumber
    
    var YT: NationalNumber
    
    var ZA: NationalNumber
    
    var ZM: NationalNumber
    
    var ZW: NationalNumber
  }
  object Examples {
    
    extension [Self <: Examples](x: Self) {
      
      inline def setAC(value: NationalNumber): Self = StObject.set(x, "AC", value.asInstanceOf[js.Any])
      
      inline def setAD(value: NationalNumber): Self = StObject.set(x, "AD", value.asInstanceOf[js.Any])
      
      inline def setAE(value: NationalNumber): Self = StObject.set(x, "AE", value.asInstanceOf[js.Any])
      
      inline def setAF(value: NationalNumber): Self = StObject.set(x, "AF", value.asInstanceOf[js.Any])
      
      inline def setAG(value: NationalNumber): Self = StObject.set(x, "AG", value.asInstanceOf[js.Any])
      
      inline def setAI(value: NationalNumber): Self = StObject.set(x, "AI", value.asInstanceOf[js.Any])
      
      inline def setAL(value: NationalNumber): Self = StObject.set(x, "AL", value.asInstanceOf[js.Any])
      
      inline def setAM(value: NationalNumber): Self = StObject.set(x, "AM", value.asInstanceOf[js.Any])
      
      inline def setAO(value: NationalNumber): Self = StObject.set(x, "AO", value.asInstanceOf[js.Any])
      
      inline def setAR(value: NationalNumber): Self = StObject.set(x, "AR", value.asInstanceOf[js.Any])
      
      inline def setAS(value: NationalNumber): Self = StObject.set(x, "AS", value.asInstanceOf[js.Any])
      
      inline def setAT(value: NationalNumber): Self = StObject.set(x, "AT", value.asInstanceOf[js.Any])
      
      inline def setAU(value: NationalNumber): Self = StObject.set(x, "AU", value.asInstanceOf[js.Any])
      
      inline def setAW(value: NationalNumber): Self = StObject.set(x, "AW", value.asInstanceOf[js.Any])
      
      inline def setAX(value: NationalNumber): Self = StObject.set(x, "AX", value.asInstanceOf[js.Any])
      
      inline def setAZ(value: NationalNumber): Self = StObject.set(x, "AZ", value.asInstanceOf[js.Any])
      
      inline def setBA(value: NationalNumber): Self = StObject.set(x, "BA", value.asInstanceOf[js.Any])
      
      inline def setBB(value: NationalNumber): Self = StObject.set(x, "BB", value.asInstanceOf[js.Any])
      
      inline def setBD(value: NationalNumber): Self = StObject.set(x, "BD", value.asInstanceOf[js.Any])
      
      inline def setBE(value: NationalNumber): Self = StObject.set(x, "BE", value.asInstanceOf[js.Any])
      
      inline def setBF(value: NationalNumber): Self = StObject.set(x, "BF", value.asInstanceOf[js.Any])
      
      inline def setBG(value: NationalNumber): Self = StObject.set(x, "BG", value.asInstanceOf[js.Any])
      
      inline def setBH(value: NationalNumber): Self = StObject.set(x, "BH", value.asInstanceOf[js.Any])
      
      inline def setBI(value: NationalNumber): Self = StObject.set(x, "BI", value.asInstanceOf[js.Any])
      
      inline def setBJ(value: NationalNumber): Self = StObject.set(x, "BJ", value.asInstanceOf[js.Any])
      
      inline def setBL(value: NationalNumber): Self = StObject.set(x, "BL", value.asInstanceOf[js.Any])
      
      inline def setBM(value: NationalNumber): Self = StObject.set(x, "BM", value.asInstanceOf[js.Any])
      
      inline def setBN(value: NationalNumber): Self = StObject.set(x, "BN", value.asInstanceOf[js.Any])
      
      inline def setBO(value: NationalNumber): Self = StObject.set(x, "BO", value.asInstanceOf[js.Any])
      
      inline def setBQ(value: NationalNumber): Self = StObject.set(x, "BQ", value.asInstanceOf[js.Any])
      
      inline def setBR(value: NationalNumber): Self = StObject.set(x, "BR", value.asInstanceOf[js.Any])
      
      inline def setBS(value: NationalNumber): Self = StObject.set(x, "BS", value.asInstanceOf[js.Any])
      
      inline def setBT(value: NationalNumber): Self = StObject.set(x, "BT", value.asInstanceOf[js.Any])
      
      inline def setBW(value: NationalNumber): Self = StObject.set(x, "BW", value.asInstanceOf[js.Any])
      
      inline def setBY(value: NationalNumber): Self = StObject.set(x, "BY", value.asInstanceOf[js.Any])
      
      inline def setBZ(value: NationalNumber): Self = StObject.set(x, "BZ", value.asInstanceOf[js.Any])
      
      inline def setCA(value: NationalNumber): Self = StObject.set(x, "CA", value.asInstanceOf[js.Any])
      
      inline def setCC(value: NationalNumber): Self = StObject.set(x, "CC", value.asInstanceOf[js.Any])
      
      inline def setCD(value: NationalNumber): Self = StObject.set(x, "CD", value.asInstanceOf[js.Any])
      
      inline def setCF(value: NationalNumber): Self = StObject.set(x, "CF", value.asInstanceOf[js.Any])
      
      inline def setCG(value: NationalNumber): Self = StObject.set(x, "CG", value.asInstanceOf[js.Any])
      
      inline def setCH(value: NationalNumber): Self = StObject.set(x, "CH", value.asInstanceOf[js.Any])
      
      inline def setCI(value: NationalNumber): Self = StObject.set(x, "CI", value.asInstanceOf[js.Any])
      
      inline def setCK(value: NationalNumber): Self = StObject.set(x, "CK", value.asInstanceOf[js.Any])
      
      inline def setCL(value: NationalNumber): Self = StObject.set(x, "CL", value.asInstanceOf[js.Any])
      
      inline def setCM(value: NationalNumber): Self = StObject.set(x, "CM", value.asInstanceOf[js.Any])
      
      inline def setCN(value: NationalNumber): Self = StObject.set(x, "CN", value.asInstanceOf[js.Any])
      
      inline def setCO(value: NationalNumber): Self = StObject.set(x, "CO", value.asInstanceOf[js.Any])
      
      inline def setCR(value: NationalNumber): Self = StObject.set(x, "CR", value.asInstanceOf[js.Any])
      
      inline def setCU(value: NationalNumber): Self = StObject.set(x, "CU", value.asInstanceOf[js.Any])
      
      inline def setCV(value: NationalNumber): Self = StObject.set(x, "CV", value.asInstanceOf[js.Any])
      
      inline def setCW(value: NationalNumber): Self = StObject.set(x, "CW", value.asInstanceOf[js.Any])
      
      inline def setCX(value: NationalNumber): Self = StObject.set(x, "CX", value.asInstanceOf[js.Any])
      
      inline def setCY(value: NationalNumber): Self = StObject.set(x, "CY", value.asInstanceOf[js.Any])
      
      inline def setCZ(value: NationalNumber): Self = StObject.set(x, "CZ", value.asInstanceOf[js.Any])
      
      inline def setDE(value: NationalNumber): Self = StObject.set(x, "DE", value.asInstanceOf[js.Any])
      
      inline def setDJ(value: NationalNumber): Self = StObject.set(x, "DJ", value.asInstanceOf[js.Any])
      
      inline def setDK(value: NationalNumber): Self = StObject.set(x, "DK", value.asInstanceOf[js.Any])
      
      inline def setDM(value: NationalNumber): Self = StObject.set(x, "DM", value.asInstanceOf[js.Any])
      
      inline def setDO(value: NationalNumber): Self = StObject.set(x, "DO", value.asInstanceOf[js.Any])
      
      inline def setDZ(value: NationalNumber): Self = StObject.set(x, "DZ", value.asInstanceOf[js.Any])
      
      inline def setEC(value: NationalNumber): Self = StObject.set(x, "EC", value.asInstanceOf[js.Any])
      
      inline def setEE(value: NationalNumber): Self = StObject.set(x, "EE", value.asInstanceOf[js.Any])
      
      inline def setEG(value: NationalNumber): Self = StObject.set(x, "EG", value.asInstanceOf[js.Any])
      
      inline def setEH(value: NationalNumber): Self = StObject.set(x, "EH", value.asInstanceOf[js.Any])
      
      inline def setER(value: NationalNumber): Self = StObject.set(x, "ER", value.asInstanceOf[js.Any])
      
      inline def setES(value: NationalNumber): Self = StObject.set(x, "ES", value.asInstanceOf[js.Any])
      
      inline def setET(value: NationalNumber): Self = StObject.set(x, "ET", value.asInstanceOf[js.Any])
      
      inline def setFI(value: NationalNumber): Self = StObject.set(x, "FI", value.asInstanceOf[js.Any])
      
      inline def setFJ(value: NationalNumber): Self = StObject.set(x, "FJ", value.asInstanceOf[js.Any])
      
      inline def setFK(value: NationalNumber): Self = StObject.set(x, "FK", value.asInstanceOf[js.Any])
      
      inline def setFM(value: NationalNumber): Self = StObject.set(x, "FM", value.asInstanceOf[js.Any])
      
      inline def setFO(value: NationalNumber): Self = StObject.set(x, "FO", value.asInstanceOf[js.Any])
      
      inline def setFR(value: NationalNumber): Self = StObject.set(x, "FR", value.asInstanceOf[js.Any])
      
      inline def setGA(value: NationalNumber): Self = StObject.set(x, "GA", value.asInstanceOf[js.Any])
      
      inline def setGB(value: NationalNumber): Self = StObject.set(x, "GB", value.asInstanceOf[js.Any])
      
      inline def setGD(value: NationalNumber): Self = StObject.set(x, "GD", value.asInstanceOf[js.Any])
      
      inline def setGE(value: NationalNumber): Self = StObject.set(x, "GE", value.asInstanceOf[js.Any])
      
      inline def setGF(value: NationalNumber): Self = StObject.set(x, "GF", value.asInstanceOf[js.Any])
      
      inline def setGG(value: NationalNumber): Self = StObject.set(x, "GG", value.asInstanceOf[js.Any])
      
      inline def setGH(value: NationalNumber): Self = StObject.set(x, "GH", value.asInstanceOf[js.Any])
      
      inline def setGI(value: NationalNumber): Self = StObject.set(x, "GI", value.asInstanceOf[js.Any])
      
      inline def setGL(value: NationalNumber): Self = StObject.set(x, "GL", value.asInstanceOf[js.Any])
      
      inline def setGM(value: NationalNumber): Self = StObject.set(x, "GM", value.asInstanceOf[js.Any])
      
      inline def setGN(value: NationalNumber): Self = StObject.set(x, "GN", value.asInstanceOf[js.Any])
      
      inline def setGP(value: NationalNumber): Self = StObject.set(x, "GP", value.asInstanceOf[js.Any])
      
      inline def setGQ(value: NationalNumber): Self = StObject.set(x, "GQ", value.asInstanceOf[js.Any])
      
      inline def setGR(value: NationalNumber): Self = StObject.set(x, "GR", value.asInstanceOf[js.Any])
      
      inline def setGT(value: NationalNumber): Self = StObject.set(x, "GT", value.asInstanceOf[js.Any])
      
      inline def setGU(value: NationalNumber): Self = StObject.set(x, "GU", value.asInstanceOf[js.Any])
      
      inline def setGW(value: NationalNumber): Self = StObject.set(x, "GW", value.asInstanceOf[js.Any])
      
      inline def setGY(value: NationalNumber): Self = StObject.set(x, "GY", value.asInstanceOf[js.Any])
      
      inline def setHK(value: NationalNumber): Self = StObject.set(x, "HK", value.asInstanceOf[js.Any])
      
      inline def setHN(value: NationalNumber): Self = StObject.set(x, "HN", value.asInstanceOf[js.Any])
      
      inline def setHR(value: NationalNumber): Self = StObject.set(x, "HR", value.asInstanceOf[js.Any])
      
      inline def setHT(value: NationalNumber): Self = StObject.set(x, "HT", value.asInstanceOf[js.Any])
      
      inline def setHU(value: NationalNumber): Self = StObject.set(x, "HU", value.asInstanceOf[js.Any])
      
      inline def setID(value: NationalNumber): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
      
      inline def setIE(value: NationalNumber): Self = StObject.set(x, "IE", value.asInstanceOf[js.Any])
      
      inline def setIL(value: NationalNumber): Self = StObject.set(x, "IL", value.asInstanceOf[js.Any])
      
      inline def setIM(value: NationalNumber): Self = StObject.set(x, "IM", value.asInstanceOf[js.Any])
      
      inline def setIN(value: NationalNumber): Self = StObject.set(x, "IN", value.asInstanceOf[js.Any])
      
      inline def setIO(value: NationalNumber): Self = StObject.set(x, "IO", value.asInstanceOf[js.Any])
      
      inline def setIQ(value: NationalNumber): Self = StObject.set(x, "IQ", value.asInstanceOf[js.Any])
      
      inline def setIR(value: NationalNumber): Self = StObject.set(x, "IR", value.asInstanceOf[js.Any])
      
      inline def setIS(value: NationalNumber): Self = StObject.set(x, "IS", value.asInstanceOf[js.Any])
      
      inline def setIT(value: NationalNumber): Self = StObject.set(x, "IT", value.asInstanceOf[js.Any])
      
      inline def setJE(value: NationalNumber): Self = StObject.set(x, "JE", value.asInstanceOf[js.Any])
      
      inline def setJM(value: NationalNumber): Self = StObject.set(x, "JM", value.asInstanceOf[js.Any])
      
      inline def setJO(value: NationalNumber): Self = StObject.set(x, "JO", value.asInstanceOf[js.Any])
      
      inline def setJP(value: NationalNumber): Self = StObject.set(x, "JP", value.asInstanceOf[js.Any])
      
      inline def setKE(value: NationalNumber): Self = StObject.set(x, "KE", value.asInstanceOf[js.Any])
      
      inline def setKG(value: NationalNumber): Self = StObject.set(x, "KG", value.asInstanceOf[js.Any])
      
      inline def setKH(value: NationalNumber): Self = StObject.set(x, "KH", value.asInstanceOf[js.Any])
      
      inline def setKI(value: NationalNumber): Self = StObject.set(x, "KI", value.asInstanceOf[js.Any])
      
      inline def setKM(value: NationalNumber): Self = StObject.set(x, "KM", value.asInstanceOf[js.Any])
      
      inline def setKN(value: NationalNumber): Self = StObject.set(x, "KN", value.asInstanceOf[js.Any])
      
      inline def setKP(value: NationalNumber): Self = StObject.set(x, "KP", value.asInstanceOf[js.Any])
      
      inline def setKR(value: NationalNumber): Self = StObject.set(x, "KR", value.asInstanceOf[js.Any])
      
      inline def setKW(value: NationalNumber): Self = StObject.set(x, "KW", value.asInstanceOf[js.Any])
      
      inline def setKY(value: NationalNumber): Self = StObject.set(x, "KY", value.asInstanceOf[js.Any])
      
      inline def setKZ(value: NationalNumber): Self = StObject.set(x, "KZ", value.asInstanceOf[js.Any])
      
      inline def setLA(value: NationalNumber): Self = StObject.set(x, "LA", value.asInstanceOf[js.Any])
      
      inline def setLB(value: NationalNumber): Self = StObject.set(x, "LB", value.asInstanceOf[js.Any])
      
      inline def setLC(value: NationalNumber): Self = StObject.set(x, "LC", value.asInstanceOf[js.Any])
      
      inline def setLI(value: NationalNumber): Self = StObject.set(x, "LI", value.asInstanceOf[js.Any])
      
      inline def setLK(value: NationalNumber): Self = StObject.set(x, "LK", value.asInstanceOf[js.Any])
      
      inline def setLR(value: NationalNumber): Self = StObject.set(x, "LR", value.asInstanceOf[js.Any])
      
      inline def setLS(value: NationalNumber): Self = StObject.set(x, "LS", value.asInstanceOf[js.Any])
      
      inline def setLT(value: NationalNumber): Self = StObject.set(x, "LT", value.asInstanceOf[js.Any])
      
      inline def setLU(value: NationalNumber): Self = StObject.set(x, "LU", value.asInstanceOf[js.Any])
      
      inline def setLV(value: NationalNumber): Self = StObject.set(x, "LV", value.asInstanceOf[js.Any])
      
      inline def setLY(value: NationalNumber): Self = StObject.set(x, "LY", value.asInstanceOf[js.Any])
      
      inline def setMA(value: NationalNumber): Self = StObject.set(x, "MA", value.asInstanceOf[js.Any])
      
      inline def setMC(value: NationalNumber): Self = StObject.set(x, "MC", value.asInstanceOf[js.Any])
      
      inline def setMD(value: NationalNumber): Self = StObject.set(x, "MD", value.asInstanceOf[js.Any])
      
      inline def setME(value: NationalNumber): Self = StObject.set(x, "ME", value.asInstanceOf[js.Any])
      
      inline def setMF(value: NationalNumber): Self = StObject.set(x, "MF", value.asInstanceOf[js.Any])
      
      inline def setMG(value: NationalNumber): Self = StObject.set(x, "MG", value.asInstanceOf[js.Any])
      
      inline def setMH(value: NationalNumber): Self = StObject.set(x, "MH", value.asInstanceOf[js.Any])
      
      inline def setMK(value: NationalNumber): Self = StObject.set(x, "MK", value.asInstanceOf[js.Any])
      
      inline def setML(value: NationalNumber): Self = StObject.set(x, "ML", value.asInstanceOf[js.Any])
      
      inline def setMM(value: NationalNumber): Self = StObject.set(x, "MM", value.asInstanceOf[js.Any])
      
      inline def setMN(value: NationalNumber): Self = StObject.set(x, "MN", value.asInstanceOf[js.Any])
      
      inline def setMO(value: NationalNumber): Self = StObject.set(x, "MO", value.asInstanceOf[js.Any])
      
      inline def setMP(value: NationalNumber): Self = StObject.set(x, "MP", value.asInstanceOf[js.Any])
      
      inline def setMQ(value: NationalNumber): Self = StObject.set(x, "MQ", value.asInstanceOf[js.Any])
      
      inline def setMR(value: NationalNumber): Self = StObject.set(x, "MR", value.asInstanceOf[js.Any])
      
      inline def setMS(value: NationalNumber): Self = StObject.set(x, "MS", value.asInstanceOf[js.Any])
      
      inline def setMT(value: NationalNumber): Self = StObject.set(x, "MT", value.asInstanceOf[js.Any])
      
      inline def setMU(value: NationalNumber): Self = StObject.set(x, "MU", value.asInstanceOf[js.Any])
      
      inline def setMV(value: NationalNumber): Self = StObject.set(x, "MV", value.asInstanceOf[js.Any])
      
      inline def setMW(value: NationalNumber): Self = StObject.set(x, "MW", value.asInstanceOf[js.Any])
      
      inline def setMX(value: NationalNumber): Self = StObject.set(x, "MX", value.asInstanceOf[js.Any])
      
      inline def setMY(value: NationalNumber): Self = StObject.set(x, "MY", value.asInstanceOf[js.Any])
      
      inline def setMZ(value: NationalNumber): Self = StObject.set(x, "MZ", value.asInstanceOf[js.Any])
      
      inline def setNA(value: NationalNumber): Self = StObject.set(x, "NA", value.asInstanceOf[js.Any])
      
      inline def setNC(value: NationalNumber): Self = StObject.set(x, "NC", value.asInstanceOf[js.Any])
      
      inline def setNE(value: NationalNumber): Self = StObject.set(x, "NE", value.asInstanceOf[js.Any])
      
      inline def setNF(value: NationalNumber): Self = StObject.set(x, "NF", value.asInstanceOf[js.Any])
      
      inline def setNG(value: NationalNumber): Self = StObject.set(x, "NG", value.asInstanceOf[js.Any])
      
      inline def setNI(value: NationalNumber): Self = StObject.set(x, "NI", value.asInstanceOf[js.Any])
      
      inline def setNL(value: NationalNumber): Self = StObject.set(x, "NL", value.asInstanceOf[js.Any])
      
      inline def setNO(value: NationalNumber): Self = StObject.set(x, "NO", value.asInstanceOf[js.Any])
      
      inline def setNP(value: NationalNumber): Self = StObject.set(x, "NP", value.asInstanceOf[js.Any])
      
      inline def setNR(value: NationalNumber): Self = StObject.set(x, "NR", value.asInstanceOf[js.Any])
      
      inline def setNU(value: NationalNumber): Self = StObject.set(x, "NU", value.asInstanceOf[js.Any])
      
      inline def setNZ(value: NationalNumber): Self = StObject.set(x, "NZ", value.asInstanceOf[js.Any])
      
      inline def setOM(value: NationalNumber): Self = StObject.set(x, "OM", value.asInstanceOf[js.Any])
      
      inline def setPA(value: NationalNumber): Self = StObject.set(x, "PA", value.asInstanceOf[js.Any])
      
      inline def setPE(value: NationalNumber): Self = StObject.set(x, "PE", value.asInstanceOf[js.Any])
      
      inline def setPF(value: NationalNumber): Self = StObject.set(x, "PF", value.asInstanceOf[js.Any])
      
      inline def setPG(value: NationalNumber): Self = StObject.set(x, "PG", value.asInstanceOf[js.Any])
      
      inline def setPH(value: NationalNumber): Self = StObject.set(x, "PH", value.asInstanceOf[js.Any])
      
      inline def setPK(value: NationalNumber): Self = StObject.set(x, "PK", value.asInstanceOf[js.Any])
      
      inline def setPL(value: NationalNumber): Self = StObject.set(x, "PL", value.asInstanceOf[js.Any])
      
      inline def setPM(value: NationalNumber): Self = StObject.set(x, "PM", value.asInstanceOf[js.Any])
      
      inline def setPR(value: NationalNumber): Self = StObject.set(x, "PR", value.asInstanceOf[js.Any])
      
      inline def setPS(value: NationalNumber): Self = StObject.set(x, "PS", value.asInstanceOf[js.Any])
      
      inline def setPT(value: NationalNumber): Self = StObject.set(x, "PT", value.asInstanceOf[js.Any])
      
      inline def setPW(value: NationalNumber): Self = StObject.set(x, "PW", value.asInstanceOf[js.Any])
      
      inline def setPY(value: NationalNumber): Self = StObject.set(x, "PY", value.asInstanceOf[js.Any])
      
      inline def setQA(value: NationalNumber): Self = StObject.set(x, "QA", value.asInstanceOf[js.Any])
      
      inline def setRE(value: NationalNumber): Self = StObject.set(x, "RE", value.asInstanceOf[js.Any])
      
      inline def setRO(value: NationalNumber): Self = StObject.set(x, "RO", value.asInstanceOf[js.Any])
      
      inline def setRS(value: NationalNumber): Self = StObject.set(x, "RS", value.asInstanceOf[js.Any])
      
      inline def setRU(value: NationalNumber): Self = StObject.set(x, "RU", value.asInstanceOf[js.Any])
      
      inline def setRW(value: NationalNumber): Self = StObject.set(x, "RW", value.asInstanceOf[js.Any])
      
      inline def setSA(value: NationalNumber): Self = StObject.set(x, "SA", value.asInstanceOf[js.Any])
      
      inline def setSB(value: NationalNumber): Self = StObject.set(x, "SB", value.asInstanceOf[js.Any])
      
      inline def setSC(value: NationalNumber): Self = StObject.set(x, "SC", value.asInstanceOf[js.Any])
      
      inline def setSD(value: NationalNumber): Self = StObject.set(x, "SD", value.asInstanceOf[js.Any])
      
      inline def setSE(value: NationalNumber): Self = StObject.set(x, "SE", value.asInstanceOf[js.Any])
      
      inline def setSG(value: NationalNumber): Self = StObject.set(x, "SG", value.asInstanceOf[js.Any])
      
      inline def setSH(value: NationalNumber): Self = StObject.set(x, "SH", value.asInstanceOf[js.Any])
      
      inline def setSI(value: NationalNumber): Self = StObject.set(x, "SI", value.asInstanceOf[js.Any])
      
      inline def setSJ(value: NationalNumber): Self = StObject.set(x, "SJ", value.asInstanceOf[js.Any])
      
      inline def setSK(value: NationalNumber): Self = StObject.set(x, "SK", value.asInstanceOf[js.Any])
      
      inline def setSL(value: NationalNumber): Self = StObject.set(x, "SL", value.asInstanceOf[js.Any])
      
      inline def setSM(value: NationalNumber): Self = StObject.set(x, "SM", value.asInstanceOf[js.Any])
      
      inline def setSN(value: NationalNumber): Self = StObject.set(x, "SN", value.asInstanceOf[js.Any])
      
      inline def setSO(value: NationalNumber): Self = StObject.set(x, "SO", value.asInstanceOf[js.Any])
      
      inline def setSR(value: NationalNumber): Self = StObject.set(x, "SR", value.asInstanceOf[js.Any])
      
      inline def setSS(value: NationalNumber): Self = StObject.set(x, "SS", value.asInstanceOf[js.Any])
      
      inline def setST(value: NationalNumber): Self = StObject.set(x, "ST", value.asInstanceOf[js.Any])
      
      inline def setSV(value: NationalNumber): Self = StObject.set(x, "SV", value.asInstanceOf[js.Any])
      
      inline def setSX(value: NationalNumber): Self = StObject.set(x, "SX", value.asInstanceOf[js.Any])
      
      inline def setSY(value: NationalNumber): Self = StObject.set(x, "SY", value.asInstanceOf[js.Any])
      
      inline def setSZ(value: NationalNumber): Self = StObject.set(x, "SZ", value.asInstanceOf[js.Any])
      
      inline def setTA(value: NationalNumber): Self = StObject.set(x, "TA", value.asInstanceOf[js.Any])
      
      inline def setTC(value: NationalNumber): Self = StObject.set(x, "TC", value.asInstanceOf[js.Any])
      
      inline def setTD(value: NationalNumber): Self = StObject.set(x, "TD", value.asInstanceOf[js.Any])
      
      inline def setTG(value: NationalNumber): Self = StObject.set(x, "TG", value.asInstanceOf[js.Any])
      
      inline def setTH(value: NationalNumber): Self = StObject.set(x, "TH", value.asInstanceOf[js.Any])
      
      inline def setTJ(value: NationalNumber): Self = StObject.set(x, "TJ", value.asInstanceOf[js.Any])
      
      inline def setTK(value: NationalNumber): Self = StObject.set(x, "TK", value.asInstanceOf[js.Any])
      
      inline def setTL(value: NationalNumber): Self = StObject.set(x, "TL", value.asInstanceOf[js.Any])
      
      inline def setTM(value: NationalNumber): Self = StObject.set(x, "TM", value.asInstanceOf[js.Any])
      
      inline def setTN(value: NationalNumber): Self = StObject.set(x, "TN", value.asInstanceOf[js.Any])
      
      inline def setTO(value: NationalNumber): Self = StObject.set(x, "TO", value.asInstanceOf[js.Any])
      
      inline def setTR(value: NationalNumber): Self = StObject.set(x, "TR", value.asInstanceOf[js.Any])
      
      inline def setTT(value: NationalNumber): Self = StObject.set(x, "TT", value.asInstanceOf[js.Any])
      
      inline def setTV(value: NationalNumber): Self = StObject.set(x, "TV", value.asInstanceOf[js.Any])
      
      inline def setTW(value: NationalNumber): Self = StObject.set(x, "TW", value.asInstanceOf[js.Any])
      
      inline def setTZ(value: NationalNumber): Self = StObject.set(x, "TZ", value.asInstanceOf[js.Any])
      
      inline def setUA(value: NationalNumber): Self = StObject.set(x, "UA", value.asInstanceOf[js.Any])
      
      inline def setUG(value: NationalNumber): Self = StObject.set(x, "UG", value.asInstanceOf[js.Any])
      
      inline def setUS(value: NationalNumber): Self = StObject.set(x, "US", value.asInstanceOf[js.Any])
      
      inline def setUY(value: NationalNumber): Self = StObject.set(x, "UY", value.asInstanceOf[js.Any])
      
      inline def setUZ(value: NationalNumber): Self = StObject.set(x, "UZ", value.asInstanceOf[js.Any])
      
      inline def setVA(value: NationalNumber): Self = StObject.set(x, "VA", value.asInstanceOf[js.Any])
      
      inline def setVC(value: NationalNumber): Self = StObject.set(x, "VC", value.asInstanceOf[js.Any])
      
      inline def setVE(value: NationalNumber): Self = StObject.set(x, "VE", value.asInstanceOf[js.Any])
      
      inline def setVG(value: NationalNumber): Self = StObject.set(x, "VG", value.asInstanceOf[js.Any])
      
      inline def setVI(value: NationalNumber): Self = StObject.set(x, "VI", value.asInstanceOf[js.Any])
      
      inline def setVN(value: NationalNumber): Self = StObject.set(x, "VN", value.asInstanceOf[js.Any])
      
      inline def setVU(value: NationalNumber): Self = StObject.set(x, "VU", value.asInstanceOf[js.Any])
      
      inline def setWF(value: NationalNumber): Self = StObject.set(x, "WF", value.asInstanceOf[js.Any])
      
      inline def setWS(value: NationalNumber): Self = StObject.set(x, "WS", value.asInstanceOf[js.Any])
      
      inline def setXK(value: NationalNumber): Self = StObject.set(x, "XK", value.asInstanceOf[js.Any])
      
      inline def setYE(value: NationalNumber): Self = StObject.set(x, "YE", value.asInstanceOf[js.Any])
      
      inline def setYT(value: NationalNumber): Self = StObject.set(x, "YT", value.asInstanceOf[js.Any])
      
      inline def setZA(value: NationalNumber): Self = StObject.set(x, "ZA", value.asInstanceOf[js.Any])
      
      inline def setZM(value: NationalNumber): Self = StObject.set(x, "ZM", value.asInstanceOf[js.Any])
      
      inline def setZW(value: NationalNumber): Self = StObject.set(x, "ZW", value.asInstanceOf[js.Any])
    }
  }
  
  type Extension = Tagged[String, typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.Extension]
  
  type FormatExtension = js.Function3[
    /* formattedNumber */ String, 
    /* extension */ Extension, 
    /* metadata */ MetadataJson, 
    String
  ]
  
  trait FormatNumberOptions extends StObject {
    
    var formatExtension: js.UndefOr[FormatExtension] = js.undefined
    
    var fromCountry: js.UndefOr[CountryCode] = js.undefined
    
    var humanReadable: js.UndefOr[Boolean] = js.undefined
    
    var nationalPrefix: js.UndefOr[Boolean] = js.undefined
    
    var v2: js.UndefOr[Boolean] = js.undefined
  }
  object FormatNumberOptions {
    
    inline def apply(): FormatNumberOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormatNumberOptions]
    }
    
    extension [Self <: FormatNumberOptions](x: Self) {
      
      inline def setFormatExtension(
        value: (/* formattedNumber */ String, /* extension */ Extension, /* metadata */ MetadataJson) => String
      ): Self = StObject.set(x, "formatExtension", js.Any.fromFunction3(value))
      
      inline def setFormatExtensionUndefined: Self = StObject.set(x, "formatExtension", js.undefined)
      
      inline def setFromCountry(value: CountryCode): Self = StObject.set(x, "fromCountry", value.asInstanceOf[js.Any])
      
      inline def setFromCountryUndefined: Self = StObject.set(x, "fromCountry", js.undefined)
      
      inline def setHumanReadable(value: Boolean): Self = StObject.set(x, "humanReadable", value.asInstanceOf[js.Any])
      
      inline def setHumanReadableUndefined: Self = StObject.set(x, "humanReadable", js.undefined)
      
      inline def setNationalPrefix(value: Boolean): Self = StObject.set(x, "nationalPrefix", value.asInstanceOf[js.Any])
      
      inline def setNationalPrefixUndefined: Self = StObject.set(x, "nationalPrefix", js.undefined)
      
      inline def setV2(value: Boolean): Self = StObject.set(x, "v2", value.asInstanceOf[js.Any])
      
      inline def setV2Undefined: Self = StObject.set(x, "v2", js.undefined)
    }
  }
  
  trait FormatNumberOptionsWithoutIDD extends StObject {
    
    var formatExtension: js.UndefOr[FormatExtension] = js.undefined
    
    var v2: js.UndefOr[Boolean] = js.undefined
  }
  object FormatNumberOptionsWithoutIDD {
    
    inline def apply(): FormatNumberOptionsWithoutIDD = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormatNumberOptionsWithoutIDD]
    }
    
    extension [Self <: FormatNumberOptionsWithoutIDD](x: Self) {
      
      inline def setFormatExtension(
        value: (/* formattedNumber */ String, /* extension */ Extension, /* metadata */ MetadataJson) => String
      ): Self = StObject.set(x, "formatExtension", js.Any.fromFunction3(value))
      
      inline def setFormatExtensionUndefined: Self = StObject.set(x, "formatExtension", js.undefined)
      
      inline def setV2(value: Boolean): Self = StObject.set(x, "v2", value.asInstanceOf[js.Any])
      
      inline def setV2Undefined: Self = StObject.set(x, "v2", js.undefined)
    }
  }
  
  trait MetadataJson extends StObject {
    
    var countries: Countries
    
    var country_calling_codes: CountryCallingCodes
  }
  object MetadataJson {
    
    inline def apply(countries: Countries, country_calling_codes: CountryCallingCodes): MetadataJson = {
      val __obj = js.Dynamic.literal(countries = countries.asInstanceOf[js.Any], country_calling_codes = country_calling_codes.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetadataJson]
    }
    
    extension [Self <: MetadataJson](x: Self) {
      
      inline def setCountries(value: Countries): Self = StObject.set(x, "countries", value.asInstanceOf[js.Any])
      
      inline def setCountry_calling_codes(value: CountryCallingCodes): Self = StObject.set(x, "country_calling_codes", value.asInstanceOf[js.Any])
    }
  }
  
  type NationalNumber = Tagged[String, typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.NationalNumber]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.NATIONAL
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.INTERNATIONAL
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.EDot164
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.RFC3966
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.IDD
  */
  trait NumberFormat extends StObject
  object NumberFormat {
    
    inline def EDot164: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.EDot164 = "E.164".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.EDot164]
    
    inline def IDD: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.IDD = "IDD".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.IDD]
    
    inline def INTERNATIONAL: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.INTERNATIONAL = "INTERNATIONAL".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.INTERNATIONAL]
    
    inline def NATIONAL: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.NATIONAL = "NATIONAL".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.NATIONAL]
    
    inline def RFC3966: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.RFC3966 = "RFC3966".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.RFC3966]
  }
  
  trait NumberFound extends StObject {
    
    var endsAt: Double
    
    var number: PhoneNumber
    
    var startsAt: Double
  }
  object NumberFound {
    
    inline def apply(endsAt: Double, number: PhoneNumber, startsAt: Double): NumberFound = {
      val __obj = js.Dynamic.literal(endsAt = endsAt.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], startsAt = startsAt.asInstanceOf[js.Any])
      __obj.asInstanceOf[NumberFound]
    }
    
    extension [Self <: NumberFound](x: Self) {
      
      inline def setEndsAt(value: Double): Self = StObject.set(x, "endsAt", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: PhoneNumber): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setStartsAt(value: Double): Self = StObject.set(x, "startsAt", value.asInstanceOf[js.Any])
    }
  }
  
  trait NumberFoundLegacy extends StObject {
    
    var country: CountryCode
    
    var endsAt: Double
    
    var ext: js.UndefOr[Extension] = js.undefined
    
    var phone: NationalNumber
    
    var startsAt: Double
  }
  object NumberFoundLegacy {
    
    inline def apply(country: CountryCode, endsAt: Double, phone: NationalNumber, startsAt: Double): NumberFoundLegacy = {
      val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], endsAt = endsAt.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], startsAt = startsAt.asInstanceOf[js.Any])
      __obj.asInstanceOf[NumberFoundLegacy]
    }
    
    extension [Self <: NumberFoundLegacy](x: Self) {
      
      inline def setCountry(value: CountryCode): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setEndsAt(value: Double): Self = StObject.set(x, "endsAt", value.asInstanceOf[js.Any])
      
      inline def setExt(value: Extension): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      inline def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
      
      inline def setPhone(value: NationalNumber): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      inline def setStartsAt(value: Double): Self = StObject.set(x, "startsAt", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - scala.Unit
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.PREMIUM_RATE
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.TOLL_FREE
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.SHARED_COST
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.VOIP
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.PERSONAL_NUMBER
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.PAGER
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.UAN
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.VOICEMAIL
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.FIXED_LINE_OR_MOBILE
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.FIXED_LINE
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.MOBILE
  */
  type NumberType = js.UndefOr[_NumberType]
  
  trait NumberingPlan extends StObject {
    
    def IDDPrefix(): String
    
    def defaultIDDPrefix(): js.UndefOr[String]
    
    def leadingDigits(): js.UndefOr[String]
    
    def possibleLengths(): js.Array[Double]
  }
  object NumberingPlan {
    
    inline def apply(
      IDDPrefix: CallbackTo[String],
      defaultIDDPrefix: CallbackTo[js.UndefOr[String]],
      leadingDigits: CallbackTo[js.UndefOr[String]],
      possibleLengths: CallbackTo[js.Array[Double]]
    ): NumberingPlan = {
      val __obj = js.Dynamic.literal(IDDPrefix = IDDPrefix.toJsFn, defaultIDDPrefix = defaultIDDPrefix.toJsFn, leadingDigits = leadingDigits.toJsFn, possibleLengths = possibleLengths.toJsFn)
      __obj.asInstanceOf[NumberingPlan]
    }
    
    extension [Self <: NumberingPlan](x: Self) {
      
      inline def setDefaultIDDPrefix(value: CallbackTo[js.UndefOr[String]]): Self = StObject.set(x, "defaultIDDPrefix", value.toJsFn)
      
      inline def setIDDPrefix(value: CallbackTo[String]): Self = StObject.set(x, "IDDPrefix", value.toJsFn)
      
      inline def setLeadingDigits(value: CallbackTo[js.UndefOr[String]]): Self = StObject.set(x, "leadingDigits", value.toJsFn)
      
      inline def setPossibleLengths(value: CallbackTo[js.Array[Double]]): Self = StObject.set(x, "possibleLengths", value.toJsFn)
    }
  }
  
  type Tagged[A, T] = A & Tag[T]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.INVALID_COUNTRY
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.NOT_A_NUMBER
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.TOO_SHORT
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.TOO_LONG
    - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.INVALID_LENGTH
  */
  trait ValidatePhoneNumberLengthResult extends StObject
  object ValidatePhoneNumberLengthResult {
    
    inline def INVALID_COUNTRY: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.INVALID_COUNTRY = "INVALID_COUNTRY".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.INVALID_COUNTRY]
    
    inline def INVALID_LENGTH: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.INVALID_LENGTH = "INVALID_LENGTH".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.INVALID_LENGTH]
    
    inline def NOT_A_NUMBER: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.NOT_A_NUMBER = "NOT_A_NUMBER".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.NOT_A_NUMBER]
    
    inline def TOO_LONG: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.TOO_LONG = "TOO_LONG".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.TOO_LONG]
    
    inline def TOO_SHORT: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.TOO_SHORT = "TOO_SHORT".asInstanceOf[typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.TOO_SHORT]
  }
  
  trait _NumberType extends StObject
}
