package typingsJapgolly.three

import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import typingsJapgolly.three.srcThreeMod.Vector2
import typingsJapgolly.three.srcThreeMod.WebGLRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmInteractiveSelectionHelperMod {
  
  @JSImport("three/examples/jsm/interactive/SelectionHelper", "SelectionHelper")
  @js.native
  open class SelectionHelper protected () extends StObject {
    def this(renderer: WebGLRenderer, cssClassName: String) = this()
    
    var element: HTMLElement = js.native
    
    var isDown: Boolean = js.native
    
    def onSelectMove(event: Event): Unit = js.native
    
    def onSelectOver(event: Event): Unit = js.native
    
    def onSelectStart(event: Event): Unit = js.native
    
    var pointBottomRight: Vector2 = js.native
    
    var pointTopLeft: Vector2 = js.native
    
    var renderer: WebGLRenderer = js.native
    
    var startPoint: Vector2 = js.native
  }
}
