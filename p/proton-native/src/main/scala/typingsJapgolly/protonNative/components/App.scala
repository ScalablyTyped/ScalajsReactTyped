package typingsJapgolly.protonNative.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.protonNative.mod.AppProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object App {
  
  @JSImport("proton-native", "App")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.protonNative.mod.App] {
    
    inline def onShouldQuit(value: Callback): this.type = set("onShouldQuit", value.toJsFn)
  }
  
  implicit def make(companion: App.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: AppProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
