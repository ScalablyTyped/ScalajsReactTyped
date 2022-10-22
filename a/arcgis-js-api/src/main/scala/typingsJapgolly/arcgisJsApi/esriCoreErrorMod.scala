package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.Error
import typingsJapgolly.arcgisJsApi.esri.ErrorConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriCoreErrorMod extends Shortcut {
  
  @JSImport("esri/core/Error", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ErrorConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/core/Error", JSImport.Namespace)
  @js.native
  open class Class protected ()
    extends StObject
       with Error {
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
  
  type _To = js.Object & ErrorConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriCoreErrorMod.foo` */
  override def _to: js.Object & ErrorConstructor = ^
}
