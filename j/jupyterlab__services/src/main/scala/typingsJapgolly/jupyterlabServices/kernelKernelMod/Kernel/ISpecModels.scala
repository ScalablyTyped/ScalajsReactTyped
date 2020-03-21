package typingsJapgolly.jupyterlabServices.kernelKernelMod.Kernel

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The available kernelSpec models.
  *
  * #### Notes
  * See the [Jupyter Notebook API](http://petstore.swagger.io/?url=https://raw.githubusercontent.com/jupyter/notebook/master/notebook/services/api/api.yaml#!/kernelspecs).
  */
trait ISpecModels extends JSONObject {
  /**
    * The name of the default kernel spec.
    */
  var default: String
  /**
    * A mapping of kernel spec name to spec.
    */
  val kernelspecs: StringDictionary[ISpecModel]
}

object ISpecModels {
  @scala.inline
  def apply(default: String, kernelspecs: StringDictionary[ISpecModel]): ISpecModels = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], kernelspecs = kernelspecs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISpecModels]
  }
}

