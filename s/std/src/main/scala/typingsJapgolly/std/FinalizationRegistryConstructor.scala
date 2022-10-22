package typingsJapgolly.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FinalizationRegistryConstructor
  extends StObject
     with /**
  * Creates a finalization registry with an associated cleanup callback
  * @param cleanupCallback The callback to call after an object in the registry has been reclaimed.
  */
/* standard es2021.weakref */
Instantiable1[
      /* cleanupCallback */ js.Function1[/* heldValue */ js.Object, Unit], 
      FinalizationRegistry[js.Object]
    ]
