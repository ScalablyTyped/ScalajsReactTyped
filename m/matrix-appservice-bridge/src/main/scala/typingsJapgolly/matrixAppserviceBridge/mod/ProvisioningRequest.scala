package typingsJapgolly.matrixAppserviceBridge.mod

import typingsJapgolly.express.mod.Request_
import typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.provisioner
import typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.widget
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-appservice-bridge", "ProvisioningRequest")
@js.native
open class ProvisioningRequest[Params, ResBody, ReqBody, ReqQuery] protected ()
  extends typingsJapgolly.matrixAppserviceBridge.libProvisioningMod.ProvisioningRequest[Params, ResBody, ReqBody, ReqQuery] {
  def this(
    expressReq: Request_[Params, ResBody, ReqBody, ReqQuery, Record[String, Any]],
    userId: String,
    requestSource: widget | provisioner
  ) = this()
  def this(
    expressReq: Request_[Params, ResBody, ReqBody, ReqQuery, Record[String, Any]],
    userId: Null,
    requestSource: widget | provisioner
  ) = this()
  def this(
    expressReq: Request_[Params, ResBody, ReqBody, ReqQuery, Record[String, Any]],
    userId: String,
    requestSource: widget | provisioner,
    widgetToken: String
  ) = this()
  def this(
    expressReq: Request_[Params, ResBody, ReqBody, ReqQuery, Record[String, Any]],
    userId: Null,
    requestSource: widget | provisioner,
    widgetToken: String
  ) = this()
  def this(
    expressReq: Request_[Params, ResBody, ReqBody, ReqQuery, Record[String, Any]],
    userId: String,
    requestSource: widget | provisioner,
    widgetToken: String,
    fnName: String
  ) = this()
  def this(
    expressReq: Request_[Params, ResBody, ReqBody, ReqQuery, Record[String, Any]],
    userId: String,
    requestSource: widget | provisioner,
    widgetToken: Unit,
    fnName: String
  ) = this()
  def this(
    expressReq: Request_[Params, ResBody, ReqBody, ReqQuery, Record[String, Any]],
    userId: Null,
    requestSource: widget | provisioner,
    widgetToken: String,
    fnName: String
  ) = this()
  def this(
    expressReq: Request_[Params, ResBody, ReqBody, ReqQuery, Record[String, Any]],
    userId: Null,
    requestSource: widget | provisioner,
    widgetToken: Unit,
    fnName: String
  ) = this()
}
