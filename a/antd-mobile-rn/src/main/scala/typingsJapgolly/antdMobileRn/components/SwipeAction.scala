package typingsJapgolly.antdMobileRn.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antdMobileRn.anon.ClassName
import typingsJapgolly.antdMobileRn.libSwipeActionIndexDotnativeMod.SwipeActionProps
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SwipeAction {
  
  @JSImport("antd-mobile-rn", "SwipeAction")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.antdMobileRn.mod.SwipeAction] {
    
    inline def autoClose(value: Boolean): this.type = set("autoClose", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def left(value: js.Array[ClassName[TextStyle]]): this.type = set("left", value.asInstanceOf[js.Any])
    
    inline def leftVarargs(value: ClassName[TextStyle]*): this.type = set("left", js.Array(value*))
    
    inline def onClose(value: Callback): this.type = set("onClose", value.toJsFn)
    
    inline def onOpen(value: Callback): this.type = set("onOpen", value.toJsFn)
    
    inline def right(value: js.Array[ClassName[TextStyle]]): this.type = set("right", value.asInstanceOf[js.Any])
    
    inline def rightVarargs(value: ClassName[TextStyle]*): this.type = set("right", js.Array(value*))
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def styles(value: Any): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: SwipeAction.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SwipeActionProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
