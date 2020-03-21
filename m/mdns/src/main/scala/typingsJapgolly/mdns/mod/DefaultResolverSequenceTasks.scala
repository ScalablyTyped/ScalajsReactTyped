package typingsJapgolly.mdns.mod

import typingsJapgolly.mdns.AnonFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultResolverSequenceTasks extends MDNSResolverSequenceTasks {
  def DNSServiceGetAddrInfo(): js.Function2[/* service */ Service, /* next */ js.Function0[Unit], Boolean] = js.native
  def DNSServiceGetAddrInfo(options: js.Any): js.Function2[/* service */ Service, /* next */ js.Function0[Unit], Boolean] = js.native
  def DNSServiceResolve(): js.Function2[/* service */ Service, /* next */ js.Function0[Unit], Boolean] = js.native
  def DNSServiceResolve(options: AnonFlags): js.Function2[/* service */ Service, /* next */ js.Function0[Unit], Boolean] = js.native
  def filterAddresses(
    fn: js.Function3[
      /* address */ String, 
      /* index */ js.UndefOr[Double], 
      /* addresses */ js.UndefOr[js.Array[String]], 
      Boolean
    ]
  ): Unit = js.native
  def getaddrinfo(): js.Function2[/* service */ Service, /* next */ js.Function0[Unit], Boolean] = js.native
  def getaddrinfo(options: js.Any): js.Function2[/* service */ Service, /* next */ js.Function0[Unit], Boolean] = js.native
  def logService(): Unit = js.native
  def makeAddressesUnique(): js.Function2[/* service */ Service, /* next */ js.Function0[Unit], Boolean] = js.native
}

