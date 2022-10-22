package typingsJapgolly.bip174

import typingsJapgolly.bip174.srcLibInterfacesMod.KeyValue
import typingsJapgolly.bip174.srcLibInterfacesMod.TapKeySig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLibConverterInputTapKeySigMod {
  
  @JSImport("bip174/src/lib/converter/input/tapKeySig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def canAdd(currentData: Any, newData: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("canAdd")(currentData.asInstanceOf[js.Any], newData.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def check(data: Any): /* is bip174.bip174/src/lib/interfaces.TapKeySig */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("check")(data.asInstanceOf[js.Any]).asInstanceOf[/* is bip174.bip174/src/lib/interfaces.TapKeySig */ Boolean]
  
  inline def decode(keyVal: KeyValue): TapKeySig = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(keyVal.asInstanceOf[js.Any]).asInstanceOf[TapKeySig]
  
  inline def encode(value: TapKeySig): KeyValue = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(value.asInstanceOf[js.Any]).asInstanceOf[KeyValue]
  
  @JSImport("bip174/src/lib/converter/input/tapKeySig", "expected")
  @js.native
  val expected: /* "Buffer" */ String = js.native
}
