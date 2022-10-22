package typingsJapgolly.antDesignReactNative

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.antDesignReactNative.libModalPropsTypeMod.Action
import typingsJapgolly.antDesignReactNative.libModalPropsTypeMod.CallbackOnBackHandler
import typingsJapgolly.reactNative.mod.TextStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModalAlertMod {
  
  @JSImport("@ant-design/react-native/lib/modal/alert", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(title: Node, content: Node): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(title.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def default(title: Node, content: Node, actions: js.Array[Action[TextStyle]]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(title.asInstanceOf[js.Any], content.asInstanceOf[js.Any], actions.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def default(
    title: Node,
    content: Node,
    actions: js.Array[Action[TextStyle]],
    onBackHandler: CallbackOnBackHandler
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(title.asInstanceOf[js.Any], content.asInstanceOf[js.Any], actions.asInstanceOf[js.Any], onBackHandler.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def default(title: Node, content: Node, actions: Unit, onBackHandler: CallbackOnBackHandler): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(title.asInstanceOf[js.Any], content.asInstanceOf[js.Any], actions.asInstanceOf[js.Any], onBackHandler.asInstanceOf[js.Any])).asInstanceOf[Double]
}
