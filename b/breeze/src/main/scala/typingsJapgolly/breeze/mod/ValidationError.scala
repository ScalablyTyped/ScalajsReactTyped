package typingsJapgolly.breeze.mod

import typingsJapgolly.breeze.breeze.IProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("breeze", "ValidationError")
@js.native
open class ValidationError protected ()
  extends StObject
     with typingsJapgolly.breeze.breeze.ValidationError {
  def this(
    validator: typingsJapgolly.breeze.breeze.Validator,
    context: Any,
    errorMessage: String,
    key: String
  ) = this()
  
  /* CompleteClass */
  var context: Any = js.native
  
  /* CompleteClass */
  var errorMessage: String = js.native
  
  /* CompleteClass */
  override def getKey(validator: typingsJapgolly.breeze.breeze.Validator, property: String): String = js.native
  
  /* CompleteClass */
  var key: String = js.native
  
  /* CompleteClass */
  var property: IProperty = js.native
  
  /* CompleteClass */
  var propertyName: String = js.native
  
  /* CompleteClass */
  var validator: typingsJapgolly.breeze.breeze.Validator = js.native
}
