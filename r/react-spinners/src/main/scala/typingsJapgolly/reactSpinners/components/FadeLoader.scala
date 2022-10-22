package typingsJapgolly.reactSpinners.components

import org.scalajs.dom.HTMLSpanElement
import typingsJapgolly.reactSpinners.esmHelpersPropsMod.LoaderHeightWidthRadiusProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FadeLoader {
  
  @JSImport("react-spinners/esm", "FadeLoader")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: FadeLoader.type): SharedBuilder_LoaderHeightWidthRadiusProps_1640652458[HTMLSpanElement] = new SharedBuilder_LoaderHeightWidthRadiusProps_1640652458[HTMLSpanElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: LoaderHeightWidthRadiusProps): SharedBuilder_LoaderHeightWidthRadiusProps_1640652458[HTMLSpanElement] = new SharedBuilder_LoaderHeightWidthRadiusProps_1640652458[HTMLSpanElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
