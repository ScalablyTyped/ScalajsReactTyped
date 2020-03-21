package typingsJapgolly.ckeditorCkeditor5Core.mod

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.ckeditorCkeditor5Core.AnonDestroy
import typingsJapgolly.ckeditorCkeditor5Core.mod.editor.Editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ckeditor/ckeditor5-core", "PluginCollection")
@js.native
class PluginCollection[P /* <: Plugin[_] */] protected () extends js.Object {
  def this(editor: Editor) = this()
  def this(editor: Editor, availablePlugins: js.Array[Instantiable1[/* editor */ Editor, P]]) = this()
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator: js.Function0[js.Iterator[js.Tuple2[Instantiable1[/* editor */ Editor, P], P]]] = js.native
  def destroy(): js.Promise[js.Array[P with AnonDestroy]] = js.native
  def get(key: String): js.UndefOr[P] = js.native
  def get(key: Instantiable1[/* editor */ Editor, P]): js.UndefOr[P] = js.native
  def load(plugins: js.Array[String | (Instantiable1[/* editor */ Editor, P])]): js.Promise[js.Array[P]] = js.native
  def load(
    plugins: js.Array[String | (Instantiable1[/* editor */ Editor, P])],
    removePlugins: js.Array[String | (Instantiable1[/* editor */ Editor, P])]
  ): js.Promise[js.Array[P]] = js.native
}

