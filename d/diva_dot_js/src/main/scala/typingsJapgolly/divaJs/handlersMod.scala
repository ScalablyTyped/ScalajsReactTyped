package typingsJapgolly.divaJs

import org.scalajs.dom.Event
import typingsJapgolly.divaJs.interfacesMod.Offset
import typingsJapgolly.divaJs.viewerCoreMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object handlersMod {
  
  @JSImport("diva.js/handlers", "DocumentHandler")
  @js.native
  open class DocumentHandler protected ()
    extends StObject
       with ViewHandler {
    def this(viewerCore: default) = this()
    
    def onPinch(event: Event, coords: Offset, startDistance: Double, endDistance: Double): Unit = js.native
  }
  
  @JSImport("diva.js/handlers", "GridHandler")
  @js.native
  open class GridHandler protected ()
    extends StObject
       with ViewHandler {
    def this(viewerCore: default) = this()
    
    def onPinch(): Unit = js.native
  }
  
  @js.native
  trait ViewHandler extends StObject {
    
    var _viewerCore: default = js.native
    
    def onDoubleClick(event: Event, coords: Offset): Unit = js.native
    
    def onViewDidLoad(): Unit = js.native
    
    def onViewDidUpdate(renderedPages: js.Array[Double]): Unit = js.native
    def onViewDidUpdate(renderedPages: js.Array[Double], targetPage: Double): Unit = js.native
    
    def onViewWillLoad(): Unit = js.native
  }
}
