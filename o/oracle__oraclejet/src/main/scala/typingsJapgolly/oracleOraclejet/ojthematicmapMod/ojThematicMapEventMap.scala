package typingsJapgolly.oracleOraclejet.ojthematicmapMod

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

trait ojThematicMapEventMap[K1, K2, K3, D1, D2, D3]
  extends StObject
     with dvtBaseComponentEventMap[ojThematicMapSettableProperties[K1, K2, K3, D1, D2, D3]] {
  
  var animationDurationChanged: CustomEvent
  
  var animationOnDisplayChanged: CustomEvent
  
  var areaDataChanged: CustomEvent
  
  var asChanged: CustomEvent
  
  var focusRendererChanged: CustomEvent
  
  var hiddenCategoriesChanged: CustomEvent
  
  var highlightMatchChanged: CustomEvent
  
  var highlightedCategoriesChanged: CustomEvent
  
  var hoverBehaviorChanged: CustomEvent
  
  var hoverRendererChanged: CustomEvent
  
  var initialZoomingChanged: CustomEvent
  
  var isolatedItemChanged: CustomEvent
  
  var labelDisplayChanged: CustomEvent
  
  var labelTypeChanged: CustomEvent
  
  var linkDataChanged: CustomEvent
  
  var mapProviderChanged: CustomEvent
  
  var markerDataChanged: CustomEvent
  
  var markerZoomBehaviorChanged: CustomEvent
  
  var maxZoomChanged: CustomEvent
  
  var panningChanged: CustomEvent
  
  var rendererChanged: CustomEvent
  
  var selectionChanged: CustomEvent
  
  var selectionModeChanged: CustomEvent
  
  var selectionRendererChanged: CustomEvent
  
  var styleDefaultsChanged: CustomEvent
  
  var tooltipChanged: CustomEvent
  
  var tooltipDisplayChanged: CustomEvent
  
  var touchResponseChanged: CustomEvent
  
  var zoomingChanged: CustomEvent
}
object ojThematicMapEventMap {
  
  inline def apply[K1, K2, K3, D1, D2, D3](
    abort: UIEvent,
    animationDurationChanged: CustomEvent,
    animationOnDisplayChanged: CustomEvent,
    animationcancel: AnimationEvent,
    animationend: AnimationEvent,
    animationiteration: AnimationEvent,
    animationstart: AnimationEvent,
    areaDataChanged: CustomEvent,
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
    copy: ClipboardEvent,
    cuechange: Event,
    cut: ClipboardEvent,
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
    focus: FocusEvent,
    focusRendererChanged: CustomEvent,
    focusin: FocusEvent,
    focusout: FocusEvent,
    formdata: FormDataEvent,
    fullscreenchange: Event,
    fullscreenerror: Event,
    gotpointercapture: PointerEvent,
    hiddenCategoriesChanged: CustomEvent,
    highlightMatchChanged: CustomEvent,
    highlightedCategoriesChanged: CustomEvent,
    hoverBehaviorChanged: CustomEvent,
    hoverRendererChanged: CustomEvent,
    initialZoomingChanged: CustomEvent,
    input: Event,
    invalid: Event,
    isolatedItemChanged: CustomEvent,
    keydown: KeyboardEvent,
    keypress: KeyboardEvent,
    keyup: KeyboardEvent,
    labelDisplayChanged: CustomEvent,
    labelTypeChanged: CustomEvent,
    linkDataChanged: CustomEvent,
    load: Event,
    loadeddata: Event,
    loadedmetadata: Event,
    loadstart: Event,
    lostpointercapture: PointerEvent,
    mapProviderChanged: CustomEvent,
    markerDataChanged: CustomEvent,
    markerZoomBehaviorChanged: CustomEvent,
    maxZoomChanged: CustomEvent,
    mousedown: MouseEvent,
    mouseenter: MouseEvent,
    mouseleave: MouseEvent,
    mousemove: MouseEvent,
    mouseout: MouseEvent,
    mouseover: MouseEvent,
    mouseup: MouseEvent,
    panningChanged: CustomEvent,
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
    rendererChanged: CustomEvent,
    reset: Event,
    resize: UIEvent,
    scroll: Event,
    securitypolicyviolation: SecurityPolicyViolationEvent,
    seeked: Event,
    seeking: Event,
    select: Event,
    selectionChanged: CustomEvent,
    selectionModeChanged: CustomEvent,
    selectionRendererChanged: CustomEvent,
    selectionchange: Event,
    selectstart: Event,
    slotchange: Event,
    stalled: Event,
    styleDefaultsChanged: CustomEvent,
    submit: SubmitEvent,
    suspend: Event,
    timeupdate: Event,
    toggle: Event,
    tooltipChanged: CustomEvent,
    tooltipDisplayChanged: CustomEvent,
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
    volumechange: Event,
    waiting: Event,
    webkitanimationend: Event,
    webkitanimationiteration: Event,
    webkitanimationstart: Event,
    webkittransitionend: Event,
    wheel: WheelEvent,
    zoomingChanged: CustomEvent
  ): ojThematicMapEventMap[K1, K2, K3, D1, D2, D3] = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationDurationChanged = animationDurationChanged.asInstanceOf[js.Any], animationOnDisplayChanged = animationOnDisplayChanged.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], areaDataChanged = areaDataChanged.asInstanceOf[js.Any], asChanged = asChanged.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], beforeinput = beforeinput.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], compositionend = compositionend.asInstanceOf[js.Any], compositionstart = compositionstart.asInstanceOf[js.Any], compositionupdate = compositionupdate.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusRendererChanged = focusRendererChanged.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], formdata = formdata.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], hiddenCategoriesChanged = hiddenCategoriesChanged.asInstanceOf[js.Any], highlightMatchChanged = highlightMatchChanged.asInstanceOf[js.Any], highlightedCategoriesChanged = highlightedCategoriesChanged.asInstanceOf[js.Any], hoverBehaviorChanged = hoverBehaviorChanged.asInstanceOf[js.Any], hoverRendererChanged = hoverRendererChanged.asInstanceOf[js.Any], initialZoomingChanged = initialZoomingChanged.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], isolatedItemChanged = isolatedItemChanged.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], labelDisplayChanged = labelDisplayChanged.asInstanceOf[js.Any], labelTypeChanged = labelTypeChanged.asInstanceOf[js.Any], linkDataChanged = linkDataChanged.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], mapProviderChanged = mapProviderChanged.asInstanceOf[js.Any], markerDataChanged = markerDataChanged.asInstanceOf[js.Any], markerZoomBehaviorChanged = markerZoomBehaviorChanged.asInstanceOf[js.Any], maxZoomChanged = maxZoomChanged.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], panningChanged = panningChanged.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], rendererChanged = rendererChanged.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionChanged = selectionChanged.asInstanceOf[js.Any], selectionModeChanged = selectionModeChanged.asInstanceOf[js.Any], selectionRendererChanged = selectionRendererChanged.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], slotchange = slotchange.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], styleDefaultsChanged = styleDefaultsChanged.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], tooltipChanged = tooltipChanged.asInstanceOf[js.Any], tooltipDisplayChanged = tooltipDisplayChanged.asInstanceOf[js.Any], touchResponseChanged = touchResponseChanged.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], trackResizeChanged = trackResizeChanged.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], webkitanimationend = webkitanimationend.asInstanceOf[js.Any], webkitanimationiteration = webkitanimationiteration.asInstanceOf[js.Any], webkitanimationstart = webkitanimationstart.asInstanceOf[js.Any], webkittransitionend = webkittransitionend.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any], zoomingChanged = zoomingChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojThematicMapEventMap[K1, K2, K3, D1, D2, D3]]
  }
  
  extension [Self <: ojThematicMapEventMap[?, ?, ?, ?, ?, ?], K1, K2, K3, D1, D2, D3](x: Self & (ojThematicMapEventMap[K1, K2, K3, D1, D2, D3])) {
    
    inline def setAnimationDurationChanged(value: CustomEvent): Self = StObject.set(x, "animationDurationChanged", value.asInstanceOf[js.Any])
    
    inline def setAnimationOnDisplayChanged(value: CustomEvent): Self = StObject.set(x, "animationOnDisplayChanged", value.asInstanceOf[js.Any])
    
    inline def setAreaDataChanged(value: CustomEvent): Self = StObject.set(x, "areaDataChanged", value.asInstanceOf[js.Any])
    
    inline def setAsChanged(value: CustomEvent): Self = StObject.set(x, "asChanged", value.asInstanceOf[js.Any])
    
    inline def setFocusRendererChanged(value: CustomEvent): Self = StObject.set(x, "focusRendererChanged", value.asInstanceOf[js.Any])
    
    inline def setHiddenCategoriesChanged(value: CustomEvent): Self = StObject.set(x, "hiddenCategoriesChanged", value.asInstanceOf[js.Any])
    
    inline def setHighlightMatchChanged(value: CustomEvent): Self = StObject.set(x, "highlightMatchChanged", value.asInstanceOf[js.Any])
    
    inline def setHighlightedCategoriesChanged(value: CustomEvent): Self = StObject.set(x, "highlightedCategoriesChanged", value.asInstanceOf[js.Any])
    
    inline def setHoverBehaviorChanged(value: CustomEvent): Self = StObject.set(x, "hoverBehaviorChanged", value.asInstanceOf[js.Any])
    
    inline def setHoverRendererChanged(value: CustomEvent): Self = StObject.set(x, "hoverRendererChanged", value.asInstanceOf[js.Any])
    
    inline def setInitialZoomingChanged(value: CustomEvent): Self = StObject.set(x, "initialZoomingChanged", value.asInstanceOf[js.Any])
    
    inline def setIsolatedItemChanged(value: CustomEvent): Self = StObject.set(x, "isolatedItemChanged", value.asInstanceOf[js.Any])
    
    inline def setLabelDisplayChanged(value: CustomEvent): Self = StObject.set(x, "labelDisplayChanged", value.asInstanceOf[js.Any])
    
    inline def setLabelTypeChanged(value: CustomEvent): Self = StObject.set(x, "labelTypeChanged", value.asInstanceOf[js.Any])
    
    inline def setLinkDataChanged(value: CustomEvent): Self = StObject.set(x, "linkDataChanged", value.asInstanceOf[js.Any])
    
    inline def setMapProviderChanged(value: CustomEvent): Self = StObject.set(x, "mapProviderChanged", value.asInstanceOf[js.Any])
    
    inline def setMarkerDataChanged(value: CustomEvent): Self = StObject.set(x, "markerDataChanged", value.asInstanceOf[js.Any])
    
    inline def setMarkerZoomBehaviorChanged(value: CustomEvent): Self = StObject.set(x, "markerZoomBehaviorChanged", value.asInstanceOf[js.Any])
    
    inline def setMaxZoomChanged(value: CustomEvent): Self = StObject.set(x, "maxZoomChanged", value.asInstanceOf[js.Any])
    
    inline def setPanningChanged(value: CustomEvent): Self = StObject.set(x, "panningChanged", value.asInstanceOf[js.Any])
    
    inline def setRendererChanged(value: CustomEvent): Self = StObject.set(x, "rendererChanged", value.asInstanceOf[js.Any])
    
    inline def setSelectionChanged(value: CustomEvent): Self = StObject.set(x, "selectionChanged", value.asInstanceOf[js.Any])
    
    inline def setSelectionModeChanged(value: CustomEvent): Self = StObject.set(x, "selectionModeChanged", value.asInstanceOf[js.Any])
    
    inline def setSelectionRendererChanged(value: CustomEvent): Self = StObject.set(x, "selectionRendererChanged", value.asInstanceOf[js.Any])
    
    inline def setStyleDefaultsChanged(value: CustomEvent): Self = StObject.set(x, "styleDefaultsChanged", value.asInstanceOf[js.Any])
    
    inline def setTooltipChanged(value: CustomEvent): Self = StObject.set(x, "tooltipChanged", value.asInstanceOf[js.Any])
    
    inline def setTooltipDisplayChanged(value: CustomEvent): Self = StObject.set(x, "tooltipDisplayChanged", value.asInstanceOf[js.Any])
    
    inline def setTouchResponseChanged(value: CustomEvent): Self = StObject.set(x, "touchResponseChanged", value.asInstanceOf[js.Any])
    
    inline def setZoomingChanged(value: CustomEvent): Self = StObject.set(x, "zoomingChanged", value.asInstanceOf[js.Any])
  }
}
