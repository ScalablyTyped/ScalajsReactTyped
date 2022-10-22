package typingsJapgolly.sqlFormatter

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcFormatterIndentationMod {
  
  @JSImport("sql-formatter/lib/src/formatter/Indentation", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Indentation {
    /**
      * @param {string} indent A string to indent with
      */
    def this(indent: String) = this()
    
    /**
      * Decreases indentation by one block-level indent.
      * If there are top-level indents within the block-level indent,
      * throws away these as well.
      */
    /* CompleteClass */
    override def decreaseBlockLevel(): Unit = js.native
    
    /**
      * Decreases indentation by one top-level indent.
      * Does nothing when the previous indent is not top-level.
      */
    /* CompleteClass */
    override def decreaseTopLevel(): Unit = js.native
    
    /**
      * Returns current indentation level
      */
    /* CompleteClass */
    override def getLevel(): Double = js.native
    
    /**
      * Returns indentation string for single indentation step.
      */
    /* CompleteClass */
    override def getSingleIndent(): String = js.native
    
    /**
      * Increases indentation by one block-level indent.
      */
    /* CompleteClass */
    override def increaseBlockLevel(): Unit = js.native
    
    /**
      * Increases indentation by one top-level indent.
      */
    /* CompleteClass */
    override def increaseTopLevel(): Unit = js.native
    
    /* private */ /* CompleteClass */
    var indent: Any = js.native
    
    /* private */ /* CompleteClass */
    var indentTypes: Any = js.native
  }
  
  trait Indentation extends StObject {
    
    /**
      * Decreases indentation by one block-level indent.
      * If there are top-level indents within the block-level indent,
      * throws away these as well.
      */
    def decreaseBlockLevel(): Unit
    
    /**
      * Decreases indentation by one top-level indent.
      * Does nothing when the previous indent is not top-level.
      */
    def decreaseTopLevel(): Unit
    
    /**
      * Returns current indentation level
      */
    def getLevel(): Double
    
    /**
      * Returns indentation string for single indentation step.
      */
    def getSingleIndent(): String
    
    /**
      * Increases indentation by one block-level indent.
      */
    def increaseBlockLevel(): Unit
    
    /**
      * Increases indentation by one top-level indent.
      */
    def increaseTopLevel(): Unit
    
    /* private */ var indent: Any
    
    /* private */ var indentTypes: Any
  }
  object Indentation {
    
    inline def apply(
      decreaseBlockLevel: Callback,
      decreaseTopLevel: Callback,
      getLevel: CallbackTo[Double],
      getSingleIndent: CallbackTo[String],
      increaseBlockLevel: Callback,
      increaseTopLevel: Callback,
      indent: Any,
      indentTypes: Any
    ): Indentation = {
      val __obj = js.Dynamic.literal(decreaseBlockLevel = decreaseBlockLevel.toJsFn, decreaseTopLevel = decreaseTopLevel.toJsFn, getLevel = getLevel.toJsFn, getSingleIndent = getSingleIndent.toJsFn, increaseBlockLevel = increaseBlockLevel.toJsFn, increaseTopLevel = increaseTopLevel.toJsFn, indent = indent.asInstanceOf[js.Any], indentTypes = indentTypes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Indentation]
    }
    
    extension [Self <: Indentation](x: Self) {
      
      inline def setDecreaseBlockLevel(value: Callback): Self = StObject.set(x, "decreaseBlockLevel", value.toJsFn)
      
      inline def setDecreaseTopLevel(value: Callback): Self = StObject.set(x, "decreaseTopLevel", value.toJsFn)
      
      inline def setGetLevel(value: CallbackTo[Double]): Self = StObject.set(x, "getLevel", value.toJsFn)
      
      inline def setGetSingleIndent(value: CallbackTo[String]): Self = StObject.set(x, "getSingleIndent", value.toJsFn)
      
      inline def setIncreaseBlockLevel(value: Callback): Self = StObject.set(x, "increaseBlockLevel", value.toJsFn)
      
      inline def setIncreaseTopLevel(value: Callback): Self = StObject.set(x, "increaseTopLevel", value.toJsFn)
      
      inline def setIndent(value: Any): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setIndentTypes(value: Any): Self = StObject.set(x, "indentTypes", value.asInstanceOf[js.Any])
    }
  }
}
