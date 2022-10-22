package typingsJapgolly.classValidator

import typingsJapgolly.classValidator.typesDecoratorValidationOptionsMod.ValidationOptions
import typingsJapgolly.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorDateMinDateMod {
  
  @JSImport("class-validator/types/decorator/date/MinDate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/date/MinDate", "MIN_DATE")
  @js.native
  val MIN_DATE: /* "minDate" */ String = js.native
  
  inline def MinDate_(date: js.Date): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("MinDate")(date.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def MinDate_(date: js.Date, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("MinDate")(date.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def minDate(date: Any, minDate: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("minDate")(date.asInstanceOf[js.Any], minDate.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
