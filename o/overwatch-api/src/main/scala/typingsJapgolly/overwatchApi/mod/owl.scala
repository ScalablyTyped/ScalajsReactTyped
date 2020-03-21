package typingsJapgolly.overwatchApi.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait owl extends js.Object {
  def getLiveMatch(callback: js.Function2[/* err */ js.Error, /* data */ js.Any, Unit]): Unit
  def getSchedule(callback: js.Function2[/* err */ js.Error, /* data */ js.Any, Unit]): Unit
  def getStandings(callback: js.Function2[/* err */ js.Error, /* data */ js.Any, Unit]): Unit
}

object owl {
  @scala.inline
  def apply(
    getLiveMatch: js.Function2[/* err */ js.Error, /* data */ js.Any, Unit] => Callback,
    getSchedule: js.Function2[/* err */ js.Error, /* data */ js.Any, Unit] => Callback,
    getStandings: js.Function2[/* err */ js.Error, /* data */ js.Any, Unit] => Callback
  ): owl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getLiveMatch")(js.Any.fromFunction1((t0: js.Function2[/* err */ js.Error, /* data */ js.Any, scala.Unit]) => getLiveMatch(t0).runNow()))
    __obj.updateDynamic("getSchedule")(js.Any.fromFunction1((t0: js.Function2[/* err */ js.Error, /* data */ js.Any, scala.Unit]) => getSchedule(t0).runNow()))
    __obj.updateDynamic("getStandings")(js.Any.fromFunction1((t0: js.Function2[/* err */ js.Error, /* data */ js.Any, scala.Unit]) => getStandings(t0).runNow()))
    __obj.asInstanceOf[owl]
  }
}

