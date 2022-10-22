package typingsJapgolly.glidejsGlide.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLAnchorElement
import typingsJapgolly.std.HTMLCollectionOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnchorsComponent
  extends StObject
     with Component {
  
  /**
    * Restores href attribute on anchors and allows for redirections on click.
    */
  def attach(): this.type
  
  /**
    * Detaches href attribute from anchors and prevents redirections after click or swipe.
    */
  def detach(): this.type
  
  /**
    * Holds collection of `<a>` elements located inside slides.
    */
  val items: HTMLCollectionOf[HTMLAnchorElement]
  
  @JSName("mount")
  def mount_MAnchorsComponent(): Unit
}
object AnchorsComponent {
  
  inline def apply(
    attach: CallbackTo[AnchorsComponent],
    detach: CallbackTo[AnchorsComponent],
    items: HTMLCollectionOf[HTMLAnchorElement],
    mount: Callback
  ): AnchorsComponent = {
    val __obj = js.Dynamic.literal(attach = attach.toJsFn, detach = detach.toJsFn, items = items.asInstanceOf[js.Any], mount = mount.toJsFn)
    __obj.asInstanceOf[AnchorsComponent]
  }
  
  extension [Self <: AnchorsComponent](x: Self) {
    
    inline def setAttach(value: CallbackTo[AnchorsComponent]): Self = StObject.set(x, "attach", value.toJsFn)
    
    inline def setDetach(value: CallbackTo[AnchorsComponent]): Self = StObject.set(x, "detach", value.toJsFn)
    
    inline def setItems(value: HTMLCollectionOf[HTMLAnchorElement]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setMount(value: Callback): Self = StObject.set(x, "mount", value.toJsFn)
  }
}
