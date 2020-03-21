package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.officeUiFabricReact.stickyTypesMod.IStickyProps
import typingsJapgolly.officeUiFabricReact.stickyTypesMod.StickyPositionType
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Sticky {
  def apply(
    componentRef: IRefObject[IStickyProps] = null,
    isScrollSynced: js.UndefOr[Boolean] = js.undefined,
    stickyBackgroundColor: String = null,
    stickyClassName: String = null,
    stickyPosition: StickyPositionType = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[IStickyProps, typingsJapgolly.officeUiFabricReact.mod.Sticky, Unit, IStickyProps] = {
    val __obj = js.Dynamic.literal()
  
      if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (!js.isUndefined(isScrollSynced)) __obj.updateDynamic("isScrollSynced")(isScrollSynced.asInstanceOf[js.Any])
    if (stickyBackgroundColor != null) __obj.updateDynamic("stickyBackgroundColor")(stickyBackgroundColor.asInstanceOf[js.Any])
    if (stickyClassName != null) __obj.updateDynamic("stickyClassName")(stickyClassName.asInstanceOf[js.Any])
    if (stickyPosition != null) __obj.updateDynamic("stickyPosition")(stickyPosition.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.officeUiFabricReact.stickyTypesMod.IStickyProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.officeUiFabricReact.mod.Sticky](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.officeUiFabricReact.stickyTypesMod.IStickyProps])(children: _*)
  }
  @JSImport("office-ui-fabric-react", "Sticky")
  @js.native
  object componentImport extends js.Object
  
}

