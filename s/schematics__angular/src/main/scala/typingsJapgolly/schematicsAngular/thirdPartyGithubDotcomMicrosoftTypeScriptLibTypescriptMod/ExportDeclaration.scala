package typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportDeclaration
  extends StObject
     with DeclarationStatement
     with HasJSDoc
     with HasModifiers {
  
  val assertClause: js.UndefOr[AssertClause] = js.native
  
  /** Will not be assigned in the case of `export * from "foo";` */
  val exportClause: js.UndefOr[NamedExportBindings] = js.native
  
  val isTypeOnly: Boolean = js.native
  
  @JSName("kind")
  val kind_ExportDeclaration: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.SyntaxKind.ExportDeclaration = js.native
  
  @JSName("modifiers")
  val modifiers_ExportDeclaration: js.UndefOr[NodeArray[Modifier]] = js.native
  
  /** If this is not a StringLiteral it will be a grammar error. */
  val moduleSpecifier: js.UndefOr[Expression] = js.native
  
  @JSName("parent")
  val parent_ExportDeclaration: SourceFile | ModuleBlock = js.native
}
