package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PullSynthesizedDecl
  extends StObject
     with NormalPullDecl
object PullSynthesizedDecl {
  
  inline def apply(
    _getEnclosingDeclFromParentDecl: CallbackTo[PullDecl],
    _rootDecl: RootPullDecl,
    addChildDecl: PullDecl => Callback,
    addVariableDeclToGroup: PullDecl => Callback,
    ast: CallbackTo[AST],
    childDeclNamespaceCache: IIndexable[js.Array[PullDecl]],
    childDeclTypeCache: IIndexable[js.Array[PullDecl]],
    childDeclTypeParameterCache: IIndexable[js.Array[PullDecl]],
    childDeclValueCache: IIndexable[js.Array[PullDecl]],
    childDecls: Any,
    containerDecl: Any,
    declDisplayName: Any,
    declGroups: Any,
    declID: Double,
    ensureSymbolIsBound: Callback,
    fileName: CallbackTo[String],
    flags: PullElementFlags,
    getChildDeclCache: Any => Any,
    getChildDecls: CallbackTo[js.Array[PullDecl]],
    getContainerDecl: CallbackTo[PullDecl],
    getDisplayName: CallbackTo[String],
    getEnclosingDecl: CallbackTo[PullDecl],
    getParentDecl: CallbackTo[PullDecl],
    getParentPath: CallbackTo[js.Array[PullDecl]],
    getSignatureSymbol: CallbackTo[PullSignatureSymbol],
    getSymbol: CallbackTo[PullSymbol],
    getTypeParameters: CallbackTo[js.Array[PullDecl]],
    getValueDecl: CallbackTo[PullDecl],
    getVariableDeclGroups: CallbackTo[js.Array[js.Array[PullDecl]]],
    hasBeenBound: CallbackTo[Boolean],
    hasSignatureSymbol: CallbackTo[Boolean],
    hasSymbol: CallbackTo[Boolean],
    isExternalModule: CallbackTo[Boolean],
    isRootDecl: Callback,
    isSynthesized: CallbackTo[Boolean],
    kind: PullElementKind,
    name: String,
    parentDecl: Any,
    parentPath: Any,
    searchChildDecls: (String, PullElementKind) => js.Array[PullDecl],
    semanticInfoChain: SemanticInfoChain,
    setFlag: PullElementFlags => Callback,
    setFlags: PullElementFlags => Callback,
    setSignatureSymbol: PullSignatureSymbol => Callback,
    setSymbol: PullSymbol => Callback,
    setValueDecl: PullDecl => Callback,
    synthesizedValDecl: Any,
    typeParameters: Any
  ): PullSynthesizedDecl = {
    val __obj = js.Dynamic.literal(_getEnclosingDeclFromParentDecl = _getEnclosingDeclFromParentDecl.toJsFn, _rootDecl = _rootDecl.asInstanceOf[js.Any], addChildDecl = js.Any.fromFunction1((t0: PullDecl) => addChildDecl(t0).runNow()), addVariableDeclToGroup = js.Any.fromFunction1((t0: PullDecl) => addVariableDeclToGroup(t0).runNow()), ast = ast.toJsFn, childDeclNamespaceCache = childDeclNamespaceCache.asInstanceOf[js.Any], childDeclTypeCache = childDeclTypeCache.asInstanceOf[js.Any], childDeclTypeParameterCache = childDeclTypeParameterCache.asInstanceOf[js.Any], childDeclValueCache = childDeclValueCache.asInstanceOf[js.Any], childDecls = childDecls.asInstanceOf[js.Any], containerDecl = containerDecl.asInstanceOf[js.Any], declDisplayName = declDisplayName.asInstanceOf[js.Any], declGroups = declGroups.asInstanceOf[js.Any], declID = declID.asInstanceOf[js.Any], ensureSymbolIsBound = ensureSymbolIsBound.toJsFn, fileName = fileName.toJsFn, flags = flags.asInstanceOf[js.Any], getChildDeclCache = js.Any.fromFunction1(getChildDeclCache), getChildDecls = getChildDecls.toJsFn, getContainerDecl = getContainerDecl.toJsFn, getDisplayName = getDisplayName.toJsFn, getEnclosingDecl = getEnclosingDecl.toJsFn, getParentDecl = getParentDecl.toJsFn, getParentPath = getParentPath.toJsFn, getSignatureSymbol = getSignatureSymbol.toJsFn, getSymbol = getSymbol.toJsFn, getTypeParameters = getTypeParameters.toJsFn, getValueDecl = getValueDecl.toJsFn, getVariableDeclGroups = getVariableDeclGroups.toJsFn, hasBeenBound = hasBeenBound.toJsFn, hasSignatureSymbol = hasSignatureSymbol.toJsFn, hasSymbol = hasSymbol.toJsFn, isExternalModule = isExternalModule.toJsFn, isRootDecl = isRootDecl.toJsFn, isSynthesized = isSynthesized.toJsFn, kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parentDecl = parentDecl.asInstanceOf[js.Any], parentPath = parentPath.asInstanceOf[js.Any], searchChildDecls = js.Any.fromFunction2(searchChildDecls), semanticInfoChain = semanticInfoChain.asInstanceOf[js.Any], setFlag = js.Any.fromFunction1((t0: PullElementFlags) => setFlag(t0).runNow()), setFlags = js.Any.fromFunction1((t0: PullElementFlags) => setFlags(t0).runNow()), setSignatureSymbol = js.Any.fromFunction1((t0: PullSignatureSymbol) => setSignatureSymbol(t0).runNow()), setSymbol = js.Any.fromFunction1((t0: PullSymbol) => setSymbol(t0).runNow()), setValueDecl = js.Any.fromFunction1((t0: PullDecl) => setValueDecl(t0).runNow()), synthesizedValDecl = synthesizedValDecl.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullSynthesizedDecl]
  }
}
