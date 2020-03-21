package typingsJapgolly.nodelibFsWalk.settingsMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.nodelibFsWalk.typesMod.Entry
import typingsJapgolly.nodelibFsWalk.typesMod.Errno
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var _getValue: js.Any
  val _options: js.Any
  val basePath: js.UndefOr[String] = js.undefined
  val concurrency: Double
  val deepFilter: DeepFilterFunction | Null
  val entryFilter: EntryFilterFunction | Null
  val errorFilter: ErrorFilterFunction | Null
  val fsScandirSettings: typingsJapgolly.nodelibFsScandir.mod.Settings
  val pathSegmentSeparator: String
}

object Settings {
  @scala.inline
  def apply(
    _getValue: js.Any,
    _options: js.Any,
    concurrency: Double,
    fsScandirSettings: typingsJapgolly.nodelibFsScandir.mod.Settings,
    pathSegmentSeparator: String,
    basePath: String = null,
    deepFilter: Entry => CallbackTo[Boolean] = null,
    entryFilter: Entry => CallbackTo[Boolean] = null,
    errorFilter: Errno => CallbackTo[Boolean] = null
  ): Settings = {
    val __obj = js.Dynamic.literal(_getValue = _getValue.asInstanceOf[js.Any], _options = _options.asInstanceOf[js.Any], concurrency = concurrency.asInstanceOf[js.Any], fsScandirSettings = fsScandirSettings.asInstanceOf[js.Any], pathSegmentSeparator = pathSegmentSeparator.asInstanceOf[js.Any])
    if (basePath != null) __obj.updateDynamic("basePath")(basePath.asInstanceOf[js.Any])
    if (deepFilter != null) __obj.updateDynamic("deepFilter")(js.Any.fromFunction1((t0: typingsJapgolly.nodelibFsWalk.typesMod.Entry) => deepFilter(t0).runNow()))
    if (entryFilter != null) __obj.updateDynamic("entryFilter")(js.Any.fromFunction1((t0: typingsJapgolly.nodelibFsWalk.typesMod.Entry) => entryFilter(t0).runNow()))
    if (errorFilter != null) __obj.updateDynamic("errorFilter")(js.Any.fromFunction1((t0: typingsJapgolly.nodelibFsWalk.typesMod.Errno) => errorFilter(t0).runNow()))
    __obj.asInstanceOf[Settings]
  }
}

