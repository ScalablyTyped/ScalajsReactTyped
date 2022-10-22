package typingsJapgolly.antvGLite

import typingsJapgolly.antvGLite.anon.Segments
import typingsJapgolly.antvGLite.antvGLiteStrings._empty
import typingsJapgolly.antvGLite.antvGLiteStrings.`class`
import typingsJapgolly.antvGLite.antvGLiteStrings.all
import typingsJapgolly.antvGLite.antvGLiteStrings.anchor
import typingsJapgolly.antvGLite.antvGLiteStrings.auto
import typingsJapgolly.antvGLite.antvGLiteStrings.both
import typingsJapgolly.antvGLite.antvGLiteStrings.clipPath
import typingsJapgolly.antvGLite.antvGLiteStrings.clipPathTargets
import typingsJapgolly.antvGLite.antvGLiteStrings.cursor
import typingsJapgolly.antvGLite.antvGLiteStrings.display
import typingsJapgolly.antvGLite.antvGLiteStrings.draggable
import typingsJapgolly.antvGLite.antvGLiteStrings.droppable
import typingsJapgolly.antvGLite.antvGLiteStrings.fill
import typingsJapgolly.antvGLite.antvGLiteStrings.fillOpacity
import typingsJapgolly.antvGLite.antvGLiteStrings.filter
import typingsJapgolly.antvGLite.antvGLiteStrings.hidden
import typingsJapgolly.antvGLite.antvGLiteStrings.hitArea
import typingsJapgolly.antvGLite.antvGLiteStrings.increasedLineWidthForHitTesting
import typingsJapgolly.antvGLite.antvGLiteStrings.inner
import typingsJapgolly.antvGLite.antvGLiteStrings.isClosed
import typingsJapgolly.antvGLite.antvGLiteStrings.lineCap
import typingsJapgolly.antvGLite.antvGLiteStrings.lineDash
import typingsJapgolly.antvGLite.antvGLiteStrings.lineDashOffset
import typingsJapgolly.antvGLite.antvGLiteStrings.lineJoin
import typingsJapgolly.antvGLite.antvGLiteStrings.lineWidth
import typingsJapgolly.antvGLite.antvGLiteStrings.markerEnd
import typingsJapgolly.antvGLite.antvGLiteStrings.markerEndOffset
import typingsJapgolly.antvGLite.antvGLiteStrings.markerMid
import typingsJapgolly.antvGLite.antvGLiteStrings.markerStart
import typingsJapgolly.antvGLite.antvGLiteStrings.markerStartOffset
import typingsJapgolly.antvGLite.antvGLiteStrings.miterLimit
import typingsJapgolly.antvGLite.antvGLiteStrings.none
import typingsJapgolly.antvGLite.antvGLiteStrings.offsetDistance
import typingsJapgolly.antvGLite.antvGLiteStrings.offsetPath
import typingsJapgolly.antvGLite.antvGLiteStrings.offsetPathTargets
import typingsJapgolly.antvGLite.antvGLiteStrings.opacity
import typingsJapgolly.antvGLite.antvGLiteStrings.outer
import typingsJapgolly.antvGLite.antvGLiteStrings.painted
import typingsJapgolly.antvGLite.antvGLiteStrings.pointerEvents
import typingsJapgolly.antvGLite.antvGLiteStrings.points
import typingsJapgolly.antvGLite.antvGLiteStrings.shadowBlur
import typingsJapgolly.antvGLite.antvGLiteStrings.shadowColor
import typingsJapgolly.antvGLite.antvGLiteStrings.shadowOffsetX
import typingsJapgolly.antvGLite.antvGLiteStrings.shadowOffsetY
import typingsJapgolly.antvGLite.antvGLiteStrings.shadowType
import typingsJapgolly.antvGLite.antvGLiteStrings.stroke
import typingsJapgolly.antvGLite.antvGLiteStrings.strokeDasharray
import typingsJapgolly.antvGLite.antvGLiteStrings.strokeDashoffset
import typingsJapgolly.antvGLite.antvGLiteStrings.strokeLinecap
import typingsJapgolly.antvGLite.antvGLiteStrings.strokeLinejoin
import typingsJapgolly.antvGLite.antvGLiteStrings.strokeOpacity
import typingsJapgolly.antvGLite.antvGLiteStrings.strokeWidth
import typingsJapgolly.antvGLite.antvGLiteStrings.textTransform
import typingsJapgolly.antvGLite.antvGLiteStrings.transform
import typingsJapgolly.antvGLite.antvGLiteStrings.transformOrigin
import typingsJapgolly.antvGLite.antvGLiteStrings.visibility
import typingsJapgolly.antvGLite.antvGLiteStrings.visible
import typingsJapgolly.antvGLite.antvGLiteStrings.visiblefill
import typingsJapgolly.antvGLite.antvGLiteStrings.visiblepainted
import typingsJapgolly.antvGLite.antvGLiteStrings.visiblestroke
import typingsJapgolly.antvGLite.antvGLiteStrings.zIndex
import typingsJapgolly.antvGLite.distCssMod.CSSGradientValue
import typingsJapgolly.antvGLite.distCssMod.CSSRGB
import typingsJapgolly.antvGLite.distCssMod.CSSUnitValue
import typingsJapgolly.antvGLite.distCssParserColorMod.Pattern
import typingsJapgolly.antvGLite.distCssParserFilterMod.ParsedFilterStyleProperty
import typingsJapgolly.antvGLite.distCssParserTransformMod.ParsedTransform
import typingsJapgolly.antvGLite.distCssStyleValueRegistryMod.CSSGlobalKeywords
import typingsJapgolly.antvGLite.distDisplayObjectsDisplayObjectMod.DisplayObject
import typingsJapgolly.antvGLite.distDomInterfacesMod.DisplayObjectConfig
import typingsJapgolly.antvGLite.distTypesMod.BaseStyleProps
import typingsJapgolly.antvGLite.distTypesMod.ColorType
import typingsJapgolly.antvGLite.distTypesMod.Cursor
import typingsJapgolly.antvGLite.distTypesMod.ParsedBaseStyleProps
import typingsJapgolly.antvGLite.distTypesMod.TextTransform
import typingsJapgolly.glMatrix.mod.vec2
import typingsJapgolly.glMatrix.mod.vec3
import typingsJapgolly.std.CanvasLineCap
import typingsJapgolly.std.CanvasLineJoin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDisplayObjectsPolygonMod {
  
  @JSImport("@antv/g-lite/dist/display-objects/Polygon", "Polygon")
  @js.native
  open class Polygon () extends DisplayObject[PolygonStyleProps, ParsedPolygonStyleProps] {
    def this(hasStyleRest: DisplayObjectConfig[PolygonStyleProps]) = this()
    
    def attributeChangedCallback(
      attrName: pointerEvents,
      oldValue: js.UndefOr[
          none | auto | stroke | fill | painted | visible | visiblestroke | visiblefill | visiblepainted | all | CSSGlobalKeywords
        ],
      newValue: js.UndefOr[
          none | auto | stroke | fill | painted | visible | visiblestroke | visiblefill | visiblepainted | all | CSSGlobalKeywords
        ],
      prevParsedValue: js.UndefOr[
          none | auto | stroke | fill | painted | visible | visiblestroke | visiblefill | visiblepainted | all | CSSGlobalKeywords
        ],
      newParsedValue: js.UndefOr[
          none | auto | stroke | fill | painted | visible | visiblestroke | visiblefill | visiblepainted | all | CSSGlobalKeywords
        ]
    ): Unit = js.native
    def attributeChangedCallback(attrName: shadowType, oldValue: inner | outer | both): Unit = js.native
    def attributeChangedCallback(attrName: shadowType, oldValue: inner | outer | both, newValue: inner | outer | both): Unit = js.native
    def attributeChangedCallback(
      attrName: shadowType,
      oldValue: inner | outer | both,
      newValue: inner | outer | both,
      prevParsedValue: inner | outer | both
    ): Unit = js.native
    def attributeChangedCallback(
      attrName: shadowType,
      oldValue: inner | outer | both,
      newValue: inner | outer | both,
      prevParsedValue: inner | outer | both,
      newParsedValue: inner | outer | both
    ): Unit = js.native
    def attributeChangedCallback(
      attrName: shadowType,
      oldValue: inner | outer | both,
      newValue: inner | outer | both,
      prevParsedValue: Unit,
      newParsedValue: inner | outer | both
    ): Unit = js.native
    def attributeChangedCallback(
      attrName: shadowType,
      oldValue: inner | outer | both,
      newValue: Unit,
      prevParsedValue: inner | outer | both
    ): Unit = js.native
    def attributeChangedCallback(
      attrName: shadowType,
      oldValue: inner | outer | both,
      newValue: Unit,
      prevParsedValue: inner | outer | both,
      newParsedValue: inner | outer | both
    ): Unit = js.native
    def attributeChangedCallback(
      attrName: shadowType,
      oldValue: inner | outer | both,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: inner | outer | both
    ): Unit = js.native
    def attributeChangedCallback(attrName: shadowType, oldValue: Unit, newValue: inner | outer | both): Unit = js.native
    def attributeChangedCallback(
      attrName: shadowType,
      oldValue: Unit,
      newValue: inner | outer | both,
      prevParsedValue: inner | outer | both
    ): Unit = js.native
    def attributeChangedCallback(
      attrName: shadowType,
      oldValue: Unit,
      newValue: inner | outer | both,
      prevParsedValue: inner | outer | both,
      newParsedValue: inner | outer | both
    ): Unit = js.native
    def attributeChangedCallback(
      attrName: shadowType,
      oldValue: Unit,
      newValue: inner | outer | both,
      prevParsedValue: Unit,
      newParsedValue: inner | outer | both
    ): Unit = js.native
    def attributeChangedCallback(attrName: shadowType, oldValue: Unit, newValue: Unit, prevParsedValue: inner | outer | both): Unit = js.native
    def attributeChangedCallback(
      attrName: shadowType,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: inner | outer | both,
      newParsedValue: inner | outer | both
    ): Unit = js.native
    def attributeChangedCallback(
      attrName: shadowType,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: inner | outer | both
    ): Unit = js.native
    def attributeChangedCallback(
      attrName: visibility,
      oldValue: js.UndefOr[visible | hidden | CSSGlobalKeywords],
      newValue: js.UndefOr[visible | hidden | CSSGlobalKeywords],
      prevParsedValue: js.UndefOr[visible | hidden | CSSGlobalKeywords],
      newParsedValue: js.UndefOr[visible | hidden | CSSGlobalKeywords]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_anchor(
      attrName: anchor,
      oldValue: js.UndefOr[vec2 | vec3 | String],
      newValue: js.UndefOr[vec2 | vec3 | String],
      prevParsedValue: js.UndefOr[js.Tuple3[Double, Double, Double]],
      newParsedValue: js.UndefOr[js.Tuple3[Double, Double, Double]]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_class(attrName: `class`): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_class(attrName: `class`, oldValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_class(attrName: `class`, oldValue: String, newValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_class(attrName: `class`, oldValue: String, newValue: String, prevParsedValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_class(
      attrName: `class`,
      oldValue: String,
      newValue: String,
      prevParsedValue: String,
      newParsedValue: String
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_class(
      attrName: `class`,
      oldValue: String,
      newValue: String,
      prevParsedValue: Unit,
      newParsedValue: String
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_class(attrName: `class`, oldValue: String, newValue: Unit, prevParsedValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_class(
      attrName: `class`,
      oldValue: String,
      newValue: Unit,
      prevParsedValue: String,
      newParsedValue: String
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_class(attrName: `class`, oldValue: String, newValue: Unit, prevParsedValue: Unit, newParsedValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_class(attrName: `class`, oldValue: Unit, newValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_class(attrName: `class`, oldValue: Unit, newValue: String, prevParsedValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_class(
      attrName: `class`,
      oldValue: Unit,
      newValue: String,
      prevParsedValue: String,
      newParsedValue: String
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_class(attrName: `class`, oldValue: Unit, newValue: String, prevParsedValue: Unit, newParsedValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_class(attrName: `class`, oldValue: Unit, newValue: Unit, prevParsedValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_class(attrName: `class`, oldValue: Unit, newValue: Unit, prevParsedValue: String, newParsedValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_class(attrName: `class`, oldValue: Unit, newValue: Unit, prevParsedValue: Unit, newParsedValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_clipPath(
      attrName: clipPath,
      oldValue: js.UndefOr[(typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]) | Null],
      newValue: js.UndefOr[(typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]) | Null],
      prevParsedValue: js.UndefOr[(typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]) | Null],
      newParsedValue: js.UndefOr[(typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]) | Null]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_clipPathTargets(attrName: clipPathTargets): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_clipPathTargets(
      attrName: clipPathTargets,
      oldValue: js.Array[typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_clipPathTargets(
      attrName: clipPathTargets,
      oldValue: js.Array[typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]],
      newValue: js.Array[typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_clipPathTargets(
      attrName: clipPathTargets,
      oldValue: js.Array[typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]],
      newValue: js.Array[typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]],
      prevParsedValue: js.Array[typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_clipPathTargets(
      attrName: clipPathTargets,
      oldValue: js.Array[typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]],
      newValue: js.Array[typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]],
      prevParsedValue: js.Array[typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]],
      newParsedValue: js.Array[typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_clipPathTargets(
      attrName: clipPathTargets,
      oldValue: js.Array[typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]],
      newValue: js.Array[typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]],
      prevParsedValue: Unit,
      newParsedValue: js.Array[typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_clipPathTargets(
      attrName: clipPathTargets,
      oldValue: js.Array[typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]],
      newValue: Unit,
      prevParsedValue: js.Array[typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_clipPathTargets(
      attrName: clipPathTargets,
      oldValue: js.Array[typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]],
      newValue: Unit,
      prevParsedValue: js.Array[typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]],
      newParsedValue: js.Array[typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_clipPathTargets(
      attrName: clipPathTargets,
      oldValue: js.Array[typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]],
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: js.Array[typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_clipPathTargets(
      attrName: clipPathTargets,
      oldValue: Unit,
      newValue: js.Array[typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_clipPathTargets(
      attrName: clipPathTargets,
      oldValue: Unit,
      newValue: js.Array[typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]],
      prevParsedValue: js.Array[typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_clipPathTargets(
      attrName: clipPathTargets,
      oldValue: Unit,
      newValue: js.Array[typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]],
      prevParsedValue: js.Array[typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]],
      newParsedValue: js.Array[typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_clipPathTargets(
      attrName: clipPathTargets,
      oldValue: Unit,
      newValue: js.Array[typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]],
      prevParsedValue: Unit,
      newParsedValue: js.Array[typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_clipPathTargets(
      attrName: clipPathTargets,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: js.Array[typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_clipPathTargets(
      attrName: clipPathTargets,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: js.Array[typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]],
      newParsedValue: js.Array[typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_clipPathTargets(
      attrName: clipPathTargets,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: js.Array[typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_cursor(attrName: cursor): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_cursor(attrName: cursor, oldValue: Unit, newValue: Unit, prevParsedValue: Unit, newParsedValue: Cursor): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_cursor(attrName: cursor, oldValue: Unit, newValue: Unit, prevParsedValue: Cursor): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_cursor(attrName: cursor, oldValue: Unit, newValue: Unit, prevParsedValue: Cursor, newParsedValue: Cursor): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_cursor(attrName: cursor, oldValue: Unit, newValue: Cursor): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_cursor(attrName: cursor, oldValue: Unit, newValue: Cursor, prevParsedValue: Unit, newParsedValue: Cursor): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_cursor(attrName: cursor, oldValue: Unit, newValue: Cursor, prevParsedValue: Cursor): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_cursor(
      attrName: cursor,
      oldValue: Unit,
      newValue: Cursor,
      prevParsedValue: Cursor,
      newParsedValue: Cursor
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_cursor(attrName: cursor, oldValue: Cursor): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_cursor(attrName: cursor, oldValue: Cursor, newValue: Unit, prevParsedValue: Unit, newParsedValue: Cursor): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_cursor(attrName: cursor, oldValue: Cursor, newValue: Unit, prevParsedValue: Cursor): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_cursor(
      attrName: cursor,
      oldValue: Cursor,
      newValue: Unit,
      prevParsedValue: Cursor,
      newParsedValue: Cursor
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_cursor(attrName: cursor, oldValue: Cursor, newValue: Cursor): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_cursor(
      attrName: cursor,
      oldValue: Cursor,
      newValue: Cursor,
      prevParsedValue: Unit,
      newParsedValue: Cursor
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_cursor(attrName: cursor, oldValue: Cursor, newValue: Cursor, prevParsedValue: Cursor): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_cursor(
      attrName: cursor,
      oldValue: Cursor,
      newValue: Cursor,
      prevParsedValue: Cursor,
      newParsedValue: Cursor
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_display(attrName: display): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_display(attrName: display, oldValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_display(attrName: display, oldValue: String, newValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_display(attrName: display, oldValue: String, newValue: String, prevParsedValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_display(
      attrName: display,
      oldValue: String,
      newValue: String,
      prevParsedValue: String,
      newParsedValue: String
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_display(
      attrName: display,
      oldValue: String,
      newValue: String,
      prevParsedValue: Unit,
      newParsedValue: String
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_display(attrName: display, oldValue: String, newValue: Unit, prevParsedValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_display(
      attrName: display,
      oldValue: String,
      newValue: Unit,
      prevParsedValue: String,
      newParsedValue: String
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_display(attrName: display, oldValue: String, newValue: Unit, prevParsedValue: Unit, newParsedValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_display(attrName: display, oldValue: Unit, newValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_display(attrName: display, oldValue: Unit, newValue: String, prevParsedValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_display(
      attrName: display,
      oldValue: Unit,
      newValue: String,
      prevParsedValue: String,
      newParsedValue: String
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_display(attrName: display, oldValue: Unit, newValue: String, prevParsedValue: Unit, newParsedValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_display(attrName: display, oldValue: Unit, newValue: Unit, prevParsedValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_display(attrName: display, oldValue: Unit, newValue: Unit, prevParsedValue: String, newParsedValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_display(attrName: display, oldValue: Unit, newValue: Unit, prevParsedValue: Unit, newParsedValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_draggable(attrName: draggable): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_draggable(attrName: draggable, oldValue: Boolean): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_draggable(attrName: draggable, oldValue: Boolean, newValue: Boolean): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_draggable(attrName: draggable, oldValue: Boolean, newValue: Boolean, prevParsedValue: Boolean): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_draggable(
      attrName: draggable,
      oldValue: Boolean,
      newValue: Boolean,
      prevParsedValue: Boolean,
      newParsedValue: Boolean
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_draggable(
      attrName: draggable,
      oldValue: Boolean,
      newValue: Boolean,
      prevParsedValue: Unit,
      newParsedValue: Boolean
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_draggable(attrName: draggable, oldValue: Boolean, newValue: Unit, prevParsedValue: Boolean): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_draggable(
      attrName: draggable,
      oldValue: Boolean,
      newValue: Unit,
      prevParsedValue: Boolean,
      newParsedValue: Boolean
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_draggable(
      attrName: draggable,
      oldValue: Boolean,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: Boolean
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_draggable(attrName: draggable, oldValue: Unit, newValue: Boolean): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_draggable(attrName: draggable, oldValue: Unit, newValue: Boolean, prevParsedValue: Boolean): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_draggable(
      attrName: draggable,
      oldValue: Unit,
      newValue: Boolean,
      prevParsedValue: Boolean,
      newParsedValue: Boolean
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_draggable(
      attrName: draggable,
      oldValue: Unit,
      newValue: Boolean,
      prevParsedValue: Unit,
      newParsedValue: Boolean
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_draggable(attrName: draggable, oldValue: Unit, newValue: Unit, prevParsedValue: Boolean): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_draggable(
      attrName: draggable,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Boolean,
      newParsedValue: Boolean
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_draggable(
      attrName: draggable,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: Boolean
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_droppable(attrName: droppable): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_droppable(attrName: droppable, oldValue: Boolean): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_droppable(attrName: droppable, oldValue: Boolean, newValue: Boolean): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_droppable(attrName: droppable, oldValue: Boolean, newValue: Boolean, prevParsedValue: Boolean): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_droppable(
      attrName: droppable,
      oldValue: Boolean,
      newValue: Boolean,
      prevParsedValue: Boolean,
      newParsedValue: Boolean
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_droppable(
      attrName: droppable,
      oldValue: Boolean,
      newValue: Boolean,
      prevParsedValue: Unit,
      newParsedValue: Boolean
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_droppable(attrName: droppable, oldValue: Boolean, newValue: Unit, prevParsedValue: Boolean): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_droppable(
      attrName: droppable,
      oldValue: Boolean,
      newValue: Unit,
      prevParsedValue: Boolean,
      newParsedValue: Boolean
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_droppable(
      attrName: droppable,
      oldValue: Boolean,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: Boolean
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_droppable(attrName: droppable, oldValue: Unit, newValue: Boolean): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_droppable(attrName: droppable, oldValue: Unit, newValue: Boolean, prevParsedValue: Boolean): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_droppable(
      attrName: droppable,
      oldValue: Unit,
      newValue: Boolean,
      prevParsedValue: Boolean,
      newParsedValue: Boolean
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_droppable(
      attrName: droppable,
      oldValue: Unit,
      newValue: Boolean,
      prevParsedValue: Unit,
      newParsedValue: Boolean
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_droppable(attrName: droppable, oldValue: Unit, newValue: Unit, prevParsedValue: Boolean): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_droppable(
      attrName: droppable,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Boolean,
      newParsedValue: Boolean
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_droppable(
      attrName: droppable,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: Boolean
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fill(
      attrName: fill,
      oldValue: js.UndefOr[ColorType | Pattern],
      newValue: js.UndefOr[ColorType | Pattern],
      prevParsedValue: js.UndefOr[CSSRGB | js.Array[CSSGradientValue] | Pattern],
      newParsedValue: js.UndefOr[CSSRGB | js.Array[CSSGradientValue] | Pattern]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(attrName: fillOpacity): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(attrName: fillOpacity, oldValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(attrName: fillOpacity, oldValue: String, newValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(attrName: fillOpacity, oldValue: String, newValue: String, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(
      attrName: fillOpacity,
      oldValue: String,
      newValue: String,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(
      attrName: fillOpacity,
      oldValue: String,
      newValue: String,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(attrName: fillOpacity, oldValue: String, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(attrName: fillOpacity, oldValue: String, newValue: Double, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(
      attrName: fillOpacity,
      oldValue: String,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(
      attrName: fillOpacity,
      oldValue: String,
      newValue: Double,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(attrName: fillOpacity, oldValue: String, newValue: Unit, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(
      attrName: fillOpacity,
      oldValue: String,
      newValue: Unit,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(
      attrName: fillOpacity,
      oldValue: String,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(attrName: fillOpacity, oldValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(attrName: fillOpacity, oldValue: Double, newValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(attrName: fillOpacity, oldValue: Double, newValue: String, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(
      attrName: fillOpacity,
      oldValue: Double,
      newValue: String,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(
      attrName: fillOpacity,
      oldValue: Double,
      newValue: String,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(attrName: fillOpacity, oldValue: Double, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(attrName: fillOpacity, oldValue: Double, newValue: Double, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(
      attrName: fillOpacity,
      oldValue: Double,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(
      attrName: fillOpacity,
      oldValue: Double,
      newValue: Double,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(attrName: fillOpacity, oldValue: Double, newValue: Unit, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(
      attrName: fillOpacity,
      oldValue: Double,
      newValue: Unit,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(
      attrName: fillOpacity,
      oldValue: Double,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(attrName: fillOpacity, oldValue: Unit, newValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(attrName: fillOpacity, oldValue: Unit, newValue: String, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(
      attrName: fillOpacity,
      oldValue: Unit,
      newValue: String,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(
      attrName: fillOpacity,
      oldValue: Unit,
      newValue: String,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(attrName: fillOpacity, oldValue: Unit, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(attrName: fillOpacity, oldValue: Unit, newValue: Double, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(
      attrName: fillOpacity,
      oldValue: Unit,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(
      attrName: fillOpacity,
      oldValue: Unit,
      newValue: Double,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(attrName: fillOpacity, oldValue: Unit, newValue: Unit, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(
      attrName: fillOpacity,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_fillOpacity(
      attrName: fillOpacity,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_filter(attrName: filter): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_filter(attrName: filter, oldValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_filter(attrName: filter, oldValue: String, newValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_filter(
      attrName: filter,
      oldValue: String,
      newValue: String,
      prevParsedValue: js.Array[ParsedFilterStyleProperty]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_filter(
      attrName: filter,
      oldValue: String,
      newValue: String,
      prevParsedValue: js.Array[ParsedFilterStyleProperty],
      newParsedValue: js.Array[ParsedFilterStyleProperty]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_filter(
      attrName: filter,
      oldValue: String,
      newValue: String,
      prevParsedValue: Unit,
      newParsedValue: js.Array[ParsedFilterStyleProperty]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_filter(
      attrName: filter,
      oldValue: String,
      newValue: Unit,
      prevParsedValue: js.Array[ParsedFilterStyleProperty]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_filter(
      attrName: filter,
      oldValue: String,
      newValue: Unit,
      prevParsedValue: js.Array[ParsedFilterStyleProperty],
      newParsedValue: js.Array[ParsedFilterStyleProperty]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_filter(
      attrName: filter,
      oldValue: String,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: js.Array[ParsedFilterStyleProperty]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_filter(attrName: filter, oldValue: Unit, newValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_filter(
      attrName: filter,
      oldValue: Unit,
      newValue: String,
      prevParsedValue: js.Array[ParsedFilterStyleProperty]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_filter(
      attrName: filter,
      oldValue: Unit,
      newValue: String,
      prevParsedValue: js.Array[ParsedFilterStyleProperty],
      newParsedValue: js.Array[ParsedFilterStyleProperty]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_filter(
      attrName: filter,
      oldValue: Unit,
      newValue: String,
      prevParsedValue: Unit,
      newParsedValue: js.Array[ParsedFilterStyleProperty]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_filter(
      attrName: filter,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: js.Array[ParsedFilterStyleProperty]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_filter(
      attrName: filter,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: js.Array[ParsedFilterStyleProperty],
      newParsedValue: js.Array[ParsedFilterStyleProperty]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_filter(
      attrName: filter,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: js.Array[ParsedFilterStyleProperty]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_hitArea(
      attrName: hitArea,
      oldValue: js.UndefOr[(typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]) | Null],
      newValue: js.UndefOr[(typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]) | Null],
      prevParsedValue: js.UndefOr[(typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]) | Null],
      newParsedValue: js.UndefOr[(typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]) | Null]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(attrName: increasedLineWidthForHitTesting): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(attrName: increasedLineWidthForHitTesting, oldValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(attrName: increasedLineWidthForHitTesting, oldValue: String, newValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(
      attrName: increasedLineWidthForHitTesting,
      oldValue: String,
      newValue: String,
      prevParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(
      attrName: increasedLineWidthForHitTesting,
      oldValue: String,
      newValue: String,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(
      attrName: increasedLineWidthForHitTesting,
      oldValue: String,
      newValue: String,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(attrName: increasedLineWidthForHitTesting, oldValue: String, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(
      attrName: increasedLineWidthForHitTesting,
      oldValue: String,
      newValue: Double,
      prevParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(
      attrName: increasedLineWidthForHitTesting,
      oldValue: String,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(
      attrName: increasedLineWidthForHitTesting,
      oldValue: String,
      newValue: Double,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(
      attrName: increasedLineWidthForHitTesting,
      oldValue: String,
      newValue: Unit,
      prevParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(
      attrName: increasedLineWidthForHitTesting,
      oldValue: String,
      newValue: Unit,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(
      attrName: increasedLineWidthForHitTesting,
      oldValue: String,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(attrName: increasedLineWidthForHitTesting, oldValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(attrName: increasedLineWidthForHitTesting, oldValue: Double, newValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(
      attrName: increasedLineWidthForHitTesting,
      oldValue: Double,
      newValue: String,
      prevParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(
      attrName: increasedLineWidthForHitTesting,
      oldValue: Double,
      newValue: String,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(
      attrName: increasedLineWidthForHitTesting,
      oldValue: Double,
      newValue: String,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(attrName: increasedLineWidthForHitTesting, oldValue: Double, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(
      attrName: increasedLineWidthForHitTesting,
      oldValue: Double,
      newValue: Double,
      prevParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(
      attrName: increasedLineWidthForHitTesting,
      oldValue: Double,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(
      attrName: increasedLineWidthForHitTesting,
      oldValue: Double,
      newValue: Double,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(
      attrName: increasedLineWidthForHitTesting,
      oldValue: Double,
      newValue: Unit,
      prevParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(
      attrName: increasedLineWidthForHitTesting,
      oldValue: Double,
      newValue: Unit,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(
      attrName: increasedLineWidthForHitTesting,
      oldValue: Double,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(attrName: increasedLineWidthForHitTesting, oldValue: Unit, newValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(
      attrName: increasedLineWidthForHitTesting,
      oldValue: Unit,
      newValue: String,
      prevParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(
      attrName: increasedLineWidthForHitTesting,
      oldValue: Unit,
      newValue: String,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(
      attrName: increasedLineWidthForHitTesting,
      oldValue: Unit,
      newValue: String,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(attrName: increasedLineWidthForHitTesting, oldValue: Unit, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(
      attrName: increasedLineWidthForHitTesting,
      oldValue: Unit,
      newValue: Double,
      prevParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(
      attrName: increasedLineWidthForHitTesting,
      oldValue: Unit,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(
      attrName: increasedLineWidthForHitTesting,
      oldValue: Unit,
      newValue: Double,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(attrName: increasedLineWidthForHitTesting, oldValue: Unit, newValue: Unit, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(
      attrName: increasedLineWidthForHitTesting,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_increasedLineWidthForHitTesting(
      attrName: increasedLineWidthForHitTesting,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_isClosed(attrName: isClosed): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_isClosed(attrName: isClosed, oldValue: Boolean): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_isClosed(attrName: isClosed, oldValue: Boolean, newValue: Boolean): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_isClosed(attrName: isClosed, oldValue: Boolean, newValue: Boolean, prevParsedValue: Boolean): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_isClosed(
      attrName: isClosed,
      oldValue: Boolean,
      newValue: Boolean,
      prevParsedValue: Boolean,
      newParsedValue: Boolean
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_isClosed(
      attrName: isClosed,
      oldValue: Boolean,
      newValue: Boolean,
      prevParsedValue: Unit,
      newParsedValue: Boolean
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_isClosed(attrName: isClosed, oldValue: Boolean, newValue: Unit, prevParsedValue: Boolean): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_isClosed(
      attrName: isClosed,
      oldValue: Boolean,
      newValue: Unit,
      prevParsedValue: Boolean,
      newParsedValue: Boolean
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_isClosed(
      attrName: isClosed,
      oldValue: Boolean,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: Boolean
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_isClosed(attrName: isClosed, oldValue: Unit, newValue: Boolean): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_isClosed(attrName: isClosed, oldValue: Unit, newValue: Boolean, prevParsedValue: Boolean): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_isClosed(
      attrName: isClosed,
      oldValue: Unit,
      newValue: Boolean,
      prevParsedValue: Boolean,
      newParsedValue: Boolean
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_isClosed(
      attrName: isClosed,
      oldValue: Unit,
      newValue: Boolean,
      prevParsedValue: Unit,
      newParsedValue: Boolean
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_isClosed(attrName: isClosed, oldValue: Unit, newValue: Unit, prevParsedValue: Boolean): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_isClosed(
      attrName: isClosed,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Boolean,
      newParsedValue: Boolean
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_isClosed(attrName: isClosed, oldValue: Unit, newValue: Unit, prevParsedValue: Unit, newParsedValue: Boolean): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineCap(attrName: lineCap): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineCap(
      attrName: lineCap,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: CanvasLineCap
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineCap(attrName: lineCap, oldValue: Unit, newValue: Unit, prevParsedValue: CanvasLineCap): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineCap(
      attrName: lineCap,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: CanvasLineCap,
      newParsedValue: CanvasLineCap
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineCap(attrName: lineCap, oldValue: Unit, newValue: CanvasLineCap): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineCap(
      attrName: lineCap,
      oldValue: Unit,
      newValue: CanvasLineCap,
      prevParsedValue: Unit,
      newParsedValue: CanvasLineCap
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineCap(attrName: lineCap, oldValue: Unit, newValue: CanvasLineCap, prevParsedValue: CanvasLineCap): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineCap(
      attrName: lineCap,
      oldValue: Unit,
      newValue: CanvasLineCap,
      prevParsedValue: CanvasLineCap,
      newParsedValue: CanvasLineCap
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineCap(attrName: lineCap, oldValue: CanvasLineCap): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineCap(
      attrName: lineCap,
      oldValue: CanvasLineCap,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: CanvasLineCap
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineCap(attrName: lineCap, oldValue: CanvasLineCap, newValue: Unit, prevParsedValue: CanvasLineCap): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineCap(
      attrName: lineCap,
      oldValue: CanvasLineCap,
      newValue: Unit,
      prevParsedValue: CanvasLineCap,
      newParsedValue: CanvasLineCap
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineCap(attrName: lineCap, oldValue: CanvasLineCap, newValue: CanvasLineCap): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineCap(
      attrName: lineCap,
      oldValue: CanvasLineCap,
      newValue: CanvasLineCap,
      prevParsedValue: Unit,
      newParsedValue: CanvasLineCap
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineCap(
      attrName: lineCap,
      oldValue: CanvasLineCap,
      newValue: CanvasLineCap,
      prevParsedValue: CanvasLineCap
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineCap(
      attrName: lineCap,
      oldValue: CanvasLineCap,
      newValue: CanvasLineCap,
      prevParsedValue: CanvasLineCap,
      newParsedValue: CanvasLineCap
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineDash(
      attrName: lineDash,
      oldValue: js.UndefOr[Double | String | (js.Array[String | Double])],
      newValue: js.UndefOr[Double | String | (js.Array[String | Double])],
      prevParsedValue: js.UndefOr[js.Tuple2[Double, Double]],
      newParsedValue: js.UndefOr[js.Tuple2[Double, Double]]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineDashOffset(attrName: lineDashOffset): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineDashOffset(attrName: lineDashOffset, oldValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineDashOffset(attrName: lineDashOffset, oldValue: Double, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineDashOffset(attrName: lineDashOffset, oldValue: Double, newValue: Double, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineDashOffset(
      attrName: lineDashOffset,
      oldValue: Double,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineDashOffset(
      attrName: lineDashOffset,
      oldValue: Double,
      newValue: Double,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineDashOffset(attrName: lineDashOffset, oldValue: Double, newValue: Unit, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineDashOffset(
      attrName: lineDashOffset,
      oldValue: Double,
      newValue: Unit,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineDashOffset(
      attrName: lineDashOffset,
      oldValue: Double,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineDashOffset(attrName: lineDashOffset, oldValue: Unit, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineDashOffset(attrName: lineDashOffset, oldValue: Unit, newValue: Double, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineDashOffset(
      attrName: lineDashOffset,
      oldValue: Unit,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineDashOffset(
      attrName: lineDashOffset,
      oldValue: Unit,
      newValue: Double,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineDashOffset(attrName: lineDashOffset, oldValue: Unit, newValue: Unit, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineDashOffset(
      attrName: lineDashOffset,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineDashOffset(
      attrName: lineDashOffset,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineJoin(attrName: lineJoin): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineJoin(
      attrName: lineJoin,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: CanvasLineJoin
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineJoin(attrName: lineJoin, oldValue: Unit, newValue: Unit, prevParsedValue: CanvasLineJoin): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineJoin(
      attrName: lineJoin,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: CanvasLineJoin,
      newParsedValue: CanvasLineJoin
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineJoin(attrName: lineJoin, oldValue: Unit, newValue: CanvasLineJoin): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineJoin(
      attrName: lineJoin,
      oldValue: Unit,
      newValue: CanvasLineJoin,
      prevParsedValue: Unit,
      newParsedValue: CanvasLineJoin
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineJoin(attrName: lineJoin, oldValue: Unit, newValue: CanvasLineJoin, prevParsedValue: CanvasLineJoin): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineJoin(
      attrName: lineJoin,
      oldValue: Unit,
      newValue: CanvasLineJoin,
      prevParsedValue: CanvasLineJoin,
      newParsedValue: CanvasLineJoin
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineJoin(attrName: lineJoin, oldValue: CanvasLineJoin): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineJoin(
      attrName: lineJoin,
      oldValue: CanvasLineJoin,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: CanvasLineJoin
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineJoin(attrName: lineJoin, oldValue: CanvasLineJoin, newValue: Unit, prevParsedValue: CanvasLineJoin): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineJoin(
      attrName: lineJoin,
      oldValue: CanvasLineJoin,
      newValue: Unit,
      prevParsedValue: CanvasLineJoin,
      newParsedValue: CanvasLineJoin
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineJoin(attrName: lineJoin, oldValue: CanvasLineJoin, newValue: CanvasLineJoin): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineJoin(
      attrName: lineJoin,
      oldValue: CanvasLineJoin,
      newValue: CanvasLineJoin,
      prevParsedValue: Unit,
      newParsedValue: CanvasLineJoin
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineJoin(
      attrName: lineJoin,
      oldValue: CanvasLineJoin,
      newValue: CanvasLineJoin,
      prevParsedValue: CanvasLineJoin
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineJoin(
      attrName: lineJoin,
      oldValue: CanvasLineJoin,
      newValue: CanvasLineJoin,
      prevParsedValue: CanvasLineJoin,
      newParsedValue: CanvasLineJoin
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(attrName: lineWidth): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(attrName: lineWidth, oldValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(attrName: lineWidth, oldValue: String, newValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(attrName: lineWidth, oldValue: String, newValue: String, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(
      attrName: lineWidth,
      oldValue: String,
      newValue: String,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(
      attrName: lineWidth,
      oldValue: String,
      newValue: String,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(attrName: lineWidth, oldValue: String, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(attrName: lineWidth, oldValue: String, newValue: Double, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(
      attrName: lineWidth,
      oldValue: String,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(
      attrName: lineWidth,
      oldValue: String,
      newValue: Double,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(attrName: lineWidth, oldValue: String, newValue: Unit, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(
      attrName: lineWidth,
      oldValue: String,
      newValue: Unit,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(
      attrName: lineWidth,
      oldValue: String,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(attrName: lineWidth, oldValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(attrName: lineWidth, oldValue: Double, newValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(attrName: lineWidth, oldValue: Double, newValue: String, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(
      attrName: lineWidth,
      oldValue: Double,
      newValue: String,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(
      attrName: lineWidth,
      oldValue: Double,
      newValue: String,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(attrName: lineWidth, oldValue: Double, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(attrName: lineWidth, oldValue: Double, newValue: Double, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(
      attrName: lineWidth,
      oldValue: Double,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(
      attrName: lineWidth,
      oldValue: Double,
      newValue: Double,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(attrName: lineWidth, oldValue: Double, newValue: Unit, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(
      attrName: lineWidth,
      oldValue: Double,
      newValue: Unit,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(
      attrName: lineWidth,
      oldValue: Double,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(attrName: lineWidth, oldValue: Unit, newValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(attrName: lineWidth, oldValue: Unit, newValue: String, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(
      attrName: lineWidth,
      oldValue: Unit,
      newValue: String,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(
      attrName: lineWidth,
      oldValue: Unit,
      newValue: String,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(attrName: lineWidth, oldValue: Unit, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(attrName: lineWidth, oldValue: Unit, newValue: Double, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(
      attrName: lineWidth,
      oldValue: Unit,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(
      attrName: lineWidth,
      oldValue: Unit,
      newValue: Double,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(attrName: lineWidth, oldValue: Unit, newValue: Unit, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(
      attrName: lineWidth,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_lineWidth(attrName: lineWidth, oldValue: Unit, newValue: Unit, prevParsedValue: Unit, newParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerEnd(attrName: markerEnd): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerEnd(
      attrName: markerEnd,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: DisplayObject[Any, Any]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerEnd(attrName: markerEnd, oldValue: Unit, newValue: Unit, prevParsedValue: DisplayObject[Any, Any]): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerEnd(
      attrName: markerEnd,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: DisplayObject[Any, Any],
      newParsedValue: DisplayObject[Any, Any]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerEnd(attrName: markerEnd, oldValue: Unit, newValue: DisplayObject[Any, Any]): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerEnd(
      attrName: markerEnd,
      oldValue: Unit,
      newValue: DisplayObject[Any, Any],
      prevParsedValue: Unit,
      newParsedValue: DisplayObject[Any, Any]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerEnd(
      attrName: markerEnd,
      oldValue: Unit,
      newValue: DisplayObject[Any, Any],
      prevParsedValue: DisplayObject[Any, Any]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerEnd(
      attrName: markerEnd,
      oldValue: Unit,
      newValue: DisplayObject[Any, Any],
      prevParsedValue: DisplayObject[Any, Any],
      newParsedValue: DisplayObject[Any, Any]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerEnd(attrName: markerEnd, oldValue: DisplayObject[Any, Any]): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerEnd(
      attrName: markerEnd,
      oldValue: DisplayObject[Any, Any],
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: DisplayObject[Any, Any]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerEnd(
      attrName: markerEnd,
      oldValue: DisplayObject[Any, Any],
      newValue: Unit,
      prevParsedValue: DisplayObject[Any, Any]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerEnd(
      attrName: markerEnd,
      oldValue: DisplayObject[Any, Any],
      newValue: Unit,
      prevParsedValue: DisplayObject[Any, Any],
      newParsedValue: DisplayObject[Any, Any]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerEnd(attrName: markerEnd, oldValue: DisplayObject[Any, Any], newValue: DisplayObject[Any, Any]): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerEnd(
      attrName: markerEnd,
      oldValue: DisplayObject[Any, Any],
      newValue: DisplayObject[Any, Any],
      prevParsedValue: Unit,
      newParsedValue: DisplayObject[Any, Any]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerEnd(
      attrName: markerEnd,
      oldValue: DisplayObject[Any, Any],
      newValue: DisplayObject[Any, Any],
      prevParsedValue: DisplayObject[Any, Any]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerEnd(
      attrName: markerEnd,
      oldValue: DisplayObject[Any, Any],
      newValue: DisplayObject[Any, Any],
      prevParsedValue: DisplayObject[Any, Any],
      newParsedValue: DisplayObject[Any, Any]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerEndOffset(attrName: markerEndOffset): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerEndOffset(attrName: markerEndOffset, oldValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerEndOffset(attrName: markerEndOffset, oldValue: Double, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerEndOffset(attrName: markerEndOffset, oldValue: Double, newValue: Double, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerEndOffset(
      attrName: markerEndOffset,
      oldValue: Double,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerEndOffset(
      attrName: markerEndOffset,
      oldValue: Double,
      newValue: Double,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerEndOffset(attrName: markerEndOffset, oldValue: Double, newValue: Unit, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerEndOffset(
      attrName: markerEndOffset,
      oldValue: Double,
      newValue: Unit,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerEndOffset(
      attrName: markerEndOffset,
      oldValue: Double,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerEndOffset(attrName: markerEndOffset, oldValue: Unit, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerEndOffset(attrName: markerEndOffset, oldValue: Unit, newValue: Double, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerEndOffset(
      attrName: markerEndOffset,
      oldValue: Unit,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerEndOffset(
      attrName: markerEndOffset,
      oldValue: Unit,
      newValue: Double,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerEndOffset(attrName: markerEndOffset, oldValue: Unit, newValue: Unit, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerEndOffset(
      attrName: markerEndOffset,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerEndOffset(
      attrName: markerEndOffset,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerMid(attrName: markerMid): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerMid(
      attrName: markerMid,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: DisplayObject[Any, Any]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerMid(attrName: markerMid, oldValue: Unit, newValue: Unit, prevParsedValue: DisplayObject[Any, Any]): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerMid(
      attrName: markerMid,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: DisplayObject[Any, Any],
      newParsedValue: DisplayObject[Any, Any]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerMid(attrName: markerMid, oldValue: Unit, newValue: DisplayObject[Any, Any]): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerMid(
      attrName: markerMid,
      oldValue: Unit,
      newValue: DisplayObject[Any, Any],
      prevParsedValue: Unit,
      newParsedValue: DisplayObject[Any, Any]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerMid(
      attrName: markerMid,
      oldValue: Unit,
      newValue: DisplayObject[Any, Any],
      prevParsedValue: DisplayObject[Any, Any]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerMid(
      attrName: markerMid,
      oldValue: Unit,
      newValue: DisplayObject[Any, Any],
      prevParsedValue: DisplayObject[Any, Any],
      newParsedValue: DisplayObject[Any, Any]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerMid(attrName: markerMid, oldValue: DisplayObject[Any, Any]): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerMid(
      attrName: markerMid,
      oldValue: DisplayObject[Any, Any],
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: DisplayObject[Any, Any]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerMid(
      attrName: markerMid,
      oldValue: DisplayObject[Any, Any],
      newValue: Unit,
      prevParsedValue: DisplayObject[Any, Any]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerMid(
      attrName: markerMid,
      oldValue: DisplayObject[Any, Any],
      newValue: Unit,
      prevParsedValue: DisplayObject[Any, Any],
      newParsedValue: DisplayObject[Any, Any]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerMid(attrName: markerMid, oldValue: DisplayObject[Any, Any], newValue: DisplayObject[Any, Any]): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerMid(
      attrName: markerMid,
      oldValue: DisplayObject[Any, Any],
      newValue: DisplayObject[Any, Any],
      prevParsedValue: Unit,
      newParsedValue: DisplayObject[Any, Any]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerMid(
      attrName: markerMid,
      oldValue: DisplayObject[Any, Any],
      newValue: DisplayObject[Any, Any],
      prevParsedValue: DisplayObject[Any, Any]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerMid(
      attrName: markerMid,
      oldValue: DisplayObject[Any, Any],
      newValue: DisplayObject[Any, Any],
      prevParsedValue: DisplayObject[Any, Any],
      newParsedValue: DisplayObject[Any, Any]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerStart(attrName: markerStart): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerStart(
      attrName: markerStart,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: DisplayObject[Any, Any]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerStart(attrName: markerStart, oldValue: Unit, newValue: Unit, prevParsedValue: DisplayObject[Any, Any]): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerStart(
      attrName: markerStart,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: DisplayObject[Any, Any],
      newParsedValue: DisplayObject[Any, Any]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerStart(attrName: markerStart, oldValue: Unit, newValue: DisplayObject[Any, Any]): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerStart(
      attrName: markerStart,
      oldValue: Unit,
      newValue: DisplayObject[Any, Any],
      prevParsedValue: Unit,
      newParsedValue: DisplayObject[Any, Any]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerStart(
      attrName: markerStart,
      oldValue: Unit,
      newValue: DisplayObject[Any, Any],
      prevParsedValue: DisplayObject[Any, Any]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerStart(
      attrName: markerStart,
      oldValue: Unit,
      newValue: DisplayObject[Any, Any],
      prevParsedValue: DisplayObject[Any, Any],
      newParsedValue: DisplayObject[Any, Any]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerStart(attrName: markerStart, oldValue: DisplayObject[Any, Any]): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerStart(
      attrName: markerStart,
      oldValue: DisplayObject[Any, Any],
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: DisplayObject[Any, Any]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerStart(
      attrName: markerStart,
      oldValue: DisplayObject[Any, Any],
      newValue: Unit,
      prevParsedValue: DisplayObject[Any, Any]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerStart(
      attrName: markerStart,
      oldValue: DisplayObject[Any, Any],
      newValue: Unit,
      prevParsedValue: DisplayObject[Any, Any],
      newParsedValue: DisplayObject[Any, Any]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerStart(attrName: markerStart, oldValue: DisplayObject[Any, Any], newValue: DisplayObject[Any, Any]): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerStart(
      attrName: markerStart,
      oldValue: DisplayObject[Any, Any],
      newValue: DisplayObject[Any, Any],
      prevParsedValue: Unit,
      newParsedValue: DisplayObject[Any, Any]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerStart(
      attrName: markerStart,
      oldValue: DisplayObject[Any, Any],
      newValue: DisplayObject[Any, Any],
      prevParsedValue: DisplayObject[Any, Any]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerStart(
      attrName: markerStart,
      oldValue: DisplayObject[Any, Any],
      newValue: DisplayObject[Any, Any],
      prevParsedValue: DisplayObject[Any, Any],
      newParsedValue: DisplayObject[Any, Any]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerStartOffset(attrName: markerStartOffset): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerStartOffset(attrName: markerStartOffset, oldValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerStartOffset(attrName: markerStartOffset, oldValue: Double, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerStartOffset(attrName: markerStartOffset, oldValue: Double, newValue: Double, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerStartOffset(
      attrName: markerStartOffset,
      oldValue: Double,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerStartOffset(
      attrName: markerStartOffset,
      oldValue: Double,
      newValue: Double,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerStartOffset(attrName: markerStartOffset, oldValue: Double, newValue: Unit, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerStartOffset(
      attrName: markerStartOffset,
      oldValue: Double,
      newValue: Unit,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerStartOffset(
      attrName: markerStartOffset,
      oldValue: Double,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerStartOffset(attrName: markerStartOffset, oldValue: Unit, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerStartOffset(attrName: markerStartOffset, oldValue: Unit, newValue: Double, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerStartOffset(
      attrName: markerStartOffset,
      oldValue: Unit,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerStartOffset(
      attrName: markerStartOffset,
      oldValue: Unit,
      newValue: Double,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerStartOffset(attrName: markerStartOffset, oldValue: Unit, newValue: Unit, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerStartOffset(
      attrName: markerStartOffset,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_markerStartOffset(
      attrName: markerStartOffset,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(attrName: miterLimit): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(attrName: miterLimit, oldValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(attrName: miterLimit, oldValue: String, newValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(attrName: miterLimit, oldValue: String, newValue: String, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(
      attrName: miterLimit,
      oldValue: String,
      newValue: String,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(
      attrName: miterLimit,
      oldValue: String,
      newValue: String,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(attrName: miterLimit, oldValue: String, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(attrName: miterLimit, oldValue: String, newValue: Double, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(
      attrName: miterLimit,
      oldValue: String,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(
      attrName: miterLimit,
      oldValue: String,
      newValue: Double,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(attrName: miterLimit, oldValue: String, newValue: Unit, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(
      attrName: miterLimit,
      oldValue: String,
      newValue: Unit,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(
      attrName: miterLimit,
      oldValue: String,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(attrName: miterLimit, oldValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(attrName: miterLimit, oldValue: Double, newValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(attrName: miterLimit, oldValue: Double, newValue: String, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(
      attrName: miterLimit,
      oldValue: Double,
      newValue: String,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(
      attrName: miterLimit,
      oldValue: Double,
      newValue: String,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(attrName: miterLimit, oldValue: Double, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(attrName: miterLimit, oldValue: Double, newValue: Double, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(
      attrName: miterLimit,
      oldValue: Double,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(
      attrName: miterLimit,
      oldValue: Double,
      newValue: Double,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(attrName: miterLimit, oldValue: Double, newValue: Unit, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(
      attrName: miterLimit,
      oldValue: Double,
      newValue: Unit,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(
      attrName: miterLimit,
      oldValue: Double,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(attrName: miterLimit, oldValue: Unit, newValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(attrName: miterLimit, oldValue: Unit, newValue: String, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(
      attrName: miterLimit,
      oldValue: Unit,
      newValue: String,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(
      attrName: miterLimit,
      oldValue: Unit,
      newValue: String,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(attrName: miterLimit, oldValue: Unit, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(attrName: miterLimit, oldValue: Unit, newValue: Double, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(
      attrName: miterLimit,
      oldValue: Unit,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(
      attrName: miterLimit,
      oldValue: Unit,
      newValue: Double,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(attrName: miterLimit, oldValue: Unit, newValue: Unit, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(
      attrName: miterLimit,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_miterLimit(
      attrName: miterLimit,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_offsetDistance(attrName: offsetDistance): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_offsetDistance(attrName: offsetDistance, oldValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_offsetDistance(attrName: offsetDistance, oldValue: Double, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_offsetDistance(attrName: offsetDistance, oldValue: Double, newValue: Double, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_offsetDistance(
      attrName: offsetDistance,
      oldValue: Double,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_offsetDistance(
      attrName: offsetDistance,
      oldValue: Double,
      newValue: Double,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_offsetDistance(attrName: offsetDistance, oldValue: Double, newValue: Unit, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_offsetDistance(
      attrName: offsetDistance,
      oldValue: Double,
      newValue: Unit,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_offsetDistance(
      attrName: offsetDistance,
      oldValue: Double,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_offsetDistance(attrName: offsetDistance, oldValue: Unit, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_offsetDistance(attrName: offsetDistance, oldValue: Unit, newValue: Double, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_offsetDistance(
      attrName: offsetDistance,
      oldValue: Unit,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_offsetDistance(
      attrName: offsetDistance,
      oldValue: Unit,
      newValue: Double,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_offsetDistance(attrName: offsetDistance, oldValue: Unit, newValue: Unit, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_offsetDistance(
      attrName: offsetDistance,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_offsetDistance(
      attrName: offsetDistance,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_offsetPath(
      attrName: offsetPath,
      oldValue: js.UndefOr[(typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]) | Null],
      newValue: js.UndefOr[(typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]) | Null],
      prevParsedValue: js.UndefOr[(typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]) | Null],
      newParsedValue: js.UndefOr[(typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]) | Null]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_offsetPathTargets(attrName: offsetPathTargets): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_offsetPathTargets(
      attrName: offsetPathTargets,
      oldValue: js.Array[typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_offsetPathTargets(
      attrName: offsetPathTargets,
      oldValue: js.Array[typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]],
      newValue: js.Array[typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_offsetPathTargets(
      attrName: offsetPathTargets,
      oldValue: js.Array[typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]],
      newValue: js.Array[typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]],
      prevParsedValue: js.Array[typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_offsetPathTargets(
      attrName: offsetPathTargets,
      oldValue: js.Array[typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]],
      newValue: js.Array[typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]],
      prevParsedValue: js.Array[typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]],
      newParsedValue: js.Array[typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_offsetPathTargets(
      attrName: offsetPathTargets,
      oldValue: js.Array[typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]],
      newValue: js.Array[typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]],
      prevParsedValue: Unit,
      newParsedValue: js.Array[typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_offsetPathTargets(
      attrName: offsetPathTargets,
      oldValue: js.Array[typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]],
      newValue: Unit,
      prevParsedValue: js.Array[typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_offsetPathTargets(
      attrName: offsetPathTargets,
      oldValue: js.Array[typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]],
      newValue: Unit,
      prevParsedValue: js.Array[typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]],
      newParsedValue: js.Array[typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_offsetPathTargets(
      attrName: offsetPathTargets,
      oldValue: js.Array[typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]],
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: js.Array[typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_offsetPathTargets(
      attrName: offsetPathTargets,
      oldValue: Unit,
      newValue: js.Array[typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_offsetPathTargets(
      attrName: offsetPathTargets,
      oldValue: Unit,
      newValue: js.Array[typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]],
      prevParsedValue: js.Array[typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_offsetPathTargets(
      attrName: offsetPathTargets,
      oldValue: Unit,
      newValue: js.Array[typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]],
      prevParsedValue: js.Array[typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]],
      newParsedValue: js.Array[typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_offsetPathTargets(
      attrName: offsetPathTargets,
      oldValue: Unit,
      newValue: js.Array[typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]],
      prevParsedValue: Unit,
      newParsedValue: js.Array[typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_offsetPathTargets(
      attrName: offsetPathTargets,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: js.Array[typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_offsetPathTargets(
      attrName: offsetPathTargets,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: js.Array[typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]],
      newParsedValue: js.Array[typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_offsetPathTargets(
      attrName: offsetPathTargets,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: js.Array[typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(attrName: opacity): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(attrName: opacity, oldValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(attrName: opacity, oldValue: String, newValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(attrName: opacity, oldValue: String, newValue: String, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(
      attrName: opacity,
      oldValue: String,
      newValue: String,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(
      attrName: opacity,
      oldValue: String,
      newValue: String,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(attrName: opacity, oldValue: String, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(attrName: opacity, oldValue: String, newValue: Double, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(
      attrName: opacity,
      oldValue: String,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(
      attrName: opacity,
      oldValue: String,
      newValue: Double,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(attrName: opacity, oldValue: String, newValue: Unit, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(
      attrName: opacity,
      oldValue: String,
      newValue: Unit,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(attrName: opacity, oldValue: String, newValue: Unit, prevParsedValue: Unit, newParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(attrName: opacity, oldValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(attrName: opacity, oldValue: Double, newValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(attrName: opacity, oldValue: Double, newValue: String, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(
      attrName: opacity,
      oldValue: Double,
      newValue: String,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(
      attrName: opacity,
      oldValue: Double,
      newValue: String,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(attrName: opacity, oldValue: Double, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(attrName: opacity, oldValue: Double, newValue: Double, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(
      attrName: opacity,
      oldValue: Double,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(
      attrName: opacity,
      oldValue: Double,
      newValue: Double,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(attrName: opacity, oldValue: Double, newValue: Unit, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(
      attrName: opacity,
      oldValue: Double,
      newValue: Unit,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(attrName: opacity, oldValue: Double, newValue: Unit, prevParsedValue: Unit, newParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(attrName: opacity, oldValue: Unit, newValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(attrName: opacity, oldValue: Unit, newValue: String, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(
      attrName: opacity,
      oldValue: Unit,
      newValue: String,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(attrName: opacity, oldValue: Unit, newValue: String, prevParsedValue: Unit, newParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(attrName: opacity, oldValue: Unit, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(attrName: opacity, oldValue: Unit, newValue: Double, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(
      attrName: opacity,
      oldValue: Unit,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(attrName: opacity, oldValue: Unit, newValue: Double, prevParsedValue: Unit, newParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(attrName: opacity, oldValue: Unit, newValue: Unit, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(attrName: opacity, oldValue: Unit, newValue: Unit, prevParsedValue: Double, newParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_opacity(attrName: opacity, oldValue: Unit, newValue: Unit, prevParsedValue: Unit, newParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_points(
      attrName: points,
      oldValue: js.Array[js.Tuple2[Double, Double]],
      newValue: js.Array[js.Tuple2[Double, Double]],
      prevParsedValue: Segments,
      newParsedValue: Segments
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowBlur(attrName: shadowBlur): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowBlur(attrName: shadowBlur, oldValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowBlur(attrName: shadowBlur, oldValue: Double, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowBlur(attrName: shadowBlur, oldValue: Double, newValue: Double, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowBlur(
      attrName: shadowBlur,
      oldValue: Double,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowBlur(
      attrName: shadowBlur,
      oldValue: Double,
      newValue: Double,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowBlur(attrName: shadowBlur, oldValue: Double, newValue: Unit, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowBlur(
      attrName: shadowBlur,
      oldValue: Double,
      newValue: Unit,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowBlur(
      attrName: shadowBlur,
      oldValue: Double,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowBlur(attrName: shadowBlur, oldValue: Unit, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowBlur(attrName: shadowBlur, oldValue: Unit, newValue: Double, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowBlur(
      attrName: shadowBlur,
      oldValue: Unit,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowBlur(
      attrName: shadowBlur,
      oldValue: Unit,
      newValue: Double,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowBlur(attrName: shadowBlur, oldValue: Unit, newValue: Unit, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowBlur(
      attrName: shadowBlur,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowBlur(
      attrName: shadowBlur,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowColor(attrName: shadowColor): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowColor(
      attrName: shadowColor,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: CSSRGB
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowColor(attrName: shadowColor, oldValue: Unit, newValue: Unit, prevParsedValue: CSSRGB): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowColor(
      attrName: shadowColor,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: CSSRGB,
      newParsedValue: CSSRGB
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowColor(attrName: shadowColor, oldValue: Unit, newValue: ColorType): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowColor(
      attrName: shadowColor,
      oldValue: Unit,
      newValue: ColorType,
      prevParsedValue: Unit,
      newParsedValue: CSSRGB
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowColor(attrName: shadowColor, oldValue: Unit, newValue: ColorType, prevParsedValue: CSSRGB): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowColor(
      attrName: shadowColor,
      oldValue: Unit,
      newValue: ColorType,
      prevParsedValue: CSSRGB,
      newParsedValue: CSSRGB
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowColor(attrName: shadowColor, oldValue: ColorType): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowColor(
      attrName: shadowColor,
      oldValue: ColorType,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: CSSRGB
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowColor(attrName: shadowColor, oldValue: ColorType, newValue: Unit, prevParsedValue: CSSRGB): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowColor(
      attrName: shadowColor,
      oldValue: ColorType,
      newValue: Unit,
      prevParsedValue: CSSRGB,
      newParsedValue: CSSRGB
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowColor(attrName: shadowColor, oldValue: ColorType, newValue: ColorType): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowColor(
      attrName: shadowColor,
      oldValue: ColorType,
      newValue: ColorType,
      prevParsedValue: Unit,
      newParsedValue: CSSRGB
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowColor(attrName: shadowColor, oldValue: ColorType, newValue: ColorType, prevParsedValue: CSSRGB): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowColor(
      attrName: shadowColor,
      oldValue: ColorType,
      newValue: ColorType,
      prevParsedValue: CSSRGB,
      newParsedValue: CSSRGB
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowOffsetX(attrName: shadowOffsetX): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowOffsetX(attrName: shadowOffsetX, oldValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowOffsetX(attrName: shadowOffsetX, oldValue: Double, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowOffsetX(attrName: shadowOffsetX, oldValue: Double, newValue: Double, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowOffsetX(
      attrName: shadowOffsetX,
      oldValue: Double,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowOffsetX(
      attrName: shadowOffsetX,
      oldValue: Double,
      newValue: Double,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowOffsetX(attrName: shadowOffsetX, oldValue: Double, newValue: Unit, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowOffsetX(
      attrName: shadowOffsetX,
      oldValue: Double,
      newValue: Unit,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowOffsetX(
      attrName: shadowOffsetX,
      oldValue: Double,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowOffsetX(attrName: shadowOffsetX, oldValue: Unit, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowOffsetX(attrName: shadowOffsetX, oldValue: Unit, newValue: Double, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowOffsetX(
      attrName: shadowOffsetX,
      oldValue: Unit,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowOffsetX(
      attrName: shadowOffsetX,
      oldValue: Unit,
      newValue: Double,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowOffsetX(attrName: shadowOffsetX, oldValue: Unit, newValue: Unit, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowOffsetX(
      attrName: shadowOffsetX,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowOffsetX(
      attrName: shadowOffsetX,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowOffsetY(attrName: shadowOffsetY): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowOffsetY(attrName: shadowOffsetY, oldValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowOffsetY(attrName: shadowOffsetY, oldValue: Double, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowOffsetY(attrName: shadowOffsetY, oldValue: Double, newValue: Double, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowOffsetY(
      attrName: shadowOffsetY,
      oldValue: Double,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowOffsetY(
      attrName: shadowOffsetY,
      oldValue: Double,
      newValue: Double,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowOffsetY(attrName: shadowOffsetY, oldValue: Double, newValue: Unit, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowOffsetY(
      attrName: shadowOffsetY,
      oldValue: Double,
      newValue: Unit,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowOffsetY(
      attrName: shadowOffsetY,
      oldValue: Double,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowOffsetY(attrName: shadowOffsetY, oldValue: Unit, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowOffsetY(attrName: shadowOffsetY, oldValue: Unit, newValue: Double, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowOffsetY(
      attrName: shadowOffsetY,
      oldValue: Unit,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowOffsetY(
      attrName: shadowOffsetY,
      oldValue: Unit,
      newValue: Double,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowOffsetY(attrName: shadowOffsetY, oldValue: Unit, newValue: Unit, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowOffsetY(
      attrName: shadowOffsetY,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowOffsetY(
      attrName: shadowOffsetY,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_shadowType(attrName: shadowType): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_stroke(
      attrName: stroke,
      oldValue: js.UndefOr[ColorType | Pattern],
      newValue: js.UndefOr[ColorType | Pattern],
      prevParsedValue: js.UndefOr[CSSRGB | js.Array[CSSGradientValue] | Pattern],
      newParsedValue: js.UndefOr[CSSRGB | js.Array[CSSGradientValue] | Pattern]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeDasharray(
      attrName: strokeDasharray,
      oldValue: js.UndefOr[String | (js.Array[String | Double])],
      newValue: js.UndefOr[String | (js.Array[String | Double])],
      prevParsedValue: js.UndefOr[String | (js.Array[String | Double])],
      newParsedValue: js.UndefOr[String | (js.Array[String | Double])]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeDashoffset(attrName: strokeDashoffset): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeDashoffset(attrName: strokeDashoffset, oldValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeDashoffset(attrName: strokeDashoffset, oldValue: Double, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeDashoffset(attrName: strokeDashoffset, oldValue: Double, newValue: Double, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeDashoffset(
      attrName: strokeDashoffset,
      oldValue: Double,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeDashoffset(
      attrName: strokeDashoffset,
      oldValue: Double,
      newValue: Double,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeDashoffset(attrName: strokeDashoffset, oldValue: Double, newValue: Unit, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeDashoffset(
      attrName: strokeDashoffset,
      oldValue: Double,
      newValue: Unit,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeDashoffset(
      attrName: strokeDashoffset,
      oldValue: Double,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeDashoffset(attrName: strokeDashoffset, oldValue: Unit, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeDashoffset(attrName: strokeDashoffset, oldValue: Unit, newValue: Double, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeDashoffset(
      attrName: strokeDashoffset,
      oldValue: Unit,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeDashoffset(
      attrName: strokeDashoffset,
      oldValue: Unit,
      newValue: Double,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeDashoffset(attrName: strokeDashoffset, oldValue: Unit, newValue: Unit, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeDashoffset(
      attrName: strokeDashoffset,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeDashoffset(
      attrName: strokeDashoffset,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeLinecap(attrName: strokeLinecap): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeLinecap(
      attrName: strokeLinecap,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: CanvasLineCap
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeLinecap(attrName: strokeLinecap, oldValue: Unit, newValue: Unit, prevParsedValue: CanvasLineCap): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeLinecap(
      attrName: strokeLinecap,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: CanvasLineCap,
      newParsedValue: CanvasLineCap
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeLinecap(attrName: strokeLinecap, oldValue: Unit, newValue: CanvasLineCap): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeLinecap(
      attrName: strokeLinecap,
      oldValue: Unit,
      newValue: CanvasLineCap,
      prevParsedValue: Unit,
      newParsedValue: CanvasLineCap
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeLinecap(attrName: strokeLinecap, oldValue: Unit, newValue: CanvasLineCap, prevParsedValue: CanvasLineCap): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeLinecap(
      attrName: strokeLinecap,
      oldValue: Unit,
      newValue: CanvasLineCap,
      prevParsedValue: CanvasLineCap,
      newParsedValue: CanvasLineCap
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeLinecap(attrName: strokeLinecap, oldValue: CanvasLineCap): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeLinecap(
      attrName: strokeLinecap,
      oldValue: CanvasLineCap,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: CanvasLineCap
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeLinecap(attrName: strokeLinecap, oldValue: CanvasLineCap, newValue: Unit, prevParsedValue: CanvasLineCap): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeLinecap(
      attrName: strokeLinecap,
      oldValue: CanvasLineCap,
      newValue: Unit,
      prevParsedValue: CanvasLineCap,
      newParsedValue: CanvasLineCap
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeLinecap(attrName: strokeLinecap, oldValue: CanvasLineCap, newValue: CanvasLineCap): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeLinecap(
      attrName: strokeLinecap,
      oldValue: CanvasLineCap,
      newValue: CanvasLineCap,
      prevParsedValue: Unit,
      newParsedValue: CanvasLineCap
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeLinecap(
      attrName: strokeLinecap,
      oldValue: CanvasLineCap,
      newValue: CanvasLineCap,
      prevParsedValue: CanvasLineCap
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeLinecap(
      attrName: strokeLinecap,
      oldValue: CanvasLineCap,
      newValue: CanvasLineCap,
      prevParsedValue: CanvasLineCap,
      newParsedValue: CanvasLineCap
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeLinejoin(attrName: strokeLinejoin): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeLinejoin(
      attrName: strokeLinejoin,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: CanvasLineJoin
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeLinejoin(attrName: strokeLinejoin, oldValue: Unit, newValue: Unit, prevParsedValue: CanvasLineJoin): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeLinejoin(
      attrName: strokeLinejoin,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: CanvasLineJoin,
      newParsedValue: CanvasLineJoin
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeLinejoin(attrName: strokeLinejoin, oldValue: Unit, newValue: CanvasLineJoin): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeLinejoin(
      attrName: strokeLinejoin,
      oldValue: Unit,
      newValue: CanvasLineJoin,
      prevParsedValue: Unit,
      newParsedValue: CanvasLineJoin
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeLinejoin(
      attrName: strokeLinejoin,
      oldValue: Unit,
      newValue: CanvasLineJoin,
      prevParsedValue: CanvasLineJoin
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeLinejoin(
      attrName: strokeLinejoin,
      oldValue: Unit,
      newValue: CanvasLineJoin,
      prevParsedValue: CanvasLineJoin,
      newParsedValue: CanvasLineJoin
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeLinejoin(attrName: strokeLinejoin, oldValue: CanvasLineJoin): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeLinejoin(
      attrName: strokeLinejoin,
      oldValue: CanvasLineJoin,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: CanvasLineJoin
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeLinejoin(
      attrName: strokeLinejoin,
      oldValue: CanvasLineJoin,
      newValue: Unit,
      prevParsedValue: CanvasLineJoin
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeLinejoin(
      attrName: strokeLinejoin,
      oldValue: CanvasLineJoin,
      newValue: Unit,
      prevParsedValue: CanvasLineJoin,
      newParsedValue: CanvasLineJoin
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeLinejoin(attrName: strokeLinejoin, oldValue: CanvasLineJoin, newValue: CanvasLineJoin): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeLinejoin(
      attrName: strokeLinejoin,
      oldValue: CanvasLineJoin,
      newValue: CanvasLineJoin,
      prevParsedValue: Unit,
      newParsedValue: CanvasLineJoin
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeLinejoin(
      attrName: strokeLinejoin,
      oldValue: CanvasLineJoin,
      newValue: CanvasLineJoin,
      prevParsedValue: CanvasLineJoin
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeLinejoin(
      attrName: strokeLinejoin,
      oldValue: CanvasLineJoin,
      newValue: CanvasLineJoin,
      prevParsedValue: CanvasLineJoin,
      newParsedValue: CanvasLineJoin
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(attrName: strokeOpacity): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(attrName: strokeOpacity, oldValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(attrName: strokeOpacity, oldValue: String, newValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(attrName: strokeOpacity, oldValue: String, newValue: String, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(
      attrName: strokeOpacity,
      oldValue: String,
      newValue: String,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(
      attrName: strokeOpacity,
      oldValue: String,
      newValue: String,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(attrName: strokeOpacity, oldValue: String, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(attrName: strokeOpacity, oldValue: String, newValue: Double, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(
      attrName: strokeOpacity,
      oldValue: String,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(
      attrName: strokeOpacity,
      oldValue: String,
      newValue: Double,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(attrName: strokeOpacity, oldValue: String, newValue: Unit, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(
      attrName: strokeOpacity,
      oldValue: String,
      newValue: Unit,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(
      attrName: strokeOpacity,
      oldValue: String,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(attrName: strokeOpacity, oldValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(attrName: strokeOpacity, oldValue: Double, newValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(attrName: strokeOpacity, oldValue: Double, newValue: String, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(
      attrName: strokeOpacity,
      oldValue: Double,
      newValue: String,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(
      attrName: strokeOpacity,
      oldValue: Double,
      newValue: String,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(attrName: strokeOpacity, oldValue: Double, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(attrName: strokeOpacity, oldValue: Double, newValue: Double, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(
      attrName: strokeOpacity,
      oldValue: Double,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(
      attrName: strokeOpacity,
      oldValue: Double,
      newValue: Double,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(attrName: strokeOpacity, oldValue: Double, newValue: Unit, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(
      attrName: strokeOpacity,
      oldValue: Double,
      newValue: Unit,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(
      attrName: strokeOpacity,
      oldValue: Double,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(attrName: strokeOpacity, oldValue: Unit, newValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(attrName: strokeOpacity, oldValue: Unit, newValue: String, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(
      attrName: strokeOpacity,
      oldValue: Unit,
      newValue: String,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(
      attrName: strokeOpacity,
      oldValue: Unit,
      newValue: String,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(attrName: strokeOpacity, oldValue: Unit, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(attrName: strokeOpacity, oldValue: Unit, newValue: Double, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(
      attrName: strokeOpacity,
      oldValue: Unit,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(
      attrName: strokeOpacity,
      oldValue: Unit,
      newValue: Double,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(attrName: strokeOpacity, oldValue: Unit, newValue: Unit, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(
      attrName: strokeOpacity,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeOpacity(
      attrName: strokeOpacity,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_strokeWidth(
      attrName: strokeWidth,
      oldValue: js.UndefOr[String | Double],
      newValue: js.UndefOr[String | Double],
      prevParsedValue: js.UndefOr[String | Double],
      newParsedValue: js.UndefOr[String | Double]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_textTransform(
      attrName: textTransform,
      oldValue: js.UndefOr[TextTransform | _empty],
      newValue: js.UndefOr[TextTransform | _empty],
      prevParsedValue: js.UndefOr[TextTransform | _empty],
      newParsedValue: js.UndefOr[TextTransform | _empty]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_transform(
      attrName: transform,
      oldValue: String,
      newValue: String,
      prevParsedValue: js.Array[ParsedTransform],
      newParsedValue: js.Array[ParsedTransform]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_transform(
      attrName: transform,
      oldValue: String,
      newValue: Unit,
      prevParsedValue: js.Array[ParsedTransform],
      newParsedValue: js.Array[ParsedTransform]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_transform(
      attrName: transform,
      oldValue: Unit,
      newValue: String,
      prevParsedValue: js.Array[ParsedTransform],
      newParsedValue: js.Array[ParsedTransform]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_transform(
      attrName: transform,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: js.Array[ParsedTransform],
      newParsedValue: js.Array[ParsedTransform]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_transformOrigin(attrName: transformOrigin): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_transformOrigin(attrName: transformOrigin, oldValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_transformOrigin(attrName: transformOrigin, oldValue: String, newValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_transformOrigin(
      attrName: transformOrigin,
      oldValue: String,
      newValue: String,
      prevParsedValue: js.Tuple3[CSSUnitValue, CSSUnitValue, CSSUnitValue]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_transformOrigin(
      attrName: transformOrigin,
      oldValue: String,
      newValue: String,
      prevParsedValue: js.Tuple3[CSSUnitValue, CSSUnitValue, CSSUnitValue],
      newParsedValue: js.Tuple3[CSSUnitValue, CSSUnitValue, CSSUnitValue]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_transformOrigin(
      attrName: transformOrigin,
      oldValue: String,
      newValue: String,
      prevParsedValue: Unit,
      newParsedValue: js.Tuple3[CSSUnitValue, CSSUnitValue, CSSUnitValue]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_transformOrigin(
      attrName: transformOrigin,
      oldValue: String,
      newValue: Unit,
      prevParsedValue: js.Tuple3[CSSUnitValue, CSSUnitValue, CSSUnitValue]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_transformOrigin(
      attrName: transformOrigin,
      oldValue: String,
      newValue: Unit,
      prevParsedValue: js.Tuple3[CSSUnitValue, CSSUnitValue, CSSUnitValue],
      newParsedValue: js.Tuple3[CSSUnitValue, CSSUnitValue, CSSUnitValue]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_transformOrigin(
      attrName: transformOrigin,
      oldValue: String,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: js.Tuple3[CSSUnitValue, CSSUnitValue, CSSUnitValue]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_transformOrigin(attrName: transformOrigin, oldValue: Unit, newValue: String): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_transformOrigin(
      attrName: transformOrigin,
      oldValue: Unit,
      newValue: String,
      prevParsedValue: js.Tuple3[CSSUnitValue, CSSUnitValue, CSSUnitValue]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_transformOrigin(
      attrName: transformOrigin,
      oldValue: Unit,
      newValue: String,
      prevParsedValue: js.Tuple3[CSSUnitValue, CSSUnitValue, CSSUnitValue],
      newParsedValue: js.Tuple3[CSSUnitValue, CSSUnitValue, CSSUnitValue]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_transformOrigin(
      attrName: transformOrigin,
      oldValue: Unit,
      newValue: String,
      prevParsedValue: Unit,
      newParsedValue: js.Tuple3[CSSUnitValue, CSSUnitValue, CSSUnitValue]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_transformOrigin(
      attrName: transformOrigin,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: js.Tuple3[CSSUnitValue, CSSUnitValue, CSSUnitValue]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_transformOrigin(
      attrName: transformOrigin,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: js.Tuple3[CSSUnitValue, CSSUnitValue, CSSUnitValue],
      newParsedValue: js.Tuple3[CSSUnitValue, CSSUnitValue, CSSUnitValue]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_transformOrigin(
      attrName: transformOrigin,
      oldValue: Unit,
      newValue: Unit,
      prevParsedValue: Unit,
      newParsedValue: js.Tuple3[CSSUnitValue, CSSUnitValue, CSSUnitValue]
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_zIndex(attrName: zIndex): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_zIndex(attrName: zIndex, oldValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_zIndex(attrName: zIndex, oldValue: Double, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_zIndex(attrName: zIndex, oldValue: Double, newValue: Double, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_zIndex(
      attrName: zIndex,
      oldValue: Double,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_zIndex(
      attrName: zIndex,
      oldValue: Double,
      newValue: Double,
      prevParsedValue: Unit,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_zIndex(attrName: zIndex, oldValue: Double, newValue: Unit, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_zIndex(
      attrName: zIndex,
      oldValue: Double,
      newValue: Unit,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_zIndex(attrName: zIndex, oldValue: Double, newValue: Unit, prevParsedValue: Unit, newParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_zIndex(attrName: zIndex, oldValue: Unit, newValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_zIndex(attrName: zIndex, oldValue: Unit, newValue: Double, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_zIndex(
      attrName: zIndex,
      oldValue: Unit,
      newValue: Double,
      prevParsedValue: Double,
      newParsedValue: Double
    ): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_zIndex(attrName: zIndex, oldValue: Unit, newValue: Double, prevParsedValue: Unit, newParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_zIndex(attrName: zIndex, oldValue: Unit, newValue: Unit, prevParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_zIndex(attrName: zIndex, oldValue: Unit, newValue: Unit, prevParsedValue: Double, newParsedValue: Double): Unit = js.native
    @JSName("attributeChangedCallback")
    def attributeChangedCallback_zIndex(attrName: zIndex, oldValue: Unit, newValue: Unit, prevParsedValue: Unit, newParsedValue: Double): Unit = js.native
    
    /* private */ var markerEndAngle: Any = js.native
    
    /**
      * markers placed at the mid
      */
    /* private */ var markerMidList: Any = js.native
    
    /* private */ var markerStartAngle: Any = js.native
    
    /* private */ var placeMarkerMid: Any = js.native
    
    /* private */ var transformMarker: Any = js.native
  }
  
  trait ParsedPolygonStyleProps
    extends StObject
       with ParsedBaseStyleProps {
    
    var isClosed: js.UndefOr[Boolean] = js.undefined
    
    var markerEnd: js.UndefOr[DisplayObject[Any, Any]] = js.undefined
    
    var markerEndOffset: js.UndefOr[Double] = js.undefined
    
    var markerMid: js.UndefOr[DisplayObject[Any, Any]] = js.undefined
    
    var markerStart: js.UndefOr[DisplayObject[Any, Any]] = js.undefined
    
    var markerStartOffset: js.UndefOr[Double] = js.undefined
    
    var points: Segments
  }
  object ParsedPolygonStyleProps {
    
    inline def apply(points: Segments, transform: js.Array[ParsedTransform]): ParsedPolygonStyleProps = {
      val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedPolygonStyleProps]
    }
    
    extension [Self <: ParsedPolygonStyleProps](x: Self) {
      
      inline def setIsClosed(value: Boolean): Self = StObject.set(x, "isClosed", value.asInstanceOf[js.Any])
      
      inline def setIsClosedUndefined: Self = StObject.set(x, "isClosed", js.undefined)
      
      inline def setMarkerEnd(value: DisplayObject[Any, Any]): Self = StObject.set(x, "markerEnd", value.asInstanceOf[js.Any])
      
      inline def setMarkerEndOffset(value: Double): Self = StObject.set(x, "markerEndOffset", value.asInstanceOf[js.Any])
      
      inline def setMarkerEndOffsetUndefined: Self = StObject.set(x, "markerEndOffset", js.undefined)
      
      inline def setMarkerEndUndefined: Self = StObject.set(x, "markerEnd", js.undefined)
      
      inline def setMarkerMid(value: DisplayObject[Any, Any]): Self = StObject.set(x, "markerMid", value.asInstanceOf[js.Any])
      
      inline def setMarkerMidUndefined: Self = StObject.set(x, "markerMid", js.undefined)
      
      inline def setMarkerStart(value: DisplayObject[Any, Any]): Self = StObject.set(x, "markerStart", value.asInstanceOf[js.Any])
      
      inline def setMarkerStartOffset(value: Double): Self = StObject.set(x, "markerStartOffset", value.asInstanceOf[js.Any])
      
      inline def setMarkerStartOffsetUndefined: Self = StObject.set(x, "markerStartOffset", js.undefined)
      
      inline def setMarkerStartUndefined: Self = StObject.set(x, "markerStart", js.undefined)
      
      inline def setPoints(value: Segments): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    }
  }
  
  trait PolygonStyleProps
    extends StObject
       with BaseStyleProps {
    
    var isClosed: js.UndefOr[Boolean] = js.undefined
    
    /**
      * marker will be positioned at the last point
      */
    var markerEnd: js.UndefOr[DisplayObject[Any, Any]] = js.undefined
    
    /**
      * offset relative to original position
      */
    var markerEndOffset: js.UndefOr[Double] = js.undefined
    
    var markerMid: js.UndefOr[DisplayObject[Any, Any]] = js.undefined
    
    /**
      * marker will be positioned at the first point
      */
    var markerStart: js.UndefOr[DisplayObject[Any, Any]] = js.undefined
    
    /**
      * offset relative to original position
      */
    var markerStartOffset: js.UndefOr[Double] = js.undefined
    
    var points: js.Array[js.Tuple2[Double, Double]]
  }
  object PolygonStyleProps {
    
    inline def apply(points: js.Array[js.Tuple2[Double, Double]]): PolygonStyleProps = {
      val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
      __obj.asInstanceOf[PolygonStyleProps]
    }
    
    extension [Self <: PolygonStyleProps](x: Self) {
      
      inline def setIsClosed(value: Boolean): Self = StObject.set(x, "isClosed", value.asInstanceOf[js.Any])
      
      inline def setIsClosedUndefined: Self = StObject.set(x, "isClosed", js.undefined)
      
      inline def setMarkerEnd(value: DisplayObject[Any, Any]): Self = StObject.set(x, "markerEnd", value.asInstanceOf[js.Any])
      
      inline def setMarkerEndOffset(value: Double): Self = StObject.set(x, "markerEndOffset", value.asInstanceOf[js.Any])
      
      inline def setMarkerEndOffsetUndefined: Self = StObject.set(x, "markerEndOffset", js.undefined)
      
      inline def setMarkerEndUndefined: Self = StObject.set(x, "markerEnd", js.undefined)
      
      inline def setMarkerMid(value: DisplayObject[Any, Any]): Self = StObject.set(x, "markerMid", value.asInstanceOf[js.Any])
      
      inline def setMarkerMidUndefined: Self = StObject.set(x, "markerMid", js.undefined)
      
      inline def setMarkerStart(value: DisplayObject[Any, Any]): Self = StObject.set(x, "markerStart", value.asInstanceOf[js.Any])
      
      inline def setMarkerStartOffset(value: Double): Self = StObject.set(x, "markerStartOffset", value.asInstanceOf[js.Any])
      
      inline def setMarkerStartOffsetUndefined: Self = StObject.set(x, "markerStartOffset", js.undefined)
      
      inline def setMarkerStartUndefined: Self = StObject.set(x, "markerStart", js.undefined)
      
      inline def setPoints(value: js.Array[js.Tuple2[Double, Double]]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      inline def setPointsVarargs(value: (js.Tuple2[Double, Double])*): Self = StObject.set(x, "points", js.Array(value*))
    }
  }
}
