package typingsJapgolly.d3Fetch

import org.scalajs.dom.Blob
import org.scalajs.dom.Document
import org.scalajs.dom.HTMLImageElement
import org.scalajs.dom.RequestInit
import typingsJapgolly.d3Dsv.mod.DSVParsedArray
import typingsJapgolly.d3Dsv.mod.DSVRowArray
import typingsJapgolly.d3Dsv.mod.DSVRowString
import typingsJapgolly.d3Fetch.anon.PartialHTMLImageElement
import typingsJapgolly.std.XMLDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("d3-fetch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def blob(url: String): js.Promise[Blob] = ^.asInstanceOf[js.Dynamic].applyDynamic("blob")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Blob]]
  inline def blob(url: String, init: RequestInit): js.Promise[Blob] = (^.asInstanceOf[js.Dynamic].applyDynamic("blob")(url.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Blob]]
  
  inline def buffer(url: String): js.Promise[js.typedarray.ArrayBuffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer]]
  inline def buffer(url: String, init: RequestInit): js.Promise[js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(url.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer]]
  
  inline def csv[Columns /* <: String */](url: String): js.Promise[DSVRowArray[Columns]] = ^.asInstanceOf[js.Dynamic].applyDynamic("csv")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DSVRowArray[Columns]]]
  inline def csv[Columns /* <: String */](url: String, init: RequestInit): js.Promise[DSVRowArray[Columns]] = (^.asInstanceOf[js.Dynamic].applyDynamic("csv")(url.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DSVRowArray[Columns]]]
  inline def csv[ParsedRow /* <: js.Object */, Columns /* <: String */](
    url: String,
    init: RequestInit,
    row: js.Function3[
      /* rawRow */ DSVRowString[Columns], 
      /* index */ Double, 
      /* columns */ js.Array[Columns], 
      js.UndefOr[ParsedRow | Null]
    ]
  ): js.Promise[DSVParsedArray[ParsedRow]] = (^.asInstanceOf[js.Dynamic].applyDynamic("csv")(url.asInstanceOf[js.Any], init.asInstanceOf[js.Any], row.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DSVParsedArray[ParsedRow]]]
  inline def csv[ParsedRow /* <: js.Object */, Columns /* <: String */](
    url: String,
    row: js.Function3[
      /* rawRow */ DSVRowString[Columns], 
      /* index */ Double, 
      /* columns */ js.Array[Columns], 
      js.UndefOr[ParsedRow | Null]
    ]
  ): js.Promise[DSVParsedArray[ParsedRow]] = (^.asInstanceOf[js.Dynamic].applyDynamic("csv")(url.asInstanceOf[js.Any], row.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DSVParsedArray[ParsedRow]]]
  
  inline def dsv[Columns /* <: String */](delimiter: String, url: String): js.Promise[DSVRowArray[Columns]] = (^.asInstanceOf[js.Dynamic].applyDynamic("dsv")(delimiter.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DSVRowArray[Columns]]]
  inline def dsv[Columns /* <: String */](delimiter: String, url: String, init: RequestInit): js.Promise[DSVRowArray[Columns]] = (^.asInstanceOf[js.Dynamic].applyDynamic("dsv")(delimiter.asInstanceOf[js.Any], url.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DSVRowArray[Columns]]]
  inline def dsv[ParsedRow /* <: js.Object */, Columns /* <: String */](
    delimiter: String,
    url: String,
    init: RequestInit,
    row: js.Function3[
      /* rawRow */ DSVRowString[Columns], 
      /* index */ Double, 
      /* columns */ js.Array[Columns], 
      js.UndefOr[ParsedRow | Null]
    ]
  ): js.Promise[DSVParsedArray[ParsedRow]] = (^.asInstanceOf[js.Dynamic].applyDynamic("dsv")(delimiter.asInstanceOf[js.Any], url.asInstanceOf[js.Any], init.asInstanceOf[js.Any], row.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DSVParsedArray[ParsedRow]]]
  inline def dsv[ParsedRow /* <: js.Object */, Columns /* <: String */](
    delimiter: String,
    url: String,
    row: js.Function3[
      /* rawRow */ DSVRowString[Columns], 
      /* index */ Double, 
      /* columns */ js.Array[Columns], 
      js.UndefOr[ParsedRow | Null]
    ]
  ): js.Promise[DSVParsedArray[ParsedRow]] = (^.asInstanceOf[js.Dynamic].applyDynamic("dsv")(delimiter.asInstanceOf[js.Any], url.asInstanceOf[js.Any], row.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DSVParsedArray[ParsedRow]]]
  
  inline def html(url: String): js.Promise[Document] = ^.asInstanceOf[js.Dynamic].applyDynamic("html")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Document]]
  inline def html(url: String, init: RequestInit): js.Promise[Document] = (^.asInstanceOf[js.Dynamic].applyDynamic("html")(url.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Document]]
  
  inline def image(url: String): js.Promise[HTMLImageElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("image")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[HTMLImageElement]]
  inline def image(url: String, init: PartialHTMLImageElement): js.Promise[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("image")(url.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HTMLImageElement]]
  
  inline def json[ParsedJSONObject /* <: Any */](url: String): js.Promise[js.UndefOr[ParsedJSONObject]] = ^.asInstanceOf[js.Dynamic].applyDynamic("json")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[ParsedJSONObject]]]
  inline def json[ParsedJSONObject /* <: Any */](url: String, init: RequestInit): js.Promise[js.UndefOr[ParsedJSONObject]] = (^.asInstanceOf[js.Dynamic].applyDynamic("json")(url.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[ParsedJSONObject]]]
  
  inline def svg(url: String): js.Promise[Document] = ^.asInstanceOf[js.Dynamic].applyDynamic("svg")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Document]]
  inline def svg(url: String, init: RequestInit): js.Promise[Document] = (^.asInstanceOf[js.Dynamic].applyDynamic("svg")(url.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Document]]
  
  inline def text(url: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("text")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def text(url: String, init: RequestInit): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("text")(url.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def tsv[Columns /* <: String */](url: String): js.Promise[DSVRowArray[Columns]] = ^.asInstanceOf[js.Dynamic].applyDynamic("tsv")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DSVRowArray[Columns]]]
  inline def tsv[Columns /* <: String */](url: String, init: RequestInit): js.Promise[DSVRowArray[Columns]] = (^.asInstanceOf[js.Dynamic].applyDynamic("tsv")(url.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DSVRowArray[Columns]]]
  inline def tsv[ParsedRow /* <: js.Object */, Columns /* <: String */](
    url: String,
    init: RequestInit,
    row: js.Function3[
      /* rawRow */ DSVRowString[Columns], 
      /* index */ Double, 
      /* columns */ js.Array[Columns], 
      js.UndefOr[ParsedRow | Null]
    ]
  ): js.Promise[DSVParsedArray[ParsedRow]] = (^.asInstanceOf[js.Dynamic].applyDynamic("tsv")(url.asInstanceOf[js.Any], init.asInstanceOf[js.Any], row.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DSVParsedArray[ParsedRow]]]
  inline def tsv[ParsedRow /* <: js.Object */, Columns /* <: String */](
    url: String,
    row: js.Function3[
      /* rawRow */ DSVRowString[Columns], 
      /* index */ Double, 
      /* columns */ js.Array[Columns], 
      js.UndefOr[ParsedRow | Null]
    ]
  ): js.Promise[DSVParsedArray[ParsedRow]] = (^.asInstanceOf[js.Dynamic].applyDynamic("tsv")(url.asInstanceOf[js.Any], row.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DSVParsedArray[ParsedRow]]]
  
  inline def xml(url: String): js.Promise[XMLDocument] = ^.asInstanceOf[js.Dynamic].applyDynamic("xml")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[XMLDocument]]
  inline def xml(url: String, init: RequestInit): js.Promise[XMLDocument] = (^.asInstanceOf[js.Dynamic].applyDynamic("xml")(url.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[XMLDocument]]
}
