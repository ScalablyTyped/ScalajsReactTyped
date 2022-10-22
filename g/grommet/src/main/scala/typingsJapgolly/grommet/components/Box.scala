package typingsJapgolly.grommet.components

import typingsJapgolly.grommet.es6ComponentsBoxMod.BoxExtendedProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Box {
  
  @JSImport("grommet/es6", "Box")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Box.type): SharedBuilder_BoxExtendedProps1736190285 = new SharedBuilder_BoxExtendedProps1736190285(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: BoxExtendedProps): SharedBuilder_BoxExtendedProps1736190285 = new SharedBuilder_BoxExtendedProps1736190285(js.Array(this.component, p.asInstanceOf[js.Any]))
}
