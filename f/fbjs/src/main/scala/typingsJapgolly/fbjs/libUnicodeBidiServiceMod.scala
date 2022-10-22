package typingsJapgolly.fbjs

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUnicodeBidiServiceMod {
  
  @JSImport("fbjs/lib/UnicodeBidiService", JSImport.Namespace)
  @js.native
  /**
    * Stateful class for paragraph direction detection
    */
  open class ^ ()
    extends StObject
       with UnicodeBidiService {
    def this(defaultDir: BidiDirection) = this()
    
    /* CompleteClass */
    var _defaultDir: BidiDirection = js.native
    
    /* CompleteClass */
    var _lastDir: BidiDirection = js.native
    
    /**
      * Returns the direction of a block of text, and remembers it as the
      * fall-back direction for the next paragraph.
      *
      * @param str  A text block, e.g. paragraph, table cell, tag
      * @return     The resolved direction
      */
    /* CompleteClass */
    override def getDirection(str: String): BidiDirection = js.native
    
    /**
      * Reset the internal state
      *
      * Instead of creating a new instance, you can just reset() your instance
      * everytime you start a new loop.
      */
    /* CompleteClass */
    override def reset(): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.fbjs.fbjsStrings.LTR
    - typingsJapgolly.fbjs.fbjsStrings.RTL
    - typingsJapgolly.fbjs.fbjsStrings.NEUTRAL
  */
  trait BidiDirection extends StObject
  object BidiDirection {
    
    inline def LTR: typingsJapgolly.fbjs.fbjsStrings.LTR = "LTR".asInstanceOf[typingsJapgolly.fbjs.fbjsStrings.LTR]
    
    inline def NEUTRAL: typingsJapgolly.fbjs.fbjsStrings.NEUTRAL = "NEUTRAL".asInstanceOf[typingsJapgolly.fbjs.fbjsStrings.NEUTRAL]
    
    inline def RTL: typingsJapgolly.fbjs.fbjsStrings.RTL = "RTL".asInstanceOf[typingsJapgolly.fbjs.fbjsStrings.RTL]
  }
  
  trait UnicodeBidiService extends StObject {
    
    var _defaultDir: BidiDirection
    
    var _lastDir: BidiDirection
    
    /**
      * Returns the direction of a block of text, and remembers it as the
      * fall-back direction for the next paragraph.
      *
      * @param str  A text block, e.g. paragraph, table cell, tag
      * @return     The resolved direction
      */
    def getDirection(str: String): BidiDirection
    
    /**
      * Reset the internal state
      *
      * Instead of creating a new instance, you can just reset() your instance
      * everytime you start a new loop.
      */
    def reset(): Unit
  }
  object UnicodeBidiService {
    
    inline def apply(
      _defaultDir: BidiDirection,
      _lastDir: BidiDirection,
      getDirection: String => BidiDirection,
      reset: Callback
    ): UnicodeBidiService = {
      val __obj = js.Dynamic.literal(_defaultDir = _defaultDir.asInstanceOf[js.Any], _lastDir = _lastDir.asInstanceOf[js.Any], getDirection = js.Any.fromFunction1(getDirection), reset = reset.toJsFn)
      __obj.asInstanceOf[UnicodeBidiService]
    }
    
    extension [Self <: UnicodeBidiService](x: Self) {
      
      inline def setGetDirection(value: String => BidiDirection): Self = StObject.set(x, "getDirection", js.Any.fromFunction1(value))
      
      inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
      
      inline def set_defaultDir(value: BidiDirection): Self = StObject.set(x, "_defaultDir", value.asInstanceOf[js.Any])
      
      inline def set_lastDir(value: BidiDirection): Self = StObject.set(x, "_lastDir", value.asInstanceOf[js.Any])
    }
  }
}
