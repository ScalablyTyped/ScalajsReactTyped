package typingsJapgolly.sqlFormatter

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.sqlFormatter.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcFormatterParamsMod {
  
  @JSImport("sql-formatter/lib/src/formatter/Params", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Params {
    def this(params: js.Array[String]) = this()
    def this(params: ParamItems) = this()
    
    /**
      * Returns param value that matches given placeholder with param key.
      */
    /* CompleteClass */
    override def get(hasKeyText: Key): String = js.native
    
    /**
      * Returns index of current positional parameter.
      */
    /* CompleteClass */
    override def getPositionalParameterIndex(): Double = js.native
    
    /* private */ /* CompleteClass */
    var index: Any = js.native
    
    /* private */ /* CompleteClass */
    var params: Any = js.native
    
    /**
      * Sets index of current positional parameter.
      */
    /* CompleteClass */
    override def setPositionalParameterIndex(i: Double): Unit = js.native
  }
  
  type ParamItems = StringDictionary[String]
  
  trait Params extends StObject {
    
    /**
      * Returns param value that matches given placeholder with param key.
      */
    def get(hasKeyText: Key): String
    
    /**
      * Returns index of current positional parameter.
      */
    def getPositionalParameterIndex(): Double
    
    /* private */ var index: Any
    
    /* private */ var params: Any
    
    /**
      * Sets index of current positional parameter.
      */
    def setPositionalParameterIndex(i: Double): Unit
  }
  object Params {
    
    inline def apply(
      get: Key => String,
      getPositionalParameterIndex: CallbackTo[Double],
      index: Any,
      params: Any,
      setPositionalParameterIndex: Double => Callback
    ): Params = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), getPositionalParameterIndex = getPositionalParameterIndex.toJsFn, index = index.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], setPositionalParameterIndex = js.Any.fromFunction1((t0: Double) => setPositionalParameterIndex(t0).runNow()))
      __obj.asInstanceOf[Params]
    }
    
    extension [Self <: Params](x: Self) {
      
      inline def setGet(value: Key => String): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setGetPositionalParameterIndex(value: CallbackTo[Double]): Self = StObject.set(x, "getPositionalParameterIndex", value.toJsFn)
      
      inline def setIndex(value: Any): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setParams(value: Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setSetPositionalParameterIndex(value: Double => Callback): Self = StObject.set(x, "setPositionalParameterIndex", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    }
  }
}
