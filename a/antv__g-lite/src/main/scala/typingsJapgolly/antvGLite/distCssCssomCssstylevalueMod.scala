package typingsJapgolly.antvGLite

import typingsJapgolly.antvGLite.antvGLiteStrings.Percentsign
import typingsJapgolly.antvGLite.antvGLiteStrings._empty
import typingsJapgolly.antvGLite.antvGLiteStrings.deg
import typingsJapgolly.antvGLite.antvGLiteStrings.em
import typingsJapgolly.antvGLite.antvGLiteStrings.grad
import typingsJapgolly.antvGLite.antvGLiteStrings.ms
import typingsJapgolly.antvGLite.antvGLiteStrings.px
import typingsJapgolly.antvGLite.antvGLiteStrings.rad
import typingsJapgolly.antvGLite.antvGLiteStrings.rem
import typingsJapgolly.antvGLite.antvGLiteStrings.s
import typingsJapgolly.antvGLite.antvGLiteStrings.turn
import typingsJapgolly.antvGLite.distCssCssomTypesMod.Nested
import typingsJapgolly.antvGLite.distCssCssomTypesMod.ParenLess
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

object distCssCssomCssstylevalueMod {
  
  @JSImport("@antv/g-lite/dist/css/cssom/CSSStyleValue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("@antv/g-lite/dist/css/cssom/CSSStyleValue", "CSSStyleValue")
  @js.native
  open class CSSStyleValue () extends StObject {
    
    def buildCSSText(n: Nested, p: ParenLess, result: String): String = js.native
    
    /* protected */ def getType(): CSSStyleValueType = js.native
    
    def isNumericValue(): Boolean = js.native
  }
  /* static members */
  object CSSStyleValue {
    
    @JSImport("@antv/g-lite/dist/css/cssom/CSSStyleValue", "CSSStyleValue")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isAngle(unit: UnitType): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAngle")(unit.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isLength(`type`: UnitType): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLength")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isRelativeUnit(`type`: UnitType): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRelativeUnit")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isTime(unit: UnitType): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTime")(unit.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @js.native
  sealed trait CSSStyleValueType extends StObject
  @JSImport("@antv/g-lite/dist/css/cssom/CSSStyleValue", "CSSStyleValueType")
  @js.native
  object CSSStyleValueType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[CSSStyleValueType & Double] = js.native
    
    @js.native
    sealed trait kClampType
      extends StObject
         with CSSStyleValueType
    /* 10 */ val kClampType: typingsJapgolly.antvGLite.distCssCssomCssstylevalueMod.CSSStyleValueType.kClampType & Double = js.native
    
    @js.native
    sealed trait kColorType
      extends StObject
         with CSSStyleValueType
    /* 14 */ val kColorType: typingsJapgolly.antvGLite.distCssCssomCssstylevalueMod.CSSStyleValueType.kColorType & Double = js.native
    
    @js.native
    sealed trait kInvertType
      extends StObject
         with CSSStyleValueType
    /* 7 */ val kInvertType: typingsJapgolly.antvGLite.distCssCssomCssstylevalueMod.CSSStyleValueType.kInvertType & Double = js.native
    
    @js.native
    sealed trait kKeywordType
      extends StObject
         with CSSStyleValueType
    /* 2 */ val kKeywordType: typingsJapgolly.antvGLite.distCssCssomCssstylevalueMod.CSSStyleValueType.kKeywordType & Double = js.native
    
    @js.native
    sealed trait kMaxType
      extends StObject
         with CSSStyleValueType
    /* 9 */ val kMaxType: typingsJapgolly.antvGLite.distCssCssomCssstylevalueMod.CSSStyleValueType.kMaxType & Double = js.native
    
    @js.native
    sealed trait kMinType
      extends StObject
         with CSSStyleValueType
    /* 8 */ val kMinType: typingsJapgolly.antvGLite.distCssCssomCssstylevalueMod.CSSStyleValueType.kMinType & Double = js.native
    
    @js.native
    sealed trait kNegateType
      extends StObject
         with CSSStyleValueType
    /* 6 */ val kNegateType: typingsJapgolly.antvGLite.distCssCssomCssstylevalueMod.CSSStyleValueType.kNegateType & Double = js.native
    
    @js.native
    sealed trait kPositionType
      extends StObject
         with CSSStyleValueType
    /* 12 */ val kPositionType: typingsJapgolly.antvGLite.distCssCssomCssstylevalueMod.CSSStyleValueType.kPositionType & Double = js.native
    
    @js.native
    sealed trait kProductType
      extends StObject
         with CSSStyleValueType
    /* 5 */ val kProductType: typingsJapgolly.antvGLite.distCssCssomCssstylevalueMod.CSSStyleValueType.kProductType & Double = js.native
    
    @js.native
    sealed trait kSumType
      extends StObject
         with CSSStyleValueType
    /* 4 */ val kSumType: typingsJapgolly.antvGLite.distCssCssomCssstylevalueMod.CSSStyleValueType.kSumType & Double = js.native
    
    @js.native
    sealed trait kTransformType
      extends StObject
         with CSSStyleValueType
    /* 11 */ val kTransformType: typingsJapgolly.antvGLite.distCssCssomCssstylevalueMod.CSSStyleValueType.kTransformType & Double = js.native
    
    @js.native
    sealed trait kURLImageType
      extends StObject
         with CSSStyleValueType
    /* 13 */ val kURLImageType: typingsJapgolly.antvGLite.distCssCssomCssstylevalueMod.CSSStyleValueType.kURLImageType & Double = js.native
    
    @js.native
    sealed trait kUnitType
      extends StObject
         with CSSStyleValueType
    /* 3 */ val kUnitType: typingsJapgolly.antvGLite.distCssCssomCssstylevalueMod.CSSStyleValueType.kUnitType & Double = js.native
    
    @js.native
    sealed trait kUnknownType
      extends StObject
         with CSSStyleValueType
    /* 0 */ val kUnknownType: typingsJapgolly.antvGLite.distCssCssomCssstylevalueMod.CSSStyleValueType.kUnknownType & Double = js.native
    
    @js.native
    sealed trait kUnparsedType
      extends StObject
         with CSSStyleValueType
    /* 1 */ val kUnparsedType: typingsJapgolly.antvGLite.distCssCssomCssstylevalueMod.CSSStyleValueType.kUnparsedType & Double = js.native
    
    @js.native
    sealed trait kUnsupportedColorType
      extends StObject
         with CSSStyleValueType
    /* 15 */ val kUnsupportedColorType: typingsJapgolly.antvGLite.distCssCssomCssstylevalueMod.CSSStyleValueType.kUnsupportedColorType & Double = js.native
  }
  
  inline def canonicalUnitTypeForCategory(category: UnitCategory): kUnknown | kNumber | kPercentage | kPixels | kDegrees | kSeconds = ^.asInstanceOf[js.Dynamic].applyDynamic("canonicalUnitTypeForCategory")(category.asInstanceOf[js.Any]).asInstanceOf[kUnknown | kNumber | kPercentage | kPixels | kDegrees | kSeconds]
  
  inline def conversionToCanonicalUnitsScaleFactor(unit_type: UnitType): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("conversionToCanonicalUnitsScaleFactor")(unit_type.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def unitFromName(name: String): UnitType = ^.asInstanceOf[js.Dynamic].applyDynamic("unitFromName")(name.asInstanceOf[js.Any]).asInstanceOf[UnitType]
  
  inline def unitTypeToString(`type`: UnitType): em | px | deg | rad | grad | ms | s | rem | turn | _empty | Percentsign = ^.asInstanceOf[js.Dynamic].applyDynamic("unitTypeToString")(`type`.asInstanceOf[js.Any]).asInstanceOf[em | px | deg | rad | grad | ms | s | rem | turn | _empty | Percentsign]
  
  inline def unitTypeToUnitCategory(`type`: UnitType): UnitCategory = ^.asInstanceOf[js.Dynamic].applyDynamic("unitTypeToUnitCategory")(`type`.asInstanceOf[js.Any]).asInstanceOf[UnitCategory]
}
