package typingsJapgolly.activexLibreoffice.com_.sun.star.util

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows to control modifiable state change.
  *
  * This interface allows to prevent changing of the modified state of the object. It is introduced for performance optimizations, to allow to prevent
  * unnecessary updates, for example while importing a document. Please use this interface very carefully.
  */
trait XModifiable2
  extends StObject
     with XModifiable {
  
  /**
    * disable possibility to change modified state of the document
    * @returns the value that says whether the modified state change was enabled before the call `TRUE` the changing of the modified state was already disabled
    */
  def disableSetModified(): Boolean
  
  /**
    * enable possibility to change modified state of the document
    * @returns the value that says whether the modified state change was enabled before the call `TRUE` the changing of the modified state was disabled `FALSE`
    */
  def enableSetModified(): Boolean
  
  /** allows to detect whether the modified state change is enabled */
  def isSetModifiedEnabled(): Boolean
}
object XModifiable2 {
  
  inline def apply(
    acquire: Callback,
    addModifyListener: XModifyListener => Callback,
    disableSetModified: CallbackTo[Boolean],
    enableSetModified: CallbackTo[Boolean],
    isModified: CallbackTo[Boolean],
    isSetModifiedEnabled: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    removeModifyListener: XModifyListener => Callback,
    setModified: Boolean => Callback
  ): XModifiable2 = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addModifyListener = js.Any.fromFunction1((t0: XModifyListener) => addModifyListener(t0).runNow()), disableSetModified = disableSetModified.toJsFn, enableSetModified = enableSetModified.toJsFn, isModified = isModified.toJsFn, isSetModifiedEnabled = isSetModifiedEnabled.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeModifyListener = js.Any.fromFunction1((t0: XModifyListener) => removeModifyListener(t0).runNow()), setModified = js.Any.fromFunction1((t0: Boolean) => setModified(t0).runNow()))
    __obj.asInstanceOf[XModifiable2]
  }
  
  extension [Self <: XModifiable2](x: Self) {
    
    inline def setDisableSetModified(value: CallbackTo[Boolean]): Self = StObject.set(x, "disableSetModified", value.toJsFn)
    
    inline def setEnableSetModified(value: CallbackTo[Boolean]): Self = StObject.set(x, "enableSetModified", value.toJsFn)
    
    inline def setIsSetModifiedEnabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "isSetModifiedEnabled", value.toJsFn)
  }
}
