package typingsJapgolly.rdfjsFetch

import typingsJapgolly.rdfjsFetch.anon.PartialFormatsInit
import typingsJapgolly.rdfjsFetchLite.mod.DatasetResponse
import typingsJapgolly.rdfjsFetchLite.mod.FactoryInit
import typingsJapgolly.rdfjsFetchLite.mod.RdfFetchResponse
import typingsJapgolly.rdfjsTypes.dataModelMod.BaseQuad
import typingsJapgolly.rdfjsTypes.dataModelMod.Quad
import typingsJapgolly.rdfjsTypes.datasetMod.DatasetCore
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@rdfjs/fetch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(url: String): js.Promise[RdfFetchResponse[Quad]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RdfFetchResponse[Quad]]]
  inline def default(url: String, options: PartialFormatsInit): js.Promise[RdfFetchResponse[Quad]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[RdfFetchResponse[Quad]]]
  inline def default[D /* <: DatasetCore[OutQuad, InQuad] */, OutQuad /* <: BaseQuad */, InQuad /* <: BaseQuad */](url: String, options: Partial[FactoryInit[D, OutQuad, InQuad]]): js.Promise[DatasetResponse[D, OutQuad, InQuad]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DatasetResponse[D, OutQuad, InQuad]]]
  
  @JSImport("@rdfjs/fetch", "Headers")
  @js.native
  val Headers: org.scalajs.dom.Headers = js.native
  
  inline def default_DOutQuadInQuad[D /* <: DatasetCore[OutQuad, InQuad] */, OutQuad /* <: BaseQuad */, InQuad /* <: BaseQuad */](url: String): js.Promise[DatasetResponse[D, OutQuad, InQuad]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DatasetResponse[D, OutQuad, InQuad]]]
}
