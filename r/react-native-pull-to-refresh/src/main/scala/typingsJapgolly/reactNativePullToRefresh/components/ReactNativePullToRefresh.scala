package typingsJapgolly.reactNativePullToRefresh.components

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNativePullToRefresh.mod.PTRViewProps
import typingsJapgolly.reactNativePullToRefresh.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativePullToRefresh {
  
  @JSImport("react-native-pull-to-refresh", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def colors(value: String): this.type = set("colors", value.asInstanceOf[js.Any])
    
    inline def delay(value: Double): this.type = set("delay", value.asInstanceOf[js.Any])
    
    inline def offset(value: Double): this.type = set("offset", value.asInstanceOf[js.Any])
    
    inline def onRefresh(value: CallbackTo[Any]): this.type = set("onRefresh", value.toJsFn)
    
    inline def progressBackgroundColor(value: String): this.type = set("progressBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactNativePullToRefresh.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PTRViewProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
