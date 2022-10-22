package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.ParameterValue
import typingsJapgolly.arcgisJsApi.esri.ParameterValueConstructor
import typingsJapgolly.arcgisJsApi.esri.ParameterValueProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRestSupportParameterValueMod extends Shortcut {
  
  @JSImport("esri/rest/support/ParameterValue", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ParameterValueConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rest/support/ParameterValue", JSImport.Namespace)
  @js.native
  /**
    * Represents the output parameters of a [geoprocessor](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geoprocessor.html) method and their properties and values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ParameterValue.html)
    */
  open class Class ()
    extends StObject
       with ParameterValue {
    def this(properties: ParameterValueProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & ParameterValueConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriRestSupportParameterValueMod.foo` */
  override def _to: js.Object & ParameterValueConstructor = ^
}
