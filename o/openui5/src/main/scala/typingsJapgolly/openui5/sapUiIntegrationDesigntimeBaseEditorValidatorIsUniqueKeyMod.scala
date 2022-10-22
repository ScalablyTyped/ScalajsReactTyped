package typingsJapgolly.openui5

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.openui5.anon.CurrentKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiIntegrationDesigntimeBaseEditorValidatorIsUniqueKeyMod extends Shortcut {
  
  @JSImport("sap/ui/integration/designtime/baseEditor/validator/IsUniqueKey", JSImport.Default)
  @js.native
  val default: IsUniqueKey = js.native
  
  /**
    * @SINCE 1.81
    * @EXPERIMENTAL
    *
    * Validates if the provided key is unique in a list of given keys.
    */
  trait IsUniqueKey extends StObject {
    
    /**
      * Validator function
      *
      * @returns Validation result
      */
    def validate(
      /**
      * New key value to validate
      */
    sValue: String,
      /**
      * Validator config
      */
    oConfig: CurrentKey
    ): Boolean
  }
  object IsUniqueKey {
    
    inline def apply(validate: (String, CurrentKey) => Boolean): IsUniqueKey = {
      val __obj = js.Dynamic.literal(validate = js.Any.fromFunction2(validate))
      __obj.asInstanceOf[IsUniqueKey]
    }
    
    extension [Self <: IsUniqueKey](x: Self) {
      
      inline def setValidate(value: (String, CurrentKey) => Boolean): Self = StObject.set(x, "validate", js.Any.fromFunction2(value))
    }
  }
  
  type _To = IsUniqueKey
  
  /* This means you don't have to write `default`, but can instead just say `sapUiIntegrationDesigntimeBaseEditorValidatorIsUniqueKeyMod.foo` */
  override def _to: IsUniqueKey = default
}
