package typingsJapgolly.formatjsIntl

import typingsJapgolly.formatjsIntl.anon.DefaultFormats
import typingsJapgolly.formatjsIntl.anon.FormattersPickFormattersg
import typingsJapgolly.formatjsIntl.libSrcTypesMod.MessageDescriptor
import typingsJapgolly.intlMessageformat.srcCoreMod.Options
import typingsJapgolly.intlMessageformat.srcFormattersMod.FormatXMLElementFn
import typingsJapgolly.intlMessageformat.srcFormattersMod.PrimitiveType
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcMessageMod {
  
  @JSImport("@formatjs/intl/lib/src/message", "formatMessage")
  @js.native
  val formatMessage: FormatMessageFn[Any] = js.native
  
  type FormatMessageFn[T] = js.Function5[
    /* hasLocaleFormatsMessagesDefaultLocaleDefaultFormatsFallbackOnEmptyStringOnErrorTimeZoneDefaultRichTextElements */ DefaultFormats[T], 
    /* state */ FormattersPickFormattersg, 
    /* messageDescriptor */ MessageDescriptor, 
    /* values */ js.UndefOr[
      Record[
        String, 
        PrimitiveType | T | (FormatXMLElementFn[T, String | T | (js.Array[String | T])])
      ]
    ], 
    /* opts */ js.UndefOr[Options], 
    /* import warning: importer.ImportType#apply Failed type conversion: T extends string ? string : std.Array<T | string> | string | T */ js.Any
  ]
}
