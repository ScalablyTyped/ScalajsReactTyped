package typingsJapgolly.bizcharts.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antvG2.anon.StartAngle
import typingsJapgolly.antvG2.anon.X
import typingsJapgolly.antvG2.anon.namestringvaluestringMark
import typingsJapgolly.antvG2.libDependentsMod.Attribute
import typingsJapgolly.antvG2.libGeometryBaseMod.default
import typingsJapgolly.antvG2.libInterfaceMod.IInteractionContext
import typingsJapgolly.antvG2.libInterfaceMod.LooseObject
import typingsJapgolly.antvG2.libInterfaceMod.MappingDatum
import typingsJapgolly.antvG2.libInterfaceMod.MarkerCfg
import typingsJapgolly.antvG2.libInterfaceMod.Position
import typingsJapgolly.antvG2.libInterfaceMod.RangePoint
import typingsJapgolly.antvG2.libInterfaceMod.ShapeInfo
import typingsJapgolly.antvG2.libInterfaceMod.ShapePoint
import typingsJapgolly.antvG2.libInterfaceMod.ShapeVertices
import typingsJapgolly.antvG2.libInterfaceMod.TooltipTitle
import typingsJapgolly.antvG2.libUtilLegendMod.ComponentLegendItem
import typingsJapgolly.antvGBase.libInterfacesMod.IGroup
import typingsJapgolly.antvGBase.libInterfacesMod.IShape
import typingsJapgolly.antvGBase.libTypesMod.ShapeAttrs
import typingsJapgolly.bizcharts.anon.Call
import typingsJapgolly.bizcharts.anon.Fn0
import typingsJapgolly.bizcharts.anon.FnCall
import typingsJapgolly.bizcharts.anon.FnCallABPrecision
import typingsJapgolly.bizcharts.anon.FnCallArrCache
import typingsJapgolly.bizcharts.anon.FnCallArrE
import typingsJapgolly.bizcharts.anon.FnCallArrKey
import typingsJapgolly.bizcharts.anon.FnCallArrPredicate
import typingsJapgolly.bizcharts.anon.FnCallArrPredicateFromIndex
import typingsJapgolly.bizcharts.anon.FnCallCenterXCenterYRadiusStartAngleInRadianEndAngleInRadianInnerRadius
import typingsJapgolly.bizcharts.anon.FnCallDataCondition
import typingsJapgolly.bizcharts.anon.FnCallDataGeometryTitleShowNil
import typingsJapgolly.bizcharts.anon.FnCallDistSrc1Src2Src3
import typingsJapgolly.bizcharts.anon.FnCallElementRatio
import typingsJapgolly.bizcharts.anon.FnCallElementRotateRadian
import typingsJapgolly.bizcharts.anon.FnCallElementXY
import typingsJapgolly.bizcharts.anon.FnCallElementsFunc
import typingsJapgolly.bizcharts.anon.FnCallFuncWaitImmediate
import typingsJapgolly.bizcharts.anon.FnCallRadius
import typingsJapgolly.bizcharts.anon.FnCallStrO
import typingsJapgolly.bizcharts.anon.TextVisible
import typingsJapgolly.bizcharts.anon.Visible
import typingsJapgolly.std.FrameRequestCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Util {
  
  @JSImport("bizcharts", "Util")
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("bizcharts", "Util.Cache")
  @js.native
  open class Cache[T] ()
    extends typingsJapgolly.antvUtil.mod.Cache[T]
  @JSImport("bizcharts", "Util.Cache")
  @js.native
  def Cache: Instantiable0[typingsJapgolly.antvUtil.mod.Cache[js.Object]] = js.native
  inline def Cache_=(x: Instantiable0[typingsJapgolly.antvUtil.mod.Cache[js.Object]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Cache")(x.asInstanceOf[js.Any])
  
  @JSImport("bizcharts", "Util.assign")
  @js.native
  def assign: FnCallDistSrc1Src2Src3 = js.native
  inline def assign_=(x: FnCallDistSrc1Src2Src3): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("assign")(x.asInstanceOf[js.Any])
  
  inline def augment(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("augment")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  inline def clamp(a: Double, min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(a.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("bizcharts", "Util.clearAnimationFrame")
  @js.native
  def clearAnimationFrame: js.Function1[/* handler */ Double, Unit] = js.native
  inline def clearAnimationFrame_=(x: js.Function1[/* handler */ Double, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clearAnimationFrame")(x.asInstanceOf[js.Any])
  
  inline def cloneDeep(deepObject: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneDeep")(deepObject.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def clone_(obj: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def contains(arr: js.Array[Any], value: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(arr.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("bizcharts", "Util.debounce")
  @js.native
  def debounce: FnCallFuncWaitImmediate = js.native
  inline def debounce_=(x: FnCallFuncWaitImmediate): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("debounce")(x.asInstanceOf[js.Any])
  
  inline def deepMix(rst: Any, args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("deepMix")(scala.List(rst.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
  
  inline def difference[T](arr: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("difference")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def difference[T](arr: js.Array[T], values: js.Array[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("difference")(arr.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  @JSImport("bizcharts", "Util.each")
  @js.native
  def each: FnCallElementsFunc = js.native
  inline def each_=(x: FnCallElementsFunc): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("each")(x.asInstanceOf[js.Any])
  
  @JSImport("bizcharts", "Util.endsWith")
  @js.native
  def endsWith: FnCallArrE = js.native
  inline def endsWith_=(x: FnCallArrE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("endsWith")(x.asInstanceOf[js.Any])
  
  inline def every[T_7](arr: js.Array[T_7], func: js.Function2[/* v */ T_7, /* idx */ js.UndefOr[Double], Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(arr.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def extend(subclass: Any, superclass: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(subclass.asInstanceOf[js.Any], superclass.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def extend(subclass: Any, superclass: Any, overrides: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(subclass.asInstanceOf[js.Any], superclass.asInstanceOf[js.Any], overrides.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def extend(subclass: Any, superclass: Any, overrides: Any, staticOverrides: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(subclass.asInstanceOf[js.Any], superclass.asInstanceOf[js.Any], overrides.asInstanceOf[js.Any], staticOverrides.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def extend(subclass: Any, superclass: Any, overrides: Unit, staticOverrides: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(subclass.asInstanceOf[js.Any], superclass.asInstanceOf[js.Any], overrides.asInstanceOf[js.Any], staticOverrides.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def filter[T_6](arr: js.Array[T_6], func: js.Function2[/* v */ T_6, /* idx */ Double, Boolean]): js.Array[T_6] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(arr.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[js.Array[T_6]]
  
  @JSImport("bizcharts", "Util.find")
  @js.native
  def find: FnCallArrPredicate = js.native
  
  @JSImport("bizcharts", "Util.findIndex")
  @js.native
  def findIndex: FnCallArrPredicateFromIndex = js.native
  inline def findIndex_=(x: FnCallArrPredicateFromIndex): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findIndex")(x.asInstanceOf[js.Any])
  
  inline def find_=(x: FnCallArrPredicate): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("find")(x.asInstanceOf[js.Any])
  
  inline def firstValue(data: js.Array[js.Object], name: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("firstValue")(data.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def fixedBase(v: Double, base: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("fixedBase")(v.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def fixedBase(v: Double, base: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("fixedBase")(v.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def flatten[T_1](arr: js.Array[T_1]): js.Array[T_1] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[T_1]]
  
  inline def flattenDeep(arr: js.Array[Any]): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("flattenDeep")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  inline def flattenDeep(arr: js.Array[Any], result: js.Array[Any]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenDeep")(arr.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def fold(data: js.Array[Any], fields: js.Array[String], foldCate: String, foldValue: String): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fold")(data.asInstanceOf[js.Any], fields.asInstanceOf[js.Any], foldCate.asInstanceOf[js.Any], foldValue.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  @JSImport("bizcharts", "Util.forIn")
  @js.native
  def forIn: FnCallElementsFunc = js.native
  inline def forIn_=(x: FnCallElementsFunc): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("forIn")(x.asInstanceOf[js.Any])
  
  inline def get(obj: Any, key: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def get(obj: Any, key: String, defaultValue: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def get(obj: Any, key: js.Array[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def get(obj: Any, key: js.Array[Any], defaultValue: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("bizcharts", "Util.getAngle")
  @js.native
  def getAngle: js.Function2[
    /* shapeModel */ ShapeInfo, 
    /* coordinate */ typingsJapgolly.antvG2.libDependentsMod.Coordinate, 
    StartAngle
  ] = js.native
  inline def getAngle(shapeModel: ShapeInfo, coordinate: typingsJapgolly.antvG2.libDependentsMod.Coordinate): StartAngle = (^.asInstanceOf[js.Dynamic].applyDynamic("getAngle")(shapeModel.asInstanceOf[js.Any], coordinate.asInstanceOf[js.Any])).asInstanceOf[StartAngle]
  inline def getAngle_=(
    x: js.Function2[
      /* shapeModel */ ShapeInfo, 
      /* coordinate */ typingsJapgolly.antvG2.libDependentsMod.Coordinate, 
      StartAngle
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAngle")(x.asInstanceOf[js.Any])
  
  @JSImport("bizcharts", "Util.getDelegationObject")
  @js.native
  def getDelegationObject: js.Function1[/* context */ IInteractionContext, LooseObject] = js.native
  inline def getDelegationObject(context: IInteractionContext): LooseObject = ^.asInstanceOf[js.Dynamic].applyDynamic("getDelegationObject")(context.asInstanceOf[js.Any]).asInstanceOf[LooseObject]
  inline def getDelegationObject_=(x: js.Function1[/* context */ IInteractionContext, LooseObject]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDelegationObject")(x.asInstanceOf[js.Any])
  
  inline def getEllipsisText(text: String, maxWidth: Double): String | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getEllipsisText")(text.asInstanceOf[js.Any], maxWidth.asInstanceOf[js.Any])).asInstanceOf[String | Double]
  inline def getEllipsisText(
    text: String,
    maxWidth: Double,
    font: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_measure-text-width.Font */ Any
  ): String | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getEllipsisText")(text.asInstanceOf[js.Any], maxWidth.asInstanceOf[js.Any], font.asInstanceOf[js.Any])).asInstanceOf[String | Double]
  inline def getEllipsisText(
    text: String,
    maxWidth: Double,
    font: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_measure-text-width.Font */ Any,
    str: String
  ): String | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getEllipsisText")(text.asInstanceOf[js.Any], maxWidth.asInstanceOf[js.Any], font.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[String | Double]
  inline def getEllipsisText(text: String, maxWidth: Double, font: Unit, str: String): String | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getEllipsisText")(text.asInstanceOf[js.Any], maxWidth.asInstanceOf[js.Any], font.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[String | Double]
  inline def getEllipsisText(text: Double, maxWidth: Double): String | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getEllipsisText")(text.asInstanceOf[js.Any], maxWidth.asInstanceOf[js.Any])).asInstanceOf[String | Double]
  inline def getEllipsisText(
    text: Double,
    maxWidth: Double,
    font: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_measure-text-width.Font */ Any
  ): String | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getEllipsisText")(text.asInstanceOf[js.Any], maxWidth.asInstanceOf[js.Any], font.asInstanceOf[js.Any])).asInstanceOf[String | Double]
  inline def getEllipsisText(
    text: Double,
    maxWidth: Double,
    font: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_measure-text-width.Font */ Any,
    str: String
  ): String | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getEllipsisText")(text.asInstanceOf[js.Any], maxWidth.asInstanceOf[js.Any], font.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[String | Double]
  inline def getEllipsisText(text: Double, maxWidth: Double, font: Unit, str: String): String | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getEllipsisText")(text.asInstanceOf[js.Any], maxWidth.asInstanceOf[js.Any], font.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[String | Double]
  
  @JSImport("bizcharts", "Util.getLegendItems")
  @js.native
  def getLegendItems: FnCall | (js.Function5[
    /* view */ typingsJapgolly.antvG2.libChartViewMod.View, 
    /* geometry */ default[ShapePoint], 
    /* attr */ Attribute, 
    /* themeMarker */ js.Object, 
    /* userMarker */ js.UndefOr[
      MarkerCfg | (js.Function3[/* name */ String, /* index */ Double, /* item */ namestringvaluestringMark, MarkerCfg])
    ], 
    js.Array[ComponentLegendItem]
  ]) = js.native
  inline def getLegendItems(
    view: typingsJapgolly.antvG2.libChartViewMod.View,
    geometry: default[ShapePoint],
    attr: Attribute,
    themeMarker: js.Object
  ): js.Array[ComponentLegendItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLegendItems")(view.asInstanceOf[js.Any], geometry.asInstanceOf[js.Any], attr.asInstanceOf[js.Any], themeMarker.asInstanceOf[js.Any])).asInstanceOf[js.Array[ComponentLegendItem]]
  inline def getLegendItems(
    view: typingsJapgolly.antvG2.libChartViewMod.View,
    geometry: default[ShapePoint],
    attr: Attribute,
    themeMarker: js.Object,
    userMarker: js.Function3[/* name */ String, /* index */ Double, /* item */ namestringvaluestringMark, MarkerCfg]
  ): js.Array[ComponentLegendItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLegendItems")(view.asInstanceOf[js.Any], geometry.asInstanceOf[js.Any], attr.asInstanceOf[js.Any], themeMarker.asInstanceOf[js.Any], userMarker.asInstanceOf[js.Any])).asInstanceOf[js.Array[ComponentLegendItem]]
  inline def getLegendItems(
    view: typingsJapgolly.antvG2.libChartViewMod.View,
    geometry: default[ShapePoint],
    attr: Attribute,
    themeMarker: js.Object,
    userMarker: MarkerCfg
  ): js.Array[ComponentLegendItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLegendItems")(view.asInstanceOf[js.Any], geometry.asInstanceOf[js.Any], attr.asInstanceOf[js.Any], themeMarker.asInstanceOf[js.Any], userMarker.asInstanceOf[js.Any])).asInstanceOf[js.Array[ComponentLegendItem]]
  inline def getLegendItems_=(
    x: FnCall | (js.Function5[
      /* view */ typingsJapgolly.antvG2.libChartViewMod.View, 
      /* geometry */ default[ShapePoint], 
      /* attr */ Attribute, 
      /* themeMarker */ js.Object, 
      /* userMarker */ js.UndefOr[
        MarkerCfg | (js.Function3[/* name */ String, /* index */ Double, /* item */ namestringvaluestringMark, MarkerCfg])
      ], 
      js.Array[ComponentLegendItem]
    ])
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getLegendItems")(x.asInstanceOf[js.Any])
  
  @JSImport("bizcharts", "Util.getMappingValue")
  @js.native
  def getMappingValue: js.Function3[/* attr */ Attribute, /* value */ Any, /* def */ String, String] = js.native
  inline def getMappingValue(attr: Attribute, value: Any, `def`: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getMappingValue")(attr.asInstanceOf[js.Any], value.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getMappingValue_=(x: js.Function3[/* attr */ Attribute, /* value */ Any, /* def */ String, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getMappingValue")(x.asInstanceOf[js.Any])
  
  @JSImport("bizcharts", "Util.getPath")
  @js.native
  def getPath: js.Function6[
    /* points */ js.Array[typingsJapgolly.antvG2.libInterfaceMod.Point | RangePoint], 
    /* isInCircle */ Boolean, 
    /* isStack */ js.UndefOr[Boolean], 
    /* smooth */ js.UndefOr[Boolean], 
    /* constraint */ js.UndefOr[js.Array[Position]], 
    /* style */ js.UndefOr[ShapeAttrs], 
    Any
  ] = js.native
  inline def getPath(points: js.Array[typingsJapgolly.antvG2.libInterfaceMod.Point | RangePoint], isInCircle: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getPath(
    points: js.Array[typingsJapgolly.antvG2.libInterfaceMod.Point | RangePoint],
    isInCircle: Boolean,
    isStack: Boolean
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any], isStack.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getPath(
    points: js.Array[typingsJapgolly.antvG2.libInterfaceMod.Point | RangePoint],
    isInCircle: Boolean,
    isStack: Boolean,
    smooth: Boolean
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any], isStack.asInstanceOf[js.Any], smooth.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getPath(
    points: js.Array[typingsJapgolly.antvG2.libInterfaceMod.Point | RangePoint],
    isInCircle: Boolean,
    isStack: Boolean,
    smooth: Boolean,
    constraint: js.Array[Position]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any], isStack.asInstanceOf[js.Any], smooth.asInstanceOf[js.Any], constraint.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getPath(
    points: js.Array[typingsJapgolly.antvG2.libInterfaceMod.Point | RangePoint],
    isInCircle: Boolean,
    isStack: Boolean,
    smooth: Boolean,
    constraint: js.Array[Position],
    style: ShapeAttrs
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any], isStack.asInstanceOf[js.Any], smooth.asInstanceOf[js.Any], constraint.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getPath(
    points: js.Array[typingsJapgolly.antvG2.libInterfaceMod.Point | RangePoint],
    isInCircle: Boolean,
    isStack: Boolean,
    smooth: Boolean,
    constraint: Unit,
    style: ShapeAttrs
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any], isStack.asInstanceOf[js.Any], smooth.asInstanceOf[js.Any], constraint.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getPath(
    points: js.Array[typingsJapgolly.antvG2.libInterfaceMod.Point | RangePoint],
    isInCircle: Boolean,
    isStack: Boolean,
    smooth: Unit,
    constraint: js.Array[Position]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any], isStack.asInstanceOf[js.Any], smooth.asInstanceOf[js.Any], constraint.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getPath(
    points: js.Array[typingsJapgolly.antvG2.libInterfaceMod.Point | RangePoint],
    isInCircle: Boolean,
    isStack: Boolean,
    smooth: Unit,
    constraint: js.Array[Position],
    style: ShapeAttrs
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any], isStack.asInstanceOf[js.Any], smooth.asInstanceOf[js.Any], constraint.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getPath(
    points: js.Array[typingsJapgolly.antvG2.libInterfaceMod.Point | RangePoint],
    isInCircle: Boolean,
    isStack: Boolean,
    smooth: Unit,
    constraint: Unit,
    style: ShapeAttrs
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any], isStack.asInstanceOf[js.Any], smooth.asInstanceOf[js.Any], constraint.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getPath(
    points: js.Array[typingsJapgolly.antvG2.libInterfaceMod.Point | RangePoint],
    isInCircle: Boolean,
    isStack: Unit,
    smooth: Boolean
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any], isStack.asInstanceOf[js.Any], smooth.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getPath(
    points: js.Array[typingsJapgolly.antvG2.libInterfaceMod.Point | RangePoint],
    isInCircle: Boolean,
    isStack: Unit,
    smooth: Boolean,
    constraint: js.Array[Position]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any], isStack.asInstanceOf[js.Any], smooth.asInstanceOf[js.Any], constraint.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getPath(
    points: js.Array[typingsJapgolly.antvG2.libInterfaceMod.Point | RangePoint],
    isInCircle: Boolean,
    isStack: Unit,
    smooth: Boolean,
    constraint: js.Array[Position],
    style: ShapeAttrs
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any], isStack.asInstanceOf[js.Any], smooth.asInstanceOf[js.Any], constraint.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getPath(
    points: js.Array[typingsJapgolly.antvG2.libInterfaceMod.Point | RangePoint],
    isInCircle: Boolean,
    isStack: Unit,
    smooth: Boolean,
    constraint: Unit,
    style: ShapeAttrs
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any], isStack.asInstanceOf[js.Any], smooth.asInstanceOf[js.Any], constraint.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getPath(
    points: js.Array[typingsJapgolly.antvG2.libInterfaceMod.Point | RangePoint],
    isInCircle: Boolean,
    isStack: Unit,
    smooth: Unit,
    constraint: js.Array[Position]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any], isStack.asInstanceOf[js.Any], smooth.asInstanceOf[js.Any], constraint.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getPath(
    points: js.Array[typingsJapgolly.antvG2.libInterfaceMod.Point | RangePoint],
    isInCircle: Boolean,
    isStack: Unit,
    smooth: Unit,
    constraint: js.Array[Position],
    style: ShapeAttrs
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any], isStack.asInstanceOf[js.Any], smooth.asInstanceOf[js.Any], constraint.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getPath(
    points: js.Array[typingsJapgolly.antvG2.libInterfaceMod.Point | RangePoint],
    isInCircle: Boolean,
    isStack: Unit,
    smooth: Unit,
    constraint: Unit,
    style: ShapeAttrs
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any], isStack.asInstanceOf[js.Any], smooth.asInstanceOf[js.Any], constraint.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("bizcharts", "Util.getPathPoints")
  @js.native
  def getPathPoints: js.Function3[
    /* points */ ShapeVertices, 
    /* connectNulls */ js.UndefOr[Boolean], 
    /* showSinglePoint */ js.UndefOr[Boolean], 
    js.Array[Any]
  ] = js.native
  inline def getPathPoints(points: ShapeVertices): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathPoints")(points.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  inline def getPathPoints(points: ShapeVertices, connectNulls: Boolean): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPathPoints")(points.asInstanceOf[js.Any], connectNulls.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  inline def getPathPoints(points: ShapeVertices, connectNulls: Boolean, showSinglePoint: Boolean): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPathPoints")(points.asInstanceOf[js.Any], connectNulls.asInstanceOf[js.Any], showSinglePoint.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  inline def getPathPoints(points: ShapeVertices, connectNulls: Unit, showSinglePoint: Boolean): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPathPoints")(points.asInstanceOf[js.Any], connectNulls.asInstanceOf[js.Any], showSinglePoint.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  inline def getPathPoints_=(
    x: js.Function3[
      /* points */ ShapeVertices, 
      /* connectNulls */ js.UndefOr[Boolean], 
      /* showSinglePoint */ js.UndefOr[Boolean], 
      js.Array[Any]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getPathPoints")(x.asInstanceOf[js.Any])
  
  inline def getPath_=(
    x: js.Function6[
      /* points */ js.Array[typingsJapgolly.antvG2.libInterfaceMod.Point | RangePoint], 
      /* isInCircle */ Boolean, 
      /* isStack */ js.UndefOr[Boolean], 
      /* smooth */ js.UndefOr[Boolean], 
      /* constraint */ js.UndefOr[js.Array[Position]], 
      /* style */ js.UndefOr[ShapeAttrs], 
      Any
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getPath")(x.asInstanceOf[js.Any])
  
  inline def getRange(values: js.Array[Double]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getRange")(values.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("bizcharts", "Util.getSectorPath")
  @js.native
  def getSectorPath: FnCallCenterXCenterYRadiusStartAngleInRadianEndAngleInRadianInnerRadius | (js.Function6[
    /* centerX */ Double, 
    /* centerY */ Double, 
    /* radius */ Double, 
    /* startAngleInRadian */ Double, 
    /* endAngleInRadian */ Double, 
    /* innerRadius */ js.UndefOr[Double], 
    js.Array[js.Array[String | Double]]
  ]) = js.native
  inline def getSectorPath(
    centerX: Double,
    centerY: Double,
    radius: Double,
    startAngleInRadian: Double,
    endAngleInRadian: Double
  ): js.Array[js.Array[String | Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSectorPath")(centerX.asInstanceOf[js.Any], centerY.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], startAngleInRadian.asInstanceOf[js.Any], endAngleInRadian.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[String | Double]]]
  inline def getSectorPath(
    centerX: Double,
    centerY: Double,
    radius: Double,
    startAngleInRadian: Double,
    endAngleInRadian: Double,
    innerRadius: Double
  ): js.Array[js.Array[String | Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSectorPath")(centerX.asInstanceOf[js.Any], centerY.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], startAngleInRadian.asInstanceOf[js.Any], endAngleInRadian.asInstanceOf[js.Any], innerRadius.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[String | Double]]]
  inline def getSectorPath_=(
    x: FnCallCenterXCenterYRadiusStartAngleInRadianEndAngleInRadianInnerRadius | (js.Function6[
      /* centerX */ Double, 
      /* centerY */ Double, 
      /* radius */ Double, 
      /* startAngleInRadian */ Double, 
      /* endAngleInRadian */ Double, 
      /* innerRadius */ js.UndefOr[Double], 
      js.Array[js.Array[String | Double]]
    ])
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getSectorPath")(x.asInstanceOf[js.Any])
  
  @JSImport("bizcharts", "Util.getTooltipItems")
  @js.native
  def getTooltipItems: FnCallDataGeometryTitleShowNil | (js.Function4[
    /* data */ MappingDatum, 
    /* geometry */ default[ShapePoint], 
    /* title */ js.UndefOr[TooltipTitle], 
    /* showNil */ js.UndefOr[Boolean], 
    js.Array[Any]
  ]) = js.native
  inline def getTooltipItems(data: MappingDatum, geometry: default[ShapePoint]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTooltipItems")(data.asInstanceOf[js.Any], geometry.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  inline def getTooltipItems(data: MappingDatum, geometry: default[ShapePoint], title: Unit, showNil: Boolean): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTooltipItems")(data.asInstanceOf[js.Any], geometry.asInstanceOf[js.Any], title.asInstanceOf[js.Any], showNil.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  inline def getTooltipItems(data: MappingDatum, geometry: default[ShapePoint], title: TooltipTitle): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTooltipItems")(data.asInstanceOf[js.Any], geometry.asInstanceOf[js.Any], title.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  inline def getTooltipItems(data: MappingDatum, geometry: default[ShapePoint], title: TooltipTitle, showNil: Boolean): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTooltipItems")(data.asInstanceOf[js.Any], geometry.asInstanceOf[js.Any], title.asInstanceOf[js.Any], showNil.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  inline def getTooltipItems_=(
    x: FnCallDataGeometryTitleShowNil | (js.Function4[
      /* data */ MappingDatum, 
      /* geometry */ default[ShapePoint], 
      /* title */ js.UndefOr[TooltipTitle], 
      /* showNil */ js.UndefOr[Boolean], 
      js.Array[Any]
    ])
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getTooltipItems")(x.asInstanceOf[js.Any])
  
  inline def getType(value: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getType")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("bizcharts", "Util.getWrapBehavior")
  @js.native
  def getWrapBehavior: js.Function2[/* obj */ js.Object, /* action */ String, js.Function] = js.native
  inline def getWrapBehavior_=(x: js.Function2[/* obj */ js.Object, /* action */ String, js.Function]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getWrapBehavior")(x.asInstanceOf[js.Any])
  
  inline def group[T_9](data: js.Array[T_9], condition: String): js.Array[js.Array[T_9]] = (^.asInstanceOf[js.Dynamic].applyDynamic("group")(data.asInstanceOf[js.Any], condition.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[T_9]]]
  inline def group[T_9](data: js.Array[T_9], condition: js.Array[String]): js.Array[js.Array[T_9]] = (^.asInstanceOf[js.Dynamic].applyDynamic("group")(data.asInstanceOf[js.Any], condition.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[T_9]]]
  inline def group[T_9](data: js.Array[T_9], condition: js.Function1[/* v */ T_9, String]): js.Array[js.Array[T_9]] = (^.asInstanceOf[js.Dynamic].applyDynamic("group")(data.asInstanceOf[js.Any], condition.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[T_9]]]
  
  @JSImport("bizcharts", "Util.groupBy")
  @js.native
  def groupBy: FnCallDataCondition = js.native
  inline def groupBy_=(x: FnCallDataCondition): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("groupBy")(x.asInstanceOf[js.Any])
  
  @JSImport("bizcharts", "Util.groupToMap")
  @js.native
  def groupToMap: Fn0 = js.native
  inline def groupToMap_=(x: Fn0): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("groupToMap")(x.asInstanceOf[js.Any])
  
  inline def has(obj: js.Object, key: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def hasKey(obj: js.Object, key: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasKey")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def hasValue(obj: js.Object, value: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasValue")(obj.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("bizcharts", "Util.head")
  @js.native
  def head: js.Function1[/* o */ Any, Any] = js.native
  inline def head_=(x: js.Function1[/* o */ Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("head")(x.asInstanceOf[js.Any])
  
  inline def identity[T_19](v: T_19): T_19 = ^.asInstanceOf[js.Dynamic].applyDynamic("identity")(v.asInstanceOf[js.Any]).asInstanceOf[T_19]
  
  inline def includes(arr: js.Array[Any], value: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("includes")(arr.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def indexOf[T_13](arr: js.Array[T_13], obj: T_13): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(arr.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def isArguments(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArguments")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isArray(value: Any): /* is std.Array<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<any> */ Boolean]
  
  inline def isArrayLike(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArrayLike")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isBoolean(value: Any): /* is boolean */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBoolean")(value.asInstanceOf[js.Any]).asInstanceOf[/* is boolean */ Boolean]
  
  inline def isDate(value: Any): /* is std.Date */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDate")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Date */ Boolean]
  
  inline def isDecimal(num: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDecimal")(num.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isElement(o: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElement")(o.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("bizcharts", "Util.isEmpty")
  @js.native
  def isEmpty: js.Function1[/* value */ Any, Boolean] = js.native
  inline def isEmpty_=(x: js.Function1[/* value */ Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isEmpty")(x.asInstanceOf[js.Any])
  
  inline def isEqual(value: Any, other: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEqual")(value.asInstanceOf[js.Any], other.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isEqualWith[T_14](value: T_14, other: T_14, fn: js.Function2[/* v1 */ T_14, /* v2 */ T_14, Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEqualWith")(value.asInstanceOf[js.Any], other.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isError(value: Any): /* is std.Error */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isError")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Error */ Boolean]
  
  inline def isEven(num: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEven")(num.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("bizcharts", "Util.isFinite")
  @js.native
  def isFinite: js.Function1[/* value */ Any, /* is number */ Boolean] = js.native
  inline def isFinite_=(x: js.Function1[/* value */ Any, /* is number */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isFinite")(x.asInstanceOf[js.Any])
  
  inline def isFunction(value: Any): /* is std.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Function */ Boolean]
  
  inline def isInteger(number: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInteger")(number.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("bizcharts", "Util.isMatch")
  @js.native
  def isMatch: js.Function2[/* obj */ Any, /* attrs */ Any, Boolean] = js.native
  inline def isMatch_=(x: js.Function2[/* obj */ Any, /* attrs */ Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isMatch")(x.asInstanceOf[js.Any])
  
  inline def isNegative(num: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNegative")(num.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNil(value: Any): /* is null */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNil")(value.asInstanceOf[js.Any]).asInstanceOf[/* is null */ Boolean]
  
  inline def isNull(value: Any): /* is null */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNull")(value.asInstanceOf[js.Any]).asInstanceOf[/* is null */ Boolean]
  
  inline def isNumber(value: Any): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(value.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
  
  @JSImport("bizcharts", "Util.isNumberEqual")
  @js.native
  def isNumberEqual: FnCallABPrecision = js.native
  inline def isNumberEqual_=(x: FnCallABPrecision): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isNumberEqual")(x.asInstanceOf[js.Any])
  
  inline def isObject[T_12](value: Any): /* is T_12 */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(value.asInstanceOf[js.Any]).asInstanceOf[/* is T_12 */ Boolean]
  
  inline def isObjectLike(value: Any): /* is object */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObjectLike")(value.asInstanceOf[js.Any]).asInstanceOf[/* is object */ Boolean]
  
  inline def isOdd(num: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOdd")(num.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPlainObject(value: Any): /* is object */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPlainObject")(value.asInstanceOf[js.Any]).asInstanceOf[/* is object */ Boolean]
  
  inline def isPositive(num: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPositive")(num.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPrototype(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPrototype")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isRegExp(str: Any): /* is std.RegExp */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRegExp")(str.asInstanceOf[js.Any]).asInstanceOf[/* is std.RegExp */ Boolean]
  
  inline def isString(str: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(str.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  inline def isType(value: Any, `type`: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isType")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isUndefined(value: Any): /* is undefined */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUndefined")(value.asInstanceOf[js.Any]).asInstanceOf[/* is undefined */ Boolean]
  
  inline def keys(obj: Any): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  @JSImport("bizcharts", "Util.last")
  @js.native
  def last: js.Function1[/* o */ Any, Any] = js.native
  inline def last_=(x: js.Function1[/* o */ Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("last")(x.asInstanceOf[js.Any])
  
  inline def lowerCase(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("lowerCase")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def lowerFirst(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("lowerFirst")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def map[T_15, G_1](arr: js.Array[T_15], func: js.Function2[/* v */ T_15, /* idx */ Double, G_1]): js.Array[G_1] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(arr.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[js.Array[G_1]]
  
  inline def mapValues[T_16](`object`: StringDictionary[T_16]): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapValues")(`object`.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def mapValues[T_16](`object`: StringDictionary[T_16], func: js.Function2[/* value */ T_16, /* key */ String, Any]): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapValues")(`object`.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  inline def max(arr: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(arr.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def maxBy[T_10](arr: js.Array[T_10], fn: String): T_10 = (^.asInstanceOf[js.Dynamic].applyDynamic("maxBy")(arr.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[T_10]
  inline def maxBy[T_10](arr: js.Array[T_10], fn: js.Function1[/* v */ T_10, Double]): T_10 = (^.asInstanceOf[js.Dynamic].applyDynamic("maxBy")(arr.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[T_10]
  
  @JSImport("bizcharts", "Util.measureTextWidth")
  @js.native
  def measureTextWidth: Call = js.native
  inline def measureTextWidth_=(x: Call): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("measureTextWidth")(x.asInstanceOf[js.Any])
  
  inline def memoize(f: js.Function): Call = ^.asInstanceOf[js.Dynamic].applyDynamic("memoize")(f.asInstanceOf[js.Any]).asInstanceOf[Call]
  inline def memoize(f: js.Function, resolver: js.Function1[/* repeated */ Any, String]): Call = (^.asInstanceOf[js.Dynamic].applyDynamic("memoize")(f.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any])).asInstanceOf[Call]
  
  inline def min(arr: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(arr.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def minBy[T_11](arr: js.Array[T_11], fn: String): T_11 = (^.asInstanceOf[js.Dynamic].applyDynamic("minBy")(arr.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[T_11]
  inline def minBy[T_11](arr: js.Array[T_11], fn: js.Function1[/* v */ T_11, Double]): T_11 = (^.asInstanceOf[js.Dynamic].applyDynamic("minBy")(arr.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[T_11]
  
  inline def minifyNum(num: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("minifyNum")(num.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def minifyNum(num: Any, decimal: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("minifyNum")(num.asInstanceOf[js.Any], decimal.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("bizcharts", "Util.mix")
  @js.native
  def mix: FnCallDistSrc1Src2Src3 = js.native
  inline def mix_=(x: FnCallDistSrc1Src2Src3): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mix")(x.asInstanceOf[js.Any])
  
  inline def mod(n: Double, m: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("mod")(n.asInstanceOf[js.Any], m.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def noop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")().asInstanceOf[Unit]
  
  @JSImport("bizcharts", "Util.number2color")
  @js.native
  def number2color: js.Function1[/* num */ Double, String] = js.native
  inline def number2color_=(x: js.Function1[/* num */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("number2color")(x.asInstanceOf[js.Any])
  
  inline def omit[T_18](
    obj: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_types.ObjectType<T_18> */ Any,
    keys: js.Array[String]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("omit")(obj.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("bizcharts", "Util.parseRadius")
  @js.native
  def parseRadius: FnCallRadius = js.native
  inline def parseRadius_=(x: FnCallRadius): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parseRadius")(x.asInstanceOf[js.Any])
  
  inline def percentage(data: js.Array[js.Object], field: String, as: String): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("percentage")(data.asInstanceOf[js.Any], field.asInstanceOf[js.Any], as.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  inline def percentage(data: js.Array[js.Object], field: String, as: String, groupBy: String): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("percentage")(data.asInstanceOf[js.Any], field.asInstanceOf[js.Any], as.asInstanceOf[js.Any], groupBy.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  inline def percentage(data: js.Array[js.Object], field: String, as: String, groupBy: js.Array[String]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("percentage")(data.asInstanceOf[js.Any], field.asInstanceOf[js.Any], as.asInstanceOf[js.Any], groupBy.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def pick[T_17](
    `object`: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_pick.ObjectType<T_17> */ Any,
    keys: js.Array[String]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("pick")(`object`.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("bizcharts", "Util.polarToCartesian")
  @js.native
  def polarToCartesian: js.Function4[
    /* centerX */ Double, 
    /* centerY */ Double, 
    /* radius */ Double, 
    /* angleInRadian */ Double, 
    X
  ] = js.native
  inline def polarToCartesian(centerX: Double, centerY: Double, radius: Double, angleInRadian: Double): X = (^.asInstanceOf[js.Dynamic].applyDynamic("polarToCartesian")(centerX.asInstanceOf[js.Any], centerY.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], angleInRadian.asInstanceOf[js.Any])).asInstanceOf[X]
  inline def polarToCartesian_=(
    x: js.Function4[
      /* centerX */ Double, 
      /* centerY */ Double, 
      /* radius */ Double, 
      /* angleInRadian */ Double, 
      X
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("polarToCartesian")(x.asInstanceOf[js.Any])
  
  inline def pull[T_2](arr: js.Array[T_2], values: Any*): js.Array[T_2] = ^.asInstanceOf[js.Dynamic].applyDynamic("pull")(scala.List(arr.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Array[T_2]]
  
  inline def pullAt[T_3](arr: js.Array[T_3], indexes: js.Array[Double]): js.Array[T_3] = (^.asInstanceOf[js.Dynamic].applyDynamic("pullAt")(arr.asInstanceOf[js.Any], indexes.asInstanceOf[js.Any])).asInstanceOf[js.Array[T_3]]
  
  inline def reduce[T_4, G](
    arr: js.Array[G],
    fn: js.Function3[/* result */ T_4, /* data */ G, /* idx */ String | Double, T_4],
    init: T_4
  ): T_4 = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(arr.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[T_4]
  inline def reduce[T_4, G](
    arr: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_types.ObjectType<T_4> */ Any,
    fn: js.Function3[/* result */ T_4, /* data */ G, /* idx */ String | Double, T_4],
    init: T_4
  ): T_4 = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(arr.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[T_4]
  
  inline def remove[T_5](
    arr: js.Array[T_5],
    predicate: js.Function3[/* value */ T_5, /* idx */ Double, /* arr */ js.UndefOr[js.Array[T_5]], Boolean]
  ): js.Array[T_5] = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(arr.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[js.Array[T_5]]
  
  @JSImport("bizcharts", "Util.requestAnimationFrame")
  @js.native
  def requestAnimationFrame: js.Function1[/* fn */ FrameRequestCallback, Any] = js.native
  inline def requestAnimationFrame_=(x: js.Function1[/* fn */ FrameRequestCallback, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("requestAnimationFrame")(x.asInstanceOf[js.Any])
  
  @JSImport("bizcharts", "Util.rotate")
  @js.native
  def rotate: FnCallElementRotateRadian | (js.Function2[/* element */ IGroup | IShape, /* rotateRadian */ Double, Unit]) = js.native
  inline def rotate(element: IGroup, rotateRadian: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(element.asInstanceOf[js.Any], rotateRadian.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def rotate(element: IShape, rotateRadian: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(element.asInstanceOf[js.Any], rotateRadian.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def rotate_=(
    x: FnCallElementRotateRadian | (js.Function2[/* element */ IGroup | IShape, /* rotateRadian */ Double, Unit])
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rotate")(x.asInstanceOf[js.Any])
  
  inline def set(obj: Any, path: String, value: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def set(obj: Any, path: js.Array[Any], value: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("bizcharts", "Util.shallowEqual")
  @js.native
  def shallowEqual: js.Function2[/* objA */ Any, /* objB */ Any, Boolean] = js.native
  inline def shallowEqual_=(x: js.Function2[/* objA */ Any, /* objB */ Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shallowEqual")(x.asInstanceOf[js.Any])
  
  @JSImport("bizcharts", "Util.size")
  @js.native
  def size: js.Function1[/* o */ Any, Double] = js.native
  inline def size_=(x: js.Function1[/* o */ Any, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
  
  inline def some[T_8](arr: js.Array[T_8], func: js.Function2[/* v */ T_8, /* idx */ js.UndefOr[Double], Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(arr.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("bizcharts", "Util.sortBy")
  @js.native
  def sortBy: FnCallArrKey = js.native
  inline def sortBy_=(x: FnCallArrKey): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sortBy")(x.asInstanceOf[js.Any])
  
  inline def splitBySeparator(num: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("splitBySeparator")(num.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def splitBySeparator(num: Any, separator: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("splitBySeparator")(num.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("bizcharts", "Util.startsWith")
  @js.native
  def startsWith: FnCallArrE = js.native
  inline def startsWith_=(x: FnCallArrE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("startsWith")(x.asInstanceOf[js.Any])
  
  @JSImport("bizcharts", "Util.substitute")
  @js.native
  def substitute: FnCallStrO = js.native
  inline def substitute_=(x: FnCallStrO): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("substitute")(x.asInstanceOf[js.Any])
  
  inline def throttle(
    func: js.Function,
    wait: Double,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_throttle.OptionsType */ Any
  ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  
  inline def toArray(value: Any): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def toDegree(radian: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toDegree")(radian.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @JSImport("bizcharts", "Util.toInteger")
  @js.native
  def toInteger: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof antUtils.toInteger */ Any = js.native
  inline def toInteger_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof antUtils.toInteger */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toInteger")(x.asInstanceOf[js.Any])
  
  inline def toRadian(degree: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toRadian")(degree.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def toString_(value: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def transform(m: js.Array[Double], actions: js.Array[js.Array[Any]]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(m.asInstanceOf[js.Any], actions.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @JSImport("bizcharts", "Util.translate")
  @js.native
  def translate: FnCallElementXY | (js.Function3[/* element */ IGroup | IShape, /* x */ Double, /* y */ Double, Unit]) = js.native
  inline def translate(element: IGroup, x: Double, y: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(element.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def translate(element: IShape, x: Double, y: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(element.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def translate_=(
    x: FnCallElementXY | (js.Function3[/* element */ IGroup | IShape, /* x */ Double, /* y */ Double, Unit])
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("translate")(x.asInstanceOf[js.Any])
  
  inline def union(sources: Any*): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(sources.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Array[Any]]
  
  @JSImport("bizcharts", "Util.uniq")
  @js.native
  def uniq: FnCallArrCache = js.native
  inline def uniq_=(x: FnCallArrCache): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uniq")(x.asInstanceOf[js.Any])
  
  inline def uniqueId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("uniqueId")().asInstanceOf[String]
  inline def uniqueId(prefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("uniqueId")(prefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def upperCase(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("upperCase")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def upperFirst(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("upperFirst")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def values(obj: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def valuesOfKey(data: js.Array[Any], name: String): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("valuesOfKey")(data.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def visibleHelper(cfg: Any): Visible | TextVisible = ^.asInstanceOf[js.Dynamic].applyDynamic("visibleHelper")(cfg.asInstanceOf[js.Any]).asInstanceOf[Visible | TextVisible]
  inline def visibleHelper(cfg: Any, defaultVisible: Boolean): Visible | TextVisible = (^.asInstanceOf[js.Dynamic].applyDynamic("visibleHelper")(cfg.asInstanceOf[js.Any], defaultVisible.asInstanceOf[js.Any])).asInstanceOf[Visible | TextVisible]
  
  @JSImport("bizcharts", "Util.wrapBehavior")
  @js.native
  def wrapBehavior: js.Function2[/* obj */ js.Object, /* action */ String, js.Function] = js.native
  inline def wrapBehavior_=(x: js.Function2[/* obj */ js.Object, /* action */ String, js.Function]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wrapBehavior")(x.asInstanceOf[js.Any])
  
  @JSImport("bizcharts", "Util.zoom")
  @js.native
  def zoom: FnCallElementRatio | (js.Function2[/* element */ IGroup | IShape, /* ratio */ Double, Unit]) = js.native
  inline def zoom(element: IGroup, ratio: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("zoom")(element.asInstanceOf[js.Any], ratio.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def zoom(element: IShape, ratio: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("zoom")(element.asInstanceOf[js.Any], ratio.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def zoom_=(x: FnCallElementRatio | (js.Function2[/* element */ IGroup | IShape, /* ratio */ Double, Unit])): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zoom")(x.asInstanceOf[js.Any])
}
