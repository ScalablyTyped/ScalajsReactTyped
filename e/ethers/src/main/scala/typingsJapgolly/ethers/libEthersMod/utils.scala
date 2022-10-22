package typingsJapgolly.ethers.libEthersMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.ethersprojectAbi.anon.Error
import typingsJapgolly.ethersprojectAbi.libAbiCoderMod.CoerceFunc
import typingsJapgolly.ethersprojectAbi.libCodersAbstractCoderMod.Result
import typingsJapgolly.ethersprojectAbi.libFragmentsMod.JsonFragment
import typingsJapgolly.ethersprojectAbi.libFragmentsMod.JsonFragmentType
import typingsJapgolly.ethersprojectAbstractSigner.mod.TypedDataDomain
import typingsJapgolly.ethersprojectAbstractSigner.mod.TypedDataField
import typingsJapgolly.ethersprojectAddress.anon.From
import typingsJapgolly.ethersprojectBasex.mod.BaseX
import typingsJapgolly.ethersprojectBignumber.libBignumberMod.BigNumberish
import typingsJapgolly.ethersprojectBytes.mod.Bytes
import typingsJapgolly.ethersprojectBytes.mod.BytesLike
import typingsJapgolly.ethersprojectBytes.mod.DataOptions
import typingsJapgolly.ethersprojectBytes.mod.Hexable
import typingsJapgolly.ethersprojectBytes.mod.Signature
import typingsJapgolly.ethersprojectBytes.mod.SignatureLike
import typingsJapgolly.ethersprojectHash.anon.Domain
import typingsJapgolly.ethersprojectHdnode.mod.Mnemonic
import typingsJapgolly.ethersprojectLogger.mod.LogLevel
import typingsJapgolly.ethersprojectProperties.mod.Deferrable
import typingsJapgolly.ethersprojectSha2.libTypesMod.SupportedAlgorithm
import typingsJapgolly.ethersprojectStrings.libUtf8Mod.UnicodeNormalizationForm
import typingsJapgolly.ethersprojectStrings.libUtf8Mod.Utf8ErrorFunc
import typingsJapgolly.ethersprojectTransactions.mod.AccessList
import typingsJapgolly.ethersprojectTransactions.mod.AccessListish
import typingsJapgolly.ethersprojectTransactions.mod.Transaction
import typingsJapgolly.ethersprojectTransactions.mod.UnsignedTransaction
import typingsJapgolly.ethersprojectWeb.mod.ConnectionInfo
import typingsJapgolly.ethersprojectWeb.mod.FetchJsonResponse
import typingsJapgolly.ethersprojectWeb.mod.PollOptions
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utils {
  
  @JSImport("ethers/lib/ethers", "utils")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ethers/lib/ethers", "utils.AbiCoder")
  @js.native
  open class AbiCoder ()
    extends typingsJapgolly.ethers.libUtilsMod.AbiCoder {
    def this(coerceFunc: CoerceFunc) = this()
  }
  
  @JSImport("ethers/lib/ethers", "utils.ConstructorFragment")
  @js.native
  open class ConstructorFragment protected ()
    extends typingsJapgolly.ethers.libUtilsMod.ConstructorFragment {
    def this(constructorGuard: Any, params: Any) = this()
  }
  /* static members */
  object ConstructorFragment {
    
    @JSImport("ethers/lib/ethers", "utils.ConstructorFragment")
    @js.native
    val ^ : js.Any = js.native
    
    inline def from(value: String): typingsJapgolly.ethersprojectAbi.libFragmentsMod.ConstructorFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethersprojectAbi.libFragmentsMod.ConstructorFragment]
    inline def from(value: typingsJapgolly.ethersprojectAbi.libFragmentsMod.ConstructorFragment): typingsJapgolly.ethersprojectAbi.libFragmentsMod.ConstructorFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethersprojectAbi.libFragmentsMod.ConstructorFragment]
    inline def from(value: JsonFragment): typingsJapgolly.ethersprojectAbi.libFragmentsMod.ConstructorFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethersprojectAbi.libFragmentsMod.ConstructorFragment]
    
    inline def fromObject(value: typingsJapgolly.ethersprojectAbi.libFragmentsMod.ConstructorFragment): typingsJapgolly.ethersprojectAbi.libFragmentsMod.ConstructorFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethersprojectAbi.libFragmentsMod.ConstructorFragment]
    inline def fromObject(value: JsonFragment): typingsJapgolly.ethersprojectAbi.libFragmentsMod.ConstructorFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethersprojectAbi.libFragmentsMod.ConstructorFragment]
    
    inline def fromString(value: String): typingsJapgolly.ethersprojectAbi.libFragmentsMod.ConstructorFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethersprojectAbi.libFragmentsMod.ConstructorFragment]
    
    inline def isConstructorFragment(value: Any): /* is @ethersproject/abi.@ethersproject/abi/lib/fragments.ConstructorFragment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConstructorFragment")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @ethersproject/abi.@ethersproject/abi/lib/fragments.ConstructorFragment */ Boolean]
  }
  
  @JSImport("ethers/lib/ethers", "utils.ErrorFragment")
  @js.native
  open class ErrorFragment protected ()
    extends typingsJapgolly.ethers.libUtilsMod.ErrorFragment {
    def this(constructorGuard: Any, params: Any) = this()
  }
  /* static members */
  object ErrorFragment {
    
    @JSImport("ethers/lib/ethers", "utils.ErrorFragment")
    @js.native
    val ^ : js.Any = js.native
    
    inline def from(value: String): typingsJapgolly.ethersprojectAbi.libFragmentsMod.ErrorFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethersprojectAbi.libFragmentsMod.ErrorFragment]
    inline def from(value: typingsJapgolly.ethersprojectAbi.libFragmentsMod.ErrorFragment): typingsJapgolly.ethersprojectAbi.libFragmentsMod.ErrorFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethersprojectAbi.libFragmentsMod.ErrorFragment]
    inline def from(value: JsonFragment): typingsJapgolly.ethersprojectAbi.libFragmentsMod.ErrorFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethersprojectAbi.libFragmentsMod.ErrorFragment]
    
    inline def fromObject(value: typingsJapgolly.ethersprojectAbi.libFragmentsMod.ErrorFragment): typingsJapgolly.ethersprojectAbi.libFragmentsMod.ErrorFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethersprojectAbi.libFragmentsMod.ErrorFragment]
    inline def fromObject(value: JsonFragment): typingsJapgolly.ethersprojectAbi.libFragmentsMod.ErrorFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethersprojectAbi.libFragmentsMod.ErrorFragment]
    
    inline def fromString(value: String): typingsJapgolly.ethersprojectAbi.libFragmentsMod.ErrorFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethersprojectAbi.libFragmentsMod.ErrorFragment]
    
    inline def isErrorFragment(value: Any): /* is @ethersproject/abi.@ethersproject/abi/lib/fragments.ErrorFragment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isErrorFragment")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @ethersproject/abi.@ethersproject/abi/lib/fragments.ErrorFragment */ Boolean]
  }
  
  @JSImport("ethers/lib/ethers", "utils.EventFragment")
  @js.native
  open class EventFragment protected ()
    extends typingsJapgolly.ethers.libUtilsMod.EventFragment {
    def this(constructorGuard: Any, params: Any) = this()
  }
  /* static members */
  object EventFragment {
    
    @JSImport("ethers/lib/ethers", "utils.EventFragment")
    @js.native
    val ^ : js.Any = js.native
    
    inline def from(value: String): typingsJapgolly.ethersprojectAbi.libFragmentsMod.EventFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethersprojectAbi.libFragmentsMod.EventFragment]
    inline def from(value: typingsJapgolly.ethersprojectAbi.libFragmentsMod.EventFragment): typingsJapgolly.ethersprojectAbi.libFragmentsMod.EventFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethersprojectAbi.libFragmentsMod.EventFragment]
    inline def from(value: JsonFragment): typingsJapgolly.ethersprojectAbi.libFragmentsMod.EventFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethersprojectAbi.libFragmentsMod.EventFragment]
    
    inline def fromObject(value: typingsJapgolly.ethersprojectAbi.libFragmentsMod.EventFragment): typingsJapgolly.ethersprojectAbi.libFragmentsMod.EventFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethersprojectAbi.libFragmentsMod.EventFragment]
    inline def fromObject(value: JsonFragment): typingsJapgolly.ethersprojectAbi.libFragmentsMod.EventFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethersprojectAbi.libFragmentsMod.EventFragment]
    
    inline def fromString(value: String): typingsJapgolly.ethersprojectAbi.libFragmentsMod.EventFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethersprojectAbi.libFragmentsMod.EventFragment]
    
    inline def isEventFragment(value: Any): /* is @ethersproject/abi.@ethersproject/abi/lib/fragments.EventFragment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEventFragment")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @ethersproject/abi.@ethersproject/abi/lib/fragments.EventFragment */ Boolean]
  }
  
  /* note: abstract class */ @JSImport("ethers/lib/ethers", "utils.Fragment")
  @js.native
  open class Fragment protected ()
    extends typingsJapgolly.ethers.libUtilsMod.Fragment {
    def this(constructorGuard: Any, params: Any) = this()
  }
  /* static members */
  object Fragment {
    
    @JSImport("ethers/lib/ethers", "utils.Fragment")
    @js.native
    val ^ : js.Any = js.native
    
    inline def from(value: String): typingsJapgolly.ethersprojectAbi.libFragmentsMod.Fragment = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethersprojectAbi.libFragmentsMod.Fragment]
    inline def from(value: typingsJapgolly.ethersprojectAbi.libFragmentsMod.Fragment): typingsJapgolly.ethersprojectAbi.libFragmentsMod.Fragment = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethersprojectAbi.libFragmentsMod.Fragment]
    inline def from(value: JsonFragment): typingsJapgolly.ethersprojectAbi.libFragmentsMod.Fragment = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethersprojectAbi.libFragmentsMod.Fragment]
    
    inline def fromObject(value: typingsJapgolly.ethersprojectAbi.libFragmentsMod.Fragment): typingsJapgolly.ethersprojectAbi.libFragmentsMod.Fragment = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethersprojectAbi.libFragmentsMod.Fragment]
    inline def fromObject(value: JsonFragment): typingsJapgolly.ethersprojectAbi.libFragmentsMod.Fragment = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethersprojectAbi.libFragmentsMod.Fragment]
    
    inline def fromString(value: String): typingsJapgolly.ethersprojectAbi.libFragmentsMod.Fragment = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethersprojectAbi.libFragmentsMod.Fragment]
    
    inline def isFragment(value: Any): /* is @ethersproject/abi.@ethersproject/abi/lib/fragments.Fragment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFragment")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @ethersproject/abi.@ethersproject/abi/lib/fragments.Fragment */ Boolean]
  }
  
  @JSImport("ethers/lib/ethers", "utils.FunctionFragment")
  @js.native
  open class FunctionFragment protected ()
    extends typingsJapgolly.ethers.libUtilsMod.FunctionFragment {
    def this(constructorGuard: Any, params: Any) = this()
  }
  /* static members */
  object FunctionFragment {
    
    @JSImport("ethers/lib/ethers", "utils.FunctionFragment")
    @js.native
    val ^ : js.Any = js.native
    
    inline def from(value: String): typingsJapgolly.ethersprojectAbi.libFragmentsMod.FunctionFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethersprojectAbi.libFragmentsMod.FunctionFragment]
    inline def from(value: typingsJapgolly.ethersprojectAbi.libFragmentsMod.FunctionFragment): typingsJapgolly.ethersprojectAbi.libFragmentsMod.FunctionFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethersprojectAbi.libFragmentsMod.FunctionFragment]
    inline def from(value: JsonFragment): typingsJapgolly.ethersprojectAbi.libFragmentsMod.FunctionFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethersprojectAbi.libFragmentsMod.FunctionFragment]
    
    inline def fromObject(value: typingsJapgolly.ethersprojectAbi.libFragmentsMod.FunctionFragment): typingsJapgolly.ethersprojectAbi.libFragmentsMod.FunctionFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethersprojectAbi.libFragmentsMod.FunctionFragment]
    inline def fromObject(value: JsonFragment): typingsJapgolly.ethersprojectAbi.libFragmentsMod.FunctionFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethersprojectAbi.libFragmentsMod.FunctionFragment]
    
    inline def fromString(value: String): typingsJapgolly.ethersprojectAbi.libFragmentsMod.FunctionFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethersprojectAbi.libFragmentsMod.FunctionFragment]
    
    inline def isFunctionFragment(value: Any): /* is @ethersproject/abi.@ethersproject/abi/lib/fragments.FunctionFragment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunctionFragment")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @ethersproject/abi.@ethersproject/abi/lib/fragments.FunctionFragment */ Boolean]
  }
  
  @JSImport("ethers/lib/ethers", "utils.HDNode")
  @js.native
  open class HDNode protected ()
    extends typingsJapgolly.ethers.libUtilsMod.HDNode {
    def this(
      constructorGuard: Any,
      privateKey: String,
      publicKey: String,
      parentFingerprint: String,
      chainCode: String,
      index: Double,
      depth: Double,
      mnemonicOrPath: String
    ) = this()
    /**
      *  This constructor should not be called directly.
      *
      *  Please use:
      *   - fromMnemonic
      *   - fromSeed
      */
    def this(
      constructorGuard: Any,
      privateKey: String,
      publicKey: String,
      parentFingerprint: String,
      chainCode: String,
      index: Double,
      depth: Double,
      mnemonicOrPath: Mnemonic
    ) = this()
  }
  /* static members */
  object HDNode {
    
    @JSImport("ethers/lib/ethers", "utils.HDNode")
    @js.native
    val ^ : js.Any = js.native
    
    inline def _fromSeed(seed: BytesLike, mnemonic: Mnemonic): typingsJapgolly.ethersprojectHdnode.mod.HDNode = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromSeed")(seed.asInstanceOf[js.Any], mnemonic.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ethersprojectHdnode.mod.HDNode]
    
    inline def fromExtendedKey(extendedKey: String): typingsJapgolly.ethersprojectHdnode.mod.HDNode = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedKey")(extendedKey.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethersprojectHdnode.mod.HDNode]
    
    inline def fromMnemonic(mnemonic: String): typingsJapgolly.ethersprojectHdnode.mod.HDNode = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMnemonic")(mnemonic.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethersprojectHdnode.mod.HDNode]
    inline def fromMnemonic(mnemonic: String, password: String): typingsJapgolly.ethersprojectHdnode.mod.HDNode = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMnemonic")(mnemonic.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ethersprojectHdnode.mod.HDNode]
    inline def fromMnemonic(mnemonic: String, password: String, wordlist: String): typingsJapgolly.ethersprojectHdnode.mod.HDNode = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMnemonic")(mnemonic.asInstanceOf[js.Any], password.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ethersprojectHdnode.mod.HDNode]
    inline def fromMnemonic(mnemonic: String, password: String, wordlist: typingsJapgolly.ethersprojectWordlists.mod.Wordlist): typingsJapgolly.ethersprojectHdnode.mod.HDNode = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMnemonic")(mnemonic.asInstanceOf[js.Any], password.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ethersprojectHdnode.mod.HDNode]
    inline def fromMnemonic(mnemonic: String, password: Unit, wordlist: String): typingsJapgolly.ethersprojectHdnode.mod.HDNode = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMnemonic")(mnemonic.asInstanceOf[js.Any], password.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ethersprojectHdnode.mod.HDNode]
    inline def fromMnemonic(mnemonic: String, password: Unit, wordlist: typingsJapgolly.ethersprojectWordlists.mod.Wordlist): typingsJapgolly.ethersprojectHdnode.mod.HDNode = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMnemonic")(mnemonic.asInstanceOf[js.Any], password.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ethersprojectHdnode.mod.HDNode]
    
    inline def fromSeed(seed: BytesLike): typingsJapgolly.ethersprojectHdnode.mod.HDNode = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSeed")(seed.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethersprojectHdnode.mod.HDNode]
  }
  
  @JSImport("ethers/lib/ethers", "utils.Indexed")
  @js.native
  open class Indexed protected ()
    extends typingsJapgolly.ethers.libUtilsMod.Indexed {
    def this(info: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof @ethersproject/abi.@ethersproject/abi/lib/interface.Indexed ]: @ethersproject/abi.@ethersproject/abi/lib/interface.Indexed[K]} */ js.Any) = this()
  }
  /* static members */
  object Indexed {
    
    @JSImport("ethers/lib/ethers", "utils.Indexed")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isIndexed(value: Any): /* is @ethersproject/abi.@ethersproject/abi/lib/interface.Indexed */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIndexed")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @ethersproject/abi.@ethersproject/abi/lib/interface.Indexed */ Boolean]
  }
  
  @JSImport("ethers/lib/ethers", "utils.Interface")
  @js.native
  open class Interface protected ()
    extends typingsJapgolly.ethers.libUtilsMod.Interface {
    def this(fragments: String) = this()
    def this(fragments: js.Array[
            typingsJapgolly.ethersprojectAbi.libFragmentsMod.Fragment | JsonFragment | String
          ]) = this()
  }
  /* static members */
  object Interface {
    
    @JSImport("ethers/lib/ethers", "utils.Interface")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getAbiCoder(): typingsJapgolly.ethersprojectAbi.libAbiCoderMod.AbiCoder = ^.asInstanceOf[js.Dynamic].applyDynamic("getAbiCoder")().asInstanceOf[typingsJapgolly.ethersprojectAbi.libAbiCoderMod.AbiCoder]
    
    inline def getAddress(address: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAddress")(address.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def getEventTopic(eventFragment: typingsJapgolly.ethersprojectAbi.libFragmentsMod.EventFragment): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getEventTopic")(eventFragment.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def getSighash(fragment: typingsJapgolly.ethersprojectAbi.libFragmentsMod.ErrorFragment): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSighash")(fragment.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def getSighash(fragment: typingsJapgolly.ethersprojectAbi.libFragmentsMod.FunctionFragment): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSighash")(fragment.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def isInterface(value: Any): /* is @ethersproject/abi.@ethersproject/abi/lib/interface.Interface */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInterface")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @ethersproject/abi.@ethersproject/abi/lib/interface.Interface */ Boolean]
  }
  
  @JSImport("ethers/lib/ethers", "utils.LogDescription")
  @js.native
  open class LogDescription protected ()
    extends typingsJapgolly.ethers.libUtilsMod.LogDescription {
    def this(info: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof @ethersproject/abi.@ethersproject/abi/lib/interface.LogDescription ]: @ethersproject/abi.@ethersproject/abi/lib/interface.LogDescription[K]} */ js.Any) = this()
  }
  
  @JSImport("ethers/lib/ethers", "utils.Logger")
  @js.native
  open class Logger protected ()
    extends typingsJapgolly.ethers.libUtilsMod.Logger {
    def this(version: String) = this()
  }
  /* static members */
  object Logger {
    
    @JSImport("ethers/lib/ethers", "utils.Logger")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ethers/lib/ethers", "utils.Logger.errors")
    @js.native
    def errors: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ErrorCode */ Any = js.native
    inline def errors_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ErrorCode */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("errors")(x.asInstanceOf[js.Any])
    
    inline def from(version: String): typingsJapgolly.ethersprojectLogger.mod.Logger = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(version.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethersprojectLogger.mod.Logger]
    
    inline def globalLogger(): typingsJapgolly.ethersprojectLogger.mod.Logger = ^.asInstanceOf[js.Dynamic].applyDynamic("globalLogger")().asInstanceOf[typingsJapgolly.ethersprojectLogger.mod.Logger]
    
    @JSImport("ethers/lib/ethers", "utils.Logger.levels")
    @js.native
    def levels: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel */ Any = js.native
    inline def levels_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("levels")(x.asInstanceOf[js.Any])
    
    inline def setCensorship(censorship: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setCensorship")(censorship.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def setCensorship(censorship: Boolean, permanent: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCensorship")(censorship.asInstanceOf[js.Any], permanent.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setLogLevel(logLevel: LogLevel): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogLevel")(logLevel.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSImport("ethers/lib/ethers", "utils.ParamType")
  @js.native
  open class ParamType protected ()
    extends typingsJapgolly.ethers.libUtilsMod.ParamType {
    def this(constructorGuard: Any, params: Any) = this()
  }
  /* static members */
  object ParamType {
    
    @JSImport("ethers/lib/ethers", "utils.ParamType")
    @js.native
    val ^ : js.Any = js.native
    
    inline def from(value: String): typingsJapgolly.ethersprojectAbi.libFragmentsMod.ParamType = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethersprojectAbi.libFragmentsMod.ParamType]
    inline def from(value: String, allowIndexed: Boolean): typingsJapgolly.ethersprojectAbi.libFragmentsMod.ParamType = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any], allowIndexed.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ethersprojectAbi.libFragmentsMod.ParamType]
    inline def from(value: JsonFragmentType): typingsJapgolly.ethersprojectAbi.libFragmentsMod.ParamType = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethersprojectAbi.libFragmentsMod.ParamType]
    inline def from(value: JsonFragmentType, allowIndexed: Boolean): typingsJapgolly.ethersprojectAbi.libFragmentsMod.ParamType = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any], allowIndexed.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ethersprojectAbi.libFragmentsMod.ParamType]
    inline def from(value: typingsJapgolly.ethersprojectAbi.libFragmentsMod.ParamType): typingsJapgolly.ethersprojectAbi.libFragmentsMod.ParamType = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethersprojectAbi.libFragmentsMod.ParamType]
    inline def from(value: typingsJapgolly.ethersprojectAbi.libFragmentsMod.ParamType, allowIndexed: Boolean): typingsJapgolly.ethersprojectAbi.libFragmentsMod.ParamType = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any], allowIndexed.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ethersprojectAbi.libFragmentsMod.ParamType]
    
    inline def fromObject(value: JsonFragmentType): typingsJapgolly.ethersprojectAbi.libFragmentsMod.ParamType = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethersprojectAbi.libFragmentsMod.ParamType]
    inline def fromObject(value: typingsJapgolly.ethersprojectAbi.libFragmentsMod.ParamType): typingsJapgolly.ethersprojectAbi.libFragmentsMod.ParamType = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethersprojectAbi.libFragmentsMod.ParamType]
    
    inline def fromString(value: String): typingsJapgolly.ethersprojectAbi.libFragmentsMod.ParamType = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethersprojectAbi.libFragmentsMod.ParamType]
    inline def fromString(value: String, allowIndexed: Boolean): typingsJapgolly.ethersprojectAbi.libFragmentsMod.ParamType = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(value.asInstanceOf[js.Any], allowIndexed.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ethersprojectAbi.libFragmentsMod.ParamType]
    
    inline def isParamType(value: Any): /* is @ethersproject/abi.@ethersproject/abi/lib/fragments.ParamType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isParamType")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @ethersproject/abi.@ethersproject/abi/lib/fragments.ParamType */ Boolean]
  }
  
  object RLP {
    
    @JSImport("ethers/lib/ethers", "utils.RLP")
    @js.native
    val ^ : js.Any = js.native
    
    inline def decode(data: BytesLike): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def encode(`object`: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  @JSImport("ethers/lib/ethers", "utils.SigningKey")
  @js.native
  open class SigningKey protected ()
    extends typingsJapgolly.ethers.libUtilsMod.SigningKey {
    def this(privateKey: BytesLike) = this()
  }
  /* static members */
  object SigningKey {
    
    @JSImport("ethers/lib/ethers", "utils.SigningKey")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isSigningKey(value: Any): /* is @ethersproject/signing-key.@ethersproject/signing-key.SigningKey */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSigningKey")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @ethersproject/signing-key.@ethersproject/signing-key.SigningKey */ Boolean]
  }
  
  @JSImport("ethers/lib/ethers", "utils.SupportedAlgorithm")
  @js.native
  object SupportedAlgorithm extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.ethersprojectSha2.libTypesMod.SupportedAlgorithm & String] = js.native
    
    /* "sha256" */ val sha256: typingsJapgolly.ethersprojectSha2.libTypesMod.SupportedAlgorithm.sha256 & String = js.native
    
    /* "sha512" */ val sha512: typingsJapgolly.ethersprojectSha2.libTypesMod.SupportedAlgorithm.sha512 & String = js.native
  }
  
  @JSImport("ethers/lib/ethers", "utils.TransactionDescription")
  @js.native
  open class TransactionDescription protected ()
    extends typingsJapgolly.ethers.libUtilsMod.TransactionDescription {
    def this(info: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof @ethersproject/abi.@ethersproject/abi/lib/interface.TransactionDescription ]: @ethersproject/abi.@ethersproject/abi/lib/interface.TransactionDescription[K]} */ js.Any) = this()
  }
  
  @JSImport("ethers/lib/ethers", "utils.TransactionTypes")
  @js.native
  object TransactionTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ethersprojectTransactions.mod.TransactionTypes & Double] = js.native
    
    /* 2 */ val eip1559: typingsJapgolly.ethersprojectTransactions.mod.TransactionTypes.eip1559 & Double = js.native
    
    /* 1 */ val eip2930: typingsJapgolly.ethersprojectTransactions.mod.TransactionTypes.eip2930 & Double = js.native
    
    /* 0 */ val legacy: typingsJapgolly.ethersprojectTransactions.mod.TransactionTypes.legacy & Double = js.native
  }
  
  @JSImport("ethers/lib/ethers", "utils._TypedDataEncoder")
  @js.native
  open class TypedDataEncoder protected ()
    extends typingsJapgolly.ethers.libUtilsMod.TypedDataEncoder {
    def this(types: Record[String, js.Array[TypedDataField]]) = this()
  }
  /* static members */
  object TypedDataEncoder {
    
    @JSImport("ethers/lib/ethers", "utils._TypedDataEncoder")
    @js.native
    val ^ : js.Any = js.native
    
    inline def encode(
      domain: TypedDataDomain,
      types: Record[String, js.Array[TypedDataField]],
      value: Record[String, Any]
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(domain.asInstanceOf[js.Any], types.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def from(types: Record[String, js.Array[TypedDataField]]): typingsJapgolly.ethersprojectHash.libTypedDataMod.TypedDataEncoder = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(types.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethersprojectHash.libTypedDataMod.TypedDataEncoder]
    
    inline def getPayload(
      domain: TypedDataDomain,
      types: Record[String, js.Array[TypedDataField]],
      value: Record[String, Any]
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPayload")(domain.asInstanceOf[js.Any], types.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def getPrimaryType(types: Record[String, js.Array[TypedDataField]]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPrimaryType")(types.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def hash(
      domain: TypedDataDomain,
      types: Record[String, js.Array[TypedDataField]],
      value: Record[String, Any]
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(domain.asInstanceOf[js.Any], types.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def hashDomain(domain: TypedDataDomain): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hashDomain")(domain.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def hashStruct(name: String, types: Record[String, js.Array[TypedDataField]], value: Record[String, Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hashStruct")(name.asInstanceOf[js.Any], types.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def resolveNames(
      domain: TypedDataDomain,
      types: Record[String, js.Array[TypedDataField]],
      value: Record[String, Any],
      resolveName: js.Function1[/* name */ String, js.Promise[String]]
    ): js.Promise[Domain] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveNames")(domain.asInstanceOf[js.Any], types.asInstanceOf[js.Any], value.asInstanceOf[js.Any], resolveName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Domain]]
  }
  
  @JSImport("ethers/lib/ethers", "utils.UnicodeNormalizationForm")
  @js.native
  object UnicodeNormalizationForm extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.ethersprojectStrings.libUtf8Mod.UnicodeNormalizationForm & String
      ] = js.native
    
    /* "NFC" */ val NFC: typingsJapgolly.ethersprojectStrings.libUtf8Mod.UnicodeNormalizationForm.NFC & String = js.native
    
    /* "NFD" */ val NFD: typingsJapgolly.ethersprojectStrings.libUtf8Mod.UnicodeNormalizationForm.NFD & String = js.native
    
    /* "NFKC" */ val NFKC: typingsJapgolly.ethersprojectStrings.libUtf8Mod.UnicodeNormalizationForm.NFKC & String = js.native
    
    /* "NFKD" */ val NFKD: typingsJapgolly.ethersprojectStrings.libUtf8Mod.UnicodeNormalizationForm.NFKD & String = js.native
    
    /* "" */ val current: typingsJapgolly.ethersprojectStrings.libUtf8Mod.UnicodeNormalizationForm.current & String = js.native
  }
  
  @JSImport("ethers/lib/ethers", "utils.Utf8ErrorReason")
  @js.native
  object Utf8ErrorReason extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.ethersprojectStrings.libUtf8Mod.Utf8ErrorReason & String] = js.native
    
    /* "bad codepoint prefix" */ val BAD_PREFIX: typingsJapgolly.ethersprojectStrings.libUtf8Mod.Utf8ErrorReason.BAD_PREFIX & String = js.native
    
    /* "missing continuation byte" */ val MISSING_CONTINUE: typingsJapgolly.ethersprojectStrings.libUtf8Mod.Utf8ErrorReason.MISSING_CONTINUE & String = js.native
    
    /* "out of UTF-8 range" */ val OUT_OF_RANGE: typingsJapgolly.ethersprojectStrings.libUtf8Mod.Utf8ErrorReason.OUT_OF_RANGE & String = js.native
    
    /* "overlong representation" */ val OVERLONG: typingsJapgolly.ethersprojectStrings.libUtf8Mod.Utf8ErrorReason.OVERLONG & String = js.native
    
    /* "string overrun" */ val OVERRUN: typingsJapgolly.ethersprojectStrings.libUtf8Mod.Utf8ErrorReason.OVERRUN & String = js.native
    
    /* "unexpected continuation byte" */ val UNEXPECTED_CONTINUE: typingsJapgolly.ethersprojectStrings.libUtf8Mod.Utf8ErrorReason.UNEXPECTED_CONTINUE & String = js.native
    
    /* "UTF-16 surrogate" */ val UTF16_SURROGATE: typingsJapgolly.ethersprojectStrings.libUtf8Mod.Utf8ErrorReason.UTF16_SURROGATE & String = js.native
  }
  
  inline def accessListify(value: AccessListish): AccessList = ^.asInstanceOf[js.Dynamic].applyDynamic("accessListify")(value.asInstanceOf[js.Any]).asInstanceOf[AccessList]
  
  inline def arrayify(value: Double): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayify")(value.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def arrayify(value: Double, options: DataOptions): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayify")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def arrayify(value: BytesLike): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayify")(value.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def arrayify(value: BytesLike, options: DataOptions): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayify")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def arrayify(value: Hexable): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayify")(value.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def arrayify(value: Hexable, options: DataOptions): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayify")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @JSImport("ethers/lib/ethers", "utils.base58")
  @js.native
  val base58: BaseX = js.native
  
  object base64 {
    
    @JSImport("ethers/lib/ethers", "utils.base64")
    @js.native
    val ^ : js.Any = js.native
    
    inline def decode(textData: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(textData.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def encode(data: BytesLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  inline def checkProperties(`object`: Any, properties: StringDictionary[Boolean]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkProperties")(`object`.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def checkResultErrors(result: Result): js.Array[Error] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkResultErrors")(result.asInstanceOf[js.Any]).asInstanceOf[js.Array[Error]]
  
  inline def commify(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("commify")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def commify(value: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("commify")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def computeAddress(key: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("computeAddress")(key.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def computeAddress(key: BytesLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("computeAddress")(key.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def computeHmac(algorithm: SupportedAlgorithm, key: BytesLike, data: BytesLike): String = (^.asInstanceOf[js.Dynamic].applyDynamic("computeHmac")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def computePublicKey(key: BytesLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("computePublicKey")(key.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def computePublicKey(key: BytesLike, compressed: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("computePublicKey")(key.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def concat(items: js.Array[BytesLike]): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(items.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def deepCopy[T](`object`: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("deepCopy")(`object`.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @JSImport("ethers/lib/ethers", "utils.defaultAbiCoder")
  @js.native
  val defaultAbiCoder: typingsJapgolly.ethersprojectAbi.libAbiCoderMod.AbiCoder = js.native
  
  @JSImport("ethers/lib/ethers", "utils.defaultPath")
  @js.native
  val defaultPath: /* "m/44'/60'/0'/0/0" */ String = js.native
  
  inline def defineReadOnly[T, K /* <: /* keyof T */ String */](
    `object`: T,
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineReadOnly")(`object`.asInstanceOf[js.Any], name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def dnsEncode(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dnsEncode")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def entropyToMnemonic(entropy: BytesLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("entropyToMnemonic")(entropy.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def entropyToMnemonic(entropy: BytesLike, wordlist: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("entropyToMnemonic")(entropy.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def entropyToMnemonic(entropy: BytesLike, wordlist: typingsJapgolly.ethersprojectWordlists.mod.Wordlist): String = (^.asInstanceOf[js.Dynamic].applyDynamic("entropyToMnemonic")(entropy.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def fetchData[T](connection: String): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("_fetchData")(connection.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  inline def fetchData[T](connection: String, body: js.typedarray.Uint8Array): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("_fetchData")(connection.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def fetchData[T](
    connection: String,
    body: js.typedarray.Uint8Array,
    processFunc: js.Function2[/* value */ js.typedarray.Uint8Array, /* response */ FetchJsonResponse, T]
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("_fetchData")(connection.asInstanceOf[js.Any], body.asInstanceOf[js.Any], processFunc.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def fetchData[T](
    connection: String,
    body: Unit,
    processFunc: js.Function2[/* value */ js.typedarray.Uint8Array, /* response */ FetchJsonResponse, T]
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("_fetchData")(connection.asInstanceOf[js.Any], body.asInstanceOf[js.Any], processFunc.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def fetchData[T](connection: ConnectionInfo): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("_fetchData")(connection.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  inline def fetchData[T](connection: ConnectionInfo, body: js.typedarray.Uint8Array): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("_fetchData")(connection.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def fetchData[T](
    connection: ConnectionInfo,
    body: js.typedarray.Uint8Array,
    processFunc: js.Function2[/* value */ js.typedarray.Uint8Array, /* response */ FetchJsonResponse, T]
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("_fetchData")(connection.asInstanceOf[js.Any], body.asInstanceOf[js.Any], processFunc.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def fetchData[T](
    connection: ConnectionInfo,
    body: Unit,
    processFunc: js.Function2[/* value */ js.typedarray.Uint8Array, /* response */ FetchJsonResponse, T]
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("_fetchData")(connection.asInstanceOf[js.Any], body.asInstanceOf[js.Any], processFunc.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  inline def fetchJson(connection: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchJson")(connection.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def fetchJson(connection: String, json: String): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchJson")(connection.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def fetchJson(
    connection: String,
    json: String,
    processFunc: js.Function2[/* value */ Any, /* response */ FetchJsonResponse, Any]
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchJson")(connection.asInstanceOf[js.Any], json.asInstanceOf[js.Any], processFunc.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def fetchJson(
    connection: String,
    json: Unit,
    processFunc: js.Function2[/* value */ Any, /* response */ FetchJsonResponse, Any]
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchJson")(connection.asInstanceOf[js.Any], json.asInstanceOf[js.Any], processFunc.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def fetchJson(connection: ConnectionInfo): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchJson")(connection.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def fetchJson(connection: ConnectionInfo, json: String): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchJson")(connection.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def fetchJson(
    connection: ConnectionInfo,
    json: String,
    processFunc: js.Function2[/* value */ Any, /* response */ FetchJsonResponse, Any]
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchJson")(connection.asInstanceOf[js.Any], json.asInstanceOf[js.Any], processFunc.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def fetchJson(
    connection: ConnectionInfo,
    json: Unit,
    processFunc: js.Function2[/* value */ Any, /* response */ FetchJsonResponse, Any]
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchJson")(connection.asInstanceOf[js.Any], json.asInstanceOf[js.Any], processFunc.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def formatBytes32String(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatBytes32String")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def formatEther(wei: BigNumberish): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatEther")(wei.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def formatUnits(value: BigNumberish): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatUnits")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def formatUnits(value: BigNumberish, unitName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatUnits")(value.asInstanceOf[js.Any], unitName.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatUnits(value: BigNumberish, unitName: BigNumberish): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatUnits")(value.asInstanceOf[js.Any], unitName.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getAccountPath(index: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAccountPath")(index.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getAddress(address: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAddress")(address.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getContractAddress(transaction: From): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getContractAddress")(transaction.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getCreate2Address(from: String, salt: BytesLike, initCodeHash: BytesLike): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getCreate2Address")(from.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], initCodeHash.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getIcapAddress(address: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getIcapAddress")(address.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getJsonWalletAddress(json: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getJsonWalletAddress")(json.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getStatic[T](ctor: Any, key: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("getStatic")(ctor.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def hashMessage(message: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hashMessage")(message.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def hashMessage(message: Bytes): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hashMessage")(message.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hexConcat(items: js.Array[BytesLike]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hexConcat")(items.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hexDataLength(data: BytesLike): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("hexDataLength")(data.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def hexDataSlice(data: BytesLike, offset: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hexDataSlice")(data.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def hexDataSlice(data: BytesLike, offset: Double, endOffset: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hexDataSlice")(data.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], endOffset.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def hexStripZeros(value: BytesLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hexStripZeros")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hexValue(value: js.BigInt): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hexValue")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def hexValue(value: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hexValue")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def hexValue(value: BytesLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hexValue")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def hexValue(value: Hexable): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hexValue")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hexZeroPad(value: BytesLike, length: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hexZeroPad")(value.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def hexlify(value: js.BigInt): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hexlify")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def hexlify(value: js.BigInt, options: DataOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hexlify")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def hexlify(value: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hexlify")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def hexlify(value: Double, options: DataOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hexlify")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def hexlify(value: BytesLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hexlify")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def hexlify(value: BytesLike, options: DataOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hexlify")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def hexlify(value: Hexable): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hexlify")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def hexlify(value: Hexable, options: DataOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hexlify")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def id(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("id")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isAddress(address: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAddress")(address.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isBytes(value: Any): /* is @ethersproject/bytes.@ethersproject/bytes.Bytes */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBytes")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @ethersproject/bytes.@ethersproject/bytes.Bytes */ Boolean]
  
  inline def isBytesLike(value: Any): /* is @ethersproject/bytes.@ethersproject/bytes.BytesLike */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBytesLike")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @ethersproject/bytes.@ethersproject/bytes.BytesLike */ Boolean]
  
  inline def isHexString(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHexString")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isHexString(value: Any, length: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isHexString")(value.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isValidMnemonic(mnemonic: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidMnemonic")(mnemonic.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isValidMnemonic(mnemonic: String, wordlist: typingsJapgolly.ethersprojectWordlists.mod.Wordlist): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidMnemonic")(mnemonic.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isValidName(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidName")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def joinSignature(signature: SignatureLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("joinSignature")(signature.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def keccak256(data: BytesLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("keccak256")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def mnemonicToEntropy(mnemonic: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("mnemonicToEntropy")(mnemonic.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def mnemonicToEntropy(mnemonic: String, wordlist: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mnemonicToEntropy")(mnemonic.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def mnemonicToEntropy(mnemonic: String, wordlist: typingsJapgolly.ethersprojectWordlists.mod.Wordlist): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mnemonicToEntropy")(mnemonic.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def mnemonicToSeed(mnemonic: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("mnemonicToSeed")(mnemonic.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def mnemonicToSeed(mnemonic: String, password: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mnemonicToSeed")(mnemonic.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def namehash(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("namehash")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def nameprep(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("nameprep")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parseBytes32String(bytes: BytesLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parseBytes32String")(bytes.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parseEther(ether: String): typingsJapgolly.ethersprojectBignumber.mod.BigNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("parseEther")(ether.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethersprojectBignumber.mod.BigNumber]
  
  inline def parseTransaction(rawTransaction: BytesLike): Transaction = ^.asInstanceOf[js.Dynamic].applyDynamic("parseTransaction")(rawTransaction.asInstanceOf[js.Any]).asInstanceOf[Transaction]
  
  inline def parseUnits(value: String): typingsJapgolly.ethersprojectBignumber.mod.BigNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("parseUnits")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethersprojectBignumber.mod.BigNumber]
  inline def parseUnits(value: String, unitName: BigNumberish): typingsJapgolly.ethersprojectBignumber.mod.BigNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("parseUnits")(value.asInstanceOf[js.Any], unitName.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ethersprojectBignumber.mod.BigNumber]
  
  inline def poll[T](func: js.Function0[js.Promise[T]]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("poll")(func.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  inline def poll[T](func: js.Function0[js.Promise[T]], options: PollOptions): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("poll")(func.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  inline def randomBytes(length: Double): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("randomBytes")(length.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def recoverAddress(digest: BytesLike, signature: SignatureLike): String = (^.asInstanceOf[js.Dynamic].applyDynamic("recoverAddress")(digest.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def recoverPublicKey(digest: BytesLike, signature: SignatureLike): String = (^.asInstanceOf[js.Dynamic].applyDynamic("recoverPublicKey")(digest.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def resolveProperties[T](`object`: Deferrable[T]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveProperties")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  
  inline def ripemd160(data: BytesLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ripemd160")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def serializeTransaction(transaction: UnsignedTransaction): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeTransaction")(transaction.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def serializeTransaction(transaction: UnsignedTransaction, signature: SignatureLike): String = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeTransaction")(transaction.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def sha256(data: BytesLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sha256")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def sha512(data: BytesLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sha512")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def shallowCopy[T](`object`: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowCopy")(`object`.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def shuffled(array: js.Array[Any]): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("shuffled")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def solidityKeccak256(types: js.Array[String], values: js.Array[Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("solidityKeccak256")(types.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def solidityPack(types: js.Array[String], values: js.Array[Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("solidityPack")(types.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def soliditySha256(types: js.Array[String], values: js.Array[Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("soliditySha256")(types.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def splitSignature(signature: SignatureLike): Signature = ^.asInstanceOf[js.Dynamic].applyDynamic("splitSignature")(signature.asInstanceOf[js.Any]).asInstanceOf[Signature]
  
  inline def stripZeros(value: BytesLike): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("stripZeros")(value.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def toEscapedUtf8String(bytes: BytesLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_toEscapedUtf8String")(bytes.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toEscapedUtf8String(bytes: BytesLike, onError: Utf8ErrorFunc): String = (^.asInstanceOf[js.Dynamic].applyDynamic("_toEscapedUtf8String")(bytes.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def toUtf8Bytes(str: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("toUtf8Bytes")(str.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def toUtf8Bytes(str: String, form: UnicodeNormalizationForm): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("toUtf8Bytes")(str.asInstanceOf[js.Any], form.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def toUtf8CodePoints(str: String): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("toUtf8CodePoints")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def toUtf8CodePoints(str: String, form: UnicodeNormalizationForm): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("toUtf8CodePoints")(str.asInstanceOf[js.Any], form.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def toUtf8String(bytes: BytesLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toUtf8String")(bytes.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toUtf8String(bytes: BytesLike, onError: Utf8ErrorFunc): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toUtf8String")(bytes.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def verifyMessage(message: String, signature: SignatureLike): String = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyMessage")(message.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def verifyMessage(message: Bytes, signature: SignatureLike): String = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyMessage")(message.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def verifyTypedData(
    domain: TypedDataDomain,
    types: Record[String, js.Array[TypedDataField]],
    value: Record[String, Any],
    signature: SignatureLike
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyTypedData")(domain.asInstanceOf[js.Any], types.asInstanceOf[js.Any], value.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def zeroPad(value: BytesLike, length: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("zeroPad")(value.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
}
