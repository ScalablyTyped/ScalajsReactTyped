package typingsJapgolly.dotdotdot

import japgolly.scalajs.react.Callback
import typingsJapgolly.dotdotdot.dotdotdotStrings.window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JQueryDotDotDot {
  
  trait IDotDotDotOptions extends StObject {
    
    /** jQuery-selector for the element to keep and put after the ellipsis.
      * Default: null
      */
    var after: js.UndefOr[String | JQuery] = js.undefined
    
    //
    /** Callback function that is fired after the ellipsis is added,
      * receives two parameters:
      * @param isTruncated (boolean)
      * @param orgContent (string) Documentation says it is string but it is object
      *        which has e.g.
      *                 context: HTMLHtmlElement;
      *                 length: number; // seems to be always 1
      *                 [index] // this contains the text: orgContent[0].data
      */
    var callback: js.UndefOr[js.Function2[/* isTruncated */ Boolean, /* orgContent */ Any, Unit]] = js.undefined
    
    /**    The text to add as ellipsis.
      * Default: '... '
      */
    var ellipsis: js.UndefOr[String] = js.undefined
    
    /** Wrap-option fallback to 'letter' for long words
      * Default: true
      */
    var fallbackToLetter: js.UndefOr[Boolean] = js.undefined
    
    /** Optionally set a max-height, if null, the height will be measured.
      * Default: null
      */
    var height: js.UndefOr[Double] = js.undefined
    
    var lastCharacter: js.UndefOr[IDotDotDotOptionsLastCharacter] = js.undefined
    
    /** Deviation for the height-option.
      * Default: 0
      */
    var tolerance: js.UndefOr[Double] = js.undefined
    
    /** Whether to update the ellipsis: true/'window'
      * Default: false
      */
    var watch: js.UndefOr[Boolean | window] = js.undefined
    
    /** How to cut off the text/html: 'word'/'letter'/'children'
      * Default: 'word'
      */
    var wrap: js.UndefOr[String] = js.undefined
  }
  object IDotDotDotOptions {
    
    inline def apply(): IDotDotDotOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDotDotDotOptions]
    }
    
    extension [Self <: IDotDotDotOptions](x: Self) {
      
      inline def setAfter(value: String | JQuery): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      inline def setCallback(value: (/* isTruncated */ Boolean, /* orgContent */ Any) => Callback): Self = StObject.set(x, "callback", js.Any.fromFunction2((t0: /* isTruncated */ Boolean, t1: /* orgContent */ Any) => (value(t0, t1)).runNow()))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setEllipsis(value: String): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
      
      inline def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
      
      inline def setFallbackToLetter(value: Boolean): Self = StObject.set(x, "fallbackToLetter", value.asInstanceOf[js.Any])
      
      inline def setFallbackToLetterUndefined: Self = StObject.set(x, "fallbackToLetter", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setLastCharacter(value: IDotDotDotOptionsLastCharacter): Self = StObject.set(x, "lastCharacter", value.asInstanceOf[js.Any])
      
      inline def setLastCharacterUndefined: Self = StObject.set(x, "lastCharacter", js.undefined)
      
      inline def setTolerance(value: Double): Self = StObject.set(x, "tolerance", value.asInstanceOf[js.Any])
      
      inline def setToleranceUndefined: Self = StObject.set(x, "tolerance", js.undefined)
      
      inline def setWatch(value: Boolean | window): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
      
      inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
      
      inline def setWrap(value: String): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  trait IDotDotDotOptionsLastCharacter extends StObject {
    
    /** Don't add an ellipsis if this array contains
      * the last character of the truncated text.
      * Default:  []
      */
    var noEllipsis: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Remove these characters from the end of the truncated text.
      * Default: [' ', ',', ';', '.', '!', '?']
      */
    var remove: js.UndefOr[js.Array[String]] = js.undefined
  }
  object IDotDotDotOptionsLastCharacter {
    
    inline def apply(): IDotDotDotOptionsLastCharacter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDotDotDotOptionsLastCharacter]
    }
    
    extension [Self <: IDotDotDotOptionsLastCharacter](x: Self) {
      
      inline def setNoEllipsis(value: js.Array[String]): Self = StObject.set(x, "noEllipsis", value.asInstanceOf[js.Any])
      
      inline def setNoEllipsisUndefined: Self = StObject.set(x, "noEllipsis", js.undefined)
      
      inline def setNoEllipsisVarargs(value: String*): Self = StObject.set(x, "noEllipsis", js.Array(value*))
      
      inline def setRemove(value: js.Array[String]): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
      
      inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
      
      inline def setRemoveVarargs(value: String*): Self = StObject.set(x, "remove", js.Array(value*))
    }
  }
}
