package typingsJapgolly.reactDnd

import typingsJapgolly.dndCore.distInterfacesMod.Backend
import typingsJapgolly.reactDnd.distInternalsSourceConnectorMod.Connector
import typingsJapgolly.reactDnd.distTypesOptionsMod.DropTargetOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInternalsTargetConnectorMod {
  
  @JSImport("react-dnd/dist/internals/TargetConnector", "TargetConnector")
  @js.native
  open class TargetConnector protected ()
    extends StObject
       with Connector {
    def this(backend: Backend) = this()
    
    /* private */ val backend: Any = js.native
    
    /* private */ var clearDropTarget: Any = js.native
    
    @JSName("connectTarget")
    def connectTarget_MTargetConnector: Any = js.native
    
    /* private */ var didDropTargetChange: Any = js.native
    
    /* private */ var didHandlerIdChange: Any = js.native
    
    /* private */ var didOptionsChange: Any = js.native
    
    def disconnectDropTarget(): Unit = js.native
    
    /* private */ def dropTarget: Any = js.native
    
    /* private */ var dropTargetNode: Any = js.native
    
    def dropTargetOptions: DropTargetOptions = js.native
    
    /* private */ var dropTargetOptionsInternal: Any = js.native
    
    def dropTargetOptions_=(options: DropTargetOptions): Unit = js.native
    
    /* private */ var dropTargetRef: Any = js.native
    
    /* private */ var handlerId: Any = js.native
    
    /* private */ var lastConnectedDropTarget: Any = js.native
    
    /* private */ var lastConnectedDropTargetOptions: Any = js.native
    
    /* private */ var lastConnectedHandlerId: Any = js.native
    
    /* private */ var unsubscribeDropTarget: Any = js.native
  }
}
