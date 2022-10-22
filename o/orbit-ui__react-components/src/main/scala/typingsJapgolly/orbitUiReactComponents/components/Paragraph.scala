package typingsJapgolly.orbitUiReactComponents.components

import org.scalajs.dom.HTMLElement
import typingsJapgolly.orbitUiReactComponents.distSharedSrcForwardRefMod.MergeWithAs
import typingsJapgolly.orbitUiReactComponents.distTypographySrcParagraphMod.InnerParagraphProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Paragraph {
  
  @JSImport("@orbit-ui/react-components", "Paragraph")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Paragraph.type): SharedBuilder_MergeWithAs_1141690908 = new SharedBuilder_MergeWithAs_1141690908(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MergeWithAs[HTMLElement, InnerParagraphProps]): SharedBuilder_MergeWithAs_1141690908 = new SharedBuilder_MergeWithAs_1141690908(js.Array(this.component, p.asInstanceOf[js.Any]))
}
