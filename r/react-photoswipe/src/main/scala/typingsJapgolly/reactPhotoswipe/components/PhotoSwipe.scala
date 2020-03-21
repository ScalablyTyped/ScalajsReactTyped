package typingsJapgolly.reactPhotoswipe.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.MouseEvent
import typingsJapgolly.photoswipe.mod.Item
import typingsJapgolly.photoswipe.mod.Options
import typingsJapgolly.reactPhotoswipe.AnonPrevent
import typingsJapgolly.reactPhotoswipe.AnonX
import typingsJapgolly.reactPhotoswipe.mod.PhotoSwipeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PhotoSwipe {
  def apply(
    isOpen: Boolean,
    items: js.Array[Item],
    afterChange: /* instance */ typingsJapgolly.reactPhotoswipe.mod.PhotoSwipe => Callback = null,
    beforeChange: /* instance */ typingsJapgolly.reactPhotoswipe.mod.PhotoSwipe => Callback = null,
    className: String = null,
    close: /* instance */ typingsJapgolly.reactPhotoswipe.mod.PhotoSwipe => Callback = null,
    destroy: /* instance */ typingsJapgolly.reactPhotoswipe.mod.PhotoSwipe => Callback = null,
    gettingData: (/* instance */ typingsJapgolly.reactPhotoswipe.mod.PhotoSwipe, /* index */ Double, /* item */ Item) => Callback = null,
    id: String = null,
    imageLoadComplete: (/* instance */ typingsJapgolly.reactPhotoswipe.mod.PhotoSwipe, /* index */ Double, /* item */ Item) => Callback = null,
    initialZoomIn: /* instance */ typingsJapgolly.reactPhotoswipe.mod.PhotoSwipe => Callback = null,
    initialZoomInEnd: /* instance */ typingsJapgolly.reactPhotoswipe.mod.PhotoSwipe => Callback = null,
    initialZoomOut: /* instance */ typingsJapgolly.reactPhotoswipe.mod.PhotoSwipe => Callback = null,
    initialZoomOutEnd: /* instance */ typingsJapgolly.reactPhotoswipe.mod.PhotoSwipe => Callback = null,
    mouseUsed: /* instance */ typingsJapgolly.reactPhotoswipe.mod.PhotoSwipe => Callback = null,
    onClose: js.UndefOr[Callback] = js.undefined,
    options: Options = null,
    parseVerticalMargin: (/* instance */ typingsJapgolly.reactPhotoswipe.mod.PhotoSwipe, /* item */ Item) => Callback = null,
    preventDragEvent: (/* instance */ typingsJapgolly.reactPhotoswipe.mod.PhotoSwipe, /* e */ MouseEvent, /* isDown */ Boolean, /* preventObj */ AnonPrevent) => Callback = null,
    resize: /* instance */ typingsJapgolly.reactPhotoswipe.mod.PhotoSwipe => Callback = null,
    shareLinkClick: (/* instance */ typingsJapgolly.reactPhotoswipe.mod.PhotoSwipe, /* e */ MouseEvent, /* item */ Item) => Callback = null,
    unbindEvents: /* instance */ typingsJapgolly.reactPhotoswipe.mod.PhotoSwipe => Callback = null,
    updateScrollOffset: (/* instance */ typingsJapgolly.reactPhotoswipe.mod.PhotoSwipe, /* _offset */ AnonX) => Callback = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[PhotoSwipeProps, typingsJapgolly.reactPhotoswipe.mod.PhotoSwipe, Unit, PhotoSwipeProps] = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
  
      if (afterChange != null) __obj.updateDynamic("afterChange")(js.Any.fromFunction1((t0: /* instance */ typingsJapgolly.reactPhotoswipe.mod.PhotoSwipe) => afterChange(t0).runNow()))
    if (beforeChange != null) __obj.updateDynamic("beforeChange")(js.Any.fromFunction1((t0: /* instance */ typingsJapgolly.reactPhotoswipe.mod.PhotoSwipe) => beforeChange(t0).runNow()))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction1((t0: /* instance */ typingsJapgolly.reactPhotoswipe.mod.PhotoSwipe) => close(t0).runNow()))
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1((t0: /* instance */ typingsJapgolly.reactPhotoswipe.mod.PhotoSwipe) => destroy(t0).runNow()))
    if (gettingData != null) __obj.updateDynamic("gettingData")(js.Any.fromFunction3((t0: /* instance */ typingsJapgolly.reactPhotoswipe.mod.PhotoSwipe, t1: /* index */ scala.Double, t2: /* item */ typingsJapgolly.photoswipe.mod.Item) => gettingData(t0, t1, t2).runNow()))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (imageLoadComplete != null) __obj.updateDynamic("imageLoadComplete")(js.Any.fromFunction3((t0: /* instance */ typingsJapgolly.reactPhotoswipe.mod.PhotoSwipe, t1: /* index */ scala.Double, t2: /* item */ typingsJapgolly.photoswipe.mod.Item) => imageLoadComplete(t0, t1, t2).runNow()))
    if (initialZoomIn != null) __obj.updateDynamic("initialZoomIn")(js.Any.fromFunction1((t0: /* instance */ typingsJapgolly.reactPhotoswipe.mod.PhotoSwipe) => initialZoomIn(t0).runNow()))
    if (initialZoomInEnd != null) __obj.updateDynamic("initialZoomInEnd")(js.Any.fromFunction1((t0: /* instance */ typingsJapgolly.reactPhotoswipe.mod.PhotoSwipe) => initialZoomInEnd(t0).runNow()))
    if (initialZoomOut != null) __obj.updateDynamic("initialZoomOut")(js.Any.fromFunction1((t0: /* instance */ typingsJapgolly.reactPhotoswipe.mod.PhotoSwipe) => initialZoomOut(t0).runNow()))
    if (initialZoomOutEnd != null) __obj.updateDynamic("initialZoomOutEnd")(js.Any.fromFunction1((t0: /* instance */ typingsJapgolly.reactPhotoswipe.mod.PhotoSwipe) => initialZoomOutEnd(t0).runNow()))
    if (mouseUsed != null) __obj.updateDynamic("mouseUsed")(js.Any.fromFunction1((t0: /* instance */ typingsJapgolly.reactPhotoswipe.mod.PhotoSwipe) => mouseUsed(t0).runNow()))
    onClose.foreach(p => __obj.updateDynamic("onClose")(p.toJsFn))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (parseVerticalMargin != null) __obj.updateDynamic("parseVerticalMargin")(js.Any.fromFunction2((t0: /* instance */ typingsJapgolly.reactPhotoswipe.mod.PhotoSwipe, t1: /* item */ typingsJapgolly.photoswipe.mod.Item) => parseVerticalMargin(t0, t1).runNow()))
    if (preventDragEvent != null) __obj.updateDynamic("preventDragEvent")(js.Any.fromFunction4((t0: /* instance */ typingsJapgolly.reactPhotoswipe.mod.PhotoSwipe, t1: /* e */ org.scalajs.dom.raw.MouseEvent, t2: /* isDown */ scala.Boolean, t3: /* preventObj */ typingsJapgolly.reactPhotoswipe.AnonPrevent) => preventDragEvent(t0, t1, t2, t3).runNow()))
    if (resize != null) __obj.updateDynamic("resize")(js.Any.fromFunction1((t0: /* instance */ typingsJapgolly.reactPhotoswipe.mod.PhotoSwipe) => resize(t0).runNow()))
    if (shareLinkClick != null) __obj.updateDynamic("shareLinkClick")(js.Any.fromFunction3((t0: /* instance */ typingsJapgolly.reactPhotoswipe.mod.PhotoSwipe, t1: /* e */ org.scalajs.dom.raw.MouseEvent, t2: /* item */ typingsJapgolly.photoswipe.mod.Item) => shareLinkClick(t0, t1, t2).runNow()))
    if (unbindEvents != null) __obj.updateDynamic("unbindEvents")(js.Any.fromFunction1((t0: /* instance */ typingsJapgolly.reactPhotoswipe.mod.PhotoSwipe) => unbindEvents(t0).runNow()))
    if (updateScrollOffset != null) __obj.updateDynamic("updateScrollOffset")(js.Any.fromFunction2((t0: /* instance */ typingsJapgolly.reactPhotoswipe.mod.PhotoSwipe, t1: /* _offset */ typingsJapgolly.reactPhotoswipe.AnonX) => updateScrollOffset(t0, t1).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactPhotoswipe.mod.PhotoSwipeProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactPhotoswipe.mod.PhotoSwipe](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactPhotoswipe.mod.PhotoSwipeProps])(children: _*)
  }
  @JSImport("react-photoswipe", "PhotoSwipe")
  @js.native
  object componentImport extends js.Object
  
}

