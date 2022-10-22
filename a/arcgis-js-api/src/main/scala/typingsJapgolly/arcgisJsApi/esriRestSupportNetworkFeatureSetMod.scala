package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.NetworkFeatureSet
import typingsJapgolly.arcgisJsApi.esri.NetworkFeatureSetConstructor
import typingsJapgolly.arcgisJsApi.esri.NetworkFeatureSetProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRestSupportNetworkFeatureSetMod extends Shortcut {
  
  @JSImport("esri/rest/support/NetworkFeatureSet", JSImport.Namespace)
  @js.native
  val ^ : js.Object & NetworkFeatureSetConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rest/support/NetworkFeatureSet", JSImport.Namespace)
  @js.native
  /**
    * A subclass of FeaureSet that can be used as an input in the Route, Closest Facility, and Service Area solvers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-NetworkFeatureSet.html)
    */
  open class Class ()
    extends StObject
       with NetworkFeatureSet {
    def this(properties: NetworkFeatureSetProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & NetworkFeatureSetConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriRestSupportNetworkFeatureSetMod.foo` */
  override def _to: js.Object & NetworkFeatureSetConstructor = ^
}
