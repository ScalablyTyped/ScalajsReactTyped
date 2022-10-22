package typingsJapgolly.ionicCliFramework

import typingsJapgolly.ionicCliFramework.definitionsMod.CommandInstanceInfo
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandLineInputs
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandLineOptions
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandMapGetter
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadata
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadataInput
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadataOption
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandPathItem
import typingsJapgolly.ionicCliFramework.definitionsMod.ICommand
import typingsJapgolly.ionicCliFramework.definitionsMod.INamespace
import typingsJapgolly.ionicCliFramework.definitionsMod.NamespaceMapGetter
import typingsJapgolly.ionicUtilsObject.mod.AliasedMap
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommandMod {
  
  @JSImport("@ionic/cli-framework/lib/command", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("@ionic/cli-framework/lib/command", "BaseCommand")
  @js.native
  open class BaseCommand[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected () extends StObject {
    def this(namespace: N) = this()
    
    def getMetadata(): js.Promise[M] = js.native
    
    var namespace: N = js.native
    
    def run(inputs: CommandLineInputs, options: CommandLineOptions): js.Promise[Unit] = js.native
    def run(
      inputs: CommandLineInputs,
      options: CommandLineOptions,
      runtime: Partial[CommandInstanceInfo[C, N, M, I, O]]
    ): js.Promise[Unit] = js.native
    
    def validate(argv: CommandLineInputs): js.Promise[Unit] = js.native
  }
  
  @JSImport("@ionic/cli-framework/lib/command", "BaseCommandMap")
  @js.native
  open class BaseCommandMap[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] () extends AliasedMap[String, CommandMapGetter[C, N, M, I, O]]
  
  /* note: abstract class */ @JSImport("@ionic/cli-framework/lib/command", "BaseNamespace")
  @js.native
  open class BaseNamespace[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] ()
    extends StObject
       with INamespace[C, N, M, I, O] {
    def this(parent: N) = this()
    
    @JSName("root")
    def root_MBaseNamespace: N = js.native
  }
  
  @JSImport("@ionic/cli-framework/lib/command", "BaseNamespaceMap")
  @js.native
  open class BaseNamespaceMap[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] () extends AliasedMap[String, NamespaceMapGetter[C, N, M, I, O]]
  
  /* note: abstract class */ @JSImport("@ionic/cli-framework/lib/command", "Command")
  @js.native
  open class Command protected () extends BaseCommand[
          Command, 
          Namespace, 
          CommandMetadata[CommandMetadataInput, CommandMetadataOption], 
          CommandMetadataInput, 
          CommandMetadataOption
        ] {
    def this(namespace: Namespace) = this()
  }
  
  @JSImport("@ionic/cli-framework/lib/command", "CommandMap")
  @js.native
  open class CommandMap () extends BaseCommandMap[
          Command, 
          Namespace, 
          CommandMetadata[CommandMetadataInput, CommandMetadataOption], 
          CommandMetadataInput, 
          CommandMetadataOption
        ]
  
  @JSImport("@ionic/cli-framework/lib/command", "CommandMapDefault")
  @js.native
  val CommandMapDefault: js.Symbol = js.native
  
  /* note: abstract class */ @JSImport("@ionic/cli-framework/lib/command", "Namespace")
  @js.native
  open class Namespace () extends BaseNamespace[
          Command, 
          Namespace, 
          CommandMetadata[CommandMetadataInput, CommandMetadataOption], 
          CommandMetadataInput, 
          CommandMetadataOption
        ] {
    def this(parent: Namespace) = this()
  }
  
  @JSImport("@ionic/cli-framework/lib/command", "NamespaceMap")
  @js.native
  open class NamespaceMap () extends BaseNamespaceMap[
          Command, 
          Namespace, 
          CommandMetadata[CommandMetadataInput, CommandMetadataOption], 
          CommandMetadataInput, 
          CommandMetadataOption
        ]
  
  inline def generateCommandPath[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](cmd: C): js.Promise[js.Array[CommandPathItem[C, N, M, I, O]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateCommandPath")(cmd.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[CommandPathItem[C, N, M, I, O]]]]
}
