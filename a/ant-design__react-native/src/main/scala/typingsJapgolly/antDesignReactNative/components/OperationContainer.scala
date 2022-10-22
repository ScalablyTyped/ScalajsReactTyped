package typingsJapgolly.antDesignReactNative.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignReactNative.libModalOperationContainerMod.OperationContainerProps
import typingsJapgolly.antDesignReactNative.libModalOperationContainerMod.default
import typingsJapgolly.antDesignReactNative.libModalPropsTypeMod.Action
import typingsJapgolly.reactNative.mod.TextStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OperationContainer {
  
  inline def apply(actions: js.Array[Action[TextStyle]]): Builder = {
    val __props = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[OperationContainerProps]))
  }
  
  @JSImport("@ant-design/react-native/lib/modal/OperationContainer", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def onAnimationEnd(value: /* visible */ Boolean => Callback): this.type = set("onAnimationEnd", js.Any.fromFunction1((t0: /* visible */ Boolean) => value(t0).runNow()))
    
    inline def onBackHandler(value: CallbackTo[Boolean]): this.type = set("onBackHandler", value.toJsFn)
  }
  
  def withProps(p: OperationContainerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
