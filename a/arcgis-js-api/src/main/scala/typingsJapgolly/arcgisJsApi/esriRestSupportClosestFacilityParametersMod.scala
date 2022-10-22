package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.ClosestFacilityParameters
import typingsJapgolly.arcgisJsApi.esri.ClosestFacilityParametersConstructor
import typingsJapgolly.arcgisJsApi.esri.ClosestFacilityParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRestSupportClosestFacilityParametersMod extends Shortcut {
  
  @JSImport("esri/rest/support/ClosestFacilityParameters", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ClosestFacilityParametersConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rest/support/ClosestFacilityParameters", JSImport.Namespace)
  @js.native
  /**
    * Input parameters for [closestFacility](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-closestFacility.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ClosestFacilityParameters.html)
    */
  open class Class ()
    extends StObject
       with ClosestFacilityParameters {
    def this(properties: ClosestFacilityParametersProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & ClosestFacilityParametersConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriRestSupportClosestFacilityParametersMod.foo` */
  override def _to: js.Object & ClosestFacilityParametersConstructor = ^
}
