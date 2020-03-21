package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.officeUiFabricReact.documentCardImageTypesMod.IDocumentCardImage
import typingsJapgolly.officeUiFabricReact.documentCardImageTypesMod.IDocumentCardImageProps
import typingsJapgolly.officeUiFabricReact.documentCardImageTypesMod.IDocumentCardImageStyleProps
import typingsJapgolly.officeUiFabricReact.documentCardImageTypesMod.IDocumentCardImageStyles
import typingsJapgolly.officeUiFabricReact.iconTypesMod.IIconProps
import typingsJapgolly.officeUiFabricReact.imageTypesMod.ImageFit
import typingsJapgolly.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DocumentCardImageBase {
  def apply(
    className: String = null,
    componentRef: IRefObject[IDocumentCardImage] = null,
    height: Int | Double = null,
    iconProps: IIconProps = null,
    imageFit: ImageFit = null,
    imageSrc: String = null,
    styles: IStyleFunctionOrObject[IDocumentCardImageStyleProps, IDocumentCardImageStyles] = null,
    theme: ITheme = null,
    width: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    IDocumentCardImageProps, 
    typingsJapgolly.officeUiFabricReact.documentCardImageBaseMod.DocumentCardImageBase, 
    Unit, 
    IDocumentCardImageProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (iconProps != null) __obj.updateDynamic("iconProps")(iconProps.asInstanceOf[js.Any])
    if (imageFit != null) __obj.updateDynamic("imageFit")(imageFit.asInstanceOf[js.Any])
    if (imageSrc != null) __obj.updateDynamic("imageSrc")(imageSrc.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.officeUiFabricReact.documentCardImageTypesMod.IDocumentCardImageProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.officeUiFabricReact.documentCardImageBaseMod.DocumentCardImageBase](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.officeUiFabricReact.documentCardImageTypesMod.IDocumentCardImageProps])(children: _*)
  }
  @JSImport("office-ui-fabric-react/lib/components/DocumentCard/DocumentCardImage.base", "DocumentCardImageBase")
  @js.native
  object componentImport extends js.Object
  
}

