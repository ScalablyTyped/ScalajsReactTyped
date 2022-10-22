package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PullDecl extends StObject {
  
  def _getEnclosingDeclFromParentDecl(): PullDecl
  
  def addChildDecl(childDecl: PullDecl): Unit
  
  def addVariableDeclToGroup(decl: PullDecl): Unit
  
  def ast(): AST
  
  var childDeclNamespaceCache: IIndexable[js.Array[PullDecl]]
  
  var childDeclTypeCache: IIndexable[js.Array[PullDecl]]
  
  var childDeclTypeParameterCache: IIndexable[js.Array[PullDecl]]
  
  var childDeclValueCache: IIndexable[js.Array[PullDecl]]
  
  /* private */ var childDecls: Any
  
  /* private */ var containerDecl: Any
  
  /* private */ var declDisplayName: Any
  
  /* private */ var declGroups: Any
  
  var declID: Double
  
  def ensureSymbolIsBound(): Unit
  
  def fileName(): String
  
  var flags: PullElementFlags
  
  /* private */ def getChildDeclCache(declKind: Any): Any
  
  def getChildDecls(): js.Array[PullDecl]
  
  def getContainerDecl(): PullDecl
  
  def getDisplayName(): String
  
  def getEnclosingDecl(): PullDecl
  
  def getParentDecl(): PullDecl
  
  def getParentPath(): js.Array[PullDecl]
  
  def getSignatureSymbol(): PullSignatureSymbol
  
  def getSymbol(): PullSymbol
  
  def getTypeParameters(): js.Array[PullDecl]
  
  def getValueDecl(): PullDecl
  
  def getVariableDeclGroups(): js.Array[js.Array[PullDecl]]
  
  def hasBeenBound(): Boolean
  
  def hasSignatureSymbol(): Boolean
  
  def hasSymbol(): Boolean
  
  def isExternalModule(): Boolean
  
  def isRootDecl(): Unit
  
  def isSynthesized(): Boolean
  
  var kind: PullElementKind
  
  var name: String
  
  def searchChildDecls(declName: String, searchKind: PullElementKind): js.Array[PullDecl]
  
  var semanticInfoChain: SemanticInfoChain
  
  def setFlag(flags: PullElementFlags): Unit
  
  def setFlags(flags: PullElementFlags): Unit
  
  def setSignatureSymbol(signatureSymbol: PullSignatureSymbol): Unit
  
  def setSymbol(symbol: PullSymbol): Unit
  
  def setValueDecl(valDecl: PullDecl): Unit
  
  /* private */ var synthesizedValDecl: Any
  
  /* private */ var typeParameters: Any
}
object PullDecl {
  
  inline def apply(
    _getEnclosingDeclFromParentDecl: CallbackTo[PullDecl],
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
    searchChildDecls: (String, PullElementKind) => js.Array[PullDecl],
    semanticInfoChain: SemanticInfoChain,
    setFlag: PullElementFlags => Callback,
    setFlags: PullElementFlags => Callback,
    setSignatureSymbol: PullSignatureSymbol => Callback,
    setSymbol: PullSymbol => Callback,
    setValueDecl: PullDecl => Callback,
    synthesizedValDecl: Any,
    typeParameters: Any
  ): PullDecl = {
    val __obj = js.Dynamic.literal(_getEnclosingDeclFromParentDecl = _getEnclosingDeclFromParentDecl.toJsFn, addChildDecl = js.Any.fromFunction1((t0: PullDecl) => addChildDecl(t0).runNow()), addVariableDeclToGroup = js.Any.fromFunction1((t0: PullDecl) => addVariableDeclToGroup(t0).runNow()), ast = ast.toJsFn, childDeclNamespaceCache = childDeclNamespaceCache.asInstanceOf[js.Any], childDeclTypeCache = childDeclTypeCache.asInstanceOf[js.Any], childDeclTypeParameterCache = childDeclTypeParameterCache.asInstanceOf[js.Any], childDeclValueCache = childDeclValueCache.asInstanceOf[js.Any], childDecls = childDecls.asInstanceOf[js.Any], containerDecl = containerDecl.asInstanceOf[js.Any], declDisplayName = declDisplayName.asInstanceOf[js.Any], declGroups = declGroups.asInstanceOf[js.Any], declID = declID.asInstanceOf[js.Any], ensureSymbolIsBound = ensureSymbolIsBound.toJsFn, fileName = fileName.toJsFn, flags = flags.asInstanceOf[js.Any], getChildDeclCache = js.Any.fromFunction1(getChildDeclCache), getChildDecls = getChildDecls.toJsFn, getContainerDecl = getContainerDecl.toJsFn, getDisplayName = getDisplayName.toJsFn, getEnclosingDecl = getEnclosingDecl.toJsFn, getParentDecl = getParentDecl.toJsFn, getParentPath = getParentPath.toJsFn, getSignatureSymbol = getSignatureSymbol.toJsFn, getSymbol = getSymbol.toJsFn, getTypeParameters = getTypeParameters.toJsFn, getValueDecl = getValueDecl.toJsFn, getVariableDeclGroups = getVariableDeclGroups.toJsFn, hasBeenBound = hasBeenBound.toJsFn, hasSignatureSymbol = hasSignatureSymbol.toJsFn, hasSymbol = hasSymbol.toJsFn, isExternalModule = isExternalModule.toJsFn, isRootDecl = isRootDecl.toJsFn, isSynthesized = isSynthesized.toJsFn, kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], searchChildDecls = js.Any.fromFunction2(searchChildDecls), semanticInfoChain = semanticInfoChain.asInstanceOf[js.Any], setFlag = js.Any.fromFunction1((t0: PullElementFlags) => setFlag(t0).runNow()), setFlags = js.Any.fromFunction1((t0: PullElementFlags) => setFlags(t0).runNow()), setSignatureSymbol = js.Any.fromFunction1((t0: PullSignatureSymbol) => setSignatureSymbol(t0).runNow()), setSymbol = js.Any.fromFunction1((t0: PullSymbol) => setSymbol(t0).runNow()), setValueDecl = js.Any.fromFunction1((t0: PullDecl) => setValueDecl(t0).runNow()), synthesizedValDecl = synthesizedValDecl.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullDecl]
  }
  
  extension [Self <: PullDecl](x: Self) {
    
    inline def setAddChildDecl(value: PullDecl => Callback): Self = StObject.set(x, "addChildDecl", js.Any.fromFunction1((t0: PullDecl) => value(t0).runNow()))
    
    inline def setAddVariableDeclToGroup(value: PullDecl => Callback): Self = StObject.set(x, "addVariableDeclToGroup", js.Any.fromFunction1((t0: PullDecl) => value(t0).runNow()))
    
    inline def setAst(value: CallbackTo[AST]): Self = StObject.set(x, "ast", value.toJsFn)
    
    inline def setChildDeclNamespaceCache(value: IIndexable[js.Array[PullDecl]]): Self = StObject.set(x, "childDeclNamespaceCache", value.asInstanceOf[js.Any])
    
    inline def setChildDeclTypeCache(value: IIndexable[js.Array[PullDecl]]): Self = StObject.set(x, "childDeclTypeCache", value.asInstanceOf[js.Any])
    
    inline def setChildDeclTypeParameterCache(value: IIndexable[js.Array[PullDecl]]): Self = StObject.set(x, "childDeclTypeParameterCache", value.asInstanceOf[js.Any])
    
    inline def setChildDeclValueCache(value: IIndexable[js.Array[PullDecl]]): Self = StObject.set(x, "childDeclValueCache", value.asInstanceOf[js.Any])
    
    inline def setChildDecls(value: Any): Self = StObject.set(x, "childDecls", value.asInstanceOf[js.Any])
    
    inline def setContainerDecl(value: Any): Self = StObject.set(x, "containerDecl", value.asInstanceOf[js.Any])
    
    inline def setDeclDisplayName(value: Any): Self = StObject.set(x, "declDisplayName", value.asInstanceOf[js.Any])
    
    inline def setDeclGroups(value: Any): Self = StObject.set(x, "declGroups", value.asInstanceOf[js.Any])
    
    inline def setDeclID(value: Double): Self = StObject.set(x, "declID", value.asInstanceOf[js.Any])
    
    inline def setEnsureSymbolIsBound(value: Callback): Self = StObject.set(x, "ensureSymbolIsBound", value.toJsFn)
    
    inline def setFileName(value: CallbackTo[String]): Self = StObject.set(x, "fileName", value.toJsFn)
    
    inline def setFlags(value: PullElementFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setGetChildDeclCache(value: Any => Any): Self = StObject.set(x, "getChildDeclCache", js.Any.fromFunction1(value))
    
    inline def setGetChildDecls(value: CallbackTo[js.Array[PullDecl]]): Self = StObject.set(x, "getChildDecls", value.toJsFn)
    
    inline def setGetContainerDecl(value: CallbackTo[PullDecl]): Self = StObject.set(x, "getContainerDecl", value.toJsFn)
    
    inline def setGetDisplayName(value: CallbackTo[String]): Self = StObject.set(x, "getDisplayName", value.toJsFn)
    
    inline def setGetEnclosingDecl(value: CallbackTo[PullDecl]): Self = StObject.set(x, "getEnclosingDecl", value.toJsFn)
    
    inline def setGetParentDecl(value: CallbackTo[PullDecl]): Self = StObject.set(x, "getParentDecl", value.toJsFn)
    
    inline def setGetParentPath(value: CallbackTo[js.Array[PullDecl]]): Self = StObject.set(x, "getParentPath", value.toJsFn)
    
    inline def setGetSignatureSymbol(value: CallbackTo[PullSignatureSymbol]): Self = StObject.set(x, "getSignatureSymbol", value.toJsFn)
    
    inline def setGetSymbol(value: CallbackTo[PullSymbol]): Self = StObject.set(x, "getSymbol", value.toJsFn)
    
    inline def setGetTypeParameters(value: CallbackTo[js.Array[PullDecl]]): Self = StObject.set(x, "getTypeParameters", value.toJsFn)
    
    inline def setGetValueDecl(value: CallbackTo[PullDecl]): Self = StObject.set(x, "getValueDecl", value.toJsFn)
    
    inline def setGetVariableDeclGroups(value: CallbackTo[js.Array[js.Array[PullDecl]]]): Self = StObject.set(x, "getVariableDeclGroups", value.toJsFn)
    
    inline def setHasBeenBound(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasBeenBound", value.toJsFn)
    
    inline def setHasSignatureSymbol(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasSignatureSymbol", value.toJsFn)
    
    inline def setHasSymbol(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasSymbol", value.toJsFn)
    
    inline def setIsExternalModule(value: CallbackTo[Boolean]): Self = StObject.set(x, "isExternalModule", value.toJsFn)
    
    inline def setIsRootDecl(value: Callback): Self = StObject.set(x, "isRootDecl", value.toJsFn)
    
    inline def setIsSynthesized(value: CallbackTo[Boolean]): Self = StObject.set(x, "isSynthesized", value.toJsFn)
    
    inline def setKind(value: PullElementKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSearchChildDecls(value: (String, PullElementKind) => js.Array[PullDecl]): Self = StObject.set(x, "searchChildDecls", js.Any.fromFunction2(value))
    
    inline def setSemanticInfoChain(value: SemanticInfoChain): Self = StObject.set(x, "semanticInfoChain", value.asInstanceOf[js.Any])
    
    inline def setSetFlag(value: PullElementFlags => Callback): Self = StObject.set(x, "setFlag", js.Any.fromFunction1((t0: PullElementFlags) => value(t0).runNow()))
    
    inline def setSetFlags(value: PullElementFlags => Callback): Self = StObject.set(x, "setFlags", js.Any.fromFunction1((t0: PullElementFlags) => value(t0).runNow()))
    
    inline def setSetSignatureSymbol(value: PullSignatureSymbol => Callback): Self = StObject.set(x, "setSignatureSymbol", js.Any.fromFunction1((t0: PullSignatureSymbol) => value(t0).runNow()))
    
    inline def setSetSymbol(value: PullSymbol => Callback): Self = StObject.set(x, "setSymbol", js.Any.fromFunction1((t0: PullSymbol) => value(t0).runNow()))
    
    inline def setSetValueDecl(value: PullDecl => Callback): Self = StObject.set(x, "setValueDecl", js.Any.fromFunction1((t0: PullDecl) => value(t0).runNow()))
    
    inline def setSynthesizedValDecl(value: Any): Self = StObject.set(x, "synthesizedValDecl", value.asInstanceOf[js.Any])
    
    inline def setTypeParameters(value: Any): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    inline def set_getEnclosingDeclFromParentDecl(value: CallbackTo[PullDecl]): Self = StObject.set(x, "_getEnclosingDeclFromParentDecl", value.toJsFn)
  }
}
