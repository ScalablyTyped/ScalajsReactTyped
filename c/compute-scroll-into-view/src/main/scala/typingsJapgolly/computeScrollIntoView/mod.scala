package typingsJapgolly.computeScrollIntoView

import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("compute-scroll-into-view", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(target: Element, options: Options): js.Array[CustomScrollAction] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[CustomScrollAction]]
  
  trait CustomScrollAction extends StObject {
    
    var el: Element
    
    var left: Double
    
    var top: Double
  }
  object CustomScrollAction {
    
    inline def apply(el: Element, left: Double, top: Double): CustomScrollAction = {
      val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomScrollAction]
    }
    
    extension [Self <: CustomScrollAction](x: Self) {
      
      inline def setEl(value: Element): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  type CustomScrollBoundary = Element | CustomScrollBoundaryCallback | Null
  
  type CustomScrollBoundaryCallback = js.Function1[/* parent */ Element, Boolean]
  
  trait Options extends StObject {
    
    var block: js.UndefOr[ScrollLogicalPosition] = js.undefined
    
    var boundary: js.UndefOr[CustomScrollBoundary] = js.undefined
    
    var `inline`: js.UndefOr[ScrollLogicalPosition] = js.undefined
    
    var scrollMode: js.UndefOr[ScrollMode] = js.undefined
    
    var skipOverflowHiddenElements: js.UndefOr[SkipOverflowHiddenElements] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBlock(value: ScrollLogicalPosition): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      inline def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
      
      inline def setBoundary(value: CustomScrollBoundary): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
      
      inline def setBoundaryFunction1(value: /* parent */ Element => Boolean): Self = StObject.set(x, "boundary", js.Any.fromFunction1(value))
      
      inline def setBoundaryNull: Self = StObject.set(x, "boundary", null)
      
      inline def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
      
      inline def setInline(value: ScrollLogicalPosition): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      inline def setScrollMode(value: ScrollMode): Self = StObject.set(x, "scrollMode", value.asInstanceOf[js.Any])
      
      inline def setScrollModeUndefined: Self = StObject.set(x, "scrollMode", js.undefined)
      
      inline def setSkipOverflowHiddenElements(value: SkipOverflowHiddenElements): Self = StObject.set(x, "skipOverflowHiddenElements", value.asInstanceOf[js.Any])
      
      inline def setSkipOverflowHiddenElementsUndefined: Self = StObject.set(x, "skipOverflowHiddenElements", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.computeScrollIntoView.computeScrollIntoViewStrings.start
    - typingsJapgolly.computeScrollIntoView.computeScrollIntoViewStrings.center
    - typingsJapgolly.computeScrollIntoView.computeScrollIntoViewStrings.end
    - typingsJapgolly.computeScrollIntoView.computeScrollIntoViewStrings.nearest
  */
  trait ScrollLogicalPosition extends StObject
  object ScrollLogicalPosition {
    
    inline def center: typingsJapgolly.computeScrollIntoView.computeScrollIntoViewStrings.center = "center".asInstanceOf[typingsJapgolly.computeScrollIntoView.computeScrollIntoViewStrings.center]
    
    inline def end: typingsJapgolly.computeScrollIntoView.computeScrollIntoViewStrings.end = "end".asInstanceOf[typingsJapgolly.computeScrollIntoView.computeScrollIntoViewStrings.end]
    
    inline def nearest: typingsJapgolly.computeScrollIntoView.computeScrollIntoViewStrings.nearest = "nearest".asInstanceOf[typingsJapgolly.computeScrollIntoView.computeScrollIntoViewStrings.nearest]
    
    inline def start: typingsJapgolly.computeScrollIntoView.computeScrollIntoViewStrings.start = "start".asInstanceOf[typingsJapgolly.computeScrollIntoView.computeScrollIntoViewStrings.start]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.computeScrollIntoView.computeScrollIntoViewStrings.always
    - typingsJapgolly.computeScrollIntoView.computeScrollIntoViewStrings.`if-needed`
  */
  trait ScrollMode extends StObject
  object ScrollMode {
    
    inline def always: typingsJapgolly.computeScrollIntoView.computeScrollIntoViewStrings.always = "always".asInstanceOf[typingsJapgolly.computeScrollIntoView.computeScrollIntoViewStrings.always]
    
    inline def `if-needed`: typingsJapgolly.computeScrollIntoView.computeScrollIntoViewStrings.`if-needed` = "if-needed".asInstanceOf[typingsJapgolly.computeScrollIntoView.computeScrollIntoViewStrings.`if-needed`]
  }
  
  type SkipOverflowHiddenElements = Boolean
}
