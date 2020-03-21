package typingsJapgolly.reactBootstrap.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.ReactType
import typingsJapgolly.reactBootstrap.mediaBodyMod.MediaBodyProps
import typingsJapgolly.reactBootstrap.mediaBodyMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MediaBody {
  def apply(
    componentClass: ReactType[_] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[MediaBodyProps, ^, Unit, MediaBodyProps] = {
    val __obj = js.Dynamic.literal()
  
      if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactBootstrap.mediaBodyMod.MediaBodyProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactBootstrap.mediaBodyMod.^](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactBootstrap.mediaBodyMod.MediaBodyProps])(children: _*)
  }
  @JSImport("react-bootstrap/lib/MediaBody", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
}

