package typingsJapgolly.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object assertsMod {
  
  @JSImport("ol/asserts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assert(assertion: Any, errorCode: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(assertion.asInstanceOf[js.Any], errorCode.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
