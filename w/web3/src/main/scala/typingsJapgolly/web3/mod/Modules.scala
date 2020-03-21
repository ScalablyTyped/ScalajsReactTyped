package typingsJapgolly.web3.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.node.netMod.Socket
import typingsJapgolly.web3Bzz.mod.Bzz
import typingsJapgolly.web3Core.mod.provider
import typingsJapgolly.web3Eth.mod.Eth
import typingsJapgolly.web3EthPersonal.mod.Personal
import typingsJapgolly.web3Net.mod.Network
import typingsJapgolly.web3Shh.mod.Shh
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Modules extends js.Object {
  var Bzz: Instantiable1[/* provider */ provider, typingsJapgolly.web3Bzz.mod.Bzz]
  var Eth: Instantiable2[/* provider */ provider, /* net */ Socket, typingsJapgolly.web3Eth.mod.Eth]
  var Net: Instantiable2[/* provider */ provider, /* net */ Socket, Network]
  var Personal: Instantiable2[
    /* provider */ provider, 
    /* net */ Socket, 
    typingsJapgolly.web3EthPersonal.mod.Personal
  ]
  var Shh: Instantiable2[/* provider */ provider, /* net */ Socket, typingsJapgolly.web3Shh.mod.Shh]
}

object Modules {
  @scala.inline
  def apply(
    Bzz: Instantiable1[/* provider */ provider, Bzz],
    Eth: Instantiable2[/* provider */ provider, /* net */ Socket, Eth],
    Net: Instantiable2[/* provider */ provider, /* net */ Socket, Network],
    Personal: Instantiable2[/* provider */ provider, /* net */ Socket, Personal],
    Shh: Instantiable2[/* provider */ provider, /* net */ Socket, Shh]
  ): Modules = {
    val __obj = js.Dynamic.literal(Bzz = Bzz.asInstanceOf[js.Any], Eth = Eth.asInstanceOf[js.Any], Net = Net.asInstanceOf[js.Any], Personal = Personal.asInstanceOf[js.Any], Shh = Shh.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Modules]
  }
}

