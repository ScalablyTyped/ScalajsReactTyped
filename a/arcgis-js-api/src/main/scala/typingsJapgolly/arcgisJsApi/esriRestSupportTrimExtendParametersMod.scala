package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.TrimExtendParameters
import typingsJapgolly.arcgisJsApi.esri.TrimExtendParametersConstructor
import typingsJapgolly.arcgisJsApi.esri.TrimExtendParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRestSupportTrimExtendParametersMod extends Shortcut {
  
  @JSImport("esri/rest/support/TrimExtendParameters", JSImport.Namespace)
  @js.native
  val ^ : js.Object & TrimExtendParametersConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rest/support/TrimExtendParameters", JSImport.Namespace)
  @js.native
  /**
    * Used to set the parameters for the [geometryService.trimExtend](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geometryService.html#trimExtend) operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TrimExtendParameters.html)
    */
  open class Class ()
    extends StObject
       with TrimExtendParameters {
    def this(properties: TrimExtendParametersProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & TrimExtendParametersConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriRestSupportTrimExtendParametersMod.foo` */
  override def _to: js.Object & TrimExtendParametersConstructor = ^
}
