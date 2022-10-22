package typingsJapgolly.maplibreGl.mod

import typingsJapgolly.maplibreGl.maplibreGlStrings.anchor
import typingsJapgolly.maplibreGl.maplibreGlStrings.color
import typingsJapgolly.maplibreGl.maplibreGlStrings.intensity
import typingsJapgolly.maplibreGl.maplibreGlStrings.position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "Layout")
@js.native
open class Layout[Props] protected () extends StObject {
  def this(properties: Properties[Props]) = this()
  
  var _properties: Properties[Props] = js.native
  
  var _values: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof Props ]: maplibre-gl.maplibre-gl.PropertyValue<any, maplibre-gl.maplibre-gl.PossiblyEvaluatedPropertyValue<any>>} */ js.Any = js.native
  
  @JSName("getValue")
  def getValue_anchor(name: anchor): Any = js.native
  @JSName("getValue")
  def getValue_color(name: color): Any = js.native
  @JSName("getValue")
  def getValue_intensity(name: intensity): Any = js.native
  @JSName("getValue")
  def getValue_position(name: position): Any = js.native
  
  def possiblyEvaluate(parameters: EvaluationParameters): PossiblyEvaluated[Props, Any] = js.native
  def possiblyEvaluate(parameters: EvaluationParameters, canonical: scala.Unit, availableImages: js.Array[String]): PossiblyEvaluated[Props, Any] = js.native
  def possiblyEvaluate(parameters: EvaluationParameters, canonical: CanonicalTileID): PossiblyEvaluated[Props, Any] = js.native
  def possiblyEvaluate(parameters: EvaluationParameters, canonical: CanonicalTileID, availableImages: js.Array[String]): PossiblyEvaluated[Props, Any] = js.native
  
  def serialize(): Any = js.native
  
  @JSName("setValue")
  def setValue_anchor(name: anchor, value: Any): scala.Unit = js.native
  @JSName("setValue")
  def setValue_color(name: color, value: Any): scala.Unit = js.native
  @JSName("setValue")
  def setValue_intensity(name: intensity, value: Any): scala.Unit = js.native
  @JSName("setValue")
  def setValue_position(name: position, value: Any): scala.Unit = js.native
}
