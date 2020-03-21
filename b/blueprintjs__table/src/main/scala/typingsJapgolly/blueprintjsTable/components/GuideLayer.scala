package typingsJapgolly.blueprintjsTable.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.blueprintjsTable.guidesMod.IGuideLayerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object GuideLayer {
  def apply(
    className: String = null,
    horizontalGuides: js.Array[Double] = null,
    verticalGuides: js.Array[Double] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    IGuideLayerProps, 
    typingsJapgolly.blueprintjsTable.guidesMod.GuideLayer, 
    Unit, 
    IGuideLayerProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (horizontalGuides != null) __obj.updateDynamic("horizontalGuides")(horizontalGuides.asInstanceOf[js.Any])
    if (verticalGuides != null) __obj.updateDynamic("verticalGuides")(verticalGuides.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.blueprintjsTable.guidesMod.IGuideLayerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.blueprintjsTable.guidesMod.GuideLayer](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.blueprintjsTable.guidesMod.IGuideLayerProps])(children: _*)
  }
  @JSImport("@blueprintjs/table/lib/esm/layers/guides", "GuideLayer")
  @js.native
  object componentImport extends js.Object
  
}

