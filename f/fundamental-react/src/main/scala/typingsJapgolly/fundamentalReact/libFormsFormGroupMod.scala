package typingsJapgolly.fundamentalReact

import japgolly.scalajs.react.facade.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.fundamentalReact.anon.PartialFormGroupProps
import typingsJapgolly.fundamentalReact.anon.WeakValidationMapFormGrou
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.FormGroup
import typingsJapgolly.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormsFormGroupMod {
  
  /* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Forms/FormGroup.FormGroupProps> & {  displayName :'FormGroup'} */
  object default {
    
    inline def apply(props: FormGroupProps): Element | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
    inline def apply(props: FormGroupProps, context: Any): Element | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
    
    @JSImport("fundamental-react/lib/Forms/FormGroup", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("fundamental-react/lib/Forms/FormGroup", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Forms/FormGroup", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialFormGroupProps] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialFormGroupProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Forms/FormGroup", "default.displayName")
    @js.native
    def displayName: js.UndefOr[FormGroup | String] = js.native
    inline def displayName_=(x: js.UndefOr[FormGroup | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Forms/FormGroup", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapFormGrou] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapFormGrou]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  trait FormGroupProps
    extends StObject
       with /* x */ StringDictionary[Any] {
    
    var disableStyles: js.UndefOr[Boolean] = js.undefined
  }
  object FormGroupProps {
    
    inline def apply(): FormGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormGroupProps]
    }
    
    extension [Self <: FormGroupProps](x: Self) {
      
      inline def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
      
      inline def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
    }
  }
}
