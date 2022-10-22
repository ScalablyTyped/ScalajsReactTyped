package typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.framework

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XCloneable
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This service provides the means for constructing new configurations.
  *
  * Most likely use is the {@link XConfigurationController.restoreConfiguration()} method.
  * @see XConfiguration for a description of the configuration.
  */
trait Configuration
  extends StObject
     with XConfiguration {
  
  /**
    * Create an empty configuration.
    *
    * This should not be necessary very often. Changes to an existing configuration are more likely.
    */
  def create(): Unit
}
object Configuration {
  
  inline def apply(
    acquire: Callback,
    addResource: XResourceId => Callback,
    create: Callback,
    createClone: CallbackTo[XCloneable],
    getResources: (XResourceId, String, AnchorBindingMode) => SafeArray[XResourceId],
    hasResource: XResourceId => Boolean,
    queryInterface: `type` => Any,
    release: Callback,
    removeResource: XResourceId => Callback
  ): Configuration = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addResource = js.Any.fromFunction1((t0: XResourceId) => addResource(t0).runNow()), create = create.toJsFn, createClone = createClone.toJsFn, getResources = js.Any.fromFunction3(getResources), hasResource = js.Any.fromFunction1(hasResource), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeResource = js.Any.fromFunction1((t0: XResourceId) => removeResource(t0).runNow()))
    __obj.asInstanceOf[Configuration]
  }
  
  extension [Self <: Configuration](x: Self) {
    
    inline def setCreate(value: Callback): Self = StObject.set(x, "create", value.toJsFn)
  }
}
