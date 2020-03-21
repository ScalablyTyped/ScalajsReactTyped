package typingsJapgolly.reactFilepond.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilePondCallbackProps extends js.Object {
  /** If no error, file has been successfully loaded */
  var onaddfile: js.UndefOr[js.Function2[/* error */ FilePondErrorDescription, /* file */ File, Unit]] = js.undefined
  /** Made progress loading a file */
  var onaddfileprogress: js.UndefOr[js.Function2[/* file */ File, /* progress */ Double, Unit]] = js.undefined
  /** Started file load */
  var onaddfilestart: js.UndefOr[js.Function1[/* file */ File, Unit]] = js.undefined
  /**
    * FilePond instance throws an error. Optionally receives
    * file if error is related to a file object.
    */
  var onerror: js.UndefOr[
    js.Function3[
      /* error */ FilePondErrorDescription, 
      /* file */ js.UndefOr[File], 
      /* status */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  /** FilePond instance has been created and is ready. */
  var oninit: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * File has been transformed by the transform plugin or
    * another plugin subscribing to the prepare_output filter.
    * It receives the file item and the output data.
    */
  var onpreparefile: js.UndefOr[js.Function2[/* file */ File, /* output */ js.Any, Unit]] = js.undefined
  /** If no error, Processing of a file has been completed */
  var onprocessfile: js.UndefOr[js.Function2[/* error */ FilePondErrorDescription, /* file */ File, Unit]] = js.undefined
  /** Aborted processing of a file */
  var onprocessfileabort: js.UndefOr[js.Function1[/* file */ File, Unit]] = js.undefined
  /** Made progress processing a file */
  var onprocessfileprogress: js.UndefOr[js.Function2[/* file */ File, /* progress */ Double, Unit]] = js.undefined
  /** Started processing a file */
  var onprocessfilestart: js.UndefOr[js.Function1[/* file */ File, Unit]] = js.undefined
  /** Processing of a file has been undone */
  var onprocessfileundo: js.UndefOr[js.Function1[/* file */ File, Unit]] = js.undefined
  /** File has been removed. */
  var onremovefile: js.UndefOr[js.Function1[/* file */ File, Unit]] = js.undefined
  /** A file has been added or removed, receives a list of file items */
  var onupdatefiles: js.UndefOr[js.Function1[/* fileItems */ js.Array[File], Unit]] = js.undefined
  /**
    * FilePond instance throws a warning. For instance
    * when the maximum amount of files has been reached.
    * Optionally receives file if error is related to a
    * file object
    */
  var onwarning: js.UndefOr[
    js.Function3[/* error */ js.Any, /* file */ js.UndefOr[File], /* status */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
}

object FilePondCallbackProps {
  @scala.inline
  def apply(
    onaddfile: (/* error */ FilePondErrorDescription, /* file */ File) => Callback = null,
    onaddfileprogress: (/* file */ File, /* progress */ Double) => Callback = null,
    onaddfilestart: /* file */ File => Callback = null,
    onerror: (/* error */ FilePondErrorDescription, /* file */ js.UndefOr[File], /* status */ js.UndefOr[js.Any]) => Callback = null,
    oninit: js.UndefOr[Callback] = js.undefined,
    onpreparefile: (/* file */ File, /* output */ js.Any) => Callback = null,
    onprocessfile: (/* error */ FilePondErrorDescription, /* file */ File) => Callback = null,
    onprocessfileabort: /* file */ File => Callback = null,
    onprocessfileprogress: (/* file */ File, /* progress */ Double) => Callback = null,
    onprocessfilestart: /* file */ File => Callback = null,
    onprocessfileundo: /* file */ File => Callback = null,
    onremovefile: /* file */ File => Callback = null,
    onupdatefiles: /* fileItems */ js.Array[File] => Callback = null,
    onwarning: (/* error */ js.Any, /* file */ js.UndefOr[File], /* status */ js.UndefOr[js.Any]) => Callback = null
  ): FilePondCallbackProps = {
    val __obj = js.Dynamic.literal()
    if (onaddfile != null) __obj.updateDynamic("onaddfile")(js.Any.fromFunction2((t0: /* error */ typingsJapgolly.reactFilepond.mod.FilePondErrorDescription, t1: /* file */ typingsJapgolly.reactFilepond.mod.File) => onaddfile(t0, t1).runNow()))
    if (onaddfileprogress != null) __obj.updateDynamic("onaddfileprogress")(js.Any.fromFunction2((t0: /* file */ typingsJapgolly.reactFilepond.mod.File, t1: /* progress */ scala.Double) => onaddfileprogress(t0, t1).runNow()))
    if (onaddfilestart != null) __obj.updateDynamic("onaddfilestart")(js.Any.fromFunction1((t0: /* file */ typingsJapgolly.reactFilepond.mod.File) => onaddfilestart(t0).runNow()))
    if (onerror != null) __obj.updateDynamic("onerror")(js.Any.fromFunction3((t0: /* error */ typingsJapgolly.reactFilepond.mod.FilePondErrorDescription, t1: /* file */ js.UndefOr[typingsJapgolly.reactFilepond.mod.File], t2: /* status */ js.UndefOr[js.Any]) => onerror(t0, t1, t2).runNow()))
    oninit.foreach(p => __obj.updateDynamic("oninit")(p.toJsFn))
    if (onpreparefile != null) __obj.updateDynamic("onpreparefile")(js.Any.fromFunction2((t0: /* file */ typingsJapgolly.reactFilepond.mod.File, t1: /* output */ js.Any) => onpreparefile(t0, t1).runNow()))
    if (onprocessfile != null) __obj.updateDynamic("onprocessfile")(js.Any.fromFunction2((t0: /* error */ typingsJapgolly.reactFilepond.mod.FilePondErrorDescription, t1: /* file */ typingsJapgolly.reactFilepond.mod.File) => onprocessfile(t0, t1).runNow()))
    if (onprocessfileabort != null) __obj.updateDynamic("onprocessfileabort")(js.Any.fromFunction1((t0: /* file */ typingsJapgolly.reactFilepond.mod.File) => onprocessfileabort(t0).runNow()))
    if (onprocessfileprogress != null) __obj.updateDynamic("onprocessfileprogress")(js.Any.fromFunction2((t0: /* file */ typingsJapgolly.reactFilepond.mod.File, t1: /* progress */ scala.Double) => onprocessfileprogress(t0, t1).runNow()))
    if (onprocessfilestart != null) __obj.updateDynamic("onprocessfilestart")(js.Any.fromFunction1((t0: /* file */ typingsJapgolly.reactFilepond.mod.File) => onprocessfilestart(t0).runNow()))
    if (onprocessfileundo != null) __obj.updateDynamic("onprocessfileundo")(js.Any.fromFunction1((t0: /* file */ typingsJapgolly.reactFilepond.mod.File) => onprocessfileundo(t0).runNow()))
    if (onremovefile != null) __obj.updateDynamic("onremovefile")(js.Any.fromFunction1((t0: /* file */ typingsJapgolly.reactFilepond.mod.File) => onremovefile(t0).runNow()))
    if (onupdatefiles != null) __obj.updateDynamic("onupdatefiles")(js.Any.fromFunction1((t0: /* fileItems */ js.Array[typingsJapgolly.reactFilepond.mod.File]) => onupdatefiles(t0).runNow()))
    if (onwarning != null) __obj.updateDynamic("onwarning")(js.Any.fromFunction3((t0: /* error */ js.Any, t1: /* file */ js.UndefOr[typingsJapgolly.reactFilepond.mod.File], t2: /* status */ js.UndefOr[js.Any]) => onwarning(t0, t1, t2).runNow()))
    __obj.asInstanceOf[FilePondCallbackProps]
  }
}

