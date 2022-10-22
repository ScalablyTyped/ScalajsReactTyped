package typingsJapgolly.antvG2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInteractionActionElementRangeHighlightMod {
  
  /**
    * @ignore
    * 区域 highlight 的 Action
    */
  @JSImport("@antv/g2/lib/interaction/action/element/range-highlight", JSImport.Default)
  @js.native
  open class default () extends ElementRangeHighlight
  
  @JSImport("@antv/g2/lib/interaction/action/element/range-highlight", "ELEMENT_RANGE_HIGHLIGHT_EVENTS")
  @js.native
  object ELEMENT_RANGE_HIGHLIGHT_EVENTS extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[EVENTS & String] = js.native
    
    /* "element-range-highlight:afterclear" */ val AFTER_CLEAR: typingsJapgolly.antvG2.libInteractionActionElementRangeHighlightMod.EVENTS.AFTER_CLEAR & String = js.native
    
    /* "element-range-highlight:afterhighlight" */ val AFTER_HIGHLIGHT: typingsJapgolly.antvG2.libInteractionActionElementRangeHighlightMod.EVENTS.AFTER_HIGHLIGHT & String = js.native
    
    /* "element-range-highlight:beforeclear" */ val BEFORE_CLEAR: typingsJapgolly.antvG2.libInteractionActionElementRangeHighlightMod.EVENTS.BEFORE_CLEAR & String = js.native
    
    /* "element-range-highlight:beforehighlight" */ val BEFORE_HIGHLIGHT: typingsJapgolly.antvG2.libInteractionActionElementRangeHighlightMod.EVENTS.BEFORE_HIGHLIGHT & String = js.native
  }
  
  @js.native
  sealed trait EVENTS extends StObject
  @JSImport("@antv/g2/lib/interaction/action/element/range-highlight", "EVENTS")
  @js.native
  object EVENTS extends StObject {
    
    @js.native
    sealed trait AFTER_CLEAR
      extends StObject
         with EVENTS
    
    @js.native
    sealed trait AFTER_HIGHLIGHT
      extends StObject
         with EVENTS
    
    @js.native
    sealed trait BEFORE_CLEAR
      extends StObject
         with EVENTS
    
    @js.native
    sealed trait BEFORE_HIGHLIGHT
      extends StObject
         with EVENTS
  }
  
  /**
    * @ignore
    * 区域 highlight 的 Action
    */
  @js.native
  trait ElementRangeHighlight
    extends typingsJapgolly.antvG2.libInteractionActionElementRangeStateMod.default {
    
    /**
      * 设置 highlight
      */
    def highlight(): Unit = js.native
    
    /* protected */ def setElementsState(
      elements: js.Array[typingsJapgolly.antvG2.libGeometryElementMod.default],
      enable: Boolean,
      allElements: js.Array[typingsJapgolly.antvG2.libGeometryElementMod.default]
    ): Unit = js.native
  }
}
