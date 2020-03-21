package typingsJapgolly.dayjs.calendarMod

import typingsJapgolly.dayjs.mod.ConfigType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("dayjs", JSImport.Namespace)
@js.native
object dayjsAugmentingMod extends js.Object {
  @js.native
  trait Dayjs extends js.Object {
    def calendar(): String = js.native
    def calendar(referenceTime: ConfigType): String = js.native
    def calendar(referenceTime: ConfigType, formats: js.Object): String = js.native
  }
  
}

