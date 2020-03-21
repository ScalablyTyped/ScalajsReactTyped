package typingsJapgolly.intlMessageformatParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type ArgumentElement = typingsJapgolly.intlMessageformatParser.typesMod.BaseElement[typingsJapgolly.intlMessageformatParser.typesMod.TYPE.argument]
  type DateElement = typingsJapgolly.intlMessageformatParser.typesMod.SimpleFormatElement[
    typingsJapgolly.intlMessageformatParser.typesMod.TYPE.date, 
    typingsJapgolly.intlMessageformatParser.typesMod.DateTimeSkeleton
  ]
  type LiteralElement = typingsJapgolly.intlMessageformatParser.typesMod.BaseElement[typingsJapgolly.intlMessageformatParser.typesMod.TYPE.literal]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.intlMessageformatParser.typesMod.LiteralElement
    - typingsJapgolly.intlMessageformatParser.typesMod.ArgumentElement
    - typingsJapgolly.intlMessageformatParser.typesMod.NumberElement
    - typingsJapgolly.intlMessageformatParser.typesMod.DateElement
    - typingsJapgolly.intlMessageformatParser.typesMod.TimeElement
    - typingsJapgolly.intlMessageformatParser.typesMod.SelectElement
    - typingsJapgolly.intlMessageformatParser.typesMod.PluralElement
    - typingsJapgolly.intlMessageformatParser.typesMod.PoundElement
  */
  type MessageFormatElement = typingsJapgolly.intlMessageformatParser.typesMod._MessageFormatElement | typingsJapgolly.intlMessageformatParser.typesMod.LiteralElement | typingsJapgolly.intlMessageformatParser.typesMod.ArgumentElement | typingsJapgolly.intlMessageformatParser.typesMod.NumberElement | typingsJapgolly.intlMessageformatParser.typesMod.DateElement | typingsJapgolly.intlMessageformatParser.typesMod.TimeElement
  type NumberElement = typingsJapgolly.intlMessageformatParser.typesMod.SimpleFormatElement[
    typingsJapgolly.intlMessageformatParser.typesMod.TYPE.number, 
    typingsJapgolly.intlMessageformatParser.typesMod.NumberSkeleton
  ]
  type TimeElement = typingsJapgolly.intlMessageformatParser.typesMod.SimpleFormatElement[
    typingsJapgolly.intlMessageformatParser.typesMod.TYPE.time, 
    typingsJapgolly.intlMessageformatParser.typesMod.DateTimeSkeleton
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
  type ValidPluralRule = typingsJapgolly.intlMessageformatParser.typesMod._ValidPluralRule | java.lang.String
}
