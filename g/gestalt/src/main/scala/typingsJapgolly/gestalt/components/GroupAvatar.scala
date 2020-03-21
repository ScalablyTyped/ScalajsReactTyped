package typingsJapgolly.gestalt.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.gestalt.AnonName
import typingsJapgolly.gestalt.gestaltStrings.lg
import typingsJapgolly.gestalt.gestaltStrings.md
import typingsJapgolly.gestalt.gestaltStrings.sm
import typingsJapgolly.gestalt.mod.GroupAvatarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object GroupAvatar {
  def apply(
    collaborators: js.Array[AnonName],
    outline: js.UndefOr[Boolean] = js.undefined,
    size: sm | md | lg = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[GroupAvatarProps, typingsJapgolly.gestalt.mod.GroupAvatar, Unit, GroupAvatarProps] = {
    val __obj = js.Dynamic.literal(collaborators = collaborators.asInstanceOf[js.Any])
  
      if (!js.isUndefined(outline)) __obj.updateDynamic("outline")(outline.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.gestalt.mod.GroupAvatarProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.gestalt.mod.GroupAvatar](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.gestalt.mod.GroupAvatarProps])(children: _*)
  }
  @JSImport("gestalt", "GroupAvatar")
  @js.native
  object componentImport extends js.Object
  
}

