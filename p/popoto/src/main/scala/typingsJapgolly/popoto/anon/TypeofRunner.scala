package typingsJapgolly.popoto.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofRunner extends StObject {
  
  var DRIVER: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Driver */ Any
  
  def createSession(): Any
  
  def run(statements: js.Array[Parameters]): Unit
  
  def toObject(
    results: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Result */ Any
    ]
  ): js.Array[js.Array[Any]]
}
object TypeofRunner {
  
  inline def apply(
    DRIVER: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Driver */ Any,
    createSession: CallbackTo[Any],
    run: js.Array[Parameters] => Callback,
    toObject: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Result */ Any
    ] => js.Array[js.Array[Any]]
  ): TypeofRunner = {
    val __obj = js.Dynamic.literal(DRIVER = DRIVER.asInstanceOf[js.Any], createSession = createSession.toJsFn, run = js.Any.fromFunction1((t0: js.Array[Parameters]) => run(t0).runNow()), toObject = js.Any.fromFunction1(toObject))
    __obj.asInstanceOf[TypeofRunner]
  }
  
  extension [Self <: TypeofRunner](x: Self) {
    
    inline def setCreateSession(value: CallbackTo[Any]): Self = StObject.set(x, "createSession", value.toJsFn)
    
    inline def setDRIVER(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Driver */ Any
    ): Self = StObject.set(x, "DRIVER", value.asInstanceOf[js.Any])
    
    inline def setRun(value: js.Array[Parameters] => Callback): Self = StObject.set(x, "run", js.Any.fromFunction1((t0: js.Array[Parameters]) => value(t0).runNow()))
    
    inline def setToObject(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Result */ Any
        ] => js.Array[js.Array[Any]]
    ): Self = StObject.set(x, "toObject", js.Any.fromFunction1(value))
  }
}
