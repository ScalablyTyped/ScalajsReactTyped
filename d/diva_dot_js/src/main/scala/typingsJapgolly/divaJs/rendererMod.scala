package typingsJapgolly.divaJs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.divaJs.interfacesMod.RendererConfig
import typingsJapgolly.divaJs.interfacesMod.SourceProvider
import typingsJapgolly.divaJs.interfacesMod.ViewportPosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rendererMod {
  
  @JSImport("diva.js/renderer", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Renderer {
    def this(options: RendererConfig, hooks: js.Object) = this()
    
    /* CompleteClass */
    override def adjust(): Unit = js.native
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def getRenderedPages(): Any = js.native
    
    /* CompleteClass */
    override def goto(pageIndex: Double, verticalOffset: Double, horizontalOffset: Double): Unit = js.native
    
    /* CompleteClass */
    override def isPageVisible(pageIndex: Double): Boolean = js.native
    
    /* CompleteClass */
    var layout: typingsJapgolly.divaJs.documentLayoutMod.default | Null = js.native
    
    /* CompleteClass */
    override def load(config: js.Object, viewportPosition: ViewportPosition, sourceResolver: SourceProvider): Unit = js.native
    
    /* CompleteClass */
    override def transitionViewportPosition(options: js.Object): Unit = js.native
  }
  /* static members */
  object default {
    
    @JSImport("diva.js/renderer", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def getCompatibilityErrors(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getCompatibilityErrors")().asInstanceOf[String | Null]
  }
  
  trait Renderer extends StObject {
    
    def adjust(): Unit
    
    def destroy(): Unit
    
    def getRenderedPages(): Any
    
    def goto(pageIndex: Double, verticalOffset: Double, horizontalOffset: Double): Unit
    
    def isPageVisible(pageIndex: Double): Boolean
    
    var layout: typingsJapgolly.divaJs.documentLayoutMod.default | Null
    
    def load(config: js.Object, viewportPosition: ViewportPosition, sourceResolver: SourceProvider): Unit
    
    def transitionViewportPosition(options: js.Object): Unit
  }
  object Renderer {
    
    inline def apply(
      adjust: Callback,
      destroy: Callback,
      getRenderedPages: CallbackTo[Any],
      goto: (Double, Double, Double) => Callback,
      isPageVisible: Double => Boolean,
      load: (js.Object, ViewportPosition, SourceProvider) => Callback,
      transitionViewportPosition: js.Object => Callback
    ): Renderer = {
      val __obj = js.Dynamic.literal(adjust = adjust.toJsFn, destroy = destroy.toJsFn, getRenderedPages = getRenderedPages.toJsFn, goto = js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (goto(t0, t1, t2)).runNow()), isPageVisible = js.Any.fromFunction1(isPageVisible), load = js.Any.fromFunction3((t0: js.Object, t1: ViewportPosition, t2: SourceProvider) => (load(t0, t1, t2)).runNow()), transitionViewportPosition = js.Any.fromFunction1((t0: js.Object) => transitionViewportPosition(t0).runNow()), layout = null)
      __obj.asInstanceOf[Renderer]
    }
    
    extension [Self <: Renderer](x: Self) {
      
      inline def setAdjust(value: Callback): Self = StObject.set(x, "adjust", value.toJsFn)
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setGetRenderedPages(value: CallbackTo[Any]): Self = StObject.set(x, "getRenderedPages", value.toJsFn)
      
      inline def setGoto(value: (Double, Double, Double) => Callback): Self = StObject.set(x, "goto", js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
      
      inline def setIsPageVisible(value: Double => Boolean): Self = StObject.set(x, "isPageVisible", js.Any.fromFunction1(value))
      
      inline def setLayout(value: typingsJapgolly.divaJs.documentLayoutMod.default): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLayoutNull: Self = StObject.set(x, "layout", null)
      
      inline def setLoad(value: (js.Object, ViewportPosition, SourceProvider) => Callback): Self = StObject.set(x, "load", js.Any.fromFunction3((t0: js.Object, t1: ViewportPosition, t2: SourceProvider) => (value(t0, t1, t2)).runNow()))
      
      inline def setTransitionViewportPosition(value: js.Object => Callback): Self = StObject.set(x, "transitionViewportPosition", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    }
  }
}
