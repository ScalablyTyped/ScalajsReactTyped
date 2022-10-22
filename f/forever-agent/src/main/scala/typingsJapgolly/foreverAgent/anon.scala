package typingsJapgolly.foreverAgent

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.foreverAgent.mod.ForeverAgentOptions
import typingsJapgolly.foreverAgent.mod.ForeverAgentSSL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait SSL extends StObject {
    
    var SSL: Instantiable1[/* options */ js.UndefOr[ForeverAgentOptions], ForeverAgentSSL]
  }
  object SSL {
    
    inline def apply(SSL: Instantiable1[/* options */ js.UndefOr[ForeverAgentOptions], ForeverAgentSSL]): SSL = {
      val __obj = js.Dynamic.literal(SSL = SSL.asInstanceOf[js.Any])
      __obj.asInstanceOf[SSL]
    }
    
    extension [Self <: SSL](x: Self) {
      
      inline def setSSL(value: Instantiable1[/* options */ js.UndefOr[ForeverAgentOptions], ForeverAgentSSL]): Self = StObject.set(x, "SSL", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeofForeverAgent extends StObject {
    
    /* static member */
    var defaultMinSockets: Double
  }
  object TypeofForeverAgent {
    
    inline def apply(defaultMinSockets: Double): TypeofForeverAgent = {
      val __obj = js.Dynamic.literal(defaultMinSockets = defaultMinSockets.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofForeverAgent]
    }
    
    extension [Self <: TypeofForeverAgent](x: Self) {
      
      inline def setDefaultMinSockets(value: Double): Self = StObject.set(x, "defaultMinSockets", value.asInstanceOf[js.Any])
    }
  }
}
