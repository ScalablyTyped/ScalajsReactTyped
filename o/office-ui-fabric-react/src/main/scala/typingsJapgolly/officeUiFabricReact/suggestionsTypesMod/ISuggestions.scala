package typingsJapgolly.officeUiFabricReact.suggestionsTypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISuggestions[T] extends js.Object {
  /** Execute the action selected. Can be SearchMore or ForceResolve actions. */
  def executeSelectedAction(): Unit
  /** Focus on the ForceResolve action above the suggestions. If not available then focus on SearchMore action. */
  def focusAboveSuggestions(): Unit
  /** Focus on the SearchMore action below the suggestions. If not available then focus on ForceResolve action. */
  def focusBelowSuggestions(): Unit
  /** Focus the SearchMore action button. */
  def focusSearchForMoreButton(): Unit
  /** Whether it has any suggested actions like ForceResolve or SearchMore. */
  def hasSuggestedAction(): Boolean
  /** Whether any of the suggested actions (ForceResolve or SearchMore) is selected. */
  def hasSuggestedActionSelected(): Boolean
  /** Returns true if the event was handled, false otherwise. */
  def tryHandleKeyDown(keyCode: Double, currentSuggestionIndex: Double): Boolean
}

object ISuggestions {
  @scala.inline
  def apply[T](
    executeSelectedAction: Callback,
    focusAboveSuggestions: Callback,
    focusBelowSuggestions: Callback,
    focusSearchForMoreButton: Callback,
    hasSuggestedAction: CallbackTo[Boolean],
    hasSuggestedActionSelected: CallbackTo[Boolean],
    tryHandleKeyDown: (Double, Double) => CallbackTo[Boolean]
  ): ISuggestions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("executeSelectedAction")(executeSelectedAction.toJsFn)
    __obj.updateDynamic("focusAboveSuggestions")(focusAboveSuggestions.toJsFn)
    __obj.updateDynamic("focusBelowSuggestions")(focusBelowSuggestions.toJsFn)
    __obj.updateDynamic("focusSearchForMoreButton")(focusSearchForMoreButton.toJsFn)
    __obj.updateDynamic("hasSuggestedAction")(hasSuggestedAction.toJsFn)
    __obj.updateDynamic("hasSuggestedActionSelected")(hasSuggestedActionSelected.toJsFn)
    __obj.updateDynamic("tryHandleKeyDown")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => tryHandleKeyDown(t0, t1).runNow()))
    __obj.asInstanceOf[ISuggestions[T]]
  }
}

