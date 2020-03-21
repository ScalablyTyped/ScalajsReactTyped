package typingsJapgolly.lokijs

import typingsJapgolly.lokijs.lokijsStrings.destructured
import typingsJapgolly.lokijs.lokijsStrings.fs
import typingsJapgolly.lokijs.lokijsStrings.localStorage
import typingsJapgolly.lokijs.lokijsStrings.memory
import typingsJapgolly.lokijs.lokijsStrings.normal
import typingsJapgolly.lokijs.lokijsStrings.pretty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LokiConfigOptions extends js.Object {
  var adapter: LokiPersistenceAdapter | Null = js.native
  var autoload: Boolean = js.native
  var autosave: Boolean = js.native
  var autosaveInterval: String | Double = js.native
  var destructureDelimiter: String = js.native
  var persistenceMethod: fs | localStorage | memory | Null = js.native
  var serializationMethod: normal | pretty | destructured | Null = js.native
  var throttledSaves: Boolean = js.native
  def autoloadCallback(err: js.Any): Unit = js.native
  def autosaveCallback(): Unit = js.native
  def autosaveCallback(err: js.Any): Unit = js.native
}

