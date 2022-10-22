package typingsJapgolly.socketclusterServer.serverMod

import typingsJapgolly.socketclusterServer.actionMod.AGActionAuthenticate
import typingsJapgolly.socketclusterServer.actionMod.AGActionHandshakeSC
import typingsJapgolly.socketclusterServer.actionMod.AGActionHandshakeWS
import typingsJapgolly.socketclusterServer.actionMod.AGActionInvoke
import typingsJapgolly.socketclusterServer.actionMod.AGActionMessage
import typingsJapgolly.socketclusterServer.actionMod.AGActionPublishIn
import typingsJapgolly.socketclusterServer.actionMod.AGActionPublishOut
import typingsJapgolly.socketclusterServer.actionMod.AGActionSubscribe
import typingsJapgolly.socketclusterServer.actionMod.AGActionTransmit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Middlewares = /* "handshake" */ String

type handshakeMiddlewareFunction = js.Function1[
/* stream */ typingsJapgolly.writableConsumableStream.mod.^[AGActionHandshakeWS | AGActionHandshakeSC], 
Unit]

type inboundMiddlewareFunction = js.Function1[
/* stream */ typingsJapgolly.writableConsumableStream.mod.^[
  AGActionTransmit | AGActionInvoke | AGActionSubscribe | AGActionPublishIn | AGActionAuthenticate
], 
Unit]

type inboundRawMiddlewareFunction = js.Function1[/* stream */ typingsJapgolly.writableConsumableStream.mod.^[AGActionMessage], Unit]

type outboundMiddlewareFunction = js.Function1[
/* stream */ typingsJapgolly.writableConsumableStream.mod.^[AGActionPublishOut], 
Unit]
