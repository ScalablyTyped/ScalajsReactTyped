package typingsJapgolly.reduxCablecar

import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Store
import typingsJapgolly.reduxCablecar.mod.CableCar
import typingsJapgolly.reduxCablecar.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Connect extends StObject {
    
    def connect(store: Store[Any, AnyAction], channel: String): CableCar = js.native
    def connect(store: Store[Any, AnyAction], channel: String, options: Options): CableCar = js.native
    
    def setProvider(actionCableProvider: String): Unit = js.native
  }
}
