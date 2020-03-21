package typingsJapgolly.antDesignPro.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignPro.AnonName
import typingsJapgolly.antDesignPro.tagCloudMod.ITagCloudProps
import typingsJapgolly.antDesignPro.tagCloudMod.default
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TagCloud {
  def apply(
    data: js.Array[AnonName],
    height: Double,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ITagCloudProps, default, Unit, ITagCloudProps] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any])
  
      if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antDesignPro.tagCloudMod.ITagCloudProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antDesignPro.tagCloudMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignPro.tagCloudMod.ITagCloudProps])(children: _*)
  }
  @JSImport("ant-design-pro/lib/Charts/TagCloud", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

