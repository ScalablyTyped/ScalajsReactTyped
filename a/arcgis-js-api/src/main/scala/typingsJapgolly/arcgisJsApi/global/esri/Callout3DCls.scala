package typingsJapgolly.arcgisJsApi.global.esri

import typingsJapgolly.arcgisJsApi.esri.Callout3DProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.Callout3D")
@js.native
/**
  * When symbols have an offset from their position, it's important to still see what the real location is.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-callouts-Callout3D.html)
  */
open class Callout3DCls ()
  extends StObject
     with typingsJapgolly.arcgisJsApi.esri.Callout3D {
  def this(properties: Callout3DProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
