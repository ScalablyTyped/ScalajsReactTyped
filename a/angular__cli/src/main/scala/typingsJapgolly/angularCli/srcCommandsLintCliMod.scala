package typingsJapgolly.angularCli

import typingsJapgolly.angularCli.srcCommandBuilderArchitectBaseCommandModuleMod.MissingTargetChoice
import typingsJapgolly.angularCli.srcCommandBuilderArchitectCommandModuleMod.ArchitectCommandModule
import typingsJapgolly.angularCli.srcCommandBuilderCommandModuleMod.CommandContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCommandsLintCliMod {
  
  @JSImport("@angular/cli/src/commands/lint/cli", "LintCommandModule")
  @js.native
  open class LintCommandModule protected () extends ArchitectCommandModule {
    def this(context: CommandContext) = this()
    
    @JSName("describe")
    var describe_LintCommandModule: String = js.native
    
    @JSName("longDescriptionPath")
    var longDescriptionPath_LintCommandModule: String = js.native
    
    @JSName("missingTargetChoices")
    var missingTargetChoices_LintCommandModule: js.Array[MissingTargetChoice] = js.native
  }
}
