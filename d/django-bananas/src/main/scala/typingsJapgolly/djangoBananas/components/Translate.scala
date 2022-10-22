package typingsJapgolly.djangoBananas.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.djangoBananas.mod.TranslateProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Translate {
  
  inline def apply(children: String, params: Any): Default[js.Object] = {
    val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[TranslateProps]))
  }
  
  @JSImport("django-bananas", "Translate")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: TranslateProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
