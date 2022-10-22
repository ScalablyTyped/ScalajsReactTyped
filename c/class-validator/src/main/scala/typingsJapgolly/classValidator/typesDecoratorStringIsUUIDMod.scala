package typingsJapgolly.classValidator

import typingsJapgolly.classValidator.typesDecoratorValidationOptionsMod.ValidationOptions
import typingsJapgolly.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorStringIsUUIDMod {
  
  @JSImport("class-validator/types/decorator/string/IsUUID", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsUUID", "IS_UUID")
  @js.native
  val IS_UUID: /* "isUuid" */ String = js.native
  
  inline def IsUUID_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsUUID")().asInstanceOf[PropertyDecorator]
  inline def IsUUID_(version: Unit, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsUUID")(version.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def IsUUID_(version: UUIDVersion): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsUUID")(version.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def IsUUID_(version: UUIDVersion, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsUUID")(version.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def isUUID(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUUID")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isUUID(value: Any, version: UUIDVersion): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isUUID")(value.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.classValidator.classValidatorInts.`3`
    - typingsJapgolly.classValidator.classValidatorInts.`4`
    - typingsJapgolly.classValidator.classValidatorInts.`5`
    - typingsJapgolly.classValidator.classValidatorStrings.`3`
    - typingsJapgolly.classValidator.classValidatorStrings.`4`
    - typingsJapgolly.classValidator.classValidatorStrings.`5`
    - typingsJapgolly.classValidator.classValidatorStrings.all
  */
  trait UUIDVersion extends StObject
  object UUIDVersion {
    
    inline def `3`: typingsJapgolly.classValidator.classValidatorInts.`3` = 3.asInstanceOf[typingsJapgolly.classValidator.classValidatorInts.`3`]
    
    inline def `4`: typingsJapgolly.classValidator.classValidatorInts.`4` = 4.asInstanceOf[typingsJapgolly.classValidator.classValidatorInts.`4`]
    
    inline def `5`: typingsJapgolly.classValidator.classValidatorInts.`5` = 5.asInstanceOf[typingsJapgolly.classValidator.classValidatorInts.`5`]
    
    inline def all: typingsJapgolly.classValidator.classValidatorStrings.all = "all".asInstanceOf[typingsJapgolly.classValidator.classValidatorStrings.all]
  }
}
