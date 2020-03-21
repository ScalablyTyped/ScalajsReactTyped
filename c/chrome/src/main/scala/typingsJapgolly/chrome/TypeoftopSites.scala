package typingsJapgolly.chrome

import japgolly.scalajs.react.Callback
import typingsJapgolly.chrome.chrome.topSites.MostVisitedURL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeoftopSites extends js.Object {
  def get(callback: js.Function1[/* data */ js.Array[MostVisitedURL], Unit]): Unit
}

object TypeoftopSites {
  @scala.inline
  def apply(get: js.Function1[/* data */ js.Array[MostVisitedURL], Unit] => Callback): TypeoftopSites = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: js.Function1[
  /* data */ js.Array[typingsJapgolly.chrome.chrome.topSites.MostVisitedURL], 
  scala.Unit]) => get(t0).runNow()))
    __obj.asInstanceOf[TypeoftopSites]
  }
}

