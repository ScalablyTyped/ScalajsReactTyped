package typingsJapgolly.antvGLite

import typingsJapgolly.antvGLite.antvGLiteStrings.Percentsign
import typingsJapgolly.antvGLite.antvGLiteStrings._empty
import typingsJapgolly.antvGLite.antvGLiteStrings.angle
import typingsJapgolly.antvGLite.antvGLiteStrings.deg
import typingsJapgolly.antvGLite.antvGLiteStrings.em
import typingsJapgolly.antvGLite.antvGLiteStrings.flex
import typingsJapgolly.antvGLite.antvGLiteStrings.frequency
import typingsJapgolly.antvGLite.antvGLiteStrings.grad
import typingsJapgolly.antvGLite.antvGLiteStrings.length
import typingsJapgolly.antvGLite.antvGLiteStrings.ms
import typingsJapgolly.antvGLite.antvGLiteStrings.percent
import typingsJapgolly.antvGLite.antvGLiteStrings.px
import typingsJapgolly.antvGLite.antvGLiteStrings.rad
import typingsJapgolly.antvGLite.antvGLiteStrings.rem
import typingsJapgolly.antvGLite.antvGLiteStrings.resolution
import typingsJapgolly.antvGLite.antvGLiteStrings.s
import typingsJapgolly.antvGLite.antvGLiteStrings.time
import typingsJapgolly.antvGLite.antvGLiteStrings.turn
import typingsJapgolly.antvGLite.distCssCssomCsscolorvalueMod.CSSColorPercent
import typingsJapgolly.antvGLite.distCssCssomCsscolorvalueMod.CSSColorRGBComp
import typingsJapgolly.antvGLite.distCssCssomCsscolorvalueMod.ColorSpace
import typingsJapgolly.antvGLite.distCssCssomCssgradientvalueMod.GradientType
import typingsJapgolly.antvGLite.distCssCssomCssgradientvalueMod.LinearGradient
import typingsJapgolly.antvGLite.distCssCssomCssgradientvalueMod.RadialGradient
import typingsJapgolly.antvGLite.distCssCssomCssnumericsumvalueMod.CSSNumericSumValue
import typingsJapgolly.antvGLite.distCssCssomCssnumericsumvalueMod.UnitMap
import typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.BaseType
import typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.BaseType.kAngle
import typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.BaseType.kLength
import typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.BaseType.kPercent
import typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.BaseType.kTime
import typingsJapgolly.antvGLite.distCssCssomTypesMod.UnitCategory
import typingsJapgolly.antvGLite.distCssCssomTypesMod.UnitType
import typingsJapgolly.antvGLite.distCssCssomTypesMod.UnitType.kDegrees
import typingsJapgolly.antvGLite.distCssCssomTypesMod.UnitType.kNumber
import typingsJapgolly.antvGLite.distCssCssomTypesMod.UnitType.kPercentage
import typingsJapgolly.antvGLite.distCssCssomTypesMod.UnitType.kPixels
import typingsJapgolly.antvGLite.distCssCssomTypesMod.UnitType.kSeconds
import typingsJapgolly.antvGLite.distCssCssomTypesMod.UnitType.kUnknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCssCssomMod {
  
  @JSImport("@antv/g-lite/dist/css/cssom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@antv/g-lite/dist/css/cssom", "BaseType")
  @js.native
  object BaseType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.BaseType & Double] = js.native
    
    /* 1 */ val kAngle: typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.BaseType.kAngle & Double = js.native
    
    /* 5 */ val kFlex: typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.BaseType.kFlex & Double = js.native
    
    /* 3 */ val kFrequency: typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.BaseType.kFrequency & Double = js.native
    
    /* 0 */ val kLength: typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.BaseType.kLength & Double = js.native
    
    /* 7 */ val kNumBaseTypes: typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.BaseType.kNumBaseTypes & Double = js.native
    
    /* 6 */ val kPercent: typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.BaseType.kPercent & Double = js.native
    
    /* 4 */ val kResolution: typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.BaseType.kResolution & Double = js.native
    
    /* 2 */ val kTime: typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.BaseType.kTime & Double = js.native
  }
  
  /* note: abstract class */ @JSImport("@antv/g-lite/dist/css/cssom", "CSSColorValue")
  @js.native
  open class CSSColorValue protected ()
    extends typingsJapgolly.antvGLite.distCssCssomCsscolorvalueMod.CSSColorValue {
    def this(colorSpace: ColorSpace) = this()
  }
  
  @JSImport("@antv/g-lite/dist/css/cssom", "CSSGradientValue")
  @js.native
  open class CSSGradientValue protected ()
    extends typingsJapgolly.antvGLite.distCssCssomCssgradientvalueMod.CSSGradientValue {
    def this(`type`: GradientType, value: LinearGradient) = this()
    def this(`type`: GradientType, value: RadialGradient) = this()
  }
  
  @JSImport("@antv/g-lite/dist/css/cssom", "CSSKeywordValue")
  @js.native
  open class CSSKeywordValue protected ()
    extends typingsJapgolly.antvGLite.distCssCssomCsskeywordvalueMod.CSSKeywordValue {
    def this(value: String) = this()
  }
  
  @JSImport("@antv/g-lite/dist/css/cssom", "CSSMathInvert")
  @js.native
  open class CSSMathInvert protected ()
    extends typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSMathInvert {
    def this(
      value: typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValue,
      `type`: typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValueType
    ) = this()
  }
  /* static members */
  object CSSMathInvert {
    
    @JSImport("@antv/g-lite/dist/css/cssom", "CSSMathInvert")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(value: typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValue): typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSMathInvert = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSMathInvert]
  }
  
  @JSImport("@antv/g-lite/dist/css/cssom", "CSSMathMax")
  @js.native
  open class CSSMathMax protected ()
    extends typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSMathMax {
    def this(
      values: js.Array[typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValue],
      `type`: typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValueType
    ) = this()
  }
  /* static members */
  object CSSMathMax {
    
    @JSImport("@antv/g-lite/dist/css/cssom", "CSSMathMax")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(values: js.Array[typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValue]): typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSMathMax = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(values.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSMathMax]
  }
  
  @JSImport("@antv/g-lite/dist/css/cssom", "CSSMathMin")
  @js.native
  open class CSSMathMin protected ()
    extends typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSMathMin {
    def this(
      values: js.Array[typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValue],
      `type`: typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValueType
    ) = this()
  }
  /* static members */
  object CSSMathMin {
    
    @JSImport("@antv/g-lite/dist/css/cssom", "CSSMathMin")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(values: js.Array[typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValue]): typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSMathMin = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(values.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSMathMin]
  }
  
  @JSImport("@antv/g-lite/dist/css/cssom", "CSSMathNegate")
  @js.native
  open class CSSMathNegate protected ()
    extends typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSMathNegate {
    def this(
      value: typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValue,
      `type`: typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValueType
    ) = this()
  }
  /* static members */
  object CSSMathNegate {
    
    @JSImport("@antv/g-lite/dist/css/cssom", "CSSMathNegate")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(value: typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValue): typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSMathNegate = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSMathNegate]
  }
  
  @JSImport("@antv/g-lite/dist/css/cssom", "CSSMathProduct")
  @js.native
  open class CSSMathProduct protected ()
    extends typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSMathProduct {
    def this(
      values: js.Array[typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValue],
      `type`: typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValueType
    ) = this()
  }
  /* static members */
  object CSSMathProduct {
    
    @JSImport("@antv/g-lite/dist/css/cssom", "CSSMathProduct")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(values: js.Array[typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValue]): typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSMathProduct = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(values.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSMathProduct]
    
    inline def multiplyUnitMaps(a: UnitMap, b: UnitMap): UnitMap = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyUnitMaps")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[UnitMap]
  }
  
  @JSImport("@antv/g-lite/dist/css/cssom", "CSSMathSum")
  @js.native
  open class CSSMathSum protected ()
    extends typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSMathSum {
    def this(
      values: js.Array[typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValue],
      `type`: typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValueType
    ) = this()
  }
  /* static members */
  object CSSMathSum {
    
    @JSImport("@antv/g-lite/dist/css/cssom", "CSSMathSum")
    @js.native
    val ^ : js.Any = js.native
    
    inline def canCreateNumericTypeFromSumValue(sum: CSSNumericSumValue): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canCreateNumericTypeFromSumValue")(sum.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def create(values: js.Array[typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValue]): typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSMathSum = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(values.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSMathSum]
    
    inline def numericTypeFromUnitMap(units: UnitMap): typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValueType = ^.asInstanceOf[js.Dynamic].applyDynamic("numericTypeFromUnitMap")(units.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValueType]
  }
  
  /* note: abstract class */ @JSImport("@antv/g-lite/dist/css/cssom", "CSSMathValue")
  @js.native
  open class CSSMathValue protected ()
    extends typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSMathValue {
    /**
      * @see https://chromium.googlesource.com/chromium/src/+/refs/heads/main/third_party/blink/renderer/core/css/cssom/css_numeric_value.cc#296
      */
    def this(type_ : typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValueType) = this()
  }
  
  /* note: abstract class */ @JSImport("@antv/g-lite/dist/css/cssom", "CSSMathVariadic")
  @js.native
  open class CSSMathVariadic protected ()
    extends typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSMathVariadic {
    def this(
      values: js.Array[typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValue],
      `type`: typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValueType
    ) = this()
  }
  
  /* note: abstract class */ @JSImport("@antv/g-lite/dist/css/cssom", "CSSNumericValue")
  @js.native
  open class CSSNumericValue protected ()
    extends typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValue {
    /**
      * @see https://chromium.googlesource.com/chromium/src/+/refs/heads/main/third_party/blink/renderer/core/css/cssom/css_numeric_value.cc#296
      */
    def this(type_ : typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValueType) = this()
  }
  /* static members */
  object CSSNumericValue {
    
    @JSImport("@antv/g-lite/dist/css/cssom", "CSSNumericValue")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isValidUnit(unit: UnitType): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidUnit")(unit.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @JSImport("@antv/g-lite/dist/css/cssom", "CSSNumericValueType")
  @js.native
  open class CSSNumericValueType ()
    extends typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValueType {
    def this(unit: UnitType) = this()
    def this(unit: Unit, exponent: Double) = this()
    def this(unit: UnitType, exponent: Double) = this()
  }
  /* static members */
  object CSSNumericValueType {
    
    @JSImport("@antv/g-lite/dist/css/cssom", "CSSNumericValueType")
    @js.native
    val ^ : js.Any = js.native
    
    inline def add(
      type1: typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValueType,
      type2: typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValueType,
      error: Boolean
    ): typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValueType = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(type1.asInstanceOf[js.Any], type2.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValueType]
    
    inline def multiply(
      type1: typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValueType,
      type2: typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValueType,
      error: Boolean
    ): typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValueType = (^.asInstanceOf[js.Dynamic].applyDynamic("multiply")(type1.asInstanceOf[js.Any], type2.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValueType]
    
    inline def negateExponents(`type`: typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValueType): typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValueType = ^.asInstanceOf[js.Dynamic].applyDynamic("negateExponents")(`type`.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValueType]
  }
  
  @JSImport("@antv/g-lite/dist/css/cssom", "CSSRGB")
  @js.native
  open class CSSRGB protected ()
    extends typingsJapgolly.antvGLite.distCssCssomCssrgbMod.CSSRGB {
    def this(r: CSSColorRGBComp, g: CSSColorRGBComp, b: CSSColorRGBComp) = this()
    def this(r: CSSColorRGBComp, g: CSSColorRGBComp, b: CSSColorRGBComp, alpha: CSSColorPercent) = this()
    def this(
      r: CSSColorRGBComp,
      g: CSSColorRGBComp,
      b: CSSColorRGBComp,
      alpha: Unit,
      /**
      * 'transparent' & 'none' has the same rgba data
      */
    isNone: Boolean
    ) = this()
    def this(
      r: CSSColorRGBComp,
      g: CSSColorRGBComp,
      b: CSSColorRGBComp,
      alpha: CSSColorPercent,
      /**
      * 'transparent' & 'none' has the same rgba data
      */
    isNone: Boolean
    ) = this()
  }
  
  /* note: abstract class */ @JSImport("@antv/g-lite/dist/css/cssom", "CSSStyleValue")
  @js.native
  open class CSSStyleValue ()
    extends typingsJapgolly.antvGLite.distCssCssomCssstylevalueMod.CSSStyleValue
  /* static members */
  object CSSStyleValue {
    
    @JSImport("@antv/g-lite/dist/css/cssom", "CSSStyleValue")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isAngle(unit: UnitType): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAngle")(unit.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isLength(`type`: UnitType): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLength")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isRelativeUnit(`type`: UnitType): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRelativeUnit")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isTime(unit: UnitType): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTime")(unit.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @JSImport("@antv/g-lite/dist/css/cssom", "CSSStyleValueType")
  @js.native
  object CSSStyleValueType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.antvGLite.distCssCssomCssstylevalueMod.CSSStyleValueType & Double
      ] = js.native
    
    /* 10 */ val kClampType: typingsJapgolly.antvGLite.distCssCssomCssstylevalueMod.CSSStyleValueType.kClampType & Double = js.native
    
    /* 14 */ val kColorType: typingsJapgolly.antvGLite.distCssCssomCssstylevalueMod.CSSStyleValueType.kColorType & Double = js.native
    
    /* 7 */ val kInvertType: typingsJapgolly.antvGLite.distCssCssomCssstylevalueMod.CSSStyleValueType.kInvertType & Double = js.native
    
    /* 2 */ val kKeywordType: typingsJapgolly.antvGLite.distCssCssomCssstylevalueMod.CSSStyleValueType.kKeywordType & Double = js.native
    
    /* 9 */ val kMaxType: typingsJapgolly.antvGLite.distCssCssomCssstylevalueMod.CSSStyleValueType.kMaxType & Double = js.native
    
    /* 8 */ val kMinType: typingsJapgolly.antvGLite.distCssCssomCssstylevalueMod.CSSStyleValueType.kMinType & Double = js.native
    
    /* 6 */ val kNegateType: typingsJapgolly.antvGLite.distCssCssomCssstylevalueMod.CSSStyleValueType.kNegateType & Double = js.native
    
    /* 12 */ val kPositionType: typingsJapgolly.antvGLite.distCssCssomCssstylevalueMod.CSSStyleValueType.kPositionType & Double = js.native
    
    /* 5 */ val kProductType: typingsJapgolly.antvGLite.distCssCssomCssstylevalueMod.CSSStyleValueType.kProductType & Double = js.native
    
    /* 4 */ val kSumType: typingsJapgolly.antvGLite.distCssCssomCssstylevalueMod.CSSStyleValueType.kSumType & Double = js.native
    
    /* 11 */ val kTransformType: typingsJapgolly.antvGLite.distCssCssomCssstylevalueMod.CSSStyleValueType.kTransformType & Double = js.native
    
    /* 13 */ val kURLImageType: typingsJapgolly.antvGLite.distCssCssomCssstylevalueMod.CSSStyleValueType.kURLImageType & Double = js.native
    
    /* 3 */ val kUnitType: typingsJapgolly.antvGLite.distCssCssomCssstylevalueMod.CSSStyleValueType.kUnitType & Double = js.native
    
    /* 0 */ val kUnknownType: typingsJapgolly.antvGLite.distCssCssomCssstylevalueMod.CSSStyleValueType.kUnknownType & Double = js.native
    
    /* 1 */ val kUnparsedType: typingsJapgolly.antvGLite.distCssCssomCssstylevalueMod.CSSStyleValueType.kUnparsedType & Double = js.native
    
    /* 15 */ val kUnsupportedColorType: typingsJapgolly.antvGLite.distCssCssomCssstylevalueMod.CSSStyleValueType.kUnsupportedColorType & Double = js.native
  }
  
  @JSImport("@antv/g-lite/dist/css/cssom", "CSSUnitValue")
  @js.native
  open class CSSUnitValue protected ()
    extends typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSUnitValue {
    def this(value: Double) = this()
    def this(value: Double, unitOrName: String) = this()
    def this(value: Double, unitOrName: UnitType) = this()
  }
  
  @JSImport("@antv/g-lite/dist/css/cssom", "GradientType")
  @js.native
  object GradientType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.antvGLite.distCssCssomCssgradientvalueMod.GradientType & Double] = js.native
    
    /* 0 */ val Constant: typingsJapgolly.antvGLite.distCssCssomCssgradientvalueMod.GradientType.Constant & Double = js.native
    
    /* 1 */ val LinearGradient: typingsJapgolly.antvGLite.distCssCssomCssgradientvalueMod.GradientType.LinearGradient & Double = js.native
    
    /* 2 */ val RadialGradient: typingsJapgolly.antvGLite.distCssCssomCssgradientvalueMod.GradientType.RadialGradient & Double = js.native
  }
  
  @JSImport("@antv/g-lite/dist/css/cssom", "Nested")
  @js.native
  object Nested extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.antvGLite.distCssCssomTypesMod.Nested & Double] = js.native
    
    /* 1 */ val kNo: typingsJapgolly.antvGLite.distCssCssomTypesMod.Nested.kNo & Double = js.native
    
    /* 0 */ val kYes: typingsJapgolly.antvGLite.distCssCssomTypesMod.Nested.kYes & Double = js.native
  }
  
  @JSImport("@antv/g-lite/dist/css/cssom", "Odeg")
  @js.native
  val Odeg: typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSUnitValue = js.native
  
  @JSImport("@antv/g-lite/dist/css/cssom", "Opx")
  @js.native
  val Opx: typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSUnitValue = js.native
  
  @JSImport("@antv/g-lite/dist/css/cssom", "ParenLess")
  @js.native
  object ParenLess extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.antvGLite.distCssCssomTypesMod.ParenLess & Double] = js.native
    
    /* 1 */ val kNo: typingsJapgolly.antvGLite.distCssCssomTypesMod.ParenLess.kNo & Double = js.native
    
    /* 0 */ val kYes: typingsJapgolly.antvGLite.distCssCssomTypesMod.ParenLess.kYes & Double = js.native
  }
  
  @JSImport("@antv/g-lite/dist/css/cssom", "UnitCategory")
  @js.native
  object UnitCategory extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.antvGLite.distCssCssomTypesMod.UnitCategory & Double] = js.native
    
    /* 3 */ val kUAngle: typingsJapgolly.antvGLite.distCssCssomTypesMod.UnitCategory.kUAngle & Double = js.native
    
    /* 2 */ val kULength: typingsJapgolly.antvGLite.distCssCssomTypesMod.UnitCategory.kULength & Double = js.native
    
    /* 0 */ val kUNumber: typingsJapgolly.antvGLite.distCssCssomTypesMod.UnitCategory.kUNumber & Double = js.native
    
    /* 5 */ val kUOther: typingsJapgolly.antvGLite.distCssCssomTypesMod.UnitCategory.kUOther & Double = js.native
    
    /* 1 */ val kUPercent: typingsJapgolly.antvGLite.distCssCssomTypesMod.UnitCategory.kUPercent & Double = js.native
    
    /* 4 */ val kUTime: typingsJapgolly.antvGLite.distCssCssomTypesMod.UnitCategory.kUTime & Double = js.native
  }
  
  @JSImport("@antv/g-lite/dist/css/cssom", "UnitType")
  @js.native
  object UnitType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.antvGLite.distCssCssomTypesMod.UnitType & Double] = js.native
    
    /* 6 */ val kDegrees: typingsJapgolly.antvGLite.distCssCssomTypesMod.UnitType.kDegrees & Double = js.native
    
    /* 3 */ val kEms: typingsJapgolly.antvGLite.distCssCssomTypesMod.UnitType.kEms & Double = js.native
    
    /* 8 */ val kGradians: typingsJapgolly.antvGLite.distCssCssomTypesMod.UnitType.kGradians & Double = js.native
    
    /* 12 */ val kInteger: typingsJapgolly.antvGLite.distCssCssomTypesMod.UnitType.kInteger & Double = js.native
    
    /* 10 */ val kMilliseconds: typingsJapgolly.antvGLite.distCssCssomTypesMod.UnitType.kMilliseconds & Double = js.native
    
    /* 1 */ val kNumber: typingsJapgolly.antvGLite.distCssCssomTypesMod.UnitType.kNumber & Double = js.native
    
    /* 2 */ val kPercentage: typingsJapgolly.antvGLite.distCssCssomTypesMod.UnitType.kPercentage & Double = js.native
    
    /* 4 */ val kPixels: typingsJapgolly.antvGLite.distCssCssomTypesMod.UnitType.kPixels & Double = js.native
    
    /* 7 */ val kRadians: typingsJapgolly.antvGLite.distCssCssomTypesMod.UnitType.kRadians & Double = js.native
    
    /* 5 */ val kRems: typingsJapgolly.antvGLite.distCssCssomTypesMod.UnitType.kRems & Double = js.native
    
    /* 11 */ val kSeconds: typingsJapgolly.antvGLite.distCssCssomTypesMod.UnitType.kSeconds & Double = js.native
    
    /* 9 */ val kTurns: typingsJapgolly.antvGLite.distCssCssomTypesMod.UnitType.kTurns & Double = js.native
    
    /* 0 */ val kUnknown: typingsJapgolly.antvGLite.distCssCssomTypesMod.UnitType.kUnknown & Double = js.native
  }
  
  @JSImport("@antv/g-lite/dist/css/cssom", "ValueRange")
  @js.native
  object ValueRange extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.antvGLite.distCssCssomTypesMod.ValueRange & Double] = js.native
    
    /* 0 */ val kAll: typingsJapgolly.antvGLite.distCssCssomTypesMod.ValueRange.kAll & Double = js.native
    
    /* 2 */ val kInteger: typingsJapgolly.antvGLite.distCssCssomTypesMod.ValueRange.kInteger & Double = js.native
    
    /* 1 */ val kNonNegative: typingsJapgolly.antvGLite.distCssCssomTypesMod.ValueRange.kNonNegative & Double = js.native
    
    /* 3 */ val kNonNegativeInteger: typingsJapgolly.antvGLite.distCssCssomTypesMod.ValueRange.kNonNegativeInteger & Double = js.native
    
    /* 4 */ val kPositiveInteger: typingsJapgolly.antvGLite.distCssCssomTypesMod.ValueRange.kPositiveInteger & Double = js.native
  }
  
  inline def baseTypeToString(baseType: BaseType): length | angle | time | frequency | resolution | flex | percent | _empty = ^.asInstanceOf[js.Dynamic].applyDynamic("baseTypeToString")(baseType.asInstanceOf[js.Any]).asInstanceOf[length | angle | time | frequency | resolution | flex | percent | _empty]
  
  inline def canonicalUnitTypeForCategory(category: UnitCategory): kUnknown | kNumber | kPercentage | kPixels | kDegrees | kSeconds = ^.asInstanceOf[js.Dynamic].applyDynamic("canonicalUnitTypeForCategory")(category.asInstanceOf[js.Any]).asInstanceOf[kUnknown | kNumber | kPercentage | kPixels | kDegrees | kSeconds]
  
  inline def conversionToCanonicalUnitsScaleFactor(unit_type: UnitType): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("conversionToCanonicalUnitsScaleFactor")(unit_type.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def toCanonicalUnit(unit: UnitType): kUnknown | kNumber | kPercentage | kPixels | kDegrees | kSeconds = ^.asInstanceOf[js.Dynamic].applyDynamic("toCanonicalUnit")(unit.asInstanceOf[js.Any]).asInstanceOf[kUnknown | kNumber | kPercentage | kPixels | kDegrees | kSeconds]
  
  inline def typeCheck(
    values: js.Array[typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValue],
    op: js.Function,
    error: Boolean
  ): typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValueType = (^.asInstanceOf[js.Dynamic].applyDynamic("typeCheck")(values.asInstanceOf[js.Any], op.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValueType]
  
  inline def unitFromName(name: String): UnitType = ^.asInstanceOf[js.Dynamic].applyDynamic("unitFromName")(name.asInstanceOf[js.Any]).asInstanceOf[UnitType]
  
  inline def unitTypeToBaseType(unit: UnitType): kLength | kAngle | kTime | kPercent = ^.asInstanceOf[js.Dynamic].applyDynamic("unitTypeToBaseType")(unit.asInstanceOf[js.Any]).asInstanceOf[kLength | kAngle | kTime | kPercent]
  
  inline def unitTypeToString(`type`: UnitType): em | px | deg | rad | grad | ms | s | rem | turn | _empty | Percentsign = ^.asInstanceOf[js.Dynamic].applyDynamic("unitTypeToString")(`type`.asInstanceOf[js.Any]).asInstanceOf[em | px | deg | rad | grad | ms | s | rem | turn | _empty | Percentsign]
  
  inline def unitTypeToUnitCategory(`type`: UnitType): UnitCategory = ^.asInstanceOf[js.Dynamic].applyDynamic("unitTypeToUnitCategory")(`type`.asInstanceOf[js.Any]).asInstanceOf[UnitCategory]
}
