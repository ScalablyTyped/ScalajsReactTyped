package typingsJapgolly.strongholdPayJs.mod.global.Stronghold

import typingsJapgolly.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Stronghold.StrongholdPayError")
@js.native
open class StrongholdPayError protected ()
  extends StObject
     with Error {
  def this(`type`: ERROR_TYPE, code: ERROR_CODE, message: String) = this()
  def this(`type`: ERROR_TYPE, code: ERROR_CODE, message: String, property: String) = this()
  
  var code: ERROR_CODE = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var message: String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var name: String = js.native
  
  var property: String | Null = js.native
  
  var `type`: ERROR_TYPE = js.native
}
