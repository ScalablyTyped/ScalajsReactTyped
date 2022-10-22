package typingsJapgolly.bip174

import typingsJapgolly.bip174.srcLibInterfacesMod.FinalScriptWitness
import typingsJapgolly.bip174.srcLibInterfacesMod.KeyValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLibConverterInputFinalScriptWitnessMod {
  
  @JSImport("bip174/src/lib/converter/input/finalScriptWitness", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def canAdd(currentData: Any, newData: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("canAdd")(currentData.asInstanceOf[js.Any], newData.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def check(data: Any): /* is bip174.bip174/src/lib/interfaces.FinalScriptWitness */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("check")(data.asInstanceOf[js.Any]).asInstanceOf[/* is bip174.bip174/src/lib/interfaces.FinalScriptWitness */ Boolean]
  
  inline def decode(keyVal: KeyValue): FinalScriptWitness = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(keyVal.asInstanceOf[js.Any]).asInstanceOf[FinalScriptWitness]
  
  inline def encode(data: FinalScriptWitness): KeyValue = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(data.asInstanceOf[js.Any]).asInstanceOf[KeyValue]
  
  @JSImport("bip174/src/lib/converter/input/finalScriptWitness", "expected")
  @js.native
  val expected: /* "Buffer" */ String = js.native
}
