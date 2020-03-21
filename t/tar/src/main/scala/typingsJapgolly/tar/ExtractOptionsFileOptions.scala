package typingsJapgolly.tar

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.Buffer
import typingsJapgolly.node.NodeJS.WritableStream
import typingsJapgolly.tar.mod.FileStat
import typingsJapgolly.tar.mod.ReadEntry
import typingsJapgolly.tar.tarBooleans.`false`
import typingsJapgolly.tar.tarBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined tar.tar.ExtractOptions & tar.tar.FileOptions & {  sync  :true} */
trait ExtractOptionsFileOptions extends js.Object {
  /**
    * Alias for cwd.
    */
  var C: js.UndefOr[String] = js.undefined
  var Directory: js.UndefOr[Boolean] = js.undefined
  /**
    * Extract files relative to the specified directory. Defaults to
    * process.cwd(). If provided, this must exist and must be a directory.
    */
  var cwd: js.UndefOr[String] = js.undefined
  /**
    * Alias for file.
    */
  var f: js.UndefOr[String] = js.undefined
  /**
    * Uses the given file as the input or output of this function.
    */
  var file: js.UndefOr[String] = js.undefined
  /**
    * A function that gets called with (path, stat) for each entry being
    * added. Return true to emit the entry from the archive, or false to skip it.
    */
  var filter: js.UndefOr[js.Function2[/* path */ String, /* stat */ FileStat, Boolean]] = js.undefined
  /**
    * Set to a number to force ownership of all extracted files and folders,
    * and all implicitly created directories, to be owned by the specified
    * group id, regardless of the gid field in the archive. Cannot be used
    * along with preserveOwner. Requires also setting a uid option
    */
  var gid: js.UndefOr[Double] = js.undefined
  /**
    * Alias for keep.
    */
  var k: js.UndefOr[Boolean] = js.undefined
  /**
    * Do not overwrite existing files. In particular, if a file appears more
    * than once in an archive, later copies will not overwrite earlier copies
    */
  var keep: js.UndefOr[Boolean] = js.undefined
  /**
    * Alias for keep.
    */
  var `keep-existing`: js.UndefOr[Boolean] = js.undefined
  /**
    * Alias for newer.
    */
  var `keep-newer`: js.UndefOr[Boolean] = js.undefined
  /**
    * Alias for newer.
    */
  var `keep-newer-files`: js.UndefOr[Boolean] = js.undefined
  var m: js.UndefOr[Boolean] = js.undefined
  /**
    * The maximum size of meta entries that is supported. Defaults to 1 MB.
    */
  var maxMetaEntrySize: js.UndefOr[Double] = js.undefined
  // The following options are mostly internal, but can be modified in some
  // advanced use cases, such as re-using caches between runs.
  /**
    * The maximum buffer size for fs.read() operations (in bytes). Defaults to 16 MB.
    */
  var maxReadSize: js.UndefOr[Double] = js.undefined
  /**
    * Set to true to keep the existing file on disk if it's newer than
    * the file in the archive.
    */
  var newer: js.UndefOr[Boolean] = js.undefined
  var `no-mtime`: js.UndefOr[Boolean] = js.undefined
  /**
    * Set to true to omit writing mtime value for extracted entries.
    * [Alias: m, no-mtime]
    */
  var noMtime: js.UndefOr[Boolean] = js.undefined
  /**
    * A function that gets called with (entry) for each entry that passes the
    * filter.
    */
  var onentry: js.UndefOr[js.Function1[/* entry */ ReadEntry, Unit]] = js.undefined
  /**
    * A function that will get called with (message, data)
    * for any warnings encountered.
    */
  var onwarn: js.UndefOr[js.Function2[/* message */ String, /* data */ Buffer, Unit]] = js.undefined
  /**
    * Alias for preserveOwner.
    */
  var p: js.UndefOr[Boolean] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  /**
    * If true, tar will set the uid and gid of extracted entries to the uid
    * and gid fields in the archive. This defaults to true when run as root,
    * and false otherwise. If false, then files and directories will be set
    * with the owner and group of the user running the process. This is
    * similar to -p in tar(1), but ACLs and other system-specific data is
    * never unpacked in this implementation, and modes
    * are set by default already.
    */
  var preserveOwner: js.UndefOr[Boolean] = js.undefined
  /**
    * Treat warnings as crash-worthy errors. Default false.
    */
  var strict: js.UndefOr[Boolean] = js.undefined
  /**
    * Remove the specified number of leading path elements. Pathnames with
    * fewer elements will be silently skipped. Note that the pathname
    * is edited after applying the filter, but before security checks.
    */
  var strip: js.UndefOr[Double] = js.undefined
  /**
    * Alias for strip.
    */
  var `strip-components`: js.UndefOr[Double] = js.undefined
  /**
    * Alias for strip.
    */
  var stripComponents: js.UndefOr[Double] = js.undefined
  var sync: `true`
  /**
    * Provide a function that takes an entry object, and returns a stream,
    * or any falsey value. If a stream is provided, then that stream's data
    * will be written instead of the contents of the archive entry. If a
    * falsey value is provided, then the entry is written to disk as normal.
    * (To exclude items from extraction, use the filter option described above.)
    */
  var transform: js.UndefOr[js.Function1[/* entry */ ReadEntry, js.UndefOr[WritableStream | `false` | Null]]] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * Set to a number to force ownership of all extracted files and folders,
    * and all implicitly created directories, to be owned by the specified
    * user id, regardless of the uid field in the archive. Cannot be used
    * along with preserveOwner. Requires also setting a gid option.
    */
  var uid: js.UndefOr[Double] = js.undefined
  /**
    * Unlink files before creating them. Without this option, tar overwrites
    * existing files, which preserves existing hardlinks. With this option,
    * existing hardlinks will be broken, as will any symlink that would
    * affect the location of an extracted file.
    */
  var unlink: js.UndefOr[Boolean] = js.undefined
}

object ExtractOptionsFileOptions {
  @scala.inline
  def apply(
    sync: `true`,
    C: String = null,
    Directory: js.UndefOr[Boolean] = js.undefined,
    cwd: String = null,
    f: String = null,
    file: String = null,
    filter: (/* path */ String, /* stat */ FileStat) => CallbackTo[Boolean] = null,
    gid: Int | Double = null,
    k: js.UndefOr[Boolean] = js.undefined,
    keep: js.UndefOr[Boolean] = js.undefined,
    `keep-existing`: js.UndefOr[Boolean] = js.undefined,
    `keep-newer`: js.UndefOr[Boolean] = js.undefined,
    `keep-newer-files`: js.UndefOr[Boolean] = js.undefined,
    m: js.UndefOr[Boolean] = js.undefined,
    maxMetaEntrySize: Int | Double = null,
    maxReadSize: Int | Double = null,
    newer: js.UndefOr[Boolean] = js.undefined,
    `no-mtime`: js.UndefOr[Boolean] = js.undefined,
    noMtime: js.UndefOr[Boolean] = js.undefined,
    onentry: /* entry */ ReadEntry => Callback = null,
    onwarn: (/* message */ String, /* data */ Buffer) => Callback = null,
    p: js.UndefOr[Boolean] = js.undefined,
    path: String = null,
    preserveOwner: js.UndefOr[Boolean] = js.undefined,
    strict: js.UndefOr[Boolean] = js.undefined,
    strip: Int | Double = null,
    `strip-components`: Int | Double = null,
    stripComponents: Int | Double = null,
    transform: /* entry */ ReadEntry => CallbackTo[js.UndefOr[WritableStream | `false` | Null]] = null,
    `type`: String = null,
    uid: Int | Double = null,
    unlink: js.UndefOr[Boolean] = js.undefined
  ): ExtractOptionsFileOptions = {
    val __obj = js.Dynamic.literal(sync = sync.asInstanceOf[js.Any])
    if (C != null) __obj.updateDynamic("C")(C.asInstanceOf[js.Any])
    if (!js.isUndefined(Directory)) __obj.updateDynamic("Directory")(Directory.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (f != null) __obj.updateDynamic("f")(f.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction2((t0: /* path */ java.lang.String, t1: /* stat */ typingsJapgolly.tar.mod.FileStat) => filter(t0, t1).runNow()))
    if (gid != null) __obj.updateDynamic("gid")(gid.asInstanceOf[js.Any])
    if (!js.isUndefined(k)) __obj.updateDynamic("k")(k.asInstanceOf[js.Any])
    if (!js.isUndefined(keep)) __obj.updateDynamic("keep")(keep.asInstanceOf[js.Any])
    if (!js.isUndefined(`keep-existing`)) __obj.updateDynamic("keep-existing")(`keep-existing`.asInstanceOf[js.Any])
    if (!js.isUndefined(`keep-newer`)) __obj.updateDynamic("keep-newer")(`keep-newer`.asInstanceOf[js.Any])
    if (!js.isUndefined(`keep-newer-files`)) __obj.updateDynamic("keep-newer-files")(`keep-newer-files`.asInstanceOf[js.Any])
    if (!js.isUndefined(m)) __obj.updateDynamic("m")(m.asInstanceOf[js.Any])
    if (maxMetaEntrySize != null) __obj.updateDynamic("maxMetaEntrySize")(maxMetaEntrySize.asInstanceOf[js.Any])
    if (maxReadSize != null) __obj.updateDynamic("maxReadSize")(maxReadSize.asInstanceOf[js.Any])
    if (!js.isUndefined(newer)) __obj.updateDynamic("newer")(newer.asInstanceOf[js.Any])
    if (!js.isUndefined(`no-mtime`)) __obj.updateDynamic("no-mtime")(`no-mtime`.asInstanceOf[js.Any])
    if (!js.isUndefined(noMtime)) __obj.updateDynamic("noMtime")(noMtime.asInstanceOf[js.Any])
    if (onentry != null) __obj.updateDynamic("onentry")(js.Any.fromFunction1((t0: /* entry */ typingsJapgolly.tar.mod.ReadEntry) => onentry(t0).runNow()))
    if (onwarn != null) __obj.updateDynamic("onwarn")(js.Any.fromFunction2((t0: /* message */ java.lang.String, t1: /* data */ typingsJapgolly.node.Buffer) => onwarn(t0, t1).runNow()))
    if (!js.isUndefined(p)) __obj.updateDynamic("p")(p.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveOwner)) __obj.updateDynamic("preserveOwner")(preserveOwner.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    if (strip != null) __obj.updateDynamic("strip")(strip.asInstanceOf[js.Any])
    if (`strip-components` != null) __obj.updateDynamic("strip-components")(`strip-components`.asInstanceOf[js.Any])
    if (stripComponents != null) __obj.updateDynamic("stripComponents")(stripComponents.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction1((t0: /* entry */ typingsJapgolly.tar.mod.ReadEntry) => transform(t0).runNow()))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    if (!js.isUndefined(unlink)) __obj.updateDynamic("unlink")(unlink.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtractOptionsFileOptions]
  }
}

