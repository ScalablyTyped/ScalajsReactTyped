package typingsJapgolly.jestChangedFiles.typesMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SCMAdapter extends js.Object {
  def findChangedFiles(cwd: Path, options: Options): js.Promise[js.Array[Path]]
  def getRoot(cwd: Path): js.Promise[Path | Null]
}

object SCMAdapter {
  @scala.inline
  def apply(
    findChangedFiles: (Path, Options) => CallbackTo[js.Promise[js.Array[Path]]],
    getRoot: Path => CallbackTo[js.Promise[Path | Null]]
  ): SCMAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("findChangedFiles")(js.Any.fromFunction2((t0: typingsJapgolly.jestTypes.configMod.Path, t1: typingsJapgolly.jestChangedFiles.typesMod.Options) => findChangedFiles(t0, t1).runNow()))
    __obj.updateDynamic("getRoot")(js.Any.fromFunction1((t0: typingsJapgolly.jestTypes.configMod.Path) => getRoot(t0).runNow()))
    __obj.asInstanceOf[SCMAdapter]
  }
}

