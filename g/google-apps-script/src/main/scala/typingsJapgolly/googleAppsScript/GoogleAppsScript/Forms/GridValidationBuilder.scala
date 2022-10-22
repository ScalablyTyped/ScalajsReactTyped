package typingsJapgolly.googleAppsScript.GoogleAppsScript.Forms

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait GridValidationBuilder extends StObject {
  
  def build(): GridValidation
  
  def requireLimitOneResponsePerColumn(): GridValidationBuilder
}
object GridValidationBuilder {
  
  inline def apply(
    build: CallbackTo[GridValidation],
    requireLimitOneResponsePerColumn: CallbackTo[GridValidationBuilder]
  ): GridValidationBuilder = {
    val __obj = js.Dynamic.literal(build = build.toJsFn, requireLimitOneResponsePerColumn = requireLimitOneResponsePerColumn.toJsFn)
    __obj.asInstanceOf[GridValidationBuilder]
  }
  
  extension [Self <: GridValidationBuilder](x: Self) {
    
    inline def setBuild(value: CallbackTo[GridValidation]): Self = StObject.set(x, "build", value.toJsFn)
    
    inline def setRequireLimitOneResponsePerColumn(value: CallbackTo[GridValidationBuilder]): Self = StObject.set(x, "requireLimitOneResponsePerColumn", value.toJsFn)
  }
}
