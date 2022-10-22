package typingsJapgolly.microsoftAjax.Sys

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides a common interface for the application-defined tasks of closing, releasing, or resetting resources held by instances of a registered Microsoft Ajax Library class.
  * Implement the IDisposable interface to provide a common interface for closing or releasing resources held by instances of your registered Microsoft Ajax Library class.
  * You register an interface by when you register the class by calling the Type.registerClass method. You specify IDisposable in the interfaceTypes parameter when you call Type.registerClass.
  */
trait IDisposable extends StObject {
  
  //#region Methods
  /**
    * Releases resources held by an object that implements the Sys.IDisposable interface.
    * Implement the dispose method to close or release resources held by an object, or to prepare an object for reuse.
    */
  def dispose(): Unit
}
object IDisposable {
  
  inline def apply(dispose: Callback): IDisposable = {
    val __obj = js.Dynamic.literal(dispose = dispose.toJsFn)
    __obj.asInstanceOf[IDisposable]
  }
  
  extension [Self <: IDisposable](x: Self) {
    
    inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
  }
}
