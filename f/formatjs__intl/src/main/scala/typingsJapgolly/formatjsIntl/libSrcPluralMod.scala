package typingsJapgolly.formatjsIntl

import typingsJapgolly.formatjsEcma402Abstract.typesPluralRulesMod.LDMLPluralRule
import typingsJapgolly.formatjsIntl.anon.Locale
import typingsJapgolly.formatjsIntl.anon.TypeofPluralRules
import typingsJapgolly.std.ConstructorParameters
import typingsJapgolly.std.Intl.PluralRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcPluralMod {
  
  @JSImport("@formatjs/intl/lib/src/plural", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatPlural(
    hasLocaleOnError: Locale,
    getPluralRules: js.Function1[/* args */ ConstructorParameters[TypeofPluralRules], PluralRules],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.PluralRules['select']>[0], opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatPluralOptions | undefined): std.ReturnType<std.Intl.PluralRules['select']>>[0] */ js.Any
  ): LDMLPluralRule = (^.asInstanceOf[js.Dynamic].applyDynamic("formatPlural")(hasLocaleOnError.asInstanceOf[js.Any], getPluralRules.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[LDMLPluralRule]
  inline def formatPlural(
    hasLocaleOnError: Locale,
    getPluralRules: js.Function1[/* args */ ConstructorParameters[TypeofPluralRules], PluralRules],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.PluralRules['select']>[0], opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatPluralOptions | undefined): std.ReturnType<std.Intl.PluralRules['select']>>[0] */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.PluralRules['select']>[0], opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatPluralOptions | undefined): std.ReturnType<std.Intl.PluralRules['select']>>[1] */ js.Any
  ): LDMLPluralRule = (^.asInstanceOf[js.Dynamic].applyDynamic("formatPlural")(hasLocaleOnError.asInstanceOf[js.Any], getPluralRules.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LDMLPluralRule]
}
