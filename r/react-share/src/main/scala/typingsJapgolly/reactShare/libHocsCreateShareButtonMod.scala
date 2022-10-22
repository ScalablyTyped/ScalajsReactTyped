package typingsJapgolly.reactShare

import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.PropsWithoutRef
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactShare.libShareButtonMod.Props
import typingsJapgolly.reactShare.reactShareStrings.forwardedRef
import typingsJapgolly.reactShare.reactShareStrings.networkLink
import typingsJapgolly.reactShare.reactShareStrings.networkName
import typingsJapgolly.reactShare.reactShareStrings.opts
import typingsJapgolly.std.Omit
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHocsCreateShareButtonMod {
  
  @JSImport("react-share/lib/hocs/createShareButton", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[OptionProps /* <: Record[String, Any] */, LinkOptions /* <: Record[String, Any] */](
    networkName: String,
    link: js.Function2[/* url */ String, /* options */ LinkOptions, String],
    optsMap: js.Function1[/* props */ OptionProps, LinkOptions],
    defaultProps: Partial[Props[LinkOptions] & OptionProps]
  ): ForwardRefExoticComponent[
    (PropsWithoutRef[
      (Omit[Props[LinkOptions], forwardedRef | networkName | networkLink | opts]) & OptionProps
    ]) & RefAttributes[HTMLButtonElement]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(networkName.asInstanceOf[js.Any], link.asInstanceOf[js.Any], optsMap.asInstanceOf[js.Any], defaultProps.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[
    (PropsWithoutRef[
      (Omit[Props[LinkOptions], forwardedRef | networkName | networkLink | opts]) & OptionProps
    ]) & RefAttributes[HTMLButtonElement]
  ]]
}
