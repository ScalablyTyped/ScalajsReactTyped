package typingsJapgolly.crocks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asyncRaceMod {
  
  @JSImport("crocks/Async/race", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(val1: typingsJapgolly.crocks.asyncAsyncMod.default): js.Function1[
    /* val2 */ typingsJapgolly.crocks.asyncAsyncMod.default, 
    typingsJapgolly.crocks.asyncAsyncMod.default
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(val1.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* val2 */ typingsJapgolly.crocks.asyncAsyncMod.default, 
    typingsJapgolly.crocks.asyncAsyncMod.default
  ]]
  /**
    * race :: Async e a -> Async e a -> Async e a
    */
  inline def default(
    val1: typingsJapgolly.crocks.asyncAsyncMod.default,
    val2: typingsJapgolly.crocks.asyncAsyncMod.default
  ): typingsJapgolly.crocks.asyncAsyncMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(val1.asInstanceOf[js.Any], val2.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.crocks.asyncAsyncMod.default]
}
