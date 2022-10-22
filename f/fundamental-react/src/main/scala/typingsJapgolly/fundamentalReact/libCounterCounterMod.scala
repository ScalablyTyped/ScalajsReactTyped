package typingsJapgolly.fundamentalReact

import japgolly.scalajs.react.facade.React.Element
import org.scalajs.dom.HTMLSpanElement
import typingsJapgolly.fundamentalReact.anon.CounterLabel
import typingsJapgolly.fundamentalReact.anon.PartialCounterProps
import typingsJapgolly.fundamentalReact.anon.WeakValidationMapCounterP
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.Counter
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCounterCounterMod {
  
  /* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Counter/Counter.CounterProps> & {  displayName :'Counter'} */
  object default {
    
    inline def apply(props: CounterProps): Element | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
    inline def apply(props: CounterProps, context: Any): Element | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
    
    @JSImport("fundamental-react/lib/Counter/Counter", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("fundamental-react/lib/Counter/Counter", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Counter/Counter", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialCounterProps] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialCounterProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Counter/Counter", "default.displayName")
    @js.native
    def displayName: js.UndefOr[Counter | String] = js.native
    inline def displayName_=(x: js.UndefOr[Counter | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/Counter/Counter", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapCounterP] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapCounterP]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  trait CounterProps
    extends StObject
       with HTMLAttributes[HTMLSpanElement] {
    
    var disableStyles: js.UndefOr[Boolean] = js.undefined
    
    var localizedText: js.UndefOr[CounterLabel] = js.undefined
    
    var notification: js.UndefOr[Boolean] = js.undefined
  }
  object CounterProps {
    
    inline def apply(): CounterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CounterProps]
    }
    
    extension [Self <: CounterProps](x: Self) {
      
      inline def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
      
      inline def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
      
      inline def setLocalizedText(value: CounterLabel): Self = StObject.set(x, "localizedText", value.asInstanceOf[js.Any])
      
      inline def setLocalizedTextUndefined: Self = StObject.set(x, "localizedText", js.undefined)
      
      inline def setNotification(value: Boolean): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
      
      inline def setNotificationUndefined: Self = StObject.set(x, "notification", js.undefined)
    }
  }
}
