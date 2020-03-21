package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectFileComparer extends js.Object {
  def Compare(FileLeft: IObjectFile, FileRight: IObjectFile): Double
}

object IObjectFileComparer {
  @scala.inline
  def apply(Compare: (IObjectFile, IObjectFile) => CallbackTo[Double]): IObjectFileComparer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Compare")(js.Any.fromFunction2((t0: typingsJapgolly.mfiles.IObjectFile, t1: typingsJapgolly.mfiles.IObjectFile) => Compare(t0, t1).runNow()))
    __obj.asInstanceOf[IObjectFileComparer]
  }
}

