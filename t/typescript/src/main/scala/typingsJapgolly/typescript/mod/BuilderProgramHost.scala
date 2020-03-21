package typingsJapgolly.typescript.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuilderProgramHost extends js.Object {
  /**
    * If provided this would be used this hash instead of actual file shape text for detecting changes
    */
  var createHash: js.UndefOr[js.Function1[/* data */ java.lang.String, java.lang.String]] = js.undefined
  /**
    * When emit or emitNextAffectedFile are called without writeFile,
    * this callback if present would be used to write files
    */
  var writeFile: js.UndefOr[WriteFileCallback] = js.undefined
  /**
    * return true if file names are treated with case sensitivity
    */
  def useCaseSensitiveFileNames(): Boolean
}

object BuilderProgramHost {
  @scala.inline
  def apply(
    useCaseSensitiveFileNames: CallbackTo[Boolean],
    createHash: /* data */ java.lang.String => CallbackTo[java.lang.String] = null,
    writeFile: (/* fileName */ java.lang.String, /* data */ java.lang.String, /* writeByteOrderMark */ Boolean, /* onError */ js.UndefOr[js.Function1[/* message */ java.lang.String, Unit]], /* sourceFiles */ js.UndefOr[js.Array[SourceFile]]) => Callback = null
  ): BuilderProgramHost = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("useCaseSensitiveFileNames")(useCaseSensitiveFileNames.toJsFn)
    if (createHash != null) __obj.updateDynamic("createHash")(js.Any.fromFunction1((t0: /* data */ java.lang.String) => createHash(t0).runNow()))
    if (writeFile != null) __obj.updateDynamic("writeFile")(js.Any.fromFunction5((t0: /* fileName */ java.lang.String, t1: /* data */ java.lang.String, t2: /* writeByteOrderMark */ scala.Boolean, t3: /* onError */ js.UndefOr[js.Function1[/* message */ java.lang.String, scala.Unit]], t4: /* sourceFiles */ js.UndefOr[js.Array[typingsJapgolly.typescript.mod.SourceFile]]) => writeFile(t0, t1, t2, t3, t4).runNow()))
    __obj.asInstanceOf[BuilderProgramHost]
  }
}

