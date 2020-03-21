package typingsJapgolly.jupyterlabAttachments.modelMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jupyterlabAttachments.modelMod.IAttachmentsModel.ChangedArgs
import typingsJapgolly.jupyterlabAttachments.modelMod.IAttachmentsModel.IContentFactory
import typingsJapgolly.jupyterlabCoreutils.nbformatMod.nbformat.IAttachments
import typingsJapgolly.jupyterlabCoreutils.nbformatMod.nbformat.IMimeBundle
import typingsJapgolly.jupyterlabRendermime.attachmentmodelMod.IAttachmentModel
import typingsJapgolly.phosphorDisposable.mod.IDisposable
import typingsJapgolly.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAttachmentsModel_ extends IDisposable {
  /**
    * A signal emitted when the model changes.
    */
  val changed: ISignal[IAttachmentsModel, ChangedArgs]
  /**
    * The attachment content factory used by the model.
    */
  val contentFactory: IContentFactory
  /**
    * The keys of the attachments in the model.
    */
  val keys: js.Array[String]
  /**
    * The length of the items in the model.
    */
  val length: Double
  /**
    * Remove the attachment whose name is the specified key.
    * Note that this is optional only until Jupyterlab 2.0 release.
    */
  var remove: js.UndefOr[js.Function1[/* key */ String, Unit]] = js.undefined
  /**
    * A signal emitted when the model state changes.
    */
  val stateChanged: ISignal[IAttachmentsModel, Unit]
  /**
    * Clear all of the attachments.
    */
  def clear(): Unit
  /**
    * Deserialize the model from JSON.
    *
    * #### Notes
    * This will clear any existing data.
    */
  def fromJSON(values: IAttachments): Unit
  /**
    * Get an item for the specified key.
    */
  def get(key: String): IAttachmentModel
  /**
    * Whether the specified key is set.
    */
  def has(key: String): Boolean
  /**
    * Set the value of the specified key.
    */
  def set(key: String, attachment: IMimeBundle): Unit
  /**
    * Serialize the model to JSON.
    */
  def toJSON(): IAttachments
}

object IAttachmentsModel_ {
  @scala.inline
  def apply(
    changed: ISignal[IAttachmentsModel, ChangedArgs],
    clear: Callback,
    contentFactory: IContentFactory,
    dispose: Callback,
    fromJSON: IAttachments => Callback,
    get: String => CallbackTo[IAttachmentModel],
    has: String => CallbackTo[Boolean],
    isDisposed: Boolean,
    keys: js.Array[String],
    length: Double,
    set: (String, IMimeBundle) => Callback,
    stateChanged: ISignal[IAttachmentsModel, Unit],
    toJSON: CallbackTo[IAttachments],
    remove: /* key */ String => Callback = null
  ): IAttachmentsModel_ = {
    val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], contentFactory = contentFactory.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], stateChanged = stateChanged.asInstanceOf[js.Any])
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("dispose")(dispose.toJsFn)
    __obj.updateDynamic("fromJSON")(js.Any.fromFunction1((t0: typingsJapgolly.jupyterlabCoreutils.nbformatMod.nbformat.IAttachments) => fromJSON(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.updateDynamic("has")(js.Any.fromFunction1((t0: java.lang.String) => has(t0).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.jupyterlabCoreutils.nbformatMod.nbformat.IMimeBundle) => set(t0, t1).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: /* key */ java.lang.String) => remove(t0).runNow()))
    __obj.asInstanceOf[IAttachmentsModel_]
  }
}

