package typingsJapgolly.reduxFirstRouterRestoreScroll

import typingsJapgolly.history.mod.Location
import typingsJapgolly.reduxFirstRouter.mod.LocationState
import typingsJapgolly.reduxFirstRouterRestoreScroll.reduxFirstRouterRestoreScrollStrings.`profile-box`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Manual extends StObject {
    
    /** @default false */
    var manual: js.UndefOr[Boolean] = js.undefined
    
    /** Use to implement custom scroll positioning. */
    var shouldUpdateScroll: js.UndefOr[
        js.Function2[
          /* prev */ LocationState[js.Object, Any], 
          /* locationState */ LocationState[js.Object, Any], 
          Boolean | `profile-box` | (js.Tuple2[Double, Double])
        ]
      ] = js.undefined
    
    /**
      * To implement a custom backend storage for scroll state, pass a custom
      * stateStorage object. The object should implement the methods as described
      * by the package `scroll-behavior` as well as a function called setPrevKey
      * that keeps track of the previous key.
      */
    var stateStorage: js.UndefOr[Read] = js.undefined
  }
  object Manual {
    
    inline def apply(): Manual = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Manual]
    }
    
    extension [Self <: Manual](x: Self) {
      
      inline def setManual(value: Boolean): Self = StObject.set(x, "manual", value.asInstanceOf[js.Any])
      
      inline def setManualUndefined: Self = StObject.set(x, "manual", js.undefined)
      
      inline def setShouldUpdateScroll(
        value: (/* prev */ LocationState[js.Object, Any], /* locationState */ LocationState[js.Object, Any]) => Boolean | `profile-box` | (js.Tuple2[Double, Double])
      ): Self = StObject.set(x, "shouldUpdateScroll", js.Any.fromFunction2(value))
      
      inline def setShouldUpdateScrollUndefined: Self = StObject.set(x, "shouldUpdateScroll", js.undefined)
      
      inline def setStateStorage(value: Read): Self = StObject.set(x, "stateStorage", value.asInstanceOf[js.Any])
      
      inline def setStateStorageUndefined: Self = StObject.set(x, "stateStorage", js.undefined)
    }
  }
  
  @js.native
  trait Read extends StObject {
    
    def read(location: Location): Location = js.native
    def read(location: Location, key: String): Location = js.native
    
    def save(location: Location, key: String, value: Any): Unit = js.native
    def save(location: Location, key: Null, value: Any): Unit = js.native
    
    def setPrevKey(): Unit = js.native
    def setPrevKey(key: String): Unit = js.native
  }
}
