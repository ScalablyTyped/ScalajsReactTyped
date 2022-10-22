package typingsJapgolly.tableau.global.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An enumeration that indicates what to do with null values for a given filter or mark selection call. */
@JSGlobal("tableau.NullOption")
@js.native
object NullOption extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsJapgolly.tableau.tableau.NullOption & String] = js.native
  
  /* "allValues" */ val ALL_VALUES: typingsJapgolly.tableau.tableau.NullOption.ALL_VALUES & String = js.native
  
  /* "nonNullValues" */ val NON_NULL_VALUES: typingsJapgolly.tableau.tableau.NullOption.NON_NULL_VALUES & String = js.native
  
  /* "nullValues" */ val NULL_VALUES: typingsJapgolly.tableau.tableau.NullOption.NULL_VALUES & String = js.native
}
