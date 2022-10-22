package typingsJapgolly.reactSpinners.components

import org.scalajs.dom.HTMLSpanElement
import typingsJapgolly.reactSpinners.esmHelpersPropsMod.LoaderSizeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BounceLoader {
  
  @JSImport("react-spinners/esm", "BounceLoader")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: BounceLoader.type): SharedBuilder_LoaderSizeProps_16572679[HTMLSpanElement] = new SharedBuilder_LoaderSizeProps_16572679[HTMLSpanElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: LoaderSizeProps): SharedBuilder_LoaderSizeProps_16572679[HTMLSpanElement] = new SharedBuilder_LoaderSizeProps_16572679[HTMLSpanElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
