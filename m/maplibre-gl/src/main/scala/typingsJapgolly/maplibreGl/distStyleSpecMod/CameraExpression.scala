package typingsJapgolly.maplibreGl.distStyleSpecMod

import typingsJapgolly.maplibreGl.maplibreGlStrings.camera
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CameraExpression
  extends StObject
     with StylePropertyExpression {
  
  def evaluate(globals: GlobalProperties): Any = js.native
  def evaluate(
    globals: GlobalProperties,
    feature: Unit,
    featureState: Unit,
    canonical: Unit,
    availableImages: js.Array[String]
  ): Any = js.native
  def evaluate(globals: GlobalProperties, feature: Unit, featureState: Unit, canonical: CanonicalTileID): Any = js.native
  def evaluate(
    globals: GlobalProperties,
    feature: Unit,
    featureState: Unit,
    canonical: CanonicalTileID,
    availableImages: js.Array[String]
  ): Any = js.native
  def evaluate(globals: GlobalProperties, feature: Unit, featureState: FeatureState): Any = js.native
  def evaluate(
    globals: GlobalProperties,
    feature: Unit,
    featureState: FeatureState,
    canonical: Unit,
    availableImages: js.Array[String]
  ): Any = js.native
  def evaluate(globals: GlobalProperties, feature: Unit, featureState: FeatureState, canonical: CanonicalTileID): Any = js.native
  def evaluate(
    globals: GlobalProperties,
    feature: Unit,
    featureState: FeatureState,
    canonical: CanonicalTileID,
    availableImages: js.Array[String]
  ): Any = js.native
  def evaluate(globals: GlobalProperties, feature: Feature): Any = js.native
  def evaluate(
    globals: GlobalProperties,
    feature: Feature,
    featureState: Unit,
    canonical: Unit,
    availableImages: js.Array[String]
  ): Any = js.native
  def evaluate(globals: GlobalProperties, feature: Feature, featureState: Unit, canonical: CanonicalTileID): Any = js.native
  def evaluate(
    globals: GlobalProperties,
    feature: Feature,
    featureState: Unit,
    canonical: CanonicalTileID,
    availableImages: js.Array[String]
  ): Any = js.native
  def evaluate(globals: GlobalProperties, feature: Feature, featureState: FeatureState): Any = js.native
  def evaluate(
    globals: GlobalProperties,
    feature: Feature,
    featureState: FeatureState,
    canonical: Unit,
    availableImages: js.Array[String]
  ): Any = js.native
  def evaluate(
    globals: GlobalProperties,
    feature: Feature,
    featureState: FeatureState,
    canonical: CanonicalTileID
  ): Any = js.native
  def evaluate(
    globals: GlobalProperties,
    feature: Feature,
    featureState: FeatureState,
    canonical: CanonicalTileID,
    availableImages: js.Array[String]
  ): Any = js.native
  
  def interpolationFactor(input: Double, lower: Double, upper: Double): Double = js.native
  
  var interpolationType: InterpolationType = js.native
  
  var kind: camera = js.native
  
  var zoomStops: js.Array[Double] = js.native
}
