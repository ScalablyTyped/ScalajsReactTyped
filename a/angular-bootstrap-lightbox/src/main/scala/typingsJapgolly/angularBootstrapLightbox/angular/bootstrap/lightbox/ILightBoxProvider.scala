package typingsJapgolly.angularBootstrapLightbox.angular.bootstrap.lightbox

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILightBoxProvider extends js.Object {
  var templateUrl: String
  def calculateImageDimensionLimits(dimensions: IImageDimensionParameter): IImageDimensionLimits
  def calculateModalDimensions(dimensions: IModalDimensionsParameter): IModalDimensions
}

object ILightBoxProvider {
  @scala.inline
  def apply(
    calculateImageDimensionLimits: IImageDimensionParameter => CallbackTo[IImageDimensionLimits],
    calculateModalDimensions: IModalDimensionsParameter => CallbackTo[IModalDimensions],
    templateUrl: String
  ): ILightBoxProvider = {
    val __obj = js.Dynamic.literal(templateUrl = templateUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("calculateImageDimensionLimits")(js.Any.fromFunction1((t0: typingsJapgolly.angularBootstrapLightbox.angular.bootstrap.lightbox.IImageDimensionParameter) => calculateImageDimensionLimits(t0).runNow()))
    __obj.updateDynamic("calculateModalDimensions")(js.Any.fromFunction1((t0: typingsJapgolly.angularBootstrapLightbox.angular.bootstrap.lightbox.IModalDimensionsParameter) => calculateModalDimensions(t0).runNow()))
    __obj.asInstanceOf[ILightBoxProvider]
  }
}

