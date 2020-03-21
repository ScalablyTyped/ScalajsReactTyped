package typingsJapgolly.reactPhotoswipe.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.MouseEvent
import typingsJapgolly.photoswipe.mod.Item
import typingsJapgolly.photoswipe.mod.Options
import typingsJapgolly.reactPhotoswipe.AnonPrevent
import typingsJapgolly.reactPhotoswipe.AnonX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhotoSwipeProps extends js.Object {
  /**
    * Photoswipe event listener
    * After slides change
    * (after content changed)
    * {@link https://photoswipe.com/documentation/api.html}
    */
  var afterChange: js.UndefOr[js.Function1[/* instance */ PhotoSwipe, Unit]] = js.undefined
  /**
    * Photoswipe event listener
    * Before slides change
    * (before the content is changed, but after navigation)
    * Update UI here (like "1 of X" indicator)
    * {@link https://photoswipe.com/documentation/api.html}
    */
  var beforeChange: js.UndefOr[js.Function1[/* instance */ PhotoSwipe, Unit]] = js.undefined
  /**
    * class name
    * @default pswp
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Photoswipe event listener
    * Gallery starts closing
    * {@link https://photoswipe.com/documentation/api.html}
    */
  var close: js.UndefOr[js.Function1[/* instance */ PhotoSwipe, Unit]] = js.undefined
  /**
    * Photoswipe event listener
    * After gallery is closed and closing animation finished.
    * Clean up your stuff here.
    * {@link https://photoswipe.com/documentation/api.html}
    */
  var destroy: js.UndefOr[js.Function1[/* instance */ PhotoSwipe, Unit]] = js.undefined
  /**
    * Photoswipe event listener
    * Triggers when PhotoSwipe "reads" slide object data,
    * which happens before content is set, or before lazy-loading is initiated.
    * Use it to dynamically change properties
    * {@link https://photoswipe.com/documentation/api.html}
    */
  var gettingData: js.UndefOr[
    js.Function3[/* instance */ PhotoSwipe, /* index */ Double, /* item */ Item, Unit]
  ] = js.undefined
  /**
    * id
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Photoswipe event listener
    * Image loaded
    * {@link https://photoswipe.com/documentation/api.html}
    */
  var imageLoadComplete: js.UndefOr[
    js.Function3[/* instance */ PhotoSwipe, /* index */ Double, /* item */ Item, Unit]
  ] = js.undefined
  /**
    * Photoswipe event listener
    * Opening zoom in animation starting
    * {@link https://photoswipe.com/documentation/api.html}
    */
  var initialZoomIn: js.UndefOr[js.Function1[/* instance */ PhotoSwipe, Unit]] = js.undefined
  /**
    * Photoswipe event listener
    * Opening zoom in animation finished
    * {@link https://photoswipe.com/documentation/api.html}
    */
  var initialZoomInEnd: js.UndefOr[js.Function1[/* instance */ PhotoSwipe, Unit]] = js.undefined
  /**
    * Photoswipe event listener
    * Closing zoom out animation started
    * {@link https://photoswipe.com/documentation/api.html}
    */
  var initialZoomOut: js.UndefOr[js.Function1[/* instance */ PhotoSwipe, Unit]] = js.undefined
  /**
    * Photoswipe event listener
    * Closing zoom out animation finished
    * {@link https://photoswipe.com/documentation/api.html}
    */
  var initialZoomOutEnd: js.UndefOr[js.Function1[/* instance */ PhotoSwipe, Unit]] = js.undefined
  /**
    * is open
    */
  var isOpen: Boolean
  /**
    * photoswipe item
    * {@link http://photoswipe.com/documentation/getting-started.html}
    */
  var items: js.Array[Item]
  /**
    * Photoswipe event listener
    * Mouse was used (triggers only once)
    * {@link https://photoswipe.com/documentation/api.html}
    */
  var mouseUsed: js.UndefOr[js.Function1[/* instance */ PhotoSwipe, Unit]] = js.undefined
  /**
    * Callback after PhotoSwipe close
    */
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * photoswipe options
    * {@link http://photoswipe.com/documentation/options.html}
    * @default {}
    */
  var options: js.UndefOr[Options] = js.undefined
  /**
    * Photoswipe event listener
    * Allows overriding vertical margin for individual items
    * {@link https://photoswipe.com/documentation/api.html}
    */
  var parseVerticalMargin: js.UndefOr[js.Function2[/* instance */ PhotoSwipe, /* item */ Item, Unit]] = js.undefined
  /**
    * Photoswipe event listener
    * Allow to call preventDefault on down and up events
    * {@link https://photoswipe.com/documentation/api.html}
    */
  var preventDragEvent: js.UndefOr[
    js.Function4[
      /* instance */ PhotoSwipe, 
      /* e */ MouseEvent, 
      /* isDown */ Boolean, 
      /* preventObj */ AnonPrevent, 
      Unit
    ]
  ] = js.undefined
  /**
    * Photoswipe event listener
    * Viewport size changed
    * {@link https://photoswipe.com/documentation/api.html}
    */
  var resize: js.UndefOr[js.Function1[/* instance */ PhotoSwipe, Unit]] = js.undefined
  /**
    * Photoswipe event listener
    * Share link clicked
    * {@link https://photoswipe.com/documentation/api.html}
    */
  var shareLinkClick: js.UndefOr[
    js.Function3[/* instance */ PhotoSwipe, /* e */ MouseEvent, /* item */ Item, Unit]
  ] = js.undefined
  /**
    * Photoswipe event listener
    * Gallery unbinds events
    * (triggers before closing animation)
    * {@link https://photoswipe.com/documentation/api.html}
    */
  var unbindEvents: js.UndefOr[js.Function1[/* instance */ PhotoSwipe, Unit]] = js.undefined
  /**
    * Photoswipe event listener
    * Called when the page scrolls.
    * The callback is passed an offset with properties {x: number, y: number}.
    *
    * PhotoSwipe uses the offset to determine the top-left of the template,
    * which by default is the top-left of the viewport. When using modal: false,
    * you should listen to this event (before calling .init()) and modify the offset
    * with the template's getBoundingClientRect().
    *
    * Look at the "Implementing inline gallery display" FAQ section for more info.
    * {@link https://photoswipe.com/documentation/api.html}
    */
  var updateScrollOffset: js.UndefOr[js.Function2[/* instance */ PhotoSwipe, /* _offset */ AnonX, Unit]] = js.undefined
}

object PhotoSwipeProps {
  @scala.inline
  def apply(
    isOpen: Boolean,
    items: js.Array[Item],
    afterChange: /* instance */ PhotoSwipe => Callback = null,
    beforeChange: /* instance */ PhotoSwipe => Callback = null,
    className: String = null,
    close: /* instance */ PhotoSwipe => Callback = null,
    destroy: /* instance */ PhotoSwipe => Callback = null,
    gettingData: (/* instance */ PhotoSwipe, /* index */ Double, /* item */ Item) => Callback = null,
    id: String = null,
    imageLoadComplete: (/* instance */ PhotoSwipe, /* index */ Double, /* item */ Item) => Callback = null,
    initialZoomIn: /* instance */ PhotoSwipe => Callback = null,
    initialZoomInEnd: /* instance */ PhotoSwipe => Callback = null,
    initialZoomOut: /* instance */ PhotoSwipe => Callback = null,
    initialZoomOutEnd: /* instance */ PhotoSwipe => Callback = null,
    mouseUsed: /* instance */ PhotoSwipe => Callback = null,
    onClose: js.UndefOr[Callback] = js.undefined,
    options: Options = null,
    parseVerticalMargin: (/* instance */ PhotoSwipe, /* item */ Item) => Callback = null,
    preventDragEvent: (/* instance */ PhotoSwipe, /* e */ MouseEvent, /* isDown */ Boolean, /* preventObj */ AnonPrevent) => Callback = null,
    resize: /* instance */ PhotoSwipe => Callback = null,
    shareLinkClick: (/* instance */ PhotoSwipe, /* e */ MouseEvent, /* item */ Item) => Callback = null,
    unbindEvents: /* instance */ PhotoSwipe => Callback = null,
    updateScrollOffset: (/* instance */ PhotoSwipe, /* _offset */ AnonX) => Callback = null
  ): PhotoSwipeProps = {
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
    __obj.asInstanceOf[PhotoSwipeProps]
  }
}

