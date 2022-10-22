package typingsJapgolly.uuidBrowser

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfacesMod {
  
  type InputBuffer = ArrayLike[Double]
  
  type OutputBuffer = ArrayLike[Double]
  
  trait V1Options extends StObject {
    
    var clockseq: js.UndefOr[Double] = js.undefined
    
    var msecs: js.UndefOr[Double | js.Date] = js.undefined
    
    var node: js.UndefOr[InputBuffer] = js.undefined
    
    var nsecs: js.UndefOr[Double] = js.undefined
  }
  object V1Options {
    
    inline def apply(): V1Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[V1Options]
    }
    
    extension [Self <: V1Options](x: Self) {
      
      inline def setClockseq(value: Double): Self = StObject.set(x, "clockseq", value.asInstanceOf[js.Any])
      
      inline def setClockseqUndefined: Self = StObject.set(x, "clockseq", js.undefined)
      
      inline def setMsecs(value: Double | js.Date): Self = StObject.set(x, "msecs", value.asInstanceOf[js.Any])
      
      inline def setMsecsUndefined: Self = StObject.set(x, "msecs", js.undefined)
      
      inline def setNode(value: InputBuffer): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
      
      inline def setNsecs(value: Double): Self = StObject.set(x, "nsecs", value.asInstanceOf[js.Any])
      
      inline def setNsecsUndefined: Self = StObject.set(x, "nsecs", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.uuidBrowser.anon.Random
    - typingsJapgolly.uuidBrowser.anon.Rng
  */
  trait V4Options extends StObject
  object V4Options {
    
    inline def Random(random: InputBuffer): typingsJapgolly.uuidBrowser.anon.Random = {
      val __obj = js.Dynamic.literal(random = random.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.uuidBrowser.anon.Random]
    }
    
    inline def Rng(rng: CallbackTo[InputBuffer]): typingsJapgolly.uuidBrowser.anon.Rng = {
      val __obj = js.Dynamic.literal(rng = rng.toJsFn)
      __obj.asInstanceOf[typingsJapgolly.uuidBrowser.anon.Rng]
    }
  }
  
  @js.native
  trait v1
    extends v1Buffer
       with v1String {
    
    /* InferMemberOverrides */
    override def apply(arg1: /* options */ js.UndefOr[V1Options]): String = js.native
    /* InferMemberOverrides */
    override def apply(
      arg1: /* options */ js.UndefOr[V1Options | Null],
      arg2: /* buffer */ OutputBuffer,
      arg3: /* offset */ js.UndefOr[Double]
    ): OutputBuffer = js.native
  }
  
  type v1Buffer = js.Function3[
    /* options */ js.UndefOr[V1Options | Null], 
    /* buffer */ OutputBuffer, 
    /* offset */ js.UndefOr[Double], 
    OutputBuffer
  ]
  
  type v1String = js.Function1[/* options */ js.UndefOr[V1Options], String]
  
  @js.native
  trait v4
    extends v4Buffer
       with v4String {
    
    /* InferMemberOverrides */
    override def apply(arg1: /* options */ js.UndefOr[V4Options]): String = js.native
    /* InferMemberOverrides */
    override def apply(
      arg1: /* options */ js.UndefOr[V4Options | Null],
      arg2: /* buffer */ OutputBuffer,
      arg3: /* offset */ js.UndefOr[Double]
    ): OutputBuffer = js.native
  }
  
  type v4Buffer = js.Function3[
    /* options */ js.UndefOr[V4Options | Null], 
    /* buffer */ OutputBuffer, 
    /* offset */ js.UndefOr[Double], 
    OutputBuffer
  ]
  
  type v4String = js.Function1[/* options */ js.UndefOr[V4Options], String]
  
  @js.native
  trait v5
    extends v5Buffer
       with v5String {
    
    /* InferMemberOverrides */
    override def apply(arg1: /* name */ String | InputBuffer, arg2: /* namespace */ String | InputBuffer): String = js.native
    /* InferMemberOverrides */
    override def apply(
      arg1: /* name */ String | InputBuffer,
      arg2: /* namespace */ String | InputBuffer,
      arg3: /* buffer */ OutputBuffer,
      arg4: /* offset */ js.UndefOr[Double]
    ): OutputBuffer = js.native
  }
  
  type v5Buffer = js.Function4[
    /* name */ String | InputBuffer, 
    /* namespace */ String | InputBuffer, 
    /* buffer */ OutputBuffer, 
    /* offset */ js.UndefOr[Double], 
    OutputBuffer
  ]
  
  type v5String = js.Function2[/* name */ String | InputBuffer, /* namespace */ String | InputBuffer, String]
}
