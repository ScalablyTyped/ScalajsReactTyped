package typingsJapgolly.semanticUiReactEventStack

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Event
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.semanticUiReactEventStack.anon.Name
import typingsJapgolly.semanticUiReactEventStack.anon.Pool
import typingsJapgolly.semanticUiReactEventStack.anon.ReadonlyEventStackProps
import typingsJapgolly.semanticUiReactEventStack.libTypesTypesMod.InputEventListener
import typingsJapgolly.semanticUiReactEventStack.libTypesTypesMod.InputTargetElement
import typingsJapgolly.std.EventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesEventStackMod {
  
  @JSImport("@semantic-ui-react/event-stack/lib/types/EventStack", JSImport.Default)
  @js.native
  open class default () extends EventStack
  /* static members */
  object default {
    
    @JSImport("@semantic-ui-react/event-stack/lib/types/EventStack", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@semantic-ui-react/event-stack/lib/types/EventStack", "default.defaultProps")
    @js.native
    def defaultProps: Pool = js.native
    inline def defaultProps_=(x: Pool): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@semantic-ui-react/event-stack/lib/types/EventStack", "default.propTypes")
    @js.native
    def propTypes: Name = js.native
    inline def propTypes_=(x: Name): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait EventStack
    extends PureComponent[EventStackProps, js.Object, Any] {
    
    @JSName("componentDidMount")
    def componentDidMount_MEventStack(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MEventStack(prevProps: EventStackProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MEventStack(): Unit = js.native
    
    def subscribe(props: ReadonlyEventStackProps): Unit = js.native
    
    def unsubscribe(props: ReadonlyEventStackProps): Unit = js.native
  }
  
  trait EventStackProps extends StObject {
    
    /** An event name on which we will subscribe. */
    var name: String
    
    /** An event handler or array of event handlers. */
    var on: InputEventListener
    
    /** A name of pool. */
    var pool: js.UndefOr[String] = js.undefined
    
    /** A DOM element on which we will subscribe. */
    var target: js.UndefOr[InputTargetElement] = js.undefined
  }
  object EventStackProps {
    
    inline def apply(name: String, on: InputEventListener): EventStackProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventStackProps]
    }
    
    extension [Self <: EventStackProps](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOn(value: InputEventListener): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
      
      inline def setOnFunction1(value: /* evt */ Event => Callback): Self = StObject.set(x, "on", js.Any.fromFunction1((t0: /* evt */ Event) => value(t0).runNow()))
      
      inline def setOnVarargs(value: EventListener*): Self = StObject.set(x, "on", js.Array(value*))
      
      inline def setPool(value: String): Self = StObject.set(x, "pool", value.asInstanceOf[js.Any])
      
      inline def setPoolUndefined: Self = StObject.set(x, "pool", js.undefined)
      
      inline def setTarget(value: InputTargetElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
}
