package typingsJapgolly.reactBootstrap.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.HTMLProps
import typingsJapgolly.reactBootstrap.mediaListMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MediaList {
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[typingsJapgolly.reactBootstrap.mediaListMod.MediaList] = null,
    ClassAttributes: ClassAttributes[typingsJapgolly.reactBootstrap.mediaListMod.MediaList] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    HTMLProps[typingsJapgolly.reactBootstrap.mediaListMod.MediaList], 
    ^, 
    Unit, 
    HTMLProps[typingsJapgolly.reactBootstrap.mediaListMod.MediaList]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.react.mod.HTMLProps[typingsJapgolly.reactBootstrap.mediaListMod.MediaList], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactBootstrap.mediaListMod.^](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.react.mod.HTMLProps[typingsJapgolly.reactBootstrap.mediaListMod.MediaList]])(children: _*)
  }
  @JSImport("react-bootstrap/lib/MediaList", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
}

