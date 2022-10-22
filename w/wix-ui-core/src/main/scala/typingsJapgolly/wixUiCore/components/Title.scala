package typingsJapgolly.wixUiCore.components

import typingsJapgolly.wixUiCore.anon.PickTitlePropschildren
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Title {
  
  @JSImport("wix-ui-core/dist/es/src", "Title")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Title.type): SharedBuilder_PickTitlePropschildren_1463857465 = new SharedBuilder_PickTitlePropschildren_1463857465(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PickTitlePropschildren): SharedBuilder_PickTitlePropschildren_1463857465 = new SharedBuilder_PickTitlePropschildren_1463857465(js.Array(this.component, p.asInstanceOf[js.Any]))
}
