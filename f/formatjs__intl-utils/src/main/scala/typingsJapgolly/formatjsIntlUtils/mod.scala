package typingsJapgolly.formatjsIntlUtils

import typingsJapgolly.formatjsIntlUtils.formatjsIntlUtilsStrings.boolean
import typingsJapgolly.formatjsIntlUtils.formatjsIntlUtilsStrings.string
import typingsJapgolly.formatjsIntlUtils.numberTypesMod.NumberFormatDigitInternalSlots
import typingsJapgolly.formatjsIntlUtils.numberTypesMod.NumberFormatDigitOptions
import typingsJapgolly.formatjsIntlUtils.polyfillUtilsMod.LiteralPart
import typingsJapgolly.formatjsIntlUtils.resolveLocaleMod.ResolveLocaleResult
import typingsJapgolly.formatjsIntlUtils.typesMod.LocaleData
import typingsJapgolly.std.Date
import typingsJapgolly.std.Exclude
import typingsJapgolly.std.NonNullable
import typingsJapgolly.std.Pick
import typingsJapgolly.std.Record
import typingsJapgolly.std.WeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@formatjs/intl-utils", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val SANCTIONED_UNITS: js.Array[String] = js.native
  def createResolveLocale[K /* <: String */, D /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in K ]: any}
    */ typingsJapgolly.formatjsIntlUtils.formatjsIntlUtilsStrings.createResolveLocale with js.Any */](getDefaultLocale: js.Function0[String]): js.Function5[
    /* availableLocales */ js.Array[String], 
    /* requestedLocales */ js.Array[String], 
    /* options */ AnonDictk, 
    /* relevantExtensionKeys */ js.Array[K], 
    /* localeData */ Record[String, D], 
    ResolveLocaleResult
  ] = js.native
  def defaultNumberOption(`val`: js.Any, min: Double, max: Double, fallback: Double): Double = js.native
  def getAliasesByLang(lang: String): Record[String, String] = js.native
  def getCanonicalLocales(): js.Array[String] = js.native
  def getCanonicalLocales(locales: String): js.Array[String] = js.native
  def getCanonicalLocales(locales: js.Array[String]): js.Array[String] = js.native
  def getInternalSlot[Instance /* <: js.Object */, Internal /* <: js.Object */, Field /* <: String */](map: WeakMap[Instance, Internal], pl: Instance, field: Field): /* import warning: importer.ImportType#apply Failed type conversion: Internal[Field] */ js.Any = js.native
  def getLocaleHierarchy(locale: String, aliases: Record[String, String], parentLocales: Record[String, String]): js.Array[String] = js.native
  def getMultiInternalSlots[Instance /* <: js.Object */, Internal /* <: js.Object */, Field /* <: String */](map: WeakMap[Instance, Internal], pl: Instance, fields: Field*): Pick[Internal, Field] = js.native
  def getNumberOption[T /* <: js.Object */, K /* <: String */](options: T, property: K, minimum: Double, maximum: Double, fallback: Double): Double = js.native
  @JSName("getOption")
  def getOption_boolean[T /* <: js.Object */, K /* <: String */, F](opts: T, prop: K, `type`: boolean, values: js.UndefOr[scala.Nothing], fallback: F): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | F = js.native
  @JSName("getOption")
  def getOption_boolean[T /* <: js.Object */, K /* <: String */, F](
    opts: T,
    prop: K,
    `type`: boolean,
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ],
    fallback: F
  ): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | F = js.native
  @JSName("getOption")
  def getOption_string[T /* <: js.Object */, K /* <: String */, F](opts: T, prop: K, `type`: string, values: js.UndefOr[scala.Nothing], fallback: F): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | F = js.native
  @JSName("getOption")
  def getOption_string[T /* <: js.Object */, K /* <: String */, F](
    opts: T,
    prop: K,
    `type`: string,
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ],
    fallback: F
  ): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | F = js.native
  def getParentLocalesByLang(lang: String): Record[String, String] = js.native
  def invariant(condition: Boolean, message: String): Unit = js.native
  def invariant(condition: Boolean, message: String, Err: js.Any): Unit = js.native
  def isLiteralPart(patternPart: AnonType): /* is @formatjs/intl-utils.@formatjs/intl-utils/dist/polyfill-utils.LiteralPart */ Boolean = js.native
  def isLiteralPart(patternPart: LiteralPart): /* is @formatjs/intl-utils.@formatjs/intl-utils/dist/polyfill-utils.LiteralPart */ Boolean = js.native
  def isMissingLocaleDataError(e: js.Error): /* is @formatjs/intl-utils.@formatjs/intl-utils/dist/resolve-locale.MissingLocaleDataError */ Boolean = js.native
  def isWellFormedCurrencyCode(currency: String): Boolean = js.native
  def objectIs(x: js.Any, y: js.Any): Boolean = js.native
  def partitionPattern(pattern: String): js.Array[AnonValue | AnonTypeValue] = js.native
  def removeUnitNamespace(unit: String): String = js.native
  def selectUnit(from: Double): AnonUnit = js.native
  def selectUnit(from: Double, to: Double): AnonUnit = js.native
  def selectUnit(from: Double, to: Double, thresholds: PartialThresholds): AnonUnit = js.native
  def selectUnit(from: Double, to: Date): AnonUnit = js.native
  def selectUnit(from: Double, to: Date, thresholds: PartialThresholds): AnonUnit = js.native
  def selectUnit(from: Date): AnonUnit = js.native
  def selectUnit(from: Date, to: Double): AnonUnit = js.native
  def selectUnit(from: Date, to: Double, thresholds: PartialThresholds): AnonUnit = js.native
  def selectUnit(from: Date, to: Date): AnonUnit = js.native
  def selectUnit(from: Date, to: Date, thresholds: PartialThresholds): AnonUnit = js.native
  def setInternalSlot[Instance /* <: js.Object */, Internal /* <: js.Object */, Field /* <: String */](
    map: WeakMap[Instance, Internal],
    pl: Instance,
    field: Field,
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.NonNullable<Internal>[Field] */ js.Any
  ): Unit = js.native
  def setMultiInternalSlots[Instance /* <: js.Object */, Internal /* <: js.Object */, K /* <: String */](map: WeakMap[Instance, Internal], pl: Instance, props: Pick[NonNullable[Internal], K]): Unit = js.native
  def setNumberFormatDigitOptions[TObject /* <: js.Object */, TInternalSlots /* <: NumberFormatDigitInternalSlots */](
    internalSlotMap: WeakMap[TObject, TInternalSlots],
    intlObj: TObject,
    opts: NumberFormatDigitOptions,
    mnfdDefault: Double,
    mxfdDefault: Double
  ): Unit = js.native
  def supportedLocales(availableLocales: js.Array[String], requestedLocales: js.Array[String]): js.Array[String] = js.native
  def supportedLocales(availableLocales: js.Array[String], requestedLocales: js.Array[String], options: AnonLocaleMatcher): js.Array[String] = js.native
  def toObject[T](arg: T): T = js.native
  def toString(o: js.Any): String = js.native
  def unpackData[T /* <: Record[String, _] */](locale: String, localeData: LocaleData[T]): T = js.native
  def unpackData[T /* <: Record[String, _] */](
    locale: String,
    localeData: LocaleData[T],
    /** By default shallow merge the dictionaries. */
  reducer: js.Function2[/* all */ T, /* d */ T, T]
  ): T = js.native
  @js.native
  object InternalSlotToken extends js.Object {
    /* "compactName" */ val compactName: typingsJapgolly.formatjsIntlUtils.numberTypesMod.InternalSlotToken.compactName with String = js.native
    /* "compactSymbol" */ val compactSymbol: typingsJapgolly.formatjsIntlUtils.numberTypesMod.InternalSlotToken.compactSymbol with String = js.native
    /* "currencyCode" */ val currencyCode: typingsJapgolly.formatjsIntlUtils.numberTypesMod.InternalSlotToken.currencyCode with String = js.native
    /* "currencyName" */ val currencyName: typingsJapgolly.formatjsIntlUtils.numberTypesMod.InternalSlotToken.currencyName with String = js.native
    /* "currencyNarrowSymbol" */ val currencyNarrowSymbol: typingsJapgolly.formatjsIntlUtils.numberTypesMod.InternalSlotToken.currencyNarrowSymbol with String = js.native
    /* "currencySymbol" */ val currencySymbol: typingsJapgolly.formatjsIntlUtils.numberTypesMod.InternalSlotToken.currencySymbol with String = js.native
    /* "minusSign" */ val minusSign: typingsJapgolly.formatjsIntlUtils.numberTypesMod.InternalSlotToken.minusSign with String = js.native
    /* "number" */ val number: typingsJapgolly.formatjsIntlUtils.numberTypesMod.InternalSlotToken.number with String = js.native
    /* "percentSign" */ val percentSign: typingsJapgolly.formatjsIntlUtils.numberTypesMod.InternalSlotToken.percentSign with String = js.native
    /* "plusSign" */ val plusSign: typingsJapgolly.formatjsIntlUtils.numberTypesMod.InternalSlotToken.plusSign with String = js.native
    /* "scientificExponent" */ val scientificExponent: typingsJapgolly.formatjsIntlUtils.numberTypesMod.InternalSlotToken.scientificExponent with String = js.native
    /* "scientificSeparator" */ val scientificSeparator: typingsJapgolly.formatjsIntlUtils.numberTypesMod.InternalSlotToken.scientificSeparator with String = js.native
    /* "unitName" */ val unitName: typingsJapgolly.formatjsIntlUtils.numberTypesMod.InternalSlotToken.unitName with String = js.native
    /* "unitNarrowSymbol" */ val unitNarrowSymbol: typingsJapgolly.formatjsIntlUtils.numberTypesMod.InternalSlotToken.unitNarrowSymbol with String = js.native
    /* "unitSymbol" */ val unitSymbol: typingsJapgolly.formatjsIntlUtils.numberTypesMod.InternalSlotToken.unitSymbol with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.formatjsIntlUtils.numberTypesMod.InternalSlotToken with String] = js.native
  }
  
}

