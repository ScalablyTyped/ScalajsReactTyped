package typingsJapgolly.fundamentalReact.mod

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.fundamentalReact.anon.PartialLayoutGridProps
import typingsJapgolly.fundamentalReact.anon.WeakValidationMapLayoutGr
import typingsJapgolly.fundamentalReact.libLayoutGridLayoutGridMod.LayoutGridProps
import typingsJapgolly.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/LayoutGrid/LayoutGrid.LayoutGridProps> & {  displayName :'LayoutGridProps'} */
object LayoutGrid {
  
  inline def apply(props: LayoutGridProps): Element | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  inline def apply(props: LayoutGridProps, context: Any): Element | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
  
  @JSImport("fundamental-react", "LayoutGrid")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fundamental-react", "LayoutGrid.contextTypes")
  @js.native
  def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
  inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "LayoutGrid.defaultProps")
  @js.native
  def defaultProps: js.UndefOr[PartialLayoutGridProps] = js.native
  inline def defaultProps_=(x: js.UndefOr[PartialLayoutGridProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "LayoutGrid.displayName")
  @js.native
  def displayName: js.UndefOr[
    typingsJapgolly.fundamentalReact.fundamentalReactStrings.LayoutGridProps | String
  ] = js.native
  inline def displayName_=(
    x: js.UndefOr[
      typingsJapgolly.fundamentalReact.fundamentalReactStrings.LayoutGridProps | String
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "LayoutGrid.propTypes")
  @js.native
  def propTypes: js.UndefOr[WeakValidationMapLayoutGr] = js.native
  inline def propTypes_=(x: js.UndefOr[WeakValidationMapLayoutGr]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
