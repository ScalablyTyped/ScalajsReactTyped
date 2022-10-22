package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.AssociationGeometriesResult
import typingsJapgolly.arcgisJsApi.esri.AssociationGeometriesResultConstructor
import typingsJapgolly.arcgisJsApi.esri.AssociationGeometriesResultProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRestNetworksSupportAssociationGeometriesResultMod extends Shortcut {
  
  @JSImport("esri/rest/networks/support/AssociationGeometriesResult", JSImport.Namespace)
  @js.native
  val ^ : js.Object & AssociationGeometriesResultConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rest/networks/support/AssociationGeometriesResult", JSImport.Namespace)
  @js.native
  /**
    * This class defines the results of the function [synthesizeAssociationGeometries](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-synthesizeAssociationGeometries.html) which takes an extent and returns an [AggregatedGeometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-AggregatedGeometry.html) of all [associations](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-Association.html) within the extent based on the defined parameters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-AssociationGeometriesResult.html)
    */
  open class Class ()
    extends StObject
       with AssociationGeometriesResult {
    def this(properties: AssociationGeometriesResultProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & AssociationGeometriesResultConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriRestNetworksSupportAssociationGeometriesResultMod.foo` */
  override def _to: js.Object & AssociationGeometriesResultConstructor = ^
}
