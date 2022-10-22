package typingsJapgolly.foreverAgent

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.foreverAgent.anon.TypeofForeverAgent
import typingsJapgolly.node.httpMod.Agent
import typingsJapgolly.node.httpMod.AgentOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("forever-agent", JSImport.Namespace)
  @js.native
  open class ^ () extends Agent {
    def this(options: ForeverAgentOptions) = this()
  }
  @JSImport("forever-agent", JSImport.Namespace)
  @js.native
  val ^ : TypeofForeverAgent & (Instantiable1[/* options */ js.UndefOr[ForeverAgentOptions], ForeverAgent]) & typingsJapgolly.foreverAgent.anon.SSL = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("forever-agent", "SSL")
  @js.native
  open class SSL () extends Agent {
    def this(options: ForeverAgentOptions) = this()
  }
  
  type ForeverAgent = Agent
  
  trait ForeverAgentOptions
    extends StObject
       with AgentOptions {
    
    var minSockets: js.UndefOr[Double] = js.undefined
  }
  object ForeverAgentOptions {
    
    inline def apply(): ForeverAgentOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ForeverAgentOptions]
    }
    
    extension [Self <: ForeverAgentOptions](x: Self) {
      
      inline def setMinSockets(value: Double): Self = StObject.set(x, "minSockets", value.asInstanceOf[js.Any])
      
      inline def setMinSocketsUndefined: Self = StObject.set(x, "minSockets", js.undefined)
    }
  }
  
  type ForeverAgentSSL = ForeverAgent
  
  type _To = TypeofForeverAgent & (Instantiable1[/* options */ js.UndefOr[ForeverAgentOptions], ForeverAgent]) & typingsJapgolly.foreverAgent.anon.SSL
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: TypeofForeverAgent & (Instantiable1[/* options */ js.UndefOr[ForeverAgentOptions], ForeverAgent]) & typingsJapgolly.foreverAgent.anon.SSL = ^
}
