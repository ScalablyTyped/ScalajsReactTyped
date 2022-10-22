package typingsJapgolly.googleAppsScript.GoogleAppsScript.Forms

import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A DataValidation for a CheckboxItem.
  *
  *     // Add a checkBox item to a form and require exactly two selections.
  *     var checkBoxItem = form.addCheckboxItem();
  *     checkBoxItem.setTitle('What two condiments would you like on your hot dog?');
  *     checkBoxItem.setChoices([
  *       checkBoxItem.createChoice('Ketchup'),
  *       checkBoxItem.createChoice('Mustard'),
  *       checkBoxItem.createChoice('Relish')
  *     ]);
  *     var checkBoxValidation = FormApp.createCheckboxValidation()
  *       .setHelpText(“Select two condiments.”)
  *       .requireSelectExactly(2)
  *       .build();
  *     checkBoxItem.setValidation(checkBoxValidation);
  */
trait CheckboxValidation extends StObject {
  
  def requireSelectAtLeast(number: Integer): CheckboxValidation
  
  def requireSelectAtMost(number: Integer): CheckboxValidation
  
  def requireSelectExactly(number: Integer): CheckboxValidation
}
object CheckboxValidation {
  
  inline def apply(
    requireSelectAtLeast: Integer => CheckboxValidation,
    requireSelectAtMost: Integer => CheckboxValidation,
    requireSelectExactly: Integer => CheckboxValidation
  ): CheckboxValidation = {
    val __obj = js.Dynamic.literal(requireSelectAtLeast = js.Any.fromFunction1(requireSelectAtLeast), requireSelectAtMost = js.Any.fromFunction1(requireSelectAtMost), requireSelectExactly = js.Any.fromFunction1(requireSelectExactly))
    __obj.asInstanceOf[CheckboxValidation]
  }
  
  extension [Self <: CheckboxValidation](x: Self) {
    
    inline def setRequireSelectAtLeast(value: Integer => CheckboxValidation): Self = StObject.set(x, "requireSelectAtLeast", js.Any.fromFunction1(value))
    
    inline def setRequireSelectAtMost(value: Integer => CheckboxValidation): Self = StObject.set(x, "requireSelectAtMost", js.Any.fromFunction1(value))
    
    inline def setRequireSelectExactly(value: Integer => CheckboxValidation): Self = StObject.set(x, "requireSelectExactly", js.Any.fromFunction1(value))
  }
}
