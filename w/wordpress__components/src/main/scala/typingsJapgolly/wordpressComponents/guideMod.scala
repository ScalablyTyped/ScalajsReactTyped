package typingsJapgolly.wordpressComponents

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object guideMod extends Shortcut {
  
  @JSImport("@wordpress/components/guide", JSImport.Default)
  @js.native
  val default: ComponentType[GuideProps] = js.native
  
  trait GuidePage extends StObject {
    
    var content: Node
    
    var image: js.UndefOr[Node] = js.undefined
  }
  object GuidePage {
    
    inline def apply(): GuidePage = {
      val __obj = js.Dynamic.literal(content = null)
      __obj.asInstanceOf[GuidePage]
    }
    
    extension [Self <: GuidePage](x: Self) {
      
      inline def setContent(value: VdomNode): Self = StObject.set(x, "content", value.rawNode.asInstanceOf[js.Any])
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
      
      inline def setContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setContentVdomElement(value: VdomElement): Self = StObject.set(x, "content", value.rawElement.asInstanceOf[js.Any])
      
      inline def setImage(value: VdomNode): Self = StObject.set(x, "image", value.rawNode.asInstanceOf[js.Any])
      
      inline def setImageNull: Self = StObject.set(x, "image", null)
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setImageVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "image", js.Array(value*))
      
      inline def setImageVdomElement(value: VdomElement): Self = StObject.set(x, "image", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  trait GuideProps extends StObject {
    
    /**
      * @deprecated use the `pages` prop instead
      * @since 5.5
      */
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var contentLabel: js.UndefOr[String] = js.undefined
    
    var finishButtonText: js.UndefOr[Node] = js.undefined
    
    var onFinish: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var pages: js.UndefOr[js.Array[GuidePage]] = js.undefined
  }
  object GuideProps {
    
    inline def apply(): GuideProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GuideProps]
    }
    
    extension [Self <: GuideProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContentLabel(value: String): Self = StObject.set(x, "contentLabel", value.asInstanceOf[js.Any])
      
      inline def setContentLabelUndefined: Self = StObject.set(x, "contentLabel", js.undefined)
      
      inline def setFinishButtonText(value: VdomNode): Self = StObject.set(x, "finishButtonText", value.rawNode.asInstanceOf[js.Any])
      
      inline def setFinishButtonTextNull: Self = StObject.set(x, "finishButtonText", null)
      
      inline def setFinishButtonTextUndefined: Self = StObject.set(x, "finishButtonText", js.undefined)
      
      inline def setFinishButtonTextVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "finishButtonText", js.Array(value*))
      
      inline def setFinishButtonTextVdomElement(value: VdomElement): Self = StObject.set(x, "finishButtonText", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnFinish(value: Callback): Self = StObject.set(x, "onFinish", value.toJsFn)
      
      inline def setOnFinishUndefined: Self = StObject.set(x, "onFinish", js.undefined)
      
      inline def setPages(value: js.Array[GuidePage]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
      
      inline def setPagesUndefined: Self = StObject.set(x, "pages", js.undefined)
      
      inline def setPagesVarargs(value: GuidePage*): Self = StObject.set(x, "pages", js.Array(value*))
    }
  }
  
  type _To = ComponentType[GuideProps]
  
  /* This means you don't have to write `default`, but can instead just say `guideMod.foo` */
  override def _to: ComponentType[GuideProps] = default
}
