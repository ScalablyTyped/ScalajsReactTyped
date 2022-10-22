package typingsJapgolly.sucrase

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTransformersTransformerMod {
  
  /* note: abstract class */ @JSImport("sucrase/dist/types/transformers/Transformer", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Transformer {
    
    /* CompleteClass */
    override def getHoistedCode(): String = js.native
    
    /* CompleteClass */
    override def getPrefixCode(): String = js.native
    
    /* CompleteClass */
    override def getSuffixCode(): String = js.native
    
    /* CompleteClass */
    override def process(): Boolean = js.native
  }
  
  trait Transformer extends StObject {
    
    def getHoistedCode(): String
    
    def getPrefixCode(): String
    
    def getSuffixCode(): String
    
    def process(): Boolean
  }
  object Transformer {
    
    inline def apply(
      getHoistedCode: CallbackTo[String],
      getPrefixCode: CallbackTo[String],
      getSuffixCode: CallbackTo[String],
      process: CallbackTo[Boolean]
    ): Transformer = {
      val __obj = js.Dynamic.literal(getHoistedCode = getHoistedCode.toJsFn, getPrefixCode = getPrefixCode.toJsFn, getSuffixCode = getSuffixCode.toJsFn, process = process.toJsFn)
      __obj.asInstanceOf[Transformer]
    }
    
    extension [Self <: Transformer](x: Self) {
      
      inline def setGetHoistedCode(value: CallbackTo[String]): Self = StObject.set(x, "getHoistedCode", value.toJsFn)
      
      inline def setGetPrefixCode(value: CallbackTo[String]): Self = StObject.set(x, "getPrefixCode", value.toJsFn)
      
      inline def setGetSuffixCode(value: CallbackTo[String]): Self = StObject.set(x, "getSuffixCode", value.toJsFn)
      
      inline def setProcess(value: CallbackTo[Boolean]): Self = StObject.set(x, "process", value.toJsFn)
    }
  }
}
