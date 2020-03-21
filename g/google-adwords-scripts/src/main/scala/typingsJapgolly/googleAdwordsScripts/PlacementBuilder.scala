package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlacementBuilder[Placement] extends DisplayBuilder[PlacementBuilder[Placement]] {
  def withUrl(url: String): PlacementBuilder[Placement]
}

object PlacementBuilder {
  @scala.inline
  def apply[Placement](
    build: CallbackTo[AdWordsOperation[PlacementBuilder[Placement]]],
    exclude: CallbackTo[AdWordsOperation[PlacementBuilder[Placement]]],
    withCpc: Double => CallbackTo[PlacementBuilder[Placement]],
    withCpm: Double => CallbackTo[PlacementBuilder[Placement]],
    withUrl: String => CallbackTo[PlacementBuilder[Placement]]
  ): PlacementBuilder[Placement] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(build.toJsFn)
    __obj.updateDynamic("exclude")(exclude.toJsFn)
    __obj.updateDynamic("withCpc")(js.Any.fromFunction1((t0: scala.Double) => withCpc(t0).runNow()))
    __obj.updateDynamic("withCpm")(js.Any.fromFunction1((t0: scala.Double) => withCpm(t0).runNow()))
    __obj.updateDynamic("withUrl")(js.Any.fromFunction1((t0: java.lang.String) => withUrl(t0).runNow()))
    __obj.asInstanceOf[PlacementBuilder[Placement]]
  }
}

