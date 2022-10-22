package typingsJapgolly.reactWidgets

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.Element
import typingsJapgolly.react.mod.Dispatch
import typingsJapgolly.react.mod.FocusEventHandler
import typingsJapgolly.react.mod.SetStateAction
import typingsJapgolly.reactWidgets.reactWidgetsStrings.isDisabled
import typingsJapgolly.reactWidgets.reactWidgetsStrings.onChange
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmUseFocusManagerMod {
  
  @JSImport("react-widgets/esm/useFocusManager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(ref: RefHandle[Element]): js.Tuple3[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_useFocusManager.FocusController */ Any, 
    Boolean, 
    Dispatch[SetStateAction[Boolean]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(ref.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_useFocusManager.FocusController */ Any, 
    Boolean, 
    Dispatch[SetStateAction[Boolean]]
  ]]
  inline def default(
    ref: RefHandle[Element],
    props: Unit,
    opts: Omit[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FocusManagerOptions */ Any, 
      onChange | isDisabled
    ]
  ): js.Tuple3[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_useFocusManager.FocusController */ Any, 
    Boolean, 
    Dispatch[SetStateAction[Boolean]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ref.asInstanceOf[js.Any], props.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_useFocusManager.FocusController */ Any, 
    Boolean, 
    Dispatch[SetStateAction[Boolean]]
  ]]
  inline def default(ref: RefHandle[Element], props: Props): js.Tuple3[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_useFocusManager.FocusController */ Any, 
    Boolean, 
    Dispatch[SetStateAction[Boolean]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ref.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_useFocusManager.FocusController */ Any, 
    Boolean, 
    Dispatch[SetStateAction[Boolean]]
  ]]
  inline def default(
    ref: RefHandle[Element],
    props: Props,
    opts: Omit[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FocusManagerOptions */ Any, 
      onChange | isDisabled
    ]
  ): js.Tuple3[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_useFocusManager.FocusController */ Any, 
    Boolean, 
    Dispatch[SetStateAction[Boolean]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ref.asInstanceOf[js.Any], props.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_useFocusManager.FocusController */ Any, 
    Boolean, 
    Dispatch[SetStateAction[Boolean]]
  ]]
  
  trait Props extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var onBlur: js.UndefOr[FocusEventHandler[Element]] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[Element]] = js.undefined
  }
  object Props {
    
    inline def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setOnBlur(value: ReactFocusEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[Element & Element]) => value(t0).runNow()))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnFocus(value: ReactFocusEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[Element & Element]) => value(t0).runNow()))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    }
  }
}
