package typingsJapgolly.ndnJs

import typingsJapgolly.ndnJs.dataMod.Data
import typingsJapgolly.ndnJs.faceMod.Face
import typingsJapgolly.ndnJs.faceMod.ForwardingFlags
import typingsJapgolly.ndnJs.faceMod.InterestFilter
import typingsJapgolly.ndnJs.faceMod.OnInterestCallback
import typingsJapgolly.ndnJs.interestMod.Interest
import typingsJapgolly.ndnJs.nameMod.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js/memory-content-cache", JSImport.Namespace)
@js.native
object memoryContentCacheMod extends js.Object {
  @js.native
  class MemoryContentCache protected () extends js.Object {
    def this(face: Face) = this()
    def this(face: Face, cleanupIntervalMilliseconds: Double) = this()
    def add(data: Data): Unit = js.native
    def getMinimumCacheLifetime(): Double = js.native
    def getStorePendingInterest(): OnInterestCallback = js.native
    def registerPrefix(name: Name, onRegisterFailed: js.Function1[/* prefix */ Name, _]): Unit = js.native
    def registerPrefix(
      name: Name,
      onRegisterFailed: js.Function1[/* prefix */ Name, _],
      onRegisterSuccess: js.Function2[/* prefix */ Name, /* registeredPrefixId */ Double, _]
    ): Unit = js.native
    def registerPrefix(
      name: Name,
      onRegisterFailed: js.Function1[/* prefix */ Name, _],
      onRegisterSuccess: js.Function2[/* prefix */ Name, /* registeredPrefixId */ Double, _],
      onDataNotFound: OnInterestCallback
    ): Unit = js.native
    def registerPrefix(
      name: Name,
      onRegisterFailed: js.Function1[/* prefix */ Name, _],
      onRegisterSuccess: js.Function2[/* prefix */ Name, /* registeredPrefixId */ Double, _],
      onDataNotFound: OnInterestCallback,
      flags: ForwardingFlags
    ): Unit = js.native
    def setInterestFilter(filter: InterestFilter): Unit = js.native
    def setInterestFilter(filter: InterestFilter, onDataNotFound: OnInterestCallback): Unit = js.native
    def setInterestFilter(filter: Name): Unit = js.native
    def setInterestFilter(filter: Name, onDataNotFound: OnInterestCallback): Unit = js.native
    def setMinimumCacheLifetime(minimumCacheLifetime: Double): Unit = js.native
    def storePendingInterest(interest: Interest, face: Face): Unit = js.native
    def unregisterAll(): Unit = js.native
  }
  
}

