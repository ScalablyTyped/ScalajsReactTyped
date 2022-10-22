package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.ServiceAreaSolveResult
import typingsJapgolly.arcgisJsApi.esri.ServiceAreaSolveResultConstructor
import typingsJapgolly.arcgisJsApi.esri.ServiceAreaSolveResultProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRestSupportServiceAreaSolveResultMod extends Shortcut {
  
  @JSImport("esri/rest/support/ServiceAreaSolveResult", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ServiceAreaSolveResultConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rest/support/ServiceAreaSolveResult", JSImport.Namespace)
  @js.native
  /**
    * The result from [serviceArea](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-serviceArea.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaSolveResult.html)
    */
  open class Class ()
    extends StObject
       with ServiceAreaSolveResult {
    def this(properties: ServiceAreaSolveResultProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & ServiceAreaSolveResultConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriRestSupportServiceAreaSolveResultMod.foo` */
  override def _to: js.Object & ServiceAreaSolveResultConstructor = ^
}
