package typingsJapgolly.arconnect

import org.scalajs.dom.CustomEvent
import typingsJapgolly.arconnect.anon.Connect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.arconnect.arconnectStrings.ACCESS_ADDRESS
    - typingsJapgolly.arconnect.arconnectStrings.ACCESS_ALL_ADDRESSES
    - typingsJapgolly.arconnect.arconnectStrings.SIGN_TRANSACTION
    - typingsJapgolly.arconnect.arconnectStrings.ENCRYPT
    - typingsJapgolly.arconnect.arconnectStrings.DECRYPT
  */
  trait PermissionType extends StObject
  object PermissionType {
    
    inline def ACCESS_ADDRESS: typingsJapgolly.arconnect.arconnectStrings.ACCESS_ADDRESS = "ACCESS_ADDRESS".asInstanceOf[typingsJapgolly.arconnect.arconnectStrings.ACCESS_ADDRESS]
    
    inline def ACCESS_ALL_ADDRESSES: typingsJapgolly.arconnect.arconnectStrings.ACCESS_ALL_ADDRESSES = "ACCESS_ALL_ADDRESSES".asInstanceOf[typingsJapgolly.arconnect.arconnectStrings.ACCESS_ALL_ADDRESSES]
    
    inline def DECRYPT: typingsJapgolly.arconnect.arconnectStrings.DECRYPT = "DECRYPT".asInstanceOf[typingsJapgolly.arconnect.arconnectStrings.DECRYPT]
    
    inline def ENCRYPT: typingsJapgolly.arconnect.arconnectStrings.ENCRYPT = "ENCRYPT".asInstanceOf[typingsJapgolly.arconnect.arconnectStrings.ENCRYPT]
    
    inline def SIGN_TRANSACTION: typingsJapgolly.arconnect.arconnectStrings.SIGN_TRANSACTION = "SIGN_TRANSACTION".asInstanceOf[typingsJapgolly.arconnect.arconnectStrings.SIGN_TRANSACTION]
  }
  
  /**
    * Arweave wallet declarations
    */
  object global {
    
    trait Window extends StObject {
      
      var arweaveWallet: Connect
    }
    object Window {
      
      inline def apply(arweaveWallet: Connect): Window = {
        val __obj = js.Dynamic.literal(arweaveWallet = arweaveWallet.asInstanceOf[js.Any])
        __obj.asInstanceOf[Window]
      }
      
      extension [Self <: Window](x: Self) {
        
        inline def setArweaveWallet(value: Connect): Self = StObject.set(x, "arweaveWallet", value.asInstanceOf[js.Any])
      }
    }
    
    trait WindowEventMap extends StObject {
      
      var arweaveWalletLoaded: CustomEvent
      
      var walletSwitch: CustomEvent
    }
    object WindowEventMap {
      
      inline def apply(arweaveWalletLoaded: CustomEvent, walletSwitch: CustomEvent): WindowEventMap = {
        val __obj = js.Dynamic.literal(arweaveWalletLoaded = arweaveWalletLoaded.asInstanceOf[js.Any], walletSwitch = walletSwitch.asInstanceOf[js.Any])
        __obj.asInstanceOf[WindowEventMap]
      }
      
      extension [Self <: WindowEventMap](x: Self) {
        
        inline def setArweaveWalletLoaded(value: CustomEvent): Self = StObject.set(x, "arweaveWalletLoaded", value.asInstanceOf[js.Any])
        
        inline def setWalletSwitch(value: CustomEvent): Self = StObject.set(x, "walletSwitch", value.asInstanceOf[js.Any])
      }
    }
  }
}
