package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`shortest-path`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`subnetwork-controllers`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.connected
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.downstream
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.isolation
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.loops
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.subnetwork
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.upstream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TraceParametersProperties extends StObject {
  
  /**
    * The geodatabase version to execute the function against.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-TraceParameters.html#gdbVersion)
    */
  var gdbVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The date/timestamp (in UTC) to execute the function at a given time.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-TraceParameters.html#moment)
    */
  var moment: js.UndefOr[DateProperties] = js.undefined
  
  /**
    * The globalId (UUID) of the named trace configuration persisted in the network.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-TraceParameters.html#namedTraceConfigurationGlobalId)
    */
  var namedTraceConfigurationGlobalId: js.UndefOr[String] = js.undefined
  
  /**
    * The spatial reference that should be used to project the [aggregated geometries](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-AggregatedGeometry.html) returned by the trace (if applicable).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-TraceParameters.html#outSpatialReference)
    */
  var outSpatialReference: js.UndefOr[SpatialReferenceProperties] = js.undefined
  
  var resultTypes: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * Defines the properties of a trace.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-TraceParameters.html#traceConfiguration)
    */
  var traceConfiguration: js.UndefOr[TraceConfiguration] = js.undefined
  
  /**
    * The list of starting points and barriers that will define where the trace starts and stops.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-TraceParameters.html#traceLocations)
    */
  var traceLocations: js.UndefOr[js.Array[TraceLocationProperties]] = js.undefined
  
  /**
    * The trace type defined in this trace configuration.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-TraceParameters.html#traceType)
    */
  var traceType: js.UndefOr[
    connected | upstream | downstream | `shortest-path` | subnetwork | `subnetwork-controllers` | loops | isolation
  ] = js.undefined
}
object TraceParametersProperties {
  
  inline def apply(): TraceParametersProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TraceParametersProperties]
  }
  
  extension [Self <: TraceParametersProperties](x: Self) {
    
    inline def setGdbVersion(value: String): Self = StObject.set(x, "gdbVersion", value.asInstanceOf[js.Any])
    
    inline def setGdbVersionUndefined: Self = StObject.set(x, "gdbVersion", js.undefined)
    
    inline def setMoment(value: DateProperties): Self = StObject.set(x, "moment", value.asInstanceOf[js.Any])
    
    inline def setMomentUndefined: Self = StObject.set(x, "moment", js.undefined)
    
    inline def setNamedTraceConfigurationGlobalId(value: String): Self = StObject.set(x, "namedTraceConfigurationGlobalId", value.asInstanceOf[js.Any])
    
    inline def setNamedTraceConfigurationGlobalIdUndefined: Self = StObject.set(x, "namedTraceConfigurationGlobalId", js.undefined)
    
    inline def setOutSpatialReference(value: SpatialReferenceProperties): Self = StObject.set(x, "outSpatialReference", value.asInstanceOf[js.Any])
    
    inline def setOutSpatialReferenceUndefined: Self = StObject.set(x, "outSpatialReference", js.undefined)
    
    inline def setResultTypes(value: js.Array[Any]): Self = StObject.set(x, "resultTypes", value.asInstanceOf[js.Any])
    
    inline def setResultTypesUndefined: Self = StObject.set(x, "resultTypes", js.undefined)
    
    inline def setResultTypesVarargs(value: Any*): Self = StObject.set(x, "resultTypes", js.Array(value*))
    
    inline def setTraceConfiguration(value: TraceConfiguration): Self = StObject.set(x, "traceConfiguration", value.asInstanceOf[js.Any])
    
    inline def setTraceConfigurationUndefined: Self = StObject.set(x, "traceConfiguration", js.undefined)
    
    inline def setTraceLocations(value: js.Array[TraceLocationProperties]): Self = StObject.set(x, "traceLocations", value.asInstanceOf[js.Any])
    
    inline def setTraceLocationsUndefined: Self = StObject.set(x, "traceLocations", js.undefined)
    
    inline def setTraceLocationsVarargs(value: TraceLocationProperties*): Self = StObject.set(x, "traceLocations", js.Array(value*))
    
    inline def setTraceType(
      value: connected | upstream | downstream | `shortest-path` | subnetwork | `subnetwork-controllers` | loops | isolation
    ): Self = StObject.set(x, "traceType", value.asInstanceOf[js.Any])
    
    inline def setTraceTypeUndefined: Self = StObject.set(x, "traceType", js.undefined)
  }
}
