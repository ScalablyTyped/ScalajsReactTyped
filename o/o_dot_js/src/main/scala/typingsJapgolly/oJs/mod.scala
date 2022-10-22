package typingsJapgolly.oJs

import org.scalajs.dom.RequestInit
import org.scalajs.dom.URL
import typingsJapgolly.oJs.anon.PartialOdataConfig
import typingsJapgolly.oJs.distTypesOdataConfigMod.OdataConfig
import typingsJapgolly.oJs.distTypesOdataQueryMod.OdataQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("o.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("o.js", "OBatch")
  @js.native
  open class OBatch protected ()
    extends typingsJapgolly.oJs.distTypesObatchMod.OBatch {
    def this(resources: js.Array[typingsJapgolly.oJs.distTypesOrequestMod.ORequest], config: OdataConfig) = this()
    def this(
      resources: js.Array[typingsJapgolly.oJs.distTypesOrequestMod.ORequest],
      config: OdataConfig,
      query: OdataQuery
    ) = this()
    def this(
      resources: js.Array[typingsJapgolly.oJs.distTypesOrequestMod.ORequest],
      config: OdataConfig,
      query: Unit,
      changeset: Boolean
    ) = this()
    def this(
      resources: js.Array[typingsJapgolly.oJs.distTypesOrequestMod.ORequest],
      config: OdataConfig,
      query: OdataQuery,
      changeset: Boolean
    ) = this()
  }
  
  @JSImport("o.js", "OHandler")
  @js.native
  open class OHandler protected ()
    extends typingsJapgolly.oJs.distTypesOhandlerMod.OHandler {
    def this(config: OdataConfig) = this()
  }
  
  @JSImport("o.js", "ORequest")
  @js.native
  open class ORequest protected ()
    extends typingsJapgolly.oJs.distTypesOrequestMod.ORequest {
    def this(url: String, config: RequestInit) = this()
    def this(url: URL, config: RequestInit) = this()
  }
  
  inline def o(rootUrl: String): typingsJapgolly.oJs.distTypesOhandlerMod.OHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("o")(rootUrl.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.oJs.distTypesOhandlerMod.OHandler]
  inline def o(rootUrl: String, config: PartialOdataConfig): typingsJapgolly.oJs.distTypesOhandlerMod.OHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("o")(rootUrl.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.oJs.distTypesOhandlerMod.OHandler]
  inline def o(rootUrl: URL): typingsJapgolly.oJs.distTypesOhandlerMod.OHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("o")(rootUrl.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.oJs.distTypesOhandlerMod.OHandler]
  inline def o(rootUrl: URL, config: PartialOdataConfig): typingsJapgolly.oJs.distTypesOhandlerMod.OHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("o")(rootUrl.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.oJs.distTypesOhandlerMod.OHandler]
}
