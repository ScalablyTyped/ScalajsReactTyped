package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.IIndexable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "PullSynthesizedDecl")
@js.native
open class PullSynthesizedDecl protected ()
  extends StObject
     with typingsJapgolly.typescriptServices.TypeScript.PullSynthesizedDecl {
  def this(
    declName: String,
    displayName: String,
    kind: typingsJapgolly.typescriptServices.TypeScript.PullElementKind,
    declFlags: typingsJapgolly.typescriptServices.TypeScript.PullElementFlags,
    parentDecl: typingsJapgolly.typescriptServices.TypeScript.PullDecl,
    semanticInfoChain: typingsJapgolly.typescriptServices.TypeScript.SemanticInfoChain
  ) = this()
  
  /* CompleteClass */
  override def _getEnclosingDeclFromParentDecl(): typingsJapgolly.typescriptServices.TypeScript.PullDecl = js.native
  
  /* CompleteClass */
  var _rootDecl: typingsJapgolly.typescriptServices.TypeScript.RootPullDecl = js.native
  
  /* CompleteClass */
  override def addChildDecl(childDecl: typingsJapgolly.typescriptServices.TypeScript.PullDecl): Unit = js.native
  
  /* CompleteClass */
  override def addVariableDeclToGroup(decl: typingsJapgolly.typescriptServices.TypeScript.PullDecl): Unit = js.native
  
  /* CompleteClass */
  override def ast(): typingsJapgolly.typescriptServices.TypeScript.AST = js.native
  
  /* CompleteClass */
  var childDeclNamespaceCache: IIndexable[js.Array[typingsJapgolly.typescriptServices.TypeScript.PullDecl]] = js.native
  
  /* CompleteClass */
  var childDeclTypeCache: IIndexable[js.Array[typingsJapgolly.typescriptServices.TypeScript.PullDecl]] = js.native
  
  /* CompleteClass */
  var childDeclTypeParameterCache: IIndexable[js.Array[typingsJapgolly.typescriptServices.TypeScript.PullDecl]] = js.native
  
  /* CompleteClass */
  var childDeclValueCache: IIndexable[js.Array[typingsJapgolly.typescriptServices.TypeScript.PullDecl]] = js.native
  
  /* private */ /* CompleteClass */
  var childDecls: Any = js.native
  
  /* private */ /* CompleteClass */
  var containerDecl: Any = js.native
  
  /* private */ /* CompleteClass */
  var declDisplayName: Any = js.native
  
  /* private */ /* CompleteClass */
  var declGroups: Any = js.native
  
  /* CompleteClass */
  var declID: Double = js.native
  
  /* CompleteClass */
  override def ensureSymbolIsBound(): Unit = js.native
  
  /* CompleteClass */
  override def fileName(): String = js.native
  
  /* CompleteClass */
  var flags: typingsJapgolly.typescriptServices.TypeScript.PullElementFlags = js.native
  
  /* private */ /* CompleteClass */
  override def getChildDeclCache(declKind: Any): Any = js.native
  
  /* CompleteClass */
  override def getChildDecls(): js.Array[typingsJapgolly.typescriptServices.TypeScript.PullDecl] = js.native
  
  /* CompleteClass */
  override def getContainerDecl(): typingsJapgolly.typescriptServices.TypeScript.PullDecl = js.native
  
  /* CompleteClass */
  override def getDisplayName(): String = js.native
  
  /* CompleteClass */
  override def getEnclosingDecl(): typingsJapgolly.typescriptServices.TypeScript.PullDecl = js.native
  
  /* CompleteClass */
  override def getParentDecl(): typingsJapgolly.typescriptServices.TypeScript.PullDecl = js.native
  
  /* CompleteClass */
  override def getParentPath(): js.Array[typingsJapgolly.typescriptServices.TypeScript.PullDecl] = js.native
  
  /* CompleteClass */
  override def getSignatureSymbol(): typingsJapgolly.typescriptServices.TypeScript.PullSignatureSymbol = js.native
  
  /* CompleteClass */
  override def getSymbol(): typingsJapgolly.typescriptServices.TypeScript.PullSymbol = js.native
  
  /* CompleteClass */
  override def getTypeParameters(): js.Array[typingsJapgolly.typescriptServices.TypeScript.PullDecl] = js.native
  
  /* CompleteClass */
  override def getValueDecl(): typingsJapgolly.typescriptServices.TypeScript.PullDecl = js.native
  
  /* CompleteClass */
  override def getVariableDeclGroups(): js.Array[js.Array[typingsJapgolly.typescriptServices.TypeScript.PullDecl]] = js.native
  
  /* CompleteClass */
  override def hasBeenBound(): Boolean = js.native
  
  /* CompleteClass */
  override def hasSignatureSymbol(): Boolean = js.native
  
  /* CompleteClass */
  override def hasSymbol(): Boolean = js.native
  
  /* CompleteClass */
  override def isExternalModule(): Boolean = js.native
  
  /* CompleteClass */
  override def isRootDecl(): Unit = js.native
  
  /* CompleteClass */
  override def isSynthesized(): Boolean = js.native
  
  /* CompleteClass */
  var kind: typingsJapgolly.typescriptServices.TypeScript.PullElementKind = js.native
  
  /* CompleteClass */
  var name: String = js.native
  
  /* private */ /* CompleteClass */
  var parentDecl: Any = js.native
  
  /* private */ /* CompleteClass */
  var parentPath: Any = js.native
  
  /* CompleteClass */
  override def searchChildDecls(declName: String, searchKind: typingsJapgolly.typescriptServices.TypeScript.PullElementKind): js.Array[typingsJapgolly.typescriptServices.TypeScript.PullDecl] = js.native
  
  /* CompleteClass */
  var semanticInfoChain: typingsJapgolly.typescriptServices.TypeScript.SemanticInfoChain = js.native
  
  /* CompleteClass */
  override def setFlag(flags: typingsJapgolly.typescriptServices.TypeScript.PullElementFlags): Unit = js.native
  
  /* CompleteClass */
  override def setFlags(flags: typingsJapgolly.typescriptServices.TypeScript.PullElementFlags): Unit = js.native
  
  /* CompleteClass */
  override def setSignatureSymbol(signatureSymbol: typingsJapgolly.typescriptServices.TypeScript.PullSignatureSymbol): Unit = js.native
  
  /* CompleteClass */
  override def setSymbol(symbol: typingsJapgolly.typescriptServices.TypeScript.PullSymbol): Unit = js.native
  
  /* CompleteClass */
  override def setValueDecl(valDecl: typingsJapgolly.typescriptServices.TypeScript.PullDecl): Unit = js.native
  
  /* private */ /* CompleteClass */
  var synthesizedValDecl: Any = js.native
  
  /* private */ /* CompleteClass */
  var typeParameters: Any = js.native
}
