package typingsJapgolly.typescriptServices.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "Errors")
@js.native
open class Errors ()
  extends StObject
     with typingsJapgolly.typescriptServices.TypeScript.Errors
object Errors {
  
  @JSImport("typescript-services", "Errors")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def `abstract`(): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("abstract")().asInstanceOf[js.Error]
  
  /* static member */
  inline def argument(argument: String): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("argument")(argument.asInstanceOf[js.Any]).asInstanceOf[js.Error]
  inline def argument(argument: String, message: String): js.Error = (^.asInstanceOf[js.Dynamic].applyDynamic("argument")(argument.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Error]
  
  /* static member */
  inline def argumentNull(argument: String): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("argumentNull")(argument.asInstanceOf[js.Any]).asInstanceOf[js.Error]
  
  /* static member */
  inline def argumentOutOfRange(argument: String): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("argumentOutOfRange")(argument.asInstanceOf[js.Any]).asInstanceOf[js.Error]
  
  /* static member */
  inline def invalidOperation(): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("invalidOperation")().asInstanceOf[js.Error]
  inline def invalidOperation(message: String): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("invalidOperation")(message.asInstanceOf[js.Any]).asInstanceOf[js.Error]
  
  /* static member */
  inline def notYetImplemented(): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("notYetImplemented")().asInstanceOf[js.Error]
}
