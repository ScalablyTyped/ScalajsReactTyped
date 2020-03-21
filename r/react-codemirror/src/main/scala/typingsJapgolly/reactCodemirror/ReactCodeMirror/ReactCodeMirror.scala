package typingsJapgolly.reactCodemirror.ReactCodeMirror

import typingsJapgolly.codemirror.mod.Editor
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactCodeMirror
  extends Component[ReactCodeMirrorProps, js.Object, js.Any] {
  /** Focuses the CodeMirror instance. */
  def focus(): Unit = js.native
  /** Returns the CodeMirror instance, if available. */
  def getCodeMirror(): Editor = js.native
}

