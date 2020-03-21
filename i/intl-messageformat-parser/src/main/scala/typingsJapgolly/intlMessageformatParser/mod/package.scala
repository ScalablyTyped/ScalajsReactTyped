package typingsJapgolly.intlMessageformatParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ArgumentElement = typingsJapgolly.intlMessageformatParser.mod.BaseElement[typingsJapgolly.intlMessageformatParser.mod.TYPE.argument]
  type DateElement = typingsJapgolly.intlMessageformatParser.mod.SimpleFormatElement[
    typingsJapgolly.intlMessageformatParser.mod.TYPE.date, 
    typingsJapgolly.intlMessageformatParser.mod.DateTimeSkeleton
  ]
  type LiteralElement = typingsJapgolly.intlMessageformatParser.mod.BaseElement[typingsJapgolly.intlMessageformatParser.mod.TYPE.literal]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.intlMessageformatParser.mod.LiteralElement
    - typingsJapgolly.intlMessageformatParser.mod.ArgumentElement
    - typingsJapgolly.intlMessageformatParser.mod.NumberElement
    - typingsJapgolly.intlMessageformatParser.mod.DateElement
    - typingsJapgolly.intlMessageformatParser.mod.TimeElement
    - typingsJapgolly.intlMessageformatParser.mod.SelectElement
    - typingsJapgolly.intlMessageformatParser.mod.PluralElement
    - typingsJapgolly.intlMessageformatParser.mod.PoundElement
  */
  type MessageFormatElement = typingsJapgolly.intlMessageformatParser.mod._MessageFormatElement | typingsJapgolly.intlMessageformatParser.mod.LiteralElement | typingsJapgolly.intlMessageformatParser.mod.ArgumentElement | typingsJapgolly.intlMessageformatParser.mod.NumberElement | typingsJapgolly.intlMessageformatParser.mod.DateElement | typingsJapgolly.intlMessageformatParser.mod.TimeElement
  type NumberElement = typingsJapgolly.intlMessageformatParser.mod.SimpleFormatElement[
    typingsJapgolly.intlMessageformatParser.mod.TYPE.number, 
    typingsJapgolly.intlMessageformatParser.mod.NumberSkeleton
  ]
  type ParseFunction = js.Function2[
    /* input */ java.lang.String, 
    /* options */ js.UndefOr[typingsJapgolly.intlMessageformatParser.mod.IParseOptions], 
    js.Array[typingsJapgolly.intlMessageformatParser.mod.MessageFormatElement]
  ]
  type ParseOptions = typingsJapgolly.intlMessageformatParser.mod.Options with typingsJapgolly.intlMessageformatParser.mod.IParseOptions
  type TimeElement = typingsJapgolly.intlMessageformatParser.mod.SimpleFormatElement[
    typingsJapgolly.intlMessageformatParser.mod.TYPE.time, 
    typingsJapgolly.intlMessageformatParser.mod.DateTimeSkeleton
  ]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.intlMessageformatParser.intlMessageformatParserStrings.zero
    - typingsJapgolly.intlMessageformatParser.intlMessageformatParserStrings.one
    - typingsJapgolly.intlMessageformatParser.intlMessageformatParserStrings.two
    - typingsJapgolly.intlMessageformatParser.intlMessageformatParserStrings.few
    - typingsJapgolly.intlMessageformatParser.intlMessageformatParserStrings.many
    - typingsJapgolly.intlMessageformatParser.intlMessageformatParserStrings.other
    - java.lang.String
  */
  type ValidPluralRule = typingsJapgolly.intlMessageformatParser.mod._ValidPluralRule | java.lang.String
}
