package typingsJapgolly.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportDeclaration
  extends StObject
     with Statement
     with HasJSDoc
     with HasModifiers {
  
  val assertClause: js.UndefOr[AssertClause] = js.native
  
  val importClause: js.UndefOr[ImportClause] = js.native
  
  @JSName("kind")
  val kind_ImportDeclaration: typingsJapgolly.typescript.mod.SyntaxKind.ImportDeclaration = js.native
  
  @JSName("modifiers")
  val modifiers_ImportDeclaration: js.UndefOr[NodeArray[Modifier]] = js.native
  
  /** If this is not a StringLiteral it will be a grammar error. */
  val moduleSpecifier: Expression = js.native
  
  @JSName("parent")
  val parent_ImportDeclaration: SourceFile | ModuleBlock = js.native
}
