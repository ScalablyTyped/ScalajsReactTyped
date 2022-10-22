package typingsJapgolly.formatjsIcuMessageformatParser

import typingsJapgolly.formatjsIcuMessageformatParser.libTypesMod.DateTimeSkeleton
import typingsJapgolly.formatjsIcuMessageformatParser.libTypesMod.LiteralElement
import typingsJapgolly.formatjsIcuMessageformatParser.libTypesMod.MessageFormatElement
import typingsJapgolly.formatjsIcuMessageformatParser.libTypesMod.NumberElement
import typingsJapgolly.formatjsIcuMessageformatParser.libTypesMod.NumberSkeleton
import typingsJapgolly.formatjsIcuMessageformatParser.libTypesMod.Skeleton
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNoParserMod {
  
  @JSImport("@formatjs/icu-messageformat-parser/lib/no-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@formatjs/icu-messageformat-parser/lib/no-parser", "_Parser")
  @js.native
  val Parser: /* undefined */ Any = js.native
  
  @JSImport("@formatjs/icu-messageformat-parser/lib/no-parser", "SKELETON_TYPE")
  @js.native
  object SKELETON_TYPE extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.formatjsIcuMessageformatParser.libTypesMod.SKELETON_TYPE & Double
      ] = js.native
    
    /* 1 */ val dateTime: typingsJapgolly.formatjsIcuMessageformatParser.libTypesMod.SKELETON_TYPE.dateTime & Double = js.native
    
    /* 0 */ val number: typingsJapgolly.formatjsIcuMessageformatParser.libTypesMod.SKELETON_TYPE.number & Double = js.native
  }
  
  @JSImport("@formatjs/icu-messageformat-parser/lib/no-parser", "TYPE")
  @js.native
  object TYPE extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.formatjsIcuMessageformatParser.libTypesMod.TYPE & Double] = js.native
    
    /* 1 */ val argument: typingsJapgolly.formatjsIcuMessageformatParser.libTypesMod.TYPE.argument & Double = js.native
    
    /* 3 */ val date: typingsJapgolly.formatjsIcuMessageformatParser.libTypesMod.TYPE.date & Double = js.native
    
    /* 0 */ val literal: typingsJapgolly.formatjsIcuMessageformatParser.libTypesMod.TYPE.literal & Double = js.native
    
    /* 2 */ val number: typingsJapgolly.formatjsIcuMessageformatParser.libTypesMod.TYPE.number & Double = js.native
    
    /* 6 */ val plural: typingsJapgolly.formatjsIcuMessageformatParser.libTypesMod.TYPE.plural & Double = js.native
    
    /* 7 */ val pound: typingsJapgolly.formatjsIcuMessageformatParser.libTypesMod.TYPE.pound & Double = js.native
    
    /* 5 */ val select: typingsJapgolly.formatjsIcuMessageformatParser.libTypesMod.TYPE.select & Double = js.native
    
    /* 8 */ val tag: typingsJapgolly.formatjsIcuMessageformatParser.libTypesMod.TYPE.tag & Double = js.native
    
    /* 4 */ val time: typingsJapgolly.formatjsIcuMessageformatParser.libTypesMod.TYPE.time & Double = js.native
  }
  
  inline def createLiteralElement(value: String): LiteralElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createLiteralElement")(value.asInstanceOf[js.Any]).asInstanceOf[LiteralElement]
  
  inline def createNumberElement(value: String): NumberElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createNumberElement")(value.asInstanceOf[js.Any]).asInstanceOf[NumberElement]
  inline def createNumberElement(value: String, style: String): NumberElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createNumberElement")(value.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[NumberElement]
  
  inline def isArgumentElement(el: MessageFormatElement): /* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/lib/types.ArgumentElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArgumentElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/lib/types.ArgumentElement */ Boolean]
  
  inline def isDateElement(el: MessageFormatElement): /* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/lib/types.DateElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDateElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/lib/types.DateElement */ Boolean]
  
  inline def isDateTimeSkeleton(): /* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/lib/types.DateTimeSkeleton */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDateTimeSkeleton")().asInstanceOf[/* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/lib/types.DateTimeSkeleton */ Boolean]
  inline def isDateTimeSkeleton(el: js.UndefOr[DateTimeSkeleton | Null | String]): /* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/lib/types.DateTimeSkeleton */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDateTimeSkeleton")(el.asInstanceOf[js.Any]).asInstanceOf[/* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/lib/types.DateTimeSkeleton */ Boolean]
  inline def isDateTimeSkeleton(el: Skeleton): /* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/lib/types.DateTimeSkeleton */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDateTimeSkeleton")(el.asInstanceOf[js.Any]).asInstanceOf[/* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/lib/types.DateTimeSkeleton */ Boolean]
  
  inline def isLiteralElement(el: MessageFormatElement): /* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/lib/types.LiteralElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLiteralElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/lib/types.LiteralElement */ Boolean]
  
  inline def isNumberElement(el: MessageFormatElement): /* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/lib/types.NumberElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumberElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/lib/types.NumberElement */ Boolean]
  
  inline def isNumberSkeleton(el: js.UndefOr[String | NumberSkeleton | Null]): /* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/lib/types.NumberSkeleton */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumberSkeleton")(el.asInstanceOf[js.Any]).asInstanceOf[/* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/lib/types.NumberSkeleton */ Boolean]
  inline def isNumberSkeleton(el: Skeleton): /* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/lib/types.NumberSkeleton */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumberSkeleton")(el.asInstanceOf[js.Any]).asInstanceOf[/* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/lib/types.NumberSkeleton */ Boolean]
  
  inline def isPluralElement(el: MessageFormatElement): /* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/lib/types.PluralElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPluralElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/lib/types.PluralElement */ Boolean]
  
  inline def isPoundElement(el: MessageFormatElement): /* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/lib/types.PoundElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPoundElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/lib/types.PoundElement */ Boolean]
  
  inline def isSelectElement(el: MessageFormatElement): /* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/lib/types.SelectElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSelectElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/lib/types.SelectElement */ Boolean]
  
  inline def isTagElement(el: MessageFormatElement): /* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/lib/types.TagElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTagElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/lib/types.TagElement */ Boolean]
  
  inline def isTimeElement(el: MessageFormatElement): /* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/lib/types.TimeElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTimeElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is @formatjs/icu-messageformat-parser.@formatjs/icu-messageformat-parser/lib/types.TimeElement */ Boolean]
  
  inline def parse(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")().asInstanceOf[Unit]
}
