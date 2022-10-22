package typingsJapgolly.rpiWs281xNative

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.rpiWs281xNative.anon.OmitChannelOptionscount
import typingsJapgolly.rpiWs281xNative.anon.SK6812
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("rpi-ws281x-native", JSImport.Namespace)
  @js.native
  val ^ : Ws281x = js.native
  
  trait Channel extends StObject {
    
    var array: js.typedarray.Uint32Array
    
    var brightness: Double
    
    var buffer: Buffer
    
    val count: Double
    
    val gpio: Double
    
    val invert: Boolean
    
    val stripType: StripType
  }
  object Channel {
    
    inline def apply(
      array: js.typedarray.Uint32Array,
      brightness: Double,
      buffer: Buffer,
      count: Double,
      gpio: Double,
      invert: Boolean,
      stripType: StripType
    ): Channel = {
      val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], brightness = brightness.asInstanceOf[js.Any], buffer = buffer.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], gpio = gpio.asInstanceOf[js.Any], invert = invert.asInstanceOf[js.Any], stripType = stripType.asInstanceOf[js.Any])
      __obj.asInstanceOf[Channel]
    }
    
    extension [Self <: Channel](x: Self) {
      
      inline def setArray(value: js.typedarray.Uint32Array): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
      
      inline def setBrightness(value: Double): Self = StObject.set(x, "brightness", value.asInstanceOf[js.Any])
      
      inline def setBuffer(value: Buffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setGpio(value: Double): Self = StObject.set(x, "gpio", value.asInstanceOf[js.Any])
      
      inline def setInvert(value: Boolean): Self = StObject.set(x, "invert", value.asInstanceOf[js.Any])
      
      inline def setStripType(value: StripType): Self = StObject.set(x, "stripType", value.asInstanceOf[js.Any])
    }
  }
  
  trait ChannelOptions extends StObject {
    
    /**
      * Initial brightness for the channel (0-255).
      */
    var brightness: js.UndefOr[Double] = js.undefined
    
    /**
      * Number of LEDs on this channel.
      */
    var count: Double
    
    /**
      * The GPIO port-number the LED strip is connected to (default `18` for the first channel, and `12` for the second channel).
      */
    var gpio: js.UndefOr[Double] = js.undefined
    
    /**
      * `true` to invert the output-signal (for example, if you are using an inverting level-shifter).
      */
    var invert: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The LED-type connected on this channel. Can be a string-constant or one of the values from `ws281x.stripType` (default `ws281x.stripType.WS2812`).
      */
    var stripType: js.UndefOr[StripTypeEnum] = js.undefined
  }
  object ChannelOptions {
    
    inline def apply(count: Double): ChannelOptions = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChannelOptions]
    }
    
    extension [Self <: ChannelOptions](x: Self) {
      
      inline def setBrightness(value: Double): Self = StObject.set(x, "brightness", value.asInstanceOf[js.Any])
      
      inline def setBrightnessUndefined: Self = StObject.set(x, "brightness", js.undefined)
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setGpio(value: Double): Self = StObject.set(x, "gpio", value.asInstanceOf[js.Any])
      
      inline def setGpioUndefined: Self = StObject.set(x, "gpio", js.undefined)
      
      inline def setInvert(value: Boolean): Self = StObject.set(x, "invert", value.asInstanceOf[js.Any])
      
      inline def setInvertUndefined: Self = StObject.set(x, "invert", js.undefined)
      
      inline def setStripType(value: StripTypeEnum): Self = StObject.set(x, "stripType", value.asInstanceOf[js.Any])
      
      inline def setStripTypeUndefined: Self = StObject.set(x, "stripType", js.undefined)
    }
  }
  
  trait InitOptions extends StObject {
    
    /**
      * An array of one or two objects with channel-specific configuration for the two
      * possible outputs.
      */
    var channels: js.Array[ChannelOptions]
    
    /**
      * The dma-number to use for the driver's data-transport to the LEDs (default `10`).
      */
    var dma: js.UndefOr[Double] = js.undefined
    
    /**
      * The frequency in Hz of the control-signal. This is 800kHz for ws2812/sk6812 LEDs
      * and 400kHz for older ws2811 LEDs (default `800000`).
      */
    var freq: js.UndefOr[Double] = js.undefined
  }
  object InitOptions {
    
    inline def apply(channels: js.Array[ChannelOptions]): InitOptions = {
      val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any])
      __obj.asInstanceOf[InitOptions]
    }
    
    extension [Self <: InitOptions](x: Self) {
      
      inline def setChannels(value: js.Array[ChannelOptions]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
      
      inline def setChannelsVarargs(value: ChannelOptions*): Self = StObject.set(x, "channels", js.Array(value*))
      
      inline def setDma(value: Double): Self = StObject.set(x, "dma", value.asInstanceOf[js.Any])
      
      inline def setDmaUndefined: Self = StObject.set(x, "dma", js.undefined)
      
      inline def setFreq(value: Double): Self = StObject.set(x, "freq", value.asInstanceOf[js.Any])
      
      inline def setFreqUndefined: Self = StObject.set(x, "freq", js.undefined)
    }
  }
  
  /* Inlined {  SK6812_RGBW :403703808,   SK6812_RBGW :403701768,   SK6812_GRBW :403181568,   SK6812_GBRW :403177488,   SK6812_BRGW :402657288,   SK6812_BGRW :402655248,   WS2811_RGB :1050624,   WS2811_RBG :1048584,   WS2811_GRB :528384,   WS2811_GBR :524304,   WS2811_BRG :4104,   WS2811_BGR :2064,   WS2812 :528384,   SK6812 :528384,   SK6812W :403177488}[keyof {  SK6812_RGBW :403703808,   SK6812_RBGW :403701768,   SK6812_GRBW :403181568,   SK6812_GBRW :403177488,   SK6812_BRGW :402657288,   SK6812_BGRW :402655248,   WS2811_RGB :1050624,   WS2811_RBG :1048584,   WS2811_GRB :528384,   WS2811_GBR :524304,   WS2811_BRG :4104,   WS2811_BGR :2064,   WS2812 :528384,   SK6812 :528384,   SK6812W :403177488}] */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`403701768`
    - typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`403181568`
    - typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`524304`
    - typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`403703808`
    - typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`1048584`
    - typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`4104`
    - typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`403177488`
    - typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`402657288`
    - typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`528384`
    - typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`2064`
    - typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`402655248`
    - typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`1050624`
  */
  trait StripType extends StObject
  object StripType {
    
    inline def `1048584`: typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`1048584` = 1048584.asInstanceOf[typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`1048584`]
    
    inline def `1050624`: typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`1050624` = 1050624.asInstanceOf[typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`1050624`]
    
    inline def `2064`: typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`2064` = 2064.asInstanceOf[typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`2064`]
    
    inline def `402655248`: typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`402655248` = 402655248.asInstanceOf[typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`402655248`]
    
    inline def `402657288`: typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`402657288` = 402657288.asInstanceOf[typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`402657288`]
    
    inline def `403177488`: typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`403177488` = 403177488.asInstanceOf[typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`403177488`]
    
    inline def `403181568`: typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`403181568` = 403181568.asInstanceOf[typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`403181568`]
    
    inline def `403701768`: typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`403701768` = 403701768.asInstanceOf[typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`403701768`]
    
    inline def `403703808`: typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`403703808` = 403703808.asInstanceOf[typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`403703808`]
    
    inline def `4104`: typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`4104` = 4104.asInstanceOf[typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`4104`]
    
    inline def `524304`: typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`524304` = 524304.asInstanceOf[typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`524304`]
    
    inline def `528384`: typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`528384` = 528384.asInstanceOf[typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`528384`]
  }
  
  /* Inlined rpi-ws281x-native.rpi-ws281x-native.StripType | keyof {  sk6812-rgbw :403703808,   sk6812-rbgw :403701768,   sk6812-grbw :403181568,   sk6812-gbrw :403177488,   sk6812-brgw :402657288,   sk6812-bgrw :402655248,   ws2811-rgb :1050624,   ws2811-rbg :1048584,   ws2811-grb :528384,   ws2811-gbr :524304,   ws2811-brg :4104,   ws2811-bgr :2064,   ws2812 :528384,   sk6812 :528384,   sk6812w :403177488} */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`403701768`
    - typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`403181568`
    - typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`524304`
    - typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`403703808`
    - typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`1048584`
    - typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`4104`
    - typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`403177488`
    - typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`402657288`
    - typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`528384`
    - typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`2064`
    - typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`402655248`
    - typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`1050624`
    - typingsJapgolly.rpiWs281xNative.rpiWs281xNativeStrings.`sk6812-rgbw`
    - typingsJapgolly.rpiWs281xNative.rpiWs281xNativeStrings.`ws2811-bgr`
    - typingsJapgolly.rpiWs281xNative.rpiWs281xNativeStrings.`sk6812-bgrw`
    - typingsJapgolly.rpiWs281xNative.rpiWs281xNativeStrings.`ws2811-rbg`
    - typingsJapgolly.rpiWs281xNative.rpiWs281xNativeStrings.sk6812
    - typingsJapgolly.rpiWs281xNative.rpiWs281xNativeStrings.sk6812w
    - typingsJapgolly.rpiWs281xNative.rpiWs281xNativeStrings.`sk6812-rbgw`
    - typingsJapgolly.rpiWs281xNative.rpiWs281xNativeStrings.`ws2811-gbr`
    - typingsJapgolly.rpiWs281xNative.rpiWs281xNativeStrings.`ws2811-grb`
    - typingsJapgolly.rpiWs281xNative.rpiWs281xNativeStrings.`ws2811-brg`
    - typingsJapgolly.rpiWs281xNative.rpiWs281xNativeStrings.`sk6812-brgw`
    - typingsJapgolly.rpiWs281xNative.rpiWs281xNativeStrings.`sk6812-grbw`
    - typingsJapgolly.rpiWs281xNative.rpiWs281xNativeStrings.ws2812
    - typingsJapgolly.rpiWs281xNative.rpiWs281xNativeStrings.`sk6812-gbrw`
    - typingsJapgolly.rpiWs281xNative.rpiWs281xNativeStrings.`ws2811-rgb`
  */
  trait StripTypeEnum extends StObject
  object StripTypeEnum {
    
    inline def `1048584`: typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`1048584` = 1048584.asInstanceOf[typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`1048584`]
    
    inline def `1050624`: typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`1050624` = 1050624.asInstanceOf[typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`1050624`]
    
    inline def `2064`: typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`2064` = 2064.asInstanceOf[typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`2064`]
    
    inline def `402655248`: typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`402655248` = 402655248.asInstanceOf[typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`402655248`]
    
    inline def `402657288`: typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`402657288` = 402657288.asInstanceOf[typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`402657288`]
    
    inline def `403177488`: typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`403177488` = 403177488.asInstanceOf[typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`403177488`]
    
    inline def `403181568`: typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`403181568` = 403181568.asInstanceOf[typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`403181568`]
    
    inline def `403701768`: typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`403701768` = 403701768.asInstanceOf[typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`403701768`]
    
    inline def `403703808`: typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`403703808` = 403703808.asInstanceOf[typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`403703808`]
    
    inline def `4104`: typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`4104` = 4104.asInstanceOf[typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`4104`]
    
    inline def `524304`: typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`524304` = 524304.asInstanceOf[typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`524304`]
    
    inline def `528384`: typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`528384` = 528384.asInstanceOf[typingsJapgolly.rpiWs281xNative.rpiWs281xNativeInts.`528384`]
    
    inline def sk6812: typingsJapgolly.rpiWs281xNative.rpiWs281xNativeStrings.sk6812 = "sk6812".asInstanceOf[typingsJapgolly.rpiWs281xNative.rpiWs281xNativeStrings.sk6812]
    
    inline def `sk6812-bgrw`: typingsJapgolly.rpiWs281xNative.rpiWs281xNativeStrings.`sk6812-bgrw` = "sk6812-bgrw".asInstanceOf[typingsJapgolly.rpiWs281xNative.rpiWs281xNativeStrings.`sk6812-bgrw`]
    
    inline def `sk6812-brgw`: typingsJapgolly.rpiWs281xNative.rpiWs281xNativeStrings.`sk6812-brgw` = "sk6812-brgw".asInstanceOf[typingsJapgolly.rpiWs281xNative.rpiWs281xNativeStrings.`sk6812-brgw`]
    
    inline def `sk6812-gbrw`: typingsJapgolly.rpiWs281xNative.rpiWs281xNativeStrings.`sk6812-gbrw` = "sk6812-gbrw".asInstanceOf[typingsJapgolly.rpiWs281xNative.rpiWs281xNativeStrings.`sk6812-gbrw`]
    
    inline def `sk6812-grbw`: typingsJapgolly.rpiWs281xNative.rpiWs281xNativeStrings.`sk6812-grbw` = "sk6812-grbw".asInstanceOf[typingsJapgolly.rpiWs281xNative.rpiWs281xNativeStrings.`sk6812-grbw`]
    
    inline def `sk6812-rbgw`: typingsJapgolly.rpiWs281xNative.rpiWs281xNativeStrings.`sk6812-rbgw` = "sk6812-rbgw".asInstanceOf[typingsJapgolly.rpiWs281xNative.rpiWs281xNativeStrings.`sk6812-rbgw`]
    
    inline def `sk6812-rgbw`: typingsJapgolly.rpiWs281xNative.rpiWs281xNativeStrings.`sk6812-rgbw` = "sk6812-rgbw".asInstanceOf[typingsJapgolly.rpiWs281xNative.rpiWs281xNativeStrings.`sk6812-rgbw`]
    
    inline def sk6812w: typingsJapgolly.rpiWs281xNative.rpiWs281xNativeStrings.sk6812w = "sk6812w".asInstanceOf[typingsJapgolly.rpiWs281xNative.rpiWs281xNativeStrings.sk6812w]
    
    inline def `ws2811-bgr`: typingsJapgolly.rpiWs281xNative.rpiWs281xNativeStrings.`ws2811-bgr` = "ws2811-bgr".asInstanceOf[typingsJapgolly.rpiWs281xNative.rpiWs281xNativeStrings.`ws2811-bgr`]
    
    inline def `ws2811-brg`: typingsJapgolly.rpiWs281xNative.rpiWs281xNativeStrings.`ws2811-brg` = "ws2811-brg".asInstanceOf[typingsJapgolly.rpiWs281xNative.rpiWs281xNativeStrings.`ws2811-brg`]
    
    inline def `ws2811-gbr`: typingsJapgolly.rpiWs281xNative.rpiWs281xNativeStrings.`ws2811-gbr` = "ws2811-gbr".asInstanceOf[typingsJapgolly.rpiWs281xNative.rpiWs281xNativeStrings.`ws2811-gbr`]
    
    inline def `ws2811-grb`: typingsJapgolly.rpiWs281xNative.rpiWs281xNativeStrings.`ws2811-grb` = "ws2811-grb".asInstanceOf[typingsJapgolly.rpiWs281xNative.rpiWs281xNativeStrings.`ws2811-grb`]
    
    inline def `ws2811-rbg`: typingsJapgolly.rpiWs281xNative.rpiWs281xNativeStrings.`ws2811-rbg` = "ws2811-rbg".asInstanceOf[typingsJapgolly.rpiWs281xNative.rpiWs281xNativeStrings.`ws2811-rbg`]
    
    inline def `ws2811-rgb`: typingsJapgolly.rpiWs281xNative.rpiWs281xNativeStrings.`ws2811-rgb` = "ws2811-rgb".asInstanceOf[typingsJapgolly.rpiWs281xNative.rpiWs281xNativeStrings.`ws2811-rgb`]
    
    inline def ws2812: typingsJapgolly.rpiWs281xNative.rpiWs281xNativeStrings.ws2812 = "ws2812".asInstanceOf[typingsJapgolly.rpiWs281xNative.rpiWs281xNativeStrings.ws2812]
  }
  
  @js.native
  trait Ws281x extends StObject {
    
    def apply(numLeds: Double): Channel = js.native
    def apply(numLeds: Double, opts: OmitChannelOptionscount): Channel = js.native
    
    def init(opts: InitOptions): js.Array[Channel] = js.native
    
    /**
      * Send the current state of the channel color-buffers to the LEDs.
      */
    def render(): Unit = js.native
    
    /**
      * Clear all color-values and render.
      */
    def reset(): Unit = js.native
    
    var stripType: SK6812 = js.native
  }
  
  type _To = Ws281x
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Ws281x = ^
}
