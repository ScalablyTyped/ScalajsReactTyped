package typingsJapgolly.officeUiFabricReact.components

import typingsJapgolly.officeUiFabricReact.libComponentsTextTextDottypesMod.ITextProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Text {
  
  @JSImport("office-ui-fabric-react", "Text")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Text.type): SharedBuilder_ITextProps_1370221734 = new SharedBuilder_ITextProps_1370221734(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ITextProps): SharedBuilder_ITextProps_1370221734 = new SharedBuilder_ITextProps_1370221734(js.Array(this.component, p.asInstanceOf[js.Any]))
}
