package typingsJapgolly.jupyterlabApplication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tokensMod {
  type IConnectionLost = js.Function2[
    /* manager */ typingsJapgolly.jupyterlabServices.libManagerMod.ServiceManager.IManager, 
    /* err */ typingsJapgolly.jupyterlabServices.mod.ServerConnection.NetworkError, 
    js.Promise[scala.Unit]
  ]
  type IRouter = typingsJapgolly.jupyterlabApplication.tokensMod.IRouter_
}
