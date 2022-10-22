package typingsJapgolly.reactRouterNative.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactRouterNative.mod.NativeRouterProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NativeRouter {
  
  @JSImport("react-router-native", "NativeRouter")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactRouterNative.mod.NativeRouter] {
    
    inline def getUserConfirmation(value: js.Function): this.type = set("getUserConfirmation", value.asInstanceOf[js.Any])
    
    inline def initialEntries(value: js.Array[String]): this.type = set("initialEntries", value.asInstanceOf[js.Any])
    
    inline def initialEntriesVarargs(value: String*): this.type = set("initialEntries", js.Array(value*))
    
    inline def initialIndex(value: Double): this.type = set("initialIndex", value.asInstanceOf[js.Any])
    
    inline def keyLength(value: Double): this.type = set("keyLength", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: NativeRouter.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: NativeRouterProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
