package typingsJapgolly.clusterizeJs

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.clusterizeJs.anon.Blocksincluster
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("clusterize.js", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Clusterize {
    def this(options: Options) = this()
  }
  
  trait Callbacks extends StObject {
    
    var clusterChanged: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var clusterWillChange: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var scrollingProgress: js.UndefOr[js.Function1[/* progress */ Double, Unit]] = js.undefined
  }
  object Callbacks {
    
    inline def apply(): Callbacks = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Callbacks]
    }
    
    extension [Self <: Callbacks](x: Self) {
      
      inline def setClusterChanged(value: Callback): Self = StObject.set(x, "clusterChanged", value.toJsFn)
      
      inline def setClusterChangedUndefined: Self = StObject.set(x, "clusterChanged", js.undefined)
      
      inline def setClusterWillChange(value: Callback): Self = StObject.set(x, "clusterWillChange", value.toJsFn)
      
      inline def setClusterWillChangeUndefined: Self = StObject.set(x, "clusterWillChange", js.undefined)
      
      inline def setScrollingProgress(value: /* progress */ Double => Callback): Self = StObject.set(x, "scrollingProgress", js.Any.fromFunction1((t0: /* progress */ Double) => value(t0).runNow()))
      
      inline def setScrollingProgressUndefined: Self = StObject.set(x, "scrollingProgress", js.undefined)
    }
  }
  
  @js.native
  trait Clusterize extends StObject {
    
    def append(rows: js.Array[String]): Unit = js.native
    
    def clear(): Unit = js.native
    
    def destroy(): Unit = js.native
    def destroy(clean: Boolean): Unit = js.native
    
    def getRowsAmount(): Double = js.native
    
    def getScrollProgress(): Double = js.native
    
    def prepend(rows: js.Array[String]): Unit = js.native
    
    def refresh(): Unit = js.native
    def refresh(force: Boolean): Unit = js.native
    
    def update(): Unit = js.native
    def update(data: js.Array[String]): Unit = js.native
  }
  
  type Options = Setup & Blocksincluster
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.clusterizeJs.anon.ContentId
    - typingsJapgolly.clusterizeJs.anon.ContentElem
  */
  trait Setup extends StObject
  object Setup {
    
    inline def ContentElem(contentElem: HTMLElement, scrollElem: HTMLElement): typingsJapgolly.clusterizeJs.anon.ContentElem = {
      val __obj = js.Dynamic.literal(contentElem = contentElem.asInstanceOf[js.Any], scrollElem = scrollElem.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.clusterizeJs.anon.ContentElem]
    }
    
    inline def ContentId(contentId: String, scrollId: String): typingsJapgolly.clusterizeJs.anon.ContentId = {
      val __obj = js.Dynamic.literal(contentId = contentId.asInstanceOf[js.Any], scrollId = scrollId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.clusterizeJs.anon.ContentId]
    }
  }
}
