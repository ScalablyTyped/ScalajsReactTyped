package typingsJapgolly.wordpressBlockEditor.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.wordpressBlockEditor.componentsUrlInputButtonMod.URLInputButton.Props
import typingsJapgolly.wordpressBlockEditor.componentsUrlInputMod.URLInput.PostType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object URLInputButton {
  
  inline def apply(onChange: (/* url */ String, /* post */ PostType | Null) => Callback, url: String): Default[js.Object] = {
    val __props = js.Dynamic.literal(onChange = js.Any.fromFunction2((t0: /* url */ String, t1: /* post */ PostType | Null) => (onChange(t0, t1)).runNow()), url = url.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("@wordpress/block-editor", "URLInputButton")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
