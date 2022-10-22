package typingsJapgolly.atom

import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Node
import typingsJapgolly.atom.anon.Class
import typingsJapgolly.atom.anon.Item
import typingsJapgolly.atom.atomStrings.bottom_
import typingsJapgolly.atom.atomStrings.left_
import typingsJapgolly.atom.atomStrings.right_
import typingsJapgolly.atom.atomStrings.top_
import typingsJapgolly.atom.mod.Disposable
import typingsJapgolly.atom.srcTooltipMod.Tooltip
import typingsJapgolly.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTooltipManagerMod {
  
  @js.native
  trait JQueryCompatible[Element /* <: Node */]
    extends StObject
       with Iterable[Element] {
    
    var jquery: String = js.native
  }
  
  @js.native
  trait TooltipManager extends StObject {
    
    def add(target: HTMLElement, options: Class): Disposable = js.native
    /** Add a tooltip to the given element. */
    def add(target: HTMLElement, options: Item): Disposable = js.native
    def add(target: JQueryCompatible[HTMLElement], options: Class): Disposable = js.native
    def add(target: JQueryCompatible[HTMLElement], options: Item): Disposable = js.native
    
    /** Find the tooltips that have been applied to the given element. */
    def findTooltips(target: HTMLElement): js.Array[Tooltip] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.atom.atomStrings.top_
    - typingsJapgolly.atom.atomStrings.bottom_
    - typingsJapgolly.atom.atomStrings.left_
    - typingsJapgolly.atom.atomStrings.right_
    - typingsJapgolly.atom.atomStrings.auto
    - typingsJapgolly.atom.atomStrings.`auto top`
    - typingsJapgolly.atom.atomStrings.`auto bottom`
    - typingsJapgolly.atom.atomStrings.`auto left`
    - typingsJapgolly.atom.atomStrings.`auto right`
  */
  trait TooltipPlacement extends StObject
  object TooltipPlacement {
    
    inline def auto: typingsJapgolly.atom.atomStrings.auto = "auto".asInstanceOf[typingsJapgolly.atom.atomStrings.auto]
    
    inline def `auto bottom`: typingsJapgolly.atom.atomStrings.`auto bottom` = ("auto bottom").asInstanceOf[typingsJapgolly.atom.atomStrings.`auto bottom`]
    
    inline def `auto left`: typingsJapgolly.atom.atomStrings.`auto left` = ("auto left").asInstanceOf[typingsJapgolly.atom.atomStrings.`auto left`]
    
    inline def `auto right`: typingsJapgolly.atom.atomStrings.`auto right` = ("auto right").asInstanceOf[typingsJapgolly.atom.atomStrings.`auto right`]
    
    inline def `auto top`: typingsJapgolly.atom.atomStrings.`auto top` = ("auto top").asInstanceOf[typingsJapgolly.atom.atomStrings.`auto top`]
    
    inline def bottom: bottom_ = "bottom".asInstanceOf[bottom_]
    
    inline def left: left_ = "left".asInstanceOf[left_]
    
    inline def right: right_ = "right".asInstanceOf[right_]
    
    inline def top: top_ = "top".asInstanceOf[top_]
  }
}
