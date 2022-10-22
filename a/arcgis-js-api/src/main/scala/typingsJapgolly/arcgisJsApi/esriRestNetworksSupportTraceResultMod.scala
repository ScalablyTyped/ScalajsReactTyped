package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.TraceResult
import typingsJapgolly.arcgisJsApi.esri.TraceResultConstructor
import typingsJapgolly.arcgisJsApi.esri.TraceResultProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRestNetworksSupportTraceResultMod extends Shortcut {
  
  @JSImport("esri/rest/networks/support/TraceResult", JSImport.Namespace)
  @js.native
  val ^ : js.Object & TraceResultConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rest/networks/support/TraceResult", JSImport.Namespace)
  @js.native
  /**
    * This class defines the collection of results returned from the trace function.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-TraceResult.html)
    */
  open class Class ()
    extends StObject
       with TraceResult {
    def this(properties: TraceResultProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & TraceResultConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriRestNetworksSupportTraceResultMod.foo` */
  override def _to: js.Object & TraceResultConstructor = ^
}
