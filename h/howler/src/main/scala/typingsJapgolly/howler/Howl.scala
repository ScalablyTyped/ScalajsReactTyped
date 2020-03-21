package typingsJapgolly.howler

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.howler.howlerStrings.end
import typingsJapgolly.howler.howlerStrings.fade
import typingsJapgolly.howler.howlerStrings.load
import typingsJapgolly.howler.howlerStrings.loaded
import typingsJapgolly.howler.howlerStrings.loaderror
import typingsJapgolly.howler.howlerStrings.loading
import typingsJapgolly.howler.howlerStrings.mute
import typingsJapgolly.howler.howlerStrings.pause
import typingsJapgolly.howler.howlerStrings.play
import typingsJapgolly.howler.howlerStrings.playerror
import typingsJapgolly.howler.howlerStrings.rate
import typingsJapgolly.howler.howlerStrings.seek
import typingsJapgolly.howler.howlerStrings.stop
import typingsJapgolly.howler.howlerStrings.unloaded
import typingsJapgolly.howler.howlerStrings.unlock
import typingsJapgolly.howler.howlerStrings.volume
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Howl extends js.Object {
  def duration(): Double = js.native
  def duration(id: Double): Double = js.native
  def fade(from: Double, to: Double, duration: Double): this.type = js.native
  def fade(from: Double, to: Double, duration: Double, id: Double): this.type = js.native
  def load(): this.type = js.native
  def loop(): Boolean = js.native
  def loop(id: Double): Boolean = js.native
  def loop(loop: Boolean): this.type = js.native
  def loop(loop: Boolean, id: Double): this.type = js.native
  def mute(): Boolean = js.native
  def mute(muted: Boolean): this.type = js.native
  def mute(muted: Boolean, id: Double): this.type = js.native
  def off(): this.type = js.native
  def off(event: String): this.type = js.native
  def off(event: String, callback: js.Function): this.type = js.native
  def off(event: String, callback: js.Function, id: Double): this.type = js.native
  def on(event: String, callback: js.Function): this.type = js.native
  def on(event: String, callback: js.Function, id: Double): this.type = js.native
  @JSName("on")
  def on_end(event: end, callback: js.Function1[/* soundId */ Double, Unit]): this.type = js.native
  @JSName("on")
  def on_end(event: end, callback: js.Function1[/* soundId */ Double, Unit], id: Double): this.type = js.native
  @JSName("on")
  def on_fade(event: fade, callback: js.Function1[/* soundId */ Double, Unit]): this.type = js.native
  @JSName("on")
  def on_fade(event: fade, callback: js.Function1[/* soundId */ Double, Unit], id: Double): this.type = js.native
  @JSName("on")
  def on_load(event: load, callback: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_load(event: load, callback: js.Function0[Unit], id: Double): this.type = js.native
  @JSName("on")
  def on_loaderror(event: loaderror, callback: js.Function2[/* soundId */ Double, /* error */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_loaderror(
    event: loaderror,
    callback: js.Function2[/* soundId */ Double, /* error */ js.Any, Unit],
    id: Double
  ): this.type = js.native
  @JSName("on")
  def on_mute(event: mute, callback: js.Function1[/* soundId */ Double, Unit]): this.type = js.native
  @JSName("on")
  def on_mute(event: mute, callback: js.Function1[/* soundId */ Double, Unit], id: Double): this.type = js.native
  @JSName("on")
  def on_pause(event: pause, callback: js.Function1[/* soundId */ Double, Unit]): this.type = js.native
  @JSName("on")
  def on_pause(event: pause, callback: js.Function1[/* soundId */ Double, Unit], id: Double): this.type = js.native
  @JSName("on")
  def on_play(event: play, callback: js.Function1[/* soundId */ Double, Unit]): this.type = js.native
  @JSName("on")
  def on_play(event: play, callback: js.Function1[/* soundId */ Double, Unit], id: Double): this.type = js.native
  @JSName("on")
  def on_playerror(event: playerror, callback: js.Function2[/* soundId */ Double, /* error */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_playerror(
    event: playerror,
    callback: js.Function2[/* soundId */ Double, /* error */ js.Any, Unit],
    id: Double
  ): this.type = js.native
  @JSName("on")
  def on_rate(event: rate, callback: js.Function1[/* soundId */ Double, Unit]): this.type = js.native
  @JSName("on")
  def on_rate(event: rate, callback: js.Function1[/* soundId */ Double, Unit], id: Double): this.type = js.native
  @JSName("on")
  def on_seek(event: seek, callback: js.Function1[/* soundId */ Double, Unit]): this.type = js.native
  @JSName("on")
  def on_seek(event: seek, callback: js.Function1[/* soundId */ Double, Unit], id: Double): this.type = js.native
  @JSName("on")
  def on_stop(event: stop, callback: js.Function1[/* soundId */ Double, Unit]): this.type = js.native
  @JSName("on")
  def on_stop(event: stop, callback: js.Function1[/* soundId */ Double, Unit], id: Double): this.type = js.native
  @JSName("on")
  def on_unlock(event: unlock, callback: js.Function1[/* soundId */ Double, Unit]): this.type = js.native
  @JSName("on")
  def on_unlock(event: unlock, callback: js.Function1[/* soundId */ Double, Unit], id: Double): this.type = js.native
  @JSName("on")
  def on_volume(event: volume, callback: js.Function1[/* soundId */ Double, Unit]): this.type = js.native
  @JSName("on")
  def on_volume(event: volume, callback: js.Function1[/* soundId */ Double, Unit], id: Double): this.type = js.native
  def once(event: String, callback: js.Function): this.type = js.native
  def once(event: String, callback: js.Function, id: Double): this.type = js.native
  @JSName("once")
  def once_end(event: end, callback: js.Function1[/* soundId */ Double, Unit]): this.type = js.native
  @JSName("once")
  def once_end(event: end, callback: js.Function1[/* soundId */ Double, Unit], id: Double): this.type = js.native
  @JSName("once")
  def once_fade(event: fade, callback: js.Function1[/* soundId */ Double, Unit]): this.type = js.native
  @JSName("once")
  def once_fade(event: fade, callback: js.Function1[/* soundId */ Double, Unit], id: Double): this.type = js.native
  @JSName("once")
  def once_load(event: load, callback: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_load(event: load, callback: js.Function0[Unit], id: Double): this.type = js.native
  @JSName("once")
  def once_loaderror(event: loaderror, callback: js.Function2[/* soundId */ Double, /* error */ js.Any, Unit]): this.type = js.native
  @JSName("once")
  def once_loaderror(
    event: loaderror,
    callback: js.Function2[/* soundId */ Double, /* error */ js.Any, Unit],
    id: Double
  ): this.type = js.native
  @JSName("once")
  def once_mute(event: mute, callback: js.Function1[/* soundId */ Double, Unit]): this.type = js.native
  @JSName("once")
  def once_mute(event: mute, callback: js.Function1[/* soundId */ Double, Unit], id: Double): this.type = js.native
  @JSName("once")
  def once_pause(event: pause, callback: js.Function1[/* soundId */ Double, Unit]): this.type = js.native
  @JSName("once")
  def once_pause(event: pause, callback: js.Function1[/* soundId */ Double, Unit], id: Double): this.type = js.native
  @JSName("once")
  def once_play(event: play, callback: js.Function1[/* soundId */ Double, Unit]): this.type = js.native
  @JSName("once")
  def once_play(event: play, callback: js.Function1[/* soundId */ Double, Unit], id: Double): this.type = js.native
  @JSName("once")
  def once_playerror(event: playerror, callback: js.Function2[/* soundId */ Double, /* error */ js.Any, Unit]): this.type = js.native
  @JSName("once")
  def once_playerror(
    event: playerror,
    callback: js.Function2[/* soundId */ Double, /* error */ js.Any, Unit],
    id: Double
  ): this.type = js.native
  @JSName("once")
  def once_rate(event: rate, callback: js.Function1[/* soundId */ Double, Unit]): this.type = js.native
  @JSName("once")
  def once_rate(event: rate, callback: js.Function1[/* soundId */ Double, Unit], id: Double): this.type = js.native
  @JSName("once")
  def once_seek(event: seek, callback: js.Function1[/* soundId */ Double, Unit]): this.type = js.native
  @JSName("once")
  def once_seek(event: seek, callback: js.Function1[/* soundId */ Double, Unit], id: Double): this.type = js.native
  @JSName("once")
  def once_stop(event: stop, callback: js.Function1[/* soundId */ Double, Unit]): this.type = js.native
  @JSName("once")
  def once_stop(event: stop, callback: js.Function1[/* soundId */ Double, Unit], id: Double): this.type = js.native
  @JSName("once")
  def once_unlock(event: unlock, callback: js.Function1[/* soundId */ Double, Unit]): this.type = js.native
  @JSName("once")
  def once_unlock(event: unlock, callback: js.Function1[/* soundId */ Double, Unit], id: Double): this.type = js.native
  @JSName("once")
  def once_volume(event: volume, callback: js.Function1[/* soundId */ Double, Unit]): this.type = js.native
  @JSName("once")
  def once_volume(event: volume, callback: js.Function1[/* soundId */ Double, Unit], id: Double): this.type = js.native
  def orientation(x: Double, y: Double, z: Double, xUp: Double, yUp: Double, zUp: Double): this.type | Unit = js.native
  def pannerAttr(o: AnonConeInnerAngle): this.type = js.native
  def pannerAttr(o: AnonConeInnerAngle, id: Double): this.type = js.native
   // .play() is not chainable; the other methods are
  def pause(): this.type = js.native
  def pause(id: Double): this.type = js.native
  def play(): Double = js.native
  def play(spriteOrId: String): Double = js.native
  def play(spriteOrId: Double): Double = js.native
  def playing(): Boolean = js.native
  def playing(id: Double): Boolean = js.native
  def pos(x: Double, y: Double, z: Double): this.type | Unit = js.native
  def pos(x: Double, y: Double, z: Double, id: Double): this.type | Unit = js.native
  def rate(): Double = js.native
  def rate(idOrSetRate: Double): this.type | Double = js.native
  def rate(rate: Double, id: Double): this.type = js.native
  def seek(): this.type | Double = js.native
  def seek(seek: Double): this.type | Double = js.native
  def seek(seek: Double, id: Double): this.type | Double = js.native
  def state(): unloaded | loading | loaded = js.native
  def stereo(pan: Double): this.type | Unit = js.native
  def stereo(pan: Double, id: Double): this.type | Unit = js.native
  def stop(): this.type = js.native
  def stop(id: Double): this.type = js.native
  def unload(): Unit = js.native
  def volume(): Double = js.native
  def volume(idOrSetVolume: Double): this.type | Double = js.native
  def volume(volume: Double, id: Double): this.type = js.native
}

@JSGlobal("Howl")
@js.native
object Howl extends TopLevel[HowlStatic]

