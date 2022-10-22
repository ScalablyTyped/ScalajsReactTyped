package typingsJapgolly.lesgo

import typingsJapgolly.awsLambda.triggerSqsMod.SQSEvent
import typingsJapgolly.awsLambda.triggerSqsMod.SQSRecord
import typingsJapgolly.lesgo.anon.PickSQSRecordmessageIdrec
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object middlewaresNormalizeSQSMessageMiddlewareMod {
  
  @JSImport("lesgo/middlewares/normalizeSQSMessageMiddleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): NormalizeSQSMiddleware = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[NormalizeSQSMiddleware]
  
  inline def normalizeHandler(records: js.Array[SQSRecord]): js.Array[Record[String, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeHandler")(records.asInstanceOf[js.Any]).asInstanceOf[js.Array[Record[String, Any]]]
  
  trait NormalizeSQSMiddleware extends StObject {
    
    var before: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify middy.MiddlewareFunction<SQSEventWithCollection, any> */ Any
  }
  object NormalizeSQSMiddleware {
    
    inline def apply(
      before: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify middy.MiddlewareFunction<SQSEventWithCollection, any> */ Any
    ): NormalizeSQSMiddleware = {
      val __obj = js.Dynamic.literal(before = before.asInstanceOf[js.Any])
      __obj.asInstanceOf[NormalizeSQSMiddleware]
    }
    
    extension [Self <: NormalizeSQSMiddleware](x: Self) {
      
      inline def setBefore(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify middy.MiddlewareFunction<SQSEventWithCollection, any> */ Any
      ): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    }
  }
  
  trait SQSEventWithCollection
    extends StObject
       with SQSEvent {
    
    var collection: js.UndefOr[PickSQSRecordmessageIdrec & (Record[String, Any])] = js.undefined
  }
  object SQSEventWithCollection {
    
    inline def apply(Records: js.Array[SQSRecord]): SQSEventWithCollection = {
      val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any])
      __obj.asInstanceOf[SQSEventWithCollection]
    }
    
    extension [Self <: SQSEventWithCollection](x: Self) {
      
      inline def setCollection(value: PickSQSRecordmessageIdrec & (Record[String, Any])): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
      
      inline def setCollectionUndefined: Self = StObject.set(x, "collection", js.undefined)
    }
  }
}
