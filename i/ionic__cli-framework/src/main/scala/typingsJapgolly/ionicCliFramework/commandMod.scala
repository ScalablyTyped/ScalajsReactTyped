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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib/command", JSImport.Namespace)
@js.native
object commandMod extends js.Object {
  @js.native
  abstract class BaseCommand[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected () extends js.Object {
    def this(namespace: N) = this()
    var namespace: N = js.native
    def getMetadata(): js.Promise[M] = js.native
    def run(inputs: CommandLineInputs, options: CommandLineOptions): js.Promise[Unit] = js.native
    def run(
      inputs: CommandLineInputs,
      options: CommandLineOptions,
      runtime: Partial[CommandInstanceInfo[C, N, M, I, O]]
    ): js.Promise[Unit] = js.native
    def validate(argv: CommandLineInputs): js.Promise[Unit] = js.native
  }
  
  @js.native
  class BaseCommandMap[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] () extends AliasedMap[String, CommandMapGetter[C, N, M, I, O]]
  
  @js.native
  abstract class BaseNamespace[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] () extends INamespace[C, N, M, I, O] {
    def this(parent: N) = this()
    @JSName("root")
    def root_MBaseNamespace(): N = js.native
  }
  
  @js.native
  class BaseNamespaceMap[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] () extends AliasedMap[String, NamespaceMapGetter[C, N, M, I, O]]
  
  @js.native
  abstract class Command () extends BaseCommand[
          Command, 
          Namespace, 
          CommandMetadata[CommandMetadataInput, CommandMetadataOption], 
          CommandMetadataInput, 
          CommandMetadataOption
        ]
  
  @js.native
  class CommandMap () extends AliasedMap[
          String, 
          CommandMapGetter[
            Command, 
            Namespace, 
            CommandMetadata[CommandMetadataInput, CommandMetadataOption], 
            CommandMetadataInput, 
            CommandMetadataOption
          ]
        ]
  
  @js.native
  abstract class Namespace () extends BaseNamespace[
          Command, 
          Namespace, 
          CommandMetadata[CommandMetadataInput, CommandMetadataOption], 
          CommandMetadataInput, 
          CommandMetadataOption
        ]
  
  @js.native
  class NamespaceMap () extends AliasedMap[
          String, 
          NamespaceMapGetter[
            Command, 
            Namespace, 
            CommandMetadata[CommandMetadataInput, CommandMetadataOption], 
            CommandMetadataInput, 
            CommandMetadataOption
          ]
        ]
  
  val CommandMapDefault: js.Symbol = js.native
  def generateCommandPath[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](cmd: C): js.Promise[js.Array[CommandPathItem[C, N, M, I, O]]] = js.native
}

