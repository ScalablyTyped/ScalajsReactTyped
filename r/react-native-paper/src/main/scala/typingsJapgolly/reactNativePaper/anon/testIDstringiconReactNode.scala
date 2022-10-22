package typingsJapgolly.reactNativePaper.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.left
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  testID :string,   icon :react.react.ReactNode,   topPosition :number,   side :'left' | 'right'} & std.Omit<react-native-paper.react-native-paper/lib/typescript/components/TextInput/Adornment/TextInputIcon.StyleContextType, 'style'> */
trait testIDstringiconReactNode extends StObject {
  
  var forceFocus: js.Function0[Unit]
  
  var icon: Node
  
  var isTextInputFocused: Boolean
  
  var side: left | right
  
  var testID: String
  
  var topPosition: Double
}
object testIDstringiconReactNode {
  
  inline def apply(
    forceFocus: Callback,
    isTextInputFocused: Boolean,
    side: left | right,
    testID: String,
    topPosition: Double
  ): testIDstringiconReactNode = {
    val __obj = js.Dynamic.literal(forceFocus = forceFocus.toJsFn, isTextInputFocused = isTextInputFocused.asInstanceOf[js.Any], side = side.asInstanceOf[js.Any], testID = testID.asInstanceOf[js.Any], topPosition = topPosition.asInstanceOf[js.Any], icon = null)
    __obj.asInstanceOf[testIDstringiconReactNode]
  }
  
  extension [Self <: testIDstringiconReactNode](x: Self) {
    
    inline def setForceFocus(value: Callback): Self = StObject.set(x, "forceFocus", value.toJsFn)
    
    inline def setIcon(value: VdomNode): Self = StObject.set(x, "icon", value.rawNode.asInstanceOf[js.Any])
    
    inline def setIconNull: Self = StObject.set(x, "icon", null)
    
    inline def setIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "icon", js.Array(value*))
    
    inline def setIconVdomElement(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
    
    inline def setIsTextInputFocused(value: Boolean): Self = StObject.set(x, "isTextInputFocused", value.asInstanceOf[js.Any])
    
    inline def setSide(value: left | right): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
    
    inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
    
    inline def setTopPosition(value: Double): Self = StObject.set(x, "topPosition", value.asInstanceOf[js.Any])
  }
}
