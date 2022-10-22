package typingsJapgolly.classValidator

import typingsJapgolly.classValidator.typesDecoratorValidationOptionsMod.ValidationOptions
import typingsJapgolly.std.PropertyDecorator
import typingsJapgolly.validator.mod.validator.IsISO8601Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorStringIsISO8601Mod {
  
  @JSImport("class-validator/types/decorator/string/IsISO8601", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsISO8601", "IS_ISO8601")
  @js.native
  val IS_ISO8601: /* "isIso8601" */ String = js.native
  
  inline def IsISO8601_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsISO8601")().asInstanceOf[PropertyDecorator]
  inline def IsISO8601_(options: Unit, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsISO8601")(options.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def IsISO8601_(options: IsISO8601Options): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsISO8601")(options.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def IsISO8601_(options: IsISO8601Options, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsISO8601")(options.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def isISO8601(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isISO8601")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isISO8601(value: Any, options: IsISO8601Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isISO8601")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
