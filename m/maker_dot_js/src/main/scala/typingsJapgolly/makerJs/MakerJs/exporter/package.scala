package typingsJapgolly.makerJs.MakerJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object exporter {
  /**
    * DXF rendering options.
    */
  type IDXFRenderOptions = typingsJapgolly.makerJs.MakerJs.exporter.IExportOptions
  type IOpenJsCadOptionsMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.makerJs.MakerJs.exporter.IOpenJsCadOptions]
  /**
    * Map of SVG Path Data by layer name.
    */
  type IPathDataByLayerMap = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  /**
    * Attributes for an XML tag.
    * @private
    */
  type IXmlTagAttrs = org.scalablytyped.runtime.StringDictionary[js.Any]
  /**
    * Map of MakerJs unit system to SVG unit system
    */
  type svgUnitConversion = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.makerJs.AnonScaleConversion]
}
