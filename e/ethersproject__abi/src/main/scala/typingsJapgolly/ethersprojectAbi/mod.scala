package typingsJapgolly.ethersprojectAbi

import typingsJapgolly.ethersprojectAbi.anon.Error
import typingsJapgolly.ethersprojectAbi.libAbiCoderMod.CoerceFunc
import typingsJapgolly.ethersprojectAbi.libCodersAbstractCoderMod.Result
import typingsJapgolly.ethersprojectAbi.libFragmentsMod.JsonFragment
import typingsJapgolly.ethersprojectAbi.libFragmentsMod.JsonFragmentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ethersproject/abi", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ethersproject/abi", "AbiCoder")
  @js.native
  open class AbiCoder ()
    extends typingsJapgolly.ethersprojectAbi.libAbiCoderMod.AbiCoder {
    def this(coerceFunc: CoerceFunc) = this()
  }
  
  @JSImport("@ethersproject/abi", "ConstructorFragment")
  @js.native
  open class ConstructorFragment protected ()
    extends typingsJapgolly.ethersprojectAbi.libFragmentsMod.ConstructorFragment {
    def this(constructorGuard: Any, params: Any) = this()
  }
  /* static members */
  object ConstructorFragment {
    
    @JSImport("@ethersproject/abi", "ConstructorFragment")
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
  
  @JSImport("@ethersproject/abi", "ErrorFragment")
  @js.native
  open class ErrorFragment protected ()
    extends typingsJapgolly.ethersprojectAbi.libFragmentsMod.ErrorFragment {
    def this(constructorGuard: Any, params: Any) = this()
  }
  /* static members */
  object ErrorFragment {
    
    @JSImport("@ethersproject/abi", "ErrorFragment")
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
  
  @JSImport("@ethersproject/abi", "EventFragment")
  @js.native
  open class EventFragment protected ()
    extends typingsJapgolly.ethersprojectAbi.libFragmentsMod.EventFragment {
    def this(constructorGuard: Any, params: Any) = this()
  }
  /* static members */
  object EventFragment {
    
    @JSImport("@ethersproject/abi", "EventFragment")
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
  
  /* note: abstract class */ @JSImport("@ethersproject/abi", "Fragment")
  @js.native
  open class Fragment protected ()
    extends typingsJapgolly.ethersprojectAbi.libFragmentsMod.Fragment {
    def this(constructorGuard: Any, params: Any) = this()
  }
  /* static members */
  object Fragment {
    
    @JSImport("@ethersproject/abi", "Fragment")
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
  
  @JSImport("@ethersproject/abi", "FunctionFragment")
  @js.native
  open class FunctionFragment protected ()
    extends typingsJapgolly.ethersprojectAbi.libFragmentsMod.FunctionFragment {
    def this(constructorGuard: Any, params: Any) = this()
  }
  /* static members */
  object FunctionFragment {
    
    @JSImport("@ethersproject/abi", "FunctionFragment")
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
  
  @JSImport("@ethersproject/abi", "Indexed")
  @js.native
  open class Indexed protected ()
    extends typingsJapgolly.ethersprojectAbi.libInterfaceMod.Indexed {
    def this(info: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof @ethersproject/abi.@ethersproject/abi/lib/interface.Indexed ]: @ethersproject/abi.@ethersproject/abi/lib/interface.Indexed[K]} */ js.Any) = this()
  }
  /* static members */
  object Indexed {
    
    @JSImport("@ethersproject/abi", "Indexed")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isIndexed(value: Any): /* is @ethersproject/abi.@ethersproject/abi/lib/interface.Indexed */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIndexed")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @ethersproject/abi.@ethersproject/abi/lib/interface.Indexed */ Boolean]
  }
  
  @JSImport("@ethersproject/abi", "Interface")
  @js.native
  open class Interface protected ()
    extends typingsJapgolly.ethersprojectAbi.libInterfaceMod.Interface {
    def this(fragments: String) = this()
    def this(fragments: js.Array[
            typingsJapgolly.ethersprojectAbi.libFragmentsMod.Fragment | JsonFragment | String
          ]) = this()
  }
  /* static members */
  object Interface {
    
    @JSImport("@ethersproject/abi", "Interface")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getAbiCoder(): typingsJapgolly.ethersprojectAbi.libAbiCoderMod.AbiCoder = ^.asInstanceOf[js.Dynamic].applyDynamic("getAbiCoder")().asInstanceOf[typingsJapgolly.ethersprojectAbi.libAbiCoderMod.AbiCoder]
    
    inline def getAddress(address: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAddress")(address.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def getEventTopic(eventFragment: typingsJapgolly.ethersprojectAbi.libFragmentsMod.EventFragment): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getEventTopic")(eventFragment.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def getSighash(fragment: typingsJapgolly.ethersprojectAbi.libFragmentsMod.ErrorFragment): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSighash")(fragment.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def getSighash(fragment: typingsJapgolly.ethersprojectAbi.libFragmentsMod.FunctionFragment): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSighash")(fragment.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def isInterface(value: Any): /* is @ethersproject/abi.@ethersproject/abi/lib/interface.Interface */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInterface")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @ethersproject/abi.@ethersproject/abi/lib/interface.Interface */ Boolean]
  }
  
  @JSImport("@ethersproject/abi", "LogDescription")
  @js.native
  open class LogDescription protected ()
    extends typingsJapgolly.ethersprojectAbi.libInterfaceMod.LogDescription {
    def this(info: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof @ethersproject/abi.@ethersproject/abi/lib/interface.LogDescription ]: @ethersproject/abi.@ethersproject/abi/lib/interface.LogDescription[K]} */ js.Any) = this()
  }
  
  @JSImport("@ethersproject/abi", "ParamType")
  @js.native
  open class ParamType protected ()
    extends typingsJapgolly.ethersprojectAbi.libFragmentsMod.ParamType {
    def this(constructorGuard: Any, params: Any) = this()
  }
  /* static members */
  object ParamType {
    
    @JSImport("@ethersproject/abi", "ParamType")
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
  
  @JSImport("@ethersproject/abi", "TransactionDescription")
  @js.native
  open class TransactionDescription protected ()
    extends typingsJapgolly.ethersprojectAbi.libInterfaceMod.TransactionDescription {
    def this(info: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof @ethersproject/abi.@ethersproject/abi/lib/interface.TransactionDescription ]: @ethersproject/abi.@ethersproject/abi/lib/interface.TransactionDescription[K]} */ js.Any) = this()
  }
  
  inline def checkResultErrors(result: Result): js.Array[Error] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkResultErrors")(result.asInstanceOf[js.Any]).asInstanceOf[js.Array[Error]]
  
  @JSImport("@ethersproject/abi", "defaultAbiCoder")
  @js.native
  val defaultAbiCoder: typingsJapgolly.ethersprojectAbi.libAbiCoderMod.AbiCoder = js.native
}
