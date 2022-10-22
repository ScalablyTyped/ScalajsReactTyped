package typingsJapgolly.formatjsIntl

import typingsJapgolly.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptions
import typingsJapgolly.formatjsIntl.anon.OnError
import typingsJapgolly.std.Intl.NumberFormat
import typingsJapgolly.std.Intl.NumberFormatPart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcNumberMod {
  
  @JSImport("@formatjs/intl/lib/src/number", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatNumber(
    config: OnError,
    getNumberFormat: js.Function2[
      /* locales */ js.UndefOr[String | js.Array[String]], 
      /* opts */ js.UndefOr[NumberFormatOptions], 
      NumberFormat
    ],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatNumberOptions | undefined): string>[0] */ js.Any
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatNumber")(config.asInstanceOf[js.Any], getNumberFormat.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatNumber(
    config: OnError,
    getNumberFormat: js.Function2[
      /* locales */ js.UndefOr[String | js.Array[String]], 
      /* opts */ js.UndefOr[NumberFormatOptions], 
      NumberFormat
    ],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatNumberOptions | undefined): string>[0] */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatNumberOptions | undefined): string>[1] */ js.Any
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatNumber")(config.asInstanceOf[js.Any], getNumberFormat.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatNumberToParts(
    config: OnError,
    getNumberFormat: js.Function2[
      /* locales */ js.UndefOr[String | js.Array[String]], 
      /* opts */ js.UndefOr[NumberFormatOptions], 
      NumberFormat
    ],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatNumberOptions | undefined): string>[0] */ js.Any
  ): js.Array[NumberFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatNumberToParts")(config.asInstanceOf[js.Any], getNumberFormat.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Array[NumberFormatPart]]
  inline def formatNumberToParts(
    config: OnError,
    getNumberFormat: js.Function2[
      /* locales */ js.UndefOr[String | js.Array[String]], 
      /* opts */ js.UndefOr[NumberFormatOptions], 
      NumberFormat
    ],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatNumberOptions | undefined): string>[0] */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatNumberOptions | undefined): string>[1] */ js.Any
  ): js.Array[NumberFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatNumberToParts")(config.asInstanceOf[js.Any], getNumberFormat.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[NumberFormatPart]]
  
  inline def getFormatter(
    hasLocaleFormatsOnError: OnError,
    getNumberFormat: js.Function2[
      /* locales */ js.UndefOr[String | js.Array[String]], 
      /* opts */ js.UndefOr[NumberFormatOptions], 
      NumberFormat
    ]
  ): NumberFormat = (^.asInstanceOf[js.Dynamic].applyDynamic("getFormatter")(hasLocaleFormatsOnError.asInstanceOf[js.Any], getNumberFormat.asInstanceOf[js.Any])).asInstanceOf[NumberFormat]
  inline def getFormatter(
    hasLocaleFormatsOnError: OnError,
    getNumberFormat: js.Function2[
      /* locales */ js.UndefOr[String | js.Array[String]], 
      /* opts */ js.UndefOr[NumberFormatOptions], 
      NumberFormat
    ],
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatNumberOptions | undefined): string>[1] */ js.Any
  ): NumberFormat = (^.asInstanceOf[js.Dynamic].applyDynamic("getFormatter")(hasLocaleFormatsOnError.asInstanceOf[js.Any], getNumberFormat.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[NumberFormat]
}
