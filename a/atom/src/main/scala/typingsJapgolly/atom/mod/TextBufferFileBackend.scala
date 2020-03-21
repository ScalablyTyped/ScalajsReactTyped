package typingsJapgolly.atom.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.fsMod.ReadStream
import typingsJapgolly.node.fsMod.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextBufferFileBackend extends js.Object {
  /**
    *  A {Function} that invokes its callback argument
    *  when the file changes. The method should return a {Disposable} that
    *  can be used to prevent further calls to the callback.
    */
  var onDidChange: js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], Disposable]] = js.undefined
  /**
    *  A {Function} that invokes its callback argument
    *  when the file is deleted. The method should return a {Disposable} that
    *  can be used to prevent further calls to the callback.
    */
  var onDidDelete: js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], Disposable]] = js.undefined
  /**
    *  A {Function} that invokes its callback argument
    *  when the file is renamed. The method should return a {Disposable} that
    *  can be used to prevent further calls to the callback.
    */
  var onDidRename: js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], Disposable]] = js.undefined
  /**
    *  A {Function} that returns a `Readable` stream
    *  that can be used to load the file's content.
    */
  def createReadStream(): ReadStream
  /**
    *  A {Function} that returns a `Writable` stream
    *  that can be used to save content to the file.
    */
  def createWriteStream(): WriteStream
  /** A {Function} that returns a {Boolean}, true if the file exists, false otherwise. */
  def existsSync(): Boolean
  /** A {Function} that returns the {String} path to the file. */
  def getPath(): String
}

object TextBufferFileBackend {
  @scala.inline
  def apply(
    createReadStream: CallbackTo[ReadStream],
    createWriteStream: CallbackTo[WriteStream],
    existsSync: CallbackTo[Boolean],
    getPath: CallbackTo[String],
    onDidChange: /* callback */ js.Function0[Unit] => CallbackTo[Disposable] = null,
    onDidDelete: /* callback */ js.Function0[Unit] => CallbackTo[Disposable] = null,
    onDidRename: /* callback */ js.Function0[Unit] => CallbackTo[Disposable] = null
  ): TextBufferFileBackend = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createReadStream")(createReadStream.toJsFn)
    __obj.updateDynamic("createWriteStream")(createWriteStream.toJsFn)
    __obj.updateDynamic("existsSync")(existsSync.toJsFn)
    __obj.updateDynamic("getPath")(getPath.toJsFn)
    if (onDidChange != null) __obj.updateDynamic("onDidChange")(js.Any.fromFunction1((t0: /* callback */ js.Function0[scala.Unit]) => onDidChange(t0).runNow()))
    if (onDidDelete != null) __obj.updateDynamic("onDidDelete")(js.Any.fromFunction1((t0: /* callback */ js.Function0[scala.Unit]) => onDidDelete(t0).runNow()))
    if (onDidRename != null) __obj.updateDynamic("onDidRename")(js.Any.fromFunction1((t0: /* callback */ js.Function0[scala.Unit]) => onDidRename(t0).runNow()))
    __obj.asInstanceOf[TextBufferFileBackend]
  }
}

