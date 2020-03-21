package typingsJapgolly.chrome

import japgolly.scalajs.react.Callback
import typingsJapgolly.chrome.chrome.system.memory.MemoryInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofmemory extends js.Object {
  def getInfo(callback: js.Function1[/* info */ MemoryInfo, Unit]): Unit
}

object Typeofmemory {
  @scala.inline
  def apply(getInfo: js.Function1[/* info */ MemoryInfo, Unit] => Callback): Typeofmemory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getInfo")(js.Any.fromFunction1((t0: js.Function1[/* info */ typingsJapgolly.chrome.chrome.system.memory.MemoryInfo, scala.Unit]) => getInfo(t0).runNow()))
    __obj.asInstanceOf[Typeofmemory]
  }
}

