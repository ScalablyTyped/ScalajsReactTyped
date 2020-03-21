package typingsJapgolly.googleAppsScript.GoogleAppsScript.Forms

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A DataValidationBuilder for a GridValidation.
  *
  *     // Add a grid item to a form and require one response per column.
  *     var gridItem = form.addGridItem();
  *     gridItem.setTitle('Rate your interests')
  *       .setRows(['Cars', 'Computers', 'Celebrities'])
  *       .setColumns(['Boring', 'So-so', 'Interesting']);
  *     var gridValidation = FormApp.createGridValidation()
  *       .setHelpText(“Select one item per column.”)
  *       .requireLimitOneResponsePerColumn()
  *       .build();
  *     gridItem.setValidation(gridValidation);
  */
trait GridValidationBuilder extends js.Object {
  def requireLimitOneResponsePerColumn(): GridValidationBuilder
}

object GridValidationBuilder {
  @scala.inline
  def apply(requireLimitOneResponsePerColumn: CallbackTo[GridValidationBuilder]): GridValidationBuilder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("requireLimitOneResponsePerColumn")(requireLimitOneResponsePerColumn.toJsFn)
    __obj.asInstanceOf[GridValidationBuilder]
  }
}

