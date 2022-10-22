package typingsJapgolly.wordpressEditor

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.HTMLProps
import typingsJapgolly.wordpressEditor.componentsPostPublishPanelMod.PostPublishPanel.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsPostPublishPanelMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/editor/components/post-publish-panel", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object PostPublishPanel {
    
    trait Props
      extends StObject
         with HTMLProps[HTMLDivElement] {
      
      var PostPublishExtension: js.UndefOr[ComponentType[js.Object]] = js.undefined
      
      var PrePublishExtension: js.UndefOr[ComponentType[js.Object]] = js.undefined
      
      @JSName("children")
      var children_Props: js.UndefOr[scala.Nothing] = js.undefined
      
      var forceIsDirty: js.UndefOr[Boolean] = js.undefined
      
      var forceIsSaving: js.UndefOr[Boolean] = js.undefined
      
      def onClose(): Unit
    }
    object Props {
      
      inline def apply(onClose: Callback): Props = {
        val __obj = js.Dynamic.literal(onClose = onClose.toJsFn)
        __obj.asInstanceOf[Props]
      }
      
      extension [Self <: Props](x: Self) {
        
        inline def setForceIsDirty(value: Boolean): Self = StObject.set(x, "forceIsDirty", value.asInstanceOf[js.Any])
        
        inline def setForceIsDirtyUndefined: Self = StObject.set(x, "forceIsDirty", js.undefined)
        
        inline def setForceIsSaving(value: Boolean): Self = StObject.set(x, "forceIsSaving", value.asInstanceOf[js.Any])
        
        inline def setForceIsSavingUndefined: Self = StObject.set(x, "forceIsSaving", js.undefined)
        
        inline def setOnClose(value: Callback): Self = StObject.set(x, "onClose", value.toJsFn)
        
        inline def setPostPublishExtension(value: ComponentType[js.Object]): Self = StObject.set(x, "PostPublishExtension", value.asInstanceOf[js.Any])
        
        inline def setPostPublishExtensionUndefined: Self = StObject.set(x, "PostPublishExtension", js.undefined)
        
        inline def setPrePublishExtension(value: ComponentType[js.Object]): Self = StObject.set(x, "PrePublishExtension", value.asInstanceOf[js.Any])
        
        inline def setPrePublishExtensionUndefined: Self = StObject.set(x, "PrePublishExtension", js.undefined)
      }
    }
  }
}
