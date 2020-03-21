package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.officeUiFabricReact.documentCardLocationTypesMod.IDocumentCardLocation
import typingsJapgolly.officeUiFabricReact.documentCardLocationTypesMod.IDocumentCardLocationProps
import typingsJapgolly.officeUiFabricReact.documentCardLocationTypesMod.IDocumentCardLocationStyleProps
import typingsJapgolly.officeUiFabricReact.documentCardLocationTypesMod.IDocumentCardLocationStyles
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DocumentCardLocation {
  def apply(
    location: String,
    ariaLabel: String = null,
    className: String = null,
    componentRef: IRefObject[IDocumentCardLocation] = null,
    locationHref: String = null,
    onClick: /* ev */ js.UndefOr[ReactMouseEventFrom[HTMLElement]] => Callback = null,
    styles: IStyleFunctionOrObject[IDocumentCardLocationStyleProps, IDocumentCardLocationStyles] = null,
    theme: ITheme = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    IDocumentCardLocationProps, 
    LegacyRef[
      typingsJapgolly.officeUiFabricReact.documentCardLocationBaseMod.DocumentCardLocationBase
    ], 
    Unit, 
    IDocumentCardLocationProps
  ] = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
  
      if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (locationHref != null) __obj.updateDynamic("locationHref")(locationHref.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* ev */ js.UndefOr[japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]]) => onClick(t0).runNow()))
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.officeUiFabricReact.documentCardLocationTypesMod.IDocumentCardLocationProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.react.mod.LegacyRef[
    typingsJapgolly.officeUiFabricReact.documentCardLocationBaseMod.DocumentCardLocationBase
  ]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.officeUiFabricReact.documentCardLocationTypesMod.IDocumentCardLocationProps])(children: _*)
  }
  @JSImport("office-ui-fabric-react", "DocumentCardLocation")
  @js.native
  object componentImport extends js.Object
  
}

