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

object typesLibTabContentMod {
  
  @JSImport("reactstrap/types/lib/TabContent", JSImport.Default)
  @js.native
  open class default ()
    extends Component[TabContentProps, js.Object, Any]
  
  type TabContent = japgolly.scalajs.react.facade.React.Component[TabContentProps & js.Object, js.Object]
  
  trait TabContentProps
    extends StObject
       with HTMLAttributes[HTMLElement]
       with /* key */ StringDictionary[Any] {
    
    var activeTab: js.UndefOr[Double | String] = js.undefined
    
    var cssModule: js.UndefOr[CSSModule] = js.undefined
    
    var tag: js.UndefOr[ElementType] = js.undefined
  }
  object TabContentProps {
    
    inline def apply(): TabContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabContentProps]
    }
    
    extension [Self <: TabContentProps](x: Self) {
      
      inline def setActiveTab(value: Double | String): Self = StObject.set(x, "activeTab", value.asInstanceOf[js.Any])
      
      inline def setActiveTabUndefined: Self = StObject.set(x, "activeTab", js.undefined)
      
      inline def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      inline def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      inline def setTag(value: ElementType): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
}
