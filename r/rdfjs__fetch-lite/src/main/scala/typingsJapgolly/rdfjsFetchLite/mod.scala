package typingsJapgolly.rdfjsFetchLite

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Blob
import org.scalajs.dom.FormData
import org.scalajs.dom.ResponseType
import typingsJapgolly.rdfjsFetchLite.anon.FnCall
import typingsJapgolly.rdfjsFetchLite.anon.Typeofformats
import typingsJapgolly.rdfjsTypes.dataModelMod.BaseQuad
import typingsJapgolly.rdfjsTypes.dataModelMod.Quad
import typingsJapgolly.rdfjsTypes.datasetMod.DatasetCore
import typingsJapgolly.rdfjsTypes.datasetMod.DatasetCoreFactory
import typingsJapgolly.rdfjsTypes.streamMod.Stream
import typingsJapgolly.std.RequestInit
import typingsJapgolly.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@rdfjs/fetch-lite", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(url: String, options: FormatsInit): js.Promise[RdfFetchResponse[Quad]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[RdfFetchResponse[Quad]]]
  inline def default[D /* <: DatasetCore[OutQuad, InQuad] */, OutQuad /* <: BaseQuad */, InQuad /* <: BaseQuad */](url: String, options: FactoryInit[D, OutQuad, InQuad]): js.Promise[DatasetResponse[D, OutQuad, InQuad]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DatasetResponse[D, OutQuad, InQuad]]]
  
  @JSImport("@rdfjs/fetch-lite", "Headers")
  @js.native
  val Headers: org.scalajs.dom.Headers = js.native
  
  trait DatasetResponse[D /* <: DatasetCore[OutQuad, InQuad] */, OutQuad /* <: BaseQuad */, InQuad /* <: BaseQuad */]
    extends StObject
       with RdfFetchResponse[OutQuad] {
    
    def dataset(): js.Promise[D]
  }
  object DatasetResponse {
    
    inline def apply[D /* <: DatasetCore[OutQuad, InQuad] */, OutQuad /* <: BaseQuad */, InQuad /* <: BaseQuad */](
      arrayBuffer: CallbackTo[js.Promise[js.typedarray.ArrayBuffer]],
      blob: CallbackTo[js.Promise[Blob]],
      bodyUsed: Boolean,
      dataset: CallbackTo[js.Promise[D]],
      formData: CallbackTo[js.Promise[FormData]],
      headers: org.scalajs.dom.Headers,
      json: CallbackTo[js.Promise[Any]],
      ok: Boolean,
      quadStream: CallbackTo[js.Promise[Stream[OutQuad]]],
      redirected: Boolean,
      status: Double,
      statusText: String,
      text: CallbackTo[js.Promise[String]],
      `type`: ResponseType,
      url: String
    ): DatasetResponse[D, OutQuad, InQuad] = {
      val __obj = js.Dynamic.literal(arrayBuffer = arrayBuffer.toJsFn, blob = blob.toJsFn, bodyUsed = bodyUsed.asInstanceOf[js.Any], dataset = dataset.toJsFn, formData = formData.toJsFn, headers = headers.asInstanceOf[js.Any], json = json.toJsFn, ok = ok.asInstanceOf[js.Any], quadStream = quadStream.toJsFn, redirected = redirected.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], text = text.toJsFn, url = url.asInstanceOf[js.Any], body = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DatasetResponse[D, OutQuad, InQuad]]
    }
    
    extension [Self <: DatasetResponse[?, ?, ?], D /* <: DatasetCore[OutQuad, InQuad] */, OutQuad /* <: BaseQuad */, InQuad /* <: BaseQuad */](x: Self & (DatasetResponse[D, OutQuad, InQuad])) {
      
      inline def setDataset(value: CallbackTo[js.Promise[D]]): Self = StObject.set(x, "dataset", value.toJsFn)
    }
  }
  
  trait FactoryInit[D /* <: DatasetCore[OutQuad, InQuad] */, OutQuad /* <: BaseQuad */, InQuad /* <: BaseQuad */]
    extends StObject
       with FormatsInit {
    
    var factory: DatasetCoreFactory[OutQuad, InQuad, D]
  }
  object FactoryInit {
    
    inline def apply[D /* <: DatasetCore[OutQuad, InQuad] */, OutQuad /* <: BaseQuad */, InQuad /* <: BaseQuad */](factory: DatasetCoreFactory[OutQuad, InQuad, D], formats: Typeofformats): FactoryInit[D, OutQuad, InQuad] = {
      val __obj = js.Dynamic.literal(factory = factory.asInstanceOf[js.Any], formats = formats.asInstanceOf[js.Any])
      __obj.asInstanceOf[FactoryInit[D, OutQuad, InQuad]]
    }
    
    extension [Self <: FactoryInit[?, ?, ?], D /* <: DatasetCore[OutQuad, InQuad] */, OutQuad /* <: BaseQuad */, InQuad /* <: BaseQuad */](x: Self & (FactoryInit[D, OutQuad, InQuad])) {
      
      inline def setFactory(value: DatasetCoreFactory[OutQuad, InQuad, D]): Self = StObject.set(x, "factory", value.asInstanceOf[js.Any])
    }
  }
  
  trait FormatsInit
    extends StObject
       with RequestInit {
    
    var fetch: js.UndefOr[FnCall] = js.undefined
    
    var formats: Typeofformats
  }
  object FormatsInit {
    
    inline def apply(formats: Typeofformats): FormatsInit = {
      val __obj = js.Dynamic.literal(formats = formats.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormatsInit]
    }
    
    extension [Self <: FormatsInit](x: Self) {
      
      inline def setFetch(value: FnCall): Self = StObject.set(x, "fetch", value.asInstanceOf[js.Any])
      
      inline def setFetchUndefined: Self = StObject.set(x, "fetch", js.undefined)
      
      inline def setFormats(value: Typeofformats): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
    }
  }
  
  trait RdfFetchResponse[Q /* <: BaseQuad */]
    extends StObject
       with Response {
    
    def quadStream(): js.Promise[Stream[Q]]
  }
  object RdfFetchResponse {
    
    inline def apply[Q /* <: BaseQuad */](
      arrayBuffer: CallbackTo[js.Promise[js.typedarray.ArrayBuffer]],
      blob: CallbackTo[js.Promise[Blob]],
      bodyUsed: Boolean,
      formData: CallbackTo[js.Promise[FormData]],
      headers: org.scalajs.dom.Headers,
      json: CallbackTo[js.Promise[Any]],
      ok: Boolean,
      quadStream: CallbackTo[js.Promise[Stream[Q]]],
      redirected: Boolean,
      status: Double,
      statusText: String,
      text: CallbackTo[js.Promise[String]],
      `type`: ResponseType,
      url: String
    ): RdfFetchResponse[Q] = {
      val __obj = js.Dynamic.literal(arrayBuffer = arrayBuffer.toJsFn, blob = blob.toJsFn, bodyUsed = bodyUsed.asInstanceOf[js.Any], formData = formData.toJsFn, headers = headers.asInstanceOf[js.Any], json = json.toJsFn, ok = ok.asInstanceOf[js.Any], quadStream = quadStream.toJsFn, redirected = redirected.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], text = text.toJsFn, url = url.asInstanceOf[js.Any], body = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RdfFetchResponse[Q]]
    }
    
    extension [Self <: RdfFetchResponse[?], Q /* <: BaseQuad */](x: Self & RdfFetchResponse[Q]) {
      
      inline def setQuadStream(value: CallbackTo[js.Promise[Stream[Q]]]): Self = StObject.set(x, "quadStream", value.toJsFn)
    }
  }
}
