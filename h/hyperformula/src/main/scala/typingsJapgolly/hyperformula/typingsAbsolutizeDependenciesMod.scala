package typingsJapgolly.hyperformula

import typingsJapgolly.hyperformula.typingsCellDependencyMod.CellDependency
import typingsJapgolly.hyperformula.typingsCellMod.SimpleCellAddress_
import typingsJapgolly.hyperformula.typingsParserRelativeDependencyMod.RelativeDependency
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsAbsolutizeDependenciesMod {
  
  @JSImport("hyperformula/typings/absolutizeDependencies", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def absolutizeDependencies(deps: js.Array[RelativeDependency], baseAddress: SimpleCellAddress_): js.Array[CellDependency] = (^.asInstanceOf[js.Dynamic].applyDynamic("absolutizeDependencies")(deps.asInstanceOf[js.Any], baseAddress.asInstanceOf[js.Any])).asInstanceOf[js.Array[CellDependency]]
  
  inline def filterDependenciesOutOfScope(deps: js.Array[CellDependency]): js.Array[CellDependency] = ^.asInstanceOf[js.Dynamic].applyDynamic("filterDependenciesOutOfScope")(deps.asInstanceOf[js.Any]).asInstanceOf[js.Array[CellDependency]]
}
