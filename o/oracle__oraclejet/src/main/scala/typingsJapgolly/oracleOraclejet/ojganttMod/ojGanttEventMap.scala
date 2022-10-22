package typingsJapgolly.oracleOraclejet.ojganttMod

import org.scalajs.dom.AnimationEvent
import org.scalajs.dom.ClipboardEvent
import org.scalajs.dom.CompositionEvent
import org.scalajs.dom.CustomEvent
import org.scalajs.dom.DragEvent
import org.scalajs.dom.ErrorEvent
import org.scalajs.dom.Event
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.PointerEvent
import org.scalajs.dom.ProgressEvent
import org.scalajs.dom.TouchEvent
import org.scalajs.dom.TransitionEvent
import org.scalajs.dom.UIEvent
import org.scalajs.dom.WheelEvent
import typingsJapgolly.oracleOraclejet.ojdvtBaseMod.dvtBaseComponentEventMap
import typingsJapgolly.std.FormDataEvent
import typingsJapgolly.std.InputEvent
import typingsJapgolly.std.SecurityPolicyViolationEvent
import typingsJapgolly.std.SubmitEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ojGanttEventMap[K1, K2, D1, D2]
  extends StObject
     with dvtBaseComponentEventMap[ojGanttSettableProperties[K1, K2, D1, D2]] {
  
  var animationOnDataChangeChanged: CustomEvent
  
  var animationOnDisplayChanged: CustomEvent
  
  var asChanged: CustomEvent
  
  var axisPositionChanged: CustomEvent
  
  var dependencyDataChanged: CustomEvent
  
  var dndChanged: CustomEvent
  
  var endChanged: CustomEvent
  
  var gridlinesChanged: CustomEvent
  
  var majorAxisChanged: CustomEvent
  
  var minorAxisChanged: CustomEvent
  
  var ojMove: CustomEvent
  
  var ojViewportChange: CustomEvent
  
  var referenceObjectsChanged: CustomEvent
  
  var rowAxisChanged: CustomEvent
  
  var rowDefaultsChanged: CustomEvent
  
  var scrollPositionChanged: CustomEvent
  
  var selectionChanged: CustomEvent
  
  var selectionModeChanged: CustomEvent
  
  var startChanged: CustomEvent
  
  var taskDataChanged: CustomEvent
  
  var taskDefaultsChanged: CustomEvent
  
  var tooltipChanged: CustomEvent
  
  var valueFormatsChanged: CustomEvent
  
  var viewportEndChanged: CustomEvent
  
  var viewportStartChanged: CustomEvent
}
object ojGanttEventMap {
  
  inline def apply[K1, K2, D1, D2](
    abort: UIEvent,
    animationOnDataChangeChanged: CustomEvent,
    animationOnDisplayChanged: CustomEvent,
    animationcancel: AnimationEvent,
    animationend: AnimationEvent,
    animationiteration: AnimationEvent,
    animationstart: AnimationEvent,
    asChanged: CustomEvent,
    auxclick: MouseEvent,
    axisPositionChanged: CustomEvent,
    beforeinput: InputEvent,
    blur: FocusEvent,
    canplay: Event,
    canplaythrough: Event,
    change: Event,
    click: MouseEvent,
    close: Event,
    compositionend: CompositionEvent,
    compositionstart: CompositionEvent,
    compositionupdate: CompositionEvent,
    contextmenu: MouseEvent,
    copy: ClipboardEvent,
    cuechange: Event,
    cut: ClipboardEvent,
    dblclick: MouseEvent,
    dependencyDataChanged: CustomEvent,
    dndChanged: CustomEvent,
    drag: DragEvent,
    dragend: DragEvent,
    dragenter: DragEvent,
    dragleave: DragEvent,
    dragover: DragEvent,
    dragstart: DragEvent,
    drop: DragEvent,
    durationchange: Event,
    emptied: Event,
    endChanged: CustomEvent,
    ended: Event,
    error: ErrorEvent,
    focus: FocusEvent,
    focusin: FocusEvent,
    focusout: FocusEvent,
    formdata: FormDataEvent,
    fullscreenchange: Event,
    fullscreenerror: Event,
    gotpointercapture: PointerEvent,
    gridlinesChanged: CustomEvent,
    input: Event,
    invalid: Event,
    keydown: KeyboardEvent,
    keypress: KeyboardEvent,
    keyup: KeyboardEvent,
    load: Event,
    loadeddata: Event,
    loadedmetadata: Event,
    loadstart: Event,
    lostpointercapture: PointerEvent,
    majorAxisChanged: CustomEvent,
    minorAxisChanged: CustomEvent,
    mousedown: MouseEvent,
    mouseenter: MouseEvent,
    mouseleave: MouseEvent,
    mousemove: MouseEvent,
    mouseout: MouseEvent,
    mouseover: MouseEvent,
    mouseup: MouseEvent,
    ojMove: CustomEvent,
    ojViewportChange: CustomEvent,
    paste: ClipboardEvent,
    pause: Event,
    play: Event,
    playing: Event,
    pointercancel: PointerEvent,
    pointerdown: PointerEvent,
    pointerenter: PointerEvent,
    pointerleave: PointerEvent,
    pointermove: PointerEvent,
    pointerout: PointerEvent,
    pointerover: PointerEvent,
    pointerup: PointerEvent,
    progress: ProgressEvent,
    ratechange: Event,
    referenceObjectsChanged: CustomEvent,
    reset: Event,
    resize: UIEvent,
    rowAxisChanged: CustomEvent,
    rowDefaultsChanged: CustomEvent,
    scroll: Event,
    scrollPositionChanged: CustomEvent,
    securitypolicyviolation: SecurityPolicyViolationEvent,
    seeked: Event,
    seeking: Event,
    select: Event,
    selectionChanged: CustomEvent,
    selectionModeChanged: CustomEvent,
    selectionchange: Event,
    selectstart: Event,
    slotchange: Event,
    stalled: Event,
    startChanged: CustomEvent,
    submit: SubmitEvent,
    suspend: Event,
    taskDataChanged: CustomEvent,
    taskDefaultsChanged: CustomEvent,
    timeupdate: Event,
    toggle: Event,
    tooltipChanged: CustomEvent,
    touchcancel: TouchEvent,
    touchend: TouchEvent,
    touchmove: TouchEvent,
    touchstart: TouchEvent,
    trackResizeChanged: CustomEvent,
    transitioncancel: TransitionEvent,
    transitionend: TransitionEvent,
    transitionrun: TransitionEvent,
    transitionstart: TransitionEvent,
    translationsChanged: CustomEvent,
    valueFormatsChanged: CustomEvent,
    viewportEndChanged: CustomEvent,
    viewportStartChanged: CustomEvent,
    volumechange: Event,
    waiting: Event,
    webkitanimationend: Event,
    webkitanimationiteration: Event,
    webkitanimationstart: Event,
    webkittransitionend: Event,
    wheel: WheelEvent
  ): ojGanttEventMap[K1, K2, D1, D2] = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationOnDataChangeChanged = animationOnDataChangeChanged.asInstanceOf[js.Any], animationOnDisplayChanged = animationOnDisplayChanged.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], asChanged = asChanged.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], axisPositionChanged = axisPositionChanged.asInstanceOf[js.Any], beforeinput = beforeinput.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], compositionend = compositionend.asInstanceOf[js.Any], compositionstart = compositionstart.asInstanceOf[js.Any], compositionupdate = compositionupdate.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], dependencyDataChanged = dependencyDataChanged.asInstanceOf[js.Any], dndChanged = dndChanged.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], endChanged = endChanged.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], formdata = formdata.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], gridlinesChanged = gridlinesChanged.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], majorAxisChanged = majorAxisChanged.asInstanceOf[js.Any], minorAxisChanged = minorAxisChanged.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], ojMove = ojMove.asInstanceOf[js.Any], ojViewportChange = ojViewportChange.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], referenceObjectsChanged = referenceObjectsChanged.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], rowAxisChanged = rowAxisChanged.asInstanceOf[js.Any], rowDefaultsChanged = rowDefaultsChanged.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], scrollPositionChanged = scrollPositionChanged.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionChanged = selectionChanged.asInstanceOf[js.Any], selectionModeChanged = selectionModeChanged.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], slotchange = slotchange.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], startChanged = startChanged.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], taskDataChanged = taskDataChanged.asInstanceOf[js.Any], taskDefaultsChanged = taskDefaultsChanged.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], tooltipChanged = tooltipChanged.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], trackResizeChanged = trackResizeChanged.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], valueFormatsChanged = valueFormatsChanged.asInstanceOf[js.Any], viewportEndChanged = viewportEndChanged.asInstanceOf[js.Any], viewportStartChanged = viewportStartChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], webkitanimationend = webkitanimationend.asInstanceOf[js.Any], webkitanimationiteration = webkitanimationiteration.asInstanceOf[js.Any], webkitanimationstart = webkitanimationstart.asInstanceOf[js.Any], webkittransitionend = webkittransitionend.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojGanttEventMap[K1, K2, D1, D2]]
  }
  
  extension [Self <: ojGanttEventMap[?, ?, ?, ?], K1, K2, D1, D2](x: Self & (ojGanttEventMap[K1, K2, D1, D2])) {
    
    inline def setAnimationOnDataChangeChanged(value: CustomEvent): Self = StObject.set(x, "animationOnDataChangeChanged", value.asInstanceOf[js.Any])
    
    inline def setAnimationOnDisplayChanged(value: CustomEvent): Self = StObject.set(x, "animationOnDisplayChanged", value.asInstanceOf[js.Any])
    
    inline def setAsChanged(value: CustomEvent): Self = StObject.set(x, "asChanged", value.asInstanceOf[js.Any])
    
    inline def setAxisPositionChanged(value: CustomEvent): Self = StObject.set(x, "axisPositionChanged", value.asInstanceOf[js.Any])
    
    inline def setDependencyDataChanged(value: CustomEvent): Self = StObject.set(x, "dependencyDataChanged", value.asInstanceOf[js.Any])
    
    inline def setDndChanged(value: CustomEvent): Self = StObject.set(x, "dndChanged", value.asInstanceOf[js.Any])
    
    inline def setEndChanged(value: CustomEvent): Self = StObject.set(x, "endChanged", value.asInstanceOf[js.Any])
    
    inline def setGridlinesChanged(value: CustomEvent): Self = StObject.set(x, "gridlinesChanged", value.asInstanceOf[js.Any])
    
    inline def setMajorAxisChanged(value: CustomEvent): Self = StObject.set(x, "majorAxisChanged", value.asInstanceOf[js.Any])
    
    inline def setMinorAxisChanged(value: CustomEvent): Self = StObject.set(x, "minorAxisChanged", value.asInstanceOf[js.Any])
    
    inline def setOjMove(value: CustomEvent): Self = StObject.set(x, "ojMove", value.asInstanceOf[js.Any])
    
    inline def setOjViewportChange(value: CustomEvent): Self = StObject.set(x, "ojViewportChange", value.asInstanceOf[js.Any])
    
    inline def setReferenceObjectsChanged(value: CustomEvent): Self = StObject.set(x, "referenceObjectsChanged", value.asInstanceOf[js.Any])
    
    inline def setRowAxisChanged(value: CustomEvent): Self = StObject.set(x, "rowAxisChanged", value.asInstanceOf[js.Any])
    
    inline def setRowDefaultsChanged(value: CustomEvent): Self = StObject.set(x, "rowDefaultsChanged", value.asInstanceOf[js.Any])
    
    inline def setScrollPositionChanged(value: CustomEvent): Self = StObject.set(x, "scrollPositionChanged", value.asInstanceOf[js.Any])
    
    inline def setSelectionChanged(value: CustomEvent): Self = StObject.set(x, "selectionChanged", value.asInstanceOf[js.Any])
    
    inline def setSelectionModeChanged(value: CustomEvent): Self = StObject.set(x, "selectionModeChanged", value.asInstanceOf[js.Any])
    
    inline def setStartChanged(value: CustomEvent): Self = StObject.set(x, "startChanged", value.asInstanceOf[js.Any])
    
    inline def setTaskDataChanged(value: CustomEvent): Self = StObject.set(x, "taskDataChanged", value.asInstanceOf[js.Any])
    
    inline def setTaskDefaultsChanged(value: CustomEvent): Self = StObject.set(x, "taskDefaultsChanged", value.asInstanceOf[js.Any])
    
    inline def setTooltipChanged(value: CustomEvent): Self = StObject.set(x, "tooltipChanged", value.asInstanceOf[js.Any])
    
    inline def setValueFormatsChanged(value: CustomEvent): Self = StObject.set(x, "valueFormatsChanged", value.asInstanceOf[js.Any])
    
    inline def setViewportEndChanged(value: CustomEvent): Self = StObject.set(x, "viewportEndChanged", value.asInstanceOf[js.Any])
    
    inline def setViewportStartChanged(value: CustomEvent): Self = StObject.set(x, "viewportStartChanged", value.asInstanceOf[js.Any])
  }
}
