package typingsJapgolly.typescriptServices.global.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.PullSymbol")
@js.native
open class PullSymbol protected ()
  extends StObject
     with typingsJapgolly.typescriptServices.TypeScript.PullSymbol {
  def this(name: String, declKind: typingsJapgolly.typescriptServices.TypeScript.PullElementKind) = this()
}
object PullSymbol {
  
  @JSGlobal("TypeScript.PullSymbol")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def getDefaultConstructorSymbolForDocComments(classSymbol: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultConstructorSymbolForDocComments")(classSymbol.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /* static member */
  inline def getIsExternallyVisible(
    symbol: typingsJapgolly.typescriptServices.TypeScript.PullSymbol,
    fromIsExternallyVisibleSymbol: typingsJapgolly.typescriptServices.TypeScript.PullSymbol,
    inIsExternallyVisibleSymbols: js.Array[typingsJapgolly.typescriptServices.TypeScript.PullSymbol]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("getIsExternallyVisible")(symbol.asInstanceOf[js.Any], fromIsExternallyVisibleSymbol.asInstanceOf[js.Any], inIsExternallyVisibleSymbols.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def getTypeParameterString(typars: js.Array[typingsJapgolly.typescriptServices.TypeScript.PullTypeSymbol]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeParameterString")(typars.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getTypeParameterString(
    typars: js.Array[typingsJapgolly.typescriptServices.TypeScript.PullTypeSymbol],
    scopeSymbol: Unit,
    useContraintInName: Boolean
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getTypeParameterString")(typars.asInstanceOf[js.Any], scopeSymbol.asInstanceOf[js.Any], useContraintInName.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getTypeParameterString(
    typars: js.Array[typingsJapgolly.typescriptServices.TypeScript.PullTypeSymbol],
    scopeSymbol: typingsJapgolly.typescriptServices.TypeScript.PullSymbol
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getTypeParameterString")(typars.asInstanceOf[js.Any], scopeSymbol.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getTypeParameterString(
    typars: js.Array[typingsJapgolly.typescriptServices.TypeScript.PullTypeSymbol],
    scopeSymbol: typingsJapgolly.typescriptServices.TypeScript.PullSymbol,
    useContraintInName: Boolean
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getTypeParameterString")(typars.asInstanceOf[js.Any], scopeSymbol.asInstanceOf[js.Any], useContraintInName.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /* static member */
  inline def getTypeParameterStringEx(typeParameters: js.Array[typingsJapgolly.typescriptServices.TypeScript.PullTypeSymbol]): typingsJapgolly.typescriptServices.TypeScript.MemberNameArray = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeParameterStringEx")(typeParameters.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.MemberNameArray]
  inline def getTypeParameterStringEx(
    typeParameters: js.Array[typingsJapgolly.typescriptServices.TypeScript.PullTypeSymbol],
    scopeSymbol: Unit,
    getTypeParamMarkerInfo: Boolean
  ): typingsJapgolly.typescriptServices.TypeScript.MemberNameArray = (^.asInstanceOf[js.Dynamic].applyDynamic("getTypeParameterStringEx")(typeParameters.asInstanceOf[js.Any], scopeSymbol.asInstanceOf[js.Any], getTypeParamMarkerInfo.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.MemberNameArray]
  inline def getTypeParameterStringEx(
    typeParameters: js.Array[typingsJapgolly.typescriptServices.TypeScript.PullTypeSymbol],
    scopeSymbol: Unit,
    getTypeParamMarkerInfo: Boolean,
    useContraintInName: Boolean
  ): typingsJapgolly.typescriptServices.TypeScript.MemberNameArray = (^.asInstanceOf[js.Dynamic].applyDynamic("getTypeParameterStringEx")(typeParameters.asInstanceOf[js.Any], scopeSymbol.asInstanceOf[js.Any], getTypeParamMarkerInfo.asInstanceOf[js.Any], useContraintInName.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.MemberNameArray]
  inline def getTypeParameterStringEx(
    typeParameters: js.Array[typingsJapgolly.typescriptServices.TypeScript.PullTypeSymbol],
    scopeSymbol: Unit,
    getTypeParamMarkerInfo: Unit,
    useContraintInName: Boolean
  ): typingsJapgolly.typescriptServices.TypeScript.MemberNameArray = (^.asInstanceOf[js.Dynamic].applyDynamic("getTypeParameterStringEx")(typeParameters.asInstanceOf[js.Any], scopeSymbol.asInstanceOf[js.Any], getTypeParamMarkerInfo.asInstanceOf[js.Any], useContraintInName.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.MemberNameArray]
  inline def getTypeParameterStringEx(
    typeParameters: js.Array[typingsJapgolly.typescriptServices.TypeScript.PullTypeSymbol],
    scopeSymbol: typingsJapgolly.typescriptServices.TypeScript.PullSymbol
  ): typingsJapgolly.typescriptServices.TypeScript.MemberNameArray = (^.asInstanceOf[js.Dynamic].applyDynamic("getTypeParameterStringEx")(typeParameters.asInstanceOf[js.Any], scopeSymbol.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.MemberNameArray]
  inline def getTypeParameterStringEx(
    typeParameters: js.Array[typingsJapgolly.typescriptServices.TypeScript.PullTypeSymbol],
    scopeSymbol: typingsJapgolly.typescriptServices.TypeScript.PullSymbol,
    getTypeParamMarkerInfo: Boolean
  ): typingsJapgolly.typescriptServices.TypeScript.MemberNameArray = (^.asInstanceOf[js.Dynamic].applyDynamic("getTypeParameterStringEx")(typeParameters.asInstanceOf[js.Any], scopeSymbol.asInstanceOf[js.Any], getTypeParamMarkerInfo.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.MemberNameArray]
  inline def getTypeParameterStringEx(
    typeParameters: js.Array[typingsJapgolly.typescriptServices.TypeScript.PullTypeSymbol],
    scopeSymbol: typingsJapgolly.typescriptServices.TypeScript.PullSymbol,
    getTypeParamMarkerInfo: Boolean,
    useContraintInName: Boolean
  ): typingsJapgolly.typescriptServices.TypeScript.MemberNameArray = (^.asInstanceOf[js.Dynamic].applyDynamic("getTypeParameterStringEx")(typeParameters.asInstanceOf[js.Any], scopeSymbol.asInstanceOf[js.Any], getTypeParamMarkerInfo.asInstanceOf[js.Any], useContraintInName.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.MemberNameArray]
  inline def getTypeParameterStringEx(
    typeParameters: js.Array[typingsJapgolly.typescriptServices.TypeScript.PullTypeSymbol],
    scopeSymbol: typingsJapgolly.typescriptServices.TypeScript.PullSymbol,
    getTypeParamMarkerInfo: Unit,
    useContraintInName: Boolean
  ): typingsJapgolly.typescriptServices.TypeScript.MemberNameArray = (^.asInstanceOf[js.Dynamic].applyDynamic("getTypeParameterStringEx")(typeParameters.asInstanceOf[js.Any], scopeSymbol.asInstanceOf[js.Any], getTypeParamMarkerInfo.asInstanceOf[js.Any], useContraintInName.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.MemberNameArray]
  
  /* static member */
  inline def isExternalModuleReferenceAlias(aliasSymbol: typingsJapgolly.typescriptServices.TypeScript.PullTypeAliasSymbol): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isExternalModuleReferenceAlias")(aliasSymbol.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* static member */
  inline def unqualifiedNameReferencesDifferentSymbolInScope(symbol: Any, scopePath: Any, endScopePathIndex: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unqualifiedNameReferencesDifferentSymbolInScope")(symbol.asInstanceOf[js.Any], scopePath.asInstanceOf[js.Any], endScopePathIndex.asInstanceOf[js.Any])).asInstanceOf[Any]
}
