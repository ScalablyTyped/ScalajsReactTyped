package typingsJapgolly.slimerjs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FsModule extends js.Object {
  var separator: String
  var workingDirectory: String
  def absolute(path: String): String
  def base(path: String): String
  def basename(path: String): String
  def changeWorkingDirectory(path: String): Unit
  def copy(source: String, target: String): Unit
  def copyTree(source: String, target: String): Unit
  def directory(path: String): String
  def dirname(path: String): String
  def exists(path: String): Boolean
  def extension(path: String, withoutdot: Boolean): String
  def isAbsolute(path: String): Boolean
  def isDirectory(path: String): Boolean
  def isExecutable(path: String): Boolean
  def isFile(path: String): Boolean
  def isLink(path: String): Boolean
  def isReadable(path: String): Boolean
  def isWritable(path: String): Boolean
  // last argument should be the filename
  def join(basepath: String, dirname: String, args: String*): String
  def lastModified(path: String): js.Date
  def list(path: String): js.Array[String]
  def makeDirectory(path: String): Unit
  def makeTree(path: String): Unit
  def mkpath(path: String): Unit
  def move(source: String, target: String): Unit
  def open(filename: String, opts: Opts): Unit
  def read(path: String, mode: String): String
  def readLink(path: String): String
  def remove(path: String): Unit
  def removeDirectory(path: String): Unit
  def removeTree(path: String): Unit
  def rename(path: String, newname: String): Unit
  def rmdir(path: String): Unit
  def size(path: String): Double
  def split(path: String): js.Array[String]
  def touch(path: String, date: js.Date): Unit
  /*
    Mode is a string that can contain character which describes a characteristic of the returned stream.
    If the string contains "r", the file is opened in read-only mode.
    "w" opens the file in write-only mode.
    "b" opens the file in binary mode. If "b" is not present, the file is
    opened in text mode, and its contents are assumed to be UTF-8.
    "a" means to open as "append" mode: the file is open in write-only mode and all written character are append to the file
    */
  def write(path: String, content: js.Any, mode: String): Unit
}

object FsModule {
  @scala.inline
  def apply(
    absolute: String => CallbackTo[String],
    base: String => CallbackTo[String],
    basename: String => CallbackTo[String],
    changeWorkingDirectory: String => Callback,
    copy: (String, String) => Callback,
    copyTree: (String, String) => Callback,
    directory: String => CallbackTo[String],
    dirname: String => CallbackTo[String],
    exists: String => CallbackTo[Boolean],
    extension: (String, Boolean) => CallbackTo[String],
    isAbsolute: String => CallbackTo[Boolean],
    isDirectory: String => CallbackTo[Boolean],
    isExecutable: String => CallbackTo[Boolean],
    isFile: String => CallbackTo[Boolean],
    isLink: String => CallbackTo[Boolean],
    isReadable: String => CallbackTo[Boolean],
    isWritable: String => CallbackTo[Boolean],
    join: (String, String, /* repeated */ String) => CallbackTo[String],
    lastModified: String => CallbackTo[js.Date],
    list: String => CallbackTo[js.Array[String]],
    makeDirectory: String => Callback,
    makeTree: String => Callback,
    mkpath: String => Callback,
    move: (String, String) => Callback,
    open: (String, Opts) => Callback,
    read: (String, String) => CallbackTo[String],
    readLink: String => CallbackTo[String],
    remove: String => Callback,
    removeDirectory: String => Callback,
    removeTree: String => Callback,
    rename: (String, String) => Callback,
    rmdir: String => Callback,
    separator: String,
    size: String => CallbackTo[Double],
    split: String => CallbackTo[js.Array[String]],
    touch: (String, js.Date) => Callback,
    workingDirectory: String,
    write: (String, js.Any, String) => Callback
  ): FsModule = {
    val __obj = js.Dynamic.literal(separator = separator.asInstanceOf[js.Any], workingDirectory = workingDirectory.asInstanceOf[js.Any])
    __obj.updateDynamic("absolute")(js.Any.fromFunction1((t0: java.lang.String) => absolute(t0).runNow()))
    __obj.updateDynamic("base")(js.Any.fromFunction1((t0: java.lang.String) => base(t0).runNow()))
    __obj.updateDynamic("basename")(js.Any.fromFunction1((t0: java.lang.String) => basename(t0).runNow()))
    __obj.updateDynamic("changeWorkingDirectory")(js.Any.fromFunction1((t0: java.lang.String) => changeWorkingDirectory(t0).runNow()))
    __obj.updateDynamic("copy")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => copy(t0, t1).runNow()))
    __obj.updateDynamic("copyTree")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => copyTree(t0, t1).runNow()))
    __obj.updateDynamic("directory")(js.Any.fromFunction1((t0: java.lang.String) => directory(t0).runNow()))
    __obj.updateDynamic("dirname")(js.Any.fromFunction1((t0: java.lang.String) => dirname(t0).runNow()))
    __obj.updateDynamic("exists")(js.Any.fromFunction1((t0: java.lang.String) => exists(t0).runNow()))
    __obj.updateDynamic("extension")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Boolean) => extension(t0, t1).runNow()))
    __obj.updateDynamic("isAbsolute")(js.Any.fromFunction1((t0: java.lang.String) => isAbsolute(t0).runNow()))
    __obj.updateDynamic("isDirectory")(js.Any.fromFunction1((t0: java.lang.String) => isDirectory(t0).runNow()))
    __obj.updateDynamic("isExecutable")(js.Any.fromFunction1((t0: java.lang.String) => isExecutable(t0).runNow()))
    __obj.updateDynamic("isFile")(js.Any.fromFunction1((t0: java.lang.String) => isFile(t0).runNow()))
    __obj.updateDynamic("isLink")(js.Any.fromFunction1((t0: java.lang.String) => isLink(t0).runNow()))
    __obj.updateDynamic("isReadable")(js.Any.fromFunction1((t0: java.lang.String) => isReadable(t0).runNow()))
    __obj.updateDynamic("isWritable")(js.Any.fromFunction1((t0: java.lang.String) => isWritable(t0).runNow()))
    __obj.updateDynamic("join")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: /* repeated */ java.lang.String) => join(t0, t1, t2).runNow()))
    __obj.updateDynamic("lastModified")(js.Any.fromFunction1((t0: java.lang.String) => lastModified(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: java.lang.String) => list(t0).runNow()))
    __obj.updateDynamic("makeDirectory")(js.Any.fromFunction1((t0: java.lang.String) => makeDirectory(t0).runNow()))
    __obj.updateDynamic("makeTree")(js.Any.fromFunction1((t0: java.lang.String) => makeTree(t0).runNow()))
    __obj.updateDynamic("mkpath")(js.Any.fromFunction1((t0: java.lang.String) => mkpath(t0).runNow()))
    __obj.updateDynamic("move")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => move(t0, t1).runNow()))
    __obj.updateDynamic("open")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.slimerjs.Opts) => open(t0, t1).runNow()))
    __obj.updateDynamic("read")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => read(t0, t1).runNow()))
    __obj.updateDynamic("readLink")(js.Any.fromFunction1((t0: java.lang.String) => readLink(t0).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: java.lang.String) => remove(t0).runNow()))
    __obj.updateDynamic("removeDirectory")(js.Any.fromFunction1((t0: java.lang.String) => removeDirectory(t0).runNow()))
    __obj.updateDynamic("removeTree")(js.Any.fromFunction1((t0: java.lang.String) => removeTree(t0).runNow()))
    __obj.updateDynamic("rename")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => rename(t0, t1).runNow()))
    __obj.updateDynamic("rmdir")(js.Any.fromFunction1((t0: java.lang.String) => rmdir(t0).runNow()))
    __obj.updateDynamic("size")(js.Any.fromFunction1((t0: java.lang.String) => size(t0).runNow()))
    __obj.updateDynamic("split")(js.Any.fromFunction1((t0: java.lang.String) => split(t0).runNow()))
    __obj.updateDynamic("touch")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Date) => touch(t0, t1).runNow()))
    __obj.updateDynamic("write")(js.Any.fromFunction3((t0: java.lang.String, t1: js.Any, t2: java.lang.String) => write(t0, t1, t2).runNow()))
    __obj.asInstanceOf[FsModule]
  }
}

