package typingsJapgolly.reactBootstrapTable.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomFilter[FParams /* <: js.Object */, FElement /* <: CustomFilterElement */] extends js.Object {
  /**
  	 * Custom filter parameters to be passed to the generator function
  	 */
  var customFilterParameters: CustomFilterParameters[FParams]
  /**
  	 * Type must be 'CustomFilter'
  	 */
  var `type`: typingsJapgolly.reactBootstrapTable.reactBootstrapTableStrings.CustomFilter
  /**
  	 * Function to generate the filter component
  	 */
  @JSName("getElement")
  def getElement_CustomFilter(
    filterHandler: js.Function2[
      /* value */ js.UndefOr[CustomFilterParameters[FParams]], 
      /* type */ js.UndefOr[typingsJapgolly.reactBootstrapTable.reactBootstrapTableStrings.CustomFilter], 
      Unit
    ],
    customFilterParameters: CustomFilterParameters[FParams]
  ): Element
}

object CustomFilter {
  @scala.inline
  def apply[FParams /* <: js.Object */, FElement /* <: CustomFilterElement */](
    customFilterParameters: CustomFilterParameters[FParams],
    getElement: (js.Function2[
      /* value */ js.UndefOr[CustomFilterParameters[FParams]], 
      /* type */ js.UndefOr[typingsJapgolly.reactBootstrapTable.reactBootstrapTableStrings.CustomFilter], 
      Unit
    ], CustomFilterParameters[FParams]) => CallbackTo[Element],
    `type`: typingsJapgolly.reactBootstrapTable.reactBootstrapTableStrings.CustomFilter
  ): CustomFilter[FParams, FElement] = {
    val __obj = js.Dynamic.literal(customFilterParameters = customFilterParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("getElement")(js.Any.fromFunction2((t0: js.Function2[
  /* value */ js.UndefOr[typingsJapgolly.reactBootstrapTable.mod.CustomFilterParameters[FParams]], 
  /* type */ js.UndefOr[typingsJapgolly.reactBootstrapTable.reactBootstrapTableStrings.CustomFilter], 
  scala.Unit], t1: typingsJapgolly.reactBootstrapTable.mod.CustomFilterParameters[FParams]) => getElement(t0, t1).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomFilter[FParams, FElement]]
  }
}

