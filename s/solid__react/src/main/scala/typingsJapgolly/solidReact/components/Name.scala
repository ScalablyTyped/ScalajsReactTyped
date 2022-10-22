package typingsJapgolly.solidReact.components

import typingsJapgolly.solidReact.anon.Src
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Name {
  
  inline def apply(src: String): SharedBuilder_Src137749745[typingsJapgolly.solidReact.mod.Name] = {
    val __props = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    new SharedBuilder_Src137749745[typingsJapgolly.solidReact.mod.Name](js.Array(this.component, __props.asInstanceOf[Src]))
  }
  
  @JSImport("@solid/react", "Name")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Src): SharedBuilder_Src137749745[typingsJapgolly.solidReact.mod.Name] = new SharedBuilder_Src137749745[typingsJapgolly.solidReact.mod.Name](js.Array(this.component, p.asInstanceOf[js.Any]))
}
