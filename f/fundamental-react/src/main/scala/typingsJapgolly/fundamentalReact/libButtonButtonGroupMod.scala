package typingsJapgolly.fundamentalReact

import japgolly.scalajs.react.facade.React.Element
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.fundamentalReact.anon.PartialButtonGroupProps
import typingsJapgolly.fundamentalReact.anon.WeakValidationMapButtonGr
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.ButtonGroup
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libButtonButtonGroupMod {
  
  /* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Button/ButtonGroup.ButtonGroupProps> & {  displayName :'ButtonGroup'} */
  object default {
    
    inline def apply(props: ButtonGroupProps): Element | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
    inline def apply(props: ButtonGroupProps, context: Any): Element | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
    
    @JSImport("fundamental-react/lib/Button/ButtonGroup", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("fundamental-react/lib/Button/ButtonGroup", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Button/ButtonGroup", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialButtonGroupProps] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialButtonGroupProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Button/ButtonGroup", "default.displayName")
    @js.native
    def displayName: js.UndefOr[ButtonGroup | String] = js.native
    inline def displayName_=(x: js.UndefOr[ButtonGroup | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Button/ButtonGroup", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapButtonGr] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapButtonGr]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  trait ButtonGroupProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    var disableStyles: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
  }
  object ButtonGroupProps {
    
    inline def apply(): ButtonGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonGroupProps]
    }
    
    extension [Self <: ButtonGroupProps](x: Self) {
      
      inline def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
      
      inline def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    }
  }
}
