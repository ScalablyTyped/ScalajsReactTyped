package typingsJapgolly.tableau.global.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("tableau.MarksEvent")
@js.native
open class MarksEvent ()
  extends StObject
     with typingsJapgolly.tableau.tableau.MarksEvent {
  
  /** Gets the name of the event, which is a string, but is also one of the items in the TableauEventName enum. */
  /* CompleteClass */
  override def getEventName(): typingsJapgolly.tableau.tableau.TableauEventName = js.native
  
  /** Gets the selected marks on the Worksheet that triggered the event. */
  /* CompleteClass */
  override def getMarksAsync(): js.Promise[js.Array[typingsJapgolly.tableau.tableau.Mark]] = js.native
  
  /** Gets the Viz object associated with the event. */
  /* CompleteClass */
  override def getViz(): typingsJapgolly.tableau.tableau.Viz = js.native
  
  /** Gets the Worksheet object associated with the event. */
  /* CompleteClass */
  override def getWorksheet(): typingsJapgolly.tableau.tableau.Worksheet = js.native
}
