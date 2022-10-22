package typingsJapgolly.antvGLite

import typingsJapgolly.antvGLite.antvGLiteStrings.all
import typingsJapgolly.antvGLite.antvGLiteStrings.auto
import typingsJapgolly.antvGLite.antvGLiteStrings.fill
import typingsJapgolly.antvGLite.antvGLiteStrings.none
import typingsJapgolly.antvGLite.antvGLiteStrings.painted
import typingsJapgolly.antvGLite.antvGLiteStrings.stroke
import typingsJapgolly.antvGLite.antvGLiteStrings.visible
import typingsJapgolly.antvGLite.antvGLiteStrings.visiblefill
import typingsJapgolly.antvGLite.antvGLiteStrings.visiblepainted
import typingsJapgolly.antvGLite.antvGLiteStrings.visiblestroke
import typingsJapgolly.antvGLite.distCssMod.CSSGradientValue
import typingsJapgolly.antvGLite.distCssMod.CSSRGB
import typingsJapgolly.antvGLite.distCssParserColorMod.Pattern
import typingsJapgolly.antvGLite.distCssStyleValueRegistryMod.CSSGlobalKeywords
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsPointerEventsMod {
  
  @JSImport("@antv/g-lite/dist/utils/pointer-events", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isFillOrStrokeAffected(): js.Tuple2[Boolean, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")().asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(
    pointerEvents: none | auto | stroke | fill | painted | visible | visiblestroke | visiblefill | visiblepainted | all
  ): js.Tuple2[Boolean, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(
    pointerEvents: none | auto | stroke | fill | painted | visible | visiblestroke | visiblefill | visiblepainted | all,
    fill: js.Array[CSSGradientValue]
  ): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(
    pointerEvents: none | auto | stroke | fill | painted | visible | visiblestroke | visiblefill | visiblepainted | all,
    fill: js.Array[CSSGradientValue],
    stroke: js.Array[CSSGradientValue]
  ): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(
    pointerEvents: none | auto | stroke | fill | painted | visible | visiblestroke | visiblefill | visiblepainted | all,
    fill: js.Array[CSSGradientValue],
    stroke: CSSRGB
  ): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(
    pointerEvents: none | auto | stroke | fill | painted | visible | visiblestroke | visiblefill | visiblepainted | all,
    fill: js.Array[CSSGradientValue],
    stroke: Pattern
  ): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(
    pointerEvents: none | auto | stroke | fill | painted | visible | visiblestroke | visiblefill | visiblepainted | all,
    fill: Unit,
    stroke: js.Array[CSSGradientValue]
  ): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(
    pointerEvents: none | auto | stroke | fill | painted | visible | visiblestroke | visiblefill | visiblepainted | all,
    fill: Unit,
    stroke: CSSRGB
  ): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(
    pointerEvents: none | auto | stroke | fill | painted | visible | visiblestroke | visiblefill | visiblepainted | all,
    fill: Unit,
    stroke: Pattern
  ): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(
    pointerEvents: none | auto | stroke | fill | painted | visible | visiblestroke | visiblefill | visiblepainted | all,
    fill: CSSRGB
  ): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(
    pointerEvents: none | auto | stroke | fill | painted | visible | visiblestroke | visiblefill | visiblepainted | all,
    fill: CSSRGB,
    stroke: js.Array[CSSGradientValue]
  ): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(
    pointerEvents: none | auto | stroke | fill | painted | visible | visiblestroke | visiblefill | visiblepainted | all,
    fill: CSSRGB,
    stroke: CSSRGB
  ): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(
    pointerEvents: none | auto | stroke | fill | painted | visible | visiblestroke | visiblefill | visiblepainted | all,
    fill: CSSRGB,
    stroke: Pattern
  ): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(
    pointerEvents: none | auto | stroke | fill | painted | visible | visiblestroke | visiblefill | visiblepainted | all,
    fill: Pattern
  ): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(
    pointerEvents: none | auto | stroke | fill | painted | visible | visiblestroke | visiblefill | visiblepainted | all,
    fill: Pattern,
    stroke: js.Array[CSSGradientValue]
  ): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(
    pointerEvents: none | auto | stroke | fill | painted | visible | visiblestroke | visiblefill | visiblepainted | all,
    fill: Pattern,
    stroke: CSSRGB
  ): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(
    pointerEvents: none | auto | stroke | fill | painted | visible | visiblestroke | visiblefill | visiblepainted | all,
    fill: Pattern,
    stroke: Pattern
  ): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(pointerEvents: Unit, fill: js.Array[CSSGradientValue]): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(pointerEvents: Unit, fill: js.Array[CSSGradientValue], stroke: js.Array[CSSGradientValue]): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(pointerEvents: Unit, fill: js.Array[CSSGradientValue], stroke: CSSRGB): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(pointerEvents: Unit, fill: js.Array[CSSGradientValue], stroke: Pattern): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(pointerEvents: Unit, fill: Unit, stroke: js.Array[CSSGradientValue]): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(pointerEvents: Unit, fill: Unit, stroke: CSSRGB): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(pointerEvents: Unit, fill: Unit, stroke: Pattern): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(pointerEvents: Unit, fill: CSSRGB): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(pointerEvents: Unit, fill: CSSRGB, stroke: js.Array[CSSGradientValue]): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(pointerEvents: Unit, fill: CSSRGB, stroke: CSSRGB): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(pointerEvents: Unit, fill: CSSRGB, stroke: Pattern): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(pointerEvents: Unit, fill: Pattern): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(pointerEvents: Unit, fill: Pattern, stroke: js.Array[CSSGradientValue]): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(pointerEvents: Unit, fill: Pattern, stroke: CSSRGB): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(pointerEvents: Unit, fill: Pattern, stroke: Pattern): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(pointerEvents: CSSGlobalKeywords): js.Tuple2[Boolean, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(pointerEvents: CSSGlobalKeywords, fill: js.Array[CSSGradientValue]): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(
    pointerEvents: CSSGlobalKeywords,
    fill: js.Array[CSSGradientValue],
    stroke: js.Array[CSSGradientValue]
  ): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(pointerEvents: CSSGlobalKeywords, fill: js.Array[CSSGradientValue], stroke: CSSRGB): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(pointerEvents: CSSGlobalKeywords, fill: js.Array[CSSGradientValue], stroke: Pattern): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(pointerEvents: CSSGlobalKeywords, fill: Unit, stroke: js.Array[CSSGradientValue]): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(pointerEvents: CSSGlobalKeywords, fill: Unit, stroke: CSSRGB): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(pointerEvents: CSSGlobalKeywords, fill: Unit, stroke: Pattern): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(pointerEvents: CSSGlobalKeywords, fill: CSSRGB): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(pointerEvents: CSSGlobalKeywords, fill: CSSRGB, stroke: js.Array[CSSGradientValue]): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(pointerEvents: CSSGlobalKeywords, fill: CSSRGB, stroke: CSSRGB): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(pointerEvents: CSSGlobalKeywords, fill: CSSRGB, stroke: Pattern): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(pointerEvents: CSSGlobalKeywords, fill: Pattern): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(pointerEvents: CSSGlobalKeywords, fill: Pattern, stroke: js.Array[CSSGradientValue]): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(pointerEvents: CSSGlobalKeywords, fill: Pattern, stroke: CSSRGB): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
  inline def isFillOrStrokeAffected(pointerEvents: CSSGlobalKeywords, fill: Pattern, stroke: Pattern): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
}
