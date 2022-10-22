package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.ngccSrcDependenciesDependencyHostMod.DependencyHostBase
import typingsJapgolly.angularCompilerCli.ngccSrcDependenciesModuleResolverMod.ModuleResolver
import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.ReadonlyFileSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcDependenciesUmdDependencyHostMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/dependencies/umd_dependency_host", "UmdDependencyHost")
  @js.native
  open class UmdDependencyHost protected () extends DependencyHostBase {
    def this(fs: ReadonlyFileSystem, moduleResolver: ModuleResolver) = this()
  }
}
