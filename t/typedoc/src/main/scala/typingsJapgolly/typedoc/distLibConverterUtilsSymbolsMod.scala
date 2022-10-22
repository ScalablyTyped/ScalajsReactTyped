package typingsJapgolly.typedoc

import typingsJapgolly.typescript.mod.Symbol
import typingsJapgolly.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibConverterUtilsSymbolsMod {
  
  @JSImport("typedoc/dist/lib/converter/utils/symbols", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveAliasedSymbol(symbol: Symbol, checker: TypeChecker): Symbol = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAliasedSymbol")(symbol.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[Symbol]
}
