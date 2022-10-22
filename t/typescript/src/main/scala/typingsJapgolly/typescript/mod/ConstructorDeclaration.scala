package typingsJapgolly.typescript.mod

import typingsJapgolly.typescript.mod.SyntaxKind.Constructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.typescript.mod.ReadonlyTextRange because Already inherited
- typingsJapgolly.typescript.mod.Node because Already inherited
- typingsJapgolly.typescript.mod.Declaration because Already inherited
- typingsJapgolly.typescript.mod.NamedDeclaration because Already inherited
- typingsJapgolly.typescript.mod.ClassElement because var conflicts: _declarationBrand. Inlined _classElementBrand */ @js.native
trait ConstructorDeclaration
  extends StObject
     with FunctionLikeDeclarationBase
     with FunctionLikeDeclaration
     with HasJSDoc
     with HasModifiers
     with SignatureDeclaration {
  
  var _classElementBrand: Any = js.native
  
  @JSName("body")
  val body_ConstructorDeclaration: js.UndefOr[FunctionBody] = js.native
  
  @JSName("kind")
  val kind_ConstructorDeclaration: Constructor = js.native
  
  @JSName("modifiers")
  val modifiers_ConstructorDeclaration: js.UndefOr[NodeArray[Modifier]] = js.native
  
  @JSName("parent")
  val parent_ConstructorDeclaration: ClassLikeDeclaration = js.native
}
