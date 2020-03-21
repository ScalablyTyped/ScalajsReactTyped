package typingsJapgolly.karmaViewport

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("karma-viewport/dist/adapter/util/inspect", JSImport.Namespace)
@js.native
object inspectMod extends js.Object {
  def inspect(value: InspectValue): String = js.native
  type InspectFunction = js.Function1[/* repeated */ js.Any, js.Any]
  type InspectValue = js.UndefOr[Null | Double | String | js.Object | InspectFunction]
}

