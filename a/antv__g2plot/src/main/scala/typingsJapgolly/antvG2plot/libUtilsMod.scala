package typingsJapgolly.antvG2plot

import org.scalajs.dom.HTMLElement
import typingsJapgolly.antvG2.libInterfaceMod.ShapePoint
import typingsJapgolly.antvG2.libInterfaceMod.ViewAppendPadding
import typingsJapgolly.antvG2.libInterfaceMod.ViewPadding
import typingsJapgolly.antvG2.mod.Element
import typingsJapgolly.antvG2.mod.Geometry
import typingsJapgolly.antvG2plot.anon.PlotType
import typingsJapgolly.antvG2plot.anon.Statistic
import typingsJapgolly.antvG2plot.antvG2plotStrings.auto
import typingsJapgolly.antvG2plot.libTypesCommonMod.Data
import typingsJapgolly.antvG2plot.libTypesCommonMod.Datum
import typingsJapgolly.antvG2plot.libTypesCommonMod.Point
import typingsJapgolly.antvG2plot.libTypesCommonMod.Position
import typingsJapgolly.antvG2plot.libTypesCommonMod.Size
import typingsJapgolly.antvG2plot.libTypesMetaMod.Meta
import typingsJapgolly.antvG2plot.libTypesRelationDataMod.NodeLinkData
import typingsJapgolly.antvG2plot.libUtilsFlowMod.FlowFunction
import typingsJapgolly.antvG2plot.libUtilsInvariantMod.LEVEL
import typingsJapgolly.std.Map
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsMod {
  
  @JSImport("@antv/g2plot/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@antv/g2plot/lib/utils", "LEVEL")
  @js.native
  object LEVEL extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.antvG2plot.libUtilsInvariantMod.LEVEL & String] = js.native
    
    /* "error" */ val ERROR: typingsJapgolly.antvG2plot.libUtilsInvariantMod.LEVEL.ERROR & String = js.native
    
    /* "log" */ val INFO: typingsJapgolly.antvG2plot.libUtilsInvariantMod.LEVEL.INFO & String = js.native
    
    /* "warn" */ val WARN: typingsJapgolly.antvG2plot.libUtilsInvariantMod.LEVEL.WARN & String = js.native
  }
  
  inline def adjustYMetaByZero(data: Data, field: String): Meta = (^.asInstanceOf[js.Dynamic].applyDynamic("adjustYMetaByZero")(data.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[Meta]
  
  inline def deepAssign(rst: Any, args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("deepAssign")(scala.List(rst.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
  
  inline def findGeometry(
    view: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify View */ Any,
    `type`: String
  ): Geometry[ShapePoint] = (^.asInstanceOf[js.Dynamic].applyDynamic("findGeometry")(view.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Geometry[ShapePoint]]
  
  inline def findViewById(
    chart: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify View */ Any,
    id: String
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("findViewById")(chart.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def flow[P](flows: FlowFunction[P]*): FlowFunction[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("flow")(flows.asInstanceOf[Seq[js.Any]]*).asInstanceOf[FlowFunction[P]]
  
  inline def getAdjustAppendPadding(padding: ViewAppendPadding): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAdjustAppendPadding")(padding.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def getAdjustAppendPadding(padding: ViewAppendPadding, position: String): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAdjustAppendPadding")(padding.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def getAdjustAppendPadding(padding: ViewAppendPadding, position: String, append: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAdjustAppendPadding")(padding.asInstanceOf[js.Any], position.asInstanceOf[js.Any], append.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def getAdjustAppendPadding(padding: ViewAppendPadding, position: Unit, append: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAdjustAppendPadding")(padding.asInstanceOf[js.Any], position.asInstanceOf[js.Any], append.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def getAllElements(
    view: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify View */ Any
  ): js.Array[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllElements")(view.asInstanceOf[js.Any]).asInstanceOf[js.Array[Element]]
  
  inline def getAllElementsRecursively(
    view: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify View */ Any
  ): js.Array[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllElementsRecursively")(view.asInstanceOf[js.Any]).asInstanceOf[js.Array[Element]]
  
  inline def getAllGeometriesRecursively(
    view: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify View */ Any
  ): js.Array[Geometry[ShapePoint]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllGeometriesRecursively")(view.asInstanceOf[js.Any]).asInstanceOf[js.Array[Geometry[ShapePoint]]]
  
  inline def getContainerSize(ele: HTMLElement): Size = ^.asInstanceOf[js.Dynamic].applyDynamic("getContainerSize")(ele.asInstanceOf[js.Any]).asInstanceOf[Size]
  
  inline def getSiblingViews(
    view: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify View */ Any
  ): js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify View */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSiblingViews")(view.asInstanceOf[js.Any]).asInstanceOf[js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify View */ Any
  ]]
  
  inline def getSplinePath(points: js.Array[Point]): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSplinePath")(points.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  inline def getSplinePath(points: js.Array[Point], isInCircle: Boolean): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSplinePath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  inline def getSplinePath(points: js.Array[Point], isInCircle: Boolean, constaint: js.Array[Position]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSplinePath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any], constaint.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  inline def getSplinePath(points: js.Array[Point], isInCircle: Unit, constaint: js.Array[Position]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSplinePath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any], constaint.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def getViews(
    view: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify View */ Any
  ): js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify View */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getViews")(view.asInstanceOf[js.Any]).asInstanceOf[js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify View */ Any
  ]]
  
  inline def invariant(condition: Boolean, format: String, args: Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("invariant")((scala.List(condition.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Unit]
  
  inline def isBetween(value: Double, start: Double, end: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBetween")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isRealNumber(v: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRealNumber")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def kebabCase(word: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("kebabCase")(word.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def log(level: LEVEL, condition: Boolean, format: Any, args: Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("log")((scala.List(level.asInstanceOf[js.Any], condition.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Unit]
  
  object measureTextWidth {
    
    inline def apply(args: Any*): Any = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    @JSImport("@antv/g2plot/lib/utils", "measureTextWidth")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@antv/g2plot/lib/utils", "measureTextWidth.cache")
    @js.native
    def cache: Map[Any, Any] = js.native
    inline def cache_=(x: Map[Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cache")(x.asInstanceOf[js.Any])
  }
  
  inline def normalPadding(padding: js.Array[Double]): js.Tuple4[Double, Double, Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalPadding")(padding.asInstanceOf[js.Any]).asInstanceOf[js.Tuple4[Double, Double, Double, Double]]
  inline def normalPadding(padding: Double): js.Tuple4[Double, Double, Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalPadding")(padding.asInstanceOf[js.Any]).asInstanceOf[js.Tuple4[Double, Double, Double, Double]]
  
  inline def normalPadding_auto(padding: auto): js.Tuple4[Double, Double, Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalPadding")(padding.asInstanceOf[js.Any]).asInstanceOf[js.Tuple4[Double, Double, Double, Double]]
  
  inline def pick(obj: Any, keys: js.Array[String]): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("pick")(obj.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def processIllegalData(data: js.Array[Record[String, Any]], field: String): js.Array[Record[String, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("processIllegalData")(data.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[js.Array[Record[String, Any]]]
  
  inline def renderGaugeStatistic(
    chart: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify View */ Any,
    options: Statistic
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderGaugeStatistic")(chart.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def renderGaugeStatistic(
    chart: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify View */ Any,
    options: Statistic,
    datum: Datum
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderGaugeStatistic")(chart.asInstanceOf[js.Any], options.asInstanceOf[js.Any], datum.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def renderStatistic(
    chart: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify View */ Any,
    options: PlotType
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderStatistic")(chart.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def renderStatistic(
    chart: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify View */ Any,
    options: PlotType,
    datum: Datum
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderStatistic")(chart.asInstanceOf[js.Any], options.asInstanceOf[js.Any], datum.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def resolveAllPadding(paddings: js.Array[ViewPadding]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveAllPadding")(paddings.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def template(source: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("template")(source.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def template(source: String, data: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("template")(source.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def transformDataToNodeLinkData(data: Data, sourceField: String, targetField: String, weightField: String): NodeLinkData = (^.asInstanceOf[js.Dynamic].applyDynamic("transformDataToNodeLinkData")(data.asInstanceOf[js.Any], sourceField.asInstanceOf[js.Any], targetField.asInstanceOf[js.Any], weightField.asInstanceOf[js.Any])).asInstanceOf[NodeLinkData]
  inline def transformDataToNodeLinkData(
    data: Data,
    sourceField: String,
    targetField: String,
    weightField: String,
    rawFields: js.Array[String]
  ): NodeLinkData = (^.asInstanceOf[js.Dynamic].applyDynamic("transformDataToNodeLinkData")(data.asInstanceOf[js.Any], sourceField.asInstanceOf[js.Any], targetField.asInstanceOf[js.Any], weightField.asInstanceOf[js.Any], rawFields.asInstanceOf[js.Any])).asInstanceOf[NodeLinkData]
  
  inline def transformLabel(labelOptions: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("transformLabel")(labelOptions.asInstanceOf[js.Any]).asInstanceOf[Any]
}
