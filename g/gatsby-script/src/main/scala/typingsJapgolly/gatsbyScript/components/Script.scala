package typingsJapgolly.gatsbyScript.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.ErrorEvent
import org.scalajs.dom.Event
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.gatsbyScript.distGatsbyScriptMod.ScriptProps
import typingsJapgolly.gatsbyScript.distGatsbyScriptMod.ScriptStrategy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Script {
  
  @JSImport("gatsby-script", "Script")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def children(value: String): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def forward(value: js.Array[String]): this.type = set("forward", value.asInstanceOf[js.Any])
    
    inline def forwardVarargs(value: String*): this.type = set("forward", js.Array(value*))
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def onError(value: /* event */ ErrorEvent => Callback): this.type = set("onError", js.Any.fromFunction1((t0: /* event */ ErrorEvent) => value(t0).runNow()))
    
    inline def onLoad(value: /* event */ Event => Callback): this.type = set("onLoad", js.Any.fromFunction1((t0: /* event */ Event) => value(t0).runNow()))
    
    inline def strategy(value: ScriptStrategy | (/* template literal string: post-hydrate */ String)): this.type = set("strategy", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Script.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ScriptProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
