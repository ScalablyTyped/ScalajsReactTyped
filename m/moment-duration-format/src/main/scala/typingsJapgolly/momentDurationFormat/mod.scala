package typingsJapgolly.momentDurationFormat

import typingsJapgolly.momentDurationFormat.anon.FnCall
import typingsJapgolly.momentDurationFormat.momentDurationFormatBooleans.`false`
import typingsJapgolly.momentDurationFormat.momentDurationFormatBooleans.`true`
import typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.m_
import typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.mm_
import typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.mmm_
import typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.s_
import typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.ss_
import typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.sss_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(_moment: FnCall): Unit = ^.asInstanceOf[js.Dynamic].apply(_moment.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("moment-duration-format", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* augmented module */
  object momentAugmentingMod {
    
    object duration {
      
      @JSImport("moment", "duration.fn")
      @js.native
      val fn: Duration_ = js.native
    }
    
    trait DurationFormatSettings extends StObject {
      
      var decimalSeparator: js.UndefOr[String] = js.undefined
      
      var forceLength: js.UndefOr[Boolean] = js.undefined
      
      var grouping: js.UndefOr[js.Array[Double]] = js.undefined
      
      var groupingSeparator: js.UndefOr[String] = js.undefined
      
      var largest: js.UndefOr[Double] = js.undefined
      
      var maxValue: js.UndefOr[Double] = js.undefined
      
      var minValue: js.UndefOr[Double] = js.undefined
      
      var precision: js.UndefOr[Double] = js.undefined
      
      var stopTrim: js.UndefOr[String] = js.undefined
      
      var template: js.UndefOr[String | TemplateFunction] = js.undefined
      
      var trim: js.UndefOr[`false` | UnitOfTrimV1 | UnitOfTrim | String | (js.Array[UnitOfTrim | String])] = js.undefined
      
      var trunc: js.UndefOr[`true`] = js.undefined
      
      var useGrouping: js.UndefOr[Boolean] = js.undefined
      
      var useLeftUnits: js.UndefOr[Boolean] = js.undefined
      
      var usePlural: js.UndefOr[Boolean] = js.undefined
      
      var useSignificantDigits: js.UndefOr[`true`] = js.undefined
      
      var useToLocaleString: js.UndefOr[Boolean] = js.undefined
      
      var userLocale: js.UndefOr[String] = js.undefined
    }
    object DurationFormatSettings {
      
      inline def apply(): DurationFormatSettings = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DurationFormatSettings]
      }
      
      extension [Self <: DurationFormatSettings](x: Self) {
        
        inline def setDecimalSeparator(value: String): Self = StObject.set(x, "decimalSeparator", value.asInstanceOf[js.Any])
        
        inline def setDecimalSeparatorUndefined: Self = StObject.set(x, "decimalSeparator", js.undefined)
        
        inline def setForceLength(value: Boolean): Self = StObject.set(x, "forceLength", value.asInstanceOf[js.Any])
        
        inline def setForceLengthUndefined: Self = StObject.set(x, "forceLength", js.undefined)
        
        inline def setGrouping(value: js.Array[Double]): Self = StObject.set(x, "grouping", value.asInstanceOf[js.Any])
        
        inline def setGroupingSeparator(value: String): Self = StObject.set(x, "groupingSeparator", value.asInstanceOf[js.Any])
        
        inline def setGroupingSeparatorUndefined: Self = StObject.set(x, "groupingSeparator", js.undefined)
        
        inline def setGroupingUndefined: Self = StObject.set(x, "grouping", js.undefined)
        
        inline def setGroupingVarargs(value: Double*): Self = StObject.set(x, "grouping", js.Array(value*))
        
        inline def setLargest(value: Double): Self = StObject.set(x, "largest", value.asInstanceOf[js.Any])
        
        inline def setLargestUndefined: Self = StObject.set(x, "largest", js.undefined)
        
        inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
        
        inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
        
        inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
        
        inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
        
        inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
        
        inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
        
        inline def setStopTrim(value: String): Self = StObject.set(x, "stopTrim", value.asInstanceOf[js.Any])
        
        inline def setStopTrimUndefined: Self = StObject.set(x, "stopTrim", js.undefined)
        
        inline def setTemplate(value: String | TemplateFunction): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
        
        inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
        
        inline def setTrim(value: `false` | UnitOfTrimV1 | UnitOfTrim | String | (js.Array[UnitOfTrim | String])): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
        
        inline def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
        
        inline def setTrimVarargs(value: (UnitOfTrim | String)*): Self = StObject.set(x, "trim", js.Array(value*))
        
        inline def setTrunc(value: `true`): Self = StObject.set(x, "trunc", value.asInstanceOf[js.Any])
        
        inline def setTruncUndefined: Self = StObject.set(x, "trunc", js.undefined)
        
        inline def setUseGrouping(value: Boolean): Self = StObject.set(x, "useGrouping", value.asInstanceOf[js.Any])
        
        inline def setUseGroupingUndefined: Self = StObject.set(x, "useGrouping", js.undefined)
        
        inline def setUseLeftUnits(value: Boolean): Self = StObject.set(x, "useLeftUnits", value.asInstanceOf[js.Any])
        
        inline def setUseLeftUnitsUndefined: Self = StObject.set(x, "useLeftUnits", js.undefined)
        
        inline def setUsePlural(value: Boolean): Self = StObject.set(x, "usePlural", value.asInstanceOf[js.Any])
        
        inline def setUsePluralUndefined: Self = StObject.set(x, "usePlural", js.undefined)
        
        inline def setUseSignificantDigits(value: `true`): Self = StObject.set(x, "useSignificantDigits", value.asInstanceOf[js.Any])
        
        inline def setUseSignificantDigitsUndefined: Self = StObject.set(x, "useSignificantDigits", js.undefined)
        
        inline def setUseToLocaleString(value: Boolean): Self = StObject.set(x, "useToLocaleString", value.asInstanceOf[js.Any])
        
        inline def setUseToLocaleStringUndefined: Self = StObject.set(x, "useToLocaleString", js.undefined)
        
        inline def setUserLocale(value: String): Self = StObject.set(x, "userLocale", value.asInstanceOf[js.Any])
        
        inline def setUserLocaleUndefined: Self = StObject.set(x, "userLocale", js.undefined)
      }
    }
    
    /* Inlined {[ duration in moment-duration-format.moment-duration-format.moment.DurationToken ]: string} */
    trait DurationLabelDef extends StObject {
      
      var M: String
      
      var MM: String
      
      var MMM: String
      
      var S: String
      
      var SS: String
      
      var SSS: String
      
      var d: String
      
      var dd: String
      
      var ddd: String
      
      var h: String
      
      var hh: String
      
      var hhh: String
      
      var m: String
      
      var mm: String
      
      var mmm: String
      
      var s: String
      
      var ss: String
      
      var sss: String
      
      var w: String
      
      var ww: String
      
      var www: String
      
      var y: String
      
      var yy: String
      
      var yyy: String
    }
    object DurationLabelDef {
      
      inline def apply(
        M: String,
        MM: String,
        MMM: String,
        S: String,
        SS: String,
        SSS: String,
        d: String,
        dd: String,
        ddd: String,
        h: String,
        hh: String,
        hhh: String,
        m: String,
        mm: String,
        mmm: String,
        s: String,
        ss: String,
        sss: String,
        w: String,
        ww: String,
        www: String,
        y: String,
        yy: String,
        yyy: String
      ): DurationLabelDef = {
        val __obj = js.Dynamic.literal(M = M.asInstanceOf[js.Any], MM = MM.asInstanceOf[js.Any], MMM = MMM.asInstanceOf[js.Any], S = S.asInstanceOf[js.Any], SS = SS.asInstanceOf[js.Any], SSS = SSS.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], dd = dd.asInstanceOf[js.Any], ddd = ddd.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], hh = hh.asInstanceOf[js.Any], hhh = hhh.asInstanceOf[js.Any], m = m.asInstanceOf[js.Any], mm = mm.asInstanceOf[js.Any], mmm = mmm.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], ss = ss.asInstanceOf[js.Any], sss = sss.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], ww = ww.asInstanceOf[js.Any], www = www.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yy = yy.asInstanceOf[js.Any], yyy = yyy.asInstanceOf[js.Any])
        __obj.asInstanceOf[DurationLabelDef]
      }
      
      extension [Self <: DurationLabelDef](x: Self) {
        
        inline def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
        
        inline def setDd(value: String): Self = StObject.set(x, "dd", value.asInstanceOf[js.Any])
        
        inline def setDdd(value: String): Self = StObject.set(x, "ddd", value.asInstanceOf[js.Any])
        
        inline def setH(value: String): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
        
        inline def setHh(value: String): Self = StObject.set(x, "hh", value.asInstanceOf[js.Any])
        
        inline def setHhh(value: String): Self = StObject.set(x, "hhh", value.asInstanceOf[js.Any])
        
        inline def setM(value: String): Self = StObject.set(x, "M", value.asInstanceOf[js.Any])
        
        inline def setMM(value: String): Self = StObject.set(x, "MM", value.asInstanceOf[js.Any])
        
        inline def setMMM(value: String): Self = StObject.set(x, "MMM", value.asInstanceOf[js.Any])
        
        inline def setS(value: String): Self = StObject.set(x, "S", value.asInstanceOf[js.Any])
        
        inline def setSS(value: String): Self = StObject.set(x, "SS", value.asInstanceOf[js.Any])
        
        inline def setSSS(value: String): Self = StObject.set(x, "SSS", value.asInstanceOf[js.Any])
        
        inline def setW(value: String): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
        
        inline def setWw(value: String): Self = StObject.set(x, "ww", value.asInstanceOf[js.Any])
        
        inline def setWww(value: String): Self = StObject.set(x, "www", value.asInstanceOf[js.Any])
        
        inline def setY(value: String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
        
        inline def setYy(value: String): Self = StObject.set(x, "yy", value.asInstanceOf[js.Any])
        
        inline def setYyy(value: String): Self = StObject.set(x, "yyy", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.long
      - typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.standard
      - typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.short
    */
    trait DurationLabelType extends StObject
    object DurationLabelType {
      
      inline def long: typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.long = "long".asInstanceOf[typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.long]
      
      inline def short: typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.short = "short".asInstanceOf[typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.short]
      
      inline def standard: typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.standard = "standard".asInstanceOf[typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.standard]
    }
    
    trait DurationLabelTypeDef extends StObject {
      
      var string: String
      
      var `type`: DurationLabelType
    }
    object DurationLabelTypeDef {
      
      inline def apply(string: String, `type`: DurationLabelType): DurationLabelTypeDef = {
        val __obj = js.Dynamic.literal(string = string.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[DurationLabelTypeDef]
      }
      
      extension [Self <: DurationLabelTypeDef](x: Self) {
        
        inline def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
        
        inline def setType(value: DurationLabelType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.HMS
      - typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.HM
      - typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.MS
    */
    trait DurationTemplate extends StObject
    object DurationTemplate {
      
      inline def HM: typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.HM = "HM".asInstanceOf[typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.HM]
      
      inline def HMS: typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.HMS = "HMS".asInstanceOf[typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.HMS]
      
      inline def MS: typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.MS = "MS".asInstanceOf[typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.MS]
    }
    
    /* Inlined {[ template in moment-duration-format.moment-duration-format.moment.DurationTemplate ]: string} */
    trait DurationTimeDef extends StObject {
      
      var HM: String
      
      var HMS: String
      
      var MS: String
    }
    object DurationTimeDef {
      
      inline def apply(HM: String, HMS: String, MS: String): DurationTimeDef = {
        val __obj = js.Dynamic.literal(HM = HM.asInstanceOf[js.Any], HMS = HMS.asInstanceOf[js.Any], MS = MS.asInstanceOf[js.Any])
        __obj.asInstanceOf[DurationTimeDef]
      }
      
      extension [Self <: DurationTimeDef](x: Self) {
        
        inline def setHM(value: String): Self = StObject.set(x, "HM", value.asInstanceOf[js.Any])
        
        inline def setHMS(value: String): Self = StObject.set(x, "HMS", value.asInstanceOf[js.Any])
        
        inline def setMS(value: String): Self = StObject.set(x, "MS", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.S
      - typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.SS
      - typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.SSS
      - typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.s_
      - typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.ss_
      - typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.sss_
      - typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.m_
      - typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.mm_
      - typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.mmm_
      - typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.h
      - typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.hh
      - typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.hhh
      - typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.d
      - typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.dd
      - typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.ddd
      - typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.w
      - typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.ww
      - typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.www
      - typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.M
      - typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.MM
      - typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.MMM
      - typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.y
      - typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.yy
      - typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.yyy
    */
    trait DurationToken extends StObject
    object DurationToken {
      
      inline def M: typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.M = "M".asInstanceOf[typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.M]
      
      inline def MM: typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.MM = "MM".asInstanceOf[typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.MM]
      
      inline def MMM: typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.MMM = "MMM".asInstanceOf[typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.MMM]
      
      inline def S: typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.S = "S".asInstanceOf[typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.S]
      
      inline def SS: typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.SS = "SS".asInstanceOf[typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.SS]
      
      inline def SSS: typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.SSS = "SSS".asInstanceOf[typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.SSS]
      
      inline def d: typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.d = "d".asInstanceOf[typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.d]
      
      inline def dd: typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.dd = "dd".asInstanceOf[typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.dd]
      
      inline def ddd: typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.ddd = "ddd".asInstanceOf[typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.ddd]
      
      inline def h: typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.h = "h".asInstanceOf[typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.h]
      
      inline def hh: typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.hh = "hh".asInstanceOf[typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.hh]
      
      inline def hhh: typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.hhh = "hhh".asInstanceOf[typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.hhh]
      
      inline def m: m_ = "m".asInstanceOf[m_]
      
      inline def mm: mm_ = "mm".asInstanceOf[mm_]
      
      inline def mmm: mmm_ = "mmm".asInstanceOf[mmm_]
      
      inline def s: s_ = "s".asInstanceOf[s_]
      
      inline def ss: ss_ = "ss".asInstanceOf[ss_]
      
      inline def sss: sss_ = "sss".asInstanceOf[sss_]
      
      inline def w: typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.w = "w".asInstanceOf[typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.w]
      
      inline def ww: typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.ww = "ww".asInstanceOf[typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.ww]
      
      inline def www: typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.www = "www".asInstanceOf[typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.www]
      
      inline def y: typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.y = "y".asInstanceOf[typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.y]
      
      inline def yy: typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.yy = "yy".asInstanceOf[typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.yy]
      
      inline def yyy: typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.yyy = "yyy".asInstanceOf[typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.yyy]
    }
    
    trait Duration_ extends StObject {
      
      def format(): String
      def format(settings: DurationFormatSettings): String
      def format(template: String): String
      def format(template: String, precision: Double): String
      def format(template: String, precision: Double, settings: DurationFormatSettings): String
      def format(template: String, settings: DurationFormatSettings): String
      def format(template: TemplateFunction): String
      def format(template: TemplateFunction, precision: Double): String
      def format(template: TemplateFunction, precision: Double, settings: DurationFormatSettings): String
      def format(template: TemplateFunction, settings: DurationFormatSettings): String
      @JSName("format")
      var format_Original: Format
    }
    object Duration_ {
      
      inline def apply(format: Format): Duration_ = {
        val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
        __obj.asInstanceOf[Duration_]
      }
      
      extension [Self <: Duration_](x: Self) {
        
        inline def setFormat(value: Format): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Format extends StObject {
      
      def apply(): String = js.native
      def apply(settings: DurationFormatSettings): String = js.native
      def apply(template: String): String = js.native
      def apply(template: String, precision: Double): String = js.native
      def apply(template: String, precision: Double, settings: DurationFormatSettings): String = js.native
      def apply(template: String, settings: DurationFormatSettings): String = js.native
      def apply(template: TemplateFunction): String = js.native
      def apply(template: TemplateFunction, precision: Double): String = js.native
      def apply(template: TemplateFunction, precision: Double, settings: DurationFormatSettings): String = js.native
      def apply(template: TemplateFunction, settings: DurationFormatSettings): String = js.native
      
      var defaults: DurationFormatSettings = js.native
    }
    
    trait LocaleSpecification extends StObject {
      
      var durationLabelTypes: js.UndefOr[js.Array[DurationLabelTypeDef]] = js.undefined
      
      var durationLabelsLong: js.UndefOr[DurationLabelDef] = js.undefined
      
      var durationLabelsShort: js.UndefOr[DurationLabelDef] = js.undefined
      
      var durationLabelsStandard: js.UndefOr[DurationLabelDef] = js.undefined
      
      var durationPluralKey: js.UndefOr[
            js.Function3[/* token */ String, /* integerValue */ Double, /* decimalValue */ Double, String]
          ] = js.undefined
      
      var durationTimeTemplates: js.UndefOr[DurationTimeDef] = js.undefined
    }
    object LocaleSpecification {
      
      inline def apply(): LocaleSpecification = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LocaleSpecification]
      }
      
      extension [Self <: LocaleSpecification](x: Self) {
        
        inline def setDurationLabelTypes(value: js.Array[DurationLabelTypeDef]): Self = StObject.set(x, "durationLabelTypes", value.asInstanceOf[js.Any])
        
        inline def setDurationLabelTypesUndefined: Self = StObject.set(x, "durationLabelTypes", js.undefined)
        
        inline def setDurationLabelTypesVarargs(value: DurationLabelTypeDef*): Self = StObject.set(x, "durationLabelTypes", js.Array(value*))
        
        inline def setDurationLabelsLong(value: DurationLabelDef): Self = StObject.set(x, "durationLabelsLong", value.asInstanceOf[js.Any])
        
        inline def setDurationLabelsLongUndefined: Self = StObject.set(x, "durationLabelsLong", js.undefined)
        
        inline def setDurationLabelsShort(value: DurationLabelDef): Self = StObject.set(x, "durationLabelsShort", value.asInstanceOf[js.Any])
        
        inline def setDurationLabelsShortUndefined: Self = StObject.set(x, "durationLabelsShort", js.undefined)
        
        inline def setDurationLabelsStandard(value: DurationLabelDef): Self = StObject.set(x, "durationLabelsStandard", value.asInstanceOf[js.Any])
        
        inline def setDurationLabelsStandardUndefined: Self = StObject.set(x, "durationLabelsStandard", js.undefined)
        
        inline def setDurationPluralKey(value: (/* token */ String, /* integerValue */ Double, /* decimalValue */ Double) => String): Self = StObject.set(x, "durationPluralKey", js.Any.fromFunction3(value))
        
        inline def setDurationPluralKeyUndefined: Self = StObject.set(x, "durationPluralKey", js.undefined)
        
        inline def setDurationTimeTemplates(value: DurationTimeDef): Self = StObject.set(x, "durationTimeTemplates", value.asInstanceOf[js.Any])
        
        inline def setDurationTimeTemplatesUndefined: Self = StObject.set(x, "durationTimeTemplates", js.undefined)
      }
    }
    
    type TemplateFunction = js.ThisFunction0[/* this */ DurationFormatSettings, String]
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.large
      - typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.small
      - typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.both
      - typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.mid
      - typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.all
      - typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.`final`
    */
    trait UnitOfTrim extends StObject
    object UnitOfTrim {
      
      inline def all: typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.all = "all".asInstanceOf[typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.all]
      
      inline def both: typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.both = "both".asInstanceOf[typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.both]
      
      inline def `final`: typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.`final` = "final".asInstanceOf[typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.`final`]
      
      inline def large: typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.large = "large".asInstanceOf[typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.large]
      
      inline def mid: typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.mid = "mid".asInstanceOf[typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.mid]
      
      inline def small: typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.small = "small".asInstanceOf[typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.small]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.left
      - typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.right
    */
    trait UnitOfTrimV1 extends StObject
    object UnitOfTrimV1 {
      
      inline def left: typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.left = "left".asInstanceOf[typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.left]
      
      inline def right: typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.right = "right".asInstanceOf[typingsJapgolly.momentDurationFormat.momentDurationFormatStrings.right]
    }
  }
}
