package typingsJapgolly.reactSpinners.components

import org.scalajs.dom.HTMLSpanElement
import typingsJapgolly.reactSpinners.esmHelpersPropsMod.LoaderSizeMarginProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SyncLoader {
  
  @JSImport("react-spinners/esm", "SyncLoader")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: SyncLoader.type): SharedBuilder_LoaderSizeMarginProps_1327159610[HTMLSpanElement] = new SharedBuilder_LoaderSizeMarginProps_1327159610[HTMLSpanElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: LoaderSizeMarginProps): SharedBuilder_LoaderSizeMarginProps_1327159610[HTMLSpanElement] = new SharedBuilder_LoaderSizeMarginProps_1327159610[HTMLSpanElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
