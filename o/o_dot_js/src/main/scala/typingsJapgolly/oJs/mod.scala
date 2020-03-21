package typingsJapgolly.oJs

import org.scalajs.dom.experimental.RequestInit
import org.scalajs.dom.experimental.URL
import typingsJapgolly.oJs.odataConfigMod.OdataConfig
import typingsJapgolly.oJs.odataQueryMod.OdataQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("o.js", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class OBatch protected ()
    extends typingsJapgolly.oJs.obatchMod.OBatch {
    def this(resources: js.Array[typingsJapgolly.oJs.orequestMod.ORequest], config: OdataConfig) = this()
    def this(
      resources: js.Array[typingsJapgolly.oJs.orequestMod.ORequest],
      config: OdataConfig,
      query: OdataQuery
    ) = this()
    def this(
      resources: js.Array[typingsJapgolly.oJs.orequestMod.ORequest],
      config: OdataConfig,
      query: OdataQuery,
      changeset: Boolean
    ) = this()
  }
  
  @js.native
  class OHandler protected ()
    extends typingsJapgolly.oJs.ohandlerMod.OHandler {
    def this(config: OdataConfig) = this()
  }
  
  @js.native
  class ORequest protected ()
    extends typingsJapgolly.oJs.orequestMod.ORequest {
    def this(url: String, config: RequestInit) = this()
    def this(url: URL, config: RequestInit) = this()
  }
  
  def o(rootUrl: String): typingsJapgolly.oJs.ohandlerMod.OHandler = js.native
  def o(rootUrl: String, config: js.Any): typingsJapgolly.oJs.ohandlerMod.OHandler = js.native
  def o(rootUrl: String, config: OdataConfig): typingsJapgolly.oJs.ohandlerMod.OHandler = js.native
  def o(rootUrl: typingsJapgolly.std.URL): typingsJapgolly.oJs.ohandlerMod.OHandler = js.native
  def o(rootUrl: typingsJapgolly.std.URL, config: js.Any): typingsJapgolly.oJs.ohandlerMod.OHandler = js.native
  def o(rootUrl: typingsJapgolly.std.URL, config: OdataConfig): typingsJapgolly.oJs.ohandlerMod.OHandler = js.native
}

