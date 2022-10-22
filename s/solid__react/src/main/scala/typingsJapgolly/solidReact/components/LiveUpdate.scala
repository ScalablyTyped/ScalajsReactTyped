package typingsJapgolly.solidReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.solidReact.anon.Subscribe
import typingsJapgolly.solidReact.solidReactStrings.Asterisk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LiveUpdate {
  
  @JSImport("@solid/react", "LiveUpdate")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.solidReact.mod.LiveUpdate] {
    
    inline def subscribe(value: Asterisk | String | js.Array[String]): this.type = set("subscribe", value.asInstanceOf[js.Any])
    
    inline def subscribeVarargs(value: String*): this.type = set("subscribe", js.Array(value*))
  }
  
  implicit def make(companion: LiveUpdate.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Subscribe): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
