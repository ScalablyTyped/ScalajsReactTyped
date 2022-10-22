package typingsJapgolly.rxjs.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.rxjs.distTypesInternalObservableMod.Observable
import typingsJapgolly.rxjs.distTypesInternalSubscriberMod.Subscriber
import typingsJapgolly.rxjs.distTypesInternalTypesMod.TeardownLogic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofObservable
  extends StObject
     with Instantiable0[Observable[js.Object]]
     with Instantiable1[
      /* subscribe */ js.ThisFunction1[
        /* this */ Observable[/* import warning: RewrittenClass.unapply cls was tparam T */ Any], 
        /* subscriber */ Subscriber[/* import warning: RewrittenClass.unapply cls was tparam T */ Any], 
        TeardownLogic
      ], 
      Observable[js.Object]
    ] {
  
  /**
    * Creates a new Observable by calling the Observable constructor
    * @owner Observable
    * @method create
    * @param {Function} subscribe? the subscriber function to be passed to the Observable constructor
    * @return {Observable} a new observable
    * @nocollapse
    * @deprecated Use `new Observable()` instead. Will be removed in v8.
    */
  def create(args: Any*): Any = js.native
}
