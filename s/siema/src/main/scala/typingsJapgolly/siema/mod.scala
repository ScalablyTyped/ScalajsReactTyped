package typingsJapgolly.siema

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.NumberDictionary
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("siema", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Siema {
    def this(options: SiemaOptions) = this()
  }
  
  type PageInterface = NumberDictionary[Double]
  
  @js.native
  trait Siema extends StObject {
    
    def append(item: HTMLElement): Unit = js.native
    def append(item: HTMLElement, callback: js.Function0[Unit]): Unit = js.native
    
    var currentSlide: Double = js.native
    
    def destroy(): Unit = js.native
    def destroy(restoreMarkup: Boolean): Unit = js.native
    def destroy(restoreMarkup: Boolean, callback: js.Function0[Unit]): Unit = js.native
    def destroy(restoreMarkup: Unit, callback: js.Function0[Unit]): Unit = js.native
    
    def goTo(index: Double): Unit = js.native
    def goTo(index: Double, callback: js.Function0[Unit]): Unit = js.native
    
    def insert(item: HTMLElement, index: Double): Unit = js.native
    def insert(item: HTMLElement, index: Double, callback: js.Function0[Unit]): Unit = js.native
    
    def next(): Unit = js.native
    def next(index: Double): Unit = js.native
    def next(index: Double, callback: js.Function0[Unit]): Unit = js.native
    def next(index: Unit, callback: js.Function0[Unit]): Unit = js.native
    
    var perPage: Double = js.native
    
    def prepend(item: HTMLElement): Unit = js.native
    def prepend(item: HTMLElement, callback: js.Function0[Unit]): Unit = js.native
    
    def prev(): Unit = js.native
    def prev(index: Double): Unit = js.native
    def prev(index: Double, callback: js.Function0[Unit]): Unit = js.native
    def prev(index: Unit, callback: js.Function0[Unit]): Unit = js.native
    
    def remove(index: Double): Unit = js.native
    def remove(index: Double, callback: js.Function0[Unit]): Unit = js.native
  }
  
  trait SiemaOptions extends StObject {
    
    var draggable: js.UndefOr[Boolean] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var easing: js.UndefOr[String] = js.undefined
    
    var loop: js.UndefOr[Boolean] = js.undefined
    
    var multipleDrag: js.UndefOr[Boolean] = js.undefined
    
    var onChange: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onInit: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var perPage: js.UndefOr[Double | PageInterface] = js.undefined
    
    var rtl: js.UndefOr[Boolean] = js.undefined
    
    var selector: js.UndefOr[String | HTMLElement] = js.undefined
    
    var startIndex: js.UndefOr[Double] = js.undefined
    
    var threshold: js.UndefOr[Double] = js.undefined
  }
  object SiemaOptions {
    
    inline def apply(): SiemaOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SiemaOptions]
    }
    
    extension [Self <: SiemaOptions](x: Self) {
      
      inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      inline def setMultipleDrag(value: Boolean): Self = StObject.set(x, "multipleDrag", value.asInstanceOf[js.Any])
      
      inline def setMultipleDragUndefined: Self = StObject.set(x, "multipleDrag", js.undefined)
      
      inline def setOnChange(value: Callback): Self = StObject.set(x, "onChange", value.toJsFn)
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnInit(value: Callback): Self = StObject.set(x, "onInit", value.toJsFn)
      
      inline def setOnInitUndefined: Self = StObject.set(x, "onInit", js.undefined)
      
      inline def setPerPage(value: Double | PageInterface): Self = StObject.set(x, "perPage", value.asInstanceOf[js.Any])
      
      inline def setPerPageUndefined: Self = StObject.set(x, "perPage", js.undefined)
      
      inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      inline def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      inline def setSelector(value: String | HTMLElement): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
      
      inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
      
      inline def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
      
      inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    }
  }
}
