package typingsJapgolly.reactNativeZssRichTextEditor.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNativeZssRichTextEditor.anon.PartialRichTextToolbarPro
import typingsJapgolly.reactNativeZssRichTextEditor.mod.ACTIONS
import typingsJapgolly.reactNativeZssRichTextEditor.mod.ElementStyles
import typingsJapgolly.reactNativeZssRichTextEditor.mod.IconsMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RichTextToolbar {
  
  @JSImport("react-native-zss-rich-text-editor", "RichTextToolbar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactNativeZssRichTextEditor.mod.RichTextToolbar] {
    
    inline def actions(value: js.Array[ACTIONS]): this.type = set("actions", value.asInstanceOf[js.Any])
    
    inline def actionsVarargs(value: ACTIONS*): this.type = set("actions", js.Array(value*))
    
    inline def getEditor(value: CallbackTo[typingsJapgolly.reactNativeZssRichTextEditor.mod.RichTextEditor]): this.type = set("getEditor", value.toJsFn)
    
    inline def iconMap(value: IconsMap): this.type = set("iconMap", value.asInstanceOf[js.Any])
    
    inline def iconTint(value: String): this.type = set("iconTint", value.asInstanceOf[js.Any])
    
    inline def onPressAddImage(value: Callback): this.type = set("onPressAddImage", value.toJsFn)
    
    inline def onPressAddLink(value: Callback): this.type = set("onPressAddLink", value.toJsFn)
    
    inline def renderAction(value: CallbackTo[Node]): this.type = set("renderAction", value.toJsFn)
    
    inline def selectedButtonStyle(value: ElementStyles): this.type = set("selectedButtonStyle", value.asInstanceOf[js.Any])
    
    inline def selectedButtonStyleNull: this.type = set("selectedButtonStyle", null)
    
    inline def selectedIconTint(value: String): this.type = set("selectedIconTint", value.asInstanceOf[js.Any])
    
    inline def unselectedButtonStyle(value: ElementStyles): this.type = set("unselectedButtonStyle", value.asInstanceOf[js.Any])
    
    inline def unselectedButtonStyleNull: this.type = set("unselectedButtonStyle", null)
  }
  
  implicit def make(companion: RichTextToolbar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PartialRichTextToolbarPro): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
