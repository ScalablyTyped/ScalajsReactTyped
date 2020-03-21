package typingsJapgolly.fastGlob.providersReaderMod

import typingsJapgolly.fastGlob.managersOptionsMod.IOptions
import typingsJapgolly.fastGlob.managersTasksMod.ITask
import typingsJapgolly.fastGlob.typesEntriesMod.Entry
import typingsJapgolly.fastGlob.typesEntriesMod.EntryItem
import typingsJapgolly.micromatch.mod.Options
import typingsJapgolly.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/package/out/providers/reader", JSImport.Default)
@js.native
abstract class default[T] protected () extends Reader[T] {
  def this(options: IOptions[EntryItem]) = this()
  /* CompleteClass */
  override val deepFilter: typingsJapgolly.fastGlob.filtersDeepMod.default = js.native
  /* CompleteClass */
  override val entryFilter: typingsJapgolly.fastGlob.filtersEntryMod.default = js.native
  /* CompleteClass */
  override val micromatchOptions: js.Any = js.native
  /* CompleteClass */
  override val options: IOptions[EntryItem] = js.native
  /**
    * Returns options for micromatch.
    */
  /* CompleteClass */
  override def getMicromatchOptions(): Options = js.native
  /**
    * Returns options for reader.
    */
  /* CompleteClass */
  override def getReaderOptions(task: ITask): typingsJapgolly.mrmlncReaddirEnhanced.mod.Options = js.native
  /**
    * Returns root path to scanner.
    */
  /* CompleteClass */
  override def getRootDirectory(task: ITask): String = js.native
  /**
    * Returns true if error has ENOENT code.
    */
  /* CompleteClass */
  override def isEnoentCodeError(err: ErrnoException): Boolean = js.native
  /**
    * The main logic of reading the directories that must be implemented by each providers.
    */
  /* CompleteClass */
  override def read(_task: ITask): T = js.native
  /**
    * Returns transformed entry.
    */
  /* CompleteClass */
  override def transform(entry: Entry): EntryItem = js.native
}

