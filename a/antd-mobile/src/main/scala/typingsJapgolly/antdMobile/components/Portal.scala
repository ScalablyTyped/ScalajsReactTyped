package typingsJapgolly.antdMobile.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.antdMobile.portalMod.PortalProps
import typingsJapgolly.antdMobile.portalMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Portal {
  def apply(
    getContainer: CallbackTo[Element],
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[PortalProps, default, Unit, PortalProps] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("getContainer")(getContainer.toJsFn)
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antdMobile.portalMod.PortalProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antdMobile.portalMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antdMobile.portalMod.PortalProps])(children: _*)
  }
  @JSImport("antd-mobile/lib/input-item/Portal", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

