package typingsJapgolly.storybookReactDocgenTypescriptPlugin

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.webpack.mod.Hash
import typingsJapgolly.webpack.mod.UpdateHashContextDependency
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDependencyMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NullDependency * / any
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NullDependency * / any */ @JSImport("@storybook/react-docgen-typescript-plugin/dist/dependency", "DocGenDependency")
  @js.native
  open class DocGenDependency protected () extends StObject {
    def this(codeBlock: String) = this()
    
    var codeBlock: String = js.native
    
    def deserialize(context: Context): Unit = js.native
    
    def getModuleEvaluationSideEffectsState(): Boolean = js.native
    
    def serialize(context: Context): Unit = js.native
    
    def `type`: String = js.native
    
    def updateHash(hash: Hash, context: UpdateHashContextDependency): Unit = js.native
    @JSName("updateHash")
    var updateHash_Original: js.Function2[/* hash */ Hash, /* context */ UpdateHashContextDependency, Unit] = js.native
  }
  
  trait Context extends StObject {
    
    def read(): String
    
    def write(a: String): Unit
  }
  object Context {
    
    inline def apply(read: CallbackTo[String], write: String => Callback): Context = {
      val __obj = js.Dynamic.literal(read = read.toJsFn, write = js.Any.fromFunction1((t0: String) => write(t0).runNow()))
      __obj.asInstanceOf[Context]
    }
    
    extension [Self <: Context](x: Self) {
      
      inline def setRead(value: CallbackTo[String]): Self = StObject.set(x, "read", value.toJsFn)
      
      inline def setWrite(value: String => Callback): Self = StObject.set(x, "write", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
}
