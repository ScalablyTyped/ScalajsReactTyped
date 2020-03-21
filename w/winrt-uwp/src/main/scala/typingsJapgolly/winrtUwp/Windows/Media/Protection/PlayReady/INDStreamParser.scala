package typingsJapgolly.winrtUwp.Windows.Media.Protection.PlayReady

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.AnonStreamType
import typingsJapgolly.winrtUwp.Windows.Media.Core.IMediaStreamDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parses data from a PlayReady-ND media stream. */
trait INDStreamParser extends js.Object {
  /** Gets the stream parser notifier that will provide notification of stream parser events from the transmitter. */
  var notifier: NDStreamParserNotifier
  /** Notifies a PlayReady-ND stream parser to be ready for the beginning of a new media stream. */
  def beginOfStream(): Unit
  /** Notifies a PlayReady-ND stream parser that the end of a media stream has been reached. */
  def endOfStream(): Unit
  /**
    * Retrieves the stream type (audio or video) and stream identifier of the media stream descriptor.
    * @param descriptor The media stream from which this method gets information.
    */
  def getStreamInformation(descriptor: IMediaStreamDescriptor): AnonStreamType
  /**
    * Parses samples from a PlayReady-ND media stream.
    * @param dataBytes The data to be parsed.
    */
  def parseData(dataBytes: js.Array[Double]): Unit
}

object INDStreamParser {
  @scala.inline
  def apply(
    beginOfStream: Callback,
    endOfStream: Callback,
    getStreamInformation: IMediaStreamDescriptor => CallbackTo[AnonStreamType],
    notifier: NDStreamParserNotifier,
    parseData: js.Array[Double] => Callback
  ): INDStreamParser = {
    val __obj = js.Dynamic.literal(notifier = notifier.asInstanceOf[js.Any])
    __obj.updateDynamic("beginOfStream")(beginOfStream.toJsFn)
    __obj.updateDynamic("endOfStream")(endOfStream.toJsFn)
    __obj.updateDynamic("getStreamInformation")(js.Any.fromFunction1((t0: typingsJapgolly.winrtUwp.Windows.Media.Core.IMediaStreamDescriptor) => getStreamInformation(t0).runNow()))
    __obj.updateDynamic("parseData")(js.Any.fromFunction1((t0: js.Array[scala.Double]) => parseData(t0).runNow()))
    __obj.asInstanceOf[INDStreamParser]
  }
}

