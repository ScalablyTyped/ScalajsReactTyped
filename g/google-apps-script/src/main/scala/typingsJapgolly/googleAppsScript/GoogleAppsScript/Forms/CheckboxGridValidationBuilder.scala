package typingsJapgolly.googleAppsScript.GoogleAppsScript.Forms

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A DataValidationBuilder for a CheckboxGridValidation.
  *
  *     // Add a checkbox grid item to a form and restrict it to one response per column.
  *     var checkboxGridItem = form.addCheckboxGridItem();
  *     checkboxGridItem.setTitle('Where did you celebrate New Years?')
  *       .setRows(['New York', 'San Francisco', 'London'])
  *       .setColumns(['2014', '2015', '2016', '2017']);
  *     var checkboxGridValidation = FormApp.createcheckboxGridValidation()
  *       .setHelpText(“Select one item per column.”)
  *       .requireLimitOneResponsePerColumn()
  *       .build();
  *     checkboxGridItem.setValidation(checkboxGridValidation);
  */
trait CheckboxGridValidationBuilder extends StObject {
  
  def build(): CheckboxGridValidation
  
  def requireLimitOneResponsePerColumn(): CheckboxGridValidationBuilder
}
object CheckboxGridValidationBuilder {
  
  inline def apply(
    build: CallbackTo[CheckboxGridValidation],
    requireLimitOneResponsePerColumn: CallbackTo[CheckboxGridValidationBuilder]
  ): CheckboxGridValidationBuilder = {
    val __obj = js.Dynamic.literal(build = build.toJsFn, requireLimitOneResponsePerColumn = requireLimitOneResponsePerColumn.toJsFn)
    __obj.asInstanceOf[CheckboxGridValidationBuilder]
  }
  
  extension [Self <: CheckboxGridValidationBuilder](x: Self) {
    
    inline def setBuild(value: CallbackTo[CheckboxGridValidation]): Self = StObject.set(x, "build", value.toJsFn)
    
    inline def setRequireLimitOneResponsePerColumn(value: CallbackTo[CheckboxGridValidationBuilder]): Self = StObject.set(x, "requireLimitOneResponsePerColumn", value.toJsFn)
  }
}
