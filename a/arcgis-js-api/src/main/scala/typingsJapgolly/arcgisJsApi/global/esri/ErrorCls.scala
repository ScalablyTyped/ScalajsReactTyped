package typingsJapgolly.arcgisJsApi.global.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.Error")
@js.native
open class ErrorCls protected ()
  extends StObject
     with typingsJapgolly.arcgisJsApi.esri.Error {
  /**
    * Error is a class that enhances the debugging and error handling process.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html)
    */
  def this(name: String) = this()
  def this(name: String, message: String) = this()
  def this(name: String, message: String, details: Any) = this()
  def this(name: String, message: Unit, details: Any) = this()
  
  /**
    * The details object provides additional details specific to the error, giving more information about why the error was raised.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html#details)
    */
  /* CompleteClass */
  var details: Any = js.native
  
  /**
    * A message describing the details of the error.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html#message)
    */
  /* CompleteClass */
  var message: String = js.native
  
  /**
    * A unique error name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html#name)
    */
  /* CompleteClass */
  var name: String = js.native
}
