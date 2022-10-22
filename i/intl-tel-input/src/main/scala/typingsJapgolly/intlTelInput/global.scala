package typingsJapgolly.intlTelInput

import org.scalajs.dom.Element
import typingsJapgolly.intlTelInput.mod.Options
import typingsJapgolly.intlTelInput.mod.Plugin
import typingsJapgolly.intlTelInput.mod.global.intlTelInputUtils.numberFormat
import typingsJapgolly.intlTelInput.mod.global.intlTelInputUtils.numberType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object intlTelInput {
    
    /**
      * initialise the plugin with optional options.
      * @param options options that can be provided during initialization.
      */
    inline def apply(node: Element): Plugin = ^.asInstanceOf[js.Dynamic].apply(node.asInstanceOf[js.Any]).asInstanceOf[Plugin]
    inline def apply(node: Element, options: Options): Plugin = (^.asInstanceOf[js.Dynamic].apply(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Plugin]
    
    @JSGlobal("intlTelInput")
    @js.native
    val ^ : js.Any = js.native
    
    object global {
      
      object intlTelInputUtils {
        
        @JSGlobal("intlTelInputUtils")
        @js.native
        val ^ : js.Any = js.native
        
        inline def formatNumber(number: String, countryCode: String, format: numberFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatNumber")(number.asInstanceOf[js.Any], countryCode.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
        
        inline def getExampleNumber(countryCode: String, isNational: Boolean, numberType: numberType): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getExampleNumber")(countryCode.asInstanceOf[js.Any], isNational.asInstanceOf[js.Any], numberType.asInstanceOf[js.Any])).asInstanceOf[String]
        
        inline def getNumberType(number: String, countryCode: String): numberType = (^.asInstanceOf[js.Dynamic].applyDynamic("getNumberType")(number.asInstanceOf[js.Any], countryCode.asInstanceOf[js.Any])).asInstanceOf[numberType]
        
        inline def getValidationError(number: String, countryCode: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getValidationError")(number.asInstanceOf[js.Any], countryCode.asInstanceOf[js.Any])).asInstanceOf[String]
        
        inline def isValidNumber(number: String, countryCode: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidNumber")(number.asInstanceOf[js.Any], countryCode.asInstanceOf[js.Any])).asInstanceOf[String]
        
        @JSGlobal("intlTelInputUtils.numberFormat")
        @js.native
        object numberFormat extends StObject {
          
          @JSBracketAccess
          def apply(value: Double): js.UndefOr[typingsJapgolly.intlTelInput.mod.global.intlTelInputUtils.numberFormat & Double] = js.native
          
          /* 0 */ val E164: typingsJapgolly.intlTelInput.mod.global.intlTelInputUtils.numberFormat.E164 & Double = js.native
          
          /* 1 */ val INTERNATIONAL: typingsJapgolly.intlTelInput.mod.global.intlTelInputUtils.numberFormat.INTERNATIONAL & Double = js.native
          
          /* 2 */ val NATIONAL: typingsJapgolly.intlTelInput.mod.global.intlTelInputUtils.numberFormat.NATIONAL & Double = js.native
          
          /* 3 */ val RFC3966: typingsJapgolly.intlTelInput.mod.global.intlTelInputUtils.numberFormat.RFC3966 & Double = js.native
        }
        
        @JSGlobal("intlTelInputUtils.numberType")
        @js.native
        object numberType extends StObject {
          
          @JSBracketAccess
          def apply(value: Double): js.UndefOr[typingsJapgolly.intlTelInput.mod.global.intlTelInputUtils.numberType & Double] = js.native
          
          /* 0 */ val FIXED_LINE: typingsJapgolly.intlTelInput.mod.global.intlTelInputUtils.numberType.FIXED_LINE & Double = js.native
          
          /* 2 */ val FIXED_LINE_OR_MOBILE: typingsJapgolly.intlTelInput.mod.global.intlTelInputUtils.numberType.FIXED_LINE_OR_MOBILE & Double = js.native
          
          /* 1 */ val MOBILE: typingsJapgolly.intlTelInput.mod.global.intlTelInputUtils.numberType.MOBILE & Double = js.native
          
          /* 8 */ val PAGER: typingsJapgolly.intlTelInput.mod.global.intlTelInputUtils.numberType.PAGER & Double = js.native
          
          /* 7 */ val PERSONAL_NUMBER: typingsJapgolly.intlTelInput.mod.global.intlTelInputUtils.numberType.PERSONAL_NUMBER & Double = js.native
          
          /* 4 */ val PREMIUM_RATE: typingsJapgolly.intlTelInput.mod.global.intlTelInputUtils.numberType.PREMIUM_RATE & Double = js.native
          
          /* 5 */ val SHARED_COST: typingsJapgolly.intlTelInput.mod.global.intlTelInputUtils.numberType.SHARED_COST & Double = js.native
          
          /* 3 */ val TOLL_FREE: typingsJapgolly.intlTelInput.mod.global.intlTelInputUtils.numberType.TOLL_FREE & Double = js.native
          
          /* 9 */ val UAN: typingsJapgolly.intlTelInput.mod.global.intlTelInputUtils.numberType.UAN & Double = js.native
          
          /* -1 */ val UNKNOWN: typingsJapgolly.intlTelInput.mod.global.intlTelInputUtils.numberType.UNKNOWN & Double = js.native
          
          /* 10 */ val VOICEMAIL: typingsJapgolly.intlTelInput.mod.global.intlTelInputUtils.numberType.VOICEMAIL & Double = js.native
          
          /* 6 */ val VOIP: typingsJapgolly.intlTelInput.mod.global.intlTelInputUtils.numberType.VOIP & Double = js.native
        }
        
        @JSGlobal("intlTelInputUtils.validationError")
        @js.native
        object validationError extends StObject {
          
          @JSBracketAccess
          def apply(value: Double): js.UndefOr[
                    typingsJapgolly.intlTelInput.mod.global.intlTelInputUtils.validationError & Double
                  ] = js.native
          
          /* 1 */ val INVALID_COUNTRY_CODE: typingsJapgolly.intlTelInput.mod.global.intlTelInputUtils.validationError.INVALID_COUNTRY_CODE & Double = js.native
          
          /* 0 */ val IS_POSSIBLE: typingsJapgolly.intlTelInput.mod.global.intlTelInputUtils.validationError.IS_POSSIBLE & Double = js.native
          
          /* 4 */ val NOT_A_NUMBER: typingsJapgolly.intlTelInput.mod.global.intlTelInputUtils.validationError.NOT_A_NUMBER & Double = js.native
          
          /* 3 */ val TOO_LONG: typingsJapgolly.intlTelInput.mod.global.intlTelInputUtils.validationError.TOO_LONG & Double = js.native
          
          /* 2 */ val TOO_SHORT: typingsJapgolly.intlTelInput.mod.global.intlTelInputUtils.validationError.TOO_SHORT & Double = js.native
        }
      }
    }
    
    object intlTelInputUtils {
      
      @JSGlobal("intlTelInput.intlTelInputUtils.numberFormat")
      @js.native
      object numberFormat extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[typingsJapgolly.intlTelInput.mod.intlTelInputUtils.numberFormat & Double] = js.native
        
        /* 0 */ val E164: typingsJapgolly.intlTelInput.mod.intlTelInputUtils.numberFormat.E164 & Double = js.native
        
        /* 1 */ val INTERNATIONAL: typingsJapgolly.intlTelInput.mod.intlTelInputUtils.numberFormat.INTERNATIONAL & Double = js.native
        
        /* 2 */ val NATIONAL: typingsJapgolly.intlTelInput.mod.intlTelInputUtils.numberFormat.NATIONAL & Double = js.native
        
        /* 3 */ val RFC3966: typingsJapgolly.intlTelInput.mod.intlTelInputUtils.numberFormat.RFC3966 & Double = js.native
      }
      
      @JSGlobal("intlTelInput.intlTelInputUtils.numberType")
      @js.native
      object numberType extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[typingsJapgolly.intlTelInput.mod.intlTelInputUtils.numberType & Double] = js.native
        
        /* 0 */ val FIXED_LINE: typingsJapgolly.intlTelInput.mod.intlTelInputUtils.numberType.FIXED_LINE & Double = js.native
        
        /* 2 */ val FIXED_LINE_OR_MOBILE: typingsJapgolly.intlTelInput.mod.intlTelInputUtils.numberType.FIXED_LINE_OR_MOBILE & Double = js.native
        
        /* 1 */ val MOBILE: typingsJapgolly.intlTelInput.mod.intlTelInputUtils.numberType.MOBILE & Double = js.native
        
        /* 8 */ val PAGER: typingsJapgolly.intlTelInput.mod.intlTelInputUtils.numberType.PAGER & Double = js.native
        
        /* 7 */ val PERSONAL_NUMBER: typingsJapgolly.intlTelInput.mod.intlTelInputUtils.numberType.PERSONAL_NUMBER & Double = js.native
        
        /* 4 */ val PREMIUM_RATE: typingsJapgolly.intlTelInput.mod.intlTelInputUtils.numberType.PREMIUM_RATE & Double = js.native
        
        /* 5 */ val SHARED_COST: typingsJapgolly.intlTelInput.mod.intlTelInputUtils.numberType.SHARED_COST & Double = js.native
        
        /* 3 */ val TOLL_FREE: typingsJapgolly.intlTelInput.mod.intlTelInputUtils.numberType.TOLL_FREE & Double = js.native
        
        /* 9 */ val UAN: typingsJapgolly.intlTelInput.mod.intlTelInputUtils.numberType.UAN & Double = js.native
        
        /* -1 */ val UNKNOWN: typingsJapgolly.intlTelInput.mod.intlTelInputUtils.numberType.UNKNOWN & Double = js.native
        
        /* 10 */ val VOICEMAIL: typingsJapgolly.intlTelInput.mod.intlTelInputUtils.numberType.VOICEMAIL & Double = js.native
        
        /* 6 */ val VOIP: typingsJapgolly.intlTelInput.mod.intlTelInputUtils.numberType.VOIP & Double = js.native
      }
      
      @JSGlobal("intlTelInput.intlTelInputUtils.validationError")
      @js.native
      object validationError extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[typingsJapgolly.intlTelInput.mod.intlTelInputUtils.validationError & Double] = js.native
        
        /* 1 */ val INVALID_COUNTRY_CODE: typingsJapgolly.intlTelInput.mod.intlTelInputUtils.validationError.INVALID_COUNTRY_CODE & Double = js.native
        
        /* 0 */ val IS_POSSIBLE: typingsJapgolly.intlTelInput.mod.intlTelInputUtils.validationError.IS_POSSIBLE & Double = js.native
        
        /* 4 */ val NOT_A_NUMBER: typingsJapgolly.intlTelInput.mod.intlTelInputUtils.validationError.NOT_A_NUMBER & Double = js.native
        
        /* 3 */ val TOO_LONG: typingsJapgolly.intlTelInput.mod.intlTelInputUtils.validationError.TOO_LONG & Double = js.native
        
        /* 2 */ val TOO_SHORT: typingsJapgolly.intlTelInput.mod.intlTelInputUtils.validationError.TOO_SHORT & Double = js.native
      }
    }
  }
}
