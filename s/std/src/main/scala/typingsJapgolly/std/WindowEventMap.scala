package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowEventMap
  extends GlobalEventHandlersEventMap
     with WindowEventHandlersEventMap {
  var MSGestureChange: Event_
  var MSGestureDoubleTap: Event_
  var MSGestureEnd: Event_
  var MSGestureHold: Event_
  var MSGestureStart: Event_
  var MSGestureTap: Event_
  var MSInertiaStart: Event_
  var MSPointerCancel: Event_
  var MSPointerDown: Event_
  var MSPointerEnter: Event_
  var MSPointerLeave: Event_
  var MSPointerMove: Event_
  var MSPointerOut: Event_
  var MSPointerOver: Event_
  var MSPointerUp: Event_
  var compassneedscalibration: Event_
  var devicelight: DeviceLightEvent
  var devicemotion: org.scalajs.dom.experimental.deviceorientation.DeviceMotionEvent
  var deviceorientation: org.scalajs.dom.experimental.deviceorientation.DeviceOrientationEvent
  var deviceorientationabsolute: org.scalajs.dom.experimental.deviceorientation.DeviceOrientationEvent
  var mousewheel: Event_
  var orientationchange: Event_
  @JSName("progress")
  var progress_WindowEventMap: org.scalajs.dom.raw.ProgressEvent
  var readystatechange: org.scalajs.dom.raw.ProgressEvent
  var vrdisplayactivate: Event_
  var vrdisplayblur: Event_
  var vrdisplayconnect: Event_
  var vrdisplaydeactivate: Event_
  var vrdisplaydisconnect: Event_
  var vrdisplayfocus: Event_
  var vrdisplaypointerrestricted: Event_
  var vrdisplaypointerunrestricted: Event_
  var vrdisplaypresentchange: Event_
}

object WindowEventMap {
  @scala.inline
  def apply(
    MSGestureChange: Event_,
    MSGestureDoubleTap: Event_,
    MSGestureEnd: Event_,
    MSGestureHold: Event_,
    MSGestureStart: Event_,
    MSGestureTap: Event_,
    MSInertiaStart: Event_,
    MSPointerCancel: Event_,
    MSPointerDown: Event_,
    MSPointerEnter: Event_,
    MSPointerLeave: Event_,
    MSPointerMove: Event_,
    MSPointerOut: Event_,
    MSPointerOver: Event_,
    MSPointerUp: Event_,
    abort: org.scalajs.dom.raw.UIEvent,
    afterprint: Event_,
    animationcancel: org.scalajs.dom.raw.AnimationEvent,
    animationend: org.scalajs.dom.raw.AnimationEvent,
    animationiteration: org.scalajs.dom.raw.AnimationEvent,
    animationstart: org.scalajs.dom.raw.AnimationEvent,
    auxclick: org.scalajs.dom.raw.MouseEvent,
    beforeprint: Event_,
    beforeunload: org.scalajs.dom.raw.BeforeUnloadEvent,
    blur: org.scalajs.dom.raw.FocusEvent,
    cancel: Event_,
    canplay: Event_,
    canplaythrough: Event_,
    change: Event_,
    click: org.scalajs.dom.raw.MouseEvent,
    close: Event_,
    compassneedscalibration: Event_,
    contextmenu: org.scalajs.dom.raw.MouseEvent,
    cuechange: Event_,
    dblclick: org.scalajs.dom.raw.MouseEvent,
    devicelight: DeviceLightEvent,
    devicemotion: org.scalajs.dom.experimental.deviceorientation.DeviceMotionEvent,
    deviceorientation: org.scalajs.dom.experimental.deviceorientation.DeviceOrientationEvent,
    deviceorientationabsolute: org.scalajs.dom.experimental.deviceorientation.DeviceOrientationEvent,
    drag: org.scalajs.dom.raw.DragEvent,
    dragend: org.scalajs.dom.raw.DragEvent,
    dragenter: org.scalajs.dom.raw.DragEvent,
    dragexit: Event_,
    dragleave: org.scalajs.dom.raw.DragEvent,
    dragover: org.scalajs.dom.raw.DragEvent,
    dragstart: org.scalajs.dom.raw.DragEvent,
    drop: org.scalajs.dom.raw.DragEvent,
    durationchange: Event_,
    emptied: Event_,
    ended: Event_,
    error: org.scalajs.dom.raw.ErrorEvent,
    focus: org.scalajs.dom.raw.FocusEvent,
    focusin: org.scalajs.dom.raw.FocusEvent,
    focusout: org.scalajs.dom.raw.FocusEvent,
    gotpointercapture: org.scalajs.dom.raw.PointerEvent,
    hashchange: org.scalajs.dom.raw.HashChangeEvent,
    input: Event_,
    invalid: Event_,
    keydown: org.scalajs.dom.raw.KeyboardEvent,
    keypress: org.scalajs.dom.raw.KeyboardEvent,
    keyup: org.scalajs.dom.raw.KeyboardEvent,
    languagechange: Event_,
    load: Event_,
    loadeddata: Event_,
    loadedmetadata: Event_,
    loadstart: Event_,
    lostpointercapture: org.scalajs.dom.raw.PointerEvent,
    message: org.scalajs.dom.raw.MessageEvent,
    messageerror: org.scalajs.dom.raw.MessageEvent,
    mousedown: org.scalajs.dom.raw.MouseEvent,
    mouseenter: org.scalajs.dom.raw.MouseEvent,
    mouseleave: org.scalajs.dom.raw.MouseEvent,
    mousemove: org.scalajs.dom.raw.MouseEvent,
    mouseout: org.scalajs.dom.raw.MouseEvent,
    mouseover: org.scalajs.dom.raw.MouseEvent,
    mouseup: org.scalajs.dom.raw.MouseEvent,
    mousewheel: Event_,
    offline: Event_,
    online: Event_,
    orientationchange: Event_,
    pagehide: PageTransitionEvent,
    pageshow: PageTransitionEvent,
    pause: Event_,
    play: Event_,
    playing: Event_,
    pointercancel: org.scalajs.dom.raw.PointerEvent,
    pointerdown: org.scalajs.dom.raw.PointerEvent,
    pointerenter: org.scalajs.dom.raw.PointerEvent,
    pointerleave: org.scalajs.dom.raw.PointerEvent,
    pointermove: org.scalajs.dom.raw.PointerEvent,
    pointerout: org.scalajs.dom.raw.PointerEvent,
    pointerover: org.scalajs.dom.raw.PointerEvent,
    pointerup: org.scalajs.dom.raw.PointerEvent,
    popstate: org.scalajs.dom.raw.PopStateEvent,
    progress: org.scalajs.dom.raw.ProgressEvent,
    ratechange: Event_,
    readystatechange: org.scalajs.dom.raw.ProgressEvent,
    rejectionhandled: PromiseRejectionEvent,
    reset: Event_,
    resize: org.scalajs.dom.raw.UIEvent,
    scroll: Event_,
    securitypolicyviolation: SecurityPolicyViolationEvent,
    seeked: Event_,
    seeking: Event_,
    select: Event_,
    selectionchange: Event_,
    selectstart: Event_,
    stalled: Event_,
    storage: org.scalajs.dom.raw.StorageEvent,
    submit: Event_,
    suspend: Event_,
    timeupdate: Event_,
    toggle: Event_,
    touchcancel: org.scalajs.dom.raw.TouchEvent,
    touchend: org.scalajs.dom.raw.TouchEvent,
    touchmove: org.scalajs.dom.raw.TouchEvent,
    touchstart: org.scalajs.dom.raw.TouchEvent,
    transitioncancel: org.scalajs.dom.raw.TransitionEvent,
    transitionend: org.scalajs.dom.raw.TransitionEvent,
    transitionrun: org.scalajs.dom.raw.TransitionEvent,
    transitionstart: org.scalajs.dom.raw.TransitionEvent,
    unhandledrejection: PromiseRejectionEvent,
    unload: Event_,
    volumechange: Event_,
    vrdisplayactivate: Event_,
    vrdisplayblur: Event_,
    vrdisplayconnect: Event_,
    vrdisplaydeactivate: Event_,
    vrdisplaydisconnect: Event_,
    vrdisplayfocus: Event_,
    vrdisplaypointerrestricted: Event_,
    vrdisplaypointerunrestricted: Event_,
    vrdisplaypresentchange: Event_,
    waiting: Event_,
    wheel: org.scalajs.dom.raw.WheelEvent
  ): WindowEventMap = {
    val __obj = js.Dynamic.literal(MSGestureChange = MSGestureChange.asInstanceOf[js.Any], MSGestureDoubleTap = MSGestureDoubleTap.asInstanceOf[js.Any], MSGestureEnd = MSGestureEnd.asInstanceOf[js.Any], MSGestureHold = MSGestureHold.asInstanceOf[js.Any], MSGestureStart = MSGestureStart.asInstanceOf[js.Any], MSGestureTap = MSGestureTap.asInstanceOf[js.Any], MSInertiaStart = MSInertiaStart.asInstanceOf[js.Any], MSPointerCancel = MSPointerCancel.asInstanceOf[js.Any], MSPointerDown = MSPointerDown.asInstanceOf[js.Any], MSPointerEnter = MSPointerEnter.asInstanceOf[js.Any], MSPointerLeave = MSPointerLeave.asInstanceOf[js.Any], MSPointerMove = MSPointerMove.asInstanceOf[js.Any], MSPointerOut = MSPointerOut.asInstanceOf[js.Any], MSPointerOver = MSPointerOver.asInstanceOf[js.Any], MSPointerUp = MSPointerUp.asInstanceOf[js.Any], abort = abort.asInstanceOf[js.Any], afterprint = afterprint.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], beforeprint = beforeprint.asInstanceOf[js.Any], beforeunload = beforeunload.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], compassneedscalibration = compassneedscalibration.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], devicelight = devicelight.asInstanceOf[js.Any], devicemotion = devicemotion.asInstanceOf[js.Any], deviceorientation = deviceorientation.asInstanceOf[js.Any], deviceorientationabsolute = deviceorientationabsolute.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragexit = dragexit.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], hashchange = hashchange.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], languagechange = languagechange.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], messageerror = messageerror.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], mousewheel = mousewheel.asInstanceOf[js.Any], offline = offline.asInstanceOf[js.Any], online = online.asInstanceOf[js.Any], orientationchange = orientationchange.asInstanceOf[js.Any], pagehide = pagehide.asInstanceOf[js.Any], pageshow = pageshow.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], popstate = popstate.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], readystatechange = readystatechange.asInstanceOf[js.Any], rejectionhandled = rejectionhandled.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], unhandledrejection = unhandledrejection.asInstanceOf[js.Any], unload = unload.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], vrdisplayactivate = vrdisplayactivate.asInstanceOf[js.Any], vrdisplayblur = vrdisplayblur.asInstanceOf[js.Any], vrdisplayconnect = vrdisplayconnect.asInstanceOf[js.Any], vrdisplaydeactivate = vrdisplaydeactivate.asInstanceOf[js.Any], vrdisplaydisconnect = vrdisplaydisconnect.asInstanceOf[js.Any], vrdisplayfocus = vrdisplayfocus.asInstanceOf[js.Any], vrdisplaypointerrestricted = vrdisplaypointerrestricted.asInstanceOf[js.Any], vrdisplaypointerunrestricted = vrdisplaypointerunrestricted.asInstanceOf[js.Any], vrdisplaypresentchange = vrdisplaypresentchange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WindowEventMap]
  }
}

