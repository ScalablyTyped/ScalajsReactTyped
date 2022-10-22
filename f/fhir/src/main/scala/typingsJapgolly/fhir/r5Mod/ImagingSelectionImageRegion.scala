package typingsJapgolly.fhir.r5Mod

import typingsJapgolly.fhir.fhirStrings.ELLIPSE
import typingsJapgolly.fhir.fhirStrings.ELLIPSOID
import typingsJapgolly.fhir.fhirStrings.MULTIPOINT
import typingsJapgolly.fhir.fhirStrings.POINT
import typingsJapgolly.fhir.fhirStrings.POLYGON
import typingsJapgolly.fhir.fhirStrings.POLYLINE
import typingsJapgolly.fhir.fhirStrings.`2d`
import typingsJapgolly.fhir.fhirStrings.`3d`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImagingSelectionImageRegion
  extends StObject
     with BackboneElement {
  
  var _coordinateType: js.UndefOr[Element] = js.undefined
  
  var _regionType: js.UndefOr[Element] = js.undefined
  
  /**
    * Specifies the type of coordinate system that define the image region.
    */
  var coordinateType: `2d` | `3d`
  
  /**
    * For a description of how 2D coordinates are encoded, see [DICOM PS3.3 C.18.6](http://dicom.nema.org/medical/dicom/current/output/chtml/part03/sect_C.18.6.html).       For a description of how 3D coordinates are encoded, see [DICOM PS3.3 C.18.9](http://dicom.nema.org/medical/dicom/current/output/chtml/part03/sect_C.18.9.html).
    */
  var coordinates: js.Array[Double]
  
  /**
    * See [DICOM PS3.3 C.18.9.1.2](http://dicom.nema.org/medical/dicom/current/output/chtml/part03/sect_C.18.9.html#sect_C.18.9.1.2).
    */
  var regionType: POINT | MULTIPOINT | POLYLINE | POLYGON | ELLIPSE | ELLIPSOID
}
object ImagingSelectionImageRegion {
  
  inline def apply(
    coordinateType: `2d` | `3d`,
    coordinates: js.Array[Double],
    regionType: POINT | MULTIPOINT | POLYLINE | POLYGON | ELLIPSE | ELLIPSOID
  ): ImagingSelectionImageRegion = {
    val __obj = js.Dynamic.literal(coordinateType = coordinateType.asInstanceOf[js.Any], coordinates = coordinates.asInstanceOf[js.Any], regionType = regionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagingSelectionImageRegion]
  }
  
  extension [Self <: ImagingSelectionImageRegion](x: Self) {
    
    inline def setCoordinateType(value: `2d` | `3d`): Self = StObject.set(x, "coordinateType", value.asInstanceOf[js.Any])
    
    inline def setCoordinates(value: js.Array[Double]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    inline def setCoordinatesVarargs(value: Double*): Self = StObject.set(x, "coordinates", js.Array(value*))
    
    inline def setRegionType(value: POINT | MULTIPOINT | POLYLINE | POLYGON | ELLIPSE | ELLIPSOID): Self = StObject.set(x, "regionType", value.asInstanceOf[js.Any])
    
    inline def set_coordinateType(value: Element): Self = StObject.set(x, "_coordinateType", value.asInstanceOf[js.Any])
    
    inline def set_coordinateTypeUndefined: Self = StObject.set(x, "_coordinateType", js.undefined)
    
    inline def set_regionType(value: Element): Self = StObject.set(x, "_regionType", value.asInstanceOf[js.Any])
    
    inline def set_regionTypeUndefined: Self = StObject.set(x, "_regionType", js.undefined)
  }
}
