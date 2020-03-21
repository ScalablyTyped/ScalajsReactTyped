package typingsJapgolly.jupyterlabRendermime.attachmentmodelMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jupyterlabCoreutils.nbformatMod.nbformat.IMimeBundle
import typingsJapgolly.jupyterlabRendermimeInterfaces.mod.IRenderMime.IMimeModel
import typingsJapgolly.jupyterlabRendermimeInterfaces.mod.IRenderMime.IMimeModel.ISetDataOptions
import typingsJapgolly.phosphorCoreutils.jsonMod.ReadonlyJSONObject
import typingsJapgolly.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAttachmentModel_ extends IMimeModel {
  /**
    * A signal emitted when the attachment model changes.
    */
  val changed: ISignal[this.type, Unit]
  /**
    * Dispose of the resources used by the attachment model.
    */
  def dispose(): Unit
  /**
    * Serialize the model to JSON.
    */
  def toJSON(): IMimeBundle
}

object IAttachmentModel_ {
  @scala.inline
  def apply(
    changed: ISignal[IAttachmentModel_, Unit],
    data: ReadonlyJSONObject,
    dispose: Callback,
    metadata: ReadonlyJSONObject,
    setData: ISetDataOptions => Callback,
    toJSON: CallbackTo[IMimeBundle],
    trusted: Boolean
  ): IAttachmentModel_ = {
    val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], trusted = trusted.asInstanceOf[js.Any])
    __obj.updateDynamic("dispose")(dispose.toJsFn)
    __obj.updateDynamic("setData")(js.Any.fromFunction1((t0: typingsJapgolly.jupyterlabRendermimeInterfaces.mod.IRenderMime.IMimeModel.ISetDataOptions) => setData(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.asInstanceOf[IAttachmentModel_]
  }
}

