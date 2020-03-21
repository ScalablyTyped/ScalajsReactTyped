package typingsJapgolly.fastGlob.providersReaderMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.fastGlob.managersOptionsMod.IOptions
import typingsJapgolly.fastGlob.managersTasksMod.ITask
import typingsJapgolly.fastGlob.typesEntriesMod.Entry
import typingsJapgolly.fastGlob.typesEntriesMod.EntryItem
import typingsJapgolly.micromatch.mod.Options
import typingsJapgolly.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reader[T] extends js.Object {
  val deepFilter: typingsJapgolly.fastGlob.filtersDeepMod.default
  val entryFilter: typingsJapgolly.fastGlob.filtersEntryMod.default
  val micromatchOptions: js.Any
  val options: IOptions[EntryItem]
  /**
    * Returns options for micromatch.
    */
  def getMicromatchOptions(): Options
  /**
    * Returns options for reader.
    */
  def getReaderOptions(task: ITask): typingsJapgolly.mrmlncReaddirEnhanced.mod.Options
  /**
    * Returns root path to scanner.
    */
  def getRootDirectory(task: ITask): String
  /**
    * Returns true if error has ENOENT code.
    */
  def isEnoentCodeError(err: ErrnoException): Boolean
  /**
    * The main logic of reading the directories that must be implemented by each providers.
    */
  def read(_task: ITask): T
  /**
    * Returns transformed entry.
    */
  def transform(entry: Entry): EntryItem
}

object Reader {
  @scala.inline
  def apply[T](
    deepFilter: typingsJapgolly.fastGlob.filtersDeepMod.default,
    entryFilter: typingsJapgolly.fastGlob.filtersEntryMod.default,
    getMicromatchOptions: CallbackTo[Options],
    getReaderOptions: ITask => CallbackTo[typingsJapgolly.mrmlncReaddirEnhanced.mod.Options],
    getRootDirectory: ITask => CallbackTo[String],
    isEnoentCodeError: ErrnoException => CallbackTo[Boolean],
    micromatchOptions: js.Any,
    options: IOptions[EntryItem],
    read: ITask => CallbackTo[T],
    transform: Entry => CallbackTo[EntryItem]
  ): Reader[T] = {
    val __obj = js.Dynamic.literal(deepFilter = deepFilter.asInstanceOf[js.Any], entryFilter = entryFilter.asInstanceOf[js.Any], micromatchOptions = micromatchOptions.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("getMicromatchOptions")(getMicromatchOptions.toJsFn)
    __obj.updateDynamic("getReaderOptions")(js.Any.fromFunction1((t0: typingsJapgolly.fastGlob.managersTasksMod.ITask) => getReaderOptions(t0).runNow()))
    __obj.updateDynamic("getRootDirectory")(js.Any.fromFunction1((t0: typingsJapgolly.fastGlob.managersTasksMod.ITask) => getRootDirectory(t0).runNow()))
    __obj.updateDynamic("isEnoentCodeError")(js.Any.fromFunction1((t0: typingsJapgolly.node.NodeJS.ErrnoException) => isEnoentCodeError(t0).runNow()))
    __obj.updateDynamic("read")(js.Any.fromFunction1((t0: typingsJapgolly.fastGlob.managersTasksMod.ITask) => read(t0).runNow()))
    __obj.updateDynamic("transform")(js.Any.fromFunction1((t0: typingsJapgolly.fastGlob.typesEntriesMod.Entry) => transform(t0).runNow()))
    __obj.asInstanceOf[Reader[T]]
  }
}

