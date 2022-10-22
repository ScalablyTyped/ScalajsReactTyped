package typingsJapgolly.tableau.global.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("tableau.Filter")
@js.native
open class Filter ()
  extends StObject
     with typingsJapgolly.tableau.tableau.Filter {
  
  /** Gets the field that is currently being filtered. */
  /* CompleteClass */
  override def getFieldAsync(): js.Promise[typingsJapgolly.tableau.tableau.Field] = js.native
  
  /** Gets the name of the field being filtered. Note that this is the caption as shown in the UI and not the actual database field name. */
  /* CompleteClass */
  override def getFieldName(): String = js.native
  
  /** Gets the type of the filter. See FilterType Enum for the values in the enum. */
  /* CompleteClass */
  override def getFilterType(): typingsJapgolly.tableau.tableau.FilterType = js.native
  
  /** Gets the parent worksheet */
  /* CompleteClass */
  override def getWorksheet(): typingsJapgolly.tableau.tableau.Worksheet = js.native
}
