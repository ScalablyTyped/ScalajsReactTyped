package typingsJapgolly.reactToastify

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.reactToastify.anon.TypeofsetTimeout
import typingsJapgolly.reactToastify.distHooksUseToastContainerMod.ContainerInstance
import typingsJapgolly.reactToastify.distTypesMod.ClearWaitingQueueParams
import typingsJapgolly.reactToastify.distTypesMod.Id
import typingsJapgolly.reactToastify.distTypesMod.NotValidatedToastProps
import typingsJapgolly.reactToastify.distTypesMod.ToastContent
import typingsJapgolly.reactToastify.distTypesMod.ToastItem
import typingsJapgolly.reactToastify.reactToastifyInts.`0`
import typingsJapgolly.reactToastify.reactToastifyInts.`1`
import typingsJapgolly.reactToastify.reactToastifyInts.`2`
import typingsJapgolly.reactToastify.reactToastifyInts.`3`
import typingsJapgolly.reactToastify.reactToastifyInts.`4`
import typingsJapgolly.reactToastify.reactToastifyInts.`5`
import typingsJapgolly.std.Map
import typingsJapgolly.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreEventManagerMod {
  
  @JSImport("react-toastify/dist/core/eventManager", "eventManager")
  @js.native
  val eventManager: EventManager_ = js.native
  
  type Callback = OnShowCallback | OnClearCallback | OnClearWaitingQueue | OnDidMountCallback | OnWillUnmountCallback | OnChangeCallback
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactToastify.reactToastifyInts.`0`
    - typingsJapgolly.reactToastify.reactToastifyInts.`1`
    - typingsJapgolly.reactToastify.reactToastifyInts.`2`
    - typingsJapgolly.reactToastify.reactToastifyInts.`3`
    - typingsJapgolly.reactToastify.reactToastifyInts.`4`
    - typingsJapgolly.reactToastify.reactToastifyInts.`5`
  */
  trait Event extends StObject
  object Event {
    
    inline def Change: `4` = 4.asInstanceOf[`4`]
    
    inline def Clear: `1` = 1.asInstanceOf[`1`]
    
    inline def ClearWaitingQueue: `5` = 5.asInstanceOf[`5`]
    
    inline def DidMount: `2` = 2.asInstanceOf[`2`]
    
    inline def Show: `0` = 0.asInstanceOf[`0`]
    
    inline def WillUnmount: `3` = 3.asInstanceOf[`3`]
  }
  
  @js.native
  trait EventManager_ extends StObject {
    
    def cancelEmit(event: Event): EventManager_ = js.native
    
    var emitQueue: Map[Event, js.Array[TimeoutId]] = js.native
    
    @JSName("emit")
    def emit_0(event: `0`, content: Node, options: NotValidatedToastProps): Unit = js.native
    @JSName("emit")
    def emit_1(event: `1`): Unit = js.native
    @JSName("emit")
    def emit_1(event: `1`, id: String): Unit = js.native
    @JSName("emit")
    def emit_1(event: `1`, id: Double): Unit = js.native
    @JSName("emit")
    def emit_2(event: `2`, containerInstance: ContainerInstance): Unit = js.native
    @JSName("emit")
    def emit_3(event: `3`, containerInstance: ContainerInstance): Unit = js.native
    @JSName("emit")
    def emit_4(event: `4`, data: ToastItem[js.Object]): Unit = js.native
    @JSName("emit")
    def emit_5(event: `5`, params: ClearWaitingQueueParams): Unit = js.native
    
    var list: Map[Event, js.Array[Callback]] = js.native
    
    def off(event: Event): EventManager_ = js.native
    def off(event: Event, callback: Callback): EventManager_ = js.native
    
    @JSName("on")
    def on_0(event: `0`, callback: OnShowCallback): EventManager_ = js.native
    @JSName("on")
    def on_1(event: `1`, callback: OnClearCallback): EventManager_ = js.native
    @JSName("on")
    def on_2(event: `2`, callback: OnDidMountCallback): EventManager_ = js.native
    @JSName("on")
    def on_3(event: `3`, callback: OnWillUnmountCallback): EventManager_ = js.native
    @JSName("on")
    def on_4(event: `4`, callback: OnChangeCallback): EventManager_ = js.native
    @JSName("on")
    def on_5(event: `5`, callback: OnClearWaitingQueue): EventManager_ = js.native
  }
  
  type OnChangeCallback = js.Function1[/* toast */ ToastItem[js.Object], Unit]
  
  type OnClearCallback = js.Function1[/* id */ js.UndefOr[Id], Unit]
  
  type OnClearWaitingQueue = js.Function1[/* params */ ClearWaitingQueueParams, Unit]
  
  type OnDidMountCallback = js.Function1[/* containerInstance */ ContainerInstance, Unit]
  
  type OnShowCallback = js.Function2[/* content */ ToastContent[Any], /* options */ NotValidatedToastProps, Unit]
  
  type OnWillUnmountCallback = OnDidMountCallback
  
  type TimeoutId = ReturnType[TypeofsetTimeout]
}
