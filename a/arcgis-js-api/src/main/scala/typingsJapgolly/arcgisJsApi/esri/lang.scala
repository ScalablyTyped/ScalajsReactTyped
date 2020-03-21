package typingsJapgolly.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait lang extends js.Object {
  /**
    * Use this method to deeply clone objects with properties that are computed or have their own `clone()` method. For example, if you are creating an object that stores an initial extent and a spatial reference for your application, you can use `esriLang.clone(initialProps)` to clone this object so that the `extent` and `spatialReference` are properly cloned.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-lang.html#clone)
    *
    * @param elem The object to be cloned.
    *
    */
  def clone(elem: js.Any): js.Any
}

@JSGlobal("__esri.lang")
@js.native
object lang extends TopLevel[lang]

