package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.edges
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.junctions
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.junctionsAndEdges
import typingsJapgolly.arcgisJsApi.esri.UNTraceConfiguration
import typingsJapgolly.arcgisJsApi.esri.UNTraceConfigurationConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriNetworksSupportUntraceconfigurationMod extends Shortcut {
  
  @JSImport("esri/networks/support/UNTraceConfiguration", JSImport.Namespace)
  @js.native
  val ^ : js.Object & UNTraceConfigurationConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/networks/support/UNTraceConfiguration", JSImport.Namespace)
  @js.native
  /**
    * The UNTraceConfiguration class contains properties required to define objects than can be used to run custom traces on utility networks.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-UNTraceConfiguration.html)
    */
  open class Class ()
    extends StObject
       with UNTraceConfiguration {
    def this(properties: Any) = this()
    
    /**
      * Specifies the name of the domain network where the trace will be run.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-UNTraceConfiguration.html#domainNetworkName)
      */
    /* CompleteClass */
    var domainNetworkName: String = js.native
    
    /**
      * An array of objects representing specific categories or network attributes where the trace will stop.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-UNTraceConfiguration.html#filterBarriers)
      */
    /* CompleteClass */
    var filterBarriers: js.Array[Any] = js.native
    
    /**
      * Ensures the trace results include any bit that is set in the starting points for the network attribute.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-UNTraceConfiguration.html#filterBitsetNetworkAttributeName)
      */
    /* CompleteClass */
    var filterBitsetNetworkAttributeName: String = js.native
    
    /**
      * An array of objects representing filter function barriers.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-UNTraceConfiguration.html#filterFunctionBarriers)
      */
    /* CompleteClass */
    var filterFunctionBarriers: js.Array[Any] = js.native
    
    /**
      * Specifies where the filter will be applied.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-UNTraceConfiguration.html#filterScope)
      */
    /* CompleteClass */
    var filterScope: junctions | edges | junctionsAndEdges = js.native
    
    /**
      * Specifies if the container features will be included in the trace results.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-UNTraceConfiguration.html#includeContainers)
      */
    /* CompleteClass */
    var includeContainers: Boolean = js.native
    
    /**
      * Specifies if the content in containers will be included in the results.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-UNTraceConfiguration.html#includeContent)
      */
    /* CompleteClass */
    var includeContent: Boolean = js.native
    
    /**
      * Specifies whether to include isolated features for an isolation trace.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-UNTraceConfiguration.html#includeIsolated)
      */
    /* CompleteClass */
    var includeIsolated: Boolean = js.native
    
    /**
      * Specifies if structure features and objects will be included in the trace results.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-UNTraceConfiguration.html#includeStructures)
      */
    /* CompleteClass */
    var includeStructures: Boolean = js.native
    
    /**
      * Specifies whether to limit the containers returned to include only those encountered up to, and including, the first spatial container for each network element in the trace results.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-UNTraceConfiguration.html#includeUpToFirstSpatialContainer)
      */
    /* CompleteClass */
    var includeUpToFirstSpatialContainer: Boolean = js.native
    
    /**
      * Specifies the parameters needed for calculating nearest neighbors.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-UNTraceConfiguration.html#nearestNeighbor)
      */
    /* CompleteClass */
    var nearestNeighbor: Any = js.native
    
    /**
      * An array of objects representing the output filter categories.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-UNTraceConfiguration.html#outputFilterCategories)
      */
    /* CompleteClass */
    var outputFilterCategories: js.Array[Any] = js.native
    
    /**
      * An array of objects used to control what is returned in the results of a trace.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-UNTraceConfiguration.html#outputFilters)
      */
    /* CompleteClass */
    var outputFilters: js.Array[Any] = js.native
    
    /**
      * A propagator defines the propagation of a network attribute along a traversal and provides a filter to stop traversal.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-UNTraceConfiguration.html#propagators)
      */
    /* CompleteClass */
    var propagators: js.Array[Any] = js.native
    
    /**
      * Specifies the name of the [subnetwork](https://pro.arcgis.com/en/pro-app/latest/help/data/utility-network/subnetworks.htm) where the trace will be run.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-UNTraceConfiguration.html#subnetworkName)
      */
    /* CompleteClass */
    var subnetworkName: String = js.native
    
    /**
      * Specifies the name of the tier where an upstream or downstream trace ends.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-UNTraceConfiguration.html#targetTierName)
      */
    /* CompleteClass */
    var targetTierName: String = js.native
    
    /**
      * Specifies the name of the tier where the trace will be run.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-UNTraceConfiguration.html#tierName)
      */
    /* CompleteClass */
    var tierName: String = js.native
    
    /**
      * Specifies if its necessary to validate whether traversed junction or edge objects have the necessary containment, attachment, or connectivity association in their association hierarchy.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-UNTraceConfiguration.html#validateLocatability)
      */
    /* CompleteClass */
    var validateLocatability: Boolean = js.native
  }
  
  type _To = js.Object & UNTraceConfigurationConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriNetworksSupportUntraceconfigurationMod.foo` */
  override def _to: js.Object & UNTraceConfigurationConstructor = ^
}
