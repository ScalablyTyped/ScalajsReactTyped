package typingsJapgolly.intlMessageformatParser

import typingsJapgolly.formatjsIntlUnifiedNumberformat.mod.UnifiedNumberFormatOptions
import typingsJapgolly.intlMessageformatParser.parserMod.Expectation
import typingsJapgolly.intlMessageformatParser.parserMod.IFileRange
import typingsJapgolly.intlMessageformatParser.parserMod.IParseOptions
import typingsJapgolly.intlMessageformatParser.parserMod.ParseFunction
import typingsJapgolly.intlMessageformatParser.skeletonMod.ExtendedDateTimeFormatOptions
import typingsJapgolly.intlMessageformatParser.typesMod.DateTimeSkeleton
import typingsJapgolly.intlMessageformatParser.typesMod.LiteralElement
import typingsJapgolly.intlMessageformatParser.typesMod.MessageFormatElement
import typingsJapgolly.intlMessageformatParser.typesMod.NumberElement
import typingsJapgolly.intlMessageformatParser.typesMod.NumberSkeleton
import typingsJapgolly.intlMessageformatParser.typesMod.NumberSkeletonToken
import typingsJapgolly.intlMessageformatParser.typesMod.Options
import typingsJapgolly.intlMessageformatParser.typesMod.Skeleton
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intl-messageformat-parser/lib", JSImport.Namespace)
@js.native
object libMod extends js.Object {
  @js.native
  class SyntaxError protected ()
    extends typingsJapgolly.intlMessageformatParser.parserMod.SyntaxError {
    def this(message: String, expected: js.Array[Expectation], found: String, location: IFileRange) = this()
    def this(message: String, expected: js.Array[Expectation], found: Null, location: IFileRange) = this()
  }
  
  val pegParse: ParseFunction = js.native
  def convertNumberSkeletonToNumberFormatOptions(tokens: js.Array[NumberSkeletonToken]): UnifiedNumberFormatOptions = js.native
  def createLiteralElement(value: String): LiteralElement = js.native
  def createNumberElement(value: String): NumberElement = js.native
  def createNumberElement(value: String, style: String): NumberElement = js.native
  def isArgumentElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/types.ArgumentElement */ Boolean = js.native
  def isDateElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/types.DateElement */ Boolean = js.native
  def isDateTimeSkeleton(): /* is intl-messageformat-parser.intl-messageformat-parser/lib/types.DateTimeSkeleton */ Boolean = js.native
  def isDateTimeSkeleton(el: DateTimeSkeleton | String): /* is intl-messageformat-parser.intl-messageformat-parser/lib/types.DateTimeSkeleton */ Boolean = js.native
  def isDateTimeSkeleton(el: Skeleton): /* is intl-messageformat-parser.intl-messageformat-parser/lib/types.DateTimeSkeleton */ Boolean = js.native
  def isLiteralElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/types.LiteralElement */ Boolean = js.native
  def isNumberElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/types.NumberElement */ Boolean = js.native
  def isNumberSkeleton(): /* is intl-messageformat-parser.intl-messageformat-parser/lib/types.NumberSkeleton */ Boolean = js.native
  def isNumberSkeleton(el: String | NumberSkeleton): /* is intl-messageformat-parser.intl-messageformat-parser/lib/types.NumberSkeleton */ Boolean = js.native
  def isNumberSkeleton(el: Skeleton): /* is intl-messageformat-parser.intl-messageformat-parser/lib/types.NumberSkeleton */ Boolean = js.native
  def isPluralElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/types.PluralElement */ Boolean = js.native
  def isPoundElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/types.PoundElement */ Boolean = js.native
  def isSelectElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/types.SelectElement */ Boolean = js.native
  def isTimeElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/types.TimeElement */ Boolean = js.native
  def parse(input: String): js.Array[MessageFormatElement] = js.native
  def parse(input: String, opts: ParseOptions): js.Array[MessageFormatElement] = js.native
  def parseDateTimeSkeleton(skeleton: String): ExtendedDateTimeFormatOptions = js.native
  /* static members */
  @js.native
  object SyntaxError extends js.Object {
    def buildMessage(expected: js.Array[Expectation]): String = js.native
    def buildMessage(expected: js.Array[Expectation], found: String): String = js.native
  }
  
  @js.native
  object TYPE extends js.Object {
    /* 1 */ val argument: typingsJapgolly.intlMessageformatParser.typesMod.TYPE.argument with Double = js.native
    /* 3 */ val date: typingsJapgolly.intlMessageformatParser.typesMod.TYPE.date with Double = js.native
    /* 0 */ val literal: typingsJapgolly.intlMessageformatParser.typesMod.TYPE.literal with Double = js.native
    /* 2 */ val number: typingsJapgolly.intlMessageformatParser.typesMod.TYPE.number with Double = js.native
    /* 6 */ val plural: typingsJapgolly.intlMessageformatParser.typesMod.TYPE.plural with Double = js.native
    /* 7 */ val pound: typingsJapgolly.intlMessageformatParser.typesMod.TYPE.pound with Double = js.native
    /* 5 */ val select: typingsJapgolly.intlMessageformatParser.typesMod.TYPE.select with Double = js.native
    /* 4 */ val time: typingsJapgolly.intlMessageformatParser.typesMod.TYPE.time with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.intlMessageformatParser.typesMod.TYPE with Double] = js.native
  }
  
  type ParseOptions = Options with IParseOptions
}

