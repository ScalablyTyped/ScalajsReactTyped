package typingsJapgolly.reactstrap

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.reactstrap.typesLibUtilsMod.CSSModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibOffcanvasHeaderMod {
  
  @JSImport("reactstrap/types/lib/OffcanvasHeader", JSImport.Default)
  @js.native
  open class default ()
    extends Component[OffcanvasHeaderProps, js.Object, Any]
  
  type OffcanvasHeader = japgolly.scalajs.react.facade.React.Component[OffcanvasHeaderProps & js.Object, js.Object]
  
  trait OffcanvasHeaderProps
    extends StObject
       with HTMLAttributes[HTMLElement]
       with /* key */ StringDictionary[Any] {
    
    var cssModule: js.UndefOr[CSSModule] = js.undefined
    
    var tag: js.UndefOr[ElementType] = js.undefined
    
    var toggle: js.UndefOr[MouseEventHandler[Any]] = js.undefined
    
    var wrapTag: js.UndefOr[ElementType] = js.undefined
  }
  object OffcanvasHeaderProps {
    
    inline def apply(): OffcanvasHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OffcanvasHeaderProps]
    }
    
    extension [Self <: OffcanvasHeaderProps](x: Self) {
      
      inline def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      inline def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      inline def setTag(value: ElementType): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      inline def setToggle(value: ReactMouseEventFrom[Any & Element] => Callback): Self = StObject.set(x, "toggle", js.Any.fromFunction1((t0: ReactMouseEventFrom[Any & Element]) => value(t0).runNow()))
      
      inline def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
      
      inline def setWrapTag(value: ElementType): Self = StObject.set(x, "wrapTag", value.asInstanceOf[js.Any])
      
      inline def setWrapTagUndefined: Self = StObject.set(x, "wrapTag", js.undefined)
    }
  }
}
