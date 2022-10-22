package typingsJapgolly.reactOverlays

import japgolly.scalajs.react.ReactEventFrom
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.Element
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmDropdownContextMod extends Shortcut {
  
  @JSImport("react-overlays/esm/DropdownContext", JSImport.Default)
  @js.native
  val default: Context[DropdownContextValue | Null] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactOverlays.reactOverlaysStrings.up
    - typingsJapgolly.reactOverlays.reactOverlaysStrings.down
    - typingsJapgolly.reactOverlays.reactOverlaysStrings.left
    - typingsJapgolly.reactOverlays.reactOverlaysStrings.right
  */
  trait DropDirection extends StObject
  object DropDirection {
    
    inline def down: typingsJapgolly.reactOverlays.reactOverlaysStrings.down = "down".asInstanceOf[typingsJapgolly.reactOverlays.reactOverlaysStrings.down]
    
    inline def left: typingsJapgolly.reactOverlays.reactOverlaysStrings.left = "left".asInstanceOf[typingsJapgolly.reactOverlays.reactOverlaysStrings.left]
    
    inline def right: typingsJapgolly.reactOverlays.reactOverlaysStrings.right = "right".asInstanceOf[typingsJapgolly.reactOverlays.reactOverlaysStrings.right]
    
    inline def up: typingsJapgolly.reactOverlays.reactOverlaysStrings.up = "up".asInstanceOf[typingsJapgolly.reactOverlays.reactOverlaysStrings.up]
  }
  
  @js.native
  trait DropdownContextValue extends StObject {
    
    var alignEnd: js.UndefOr[Boolean] = js.native
    
    var drop: js.UndefOr[DropDirection] = js.native
    
    var menuElement: HTMLElement | Null = js.native
    
    def setMenu(): Unit = js.native
    def setMenu(ref: HTMLElement): Unit = js.native
    
    def setToggle(): Unit = js.native
    def setToggle(ref: HTMLElement): Unit = js.native
    
    var show: Boolean = js.native
    
    def toggle(nextShow: Boolean): Unit = js.native
    def toggle(nextShow: Boolean, event: ReactEventFrom[Element]): Unit = js.native
    def toggle(nextShow: Boolean, event: Event): Unit = js.native
    
    var toggleElement: HTMLElement | Null = js.native
  }
  
  type _To = Context[DropdownContextValue | Null]
  
  /* This means you don't have to write `default`, but can instead just say `esmDropdownContextMod.foo` */
  override def _to: Context[DropdownContextValue | Null] = default
}
