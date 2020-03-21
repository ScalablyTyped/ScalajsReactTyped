package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectComparer extends js.Object {
  def Compare(ObjectVersionDataLeft: IObjectVersion, ObjectVersionDataRight: IObjectVersion): Double
}

object IObjectComparer {
  @scala.inline
  def apply(Compare: (IObjectVersion, IObjectVersion) => CallbackTo[Double]): IObjectComparer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Compare")(js.Any.fromFunction2((t0: typingsJapgolly.mfiles.IObjectVersion, t1: typingsJapgolly.mfiles.IObjectVersion) => Compare(t0, t1).runNow()))
    __obj.asInstanceOf[IObjectComparer]
  }
}

