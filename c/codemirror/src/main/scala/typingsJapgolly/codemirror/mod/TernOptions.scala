package typingsJapgolly.codemirror.mod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.tern.ternMod.CompletionsQueryResult
import typingsJapgolly.tern.ternMod.Def
import typingsJapgolly.tern.ternMod.Document
import typingsJapgolly.tern.ternMod.Query
import typingsJapgolly.tern.ternMod.TypeQueryResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TernOptions extends js.Object {
  /**
    * Customize the content in tooltips for completions.
    * Is passed a single argument — the completion's data as returned by
    * Tern — and may return a string, DOM node, or null to indicate that
    * no tip should be shown. By default the docstring is shown.
    */
  var completionTip: js.UndefOr[js.Function1[/* data */ CompletionsQueryResult, String | HTMLElement | Null]] = js.undefined
  /** An array of JSON definition data structures. */
  var defs: js.UndefOr[js.Array[Def]] = js.undefined
  /**
    * This function will be applied
    * to documents before passing them on to Tern.
    */
  var fileFilter: js.UndefOr[js.Function3[/* value */ String, /* docName */ String, /* doc */ Doc, String]] = js.undefined
  /**
    * Can be used to access files in
    * the project that haven't been loaded yet. Simply do callback(null) to
    * indicate that a file is not available.
    */
  var getFile: js.UndefOr[
    js.Function2[/* name */ String, /* callback */ js.Function1[/* doc */ Doc | Null, _], _]
  ] = js.undefined
  /** An object mapping plugin names to configuration options. */
  var plugins: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: tern.tern/lib/tern.ConstructorOptions['plugins'] */ js.Any
  ] = js.undefined
  /** This function will be applied to the Tern responses before treating them */
  var responseFilter: js.UndefOr[
    js.Function5[
      /* doc */ Doc, 
      /* query */ Query, 
      /* request */ Document, 
      /* error */ js.UndefOr[js.Error], 
      /* data */ js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: tern.tern/lib/tern.QueryRegistry[tern.tern/lib/tern.Query['type']]['result'] */ js.Any
      ], 
      _
    ]
  ] = js.undefined
  /** Can be used to override the way errors are displayed. */
  var showError: js.UndefOr[js.Function2[/* editor */ Editor, /* message */ js.Error, _]] = js.undefined
  /** This function should, when providing a multi-file view, switch the view or focus to the named file. */
  var switchToDoc: js.UndefOr[js.Function2[/* name */ String, /* doc */ Doc, _]] = js.undefined
  /** Like completionTip, but for the tooltips shown for type queries. */
  var typeTip: js.UndefOr[js.Function1[/* data */ TypeQueryResult, String | HTMLElement | Null]] = js.undefined
  /**
    * Set to true to enable web worker mode. You'll probably
    * want to feature detect the actual value you use here, for example
    * !!window.Worker.
    */
  var useWorker: js.UndefOr[Boolean] = js.undefined
  /**
    * An array of paths pointing (relative to workerScript)
    * to the Acorn and Tern libraries and any Tern plugins you want to
    * load. Or, if you minified those into a single script and included
    * them in the workerScript, simply leave this undefined.
    */
  var workerDeps: js.UndefOr[js.Array[String]] = js.undefined
  /** The main script of the worker. Point this to wherever you are hosting worker.js from this directory. */
  var workerScript: js.UndefOr[String] = js.undefined
}

object TernOptions {
  @scala.inline
  def apply(
    completionTip: /* data */ CompletionsQueryResult => CallbackTo[String | HTMLElement | Null] = null,
    defs: js.Array[Def] = null,
    fileFilter: (/* value */ String, /* docName */ String, /* doc */ Doc) => CallbackTo[String] = null,
    getFile: (/* name */ String, /* callback */ js.Function1[/* doc */ Doc | Null, js.Any]) => CallbackTo[js.Any] = null,
    plugins: /* import warning: importer.ImportType#apply Failed type conversion: tern.tern/lib/tern.ConstructorOptions['plugins'] */ js.Any = null,
    responseFilter: (/* doc */ Doc, /* query */ Query, /* request */ Document, /* error */ js.UndefOr[js.Error], /* data */ js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: tern.tern/lib/tern.QueryRegistry[tern.tern/lib/tern.Query['type']]['result'] */ js.Any
    ]) => CallbackTo[js.Any] = null,
    showError: (/* editor */ Editor, /* message */ js.Error) => CallbackTo[js.Any] = null,
    switchToDoc: (/* name */ String, /* doc */ Doc) => CallbackTo[js.Any] = null,
    typeTip: /* data */ TypeQueryResult => CallbackTo[String | HTMLElement | Null] = null,
    useWorker: js.UndefOr[Boolean] = js.undefined,
    workerDeps: js.Array[String] = null,
    workerScript: String = null
  ): TernOptions = {
    val __obj = js.Dynamic.literal()
    if (completionTip != null) __obj.updateDynamic("completionTip")(js.Any.fromFunction1((t0: /* data */ typingsJapgolly.tern.ternMod.CompletionsQueryResult) => completionTip(t0).runNow()))
    if (defs != null) __obj.updateDynamic("defs")(defs.asInstanceOf[js.Any])
    if (fileFilter != null) __obj.updateDynamic("fileFilter")(js.Any.fromFunction3((t0: /* value */ java.lang.String, t1: /* docName */ java.lang.String, t2: /* doc */ typingsJapgolly.codemirror.mod.Doc) => fileFilter(t0, t1, t2).runNow()))
    if (getFile != null) __obj.updateDynamic("getFile")(js.Any.fromFunction2((t0: /* name */ java.lang.String, t1: /* callback */ js.Function1[/* doc */ typingsJapgolly.codemirror.mod.Doc | scala.Null, js.Any]) => getFile(t0, t1).runNow()))
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (responseFilter != null) __obj.updateDynamic("responseFilter")(js.Any.fromFunction5((t0: /* doc */ typingsJapgolly.codemirror.mod.Doc, t1: /* query */ typingsJapgolly.tern.ternMod.Query, t2: /* request */ typingsJapgolly.tern.ternMod.Document, t3: /* error */ js.UndefOr[js.Error], t4: /* data */ js.UndefOr[
  /* import warning: importer.ImportType#apply Failed type conversion: tern.tern/lib/tern.QueryRegistry[tern.tern/lib/tern.Query['type']]['result'] */ js.Any]) => responseFilter(t0, t1, t2, t3, t4).runNow()))
    if (showError != null) __obj.updateDynamic("showError")(js.Any.fromFunction2((t0: /* editor */ typingsJapgolly.codemirror.mod.Editor, t1: /* message */ js.Error) => showError(t0, t1).runNow()))
    if (switchToDoc != null) __obj.updateDynamic("switchToDoc")(js.Any.fromFunction2((t0: /* name */ java.lang.String, t1: /* doc */ typingsJapgolly.codemirror.mod.Doc) => switchToDoc(t0, t1).runNow()))
    if (typeTip != null) __obj.updateDynamic("typeTip")(js.Any.fromFunction1((t0: /* data */ typingsJapgolly.tern.ternMod.TypeQueryResult) => typeTip(t0).runNow()))
    if (!js.isUndefined(useWorker)) __obj.updateDynamic("useWorker")(useWorker.asInstanceOf[js.Any])
    if (workerDeps != null) __obj.updateDynamic("workerDeps")(workerDeps.asInstanceOf[js.Any])
    if (workerScript != null) __obj.updateDynamic("workerScript")(workerScript.asInstanceOf[js.Any])
    __obj.asInstanceOf[TernOptions]
  }
}

