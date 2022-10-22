package typingsJapgolly.wordpressBlockEditor.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.wordpressBlockEditor.anon.Children
import typingsJapgolly.wordpressBlockEditor.componentsInnerBlocksMod.InnerBlocks.Props
import typingsJapgolly.wordpressBlockEditor.mod.EditorTemplateLock
import typingsJapgolly.wordpressBlocks.apiTemplatesMod.TemplateArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InnerBlocks {
  
  object ButtonBlockAppender {
    
    @JSImport("@wordpress/block-editor", "InnerBlocks.ButtonBlockAppender")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: ButtonBlockAppender.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: Children): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Content {
    
    @JSImport("@wordpress/block-editor", "InnerBlocks.Content")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Content.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: Children): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object DefaultBlockAppender {
    
    @JSImport("@wordpress/block-editor", "InnerBlocks.DefaultBlockAppender")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: DefaultBlockAppender.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: Children): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("@wordpress/block-editor", "InnerBlocks")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def allowedBlocks(value: js.Array[String]): this.type = set("allowedBlocks", value.asInstanceOf[js.Any])
    
    inline def allowedBlocksVarargs(value: String*): this.type = set("allowedBlocks", js.Array(value*))
    
    inline def renderAppender(value: ComponentType[js.Object]): this.type = set("renderAppender", value.asInstanceOf[js.Any])
    
    inline def template(value: TemplateArray): this.type = set("template", value.asInstanceOf[js.Any])
    
    inline def templateInsertUpdatesSelection(value: Boolean): this.type = set("templateInsertUpdatesSelection", value.asInstanceOf[js.Any])
    
    inline def templateLock(value: EditorTemplateLock): this.type = set("templateLock", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: InnerBlocks.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
