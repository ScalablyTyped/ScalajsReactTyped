package typingsJapgolly.winrtUwp.Windows.Media.Effects

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IPropertySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Exposes the methods and properties of an AudioEffectDefinition object. Implement this interface when you create a custom audio effect definition. */
trait IAudioEffectDefinition extends js.Object {
  /** The activatable class ID of the audio effect definition. */
  var activatableClassId: String
  /** The set of properties for configuring an AudioEffectDefinition object. */
  var properties: IPropertySet
}

object IAudioEffectDefinition {
  @scala.inline
  def apply(activatableClassId: String, properties: IPropertySet): IAudioEffectDefinition = {
    val __obj = js.Dynamic.literal(activatableClassId = activatableClassId.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IAudioEffectDefinition]
  }
}

