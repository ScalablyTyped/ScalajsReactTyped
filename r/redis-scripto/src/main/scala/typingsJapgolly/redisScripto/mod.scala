package typingsJapgolly.redisScripto

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redis-scripto", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Scripto {
    def this(redisClient: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify redis.RedisClient */ Any) = this()
    
    /* CompleteClass */
    override def eval(
      scriptName: String,
      keys: js.Array[String],
      args: js.Array[Any],
      callback: js.Function2[/* err */ js.Error, /* result */ Any, Unit]
    ): Unit = js.native
    
    /* CompleteClass */
    override def evalSha(
      scriptName: String,
      keys: js.Array[String],
      args: js.Array[Any],
      callback: js.Function2[/* err */ js.Error, /* result */ Any, Unit]
    ): Unit = js.native
    
    /* CompleteClass */
    override def load(scripts: Scripts): Unit = js.native
    
    /* CompleteClass */
    override def loadFromDir(scriptsDir: String): Unit = js.native
    
    /* CompleteClass */
    override def loadFromFile(name: String, filepath: String): Unit = js.native
    
    /* CompleteClass */
    override def run(
      scriptName: String,
      keys: js.Array[String],
      args: js.Array[Any],
      callback: js.Function2[/* err */ js.Error, /* result */ Any, Unit]
    ): Unit = js.native
  }
  
  type Script = String
  
  trait Scripto extends StObject {
    
    def eval(
      scriptName: String,
      keys: js.Array[String],
      args: js.Array[Any],
      callback: js.Function2[/* err */ js.Error, /* result */ Any, Unit]
    ): Unit
    
    def evalSha(
      scriptName: String,
      keys: js.Array[String],
      args: js.Array[Any],
      callback: js.Function2[/* err */ js.Error, /* result */ Any, Unit]
    ): Unit
    
    def load(scripts: Scripts): Unit
    
    def loadFromDir(scriptsDir: String): Unit
    
    def loadFromFile(name: String, filepath: String): Unit
    
    def run(
      scriptName: String,
      keys: js.Array[String],
      args: js.Array[Any],
      callback: js.Function2[/* err */ js.Error, /* result */ Any, Unit]
    ): Unit
  }
  object Scripto {
    
    inline def apply(
      eval: (String, js.Array[String], js.Array[Any], js.Function2[/* err */ js.Error, /* result */ Any, Unit]) => Callback,
      evalSha: (String, js.Array[String], js.Array[Any], js.Function2[/* err */ js.Error, /* result */ Any, Unit]) => Callback,
      load: Scripts => Callback,
      loadFromDir: String => Callback,
      loadFromFile: (String, String) => Callback,
      run: (String, js.Array[String], js.Array[Any], js.Function2[/* err */ js.Error, /* result */ Any, Unit]) => Callback
    ): Scripto = {
      val __obj = js.Dynamic.literal(eval = js.Any.fromFunction4((t0: String, t1: js.Array[String], t2: js.Array[Any], t3: js.Function2[/* err */ js.Error, /* result */ Any, Unit]) => (eval(t0, t1, t2, t3)).runNow()), evalSha = js.Any.fromFunction4((t0: String, t1: js.Array[String], t2: js.Array[Any], t3: js.Function2[/* err */ js.Error, /* result */ Any, Unit]) => (evalSha(t0, t1, t2, t3)).runNow()), load = js.Any.fromFunction1((t0: Scripts) => load(t0).runNow()), loadFromDir = js.Any.fromFunction1((t0: String) => loadFromDir(t0).runNow()), loadFromFile = js.Any.fromFunction2((t0: String, t1: String) => (loadFromFile(t0, t1)).runNow()), run = js.Any.fromFunction4((t0: String, t1: js.Array[String], t2: js.Array[Any], t3: js.Function2[/* err */ js.Error, /* result */ Any, Unit]) => (run(t0, t1, t2, t3)).runNow()))
      __obj.asInstanceOf[Scripto]
    }
    
    extension [Self <: Scripto](x: Self) {
      
      inline def setEval(
        value: (String, js.Array[String], js.Array[Any], js.Function2[/* err */ js.Error, /* result */ Any, Unit]) => Callback
      ): Self = StObject.set(x, "eval", js.Any.fromFunction4((t0: String, t1: js.Array[String], t2: js.Array[Any], t3: js.Function2[/* err */ js.Error, /* result */ Any, Unit]) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setEvalSha(
        value: (String, js.Array[String], js.Array[Any], js.Function2[/* err */ js.Error, /* result */ Any, Unit]) => Callback
      ): Self = StObject.set(x, "evalSha", js.Any.fromFunction4((t0: String, t1: js.Array[String], t2: js.Array[Any], t3: js.Function2[/* err */ js.Error, /* result */ Any, Unit]) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setLoad(value: Scripts => Callback): Self = StObject.set(x, "load", js.Any.fromFunction1((t0: Scripts) => value(t0).runNow()))
      
      inline def setLoadFromDir(value: String => Callback): Self = StObject.set(x, "loadFromDir", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setLoadFromFile(value: (String, String) => Callback): Self = StObject.set(x, "loadFromFile", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setRun(
        value: (String, js.Array[String], js.Array[Any], js.Function2[/* err */ js.Error, /* result */ Any, Unit]) => Callback
      ): Self = StObject.set(x, "run", js.Any.fromFunction4((t0: String, t1: js.Array[String], t2: js.Array[Any], t3: js.Function2[/* err */ js.Error, /* result */ Any, Unit]) => (value(t0, t1, t2, t3)).runNow()))
    }
  }
  
  type Scripts = StringDictionary[Script]
}
