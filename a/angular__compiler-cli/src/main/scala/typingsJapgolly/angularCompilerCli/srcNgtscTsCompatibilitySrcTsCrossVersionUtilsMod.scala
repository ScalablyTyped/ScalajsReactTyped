package typingsJapgolly.angularCompilerCli

import typingsJapgolly.typescript.mod.AssertClause
import typingsJapgolly.typescript.mod.AsteriskToken
import typingsJapgolly.typescript.mod.BindingName
import typingsJapgolly.typescript.mod.Block
import typingsJapgolly.typescript.mod.ClassDeclaration
import typingsJapgolly.typescript.mod.ClassElement
import typingsJapgolly.typescript.mod.ConstructorDeclaration
import typingsJapgolly.typescript.mod.Decorator
import typingsJapgolly.typescript.mod.DotDotDotToken
import typingsJapgolly.typescript.mod.ExclamationToken
import typingsJapgolly.typescript.mod.Expression
import typingsJapgolly.typescript.mod.GetAccessorDeclaration
import typingsJapgolly.typescript.mod.HeritageClause
import typingsJapgolly.typescript.mod.Identifier
import typingsJapgolly.typescript.mod.ImportClause
import typingsJapgolly.typescript.mod.ImportDeclaration
import typingsJapgolly.typescript.mod.MethodDeclaration
import typingsJapgolly.typescript.mod.Modifier
import typingsJapgolly.typescript.mod.Node
import typingsJapgolly.typescript.mod.ParameterDeclaration
import typingsJapgolly.typescript.mod.PropertyDeclaration
import typingsJapgolly.typescript.mod.PropertyName
import typingsJapgolly.typescript.mod.QuestionToken
import typingsJapgolly.typescript.mod.SetAccessorDeclaration
import typingsJapgolly.typescript.mod.TypeNode
import typingsJapgolly.typescript.mod.TypeParameterDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscTsCompatibilitySrcTsCrossVersionUtilsMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/ts_compatibility/src/ts_cross_version_utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def combineModifiers(): js.UndefOr[js.Array[ModifierLike]] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineModifiers")().asInstanceOf[js.UndefOr[js.Array[ModifierLike]]]
  inline def combineModifiers(decorators: js.Array[Decorator]): js.UndefOr[js.Array[ModifierLike]] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineModifiers")(decorators.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[ModifierLike]]]
  inline def combineModifiers(decorators: js.Array[Decorator], modifiers: js.Array[ModifierLike]): js.UndefOr[js.Array[ModifierLike]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineModifiers")(decorators.asInstanceOf[js.Any], modifiers.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[ModifierLike]]]
  inline def combineModifiers(decorators: Unit, modifiers: js.Array[ModifierLike]): js.UndefOr[js.Array[ModifierLike]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineModifiers")(decorators.asInstanceOf[js.Any], modifiers.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[ModifierLike]]]
  
  @JSImport("@angular/compiler-cli/src/ngtsc/ts_compatibility/src/ts_cross_version_utils", "createClassDeclaration")
  @js.native
  val createClassDeclaration: Ts48CreateClassDeclarationFn = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/ts_compatibility/src/ts_cross_version_utils", "createGetAccessorDeclaration")
  @js.native
  val createGetAccessorDeclaration: Ts48CreateGetAccessorDeclarationFn = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/ts_compatibility/src/ts_cross_version_utils", "createMethodDeclaration")
  @js.native
  val createMethodDeclaration: Ts48CreateMethodDeclarationFn = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/ts_compatibility/src/ts_cross_version_utils", "createPropertyDeclaration")
  @js.native
  val createPropertyDeclaration: Ts48CreatePropertyDeclarationFn = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/ts_compatibility/src/ts_cross_version_utils", "createSetAccessorDeclaration")
  @js.native
  val createSetAccessorDeclaration: Ts48CreateSetAccessorDeclarationFn = js.native
  
  inline def getDecorators(node: Node): js.UndefOr[js.Array[Decorator]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDecorators")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[Decorator]]]
  
  inline def getModifiers(node: Node): js.UndefOr[js.Array[Modifier]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getModifiers")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[Modifier]]]
  
  @JSImport("@angular/compiler-cli/src/ngtsc/ts_compatibility/src/ts_cross_version_utils", "updateClassDeclaration")
  @js.native
  val updateClassDeclaration: Ts48UpdateClassDeclarationFn = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/ts_compatibility/src/ts_cross_version_utils", "updateConstructorDeclaration")
  @js.native
  val updateConstructorDeclaration: Ts48UpdateConstructorDeclarationFn = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/ts_compatibility/src/ts_cross_version_utils", "updateGetAccessorDeclaration")
  @js.native
  val updateGetAccessorDeclaration: Ts48UpdateGetAccessorDeclarationFn = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/ts_compatibility/src/ts_cross_version_utils", "updateImportDeclaration")
  @js.native
  val updateImportDeclaration: Ts48UpdateImportDeclarationFn = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/ts_compatibility/src/ts_cross_version_utils", "updateMethodDeclaration")
  @js.native
  val updateMethodDeclaration: Ts48UpdateMethodDeclarationFn = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/ts_compatibility/src/ts_cross_version_utils", "updateParameterDeclaration")
  @js.native
  val updateParameterDeclaration: Ts48UpdateParameterDeclarationFn = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/ts_compatibility/src/ts_cross_version_utils", "updatePropertyDeclaration")
  @js.native
  val updatePropertyDeclaration: Ts48UpdatePropertyDeclarationFn = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/ts_compatibility/src/ts_cross_version_utils", "updateSetAccessorDeclaration")
  @js.native
  val updateSetAccessorDeclaration: Ts48UpdateSetAccessorDeclarationFn = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/ts_compatibility/src/ts_cross_version_utils", "updateTypeParameterDeclaration")
  @js.native
  val updateTypeParameterDeclaration: Ts47UpdateTypeParameterDeclarationFn = js.native
  
  type ModifierLike = Modifier | Decorator
  
  /** Type of `ts.factory.updateTypeParameterDeclaration` in TS 4.7+. */
  type Ts47UpdateTypeParameterDeclarationFn = js.Function5[
    /* node */ TypeParameterDeclaration, 
    /* modifiers */ js.UndefOr[js.Array[Modifier]], 
    /* name */ Identifier, 
    /* constraint */ js.UndefOr[TypeNode], 
    /* defaultType */ js.UndefOr[TypeNode], 
    TypeParameterDeclaration
  ]
  
  /** Type of `ts.factory.createClassDeclaration` in TS 4.8+. */
  type Ts48CreateClassDeclarationFn = js.Function5[
    /* modifiers */ js.UndefOr[js.Array[ModifierLike]], 
    /* name */ js.UndefOr[Identifier], 
    /* typeParameters */ js.UndefOr[js.Array[TypeParameterDeclaration]], 
    /* heritageClauses */ js.UndefOr[js.Array[HeritageClause]], 
    /* members */ js.Array[ClassElement], 
    ClassDeclaration
  ]
  
  /** Type of `ts.factory.createGetAccessorDeclaration` in TS 4.8+. */
  type Ts48CreateGetAccessorDeclarationFn = js.Function5[
    /* modifiers */ js.UndefOr[js.Array[ModifierLike]], 
    /* name */ PropertyName, 
    /* parameters */ js.Array[ParameterDeclaration], 
    /* type */ js.UndefOr[TypeNode], 
    /* body */ js.UndefOr[Block], 
    GetAccessorDeclaration
  ]
  
  /** Type of `ts.factory.createMethodDeclaration` in TS 4.8+. */
  type Ts48CreateMethodDeclarationFn = js.Function8[
    /* modifiers */ js.UndefOr[js.Array[ModifierLike]], 
    /* asteriskToken */ js.UndefOr[AsteriskToken], 
    /* name */ PropertyName, 
    /* questionToken */ js.UndefOr[QuestionToken], 
    /* typeParameters */ js.UndefOr[js.Array[TypeParameterDeclaration]], 
    /* parameters */ js.Array[ParameterDeclaration], 
    /* type */ js.UndefOr[TypeNode], 
    /* body */ js.UndefOr[Block], 
    MethodDeclaration
  ]
  
  /** Type of `ts.factory.createPropertyDeclaration` in TS 4.8+. */
  type Ts48CreatePropertyDeclarationFn = js.Function5[
    /* modifiers */ js.UndefOr[js.Array[ModifierLike]], 
    /* name */ String | PropertyName, 
    /* questionOrExclamationToken */ js.UndefOr[QuestionToken | ExclamationToken], 
    /* type */ js.UndefOr[TypeNode], 
    /* initializer */ js.UndefOr[Expression], 
    PropertyDeclaration
  ]
  
  /** Type of `ts.factory.createSetAccessorDeclaration` in TS 4.8+. */
  type Ts48CreateSetAccessorDeclarationFn = js.Function4[
    /* modifiers */ js.UndefOr[js.Array[ModifierLike]], 
    /* name */ PropertyName, 
    /* parameters */ js.Array[ParameterDeclaration], 
    /* body */ js.UndefOr[Block], 
    SetAccessorDeclaration
  ]
  
  /** Type of `ts.factory.updateClassDeclaration` in TS 4.8+. */
  type Ts48UpdateClassDeclarationFn = js.Function6[
    /* node */ ClassDeclaration, 
    /* modifiers */ js.UndefOr[js.Array[ModifierLike]], 
    /* name */ js.UndefOr[Identifier], 
    /* typeParameters */ js.UndefOr[js.Array[TypeParameterDeclaration]], 
    /* heritageClauses */ js.UndefOr[js.Array[HeritageClause]], 
    /* members */ js.Array[ClassElement], 
    ClassDeclaration
  ]
  
  /** Type of `ts.factory.updateConstructorDeclaration` in TS 4.8+. */
  type Ts48UpdateConstructorDeclarationFn = js.Function4[
    /* node */ ConstructorDeclaration, 
    /* modifiers */ js.UndefOr[js.Array[Modifier]], 
    /* parameters */ js.Array[ParameterDeclaration], 
    /* body */ js.UndefOr[Block], 
    ConstructorDeclaration
  ]
  
  /** Type of `ts.factory.updateGetAccessorDeclaration` in TS 4.8+. */
  type Ts48UpdateGetAccessorDeclarationFn = js.Function6[
    /* node */ GetAccessorDeclaration, 
    /* modifiers */ js.UndefOr[js.Array[ModifierLike]], 
    /* name */ PropertyName, 
    /* parameters */ js.Array[ParameterDeclaration], 
    /* type */ js.UndefOr[TypeNode], 
    /* body */ js.UndefOr[Block], 
    GetAccessorDeclaration
  ]
  
  /** Type of `ts.factory.updateImportDeclaration` in TS 4.8+. */
  type Ts48UpdateImportDeclarationFn = js.Function5[
    /* node */ ImportDeclaration, 
    /* modifiers */ js.UndefOr[js.Array[Modifier]], 
    /* importClause */ js.UndefOr[ImportClause], 
    /* moduleSpecifier */ Expression, 
    /* assertClause */ js.UndefOr[AssertClause], 
    ImportDeclaration
  ]
  
  /** Type of `ts.factory.updateMethodDeclaration` in TS 4.8+. */
  type Ts48UpdateMethodDeclarationFn = js.Function9[
    /* node */ MethodDeclaration, 
    /* modifiers */ js.UndefOr[js.Array[ModifierLike]], 
    /* asteriskToken */ js.UndefOr[AsteriskToken], 
    /* name */ PropertyName, 
    /* questionToken */ js.UndefOr[QuestionToken], 
    /* typeParameters */ js.UndefOr[js.Array[TypeParameterDeclaration]], 
    /* parameters */ js.Array[ParameterDeclaration], 
    /* type */ js.UndefOr[TypeNode], 
    /* body */ js.UndefOr[Block], 
    MethodDeclaration
  ]
  
  /** Type of `ts.factory.updateParameterDeclaration` in TS 4.8+. */
  type Ts48UpdateParameterDeclarationFn = js.Function7[
    /* node */ ParameterDeclaration, 
    /* modifiers */ js.UndefOr[js.Array[ModifierLike]], 
    /* dotDotDotToken */ js.UndefOr[DotDotDotToken], 
    /* name */ String | BindingName, 
    /* questionToken */ js.UndefOr[QuestionToken], 
    /* type */ js.UndefOr[TypeNode], 
    /* initializer */ js.UndefOr[Expression], 
    ParameterDeclaration
  ]
  
  /** Type of `ts.factory.updatePropertyDeclaration` in TS 4.8+. */
  type Ts48UpdatePropertyDeclarationFn = js.Function6[
    /* node */ PropertyDeclaration, 
    /* modifiers */ js.UndefOr[js.Array[ModifierLike]], 
    /* name */ String | PropertyName, 
    /* questionOrExclamationToken */ js.UndefOr[QuestionToken | ExclamationToken], 
    /* type */ js.UndefOr[TypeNode], 
    /* initializer */ js.UndefOr[Expression], 
    PropertyDeclaration
  ]
  
  /** Type of `ts.factory.updateSetAccessorDeclaration` in TS 4.8+. */
  type Ts48UpdateSetAccessorDeclarationFn = js.Function5[
    /* node */ SetAccessorDeclaration, 
    /* modifiers */ js.UndefOr[js.Array[ModifierLike]], 
    /* name */ PropertyName, 
    /* parameters */ js.Array[ParameterDeclaration], 
    /* body */ js.UndefOr[Block], 
    SetAccessorDeclaration
  ]
}
