package typingsJapgolly.pulsarClient

import typingsJapgolly.pulsarClient.mod.CompressionType
import typingsJapgolly.pulsarClient.mod.HashingScheme
import typingsJapgolly.pulsarClient.mod.MessageRoutingModes
import typingsJapgolly.pulsarClient.mod.SubscriptionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object pulsarClientStrings {
  @js.native
  sealed trait BoostHash extends HashingScheme
  
  @js.native
  sealed trait CustomPartition extends MessageRoutingModes
  
  @js.native
  sealed trait Exclusive extends SubscriptionType
  
  @js.native
  sealed trait Failover extends SubscriptionType
  
  @js.native
  sealed trait JavaStringHash extends HashingScheme
  
  @js.native
  sealed trait LZ4 extends CompressionType
  
  @js.native
  sealed trait Murmur3_32Hash extends HashingScheme
  
  @js.native
  sealed trait RoundRobinPartition extends MessageRoutingModes
  
  @js.native
  sealed trait Shared extends SubscriptionType
  
  @js.native
  sealed trait SinglePartition extends MessageRoutingModes
  
  @js.native
  sealed trait Zlib extends CompressionType
  
  @scala.inline
  def BoostHash: BoostHash = "BoostHash".asInstanceOf[BoostHash]
  @scala.inline
  def CustomPartition: CustomPartition = "CustomPartition".asInstanceOf[CustomPartition]
  @scala.inline
  def Exclusive: Exclusive = "Exclusive".asInstanceOf[Exclusive]
  @scala.inline
  def Failover: Failover = "Failover".asInstanceOf[Failover]
  @scala.inline
  def JavaStringHash: JavaStringHash = "JavaStringHash".asInstanceOf[JavaStringHash]
  @scala.inline
  def LZ4: LZ4 = "LZ4".asInstanceOf[LZ4]
  @scala.inline
  def Murmur3_32Hash: Murmur3_32Hash = "Murmur3_32Hash".asInstanceOf[Murmur3_32Hash]
  @scala.inline
  def RoundRobinPartition: RoundRobinPartition = "RoundRobinPartition".asInstanceOf[RoundRobinPartition]
  @scala.inline
  def Shared: Shared = "Shared".asInstanceOf[Shared]
  @scala.inline
  def SinglePartition: SinglePartition = "SinglePartition".asInstanceOf[SinglePartition]
  @scala.inline
  def Zlib: Zlib = "Zlib".asInstanceOf[Zlib]
}

