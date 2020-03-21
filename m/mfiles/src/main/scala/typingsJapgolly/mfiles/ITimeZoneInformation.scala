package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITimeZoneInformation extends js.Object {
  val StandardName: String
  def LoadTimeZoneByName(TimeZoneName: String): Unit
  def LoadWithCurrentTimeZone(): Unit
}

object ITimeZoneInformation {
  @scala.inline
  def apply(LoadTimeZoneByName: String => Callback, LoadWithCurrentTimeZone: Callback, StandardName: String): ITimeZoneInformation = {
    val __obj = js.Dynamic.literal(StandardName = StandardName.asInstanceOf[js.Any])
    __obj.updateDynamic("LoadTimeZoneByName")(js.Any.fromFunction1((t0: java.lang.String) => LoadTimeZoneByName(t0).runNow()))
    __obj.updateDynamic("LoadWithCurrentTimeZone")(LoadWithCurrentTimeZone.toJsFn)
    __obj.asInstanceOf[ITimeZoneInformation]
  }
}

