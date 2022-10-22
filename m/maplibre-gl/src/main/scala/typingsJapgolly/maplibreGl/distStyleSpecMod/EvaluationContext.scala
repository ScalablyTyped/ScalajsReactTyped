package typingsJapgolly.maplibreGl.distStyleSpecMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluationContext extends StObject {
  
  var _parseColorCache: StringDictionary[Color]
  
  var availableImages: js.Array[String]
  
  var canonical: CanonicalTileID
  
  def canonicalID(): CanonicalTileID
  
  var feature: Feature
  
  var featureState: FeatureState
  
  var formattedSection: FormattedSection
  
  def geometry(): js.Array[js.Array[typingsJapgolly.mapboxPointGeometry.mod.^]]
  
  def geometryType(): String
  
  var globals: GlobalProperties
  
  def id(): Any
  
  def parseColor(input: String): Color
  
  def properties(): StringDictionary[Any]
}
object EvaluationContext {
  
  inline def apply(
    _parseColorCache: StringDictionary[Color],
    availableImages: js.Array[String],
    canonical: CanonicalTileID,
    canonicalID: CallbackTo[CanonicalTileID],
    feature: Feature,
    featureState: FeatureState,
    formattedSection: FormattedSection,
    geometry: CallbackTo[js.Array[js.Array[typingsJapgolly.mapboxPointGeometry.mod.^]]],
    geometryType: CallbackTo[String],
    globals: GlobalProperties,
    id: CallbackTo[Any],
    parseColor: String => Color,
    properties: CallbackTo[StringDictionary[Any]]
  ): EvaluationContext = {
    val __obj = js.Dynamic.literal(_parseColorCache = _parseColorCache.asInstanceOf[js.Any], availableImages = availableImages.asInstanceOf[js.Any], canonical = canonical.asInstanceOf[js.Any], canonicalID = canonicalID.toJsFn, feature = feature.asInstanceOf[js.Any], featureState = featureState.asInstanceOf[js.Any], formattedSection = formattedSection.asInstanceOf[js.Any], geometry = geometry.toJsFn, geometryType = geometryType.toJsFn, globals = globals.asInstanceOf[js.Any], id = id.toJsFn, parseColor = js.Any.fromFunction1(parseColor), properties = properties.toJsFn)
    __obj.asInstanceOf[EvaluationContext]
  }
  
  extension [Self <: EvaluationContext](x: Self) {
    
    inline def setAvailableImages(value: js.Array[String]): Self = StObject.set(x, "availableImages", value.asInstanceOf[js.Any])
    
    inline def setAvailableImagesVarargs(value: String*): Self = StObject.set(x, "availableImages", js.Array(value*))
    
    inline def setCanonical(value: CanonicalTileID): Self = StObject.set(x, "canonical", value.asInstanceOf[js.Any])
    
    inline def setCanonicalID(value: CallbackTo[CanonicalTileID]): Self = StObject.set(x, "canonicalID", value.toJsFn)
    
    inline def setFeature(value: Feature): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    
    inline def setFeatureState(value: FeatureState): Self = StObject.set(x, "featureState", value.asInstanceOf[js.Any])
    
    inline def setFormattedSection(value: FormattedSection): Self = StObject.set(x, "formattedSection", value.asInstanceOf[js.Any])
    
    inline def setGeometry(value: CallbackTo[js.Array[js.Array[typingsJapgolly.mapboxPointGeometry.mod.^]]]): Self = StObject.set(x, "geometry", value.toJsFn)
    
    inline def setGeometryType(value: CallbackTo[String]): Self = StObject.set(x, "geometryType", value.toJsFn)
    
    inline def setGlobals(value: GlobalProperties): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
    
    inline def setId(value: CallbackTo[Any]): Self = StObject.set(x, "id", value.toJsFn)
    
    inline def setParseColor(value: String => Color): Self = StObject.set(x, "parseColor", js.Any.fromFunction1(value))
    
    inline def setProperties(value: CallbackTo[StringDictionary[Any]]): Self = StObject.set(x, "properties", value.toJsFn)
    
    inline def set_parseColorCache(value: StringDictionary[Color]): Self = StObject.set(x, "_parseColorCache", value.asInstanceOf[js.Any])
  }
}
