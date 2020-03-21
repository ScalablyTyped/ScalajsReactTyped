package typingsJapgolly.istanbulLibSourceMaps

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.istanbulLibCoverage.mod.CoverageMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMap extends js.Object {
  var map: CoverageMap
  def sourceFinder(path: String): String
}

object AnonMap {
  @scala.inline
  def apply(map: CoverageMap, sourceFinder: String => CallbackTo[String]): AnonMap = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any])
    __obj.updateDynamic("sourceFinder")(js.Any.fromFunction1((t0: java.lang.String) => sourceFinder(t0).runNow()))
    __obj.asInstanceOf[AnonMap]
  }
}

