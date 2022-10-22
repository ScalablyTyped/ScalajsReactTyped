package typingsJapgolly.piSpi

import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pi-spi", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("pi-spi", "SPI")
  @js.native
  open class SPI () extends StObject {
    
    def bitOrder(): Double = js.native
    def bitOrder(order: order): Unit = js.native
    
    def clockSpeed(): Double = js.native
    def clockSpeed(speed: Double): Unit = js.native
    
    def close(cb: js.Function1[/* error */ js.Error, Unit]): Unit = js.native
    
    def dataMode(): Double = js.native
    def dataMode(mode: mode): Unit = js.native
    
    def read(readcount: Double, cb: js.Function2[/* error */ js.Error, /* data */ Buffer, Unit]): Unit = js.native
    
    def transfer(writebuf: Buffer, cb: js.Function2[/* error */ js.Error, /* data */ Buffer, Unit]): Unit = js.native
    def transfer(
      writebuf: Buffer,
      readcount: Double,
      cb: js.Function2[/* error */ js.Error, /* data */ Buffer, Unit]
    ): Unit = js.native
    
    def write(writebuf: Buffer, cb: js.Function2[/* error */ js.Error, /* data */ Buffer, Unit]): Unit = js.native
  }
  
  inline def initialize(device: String): SPI = ^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(device.asInstanceOf[js.Any]).asInstanceOf[SPI]
  
  @js.native
  sealed trait mode extends StObject
  @JSImport("pi-spi", "mode")
  @js.native
  object mode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[mode & Double] = js.native
    
    @js.native
    sealed trait CPHA
      extends StObject
         with mode
    /* 0x01 */ val CPHA: typingsJapgolly.piSpi.mod.mode.CPHA & Double = js.native
    
    @js.native
    sealed trait CPOL
      extends StObject
         with mode
    /* 0x02 */ val CPOL: typingsJapgolly.piSpi.mod.mode.CPOL & Double = js.native
  }
  
  @js.native
  sealed trait order extends StObject
  @JSImport("pi-spi", "order")
  @js.native
  object order extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[order & Double] = js.native
    
    @js.native
    sealed trait LSB_FIRST
      extends StObject
         with order
    /* 1 */ val LSB_FIRST: typingsJapgolly.piSpi.mod.order.LSB_FIRST & Double = js.native
    
    @js.native
    sealed trait MSB_FIRST
      extends StObject
         with order
    /* 0 */ val MSB_FIRST: typingsJapgolly.piSpi.mod.order.MSB_FIRST & Double = js.native
  }
}
