package typingsJapgolly.bip174

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLibTypeFieldsMod {
  
  @JSImport("bip174/src/lib/typeFields", "GLOBAL_TYPE_NAMES")
  @js.native
  val GLOBAL_TYPE_NAMES: js.Array[String] = js.native
  
  @js.native
  sealed trait GlobalTypes extends StObject
  @JSImport("bip174/src/lib/typeFields", "GlobalTypes")
  @js.native
  object GlobalTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[GlobalTypes & Double] = js.native
    
    @js.native
    sealed trait GLOBAL_XPUB
      extends StObject
         with GlobalTypes
    /* 1 */ val GLOBAL_XPUB: typingsJapgolly.bip174.srcLibTypeFieldsMod.GlobalTypes.GLOBAL_XPUB & Double = js.native
    
    @js.native
    sealed trait UNSIGNED_TX
      extends StObject
         with GlobalTypes
    /* 0 */ val UNSIGNED_TX: typingsJapgolly.bip174.srcLibTypeFieldsMod.GlobalTypes.UNSIGNED_TX & Double = js.native
  }
  
  @JSImport("bip174/src/lib/typeFields", "INPUT_TYPE_NAMES")
  @js.native
  val INPUT_TYPE_NAMES: js.Array[String] = js.native
  
  @js.native
  sealed trait InputTypes extends StObject
  @JSImport("bip174/src/lib/typeFields", "InputTypes")
  @js.native
  object InputTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[InputTypes & Double] = js.native
    
    @js.native
    sealed trait BIP32_DERIVATION
      extends StObject
         with InputTypes
    /* 6 */ val BIP32_DERIVATION: typingsJapgolly.bip174.srcLibTypeFieldsMod.InputTypes.BIP32_DERIVATION & Double = js.native
    
    @js.native
    sealed trait FINAL_SCRIPTSIG
      extends StObject
         with InputTypes
    /* 7 */ val FINAL_SCRIPTSIG: typingsJapgolly.bip174.srcLibTypeFieldsMod.InputTypes.FINAL_SCRIPTSIG & Double = js.native
    
    @js.native
    sealed trait FINAL_SCRIPTWITNESS
      extends StObject
         with InputTypes
    /* 8 */ val FINAL_SCRIPTWITNESS: typingsJapgolly.bip174.srcLibTypeFieldsMod.InputTypes.FINAL_SCRIPTWITNESS & Double = js.native
    
    @js.native
    sealed trait NON_WITNESS_UTXO
      extends StObject
         with InputTypes
    /* 0 */ val NON_WITNESS_UTXO: typingsJapgolly.bip174.srcLibTypeFieldsMod.InputTypes.NON_WITNESS_UTXO & Double = js.native
    
    @js.native
    sealed trait PARTIAL_SIG
      extends StObject
         with InputTypes
    /* 2 */ val PARTIAL_SIG: typingsJapgolly.bip174.srcLibTypeFieldsMod.InputTypes.PARTIAL_SIG & Double = js.native
    
    @js.native
    sealed trait POR_COMMITMENT
      extends StObject
         with InputTypes
    /* 9 */ val POR_COMMITMENT: typingsJapgolly.bip174.srcLibTypeFieldsMod.InputTypes.POR_COMMITMENT & Double = js.native
    
    @js.native
    sealed trait REDEEM_SCRIPT
      extends StObject
         with InputTypes
    /* 4 */ val REDEEM_SCRIPT: typingsJapgolly.bip174.srcLibTypeFieldsMod.InputTypes.REDEEM_SCRIPT & Double = js.native
    
    @js.native
    sealed trait SIGHASH_TYPE
      extends StObject
         with InputTypes
    /* 3 */ val SIGHASH_TYPE: typingsJapgolly.bip174.srcLibTypeFieldsMod.InputTypes.SIGHASH_TYPE & Double = js.native
    
    @js.native
    sealed trait TAP_BIP32_DERIVATION
      extends StObject
         with InputTypes
    /* 22 */ val TAP_BIP32_DERIVATION: typingsJapgolly.bip174.srcLibTypeFieldsMod.InputTypes.TAP_BIP32_DERIVATION & Double = js.native
    
    @js.native
    sealed trait TAP_INTERNAL_KEY
      extends StObject
         with InputTypes
    /* 23 */ val TAP_INTERNAL_KEY: typingsJapgolly.bip174.srcLibTypeFieldsMod.InputTypes.TAP_INTERNAL_KEY & Double = js.native
    
    @js.native
    sealed trait TAP_KEY_SIG
      extends StObject
         with InputTypes
    /* 19 */ val TAP_KEY_SIG: typingsJapgolly.bip174.srcLibTypeFieldsMod.InputTypes.TAP_KEY_SIG & Double = js.native
    
    @js.native
    sealed trait TAP_LEAF_SCRIPT
      extends StObject
         with InputTypes
    /* 21 */ val TAP_LEAF_SCRIPT: typingsJapgolly.bip174.srcLibTypeFieldsMod.InputTypes.TAP_LEAF_SCRIPT & Double = js.native
    
    @js.native
    sealed trait TAP_MERKLE_ROOT
      extends StObject
         with InputTypes
    /* 24 */ val TAP_MERKLE_ROOT: typingsJapgolly.bip174.srcLibTypeFieldsMod.InputTypes.TAP_MERKLE_ROOT & Double = js.native
    
    @js.native
    sealed trait TAP_SCRIPT_SIG
      extends StObject
         with InputTypes
    /* 20 */ val TAP_SCRIPT_SIG: typingsJapgolly.bip174.srcLibTypeFieldsMod.InputTypes.TAP_SCRIPT_SIG & Double = js.native
    
    @js.native
    sealed trait WITNESS_SCRIPT
      extends StObject
         with InputTypes
    /* 5 */ val WITNESS_SCRIPT: typingsJapgolly.bip174.srcLibTypeFieldsMod.InputTypes.WITNESS_SCRIPT & Double = js.native
    
    @js.native
    sealed trait WITNESS_UTXO
      extends StObject
         with InputTypes
    /* 1 */ val WITNESS_UTXO: typingsJapgolly.bip174.srcLibTypeFieldsMod.InputTypes.WITNESS_UTXO & Double = js.native
  }
  
  @JSImport("bip174/src/lib/typeFields", "OUTPUT_TYPE_NAMES")
  @js.native
  val OUTPUT_TYPE_NAMES: js.Array[String] = js.native
  
  @js.native
  sealed trait OutputTypes extends StObject
  @JSImport("bip174/src/lib/typeFields", "OutputTypes")
  @js.native
  object OutputTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[OutputTypes & Double] = js.native
    
    @js.native
    sealed trait BIP32_DERIVATION
      extends StObject
         with OutputTypes
    /* 2 */ val BIP32_DERIVATION: typingsJapgolly.bip174.srcLibTypeFieldsMod.OutputTypes.BIP32_DERIVATION & Double = js.native
    
    @js.native
    sealed trait REDEEM_SCRIPT
      extends StObject
         with OutputTypes
    /* 0 */ val REDEEM_SCRIPT: typingsJapgolly.bip174.srcLibTypeFieldsMod.OutputTypes.REDEEM_SCRIPT & Double = js.native
    
    @js.native
    sealed trait TAP_BIP32_DERIVATION
      extends StObject
         with OutputTypes
    /* 7 */ val TAP_BIP32_DERIVATION: typingsJapgolly.bip174.srcLibTypeFieldsMod.OutputTypes.TAP_BIP32_DERIVATION & Double = js.native
    
    @js.native
    sealed trait TAP_INTERNAL_KEY
      extends StObject
         with OutputTypes
    /* 5 */ val TAP_INTERNAL_KEY: typingsJapgolly.bip174.srcLibTypeFieldsMod.OutputTypes.TAP_INTERNAL_KEY & Double = js.native
    
    @js.native
    sealed trait TAP_TREE
      extends StObject
         with OutputTypes
    /* 6 */ val TAP_TREE: typingsJapgolly.bip174.srcLibTypeFieldsMod.OutputTypes.TAP_TREE & Double = js.native
    
    @js.native
    sealed trait WITNESS_SCRIPT
      extends StObject
         with OutputTypes
    /* 1 */ val WITNESS_SCRIPT: typingsJapgolly.bip174.srcLibTypeFieldsMod.OutputTypes.WITNESS_SCRIPT & Double = js.native
  }
}
