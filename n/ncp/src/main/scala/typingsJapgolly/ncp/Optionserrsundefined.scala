package typingsJapgolly.ncp

import japgolly.scalajs.react.Callback
import typingsJapgolly.ncp.mod.File
import typingsJapgolly.node.NodeJS.ReadableStream
import typingsJapgolly.node.NodeJS.WritableStream
import typingsJapgolly.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined ncp.ncp.Options & {  errs ? :undefined} */
trait Optionserrsundefined extends js.Object {
  var clobber: js.UndefOr[Boolean] = js.undefined
  var dereference: js.UndefOr[Boolean] = js.undefined
  var errs: js.UndefOr[PathLike with js.UndefOr[scala.Nothing]] = js.undefined
  var filter: js.UndefOr[js.RegExp | (js.Function1[/* filename */ String, Boolean])] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var stopOnErr: js.UndefOr[Boolean] = js.undefined
  var transform: js.UndefOr[
    js.Function3[/* read */ ReadableStream, /* write */ WritableStream, /* file */ File, Unit]
  ] = js.undefined
}

object Optionserrsundefined {
  @scala.inline
  def apply(
    clobber: js.UndefOr[Boolean] = js.undefined,
    dereference: js.UndefOr[Boolean] = js.undefined,
    errs: PathLike with js.UndefOr[scala.Nothing] = null,
    filter: js.RegExp | (js.Function1[/* filename */ String, Boolean]) = null,
    limit: Int | Double = null,
    stopOnErr: js.UndefOr[Boolean] = js.undefined,
    transform: (/* read */ ReadableStream, /* write */ WritableStream, /* file */ File) => Callback = null
  ): Optionserrsundefined = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clobber)) __obj.updateDynamic("clobber")(clobber.asInstanceOf[js.Any])
    if (!js.isUndefined(dereference)) __obj.updateDynamic("dereference")(dereference.asInstanceOf[js.Any])
    if (errs != null) __obj.updateDynamic("errs")(errs.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (!js.isUndefined(stopOnErr)) __obj.updateDynamic("stopOnErr")(stopOnErr.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction3((t0: /* read */ typingsJapgolly.node.NodeJS.ReadableStream, t1: /* write */ typingsJapgolly.node.NodeJS.WritableStream, t2: /* file */ typingsJapgolly.ncp.mod.File) => transform(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Optionserrsundefined]
  }
}

