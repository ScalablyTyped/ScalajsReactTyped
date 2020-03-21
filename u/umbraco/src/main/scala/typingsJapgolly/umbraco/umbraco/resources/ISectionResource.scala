package typingsJapgolly.umbraco.umbraco.resources

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @ngdoc service
  * @name umbraco.resources.sectionResource
  * @description Loads in data for section
  **/
trait ISectionResource extends js.Object {
  /** Loads in the data to display the section list */
  def getSections(): Unit
}

object ISectionResource {
  @scala.inline
  def apply(getSections: Callback): ISectionResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getSections")(getSections.toJsFn)
    __obj.asInstanceOf[ISectionResource]
  }
}

