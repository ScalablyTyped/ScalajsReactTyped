package typingsJapgolly.ndnJs

import typingsJapgolly.ndnJs.blobMod.Blob
import typingsJapgolly.ndnJs.dataMod.Data
import typingsJapgolly.ndnJs.interestMod.DelegationSet.Delegation
import typingsJapgolly.ndnJs.nameMod.Name
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interestMod {
  
  @JSImport("ndn-js/interest", "DelegationSet")
  @js.native
  open class DelegationSet () extends StObject {
    
    def add(preference: Double, name: Name): Unit = js.native
    
    def clear(): Unit = js.native
    
    def find(name: Name): Double = js.native
    
    def get(i: Double): Delegation = js.native
    
    def remove(name: Name): Boolean = js.native
    
    def size(): Double = js.native
  }
  object DelegationSet {
    
    @JSImport("ndn-js/interest", "DelegationSet.Delegation")
    @js.native
    open class Delegation () extends StObject {
      
      def getName(): Name = js.native
      
      def getPreference(): Double = js.native
    }
  }
  
  @JSImport("ndn-js/interest", "Interest")
  @js.native
  open class Interest () extends StObject {
    def this(interest: Interest) = this()
    def this(name: String) = this()
    def this(name: Name) = this()
    
    def appendParametersDigestToName(): Interest = js.native
    
    def getApplicationParameters(): Blob = js.native
    
    def getCanBePrefix(): Boolean = js.native
    
    def getForwardingHint(): DelegationSet = js.native
    
    def getIncomingFaceId(): Double = js.native
    
    def getInterestLifetimeMilliseconds(): Double = js.native
    
    def getMustBeFresh(): Boolean = js.native
    
    def getName(): Name = js.native
    
    def getNonce(): Blob = js.native
    
    def matchesData(data: Data): Boolean = js.native
    
    def matchesName(name: Name): Boolean = js.native
    
    def refreshNonce(): Unit = js.native
    
    def setApplicationParameters(parameters: Blob): Interest = js.native
    def setApplicationParameters(parameters: Buffer): Interest = js.native
    
    def setCanBePrefix(canBePrefix: Boolean): Interest = js.native
    
    def setForwardingHint(fh: DelegationSet): Interest = js.native
    
    def setInterestLifetimeMilliseconds(lifetime: Double): Interest = js.native
    
    def setMustBeFresh(mustBeFresh: Boolean): Interest = js.native
    
    def setName(name: Name): Interest = js.native
    
    def toUri(): String = js.native
    
    def wireDecode(input: Blob): Unit = js.native
    def wireDecode(input: Buffer): Unit = js.native
    
    def wireEncode(): Blob = js.native
  }
}
