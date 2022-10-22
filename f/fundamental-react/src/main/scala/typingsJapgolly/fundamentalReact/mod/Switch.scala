package typingsJapgolly.fundamentalReact.mod

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.fundamentalReact.anon.PartialSwitchProps
import typingsJapgolly.fundamentalReact.anon.WeakValidationMapSwitchPr
import typingsJapgolly.fundamentalReact.libSwitchSwitchMod.SwitchProps
import typingsJapgolly.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Switch/Switch.SwitchProps> & {  displayName :'Switch'} */
object Switch {
  
  inline def apply(props: SwitchProps): Element | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  inline def apply(props: SwitchProps, context: Any): Element | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
  
  @JSImport("fundamental-react", "Switch")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fundamental-react", "Switch.contextTypes")
  @js.native
  def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
  inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Switch.defaultProps")
  @js.native
  def defaultProps: js.UndefOr[PartialSwitchProps] = js.native
  inline def defaultProps_=(x: js.UndefOr[PartialSwitchProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Switch.displayName")
  @js.native
  def displayName: js.UndefOr[String | typingsJapgolly.fundamentalReact.fundamentalReactStrings.Switch] = js.native
  inline def displayName_=(x: js.UndefOr[String | typingsJapgolly.fundamentalReact.fundamentalReactStrings.Switch]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Switch.propTypes")
  @js.native
  def propTypes: js.UndefOr[WeakValidationMapSwitchPr] = js.native
  inline def propTypes_=(x: js.UndefOr[WeakValidationMapSwitchPr]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
