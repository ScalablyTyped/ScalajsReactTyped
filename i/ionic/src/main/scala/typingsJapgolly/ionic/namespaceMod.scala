package typingsJapgolly.ionic

import typingsJapgolly.ionic.definitionsMod.CommandMetadata
import typingsJapgolly.ionic.definitionsMod.CommandMetadataOption
import typingsJapgolly.ionic.definitionsMod.ICommand
import typingsJapgolly.ionic.definitionsMod.INamespace
import typingsJapgolly.ionic.definitionsMod.IProject
import typingsJapgolly.ionic.definitionsMod.IonicEnvironment
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandMapGetter
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadataInput
import typingsJapgolly.ionicCliFramework.definitionsMod.NamespaceMapGetter
import typingsJapgolly.ionicCliFramework.mod.BaseNamespace
import typingsJapgolly.ionicUtilsObject.mod.AliasedMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/namespace", JSImport.Namespace)
@js.native
object namespaceMod extends js.Object {
  @js.native
  class CommandMap () extends AliasedMap[
          String, 
          CommandMapGetter[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption]
        ]
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typingsJapgolly.ionicCliFramework.definitionsMod.INamespace because Already inherited
  - typingsJapgolly.ionic.definitionsMod.INamespace because var conflicts: parent, root. Inlined env, project */ @js.native
  abstract class Namespace () extends BaseNamespace[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption] {
    def this(parent: INamespace) = this()
    @JSName("env")
    var env_FNamespace: IonicEnvironment = js.native
    @JSName("project")
    var project_FNamespace: js.UndefOr[IProject] = js.native
    def env(): IonicEnvironment = js.native
    def project(): js.UndefOr[IProject] = js.native
  }
  
  @js.native
  class NamespaceMap () extends AliasedMap[
          String, 
          NamespaceMapGetter[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption]
        ]
  
}

