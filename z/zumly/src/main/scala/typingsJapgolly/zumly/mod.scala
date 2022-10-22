package typingsJapgolly.zumly

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Element
import typingsJapgolly.std.Record
import typingsJapgolly.zumly.anon.Cover
import typingsJapgolly.zumly.anon.Render
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("zumly", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with typingsJapgolly.zumly.mod.zumly {
    /**
      * Creates a Zumly instance
      * @params options
      * @example
      *  new Zumly({
      *  mount: '.mount',
      *  initialView: 'home',
      *  views: {
      *   home,
      *   contact,
      *   ...
      *  }
      *
      */
    def this(options: Options) = this()
    
    /* CompleteClass */
    override def init(): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def zoomIn(el: Element): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def zoomLevel(): Double = js.native
    
    /* CompleteClass */
    override def zoomOut(): Unit = js.native
  }
  
  trait Options extends StObject {
    
    // Activate debug notifications
    var debug: js.UndefOr[Boolean] = js.undefined
    
    // First rendered view name
    var initialView: String
    
    // Mount DOM Element
    var mount: String
    
    // Custom transitions
    var transitions: js.UndefOr[Cover] = js.undefined
    
    // Store of all view objects
    var views: Record[String, WithRender | String]
  }
  object Options {
    
    inline def apply(initialView: String, mount: String, views: Record[String, WithRender | String]): Options = {
      val __obj = js.Dynamic.literal(initialView = initialView.asInstanceOf[js.Any], mount = mount.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setInitialView(value: String): Self = StObject.set(x, "initialView", value.asInstanceOf[js.Any])
      
      inline def setMount(value: String): Self = StObject.set(x, "mount", value.asInstanceOf[js.Any])
      
      inline def setTransitions(value: Cover): Self = StObject.set(x, "transitions", value.asInstanceOf[js.Any])
      
      inline def setTransitionsUndefined: Self = StObject.set(x, "transitions", js.undefined)
      
      inline def setViews(value: Record[String, WithRender | String]): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
    }
  }
  
  type WithRender = (Record[String, Any]) & Render
  
  trait zumly extends StObject {
    
    def init(): js.Promise[Unit]
    
    def zoomIn(el: Element): js.Promise[Unit]
    
    def zoomLevel(): Double
    
    def zoomOut(): Unit
  }
  object zumly {
    
    inline def apply(
      init: CallbackTo[js.Promise[Unit]],
      zoomIn: Element => js.Promise[Unit],
      zoomLevel: CallbackTo[Double],
      zoomOut: Callback
    ): typingsJapgolly.zumly.mod.zumly = {
      val __obj = js.Dynamic.literal(init = init.toJsFn, zoomIn = js.Any.fromFunction1(zoomIn), zoomLevel = zoomLevel.toJsFn, zoomOut = zoomOut.toJsFn)
      __obj.asInstanceOf[typingsJapgolly.zumly.mod.zumly]
    }
    
    extension [Self <: typingsJapgolly.zumly.mod.zumly](x: Self) {
      
      inline def setInit(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "init", value.toJsFn)
      
      inline def setZoomIn(value: Element => js.Promise[Unit]): Self = StObject.set(x, "zoomIn", js.Any.fromFunction1(value))
      
      inline def setZoomLevel(value: CallbackTo[Double]): Self = StObject.set(x, "zoomLevel", value.toJsFn)
      
      inline def setZoomOut(value: Callback): Self = StObject.set(x, "zoomOut", value.toJsFn)
    }
  }
}
