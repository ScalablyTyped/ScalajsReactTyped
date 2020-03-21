package typingsJapgolly.oracleOraclejet.ojtreemapMod

import org.scalajs.dom.raw.AnimationEvent
import org.scalajs.dom.raw.ClipboardEvent
import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.DragEvent
import org.scalajs.dom.raw.ErrorEvent
import org.scalajs.dom.raw.FocusEvent
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.PointerEvent
import org.scalajs.dom.raw.ProgressEvent
import org.scalajs.dom.raw.TouchEvent
import org.scalajs.dom.raw.TransitionEvent
import org.scalajs.dom.raw.UIEvent
import org.scalajs.dom.raw.WheelEvent
import typingsJapgolly.oracleOraclejet.AnonIsolate
import typingsJapgolly.oracleOraclejet.mod.JetElement
import typingsJapgolly.oracleOraclejet.mod.JetElementCustomEvent
import typingsJapgolly.oracleOraclejet.mod.JetSetPropertyType
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.abort
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.animationcancel
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.animationend
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.animationiteration
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.animationstart
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.auto
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.auxclick
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.blur
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.bottom
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.cancel
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.canplay
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.canplaythrough
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.categories
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.categoriesChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.center
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.change
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.click
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.close
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.color
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.colorChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.contextmenu
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.copy
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.cuechange
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.cut
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.dblclick
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.drag
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.dragend
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.dragenter
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.dragexit
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.dragleave
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.dragover
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.dragstart
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.drilling
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.drillingChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.drop
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.durationchange
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.emptied
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.end
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ended
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.error
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.focus
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.focusin
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.focusout
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.fullscreenchange
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.fullscreenerror
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.gotpointercapture
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.groupLabelDisplay
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.groupLabelDisplayChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.header
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.headerChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.inherit
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.input
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.invalid
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.keydown
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.keypress
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.keyup
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.label
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.labelChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.labelDisplay
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.labelDisplayChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.labelHalign
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.labelHalignChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.labelStyle
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.labelStyleChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.labelValign
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.labelValignChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.largeChecker
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.largeCrosshatch
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.largeDiagonalLeft
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.largeDiagonalRight
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.largeDiamond
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.largeTriangle
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.load
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.loadeddata
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.loadedmetadata
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.loadstart
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.lostpointercapture
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.mousedown
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.mouseenter
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.mouseleave
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.mousemove
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.mouseout
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.mouseover
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.mouseup
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.node
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.none
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.off
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.on
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.paste
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.pattern
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.patternChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.pause
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.play
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.playing
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.pointercancel
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.pointerdown
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.pointerenter
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.pointerleave
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.pointermove
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.pointerout
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.pointerover
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.pointerup
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.progress
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ratechange
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.reset
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.resize
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.scroll
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.securitypolicyviolation
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.seeked
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.seeking
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.select
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.selectable
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.selectableChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.selectionchange
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.selectstart
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.shortDesc
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.shortDescChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.smallChecker
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.smallCrosshatch
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.smallDiagonalLeft
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.smallDiagonalRight
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.smallDiamond
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.smallTriangle
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.stalled
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.start
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.submit
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.suspend
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.svgClassName
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.svgClassNameChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.svgStyle
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.svgStyleChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.timeupdate
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.toggle
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.top
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.touchcancel
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.touchend
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.touchmove
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.touchstart_
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.transitioncancel
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.transitionend
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.transitionrun
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.transitionstart
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.value
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.valueChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.volumechange
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.waiting
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.wheel
import typingsJapgolly.std.Event_
import typingsJapgolly.std.HTMLElement
import typingsJapgolly.std.SecurityPolicyViolationEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojTreemapNode extends JetElement[ojTreemapNodeSettableProperties] {
  var categories: js.UndefOr[js.Array[String]] = js.native
  var color: js.UndefOr[String] = js.native
  var drilling: js.UndefOr[on | off | inherit] = js.native
  var groupLabelDisplay: js.UndefOr[node | off | header] = js.native
  var header: js.UndefOr[AnonIsolate] = js.native
  var label: js.UndefOr[String] = js.native
  var labelDisplay: js.UndefOr[off | node] = js.native
  var labelHalign: js.UndefOr[start | end | center] = js.native
  var labelStyle: js.UndefOr[js.Object] = js.native
  var labelValign: js.UndefOr[top | bottom | center] = js.native
  var onCategoriesChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onColorChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onDrillingChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onGroupLabelDisplayChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onHeaderChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onLabelChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onLabelDisplayChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onLabelHalignChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onLabelStyleChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onLabelValignChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onPatternChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onSelectableChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onShortDescChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onSvgClassNameChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onSvgStyleChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onValueChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var pattern: js.UndefOr[
    smallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle | largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | none
  ] = js.native
  var selectable: js.UndefOr[off | auto] = js.native
  var shortDesc: js.UndefOr[String] = js.native
  var svgClassName: js.UndefOr[String] = js.native
  var svgStyle: js.UndefOr[js.Object] = js.native
  var value: Double = js.native
  def addEventListener(
    `type`: drillingChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[js.UndefOr[on | off | inherit]], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: drillingChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[js.UndefOr[on | off | inherit]], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: groupLabelDisplayChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[js.UndefOr[node | off | header]], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: groupLabelDisplayChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[js.UndefOr[node | off | header]], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: labelDisplayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.UndefOr[off | node]], _]
  ): Unit = js.native
  def addEventListener(
    `type`: labelDisplayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.UndefOr[off | node]], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: labelHalignChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[js.UndefOr[start | end | center]], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: labelHalignChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[js.UndefOr[start | end | center]], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: labelValignChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[js.UndefOr[top | bottom | center]], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: labelValignChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[js.UndefOr[top | bottom | center]], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: patternChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        js.UndefOr[
          smallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle | largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | none
        ]
      ], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: patternChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        js.UndefOr[
          smallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle | largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | none
        ]
      ], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: selectableChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.UndefOr[off | auto]], _]
  ): Unit = js.native
  def addEventListener(
    `type`: selectableChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[js.UndefOr[off | auto]], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ UIEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ UIEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationcancel(
    `type`: animationcancel,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ AnimationEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationcancel(
    `type`: animationcancel,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ AnimationEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationend(
    `type`: animationend,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ AnimationEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationend(
    `type`: animationend,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ AnimationEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationiteration(
    `type`: animationiteration,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ AnimationEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationiteration(
    `type`: animationiteration,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ AnimationEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationstart(
    `type`: animationstart,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ AnimationEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationstart(
    `type`: animationstart,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ AnimationEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_auxclick(
    `type`: auxclick,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_auxclick(
    `type`: auxclick,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_blur(
    `type`: blur,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ FocusEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_blur(
    `type`: blur,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ FocusEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cancel(
    `type`: cancel,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cancel(
    `type`: cancel,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplay(
    `type`: canplay,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplay(
    `type`: canplay,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplaythrough(
    `type`: canplaythrough,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplaythrough(
    `type`: canplaythrough,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_categoriesChanged(
    `type`: categoriesChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_categoriesChanged(
    `type`: categoriesChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_click(
    `type`: click,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_click(
    `type`: click,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: close,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: close,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_colorChanged(
    `type`: colorChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_colorChanged(
    `type`: colorChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contextmenu(
    `type`: contextmenu,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contextmenu(
    `type`: contextmenu,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_copy(
    `type`: copy,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ ClipboardEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_copy(
    `type`: copy,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ ClipboardEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cuechange(
    `type`: cuechange,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cuechange(
    `type`: cuechange,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cut(
    `type`: cut,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ ClipboardEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cut(
    `type`: cut,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ ClipboardEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dblclick(
    `type`: dblclick,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dblclick(
    `type`: dblclick,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drag(
    `type`: drag,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ DragEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drag(
    `type`: drag,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ DragEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragend(
    `type`: dragend,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ DragEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragend(
    `type`: dragend,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ DragEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragenter(
    `type`: dragenter,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ DragEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragenter(
    `type`: dragenter,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ DragEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragexit(
    `type`: dragexit,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragexit(
    `type`: dragexit,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragleave(
    `type`: dragleave,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ DragEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragleave(
    `type`: dragleave,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ DragEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragover(
    `type`: dragover,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ DragEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragover(
    `type`: dragover,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ DragEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragstart(
    `type`: dragstart,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ DragEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragstart(
    `type`: dragstart,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ DragEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drop(
    `type`: drop,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ DragEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drop(
    `type`: drop,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ DragEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_durationchange(
    `type`: durationchange,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_durationchange(
    `type`: durationchange,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_emptied(
    `type`: emptied,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_emptied(
    `type`: emptied,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(
    `type`: ended,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(
    `type`: ended,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ ErrorEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ ErrorEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focus(
    `type`: focus,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ FocusEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focus(
    `type`: focus,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ FocusEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusin(
    `type`: focusin,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ FocusEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusin(
    `type`: focusin,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ FocusEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusout(
    `type`: focusout,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ FocusEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusout(
    `type`: focusout,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ FocusEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenchange(
    `type`: fullscreenchange,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenchange(
    `type`: fullscreenchange,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenerror(
    `type`: fullscreenerror,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenerror(
    `type`: fullscreenerror,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gotpointercapture(
    `type`: gotpointercapture,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gotpointercapture(
    `type`: gotpointercapture,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_headerChanged(
    `type`: headerChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_headerChanged(
    `type`: headerChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_input(
    `type`: input,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_input(
    `type`: input,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_invalid(
    `type`: invalid,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_invalid(
    `type`: invalid,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keydown(
    `type`: keydown,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ KeyboardEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keydown(
    `type`: keydown,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ KeyboardEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keypress(
    `type`: keypress,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ KeyboardEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keypress(
    `type`: keypress,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ KeyboardEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keyup(
    `type`: keyup,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ KeyboardEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keyup(
    `type`: keyup,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ KeyboardEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_labelChanged(
    `type`: labelChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_labelChanged(
    `type`: labelChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_labelStyleChanged(
    `type`: labelStyleChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_labelStyleChanged(
    `type`: labelStyleChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    `type`: load,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    `type`: load,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadeddata(
    `type`: loadeddata,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadeddata(
    `type`: loadeddata,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadedmetadata(
    `type`: loadedmetadata,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadedmetadata(
    `type`: loadedmetadata,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(
    `type`: loadstart,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(
    `type`: loadstart,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lostpointercapture(
    `type`: lostpointercapture,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lostpointercapture(
    `type`: lostpointercapture,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousedown(
    `type`: mousedown,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousedown(
    `type`: mousedown,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseenter(
    `type`: mouseenter,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseenter(
    `type`: mouseenter,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseleave(
    `type`: mouseleave,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseleave(
    `type`: mouseleave,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousemove(
    `type`: mousemove,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousemove(
    `type`: mousemove,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseout(
    `type`: mouseout,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseout(
    `type`: mouseout,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseover(
    `type`: mouseover,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseover(
    `type`: mouseover,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseup(
    `type`: mouseup,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseup(
    `type`: mouseup,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ MouseEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_paste(
    `type`: paste,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ ClipboardEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_paste(
    `type`: paste,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ ClipboardEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(
    `type`: pause,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(
    `type`: pause,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_play(
    `type`: play,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_play(
    `type`: play,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playing(
    `type`: playing,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playing(
    `type`: playing,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointercancel(
    `type`: pointercancel,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointercancel(
    `type`: pointercancel,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerdown(
    `type`: pointerdown,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerdown(
    `type`: pointerdown,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerenter(
    `type`: pointerenter,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerenter(
    `type`: pointerenter,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerleave(
    `type`: pointerleave,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerleave(
    `type`: pointerleave,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointermove(
    `type`: pointermove,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointermove(
    `type`: pointermove,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerout(
    `type`: pointerout,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerout(
    `type`: pointerout,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerover(
    `type`: pointerover,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerover(
    `type`: pointerover,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerup(
    `type`: pointerup,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerup(
    `type`: pointerup,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ PointerEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ ProgressEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ ProgressEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ratechange(
    `type`: ratechange,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ratechange(
    `type`: ratechange,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reset(
    `type`: reset,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reset(
    `type`: reset,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resize(
    `type`: resize,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ UIEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resize(
    `type`: resize,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ UIEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scroll(
    `type`: scroll,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scroll(
    `type`: scroll,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_securitypolicyviolation(
    `type`: securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ SecurityPolicyViolationEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_securitypolicyviolation(
    `type`: securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ SecurityPolicyViolationEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeked(
    `type`: seeked,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeked(
    `type`: seeked,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeking(
    `type`: seeking,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeking(
    `type`: seeking,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_select(
    `type`: select,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_select(
    `type`: select,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionchange(
    `type`: selectionchange,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionchange(
    `type`: selectionchange,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectstart(
    `type`: selectstart,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectstart(
    `type`: selectstart,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_shortDescChanged(
    `type`: shortDescChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_shortDescChanged(
    `type`: shortDescChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stalled(
    `type`: stalled,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stalled(
    `type`: stalled,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_submit(
    `type`: submit,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_submit(
    `type`: submit,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_suspend(
    `type`: suspend,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_suspend(
    `type`: suspend,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_svgClassNameChanged(
    `type`: svgClassNameChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_svgClassNameChanged(
    `type`: svgClassNameChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_svgStyleChanged(
    `type`: svgStyleChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_svgStyleChanged(
    `type`: svgStyleChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeupdate(
    `type`: timeupdate,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeupdate(
    `type`: timeupdate,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_toggle(
    `type`: toggle,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_toggle(
    `type`: toggle,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchcancel(
    `type`: touchcancel,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ TouchEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchcancel(
    `type`: touchcancel,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ TouchEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchend(
    `type`: touchend,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ TouchEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchend(
    `type`: touchend,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ TouchEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchmove(
    `type`: touchmove,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ TouchEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchmove(
    `type`: touchmove,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ TouchEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchstart(
    `type`: touchstart_,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ TouchEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchstart(
    `type`: touchstart_,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ TouchEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitioncancel(
    `type`: transitioncancel,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ TransitionEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitioncancel(
    `type`: transitioncancel,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ TransitionEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionend(
    `type`: transitionend,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ TransitionEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionend(
    `type`: transitionend,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ TransitionEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionrun(
    `type`: transitionrun,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ TransitionEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionrun(
    `type`: transitionrun,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ TransitionEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionstart(
    `type`: transitionstart,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ TransitionEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionstart(
    `type`: transitionstart,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ TransitionEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueChanged(
    `type`: valueChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueChanged(
    `type`: valueChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_volumechange(
    `type`: volumechange,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_volumechange(
    `type`: volumechange,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waiting(
    `type`: waiting,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waiting(
    `type`: waiting,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wheel(
    `type`: wheel,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ WheelEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wheel(
    `type`: wheel,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, /* ev */ WheelEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def getProperty(property: String): js.Any = js.native
  @JSName("getProperty")
  def getProperty_categories(property: categories): js.UndefOr[js.Array[String]] = js.native
  @JSName("getProperty")
  def getProperty_color(property: color): js.UndefOr[String] = js.native
  @JSName("getProperty")
  def getProperty_drilling(property: drilling): js.UndefOr[on | off | inherit] = js.native
  @JSName("getProperty")
  def getProperty_groupLabelDisplay(property: groupLabelDisplay): js.UndefOr[node | off | header] = js.native
  @JSName("getProperty")
  def getProperty_header(property: header): js.UndefOr[AnonIsolate] = js.native
  @JSName("getProperty")
  def getProperty_label(property: label): js.UndefOr[String] = js.native
  @JSName("getProperty")
  def getProperty_labelDisplay(property: labelDisplay): js.UndefOr[off | node] = js.native
  @JSName("getProperty")
  def getProperty_labelHalign(property: labelHalign): js.UndefOr[start | end | center] = js.native
  @JSName("getProperty")
  def getProperty_labelStyle(property: labelStyle): js.UndefOr[js.Object] = js.native
  @JSName("getProperty")
  def getProperty_labelValign(property: labelValign): js.UndefOr[top | bottom | center] = js.native
  @JSName("getProperty")
  def getProperty_pattern(property: pattern): js.UndefOr[
    smallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle | largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | none
  ] = js.native
  @JSName("getProperty")
  def getProperty_selectable(property: selectable): js.UndefOr[off | auto] = js.native
  @JSName("getProperty")
  def getProperty_shortDesc(property: shortDesc): js.UndefOr[String] = js.native
  @JSName("getProperty")
  def getProperty_svgClassName(property: svgClassName): js.UndefOr[String] = js.native
  @JSName("getProperty")
  def getProperty_svgStyle(property: svgStyle): js.UndefOr[js.Object] = js.native
  @JSName("getProperty")
  def getProperty_value(property: value): Double = js.native
  def setProperties(properties: ojTreemapNodeSettablePropertiesLenient): Unit = js.native
  def setProperty(property: drilling, value: inherit): Unit = js.native
  def setProperty(property: drilling, value: off): Unit = js.native
  def setProperty(property: drilling, value: on): Unit = js.native
  def setProperty(property: groupLabelDisplay, value: header): Unit = js.native
  def setProperty(property: groupLabelDisplay, value: node): Unit = js.native
  def setProperty(property: groupLabelDisplay, value: off): Unit = js.native
  def setProperty(property: labelDisplay, value: node): Unit = js.native
  def setProperty(property: labelDisplay, value: off): Unit = js.native
  def setProperty(property: labelHalign, value: center): Unit = js.native
  def setProperty(property: labelHalign, value: end): Unit = js.native
  def setProperty(property: labelHalign, value: start): Unit = js.native
  def setProperty(property: labelValign, value: bottom): Unit = js.native
  def setProperty(property: labelValign, value: center): Unit = js.native
  def setProperty(property: labelValign, value: top): Unit = js.native
  def setProperty(
    property: pattern,
    value: smallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle | largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | none
  ): Unit = js.native
  def setProperty(property: selectable, value: auto): Unit = js.native
  def setProperty(property: selectable, value: off): Unit = js.native
  def setProperty[T /* <: String */](property: T, value: JetSetPropertyType[T, ojTreemapNodeSettableProperties]): Unit = js.native
  @JSName("setProperty")
  def setProperty_categories(property: categories, value: js.Array[String]): Unit = js.native
  @JSName("setProperty")
  def setProperty_color(property: color, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_header(property: header, value: AnonIsolate): Unit = js.native
  @JSName("setProperty")
  def setProperty_label(property: label, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_labelStyle(property: labelStyle, value: js.Object): Unit = js.native
  @JSName("setProperty")
  def setProperty_shortDesc(property: shortDesc, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_svgClassName(property: svgClassName, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_svgStyle(property: svgStyle, value: js.Object): Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: value, value: Double): Unit = js.native
}

