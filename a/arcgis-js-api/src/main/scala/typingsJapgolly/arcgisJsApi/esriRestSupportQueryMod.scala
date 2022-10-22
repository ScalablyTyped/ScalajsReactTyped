package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.QueryConstructor
import typingsJapgolly.arcgisJsApi.esri.QueryProperties
import typingsJapgolly.arcgisJsApi.esri.Query_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRestSupportQueryMod extends Shortcut {
  
  @JSImport("esri/rest/support/Query", JSImport.Namespace)
  @js.native
  val ^ : js.Object & QueryConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rest/support/Query", JSImport.Namespace)
  @js.native
  /**
    * This class defines parameters for executing queries for features from a layer or layer view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html)
    */
  open class Class ()
    extends StObject
       with Query_ {
    def this(properties: QueryProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & QueryConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriRestSupportQueryMod.foo` */
  override def _to: js.Object & QueryConstructor = ^
}
