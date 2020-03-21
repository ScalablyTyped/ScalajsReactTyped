package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.officeUiFabricReact.documentCardLogoTypesMod.IDocumentCardLogo
import typingsJapgolly.officeUiFabricReact.documentCardLogoTypesMod.IDocumentCardLogoProps
import typingsJapgolly.officeUiFabricReact.documentCardLogoTypesMod.IDocumentCardLogoStyleProps
import typingsJapgolly.officeUiFabricReact.documentCardLogoTypesMod.IDocumentCardLogoStyles
import typingsJapgolly.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DocumentCardLogoBase {
  def apply(
    logoIcon: String,
    className: String = null,
    componentRef: IRefObject[IDocumentCardLogo] = null,
    logoName: String = null,
    styles: IStyleFunctionOrObject[IDocumentCardLogoStyleProps, IDocumentCardLogoStyles] = null,
    theme: ITheme = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    IDocumentCardLogoProps, 
    typingsJapgolly.officeUiFabricReact.documentCardLogoBaseMod.DocumentCardLogoBase, 
    Unit, 
    IDocumentCardLogoProps
  ] = {
    val __obj = js.Dynamic.literal(logoIcon = logoIcon.asInstanceOf[js.Any])
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (logoName != null) __obj.updateDynamic("logoName")(logoName.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.officeUiFabricReact.documentCardLogoTypesMod.IDocumentCardLogoProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.officeUiFabricReact.documentCardLogoBaseMod.DocumentCardLogoBase](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.officeUiFabricReact.documentCardLogoTypesMod.IDocumentCardLogoProps])(children: _*)
  }
  @JSImport("office-ui-fabric-react/lib/components/DocumentCard/DocumentCardLogo.base", "DocumentCardLogoBase")
  @js.native
  object componentImport extends js.Object
  
}

