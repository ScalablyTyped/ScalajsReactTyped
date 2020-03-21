package typingsJapgolly.nodelibFsWalk.settingsMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.nodelibFsWalk.PartialFileSystemAdapter
import typingsJapgolly.nodelibFsWalk.typesMod.Entry
import typingsJapgolly.nodelibFsWalk.typesMod.Errno
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var basePath: js.UndefOr[String] = js.undefined
  var concurrency: js.UndefOr[Double] = js.undefined
  var deepFilter: js.UndefOr[DeepFilterFunction] = js.undefined
  var entryFilter: js.UndefOr[EntryFilterFunction] = js.undefined
  var errorFilter: js.UndefOr[ErrorFilterFunction] = js.undefined
  var followSymbolicLinks: js.UndefOr[Boolean] = js.undefined
  var fs: js.UndefOr[PartialFileSystemAdapter] = js.undefined
  var pathSegmentSeparator: js.UndefOr[String] = js.undefined
  var stats: js.UndefOr[Boolean] = js.undefined
  var throwErrorOnBrokenSymbolicLink: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    basePath: String = null,
    concurrency: Int | Double = null,
    deepFilter: Entry => CallbackTo[Boolean] = null,
    entryFilter: Entry => CallbackTo[Boolean] = null,
    errorFilter: Errno => CallbackTo[Boolean] = null,
    followSymbolicLinks: js.UndefOr[Boolean] = js.undefined,
    fs: PartialFileSystemAdapter = null,
    pathSegmentSeparator: String = null,
    stats: js.UndefOr[Boolean] = js.undefined,
    throwErrorOnBrokenSymbolicLink: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (basePath != null) __obj.updateDynamic("basePath")(basePath.asInstanceOf[js.Any])
    if (concurrency != null) __obj.updateDynamic("concurrency")(concurrency.asInstanceOf[js.Any])
    if (deepFilter != null) __obj.updateDynamic("deepFilter")(js.Any.fromFunction1((t0: typingsJapgolly.nodelibFsWalk.typesMod.Entry) => deepFilter(t0).runNow()))
    if (entryFilter != null) __obj.updateDynamic("entryFilter")(js.Any.fromFunction1((t0: typingsJapgolly.nodelibFsWalk.typesMod.Entry) => entryFilter(t0).runNow()))
    if (errorFilter != null) __obj.updateDynamic("errorFilter")(js.Any.fromFunction1((t0: typingsJapgolly.nodelibFsWalk.typesMod.Errno) => errorFilter(t0).runNow()))
    if (!js.isUndefined(followSymbolicLinks)) __obj.updateDynamic("followSymbolicLinks")(followSymbolicLinks.asInstanceOf[js.Any])
    if (fs != null) __obj.updateDynamic("fs")(fs.asInstanceOf[js.Any])
    if (pathSegmentSeparator != null) __obj.updateDynamic("pathSegmentSeparator")(pathSegmentSeparator.asInstanceOf[js.Any])
    if (!js.isUndefined(stats)) __obj.updateDynamic("stats")(stats.asInstanceOf[js.Any])
    if (!js.isUndefined(throwErrorOnBrokenSymbolicLink)) __obj.updateDynamic("throwErrorOnBrokenSymbolicLink")(throwErrorOnBrokenSymbolicLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

