package typingsJapgolly.ionic

import typingsJapgolly.ionic.definitionsMod.CommandMetadata
import typingsJapgolly.ionic.definitionsMod.CommandMetadataOption
import typingsJapgolly.ionic.definitionsMod.ICommand
import typingsJapgolly.ionic.definitionsMod.INamespace
import typingsJapgolly.ionic.definitionsMod.IProject
import typingsJapgolly.ionic.definitionsMod.IonicEnvironment
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadataInput
import typingsJapgolly.ionicCliFramework.mod.BaseCommandMap
import typingsJapgolly.ionicCliFramework.mod.BaseNamespace
import typingsJapgolly.ionicCliFramework.mod.BaseNamespaceMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNamespaceMod {
  
  @JSImport("ionic/lib/namespace", "CommandMap")
  @js.native
  open class CommandMap () extends BaseCommandMap[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption]
  
  /* note: abstract class */ /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.ionicCliFramework.definitionsMod.INamespace because Already inherited
  - typingsJapgolly.ionic.definitionsMod.INamespace because var conflicts: parent, root. Inlined env, project */ @JSImport("ionic/lib/namespace", "Namespace")
  @js.native
  open class Namespace () extends BaseNamespace[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption] {
    def this(parent: INamespace) = this()
    
    def env: IonicEnvironment = js.native
    @JSName("env")
    var env_FNamespace: IonicEnvironment = js.native
    
    def project: js.UndefOr[IProject] = js.native
    @JSName("project")
    var project_FNamespace: js.UndefOr[IProject] = js.native
  }
  
  @JSImport("ionic/lib/namespace", "NamespaceMap")
  @js.native
  open class NamespaceMap () extends BaseNamespaceMap[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption]
}
