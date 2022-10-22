package typingsJapgolly.reactNativeActionsheet.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNativeActionsheet.mod.ActionSheetCustomProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ActionSheetCustom {
  
  inline def apply(onPress: Double => Callback, options: js.Array[Node]): Builder = {
    val __props = js.Dynamic.literal(onPress = js.Any.fromFunction1((t0: Double) => onPress(t0).runNow()), options = options.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ActionSheetCustomProps]))
  }
  
  @JSImport("react-native-actionsheet", "ActionSheetCustom")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactNativeActionsheet.mod.ActionSheetCustom] {
    
    inline def buttonUnderlayColor(value: String): this.type = set("buttonUnderlayColor", value.asInstanceOf[js.Any])
    
    inline def cancelButtonIndex(value: Double): this.type = set("cancelButtonIndex", value.asInstanceOf[js.Any])
    
    inline def destructiveButtonIndex(value: Double): this.type = set("destructiveButtonIndex", value.asInstanceOf[js.Any])
    
    inline def message(value: String): this.type = set("message", value.asInstanceOf[js.Any])
    
    inline def styles(value: js.Object): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def tintColor(value: String): this.type = set("tintColor", value.asInstanceOf[js.Any])
    
    inline def title(value: VdomNode): this.type = set("title", value.rawNode.asInstanceOf[js.Any])
    
    inline def titleNull: this.type = set("title", null)
    
    inline def titleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("title", js.Array(value*))
    
    inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
  }
  
  def withProps(p: ActionSheetCustomProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
