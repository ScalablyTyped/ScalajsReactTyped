package typingsJapgolly.arcgisJsApi.global.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.edges
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.junctions
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.junctionsAndEdges
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.TraceConfiguration")
@js.native
/**
  * The TraceConfiguration class provides the ability to configure custom trace properties required to run a network trace.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-TraceConfiguration.html)
  */
open class TraceConfigurationCls ()
  extends StObject
     with typingsJapgolly.arcgisJsApi.esri.TraceConfiguration {
  def this(properties: Any) = this()
  
  /**
    * An array of objects representing network attribute or category conditions that serve as barriers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-TraceConfiguration.html#conditionBarriers)
    */
  /* CompleteClass */
  var conditionBarriers: js.Array[Any] = js.native
  
  /**
    * An array of objects representing function barriers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-TraceConfiguration.html#functionBarriers)
    */
  /* CompleteClass */
  var functionBarriers: js.Array[Any] = js.native
  
  /**
    * An array of objects representing function.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-TraceConfiguration.html#functions)
    */
  /* CompleteClass */
  var functions: js.Array[Any] = js.native
  
  /**
    * Do not stop the trace if the starting point is a barrier.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-TraceConfiguration.html#ignoreBarriersAtStartingPoints)
    */
  /* CompleteClass */
  var ignoreBarriersAtStartingPoints: Boolean = js.native
  
  /**
    * Specifies whether the traversability barrier features will be included in the trace results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-TraceConfiguration.html#includeBarriers)
    */
  /* CompleteClass */
  var includeBarriers: Boolean = js.native
  
  /**
    * Specifies the type of features returned based on a network attribute or check for a category string.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-TraceConfiguration.html#outputConditions)
    */
  /* CompleteClass */
  var outputConditions: js.Array[Any] = js.native
  
  /**
    * Specifies the network attribute name used for determining the shortest path.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-TraceConfiguration.html#shortestPathNetworkAttributeName)
    */
  /* CompleteClass */
  var shortestPathNetworkAttributeName: String = js.native
  
  /**
    * Determines whether traversability is applied to both junctions and edges, junctions only, or edges only.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-TraceConfiguration.html#traversabilityScope)
    */
  /* CompleteClass */
  var traversabilityScope: junctions | edges | junctionsAndEdges = js.native
  
  /**
    * Specifies whether an error will be returned if dirty areas are encountered in any of the traversed features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-TraceConfiguration.html#validateConsistency)
    */
  /* CompleteClass */
  var validateConsistency: Boolean = js.native
}
