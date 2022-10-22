package typingsJapgolly.timezonecomplete

import typingsJapgolly.timezonecomplete.distLibBasicsMod.TimeStruct
import typingsJapgolly.timezonecomplete.distLibLocaleMod.PartialLocale
import typingsJapgolly.timezonecomplete.distLibTimezoneMod.TimeZone
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibFormatMod {
  
  @JSImport("timezonecomplete/dist/lib/format", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def format(dateTime: TimeStruct, utcTime: TimeStruct, localZone: Null, formatString: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(dateTime.asInstanceOf[js.Any], utcTime.asInstanceOf[js.Any], localZone.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def format(
    dateTime: TimeStruct,
    utcTime: TimeStruct,
    localZone: Null,
    formatString: String,
    locale: PartialLocale
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(dateTime.asInstanceOf[js.Any], utcTime.asInstanceOf[js.Any], localZone.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def format(dateTime: TimeStruct, utcTime: TimeStruct, localZone: Unit, formatString: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(dateTime.asInstanceOf[js.Any], utcTime.asInstanceOf[js.Any], localZone.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def format(
    dateTime: TimeStruct,
    utcTime: TimeStruct,
    localZone: Unit,
    formatString: String,
    locale: PartialLocale
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(dateTime.asInstanceOf[js.Any], utcTime.asInstanceOf[js.Any], localZone.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def format(dateTime: TimeStruct, utcTime: TimeStruct, localZone: TimeZone, formatString: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(dateTime.asInstanceOf[js.Any], utcTime.asInstanceOf[js.Any], localZone.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def format(
    dateTime: TimeStruct,
    utcTime: TimeStruct,
    localZone: TimeZone,
    formatString: String,
    locale: PartialLocale
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(dateTime.asInstanceOf[js.Any], utcTime.asInstanceOf[js.Any], localZone.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String]
}
