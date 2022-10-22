package typingsJapgolly.wordpressBlockEditor.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.wordpressBlockEditor.componentsRichTextMod.RichTextShortcut.Props
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RichTextShortcut {
  
  inline def apply(
    character: String,
    onUse: Callback,
    `type`: /* keyof @wordpress/block-editor.anon.TypeofrawShortcut */ primary | primaryShift | primaryAlt | secondary | access | ctrl | alt | ctrlShift | shift | shiftAlt
  ): Default[js.Object] = {
    val __props = js.Dynamic.literal(character = character.asInstanceOf[js.Any], onUse = onUse.toJsFn)
    __props.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("@wordpress/block-editor", "RichTextShortcut")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
