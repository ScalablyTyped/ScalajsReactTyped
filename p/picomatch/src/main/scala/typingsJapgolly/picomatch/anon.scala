package typingsJapgolly.picomatch

import typingsJapgolly.picomatch.picomatchStrings.Asterisk
import typingsJapgolly.picomatch.picomatchStrings.AsteriskAsterisk
import typingsJapgolly.picomatch.picomatchStrings.`0-9`
import typingsJapgolly.picomatch.picomatchStrings.`A-Fa-f0-9`
import typingsJapgolly.picomatch.picomatchStrings.`A-Z`
import typingsJapgolly.picomatch.picomatchStrings.`A-Za-z0-9_`
import typingsJapgolly.picomatch.picomatchStrings.`a-zA-Z0-9`
import typingsJapgolly.picomatch.picomatchStrings.`a-zA-Z`
import typingsJapgolly.picomatch.picomatchStrings.`a-z_`
import typingsJapgolly.std.RegExpExecArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Alnum extends StObject {
    
    var alnum: `a-zA-Z0-9`
    
    var alpha: `a-zA-Z`
    
    var ascii: /* \x00-\x7F */ String
    
    var blank: /*  \t */ String
    
    var cntrl: /* \x00-\x1F\x7F */ String
    
    var digit: `0-9`
    
    var graph: /* \x21-\x7E */ String
    
    var lower: `a-z_`
    
    var print: /* \x20-\x7E  */ String
    
    var punct: /* \-!"#$%&'()\*+,./:;<=>?@[\]^_`{|}~ */ String
    
    var space: /*  \t\r\n\v\f */ String
    
    var upper: `A-Z`
    
    var word: `A-Za-z0-9_`
    
    var xdigit: `A-Fa-f0-9`
  }
  object Alnum {
    
    inline def apply(): Alnum = {
      val __obj = js.Dynamic.literal(alnum = "a-zA-Z0-9", alpha = "a-zA-Z", ascii = "\\x00-\\x7F", blank = " \\t", cntrl = "\\x00-\\x1F\\x7F", digit = "0-9", graph = "\\x21-\\x7E", lower = "a-z", print = "\\x20-\\x7E ", punct = "\\-!\"#$%&'()\\*+,./:;<=>?@[\\]^_`{|}~", space = " \\t\\r\\n\\v\\f", upper = "A-Z", word = "A-Za-z0-9_", xdigit = "A-Fa-f0-9")
      __obj.asInstanceOf[Alnum]
    }
    
    extension [Self <: Alnum](x: Self) {
      
      inline def setAlnum(value: `a-zA-Z0-9`): Self = StObject.set(x, "alnum", value.asInstanceOf[js.Any])
      
      inline def setAlpha(value: `a-zA-Z`): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAscii(value: /* \x00-\x7F */ String): Self = StObject.set(x, "ascii", value.asInstanceOf[js.Any])
      
      inline def setBlank(value: /*  \t */ String): Self = StObject.set(x, "blank", value.asInstanceOf[js.Any])
      
      inline def setCntrl(value: /* \x00-\x1F\x7F */ String): Self = StObject.set(x, "cntrl", value.asInstanceOf[js.Any])
      
      inline def setDigit(value: `0-9`): Self = StObject.set(x, "digit", value.asInstanceOf[js.Any])
      
      inline def setGraph(value: /* \x21-\x7E */ String): Self = StObject.set(x, "graph", value.asInstanceOf[js.Any])
      
      inline def setLower(value: `a-z_`): Self = StObject.set(x, "lower", value.asInstanceOf[js.Any])
      
      inline def setPrint(value: /* \x20-\x7E  */ String): Self = StObject.set(x, "print", value.asInstanceOf[js.Any])
      
      inline def setPunct(value: /* \-!"#$%&'()\*+,./:;<=>?@[\]^_`{|}~ */ String): Self = StObject.set(x, "punct", value.asInstanceOf[js.Any])
      
      inline def setSpace(value: /*  \t\r\n\v\f */ String): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
      
      inline def setUpper(value: `A-Z`): Self = StObject.set(x, "upper", value.asInstanceOf[js.Any])
      
      inline def setWord(value: `A-Za-z0-9_`): Self = StObject.set(x, "word", value.asInstanceOf[js.Any])
      
      inline def setXdigit(value: `A-Fa-f0-9`): Self = StObject.set(x, "xdigit", value.asInstanceOf[js.Any])
    }
  }
  
  trait Close extends StObject {
    
    var close: String
    
    var open: String
    
    var `type`: String
  }
  object Close {
    
    inline def apply(close: String, open: String, `type`: String): Close = {
      val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Close]
    }
    
    extension [Self <: Close](x: Self) {
      
      inline def setClose(value: String): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setOpen(value: String): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait IsMatch extends StObject {
    
    var isMatch: Boolean
    
    var `match`: js.UndefOr[Boolean | RegExpExecArray | Null] = js.undefined
    
    var output: String
  }
  object IsMatch {
    
    inline def apply(isMatch: Boolean, output: String): IsMatch = {
      val __obj = js.Dynamic.literal(isMatch = isMatch.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsMatch]
    }
    
    extension [Self <: IsMatch](x: Self) {
      
      inline def setIsMatch(value: Boolean): Self = StObject.set(x, "isMatch", value.asInstanceOf[js.Any])
      
      inline def setMatch(value: Boolean | RegExpExecArray): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      inline def setMatchNull: Self = StObject.set(x, "match", null)
      
      inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
      
      inline def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    }
  }
  
  trait MaxLength extends StObject {
    
    var maxLength: js.UndefOr[Double] = js.undefined
  }
  object MaxLength {
    
    inline def apply(): MaxLength = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaxLength]
    }
    
    extension [Self <: MaxLength](x: Self) {
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    }
  }
  
  trait STAR extends StObject {
    
    var STAR: String
  }
  object STAR {
    
    inline def apply(STAR: String): STAR = {
      val __obj = js.Dynamic.literal(STAR = STAR.asInstanceOf[js.Any])
      __obj.asInstanceOf[STAR]
    }
    
    extension [Self <: STAR](x: Self) {
      
      inline def setSTAR(value: String): Self = StObject.set(x, "STAR", value.asInstanceOf[js.Any])
    }
  }
  
  trait _empty extends StObject {
    
    @JSName("***")
    var AsteriskAsteriskAsterisk: Asterisk
    
    @JSName("**/**")
    var AsteriskAsteriskSlashAsteriskAsterisk: AsteriskAsterisk
    
    @JSName("**/**/**")
    var AsteriskAsteriskSlashAsteriskAsteriskSlashAsteriskAsterisk: AsteriskAsterisk
  }
  object _empty {
    
    inline def apply(): _empty = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("***")("*")
      __obj.updateDynamic("**/**")("**")
      __obj.updateDynamic("**/**/**")("**")
      __obj.asInstanceOf[_empty]
    }
    
    extension [Self <: _empty](x: Self) {
      
      inline def setAsteriskAsteriskAsterisk(value: Asterisk): Self = StObject.set(x, "***", value.asInstanceOf[js.Any])
      
      inline def setAsteriskAsteriskSlashAsteriskAsterisk(value: AsteriskAsterisk): Self = StObject.set(x, "**/**", value.asInstanceOf[js.Any])
      
      inline def setAsteriskAsteriskSlashAsteriskAsteriskSlashAsteriskAsterisk(value: AsteriskAsterisk): Self = StObject.set(x, "**/**/**", value.asInstanceOf[js.Any])
    }
  }
}
