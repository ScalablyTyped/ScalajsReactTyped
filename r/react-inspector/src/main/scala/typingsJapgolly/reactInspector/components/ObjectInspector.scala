package typingsJapgolly.reactInspector.components

import typingsJapgolly.reactInspector.anon.Dictx
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ObjectInspector {
  
  @JSImport("react-inspector", "ObjectInspector")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: ObjectInspector.type): SharedBuilder_Dictx1508287499 = new SharedBuilder_Dictx1508287499(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Dictx): SharedBuilder_Dictx1508287499 = new SharedBuilder_Dictx1508287499(js.Array(this.component, p.asInstanceOf[js.Any]))
}
