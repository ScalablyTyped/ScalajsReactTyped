package typingsJapgolly.storybookAddonKnobs.anon

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesNumberMod.NumberTypeKnobValue
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesNumberMod.NumberTypeProps
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesNumberMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofNumberType
  extends StObject
     with Instantiable0[default] {
  
  var defaultProps: NumberTypeProps = js.native
  
  def deserialize(value: String): Double | Null = js.native
  
  var propTypes: KnobValidator = js.native
  
  def serialize(): String = js.native
  def serialize(value: NumberTypeKnobValue): String = js.native
}
