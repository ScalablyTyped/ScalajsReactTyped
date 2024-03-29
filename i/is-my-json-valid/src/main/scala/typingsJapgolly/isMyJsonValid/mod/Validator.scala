package typingsJapgolly.isMyJsonValid.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Validator[Schema /* <: AnySchema */, Output] extends StObject {
  
  def apply(input: Any): /* is Output */ Boolean = js.native
  def apply(input: Any, options: Any): /* is Output */ Boolean = js.native
  
  var errors: js.Array[ValidationError] = js.native
  
  def toJSON(): Schema = js.native
}
