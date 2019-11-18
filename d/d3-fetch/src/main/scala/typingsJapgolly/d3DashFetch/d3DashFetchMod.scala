package typingsJapgolly.d3DashFetch

import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.HTMLImageElement
import typingsJapgolly.d3DashDsv.d3DashDsvMod.DSVParsedArray
import typingsJapgolly.d3DashDsv.d3DashDsvMod.DSVRowArray
import typingsJapgolly.d3DashDsv.d3DashDsvMod.DSVRowString
import typingsJapgolly.std.Partial
import typingsJapgolly.std.RequestInit
import typingsJapgolly.std.XMLDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-fetch", JSImport.Namespace)
@js.native
object d3DashFetchMod extends js.Object {
  def blob(url: String): js.Promise[Blob] = js.native
  def blob(url: String, init: RequestInit): js.Promise[Blob] = js.native
  def buffer(url: String): js.Promise[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def buffer(url: String, init: RequestInit): js.Promise[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def csv[Columns /* <: String */](url: String): js.Promise[DSVRowArray[Columns]] = js.native
  def csv[Columns /* <: String */](url: String, init: RequestInit): js.Promise[DSVRowArray[Columns]] = js.native
  def csv[ParsedRow /* <: js.Object */, Columns /* <: String */](
    url: String,
    init: RequestInit,
    row: js.Function3[
      /* rawRow */ DSVRowString[Columns], 
      /* index */ Double, 
      /* columns */ js.Array[Columns], 
      js.UndefOr[ParsedRow | Null]
    ]
  ): js.Promise[DSVParsedArray[ParsedRow]] = js.native
  def csv[ParsedRow /* <: js.Object */, Columns /* <: String */](
    url: String,
    row: js.Function3[
      /* rawRow */ DSVRowString[Columns], 
      /* index */ Double, 
      /* columns */ js.Array[Columns], 
      js.UndefOr[ParsedRow | Null]
    ]
  ): js.Promise[DSVParsedArray[ParsedRow]] = js.native
  def dsv[Columns /* <: String */](delimiter: String, url: String): js.Promise[DSVRowArray[Columns]] = js.native
  def dsv[Columns /* <: String */](delimiter: String, url: String, init: RequestInit): js.Promise[DSVRowArray[Columns]] = js.native
  def dsv[ParsedRow /* <: js.Object */, Columns /* <: String */](
    delimiter: String,
    url: String,
    init: RequestInit,
    row: js.Function3[
      /* rawRow */ DSVRowString[Columns], 
      /* index */ Double, 
      /* columns */ js.Array[Columns], 
      js.UndefOr[ParsedRow | Null]
    ]
  ): js.Promise[DSVParsedArray[ParsedRow]] = js.native
  def dsv[ParsedRow /* <: js.Object */, Columns /* <: String */](
    delimiter: String,
    url: String,
    row: js.Function3[
      /* rawRow */ DSVRowString[Columns], 
      /* index */ Double, 
      /* columns */ js.Array[Columns], 
      js.UndefOr[ParsedRow | Null]
    ]
  ): js.Promise[DSVParsedArray[ParsedRow]] = js.native
  def html(url: String): js.Promise[Document] = js.native
  def html(url: String, init: RequestInit): js.Promise[Document] = js.native
  def image(url: String): js.Promise[HTMLImageElement] = js.native
  def image(url: String, init: Partial[typingsJapgolly.std.HTMLImageElement]): js.Promise[HTMLImageElement] = js.native
  def json[ParsedJSONObject /* <: js.Any */](url: String): js.Promise[ParsedJSONObject] = js.native
  def json[ParsedJSONObject /* <: js.Any */](url: String, init: RequestInit): js.Promise[ParsedJSONObject] = js.native
  def svg(url: String): js.Promise[Document] = js.native
  def svg(url: String, init: RequestInit): js.Promise[Document] = js.native
  def text(url: String): js.Promise[String] = js.native
  def text(url: String, init: RequestInit): js.Promise[String] = js.native
  def tsv[Columns /* <: String */](url: String): js.Promise[DSVRowArray[Columns]] = js.native
  def tsv[Columns /* <: String */](url: String, init: RequestInit): js.Promise[DSVRowArray[Columns]] = js.native
  def tsv[ParsedRow /* <: js.Object */, Columns /* <: String */](
    url: String,
    init: RequestInit,
    row: js.Function3[
      /* rawRow */ DSVRowString[Columns], 
      /* index */ Double, 
      /* columns */ js.Array[Columns], 
      js.UndefOr[ParsedRow | Null]
    ]
  ): js.Promise[DSVParsedArray[ParsedRow]] = js.native
  def tsv[ParsedRow /* <: js.Object */, Columns /* <: String */](
    url: String,
    row: js.Function3[
      /* rawRow */ DSVRowString[Columns], 
      /* index */ Double, 
      /* columns */ js.Array[Columns], 
      js.UndefOr[ParsedRow | Null]
    ]
  ): js.Promise[DSVParsedArray[ParsedRow]] = js.native
  def xml(url: String): js.Promise[XMLDocument] = js.native
  def xml(url: String, init: RequestInit): js.Promise[XMLDocument] = js.native
}

