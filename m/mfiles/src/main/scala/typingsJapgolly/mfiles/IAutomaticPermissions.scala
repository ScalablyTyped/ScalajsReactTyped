package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAutomaticPermissions extends js.Object {
  var CanDeactivate: Boolean
  val IsBasedOnObjectACL: Boolean
  val IsDefault: Boolean
  val NamedACL: INamedACL
  def Clone(): IAutomaticPermissions
  def SetBasedOnObjectACL(): Unit
  def SetNamedACL(NamedACL: INamedACL): Unit
}

object IAutomaticPermissions {
  @scala.inline
  def apply(
    CanDeactivate: Boolean,
    Clone: CallbackTo[IAutomaticPermissions],
    IsBasedOnObjectACL: Boolean,
    IsDefault: Boolean,
    NamedACL: INamedACL,
    SetBasedOnObjectACL: Callback,
    SetNamedACL: INamedACL => Callback
  ): IAutomaticPermissions = {
    val __obj = js.Dynamic.literal(CanDeactivate = CanDeactivate.asInstanceOf[js.Any], IsBasedOnObjectACL = IsBasedOnObjectACL.asInstanceOf[js.Any], IsDefault = IsDefault.asInstanceOf[js.Any], NamedACL = NamedACL.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("SetBasedOnObjectACL")(SetBasedOnObjectACL.toJsFn)
    __obj.updateDynamic("SetNamedACL")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.INamedACL) => SetNamedACL(t0).runNow()))
    __obj.asInstanceOf[IAutomaticPermissions]
  }
}

