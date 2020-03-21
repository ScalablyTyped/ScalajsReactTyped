package typingsJapgolly.typescript.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolveProjectReferencePathHost extends js.Object {
  def fileExists(fileName: java.lang.String): Boolean
}

object ResolveProjectReferencePathHost {
  @scala.inline
  def apply(fileExists: java.lang.String => CallbackTo[Boolean]): ResolveProjectReferencePathHost = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fileExists")(js.Any.fromFunction1((t0: java.lang.String) => fileExists(t0).runNow()))
    __obj.asInstanceOf[ResolveProjectReferencePathHost]
  }
}

