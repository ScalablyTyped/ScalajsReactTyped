package typingsJapgolly.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcGeneralDistComponentsSentenceCaseSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/es/src/general/dist/components/SentenceCaseSmall", JSImport.Default)
  @js.native
  val default: FC[SentenceCaseSmallProps] = js.native
  
  trait SentenceCaseSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SentenceCaseSmallProps {
    
    inline def apply(): SentenceCaseSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SentenceCaseSmallProps]
    }
    
    extension [Self <: SentenceCaseSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SentenceCaseSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distEsSrcGeneralDistComponentsSentenceCaseSmallMod.foo` */
  override def _to: FC[SentenceCaseSmallProps] = default
}
