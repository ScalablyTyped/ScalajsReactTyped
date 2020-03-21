package typingsJapgolly.dineroJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait Currency extends js.Object

object Currency {
  @scala.inline
  def AED: typingsJapgolly.dineroJs.dineroJsStrings.AED = this.cast("AED")
  @scala.inline
  def AFN: typingsJapgolly.dineroJs.dineroJsStrings.AFN = this.cast("AFN")
  @scala.inline
  def ALL: typingsJapgolly.dineroJs.dineroJsStrings.ALL = this.cast("ALL")
  @scala.inline
  def AMD: typingsJapgolly.dineroJs.dineroJsStrings.AMD = this.cast("AMD")
  @scala.inline
  def ANG: typingsJapgolly.dineroJs.dineroJsStrings.ANG = this.cast("ANG")
  @scala.inline
  def AOA: typingsJapgolly.dineroJs.dineroJsStrings.AOA = this.cast("AOA")
  @scala.inline
  def ARS: typingsJapgolly.dineroJs.dineroJsStrings.ARS = this.cast("ARS")
  @scala.inline
  def AUD: typingsJapgolly.dineroJs.dineroJsStrings.AUD = this.cast("AUD")
  @scala.inline
  def AWG: typingsJapgolly.dineroJs.dineroJsStrings.AWG = this.cast("AWG")
  @scala.inline
  def AZN: typingsJapgolly.dineroJs.dineroJsStrings.AZN = this.cast("AZN")
  @scala.inline
  def BAM: typingsJapgolly.dineroJs.dineroJsStrings.BAM = this.cast("BAM")
  @scala.inline
  def BBD: typingsJapgolly.dineroJs.dineroJsStrings.BBD = this.cast("BBD")
  @scala.inline
  def BDT: typingsJapgolly.dineroJs.dineroJsStrings.BDT = this.cast("BDT")
  @scala.inline
  def BGN: typingsJapgolly.dineroJs.dineroJsStrings.BGN = this.cast("BGN")
  @scala.inline
  def BHD: typingsJapgolly.dineroJs.dineroJsStrings.BHD = this.cast("BHD")
  @scala.inline
  def BIF: typingsJapgolly.dineroJs.dineroJsStrings.BIF = this.cast("BIF")
  @scala.inline
  def BMD: typingsJapgolly.dineroJs.dineroJsStrings.BMD = this.cast("BMD")
  @scala.inline
  def BND: typingsJapgolly.dineroJs.dineroJsStrings.BND = this.cast("BND")
  @scala.inline
  def BOB: typingsJapgolly.dineroJs.dineroJsStrings.BOB = this.cast("BOB")
  @scala.inline
  def BOV: typingsJapgolly.dineroJs.dineroJsStrings.BOV = this.cast("BOV")
  @scala.inline
  def BRL: typingsJapgolly.dineroJs.dineroJsStrings.BRL = this.cast("BRL")
  @scala.inline
  def BSD: typingsJapgolly.dineroJs.dineroJsStrings.BSD = this.cast("BSD")
  @scala.inline
  def BTN: typingsJapgolly.dineroJs.dineroJsStrings.BTN = this.cast("BTN")
  @scala.inline
  def BWP: typingsJapgolly.dineroJs.dineroJsStrings.BWP = this.cast("BWP")
  @scala.inline
  def BYN: typingsJapgolly.dineroJs.dineroJsStrings.BYN = this.cast("BYN")
  @scala.inline
  def BZD: typingsJapgolly.dineroJs.dineroJsStrings.BZD = this.cast("BZD")
  @scala.inline
  def CAD: typingsJapgolly.dineroJs.dineroJsStrings.CAD = this.cast("CAD")
  @scala.inline
  def CDF: typingsJapgolly.dineroJs.dineroJsStrings.CDF = this.cast("CDF")
  @scala.inline
  def CHE: typingsJapgolly.dineroJs.dineroJsStrings.CHE = this.cast("CHE")
  @scala.inline
  def CHF: typingsJapgolly.dineroJs.dineroJsStrings.CHF = this.cast("CHF")
  @scala.inline
  def CHW: typingsJapgolly.dineroJs.dineroJsStrings.CHW = this.cast("CHW")
  @scala.inline
  def CLF: typingsJapgolly.dineroJs.dineroJsStrings.CLF = this.cast("CLF")
  @scala.inline
  def CLP: typingsJapgolly.dineroJs.dineroJsStrings.CLP = this.cast("CLP")
  @scala.inline
  def CNY: typingsJapgolly.dineroJs.dineroJsStrings.CNY = this.cast("CNY")
  @scala.inline
  def COP: typingsJapgolly.dineroJs.dineroJsStrings.COP = this.cast("COP")
  @scala.inline
  def COU: typingsJapgolly.dineroJs.dineroJsStrings.COU = this.cast("COU")
  @scala.inline
  def CRC: typingsJapgolly.dineroJs.dineroJsStrings.CRC = this.cast("CRC")
  @scala.inline
  def CUC: typingsJapgolly.dineroJs.dineroJsStrings.CUC = this.cast("CUC")
  @scala.inline
  def CUP: typingsJapgolly.dineroJs.dineroJsStrings.CUP = this.cast("CUP")
  @scala.inline
  def CVE: typingsJapgolly.dineroJs.dineroJsStrings.CVE = this.cast("CVE")
  @scala.inline
  def CZK: typingsJapgolly.dineroJs.dineroJsStrings.CZK = this.cast("CZK")
  @scala.inline
  def DJF: typingsJapgolly.dineroJs.dineroJsStrings.DJF = this.cast("DJF")
  @scala.inline
  def DKK: typingsJapgolly.dineroJs.dineroJsStrings.DKK = this.cast("DKK")
  @scala.inline
  def DOP: typingsJapgolly.dineroJs.dineroJsStrings.DOP = this.cast("DOP")
  @scala.inline
  def DZD: typingsJapgolly.dineroJs.dineroJsStrings.DZD = this.cast("DZD")
  @scala.inline
  def EGP: typingsJapgolly.dineroJs.dineroJsStrings.EGP = this.cast("EGP")
  @scala.inline
  def ERN: typingsJapgolly.dineroJs.dineroJsStrings.ERN = this.cast("ERN")
  @scala.inline
  def ETB: typingsJapgolly.dineroJs.dineroJsStrings.ETB = this.cast("ETB")
  @scala.inline
  def EUR: typingsJapgolly.dineroJs.dineroJsStrings.EUR = this.cast("EUR")
  @scala.inline
  def FJD: typingsJapgolly.dineroJs.dineroJsStrings.FJD = this.cast("FJD")
  @scala.inline
  def FKP: typingsJapgolly.dineroJs.dineroJsStrings.FKP = this.cast("FKP")
  @scala.inline
  def GBP: typingsJapgolly.dineroJs.dineroJsStrings.GBP = this.cast("GBP")
  @scala.inline
  def GEL: typingsJapgolly.dineroJs.dineroJsStrings.GEL = this.cast("GEL")
  @scala.inline
  def GHS: typingsJapgolly.dineroJs.dineroJsStrings.GHS = this.cast("GHS")
  @scala.inline
  def GIP: typingsJapgolly.dineroJs.dineroJsStrings.GIP = this.cast("GIP")
  @scala.inline
  def GMD: typingsJapgolly.dineroJs.dineroJsStrings.GMD = this.cast("GMD")
  @scala.inline
  def GNF: typingsJapgolly.dineroJs.dineroJsStrings.GNF = this.cast("GNF")
  @scala.inline
  def GTQ: typingsJapgolly.dineroJs.dineroJsStrings.GTQ = this.cast("GTQ")
  @scala.inline
  def GYD: typingsJapgolly.dineroJs.dineroJsStrings.GYD = this.cast("GYD")
  @scala.inline
  def HKD: typingsJapgolly.dineroJs.dineroJsStrings.HKD = this.cast("HKD")
  @scala.inline
  def HNL: typingsJapgolly.dineroJs.dineroJsStrings.HNL = this.cast("HNL")
  @scala.inline
  def HRK: typingsJapgolly.dineroJs.dineroJsStrings.HRK = this.cast("HRK")
  @scala.inline
  def HTG: typingsJapgolly.dineroJs.dineroJsStrings.HTG = this.cast("HTG")
  @scala.inline
  def HUF: typingsJapgolly.dineroJs.dineroJsStrings.HUF = this.cast("HUF")
  @scala.inline
  def IDR: typingsJapgolly.dineroJs.dineroJsStrings.IDR = this.cast("IDR")
  @scala.inline
  def ILS: typingsJapgolly.dineroJs.dineroJsStrings.ILS = this.cast("ILS")
  @scala.inline
  def INR: typingsJapgolly.dineroJs.dineroJsStrings.INR = this.cast("INR")
  @scala.inline
  def IQD: typingsJapgolly.dineroJs.dineroJsStrings.IQD = this.cast("IQD")
  @scala.inline
  def IRR: typingsJapgolly.dineroJs.dineroJsStrings.IRR = this.cast("IRR")
  @scala.inline
  def ISK: typingsJapgolly.dineroJs.dineroJsStrings.ISK = this.cast("ISK")
  @scala.inline
  def JMD: typingsJapgolly.dineroJs.dineroJsStrings.JMD = this.cast("JMD")
  @scala.inline
  def JOD: typingsJapgolly.dineroJs.dineroJsStrings.JOD = this.cast("JOD")
  @scala.inline
  def JPY: typingsJapgolly.dineroJs.dineroJsStrings.JPY = this.cast("JPY")
  @scala.inline
  def KES: typingsJapgolly.dineroJs.dineroJsStrings.KES = this.cast("KES")
  @scala.inline
  def KGS: typingsJapgolly.dineroJs.dineroJsStrings.KGS = this.cast("KGS")
  @scala.inline
  def KHR: typingsJapgolly.dineroJs.dineroJsStrings.KHR = this.cast("KHR")
  @scala.inline
  def KMF: typingsJapgolly.dineroJs.dineroJsStrings.KMF = this.cast("KMF")
  @scala.inline
  def KPW: typingsJapgolly.dineroJs.dineroJsStrings.KPW = this.cast("KPW")
  @scala.inline
  def KRW: typingsJapgolly.dineroJs.dineroJsStrings.KRW = this.cast("KRW")
  @scala.inline
  def KWD: typingsJapgolly.dineroJs.dineroJsStrings.KWD = this.cast("KWD")
  @scala.inline
  def KYD: typingsJapgolly.dineroJs.dineroJsStrings.KYD = this.cast("KYD")
  @scala.inline
  def KZT: typingsJapgolly.dineroJs.dineroJsStrings.KZT = this.cast("KZT")
  @scala.inline
  def LAK: typingsJapgolly.dineroJs.dineroJsStrings.LAK = this.cast("LAK")
  @scala.inline
  def LBP: typingsJapgolly.dineroJs.dineroJsStrings.LBP = this.cast("LBP")
  @scala.inline
  def LKR: typingsJapgolly.dineroJs.dineroJsStrings.LKR = this.cast("LKR")
  @scala.inline
  def LRD: typingsJapgolly.dineroJs.dineroJsStrings.LRD = this.cast("LRD")
  @scala.inline
  def LSL: typingsJapgolly.dineroJs.dineroJsStrings.LSL = this.cast("LSL")
  @scala.inline
  def LYD: typingsJapgolly.dineroJs.dineroJsStrings.LYD = this.cast("LYD")
  @scala.inline
  def MAD: typingsJapgolly.dineroJs.dineroJsStrings.MAD = this.cast("MAD")
  @scala.inline
  def MDL: typingsJapgolly.dineroJs.dineroJsStrings.MDL = this.cast("MDL")
  @scala.inline
  def MGA: typingsJapgolly.dineroJs.dineroJsStrings.MGA = this.cast("MGA")
  @scala.inline
  def MKD: typingsJapgolly.dineroJs.dineroJsStrings.MKD = this.cast("MKD")
  @scala.inline
  def MMK: typingsJapgolly.dineroJs.dineroJsStrings.MMK = this.cast("MMK")
  @scala.inline
  def MNT: typingsJapgolly.dineroJs.dineroJsStrings.MNT = this.cast("MNT")
  @scala.inline
  def MOP: typingsJapgolly.dineroJs.dineroJsStrings.MOP = this.cast("MOP")
  @scala.inline
  def MRU: typingsJapgolly.dineroJs.dineroJsStrings.MRU = this.cast("MRU")
  @scala.inline
  def MUR: typingsJapgolly.dineroJs.dineroJsStrings.MUR = this.cast("MUR")
  @scala.inline
  def MVR: typingsJapgolly.dineroJs.dineroJsStrings.MVR = this.cast("MVR")
  @scala.inline
  def MWK: typingsJapgolly.dineroJs.dineroJsStrings.MWK = this.cast("MWK")
  @scala.inline
  def MXN: typingsJapgolly.dineroJs.dineroJsStrings.MXN = this.cast("MXN")
  @scala.inline
  def MXV: typingsJapgolly.dineroJs.dineroJsStrings.MXV = this.cast("MXV")
  @scala.inline
  def MYR: typingsJapgolly.dineroJs.dineroJsStrings.MYR = this.cast("MYR")
  @scala.inline
  def MZN: typingsJapgolly.dineroJs.dineroJsStrings.MZN = this.cast("MZN")
  @scala.inline
  def NAD: typingsJapgolly.dineroJs.dineroJsStrings.NAD = this.cast("NAD")
  @scala.inline
  def NGN: typingsJapgolly.dineroJs.dineroJsStrings.NGN = this.cast("NGN")
  @scala.inline
  def NIO: typingsJapgolly.dineroJs.dineroJsStrings.NIO = this.cast("NIO")
  @scala.inline
  def NOK: typingsJapgolly.dineroJs.dineroJsStrings.NOK = this.cast("NOK")
  @scala.inline
  def NPR: typingsJapgolly.dineroJs.dineroJsStrings.NPR = this.cast("NPR")
  @scala.inline
  def NZD: typingsJapgolly.dineroJs.dineroJsStrings.NZD = this.cast("NZD")
  @scala.inline
  def OMR: typingsJapgolly.dineroJs.dineroJsStrings.OMR = this.cast("OMR")
  @scala.inline
  def PAB: typingsJapgolly.dineroJs.dineroJsStrings.PAB = this.cast("PAB")
  @scala.inline
  def PEN: typingsJapgolly.dineroJs.dineroJsStrings.PEN = this.cast("PEN")
  @scala.inline
  def PGK: typingsJapgolly.dineroJs.dineroJsStrings.PGK = this.cast("PGK")
  @scala.inline
  def PHP: typingsJapgolly.dineroJs.dineroJsStrings.PHP = this.cast("PHP")
  @scala.inline
  def PKR: typingsJapgolly.dineroJs.dineroJsStrings.PKR = this.cast("PKR")
  @scala.inline
  def PLN: typingsJapgolly.dineroJs.dineroJsStrings.PLN = this.cast("PLN")
  @scala.inline
  def PYG: typingsJapgolly.dineroJs.dineroJsStrings.PYG = this.cast("PYG")
  @scala.inline
  def QAR: typingsJapgolly.dineroJs.dineroJsStrings.QAR = this.cast("QAR")
  @scala.inline
  def RON: typingsJapgolly.dineroJs.dineroJsStrings.RON = this.cast("RON")
  @scala.inline
  def RSD: typingsJapgolly.dineroJs.dineroJsStrings.RSD = this.cast("RSD")
  @scala.inline
  def RUB: typingsJapgolly.dineroJs.dineroJsStrings.RUB = this.cast("RUB")
  @scala.inline
  def RWF: typingsJapgolly.dineroJs.dineroJsStrings.RWF = this.cast("RWF")
  @scala.inline
  def SAR: typingsJapgolly.dineroJs.dineroJsStrings.SAR = this.cast("SAR")
  @scala.inline
  def SBD: typingsJapgolly.dineroJs.dineroJsStrings.SBD = this.cast("SBD")
  @scala.inline
  def SCR: typingsJapgolly.dineroJs.dineroJsStrings.SCR = this.cast("SCR")
  @scala.inline
  def SDG: typingsJapgolly.dineroJs.dineroJsStrings.SDG = this.cast("SDG")
  @scala.inline
  def SEK: typingsJapgolly.dineroJs.dineroJsStrings.SEK = this.cast("SEK")
  @scala.inline
  def SGD: typingsJapgolly.dineroJs.dineroJsStrings.SGD = this.cast("SGD")
  @scala.inline
  def SHP: typingsJapgolly.dineroJs.dineroJsStrings.SHP = this.cast("SHP")
  @scala.inline
  def SLL: typingsJapgolly.dineroJs.dineroJsStrings.SLL = this.cast("SLL")
  @scala.inline
  def SOS: typingsJapgolly.dineroJs.dineroJsStrings.SOS = this.cast("SOS")
  @scala.inline
  def SRD: typingsJapgolly.dineroJs.dineroJsStrings.SRD = this.cast("SRD")
  @scala.inline
  def SSP: typingsJapgolly.dineroJs.dineroJsStrings.SSP = this.cast("SSP")
  @scala.inline
  def STN: typingsJapgolly.dineroJs.dineroJsStrings.STN = this.cast("STN")
  @scala.inline
  def SVC: typingsJapgolly.dineroJs.dineroJsStrings.SVC = this.cast("SVC")
  @scala.inline
  def SYP: typingsJapgolly.dineroJs.dineroJsStrings.SYP = this.cast("SYP")
  @scala.inline
  def SZL: typingsJapgolly.dineroJs.dineroJsStrings.SZL = this.cast("SZL")
  @scala.inline
  def THB: typingsJapgolly.dineroJs.dineroJsStrings.THB = this.cast("THB")
  @scala.inline
  def TJS: typingsJapgolly.dineroJs.dineroJsStrings.TJS = this.cast("TJS")
  @scala.inline
  def TMT: typingsJapgolly.dineroJs.dineroJsStrings.TMT = this.cast("TMT")
  @scala.inline
  def TND: typingsJapgolly.dineroJs.dineroJsStrings.TND = this.cast("TND")
  @scala.inline
  def TOP: typingsJapgolly.dineroJs.dineroJsStrings.TOP = this.cast("TOP")
  @scala.inline
  def TRY: typingsJapgolly.dineroJs.dineroJsStrings.TRY = this.cast("TRY")
  @scala.inline
  def TTD: typingsJapgolly.dineroJs.dineroJsStrings.TTD = this.cast("TTD")
  @scala.inline
  def TWD: typingsJapgolly.dineroJs.dineroJsStrings.TWD = this.cast("TWD")
  @scala.inline
  def TZS: typingsJapgolly.dineroJs.dineroJsStrings.TZS = this.cast("TZS")
  @scala.inline
  def UAH: typingsJapgolly.dineroJs.dineroJsStrings.UAH = this.cast("UAH")
  @scala.inline
  def UGX: typingsJapgolly.dineroJs.dineroJsStrings.UGX = this.cast("UGX")
  @scala.inline
  def USD: typingsJapgolly.dineroJs.dineroJsStrings.USD = this.cast("USD")
  @scala.inline
  def USN: typingsJapgolly.dineroJs.dineroJsStrings.USN = this.cast("USN")
  @scala.inline
  def UYI: typingsJapgolly.dineroJs.dineroJsStrings.UYI = this.cast("UYI")
  @scala.inline
  def UYU: typingsJapgolly.dineroJs.dineroJsStrings.UYU = this.cast("UYU")
  @scala.inline
  def UYW: typingsJapgolly.dineroJs.dineroJsStrings.UYW = this.cast("UYW")
  @scala.inline
  def UZS: typingsJapgolly.dineroJs.dineroJsStrings.UZS = this.cast("UZS")
  @scala.inline
  def VES: typingsJapgolly.dineroJs.dineroJsStrings.VES = this.cast("VES")
  @scala.inline
  def VND: typingsJapgolly.dineroJs.dineroJsStrings.VND = this.cast("VND")
  @scala.inline
  def VUV: typingsJapgolly.dineroJs.dineroJsStrings.VUV = this.cast("VUV")
  @scala.inline
  def WST: typingsJapgolly.dineroJs.dineroJsStrings.WST = this.cast("WST")
  @scala.inline
  def XAF: typingsJapgolly.dineroJs.dineroJsStrings.XAF = this.cast("XAF")
  @scala.inline
  def XAG: typingsJapgolly.dineroJs.dineroJsStrings.XAG = this.cast("XAG")
  @scala.inline
  def XAU: typingsJapgolly.dineroJs.dineroJsStrings.XAU = this.cast("XAU")
  @scala.inline
  def XBA: typingsJapgolly.dineroJs.dineroJsStrings.XBA = this.cast("XBA")
  @scala.inline
  def XBB: typingsJapgolly.dineroJs.dineroJsStrings.XBB = this.cast("XBB")
  @scala.inline
  def XBC: typingsJapgolly.dineroJs.dineroJsStrings.XBC = this.cast("XBC")
  @scala.inline
  def XBD: typingsJapgolly.dineroJs.dineroJsStrings.XBD = this.cast("XBD")
  @scala.inline
  def XCD: typingsJapgolly.dineroJs.dineroJsStrings.XCD = this.cast("XCD")
  @scala.inline
  def XDR: typingsJapgolly.dineroJs.dineroJsStrings.XDR = this.cast("XDR")
  @scala.inline
  def XOF: typingsJapgolly.dineroJs.dineroJsStrings.XOF = this.cast("XOF")
  @scala.inline
  def XPD: typingsJapgolly.dineroJs.dineroJsStrings.XPD = this.cast("XPD")
  @scala.inline
  def XPF: typingsJapgolly.dineroJs.dineroJsStrings.XPF = this.cast("XPF")
  @scala.inline
  def XPT: typingsJapgolly.dineroJs.dineroJsStrings.XPT = this.cast("XPT")
  @scala.inline
  def XSU: typingsJapgolly.dineroJs.dineroJsStrings.XSU = this.cast("XSU")
  @scala.inline
  def XTS: typingsJapgolly.dineroJs.dineroJsStrings.XTS = this.cast("XTS")
  @scala.inline
  def XUA: typingsJapgolly.dineroJs.dineroJsStrings.XUA = this.cast("XUA")
  @scala.inline
  def XXX: typingsJapgolly.dineroJs.dineroJsStrings.XXX = this.cast("XXX")
  @scala.inline
  def YER: typingsJapgolly.dineroJs.dineroJsStrings.YER = this.cast("YER")
  @scala.inline
  def ZAR: typingsJapgolly.dineroJs.dineroJsStrings.ZAR = this.cast("ZAR")
  @scala.inline
  def ZMW: typingsJapgolly.dineroJs.dineroJsStrings.ZMW = this.cast("ZMW")
  @scala.inline
  def ZWL: typingsJapgolly.dineroJs.dineroJsStrings.ZWL = this.cast("ZWL")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

