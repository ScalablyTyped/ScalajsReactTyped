package typingsJapgolly.errorCause

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.std.ErrorOptions
import typingsJapgolly.std.RangeErrorConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseRangeErrorMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("error-cause/base/RangeError", JSImport.Default)
  @js.native
  /* standard es5 */
  open class default ()
    extends StObject
       with typingsJapgolly.std.Error {
    def this(message: String) = this()
    def this(message: String, options: ErrorOptions) = this()
    def this(message: Unit, options: ErrorOptions) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  @JSImport("error-cause/base/RangeError", JSImport.Default)
  @js.native
  val default: RangeErrorConstructor = js.native
  
  type _To = RangeErrorConstructor
  
  /* This means you don't have to write `default`, but can instead just say `baseRangeErrorMod.foo` */
  override def _to: RangeErrorConstructor = default
}
