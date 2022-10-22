package typingsJapgolly.tableau.global.tableau

import typingsJapgolly.tableau.tableau.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("tableau.VizResizeEvent")
@js.native
open class VizResizeEvent ()
  extends StObject
     with typingsJapgolly.tableau.tableau.VizResizeEvent {
  
  /** Gets the name of the event, which is a string, but is also one of the items in the TableauEventName enum. */
  /* CompleteClass */
  override def getEventName(): typingsJapgolly.tableau.tableau.TableauEventName = js.native
  
  /** Gets the Viz object associated with the event. */
  /* CompleteClass */
  override def getViz(): typingsJapgolly.tableau.tableau.Viz = js.native
  
  /** Gets the sheetSize record for the current sheet. For more information, see SheetSizeOptions Record. */
  /* CompleteClass */
  override def getVizSize(): Size = js.native
}
