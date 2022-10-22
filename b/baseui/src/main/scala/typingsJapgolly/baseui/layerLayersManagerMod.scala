package typingsJapgolly.baseui

import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import typingsJapgolly.baseui.layerTypesMod.LayersContextProps
import typingsJapgolly.baseui.layerTypesMod.LayersManagerProps
import typingsJapgolly.baseui.layerTypesMod.LayersManagerState
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layerLayersManagerMod {
  
  @JSImport("baseui/layer/layers-manager", JSImport.Default)
  @js.native
  open class default protected () extends LayersManager {
    def this(props: LayersManagerProps) = this()
  }
  
  @JSImport("baseui/layer/layers-manager", "Consumer")
  @js.native
  val Consumer: typingsJapgolly.react.mod.Consumer[LayersContextProps] = js.native
  
  @JSImport("baseui/layer/layers-manager", "LayersContext")
  @js.native
  val LayersContext: Context[LayersContextProps] = js.native
  
  @JSImport("baseui/layer/layers-manager", "Provider")
  @js.native
  val Provider: typingsJapgolly.react.mod.Provider[LayersContextProps] = js.native
  
  @js.native
  trait LayersManager extends Component[LayersManagerProps, LayersManagerState, Any] {
    
    @JSName("componentDidMount")
    def componentDidMount_MLayersManager(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MLayersManager(): Unit = js.native
    
    var containerRef: RefHandle[Any] = js.native
    
    var host: RefHandle[HTMLElement] = js.native
    
    def onAddDocClickHandler(docClickHandler: js.Function1[/* event */ MouseEvent, Any]): Unit = js.native
    
    def onAddEscapeHandler(escapeKeyHandler: js.Function0[Any]): Unit = js.native
    
    def onAddKeyDownHandler(keyDownHandler: js.Function0[Any]): Unit = js.native
    
    def onAddKeyPressHandler(keyPressHandler: js.Function0[Any]): Unit = js.native
    
    def onAddKeyUpHandler(keyUpHandler: js.Function0[Any]): Unit = js.native
    
    def onDocumentClick(event: MouseEvent): Unit = js.native
    
    def onKeyDown(event: KeyboardEvent): Unit = js.native
    
    def onKeyPress(event: KeyboardEvent): Unit = js.native
    
    def onKeyUp(event: KeyboardEvent): Unit = js.native
    
    def onRemoveDocClickHandler(docClickHandler: js.Function1[/* event */ MouseEvent, Any]): Unit = js.native
    
    def onRemoveEscapeHandler(escapeKeyHandler: js.Function0[Any]): Unit = js.native
    
    def onRemoveKeyDownHandler(keyDownHandler: js.Function0[Any]): Unit = js.native
    
    def onRemoveKeyPressHandler(keyPressHandler: js.Function0[Any]): Unit = js.native
    
    def onRemoveKeyUpHandler(keyUpHandler: js.Function0[Any]): Unit = js.native
  }
}
