package typingsJapgolly.reactstrap

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLImageElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ImgHTMLAttributes
import typingsJapgolly.reactstrap.typesLibUtilsMod.CSSModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibCardImgMod {
  
  @JSImport("reactstrap/types/lib/CardImg", JSImport.Default)
  @js.native
  open class default ()
    extends Component[CardImgProps, js.Object, Any]
  
  type CardImg = japgolly.scalajs.react.facade.React.Component[CardImgProps & js.Object, js.Object]
  
  trait CardImgProps
    extends StObject
       with ImgHTMLAttributes[HTMLImageElement]
       with /* key */ StringDictionary[Any] {
    
    var bottom: js.UndefOr[Boolean] = js.undefined
    
    var cssModule: js.UndefOr[CSSModule] = js.undefined
    
    var tag: js.UndefOr[ElementType] = js.undefined
    
    var top: js.UndefOr[Boolean] = js.undefined
  }
  object CardImgProps {
    
    inline def apply(): CardImgProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardImgProps]
    }
    
    extension [Self <: CardImgProps](x: Self) {
      
      inline def setBottom(value: Boolean): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      inline def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      inline def setTag(value: ElementType): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      inline def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
}
