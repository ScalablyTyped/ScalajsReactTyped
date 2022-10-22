package typingsJapgolly.tensorflowModelsUniversalSentenceEncoder

import typingsJapgolly.tensorflowTfjsConverter.mod.GraphModel
import typingsJapgolly.tensorflowTfjsCore.distIoTypesMod.IOHandler
import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUseQnaMod {
  
  @JSImport("@tensorflow-models/universal-sentence-encoder/dist/use_qna", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow-models/universal-sentence-encoder/dist/use_qna", "UniversalSentenceEncoderQnA")
  @js.native
  open class UniversalSentenceEncoderQnA () extends StObject {
    
    /**
      *
      * Returns a map of queryEmbedding and responseEmbedding
      *
      * @param input the ModelInput that contains queries and answers.
      */
    def embed(input: ModelInput): ModelOutput = js.native
    
    def load(): js.Promise[Unit] = js.native
    
    def loadModel(): js.Promise[GraphModel[String | IOHandler]] = js.native
    
    /* private */ var model: Any = js.native
    
    /* private */ var shiftTokens: Any = js.native
    
    /* private */ var tokenizeStrings: Any = js.native
    
    /* private */ var tokenizer: Any = js.native
  }
  
  inline def loadQnA(): js.Promise[UniversalSentenceEncoderQnA] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadQnA")().asInstanceOf[js.Promise[UniversalSentenceEncoderQnA]]
  
  @JSImport("@tensorflow-models/universal-sentence-encoder/dist/use_qna", "version")
  @js.native
  val version: /* "1.3.3" */ String = js.native
  
  trait ModelInput extends StObject {
    
    var contexts: js.UndefOr[js.Array[String]] = js.undefined
    
    var queries: js.Array[String]
    
    var responses: js.Array[String]
  }
  object ModelInput {
    
    inline def apply(queries: js.Array[String], responses: js.Array[String]): ModelInput = {
      val __obj = js.Dynamic.literal(queries = queries.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModelInput]
    }
    
    extension [Self <: ModelInput](x: Self) {
      
      inline def setContexts(value: js.Array[String]): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
      
      inline def setContextsUndefined: Self = StObject.set(x, "contexts", js.undefined)
      
      inline def setContextsVarargs(value: String*): Self = StObject.set(x, "contexts", js.Array(value*))
      
      inline def setQueries(value: js.Array[String]): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
      
      inline def setQueriesVarargs(value: String*): Self = StObject.set(x, "queries", js.Array(value*))
      
      inline def setResponses(value: js.Array[String]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
      
      inline def setResponsesVarargs(value: String*): Self = StObject.set(x, "responses", js.Array(value*))
    }
  }
  
  trait ModelOutput extends StObject {
    
    var queryEmbedding: Tensor[Rank]
    
    var responseEmbedding: Tensor[Rank]
  }
  object ModelOutput {
    
    inline def apply(queryEmbedding: Tensor[Rank], responseEmbedding: Tensor[Rank]): ModelOutput = {
      val __obj = js.Dynamic.literal(queryEmbedding = queryEmbedding.asInstanceOf[js.Any], responseEmbedding = responseEmbedding.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModelOutput]
    }
    
    extension [Self <: ModelOutput](x: Self) {
      
      inline def setQueryEmbedding(value: Tensor[Rank]): Self = StObject.set(x, "queryEmbedding", value.asInstanceOf[js.Any])
      
      inline def setResponseEmbedding(value: Tensor[Rank]): Self = StObject.set(x, "responseEmbedding", value.asInstanceOf[js.Any])
    }
  }
}
