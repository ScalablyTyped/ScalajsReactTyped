package typingsJapgolly.adhan.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdhanCalculationMethod extends js.Object {
  def Dubai(): Parameter
  def Egyptian(): Parameter
  def Karachi(): Parameter
  def Kuwait(): Parameter
  def MoonsightingCommittee(): Parameter
  def MuslimWorldLeague(): Parameter
  def NorthAmerica(): Parameter
  def Other(): Parameter
  def Qatar(): Parameter
  def Singapore(): Parameter
  def UmmAlQura(): Parameter
}

object AdhanCalculationMethod {
  @scala.inline
  def apply(
    Dubai: CallbackTo[Parameter],
    Egyptian: CallbackTo[Parameter],
    Karachi: CallbackTo[Parameter],
    Kuwait: CallbackTo[Parameter],
    MoonsightingCommittee: CallbackTo[Parameter],
    MuslimWorldLeague: CallbackTo[Parameter],
    NorthAmerica: CallbackTo[Parameter],
    Other: CallbackTo[Parameter],
    Qatar: CallbackTo[Parameter],
    Singapore: CallbackTo[Parameter],
    UmmAlQura: CallbackTo[Parameter]
  ): AdhanCalculationMethod = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Dubai")(Dubai.toJsFn)
    __obj.updateDynamic("Egyptian")(Egyptian.toJsFn)
    __obj.updateDynamic("Karachi")(Karachi.toJsFn)
    __obj.updateDynamic("Kuwait")(Kuwait.toJsFn)
    __obj.updateDynamic("MoonsightingCommittee")(MoonsightingCommittee.toJsFn)
    __obj.updateDynamic("MuslimWorldLeague")(MuslimWorldLeague.toJsFn)
    __obj.updateDynamic("NorthAmerica")(NorthAmerica.toJsFn)
    __obj.updateDynamic("Other")(Other.toJsFn)
    __obj.updateDynamic("Qatar")(Qatar.toJsFn)
    __obj.updateDynamic("Singapore")(Singapore.toJsFn)
    __obj.updateDynamic("UmmAlQura")(UmmAlQura.toJsFn)
    __obj.asInstanceOf[AdhanCalculationMethod]
  }
}

