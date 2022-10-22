package typingsJapgolly.classValidator

import typingsJapgolly.classValidator.typesDecoratorValidationOptionsMod.ValidationOptions
import typingsJapgolly.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorStringIsISBNMod {
  
  @JSImport("class-validator/types/decorator/string/IsISBN", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsISBN", "IS_ISBN")
  @js.native
  val IS_ISBN: /* "isIsbn" */ String = js.native
  
  inline def IsISBN_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsISBN")().asInstanceOf[PropertyDecorator]
  inline def IsISBN_(version: Unit, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsISBN")(version.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def IsISBN_(version: IsISBNVersion): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsISBN")(version.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def IsISBN_(version: IsISBNVersion, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsISBN")(version.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def isISBN(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isISBN")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isISBN(value: Any, version: IsISBNVersion): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isISBN")(value.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.classValidator.classValidatorInts.`10`
    - typingsJapgolly.classValidator.classValidatorInts.`13`
    - typingsJapgolly.classValidator.classValidatorStrings.`10`
    - typingsJapgolly.classValidator.classValidatorStrings.`13`
  */
  trait IsISBNVersion extends StObject
  object IsISBNVersion {
    
    inline def `10`: typingsJapgolly.classValidator.classValidatorInts.`10` = 10.asInstanceOf[typingsJapgolly.classValidator.classValidatorInts.`10`]
    
    inline def `13`: typingsJapgolly.classValidator.classValidatorInts.`13` = 13.asInstanceOf[typingsJapgolly.classValidator.classValidatorInts.`13`]
  }
}
