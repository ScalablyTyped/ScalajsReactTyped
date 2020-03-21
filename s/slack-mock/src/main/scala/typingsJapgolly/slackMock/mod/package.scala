package typingsJapgolly.slackMock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type EventHttpHeaders = typingsJapgolly.node.httpMod.IncomingHttpHeaders
  // Events
  type EventUrl = java.lang.String | typingsJapgolly.node.urlMod.Url
  type IncomingWebhookHttpHeaders = typingsJapgolly.nock.mod.ReplyHeaders
  // Incoming Webhooks
  type IncomingWebhookUrl = java.lang.String
  type InteractiveButtonHttpHeaders = typingsJapgolly.nock.mod.ReplyHeaders
  // Interactive Buttons
  type InteractiveButtonUrl = java.lang.String | typingsJapgolly.node.urlMod.Url
  type OutgoingWebhookHttpHeaders = typingsJapgolly.node.httpMod.IncomingHttpHeaders
  // Outgoing Webhooks
  type OutgoingWebhookUrl = java.lang.String | typingsJapgolly.node.urlMod.Url
  type SlashCommandHttpHeaders = typingsJapgolly.node.httpMod.IncomingHttpHeaders
  // Slash Commands
  type SlashCommandUrl = java.lang.String | typingsJapgolly.node.urlMod.Url
  type WebHttpHeaders = typingsJapgolly.nock.mod.ReplyHeaders
  // Web
  type WebUrl = java.lang.String
}
