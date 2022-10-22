package typingsJapgolly.ow

import typingsJapgolly.std.Error
import typingsJapgolly.std.Map
import typingsJapgolly.std.ReadonlyMap
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distArgumentErrorMod {
  
  @JSImport("ow/dist/argument-error", "ArgumentError")
  @js.native
  open class ArgumentError protected ()
    extends StObject
       with Error {
    def this(message: String, context: js.Function) = this()
    def this(message: String, context: js.Function, errors: Map[String, Set[String]]) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    val validationErrors: ReadonlyMap[String, Set[String]] = js.native
  }
}
