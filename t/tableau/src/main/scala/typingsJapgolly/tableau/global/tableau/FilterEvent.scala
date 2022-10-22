package typingsJapgolly.tableau.global.tableau

import typingsJapgolly.tableau.tableau.ConcreteFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("tableau.FilterEvent")
@js.native
open class FilterEvent ()
  extends StObject
     with typingsJapgolly.tableau.tableau.FilterEvent {
  
  /** Gets the name of the event, which is a string, but is also one of the items in the TableauEventName enum. */
  /* CompleteClass */
  override def getEventName(): typingsJapgolly.tableau.tableau.TableauEventName = js.native
  
  /** Gets the name of the field. */
  /* CompleteClass */
  override def getFieldName(): String = js.native
  
  /** Gets the Filter object associated with the event. */
  /* CompleteClass */
  override def getFilterAsync(): js.Promise[ConcreteFilter] = js.native
  
  /** Gets the Viz object associated with the event. */
  /* CompleteClass */
  override def getViz(): typingsJapgolly.tableau.tableau.Viz = js.native
  
  /** Gets the Worksheet object associated with the event. */
  /* CompleteClass */
  override def getWorksheet(): typingsJapgolly.tableau.tableau.Worksheet = js.native
}
