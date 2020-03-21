package typingsJapgolly.fastGlob.fsMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.fastGlob.entriesMod.Entry
import typingsJapgolly.fastGlob.patternsMod.Pattern
import typingsJapgolly.mrmlncReaddirEnhanced.mod.FilterFunction
import typingsJapgolly.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileSystem[T] extends js.Object {
  val options: js.Any
  /**
    * Return full path to entry.
    */
  def getFullEntryPath(filepath: String): String
  /**
    * Return an implementation of the Entry interface.
    */
  def makeEntry(stat: Stats, pattern: Pattern): Entry
  /**
    * The main logic of reading the entries that must be implemented by each adapter.
    */
  def read(filepaths: js.Array[String], filter: FilterFunction): T
}

object FileSystem {
  @scala.inline
  def apply[T](
    getFullEntryPath: String => CallbackTo[String],
    makeEntry: (Stats, Pattern) => CallbackTo[Entry],
    options: js.Any,
    read: (js.Array[String], FilterFunction) => CallbackTo[T]
  ): FileSystem[T] = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("getFullEntryPath")(js.Any.fromFunction1((t0: java.lang.String) => getFullEntryPath(t0).runNow()))
    __obj.updateDynamic("makeEntry")(js.Any.fromFunction2((t0: typingsJapgolly.node.fsMod.Stats, t1: typingsJapgolly.fastGlob.patternsMod.Pattern) => makeEntry(t0, t1).runNow()))
    __obj.updateDynamic("read")(js.Any.fromFunction2((t0: js.Array[java.lang.String], t1: typingsJapgolly.mrmlncReaddirEnhanced.mod.FilterFunction) => read(t0, t1).runNow()))
    __obj.asInstanceOf[FileSystem[T]]
  }
}

