package typingsJapgolly.fundamentalReact.mod

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.fundamentalReact.anon.FunctionComponentBreadcru
import typingsJapgolly.fundamentalReact.anon.PartialBreadcrumbProps
import typingsJapgolly.fundamentalReact.anon.WeakValidationMapBreadcru
import typingsJapgolly.fundamentalReact.libBreadcrumbBreadcrumbMod.BreadcrumbProps
import typingsJapgolly.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Breadcrumb/Breadcrumb.BreadcrumbProps> & {  displayName :'Breadcrumb',   Item :react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Breadcrumb/Breadcrumb.BreadcrumbItemProps> & {  displayName :'Breadcrumb.Item'}} */
object Breadcrumb {
  
  inline def apply(props: BreadcrumbProps): Element | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  inline def apply(props: BreadcrumbProps, context: Any): Element | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
  
  @JSImport("fundamental-react", "Breadcrumb")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fundamental-react", "Breadcrumb.Item")
  @js.native
  def Item: FunctionComponentBreadcru = js.native
  inline def Item_=(x: FunctionComponentBreadcru): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Breadcrumb.contextTypes")
  @js.native
  def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
  inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Breadcrumb.defaultProps")
  @js.native
  def defaultProps: js.UndefOr[PartialBreadcrumbProps] = js.native
  inline def defaultProps_=(x: js.UndefOr[PartialBreadcrumbProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Breadcrumb.displayName")
  @js.native
  def displayName: js.UndefOr[typingsJapgolly.fundamentalReact.fundamentalReactStrings.Breadcrumb | String] = js.native
  inline def displayName_=(x: js.UndefOr[typingsJapgolly.fundamentalReact.fundamentalReactStrings.Breadcrumb | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Breadcrumb.propTypes")
  @js.native
  def propTypes: js.UndefOr[WeakValidationMapBreadcru] = js.native
  inline def propTypes_=(x: js.UndefOr[WeakValidationMapBreadcru]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
