package typingsJapgolly.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.ethers.mod.ethers.utils.Interface
import typingsJapgolly.ethersprojectAbi.libAbiCoderMod.AbiCoder
import typingsJapgolly.ethersprojectAbi.libFragmentsMod.ErrorFragment
import typingsJapgolly.ethersprojectAbi.libFragmentsMod.EventFragment
import typingsJapgolly.ethersprojectAbi.libFragmentsMod.FunctionFragment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofInterface
  extends StObject
     with Instantiable1[/* fragments */ String, Interface] {
  
  def getAbiCoder(): AbiCoder = js.native
  
  def getAddress(address: String): String = js.native
  
  def getEventTopic(eventFragment: EventFragment): String = js.native
  
  def getSighash(fragment: ErrorFragment): String = js.native
  def getSighash(fragment: FunctionFragment): String = js.native
  
  def isInterface(value: Any): /* is @ethersproject/abi.@ethersproject/abi/lib/interface.Interface */ Boolean = js.native
}
