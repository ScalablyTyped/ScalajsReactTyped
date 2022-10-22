package typingsJapgolly.angularCli

import typingsJapgolly.angularCli.angularCliBooleans.`false`
import typingsJapgolly.angularCli.srcCommandBuilderCommandModuleMod.CommandContext
import typingsJapgolly.angularCli.srcCommandBuilderCommandModuleMod.CommandModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCommandsMakeThisAwesomeCliMod {
  
  @JSImport("@angular/cli/src/commands/make-this-awesome/cli", "AwesomeCommandModule")
  @js.native
  open class AwesomeCommandModule protected ()
    extends CommandModule[js.Object] {
    def this(context: CommandContext) = this()
    
    @JSName("deprecated")
    var deprecated_AwesomeCommandModule: Boolean = js.native
    
    @JSName("describe")
    var describe_AwesomeCommandModule: `false` = js.native
    
    def run(): Unit = js.native
  }
}
