package typingsJapgolly.shrinkRay.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.express.mod.Response_
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import typingsJapgolly.shrinkRay.AnonLgblock
import typingsJapgolly.shrinkRay.PartialflushnumberfinishF
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  cacheSize  :number,   threshold  :number,   zlib  :std.Partial<{  flush ? :number,   finishFlush ? :number,   chunkSize ? :number,   windowBits ? :number,   strategy ? :number,   dictionary ? :any,   level  :-1 | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9,   memLevel  :1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9}>,   brotli  :{  lgblock  :number,   lgwin  :number,   mode  :0 | 1 | 2,   quality  :0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | 11},   filter  :shrink-ray.shrink-ray.FilterFunction, cache (req : express.express.Request<express-serve-static-core.express-serve-static-core.ParamsDictionary>, res : express.express.Response): boolean}> */
trait Options extends js.Object {
  var brotli: js.UndefOr[AnonLgblock] = js.undefined
  var cache: js.UndefOr[js.Function2[/* req */ Request_[ParamsDictionary], /* res */ Response_, Boolean]] = js.undefined
  var cacheSize: js.UndefOr[Double] = js.undefined
  var filter: js.UndefOr[FilterFunction] = js.undefined
  var threshold: js.UndefOr[Double] = js.undefined
  var zlib: js.UndefOr[PartialflushnumberfinishF] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    brotli: AnonLgblock = null,
    cache: (/* req */ Request_[ParamsDictionary], /* res */ Response_) => CallbackTo[Boolean] = null,
    cacheSize: Int | Double = null,
    filter: (/* req */ Request_[ParamsDictionary], /* res */ Response_) => CallbackTo[Boolean] = null,
    threshold: Int | Double = null,
    zlib: PartialflushnumberfinishF = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (brotli != null) __obj.updateDynamic("brotli")(brotli.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(js.Any.fromFunction2((t0: /* req */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary], t1: /* res */ typingsJapgolly.express.mod.Response_) => cache(t0, t1).runNow()))
    if (cacheSize != null) __obj.updateDynamic("cacheSize")(cacheSize.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction2((t0: /* req */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary], t1: /* res */ typingsJapgolly.express.mod.Response_) => filter(t0, t1).runNow()))
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    if (zlib != null) __obj.updateDynamic("zlib")(zlib.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

