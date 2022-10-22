package typingsJapgolly.antvG2

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.antvG2.libGeometryLabelInterfaceMod.LabelCfg
import typingsJapgolly.antvG2.libGeometryLabelInterfaceMod.LabelItem
import typingsJapgolly.antvG2.libGeometryLabelInterfaceMod.LabelPointCfg
import typingsJapgolly.antvG2.libGeometryLabelInterfaceMod.TextAlign
import typingsJapgolly.antvG2.libInterfaceMod.MappingDatum
import typingsJapgolly.antvG2.libInterfaceMod.Point
import typingsJapgolly.antvG2.libInterfaceMod.ShapePoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGeometryLabelBaseMod {
  
  @JSImport("@antv/g2/lib/geometry/label/base", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with GeometryLabel {
    def this(geometry: typingsJapgolly.antvG2.libGeometryBaseMod.default[ShapePoint]) = this()
  }
  
  @js.native
  trait GeometryLabel extends StObject {
    
    def clear(): Unit = js.native
    
    /** 默认的布局 */
    var defaultLayout: String = js.native
    
    def destroy(): Unit = js.native
    
    /** geometry 实例 */
    val geometry: typingsJapgolly.antvG2.libGeometryBaseMod.default[ShapePoint] = js.native
    
    def getCoordinate(): Any = js.native
    
    /**
      * 获取 label 的默认配置
      */
    /* protected */ def getDefaultLabelCfg(): Any = js.native
    /* protected */ def getDefaultLabelCfg(offset: Double): Any = js.native
    /* protected */ def getDefaultLabelCfg(offset: Double, position: String): Any = js.native
    /* protected */ def getDefaultLabelCfg(offset: Unit, position: String): Any = js.native
    
    /* private */ var getGeometryShapes: Any = js.native
    
    /**
      * 获取文本的对齐方式
      * @param item
      * @param index
      * @param total
      * @returns
      */
    /* protected */ def getLabelAlign(item: LabelItem, index: Double, total: Double): TextAlign = js.native
    
    /* private */ var getLabelCfgs: Any = js.native
    
    /**
      * 获取每一个 label 的唯一 id
      * @param mappingData label 对应的图形的绘制数据
      */
    /* protected */ def getLabelId(mappingData: MappingDatum): Any = js.native
    
    def getLabelItems(mapppingArray: js.Array[MappingDatum]): js.Array[LabelItem] = js.native
    
    /* protected */ def getLabelOffset(offset: String): Double = js.native
    /**
      * @desc 获取 label offset
      */
    /* protected */ def getLabelOffset(offset: Double): Double = js.native
    
    /**
      * 获取每个 label 的偏移量 (矢量)
      * @param labelCfg
      * @param index
      * @param total
      * @return {Point} offsetPoint
      */
    /* protected */ def getLabelOffsetPoint(labelCfg: LabelCfg, index: Double, total: Double): Point = js.native
    
    /**
      * 获取每个 label 的位置
      * @param labelCfg
      * @param mappingData
      * @param index
      * @returns label point
      */
    /* protected */ def getLabelPoint(labelCfg: LabelCfg, mappingData: MappingDatum, index: Double): LabelPointCfg = js.native
    
    /* private */ var getLabelText: Any = js.native
    
    /* private */ var getLabelsRenderer: Any = js.native
    
    /* private */ var getOffsetVector: Any = js.native
    
    /**
      * 获取当前 label 的最终配置
      * @param labelCfg
      */
    /* protected */ def getThemedLabelCfg(labelCfg: LabelCfg): Any = js.native
    
    var labelsRenderer: typingsJapgolly.antvG2.libComponentLabelsMod.default = js.native
    
    def render(mappingArray: js.Array[MappingDatum]): js.Promise[Unit] = js.native
    def render(mappingArray: js.Array[MappingDatum], isUpdate: Boolean): js.Promise[Unit] = js.native
    
    /**
      * 设置 label 位置
      * @param labelPointCfg
      * @param mappingData
      * @param index
      * @param position
      */
    /* protected */ def setLabelPosition(labelPointCfg: LabelPointCfg, mappingData: MappingDatum, index: Double, position: String): Unit = js.native
  }
  
  type GeometryLabelConstructor = Instantiable1[/* cfg */ Any, GeometryLabel]
}
