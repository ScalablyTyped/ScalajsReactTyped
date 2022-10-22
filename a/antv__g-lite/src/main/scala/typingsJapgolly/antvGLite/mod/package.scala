package typingsJapgolly.antvGLite.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antvGLite.anon.AbsolutePath
import typingsJapgolly.antvGLite.anon.R
import typingsJapgolly.antvGLite.anon.X1
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
import typingsJapgolly.antvGLite.distCssInterfacesMod.PropertyMetadata
import typingsJapgolly.antvGLite.distCssInterfacesMod.StyleValueRegistry
import typingsJapgolly.antvGLite.distCssParserColorMod.Pattern
import typingsJapgolly.antvGLite.distCssStyleValueRegistryMod.CSSGlobalKeywords
import typingsJapgolly.antvGLite.distTypesMod.CanvasLike
import typingsJapgolly.antvGLite.mod.^
import typingsJapgolly.antvUtil.libPathTypesMod.AbsoluteArray
import typingsJapgolly.antvUtil.libPathTypesMod.PathArray
import typingsJapgolly.glMatrix.mod.mat3
import typingsJapgolly.glMatrix.mod.mat4
import typingsJapgolly.glMatrix.mod.quat
import typingsJapgolly.glMatrix.mod.vec2
import typingsJapgolly.glMatrix.mod.vec3
import typingsJapgolly.glMatrix.mod.vec4
import typingsJapgolly.manaSyringe.libContainerMod.Container
import typingsJapgolly.manaSyringe.libCoreMod.Decorator
import typingsJapgolly.manaSyringe.libCoreMod.Syringe.DecoratorOption
import typingsJapgolly.manaSyringe.libCoreMod.Syringe.Registry
import typingsJapgolly.manaSyringe.libCoreMod.Syringe.Token
import typingsJapgolly.manaSyringe.libModuleSyringeModuleMod.SyringeModule
import typingsJapgolly.manaSyringe.mod.Syringe.DefinedToken
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def AnimationTimelineToken: DefinedToken = ^.asInstanceOf[js.Dynamic].selectDynamic("AnimationTimelineToken").asInstanceOf[DefinedToken]

inline def BUILT_IN_PROPERTIES: js.Array[PropertyMetadata] = ^.asInstanceOf[js.Dynamic].selectDynamic("BUILT_IN_PROPERTIES").asInstanceOf[js.Array[PropertyMetadata]]

inline def CameraContribution: DefinedToken = ^.asInstanceOf[js.Dynamic].selectDynamic("CameraContribution").asInstanceOf[DefinedToken]

inline def CanvasConfig: DefinedToken = ^.asInstanceOf[js.Dynamic].selectDynamic("CanvasConfig").asInstanceOf[DefinedToken]

inline def ContextService: DefinedToken = ^.asInstanceOf[js.Dynamic].selectDynamic("ContextService").asInstanceOf[DefinedToken]

inline def DefaultCamera: DefinedToken = ^.asInstanceOf[js.Dynamic].selectDynamic("DefaultCamera").asInstanceOf[DefinedToken]

inline def ERROR_MSG_METHOD_NOT_IMPLEMENTED: /* "Method not implemented." */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("ERROR_MSG_METHOD_NOT_IMPLEMENTED").asInstanceOf[/* "Method not implemented." */ String]

inline def GeometryAABBUpdater: DefinedToken = ^.asInstanceOf[js.Dynamic].selectDynamic("GeometryAABBUpdater").asInstanceOf[DefinedToken]

inline def GeometryUpdaterFactory: DefinedToken = ^.asInstanceOf[js.Dynamic].selectDynamic("GeometryUpdaterFactory").asInstanceOf[DefinedToken]

inline def GlobalContainer: Container = ^.asInstanceOf[js.Dynamic].selectDynamic("GlobalContainer").asInstanceOf[Container]

inline def LayoutRegistry: DefinedToken = ^.asInstanceOf[js.Dynamic].selectDynamic("LayoutRegistry").asInstanceOf[DefinedToken]

inline def Module(): SyringeModule = ^.asInstanceOf[js.Dynamic].applyDynamic("Module")().asInstanceOf[SyringeModule]
inline def Module(register: Registry): SyringeModule = ^.asInstanceOf[js.Dynamic].applyDynamic("Module")(register.asInstanceOf[js.Any]).asInstanceOf[SyringeModule]

inline def ParseEasingFunction: DefinedToken = ^.asInstanceOf[js.Dynamic].selectDynamic("ParseEasingFunction").asInstanceOf[DefinedToken]

inline def RBushRoot: DefinedToken = ^.asInstanceOf[js.Dynamic].selectDynamic("RBushRoot").asInstanceOf[DefinedToken]

inline def RenderingContext: DefinedToken = ^.asInstanceOf[js.Dynamic].selectDynamic("RenderingContext").asInstanceOf[DefinedToken]

inline def RenderingPluginContribution: DefinedToken = ^.asInstanceOf[js.Dynamic].selectDynamic("RenderingPluginContribution").asInstanceOf[DefinedToken]

inline def SceneGraphSelector: DefinedToken = ^.asInstanceOf[js.Dynamic].selectDynamic("SceneGraphSelector").asInstanceOf[DefinedToken]

inline def SceneGraphSelectorFactory: DefinedToken = ^.asInstanceOf[js.Dynamic].selectDynamic("SceneGraphSelectorFactory").asInstanceOf[DefinedToken]

inline def SceneGraphService: DefinedToken = ^.asInstanceOf[js.Dynamic].selectDynamic("SceneGraphService").asInstanceOf[DefinedToken]

inline def StyleValueRegistry_ : DefinedToken = ^.asInstanceOf[js.Dynamic].selectDynamic("StyleValueRegistry").asInstanceOf[DefinedToken]

inline def computeLinearGradient(width: Double, height: Double, angle: Double): X1 = (^.asInstanceOf[js.Dynamic].applyDynamic("computeLinearGradient")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[X1]

inline def computeRadialGradient(width: Double, height: Double, cx: Double, cy: Double): R = (^.asInstanceOf[js.Dynamic].applyDynamic("computeRadialGradient")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], cx.asInstanceOf[js.Any], cy.asInstanceOf[js.Any])).asInstanceOf[R]

inline def convertToPath(`object`: typingsJapgolly.antvGLite.distDisplayObjectsMod.Circle): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToPath")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
inline def convertToPath(`object`: typingsJapgolly.antvGLite.distDisplayObjectsMod.Circle, applyLocalTransform: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToPath")(`object`.asInstanceOf[js.Any], applyLocalTransform.asInstanceOf[js.Any])).asInstanceOf[String]
inline def convertToPath(`object`: typingsJapgolly.antvGLite.distDisplayObjectsMod.Ellipse): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToPath")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
inline def convertToPath(`object`: typingsJapgolly.antvGLite.distDisplayObjectsMod.Ellipse, applyLocalTransform: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToPath")(`object`.asInstanceOf[js.Any], applyLocalTransform.asInstanceOf[js.Any])).asInstanceOf[String]
inline def convertToPath(`object`: typingsJapgolly.antvGLite.distDisplayObjectsMod.Line): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToPath")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
inline def convertToPath(`object`: typingsJapgolly.antvGLite.distDisplayObjectsMod.Line, applyLocalTransform: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToPath")(`object`.asInstanceOf[js.Any], applyLocalTransform.asInstanceOf[js.Any])).asInstanceOf[String]
inline def convertToPath(`object`: typingsJapgolly.antvGLite.distDisplayObjectsMod.Path): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToPath")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
inline def convertToPath(`object`: typingsJapgolly.antvGLite.distDisplayObjectsMod.Path, applyLocalTransform: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToPath")(`object`.asInstanceOf[js.Any], applyLocalTransform.asInstanceOf[js.Any])).asInstanceOf[String]
inline def convertToPath(`object`: typingsJapgolly.antvGLite.distDisplayObjectsMod.Polygon): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToPath")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
inline def convertToPath(`object`: typingsJapgolly.antvGLite.distDisplayObjectsMod.Polygon, applyLocalTransform: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToPath")(`object`.asInstanceOf[js.Any], applyLocalTransform.asInstanceOf[js.Any])).asInstanceOf[String]
inline def convertToPath(`object`: typingsJapgolly.antvGLite.distDisplayObjectsMod.Polyline): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToPath")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
inline def convertToPath(`object`: typingsJapgolly.antvGLite.distDisplayObjectsMod.Polyline, applyLocalTransform: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToPath")(`object`.asInstanceOf[js.Any], applyLocalTransform.asInstanceOf[js.Any])).asInstanceOf[String]
inline def convertToPath(`object`: typingsJapgolly.antvGLite.distDisplayObjectsMod.Rect): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToPath")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
inline def convertToPath(`object`: typingsJapgolly.antvGLite.distDisplayObjectsMod.Rect, applyLocalTransform: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToPath")(`object`.asInstanceOf[js.Any], applyLocalTransform.asInstanceOf[js.Any])).asInstanceOf[String]

inline def createVec3(x: vec2 | vec3 | vec4): vec3 = ^.asInstanceOf[js.Dynamic].applyDynamic("createVec3")(x.asInstanceOf[js.Any]).asInstanceOf[vec3]
inline def createVec3(x: vec2 | vec3 | vec4, y: Double): vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("createVec3")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[vec3]
inline def createVec3(x: vec2 | vec3 | vec4, y: Double, z: Double): vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("createVec3")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[vec3]
inline def createVec3(x: vec2 | vec3 | vec4, y: Unit, z: Double): vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("createVec3")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[vec3]
inline def createVec3(x: Double): vec3 = ^.asInstanceOf[js.Dynamic].applyDynamic("createVec3")(x.asInstanceOf[js.Any]).asInstanceOf[vec3]
inline def createVec3(x: Double, y: Double): vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("createVec3")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[vec3]
inline def createVec3(x: Double, y: Double, z: Double): vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("createVec3")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[vec3]
inline def createVec3(x: Double, y: Unit, z: Double): vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("createVec3")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[vec3]

inline def decompose(mat: mat3): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("decompose")(mat.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]

inline def definedProps(obj: js.Object): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("definedProps")(obj.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]

inline def deg2rad(deg: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("deg2rad")(deg.asInstanceOf[js.Any]).asInstanceOf[Double]

inline def deg2turn(deg: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("deg2turn")(deg.asInstanceOf[js.Any]).asInstanceOf[Double]

inline def findClosestClipPathTarget(`object`: typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]): typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("findClosestClipPathTarget")(`object`.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]]

inline def getAngle(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getAngle")().asInstanceOf[Double]
inline def getAngle(angle: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getAngle")(angle.asInstanceOf[js.Any]).asInstanceOf[Double]

inline def getEuler(out: vec3, quat: mat4 | quat): vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("getEuler")(out.asInstanceOf[js.Any], quat.asInstanceOf[js.Any])).asInstanceOf[vec3]

inline def getOrCalculatePathTotalLength(path: typingsJapgolly.antvGLite.distDisplayObjectsMod.Path): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrCalculatePathTotalLength")(path.asInstanceOf[js.Any]).asInstanceOf[Double]

inline def grad2deg(grads: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("grad2deg")(grads.asInstanceOf[js.Any]).asInstanceOf[Double]

inline def inject(token: Token[Any]): js.Function3[/* target */ Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("inject")(token.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* target */ Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit]]

inline def injectable[T](): Decorator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("injectable")().asInstanceOf[Decorator[T]]
inline def injectable[T](option: DecoratorOption[T]): Decorator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("injectable")(option.asInstanceOf[js.Any]).asInstanceOf[Decorator[T]]

inline def isBrowser: Boolean = ^.asInstanceOf[js.Dynamic].selectDynamic("isBrowser").asInstanceOf[Boolean]

inline def isFillOrStrokeAffected(): js.Tuple2[Boolean, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")().asInstanceOf[js.Tuple2[Boolean, Boolean]]
inline def isFillOrStrokeAffected(
  pointerEvents: none | auto | stroke | fill | painted | visible | visiblestroke | visiblefill | visiblepainted | all
): js.Tuple2[Boolean, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Boolean, Boolean]]
inline def isFillOrStrokeAffected(
  pointerEvents: none | auto | stroke | fill | painted | visible | visiblestroke | visiblefill | visiblepainted | all,
  fill: js.Array[typingsJapgolly.antvGLite.distCssMod.CSSGradientValue]
): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
inline def isFillOrStrokeAffected(
  pointerEvents: none | auto | stroke | fill | painted | visible | visiblestroke | visiblefill | visiblepainted | all,
  fill: js.Array[typingsJapgolly.antvGLite.distCssMod.CSSGradientValue],
  stroke: js.Array[typingsJapgolly.antvGLite.distCssMod.CSSGradientValue]
): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
inline def isFillOrStrokeAffected(
  pointerEvents: none | auto | stroke | fill | painted | visible | visiblestroke | visiblefill | visiblepainted | all,
  fill: js.Array[typingsJapgolly.antvGLite.distCssMod.CSSGradientValue],
  stroke: typingsJapgolly.antvGLite.distCssMod.CSSRGB
): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
inline def isFillOrStrokeAffected(
  pointerEvents: none | auto | stroke | fill | painted | visible | visiblestroke | visiblefill | visiblepainted | all,
  fill: js.Array[typingsJapgolly.antvGLite.distCssMod.CSSGradientValue],
  stroke: Pattern
): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
inline def isFillOrStrokeAffected(
  pointerEvents: none | auto | stroke | fill | painted | visible | visiblestroke | visiblefill | visiblepainted | all,
  fill: Unit,
  stroke: js.Array[typingsJapgolly.antvGLite.distCssMod.CSSGradientValue]
): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
inline def isFillOrStrokeAffected(
  pointerEvents: none | auto | stroke | fill | painted | visible | visiblestroke | visiblefill | visiblepainted | all,
  fill: Unit,
  stroke: typingsJapgolly.antvGLite.distCssMod.CSSRGB
): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
inline def isFillOrStrokeAffected(
  pointerEvents: none | auto | stroke | fill | painted | visible | visiblestroke | visiblefill | visiblepainted | all,
  fill: Unit,
  stroke: Pattern
): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
inline def isFillOrStrokeAffected(
  pointerEvents: none | auto | stroke | fill | painted | visible | visiblestroke | visiblefill | visiblepainted | all,
  fill: typingsJapgolly.antvGLite.distCssMod.CSSRGB
): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
inline def isFillOrStrokeAffected(
  pointerEvents: none | auto | stroke | fill | painted | visible | visiblestroke | visiblefill | visiblepainted | all,
  fill: typingsJapgolly.antvGLite.distCssMod.CSSRGB,
  stroke: js.Array[typingsJapgolly.antvGLite.distCssMod.CSSGradientValue]
): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
inline def isFillOrStrokeAffected(
  pointerEvents: none | auto | stroke | fill | painted | visible | visiblestroke | visiblefill | visiblepainted | all,
  fill: typingsJapgolly.antvGLite.distCssMod.CSSRGB,
  stroke: typingsJapgolly.antvGLite.distCssMod.CSSRGB
): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
inline def isFillOrStrokeAffected(
  pointerEvents: none | auto | stroke | fill | painted | visible | visiblestroke | visiblefill | visiblepainted | all,
  fill: typingsJapgolly.antvGLite.distCssMod.CSSRGB,
  stroke: Pattern
): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
inline def isFillOrStrokeAffected(
  pointerEvents: none | auto | stroke | fill | painted | visible | visiblestroke | visiblefill | visiblepainted | all,
  fill: Pattern
): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
inline def isFillOrStrokeAffected(
  pointerEvents: none | auto | stroke | fill | painted | visible | visiblestroke | visiblefill | visiblepainted | all,
  fill: Pattern,
  stroke: js.Array[typingsJapgolly.antvGLite.distCssMod.CSSGradientValue]
): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
inline def isFillOrStrokeAffected(
  pointerEvents: none | auto | stroke | fill | painted | visible | visiblestroke | visiblefill | visiblepainted | all,
  fill: Pattern,
  stroke: typingsJapgolly.antvGLite.distCssMod.CSSRGB
): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
inline def isFillOrStrokeAffected(
  pointerEvents: none | auto | stroke | fill | painted | visible | visiblestroke | visiblefill | visiblepainted | all,
  fill: Pattern,
  stroke: Pattern
): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
inline def isFillOrStrokeAffected(pointerEvents: Unit, fill: js.Array[typingsJapgolly.antvGLite.distCssMod.CSSGradientValue]): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
inline def isFillOrStrokeAffected(
  pointerEvents: Unit,
  fill: js.Array[typingsJapgolly.antvGLite.distCssMod.CSSGradientValue],
  stroke: js.Array[typingsJapgolly.antvGLite.distCssMod.CSSGradientValue]
): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
inline def isFillOrStrokeAffected(
  pointerEvents: Unit,
  fill: js.Array[typingsJapgolly.antvGLite.distCssMod.CSSGradientValue],
  stroke: typingsJapgolly.antvGLite.distCssMod.CSSRGB
): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
inline def isFillOrStrokeAffected(
  pointerEvents: Unit,
  fill: js.Array[typingsJapgolly.antvGLite.distCssMod.CSSGradientValue],
  stroke: Pattern
): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
inline def isFillOrStrokeAffected(
  pointerEvents: Unit,
  fill: Unit,
  stroke: js.Array[typingsJapgolly.antvGLite.distCssMod.CSSGradientValue]
): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
inline def isFillOrStrokeAffected(pointerEvents: Unit, fill: Unit, stroke: typingsJapgolly.antvGLite.distCssMod.CSSRGB): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
inline def isFillOrStrokeAffected(pointerEvents: Unit, fill: Unit, stroke: Pattern): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
inline def isFillOrStrokeAffected(pointerEvents: Unit, fill: typingsJapgolly.antvGLite.distCssMod.CSSRGB): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
inline def isFillOrStrokeAffected(
  pointerEvents: Unit,
  fill: typingsJapgolly.antvGLite.distCssMod.CSSRGB,
  stroke: js.Array[typingsJapgolly.antvGLite.distCssMod.CSSGradientValue]
): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
inline def isFillOrStrokeAffected(
  pointerEvents: Unit,
  fill: typingsJapgolly.antvGLite.distCssMod.CSSRGB,
  stroke: typingsJapgolly.antvGLite.distCssMod.CSSRGB
): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
inline def isFillOrStrokeAffected(pointerEvents: Unit, fill: typingsJapgolly.antvGLite.distCssMod.CSSRGB, stroke: Pattern): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
inline def isFillOrStrokeAffected(pointerEvents: Unit, fill: Pattern): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
inline def isFillOrStrokeAffected(
  pointerEvents: Unit,
  fill: Pattern,
  stroke: js.Array[typingsJapgolly.antvGLite.distCssMod.CSSGradientValue]
): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
inline def isFillOrStrokeAffected(pointerEvents: Unit, fill: Pattern, stroke: typingsJapgolly.antvGLite.distCssMod.CSSRGB): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
inline def isFillOrStrokeAffected(pointerEvents: Unit, fill: Pattern, stroke: Pattern): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
inline def isFillOrStrokeAffected(pointerEvents: CSSGlobalKeywords): js.Tuple2[Boolean, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Boolean, Boolean]]
inline def isFillOrStrokeAffected(
  pointerEvents: CSSGlobalKeywords,
  fill: js.Array[typingsJapgolly.antvGLite.distCssMod.CSSGradientValue]
): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
inline def isFillOrStrokeAffected(
  pointerEvents: CSSGlobalKeywords,
  fill: js.Array[typingsJapgolly.antvGLite.distCssMod.CSSGradientValue],
  stroke: js.Array[typingsJapgolly.antvGLite.distCssMod.CSSGradientValue]
): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
inline def isFillOrStrokeAffected(
  pointerEvents: CSSGlobalKeywords,
  fill: js.Array[typingsJapgolly.antvGLite.distCssMod.CSSGradientValue],
  stroke: typingsJapgolly.antvGLite.distCssMod.CSSRGB
): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
inline def isFillOrStrokeAffected(
  pointerEvents: CSSGlobalKeywords,
  fill: js.Array[typingsJapgolly.antvGLite.distCssMod.CSSGradientValue],
  stroke: Pattern
): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
inline def isFillOrStrokeAffected(
  pointerEvents: CSSGlobalKeywords,
  fill: Unit,
  stroke: js.Array[typingsJapgolly.antvGLite.distCssMod.CSSGradientValue]
): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
inline def isFillOrStrokeAffected(pointerEvents: CSSGlobalKeywords, fill: Unit, stroke: typingsJapgolly.antvGLite.distCssMod.CSSRGB): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
inline def isFillOrStrokeAffected(pointerEvents: CSSGlobalKeywords, fill: Unit, stroke: Pattern): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
inline def isFillOrStrokeAffected(pointerEvents: CSSGlobalKeywords, fill: typingsJapgolly.antvGLite.distCssMod.CSSRGB): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
inline def isFillOrStrokeAffected(
  pointerEvents: CSSGlobalKeywords,
  fill: typingsJapgolly.antvGLite.distCssMod.CSSRGB,
  stroke: js.Array[typingsJapgolly.antvGLite.distCssMod.CSSGradientValue]
): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
inline def isFillOrStrokeAffected(
  pointerEvents: CSSGlobalKeywords,
  fill: typingsJapgolly.antvGLite.distCssMod.CSSRGB,
  stroke: typingsJapgolly.antvGLite.distCssMod.CSSRGB
): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
inline def isFillOrStrokeAffected(
  pointerEvents: CSSGlobalKeywords,
  fill: typingsJapgolly.antvGLite.distCssMod.CSSRGB,
  stroke: Pattern
): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
inline def isFillOrStrokeAffected(pointerEvents: CSSGlobalKeywords, fill: Pattern): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
inline def isFillOrStrokeAffected(
  pointerEvents: CSSGlobalKeywords,
  fill: Pattern,
  stroke: js.Array[typingsJapgolly.antvGLite.distCssMod.CSSGradientValue]
): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
inline def isFillOrStrokeAffected(
  pointerEvents: CSSGlobalKeywords,
  fill: Pattern,
  stroke: typingsJapgolly.antvGLite.distCssMod.CSSRGB
): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]
inline def isFillOrStrokeAffected(pointerEvents: CSSGlobalKeywords, fill: Pattern, stroke: Pattern): js.Tuple2[Boolean, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFillOrStrokeAffected")(pointerEvents.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], stroke.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, Boolean]]

inline def isPattern(`object`: Any): /* is @antv/g-lite.@antv/g-lite/dist/css/parser/color.Pattern */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPattern")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is @antv/g-lite.@antv/g-lite/dist/css/parser/color.Pattern */ Boolean]

inline def mergeColors(
  left: js.Array[typingsJapgolly.antvGLite.distCssCssomMod.CSSGradientValue],
  right: js.Array[typingsJapgolly.antvGLite.distCssCssomMod.CSSGradientValue]
): js.UndefOr[
js.Tuple3[
  js.Array[Double], 
  js.Array[Double], 
  js.Function1[/* color */ js.Array[Double], String]
]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeColors")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
js.Tuple3[
  js.Array[Double], 
  js.Array[Double], 
  js.Function1[/* color */ js.Array[Double], String]
]]]
inline def mergeColors(
  left: js.Array[typingsJapgolly.antvGLite.distCssCssomMod.CSSGradientValue],
  right: typingsJapgolly.antvGLite.distCssCssomMod.CSSRGB
): js.UndefOr[
js.Tuple3[
  js.Array[Double], 
  js.Array[Double], 
  js.Function1[/* color */ js.Array[Double], String]
]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeColors")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
js.Tuple3[
  js.Array[Double], 
  js.Array[Double], 
  js.Function1[/* color */ js.Array[Double], String]
]]]
inline def mergeColors(left: js.Array[typingsJapgolly.antvGLite.distCssCssomMod.CSSGradientValue], right: Pattern): js.UndefOr[
js.Tuple3[
  js.Array[Double], 
  js.Array[Double], 
  js.Function1[/* color */ js.Array[Double], String]
]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeColors")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
js.Tuple3[
  js.Array[Double], 
  js.Array[Double], 
  js.Function1[/* color */ js.Array[Double], String]
]]]
inline def mergeColors(
  left: typingsJapgolly.antvGLite.distCssCssomMod.CSSRGB,
  right: js.Array[typingsJapgolly.antvGLite.distCssCssomMod.CSSGradientValue]
): js.UndefOr[
js.Tuple3[
  js.Array[Double], 
  js.Array[Double], 
  js.Function1[/* color */ js.Array[Double], String]
]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeColors")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
js.Tuple3[
  js.Array[Double], 
  js.Array[Double], 
  js.Function1[/* color */ js.Array[Double], String]
]]]
inline def mergeColors(
  left: typingsJapgolly.antvGLite.distCssCssomMod.CSSRGB,
  right: typingsJapgolly.antvGLite.distCssCssomMod.CSSRGB
): js.UndefOr[
js.Tuple3[
  js.Array[Double], 
  js.Array[Double], 
  js.Function1[/* color */ js.Array[Double], String]
]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeColors")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
js.Tuple3[
  js.Array[Double], 
  js.Array[Double], 
  js.Function1[/* color */ js.Array[Double], String]
]]]
inline def mergeColors(left: typingsJapgolly.antvGLite.distCssCssomMod.CSSRGB, right: Pattern): js.UndefOr[
js.Tuple3[
  js.Array[Double], 
  js.Array[Double], 
  js.Function1[/* color */ js.Array[Double], String]
]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeColors")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
js.Tuple3[
  js.Array[Double], 
  js.Array[Double], 
  js.Function1[/* color */ js.Array[Double], String]
]]]
inline def mergeColors(left: Pattern, right: js.Array[typingsJapgolly.antvGLite.distCssCssomMod.CSSGradientValue]): js.UndefOr[
js.Tuple3[
  js.Array[Double], 
  js.Array[Double], 
  js.Function1[/* color */ js.Array[Double], String]
]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeColors")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
js.Tuple3[
  js.Array[Double], 
  js.Array[Double], 
  js.Function1[/* color */ js.Array[Double], String]
]]]
inline def mergeColors(left: Pattern, right: typingsJapgolly.antvGLite.distCssCssomMod.CSSRGB): js.UndefOr[
js.Tuple3[
  js.Array[Double], 
  js.Array[Double], 
  js.Function1[/* color */ js.Array[Double], String]
]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeColors")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
js.Tuple3[
  js.Array[Double], 
  js.Array[Double], 
  js.Function1[/* color */ js.Array[Double], String]
]]]
inline def mergeColors(left: Pattern, right: Pattern): js.UndefOr[
js.Tuple3[
  js.Array[Double], 
  js.Array[Double], 
  js.Function1[/* color */ js.Array[Double], String]
]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeColors")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
js.Tuple3[
  js.Array[Double], 
  js.Array[Double], 
  js.Function1[/* color */ js.Array[Double], String]
]]]

inline def parsePath(path: String, `object`: typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]): AbsolutePath = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePath")(path.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[AbsolutePath]
inline def parsePath(path: PathArray, `object`: typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject[Any, Any]): AbsolutePath = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePath")(path.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[AbsolutePath]

inline def propertyMetadataCache: Record[String, PropertyMetadata] = ^.asInstanceOf[js.Dynamic].selectDynamic("propertyMetadataCache").asInstanceOf[Record[String, PropertyMetadata]]

inline def rad2deg(rad: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("rad2deg")(rad.asInstanceOf[js.Any]).asInstanceOf[Double]

inline def setDOMSize($el: CanvasLike, width: Double, height: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setDOMSize")($el.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def singleton[T](): Decorator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("singleton")().asInstanceOf[Decorator[T]]
inline def singleton[T](option: DecoratorOption[T]): Decorator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("singleton")(option.asInstanceOf[js.Any]).asInstanceOf[Decorator[T]]

inline def styleValueRegistry: StyleValueRegistry = ^.asInstanceOf[js.Dynamic].selectDynamic("styleValueRegistry").asInstanceOf[StyleValueRegistry]

inline def translatePathToString(pathArray: AbsoluteArray, x: Double, y: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("translatePathToString")(pathArray.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[String]
inline def translatePathToString(pathArray: AbsoluteArray, x: Double, y: Double, startOffsetX: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("translatePathToString")(pathArray.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], startOffsetX.asInstanceOf[js.Any])).asInstanceOf[String]
inline def translatePathToString(pathArray: AbsoluteArray, x: Double, y: Double, startOffsetX: Double, startOffsetY: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("translatePathToString")(pathArray.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], startOffsetX.asInstanceOf[js.Any], startOffsetY.asInstanceOf[js.Any])).asInstanceOf[String]
inline def translatePathToString(
  pathArray: AbsoluteArray,
  x: Double,
  y: Double,
  startOffsetX: Double,
  startOffsetY: Double,
  endOffsetX: Double
): String = (^.asInstanceOf[js.Dynamic].applyDynamic("translatePathToString")(pathArray.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], startOffsetX.asInstanceOf[js.Any], startOffsetY.asInstanceOf[js.Any], endOffsetX.asInstanceOf[js.Any])).asInstanceOf[String]
inline def translatePathToString(
  pathArray: AbsoluteArray,
  x: Double,
  y: Double,
  startOffsetX: Double,
  startOffsetY: Double,
  endOffsetX: Double,
  endOffsetY: Double
): String = (^.asInstanceOf[js.Dynamic].applyDynamic("translatePathToString")(pathArray.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], startOffsetX.asInstanceOf[js.Any], startOffsetY.asInstanceOf[js.Any], endOffsetX.asInstanceOf[js.Any], endOffsetY.asInstanceOf[js.Any])).asInstanceOf[String]
inline def translatePathToString(
  pathArray: AbsoluteArray,
  x: Double,
  y: Double,
  startOffsetX: Double,
  startOffsetY: Double,
  endOffsetX: Unit,
  endOffsetY: Double
): String = (^.asInstanceOf[js.Dynamic].applyDynamic("translatePathToString")(pathArray.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], startOffsetX.asInstanceOf[js.Any], startOffsetY.asInstanceOf[js.Any], endOffsetX.asInstanceOf[js.Any], endOffsetY.asInstanceOf[js.Any])).asInstanceOf[String]
inline def translatePathToString(
  pathArray: AbsoluteArray,
  x: Double,
  y: Double,
  startOffsetX: Double,
  startOffsetY: Unit,
  endOffsetX: Double
): String = (^.asInstanceOf[js.Dynamic].applyDynamic("translatePathToString")(pathArray.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], startOffsetX.asInstanceOf[js.Any], startOffsetY.asInstanceOf[js.Any], endOffsetX.asInstanceOf[js.Any])).asInstanceOf[String]
inline def translatePathToString(
  pathArray: AbsoluteArray,
  x: Double,
  y: Double,
  startOffsetX: Double,
  startOffsetY: Unit,
  endOffsetX: Double,
  endOffsetY: Double
): String = (^.asInstanceOf[js.Dynamic].applyDynamic("translatePathToString")(pathArray.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], startOffsetX.asInstanceOf[js.Any], startOffsetY.asInstanceOf[js.Any], endOffsetX.asInstanceOf[js.Any], endOffsetY.asInstanceOf[js.Any])).asInstanceOf[String]
inline def translatePathToString(
  pathArray: AbsoluteArray,
  x: Double,
  y: Double,
  startOffsetX: Double,
  startOffsetY: Unit,
  endOffsetX: Unit,
  endOffsetY: Double
): String = (^.asInstanceOf[js.Dynamic].applyDynamic("translatePathToString")(pathArray.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], startOffsetX.asInstanceOf[js.Any], startOffsetY.asInstanceOf[js.Any], endOffsetX.asInstanceOf[js.Any], endOffsetY.asInstanceOf[js.Any])).asInstanceOf[String]
inline def translatePathToString(pathArray: AbsoluteArray, x: Double, y: Double, startOffsetX: Unit, startOffsetY: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("translatePathToString")(pathArray.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], startOffsetX.asInstanceOf[js.Any], startOffsetY.asInstanceOf[js.Any])).asInstanceOf[String]
inline def translatePathToString(
  pathArray: AbsoluteArray,
  x: Double,
  y: Double,
  startOffsetX: Unit,
  startOffsetY: Double,
  endOffsetX: Double
): String = (^.asInstanceOf[js.Dynamic].applyDynamic("translatePathToString")(pathArray.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], startOffsetX.asInstanceOf[js.Any], startOffsetY.asInstanceOf[js.Any], endOffsetX.asInstanceOf[js.Any])).asInstanceOf[String]
inline def translatePathToString(
  pathArray: AbsoluteArray,
  x: Double,
  y: Double,
  startOffsetX: Unit,
  startOffsetY: Double,
  endOffsetX: Double,
  endOffsetY: Double
): String = (^.asInstanceOf[js.Dynamic].applyDynamic("translatePathToString")(pathArray.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], startOffsetX.asInstanceOf[js.Any], startOffsetY.asInstanceOf[js.Any], endOffsetX.asInstanceOf[js.Any], endOffsetY.asInstanceOf[js.Any])).asInstanceOf[String]
inline def translatePathToString(
  pathArray: AbsoluteArray,
  x: Double,
  y: Double,
  startOffsetX: Unit,
  startOffsetY: Double,
  endOffsetX: Unit,
  endOffsetY: Double
): String = (^.asInstanceOf[js.Dynamic].applyDynamic("translatePathToString")(pathArray.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], startOffsetX.asInstanceOf[js.Any], startOffsetY.asInstanceOf[js.Any], endOffsetX.asInstanceOf[js.Any], endOffsetY.asInstanceOf[js.Any])).asInstanceOf[String]
inline def translatePathToString(
  pathArray: AbsoluteArray,
  x: Double,
  y: Double,
  startOffsetX: Unit,
  startOffsetY: Unit,
  endOffsetX: Double
): String = (^.asInstanceOf[js.Dynamic].applyDynamic("translatePathToString")(pathArray.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], startOffsetX.asInstanceOf[js.Any], startOffsetY.asInstanceOf[js.Any], endOffsetX.asInstanceOf[js.Any])).asInstanceOf[String]
inline def translatePathToString(
  pathArray: AbsoluteArray,
  x: Double,
  y: Double,
  startOffsetX: Unit,
  startOffsetY: Unit,
  endOffsetX: Double,
  endOffsetY: Double
): String = (^.asInstanceOf[js.Dynamic].applyDynamic("translatePathToString")(pathArray.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], startOffsetX.asInstanceOf[js.Any], startOffsetY.asInstanceOf[js.Any], endOffsetX.asInstanceOf[js.Any], endOffsetY.asInstanceOf[js.Any])).asInstanceOf[String]
inline def translatePathToString(
  pathArray: AbsoluteArray,
  x: Double,
  y: Double,
  startOffsetX: Unit,
  startOffsetY: Unit,
  endOffsetX: Unit,
  endOffsetY: Double
): String = (^.asInstanceOf[js.Dynamic].applyDynamic("translatePathToString")(pathArray.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], startOffsetX.asInstanceOf[js.Any], startOffsetY.asInstanceOf[js.Any], endOffsetX.asInstanceOf[js.Any], endOffsetY.asInstanceOf[js.Any])).asInstanceOf[String]

inline def turn2deg(turn: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("turn2deg")(turn.asInstanceOf[js.Any]).asInstanceOf[Double]
