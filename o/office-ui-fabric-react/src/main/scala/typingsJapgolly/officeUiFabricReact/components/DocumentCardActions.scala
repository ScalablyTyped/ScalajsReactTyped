package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.officeUiFabricReact.buttonTypesMod.IButtonProps
import typingsJapgolly.officeUiFabricReact.documentCardActionsTypesMod.IDocumentCardActions
import typingsJapgolly.officeUiFabricReact.documentCardActionsTypesMod.IDocumentCardActionsProps
import typingsJapgolly.officeUiFabricReact.documentCardActionsTypesMod.IDocumentCardActionsStyleProps
import typingsJapgolly.officeUiFabricReact.documentCardActionsTypesMod.IDocumentCardActionsStyles
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.std.Number
import typingsJapgolly.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DocumentCardActions {
  def apply(
    actions: js.Array[IButtonProps],
    className: String = null,
    componentRef: IRefObject[IDocumentCardActions] = null,
    styles: IStyleFunctionOrObject[IDocumentCardActionsStyleProps, IDocumentCardActionsStyles] = null,
    theme: ITheme = null,
    views: Number = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    IDocumentCardActionsProps, 
    LegacyRef[
      typingsJapgolly.officeUiFabricReact.documentCardActionsBaseMod.DocumentCardActionsBase
    ], 
    Unit, 
    IDocumentCardActionsProps
  ] = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (views != null) __obj.updateDynamic("views")(views.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.officeUiFabricReact.documentCardActionsTypesMod.IDocumentCardActionsProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.react.mod.LegacyRef[
    typingsJapgolly.officeUiFabricReact.documentCardActionsBaseMod.DocumentCardActionsBase
  ]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.officeUiFabricReact.documentCardActionsTypesMod.IDocumentCardActionsProps])(children: _*)
  }
  @JSImport("office-ui-fabric-react", "DocumentCardActions")
  @js.native
  object componentImport extends js.Object
  
}

