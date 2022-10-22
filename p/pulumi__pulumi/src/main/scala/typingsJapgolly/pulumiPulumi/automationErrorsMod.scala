package typingsJapgolly.pulumiPulumi

import typingsJapgolly.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object automationErrorsMod {
  
  @JSImport("@pulumi/pulumi/automation/errors", "CommandError")
  @js.native
  open class CommandError ()
    extends StObject
       with Error {
    
    /* private */ var commandResult: Any = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("@pulumi/pulumi/automation/errors", "ConcurrentUpdateError")
  @js.native
  open class ConcurrentUpdateError () extends CommandError
  
  @JSImport("@pulumi/pulumi/automation/errors", "StackAlreadyExistsError")
  @js.native
  open class StackAlreadyExistsError () extends CommandError
  
  @JSImport("@pulumi/pulumi/automation/errors", "StackNotFoundError")
  @js.native
  open class StackNotFoundError () extends CommandError
}
