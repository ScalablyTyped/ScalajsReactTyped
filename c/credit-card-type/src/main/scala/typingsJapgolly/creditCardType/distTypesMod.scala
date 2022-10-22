package typingsJapgolly.creditCardType

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.creditCardType.anon.Name
import typingsJapgolly.creditCardType.anon.Size
import typingsJapgolly.creditCardType.creditCardTypeStrings.discover_
import typingsJapgolly.creditCardType.creditCardTypeStrings.elo_
import typingsJapgolly.creditCardType.creditCardTypeStrings.hiper_
import typingsJapgolly.creditCardType.creditCardTypeStrings.hipercard_
import typingsJapgolly.creditCardType.creditCardTypeStrings.jcb_
import typingsJapgolly.creditCardType.creditCardTypeStrings.maestro_
import typingsJapgolly.creditCardType.creditCardTypeStrings.mastercard_
import typingsJapgolly.creditCardType.creditCardTypeStrings.mir_
import typingsJapgolly.creditCardType.creditCardTypeStrings.unionpay_
import typingsJapgolly.creditCardType.creditCardTypeStrings.visa_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  trait BuiltInCreditCardType
    extends StObject
       with CreditCardType {
    
    @JSName("code")
    var code_BuiltInCreditCardType: Size
    
    @JSName("niceType")
    var niceType_BuiltInCreditCardType: CreditCardTypeCardBrandNiceType
    
    @JSName("type")
    var type_BuiltInCreditCardType: CreditCardTypeCardBrandId
  }
  object BuiltInCreditCardType {
    
    inline def apply(
      code: Size,
      gaps: js.Array[Double],
      lengths: js.Array[Double],
      niceType: CreditCardTypeCardBrandNiceType,
      patterns: js.Array[js.Array[Double] | Double],
      `type`: CreditCardTypeCardBrandId
    ): BuiltInCreditCardType = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], gaps = gaps.asInstanceOf[js.Any], lengths = lengths.asInstanceOf[js.Any], niceType = niceType.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BuiltInCreditCardType]
    }
    
    extension [Self <: BuiltInCreditCardType](x: Self) {
      
      inline def setCode(value: Size): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setNiceType(value: CreditCardTypeCardBrandNiceType): Self = StObject.set(x, "niceType", value.asInstanceOf[js.Any])
      
      inline def setType(value: CreditCardTypeCardBrandId): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type CardCollection = StringDictionary[CreditCardType]
  
  trait CreditCardType extends StObject {
    
    var code: Name
    
    var gaps: js.Array[Double]
    
    var lengths: js.Array[Double]
    
    var matchStrength: js.UndefOr[Double] = js.undefined
    
    var niceType: String
    
    var patterns: js.Array[js.Array[Double] | Double]
    
    var `type`: String
  }
  object CreditCardType {
    
    inline def apply(
      code: Name,
      gaps: js.Array[Double],
      lengths: js.Array[Double],
      niceType: String,
      patterns: js.Array[js.Array[Double] | Double],
      `type`: String
    ): CreditCardType = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], gaps = gaps.asInstanceOf[js.Any], lengths = lengths.asInstanceOf[js.Any], niceType = niceType.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreditCardType]
    }
    
    extension [Self <: CreditCardType](x: Self) {
      
      inline def setCode(value: Name): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setGaps(value: js.Array[Double]): Self = StObject.set(x, "gaps", value.asInstanceOf[js.Any])
      
      inline def setGapsVarargs(value: Double*): Self = StObject.set(x, "gaps", js.Array(value*))
      
      inline def setLengths(value: js.Array[Double]): Self = StObject.set(x, "lengths", value.asInstanceOf[js.Any])
      
      inline def setLengthsVarargs(value: Double*): Self = StObject.set(x, "lengths", js.Array(value*))
      
      inline def setMatchStrength(value: Double): Self = StObject.set(x, "matchStrength", value.asInstanceOf[js.Any])
      
      inline def setMatchStrengthUndefined: Self = StObject.set(x, "matchStrength", js.undefined)
      
      inline def setNiceType(value: String): Self = StObject.set(x, "niceType", value.asInstanceOf[js.Any])
      
      inline def setPatterns(value: js.Array[js.Array[Double] | Double]): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
      
      inline def setPatternsVarargs(value: (js.Array[Double] | Double)*): Self = StObject.set(x, "patterns", js.Array(value*))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.creditCardType.creditCardTypeStrings.`american-express`
    - typingsJapgolly.creditCardType.creditCardTypeStrings.`diners-club`
    - typingsJapgolly.creditCardType.creditCardTypeStrings.discover_
    - typingsJapgolly.creditCardType.creditCardTypeStrings.elo_
    - typingsJapgolly.creditCardType.creditCardTypeStrings.hiper_
    - typingsJapgolly.creditCardType.creditCardTypeStrings.hipercard_
    - typingsJapgolly.creditCardType.creditCardTypeStrings.jcb_
    - typingsJapgolly.creditCardType.creditCardTypeStrings.maestro_
    - typingsJapgolly.creditCardType.creditCardTypeStrings.mastercard_
    - typingsJapgolly.creditCardType.creditCardTypeStrings.mir_
    - typingsJapgolly.creditCardType.creditCardTypeStrings.unionpay_
    - typingsJapgolly.creditCardType.creditCardTypeStrings.visa_
  */
  trait CreditCardTypeCardBrandId extends StObject
  object CreditCardTypeCardBrandId {
    
    inline def `american-express`: typingsJapgolly.creditCardType.creditCardTypeStrings.`american-express` = "american-express".asInstanceOf[typingsJapgolly.creditCardType.creditCardTypeStrings.`american-express`]
    
    inline def `diners-club`: typingsJapgolly.creditCardType.creditCardTypeStrings.`diners-club` = "diners-club".asInstanceOf[typingsJapgolly.creditCardType.creditCardTypeStrings.`diners-club`]
    
    inline def discover: discover_ = "discover".asInstanceOf[discover_]
    
    inline def elo: elo_ = "elo".asInstanceOf[elo_]
    
    inline def hiper: hiper_ = "hiper".asInstanceOf[hiper_]
    
    inline def hipercard: hipercard_ = "hipercard".asInstanceOf[hipercard_]
    
    inline def jcb: jcb_ = "jcb".asInstanceOf[jcb_]
    
    inline def maestro: maestro_ = "maestro".asInstanceOf[maestro_]
    
    inline def mastercard: mastercard_ = "mastercard".asInstanceOf[mastercard_]
    
    inline def mir: mir_ = "mir".asInstanceOf[mir_]
    
    inline def unionpay: unionpay_ = "unionpay".asInstanceOf[unionpay_]
    
    inline def visa: visa_ = "visa".asInstanceOf[visa_]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.creditCardType.creditCardTypeStrings.`American Express`
    - typingsJapgolly.creditCardType.creditCardTypeStrings.`Diners Club`
    - typingsJapgolly.creditCardType.creditCardTypeStrings.Discover
    - typingsJapgolly.creditCardType.creditCardTypeStrings.Elo
    - typingsJapgolly.creditCardType.creditCardTypeStrings.Hiper
    - typingsJapgolly.creditCardType.creditCardTypeStrings.Hipercard
    - typingsJapgolly.creditCardType.creditCardTypeStrings.JCB
    - typingsJapgolly.creditCardType.creditCardTypeStrings.Maestro
    - typingsJapgolly.creditCardType.creditCardTypeStrings.Mastercard
    - typingsJapgolly.creditCardType.creditCardTypeStrings.Mir
    - typingsJapgolly.creditCardType.creditCardTypeStrings.UnionPay
    - typingsJapgolly.creditCardType.creditCardTypeStrings.Visa
  */
  trait CreditCardTypeCardBrandNiceType extends StObject
  object CreditCardTypeCardBrandNiceType {
    
    inline def `American Express`: typingsJapgolly.creditCardType.creditCardTypeStrings.`American Express` = ("American Express").asInstanceOf[typingsJapgolly.creditCardType.creditCardTypeStrings.`American Express`]
    
    inline def `Diners Club`: typingsJapgolly.creditCardType.creditCardTypeStrings.`Diners Club` = ("Diners Club").asInstanceOf[typingsJapgolly.creditCardType.creditCardTypeStrings.`Diners Club`]
    
    inline def Discover: typingsJapgolly.creditCardType.creditCardTypeStrings.Discover = "Discover".asInstanceOf[typingsJapgolly.creditCardType.creditCardTypeStrings.Discover]
    
    inline def Elo: typingsJapgolly.creditCardType.creditCardTypeStrings.Elo = "Elo".asInstanceOf[typingsJapgolly.creditCardType.creditCardTypeStrings.Elo]
    
    inline def Hiper: typingsJapgolly.creditCardType.creditCardTypeStrings.Hiper = "Hiper".asInstanceOf[typingsJapgolly.creditCardType.creditCardTypeStrings.Hiper]
    
    inline def Hipercard: typingsJapgolly.creditCardType.creditCardTypeStrings.Hipercard = "Hipercard".asInstanceOf[typingsJapgolly.creditCardType.creditCardTypeStrings.Hipercard]
    
    inline def JCB: typingsJapgolly.creditCardType.creditCardTypeStrings.JCB = "JCB".asInstanceOf[typingsJapgolly.creditCardType.creditCardTypeStrings.JCB]
    
    inline def Maestro: typingsJapgolly.creditCardType.creditCardTypeStrings.Maestro = "Maestro".asInstanceOf[typingsJapgolly.creditCardType.creditCardTypeStrings.Maestro]
    
    inline def Mastercard: typingsJapgolly.creditCardType.creditCardTypeStrings.Mastercard = "Mastercard".asInstanceOf[typingsJapgolly.creditCardType.creditCardTypeStrings.Mastercard]
    
    inline def Mir: typingsJapgolly.creditCardType.creditCardTypeStrings.Mir = "Mir".asInstanceOf[typingsJapgolly.creditCardType.creditCardTypeStrings.Mir]
    
    inline def UnionPay: typingsJapgolly.creditCardType.creditCardTypeStrings.UnionPay = "UnionPay".asInstanceOf[typingsJapgolly.creditCardType.creditCardTypeStrings.UnionPay]
    
    inline def Visa: typingsJapgolly.creditCardType.creditCardTypeStrings.Visa = "Visa".asInstanceOf[typingsJapgolly.creditCardType.creditCardTypeStrings.Visa]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.creditCardType.creditCardTypeStrings.CVV
    - typingsJapgolly.creditCardType.creditCardTypeStrings.CVC
    - typingsJapgolly.creditCardType.creditCardTypeStrings.CID
    - typingsJapgolly.creditCardType.creditCardTypeStrings.CVN
    - typingsJapgolly.creditCardType.creditCardTypeStrings.CVE
    - typingsJapgolly.creditCardType.creditCardTypeStrings.CVP2
  */
  trait CreditCardTypeSecurityCodeLabel extends StObject
  object CreditCardTypeSecurityCodeLabel {
    
    inline def CID: typingsJapgolly.creditCardType.creditCardTypeStrings.CID = "CID".asInstanceOf[typingsJapgolly.creditCardType.creditCardTypeStrings.CID]
    
    inline def CVC: typingsJapgolly.creditCardType.creditCardTypeStrings.CVC = "CVC".asInstanceOf[typingsJapgolly.creditCardType.creditCardTypeStrings.CVC]
    
    inline def CVE: typingsJapgolly.creditCardType.creditCardTypeStrings.CVE = "CVE".asInstanceOf[typingsJapgolly.creditCardType.creditCardTypeStrings.CVE]
    
    inline def CVN: typingsJapgolly.creditCardType.creditCardTypeStrings.CVN = "CVN".asInstanceOf[typingsJapgolly.creditCardType.creditCardTypeStrings.CVN]
    
    inline def CVP2: typingsJapgolly.creditCardType.creditCardTypeStrings.CVP2 = "CVP2".asInstanceOf[typingsJapgolly.creditCardType.creditCardTypeStrings.CVP2]
    
    inline def CVV: typingsJapgolly.creditCardType.creditCardTypeStrings.CVV = "CVV".asInstanceOf[typingsJapgolly.creditCardType.creditCardTypeStrings.CVV]
  }
}
