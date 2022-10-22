package typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManuallyValidatedOption[T] extends StObject {
  
  var __validated: T
}
object ManuallyValidatedOption {
  
  inline def apply[T](__validated: T): ManuallyValidatedOption[T] = {
    val __obj = js.Dynamic.literal(__validated = __validated.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManuallyValidatedOption[T]]
  }
  
  extension [Self <: ManuallyValidatedOption[?], T](x: Self & ManuallyValidatedOption[T]) {
    
    inline def set__validated(value: T): Self = StObject.set(x, "__validated", value.asInstanceOf[js.Any])
  }
}
