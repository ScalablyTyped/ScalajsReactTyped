package typingsJapgolly.reactResizeDetector.components

import org.scalajs.dom.HTMLElement
import typingsJapgolly.reactResizeDetector.buildResizeDetectorMod.ComponentsProps
import typingsJapgolly.reactResizeDetector.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactResizeDetector {
  
  inline def apply[ElementT /* <: HTMLElement */](): SharedBuilder_ComponentsProps2056989417[default[ElementT], ElementT] = {
    val __props = js.Dynamic.literal()
    new SharedBuilder_ComponentsProps2056989417[default[ElementT], ElementT](js.Array(this.component, __props.asInstanceOf[ComponentsProps[ElementT]]))
  }
  
  @JSImport("react-resize-detector", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make[ElementT /* <: HTMLElement */](companion: ReactResizeDetector.type): SharedBuilder_ComponentsProps2056989417[default[ElementT], ElementT] = new SharedBuilder_ComponentsProps2056989417[default[ElementT], ElementT](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps[ElementT /* <: HTMLElement */](p: ComponentsProps[ElementT]): SharedBuilder_ComponentsProps2056989417[default[ElementT], ElementT] = new SharedBuilder_ComponentsProps2056989417[default[ElementT], ElementT](js.Array(this.component, p.asInstanceOf[js.Any]))
}
