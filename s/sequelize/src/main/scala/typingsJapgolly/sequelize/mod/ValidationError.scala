package typingsJapgolly.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidationError
  extends StObject
     with BaseError {
  
  /** Array of ValidationErrorItem objects describing the validation errors */
  var errors: js.Array[ValidationErrorItem] = js.native
  
  /**
    * Gets all validation error items for the path / field specified.
    *
    * @param path The path to be checked for error items
    */
  def get(path: String): js.Array[ValidationErrorItem] = js.native
}
