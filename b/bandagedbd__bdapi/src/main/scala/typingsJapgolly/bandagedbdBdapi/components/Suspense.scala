package typingsJapgolly.bandagedbdBdapi.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.SuspenseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Suspense {
  
  @JSGlobal("BdApi.React.Suspense")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def fallback(value: VdomNode): this.type = set("fallback", value.rawNode.asInstanceOf[js.Any])
    
    inline def fallbackNull: this.type = set("fallback", null)
    
    inline def fallbackVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("fallback", js.Array(value*))
    
    inline def fallbackVdomElement(value: VdomElement): this.type = set("fallback", value.rawElement.asInstanceOf[js.Any])
    
    inline def unstable_expectedLoadTime(value: Double): this.type = set("unstable_expectedLoadTime", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Suspense.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SuspenseProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
