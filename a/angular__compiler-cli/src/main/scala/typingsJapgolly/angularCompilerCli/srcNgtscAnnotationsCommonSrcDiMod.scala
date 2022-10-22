package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompiler.mod.R3DependencyMetadata
import typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.invalid
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassDeclaration
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.CtorParameter
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.DeclarationNode
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.ReflectionHost
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.UnavailableValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscAnnotationsCommonSrcDiMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/annotations/common/src/di", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getConstructorDependencies(clazz: ClassDeclaration[DeclarationNode], reflector: ReflectionHost, isCore: Boolean): ConstructorDeps | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getConstructorDependencies")(clazz.asInstanceOf[js.Any], reflector.asInstanceOf[js.Any], isCore.asInstanceOf[js.Any])).asInstanceOf[ConstructorDeps | Null]
  
  inline def getValidConstructorDependencies(clazz: ClassDeclaration[DeclarationNode], reflector: ReflectionHost, isCore: Boolean): js.Array[R3DependencyMetadata] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getValidConstructorDependencies")(clazz.asInstanceOf[js.Any], reflector.asInstanceOf[js.Any], isCore.asInstanceOf[js.Any])).asInstanceOf[js.Array[R3DependencyMetadata] | Null]
  
  inline def unwrapConstructorDependencies(): js.Array[R3DependencyMetadata] | invalid | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("unwrapConstructorDependencies")().asInstanceOf[js.Array[R3DependencyMetadata] | invalid | Null]
  inline def unwrapConstructorDependencies(deps: ConstructorDeps): js.Array[R3DependencyMetadata] | invalid | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("unwrapConstructorDependencies")(deps.asInstanceOf[js.Any]).asInstanceOf[js.Array[R3DependencyMetadata] | invalid | Null]
  
  inline def validateConstructorDependencies(clazz: ClassDeclaration[DeclarationNode]): js.Array[R3DependencyMetadata] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("validateConstructorDependencies")(clazz.asInstanceOf[js.Any]).asInstanceOf[js.Array[R3DependencyMetadata] | Null]
  inline def validateConstructorDependencies(clazz: ClassDeclaration[DeclarationNode], deps: ConstructorDeps): js.Array[R3DependencyMetadata] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("validateConstructorDependencies")(clazz.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[js.Array[R3DependencyMetadata] | Null]
  
  trait ConstructorDepError extends StObject {
    
    var index: Double
    
    var param: CtorParameter
    
    var reason: UnavailableValue
  }
  object ConstructorDepError {
    
    inline def apply(index: Double, param: CtorParameter, reason: UnavailableValue): ConstructorDepError = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], param = param.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConstructorDepError]
    }
    
    extension [Self <: ConstructorDepError](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setParam(value: CtorParameter): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
      
      inline def setReason(value: UnavailableValue): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.angularCompilerCli.anon.Deps
    - typingsJapgolly.angularCompilerCli.anon.Errors
  */
  trait ConstructorDeps extends StObject
  object ConstructorDeps {
    
    inline def Deps(deps: js.Array[R3DependencyMetadata]): typingsJapgolly.angularCompilerCli.anon.Deps = {
      val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.angularCompilerCli.anon.Deps]
    }
    
    inline def Errors(deps: Null, errors: js.Array[ConstructorDepError]): typingsJapgolly.angularCompilerCli.anon.Errors = {
      val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.angularCompilerCli.anon.Errors]
    }
  }
}
