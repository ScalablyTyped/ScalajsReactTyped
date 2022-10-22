package typingsJapgolly.reactstrap

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.reactstrap.typesLibUtilsMod.CSSModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibFormGroupMod {
  
  @JSImport("reactstrap/types/lib/FormGroup", JSImport.Default)
  @js.native
  open class default ()
    extends Component[FormGroupProps, js.Object, Any]
  
  type FormGroup = japgolly.scalajs.react.facade.React.Component[FormGroupProps & js.Object, js.Object]
  
  trait FormGroupProps
    extends StObject
       with HTMLAttributes[HTMLDivElement]
       with /* key */ StringDictionary[Any] {
    
    var check: js.UndefOr[Boolean] = js.undefined
    
    var cssModule: js.UndefOr[CSSModule] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var floating: js.UndefOr[Boolean] = js.undefined
    
    var `inline`: js.UndefOr[Boolean] = js.undefined
    
    var row: js.UndefOr[Boolean] = js.undefined
    
    var switch: js.UndefOr[Boolean] = js.undefined
    
    var tag: js.UndefOr[ElementType] = js.undefined
  }
  object FormGroupProps {
    
    inline def apply(): FormGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormGroupProps]
    }
    
    extension [Self <: FormGroupProps](x: Self) {
      
      inline def setCheck(value: Boolean): Self = StObject.set(x, "check", value.asInstanceOf[js.Any])
      
      inline def setCheckUndefined: Self = StObject.set(x, "check", js.undefined)
      
      inline def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      inline def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFloating(value: Boolean): Self = StObject.set(x, "floating", value.asInstanceOf[js.Any])
      
      inline def setFloatingUndefined: Self = StObject.set(x, "floating", js.undefined)
      
      inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      inline def setRow(value: Boolean): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
      
      inline def setSwitch(value: Boolean): Self = StObject.set(x, "switch", value.asInstanceOf[js.Any])
      
      inline def setSwitchUndefined: Self = StObject.set(x, "switch", js.undefined)
      
      inline def setTag(value: ElementType): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
}
