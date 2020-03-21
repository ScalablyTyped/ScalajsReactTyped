package typingsJapgolly.fastGlob.fsMod

import typingsJapgolly.fastGlob.entriesMod.Entry
import typingsJapgolly.fastGlob.entriesMod.EntryItem
import typingsJapgolly.fastGlob.optionsMod.IOptions
import typingsJapgolly.fastGlob.patternsMod.Pattern
import typingsJapgolly.mrmlncReaddirEnhanced.mod.FilterFunction
import typingsJapgolly.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/out/adapters/fs", JSImport.Default)
@js.native
abstract class default[T] protected () extends FileSystem[T] {
  def this(options: IOptions[EntryItem]) = this()
  /* CompleteClass */
  override val options: js.Any = js.native
  /**
    * Return full path to entry.
    */
  /* CompleteClass */
  override def getFullEntryPath(filepath: String): String = js.native
  /**
    * Return an implementation of the Entry interface.
    */
  /* CompleteClass */
  override def makeEntry(stat: Stats, pattern: Pattern): Entry = js.native
  /**
    * The main logic of reading the entries that must be implemented by each adapter.
    */
  /* CompleteClass */
  override def read(filepaths: js.Array[String], filter: FilterFunction): T = js.native
}

