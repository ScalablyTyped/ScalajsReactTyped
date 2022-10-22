package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.anon.ClassDeclarationClassDecl
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.ReflectionHost
import typingsJapgolly.angularCompilerCli.srcNgtscTypecheckApiApiMod.TypeCtorMetadata
import typingsJapgolly.angularCompilerCli.srcNgtscTypecheckSrcTcbUtilMod.ReferenceEmitEnvironment
import typingsJapgolly.typescript.mod.EntityName
import typingsJapgolly.typescript.mod.MethodDeclaration
import typingsJapgolly.typescript.mod.Statement
import typingsJapgolly.typescript.mod.TypeParameterDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscTypecheckSrcTypeConstructorMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck/src/type_constructor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateInlineTypeCtor(node: ClassDeclarationClassDecl, meta: TypeCtorMetadata): MethodDeclaration = (^.asInstanceOf[js.Dynamic].applyDynamic("generateInlineTypeCtor")(node.asInstanceOf[js.Any], meta.asInstanceOf[js.Any])).asInstanceOf[MethodDeclaration]
  
  inline def generateTypeCtorDeclarationFn(node: ClassDeclarationClassDecl, meta: TypeCtorMetadata, nodeTypeRef: EntityName): Statement = (^.asInstanceOf[js.Dynamic].applyDynamic("generateTypeCtorDeclarationFn")(node.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], nodeTypeRef.asInstanceOf[js.Any])).asInstanceOf[Statement]
  inline def generateTypeCtorDeclarationFn(
    node: ClassDeclarationClassDecl,
    meta: TypeCtorMetadata,
    nodeTypeRef: EntityName,
    typeParams: js.Array[TypeParameterDeclaration]
  ): Statement = (^.asInstanceOf[js.Dynamic].applyDynamic("generateTypeCtorDeclarationFn")(node.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], nodeTypeRef.asInstanceOf[js.Any], typeParams.asInstanceOf[js.Any])).asInstanceOf[Statement]
  
  inline def requiresInlineTypeCtor(node: ClassDeclarationClassDecl, host: ReflectionHost, env: ReferenceEmitEnvironment): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("requiresInlineTypeCtor")(node.asInstanceOf[js.Any], host.asInstanceOf[js.Any], env.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
