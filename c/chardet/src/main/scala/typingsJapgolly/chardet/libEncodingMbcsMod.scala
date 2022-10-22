package typingsJapgolly.chardet

import japgolly.scalajs.react.Callback
import typingsJapgolly.chardet.libEncodingMod.Context
import typingsJapgolly.chardet.libEncodingMod.Recogniser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEncodingMbcsMod {
  
  @JSImport("chardet/lib/encoding/mbcs", "big5")
  @js.native
  open class big5 ()
    extends StObject
       with mbcs {
    
    @JSName("language")
    def language_Mbig5(): String = js.native
  }
  
  @JSImport("chardet/lib/encoding/mbcs", "euc_jp")
  @js.native
  open class eucJp ()
    extends StObject
       with mbcs {
    
    @JSName("language")
    def language_MeucJp(): String = js.native
    
    @JSName("nextChar")
    var nextChar_Original: js.Function2[/* iter */ IteratedChar, /* det */ Context, Boolean] = js.native
  }
  
  @JSImport("chardet/lib/encoding/mbcs", "euc_kr")
  @js.native
  open class eucKr ()
    extends StObject
       with mbcs {
    
    @JSName("language")
    def language_MeucKr(): String = js.native
    
    @JSName("nextChar")
    var nextChar_Original: js.Function2[/* iter */ IteratedChar, /* det */ Context, Boolean] = js.native
  }
  
  @JSImport("chardet/lib/encoding/mbcs", "gb_18030")
  @js.native
  open class gb18030 ()
    extends StObject
       with mbcs {
    
    @JSName("language")
    def language_Mgb18030(): String = js.native
  }
  
  @JSImport("chardet/lib/encoding/mbcs", "sjis")
  @js.native
  open class sjis ()
    extends StObject
       with mbcs {
    
    @JSName("language")
    def language_Msjis(): String = js.native
  }
  
  trait IteratedChar extends StObject {
    
    var charValue: Double
    
    var done: Boolean
    
    var error: Boolean
    
    var index: Double
    
    def nextByte(det: Context): Double
    
    var nextIndex: Double
    
    def reset(): Unit
  }
  object IteratedChar {
    
    inline def apply(
      charValue: Double,
      done: Boolean,
      error: Boolean,
      index: Double,
      nextByte: Context => Double,
      nextIndex: Double,
      reset: Callback
    ): IteratedChar = {
      val __obj = js.Dynamic.literal(charValue = charValue.asInstanceOf[js.Any], done = done.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], nextByte = js.Any.fromFunction1(nextByte), nextIndex = nextIndex.asInstanceOf[js.Any], reset = reset.toJsFn)
      __obj.asInstanceOf[IteratedChar]
    }
    
    extension [Self <: IteratedChar](x: Self) {
      
      inline def setCharValue(value: Double): Self = StObject.set(x, "charValue", value.asInstanceOf[js.Any])
      
      inline def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setNextByte(value: Context => Double): Self = StObject.set(x, "nextByte", js.Any.fromFunction1(value))
      
      inline def setNextIndex(value: Double): Self = StObject.set(x, "nextIndex", value.asInstanceOf[js.Any])
      
      inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
    }
  }
  
  @js.native
  trait mbcs
    extends StObject
       with Recogniser {
    
    var commonChars: js.Array[Double] = js.native
    
    def nextChar(iter: IteratedChar, det: Context): Boolean = js.native
  }
}
