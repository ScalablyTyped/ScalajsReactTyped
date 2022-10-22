package typingsJapgolly.arcgisJsApi.global.esri

import typingsJapgolly.arcgisJsApi.esri.AuthoringInfoVisualVariableProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.AuthoringInfoVisualVariable")
@js.native
/**
  * Contains authoring properties of visual variables generated from one of the Smart Mapping methods or sliders.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfoVisualVariable.html)
  */
open class AuthoringInfoVisualVariableCls ()
  extends StObject
     with typingsJapgolly.arcgisJsApi.esri.AuthoringInfoVisualVariable {
  def this(properties: AuthoringInfoVisualVariableProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
