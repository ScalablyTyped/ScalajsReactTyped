package typingsJapgolly.wixStyleReact.mod

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.ValidationMap
import typingsJapgolly.wixStyleReact.anon.PartialCustomModalLayoutP
import typingsJapgolly.wixStyleReact.anon.WeakValidationMapCustomMo
import typingsJapgolly.wixStyleReact.distTypesCustomModalLayoutMod.CustomModalLayoutProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FC<wix-style-react.wix-style-react/dist/types/CustomModalLayout.CustomModalLayoutProps> & {  Title :react.react.FunctionComponent<{}>} */
object CustomModalLayout {
  
  inline def apply(props: CustomModalLayoutProps): Element | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  inline def apply(props: CustomModalLayoutProps, context: Any): Element | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
  
  @JSImport("wix-style-react", "CustomModalLayout")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-style-react", "CustomModalLayout.Title")
  @js.native
  def Title: FunctionComponent[js.Object] = js.native
  inline def Title_=(x: FunctionComponent[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Title")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "CustomModalLayout.contextTypes")
  @js.native
  def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
  inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "CustomModalLayout.defaultProps")
  @js.native
  def defaultProps: js.UndefOr[PartialCustomModalLayoutP] = js.native
  inline def defaultProps_=(x: js.UndefOr[PartialCustomModalLayoutP]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "CustomModalLayout.displayName")
  @js.native
  def displayName: js.UndefOr[String] = js.native
  inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "CustomModalLayout.propTypes")
  @js.native
  def propTypes: js.UndefOr[WeakValidationMapCustomMo] = js.native
  inline def propTypes_=(x: js.UndefOr[WeakValidationMapCustomMo]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
