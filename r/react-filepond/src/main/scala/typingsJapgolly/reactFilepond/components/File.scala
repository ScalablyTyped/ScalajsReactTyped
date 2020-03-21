package typingsJapgolly.reactFilepond.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactFilepond.mod.FilePondOrigin
import typingsJapgolly.reactFilepond.mod.FileProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object File {
  def apply(
    src: String,
    metadata: StringDictionary[js.Any] = null,
    name: String = null,
    origin: FilePondOrigin = null,
    size: Int | Double = null,
    `type`: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[FileProps, typingsJapgolly.reactFilepond.mod.File, Unit, FileProps] = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
  
      if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactFilepond.mod.FileProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactFilepond.mod.File](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactFilepond.mod.FileProps])(children: _*)
  }
  @JSImport("react-filepond", "File")
  @js.native
  object componentImport extends js.Object
  
}

