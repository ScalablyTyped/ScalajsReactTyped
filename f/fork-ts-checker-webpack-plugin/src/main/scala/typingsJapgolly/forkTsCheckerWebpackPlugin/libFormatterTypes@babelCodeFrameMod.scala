package typingsJapgolly.forkTsCheckerWebpackPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object `libFormatterTypes@babelCodeFrameMod` {
  
  trait BabelCodeFrameOptions extends StObject {
    
    /**
      * Forcibly syntax highlight the code as JavaScript (for non-terminals);
      * overrides highlightCode.
      * default: false
      */
    var forceColor: js.UndefOr[Boolean] = js.undefined
    
    /** Syntax highlight the code as JavaScript for terminals. default: false */
    var highlightCode: js.UndefOr[Boolean] = js.undefined
    
    /**  The number of lines to show above the error. default: 2 */
    var linesAbove: js.UndefOr[Double] = js.undefined
    
    /**  The number of lines to show below the error. default: 3 */
    var linesBelow: js.UndefOr[Double] = js.undefined
    
    /**
      * Pass in a string to be displayed inline (if possible) next to the
      * highlighted location in the code. If it can't be positioned inline,
      * it will be placed above the code frame.
      * default: nothing
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object BabelCodeFrameOptions {
    
    inline def apply(): BabelCodeFrameOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BabelCodeFrameOptions]
    }
    
    extension [Self <: BabelCodeFrameOptions](x: Self) {
      
      inline def setForceColor(value: Boolean): Self = StObject.set(x, "forceColor", value.asInstanceOf[js.Any])
      
      inline def setForceColorUndefined: Self = StObject.set(x, "forceColor", js.undefined)
      
      inline def setHighlightCode(value: Boolean): Self = StObject.set(x, "highlightCode", value.asInstanceOf[js.Any])
      
      inline def setHighlightCodeUndefined: Self = StObject.set(x, "highlightCode", js.undefined)
      
      inline def setLinesAbove(value: Double): Self = StObject.set(x, "linesAbove", value.asInstanceOf[js.Any])
      
      inline def setLinesAboveUndefined: Self = StObject.set(x, "linesAbove", js.undefined)
      
      inline def setLinesBelow(value: Double): Self = StObject.set(x, "linesBelow", value.asInstanceOf[js.Any])
      
      inline def setLinesBelowUndefined: Self = StObject.set(x, "linesBelow", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
