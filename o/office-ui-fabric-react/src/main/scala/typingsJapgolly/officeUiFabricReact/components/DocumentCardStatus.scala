package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.officeUiFabricReact.documentCardStatusTypesMod.IDocumentCardStatus
import typingsJapgolly.officeUiFabricReact.documentCardStatusTypesMod.IDocumentCardStatusProps
import typingsJapgolly.officeUiFabricReact.documentCardStatusTypesMod.IDocumentCardStatusStyleProps
import typingsJapgolly.officeUiFabricReact.documentCardStatusTypesMod.IDocumentCardStatusStyles
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DocumentCardStatus {
  def apply(
    status: String,
    className: String = null,
    componentRef: IRefObject[IDocumentCardStatus] = null,
    statusIcon: String = null,
    styles: IStyleFunctionOrObject[IDocumentCardStatusStyleProps, IDocumentCardStatusStyles] = null,
    theme: ITheme = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    IDocumentCardStatusProps, 
    LegacyRef[
      typingsJapgolly.officeUiFabricReact.documentCardStatusBaseMod.DocumentCardStatusBase
    ], 
    Unit, 
    IDocumentCardStatusProps
  ] = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (statusIcon != null) __obj.updateDynamic("statusIcon")(statusIcon.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.officeUiFabricReact.documentCardStatusTypesMod.IDocumentCardStatusProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.react.mod.LegacyRef[
    typingsJapgolly.officeUiFabricReact.documentCardStatusBaseMod.DocumentCardStatusBase
  ]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.officeUiFabricReact.documentCardStatusTypesMod.IDocumentCardStatusProps])(children: _*)
  }
  @JSImport("office-ui-fabric-react", "DocumentCardStatus")
  @js.native
  object componentImport extends js.Object
  
}

