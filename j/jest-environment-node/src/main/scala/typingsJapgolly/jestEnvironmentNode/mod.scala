package typingsJapgolly.jestEnvironmentNode

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.jestEnvironment.mod.EnvironmentContext
import typingsJapgolly.jestEnvironment.mod.JestEnvironment
import typingsJapgolly.jestEnvironment.mod.JestEnvironmentConfig
import typingsJapgolly.node.vmMod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jest-environment-node", JSImport.Default)
  @js.native
  open class default protected () extends NodeEnvironment {
    def this(config: JestEnvironmentConfig, _context: EnvironmentContext) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("jest-environment-node", "TestEnvironment")
  @js.native
  open class TestEnvironment protected () extends NodeEnvironment {
    def this(config: JestEnvironmentConfig, _context: EnvironmentContext) = this()
  }
  @JSImport("jest-environment-node", "TestEnvironment")
  @js.native
  val TestEnvironment: Instantiable2[
    /* config */ JestEnvironmentConfig, 
    /* _context */ EnvironmentContext, 
    NodeEnvironment
  ] = js.native
  
  @js.native
  trait NodeEnvironment extends JestEnvironment[Timer] {
    
    var context: Context | Null = js.native
    
    var customExportConditions: js.Array[String] = js.native
    
    @JSName("exportConditions")
    def exportConditions_MNodeEnvironment(): js.Array[String] = js.native
  }
  
  trait Timer extends StObject {
    
    var id: Double
    
    def ref(): Timer
    
    def unref(): Timer
  }
  object Timer {
    
    inline def apply(id: Double, ref: CallbackTo[Timer], unref: CallbackTo[Timer]): Timer = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ref = ref.toJsFn, unref = unref.toJsFn)
      __obj.asInstanceOf[Timer]
    }
    
    extension [Self <: Timer](x: Self) {
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setRef(value: CallbackTo[Timer]): Self = StObject.set(x, "ref", value.toJsFn)
      
      inline def setUnref(value: CallbackTo[Timer]): Self = StObject.set(x, "unref", value.toJsFn)
    }
  }
}
