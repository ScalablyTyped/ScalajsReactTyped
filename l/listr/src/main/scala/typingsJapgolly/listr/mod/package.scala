package typingsJapgolly.listr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ListrContext = js.Any
  type ListrTaskResult[Ctx] = java.lang.String | js.Promise[js.Any] | typingsJapgolly.listr.mod.Listr[Ctx] | typingsJapgolly.node.streamMod.Readable | typingsJapgolly.rxjs.mod.Observable_[js.Any]
}
