package typingsJapgolly.reactLazylog

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactLazylog.anon.ClientHeight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildScrollFollowMod {
  
  @JSImport("react-lazylog/build/ScrollFollow", JSImport.Default)
  @js.native
  open class default protected () extends ScrollFollow {
    def this(props: ScrollFollowProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ScrollFollowProps, context: Any) = this()
  }
  
  @JSImport("react-lazylog/build/ScrollFollow", "ScrollFollow")
  @js.native
  open class ScrollFollow protected ()
    extends Component[ScrollFollowProps, js.Object, Any] {
    def this(props: ScrollFollowProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ScrollFollowProps, context: Any) = this()
  }
  
  trait ScrollFollowProps extends StObject {
    
    def render(props: ScrollFollowRenderProps): Node
    
    var startFollowing: js.UndefOr[Boolean] = js.undefined
  }
  object ScrollFollowProps {
    
    inline def apply(render: ScrollFollowRenderProps => Node): ScrollFollowProps = {
      val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render))
      __obj.asInstanceOf[ScrollFollowProps]
    }
    
    extension [Self <: ScrollFollowProps](x: Self) {
      
      inline def setRender(value: ScrollFollowRenderProps => Node): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      inline def setStartFollowing(value: Boolean): Self = StObject.set(x, "startFollowing", value.asInstanceOf[js.Any])
      
      inline def setStartFollowingUndefined: Self = StObject.set(x, "startFollowing", js.undefined)
    }
  }
  
  trait ScrollFollowRenderProps extends StObject {
    
    var follow: Boolean
    
    def onScroll(args: ClientHeight): Unit
    
    def startFollowing(): Unit
    
    def stopFollowing(): Unit
  }
  object ScrollFollowRenderProps {
    
    inline def apply(
      follow: Boolean,
      onScroll: ClientHeight => Callback,
      startFollowing: Callback,
      stopFollowing: Callback
    ): ScrollFollowRenderProps = {
      val __obj = js.Dynamic.literal(follow = follow.asInstanceOf[js.Any], onScroll = js.Any.fromFunction1((t0: ClientHeight) => onScroll(t0).runNow()), startFollowing = startFollowing.toJsFn, stopFollowing = stopFollowing.toJsFn)
      __obj.asInstanceOf[ScrollFollowRenderProps]
    }
    
    extension [Self <: ScrollFollowRenderProps](x: Self) {
      
      inline def setFollow(value: Boolean): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
      
      inline def setOnScroll(value: ClientHeight => Callback): Self = StObject.set(x, "onScroll", js.Any.fromFunction1((t0: ClientHeight) => value(t0).runNow()))
      
      inline def setStartFollowing(value: Callback): Self = StObject.set(x, "startFollowing", value.toJsFn)
      
      inline def setStopFollowing(value: Callback): Self = StObject.set(x, "stopFollowing", value.toJsFn)
    }
  }
}
