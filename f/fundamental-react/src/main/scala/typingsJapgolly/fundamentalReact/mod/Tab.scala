package typingsJapgolly.fundamentalReact.mod

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.fundamentalReact.anon.PartialTabProps
import typingsJapgolly.fundamentalReact.anon.WeakValidationMapTabProps
import typingsJapgolly.fundamentalReact.libTabsTabMod.TabProps
import typingsJapgolly.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Tabs/Tab.TabProps> & {  displayName :'Tab'} */
object Tab {
  
  inline def apply(props: TabProps): Element | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  inline def apply(props: TabProps, context: Any): Element | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
  
  @JSImport("fundamental-react", "Tab")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fundamental-react", "Tab.contextTypes")
  @js.native
  def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
  inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Tab.defaultProps")
  @js.native
  def defaultProps: js.UndefOr[PartialTabProps] = js.native
  inline def defaultProps_=(x: js.UndefOr[PartialTabProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Tab.displayName")
  @js.native
  def displayName: js.UndefOr[String | typingsJapgolly.fundamentalReact.fundamentalReactStrings.Tab] = js.native
  inline def displayName_=(x: js.UndefOr[String | typingsJapgolly.fundamentalReact.fundamentalReactStrings.Tab]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Tab.propTypes")
  @js.native
  def propTypes: js.UndefOr[WeakValidationMapTabProps] = js.native
  inline def propTypes_=(x: js.UndefOr[WeakValidationMapTabProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
