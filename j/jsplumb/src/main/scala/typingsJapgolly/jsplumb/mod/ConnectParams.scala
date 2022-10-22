package typingsJapgolly.jsplumb.mod

import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectParams extends StObject {
  
  var anchor: js.UndefOr[AnchorSpec] = js.undefined
  
  var anchors: js.UndefOr[js.Tuple2[AnchorSpec, AnchorSpec]] = js.undefined
  
  var connector: js.UndefOr[ConnectorSpec] = js.undefined
  
  var cssClass: js.UndefOr[String] = js.undefined
  
  var deleteEndpointsOnDetach: js.UndefOr[Boolean] = js.undefined
  
  var detachable: js.UndefOr[Boolean] = js.undefined
  
  var endpoint: js.UndefOr[EndpointSpec] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
  
  var overlays: js.UndefOr[js.Array[OverlaySpec]] = js.undefined
  
  var parameters: js.UndefOr[Record[String, Any]] = js.undefined
  
  var source: js.UndefOr[ElementRef | Endpoint] = js.undefined
  
  var target: js.UndefOr[ElementRef | Endpoint] = js.undefined
  
  var uuids: js.UndefOr[js.Tuple2[UUID, UUID]] = js.undefined
}
object ConnectParams {
  
  inline def apply(): ConnectParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectParams]
  }
  
  extension [Self <: ConnectParams](x: Self) {
    
    inline def setAnchor(value: AnchorSpec): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    inline def setAnchorVarargs(value: (AnchorStaticSpec | AnchorDynamicId | AnchorPerimeterSpec | AnchorContinuousSpec)*): Self = StObject.set(x, "anchor", js.Array(value*))
    
    inline def setAnchors(value: js.Tuple2[AnchorSpec, AnchorSpec]): Self = StObject.set(x, "anchors", value.asInstanceOf[js.Any])
    
    inline def setAnchorsUndefined: Self = StObject.set(x, "anchors", js.undefined)
    
    inline def setConnector(value: ConnectorSpec): Self = StObject.set(x, "connector", value.asInstanceOf[js.Any])
    
    inline def setConnectorUndefined: Self = StObject.set(x, "connector", js.undefined)
    
    inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
    
    inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
    
    inline def setDeleteEndpointsOnDetach(value: Boolean): Self = StObject.set(x, "deleteEndpointsOnDetach", value.asInstanceOf[js.Any])
    
    inline def setDeleteEndpointsOnDetachUndefined: Self = StObject.set(x, "deleteEndpointsOnDetach", js.undefined)
    
    inline def setDetachable(value: Boolean): Self = StObject.set(x, "detachable", value.asInstanceOf[js.Any])
    
    inline def setDetachableUndefined: Self = StObject.set(x, "detachable", js.undefined)
    
    inline def setEndpoint(value: EndpointSpec): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setOverlays(value: js.Array[OverlaySpec]): Self = StObject.set(x, "overlays", value.asInstanceOf[js.Any])
    
    inline def setOverlaysUndefined: Self = StObject.set(x, "overlays", js.undefined)
    
    inline def setOverlaysVarargs(value: OverlaySpec*): Self = StObject.set(x, "overlays", js.Array(value*))
    
    inline def setParameters(value: Record[String, Any]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setSource(value: ElementRef | Endpoint): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setTarget(value: ElementRef | Endpoint): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setUuids(value: js.Tuple2[UUID, UUID]): Self = StObject.set(x, "uuids", value.asInstanceOf[js.Any])
    
    inline def setUuidsUndefined: Self = StObject.set(x, "uuids", js.undefined)
  }
}
