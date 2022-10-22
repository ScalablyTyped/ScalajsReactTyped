package typingsJapgolly.winrtUwp.Windows.Media

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IPropertySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Encapsulates the method needed to set the configuration properties on a registered media parser or codec. */
trait IMediaExtension extends StObject {
  
  /**
    * Sets the configuration properties that were supplied when the media parser or codec was registered.
    * @param configuration The configuration properties for the media parser or codec.
    */
  def setProperties(configuration: IPropertySet): Unit
}
object IMediaExtension {
  
  inline def apply(setProperties: IPropertySet => Callback): IMediaExtension = {
    val __obj = js.Dynamic.literal(setProperties = js.Any.fromFunction1((t0: IPropertySet) => setProperties(t0).runNow()))
    __obj.asInstanceOf[IMediaExtension]
  }
  
  extension [Self <: IMediaExtension](x: Self) {
    
    inline def setSetProperties(value: IPropertySet => Callback): Self = StObject.set(x, "setProperties", js.Any.fromFunction1((t0: IPropertySet) => value(t0).runNow()))
  }
}
