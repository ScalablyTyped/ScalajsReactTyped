package typingsJapgolly.reactGravatar.components

import typingsJapgolly.reactGravatar.global.Gravatar.^
import typingsJapgolly.reactGravatar.mod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Gravatar {
  
  @JSGlobal("Gravatar")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Gravatar.type): SharedBuilder_Props_1615333234[^] = new SharedBuilder_Props_1615333234[^](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): SharedBuilder_Props_1615333234[^] = new SharedBuilder_Props_1615333234[^](js.Array(this.component, p.asInstanceOf[js.Any]))
}
