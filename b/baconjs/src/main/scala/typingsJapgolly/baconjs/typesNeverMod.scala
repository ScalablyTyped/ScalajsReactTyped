package typingsJapgolly.baconjs

import typingsJapgolly.baconjs.typesObservableMod.EventStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesNeverMod {
  
  @JSImport("baconjs/types/never", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[V](): EventStream[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[EventStream[V]]
}
