package typingsJapgolly.formatjsEcma402Abstract

import typingsJapgolly.formatjsEcma402Abstract.anon.Cardinal
import typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.cardinal
import typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.ordinal
import typingsJapgolly.formatjsEcma402Abstract.libTypesCoreMod.LocaleData
import typingsJapgolly.formatjsEcma402Abstract.libTypesNumberMod.NumberFormatDigitInternalSlots
import typingsJapgolly.formatjsEcma402Abstract.libTypesNumberMod.NumberFormatRoundingType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesPluralRulesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.zero
    - typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.one
    - typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.two
    - typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.few
    - typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.many
    - typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.other
  */
  trait LDMLPluralRule extends StObject
  object LDMLPluralRule {
    
    inline def few: typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.few = "few".asInstanceOf[typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.few]
    
    inline def many: typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.many = "many".asInstanceOf[typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.many]
    
    inline def one: typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.one = "one".asInstanceOf[typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.one]
    
    inline def other: typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.other = "other".asInstanceOf[typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.other]
    
    inline def two: typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.two = "two".asInstanceOf[typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.two]
    
    inline def zero: typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.zero = "zero".asInstanceOf[typingsJapgolly.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.zero]
  }
  
  @js.native
  trait PluralRulesData extends StObject {
    
    var categories: Cardinal = js.native
    
    def fn(`val`: String): LDMLPluralRule = js.native
    def fn(`val`: String, ord: Boolean): LDMLPluralRule = js.native
    def fn(`val`: Double): LDMLPluralRule = js.native
    def fn(`val`: Double, ord: Boolean): LDMLPluralRule = js.native
  }
  
  trait PluralRulesInternal
    extends StObject
       with NumberFormatDigitInternalSlots {
    
    var initializedPluralRules: Boolean
    
    var locale: String
    
    var `type`: cardinal | ordinal
  }
  object PluralRulesInternal {
    
    inline def apply(
      initializedPluralRules: Boolean,
      locale: String,
      minimumIntegerDigits: Double,
      roundingType: NumberFormatRoundingType,
      `type`: cardinal | ordinal
    ): PluralRulesInternal = {
      val __obj = js.Dynamic.literal(initializedPluralRules = initializedPluralRules.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], minimumIntegerDigits = minimumIntegerDigits.asInstanceOf[js.Any], roundingType = roundingType.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PluralRulesInternal]
    }
    
    extension [Self <: PluralRulesInternal](x: Self) {
      
      inline def setInitializedPluralRules(value: Boolean): Self = StObject.set(x, "initializedPluralRules", value.asInstanceOf[js.Any])
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setType(value: cardinal | ordinal): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type PluralRulesLocaleData = LocaleData[PluralRulesData]
}
