package typingsJapgolly.tableau.global.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("tableau.QuantitativeFilter")
@js.native
open class QuantitativeFilter ()
  extends StObject
     with typingsJapgolly.tableau.tableau.QuantitativeFilter {
  
  /** Gets the maximum value as specified in the domain. */
  /* CompleteClass */
  override def getDomainMax(): typingsJapgolly.tableau.tableau.DataValue = js.native
  
  /** Gets the minimum value as specified in the domain. */
  /* CompleteClass */
  override def getDomainMin(): typingsJapgolly.tableau.tableau.DataValue = js.native
  
  /** Gets the field that is currently being filtered. */
  /* CompleteClass */
  override def getFieldAsync(): js.Promise[typingsJapgolly.tableau.tableau.Field] = js.native
  
  /** Gets the name of the field being filtered. Note that this is the caption as shown in the UI and not the actual database field name. */
  /* CompleteClass */
  override def getFieldName(): String = js.native
  
  /** Gets the type of the filter. See FilterType Enum for the values in the enum. */
  /* CompleteClass */
  override def getFilterType(): typingsJapgolly.tableau.tableau.FilterType = js.native
  
  /** Indicates whether null values are included in the filter. */
  /* CompleteClass */
  override def getIncludeNullValues(): Boolean = js.native
  
  /** Gets the maximum value, inclusive, applied to the filter. */
  /* CompleteClass */
  override def getMax(): typingsJapgolly.tableau.tableau.DataValue = js.native
  
  /** Gets the minimum value, inclusive, applied to the filter. */
  /* CompleteClass */
  override def getMin(): typingsJapgolly.tableau.tableau.DataValue = js.native
  
  /** Gets the parent worksheet */
  /* CompleteClass */
  override def getWorksheet(): typingsJapgolly.tableau.tableau.Worksheet = js.native
}
