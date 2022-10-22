package typingsJapgolly.bip174

import typingsJapgolly.bip174.srcLibInterfacesMod.FinalScriptSig
import typingsJapgolly.bip174.srcLibInterfacesMod.KeyValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLibConverterInputFinalScriptSigMod {
  
  @JSImport("bip174/src/lib/converter/input/finalScriptSig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def canAdd(currentData: Any, newData: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("canAdd")(currentData.asInstanceOf[js.Any], newData.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def check(data: Any): /* is bip174.bip174/src/lib/interfaces.FinalScriptSig */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("check")(data.asInstanceOf[js.Any]).asInstanceOf[/* is bip174.bip174/src/lib/interfaces.FinalScriptSig */ Boolean]
  
  inline def decode(keyVal: KeyValue): FinalScriptSig = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(keyVal.asInstanceOf[js.Any]).asInstanceOf[FinalScriptSig]
  
  inline def encode(data: FinalScriptSig): KeyValue = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(data.asInstanceOf[js.Any]).asInstanceOf[KeyValue]
  
  @JSImport("bip174/src/lib/converter/input/finalScriptSig", "expected")
  @js.native
  val expected: /* "Buffer" */ String = js.native
}
