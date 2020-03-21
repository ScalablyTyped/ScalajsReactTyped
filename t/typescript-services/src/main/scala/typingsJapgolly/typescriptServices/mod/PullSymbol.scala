package typingsJapgolly.typescriptServices.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "PullSymbol")
@js.native
class PullSymbol protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.PullSymbol {
  def this(name: String, declKind: typingsJapgolly.typescriptServices.TypeScript.PullElementKind) = this()
}

/* static members */
@JSImport("typescript-services", "PullSymbol")
@js.native
object PullSymbol extends js.Object {
  def _isExternalModuleReferenceAlias(aliasSymbol: typingsJapgolly.typescriptServices.TypeScript.PullTypeAliasSymbol): Boolean = js.native
  /* private */ def getDefaultConstructorSymbolForDocComments(classSymbol: js.Any): js.Any = js.native
  def getIsExternallyVisible(
    symbol: typingsJapgolly.typescriptServices.TypeScript.PullSymbol,
    fromIsExternallyVisibleSymbol: typingsJapgolly.typescriptServices.TypeScript.PullSymbol,
    inIsExternallyVisibleSymbols: js.Array[typingsJapgolly.typescriptServices.TypeScript.PullSymbol]
  ): Boolean = js.native
  def getTypeParameterString(typars: js.Array[typingsJapgolly.typescriptServices.TypeScript.PullTypeSymbol]): String = js.native
  def getTypeParameterString(
    typars: js.Array[typingsJapgolly.typescriptServices.TypeScript.PullTypeSymbol],
    scopeSymbol: typingsJapgolly.typescriptServices.TypeScript.PullSymbol
  ): String = js.native
  def getTypeParameterString(
    typars: js.Array[typingsJapgolly.typescriptServices.TypeScript.PullTypeSymbol],
    scopeSymbol: typingsJapgolly.typescriptServices.TypeScript.PullSymbol,
    useContraintInName: Boolean
  ): String = js.native
  def getTypeParameterStringEx(typeParameters: js.Array[typingsJapgolly.typescriptServices.TypeScript.PullTypeSymbol]): typingsJapgolly.typescriptServices.TypeScript.MemberNameArray = js.native
  def getTypeParameterStringEx(
    typeParameters: js.Array[typingsJapgolly.typescriptServices.TypeScript.PullTypeSymbol],
    scopeSymbol: typingsJapgolly.typescriptServices.TypeScript.PullSymbol
  ): typingsJapgolly.typescriptServices.TypeScript.MemberNameArray = js.native
  def getTypeParameterStringEx(
    typeParameters: js.Array[typingsJapgolly.typescriptServices.TypeScript.PullTypeSymbol],
    scopeSymbol: typingsJapgolly.typescriptServices.TypeScript.PullSymbol,
    getTypeParamMarkerInfo: Boolean
  ): typingsJapgolly.typescriptServices.TypeScript.MemberNameArray = js.native
  def getTypeParameterStringEx(
    typeParameters: js.Array[typingsJapgolly.typescriptServices.TypeScript.PullTypeSymbol],
    scopeSymbol: typingsJapgolly.typescriptServices.TypeScript.PullSymbol,
    getTypeParamMarkerInfo: Boolean,
    useContraintInName: Boolean
  ): typingsJapgolly.typescriptServices.TypeScript.MemberNameArray = js.native
  /* private */ def unqualifiedNameReferencesDifferentSymbolInScope(symbol: js.Any, scopePath: js.Any, endScopePathIndex: js.Any): js.Any = js.native
}

