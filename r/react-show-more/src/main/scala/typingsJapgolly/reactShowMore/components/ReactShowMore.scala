package typingsJapgolly.reactShowMore.components

import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactShowMore.mod.ReactShowMoreProps
import typingsJapgolly.reactShowMore.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactShowMore {
  def apply(
    anchorClass: String = null,
    less: String = null,
    lines: Int | Double = null,
    more: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: String = null
  ): UnmountedWithRoot[ReactShowMoreProps, default, Unit, ReactShowMoreProps] = {
    val __obj = js.Dynamic.literal()
  
      if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (anchorClass != null) __obj.updateDynamic("anchorClass")(anchorClass.asInstanceOf[js.Any])
    if (less != null) __obj.updateDynamic("less")(less.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    if (more != null) __obj.updateDynamic("more")(more.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactShowMore.mod.ReactShowMoreProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactShowMore.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactShowMore.mod.ReactShowMoreProps])
  }
  @JSImport("react-show-more", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

