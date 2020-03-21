package typingsJapgolly.timezonecomplete.mod

import typingsJapgolly.timezonecomplete.localeMod.PartialLocale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("timezonecomplete", "format")
@js.native
object format extends js.Object {
  def apply(
    dateTime: typingsJapgolly.timezonecomplete.basicsMod.TimeStruct,
    utcTime: typingsJapgolly.timezonecomplete.basicsMod.TimeStruct,
    localZone: js.UndefOr[scala.Nothing],
    formatString: String
  ): String = js.native
  def apply(
    dateTime: typingsJapgolly.timezonecomplete.basicsMod.TimeStruct,
    utcTime: typingsJapgolly.timezonecomplete.basicsMod.TimeStruct,
    localZone: js.UndefOr[scala.Nothing],
    formatString: String,
    locale: PartialLocale
  ): String = js.native
  def apply(
    dateTime: typingsJapgolly.timezonecomplete.basicsMod.TimeStruct,
    utcTime: typingsJapgolly.timezonecomplete.basicsMod.TimeStruct,
    localZone: Null,
    formatString: String
  ): String = js.native
  def apply(
    dateTime: typingsJapgolly.timezonecomplete.basicsMod.TimeStruct,
    utcTime: typingsJapgolly.timezonecomplete.basicsMod.TimeStruct,
    localZone: Null,
    formatString: String,
    locale: PartialLocale
  ): String = js.native
  def apply(
    dateTime: typingsJapgolly.timezonecomplete.basicsMod.TimeStruct,
    utcTime: typingsJapgolly.timezonecomplete.basicsMod.TimeStruct,
    localZone: typingsJapgolly.timezonecomplete.timezoneMod.TimeZone,
    formatString: String
  ): String = js.native
  def apply(
    dateTime: typingsJapgolly.timezonecomplete.basicsMod.TimeStruct,
    utcTime: typingsJapgolly.timezonecomplete.basicsMod.TimeStruct,
    localZone: typingsJapgolly.timezonecomplete.timezoneMod.TimeZone,
    formatString: String,
    locale: PartialLocale
  ): String = js.native
}

