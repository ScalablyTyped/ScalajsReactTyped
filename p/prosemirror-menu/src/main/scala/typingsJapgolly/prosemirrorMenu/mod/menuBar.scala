package typingsJapgolly.prosemirrorMenu.mod

import typingsJapgolly.prosemirrorMenu.AnonContent
import typingsJapgolly.prosemirrorModel.mod.Schema
import typingsJapgolly.prosemirrorState.mod.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-menu", "menuBar")
@js.native
object menuBar extends js.Object {
  def apply[S /* <: Schema[_, _] */](options: AnonContent[S]): Plugin[S, _] = js.native
}

