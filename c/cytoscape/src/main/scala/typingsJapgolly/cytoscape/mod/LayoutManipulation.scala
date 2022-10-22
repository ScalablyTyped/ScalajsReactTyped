package typingsJapgolly.cytoscape.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#layouts/layout-manipulation
  * Layouts have a set of functions available to them,
  * which allow for more complex behaviour than the primary run-one-layout-at-a-time usecase.
  * A new, developer accessible layout can be made via cy.makeLayout().
  */
trait LayoutManipulation extends StObject {
  
  /**
    * Start running the layout
    * http://js.cytoscape.org/#layout.run
    */
  def run(): this.type
  
  def start(): this.type
  
  /**
    * Stop running the (asynchronous/discrete) layout
    * http://js.cytoscape.org/#layout.stop
    */
  def stop(): this.type
}
object LayoutManipulation {
  
  inline def apply(
    run: CallbackTo[LayoutManipulation],
    start: CallbackTo[LayoutManipulation],
    stop: CallbackTo[LayoutManipulation]
  ): LayoutManipulation = {
    val __obj = js.Dynamic.literal(run = run.toJsFn, start = start.toJsFn, stop = stop.toJsFn)
    __obj.asInstanceOf[LayoutManipulation]
  }
  
  extension [Self <: LayoutManipulation](x: Self) {
    
    inline def setRun(value: CallbackTo[LayoutManipulation]): Self = StObject.set(x, "run", value.toJsFn)
    
    inline def setStart(value: CallbackTo[LayoutManipulation]): Self = StObject.set(x, "start", value.toJsFn)
    
    inline def setStop(value: CallbackTo[LayoutManipulation]): Self = StObject.set(x, "stop", value.toJsFn)
  }
}
