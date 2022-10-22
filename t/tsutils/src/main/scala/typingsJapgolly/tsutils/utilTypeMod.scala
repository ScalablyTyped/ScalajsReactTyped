package typingsJapgolly.tsutils

import typingsJapgolly.tsutils.utilUtilMod.PropertyName
import typingsJapgolly.typescript.mod.AccessorDeclaration
import typingsJapgolly.typescript.mod.ClassLikeDeclaration
import typingsJapgolly.typescript.mod.Expression
import typingsJapgolly.typescript.mod.MethodDeclaration
import typingsJapgolly.typescript.mod.Node
import typingsJapgolly.typescript.mod.PropertyDeclaration
import typingsJapgolly.typescript.mod.Signature
import typingsJapgolly.typescript.mod.String
import typingsJapgolly.typescript.mod.Symbol
import typingsJapgolly.typescript.mod.Type
import typingsJapgolly.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilTypeMod {
  
  @JSImport("tsutils/util/type", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBaseClassMemberOfClassElement(node: AccessorDeclaration, checker: TypeChecker): js.UndefOr[Symbol] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBaseClassMemberOfClassElement")(node.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Symbol]]
  inline def getBaseClassMemberOfClassElement(node: MethodDeclaration, checker: TypeChecker): js.UndefOr[Symbol] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBaseClassMemberOfClassElement")(node.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Symbol]]
  inline def getBaseClassMemberOfClassElement(node: PropertyDeclaration, checker: TypeChecker): js.UndefOr[Symbol] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBaseClassMemberOfClassElement")(node.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Symbol]]
  
  inline def getCallSignaturesOfType(`type`: Type): js.Array[Signature] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCallSignaturesOfType")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Array[Signature]]
  
  inline def getConstructorTypeOfClassLikeDeclaration(node: ClassLikeDeclaration, checker: TypeChecker): Type = (^.asInstanceOf[js.Dynamic].applyDynamic("getConstructorTypeOfClassLikeDeclaration")(node.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[Type]
  
  inline def getInstanceTypeOfClassLikeDeclaration(node: ClassLikeDeclaration, checker: TypeChecker): Type = (^.asInstanceOf[js.Dynamic].applyDynamic("getInstanceTypeOfClassLikeDeclaration")(node.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[Type]
  
  inline def getIteratorYieldResultFromIteratorResult(`type`: Type, node: Node, checker: TypeChecker): Type = (^.asInstanceOf[js.Dynamic].applyDynamic("getIteratorYieldResultFromIteratorResult")(`type`.asInstanceOf[js.Any], node.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[Type]
  
  inline def getPropertyNameFromType(`type`: Type): js.UndefOr[PropertyName] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPropertyNameFromType")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[PropertyName]]
  
  inline def getPropertyOfType(`type`: Type, name: String): js.UndefOr[Symbol] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPropertyOfType")(`type`.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Symbol]]
  
  inline def getSymbolOfClassLikeDeclaration(node: ClassLikeDeclaration, checker: TypeChecker): Symbol = (^.asInstanceOf[js.Dynamic].applyDynamic("getSymbolOfClassLikeDeclaration")(node.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[Symbol]
  
  inline def getWellKnownSymbolPropertyOfType(`type`: Type, wellKnownSymbolName: java.lang.String, checker: TypeChecker): js.UndefOr[Symbol] = (^.asInstanceOf[js.Dynamic].applyDynamic("getWellKnownSymbolPropertyOfType")(`type`.asInstanceOf[js.Any], wellKnownSymbolName.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Symbol]]
  
  inline def intersectionTypeParts(`type`: Type): js.Array[Type] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersectionTypeParts")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Array[Type]]
  
  inline def isBooleanLiteralType(`type`: Type, literal: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBooleanLiteralType")(`type`.asInstanceOf[js.Any], literal.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isEmptyObjectType(`type`: Type): /* is typescript.typescript.ObjectType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmptyObjectType")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ObjectType */ Boolean]
  
  inline def isFalsyType(`type`: Type): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFalsyType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isOptionalChainingUndefinedMarkerType(checker: TypeChecker, t: Type): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isOptionalChainingUndefinedMarkerType")(checker.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isPropertyReadonlyInType(`type`: Type, name: String, checker: TypeChecker): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPropertyReadonlyInType")(`type`.asInstanceOf[js.Any], name.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isThenableType(checker: TypeChecker, node: Expression): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isThenableType")(checker.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isThenableType(checker: TypeChecker, node: Expression, `type`: Type): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isThenableType")(checker.asInstanceOf[js.Any], node.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isThenableType(checker: TypeChecker, node: Node, `type`: Type): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isThenableType")(checker.asInstanceOf[js.Any], node.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isTypeAssignableToNumber(checker: TypeChecker, `type`: Type): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTypeAssignableToNumber")(checker.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isTypeAssignableToString(checker: TypeChecker, `type`: Type): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTypeAssignableToString")(checker.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def removeOptionalChainingUndefinedMarkerType(checker: TypeChecker, `type`: Type): Type = (^.asInstanceOf[js.Dynamic].applyDynamic("removeOptionalChainingUndefinedMarkerType")(checker.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Type]
  
  inline def removeOptionalityFromType(checker: TypeChecker, `type`: Type): Type = (^.asInstanceOf[js.Dynamic].applyDynamic("removeOptionalityFromType")(checker.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Type]
  
  inline def someTypePart(
    `type`: Type,
    predicate: js.Function1[/* t */ Type, /* is typescript.typescript.UnionOrIntersectionType */ Boolean],
    cb: js.Function1[/* t */ Type, Boolean]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("someTypePart")(`type`.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def symbolHasReadonlyDeclaration(symbol: Symbol, checker: TypeChecker): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("symbolHasReadonlyDeclaration")(symbol.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def unionTypeParts(`type`: Type): js.Array[Type] = ^.asInstanceOf[js.Dynamic].applyDynamic("unionTypeParts")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Array[Type]]
}
