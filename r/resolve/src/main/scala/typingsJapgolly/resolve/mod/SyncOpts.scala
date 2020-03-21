package typingsJapgolly.resolve.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyncOpts extends Opts {
  /** function to synchronously test whether a directory exists */
  var isDirectory: js.UndefOr[js.Function1[/* directory */ String, Boolean]] = js.undefined
  /** function to synchronously test whether a file exists */
  var isFile: js.UndefOr[js.Function1[/* file */ String, Boolean]] = js.undefined
  /** how to read files synchronously (defaults to fs.readFileSync) */
  var readFileSync: js.UndefOr[js.Function2[/* file */ String, /* charset */ String, String | Buffer]] = js.undefined
}

object SyncOpts {
  @scala.inline
  def apply(
    _package: js.Any = null,
    basedir: String = null,
    extensions: String | js.Array[String] = null,
    isDirectory: /* directory */ String => CallbackTo[Boolean] = null,
    isFile: /* file */ String => CallbackTo[Boolean] = null,
    moduleDirectory: String | js.Array[String] = null,
    packageFilter: (/* pkg */ js.Any, /* pkgfile */ String) => CallbackTo[js.Any] = null,
    pathFilter: (/* pkg */ js.Any, /* path */ String, /* relativePath */ String) => CallbackTo[String] = null,
    paths: String | js.Array[String] = null,
    preserveSymlinks: js.UndefOr[Boolean] = js.undefined,
    readFileSync: (/* file */ String, /* charset */ String) => CallbackTo[String | Buffer] = null
  ): SyncOpts = {
    val __obj = js.Dynamic.literal()
    if (_package != null) __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    if (basedir != null) __obj.updateDynamic("basedir")(basedir.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (isDirectory != null) __obj.updateDynamic("isDirectory")(js.Any.fromFunction1((t0: /* directory */ java.lang.String) => isDirectory(t0).runNow()))
    if (isFile != null) __obj.updateDynamic("isFile")(js.Any.fromFunction1((t0: /* file */ java.lang.String) => isFile(t0).runNow()))
    if (moduleDirectory != null) __obj.updateDynamic("moduleDirectory")(moduleDirectory.asInstanceOf[js.Any])
    if (packageFilter != null) __obj.updateDynamic("packageFilter")(js.Any.fromFunction2((t0: /* pkg */ js.Any, t1: /* pkgfile */ java.lang.String) => packageFilter(t0, t1).runNow()))
    if (pathFilter != null) __obj.updateDynamic("pathFilter")(js.Any.fromFunction3((t0: /* pkg */ js.Any, t1: /* path */ java.lang.String, t2: /* relativePath */ java.lang.String) => pathFilter(t0, t1, t2).runNow()))
    if (paths != null) __obj.updateDynamic("paths")(paths.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveSymlinks)) __obj.updateDynamic("preserveSymlinks")(preserveSymlinks.asInstanceOf[js.Any])
    if (readFileSync != null) __obj.updateDynamic("readFileSync")(js.Any.fromFunction2((t0: /* file */ java.lang.String, t1: /* charset */ java.lang.String) => readFileSync(t0, t1).runNow()))
    __obj.asInstanceOf[SyncOpts]
  }
}

