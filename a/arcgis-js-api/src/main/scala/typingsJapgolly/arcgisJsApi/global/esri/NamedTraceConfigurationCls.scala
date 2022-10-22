package typingsJapgolly.arcgisJsApi.global.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`shortest-path`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`subnetwork-controllers`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.connected
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.downstream
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.isolation
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.loops
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.many
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.none_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.one
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.subnetwork
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.upstream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.NamedTraceConfiguration")
@js.native
/**
  * This class describes a trace configuration object.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-NamedTraceConfiguration.html)
  */
open class NamedTraceConfigurationCls ()
  extends StObject
     with typingsJapgolly.arcgisJsApi.esri.NamedTraceConfiguration {
  def this(properties: Any) = this()
  
  /**
    * The date/time when the trace configuration has been added to the utility network.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-NamedTraceConfiguration.html#creationDate)
    */
  /* CompleteClass */
  var creationDate: js.Date = js.native
  
  /**
    * The portal user who created the trace configuration.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-NamedTraceConfiguration.html#creator)
    */
  /* CompleteClass */
  var creator: String = js.native
  
  /**
    * Short description of what kind of trace this trace configuration performs.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-NamedTraceConfiguration.html#description)
    */
  /* CompleteClass */
  var description: String = js.native
  
  /**
    * The `globalId` (UUID) uniquely identifies a trace configuration.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-NamedTraceConfiguration.html#globalId)
    */
  /* CompleteClass */
  var globalId: String = js.native
  
  /**
    * The minimum number of starting points required to perform a trace with this particular trace configuration.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-NamedTraceConfiguration.html#minStartingPoints)
    */
  /* CompleteClass */
  var minStartingPoints: none_ | one | many = js.native
  
  /**
    * The result types of the trace configuration.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-NamedTraceConfiguration.html#resultTypes)
    */
  /* CompleteClass */
  var resultTypes: js.Array[Any] = js.native
  
  /**
    * Labels that help identify and search for a particular trace configuration.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-NamedTraceConfiguration.html#tags)
    */
  /* CompleteClass */
  var tags: js.Array[String] = js.native
  
  /**
    * The title or the name of the trace configuration.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-NamedTraceConfiguration.html#title)
    */
  /* CompleteClass */
  var title: String = js.native
  
  /**
    * The full definition of the trace configuration.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-NamedTraceConfiguration.html#traceConfiguration)
    */
  /* CompleteClass */
  var traceConfiguration: Any = js.native
  
  /**
    * The trace type defined in this trace configuration.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-NamedTraceConfiguration.html#traceType)
    */
  /* CompleteClass */
  var traceType: connected | upstream | downstream | `shortest-path` | subnetwork | `subnetwork-controllers` | loops | isolation = js.native
}
