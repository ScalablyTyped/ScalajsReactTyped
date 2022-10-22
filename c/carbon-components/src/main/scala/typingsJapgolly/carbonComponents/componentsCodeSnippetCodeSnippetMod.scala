package typingsJapgolly.carbonComponents

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.carbonComponents.anon.PartialCodeSnippetOptions
import typingsJapgolly.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsCodeSnippetCodeSnippetMod {
  
  @JSImport("carbon-components/components/code-snippet/code-snippet", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with CodeSnippet {
    def this(element: HTMLElement) = this()
    def this(element: HTMLElement, options: PartialCodeSnippetOptions) = this()
    
    /* CompleteClass */
    override def _handleClick(): Unit = js.native
    
    /* CompleteClass */
    override def _initCodeSnippet(): Unit = js.native
  }
  object default {
    
    @JSImport("carbon-components/components/code-snippet/code-snippet", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("carbon-components/components/code-snippet/code-snippet", "default.components")
    @js.native
    def components: WeakMap[js.Object, Any] = js.native
    inline def components_=(x: WeakMap[js.Object, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ trait CodeSnippet extends StObject {
    
    def _handleClick(): Unit
    
    def _initCodeSnippet(): Unit
  }
  object CodeSnippet {
    
    inline def apply(_handleClick: Callback, _initCodeSnippet: Callback): CodeSnippet = {
      val __obj = js.Dynamic.literal(_handleClick = _handleClick.toJsFn, _initCodeSnippet = _initCodeSnippet.toJsFn)
      __obj.asInstanceOf[CodeSnippet]
    }
    
    extension [Self <: CodeSnippet](x: Self) {
      
      inline def set_handleClick(value: Callback): Self = StObject.set(x, "_handleClick", value.toJsFn)
      
      inline def set_initCodeSnippet(value: Callback): Self = StObject.set(x, "_initCodeSnippet", value.toJsFn)
    }
  }
  
  trait CodeSnippetOptions extends StObject {
    
    var attribShowLessText: String
    
    var attribShowMoreText: String
    
    var classExpandBtn: String
    
    var classExpandText: String
    
    var classExpanded: String
    
    var classHideExpand: String
    
    var minHeight: Double
    
    var selectorInit: String
  }
  object CodeSnippetOptions {
    
    inline def apply(
      attribShowLessText: String,
      attribShowMoreText: String,
      classExpandBtn: String,
      classExpandText: String,
      classExpanded: String,
      classHideExpand: String,
      minHeight: Double,
      selectorInit: String
    ): CodeSnippetOptions = {
      val __obj = js.Dynamic.literal(attribShowLessText = attribShowLessText.asInstanceOf[js.Any], attribShowMoreText = attribShowMoreText.asInstanceOf[js.Any], classExpandBtn = classExpandBtn.asInstanceOf[js.Any], classExpandText = classExpandText.asInstanceOf[js.Any], classExpanded = classExpanded.asInstanceOf[js.Any], classHideExpand = classHideExpand.asInstanceOf[js.Any], minHeight = minHeight.asInstanceOf[js.Any], selectorInit = selectorInit.asInstanceOf[js.Any])
      __obj.asInstanceOf[CodeSnippetOptions]
    }
    
    extension [Self <: CodeSnippetOptions](x: Self) {
      
      inline def setAttribShowLessText(value: String): Self = StObject.set(x, "attribShowLessText", value.asInstanceOf[js.Any])
      
      inline def setAttribShowMoreText(value: String): Self = StObject.set(x, "attribShowMoreText", value.asInstanceOf[js.Any])
      
      inline def setClassExpandBtn(value: String): Self = StObject.set(x, "classExpandBtn", value.asInstanceOf[js.Any])
      
      inline def setClassExpandText(value: String): Self = StObject.set(x, "classExpandText", value.asInstanceOf[js.Any])
      
      inline def setClassExpanded(value: String): Self = StObject.set(x, "classExpanded", value.asInstanceOf[js.Any])
      
      inline def setClassHideExpand(value: String): Self = StObject.set(x, "classHideExpand", value.asInstanceOf[js.Any])
      
      inline def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      inline def setSelectorInit(value: String): Self = StObject.set(x, "selectorInit", value.asInstanceOf[js.Any])
    }
  }
}
