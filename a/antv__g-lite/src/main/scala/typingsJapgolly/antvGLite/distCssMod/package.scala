package typingsJapgolly.antvGLite.distCssMod

import typingsJapgolly.antvGLite.anon.AbsolutePath
import typingsJapgolly.antvGLite.anon.Points
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
import typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.BaseType.kAngle
import typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.BaseType.kLength
import typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.BaseType.kPercent
import typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.BaseType.kTime
import typingsJapgolly.antvGLite.distCssCssomTypesMod.UnitType.kDegrees
import typingsJapgolly.antvGLite.distCssCssomTypesMod.UnitType.kNumber
import typingsJapgolly.antvGLite.distCssCssomTypesMod.UnitType.kPercentage
import typingsJapgolly.antvGLite.distCssCssomTypesMod.UnitType.kPixels
import typingsJapgolly.antvGLite.distCssCssomTypesMod.UnitType.kSeconds
import typingsJapgolly.antvGLite.distCssCssomTypesMod.UnitType.kUnknown
import typingsJapgolly.antvGLite.distCssInterfacesMod.PropertyMetadata
import typingsJapgolly.antvGLite.distCssMod.^
import typingsJapgolly.antvGLite.distCssParserColorMod.Pattern
import typingsJapgolly.antvGLite.distCssParserFilterMod.ParsedFilterStyleProperty
import typingsJapgolly.antvGLite.distCssParserTransformMod.ParsedTransform
import typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject
import typingsJapgolly.antvGLite.distDomInterfacesMod.IElement
import typingsJapgolly.antvUtil.libPathTypesMod.CurveArray
import typingsJapgolly.antvUtil.libPathTypesMod.PathArray
import typingsJapgolly.manaSyringe.mod.Syringe.DefinedToken
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def BUILT_IN_PROPERTIES: js.Array[PropertyMetadata] = ^.asInstanceOf[js.Dynamic].selectDynamic("BUILT_IN_PROPERTIES").asInstanceOf[js.Array[PropertyMetadata]]

inline def CSSProperty: DefinedToken = ^.asInstanceOf[js.Dynamic].selectDynamic("CSSProperty").asInstanceOf[DefinedToken]

inline def CSSPropertySyntaxFactory: DefinedToken = ^.asInstanceOf[js.Dynamic].selectDynamic("CSSPropertySyntaxFactory").asInstanceOf[DefinedToken]

inline def LayoutRegistry: DefinedToken = ^.asInstanceOf[js.Dynamic].selectDynamic("LayoutRegistry").asInstanceOf[DefinedToken]

inline def Odeg: typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSUnitValue = ^.asInstanceOf[js.Dynamic].selectDynamic("Odeg").asInstanceOf[typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSUnitValue]

inline def Opx: typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSUnitValue = ^.asInstanceOf[js.Dynamic].selectDynamic("Opx").asInstanceOf[typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSUnitValue]

inline def StyleValueRegistry: DefinedToken = ^.asInstanceOf[js.Dynamic].selectDynamic("StyleValueRegistry").asInstanceOf[DefinedToken]

inline def baseTypeToString(baseType: typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.BaseType): length | angle | time | frequency | resolution | flex | percent | _empty = ^.asInstanceOf[js.Dynamic].applyDynamic("baseTypeToString")(baseType.asInstanceOf[js.Any]).asInstanceOf[length | angle | time | frequency | resolution | flex | percent | _empty]

inline def canonicalUnitTypeForCategory(category: typingsJapgolly.antvGLite.distCssCssomTypesMod.UnitCategory): kUnknown | kNumber | kPercentage | kPixels | kDegrees | kSeconds = ^.asInstanceOf[js.Dynamic].applyDynamic("canonicalUnitTypeForCategory")(category.asInstanceOf[js.Any]).asInstanceOf[kUnknown | kNumber | kPercentage | kPixels | kDegrees | kSeconds]

inline def clampedMergeNumbers(min: Double, max: Double): js.Function2[
/* left */ Double, 
/* right */ Double, 
js.Tuple3[Double, Double, js.Function1[/* i */ Double, String]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("clampedMergeNumbers")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
/* left */ Double, 
/* right */ Double, 
js.Tuple3[Double, Double, js.Function1[/* i */ Double, String]]]]

inline def composeMatrix(translate: Any, scale: Any, skew: Any, quat: Any, perspective: Any): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("composeMatrix")(translate.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], skew.asInstanceOf[js.Any], quat.asInstanceOf[js.Any], perspective.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]

inline def conversionToCanonicalUnitsScaleFactor(unit_type: typingsJapgolly.antvGLite.distCssCssomTypesMod.UnitType): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("conversionToCanonicalUnitsScaleFactor")(unit_type.asInstanceOf[js.Any]).asInstanceOf[Double]

inline def convertAngleUnit(value: typingsJapgolly.antvGLite.distCssCssomMod.CSSUnitValue): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("convertAngleUnit")(value.asInstanceOf[js.Any]).asInstanceOf[Double]

inline def convertItemToMatrix(item: ParsedTransform): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertItemToMatrix")(item.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]

inline def convertPercentUnit(
  valueWithUnit: typingsJapgolly.antvGLite.distCssCssomMod.CSSUnitValue,
  vec3Index: Double,
  target: DisplayObject[Any, Any]
): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("convertPercentUnit")(valueWithUnit.asInstanceOf[js.Any], vec3Index.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def getOrCreateKeyword(name: String): typingsJapgolly.antvGLite.distCssCssomMod.CSSKeywordValue = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrCreateKeyword")(name.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.antvGLite.distCssCssomMod.CSSKeywordValue]

inline def inheritKeywordValue: typingsJapgolly.antvGLite.distCssCssomMod.CSSKeywordValue = ^.asInstanceOf[js.Dynamic].selectDynamic("inheritKeywordValue").asInstanceOf[typingsJapgolly.antvGLite.distCssCssomMod.CSSKeywordValue]

inline def initialKeywordValue: typingsJapgolly.antvGLite.distCssCssomMod.CSSKeywordValue = ^.asInstanceOf[js.Dynamic].selectDynamic("initialKeywordValue").asInstanceOf[typingsJapgolly.antvGLite.distCssCssomMod.CSSKeywordValue]

inline def isPattern(`object`: Any): /* is @antv/g-lite.@antv/g-lite/dist/css/parser/color.Pattern */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPattern")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is @antv/g-lite.@antv/g-lite/dist/css/parser/color.Pattern */ Boolean]

inline def mergeColors(
  left: js.Array[typingsJapgolly.antvGLite.distCssCssomMod.CSSGradientValue],
  right: js.Array[typingsJapgolly.antvGLite.distCssCssomMod.CSSGradientValue]
): js.UndefOr[
js.Tuple3[
  js.Array[Double], 
  js.Array[Double], 
  js.Function1[/* color */ js.Array[Double], String]
]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeColors")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
js.Tuple3[
  js.Array[Double], 
  js.Array[Double], 
  js.Function1[/* color */ js.Array[Double], String]
]]]
inline def mergeColors(
  left: js.Array[typingsJapgolly.antvGLite.distCssCssomMod.CSSGradientValue],
  right: typingsJapgolly.antvGLite.distCssCssomMod.CSSRGB
): js.UndefOr[
js.Tuple3[
  js.Array[Double], 
  js.Array[Double], 
  js.Function1[/* color */ js.Array[Double], String]
]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeColors")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
js.Tuple3[
  js.Array[Double], 
  js.Array[Double], 
  js.Function1[/* color */ js.Array[Double], String]
]]]
inline def mergeColors(left: js.Array[typingsJapgolly.antvGLite.distCssCssomMod.CSSGradientValue], right: Pattern): js.UndefOr[
js.Tuple3[
  js.Array[Double], 
  js.Array[Double], 
  js.Function1[/* color */ js.Array[Double], String]
]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeColors")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
js.Tuple3[
  js.Array[Double], 
  js.Array[Double], 
  js.Function1[/* color */ js.Array[Double], String]
]]]
inline def mergeColors(
  left: typingsJapgolly.antvGLite.distCssCssomMod.CSSRGB,
  right: js.Array[typingsJapgolly.antvGLite.distCssCssomMod.CSSGradientValue]
): js.UndefOr[
js.Tuple3[
  js.Array[Double], 
  js.Array[Double], 
  js.Function1[/* color */ js.Array[Double], String]
]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeColors")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
js.Tuple3[
  js.Array[Double], 
  js.Array[Double], 
  js.Function1[/* color */ js.Array[Double], String]
]]]
inline def mergeColors(
  left: typingsJapgolly.antvGLite.distCssCssomMod.CSSRGB,
  right: typingsJapgolly.antvGLite.distCssCssomMod.CSSRGB
): js.UndefOr[
js.Tuple3[
  js.Array[Double], 
  js.Array[Double], 
  js.Function1[/* color */ js.Array[Double], String]
]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeColors")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
js.Tuple3[
  js.Array[Double], 
  js.Array[Double], 
  js.Function1[/* color */ js.Array[Double], String]
]]]
inline def mergeColors(left: typingsJapgolly.antvGLite.distCssCssomMod.CSSRGB, right: Pattern): js.UndefOr[
js.Tuple3[
  js.Array[Double], 
  js.Array[Double], 
  js.Function1[/* color */ js.Array[Double], String]
]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeColors")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
js.Tuple3[
  js.Array[Double], 
  js.Array[Double], 
  js.Function1[/* color */ js.Array[Double], String]
]]]
inline def mergeColors(left: Pattern, right: js.Array[typingsJapgolly.antvGLite.distCssCssomMod.CSSGradientValue]): js.UndefOr[
js.Tuple3[
  js.Array[Double], 
  js.Array[Double], 
  js.Function1[/* color */ js.Array[Double], String]
]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeColors")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
js.Tuple3[
  js.Array[Double], 
  js.Array[Double], 
  js.Function1[/* color */ js.Array[Double], String]
]]]
inline def mergeColors(left: Pattern, right: typingsJapgolly.antvGLite.distCssCssomMod.CSSRGB): js.UndefOr[
js.Tuple3[
  js.Array[Double], 
  js.Array[Double], 
  js.Function1[/* color */ js.Array[Double], String]
]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeColors")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
js.Tuple3[
  js.Array[Double], 
  js.Array[Double], 
  js.Function1[/* color */ js.Array[Double], String]
]]]
inline def mergeColors(left: Pattern, right: Pattern): js.UndefOr[
js.Tuple3[
  js.Array[Double], 
  js.Array[Double], 
  js.Function1[/* color */ js.Array[Double], String]
]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeColors")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
js.Tuple3[
  js.Array[Double], 
  js.Array[Double], 
  js.Function1[/* color */ js.Array[Double], String]
]]]

inline def mergeDimensions(
  left: typingsJapgolly.antvGLite.distCssCssomMod.CSSUnitValue,
  right: typingsJapgolly.antvGLite.distCssCssomMod.CSSUnitValue,
  target: IElement[Any, Any]
): js.Tuple3[Double, Double, js.Function1[/* value */ Double, String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeDimensions")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[Double, Double, js.Function1[/* value */ Double, String]]]
inline def mergeDimensions(
  left: typingsJapgolly.antvGLite.distCssCssomMod.CSSUnitValue,
  right: typingsJapgolly.antvGLite.distCssCssomMod.CSSUnitValue,
  target: IElement[Any, Any],
  nonNegative: Boolean
): js.Tuple3[Double, Double, js.Function1[/* value */ Double, String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeDimensions")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], target.asInstanceOf[js.Any], nonNegative.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[Double, Double, js.Function1[/* value */ Double, String]]]
inline def mergeDimensions(
  left: typingsJapgolly.antvGLite.distCssCssomMod.CSSUnitValue,
  right: typingsJapgolly.antvGLite.distCssCssomMod.CSSUnitValue,
  target: IElement[Any, Any],
  nonNegative: Boolean,
  index: Double
): js.Tuple3[Double, Double, js.Function1[/* value */ Double, String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeDimensions")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], target.asInstanceOf[js.Any], nonNegative.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[Double, Double, js.Function1[/* value */ Double, String]]]
inline def mergeDimensions(
  left: typingsJapgolly.antvGLite.distCssCssomMod.CSSUnitValue,
  right: typingsJapgolly.antvGLite.distCssCssomMod.CSSUnitValue,
  target: IElement[Any, Any],
  nonNegative: Unit,
  index: Double
): js.Tuple3[Double, Double, js.Function1[/* value */ Double, String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeDimensions")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], target.asInstanceOf[js.Any], nonNegative.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[Double, Double, js.Function1[/* value */ Double, String]]]

inline def mergeNumberLists(left: js.Array[Double], right: js.Array[Double]): js.UndefOr[
js.Tuple3[
  js.Array[Double], 
  js.Array[Double], 
  js.Function1[/* numberList */ js.Array[Double], js.Array[Double]]
]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeNumberLists")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
js.Tuple3[
  js.Array[Double], 
  js.Array[Double], 
  js.Function1[/* numberList */ js.Array[Double], js.Array[Double]]
]]]

inline def mergeNumbers(left: Double, right: Double): js.Tuple3[Double, Double, js.Function1[/* n */ Double, String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeNumbers")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[Double, Double, js.Function1[/* n */ Double, String]]]

inline def mergePaths(left: AbsolutePath, right: AbsolutePath, `object`: IElement[Any, Any]): js.Tuple3[CurveArray, CurveArray, js.Function1[/* b */ CurveArray, CurveArray]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergePaths")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[CurveArray, CurveArray, js.Function1[/* b */ CurveArray, CurveArray]]]

inline def mergeTransforms(left: js.Array[ParsedTransform], right: js.Array[ParsedTransform]): js.Tuple3[
js.Array[js.Array[Double]], 
js.Array[js.Array[Double]], 
js.Function1[/* d */ js.Array[js.Array[Double]], String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeTransforms")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
js.Array[js.Array[Double]], 
js.Array[js.Array[Double]], 
js.Function1[/* d */ js.Array[js.Array[Double]], String]]]
inline def mergeTransforms(left: js.Array[ParsedTransform], right: js.Array[ParsedTransform], target: DisplayObject[Any, Any]): js.Tuple3[
js.Array[js.Array[Double]], 
js.Array[js.Array[Double]], 
js.Function1[/* d */ js.Array[js.Array[Double]], String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeTransforms")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
js.Array[js.Array[Double]], 
js.Array[js.Array[Double]], 
js.Function1[/* d */ js.Array[js.Array[Double]], String]]]

inline def noneColor: typingsJapgolly.antvGLite.distCssCssomMod.CSSRGB = ^.asInstanceOf[js.Dynamic].selectDynamic("noneColor").asInstanceOf[typingsJapgolly.antvGLite.distCssCssomMod.CSSRGB]

inline def numberToString(x: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("numberToString")(x.asInstanceOf[js.Any]).asInstanceOf[String]

inline def parseDimension(unitRegExp: js.RegExp, string: String): js.UndefOr[typingsJapgolly.antvGLite.distCssCssomMod.CSSStyleValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseDimension")(unitRegExp.asInstanceOf[js.Any], string.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typingsJapgolly.antvGLite.distCssCssomMod.CSSStyleValue]]

inline def parseDimensionArray(string: String): js.Array[typingsJapgolly.antvGLite.distCssCssomMod.CSSUnitValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDimensionArray")(string.asInstanceOf[js.Any]).asInstanceOf[js.Array[typingsJapgolly.antvGLite.distCssCssomMod.CSSUnitValue]]
inline def parseDimensionArray(string: js.Array[String | Double]): js.Array[typingsJapgolly.antvGLite.distCssCssomMod.CSSUnitValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDimensionArray")(string.asInstanceOf[js.Any]).asInstanceOf[js.Array[typingsJapgolly.antvGLite.distCssCssomMod.CSSUnitValue]]

inline def parseFilter(): js.Array[ParsedFilterStyleProperty] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFilter")().asInstanceOf[js.Array[ParsedFilterStyleProperty]]
inline def parseFilter(filterStr: String): js.Array[ParsedFilterStyleProperty] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFilter")(filterStr.asInstanceOf[js.Any]).asInstanceOf[js.Array[ParsedFilterStyleProperty]]

inline def parseParam(css: String): typingsJapgolly.antvGLite.distCssCssomMod.CSSStyleValue = ^.asInstanceOf[js.Dynamic].applyDynamic("parseParam")(css.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.antvGLite.distCssCssomMod.CSSStyleValue]

inline def parsePath(path: String, `object`: DisplayObject[Any, Any]): AbsolutePath = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePath")(path.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[AbsolutePath]
inline def parsePath(path: PathArray, `object`: DisplayObject[Any, Any]): AbsolutePath = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePath")(path.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[AbsolutePath]

inline def parsePoints(pointsOrStr: String, `object`: typingsJapgolly.antvGLite.mod.DisplayObject[Any, Any]): Points = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePoints")(pointsOrStr.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Points]
inline def parsePoints(
  pointsOrStr: js.Array[js.Tuple2[Double, Double]],
  `object`: typingsJapgolly.antvGLite.mod.DisplayObject[Any, Any]
): Points = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePoints")(pointsOrStr.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Points]

inline def parseTransform(string: String): js.Array[ParsedTransform] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseTransform")(string.asInstanceOf[js.Any]).asInstanceOf[js.Array[ParsedTransform]]

inline def propertyMetadataCache: Record[String, PropertyMetadata] = ^.asInstanceOf[js.Dynamic].selectDynamic("propertyMetadataCache").asInstanceOf[Record[String, PropertyMetadata]]

inline def toCanonicalUnit(unit: typingsJapgolly.antvGLite.distCssCssomTypesMod.UnitType): kUnknown | kNumber | kPercentage | kPixels | kDegrees | kSeconds = ^.asInstanceOf[js.Dynamic].applyDynamic("toCanonicalUnit")(unit.asInstanceOf[js.Any]).asInstanceOf[kUnknown | kNumber | kPercentage | kPixels | kDegrees | kSeconds]

inline def transparentColor: typingsJapgolly.antvGLite.distCssCssomMod.CSSRGB = ^.asInstanceOf[js.Dynamic].selectDynamic("transparentColor").asInstanceOf[typingsJapgolly.antvGLite.distCssCssomMod.CSSRGB]

inline def typeCheck(
  values: js.Array[typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValue],
  op: js.Function,
  error: Boolean
): typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValueType = (^.asInstanceOf[js.Dynamic].applyDynamic("typeCheck")(values.asInstanceOf[js.Any], op.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValueType]

inline def unitFromName(name: String): typingsJapgolly.antvGLite.distCssCssomTypesMod.UnitType = ^.asInstanceOf[js.Dynamic].applyDynamic("unitFromName")(name.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.antvGLite.distCssCssomTypesMod.UnitType]

inline def unitTypeToBaseType(unit: typingsJapgolly.antvGLite.distCssCssomTypesMod.UnitType): kLength | kAngle | kTime | kPercent = ^.asInstanceOf[js.Dynamic].applyDynamic("unitTypeToBaseType")(unit.asInstanceOf[js.Any]).asInstanceOf[kLength | kAngle | kTime | kPercent]

inline def unitTypeToString(`type`: typingsJapgolly.antvGLite.distCssCssomTypesMod.UnitType): em | px | deg | rad | grad | ms | s | rem | turn | _empty | Percentsign = ^.asInstanceOf[js.Dynamic].applyDynamic("unitTypeToString")(`type`.asInstanceOf[js.Any]).asInstanceOf[em | px | deg | rad | grad | ms | s | rem | turn | _empty | Percentsign]

inline def unitTypeToUnitCategory(`type`: typingsJapgolly.antvGLite.distCssCssomTypesMod.UnitType): typingsJapgolly.antvGLite.distCssCssomTypesMod.UnitCategory = ^.asInstanceOf[js.Dynamic].applyDynamic("unitTypeToUnitCategory")(`type`.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.antvGLite.distCssCssomTypesMod.UnitCategory]

inline def unsetKeywordValue: typingsJapgolly.antvGLite.distCssCssomMod.CSSKeywordValue = ^.asInstanceOf[js.Dynamic].selectDynamic("unsetKeywordValue").asInstanceOf[typingsJapgolly.antvGLite.distCssCssomMod.CSSKeywordValue]
