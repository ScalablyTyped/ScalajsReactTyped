package typingsJapgolly.odata

import org.scalajs.dom.experimental.RequestInit
import org.scalajs.dom.experimental.URL
import typingsJapgolly.odata.odataConfigMod.OdataConfig
import typingsJapgolly.odata.odataQueryMod.OdataQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("odata", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class OBatch protected ()
    extends typingsJapgolly.odata.obatchMod.OBatch {
    def this(resources: js.Array[typingsJapgolly.odata.orequestMod.ORequest], config: OdataConfig) = this()
    def this(
      resources: js.Array[typingsJapgolly.odata.orequestMod.ORequest],
      config: OdataConfig,
      query: OdataQuery
    ) = this()
    def this(
      resources: js.Array[typingsJapgolly.odata.orequestMod.ORequest],
      config: OdataConfig,
      query: OdataQuery,
      changeset: Boolean
    ) = this()
  }
  
  @js.native
  class OHandler protected ()
    extends typingsJapgolly.odata.ohandlerMod.OHandler {
    def this(config: OdataConfig) = this()
  }
  
  @js.native
  class ORequest protected ()
    extends typingsJapgolly.odata.orequestMod.ORequest {
    def this(url: String, config: RequestInit) = this()
    def this(url: URL, config: RequestInit) = this()
  }
  
  def o(rootUrl: String): typingsJapgolly.odata.ohandlerMod.OHandler = js.native
  def o(rootUrl: String, config: js.Any): typingsJapgolly.odata.ohandlerMod.OHandler = js.native
  def o(rootUrl: String, config: OdataConfig): typingsJapgolly.odata.ohandlerMod.OHandler = js.native
  def o(rootUrl: typingsJapgolly.std.URL): typingsJapgolly.odata.ohandlerMod.OHandler = js.native
  def o(rootUrl: typingsJapgolly.std.URL, config: js.Any): typingsJapgolly.odata.ohandlerMod.OHandler = js.native
  def o(rootUrl: typingsJapgolly.std.URL, config: OdataConfig): typingsJapgolly.odata.ohandlerMod.OHandler = js.native
}

