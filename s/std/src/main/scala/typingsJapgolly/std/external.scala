package typingsJapgolly.std

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @deprecated */
trait External extends StObject {
  
  /** @deprecated */
  /* standard dom */
  def AddSearchProvider(): Unit
  
  /** @deprecated */
  /* standard dom */
  def IsSearchProviderInstalled(): Unit
}
object External {
  
  inline def apply(AddSearchProvider: Callback, IsSearchProviderInstalled: Callback): External = {
    val __obj = js.Dynamic.literal(AddSearchProvider = AddSearchProvider.toJsFn, IsSearchProviderInstalled = IsSearchProviderInstalled.toJsFn)
    __obj.asInstanceOf[External]
  }
  
  extension [Self <: External](x: Self) {
    
    inline def setAddSearchProvider(value: Callback): Self = StObject.set(x, "AddSearchProvider", value.toJsFn)
    
    inline def setIsSearchProviderInstalled(value: Callback): Self = StObject.set(x, "IsSearchProviderInstalled", value.toJsFn)
  }
}
