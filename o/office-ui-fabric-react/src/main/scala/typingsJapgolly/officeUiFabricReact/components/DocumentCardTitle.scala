package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.officeUiFabricReact.documentCardTitleTypesMod.IDocumentCardTitle
import typingsJapgolly.officeUiFabricReact.documentCardTitleTypesMod.IDocumentCardTitleProps
import typingsJapgolly.officeUiFabricReact.documentCardTitleTypesMod.IDocumentCardTitleStyleProps
import typingsJapgolly.officeUiFabricReact.documentCardTitleTypesMod.IDocumentCardTitleStyles
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DocumentCardTitle {
  def apply(
    title: String,
    className: String = null,
    componentRef: IRefObject[IDocumentCardTitle] = null,
    shouldTruncate: js.UndefOr[Boolean] = js.undefined,
    showAsSecondaryTitle: js.UndefOr[Boolean] = js.undefined,
    styles: IStyleFunctionOrObject[IDocumentCardTitleStyleProps, IDocumentCardTitleStyles] = null,
    theme: ITheme = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    IDocumentCardTitleProps, 
    LegacyRef[
      typingsJapgolly.officeUiFabricReact.documentCardTitleBaseMod.DocumentCardTitleBase
    ], 
    Unit, 
    IDocumentCardTitleProps
  ] = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldTruncate)) __obj.updateDynamic("shouldTruncate")(shouldTruncate.asInstanceOf[js.Any])
    if (!js.isUndefined(showAsSecondaryTitle)) __obj.updateDynamic("showAsSecondaryTitle")(showAsSecondaryTitle.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.officeUiFabricReact.documentCardTitleTypesMod.IDocumentCardTitleProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.react.mod.LegacyRef[
    typingsJapgolly.officeUiFabricReact.documentCardTitleBaseMod.DocumentCardTitleBase
  ]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.officeUiFabricReact.documentCardTitleTypesMod.IDocumentCardTitleProps])(children: _*)
  }
  @JSImport("office-ui-fabric-react", "DocumentCardTitle")
  @js.native
  object componentImport extends js.Object
  
}

