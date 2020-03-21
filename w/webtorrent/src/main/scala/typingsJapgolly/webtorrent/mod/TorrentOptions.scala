package typingsJapgolly.webtorrent.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.webtorrent.AnonFiles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TorrentOptions extends js.Object {
  var announce: js.UndefOr[js.Array[_]] = js.undefined
  var getAnnounceOpts: js.UndefOr[js.Function0[Unit]] = js.undefined
  var maxWebConns: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var store: js.UndefOr[js.Function2[/* chunkLength */ Double, /* storeOpts */ AnonFiles, _]] = js.undefined
}

object TorrentOptions {
  @scala.inline
  def apply(
    announce: js.Array[_] = null,
    getAnnounceOpts: js.UndefOr[Callback] = js.undefined,
    maxWebConns: Int | Double = null,
    name: String = null,
    path: String = null,
    store: (/* chunkLength */ Double, /* storeOpts */ AnonFiles) => CallbackTo[js.Any] = null
  ): TorrentOptions = {
    val __obj = js.Dynamic.literal()
    if (announce != null) __obj.updateDynamic("announce")(announce.asInstanceOf[js.Any])
    getAnnounceOpts.foreach(p => __obj.updateDynamic("getAnnounceOpts")(p.toJsFn))
    if (maxWebConns != null) __obj.updateDynamic("maxWebConns")(maxWebConns.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (store != null) __obj.updateDynamic("store")(js.Any.fromFunction2((t0: /* chunkLength */ scala.Double, t1: /* storeOpts */ typingsJapgolly.webtorrent.AnonFiles) => store(t0, t1).runNow()))
    __obj.asInstanceOf[TorrentOptions]
  }
}

