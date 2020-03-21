package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.officeUiFabricReact.documentCardActivityTypesMod.IDocumentCardActivity
import typingsJapgolly.officeUiFabricReact.documentCardActivityTypesMod.IDocumentCardActivityPerson
import typingsJapgolly.officeUiFabricReact.documentCardActivityTypesMod.IDocumentCardActivityProps
import typingsJapgolly.officeUiFabricReact.documentCardActivityTypesMod.IDocumentCardActivityStyleProps
import typingsJapgolly.officeUiFabricReact.documentCardActivityTypesMod.IDocumentCardActivityStyles
import typingsJapgolly.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DocumentCardActivityBase {
  def apply(
    activity: String,
    people: js.Array[IDocumentCardActivityPerson],
    className: String = null,
    componentRef: IRefObject[IDocumentCardActivity] = null,
    styles: IStyleFunctionOrObject[IDocumentCardActivityStyleProps, IDocumentCardActivityStyles] = null,
    theme: ITheme = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    IDocumentCardActivityProps, 
    typingsJapgolly.officeUiFabricReact.documentCardActivityBaseMod.DocumentCardActivityBase, 
    Unit, 
    IDocumentCardActivityProps
  ] = {
    val __obj = js.Dynamic.literal(activity = activity.asInstanceOf[js.Any], people = people.asInstanceOf[js.Any])
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.officeUiFabricReact.documentCardActivityTypesMod.IDocumentCardActivityProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.officeUiFabricReact.documentCardActivityBaseMod.DocumentCardActivityBase](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.officeUiFabricReact.documentCardActivityTypesMod.IDocumentCardActivityProps])(children: _*)
  }
  @JSImport("office-ui-fabric-react/lib/components/DocumentCard/DocumentCardActivity.base", "DocumentCardActivityBase")
  @js.native
  object componentImport extends js.Object
  
}

