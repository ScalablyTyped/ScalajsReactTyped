package typingsJapgolly.winrtUwp.Windows.Media.Effects

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IPropertySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The interface defining a custom video compositor definition. */
trait IVideoCompositorDefinition extends js.Object {
  /** Gets the activatable class ID of the video compositor. */
  var activatableClassId: String
  /** Gets the set of properties for configuring the video compositor object. */
  var properties: IPropertySet
}

object IVideoCompositorDefinition {
  @scala.inline
  def apply(activatableClassId: String, properties: IPropertySet): IVideoCompositorDefinition = {
    val __obj = js.Dynamic.literal(activatableClassId = activatableClassId.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IVideoCompositorDefinition]
  }
}

