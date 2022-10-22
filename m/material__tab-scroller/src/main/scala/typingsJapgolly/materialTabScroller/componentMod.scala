package typingsJapgolly.materialTabScroller

import typingsJapgolly.materialBase.Element
import typingsJapgolly.materialBase.componentMod.MDCComponent
import typingsJapgolly.materialTabScroller.foundationMod.MDCTabScrollerFoundation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("@material/tab-scroller/component", "MDCTabScroller")
  @js.native
  open class MDCTabScroller protected () extends MDCComponent[MDCTabScrollerFoundation] {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(root: Element, foundation: MDCTabScrollerFoundation, args: Any*) = this()
    
    /* private */ var area: Any = js.native
    
    /* private */ var content: Any = js.native
    
    /**
      * Returns the width of the scroll content
      */
    def getScrollContentWidth(): Double = js.native
    
    /**
      * Returns the current visual scroll position
      */
    def getScrollPosition(): Double = js.native
    
    /* private */ var handleInteraction: Any = js.native
    
    /* private */ var handleTransitionEnd: Any = js.native
    
    /**
      * Increments the scroll value by the given amount
      * @param scrollXIncrement The pixel value by which to increment the scroll value
      */
    def incrementScroll(scrollXIncrement: Double): Unit = js.native
    
    def initialize(): Unit = js.native
    
    /**
      * Scrolls to the given pixel position
      * @param scrollX The pixel value to scroll to
      */
    def scrollTo(scrollX: Double): Unit = js.native
  }
  /* static members */
  object MDCTabScroller {
    
    @JSImport("@material/tab-scroller/component", "MDCTabScroller")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: org.scalajs.dom.Element): MDCTabScroller = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[MDCTabScroller]
  }
  
  type MDCTabScrollerFactory = js.Function2[
    /* el */ org.scalajs.dom.Element, 
    /* foundation */ js.UndefOr[MDCTabScrollerFoundation], 
    MDCTabScroller
  ]
}
