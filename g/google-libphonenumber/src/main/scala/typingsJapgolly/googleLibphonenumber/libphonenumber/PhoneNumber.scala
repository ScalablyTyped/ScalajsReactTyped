package typingsJapgolly.googleLibphonenumber.libphonenumber

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleLibphonenumber.libphonenumber.PhoneNumber.CountryCodeSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhoneNumber extends StObject {
  
  def clearCountryCode(): Unit
  
  def clearCountryCodeSource(): Unit
  
  def clearExtension(): Unit
  
  def clearItalianLeadingZero(): Unit
  
  def clearNationalNumber(): Unit
  
  def clearNumberOfLeadingZeros(): Unit
  
  def clearPreferredDomesticCarrierCode(): Unit
  
  def clearRawInput(): Unit
  
  def countryCodeCount(): Double
  
  def countryCodeSourceCount(): Double
  
  def extensionCount(): Double
  
  def getCountryCode(): js.UndefOr[Double]
  
  def getCountryCodeOrDefault(): Double
  
  def getCountryCodeSource(): js.UndefOr[CountryCodeSource]
  
  def getCountryCodeSourceOrDefault(): CountryCodeSource
  
  def getExtension(): js.UndefOr[String]
  
  def getExtensionOrDefault(): String
  
  def getItalianLeadingZero(): js.UndefOr[Boolean]
  
  def getItalianLeadingZeroOrDefault(): Boolean
  
  def getNationalNumber(): js.UndefOr[Double]
  
  def getNationalNumberOrDefault(): Double
  
  def getNumberOfLeadingZeros(): js.UndefOr[Double]
  
  def getNumberOfLeadingZerosOrDefault(): Double
  
  def getPreferredDomesticCarrierCode(): js.UndefOr[String]
  
  def getPreferredDomesticCarrierCodeOrDefault(): String
  
  def getRawInput(): js.UndefOr[String]
  
  def getRawInputOrDefault(): String
  
  def hasCountryCode(): Boolean
  
  def hasCountryCodeSource(): Boolean
  
  def hasExtension(): Boolean
  
  def hasItalianLeadingZero(): Boolean
  
  def hasNationalNumber(): Boolean
  
  def hasNumberOfLeadingZeros(): Boolean
  
  def hasPreferredDomesticCarrierCode(): Boolean
  
  def hasRawInput(): Boolean
  
  def italianLeadingZeroCount(): Double
  
  def nationalNumberCount(): Double
  
  def numberOfLeadingZerosCount(): Double
  
  def preferredDomesticCarrierCodeCount(): Double
  
  def rawInputCount(): Double
  
  def setCountryCode(value: Double): Unit
  
  def setCountryCodeSource(value: CountryCodeSource): Unit
  
  def setExtension(value: String): Unit
  
  def setItalianLeadingZero(value: Boolean): Unit
  
  def setNationalNumber(value: Double): Double
  
  def setNumberOfLeadingZeros(value: Double): Unit
  
  def setPreferredDomesticCarrierCode(value: String): Unit
  
  def setRawInput(value: String): Unit
}
object PhoneNumber {
  
  inline def apply(
    clearCountryCode: Callback,
    clearCountryCodeSource: Callback,
    clearExtension: Callback,
    clearItalianLeadingZero: Callback,
    clearNationalNumber: Callback,
    clearNumberOfLeadingZeros: Callback,
    clearPreferredDomesticCarrierCode: Callback,
    clearRawInput: Callback,
    countryCodeCount: CallbackTo[Double],
    countryCodeSourceCount: CallbackTo[Double],
    extensionCount: CallbackTo[Double],
    getCountryCode: CallbackTo[js.UndefOr[Double]],
    getCountryCodeOrDefault: CallbackTo[Double],
    getCountryCodeSource: CallbackTo[js.UndefOr[CountryCodeSource]],
    getCountryCodeSourceOrDefault: CallbackTo[CountryCodeSource],
    getExtension: CallbackTo[js.UndefOr[String]],
    getExtensionOrDefault: CallbackTo[String],
    getItalianLeadingZero: CallbackTo[js.UndefOr[Boolean]],
    getItalianLeadingZeroOrDefault: CallbackTo[Boolean],
    getNationalNumber: CallbackTo[js.UndefOr[Double]],
    getNationalNumberOrDefault: CallbackTo[Double],
    getNumberOfLeadingZeros: CallbackTo[js.UndefOr[Double]],
    getNumberOfLeadingZerosOrDefault: CallbackTo[Double],
    getPreferredDomesticCarrierCode: CallbackTo[js.UndefOr[String]],
    getPreferredDomesticCarrierCodeOrDefault: CallbackTo[String],
    getRawInput: CallbackTo[js.UndefOr[String]],
    getRawInputOrDefault: CallbackTo[String],
    hasCountryCode: CallbackTo[Boolean],
    hasCountryCodeSource: CallbackTo[Boolean],
    hasExtension: CallbackTo[Boolean],
    hasItalianLeadingZero: CallbackTo[Boolean],
    hasNationalNumber: CallbackTo[Boolean],
    hasNumberOfLeadingZeros: CallbackTo[Boolean],
    hasPreferredDomesticCarrierCode: CallbackTo[Boolean],
    hasRawInput: CallbackTo[Boolean],
    italianLeadingZeroCount: CallbackTo[Double],
    nationalNumberCount: CallbackTo[Double],
    numberOfLeadingZerosCount: CallbackTo[Double],
    preferredDomesticCarrierCodeCount: CallbackTo[Double],
    rawInputCount: CallbackTo[Double],
    setCountryCode: Double => Callback,
    setCountryCodeSource: CountryCodeSource => Callback,
    setExtension: String => Callback,
    setItalianLeadingZero: Boolean => Callback,
    setNationalNumber: Double => Double,
    setNumberOfLeadingZeros: Double => Callback,
    setPreferredDomesticCarrierCode: String => Callback,
    setRawInput: String => Callback
  ): PhoneNumber = {
    val __obj = js.Dynamic.literal(clearCountryCode = clearCountryCode.toJsFn, clearCountryCodeSource = clearCountryCodeSource.toJsFn, clearExtension = clearExtension.toJsFn, clearItalianLeadingZero = clearItalianLeadingZero.toJsFn, clearNationalNumber = clearNationalNumber.toJsFn, clearNumberOfLeadingZeros = clearNumberOfLeadingZeros.toJsFn, clearPreferredDomesticCarrierCode = clearPreferredDomesticCarrierCode.toJsFn, clearRawInput = clearRawInput.toJsFn, countryCodeCount = countryCodeCount.toJsFn, countryCodeSourceCount = countryCodeSourceCount.toJsFn, extensionCount = extensionCount.toJsFn, getCountryCode = getCountryCode.toJsFn, getCountryCodeOrDefault = getCountryCodeOrDefault.toJsFn, getCountryCodeSource = getCountryCodeSource.toJsFn, getCountryCodeSourceOrDefault = getCountryCodeSourceOrDefault.toJsFn, getExtension = getExtension.toJsFn, getExtensionOrDefault = getExtensionOrDefault.toJsFn, getItalianLeadingZero = getItalianLeadingZero.toJsFn, getItalianLeadingZeroOrDefault = getItalianLeadingZeroOrDefault.toJsFn, getNationalNumber = getNationalNumber.toJsFn, getNationalNumberOrDefault = getNationalNumberOrDefault.toJsFn, getNumberOfLeadingZeros = getNumberOfLeadingZeros.toJsFn, getNumberOfLeadingZerosOrDefault = getNumberOfLeadingZerosOrDefault.toJsFn, getPreferredDomesticCarrierCode = getPreferredDomesticCarrierCode.toJsFn, getPreferredDomesticCarrierCodeOrDefault = getPreferredDomesticCarrierCodeOrDefault.toJsFn, getRawInput = getRawInput.toJsFn, getRawInputOrDefault = getRawInputOrDefault.toJsFn, hasCountryCode = hasCountryCode.toJsFn, hasCountryCodeSource = hasCountryCodeSource.toJsFn, hasExtension = hasExtension.toJsFn, hasItalianLeadingZero = hasItalianLeadingZero.toJsFn, hasNationalNumber = hasNationalNumber.toJsFn, hasNumberOfLeadingZeros = hasNumberOfLeadingZeros.toJsFn, hasPreferredDomesticCarrierCode = hasPreferredDomesticCarrierCode.toJsFn, hasRawInput = hasRawInput.toJsFn, italianLeadingZeroCount = italianLeadingZeroCount.toJsFn, nationalNumberCount = nationalNumberCount.toJsFn, numberOfLeadingZerosCount = numberOfLeadingZerosCount.toJsFn, preferredDomesticCarrierCodeCount = preferredDomesticCarrierCodeCount.toJsFn, rawInputCount = rawInputCount.toJsFn, setCountryCode = js.Any.fromFunction1((t0: Double) => setCountryCode(t0).runNow()), setCountryCodeSource = js.Any.fromFunction1((t0: CountryCodeSource) => setCountryCodeSource(t0).runNow()), setExtension = js.Any.fromFunction1((t0: String) => setExtension(t0).runNow()), setItalianLeadingZero = js.Any.fromFunction1((t0: Boolean) => setItalianLeadingZero(t0).runNow()), setNationalNumber = js.Any.fromFunction1(setNationalNumber), setNumberOfLeadingZeros = js.Any.fromFunction1((t0: Double) => setNumberOfLeadingZeros(t0).runNow()), setPreferredDomesticCarrierCode = js.Any.fromFunction1((t0: String) => setPreferredDomesticCarrierCode(t0).runNow()), setRawInput = js.Any.fromFunction1((t0: String) => setRawInput(t0).runNow()))
    __obj.asInstanceOf[PhoneNumber]
  }
  
  @js.native
  sealed trait CountryCodeSource extends StObject
  @JSGlobal("libphonenumber.PhoneNumber.CountryCodeSource")
  @js.native
  object CountryCodeSource extends StObject {
    
    @js.native
    sealed trait FROM_DEFAULT_COUNTRY
      extends StObject
         with CountryCodeSource
    
    @js.native
    sealed trait FROM_NUMBER_WITHOUT_PLUS_SIGN
      extends StObject
         with CountryCodeSource
    
    @js.native
    sealed trait FROM_NUMBER_WITH_IDD
      extends StObject
         with CountryCodeSource
    
    @js.native
    sealed trait FROM_NUMBER_WITH_PLUS_SIGN
      extends StObject
         with CountryCodeSource
  }
  
  extension [Self <: PhoneNumber](x: Self) {
    
    inline def setClearCountryCode(value: Callback): Self = StObject.set(x, "clearCountryCode", value.toJsFn)
    
    inline def setClearCountryCodeSource(value: Callback): Self = StObject.set(x, "clearCountryCodeSource", value.toJsFn)
    
    inline def setClearExtension(value: Callback): Self = StObject.set(x, "clearExtension", value.toJsFn)
    
    inline def setClearItalianLeadingZero(value: Callback): Self = StObject.set(x, "clearItalianLeadingZero", value.toJsFn)
    
    inline def setClearNationalNumber(value: Callback): Self = StObject.set(x, "clearNationalNumber", value.toJsFn)
    
    inline def setClearNumberOfLeadingZeros(value: Callback): Self = StObject.set(x, "clearNumberOfLeadingZeros", value.toJsFn)
    
    inline def setClearPreferredDomesticCarrierCode(value: Callback): Self = StObject.set(x, "clearPreferredDomesticCarrierCode", value.toJsFn)
    
    inline def setClearRawInput(value: Callback): Self = StObject.set(x, "clearRawInput", value.toJsFn)
    
    inline def setCountryCodeCount(value: CallbackTo[Double]): Self = StObject.set(x, "countryCodeCount", value.toJsFn)
    
    inline def setCountryCodeSourceCount(value: CallbackTo[Double]): Self = StObject.set(x, "countryCodeSourceCount", value.toJsFn)
    
    inline def setExtensionCount(value: CallbackTo[Double]): Self = StObject.set(x, "extensionCount", value.toJsFn)
    
    inline def setGetCountryCode(value: CallbackTo[js.UndefOr[Double]]): Self = StObject.set(x, "getCountryCode", value.toJsFn)
    
    inline def setGetCountryCodeOrDefault(value: CallbackTo[Double]): Self = StObject.set(x, "getCountryCodeOrDefault", value.toJsFn)
    
    inline def setGetCountryCodeSource(value: CallbackTo[js.UndefOr[CountryCodeSource]]): Self = StObject.set(x, "getCountryCodeSource", value.toJsFn)
    
    inline def setGetCountryCodeSourceOrDefault(value: CallbackTo[CountryCodeSource]): Self = StObject.set(x, "getCountryCodeSourceOrDefault", value.toJsFn)
    
    inline def setGetExtension(value: CallbackTo[js.UndefOr[String]]): Self = StObject.set(x, "getExtension", value.toJsFn)
    
    inline def setGetExtensionOrDefault(value: CallbackTo[String]): Self = StObject.set(x, "getExtensionOrDefault", value.toJsFn)
    
    inline def setGetItalianLeadingZero(value: CallbackTo[js.UndefOr[Boolean]]): Self = StObject.set(x, "getItalianLeadingZero", value.toJsFn)
    
    inline def setGetItalianLeadingZeroOrDefault(value: CallbackTo[Boolean]): Self = StObject.set(x, "getItalianLeadingZeroOrDefault", value.toJsFn)
    
    inline def setGetNationalNumber(value: CallbackTo[js.UndefOr[Double]]): Self = StObject.set(x, "getNationalNumber", value.toJsFn)
    
    inline def setGetNationalNumberOrDefault(value: CallbackTo[Double]): Self = StObject.set(x, "getNationalNumberOrDefault", value.toJsFn)
    
    inline def setGetNumberOfLeadingZeros(value: CallbackTo[js.UndefOr[Double]]): Self = StObject.set(x, "getNumberOfLeadingZeros", value.toJsFn)
    
    inline def setGetNumberOfLeadingZerosOrDefault(value: CallbackTo[Double]): Self = StObject.set(x, "getNumberOfLeadingZerosOrDefault", value.toJsFn)
    
    inline def setGetPreferredDomesticCarrierCode(value: CallbackTo[js.UndefOr[String]]): Self = StObject.set(x, "getPreferredDomesticCarrierCode", value.toJsFn)
    
    inline def setGetPreferredDomesticCarrierCodeOrDefault(value: CallbackTo[String]): Self = StObject.set(x, "getPreferredDomesticCarrierCodeOrDefault", value.toJsFn)
    
    inline def setGetRawInput(value: CallbackTo[js.UndefOr[String]]): Self = StObject.set(x, "getRawInput", value.toJsFn)
    
    inline def setGetRawInputOrDefault(value: CallbackTo[String]): Self = StObject.set(x, "getRawInputOrDefault", value.toJsFn)
    
    inline def setHasCountryCode(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasCountryCode", value.toJsFn)
    
    inline def setHasCountryCodeSource(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasCountryCodeSource", value.toJsFn)
    
    inline def setHasExtension(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasExtension", value.toJsFn)
    
    inline def setHasItalianLeadingZero(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasItalianLeadingZero", value.toJsFn)
    
    inline def setHasNationalNumber(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasNationalNumber", value.toJsFn)
    
    inline def setHasNumberOfLeadingZeros(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasNumberOfLeadingZeros", value.toJsFn)
    
    inline def setHasPreferredDomesticCarrierCode(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasPreferredDomesticCarrierCode", value.toJsFn)
    
    inline def setHasRawInput(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasRawInput", value.toJsFn)
    
    inline def setItalianLeadingZeroCount(value: CallbackTo[Double]): Self = StObject.set(x, "italianLeadingZeroCount", value.toJsFn)
    
    inline def setNationalNumberCount(value: CallbackTo[Double]): Self = StObject.set(x, "nationalNumberCount", value.toJsFn)
    
    inline def setNumberOfLeadingZerosCount(value: CallbackTo[Double]): Self = StObject.set(x, "numberOfLeadingZerosCount", value.toJsFn)
    
    inline def setPreferredDomesticCarrierCodeCount(value: CallbackTo[Double]): Self = StObject.set(x, "preferredDomesticCarrierCodeCount", value.toJsFn)
    
    inline def setRawInputCount(value: CallbackTo[Double]): Self = StObject.set(x, "rawInputCount", value.toJsFn)
    
    inline def setSetCountryCode(value: Double => Callback): Self = StObject.set(x, "setCountryCode", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetCountryCodeSource(value: CountryCodeSource => Callback): Self = StObject.set(x, "setCountryCodeSource", js.Any.fromFunction1((t0: CountryCodeSource) => value(t0).runNow()))
    
    inline def setSetExtension(value: String => Callback): Self = StObject.set(x, "setExtension", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetItalianLeadingZero(value: Boolean => Callback): Self = StObject.set(x, "setItalianLeadingZero", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetNationalNumber(value: Double => Double): Self = StObject.set(x, "setNationalNumber", js.Any.fromFunction1(value))
    
    inline def setSetNumberOfLeadingZeros(value: Double => Callback): Self = StObject.set(x, "setNumberOfLeadingZeros", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetPreferredDomesticCarrierCode(value: String => Callback): Self = StObject.set(x, "setPreferredDomesticCarrierCode", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetRawInput(value: String => Callback): Self = StObject.set(x, "setRawInput", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
