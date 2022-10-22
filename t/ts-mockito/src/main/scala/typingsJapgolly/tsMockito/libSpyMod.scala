package typingsJapgolly.tsMockito

import typingsJapgolly.tsMockito.libMockMod.Mocker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSpyMod {
  
  @JSImport("ts-mockito/lib/Spy", "Spy")
  @js.native
  open class Spy protected () extends Mocker {
    def this(instance: Any) = this()
    
    /* private */ var realMethods: Any = js.native
  }
}
