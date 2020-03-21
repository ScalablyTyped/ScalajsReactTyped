package typingsJapgolly.ckeditor.CKEDITOR

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.resourceManager")
@js.native
class resourceManager protected () extends js.Object {
  def this(basePath: String, fileName: String) = this()
  var basePath: String = js.native
  var externals: StringDictionary[js.Any] = js.native
  var fileName: String = js.native
  var loaded: StringDictionary[js.Any] = js.native
  var registered: StringDictionary[js.Any] = js.native
  def add(name: String): Unit = js.native
  def add(name: String, definition: pluginDefinition): Unit = js.native
  def addExternal(names: String, path: String): Unit = js.native
  def addExternal(names: String, path: String, fileName: String): Unit = js.native
  def get(name: String): pluginDefinition = js.native
  def getFilePath(name: String): String = js.native
  def getPath(name: String): String = js.native
  def load(name: String, callback: js.Function1[/* loaded */ js.Array[String], Unit]): Unit = js.native
  def load(
    name: String,
    callback: js.Function1[/* loaded */ js.Array[String], Unit],
    scope: StringDictionary[js.Any]
  ): Unit = js.native
  def load(name: js.Array[String], callback: js.Function1[/* loaded */ js.Array[String], Unit]): Unit = js.native
  def load(
    name: js.Array[String],
    callback: js.Function1[/* loaded */ js.Array[String], Unit],
    scope: StringDictionary[js.Any]
  ): Unit = js.native
}

