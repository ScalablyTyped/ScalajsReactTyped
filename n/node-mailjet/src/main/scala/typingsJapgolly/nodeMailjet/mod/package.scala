package typingsJapgolly.nodeMailjet.mod

import typingsJapgolly.nodeMailjet.mod.Email.Client
import typingsJapgolly.nodeMailjet.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def connect(apiKey: String, apiSecret: String): Client = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(apiKey.asInstanceOf[js.Any], apiSecret.asInstanceOf[js.Any])).asInstanceOf[Client]
inline def connect(apiKey: String, apiSecret: String, options: ConnectOptions): Client = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(apiKey.asInstanceOf[js.Any], apiSecret.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Client]
inline def connect(apiToken: String): typingsJapgolly.nodeMailjet.mod.SMS.Client = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(apiToken.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.nodeMailjet.mod.SMS.Client]
inline def connect(apiToken: String, options: ConnectOptions): typingsJapgolly.nodeMailjet.mod.SMS.Client = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(apiToken.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.nodeMailjet.mod.SMS.Client]
