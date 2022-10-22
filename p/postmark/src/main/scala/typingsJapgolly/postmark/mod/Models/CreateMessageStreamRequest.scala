package typingsJapgolly.postmark.mod.Models

import typingsJapgolly.postmark.distClientModelsStreamsMessageStreamMod.SubscriptionManagementConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postmark", "Models.CreateMessageStreamRequest")
@js.native
open class CreateMessageStreamRequest protected ()
  extends typingsJapgolly.postmark.distClientModelsMod.CreateMessageStreamRequest {
  def this(id: String, name: String, messageStreamType: String) = this()
  def this(id: String, name: String, messageStreamType: String, description: String) = this()
  def this(
    id: String,
    name: String,
    messageStreamType: String,
    description: String,
    subscriptionManagementConfiguration: SubscriptionManagementConfiguration
  ) = this()
  def this(
    id: String,
    name: String,
    messageStreamType: String,
    description: Unit,
    subscriptionManagementConfiguration: SubscriptionManagementConfiguration
  ) = this()
}
