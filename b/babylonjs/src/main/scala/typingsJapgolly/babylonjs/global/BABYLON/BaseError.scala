package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSGlobal("BABYLON.BaseError")
@js.native
open class BaseError ()
  extends StObject
     with Error {
  
  /* standard es5 */
  /* CompleteClass */
  var message: String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var name: String = js.native
}
/* static members */
object BaseError {
  
  @JSGlobal("BABYLON.BaseError")
  @js.native
  val ^ : js.Any = js.native
  
  inline def _setPrototypeOf(o: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("_setPrototypeOf")(o.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def _setPrototypeOf(o: Any, proto: js.Object): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_setPrototypeOf")(o.asInstanceOf[js.Any], proto.asInstanceOf[js.Any])).asInstanceOf[Any]
}
