package typingsJapgolly.grammarkdown.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/core", "forEachPossiblyAsync")
@js.native
object forEachPossiblyAsync extends js.Object {
  def apply[T, U](iterable: js.Iterable[T], callback: js.Function1[/* value */ T, js.UndefOr[js.Promise[U] | U]]): Unit | js.Promise[Unit] = js.native
}

