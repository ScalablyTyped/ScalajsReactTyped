package typingsJapgolly.reactMdTable

import typingsJapgolly.react.mod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesFooterMod {
  
  @JSImport("@react-md/table/types/footer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/table/types/footer", "TableFooterProvider")
  @js.native
  val TableFooterProvider: Provider[Boolean] = js.native
  
  inline def useTableFooter(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useTableFooter")().asInstanceOf[Boolean]
}
