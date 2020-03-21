package typingsJapgolly.stylefire.cssMod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.stylefire.typesMod.ResolvedState
import typingsJapgolly.stylefire.typesMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CssStylerOptions extends js.Object {
  var element: HTMLElement
  var hasCSSVariable: js.UndefOr[Boolean] = js.undefined
  var preparseOutput: Boolean
  def buildStyles(state: State): ResolvedState
}

object CssStylerOptions {
  @scala.inline
  def apply(
    buildStyles: State => CallbackTo[ResolvedState],
    element: HTMLElement,
    preparseOutput: Boolean,
    hasCSSVariable: js.UndefOr[Boolean] = js.undefined
  ): CssStylerOptions = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], preparseOutput = preparseOutput.asInstanceOf[js.Any])
    __obj.updateDynamic("buildStyles")(js.Any.fromFunction1((t0: typingsJapgolly.stylefire.typesMod.State) => buildStyles(t0).runNow()))
    if (!js.isUndefined(hasCSSVariable)) __obj.updateDynamic("hasCSSVariable")(hasCSSVariable.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssStylerOptions]
  }
}

