package typingsJapgolly.javascriptObfuscator.iobfuscationeventemitterMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObfuscationEventEmitter extends js.Object {
  /**
    * @param {ObfuscationEvent} event
    * @param args
    * @returns {boolean}
    */
  def emit(
    event: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObfuscationEvent */ js.Any,
    args: js.Any*
  ): Boolean
  /**
    * @param event
    * @param listener
    * @returns this
    */
  def on(
    event: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObfuscationEvent */ js.Any,
    listener: js.Function
  ): this.type
  /**
    * @param event
    * @param listener
    * @returns this
    */
  def once(
    event: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObfuscationEvent */ js.Any,
    listener: js.Function
  ): this.type
}

object IObfuscationEventEmitter {
  @scala.inline
  def apply(
    emit: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObfuscationEvent */ js.Any, /* repeated */ js.Any) => CallbackTo[Boolean],
    on: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObfuscationEvent */ js.Any, js.Function) => CallbackTo[IObfuscationEventEmitter],
    once: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObfuscationEvent */ js.Any, js.Function) => CallbackTo[IObfuscationEventEmitter]
  ): IObfuscationEventEmitter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("emit")(js.Any.fromFunction2((t0: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObfuscationEvent */ js.Any, t1: /* repeated */ js.Any) => emit(t0, t1).runNow()))
    __obj.updateDynamic("on")(js.Any.fromFunction2((t0: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObfuscationEvent */ js.Any, t1: js.Function) => on(t0, t1).runNow()))
    __obj.updateDynamic("once")(js.Any.fromFunction2((t0: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObfuscationEvent */ js.Any, t1: js.Function) => once(t0, t1).runNow()))
    __obj.asInstanceOf[IObfuscationEventEmitter]
  }
}

