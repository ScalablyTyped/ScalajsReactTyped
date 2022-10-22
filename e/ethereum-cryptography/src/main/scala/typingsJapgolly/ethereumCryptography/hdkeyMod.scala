package typingsJapgolly.ethereumCryptography

import typingsJapgolly.scureBip32.anon.Xpriv
import typingsJapgolly.scureBip32.mod.HDKeyOpt
import typingsJapgolly.scureBip32.mod.Versions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hdkeyMod {
  
  @JSImport("ethereum-cryptography/hdkey", "HARDENED_OFFSET")
  @js.native
  val HARDENED_OFFSET: Double = js.native
  
  @JSImport("ethereum-cryptography/hdkey", "HDKey")
  @js.native
  open class HDKey protected ()
    extends typingsJapgolly.scureBip32.mod.HDKey {
    def this(opt: HDKeyOpt) = this()
  }
  /* static members */
  object HDKey {
    
    @JSImport("ethereum-cryptography/hdkey", "HDKey")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromExtendedKey(base58key: String): typingsJapgolly.scureBip32.mod.HDKey = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedKey")(base58key.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.scureBip32.mod.HDKey]
    inline def fromExtendedKey(base58key: String, versions: Versions): typingsJapgolly.scureBip32.mod.HDKey = (^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedKey")(base58key.asInstanceOf[js.Any], versions.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.scureBip32.mod.HDKey]
    
    inline def fromJSON(json: Xpriv): typingsJapgolly.scureBip32.mod.HDKey = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.scureBip32.mod.HDKey]
    
    inline def fromMasterSeed(seed: js.typedarray.Uint8Array): typingsJapgolly.scureBip32.mod.HDKey = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMasterSeed")(seed.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.scureBip32.mod.HDKey]
    inline def fromMasterSeed(seed: js.typedarray.Uint8Array, versions: Versions): typingsJapgolly.scureBip32.mod.HDKey = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMasterSeed")(seed.asInstanceOf[js.Any], versions.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.scureBip32.mod.HDKey]
  }
}
