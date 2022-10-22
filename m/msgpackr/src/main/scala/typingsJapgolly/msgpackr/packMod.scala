package typingsJapgolly.msgpackr

import typingsJapgolly.msgpackr.mod.Extension
import typingsJapgolly.msgpackr.mod.Options
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object packMod {
  
  @JSImport("msgpackr/pack", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("msgpackr/pack", "Decoder")
  @js.native
  open class Decoder ()
    extends typingsJapgolly.msgpackr.mod.Decoder {
    def this(options: Options) = this()
  }
  
  @JSImport("msgpackr/pack", "Encoder")
  @js.native
  open class Encoder ()
    extends typingsJapgolly.msgpackr.mod.Encoder {
    def this(options: Options) = this()
  }
  
  @JSImport("msgpackr/pack", "FLOAT32_OPTIONS")
  @js.native
  object FLOAT32_OPTIONS extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.msgpackr.mod.FLOAT32_OPTIONS & Double] = js.native
    
    /* 1 */ val ALWAYS: typingsJapgolly.msgpackr.mod.FLOAT32_OPTIONS.ALWAYS & Double = js.native
    
    /* 4 */ val DECIMAL_FIT: typingsJapgolly.msgpackr.mod.FLOAT32_OPTIONS.DECIMAL_FIT & Double = js.native
    
    /* 3 */ val DECIMAL_ROUND: typingsJapgolly.msgpackr.mod.FLOAT32_OPTIONS.DECIMAL_ROUND & Double = js.native
    
    /* 0 */ val NEVER: typingsJapgolly.msgpackr.mod.FLOAT32_OPTIONS.NEVER & Double = js.native
  }
  
  @JSImport("msgpackr/pack", "Packr")
  @js.native
  open class Packr ()
    extends typingsJapgolly.msgpackr.mod.Packr {
    def this(options: Options) = this()
  }
  
  @JSImport("msgpackr/pack", "Unpackr")
  @js.native
  open class Unpackr ()
    extends typingsJapgolly.msgpackr.mod.Unpackr {
    def this(options: Options) = this()
  }
  
  inline def addExtension(`extension`: Extension): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addExtension")(`extension`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def decode(messagePack: js.typedarray.Uint8Array): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(messagePack.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def decode(messagePack: Buffer): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(messagePack.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def encode(value: Any): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(value.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def pack(value: Any): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def unpack(messagePack: js.typedarray.Uint8Array): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(messagePack.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def unpack(messagePack: Buffer): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(messagePack.asInstanceOf[js.Any]).asInstanceOf[Any]
}
