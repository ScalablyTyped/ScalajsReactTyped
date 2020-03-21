package typingsJapgolly.meteor

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGetMeteorData[TOwnProps, TDataProps] extends js.Object {
  var pure: js.UndefOr[Boolean] = js.undefined
  def getMeteorData(props: TOwnProps): TDataProps
}

object AnonGetMeteorData {
  @scala.inline
  def apply[TOwnProps, TDataProps](getMeteorData: TOwnProps => CallbackTo[TDataProps], pure: js.UndefOr[Boolean] = js.undefined): AnonGetMeteorData[TOwnProps, TDataProps] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getMeteorData")(js.Any.fromFunction1((t0: TOwnProps) => getMeteorData(t0).runNow()))
    if (!js.isUndefined(pure)) __obj.updateDynamic("pure")(pure.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGetMeteorData[TOwnProps, TDataProps]]
  }
}

