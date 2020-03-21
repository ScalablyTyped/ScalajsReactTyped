package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.officeUiFabricReact.documentCardPreviewTypesMod.IDocumentCardPreview
import typingsJapgolly.officeUiFabricReact.documentCardPreviewTypesMod.IDocumentCardPreviewImage
import typingsJapgolly.officeUiFabricReact.documentCardPreviewTypesMod.IDocumentCardPreviewProps
import typingsJapgolly.officeUiFabricReact.documentCardPreviewTypesMod.IDocumentCardPreviewStyleProps
import typingsJapgolly.officeUiFabricReact.documentCardPreviewTypesMod.IDocumentCardPreviewStyles
import typingsJapgolly.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DocumentCardPreviewBase {
  def apply(
    previewImages: js.Array[IDocumentCardPreviewImage],
    className: String = null,
    componentRef: IRefObject[IDocumentCardPreview] = null,
    getOverflowDocumentCountText: /* overflowCount */ Double => CallbackTo[String] = null,
    styles: IStyleFunctionOrObject[IDocumentCardPreviewStyleProps, IDocumentCardPreviewStyles] = null,
    theme: ITheme = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    IDocumentCardPreviewProps, 
    typingsJapgolly.officeUiFabricReact.documentCardPreviewBaseMod.DocumentCardPreviewBase, 
    Unit, 
    IDocumentCardPreviewProps
  ] = {
    val __obj = js.Dynamic.literal(previewImages = previewImages.asInstanceOf[js.Any])
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (getOverflowDocumentCountText != null) __obj.updateDynamic("getOverflowDocumentCountText")(js.Any.fromFunction1((t0: /* overflowCount */ scala.Double) => getOverflowDocumentCountText(t0).runNow()))
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.officeUiFabricReact.documentCardPreviewTypesMod.IDocumentCardPreviewProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.officeUiFabricReact.documentCardPreviewBaseMod.DocumentCardPreviewBase](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.officeUiFabricReact.documentCardPreviewTypesMod.IDocumentCardPreviewProps])(children: _*)
  }
  @JSImport("office-ui-fabric-react/lib/components/DocumentCard/DocumentCardPreview.base", "DocumentCardPreviewBase")
  @js.native
  object componentImport extends js.Object
  
}

