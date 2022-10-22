package typingsJapgolly.sqltoolsFormatter

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreIndentationMod {
  
  @JSImport("@sqltools/formatter/lib/core/Indentation", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Indentation {
    def this(indent: String) = this()
    
    /* CompleteClass */
    override def decreaseBlockLevel(): Unit = js.native
    
    /* CompleteClass */
    override def decreaseTopLevel(): Unit = js.native
    
    /* CompleteClass */
    override def getIndent(): String = js.native
    
    /* CompleteClass */
    override def increaseBlockLevel(): Unit = js.native
    
    /* CompleteClass */
    override def increaseTopLevel(): Unit = js.native
    
    /* CompleteClass */
    var indentTypes: js.Array[Any] = js.native
    
    /* CompleteClass */
    override def resetIndentation(): Unit = js.native
  }
  
  trait Indentation extends StObject {
    
    def decreaseBlockLevel(): Unit
    
    def decreaseTopLevel(): Unit
    
    def getIndent(): String
    
    def increaseBlockLevel(): Unit
    
    def increaseTopLevel(): Unit
    
    var indent: js.UndefOr[String] = js.undefined
    
    var indentTypes: js.Array[Any]
    
    def resetIndentation(): Unit
  }
  object Indentation {
    
    inline def apply(
      decreaseBlockLevel: Callback,
      decreaseTopLevel: Callback,
      getIndent: CallbackTo[String],
      increaseBlockLevel: Callback,
      increaseTopLevel: Callback,
      indentTypes: js.Array[Any],
      resetIndentation: Callback
    ): Indentation = {
      val __obj = js.Dynamic.literal(decreaseBlockLevel = decreaseBlockLevel.toJsFn, decreaseTopLevel = decreaseTopLevel.toJsFn, getIndent = getIndent.toJsFn, increaseBlockLevel = increaseBlockLevel.toJsFn, increaseTopLevel = increaseTopLevel.toJsFn, indentTypes = indentTypes.asInstanceOf[js.Any], resetIndentation = resetIndentation.toJsFn)
      __obj.asInstanceOf[Indentation]
    }
    
    extension [Self <: Indentation](x: Self) {
      
      inline def setDecreaseBlockLevel(value: Callback): Self = StObject.set(x, "decreaseBlockLevel", value.toJsFn)
      
      inline def setDecreaseTopLevel(value: Callback): Self = StObject.set(x, "decreaseTopLevel", value.toJsFn)
      
      inline def setGetIndent(value: CallbackTo[String]): Self = StObject.set(x, "getIndent", value.toJsFn)
      
      inline def setIncreaseBlockLevel(value: Callback): Self = StObject.set(x, "increaseBlockLevel", value.toJsFn)
      
      inline def setIncreaseTopLevel(value: Callback): Self = StObject.set(x, "increaseTopLevel", value.toJsFn)
      
      inline def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setIndentTypes(value: js.Array[Any]): Self = StObject.set(x, "indentTypes", value.asInstanceOf[js.Any])
      
      inline def setIndentTypesVarargs(value: Any*): Self = StObject.set(x, "indentTypes", js.Array(value*))
      
      inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      inline def setResetIndentation(value: Callback): Self = StObject.set(x, "resetIndentation", value.toJsFn)
    }
  }
}
