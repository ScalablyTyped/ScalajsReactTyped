package typingsJapgolly.gifEncoder

import typingsJapgolly.gifEncoder.anon.HighWaterMark
import typingsJapgolly.gifEncoder.anon.IndexedPixels
import typingsJapgolly.gifEncoder.gifEncoderInts.`0`
import typingsJapgolly.gifEncoder.gifEncoderInts.`1`
import typingsJapgolly.gifEncoder.gifEncoderInts.`2`
import typingsJapgolly.gifEncoder.gifEncoderInts.`3`
import typingsJapgolly.gifEncoder.gifEncoderStrings.close
import typingsJapgolly.gifEncoder.gifEncoderStrings.data
import typingsJapgolly.gifEncoder.gifEncoderStrings.end
import typingsJapgolly.gifEncoder.gifEncoderStrings.error
import typingsJapgolly.gifEncoder.gifEncoderStrings.finishNumbersignstart
import typingsJapgolly.gifEncoder.gifEncoderStrings.finishNumbersignstop
import typingsJapgolly.gifEncoder.gifEncoderStrings.frameNumbersignstart
import typingsJapgolly.gifEncoder.gifEncoderStrings.frameNumbersignstop
import typingsJapgolly.gifEncoder.gifEncoderStrings.pause
import typingsJapgolly.gifEncoder.gifEncoderStrings.readable
import typingsJapgolly.gifEncoder.gifEncoderStrings.resume
import typingsJapgolly.gifEncoder.gifEncoderStrings.writeHeaderNumbersignstart
import typingsJapgolly.gifEncoder.gifEncoderStrings.writeHeaderNumbersignstop
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.streamMod.Readable
import typingsJapgolly.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gif-encoder", JSImport.Namespace)
  @js.native
  open class ^ protected () extends GIFEncoder {
    def this(
      /**
      * Width, in pixels, of the GIF to output.
      */
    width: Double,
      /**
      * Height, in pixels, of the GIF to output.
      */
    height: Double
    ) = this()
    def this(
      /**
      * Width, in pixels, of the GIF to output.
      */
    width: Double,
      /**
      * Height, in pixels, of the GIF to output.
      */
    height: Double,
      options: HighWaterMark
    ) = this()
  }
  
  @js.native
  trait GIFEncoder extends Readable {
    
    /**
      * Write out a new frame to the GIF.
      */
    def addFrame(
      /**
      * ArrayLike of pixels (0x00 - 0xFF) for the new frame.
      * It should follow the sequence of r, g, b, a and be 4 * height * width in length.
      * This can be collected from a canvas through context.getImageData(0, 0, width, height).data
      *
      * If used with the options palette and indexedPixels, then this becomes the index in the palette.
      */
    imageData: Pixels
    ): Unit = js.native
    def addFrame(
      /**
      * ArrayLike of pixels (0x00 - 0xFF) for the new frame.
      * It should follow the sequence of r, g, b, a and be 4 * height * width in length.
      * This can be collected from a canvas through context.getImageData(0, 0, width, height).data
      *
      * If used with the options palette and indexedPixels, then this becomes the index in the palette.
      */
    imageData: Pixels,
      /**
      * Optional parameter for options.
      */
    options: IndexedPixels
    ): Unit = js.native
    
    /**
      * First part of addFrame; runs setImagePixels(removeAlphaChannel(imageData)) and runs analyzePixels().
      */
    def analyzeImage(
      /**
      * ArrayLike of pixels (0x00 - 0xFF) for the analyzed frame.
      * It should follow the sequence of r, g, b, a and be 4 * height * width in length.
      * This can be collected from a canvas through context.getImageData(0, 0, width, height).data
      *
      * If used with the options palette and indexedPixels, then this becomes the index in the palette.
      */
    imageData: Pixels
    ): Unit = js.native
    def analyzeImage(
      /**
      * ArrayLike of pixels (0x00 - 0xFF) for the analyzed frame.
      * It should follow the sequence of r, g, b, a and be 4 * height * width in length.
      * This can be collected from a canvas through context.getImageData(0, 0, width, height).data
      *
      * If used with the options palette and indexedPixels, then this becomes the index in the palette.
      */
    imageData: Pixels,
      /**
      * Optional parameter for options.
      */
    options: IndexedPixels
    ): Unit = js.native
    
    /**
      * Write out footer bytes.
      */
    def finish(): Unit = js.native
    
    /**
      * We have a secondary internal buffer that collects each byte from writeByte.
      * This is to prevent create a new Buffer and data event for every byte of data.
      *
      * This method empties the internal buffer and pushes it out to the stream buffer for reading.
      */
    def flushData(): Unit = js.native
    
    def on(
      event: close | end | pause | resume | readable | writeHeaderNumbersignstart | writeHeaderNumbersignstop | frameNumbersignstart | frameNumbersignstop | finishNumbersignstart | finishNumbersignstop,
      listener: js.Function0[Unit]
    ): this.type = js.native
    @JSName("on")
    def on_data(event: data, listener: js.Function1[/* chunk */ Buffer, Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    
    def once(
      event: close | end | pause | resume | readable | writeHeaderNumbersignstart | writeHeaderNumbersignstop | frameNumbersignstart | frameNumbersignstop | finishNumbersignstart | finishNumbersignstop,
      listener: js.Function0[Unit]
    ): this.type = js.native
    @JSName("once")
    def once_data(event: data, listener: js.Function1[/* chunk */ Buffer, Unit]): this.type = js.native
    @JSName("once")
    def once_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    
    /**
      * Third part of addFrame; encodes the analyzed/indexed pixels for the GIF format.
      */
    def outputImage(): Unit = js.native
    
    /**
      * Internal store for imageData passed in by addFrame.
      */
    var pixels: Pixels = js.native
    
    /**
      * Reduces imageData into a Uint8Array of length 3 * width * height containing sequences of r, g, b; removing the alpha channel.
      */
    def removeAlphaChannel(
      /**
      * ArrayLike of pixels (0x00 - 0xFF) for the source frame.
      * It should follow the sequence of r, g, b, a and be 4 * height * width in length.
      * This can be collected from a canvas through context.getImageData(0, 0, width, height).data
      */
    imageData: Pixels
    ): Unit = js.native
    
    /**
      * Set millisecond delay between frames.
      */
    def setDelay(/**
      * Amount of milliseconds to delay between frames.
      */
    ms: Double): Unit = js.native
    
    /**
      * Alters behavior of how to render between frames.
      */
    def setDispose(
      /**
      * If no transparent color has been set, defaults to 0.
      * Otherwise, defaults to 2.
      *
      * 0 -  No disposal specified. The decoder is
      *      not required to take any action.
      *
      * 1 -  Do not dispose. The graphic is to be left
      *      in place.
      *
      * 2 -  Restore to background color. The area used by the
      *      graphic must be restored to the background color.
      *
      * 3 -  Restore to previous. The decoder is required to
      *      restore the area overwritten by the graphic with
      *      what was there prior to rendering the graphic.
      */
    disposalCode: `0` | `1` | `2` | `3`
    ): Unit = js.native
    
    /**
      * Set delay between frames based on frames per second. Cannot be used with setDelay().
      */
    def setFrameRate(/**
      * Amount of frames per second.
      */
    framesPerSecond: Double): Unit = js.native
    
    /**
      * Save palette as this.userPalette for frame writing.
      */
    def setImagePalette(
      /**
      * Array of pixels to use as palette for the frame.
      * It should follow the sequence of r, g, b, a.
      */
    palette: Pixels
    ): Unit = js.native
    
    /**
      * Save pixels as this.pixels for image analysis.
      */
    def setImagePixels(
      /**
      * ArrayLike of pixels (0x00 - 0xFF) for the frame to save.
      * It should follow the sequence of r, g, b, a and be 4 * height * width in length.
      * This can be collected from a canvas through context.getImageData(0, 0, width, height).data
      */
    pixels: Pixels
    ): Unit = js.native
    
    /**
      * Set the quality (computational/performance trade-off).
      */
    def setQuality(
      /**
      * A positive number.
      *
      * 1 is best colors, worst performance.
      *
      * 20 is suggested maximum but there is no limit.
      *
      * 10 is the default, provided an even trade-off.
      */
    quality: Double
    ): Unit = js.native
    
    /**
      * Sets the amount of times to repeat the GIF.
      */
    def setRepeat(
      /**
      * If n is -1, play once.
      *
      * If n is 0, loop indefinitely.
      *
      * If n is a positive number, loop n times.
      */
    amount: Double
    ): Unit = js.native
    
    /**
      * Sets the color which represents transparency in the GIF.
      */
    def setTransparent(/**
      * RGB color to represent transparent background, e.g. 0x00FF00
      */
    color: Double): Unit = js.native
    
    /**
      * Internal store for palette passed in by addFrame.
      */
    var userPalette: Pixels = js.native
    
    /**
      * Write out header bytes, following the GIF89a specification.
      */
    def writeHeader(): Unit = js.native
    
    /**
      * Second part of addFrame; behavior varies on if it is the first frame or following frame.
      *
      * In either case, it writes out a bunch of bytes about the image (e.g. palette, color tables).
      */
    def writeImageInfo(): Unit = js.native
  }
  
  type Pixels = ArrayLike[Double]
}
