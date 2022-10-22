package typingsJapgolly.onflowFlowJsTesting

import typingsJapgolly.onflowFlowJsTesting.srcAccountMod.Address
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcContractMod {
  
  @JSImport("@onflow/flow-js-testing/src/contract", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getContractAddress(name: String): js.Promise[Address] = ^.asInstanceOf[js.Dynamic].applyDynamic("getContractAddress")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Address]]
}
