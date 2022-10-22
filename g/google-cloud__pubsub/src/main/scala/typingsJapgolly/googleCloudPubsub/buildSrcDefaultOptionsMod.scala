package typingsJapgolly.googleCloudPubsub

import typingsJapgolly.googleCloudPubsub.anon.AckDeadline
import typingsJapgolly.googleCloudPubsub.anon.MaxDelayMillis
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcDefaultOptionsMod {
  
  object defaultOptions {
    
    @JSImport("@google-cloud/pubsub/build/src/default-options", "defaultOptions")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@google-cloud/pubsub/build/src/default-options", "defaultOptions.publish")
    @js.native
    def publish: MaxDelayMillis = js.native
    inline def publish_=(x: MaxDelayMillis): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("publish")(x.asInstanceOf[js.Any])
    
    @JSImport("@google-cloud/pubsub/build/src/default-options", "defaultOptions.subscription")
    @js.native
    def subscription: AckDeadline = js.native
    inline def subscription_=(x: AckDeadline): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("subscription")(x.asInstanceOf[js.Any])
  }
}
