package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.JobInfo
import typingsJapgolly.arcgisJsApi.esri.JobInfoConstructor
import typingsJapgolly.arcgisJsApi.esri.JobInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRestSupportJobInfoMod extends Shortcut {
  
  @JSImport("esri/rest/support/JobInfo", JSImport.Namespace)
  @js.native
  val ^ : js.Object & JobInfoConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rest/support/JobInfo", JSImport.Namespace)
  @js.native
  /**
    * Represents information pertaining to the execution of an asynchronous [geoprocessor](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geoprocessor.html) request on the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-JobInfo.html)
    */
  open class Class ()
    extends StObject
       with JobInfo {
    def this(properties: JobInfoProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & JobInfoConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriRestSupportJobInfoMod.foo` */
  override def _to: js.Object & JobInfoConstructor = ^
}
