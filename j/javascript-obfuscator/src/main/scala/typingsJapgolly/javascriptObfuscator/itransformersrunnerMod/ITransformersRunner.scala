package typingsJapgolly.javascriptObfuscator.itransformersrunnerMod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITransformersRunner extends js.Object {
  /**
    * @param {T} astTree
    * @param {NodeTransformer[]} nodeTransformers
    * @param {TransformationStage} transformationStage
    * @returns {T}
    */
  def transform[T /* <: Node */](
    astTree: T,
    nodeTransformers: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeTransformer */ _
    ],
    transformationStage: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransformationStage */ js.Any
  ): T
}

object ITransformersRunner {
  @scala.inline
  def apply(
    transform: (js.Any, js.Array[js.Any], /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransformationStage */ js.Any) => CallbackTo[js.Any]
  ): ITransformersRunner = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("transform")(js.Any.fromFunction3((t0: js.Any, t1: js.Array[js.Any], t2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransformationStage */ js.Any) => transform(t0, t1, t2).runNow()))
    __obj.asInstanceOf[ITransformersRunner]
  }
}

