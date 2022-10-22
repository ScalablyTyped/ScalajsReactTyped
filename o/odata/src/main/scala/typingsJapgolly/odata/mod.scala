package typingsJapgolly.odata

import org.scalajs.dom.RequestInit
import org.scalajs.dom.URL
import typingsJapgolly.odata.anon.PartialOdataConfig
import typingsJapgolly.odata.distTypesOdataConfigMod.OdataConfig
import typingsJapgolly.odata.distTypesOdataQueryMod.OdataQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("odata", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("odata", "OBatch")
  @js.native
  open class OBatch protected ()
    extends typingsJapgolly.odata.distTypesObatchMod.OBatch {
    def this(resources: js.Array[typingsJapgolly.odata.distTypesOrequestMod.ORequest], config: OdataConfig) = this()
    def this(
      resources: js.Array[typingsJapgolly.odata.distTypesOrequestMod.ORequest],
      config: OdataConfig,
      query: OdataQuery
    ) = this()
    def this(
      resources: js.Array[typingsJapgolly.odata.distTypesOrequestMod.ORequest],
      config: OdataConfig,
      query: Unit,
      changeset: Boolean
    ) = this()
    def this(
      resources: js.Array[typingsJapgolly.odata.distTypesOrequestMod.ORequest],
      config: OdataConfig,
      query: OdataQuery,
      changeset: Boolean
    ) = this()
  }
  
  @JSImport("odata", "OHandler")
  @js.native
  open class OHandler protected ()
    extends typingsJapgolly.odata.distTypesOhandlerMod.OHandler {
    def this(config: OdataConfig) = this()
  }
  
  @JSImport("odata", "ORequest")
  @js.native
  open class ORequest protected ()
    extends typingsJapgolly.odata.distTypesOrequestMod.ORequest {
    def this(url: String, config: RequestInit) = this()
    def this(url: URL, config: RequestInit) = this()
  }
  
  inline def o(rootUrl: String): typingsJapgolly.odata.distTypesOhandlerMod.OHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("o")(rootUrl.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.odata.distTypesOhandlerMod.OHandler]
  inline def o(rootUrl: String, config: PartialOdataConfig): typingsJapgolly.odata.distTypesOhandlerMod.OHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("o")(rootUrl.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.odata.distTypesOhandlerMod.OHandler]
  inline def o(rootUrl: URL): typingsJapgolly.odata.distTypesOhandlerMod.OHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("o")(rootUrl.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.odata.distTypesOhandlerMod.OHandler]
  inline def o(rootUrl: URL, config: PartialOdataConfig): typingsJapgolly.odata.distTypesOhandlerMod.OHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("o")(rootUrl.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.odata.distTypesOhandlerMod.OHandler]
}
