package typingsJapgolly.antdMobileRn.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antdMobileRn.libModalOperationContainerDotnativeMod.OperationContainerProps
import typingsJapgolly.antdMobileRn.libModalOperationContainerDotnativeMod.default
import typingsJapgolly.antdMobileRn.libModalPropsTypeMod.Action
import typingsJapgolly.reactNative.mod.TextStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OperationContainerDotnative {
  
  inline def apply(actions: js.Array[Action[TextStyle]]): Builder = {
    val __props = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[OperationContainerProps]))
  }
  
  @JSImport("antd-mobile-rn/lib/modal/OperationContainer.native", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def onAnimationEnd(value: /* visible */ Boolean => Callback): this.type = set("onAnimationEnd", js.Any.fromFunction1((t0: /* visible */ Boolean) => value(t0).runNow()))
  }
  
  def withProps(p: OperationContainerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
