package typingsJapgolly.pizzicato.global

import org.scalajs.dom.AudioContext
import org.scalajs.dom.AudioNode
import org.scalajs.dom.GainNode
import typingsJapgolly.pizzicato.mod.Effects.Compressor
import typingsJapgolly.pizzicato.mod.Effects.CompressorOptions
import typingsJapgolly.pizzicato.mod.Effects.Convolver
import typingsJapgolly.pizzicato.mod.Effects.ConvolverOptions
import typingsJapgolly.pizzicato.mod.Effects.Delay
import typingsJapgolly.pizzicato.mod.Effects.DelayOptions
import typingsJapgolly.pizzicato.mod.Effects.Distortion
import typingsJapgolly.pizzicato.mod.Effects.DistortionOptions
import typingsJapgolly.pizzicato.mod.Effects.DubDelay
import typingsJapgolly.pizzicato.mod.Effects.DubDelayOptions
import typingsJapgolly.pizzicato.mod.Effects.Flanger
import typingsJapgolly.pizzicato.mod.Effects.FlangerOptions
import typingsJapgolly.pizzicato.mod.Effects.HighPassFilter
import typingsJapgolly.pizzicato.mod.Effects.HighPassFilterOptions
import typingsJapgolly.pizzicato.mod.Effects.LowPassFilter
import typingsJapgolly.pizzicato.mod.Effects.LowPassFilterOptions
import typingsJapgolly.pizzicato.mod.Effects.PingPongDelay
import typingsJapgolly.pizzicato.mod.Effects.PingPongDelayOptions
import typingsJapgolly.pizzicato.mod.Effects.Quadrafuzz
import typingsJapgolly.pizzicato.mod.Effects.QuadrafuzzOptions
import typingsJapgolly.pizzicato.mod.Effects.Reverb
import typingsJapgolly.pizzicato.mod.Effects.ReverbOptions
import typingsJapgolly.pizzicato.mod.Effects.RingModulator
import typingsJapgolly.pizzicato.mod.Effects.RingModulatorOptions
import typingsJapgolly.pizzicato.mod.Effects.StereoPanner
import typingsJapgolly.pizzicato.mod.Effects.StereoPannerOptions
import typingsJapgolly.pizzicato.mod.Effects.Tremolo
import typingsJapgolly.pizzicato.mod.Effects.TremoloOptions
import typingsJapgolly.pizzicato.mod.SoundDescription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Pizzicato {
  
  @JSGlobal("Pizzicato")
  @js.native
  val ^ : js.Any = js.native
  
  object Effects {
    
    /* Inlined pizzicato.pizzicato.Effects.Compressor & {new (options : pizzicato.pizzicato.Effects.CompressorOptions | undefined): pizzicato.pizzicato.Effects.Compressor} */
    object Compressor {
      
      @JSGlobal("Pizzicato.Effects.Compressor")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("Pizzicato.Effects.Compressor.attack")
      @js.native
      def attack: Double = js.native
      inline def attack_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("attack")(x.asInstanceOf[js.Any])
      
      inline def connect(audioNode: AudioNode): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(audioNode.asInstanceOf[js.Any]).asInstanceOf[this.type]
      
      inline def disconnect(audioNode: AudioNode): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("disconnect")(audioNode.asInstanceOf[js.Any]).asInstanceOf[this.type]
      
      @JSGlobal("Pizzicato.Effects.Compressor.knee")
      @js.native
      def knee: Double = js.native
      inline def knee_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("knee")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Pizzicato.Effects.Compressor.mix")
      @js.native
      def mix: Double = js.native
      inline def mix_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mix")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Pizzicato.Effects.Compressor.ratio")
      @js.native
      def ratio: Double = js.native
      inline def ratio_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ratio")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Pizzicato.Effects.Compressor.release")
      @js.native
      def release: Double = js.native
      inline def release_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("release")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Pizzicato.Effects.Compressor.threshold")
      @js.native
      def threshold: Double = js.native
      inline def threshold_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("threshold")(x.asInstanceOf[js.Any])
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("Pizzicato.Effects.Compressor")
    @js.native
    open class CompressorCls ()
      extends StObject
         with Compressor {
      def this(options: CompressorOptions) = this()
      
      /* CompleteClass */
      var attack: Double = js.native
      
      /* CompleteClass */
      override def connect(audioNode: AudioNode): this.type = js.native
      
      /* CompleteClass */
      override def disconnect(audioNode: AudioNode): this.type = js.native
      
      /* CompleteClass */
      var knee: Double = js.native
      
      /* CompleteClass */
      var mix: Double = js.native
      
      /* CompleteClass */
      var ratio: Double = js.native
      
      /* CompleteClass */
      var release: Double = js.native
      
      /* CompleteClass */
      var threshold: Double = js.native
    }
    
    /* Inlined pizzicato.pizzicato.Effects.Convolver & {new (options : pizzicato.pizzicato.Effects.ConvolverOptions): pizzicato.pizzicato.Effects.Convolver} */
    object Convolver {
      
      @JSGlobal("Pizzicato.Effects.Convolver")
      @js.native
      val ^ : js.Any = js.native
      
      inline def connect(audioNode: AudioNode): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(audioNode.asInstanceOf[js.Any]).asInstanceOf[this.type]
      
      inline def disconnect(audioNode: AudioNode): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("disconnect")(audioNode.asInstanceOf[js.Any]).asInstanceOf[this.type]
      
      @JSGlobal("Pizzicato.Effects.Convolver.impulse")
      @js.native
      def impulse: String = js.native
      inline def impulse_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("impulse")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Pizzicato.Effects.Convolver.mix")
      @js.native
      def mix: Double = js.native
      inline def mix_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mix")(x.asInstanceOf[js.Any])
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("Pizzicato.Effects.Convolver")
    @js.native
    open class ConvolverCls protected ()
      extends StObject
         with Convolver {
      def this(options: ConvolverOptions) = this()
      
      /* CompleteClass */
      override def connect(audioNode: AudioNode): this.type = js.native
      
      /* CompleteClass */
      override def disconnect(audioNode: AudioNode): this.type = js.native
      
      /* CompleteClass */
      var impulse: String = js.native
      
      /* CompleteClass */
      var mix: Double = js.native
    }
    
    /* Inlined pizzicato.pizzicato.Effects.Delay & {new (options : pizzicato.pizzicato.Effects.DelayOptions | undefined): pizzicato.pizzicato.Effects.Delay} */
    object Delay {
      
      @JSGlobal("Pizzicato.Effects.Delay")
      @js.native
      val ^ : js.Any = js.native
      
      inline def connect(audioNode: AudioNode): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(audioNode.asInstanceOf[js.Any]).asInstanceOf[this.type]
      
      inline def disconnect(audioNode: AudioNode): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("disconnect")(audioNode.asInstanceOf[js.Any]).asInstanceOf[this.type]
      
      @JSGlobal("Pizzicato.Effects.Delay.feedback")
      @js.native
      def feedback: Double = js.native
      inline def feedback_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("feedback")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Pizzicato.Effects.Delay.mix")
      @js.native
      def mix: Double = js.native
      inline def mix_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mix")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Pizzicato.Effects.Delay.time")
      @js.native
      def time: Double = js.native
      inline def time_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("time")(x.asInstanceOf[js.Any])
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("Pizzicato.Effects.Delay")
    @js.native
    open class DelayCls ()
      extends StObject
         with Delay {
      def this(options: DelayOptions) = this()
      
      /* CompleteClass */
      override def connect(audioNode: AudioNode): this.type = js.native
      
      /* CompleteClass */
      override def disconnect(audioNode: AudioNode): this.type = js.native
      
      /* CompleteClass */
      var feedback: Double = js.native
      
      /* CompleteClass */
      var mix: Double = js.native
      
      /* CompleteClass */
      var time: Double = js.native
    }
    
    /* Inlined pizzicato.pizzicato.Effects.Distortion & {new (options : pizzicato.pizzicato.Effects.DistortionOptions | undefined): pizzicato.pizzicato.Effects.Distortion} */
    object Distortion {
      
      @JSGlobal("Pizzicato.Effects.Distortion")
      @js.native
      val ^ : js.Any = js.native
      
      inline def connect(audioNode: AudioNode): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(audioNode.asInstanceOf[js.Any]).asInstanceOf[this.type]
      
      inline def disconnect(audioNode: AudioNode): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("disconnect")(audioNode.asInstanceOf[js.Any]).asInstanceOf[this.type]
      
      @JSGlobal("Pizzicato.Effects.Distortion.gain")
      @js.native
      def gain: Double = js.native
      inline def gain_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gain")(x.asInstanceOf[js.Any])
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("Pizzicato.Effects.Distortion")
    @js.native
    open class DistortionCls ()
      extends StObject
         with Distortion {
      def this(options: DistortionOptions) = this()
      
      /* CompleteClass */
      override def connect(audioNode: AudioNode): this.type = js.native
      
      /* CompleteClass */
      override def disconnect(audioNode: AudioNode): this.type = js.native
      
      /* CompleteClass */
      var gain: Double = js.native
    }
    
    /* Inlined pizzicato.pizzicato.Effects.DubDelay & {new (options : pizzicato.pizzicato.Effects.DubDelayOptions | undefined): pizzicato.pizzicato.Effects.DubDelay} */
    object DubDelay {
      
      @JSGlobal("Pizzicato.Effects.DubDelay")
      @js.native
      val ^ : js.Any = js.native
      
      inline def connect(audioNode: AudioNode): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(audioNode.asInstanceOf[js.Any]).asInstanceOf[this.type]
      
      @JSGlobal("Pizzicato.Effects.DubDelay.cutoff")
      @js.native
      def cutoff: Double = js.native
      inline def cutoff_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cutoff")(x.asInstanceOf[js.Any])
      
      inline def disconnect(audioNode: AudioNode): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("disconnect")(audioNode.asInstanceOf[js.Any]).asInstanceOf[this.type]
      
      @JSGlobal("Pizzicato.Effects.DubDelay.feedback")
      @js.native
      def feedback: Double = js.native
      inline def feedback_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("feedback")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Pizzicato.Effects.DubDelay.mix")
      @js.native
      def mix: Double = js.native
      inline def mix_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mix")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Pizzicato.Effects.DubDelay.time")
      @js.native
      def time: Double = js.native
      inline def time_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("time")(x.asInstanceOf[js.Any])
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("Pizzicato.Effects.DubDelay")
    @js.native
    open class DubDelayCls ()
      extends StObject
         with DubDelay {
      def this(options: DubDelayOptions) = this()
      
      /* CompleteClass */
      override def connect(audioNode: AudioNode): this.type = js.native
      
      /* CompleteClass */
      var cutoff: Double = js.native
      
      /* CompleteClass */
      override def disconnect(audioNode: AudioNode): this.type = js.native
      
      /* CompleteClass */
      var feedback: Double = js.native
      
      /* CompleteClass */
      var mix: Double = js.native
      
      /* CompleteClass */
      var time: Double = js.native
    }
    
    /* Inlined pizzicato.pizzicato.Effects.Flanger & {new (options : pizzicato.pizzicato.Effects.FlangerOptions | undefined): pizzicato.pizzicato.Effects.Flanger} */
    object Flanger {
      
      @JSGlobal("Pizzicato.Effects.Flanger")
      @js.native
      val ^ : js.Any = js.native
      
      inline def connect(audioNode: AudioNode): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(audioNode.asInstanceOf[js.Any]).asInstanceOf[this.type]
      
      @JSGlobal("Pizzicato.Effects.Flanger.depth")
      @js.native
      def depth: Double = js.native
      inline def depth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("depth")(x.asInstanceOf[js.Any])
      
      inline def disconnect(audioNode: AudioNode): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("disconnect")(audioNode.asInstanceOf[js.Any]).asInstanceOf[this.type]
      
      @JSGlobal("Pizzicato.Effects.Flanger.feedback")
      @js.native
      def feedback: Double = js.native
      inline def feedback_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("feedback")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Pizzicato.Effects.Flanger.mix")
      @js.native
      def mix: Double = js.native
      inline def mix_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mix")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Pizzicato.Effects.Flanger.speed")
      @js.native
      def speed: Double = js.native
      inline def speed_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("speed")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Pizzicato.Effects.Flanger.time")
      @js.native
      def time: Double = js.native
      inline def time_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("time")(x.asInstanceOf[js.Any])
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("Pizzicato.Effects.Flanger")
    @js.native
    open class FlangerCls ()
      extends StObject
         with Flanger {
      def this(options: FlangerOptions) = this()
      
      /* CompleteClass */
      override def connect(audioNode: AudioNode): this.type = js.native
      
      /* CompleteClass */
      var depth: Double = js.native
      
      /* CompleteClass */
      override def disconnect(audioNode: AudioNode): this.type = js.native
      
      /* CompleteClass */
      var feedback: Double = js.native
      
      /* CompleteClass */
      var mix: Double = js.native
      
      /* CompleteClass */
      var speed: Double = js.native
      
      /* CompleteClass */
      var time: Double = js.native
    }
    
    /* Inlined pizzicato.pizzicato.Effects.HighPassFilter & {new (options : pizzicato.pizzicato.Effects.HighPassFilterOptions | undefined): pizzicato.pizzicato.Effects.HighPassFilter} */
    object HighPassFilter {
      
      @JSGlobal("Pizzicato.Effects.HighPassFilter")
      @js.native
      val ^ : js.Any = js.native
      
      inline def connect(audioNode: AudioNode): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(audioNode.asInstanceOf[js.Any]).asInstanceOf[this.type]
      
      inline def disconnect(audioNode: AudioNode): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("disconnect")(audioNode.asInstanceOf[js.Any]).asInstanceOf[this.type]
      
      @JSGlobal("Pizzicato.Effects.HighPassFilter.frequency")
      @js.native
      def frequency: Double = js.native
      inline def frequency_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("frequency")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Pizzicato.Effects.HighPassFilter.peak")
      @js.native
      def peak: Double = js.native
      inline def peak_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("peak")(x.asInstanceOf[js.Any])
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("Pizzicato.Effects.HighPassFilter")
    @js.native
    open class HighPassFilterCls ()
      extends StObject
         with HighPassFilter {
      def this(options: HighPassFilterOptions) = this()
      
      /* CompleteClass */
      override def connect(audioNode: AudioNode): this.type = js.native
      
      /* CompleteClass */
      override def disconnect(audioNode: AudioNode): this.type = js.native
      
      /* CompleteClass */
      var frequency: Double = js.native
      
      /* CompleteClass */
      var peak: Double = js.native
    }
    
    /* Inlined pizzicato.pizzicato.Effects.LowPassFilter & {new (options : pizzicato.pizzicato.Effects.LowPassFilterOptions | undefined): pizzicato.pizzicato.Effects.LowPassFilter} */
    object LowPassFilter {
      
      @JSGlobal("Pizzicato.Effects.LowPassFilter")
      @js.native
      val ^ : js.Any = js.native
      
      inline def connect(audioNode: AudioNode): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(audioNode.asInstanceOf[js.Any]).asInstanceOf[this.type]
      
      inline def disconnect(audioNode: AudioNode): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("disconnect")(audioNode.asInstanceOf[js.Any]).asInstanceOf[this.type]
      
      @JSGlobal("Pizzicato.Effects.LowPassFilter.frequency")
      @js.native
      def frequency: Double = js.native
      inline def frequency_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("frequency")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Pizzicato.Effects.LowPassFilter.peak")
      @js.native
      def peak: Double = js.native
      inline def peak_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("peak")(x.asInstanceOf[js.Any])
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("Pizzicato.Effects.LowPassFilter")
    @js.native
    open class LowPassFilterCls ()
      extends StObject
         with LowPassFilter {
      def this(options: LowPassFilterOptions) = this()
      
      /* CompleteClass */
      override def connect(audioNode: AudioNode): this.type = js.native
      
      /* CompleteClass */
      override def disconnect(audioNode: AudioNode): this.type = js.native
      
      /* CompleteClass */
      var frequency: Double = js.native
      
      /* CompleteClass */
      var peak: Double = js.native
    }
    
    /* Inlined pizzicato.pizzicato.Effects.PingPongDelay & {new (options : pizzicato.pizzicato.Effects.PingPongDelayOptions | undefined): pizzicato.pizzicato.Effects.PingPongDelay} */
    object PingPongDelay {
      
      @JSGlobal("Pizzicato.Effects.PingPongDelay")
      @js.native
      val ^ : js.Any = js.native
      
      inline def connect(audioNode: AudioNode): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(audioNode.asInstanceOf[js.Any]).asInstanceOf[this.type]
      
      inline def disconnect(audioNode: AudioNode): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("disconnect")(audioNode.asInstanceOf[js.Any]).asInstanceOf[this.type]
      
      @JSGlobal("Pizzicato.Effects.PingPongDelay.feedback")
      @js.native
      def feedback: Double = js.native
      inline def feedback_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("feedback")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Pizzicato.Effects.PingPongDelay.mix")
      @js.native
      def mix: Double = js.native
      inline def mix_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mix")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Pizzicato.Effects.PingPongDelay.time")
      @js.native
      def time: Double = js.native
      inline def time_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("time")(x.asInstanceOf[js.Any])
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("Pizzicato.Effects.PingPongDelay")
    @js.native
    open class PingPongDelayCls ()
      extends StObject
         with PingPongDelay {
      def this(options: PingPongDelayOptions) = this()
      
      /* CompleteClass */
      override def connect(audioNode: AudioNode): this.type = js.native
      
      /* CompleteClass */
      override def disconnect(audioNode: AudioNode): this.type = js.native
      
      /* CompleteClass */
      var feedback: Double = js.native
      
      /* CompleteClass */
      var mix: Double = js.native
      
      /* CompleteClass */
      var time: Double = js.native
    }
    
    /* Inlined pizzicato.pizzicato.Effects.Quadrafuzz & {new (options : pizzicato.pizzicato.Effects.QuadrafuzzOptions | undefined): pizzicato.pizzicato.Effects.Quadrafuzz} */
    object Quadrafuzz {
      
      @JSGlobal("Pizzicato.Effects.Quadrafuzz")
      @js.native
      val ^ : js.Any = js.native
      
      inline def connect(audioNode: AudioNode): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(audioNode.asInstanceOf[js.Any]).asInstanceOf[this.type]
      
      inline def disconnect(audioNode: AudioNode): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("disconnect")(audioNode.asInstanceOf[js.Any]).asInstanceOf[this.type]
      
      @JSGlobal("Pizzicato.Effects.Quadrafuzz.highGain")
      @js.native
      def highGain: Double = js.native
      inline def highGain_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("highGain")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Pizzicato.Effects.Quadrafuzz.lowGain")
      @js.native
      def lowGain: Double = js.native
      inline def lowGain_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lowGain")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Pizzicato.Effects.Quadrafuzz.midHighGain")
      @js.native
      def midHighGain: Double = js.native
      inline def midHighGain_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("midHighGain")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Pizzicato.Effects.Quadrafuzz.midLowGain")
      @js.native
      def midLowGain: Double = js.native
      inline def midLowGain_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("midLowGain")(x.asInstanceOf[js.Any])
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("Pizzicato.Effects.Quadrafuzz")
    @js.native
    open class QuadrafuzzCls ()
      extends StObject
         with Quadrafuzz {
      def this(options: QuadrafuzzOptions) = this()
      
      /* CompleteClass */
      override def connect(audioNode: AudioNode): this.type = js.native
      
      /* CompleteClass */
      override def disconnect(audioNode: AudioNode): this.type = js.native
      
      /* CompleteClass */
      var highGain: Double = js.native
      
      /* CompleteClass */
      var lowGain: Double = js.native
      
      /* CompleteClass */
      var midHighGain: Double = js.native
      
      /* CompleteClass */
      var midLowGain: Double = js.native
    }
    
    /* Inlined pizzicato.pizzicato.Effects.Reverb & {new (options : pizzicato.pizzicato.Effects.ReverbOptions | undefined): pizzicato.pizzicato.Effects.Reverb} */
    object Reverb {
      
      @JSGlobal("Pizzicato.Effects.Reverb")
      @js.native
      val ^ : js.Any = js.native
      
      inline def connect(audioNode: AudioNode): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(audioNode.asInstanceOf[js.Any]).asInstanceOf[this.type]
      
      @JSGlobal("Pizzicato.Effects.Reverb.decay")
      @js.native
      def decay: Double = js.native
      inline def decay_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decay")(x.asInstanceOf[js.Any])
      
      inline def disconnect(audioNode: AudioNode): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("disconnect")(audioNode.asInstanceOf[js.Any]).asInstanceOf[this.type]
      
      @JSGlobal("Pizzicato.Effects.Reverb.mix")
      @js.native
      def mix: Double = js.native
      inline def mix_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mix")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Pizzicato.Effects.Reverb.reverse")
      @js.native
      def reverse: Boolean = js.native
      inline def reverse_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reverse")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Pizzicato.Effects.Reverb.time")
      @js.native
      def time: Double = js.native
      inline def time_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("time")(x.asInstanceOf[js.Any])
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("Pizzicato.Effects.Reverb")
    @js.native
    open class ReverbCls ()
      extends StObject
         with Reverb {
      def this(options: ReverbOptions) = this()
      
      /* CompleteClass */
      override def connect(audioNode: AudioNode): this.type = js.native
      
      /* CompleteClass */
      var decay: Double = js.native
      
      /* CompleteClass */
      override def disconnect(audioNode: AudioNode): this.type = js.native
      
      /* CompleteClass */
      var mix: Double = js.native
      
      /* CompleteClass */
      var reverse: Boolean = js.native
      
      /* CompleteClass */
      var time: Double = js.native
    }
    
    /* Inlined pizzicato.pizzicato.Effects.RingModulator & {new (options : pizzicato.pizzicato.Effects.RingModulatorOptions | undefined): pizzicato.pizzicato.Effects.RingModulator} */
    object RingModulator {
      
      @JSGlobal("Pizzicato.Effects.RingModulator")
      @js.native
      val ^ : js.Any = js.native
      
      inline def connect(audioNode: AudioNode): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(audioNode.asInstanceOf[js.Any]).asInstanceOf[this.type]
      
      inline def disconnect(audioNode: AudioNode): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("disconnect")(audioNode.asInstanceOf[js.Any]).asInstanceOf[this.type]
      
      @JSGlobal("Pizzicato.Effects.RingModulator.distortion")
      @js.native
      def distortion: Double = js.native
      inline def distortion_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("distortion")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Pizzicato.Effects.RingModulator.mix")
      @js.native
      def mix: Double = js.native
      inline def mix_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mix")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Pizzicato.Effects.RingModulator.speed")
      @js.native
      def speed: Double = js.native
      inline def speed_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("speed")(x.asInstanceOf[js.Any])
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("Pizzicato.Effects.RingModulator")
    @js.native
    open class RingModulatorCls ()
      extends StObject
         with RingModulator {
      def this(options: RingModulatorOptions) = this()
      
      /* CompleteClass */
      override def connect(audioNode: AudioNode): this.type = js.native
      
      /* CompleteClass */
      override def disconnect(audioNode: AudioNode): this.type = js.native
      
      /* CompleteClass */
      var distortion: Double = js.native
      
      /* CompleteClass */
      var mix: Double = js.native
      
      /* CompleteClass */
      var speed: Double = js.native
    }
    
    /* Inlined pizzicato.pizzicato.Effects.StereoPanner & {new (options : pizzicato.pizzicato.Effects.StereoPannerOptions | undefined): pizzicato.pizzicato.Effects.StereoPanner} */
    object StereoPanner {
      
      @JSGlobal("Pizzicato.Effects.StereoPanner")
      @js.native
      val ^ : js.Any = js.native
      
      inline def connect(audioNode: AudioNode): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(audioNode.asInstanceOf[js.Any]).asInstanceOf[this.type]
      
      inline def disconnect(audioNode: AudioNode): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("disconnect")(audioNode.asInstanceOf[js.Any]).asInstanceOf[this.type]
      
      @JSGlobal("Pizzicato.Effects.StereoPanner.pan")
      @js.native
      def pan: Double = js.native
      inline def pan_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pan")(x.asInstanceOf[js.Any])
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("Pizzicato.Effects.StereoPanner")
    @js.native
    open class StereoPannerCls ()
      extends StObject
         with StereoPanner {
      def this(options: StereoPannerOptions) = this()
      
      /* CompleteClass */
      override def connect(audioNode: AudioNode): this.type = js.native
      
      /* CompleteClass */
      override def disconnect(audioNode: AudioNode): this.type = js.native
      
      /* CompleteClass */
      var pan: Double = js.native
    }
    
    /* Inlined pizzicato.pizzicato.Effects.Tremolo & {new (options : pizzicato.pizzicato.Effects.TremoloOptions | undefined): pizzicato.pizzicato.Effects.Tremolo} */
    object Tremolo {
      
      @JSGlobal("Pizzicato.Effects.Tremolo")
      @js.native
      val ^ : js.Any = js.native
      
      inline def connect(audioNode: AudioNode): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(audioNode.asInstanceOf[js.Any]).asInstanceOf[this.type]
      
      @JSGlobal("Pizzicato.Effects.Tremolo.depth")
      @js.native
      def depth: Double = js.native
      inline def depth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("depth")(x.asInstanceOf[js.Any])
      
      inline def disconnect(audioNode: AudioNode): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("disconnect")(audioNode.asInstanceOf[js.Any]).asInstanceOf[this.type]
      
      @JSGlobal("Pizzicato.Effects.Tremolo.mix")
      @js.native
      def mix: Double = js.native
      inline def mix_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mix")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Pizzicato.Effects.Tremolo.speed")
      @js.native
      def speed: Double = js.native
      inline def speed_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("speed")(x.asInstanceOf[js.Any])
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("Pizzicato.Effects.Tremolo")
    @js.native
    open class TremoloCls ()
      extends StObject
         with Tremolo {
      def this(options: TremoloOptions) = this()
      
      /* CompleteClass */
      override def connect(audioNode: AudioNode): this.type = js.native
      
      /* CompleteClass */
      var depth: Double = js.native
      
      /* CompleteClass */
      override def disconnect(audioNode: AudioNode): this.type = js.native
      
      /* CompleteClass */
      var mix: Double = js.native
      
      /* CompleteClass */
      var speed: Double = js.native
    }
  }
  
  @JSGlobal("Pizzicato.Events")
  @js.native
  val Events: typingsJapgolly.pizzicato.mod.Events[String] = js.native
  
  @JSGlobal("Pizzicato.Group")
  @js.native
  open class Group ()
    extends typingsJapgolly.pizzicato.mod.Group {
    def this(sounds: js.Array[typingsJapgolly.pizzicato.mod.Sound[SoundDescription]]) = this()
  }
  
  @JSGlobal("Pizzicato.Sound")
  @js.native
  open class Sound[D /* <: SoundDescription */] ()
    extends typingsJapgolly.pizzicato.mod.Sound[D] {
    def this(description: D) = this()
    def this(description: D, callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]) = this()
    def this(description: Unit, callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]) = this()
  }
  
  object Util {
    
    @JSGlobal("Pizzicato.Util")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getDryLevel(mix: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDryLevel")(mix.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def getWetLevel(mix: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getWetLevel")(mix.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def isArray(arg: Any): /* is std.Array<unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(arg.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<unknown> */ Boolean]
    
    inline def isAudioBufferSourceNode(arg: Any): /* is std.AudioBufferSourceNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAudioBufferSourceNode")(arg.asInstanceOf[js.Any]).asInstanceOf[/* is std.AudioBufferSourceNode */ Boolean]
    
    inline def isBool(arg: Any): /* is boolean */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBool")(arg.asInstanceOf[js.Any]).asInstanceOf[/* is boolean */ Boolean]
    
    inline def isEffect(effect: Any): /* is pizzicato.pizzicato.Effect */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[/* is pizzicato.pizzicato.Effect */ Boolean]
    
    inline def isFunction(arg: Any): /* is pizzicato.pizzicato.UnknownFunction */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(arg.asInstanceOf[js.Any]).asInstanceOf[/* is pizzicato.pizzicato.UnknownFunction */ Boolean]
    
    inline def isInRange(arg: Double, min: Double, max: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInRange")(arg.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def isNumber(arg: Any): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(arg.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
    
    inline def isObject(arg: Any): /* is object */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(arg.asInstanceOf[js.Any]).asInstanceOf[/* is object */ Boolean]
    
    inline def isOscillator(arg: Any): /* is std.OscillatorNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOscillator")(arg.asInstanceOf[js.Any]).asInstanceOf[/* is std.OscillatorNode */ Boolean]
    
    inline def isSound(sound: Any): /* is pizzicato.pizzicato.Sound<pizzicato.pizzicato.SoundDescription> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSound")(sound.asInstanceOf[js.Any]).asInstanceOf[/* is pizzicato.pizzicato.Sound<pizzicato.pizzicato.SoundDescription> */ Boolean]
    
    inline def isString(arg: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(arg.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
    
    /**
      * Takes a number from 0 to 1 and normalizes it to fit within range
      * floor to ceiling.
      */
    inline def normalize(num: Double, floor: Double, ceil: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(num.asInstanceOf[js.Any], floor.asInstanceOf[js.Any], ceil.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  @JSGlobal("Pizzicato.context")
  @js.native
  val context: AudioContext = js.native
  
  @JSGlobal("Pizzicato.masterGainNode")
  @js.native
  val masterGainNode: GainNode = js.native
  
  @JSGlobal("Pizzicato.volume")
  @js.native
  def volume: Double = js.native
  inline def volume_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("volume")(x.asInstanceOf[js.Any])
}
