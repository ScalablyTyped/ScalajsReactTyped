package typingsJapgolly.fundamentalReact

import japgolly.scalajs.react.facade.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.fundamentalReact.anon.PartialInputGroupAddonPro
import typingsJapgolly.fundamentalReact.anon.State
import typingsJapgolly.fundamentalReact.anon.WeakValidationMapInputGro
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.InputGroupDotAddon
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInputGroupInputGroupMod {
  
  @JSImport("fundamental-react/lib/InputGroup/InputGroup", JSImport.Default)
  @js.native
  open class default ()
    extends Component[InputGroupProps, js.Object, Any]
  object default {
    
    @JSImport("fundamental-react/lib/InputGroup/InputGroup", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    /* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/InputGroup/InputGroup.InputGroupAddonProps> & {  displayName :'InputGroup.Addon'} */
    object Addon {
      
      inline def apply(props: InputGroupAddonProps): Element | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
      inline def apply(props: InputGroupAddonProps, context: Any): Element | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
      
      @JSImport("fundamental-react/lib/InputGroup/InputGroup", "default.Addon")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("fundamental-react/lib/InputGroup/InputGroup", "default.Addon.contextTypes")
      @js.native
      def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
      inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/InputGroup/InputGroup", "default.Addon.defaultProps")
      @js.native
      def defaultProps: js.UndefOr[PartialInputGroupAddonPro] = js.native
      inline def defaultProps_=(x: js.UndefOr[PartialInputGroupAddonPro]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/InputGroup/InputGroup", "default.Addon.displayName")
      @js.native
      def displayName: js.UndefOr[InputGroupDotAddon | String] = js.native
      inline def displayName_=(x: js.UndefOr[InputGroupDotAddon | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
      
      @JSImport("fundamental-react/lib/InputGroup/InputGroup", "default.Addon.propTypes")
      @js.native
      def propTypes: js.UndefOr[WeakValidationMapInputGro] = js.native
      inline def propTypes_=(x: js.UndefOr[WeakValidationMapInputGro]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("fundamental-react/lib/InputGroup/InputGroup", "default.displayName")
    @js.native
    def displayName: typingsJapgolly.fundamentalReact.fundamentalReactStrings.InputGroup = js.native
    inline def displayName_=(x: typingsJapgolly.fundamentalReact.fundamentalReactStrings.InputGroup): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  type InputGroup = japgolly.scalajs.react.facade.React.Component[InputGroupProps & js.Object, js.Object]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.fundamentalReact.fundamentalReactStrings.before
    - typingsJapgolly.fundamentalReact.fundamentalReactStrings.after
  */
  trait InputGroupAddonPosition extends StObject
  object InputGroupAddonPosition {
    
    inline def after: typingsJapgolly.fundamentalReact.fundamentalReactStrings.after = "after".asInstanceOf[typingsJapgolly.fundamentalReact.fundamentalReactStrings.after]
    
    inline def before: typingsJapgolly.fundamentalReact.fundamentalReactStrings.before = "before".asInstanceOf[typingsJapgolly.fundamentalReact.fundamentalReactStrings.before]
  }
  
  trait InputGroupAddonProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var compact: js.UndefOr[Boolean] = js.undefined
    
    var isButton: js.UndefOr[Boolean] = js.undefined
  }
  object InputGroupAddonProps {
    
    inline def apply(): InputGroupAddonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputGroupAddonProps]
    }
    
    extension [Self <: InputGroupAddonProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      inline def setIsButton(value: Boolean): Self = StObject.set(x, "isButton", value.asInstanceOf[js.Any])
      
      inline def setIsButtonUndefined: Self = StObject.set(x, "isButton", js.undefined)
    }
  }
  
  trait InputGroupProps
    extends StObject
       with /* x */ StringDictionary[Any] {
    
    var className: js.UndefOr[String] = js.undefined
    
    var compact: js.UndefOr[Boolean] = js.undefined
    
    var disableStyles: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var props: js.UndefOr[Any] = js.undefined
    
    var validationState: js.UndefOr[State] = js.undefined
  }
  object InputGroupProps {
    
    inline def apply(): InputGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputGroupProps]
    }
    
    extension [Self <: InputGroupProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      inline def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
      
      inline def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setProps(value: Any): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      inline def setValidationState(value: State): Self = StObject.set(x, "validationState", value.asInstanceOf[js.Any])
      
      inline def setValidationStateUndefined: Self = StObject.set(x, "validationState", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.fundamentalReact.fundamentalReactStrings.text
    - typingsJapgolly.fundamentalReact.fundamentalReactStrings.number
    - typingsJapgolly.fundamentalReact.fundamentalReactStrings.search
  */
  trait InputGroupTypes extends StObject
  object InputGroupTypes {
    
    inline def number: typingsJapgolly.fundamentalReact.fundamentalReactStrings.number = "number".asInstanceOf[typingsJapgolly.fundamentalReact.fundamentalReactStrings.number]
    
    inline def search: typingsJapgolly.fundamentalReact.fundamentalReactStrings.search = "search".asInstanceOf[typingsJapgolly.fundamentalReact.fundamentalReactStrings.search]
    
    inline def text: typingsJapgolly.fundamentalReact.fundamentalReactStrings.text = "text".asInstanceOf[typingsJapgolly.fundamentalReact.fundamentalReactStrings.text]
  }
}
