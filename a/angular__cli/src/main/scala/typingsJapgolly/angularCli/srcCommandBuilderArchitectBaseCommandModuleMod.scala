package typingsJapgolly.angularCli

import typingsJapgolly.angularCli.angularCliInts.`1`
import typingsJapgolly.angularCli.srcCommandBuilderCommandModuleMod.CommandContext
import typingsJapgolly.angularCli.srcCommandBuilderCommandModuleMod.CommandModule
import typingsJapgolly.angularCli.srcCommandBuilderCommandModuleMod.OtherOptions
import typingsJapgolly.angularCli.srcCommandBuilderUtilitiesJsonSchemaMod.Option
import typingsJapgolly.angularDevkitArchitect.mod.Architect
import typingsJapgolly.angularDevkitArchitect.srcApiMod.Target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCommandBuilderArchitectBaseCommandModuleMod {
  
  /* note: abstract class */ @JSImport("@angular/cli/src/command-builder/architect-base-command-module", "ArchitectBaseCommandModule")
  @js.native
  open class ArchitectBaseCommandModule[T /* <: js.Object */] protected () extends CommandModule[T] {
    def this(context: CommandContext) = this()
    
    /* private */ var _architect: Any = js.native
    
    /* private */ var _architectHost: Any = js.native
    
    /* protected */ def getArchitect(): Architect = js.native
    
    /* protected */ def getArchitectHost(): Any = js.native
    
    /* protected */ def getArchitectTarget(): String = js.native
    
    /* protected */ def getArchitectTargetOptions(target: Target): js.Promise[js.Array[Option]] = js.native
    
    /* private */ var getMissingTargetPackageToInstall: Any = js.native
    
    /* protected */ val missingTargetChoices: js.UndefOr[js.Array[MissingTargetChoice]] = js.native
    
    /* protected */ def onMissingTarget(defaultMessage: String): js.Promise[`1`] = js.native
    
    /* protected */ def runSingleTarget(target: Target, options: OtherOptions): js.Promise[Double] = js.native
    
    /* private */ var warnOnMissingNodeModules: Any = js.native
  }
  
  trait MissingTargetChoice extends StObject {
    
    var name: String
    
    var value: String
  }
  object MissingTargetChoice {
    
    inline def apply(name: String, value: String): MissingTargetChoice = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[MissingTargetChoice]
    }
    
    extension [Self <: MissingTargetChoice](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
