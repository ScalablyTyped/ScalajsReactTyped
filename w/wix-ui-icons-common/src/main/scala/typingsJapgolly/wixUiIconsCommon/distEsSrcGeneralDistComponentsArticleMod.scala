package typingsJapgolly.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcGeneralDistComponentsArticleMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/es/src/general/dist/components/Article", JSImport.Default)
  @js.native
  val default: FC[ArticleProps] = js.native
  
  trait ArticleProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ArticleProps {
    
    inline def apply(): ArticleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArticleProps]
    }
    
    extension [Self <: ArticleProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ArticleProps]
  
  /* This means you don't have to write `default`, but can instead just say `distEsSrcGeneralDistComponentsArticleMod.foo` */
  override def _to: FC[ArticleProps] = default
}
