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

trait ojChartEventMap[K, D]
  extends StObject
     with dvtBaseComponentEventMap[ojChartSettableProperties[K, D]] {
  
  var animationOnDataChangeChanged: CustomEvent
  
  var animationOnDisplayChanged: CustomEvent
  
  var asChanged: CustomEvent
  
  var coordinateSystemChanged: CustomEvent
  
  var dataChanged: CustomEvent
  
  var dataCursorBehaviorChanged: CustomEvent
  
  var dataCursorChanged: CustomEvent
  
  var dataCursorPositionChanged: CustomEvent
  
  var dataLabelChanged: CustomEvent
  
  var dndChanged: CustomEvent
  
  var dragModeChanged: CustomEvent
  
  var drillingChanged: CustomEvent
  
  var groupComparatorChanged: CustomEvent
  
  var hiddenCategoriesChanged: CustomEvent
  
  var hideAndShowBehaviorChanged: CustomEvent
  
  var highlightMatchChanged: CustomEvent
  
  var highlightedCategoriesChanged: CustomEvent
  
  var hoverBehaviorChanged: CustomEvent
  
  var initialZoomingChanged: CustomEvent
  
  var legendChanged: CustomEvent
  
  var ojDrill: CustomEvent
  
  var ojSelectInput: CustomEvent
  
  var ojViewportChange: CustomEvent
  
  var ojViewportChangeInput: CustomEvent
  
  var orientationChanged: CustomEvent
  
  var otherThresholdChanged: CustomEvent
  
  var overviewChanged: CustomEvent
  
  var pieCenterChanged: CustomEvent
  
  var plotAreaChanged: CustomEvent
  
  var polarGridShapeChanged: CustomEvent
  
  var selectionChanged: CustomEvent
  
  var selectionModeChanged: CustomEvent
  
  var seriesComparatorChanged: CustomEvent
  
  var sortingChanged: CustomEvent
  
  var splitDualYChanged: CustomEvent
  
  var splitterPositionChanged: CustomEvent
  
  var stackChanged: CustomEvent
  
  var stackLabelChanged: CustomEvent
  
  var styleDefaultsChanged: CustomEvent
  
  var timeAxisTypeChanged: CustomEvent
  
  var tooltipChanged: CustomEvent
  
  var touchResponseChanged: CustomEvent
  
  var typeChanged: CustomEvent
  
  var valueFormatsChanged: CustomEvent
  
  var xAxisChanged: CustomEvent
  
  var y2AxisChanged: CustomEvent
  
  var yAxisChanged: CustomEvent
  
  var zoomAndScrollChanged: CustomEvent
  
  var zoomDirectionChanged: CustomEvent
}
object ojChartEventMap {
  
  inline def apply[K, D](
    abort: UIEvent,
    animationOnDataChangeChanged: CustomEvent,
    animationOnDisplayChanged: CustomEvent,
    animationcancel: AnimationEvent,
    animationend: AnimationEvent,
    animationiteration: AnimationEvent,
    animationstart: AnimationEvent,
    asChanged: CustomEvent,
    auxclick: MouseEvent,
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
    coordinateSystemChanged: CustomEvent,
    copy: ClipboardEvent,
    cuechange: Event,
    cut: ClipboardEvent,
    dataChanged: CustomEvent,
    dataCursorBehaviorChanged: CustomEvent,
    dataCursorChanged: CustomEvent,
    dataCursorPositionChanged: CustomEvent,
    dataLabelChanged: CustomEvent,
    dblclick: MouseEvent,
    dndChanged: CustomEvent,
    drag: DragEvent,
    dragModeChanged: CustomEvent,
    dragend: DragEvent,
    dragenter: DragEvent,
    dragleave: DragEvent,
    dragover: DragEvent,
    dragstart: DragEvent,
    drillingChanged: CustomEvent,
    drop: DragEvent,
    durationchange: Event,
    emptied: Event,
    ended: Event,
    error: ErrorEvent,
    focus: FocusEvent,
    focusin: FocusEvent,
    focusout: FocusEvent,
    formdata: FormDataEvent,
    fullscreenchange: Event,
    fullscreenerror: Event,
    gotpointercapture: PointerEvent,
    groupComparatorChanged: CustomEvent,
    hiddenCategoriesChanged: CustomEvent,
    hideAndShowBehaviorChanged: CustomEvent,
    highlightMatchChanged: CustomEvent,
    highlightedCategoriesChanged: CustomEvent,
    hoverBehaviorChanged: CustomEvent,
    initialZoomingChanged: CustomEvent,
    input: Event,
    invalid: Event,
    keydown: KeyboardEvent,
    keypress: KeyboardEvent,
    keyup: KeyboardEvent,
    legendChanged: CustomEvent,
    load: Event,
    loadeddata: Event,
    loadedmetadata: Event,
    loadstart: Event,
    lostpointercapture: PointerEvent,
    mousedown: MouseEvent,
    mouseenter: MouseEvent,
    mouseleave: MouseEvent,
    mousemove: MouseEvent,
    mouseout: MouseEvent,
    mouseover: MouseEvent,
    mouseup: MouseEvent,
    ojDrill: CustomEvent,
    ojSelectInput: CustomEvent,
    ojViewportChange: CustomEvent,
    ojViewportChangeInput: CustomEvent,
    orientationChanged: CustomEvent,
    otherThresholdChanged: CustomEvent,
    overviewChanged: CustomEvent,
    paste: ClipboardEvent,
    pause: Event,
    pieCenterChanged: CustomEvent,
    play: Event,
    playing: Event,
    plotAreaChanged: CustomEvent,
    pointercancel: PointerEvent,
    pointerdown: PointerEvent,
    pointerenter: PointerEvent,
    pointerleave: PointerEvent,
    pointermove: PointerEvent,
    pointerout: PointerEvent,
    pointerover: PointerEvent,
    pointerup: PointerEvent,
    polarGridShapeChanged: CustomEvent,
    progress: ProgressEvent,
    ratechange: Event,
    reset: Event,
    resize: UIEvent,
    scroll: Event,
    securitypolicyviolation: SecurityPolicyViolationEvent,
    seeked: Event,
    seeking: Event,
    select: Event,
    selectionChanged: CustomEvent,
    selectionModeChanged: CustomEvent,
    selectionchange: Event,
    selectstart: Event,
    seriesComparatorChanged: CustomEvent,
    slotchange: Event,
    sortingChanged: CustomEvent,
    splitDualYChanged: CustomEvent,
    splitterPositionChanged: CustomEvent,
    stackChanged: CustomEvent,
    stackLabelChanged: CustomEvent,
    stalled: Event,
    styleDefaultsChanged: CustomEvent,
    submit: SubmitEvent,
    suspend: Event,
    timeAxisTypeChanged: CustomEvent,
    timeupdate: Event,
    toggle: Event,
    tooltipChanged: CustomEvent,
    touchResponseChanged: CustomEvent,
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
    valueFormatsChanged: CustomEvent,
    volumechange: Event,
    waiting: Event,
    webkitanimationend: Event,
    webkitanimationiteration: Event,
    webkitanimationstart: Event,
    webkittransitionend: Event,
    wheel: WheelEvent,
    xAxisChanged: CustomEvent,
    y2AxisChanged: CustomEvent,
    yAxisChanged: CustomEvent,
    zoomAndScrollChanged: CustomEvent,
    zoomDirectionChanged: CustomEvent
  ): ojChartEventMap[K, D] = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationOnDataChangeChanged = animationOnDataChangeChanged.asInstanceOf[js.Any], animationOnDisplayChanged = animationOnDisplayChanged.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], asChanged = asChanged.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], beforeinput = beforeinput.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], compositionend = compositionend.asInstanceOf[js.Any], compositionstart = compositionstart.asInstanceOf[js.Any], compositionupdate = compositionupdate.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], coordinateSystemChanged = coordinateSystemChanged.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dataChanged = dataChanged.asInstanceOf[js.Any], dataCursorBehaviorChanged = dataCursorBehaviorChanged.asInstanceOf[js.Any], dataCursorChanged = dataCursorChanged.asInstanceOf[js.Any], dataCursorPositionChanged = dataCursorPositionChanged.asInstanceOf[js.Any], dataLabelChanged = dataLabelChanged.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], dndChanged = dndChanged.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragModeChanged = dragModeChanged.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drillingChanged = drillingChanged.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], formdata = formdata.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], groupComparatorChanged = groupComparatorChanged.asInstanceOf[js.Any], hiddenCategoriesChanged = hiddenCategoriesChanged.asInstanceOf[js.Any], hideAndShowBehaviorChanged = hideAndShowBehaviorChanged.asInstanceOf[js.Any], highlightMatchChanged = highlightMatchChanged.asInstanceOf[js.Any], highlightedCategoriesChanged = highlightedCategoriesChanged.asInstanceOf[js.Any], hoverBehaviorChanged = hoverBehaviorChanged.asInstanceOf[js.Any], initialZoomingChanged = initialZoomingChanged.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], legendChanged = legendChanged.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], ojDrill = ojDrill.asInstanceOf[js.Any], ojSelectInput = ojSelectInput.asInstanceOf[js.Any], ojViewportChange = ojViewportChange.asInstanceOf[js.Any], ojViewportChangeInput = ojViewportChangeInput.asInstanceOf[js.Any], orientationChanged = orientationChanged.asInstanceOf[js.Any], otherThresholdChanged = otherThresholdChanged.asInstanceOf[js.Any], overviewChanged = overviewChanged.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], pieCenterChanged = pieCenterChanged.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], plotAreaChanged = plotAreaChanged.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], polarGridShapeChanged = polarGridShapeChanged.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionChanged = selectionChanged.asInstanceOf[js.Any], selectionModeChanged = selectionModeChanged.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], seriesComparatorChanged = seriesComparatorChanged.asInstanceOf[js.Any], slotchange = slotchange.asInstanceOf[js.Any], sortingChanged = sortingChanged.asInstanceOf[js.Any], splitDualYChanged = splitDualYChanged.asInstanceOf[js.Any], splitterPositionChanged = splitterPositionChanged.asInstanceOf[js.Any], stackChanged = stackChanged.asInstanceOf[js.Any], stackLabelChanged = stackLabelChanged.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], styleDefaultsChanged = styleDefaultsChanged.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeAxisTypeChanged = timeAxisTypeChanged.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], tooltipChanged = tooltipChanged.asInstanceOf[js.Any], touchResponseChanged = touchResponseChanged.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], trackResizeChanged = trackResizeChanged.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], typeChanged = typeChanged.asInstanceOf[js.Any], valueFormatsChanged = valueFormatsChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], webkitanimationend = webkitanimationend.asInstanceOf[js.Any], webkitanimationiteration = webkitanimationiteration.asInstanceOf[js.Any], webkitanimationstart = webkitanimationstart.asInstanceOf[js.Any], webkittransitionend = webkittransitionend.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any], xAxisChanged = xAxisChanged.asInstanceOf[js.Any], y2AxisChanged = y2AxisChanged.asInstanceOf[js.Any], yAxisChanged = yAxisChanged.asInstanceOf[js.Any], zoomAndScrollChanged = zoomAndScrollChanged.asInstanceOf[js.Any], zoomDirectionChanged = zoomDirectionChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojChartEventMap[K, D]]
  }
  
  extension [Self <: ojChartEventMap[?, ?], K, D](x: Self & (ojChartEventMap[K, D])) {
    
    inline def setAnimationOnDataChangeChanged(value: CustomEvent): Self = StObject.set(x, "animationOnDataChangeChanged", value.asInstanceOf[js.Any])
    
    inline def setAnimationOnDisplayChanged(value: CustomEvent): Self = StObject.set(x, "animationOnDisplayChanged", value.asInstanceOf[js.Any])
    
    inline def setAsChanged(value: CustomEvent): Self = StObject.set(x, "asChanged", value.asInstanceOf[js.Any])
    
    inline def setCoordinateSystemChanged(value: CustomEvent): Self = StObject.set(x, "coordinateSystemChanged", value.asInstanceOf[js.Any])
    
    inline def setDataChanged(value: CustomEvent): Self = StObject.set(x, "dataChanged", value.asInstanceOf[js.Any])
    
    inline def setDataCursorBehaviorChanged(value: CustomEvent): Self = StObject.set(x, "dataCursorBehaviorChanged", value.asInstanceOf[js.Any])
    
    inline def setDataCursorChanged(value: CustomEvent): Self = StObject.set(x, "dataCursorChanged", value.asInstanceOf[js.Any])
    
    inline def setDataCursorPositionChanged(value: CustomEvent): Self = StObject.set(x, "dataCursorPositionChanged", value.asInstanceOf[js.Any])
    
    inline def setDataLabelChanged(value: CustomEvent): Self = StObject.set(x, "dataLabelChanged", value.asInstanceOf[js.Any])
    
    inline def setDndChanged(value: CustomEvent): Self = StObject.set(x, "dndChanged", value.asInstanceOf[js.Any])
    
    inline def setDragModeChanged(value: CustomEvent): Self = StObject.set(x, "dragModeChanged", value.asInstanceOf[js.Any])
    
    inline def setDrillingChanged(value: CustomEvent): Self = StObject.set(x, "drillingChanged", value.asInstanceOf[js.Any])
    
    inline def setGroupComparatorChanged(value: CustomEvent): Self = StObject.set(x, "groupComparatorChanged", value.asInstanceOf[js.Any])
    
    inline def setHiddenCategoriesChanged(value: CustomEvent): Self = StObject.set(x, "hiddenCategoriesChanged", value.asInstanceOf[js.Any])
    
    inline def setHideAndShowBehaviorChanged(value: CustomEvent): Self = StObject.set(x, "hideAndShowBehaviorChanged", value.asInstanceOf[js.Any])
    
    inline def setHighlightMatchChanged(value: CustomEvent): Self = StObject.set(x, "highlightMatchChanged", value.asInstanceOf[js.Any])
    
    inline def setHighlightedCategoriesChanged(value: CustomEvent): Self = StObject.set(x, "highlightedCategoriesChanged", value.asInstanceOf[js.Any])
    
    inline def setHoverBehaviorChanged(value: CustomEvent): Self = StObject.set(x, "hoverBehaviorChanged", value.asInstanceOf[js.Any])
    
    inline def setInitialZoomingChanged(value: CustomEvent): Self = StObject.set(x, "initialZoomingChanged", value.asInstanceOf[js.Any])
    
    inline def setLegendChanged(value: CustomEvent): Self = StObject.set(x, "legendChanged", value.asInstanceOf[js.Any])
    
    inline def setOjDrill(value: CustomEvent): Self = StObject.set(x, "ojDrill", value.asInstanceOf[js.Any])
    
    inline def setOjSelectInput(value: CustomEvent): Self = StObject.set(x, "ojSelectInput", value.asInstanceOf[js.Any])
    
    inline def setOjViewportChange(value: CustomEvent): Self = StObject.set(x, "ojViewportChange", value.asInstanceOf[js.Any])
    
    inline def setOjViewportChangeInput(value: CustomEvent): Self = StObject.set(x, "ojViewportChangeInput", value.asInstanceOf[js.Any])
    
    inline def setOrientationChanged(value: CustomEvent): Self = StObject.set(x, "orientationChanged", value.asInstanceOf[js.Any])
    
    inline def setOtherThresholdChanged(value: CustomEvent): Self = StObject.set(x, "otherThresholdChanged", value.asInstanceOf[js.Any])
    
    inline def setOverviewChanged(value: CustomEvent): Self = StObject.set(x, "overviewChanged", value.asInstanceOf[js.Any])
    
    inline def setPieCenterChanged(value: CustomEvent): Self = StObject.set(x, "pieCenterChanged", value.asInstanceOf[js.Any])
    
    inline def setPlotAreaChanged(value: CustomEvent): Self = StObject.set(x, "plotAreaChanged", value.asInstanceOf[js.Any])
    
    inline def setPolarGridShapeChanged(value: CustomEvent): Self = StObject.set(x, "polarGridShapeChanged", value.asInstanceOf[js.Any])
    
    inline def setSelectionChanged(value: CustomEvent): Self = StObject.set(x, "selectionChanged", value.asInstanceOf[js.Any])
    
    inline def setSelectionModeChanged(value: CustomEvent): Self = StObject.set(x, "selectionModeChanged", value.asInstanceOf[js.Any])
    
    inline def setSeriesComparatorChanged(value: CustomEvent): Self = StObject.set(x, "seriesComparatorChanged", value.asInstanceOf[js.Any])
    
    inline def setSortingChanged(value: CustomEvent): Self = StObject.set(x, "sortingChanged", value.asInstanceOf[js.Any])
    
    inline def setSplitDualYChanged(value: CustomEvent): Self = StObject.set(x, "splitDualYChanged", value.asInstanceOf[js.Any])
    
    inline def setSplitterPositionChanged(value: CustomEvent): Self = StObject.set(x, "splitterPositionChanged", value.asInstanceOf[js.Any])
    
    inline def setStackChanged(value: CustomEvent): Self = StObject.set(x, "stackChanged", value.asInstanceOf[js.Any])
    
    inline def setStackLabelChanged(value: CustomEvent): Self = StObject.set(x, "stackLabelChanged", value.asInstanceOf[js.Any])
    
    inline def setStyleDefaultsChanged(value: CustomEvent): Self = StObject.set(x, "styleDefaultsChanged", value.asInstanceOf[js.Any])
    
    inline def setTimeAxisTypeChanged(value: CustomEvent): Self = StObject.set(x, "timeAxisTypeChanged", value.asInstanceOf[js.Any])
    
    inline def setTooltipChanged(value: CustomEvent): Self = StObject.set(x, "tooltipChanged", value.asInstanceOf[js.Any])
    
    inline def setTouchResponseChanged(value: CustomEvent): Self = StObject.set(x, "touchResponseChanged", value.asInstanceOf[js.Any])
    
    inline def setTypeChanged(value: CustomEvent): Self = StObject.set(x, "typeChanged", value.asInstanceOf[js.Any])
    
    inline def setValueFormatsChanged(value: CustomEvent): Self = StObject.set(x, "valueFormatsChanged", value.asInstanceOf[js.Any])
    
    inline def setXAxisChanged(value: CustomEvent): Self = StObject.set(x, "xAxisChanged", value.asInstanceOf[js.Any])
    
    inline def setY2AxisChanged(value: CustomEvent): Self = StObject.set(x, "y2AxisChanged", value.asInstanceOf[js.Any])
    
    inline def setYAxisChanged(value: CustomEvent): Self = StObject.set(x, "yAxisChanged", value.asInstanceOf[js.Any])
    
    inline def setZoomAndScrollChanged(value: CustomEvent): Self = StObject.set(x, "zoomAndScrollChanged", value.asInstanceOf[js.Any])
    
    inline def setZoomDirectionChanged(value: CustomEvent): Self = StObject.set(x, "zoomDirectionChanged", value.asInstanceOf[js.Any])
  }
}
