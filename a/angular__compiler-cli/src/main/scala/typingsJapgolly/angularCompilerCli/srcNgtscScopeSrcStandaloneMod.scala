package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetadataReader
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassDeclaration
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.DeclarationNode
import typingsJapgolly.angularCompilerCli.srcNgtscScopeSrcApiMod.ComponentScope
import typingsJapgolly.angularCompilerCli.srcNgtscScopeSrcApiMod.ComponentScopeReader
import typingsJapgolly.angularCompilerCli.srcNgtscScopeSrcApiMod.RemoteScope
import typingsJapgolly.angularCompilerCli.srcNgtscScopeSrcDependencyMod.DtsModuleScopeResolver
import typingsJapgolly.angularCompilerCli.srcNgtscScopeSrcLocalMod.LocalModuleScopeRegistry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscScopeSrcStandaloneMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/scope/src/standalone", "StandaloneComponentScopeReader")
  @js.native
  open class StandaloneComponentScopeReader protected ()
    extends StObject
       with ComponentScopeReader {
    def this(
      metaReader: MetadataReader,
      localModuleReader: LocalModuleScopeRegistry,
      dtsModuleReader: DtsModuleScopeResolver
    ) = this()
    
    /* private */ var cache: Any = js.native
    
    /* private */ var dtsModuleReader: Any = js.native
    
    def getRemoteScope(): Null = js.native
    /**
      * Get the `RemoteScope` required for this component, if any.
      *
      * If the component requires remote scoping, then retrieve the directives/pipes registered for
      * that component. If remote scoping is not required (the common case), returns `null`.
      */
    /* CompleteClass */
    override def getRemoteScope(clazz: ClassDeclaration[DeclarationNode]): RemoteScope | Null = js.native
    
    /* CompleteClass */
    override def getScopeForComponent(clazz: ClassDeclaration[DeclarationNode]): ComponentScope | Null = js.native
    
    /* private */ var localModuleReader: Any = js.native
    
    /* private */ var metaReader: Any = js.native
  }
}
