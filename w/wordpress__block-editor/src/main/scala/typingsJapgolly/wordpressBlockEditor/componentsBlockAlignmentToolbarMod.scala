package typingsJapgolly.wordpressBlockEditor

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.wordpressBlockEditor.componentsBlockAlignmentToolbarMod.BlockAlignmentToolbar.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsBlockAlignmentToolbarMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/block-editor/components/block-alignment-toolbar", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object BlockAlignmentToolbar {
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.center
      - typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.full
      - typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.left
      - typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.right
      - typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.wide
    */
    trait Control extends StObject
    object Control {
      
      inline def center: typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.center = "center".asInstanceOf[typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.center]
      
      inline def full: typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.full = "full".asInstanceOf[typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.full]
      
      inline def left: typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.left = "left".asInstanceOf[typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.left]
      
      inline def right: typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.right = "right".asInstanceOf[typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.right]
      
      inline def wide: typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.wide = "wide".asInstanceOf[typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.wide]
    }
    
    @js.native
    trait Props extends StObject {
      
      var children: js.UndefOr[scala.Nothing] = js.native
      
      var controls: js.UndefOr[js.Array[Control]] = js.native
      
      var isCollapsed: js.UndefOr[Boolean] = js.native
      
      def onChange(): Unit = js.native
      def onChange(newValue: Control): Unit = js.native
      
      var value: js.UndefOr[Control] = js.native
    }
  }
}
