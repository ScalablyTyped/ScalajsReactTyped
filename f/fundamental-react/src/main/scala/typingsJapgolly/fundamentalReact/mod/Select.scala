package typingsJapgolly.fundamentalReact.mod

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.fundamentalReact.anon.PartialSelectProps
import typingsJapgolly.fundamentalReact.anon.WeakValidationMapSelectPr
import typingsJapgolly.fundamentalReact.libSelectSelectMod.SelectProps
import typingsJapgolly.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Select/Select.SelectProps> & {  displayName :'Select'} */
object Select {
  
  inline def apply(props: SelectProps): Element | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  inline def apply(props: SelectProps, context: Any): Element | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
  
  @JSImport("fundamental-react", "Select")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fundamental-react", "Select.contextTypes")
  @js.native
  def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
  inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Select.defaultProps")
  @js.native
  def defaultProps: js.UndefOr[PartialSelectProps] = js.native
  inline def defaultProps_=(x: js.UndefOr[PartialSelectProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Select.displayName")
  @js.native
  def displayName: js.UndefOr[typingsJapgolly.fundamentalReact.fundamentalReactStrings.Select | String] = js.native
  inline def displayName_=(x: js.UndefOr[typingsJapgolly.fundamentalReact.fundamentalReactStrings.Select | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Select.propTypes")
  @js.native
  def propTypes: js.UndefOr[WeakValidationMapSelectPr] = js.native
  inline def propTypes_=(x: js.UndefOr[WeakValidationMapSelectPr]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
