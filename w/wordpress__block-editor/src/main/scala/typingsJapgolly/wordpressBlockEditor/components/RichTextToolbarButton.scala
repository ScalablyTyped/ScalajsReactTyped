package typingsJapgolly.wordpressBlockEditor.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.wordpressBlockEditor.componentsRichTextMod.RichTextToolbarButton.Props
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.access
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.alt
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.ctrl
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.ctrlShift
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.primary
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.primaryAlt
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.primaryShift
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.secondary
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.shift
import typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.shiftAlt
import typingsJapgolly.wordpressComponents.anon.PartialPropsAccept
import typingsJapgolly.wordpressComponents.dashiconMod.Dashicon.Icon
import typingsJapgolly.wordpressComponents.shortcutMod.Shortcut.ShortcutType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RichTextToolbarButton {
  
  inline def apply(icon: Icon | Element, title: String): Builder = {
    val __props = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("@wordpress/block-editor", "RichTextToolbarButton")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def containerClassName(value: String): this.type = set("containerClassName", value.asInstanceOf[js.Any])
    
    inline def extraProps(value: PartialPropsAccept): this.type = set("extraProps", value.asInstanceOf[js.Any])
    
    inline def isActive(value: Boolean): this.type = set("isActive", value.asInstanceOf[js.Any])
    
    inline def isDisabled(value: Boolean): this.type = set("isDisabled", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def onClick(value: Callback): this.type = set("onClick", value.toJsFn)
    
    inline def shortcut(value: ShortcutType): this.type = set("shortcut", value.asInstanceOf[js.Any])
    
    inline def shortcutCharacter(value: String): this.type = set("shortcutCharacter", value.asInstanceOf[js.Any])
    
    inline def shortcutType(
      value: primary | primaryShift | primaryAlt | secondary | access | ctrl | alt | ctrlShift | shift | shiftAlt
    ): this.type = set("shortcutType", value.asInstanceOf[js.Any])
    
    inline def subscript(value: String): this.type = set("subscript", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
