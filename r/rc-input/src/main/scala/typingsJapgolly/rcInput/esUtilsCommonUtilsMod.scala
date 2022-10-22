package typingsJapgolly.rcInput

import japgolly.scalajs.react.ReactCompositionEventFrom
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLTextAreaElement
import typingsJapgolly.rcInput.esInterfaceMod.BaseInputProps
import typingsJapgolly.rcInput.esInterfaceMod.InputProps
import typingsJapgolly.rcInput.rcInputStrings.all
import typingsJapgolly.rcInput.rcInputStrings.end
import typingsJapgolly.rcInput.rcInputStrings.start
import typingsJapgolly.std.FocusOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsCommonUtilsMod {
  
  @JSImport("rc-input/es/utils/commonUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fixControlledValue[T](value: T): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fixControlledValue")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hasAddon(props: BaseInputProps): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasAddon")(props.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def hasAddon(props: InputProps): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasAddon")(props.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def hasPrefixSuffix(props: BaseInputProps): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasPrefixSuffix")(props.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def hasPrefixSuffix(props: InputProps): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasPrefixSuffix")(props.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def resolveOnChange(target: HTMLInputElement, e: ReactCompositionEventFrom[HTMLElement]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resolveOnChange(
    target: HTMLInputElement,
    e: ReactCompositionEventFrom[HTMLElement],
    onChange: js.Function1[/* event */ ReactEventFrom[HTMLInputElement], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resolveOnChange(
    target: HTMLInputElement,
    e: ReactCompositionEventFrom[HTMLElement],
    onChange: js.Function1[/* event */ ReactEventFrom[HTMLInputElement], Unit],
    targetValue: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any], targetValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resolveOnChange(
    target: HTMLInputElement,
    e: ReactCompositionEventFrom[HTMLElement],
    onChange: Unit,
    targetValue: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any], targetValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resolveOnChange(target: HTMLInputElement, e: ReactEventFrom[HTMLInputElement]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resolveOnChange(
    target: HTMLInputElement,
    e: ReactEventFrom[HTMLInputElement],
    onChange: js.Function1[/* event */ ReactEventFrom[HTMLInputElement], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resolveOnChange(
    target: HTMLInputElement,
    e: ReactEventFrom[HTMLInputElement],
    onChange: js.Function1[/* event */ ReactEventFrom[HTMLInputElement], Unit],
    targetValue: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any], targetValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resolveOnChange(target: HTMLInputElement, e: ReactEventFrom[HTMLInputElement], onChange: Unit, targetValue: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any], targetValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resolveOnChange(target: HTMLInputElement, e: ReactMouseEventFrom[HTMLElement]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resolveOnChange(
    target: HTMLInputElement,
    e: ReactMouseEventFrom[HTMLElement],
    onChange: js.Function1[/* event */ ReactEventFrom[HTMLInputElement], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resolveOnChange(
    target: HTMLInputElement,
    e: ReactMouseEventFrom[HTMLElement],
    onChange: js.Function1[/* event */ ReactEventFrom[HTMLInputElement], Unit],
    targetValue: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any], targetValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resolveOnChange(target: HTMLInputElement, e: ReactMouseEventFrom[HTMLElement], onChange: Unit, targetValue: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any], targetValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resolveOnChange(target: HTMLTextAreaElement, e: ReactCompositionEventFrom[HTMLElement]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resolveOnChange(
    target: HTMLTextAreaElement,
    e: ReactCompositionEventFrom[HTMLElement],
    onChange: js.Function1[/* event */ ReactEventFrom[HTMLTextAreaElement], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resolveOnChange(
    target: HTMLTextAreaElement,
    e: ReactCompositionEventFrom[HTMLElement],
    onChange: js.Function1[/* event */ ReactEventFrom[HTMLTextAreaElement], Unit],
    targetValue: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any], targetValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resolveOnChange(
    target: HTMLTextAreaElement,
    e: ReactCompositionEventFrom[HTMLElement],
    onChange: Unit,
    targetValue: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any], targetValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resolveOnChange(target: HTMLTextAreaElement, e: ReactEventFrom[HTMLTextAreaElement]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resolveOnChange(
    target: HTMLTextAreaElement,
    e: ReactEventFrom[HTMLTextAreaElement],
    onChange: js.Function1[/* event */ ReactEventFrom[HTMLTextAreaElement], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resolveOnChange(
    target: HTMLTextAreaElement,
    e: ReactEventFrom[HTMLTextAreaElement],
    onChange: js.Function1[/* event */ ReactEventFrom[HTMLTextAreaElement], Unit],
    targetValue: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any], targetValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resolveOnChange(
    target: HTMLTextAreaElement,
    e: ReactEventFrom[HTMLTextAreaElement],
    onChange: Unit,
    targetValue: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any], targetValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resolveOnChange(target: HTMLTextAreaElement, e: ReactMouseEventFrom[HTMLElement]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resolveOnChange(
    target: HTMLTextAreaElement,
    e: ReactMouseEventFrom[HTMLElement],
    onChange: js.Function1[/* event */ ReactEventFrom[HTMLTextAreaElement], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resolveOnChange(
    target: HTMLTextAreaElement,
    e: ReactMouseEventFrom[HTMLElement],
    onChange: js.Function1[/* event */ ReactEventFrom[HTMLTextAreaElement], Unit],
    targetValue: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any], targetValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resolveOnChange(
    target: HTMLTextAreaElement,
    e: ReactMouseEventFrom[HTMLElement],
    onChange: Unit,
    targetValue: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any], targetValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def triggerFocus(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("triggerFocus")().asInstanceOf[Unit]
  inline def triggerFocus(element: HTMLInputElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("triggerFocus")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def triggerFocus(element: HTMLInputElement, option: InputFocusOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("triggerFocus")(element.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def triggerFocus(element: HTMLTextAreaElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("triggerFocus")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def triggerFocus(element: HTMLTextAreaElement, option: InputFocusOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("triggerFocus")(element.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def triggerFocus(element: Unit, option: InputFocusOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("triggerFocus")(element.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait InputFocusOptions
    extends StObject
       with FocusOptions {
    
    var cursor: js.UndefOr[start | end | all] = js.undefined
  }
  object InputFocusOptions {
    
    inline def apply(): InputFocusOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputFocusOptions]
    }
    
    extension [Self <: InputFocusOptions](x: Self) {
      
      inline def setCursor(value: start | end | all): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    }
  }
}
