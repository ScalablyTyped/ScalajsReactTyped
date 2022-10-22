package typingsJapgolly.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MultiSelectMode extends StObject
@JSImport("sap/m/library", "MultiSelectMode")
@js.native
object MultiSelectMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[MultiSelectMode & String] = js.native
  
  /**
    * Renders the `clearAll` icon.
    */
  @js.native
  sealed trait ClearAll
    extends StObject
       with MultiSelectMode
  /* "ClearAll" */ val ClearAll: typingsJapgolly.openui5.sapMLibraryMod.MultiSelectMode.ClearAll & String = js.native
  
  /**
    * Renders the `selectAll` checkbox (default behavior).
    */
  @js.native
  sealed trait Default
    extends StObject
       with MultiSelectMode
  /* "Default" */ val Default: typingsJapgolly.openui5.sapMLibraryMod.MultiSelectMode.Default & String = js.native
}
