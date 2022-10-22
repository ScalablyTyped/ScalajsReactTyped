package typingsJapgolly.fundamentalReact.mod

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.fundamentalReact.anon.PartialMessageStripProps
import typingsJapgolly.fundamentalReact.anon.WeakValidationMapMessageS
import typingsJapgolly.fundamentalReact.libMessageStripMessageStripMod.MessageStripProps
import typingsJapgolly.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/MessageStrip/MessageStrip.MessageStripProps> & {  displayName :'MessageStrip'} */
object MessageStrip {
  
  inline def apply(props: MessageStripProps): Element | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  inline def apply(props: MessageStripProps, context: Any): Element | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
  
  @JSImport("fundamental-react", "MessageStrip")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fundamental-react", "MessageStrip.contextTypes")
  @js.native
  def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
  inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "MessageStrip.defaultProps")
  @js.native
  def defaultProps: js.UndefOr[PartialMessageStripProps] = js.native
  inline def defaultProps_=(x: js.UndefOr[PartialMessageStripProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "MessageStrip.displayName")
  @js.native
  def displayName: js.UndefOr[typingsJapgolly.fundamentalReact.fundamentalReactStrings.MessageStrip | String] = js.native
  inline def displayName_=(x: js.UndefOr[typingsJapgolly.fundamentalReact.fundamentalReactStrings.MessageStrip | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "MessageStrip.propTypes")
  @js.native
  def propTypes: js.UndefOr[WeakValidationMapMessageS] = js.native
  inline def propTypes_=(x: js.UndefOr[WeakValidationMapMessageS]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
