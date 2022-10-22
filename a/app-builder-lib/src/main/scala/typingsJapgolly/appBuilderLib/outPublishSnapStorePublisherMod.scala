package typingsJapgolly.appBuilderLib

import typingsJapgolly.builderUtilRuntime.outPublishOptionsMod.SnapStoreOptions
import typingsJapgolly.electronPublish.mod.PublishContext
import typingsJapgolly.electronPublish.mod.Publisher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outPublishSnapStorePublisherMod {
  
  @JSImport("app-builder-lib/out/publish/SnapStorePublisher", "SnapStorePublisher")
  @js.native
  open class SnapStorePublisher protected () extends Publisher {
    def this(context: PublishContext, options: SnapStoreOptions) = this()
    
    /* private */ var options: Any = js.native
    
    @JSName("providerName")
    val providerName_FSnapStorePublisher: /* "snapStore" */ String = js.native
  }
}
