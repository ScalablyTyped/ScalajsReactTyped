package typingsJapgolly.angularCli

import typingsJapgolly.angularCli.srcCommandBuilderArchitectBaseCommandModuleMod.MissingTargetChoice
import typingsJapgolly.angularCli.srcCommandBuilderArchitectCommandModuleMod.ArchitectCommandModule
import typingsJapgolly.angularCli.srcCommandBuilderCommandModuleMod.CommandContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCommandsE2eCliMod {
  
  @JSImport("@angular/cli/src/commands/e2e/cli", "E2eCommandModule")
  @js.native
  open class E2eCommandModule protected () extends ArchitectCommandModule {
    def this(context: CommandContext) = this()
    
    @JSName("aliases")
    var aliases_E2eCommandModule: js.Array[String] = js.native
    
    @JSName("describe")
    var describe_E2eCommandModule: String = js.native
    
    @JSName("missingTargetChoices")
    var missingTargetChoices_E2eCommandModule: js.Array[MissingTargetChoice] = js.native
  }
}
