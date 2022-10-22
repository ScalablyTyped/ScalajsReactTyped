package typingsJapgolly.dineroJs

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Dinero = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Dinero]
  inline def apply(options: Options): Dinero = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Dinero]
  
  @JSImport("dinero.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("dinero.js", "defaultAmount")
  @js.native
  def defaultAmount: Double = js.native
  inline def defaultAmount_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultAmount")(x.asInstanceOf[js.Any])
  
  @JSImport("dinero.js", "defaultCurrency")
  @js.native
  def defaultCurrency: Currency = js.native
  inline def defaultCurrency_=(x: Currency): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultCurrency")(x.asInstanceOf[js.Any])
  
  @JSImport("dinero.js", "defaultPrecision")
  @js.native
  def defaultPrecision: Double = js.native
  inline def defaultPrecision_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultPrecision")(x.asInstanceOf[js.Any])
  
  @JSImport("dinero.js", "globalExchangeRatesApi")
  @js.native
  def globalExchangeRatesApi: ExchangeRatesApiOptions = js.native
  inline def globalExchangeRatesApi_=(x: ExchangeRatesApiOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("globalExchangeRatesApi")(x.asInstanceOf[js.Any])
  
  @JSImport("dinero.js", "globalFormat")
  @js.native
  def globalFormat: String = js.native
  
  @JSImport("dinero.js", "globalFormatRoundingMode")
  @js.native
  def globalFormatRoundingMode: String = js.native
  inline def globalFormatRoundingMode_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("globalFormatRoundingMode")(x.asInstanceOf[js.Any])
  
  inline def globalFormat_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("globalFormat")(x.asInstanceOf[js.Any])
  
  @JSImport("dinero.js", "globalLocale")
  @js.native
  def globalLocale: String = js.native
  inline def globalLocale_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("globalLocale")(x.asInstanceOf[js.Any])
  
  @JSImport("dinero.js", "globalRoundingMode")
  @js.native
  def globalRoundingMode: RoundingMode = js.native
  inline def globalRoundingMode_=(x: RoundingMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("globalRoundingMode")(x.asInstanceOf[js.Any])
  
  inline def maximum(objects: js.Array[Dinero]): Dinero = ^.asInstanceOf[js.Dynamic].applyDynamic("maximum")(objects.asInstanceOf[js.Any]).asInstanceOf[Dinero]
  
  inline def minimum(objects: js.Array[Dinero]): Dinero = ^.asInstanceOf[js.Dynamic].applyDynamic("minimum")(objects.asInstanceOf[js.Any]).asInstanceOf[Dinero]
  
  inline def normalizePrecision(objects: js.Array[Dinero]): js.Array[Dinero] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizePrecision")(objects.asInstanceOf[js.Any]).asInstanceOf[js.Array[Dinero]]
  
  /**
    * ISO 4217 CURRENCY CODES as specified in the documentation
    * Taken from https://www.iso.org/iso-4217-currency-codes.html
    * sorted and parsed
    */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.dineroJs.dineroJsStrings.AED
    - typingsJapgolly.dineroJs.dineroJsStrings.AFN
    - typingsJapgolly.dineroJs.dineroJsStrings.ALL
    - typingsJapgolly.dineroJs.dineroJsStrings.AMD
    - typingsJapgolly.dineroJs.dineroJsStrings.ANG
    - typingsJapgolly.dineroJs.dineroJsStrings.AOA
    - typingsJapgolly.dineroJs.dineroJsStrings.ARS
    - typingsJapgolly.dineroJs.dineroJsStrings.AUD
    - typingsJapgolly.dineroJs.dineroJsStrings.AWG
    - typingsJapgolly.dineroJs.dineroJsStrings.AZN
    - typingsJapgolly.dineroJs.dineroJsStrings.BAM
    - typingsJapgolly.dineroJs.dineroJsStrings.BBD
    - typingsJapgolly.dineroJs.dineroJsStrings.BDT
    - typingsJapgolly.dineroJs.dineroJsStrings.BGN
    - typingsJapgolly.dineroJs.dineroJsStrings.BHD
    - typingsJapgolly.dineroJs.dineroJsStrings.BIF
    - typingsJapgolly.dineroJs.dineroJsStrings.BMD
    - typingsJapgolly.dineroJs.dineroJsStrings.BND
    - typingsJapgolly.dineroJs.dineroJsStrings.BOB
    - typingsJapgolly.dineroJs.dineroJsStrings.BOV
    - typingsJapgolly.dineroJs.dineroJsStrings.BRL
    - typingsJapgolly.dineroJs.dineroJsStrings.BSD
    - typingsJapgolly.dineroJs.dineroJsStrings.BTN
    - typingsJapgolly.dineroJs.dineroJsStrings.BWP
    - typingsJapgolly.dineroJs.dineroJsStrings.BYN
    - typingsJapgolly.dineroJs.dineroJsStrings.BZD
    - typingsJapgolly.dineroJs.dineroJsStrings.CAD
    - typingsJapgolly.dineroJs.dineroJsStrings.CDF
    - typingsJapgolly.dineroJs.dineroJsStrings.CHE
    - typingsJapgolly.dineroJs.dineroJsStrings.CHF
    - typingsJapgolly.dineroJs.dineroJsStrings.CHW
    - typingsJapgolly.dineroJs.dineroJsStrings.CLF
    - typingsJapgolly.dineroJs.dineroJsStrings.CLP
    - typingsJapgolly.dineroJs.dineroJsStrings.CNY
    - typingsJapgolly.dineroJs.dineroJsStrings.COP
    - typingsJapgolly.dineroJs.dineroJsStrings.COU
    - typingsJapgolly.dineroJs.dineroJsStrings.CRC
    - typingsJapgolly.dineroJs.dineroJsStrings.CUC
    - typingsJapgolly.dineroJs.dineroJsStrings.CUP
    - typingsJapgolly.dineroJs.dineroJsStrings.CVE
    - typingsJapgolly.dineroJs.dineroJsStrings.CZK
    - typingsJapgolly.dineroJs.dineroJsStrings.DJF
    - typingsJapgolly.dineroJs.dineroJsStrings.DKK
    - typingsJapgolly.dineroJs.dineroJsStrings.DOP
    - typingsJapgolly.dineroJs.dineroJsStrings.DZD
    - typingsJapgolly.dineroJs.dineroJsStrings.EGP
    - typingsJapgolly.dineroJs.dineroJsStrings.ERN
    - typingsJapgolly.dineroJs.dineroJsStrings.ETB
    - typingsJapgolly.dineroJs.dineroJsStrings.EUR
    - typingsJapgolly.dineroJs.dineroJsStrings.FJD
    - typingsJapgolly.dineroJs.dineroJsStrings.FKP
    - typingsJapgolly.dineroJs.dineroJsStrings.GBP
    - typingsJapgolly.dineroJs.dineroJsStrings.GEL
    - typingsJapgolly.dineroJs.dineroJsStrings.GHS
    - typingsJapgolly.dineroJs.dineroJsStrings.GIP
    - typingsJapgolly.dineroJs.dineroJsStrings.GMD
    - typingsJapgolly.dineroJs.dineroJsStrings.GNF
    - typingsJapgolly.dineroJs.dineroJsStrings.GTQ
    - typingsJapgolly.dineroJs.dineroJsStrings.GYD
    - typingsJapgolly.dineroJs.dineroJsStrings.HKD
    - typingsJapgolly.dineroJs.dineroJsStrings.HNL
    - typingsJapgolly.dineroJs.dineroJsStrings.HRK
    - typingsJapgolly.dineroJs.dineroJsStrings.HTG
    - typingsJapgolly.dineroJs.dineroJsStrings.HUF
    - typingsJapgolly.dineroJs.dineroJsStrings.IDR
    - typingsJapgolly.dineroJs.dineroJsStrings.ILS
    - typingsJapgolly.dineroJs.dineroJsStrings.INR
    - typingsJapgolly.dineroJs.dineroJsStrings.IQD
    - typingsJapgolly.dineroJs.dineroJsStrings.IRR
    - typingsJapgolly.dineroJs.dineroJsStrings.ISK
    - typingsJapgolly.dineroJs.dineroJsStrings.JMD
    - typingsJapgolly.dineroJs.dineroJsStrings.JOD
    - typingsJapgolly.dineroJs.dineroJsStrings.JPY
    - typingsJapgolly.dineroJs.dineroJsStrings.KES
    - typingsJapgolly.dineroJs.dineroJsStrings.KGS
    - typingsJapgolly.dineroJs.dineroJsStrings.KHR
    - typingsJapgolly.dineroJs.dineroJsStrings.KMF
    - typingsJapgolly.dineroJs.dineroJsStrings.KPW
    - typingsJapgolly.dineroJs.dineroJsStrings.KRW
    - typingsJapgolly.dineroJs.dineroJsStrings.KWD
    - typingsJapgolly.dineroJs.dineroJsStrings.KYD
    - typingsJapgolly.dineroJs.dineroJsStrings.KZT
    - typingsJapgolly.dineroJs.dineroJsStrings.LAK
    - typingsJapgolly.dineroJs.dineroJsStrings.LBP
    - typingsJapgolly.dineroJs.dineroJsStrings.LKR
    - typingsJapgolly.dineroJs.dineroJsStrings.LRD
    - typingsJapgolly.dineroJs.dineroJsStrings.LSL
    - typingsJapgolly.dineroJs.dineroJsStrings.LYD
    - typingsJapgolly.dineroJs.dineroJsStrings.MAD
    - typingsJapgolly.dineroJs.dineroJsStrings.MDL
    - typingsJapgolly.dineroJs.dineroJsStrings.MGA
    - typingsJapgolly.dineroJs.dineroJsStrings.MKD
    - typingsJapgolly.dineroJs.dineroJsStrings.MMK
    - typingsJapgolly.dineroJs.dineroJsStrings.MNT
    - typingsJapgolly.dineroJs.dineroJsStrings.MOP
    - typingsJapgolly.dineroJs.dineroJsStrings.MRU
    - typingsJapgolly.dineroJs.dineroJsStrings.MUR
    - typingsJapgolly.dineroJs.dineroJsStrings.MVR
    - typingsJapgolly.dineroJs.dineroJsStrings.MWK
    - typingsJapgolly.dineroJs.dineroJsStrings.MXN
    - typingsJapgolly.dineroJs.dineroJsStrings.MXV
    - typingsJapgolly.dineroJs.dineroJsStrings.MYR
    - typingsJapgolly.dineroJs.dineroJsStrings.MZN
    - typingsJapgolly.dineroJs.dineroJsStrings.NAD
    - typingsJapgolly.dineroJs.dineroJsStrings.NGN
    - typingsJapgolly.dineroJs.dineroJsStrings.NIO
    - typingsJapgolly.dineroJs.dineroJsStrings.NOK
    - typingsJapgolly.dineroJs.dineroJsStrings.NPR
    - typingsJapgolly.dineroJs.dineroJsStrings.NZD
    - typingsJapgolly.dineroJs.dineroJsStrings.OMR
    - typingsJapgolly.dineroJs.dineroJsStrings.PAB
    - typingsJapgolly.dineroJs.dineroJsStrings.PEN
    - typingsJapgolly.dineroJs.dineroJsStrings.PGK
    - typingsJapgolly.dineroJs.dineroJsStrings.PHP
    - typingsJapgolly.dineroJs.dineroJsStrings.PKR
    - typingsJapgolly.dineroJs.dineroJsStrings.PLN
    - typingsJapgolly.dineroJs.dineroJsStrings.PYG
    - typingsJapgolly.dineroJs.dineroJsStrings.QAR
    - typingsJapgolly.dineroJs.dineroJsStrings.RON
    - typingsJapgolly.dineroJs.dineroJsStrings.RSD
    - typingsJapgolly.dineroJs.dineroJsStrings.RUB
    - typingsJapgolly.dineroJs.dineroJsStrings.RWF
    - typingsJapgolly.dineroJs.dineroJsStrings.SAR
    - typingsJapgolly.dineroJs.dineroJsStrings.SBD
    - typingsJapgolly.dineroJs.dineroJsStrings.SCR
    - typingsJapgolly.dineroJs.dineroJsStrings.SDG
    - typingsJapgolly.dineroJs.dineroJsStrings.SEK
    - typingsJapgolly.dineroJs.dineroJsStrings.SGD
    - typingsJapgolly.dineroJs.dineroJsStrings.SHP
    - typingsJapgolly.dineroJs.dineroJsStrings.SLL
    - typingsJapgolly.dineroJs.dineroJsStrings.SOS
    - typingsJapgolly.dineroJs.dineroJsStrings.SRD
    - typingsJapgolly.dineroJs.dineroJsStrings.SSP
    - typingsJapgolly.dineroJs.dineroJsStrings.STN
    - typingsJapgolly.dineroJs.dineroJsStrings.SVC
    - typingsJapgolly.dineroJs.dineroJsStrings.SYP
    - typingsJapgolly.dineroJs.dineroJsStrings.SZL
    - typingsJapgolly.dineroJs.dineroJsStrings.THB
    - typingsJapgolly.dineroJs.dineroJsStrings.TJS
    - typingsJapgolly.dineroJs.dineroJsStrings.TMT
    - typingsJapgolly.dineroJs.dineroJsStrings.TND
    - typingsJapgolly.dineroJs.dineroJsStrings.TOP
    - typingsJapgolly.dineroJs.dineroJsStrings.TRY
    - typingsJapgolly.dineroJs.dineroJsStrings.TTD
    - typingsJapgolly.dineroJs.dineroJsStrings.TWD
    - typingsJapgolly.dineroJs.dineroJsStrings.TZS
    - typingsJapgolly.dineroJs.dineroJsStrings.UAH
    - typingsJapgolly.dineroJs.dineroJsStrings.UGX
    - typingsJapgolly.dineroJs.dineroJsStrings.USD
    - typingsJapgolly.dineroJs.dineroJsStrings.USN
    - typingsJapgolly.dineroJs.dineroJsStrings.UYI
    - typingsJapgolly.dineroJs.dineroJsStrings.UYU
    - typingsJapgolly.dineroJs.dineroJsStrings.UYW
    - typingsJapgolly.dineroJs.dineroJsStrings.UZS
    - typingsJapgolly.dineroJs.dineroJsStrings.VES
    - typingsJapgolly.dineroJs.dineroJsStrings.VND
    - typingsJapgolly.dineroJs.dineroJsStrings.VUV
    - typingsJapgolly.dineroJs.dineroJsStrings.WST
    - typingsJapgolly.dineroJs.dineroJsStrings.XAF
    - typingsJapgolly.dineroJs.dineroJsStrings.XAG
    - typingsJapgolly.dineroJs.dineroJsStrings.XAU
    - typingsJapgolly.dineroJs.dineroJsStrings.XBA
    - typingsJapgolly.dineroJs.dineroJsStrings.XBB
    - typingsJapgolly.dineroJs.dineroJsStrings.XBC
    - typingsJapgolly.dineroJs.dineroJsStrings.XBD
    - typingsJapgolly.dineroJs.dineroJsStrings.XCD
    - typingsJapgolly.dineroJs.dineroJsStrings.XDR
    - typingsJapgolly.dineroJs.dineroJsStrings.XOF
    - typingsJapgolly.dineroJs.dineroJsStrings.XPD
    - typingsJapgolly.dineroJs.dineroJsStrings.XPF
    - typingsJapgolly.dineroJs.dineroJsStrings.XPT
    - typingsJapgolly.dineroJs.dineroJsStrings.XSU
    - typingsJapgolly.dineroJs.dineroJsStrings.XTS
    - typingsJapgolly.dineroJs.dineroJsStrings.XUA
    - typingsJapgolly.dineroJs.dineroJsStrings.XXX
    - typingsJapgolly.dineroJs.dineroJsStrings.YER
    - typingsJapgolly.dineroJs.dineroJsStrings.ZAR
    - typingsJapgolly.dineroJs.dineroJsStrings.ZMW
    - typingsJapgolly.dineroJs.dineroJsStrings.ZWL
  */
  trait Currency extends StObject
  object Currency {
    
    inline def AED: typingsJapgolly.dineroJs.dineroJsStrings.AED = "AED".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.AED]
    
    inline def AFN: typingsJapgolly.dineroJs.dineroJsStrings.AFN = "AFN".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.AFN]
    
    inline def ALL: typingsJapgolly.dineroJs.dineroJsStrings.ALL = "ALL".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.ALL]
    
    inline def AMD: typingsJapgolly.dineroJs.dineroJsStrings.AMD = "AMD".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.AMD]
    
    inline def ANG: typingsJapgolly.dineroJs.dineroJsStrings.ANG = "ANG".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.ANG]
    
    inline def AOA: typingsJapgolly.dineroJs.dineroJsStrings.AOA = "AOA".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.AOA]
    
    inline def ARS: typingsJapgolly.dineroJs.dineroJsStrings.ARS = "ARS".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.ARS]
    
    inline def AUD: typingsJapgolly.dineroJs.dineroJsStrings.AUD = "AUD".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.AUD]
    
    inline def AWG: typingsJapgolly.dineroJs.dineroJsStrings.AWG = "AWG".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.AWG]
    
    inline def AZN: typingsJapgolly.dineroJs.dineroJsStrings.AZN = "AZN".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.AZN]
    
    inline def BAM: typingsJapgolly.dineroJs.dineroJsStrings.BAM = "BAM".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.BAM]
    
    inline def BBD: typingsJapgolly.dineroJs.dineroJsStrings.BBD = "BBD".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.BBD]
    
    inline def BDT: typingsJapgolly.dineroJs.dineroJsStrings.BDT = "BDT".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.BDT]
    
    inline def BGN: typingsJapgolly.dineroJs.dineroJsStrings.BGN = "BGN".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.BGN]
    
    inline def BHD: typingsJapgolly.dineroJs.dineroJsStrings.BHD = "BHD".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.BHD]
    
    inline def BIF: typingsJapgolly.dineroJs.dineroJsStrings.BIF = "BIF".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.BIF]
    
    inline def BMD: typingsJapgolly.dineroJs.dineroJsStrings.BMD = "BMD".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.BMD]
    
    inline def BND: typingsJapgolly.dineroJs.dineroJsStrings.BND = "BND".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.BND]
    
    inline def BOB: typingsJapgolly.dineroJs.dineroJsStrings.BOB = "BOB".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.BOB]
    
    inline def BOV: typingsJapgolly.dineroJs.dineroJsStrings.BOV = "BOV".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.BOV]
    
    inline def BRL: typingsJapgolly.dineroJs.dineroJsStrings.BRL = "BRL".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.BRL]
    
    inline def BSD: typingsJapgolly.dineroJs.dineroJsStrings.BSD = "BSD".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.BSD]
    
    inline def BTN: typingsJapgolly.dineroJs.dineroJsStrings.BTN = "BTN".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.BTN]
    
    inline def BWP: typingsJapgolly.dineroJs.dineroJsStrings.BWP = "BWP".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.BWP]
    
    inline def BYN: typingsJapgolly.dineroJs.dineroJsStrings.BYN = "BYN".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.BYN]
    
    inline def BZD: typingsJapgolly.dineroJs.dineroJsStrings.BZD = "BZD".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.BZD]
    
    inline def CAD: typingsJapgolly.dineroJs.dineroJsStrings.CAD = "CAD".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.CAD]
    
    inline def CDF: typingsJapgolly.dineroJs.dineroJsStrings.CDF = "CDF".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.CDF]
    
    inline def CHE: typingsJapgolly.dineroJs.dineroJsStrings.CHE = "CHE".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.CHE]
    
    inline def CHF: typingsJapgolly.dineroJs.dineroJsStrings.CHF = "CHF".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.CHF]
    
    inline def CHW: typingsJapgolly.dineroJs.dineroJsStrings.CHW = "CHW".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.CHW]
    
    inline def CLF: typingsJapgolly.dineroJs.dineroJsStrings.CLF = "CLF".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.CLF]
    
    inline def CLP: typingsJapgolly.dineroJs.dineroJsStrings.CLP = "CLP".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.CLP]
    
    inline def CNY: typingsJapgolly.dineroJs.dineroJsStrings.CNY = "CNY".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.CNY]
    
    inline def COP: typingsJapgolly.dineroJs.dineroJsStrings.COP = "COP".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.COP]
    
    inline def COU: typingsJapgolly.dineroJs.dineroJsStrings.COU = "COU".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.COU]
    
    inline def CRC: typingsJapgolly.dineroJs.dineroJsStrings.CRC = "CRC".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.CRC]
    
    inline def CUC: typingsJapgolly.dineroJs.dineroJsStrings.CUC = "CUC".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.CUC]
    
    inline def CUP: typingsJapgolly.dineroJs.dineroJsStrings.CUP = "CUP".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.CUP]
    
    inline def CVE: typingsJapgolly.dineroJs.dineroJsStrings.CVE = "CVE".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.CVE]
    
    inline def CZK: typingsJapgolly.dineroJs.dineroJsStrings.CZK = "CZK".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.CZK]
    
    inline def DJF: typingsJapgolly.dineroJs.dineroJsStrings.DJF = "DJF".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.DJF]
    
    inline def DKK: typingsJapgolly.dineroJs.dineroJsStrings.DKK = "DKK".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.DKK]
    
    inline def DOP: typingsJapgolly.dineroJs.dineroJsStrings.DOP = "DOP".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.DOP]
    
    inline def DZD: typingsJapgolly.dineroJs.dineroJsStrings.DZD = "DZD".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.DZD]
    
    inline def EGP: typingsJapgolly.dineroJs.dineroJsStrings.EGP = "EGP".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.EGP]
    
    inline def ERN: typingsJapgolly.dineroJs.dineroJsStrings.ERN = "ERN".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.ERN]
    
    inline def ETB: typingsJapgolly.dineroJs.dineroJsStrings.ETB = "ETB".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.ETB]
    
    inline def EUR: typingsJapgolly.dineroJs.dineroJsStrings.EUR = "EUR".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.EUR]
    
    inline def FJD: typingsJapgolly.dineroJs.dineroJsStrings.FJD = "FJD".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.FJD]
    
    inline def FKP: typingsJapgolly.dineroJs.dineroJsStrings.FKP = "FKP".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.FKP]
    
    inline def GBP: typingsJapgolly.dineroJs.dineroJsStrings.GBP = "GBP".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.GBP]
    
    inline def GEL: typingsJapgolly.dineroJs.dineroJsStrings.GEL = "GEL".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.GEL]
    
    inline def GHS: typingsJapgolly.dineroJs.dineroJsStrings.GHS = "GHS".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.GHS]
    
    inline def GIP: typingsJapgolly.dineroJs.dineroJsStrings.GIP = "GIP".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.GIP]
    
    inline def GMD: typingsJapgolly.dineroJs.dineroJsStrings.GMD = "GMD".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.GMD]
    
    inline def GNF: typingsJapgolly.dineroJs.dineroJsStrings.GNF = "GNF".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.GNF]
    
    inline def GTQ: typingsJapgolly.dineroJs.dineroJsStrings.GTQ = "GTQ".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.GTQ]
    
    inline def GYD: typingsJapgolly.dineroJs.dineroJsStrings.GYD = "GYD".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.GYD]
    
    inline def HKD: typingsJapgolly.dineroJs.dineroJsStrings.HKD = "HKD".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.HKD]
    
    inline def HNL: typingsJapgolly.dineroJs.dineroJsStrings.HNL = "HNL".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.HNL]
    
    inline def HRK: typingsJapgolly.dineroJs.dineroJsStrings.HRK = "HRK".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.HRK]
    
    inline def HTG: typingsJapgolly.dineroJs.dineroJsStrings.HTG = "HTG".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.HTG]
    
    inline def HUF: typingsJapgolly.dineroJs.dineroJsStrings.HUF = "HUF".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.HUF]
    
    inline def IDR: typingsJapgolly.dineroJs.dineroJsStrings.IDR = "IDR".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.IDR]
    
    inline def ILS: typingsJapgolly.dineroJs.dineroJsStrings.ILS = "ILS".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.ILS]
    
    inline def INR: typingsJapgolly.dineroJs.dineroJsStrings.INR = "INR".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.INR]
    
    inline def IQD: typingsJapgolly.dineroJs.dineroJsStrings.IQD = "IQD".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.IQD]
    
    inline def IRR: typingsJapgolly.dineroJs.dineroJsStrings.IRR = "IRR".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.IRR]
    
    inline def ISK: typingsJapgolly.dineroJs.dineroJsStrings.ISK = "ISK".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.ISK]
    
    inline def JMD: typingsJapgolly.dineroJs.dineroJsStrings.JMD = "JMD".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.JMD]
    
    inline def JOD: typingsJapgolly.dineroJs.dineroJsStrings.JOD = "JOD".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.JOD]
    
    inline def JPY: typingsJapgolly.dineroJs.dineroJsStrings.JPY = "JPY".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.JPY]
    
    inline def KES: typingsJapgolly.dineroJs.dineroJsStrings.KES = "KES".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.KES]
    
    inline def KGS: typingsJapgolly.dineroJs.dineroJsStrings.KGS = "KGS".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.KGS]
    
    inline def KHR: typingsJapgolly.dineroJs.dineroJsStrings.KHR = "KHR".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.KHR]
    
    inline def KMF: typingsJapgolly.dineroJs.dineroJsStrings.KMF = "KMF".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.KMF]
    
    inline def KPW: typingsJapgolly.dineroJs.dineroJsStrings.KPW = "KPW".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.KPW]
    
    inline def KRW: typingsJapgolly.dineroJs.dineroJsStrings.KRW = "KRW".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.KRW]
    
    inline def KWD: typingsJapgolly.dineroJs.dineroJsStrings.KWD = "KWD".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.KWD]
    
    inline def KYD: typingsJapgolly.dineroJs.dineroJsStrings.KYD = "KYD".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.KYD]
    
    inline def KZT: typingsJapgolly.dineroJs.dineroJsStrings.KZT = "KZT".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.KZT]
    
    inline def LAK: typingsJapgolly.dineroJs.dineroJsStrings.LAK = "LAK".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.LAK]
    
    inline def LBP: typingsJapgolly.dineroJs.dineroJsStrings.LBP = "LBP".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.LBP]
    
    inline def LKR: typingsJapgolly.dineroJs.dineroJsStrings.LKR = "LKR".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.LKR]
    
    inline def LRD: typingsJapgolly.dineroJs.dineroJsStrings.LRD = "LRD".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.LRD]
    
    inline def LSL: typingsJapgolly.dineroJs.dineroJsStrings.LSL = "LSL".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.LSL]
    
    inline def LYD: typingsJapgolly.dineroJs.dineroJsStrings.LYD = "LYD".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.LYD]
    
    inline def MAD: typingsJapgolly.dineroJs.dineroJsStrings.MAD = "MAD".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.MAD]
    
    inline def MDL: typingsJapgolly.dineroJs.dineroJsStrings.MDL = "MDL".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.MDL]
    
    inline def MGA: typingsJapgolly.dineroJs.dineroJsStrings.MGA = "MGA".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.MGA]
    
    inline def MKD: typingsJapgolly.dineroJs.dineroJsStrings.MKD = "MKD".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.MKD]
    
    inline def MMK: typingsJapgolly.dineroJs.dineroJsStrings.MMK = "MMK".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.MMK]
    
    inline def MNT: typingsJapgolly.dineroJs.dineroJsStrings.MNT = "MNT".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.MNT]
    
    inline def MOP: typingsJapgolly.dineroJs.dineroJsStrings.MOP = "MOP".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.MOP]
    
    inline def MRU: typingsJapgolly.dineroJs.dineroJsStrings.MRU = "MRU".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.MRU]
    
    inline def MUR: typingsJapgolly.dineroJs.dineroJsStrings.MUR = "MUR".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.MUR]
    
    inline def MVR: typingsJapgolly.dineroJs.dineroJsStrings.MVR = "MVR".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.MVR]
    
    inline def MWK: typingsJapgolly.dineroJs.dineroJsStrings.MWK = "MWK".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.MWK]
    
    inline def MXN: typingsJapgolly.dineroJs.dineroJsStrings.MXN = "MXN".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.MXN]
    
    inline def MXV: typingsJapgolly.dineroJs.dineroJsStrings.MXV = "MXV".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.MXV]
    
    inline def MYR: typingsJapgolly.dineroJs.dineroJsStrings.MYR = "MYR".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.MYR]
    
    inline def MZN: typingsJapgolly.dineroJs.dineroJsStrings.MZN = "MZN".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.MZN]
    
    inline def NAD: typingsJapgolly.dineroJs.dineroJsStrings.NAD = "NAD".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.NAD]
    
    inline def NGN: typingsJapgolly.dineroJs.dineroJsStrings.NGN = "NGN".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.NGN]
    
    inline def NIO: typingsJapgolly.dineroJs.dineroJsStrings.NIO = "NIO".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.NIO]
    
    inline def NOK: typingsJapgolly.dineroJs.dineroJsStrings.NOK = "NOK".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.NOK]
    
    inline def NPR: typingsJapgolly.dineroJs.dineroJsStrings.NPR = "NPR".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.NPR]
    
    inline def NZD: typingsJapgolly.dineroJs.dineroJsStrings.NZD = "NZD".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.NZD]
    
    inline def OMR: typingsJapgolly.dineroJs.dineroJsStrings.OMR = "OMR".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.OMR]
    
    inline def PAB: typingsJapgolly.dineroJs.dineroJsStrings.PAB = "PAB".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.PAB]
    
    inline def PEN: typingsJapgolly.dineroJs.dineroJsStrings.PEN = "PEN".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.PEN]
    
    inline def PGK: typingsJapgolly.dineroJs.dineroJsStrings.PGK = "PGK".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.PGK]
    
    inline def PHP: typingsJapgolly.dineroJs.dineroJsStrings.PHP = "PHP".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.PHP]
    
    inline def PKR: typingsJapgolly.dineroJs.dineroJsStrings.PKR = "PKR".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.PKR]
    
    inline def PLN: typingsJapgolly.dineroJs.dineroJsStrings.PLN = "PLN".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.PLN]
    
    inline def PYG: typingsJapgolly.dineroJs.dineroJsStrings.PYG = "PYG".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.PYG]
    
    inline def QAR: typingsJapgolly.dineroJs.dineroJsStrings.QAR = "QAR".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.QAR]
    
    inline def RON: typingsJapgolly.dineroJs.dineroJsStrings.RON = "RON".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.RON]
    
    inline def RSD: typingsJapgolly.dineroJs.dineroJsStrings.RSD = "RSD".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.RSD]
    
    inline def RUB: typingsJapgolly.dineroJs.dineroJsStrings.RUB = "RUB".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.RUB]
    
    inline def RWF: typingsJapgolly.dineroJs.dineroJsStrings.RWF = "RWF".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.RWF]
    
    inline def SAR: typingsJapgolly.dineroJs.dineroJsStrings.SAR = "SAR".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.SAR]
    
    inline def SBD: typingsJapgolly.dineroJs.dineroJsStrings.SBD = "SBD".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.SBD]
    
    inline def SCR: typingsJapgolly.dineroJs.dineroJsStrings.SCR = "SCR".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.SCR]
    
    inline def SDG: typingsJapgolly.dineroJs.dineroJsStrings.SDG = "SDG".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.SDG]
    
    inline def SEK: typingsJapgolly.dineroJs.dineroJsStrings.SEK = "SEK".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.SEK]
    
    inline def SGD: typingsJapgolly.dineroJs.dineroJsStrings.SGD = "SGD".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.SGD]
    
    inline def SHP: typingsJapgolly.dineroJs.dineroJsStrings.SHP = "SHP".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.SHP]
    
    inline def SLL: typingsJapgolly.dineroJs.dineroJsStrings.SLL = "SLL".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.SLL]
    
    inline def SOS: typingsJapgolly.dineroJs.dineroJsStrings.SOS = "SOS".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.SOS]
    
    inline def SRD: typingsJapgolly.dineroJs.dineroJsStrings.SRD = "SRD".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.SRD]
    
    inline def SSP: typingsJapgolly.dineroJs.dineroJsStrings.SSP = "SSP".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.SSP]
    
    inline def STN: typingsJapgolly.dineroJs.dineroJsStrings.STN = "STN".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.STN]
    
    inline def SVC: typingsJapgolly.dineroJs.dineroJsStrings.SVC = "SVC".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.SVC]
    
    inline def SYP: typingsJapgolly.dineroJs.dineroJsStrings.SYP = "SYP".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.SYP]
    
    inline def SZL: typingsJapgolly.dineroJs.dineroJsStrings.SZL = "SZL".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.SZL]
    
    inline def THB: typingsJapgolly.dineroJs.dineroJsStrings.THB = "THB".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.THB]
    
    inline def TJS: typingsJapgolly.dineroJs.dineroJsStrings.TJS = "TJS".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.TJS]
    
    inline def TMT: typingsJapgolly.dineroJs.dineroJsStrings.TMT = "TMT".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.TMT]
    
    inline def TND: typingsJapgolly.dineroJs.dineroJsStrings.TND = "TND".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.TND]
    
    inline def TOP: typingsJapgolly.dineroJs.dineroJsStrings.TOP = "TOP".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.TOP]
    
    inline def TRY: typingsJapgolly.dineroJs.dineroJsStrings.TRY = "TRY".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.TRY]
    
    inline def TTD: typingsJapgolly.dineroJs.dineroJsStrings.TTD = "TTD".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.TTD]
    
    inline def TWD: typingsJapgolly.dineroJs.dineroJsStrings.TWD = "TWD".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.TWD]
    
    inline def TZS: typingsJapgolly.dineroJs.dineroJsStrings.TZS = "TZS".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.TZS]
    
    inline def UAH: typingsJapgolly.dineroJs.dineroJsStrings.UAH = "UAH".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.UAH]
    
    inline def UGX: typingsJapgolly.dineroJs.dineroJsStrings.UGX = "UGX".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.UGX]
    
    inline def USD: typingsJapgolly.dineroJs.dineroJsStrings.USD = "USD".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.USD]
    
    inline def USN: typingsJapgolly.dineroJs.dineroJsStrings.USN = "USN".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.USN]
    
    inline def UYI: typingsJapgolly.dineroJs.dineroJsStrings.UYI = "UYI".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.UYI]
    
    inline def UYU: typingsJapgolly.dineroJs.dineroJsStrings.UYU = "UYU".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.UYU]
    
    inline def UYW: typingsJapgolly.dineroJs.dineroJsStrings.UYW = "UYW".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.UYW]
    
    inline def UZS: typingsJapgolly.dineroJs.dineroJsStrings.UZS = "UZS".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.UZS]
    
    inline def VES: typingsJapgolly.dineroJs.dineroJsStrings.VES = "VES".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.VES]
    
    inline def VND: typingsJapgolly.dineroJs.dineroJsStrings.VND = "VND".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.VND]
    
    inline def VUV: typingsJapgolly.dineroJs.dineroJsStrings.VUV = "VUV".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.VUV]
    
    inline def WST: typingsJapgolly.dineroJs.dineroJsStrings.WST = "WST".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.WST]
    
    inline def XAF: typingsJapgolly.dineroJs.dineroJsStrings.XAF = "XAF".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.XAF]
    
    inline def XAG: typingsJapgolly.dineroJs.dineroJsStrings.XAG = "XAG".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.XAG]
    
    inline def XAU: typingsJapgolly.dineroJs.dineroJsStrings.XAU = "XAU".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.XAU]
    
    inline def XBA: typingsJapgolly.dineroJs.dineroJsStrings.XBA = "XBA".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.XBA]
    
    inline def XBB: typingsJapgolly.dineroJs.dineroJsStrings.XBB = "XBB".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.XBB]
    
    inline def XBC: typingsJapgolly.dineroJs.dineroJsStrings.XBC = "XBC".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.XBC]
    
    inline def XBD: typingsJapgolly.dineroJs.dineroJsStrings.XBD = "XBD".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.XBD]
    
    inline def XCD: typingsJapgolly.dineroJs.dineroJsStrings.XCD = "XCD".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.XCD]
    
    inline def XDR: typingsJapgolly.dineroJs.dineroJsStrings.XDR = "XDR".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.XDR]
    
    inline def XOF: typingsJapgolly.dineroJs.dineroJsStrings.XOF = "XOF".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.XOF]
    
    inline def XPD: typingsJapgolly.dineroJs.dineroJsStrings.XPD = "XPD".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.XPD]
    
    inline def XPF: typingsJapgolly.dineroJs.dineroJsStrings.XPF = "XPF".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.XPF]
    
    inline def XPT: typingsJapgolly.dineroJs.dineroJsStrings.XPT = "XPT".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.XPT]
    
    inline def XSU: typingsJapgolly.dineroJs.dineroJsStrings.XSU = "XSU".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.XSU]
    
    inline def XTS: typingsJapgolly.dineroJs.dineroJsStrings.XTS = "XTS".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.XTS]
    
    inline def XUA: typingsJapgolly.dineroJs.dineroJsStrings.XUA = "XUA".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.XUA]
    
    inline def XXX: typingsJapgolly.dineroJs.dineroJsStrings.XXX = "XXX".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.XXX]
    
    inline def YER: typingsJapgolly.dineroJs.dineroJsStrings.YER = "YER".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.YER]
    
    inline def ZAR: typingsJapgolly.dineroJs.dineroJsStrings.ZAR = "ZAR".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.ZAR]
    
    inline def ZMW: typingsJapgolly.dineroJs.dineroJsStrings.ZMW = "ZMW".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.ZMW]
    
    inline def ZWL: typingsJapgolly.dineroJs.dineroJsStrings.ZWL = "ZWL".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.ZWL]
  }
  
  @js.native
  trait Dinero extends StObject {
    
    def add(addend: Dinero): Dinero = js.native
    
    def allocate(ratios: js.Array[Double]): js.Array[Dinero] = js.native
    
    def convert(currency: String): js.Promise[Dinero] = js.native
    def convert(currency: String, options: ExchangeRatesApiOptions): js.Promise[Dinero] = js.native
    
    def convertPrecision(newPrecision: Double): Dinero = js.native
    def convertPrecision(newPrecision: Double, roundingMode: RoundingMode): Dinero = js.native
    
    def divide(divisor: Double): Dinero = js.native
    def divide(divisor: Double, roundingMode: RoundingMode): Dinero = js.native
    
    def equalsTo(comparator: Dinero): Boolean = js.native
    
    def getAmount(): Double = js.native
    
    def getCurrency(): Currency = js.native
    
    def getLocale(): String = js.native
    
    def getPrecision(): Double = js.native
    
    def greaterThan(comparator: Dinero): Boolean = js.native
    
    def greaterThanOrEqual(comparator: Dinero): Boolean = js.native
    
    /**
      * @deprecated since version 2.0
      */
    def hasCents(): Boolean = js.native
    
    def hasSameAmount(comparator: Dinero): Boolean = js.native
    
    def hasSameCurrency(comparator: Dinero): Boolean = js.native
    
    def hasSubUnits(): Boolean = js.native
    
    def isNegative(): Boolean = js.native
    
    def isPositive(): Boolean = js.native
    
    def isZero(): Boolean = js.native
    
    def lessThan(comparator: Dinero): Boolean = js.native
    
    def lessThanOrEqual(comparator: Dinero): Boolean = js.native
    
    def multiply(multiplier: Double): Dinero = js.native
    def multiply(multiplier: Double, roundingMode: RoundingMode): Dinero = js.native
    
    def percentage(percentage: Double): Dinero = js.native
    def percentage(percentage: Double, roundingMode: RoundingMode): Dinero = js.native
    
    def setLocale(newLocale: String): Dinero = js.native
    
    def subtract(subtrahend: Dinero): Dinero = js.native
    
    def toFormat(): String = js.native
    def toFormat(format: String): String = js.native
    def toFormat(format: String, roundingMode: RoundingMode): String = js.native
    def toFormat(format: Unit, roundingMode: RoundingMode): String = js.native
    
    def toJSON(): DineroObject = js.native
    
    def toObject(): DineroObject = js.native
    
    def toRoundedUnit(digits: Double): Double = js.native
    def toRoundedUnit(digits: Double, roundingMode: RoundingMode): Double = js.native
    
    def toUnit(): Double = js.native
  }
  
  trait DineroObject extends StObject {
    
    var amount: Double
    
    var currency: Currency
    
    var precision: Double
  }
  object DineroObject {
    
    inline def apply(amount: Double, currency: Currency, precision: Double): DineroObject = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], precision = precision.asInstanceOf[js.Any])
      __obj.asInstanceOf[DineroObject]
    }
    
    extension [Self <: DineroObject](x: Self) {
      
      inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setCurrency(value: Currency): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExchangeRatesApiOptions extends StObject {
    
    var endpoint: String | js.Promise[StringDictionary[Any]]
    
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var propertyPath: js.UndefOr[String] = js.undefined
    
    var roundingMode: js.UndefOr[RoundingMode] = js.undefined
  }
  object ExchangeRatesApiOptions {
    
    inline def apply(endpoint: String | js.Promise[StringDictionary[Any]]): ExchangeRatesApiOptions = {
      val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExchangeRatesApiOptions]
    }
    
    extension [Self <: ExchangeRatesApiOptions](x: Self) {
      
      inline def setEndpoint(value: String | js.Promise[StringDictionary[Any]]): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setPropertyPath(value: String): Self = StObject.set(x, "propertyPath", value.asInstanceOf[js.Any])
      
      inline def setPropertyPathUndefined: Self = StObject.set(x, "propertyPath", js.undefined)
      
      inline def setRoundingMode(value: RoundingMode): Self = StObject.set(x, "roundingMode", value.asInstanceOf[js.Any])
      
      inline def setRoundingModeUndefined: Self = StObject.set(x, "roundingMode", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    var amount: js.UndefOr[Double] = js.undefined
    
    var currency: js.UndefOr[Currency] = js.undefined
    
    var precision: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
      
      inline def setCurrency(value: Currency): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
      
      inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.dineroJs.dineroJsStrings.HALF_ODD
    - typingsJapgolly.dineroJs.dineroJsStrings.HALF_EVEN
    - typingsJapgolly.dineroJs.dineroJsStrings.HALF_UP
    - typingsJapgolly.dineroJs.dineroJsStrings.HALF_DOWN
    - typingsJapgolly.dineroJs.dineroJsStrings.HALF_TOWARDS_ZERO
    - typingsJapgolly.dineroJs.dineroJsStrings.HALF_AWAY_FROM_ZERO
    - typingsJapgolly.dineroJs.dineroJsStrings.DOWN
  */
  trait RoundingMode extends StObject
  object RoundingMode {
    
    inline def DOWN: typingsJapgolly.dineroJs.dineroJsStrings.DOWN = "DOWN".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.DOWN]
    
    inline def HALF_AWAY_FROM_ZERO: typingsJapgolly.dineroJs.dineroJsStrings.HALF_AWAY_FROM_ZERO = "HALF_AWAY_FROM_ZERO".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.HALF_AWAY_FROM_ZERO]
    
    inline def HALF_DOWN: typingsJapgolly.dineroJs.dineroJsStrings.HALF_DOWN = "HALF_DOWN".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.HALF_DOWN]
    
    inline def HALF_EVEN: typingsJapgolly.dineroJs.dineroJsStrings.HALF_EVEN = "HALF_EVEN".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.HALF_EVEN]
    
    inline def HALF_ODD: typingsJapgolly.dineroJs.dineroJsStrings.HALF_ODD = "HALF_ODD".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.HALF_ODD]
    
    inline def HALF_TOWARDS_ZERO: typingsJapgolly.dineroJs.dineroJsStrings.HALF_TOWARDS_ZERO = "HALF_TOWARDS_ZERO".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.HALF_TOWARDS_ZERO]
    
    inline def HALF_UP: typingsJapgolly.dineroJs.dineroJsStrings.HALF_UP = "HALF_UP".asInstanceOf[typingsJapgolly.dineroJs.dineroJsStrings.HALF_UP]
  }
}
