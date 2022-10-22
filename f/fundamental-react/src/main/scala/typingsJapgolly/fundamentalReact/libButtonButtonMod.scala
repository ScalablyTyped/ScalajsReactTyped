package typingsJapgolly.fundamentalReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.fundamentalReact.anon.PartialButtonProps
import typingsJapgolly.fundamentalReact.anon.WeakValidationMapButtonPr
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.Button
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.button_
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.reset
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.submit
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libButtonButtonMod {
  
  /* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Button/Button.ButtonProps> & {  displayName :'Button'} */
  object default {
    
    inline def apply(props: ButtonProps): Element | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
    inline def apply(props: ButtonProps, context: Any): Element | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
    
    @JSImport("fundamental-react/lib/Button/Button", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("fundamental-react/lib/Button/Button", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Button/Button", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialButtonProps] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialButtonProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Button/Button", "default.displayName")
    @js.native
    def displayName: js.UndefOr[Button | String] = js.native
    inline def displayName_=(x: js.UndefOr[Button | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Button/Button", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapButtonPr] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapButtonPr]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.fundamentalReact.fundamentalReactStrings.emphasized
    - typingsJapgolly.fundamentalReact.fundamentalReactStrings.transparent
  */
  trait ButtonOptions extends StObject
  object ButtonOptions {
    
    inline def emphasized: typingsJapgolly.fundamentalReact.fundamentalReactStrings.emphasized = "emphasized".asInstanceOf[typingsJapgolly.fundamentalReact.fundamentalReactStrings.emphasized]
    
    inline def transparent: typingsJapgolly.fundamentalReact.fundamentalReactStrings.transparent = "transparent".asInstanceOf[typingsJapgolly.fundamentalReact.fundamentalReactStrings.transparent]
  }
  
  trait ButtonProps
    extends StObject
       with HTMLAttributes[HTMLButtonElement] {
    
    var compact: js.UndefOr[Boolean] = js.undefined
    
    var disableStyles: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var glyph: js.UndefOr[String] = js.undefined
    
    @JSName("onClick")
    var onClick_ButtonProps: js.UndefOr[js.Function1[/* event */ ReactMouseEventFrom[HTMLButtonElement], Unit]] = js.undefined
    
    var option: js.UndefOr[ButtonOptions] = js.undefined
    
    var ref: js.UndefOr[RefHandle[HTMLButtonElement]] = js.undefined
    
    var selected: js.UndefOr[Boolean] = js.undefined
    
    var `type`: js.UndefOr[ButtonTypes] = js.undefined
    
    var typeAttr: js.UndefOr[submit | reset | button_] = js.undefined
  }
  object ButtonProps {
    
    inline def apply(): ButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonProps]
    }
    
    extension [Self <: ButtonProps](x: Self) {
      
      inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      inline def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
      
      inline def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setGlyph(value: String): Self = StObject.set(x, "glyph", value.asInstanceOf[js.Any])
      
      inline def setGlyphUndefined: Self = StObject.set(x, "glyph", js.undefined)
      
      inline def setOnClick(value: /* event */ ReactMouseEventFrom[HTMLButtonElement] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: /* event */ ReactMouseEventFrom[HTMLButtonElement]) => value(t0).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOption(value: ButtonOptions): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
      
      inline def setOptionUndefined: Self = StObject.set(x, "option", js.undefined)
      
      inline def setRef(value: RefHandle[HTMLButtonElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setType(value: ButtonTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeAttr(value: submit | reset | button_): Self = StObject.set(x, "typeAttr", value.asInstanceOf[js.Any])
      
      inline def setTypeAttrUndefined: Self = StObject.set(x, "typeAttr", js.undefined)
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.fundamentalReact.fundamentalReactStrings.standard
    - typingsJapgolly.fundamentalReact.fundamentalReactStrings.positive
    - typingsJapgolly.fundamentalReact.fundamentalReactStrings.negative
    - typingsJapgolly.fundamentalReact.fundamentalReactStrings.medium
    - typingsJapgolly.fundamentalReact.fundamentalReactStrings.ghost
    - typingsJapgolly.fundamentalReact.fundamentalReactStrings.attention
  */
  trait ButtonTypes extends StObject
  object ButtonTypes {
    
    inline def attention: typingsJapgolly.fundamentalReact.fundamentalReactStrings.attention = "attention".asInstanceOf[typingsJapgolly.fundamentalReact.fundamentalReactStrings.attention]
    
    inline def ghost: typingsJapgolly.fundamentalReact.fundamentalReactStrings.ghost = "ghost".asInstanceOf[typingsJapgolly.fundamentalReact.fundamentalReactStrings.ghost]
    
    inline def medium: typingsJapgolly.fundamentalReact.fundamentalReactStrings.medium = "medium".asInstanceOf[typingsJapgolly.fundamentalReact.fundamentalReactStrings.medium]
    
    inline def negative: typingsJapgolly.fundamentalReact.fundamentalReactStrings.negative = "negative".asInstanceOf[typingsJapgolly.fundamentalReact.fundamentalReactStrings.negative]
    
    inline def positive: typingsJapgolly.fundamentalReact.fundamentalReactStrings.positive = "positive".asInstanceOf[typingsJapgolly.fundamentalReact.fundamentalReactStrings.positive]
    
    inline def standard: typingsJapgolly.fundamentalReact.fundamentalReactStrings.standard = "standard".asInstanceOf[typingsJapgolly.fundamentalReact.fundamentalReactStrings.standard]
  }
}
