package typingsJapgolly.ol

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Node
import typingsJapgolly.ol.extentMod.Extent
import typingsJapgolly.ol.gmlbaseMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/format/GML3", JSImport.Namespace)
@js.native
object gml3Mod extends js.Object {
  @js.native
  trait GML3
    extends typingsJapgolly.ol.gmlbaseMod.default {
    def writeEnvelope(node: Element, extent: Extent, objectStack: js.Array[_]): Unit = js.native
    def writeFeatureElement(
      node: Element,
      feature: typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default],
      objectStack: js.Array[_]
    ): Unit = js.native
    def writeGeometryElement(node: Node, geometry: Extent, objectStack: js.Array[_]): Unit = js.native
    def writeGeometryElement(node: Node, geometry: typingsJapgolly.ol.geometryMod.default, objectStack: js.Array[_]): Unit = js.native
  }
  
  @js.native
  class default () extends GML3 {
    def this(opt_options: Options) = this()
  }
  
}

