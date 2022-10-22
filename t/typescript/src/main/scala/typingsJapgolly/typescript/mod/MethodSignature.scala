package typingsJapgolly.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.typescript.mod.ReadonlyTextRange because Already inherited
- typingsJapgolly.typescript.mod.Node because Already inherited
- typingsJapgolly.typescript.mod.Declaration because Already inherited
- typingsJapgolly.typescript.mod.NamedDeclaration because Already inherited
- typingsJapgolly.typescript.mod.TypeElement because var conflicts: _declarationBrand. Inlined _typeElementBrand, questionToken */ @js.native
trait MethodSignature
  extends StObject
     with SignatureDeclarationBase
     with HasJSDoc
     with HasModifiers
     with SignatureDeclaration {
  
  var _typeElementBrand: Any = js.native
  
  @JSName("kind")
  val kind_MethodSignature: typingsJapgolly.typescript.mod.SyntaxKind.MethodSignature = js.native
  
  @JSName("modifiers")
  val modifiers_MethodSignature: js.UndefOr[NodeArray[Modifier]] = js.native
  
  @JSName("name")
  val name_MethodSignature: PropertyName = js.native
  
  @JSName("parent")
  val parent_MethodSignature: ObjectTypeDeclaration = js.native
  
  val questionToken: js.UndefOr[QuestionToken] = js.native
}
