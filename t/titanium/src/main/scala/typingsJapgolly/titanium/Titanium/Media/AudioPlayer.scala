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
		 * An audio player object used for streaming audio to the device, and low-level control of the audio playback.
		 */
trait AudioPlayer extends Proxy {
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
  			 * Boolean to indicate if audio should continue playing even if the associated
  			 * Android [Activity](Titanium.Android.Activity) is paused.
  			 */
  var allowBackground: Boolean
  /**
  			 * Indicates whether the player allows switching to "external playback" mode.
  			 */
  var allowsExternalPlayback: Boolean
  /**
  			 * Focuses on the current audio player and stops other audio playing.
  			 */
  var audioFocus: Boolean
  /**
  			 * Changes the audio-stream-type.
  			 */
  var audioType: Double
  /**
  			 * Bit rate of the current playback stream.
  			 */
  var bitRate: Double
  /**
  			 * Size of the buffer used for streaming, in milliseconds.
  			 */
  var bufferSize: Double
  /**
  			 * Estimated duration in milliseconds of the file being played.
  			 */
  val duration: Double
  /**
  			 * Indicates whether the player is currently playing video in "external playback" mode.
  			 */
  val externalPlaybackActive: Boolean
  /**
  			 * Boolean indicating if the player is idle.
  			 */
  val idle: Boolean
  /**
  			 * Indicates whether or not audio output of the player is muted.
  			 */
  var muted: Boolean
  /**
  			 * Boolean indicating if audio playback is paused.
  			 */
  var paused: Boolean
  /**
  			 * Boolean indicating if audio is currently playing.
  			 */
  val playing: Boolean
  /**
  			 * Current playback progress, in milliseconds.
  			 */
  val progress: Double
  /**
  			 * Indicates the desired rate of playback; 0.0 means "paused", 1.0 indicates a
  			 * desire to play at the natural rate of the current item. In addition, 2.0
  			 * would mean that the audio plays twice as fast.
  			 */
  var rate: Double
  /**
  			 * Current state of playback, specified using one of the `STATE` constants defined on this object.
  			 */
  val state: Double
  /**
  			 * Current playback position of the audio.
  			 */
  var time: Double
  /**
  			 * URL for the audio stream.
  			 */
  var url: String
  /**
  			 * Volume of the audio, from 0.0 (muted) to 1.0 (loudest).
  			 */
  var volume: Double
  /**
  			 * Boolean indicating if the playback is waiting for audio data from the network.
  			 */
  val waiting: Boolean
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.allowBackground> property.
  			 */
  def getAllowBackground(): Boolean
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.allowsExternalPlayback> property.
  			 */
  def getAllowsExternalPlayback(): Boolean
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.audioFocus> property.
  			 */
  def getAudioFocus(): Boolean
  /**
  			 * Returns the audio session id.
  			 */
  def getAudioSessionId(): Double
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.audioType> property.
  			 */
  def getAudioType(): Double
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.bitRate> property.
  			 */
  def getBitRate(): Double
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.bufferSize> property.
  			 */
  def getBufferSize(): Double
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.duration> property.
  			 */
  def getDuration(): Double
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.externalPlaybackActive> property.
  			 */
  def getExternalPlaybackActive(): Boolean
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.idle> property.
  			 */
  def getIdle(): Boolean
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.muted> property.
  			 */
  def getMuted(): Boolean
  /**
  			 * Returns the value of the [paused](Titanium.Media.AudioPlayer.paused) property.
  			 */
  def getPaused(): Boolean
  /**
  			 * Returns the value of the [playing](Titanium.Media.AudioPlayer.playing) property.
  			 */
  def getPlaying(): Boolean
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.progress> property.
  			 */
  def getProgress(): Double
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.rate> property.
  			 */
  def getRate(): Double
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.state> property.
  			 */
  def getState(): Double
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.time> property.
  			 */
  def getTime(): Double
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.url> property.
  			 */
  def getUrl(): String
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.volume> property.
  			 */
  def getVolume(): Double
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.waiting> property.
  			 */
  def getWaiting(): Boolean
  /**
  			 * Returns the value of the [paused](Titanium.Media.AudioPlayer.paused) property.
  			 */
  def isPaused(): Boolean
  /**
  			 * Returns the value of the [playing](Titanium.Media.AudioPlayer.playing) property.
  			 */
  def isPlaying(): Boolean
  /**
  			 * Pauses audio playback.
  			 */
  def pause(): Unit
  /**
  			 * Starts or resumes audio playback.
  			 */
  def play(): Unit
  /**
  			 * Stops buffering audio data and releases audio resources.
  			 */
  def release(): Unit
  /**
  			 * Restarts (stops and stars) audio playback.
  			 */
  def restart(): Unit
  /**
  			 * Moves the playback cursor and invokes the specified block when the seek
  			 * operation has either been completed or been interrupted.
  			 */
  def seekToTime(time: Double): Unit
  /**
  			 * Sets the value of the <Titanium.Media.AudioPlayer.allowBackground> property.
  			 */
  def setAllowBackground(allowBackground: Boolean): Unit
  /**
  			 * Sets the value of the <Titanium.Media.AudioPlayer.allowsExternalPlayback> property.
  			 */
  def setAllowsExternalPlayback(allowsExternalPlayback: Boolean): Unit
  /**
  			 * Sets the value of the <Titanium.Media.AudioPlayer.audioFocus> property.
  			 */
  def setAudioFocus(audioFocus: Boolean): Unit
  /**
  			 * Sets the value of the <Titanium.Media.AudioPlayer.audioType> property.
  			 */
  def setAudioType(audioType: Double): Unit
  /**
  			 * Sets the value of the <Titanium.Media.AudioPlayer.bitRate> property.
  			 */
  def setBitRate(bitRate: Double): Unit
  /**
  			 * Sets the value of the <Titanium.Media.AudioPlayer.bufferSize> property.
  			 */
  def setBufferSize(bufferSize: Double): Unit
  /**
  			 * Sets the value of the <Titanium.Media.AudioPlayer.muted> property.
  			 */
  def setMuted(muted: Boolean): Unit
  /**
  			 * Sets the value of the [paused](Titanium.Media.AudioPlayer.paused) property.
  			 */
  def setPaused(paused: Boolean): Unit
  /**
  			 * Sets the value of the <Titanium.Media.AudioPlayer.rate> property.
  			 */
  def setRate(rate: Double): Unit
  /**
  			 * Sets the value of the <Titanium.Media.AudioPlayer.time> property.
  			 */
  def setTime(time: Double): Unit
  /**
  			 * Sets the value of the <Titanium.Media.AudioPlayer.url> property.
  			 */
  def setUrl(url: String): Unit
  /**
  			 * Sets the value of the <Titanium.Media.AudioPlayer.volume> property.
  			 */
  def setVolume(volume: Double): Unit
  /**
  			 * Starts or resumes audio playback.
  			 */
  def start(): Unit
  /**
  			 * Converts a [state](Titanium.Media.AudioPlayer.state) value into a text description
  			 * suitable for display.
  			 */
  def stateDescription(state: Double): String
  /**
  			 * Stops audio playback.
  			 */
  def stop(): Unit
}

object AudioPlayer {
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
    allowsExternalPlayback: Boolean,
    apiName: String,
    applyProperties: js.Any => Callback,
    audioFocus: Boolean,
    audioType: Double,
    bitRate: Double,
    bubbleParent: Boolean,
    bufferSize: Double,
    duration: Double,
    externalPlaybackActive: Boolean,
    fireEvent: (String, js.Any) => Callback,
    getAllowBackground: CallbackTo[Boolean],
    getAllowsExternalPlayback: CallbackTo[Boolean],
    getApiName: CallbackTo[String],
    getAudioFocus: CallbackTo[Boolean],
    getAudioSessionId: CallbackTo[Double],
    getAudioType: CallbackTo[Double],
    getBitRate: CallbackTo[Double],
    getBubbleParent: CallbackTo[Boolean],
    getBufferSize: CallbackTo[Double],
    getDuration: CallbackTo[Double],
    getExternalPlaybackActive: CallbackTo[Boolean],
    getIdle: CallbackTo[Boolean],
    getMuted: CallbackTo[Boolean],
    getPaused: CallbackTo[Boolean],
    getPlaying: CallbackTo[Boolean],
    getProgress: CallbackTo[Double],
    getRate: CallbackTo[Double],
    getState: CallbackTo[Double],
    getTime: CallbackTo[Double],
    getUrl: CallbackTo[String],
    getVolume: CallbackTo[Double],
    getWaiting: CallbackTo[Boolean],
    idle: Boolean,
    isPaused: CallbackTo[Boolean],
    isPlaying: CallbackTo[Boolean],
    muted: Boolean,
    pause: Callback,
    paused: Boolean,
    play: Callback,
    playing: Boolean,
    progress: Double,
    rate: Double,
    release: Callback,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    restart: Callback,
    seekToTime: Double => Callback,
    setAllowBackground: Boolean => Callback,
    setAllowsExternalPlayback: Boolean => Callback,
    setAudioFocus: Boolean => Callback,
    setAudioType: Double => Callback,
    setBitRate: Double => Callback,
    setBubbleParent: Boolean => Callback,
    setBufferSize: Double => Callback,
    setMuted: Boolean => Callback,
    setPaused: Boolean => Callback,
    setRate: Double => Callback,
    setTime: Double => Callback,
    setUrl: String => Callback,
    setVolume: Double => Callback,
    start: Callback,
    state: Double,
    stateDescription: Double => CallbackTo[String],
    stop: Callback,
    time: Double,
    url: String,
    volume: Double,
    waiting: Boolean,
    getLifecycleContainer: js.UndefOr[CallbackTo[Window | TabGroup]] = js.undefined,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): AudioPlayer = {
    val __obj = js.Dynamic.literal(AUDIO_TYPE_ALARM = AUDIO_TYPE_ALARM.asInstanceOf[js.Any], AUDIO_TYPE_MEDIA = AUDIO_TYPE_MEDIA.asInstanceOf[js.Any], AUDIO_TYPE_NOTIFICATION = AUDIO_TYPE_NOTIFICATION.asInstanceOf[js.Any], AUDIO_TYPE_RING = AUDIO_TYPE_RING.asInstanceOf[js.Any], AUDIO_TYPE_SIGNALLING = AUDIO_TYPE_SIGNALLING.asInstanceOf[js.Any], AUDIO_TYPE_VOICE = AUDIO_TYPE_VOICE.asInstanceOf[js.Any], STATE_BUFFERING = STATE_BUFFERING.asInstanceOf[js.Any], STATE_INITIALIZED = STATE_INITIALIZED.asInstanceOf[js.Any], STATE_PAUSED = STATE_PAUSED.asInstanceOf[js.Any], STATE_PLAYING = STATE_PLAYING.asInstanceOf[js.Any], STATE_STARTING = STATE_STARTING.asInstanceOf[js.Any], STATE_STOPPED = STATE_STOPPED.asInstanceOf[js.Any], STATE_STOPPING = STATE_STOPPING.asInstanceOf[js.Any], STATE_WAITING_FOR_DATA = STATE_WAITING_FOR_DATA.asInstanceOf[js.Any], STATE_WAITING_FOR_QUEUE = STATE_WAITING_FOR_QUEUE.asInstanceOf[js.Any], allowBackground = allowBackground.asInstanceOf[js.Any], allowsExternalPlayback = allowsExternalPlayback.asInstanceOf[js.Any], apiName = apiName.asInstanceOf[js.Any], audioFocus = audioFocus.asInstanceOf[js.Any], audioType = audioType.asInstanceOf[js.Any], bitRate = bitRate.asInstanceOf[js.Any], bubbleParent = bubbleParent.asInstanceOf[js.Any], bufferSize = bufferSize.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], externalPlaybackActive = externalPlaybackActive.asInstanceOf[js.Any], idle = idle.asInstanceOf[js.Any], muted = muted.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], rate = rate.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any])
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("applyProperties")(js.Any.fromFunction1((t0: js.Any) => applyProperties(t0).runNow()))
    __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => fireEvent(t0, t1).runNow()))
    __obj.updateDynamic("getAllowBackground")(getAllowBackground.toJsFn)
    __obj.updateDynamic("getAllowsExternalPlayback")(getAllowsExternalPlayback.toJsFn)
    __obj.updateDynamic("getApiName")(getApiName.toJsFn)
    __obj.updateDynamic("getAudioFocus")(getAudioFocus.toJsFn)
    __obj.updateDynamic("getAudioSessionId")(getAudioSessionId.toJsFn)
    __obj.updateDynamic("getAudioType")(getAudioType.toJsFn)
    __obj.updateDynamic("getBitRate")(getBitRate.toJsFn)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent.toJsFn)
    __obj.updateDynamic("getBufferSize")(getBufferSize.toJsFn)
    __obj.updateDynamic("getDuration")(getDuration.toJsFn)
    __obj.updateDynamic("getExternalPlaybackActive")(getExternalPlaybackActive.toJsFn)
    __obj.updateDynamic("getIdle")(getIdle.toJsFn)
    __obj.updateDynamic("getMuted")(getMuted.toJsFn)
    __obj.updateDynamic("getPaused")(getPaused.toJsFn)
    __obj.updateDynamic("getPlaying")(getPlaying.toJsFn)
    __obj.updateDynamic("getProgress")(getProgress.toJsFn)
    __obj.updateDynamic("getRate")(getRate.toJsFn)
    __obj.updateDynamic("getState")(getState.toJsFn)
    __obj.updateDynamic("getTime")(getTime.toJsFn)
    __obj.updateDynamic("getUrl")(getUrl.toJsFn)
    __obj.updateDynamic("getVolume")(getVolume.toJsFn)
    __obj.updateDynamic("getWaiting")(getWaiting.toJsFn)
    __obj.updateDynamic("isPaused")(isPaused.toJsFn)
    __obj.updateDynamic("isPlaying")(isPlaying.toJsFn)
    __obj.updateDynamic("pause")(pause.toJsFn)
    __obj.updateDynamic("play")(play.toJsFn)
    __obj.updateDynamic("release")(release.toJsFn)
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => removeEventListener(t0, t1).runNow()))
    __obj.updateDynamic("restart")(restart.toJsFn)
    __obj.updateDynamic("seekToTime")(js.Any.fromFunction1((t0: scala.Double) => seekToTime(t0).runNow()))
    __obj.updateDynamic("setAllowBackground")(js.Any.fromFunction1((t0: scala.Boolean) => setAllowBackground(t0).runNow()))
    __obj.updateDynamic("setAllowsExternalPlayback")(js.Any.fromFunction1((t0: scala.Boolean) => setAllowsExternalPlayback(t0).runNow()))
    __obj.updateDynamic("setAudioFocus")(js.Any.fromFunction1((t0: scala.Boolean) => setAudioFocus(t0).runNow()))
    __obj.updateDynamic("setAudioType")(js.Any.fromFunction1((t0: scala.Double) => setAudioType(t0).runNow()))
    __obj.updateDynamic("setBitRate")(js.Any.fromFunction1((t0: scala.Double) => setBitRate(t0).runNow()))
    __obj.updateDynamic("setBubbleParent")(js.Any.fromFunction1((t0: scala.Boolean) => setBubbleParent(t0).runNow()))
    __obj.updateDynamic("setBufferSize")(js.Any.fromFunction1((t0: scala.Double) => setBufferSize(t0).runNow()))
    __obj.updateDynamic("setMuted")(js.Any.fromFunction1((t0: scala.Boolean) => setMuted(t0).runNow()))
    __obj.updateDynamic("setPaused")(js.Any.fromFunction1((t0: scala.Boolean) => setPaused(t0).runNow()))
    __obj.updateDynamic("setRate")(js.Any.fromFunction1((t0: scala.Double) => setRate(t0).runNow()))
    __obj.updateDynamic("setTime")(js.Any.fromFunction1((t0: scala.Double) => setTime(t0).runNow()))
    __obj.updateDynamic("setUrl")(js.Any.fromFunction1((t0: java.lang.String) => setUrl(t0).runNow()))
    __obj.updateDynamic("setVolume")(js.Any.fromFunction1((t0: scala.Double) => setVolume(t0).runNow()))
    __obj.updateDynamic("start")(start.toJsFn)
    __obj.updateDynamic("stateDescription")(js.Any.fromFunction1((t0: scala.Double) => stateDescription(t0).runNow()))
    __obj.updateDynamic("stop")(stop.toJsFn)
    getLifecycleContainer.foreach(p => __obj.updateDynamic("getLifecycleContainer")(p.toJsFn))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioPlayer]
  }
}

