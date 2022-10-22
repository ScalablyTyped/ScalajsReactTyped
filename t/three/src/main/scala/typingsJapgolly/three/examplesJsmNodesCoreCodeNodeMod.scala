package typingsJapgolly.three

import japgolly.scalajs.react.Callback
import typingsJapgolly.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesCoreCodeNodeMod {
  
  @JSImport("three/examples/jsm/nodes/core/CodeNode", JSImport.Default)
  @js.native
  open class default () extends CodeNode {
    def this(code: String) = this()
    def this(code: String, includes: js.Array[CodeNodeInclude]) = this()
    def this(code: Unit, includes: js.Array[CodeNodeInclude]) = this()
  }
  
  @js.native
  trait CodeNode
    extends typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default {
    
    var code: String = js.native
    
    def getIncludes(builder: typingsJapgolly.three.examplesJsmNodesCoreNodeBuilderMod.default): js.Array[CodeNodeInclude] = js.native
    
    var isCodeNode: `true` = js.native
    
    def setIncludes(includes: js.Array[CodeNodeInclude]): this.type = js.native
  }
  
  trait CodeNodeInclude extends StObject {
    
    def build(builder: typingsJapgolly.three.examplesJsmNodesCoreNodeBuilderMod.default): Unit
  }
  object CodeNodeInclude {
    
    inline def apply(build: typingsJapgolly.three.examplesJsmNodesCoreNodeBuilderMod.default => Callback): CodeNodeInclude = {
      val __obj = js.Dynamic.literal(build = js.Any.fromFunction1((t0: typingsJapgolly.three.examplesJsmNodesCoreNodeBuilderMod.default) => build(t0).runNow()))
      __obj.asInstanceOf[CodeNodeInclude]
    }
    
    extension [Self <: CodeNodeInclude](x: Self) {
      
      inline def setBuild(value: typingsJapgolly.three.examplesJsmNodesCoreNodeBuilderMod.default => Callback): Self = StObject.set(x, "build", js.Any.fromFunction1((t0: typingsJapgolly.three.examplesJsmNodesCoreNodeBuilderMod.default) => value(t0).runNow()))
    }
  }
}
