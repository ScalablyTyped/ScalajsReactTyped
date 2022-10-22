package typingsJapgolly.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.typescript.mod.ReadonlyTextRange because Already inherited
- typingsJapgolly.typescript.mod.Node because Already inherited
- typingsJapgolly.typescript.mod.Declaration because Already inherited
- typingsJapgolly.typescript.mod.NamedDeclaration because Already inherited
- typingsJapgolly.typescript.mod.DeclarationStatement because var conflicts: _declarationBrand. Inlined  */ @js.native
trait ClassDeclaration
  extends StObject
     with ClassLikeDeclarationBase
     with ClassLikeDeclaration
     with HasDecorators
     with HasModifiers
     with Statement {
  
  @JSName("kind")
  val kind_ClassDeclaration: typingsJapgolly.typescript.mod.SyntaxKind.ClassDeclaration = js.native
}
