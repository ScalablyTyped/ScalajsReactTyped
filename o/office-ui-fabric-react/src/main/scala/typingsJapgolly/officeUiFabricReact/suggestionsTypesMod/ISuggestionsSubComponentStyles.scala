package typingsJapgolly.officeUiFabricReact.suggestionsTypesMod

import typingsJapgolly.officeUiFabricReact.spinnerTypesMod.ISpinnerStyleProps
import typingsJapgolly.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISuggestionsSubComponentStyles extends js.Object {
  /** Refers to the Spinner rendered within the Suggestions when searching or loading suggestions. */
  var spinner: IStyleFunctionOrObject[ISpinnerStyleProps, _]
}

object ISuggestionsSubComponentStyles {
  @scala.inline
  def apply(spinner: IStyleFunctionOrObject[ISpinnerStyleProps, _]): ISuggestionsSubComponentStyles = {
    val __obj = js.Dynamic.literal(spinner = spinner.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISuggestionsSubComponentStyles]
  }
}

