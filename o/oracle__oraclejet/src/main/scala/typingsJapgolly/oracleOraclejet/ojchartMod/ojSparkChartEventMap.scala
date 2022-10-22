package typingsJapgolly.oracleOraclejet.ojchartMod

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

trait ojSparkChartEventMap[K, D]
  extends StObject
     with dvtBaseComponentEventMap[ojSparkChartSettableProperties[K, D]] {
  
  var animationDurationChanged: CustomEvent
  
  var animationOnDataChangeChanged: CustomEvent
  
  var animationOnDisplayChanged: CustomEvent
  
  var areaColorChanged: CustomEvent
  
  var areaSvgClassNameChanged: CustomEvent
  
  var areaSvgStyleChanged: CustomEvent
  
  var asChanged: CustomEvent
  
  var barGapRatioChanged: CustomEvent
  
  var baselineScalingChanged: CustomEvent
  
  var colorChanged: CustomEvent
  
  var dataChanged: CustomEvent
  
  var firstColorChanged: CustomEvent
  
  var highColorChanged: CustomEvent
  
  var lastColorChanged: CustomEvent
  
  var lineStyleChanged: CustomEvent
  
  var lineTypeChanged: CustomEvent
  
  var lineWidthChanged: CustomEvent
  
  var lowColorChanged: CustomEvent
  
  var markerShapeChanged: CustomEvent
  
  var markerSizeChanged: CustomEvent
  
  var referenceObjectsChanged: CustomEvent
  
  var svgClassNameChanged: CustomEvent
  
  var svgStyleChanged: CustomEvent
  
  var tooltipChanged: CustomEvent
  
  var typeChanged: CustomEvent
  
  var visualEffectsChanged: CustomEvent
}
object ojSparkChartEventMap {
  
  inline def apply[K, D](
    abort: UIEvent,
    animationDurationChanged: CustomEvent,
    animationOnDataChangeChanged: CustomEvent,
    animationOnDisplayChanged: CustomEvent,
    animationcancel: AnimationEvent,
    animationend: AnimationEvent,
    animationiteration: AnimationEvent,
    animationstart: AnimationEvent,
    areaColorChanged: CustomEvent,
    areaSvgClassNameChanged: CustomEvent,
    areaSvgStyleChanged: CustomEvent,
    asChanged: CustomEvent,
    auxclick: MouseEvent,
    barGapRatioChanged: CustomEvent,
    baselineScalingChanged: CustomEvent,
    beforeinput: InputEvent,
    blur: FocusEvent,
    canplay: Event,
    canplaythrough: Event,
    change: Event,
    click: MouseEvent,
    close: Event,
    colorChanged: CustomEvent,
    compositionend: CompositionEvent,
    compositionstart: CompositionEvent,
    compositionupdate: CompositionEvent,
    contextmenu: MouseEvent,
    copy: ClipboardEvent,
    cuechange: Event,
    cut: ClipboardEvent,
    dataChanged: CustomEvent,
    dblclick: MouseEvent,
    drag: DragEvent,
    dragend: DragEvent,
    dragenter: DragEvent,
    dragleave: DragEvent,
    dragover: DragEvent,
    dragstart: DragEvent,
    drop: DragEvent,
    durationchange: Event,
    emptied: Event,
    ended: Event,
    error: ErrorEvent,
    firstColorChanged: CustomEvent,
    focus: FocusEvent,
    focusin: FocusEvent,
    focusout: FocusEvent,
    formdata: FormDataEvent,
    fullscreenchange: Event,
    fullscreenerror: Event,
    gotpointercapture: PointerEvent,
    highColorChanged: CustomEvent,
    input: Event,
    invalid: Event,
    keydown: KeyboardEvent,
    keypress: KeyboardEvent,
    keyup: KeyboardEvent,
    lastColorChanged: CustomEvent,
    lineStyleChanged: CustomEvent,
    lineTypeChanged: CustomEvent,
    lineWidthChanged: CustomEvent,
    load: Event,
    loadeddata: Event,
    loadedmetadata: Event,
    loadstart: Event,
    lostpointercapture: PointerEvent,
    lowColorChanged: CustomEvent,
    markerShapeChanged: CustomEvent,
    markerSizeChanged: CustomEvent,
    mousedown: MouseEvent,
    mouseenter: MouseEvent,
    mouseleave: MouseEvent,
    mousemove: MouseEvent,
    mouseout: MouseEvent,
    mouseover: MouseEvent,
    mouseup: MouseEvent,
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
    scroll: Event,
    securitypolicyviolation: SecurityPolicyViolationEvent,
    seeked: Event,
    seeking: Event,
    select: Event,
    selectionchange: Event,
    selectstart: Event,
    slotchange: Event,
    stalled: Event,
    submit: SubmitEvent,
    suspend: Event,
    svgClassNameChanged: CustomEvent,
    svgStyleChanged: CustomEvent,
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
    typeChanged: CustomEvent,
    visualEffectsChanged: CustomEvent,
    volumechange: Event,
    waiting: Event,
    webkitanimationend: Event,
    webkitanimationiteration: Event,
    webkitanimationstart: Event,
    webkittransitionend: Event,
    wheel: WheelEvent
  ): ojSparkChartEventMap[K, D] = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationDurationChanged = animationDurationChanged.asInstanceOf[js.Any], animationOnDataChangeChanged = animationOnDataChangeChanged.asInstanceOf[js.Any], animationOnDisplayChanged = animationOnDisplayChanged.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], areaColorChanged = areaColorChanged.asInstanceOf[js.Any], areaSvgClassNameChanged = areaSvgClassNameChanged.asInstanceOf[js.Any], areaSvgStyleChanged = areaSvgStyleChanged.asInstanceOf[js.Any], asChanged = asChanged.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], barGapRatioChanged = barGapRatioChanged.asInstanceOf[js.Any], baselineScalingChanged = baselineScalingChanged.asInstanceOf[js.Any], beforeinput = beforeinput.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], colorChanged = colorChanged.asInstanceOf[js.Any], compositionend = compositionend.asInstanceOf[js.Any], compositionstart = compositionstart.asInstanceOf[js.Any], compositionupdate = compositionupdate.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dataChanged = dataChanged.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], firstColorChanged = firstColorChanged.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], formdata = formdata.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], highColorChanged = highColorChanged.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], lastColorChanged = lastColorChanged.asInstanceOf[js.Any], lineStyleChanged = lineStyleChanged.asInstanceOf[js.Any], lineTypeChanged = lineTypeChanged.asInstanceOf[js.Any], lineWidthChanged = lineWidthChanged.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], lowColorChanged = lowColorChanged.asInstanceOf[js.Any], markerShapeChanged = markerShapeChanged.asInstanceOf[js.Any], markerSizeChanged = markerSizeChanged.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], referenceObjectsChanged = referenceObjectsChanged.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], slotchange = slotchange.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], svgClassNameChanged = svgClassNameChanged.asInstanceOf[js.Any], svgStyleChanged = svgStyleChanged.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], tooltipChanged = tooltipChanged.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], trackResizeChanged = trackResizeChanged.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], typeChanged = typeChanged.asInstanceOf[js.Any], visualEffectsChanged = visualEffectsChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], webkitanimationend = webkitanimationend.asInstanceOf[js.Any], webkitanimationiteration = webkitanimationiteration.asInstanceOf[js.Any], webkitanimationstart = webkitanimationstart.asInstanceOf[js.Any], webkittransitionend = webkittransitionend.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojSparkChartEventMap[K, D]]
  }
  
  extension [Self <: ojSparkChartEventMap[?, ?], K, D](x: Self & (ojSparkChartEventMap[K, D])) {
    
    inline def setAnimationDurationChanged(value: CustomEvent): Self = StObject.set(x, "animationDurationChanged", value.asInstanceOf[js.Any])
    
    inline def setAnimationOnDataChangeChanged(value: CustomEvent): Self = StObject.set(x, "animationOnDataChangeChanged", value.asInstanceOf[js.Any])
    
    inline def setAnimationOnDisplayChanged(value: CustomEvent): Self = StObject.set(x, "animationOnDisplayChanged", value.asInstanceOf[js.Any])
    
    inline def setAreaColorChanged(value: CustomEvent): Self = StObject.set(x, "areaColorChanged", value.asInstanceOf[js.Any])
    
    inline def setAreaSvgClassNameChanged(value: CustomEvent): Self = StObject.set(x, "areaSvgClassNameChanged", value.asInstanceOf[js.Any])
    
    inline def setAreaSvgStyleChanged(value: CustomEvent): Self = StObject.set(x, "areaSvgStyleChanged", value.asInstanceOf[js.Any])
    
    inline def setAsChanged(value: CustomEvent): Self = StObject.set(x, "asChanged", value.asInstanceOf[js.Any])
    
    inline def setBarGapRatioChanged(value: CustomEvent): Self = StObject.set(x, "barGapRatioChanged", value.asInstanceOf[js.Any])
    
    inline def setBaselineScalingChanged(value: CustomEvent): Self = StObject.set(x, "baselineScalingChanged", value.asInstanceOf[js.Any])
    
    inline def setColorChanged(value: CustomEvent): Self = StObject.set(x, "colorChanged", value.asInstanceOf[js.Any])
    
    inline def setDataChanged(value: CustomEvent): Self = StObject.set(x, "dataChanged", value.asInstanceOf[js.Any])
    
    inline def setFirstColorChanged(value: CustomEvent): Self = StObject.set(x, "firstColorChanged", value.asInstanceOf[js.Any])
    
    inline def setHighColorChanged(value: CustomEvent): Self = StObject.set(x, "highColorChanged", value.asInstanceOf[js.Any])
    
    inline def setLastColorChanged(value: CustomEvent): Self = StObject.set(x, "lastColorChanged", value.asInstanceOf[js.Any])
    
    inline def setLineStyleChanged(value: CustomEvent): Self = StObject.set(x, "lineStyleChanged", value.asInstanceOf[js.Any])
    
    inline def setLineTypeChanged(value: CustomEvent): Self = StObject.set(x, "lineTypeChanged", value.asInstanceOf[js.Any])
    
    inline def setLineWidthChanged(value: CustomEvent): Self = StObject.set(x, "lineWidthChanged", value.asInstanceOf[js.Any])
    
    inline def setLowColorChanged(value: CustomEvent): Self = StObject.set(x, "lowColorChanged", value.asInstanceOf[js.Any])
    
    inline def setMarkerShapeChanged(value: CustomEvent): Self = StObject.set(x, "markerShapeChanged", value.asInstanceOf[js.Any])
    
    inline def setMarkerSizeChanged(value: CustomEvent): Self = StObject.set(x, "markerSizeChanged", value.asInstanceOf[js.Any])
    
    inline def setReferenceObjectsChanged(value: CustomEvent): Self = StObject.set(x, "referenceObjectsChanged", value.asInstanceOf[js.Any])
    
    inline def setSvgClassNameChanged(value: CustomEvent): Self = StObject.set(x, "svgClassNameChanged", value.asInstanceOf[js.Any])
    
    inline def setSvgStyleChanged(value: CustomEvent): Self = StObject.set(x, "svgStyleChanged", value.asInstanceOf[js.Any])
    
    inline def setTooltipChanged(value: CustomEvent): Self = StObject.set(x, "tooltipChanged", value.asInstanceOf[js.Any])
    
    inline def setTypeChanged(value: CustomEvent): Self = StObject.set(x, "typeChanged", value.asInstanceOf[js.Any])
    
    inline def setVisualEffectsChanged(value: CustomEvent): Self = StObject.set(x, "visualEffectsChanged", value.asInstanceOf[js.Any])
  }
}
