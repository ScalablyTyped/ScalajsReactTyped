package typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod

import typingsJapgolly.typescript.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.ConcreteDecorator
  - typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.SyntheticDecorator
*/
trait Decorator extends StObject
object Decorator {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/reflection/src/host", "Decorator")
  @js.native
  val ^ : js.Any = js.native
  
  inline def nodeForError(decorator: Decorator): Node = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeForError")(decorator.asInstanceOf[js.Any]).asInstanceOf[Node]
}
