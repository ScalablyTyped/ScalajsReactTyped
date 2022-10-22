package typingsJapgolly.reactNativePaper.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNativePaper.anon.testIDstringiconReactNode
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.left
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IconAdornment {
  
  inline def apply(
    forceFocus: Callback,
    isTextInputFocused: Boolean,
    side: left | right,
    testID: String,
    topPosition: Double
  ): Builder = {
    val __props = js.Dynamic.literal(forceFocus = forceFocus.toJsFn, isTextInputFocused = isTextInputFocused.asInstanceOf[js.Any], side = side.asInstanceOf[js.Any], testID = testID.asInstanceOf[js.Any], topPosition = topPosition.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[testIDstringiconReactNode]))
  }
  
  @JSImport("react-native-paper/lib/typescript/components/TextInput/Adornment/TextInputIcon", "IconAdornment")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def icon(value: VdomNode): this.type = set("icon", value.rawNode.asInstanceOf[js.Any])
    
    inline def iconNull: this.type = set("icon", null)
    
    inline def iconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("icon", js.Array(value*))
    
    inline def iconVdomElement(value: VdomElement): this.type = set("icon", value.rawElement.asInstanceOf[js.Any])
  }
  
  def withProps(p: testIDstringiconReactNode): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
