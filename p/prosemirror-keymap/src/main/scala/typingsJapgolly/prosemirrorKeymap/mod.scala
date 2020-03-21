package typingsJapgolly.prosemirrorKeymap

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.prosemirrorState.mod.Plugin
import typingsJapgolly.prosemirrorView.mod.EditorView
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-keymap", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def keydownHandler(bindings: StringDictionary[js.Any]): js.Function2[/* view */ EditorView[_], /* event */ Event_, Boolean] = js.native
  def keymap(bindings: StringDictionary[js.Any]): Plugin[_, _] = js.native
}

