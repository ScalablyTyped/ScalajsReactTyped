package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExcludedPlacementListBuilder[ExcludedPlacementList] extends AdWordsBuilder[ExcludedPlacementList] {
  def withName(name: String): ExcludedPlacementListBuilder[ExcludedPlacementList]
}

object ExcludedPlacementListBuilder {
  @scala.inline
  def apply[ExcludedPlacementList](
    build: CallbackTo[AdWordsOperation[ExcludedPlacementList]],
    withName: String => CallbackTo[ExcludedPlacementListBuilder[ExcludedPlacementList]]
  ): ExcludedPlacementListBuilder[ExcludedPlacementList] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(build.toJsFn)
    __obj.updateDynamic("withName")(js.Any.fromFunction1((t0: java.lang.String) => withName(t0).runNow()))
    __obj.asInstanceOf[ExcludedPlacementListBuilder[ExcludedPlacementList]]
  }
}

