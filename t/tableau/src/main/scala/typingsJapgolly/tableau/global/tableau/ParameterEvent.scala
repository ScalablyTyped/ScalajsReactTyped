package typingsJapgolly.tableau.global.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("tableau.ParameterEvent")
@js.native
open class ParameterEvent ()
  extends StObject
     with typingsJapgolly.tableau.tableau.ParameterEvent {
  
  /** Gets the name of the event, which is a string, but is also one of the items in the TableauEventName enum. */
  /* CompleteClass */
  override def getEventName(): typingsJapgolly.tableau.tableau.TableauEventName = js.native
  
  /** Gets the Parameter object that triggered the event. */
  /* CompleteClass */
  override def getParameterAsync(): js.Promise[typingsJapgolly.tableau.tableau.Parameter] = js.native
  
  /** Gets the name of the parameter that changed. */
  /* CompleteClass */
  override def getParameterName(): String = js.native
  
  /** Gets the Viz object associated with the event. */
  /* CompleteClass */
  override def getViz(): typingsJapgolly.tableau.tableau.Viz = js.native
}
