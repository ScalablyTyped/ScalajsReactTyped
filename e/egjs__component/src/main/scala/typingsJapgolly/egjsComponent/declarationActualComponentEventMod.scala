package typingsJapgolly.egjsComponent

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.egjsComponent.declarationTypesMod.DefaultProps
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object declarationActualComponentEventMod {
  
  @JSImport("@egjs/component/declaration/ActualComponentEvent", JSImport.Default)
  @js.native
  open class default[PROPS /* <: Record[String, Any] */, TYPE /* <: String */, THIS] protected ()
    extends StObject
       with ComponentEvent[PROPS, TYPE, THIS] {
    def this(eventType: TYPE, props: PROPS) = this()
    
    /* private */ /* CompleteClass */
    var _canceled: Any = js.native
    
    /* CompleteClass */
    var currentTarget: THIS = js.native
    
    /* CompleteClass */
    var eventType: TYPE = js.native
    
    /* CompleteClass */
    override def isCanceled(): Boolean = js.native
    
    /* CompleteClass */
    override def stop(): Unit = js.native
  }
  
  trait ComponentEvent[PROPS /* <: Record[String, Any] */, TYPE /* <: String */, THIS]
    extends StObject
       with DefaultProps[TYPE, THIS] {
    
    /* private */ var _canceled: Any
  }
  object ComponentEvent {
    
    inline def apply[PROPS /* <: Record[String, Any] */, TYPE /* <: String */, THIS](
      _canceled: Any,
      currentTarget: THIS,
      eventType: TYPE,
      isCanceled: CallbackTo[Boolean],
      stop: Callback
    ): ComponentEvent[PROPS, TYPE, THIS] = {
      val __obj = js.Dynamic.literal(_canceled = _canceled.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], isCanceled = isCanceled.toJsFn, stop = stop.toJsFn)
      __obj.asInstanceOf[ComponentEvent[PROPS, TYPE, THIS]]
    }
    
    extension [Self <: ComponentEvent[?, ?, ?], PROPS /* <: Record[String, Any] */, TYPE /* <: String */, THIS](x: Self & (ComponentEvent[PROPS, TYPE, THIS])) {
      
      inline def set_canceled(value: Any): Self = StObject.set(x, "_canceled", value.asInstanceOf[js.Any])
    }
  }
}
