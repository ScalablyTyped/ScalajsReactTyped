package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.officeUiFabricReact.documentCardDetailsTypesMod.IDocumentCardDetails
import typingsJapgolly.officeUiFabricReact.documentCardDetailsTypesMod.IDocumentCardDetailsProps
import typingsJapgolly.officeUiFabricReact.documentCardDetailsTypesMod.IDocumentCardDetailsStyleProps
import typingsJapgolly.officeUiFabricReact.documentCardDetailsTypesMod.IDocumentCardDetailsStyles
import typingsJapgolly.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DocumentCardDetailsBase {
  def apply(
    className: String = null,
    componentRef: IRefObject[IDocumentCardDetails] = null,
    styles: IStyleFunctionOrObject[IDocumentCardDetailsStyleProps, IDocumentCardDetailsStyles] = null,
    theme: ITheme = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    IDocumentCardDetailsProps, 
    typingsJapgolly.officeUiFabricReact.documentCardDetailsBaseMod.DocumentCardDetailsBase, 
    Unit, 
    IDocumentCardDetailsProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.officeUiFabricReact.documentCardDetailsTypesMod.IDocumentCardDetailsProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.officeUiFabricReact.documentCardDetailsBaseMod.DocumentCardDetailsBase](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.officeUiFabricReact.documentCardDetailsTypesMod.IDocumentCardDetailsProps])(children: _*)
  }
  @JSImport("office-ui-fabric-react/lib/components/DocumentCard/DocumentCardDetails.base", "DocumentCardDetailsBase")
  @js.native
  object componentImport extends js.Object
  
}

