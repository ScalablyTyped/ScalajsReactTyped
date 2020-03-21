package typingsJapgolly.primereact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.primereact.deferredContentMod.DeferredContentProps
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DeferredContent {
  def apply(
    onLoad: /* event */ Event_ => Callback = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    DeferredContentProps, 
    typingsJapgolly.primereact.primereactDeferredcontentMod.DeferredContent, 
    Unit, 
    DeferredContentProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onLoad(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.primereact.deferredContentMod.DeferredContentProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.primereact.primereactDeferredcontentMod.DeferredContent](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.primereact.deferredContentMod.DeferredContentProps])(children: _*)
  }
  @JSImport("primereact/deferredcontent", "DeferredContent")
  @js.native
  object componentImport extends js.Object
  
}

