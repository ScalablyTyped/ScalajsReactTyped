package typingsJapgolly.reactstrap

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.reactstrap.typesLibUtilsMod.CSSModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibMediaMod {
  
  @JSImport("reactstrap/types/lib/Media", JSImport.Default)
  @js.native
  open class default ()
    extends Component[MediaProps, js.Object, Any]
  
  type Media = japgolly.scalajs.react.facade.React.Component[MediaProps & js.Object, js.Object]
  
  trait MediaProps
    extends StObject
       with HTMLAttributes[HTMLElement]
       with /* key */ StringDictionary[Any] {
    
    var alt: js.UndefOr[String] = js.undefined
    
    var body: js.UndefOr[Boolean] = js.undefined
    
    var bottom: js.UndefOr[Boolean] = js.undefined
    
    var cssModule: js.UndefOr[CSSModule] = js.undefined
    
    var heading: js.UndefOr[Boolean] = js.undefined
    
    var href: js.UndefOr[String] = js.undefined
    
    var left: js.UndefOr[Boolean] = js.undefined
    
    var list: js.UndefOr[Boolean] = js.undefined
    
    var middle: js.UndefOr[Boolean] = js.undefined
    
    var `object`: js.UndefOr[Boolean] = js.undefined
    
    var right: js.UndefOr[Boolean] = js.undefined
    
    var src: js.UndefOr[String] = js.undefined
    
    var tag: js.UndefOr[ElementType] = js.undefined
    
    var top: js.UndefOr[Boolean] = js.undefined
  }
  object MediaProps {
    
    inline def apply(): MediaProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MediaProps]
    }
    
    extension [Self <: MediaProps](x: Self) {
      
      inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      inline def setBody(value: Boolean): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setBottom(value: Boolean): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      inline def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      inline def setHeading(value: Boolean): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
      
      inline def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      inline def setLeft(value: Boolean): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setList(value: Boolean): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
      
      inline def setMiddle(value: Boolean): Self = StObject.set(x, "middle", value.asInstanceOf[js.Any])
      
      inline def setMiddleUndefined: Self = StObject.set(x, "middle", js.undefined)
      
      inline def setObject(value: Boolean): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
      
      inline def setRight(value: Boolean): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      inline def setTag(value: ElementType): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      inline def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
}
