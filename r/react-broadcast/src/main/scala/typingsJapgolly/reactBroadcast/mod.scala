package typingsJapgolly.reactBroadcast

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactBroadcast.mod.Broadcast.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-broadcast", "Broadcast")
  @js.native
  open class Broadcast[T] protected () extends Component[Props[T], Any, Any] {
    def this(props: Props[T]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props[T], context: Any) = this()
  }
  object Broadcast {
    
    trait DefaultProps[T] extends StObject {
      
      def compareValues(prevValue: T, nextValue: T): Boolean
    }
    object DefaultProps {
      
      inline def apply[T](compareValues: (T, T) => Boolean): DefaultProps[T] = {
        val __obj = js.Dynamic.literal(compareValues = js.Any.fromFunction2(compareValues))
        __obj.asInstanceOf[DefaultProps[T]]
      }
      
      extension [Self <: DefaultProps[?], T](x: Self & DefaultProps[T]) {
        
        inline def setCompareValues(value: (T, T) => Boolean): Self = StObject.set(x, "compareValues", js.Any.fromFunction2(value))
      }
    }
    
    /* Inlined parent std.Partial<react-broadcast.react-broadcast.Broadcast.DefaultProps<T>> */
    trait Props[T] extends StObject {
      
      var channel: String
      
      var children: Node
      
      var compareValues: js.UndefOr[js.Function2[/* prevValue */ T, /* nextValue */ T, Boolean]] = js.undefined
      
      var value: T
    }
    object Props {
      
      inline def apply[T](channel: String, value: T): Props[T] = {
        val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], children = null)
        __obj.asInstanceOf[Props[T]]
      }
      
      extension [Self <: Props[?], T](x: Self & Props[T]) {
        
        inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
        
        inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
        
        inline def setChildrenNull: Self = StObject.set(x, "children", null)
        
        inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
        
        inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
        
        inline def setCompareValues(value: (/* prevValue */ T, /* nextValue */ T) => Boolean): Self = StObject.set(x, "compareValues", js.Any.fromFunction2(value))
        
        inline def setCompareValuesUndefined: Self = StObject.set(x, "compareValues", js.undefined)
        
        inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @JSImport("react-broadcast", "Subscriber")
  @js.native
  open class Subscriber[T] protected ()
    extends Component[typingsJapgolly.reactBroadcast.mod.Subscriber.Props[T], Any, Any] {
    def this(props: typingsJapgolly.reactBroadcast.mod.Subscriber.Props[T]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: typingsJapgolly.reactBroadcast.mod.Subscriber.Props[T], context: Any) = this()
  }
  object Subscriber {
    
    trait DefaultProps extends StObject {
      
      var quiet: Boolean
    }
    object DefaultProps {
      
      inline def apply(quiet: Boolean): DefaultProps = {
        val __obj = js.Dynamic.literal(quiet = quiet.asInstanceOf[js.Any])
        __obj.asInstanceOf[DefaultProps]
      }
      
      extension [Self <: DefaultProps](x: Self) {
        
        inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      }
    }
    
    /* Inlined parent std.Partial<react-broadcast.react-broadcast.Subscriber.DefaultProps> */
    trait Props[T] extends StObject {
      
      var channel: String
      
      var children: js.UndefOr[js.Function1[/* state */ T, Node]] = js.undefined
      
      var quiet: js.UndefOr[Boolean] = js.undefined
    }
    object Props {
      
      inline def apply[T](channel: String): typingsJapgolly.reactBroadcast.mod.Subscriber.Props[T] = {
        val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.reactBroadcast.mod.Subscriber.Props[T]]
      }
      
      extension [Self <: typingsJapgolly.reactBroadcast.mod.Subscriber.Props[?], T](x: Self & typingsJapgolly.reactBroadcast.mod.Subscriber.Props[T]) {
        
        inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
        
        inline def setChildren(value: /* state */ T => Node): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
        
        inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
        
        inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
        
        inline def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
      }
    }
  }
}
