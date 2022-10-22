package typingsJapgolly.angularCli

import typingsJapgolly.angularCli.srcCommandBuilderArchitectBaseCommandModuleMod.MissingTargetChoice
import typingsJapgolly.angularCli.srcCommandBuilderArchitectCommandModuleMod.ArchitectCommandModule
import typingsJapgolly.angularCli.srcCommandBuilderCommandModuleMod.CommandContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCommandsDeployCliMod {
  
  @JSImport("@angular/cli/src/commands/deploy/cli", "DeployCommandModule")
  @js.native
  open class DeployCommandModule protected () extends ArchitectCommandModule {
    def this(context: CommandContext) = this()
    
    @JSName("describe")
    var describe_DeployCommandModule: String = js.native
    
    @JSName("longDescriptionPath")
    var longDescriptionPath_DeployCommandModule: String = js.native
    
    @JSName("missingTargetChoices")
    var missingTargetChoices_DeployCommandModule: js.Array[MissingTargetChoice] = js.native
  }
}
