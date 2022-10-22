package typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod

import typingsJapgolly.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.ConcreteDeclaration[T]
  - typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.InlineDeclaration
*/
trait Declaration[T /* <: typingsJapgolly.typescript.mod.Declaration */] extends StObject
object Declaration {
  
  inline def ConcreteDeclaration[T /* <: typingsJapgolly.typescript.mod.Declaration */](node: T): typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.ConcreteDeclaration[T] = {
    val __obj = js.Dynamic.literal(kind = 0, node = node.asInstanceOf[js.Any], identity = null, known = null, viaModule = null)
    __obj.asInstanceOf[typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.ConcreteDeclaration[T]]
  }
  
  inline def InlineDeclaration(node: Exclude[DeclarationNode, typingsJapgolly.typescript.mod.Declaration]): typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.InlineDeclaration = {
    val __obj = js.Dynamic.literal(kind = 1, node = node.asInstanceOf[js.Any], known = null, viaModule = null)
    __obj.asInstanceOf[typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.InlineDeclaration]
  }
}
