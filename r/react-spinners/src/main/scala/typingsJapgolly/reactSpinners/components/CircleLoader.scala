package typingsJapgolly.reactSpinners.components

import org.scalajs.dom.HTMLSpanElement
import typingsJapgolly.reactSpinners.esmHelpersPropsMod.LoaderSizeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CircleLoader {
  
  @JSImport("react-spinners/esm", "CircleLoader")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: CircleLoader.type): SharedBuilder_LoaderSizeProps_16572679[HTMLSpanElement] = new SharedBuilder_LoaderSizeProps_16572679[HTMLSpanElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: LoaderSizeProps): SharedBuilder_LoaderSizeProps_16572679[HTMLSpanElement] = new SharedBuilder_LoaderSizeProps_16572679[HTMLSpanElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
