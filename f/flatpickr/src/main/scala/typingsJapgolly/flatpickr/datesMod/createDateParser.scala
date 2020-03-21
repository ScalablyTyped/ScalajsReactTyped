package typingsJapgolly.flatpickr.datesMod

import typingsJapgolly.flatpickr.AnonConfig
import typingsJapgolly.flatpickr.globalsMod._Global_.Date
import typingsJapgolly.flatpickr.localeMod.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("flatpickr/dist/utils/dates", "createDateParser")
@js.native
object createDateParser extends js.Object {
  def apply(hasConfigL10n: AnonConfig): js.Function4[
    /* date */ String | Double | Date, 
    /* givenFormat */ js.UndefOr[String], 
    /* timeless */ js.UndefOr[Boolean], 
    /* customLocale */ js.UndefOr[Locale], 
    js.UndefOr[Date]
  ] = js.native
}

