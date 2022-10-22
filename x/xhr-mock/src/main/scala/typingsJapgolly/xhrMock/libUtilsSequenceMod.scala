package typingsJapgolly.xhrMock

import typingsJapgolly.xhrMock.libTypesMod.MockFunction
import typingsJapgolly.xhrMock.libTypesMod.MockObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsSequenceMod {
  
  @JSImport("xhr-mock/lib/utils/sequence", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sequence(mocks: js.Array[MockFunction | MockObject]): MockFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("sequence")(mocks.asInstanceOf[js.Any]).asInstanceOf[MockFunction]
}
