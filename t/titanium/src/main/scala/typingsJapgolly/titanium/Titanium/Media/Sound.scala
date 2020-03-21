package typingsJapgolly.titanium.Titanium.Media

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.titanium.Titanium.Proxy
import typingsJapgolly.titanium.Titanium.UI.TabGroup
import typingsJapgolly.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * An object for playing basic audio resources.
		 */
trait Sound extends Proxy {
  /**
  			 * Used to identify the volume of audio streams for alarms.
  			 */
  val AUDIO_TYPE_ALARM: Double
  /**
  			 * Used to identify the volume of audio streams for media playback.
  			 */
  val AUDIO_TYPE_MEDIA: Double
  /**
  			 * Used to identify the volume of audio streams for notifications.
  			 */
  val AUDIO_TYPE_NOTIFICATION: Double
  /**
  			 * Used to identify the volume of audio streams for the phone ring.
  			 */
  val AUDIO_TYPE_RING: Double
  /**
  			 * Used to identify the volume of audio streams for DTMF tones or beeps.
  			 */
  val AUDIO_TYPE_SIGNALLING: Double
  /**
  			 * Used to identify the volume of audio streams for voice calls.
  			 */
  val AUDIO_TYPE_VOICE: Double
  /**
  			 * Audio data is being buffered from the network.
  			 */
  val STATE_BUFFERING: Double
  /**
  			 * Audio playback is being initialized.
  			 */
  val STATE_INITIALIZED: Double
  /**
  			 * Playback is paused.
  			 */
  val STATE_PAUSED: Double
  /**
  			 * Audio playback is active.
  			 */
  val STATE_PLAYING: Double
  /**
  			 * Audio playback is starting.
  			 */
  val STATE_STARTING: Double
  /**
  			 * Audio playback is stopped.
  			 */
  val STATE_STOPPED: Double
  /**
  			 * Audio playback is stopping.
  			 */
  val STATE_STOPPING: Double
  /**
  			 * Player is waiting for audio data from the network.
  			 */
  val STATE_WAITING_FOR_DATA: Double
  /**
  			 * Player is waiting for audio data to fill the queue.
  			 */
  val STATE_WAITING_FOR_QUEUE: Double
  /**
  			 * Determines whether the audio should continue playing even when its activity is paused.
  			 */
  var allowBackground: Boolean
  /**
  			 * Changes the audio-stream-type.
  			 */
  var audioType: Double
  /**
  			 * Duration of the audio resource.
  			 */
  val duration: Double
  /**
  			 * Determines whether the audio should loop upon completion.
  			 */
  var looping: Boolean
  /**
  			 * Indicates if the audio is paused.
  			 */
  var paused: Boolean
  /**
  			 * Indicates if the audio is playing.
  			 */
  val playing: Boolean
  /**
  			 * Current playback position of the audio.
  			 */
  var time: Double
  /**
  			 * URL identifying the audio resource.
  			 */
  var url: String
  /**
  			 * Volume of the audio from 0.0 (muted) to 1.0 (loudest).
  			 */
  var volume: Double
  /**
  			 * Gets the value of the <Titanium.Media.Sound.audioType> property.
  			 */
  def getAudioType(): Double
  /**
  			 * Gets the value of the <Titanium.Media.Sound.duration> property.
  			 */
  def getDuration(): Double
  /**
  			 * Gets the value of the <Titanium.Media.Sound.time> property.
  			 */
  def getTime(): Double
  /**
  			 * Gets the value of the <Titanium.Media.Sound.url> property.
  			 */
  def getUrl(): String
  /**
  			 * Gets the value of the <Titanium.Media.Sound.volume> property.
  			 */
  def getVolume(): Double
  /**
  			 * Returns the value of the [looping](Titanium.Media.Sound.looping) property.
  			 */
  def isLooping(): Boolean
  /**
  			 * Returns the value of the [paused](Titanium.Media.Sound.paused) property.
  			 */
  def isPaused(): Boolean
  /**
  			 * Returns the value of the [playing](Titanium.Media.Sound.playing) property.
  			 */
  def isPlaying(): Boolean
  /**
  			 * Pauses the audio.
  			 */
  def pause(): Unit
  /**
  			 * Starting playing the sound, or resume playing a paused sound.
  			 */
  def play(): Unit
  /**
  			 * Releases all internal resources.
  			 */
  def release(): Unit
  /**
  			 * Resets the audio playback position to the beginning.
  			 */
  def reset(): Unit
  /**
  			 * Sets the value of the <Titanium.Media.Sound.audioType> property.
  			 */
  def setAudioType(audioType: Double): Unit
  /**
  			 * Sets the value of the [looping](Titanium.Media.Sound.looping) property.
  			 */
  def setLooping(looping: Boolean): Unit
  /**
  			 * Sets the value of the [paused](Titanium.Media.Sound.paused) property.
  			 */
  def setPaused(paused: Boolean): Unit
  /**
  			 * Sets the value of the <Titanium.Media.Sound.time> property.
  			 */
  def setTime(time: Double): Unit
  /**
  			 * Sets the value of the <Titanium.Media.Sound.url> property.
  			 */
  def setUrl(url: String): Unit
  /**
  			 * Sets the value of the <Titanium.Media.Sound.volume> property.
  			 */
  def setVolume(volume: Double): Unit
  /**
  			 * Stops playing the audio and resets the playback position to the beginning of the clip.
  			 */
  def stop(): Unit
}

object Sound {
  @scala.inline
  def apply(
    AUDIO_TYPE_ALARM: Double,
    AUDIO_TYPE_MEDIA: Double,
    AUDIO_TYPE_NOTIFICATION: Double,
    AUDIO_TYPE_RING: Double,
    AUDIO_TYPE_SIGNALLING: Double,
    AUDIO_TYPE_VOICE: Double,
    STATE_BUFFERING: Double,
    STATE_INITIALIZED: Double,
    STATE_PAUSED: Double,
    STATE_PLAYING: Double,
    STATE_STARTING: Double,
    STATE_STOPPED: Double,
    STATE_STOPPING: Double,
    STATE_WAITING_FOR_DATA: Double,
    STATE_WAITING_FOR_QUEUE: Double,
    addEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    allowBackground: Boolean,
    apiName: String,
    applyProperties: js.Any => Callback,
    audioType: Double,
    bubbleParent: Boolean,
    duration: Double,
    fireEvent: (String, js.Any) => Callback,
    getApiName: CallbackTo[String],
    getAudioType: CallbackTo[Double],
    getBubbleParent: CallbackTo[Boolean],
    getDuration: CallbackTo[Double],
    getTime: CallbackTo[Double],
    getUrl: CallbackTo[String],
    getVolume: CallbackTo[Double],
    isLooping: CallbackTo[Boolean],
    isPaused: CallbackTo[Boolean],
    isPlaying: CallbackTo[Boolean],
    looping: Boolean,
    pause: Callback,
    paused: Boolean,
    play: Callback,
    playing: Boolean,
    release: Callback,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    reset: Callback,
    setAudioType: Double => Callback,
    setBubbleParent: Boolean => Callback,
    setLooping: Boolean => Callback,
    setPaused: Boolean => Callback,
    setTime: Double => Callback,
    setUrl: String => Callback,
    setVolume: Double => Callback,
    stop: Callback,
    time: Double,
    url: String,
    volume: Double,
    getLifecycleContainer: js.UndefOr[CallbackTo[Window | TabGroup]] = js.undefined,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): Sound = {
    val __obj = js.Dynamic.literal(AUDIO_TYPE_ALARM = AUDIO_TYPE_ALARM.asInstanceOf[js.Any], AUDIO_TYPE_MEDIA = AUDIO_TYPE_MEDIA.asInstanceOf[js.Any], AUDIO_TYPE_NOTIFICATION = AUDIO_TYPE_NOTIFICATION.asInstanceOf[js.Any], AUDIO_TYPE_RING = AUDIO_TYPE_RING.asInstanceOf[js.Any], AUDIO_TYPE_SIGNALLING = AUDIO_TYPE_SIGNALLING.asInstanceOf[js.Any], AUDIO_TYPE_VOICE = AUDIO_TYPE_VOICE.asInstanceOf[js.Any], STATE_BUFFERING = STATE_BUFFERING.asInstanceOf[js.Any], STATE_INITIALIZED = STATE_INITIALIZED.asInstanceOf[js.Any], STATE_PAUSED = STATE_PAUSED.asInstanceOf[js.Any], STATE_PLAYING = STATE_PLAYING.asInstanceOf[js.Any], STATE_STARTING = STATE_STARTING.asInstanceOf[js.Any], STATE_STOPPED = STATE_STOPPED.asInstanceOf[js.Any], STATE_STOPPING = STATE_STOPPING.asInstanceOf[js.Any], STATE_WAITING_FOR_DATA = STATE_WAITING_FOR_DATA.asInstanceOf[js.Any], STATE_WAITING_FOR_QUEUE = STATE_WAITING_FOR_QUEUE.asInstanceOf[js.Any], allowBackground = allowBackground.asInstanceOf[js.Any], apiName = apiName.asInstanceOf[js.Any], audioType = audioType.asInstanceOf[js.Any], bubbleParent = bubbleParent.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], looping = looping.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("applyProperties")(js.Any.fromFunction1((t0: js.Any) => applyProperties(t0).runNow()))
    __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => fireEvent(t0, t1).runNow()))
    __obj.updateDynamic("getApiName")(getApiName.toJsFn)
    __obj.updateDynamic("getAudioType")(getAudioType.toJsFn)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent.toJsFn)
    __obj.updateDynamic("getDuration")(getDuration.toJsFn)
    __obj.updateDynamic("getTime")(getTime.toJsFn)
    __obj.updateDynamic("getUrl")(getUrl.toJsFn)
    __obj.updateDynamic("getVolume")(getVolume.toJsFn)
    __obj.updateDynamic("isLooping")(isLooping.toJsFn)
    __obj.updateDynamic("isPaused")(isPaused.toJsFn)
    __obj.updateDynamic("isPlaying")(isPlaying.toJsFn)
    __obj.updateDynamic("pause")(pause.toJsFn)
    __obj.updateDynamic("play")(play.toJsFn)
    __obj.updateDynamic("release")(release.toJsFn)
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => removeEventListener(t0, t1).runNow()))
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.updateDynamic("setAudioType")(js.Any.fromFunction1((t0: scala.Double) => setAudioType(t0).runNow()))
    __obj.updateDynamic("setBubbleParent")(js.Any.fromFunction1((t0: scala.Boolean) => setBubbleParent(t0).runNow()))
    __obj.updateDynamic("setLooping")(js.Any.fromFunction1((t0: scala.Boolean) => setLooping(t0).runNow()))
    __obj.updateDynamic("setPaused")(js.Any.fromFunction1((t0: scala.Boolean) => setPaused(t0).runNow()))
    __obj.updateDynamic("setTime")(js.Any.fromFunction1((t0: scala.Double) => setTime(t0).runNow()))
    __obj.updateDynamic("setUrl")(js.Any.fromFunction1((t0: java.lang.String) => setUrl(t0).runNow()))
    __obj.updateDynamic("setVolume")(js.Any.fromFunction1((t0: scala.Double) => setVolume(t0).runNow()))
    __obj.updateDynamic("stop")(stop.toJsFn)
    getLifecycleContainer.foreach(p => __obj.updateDynamic("getLifecycleContainer")(p.toJsFn))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sound]
  }
}

