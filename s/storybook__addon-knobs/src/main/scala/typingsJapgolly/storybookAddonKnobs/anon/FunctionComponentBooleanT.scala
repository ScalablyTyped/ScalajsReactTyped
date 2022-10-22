package typingsJapgolly.storybookAddonKnobs.anon

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.react.mod.ValidationMap
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesBooleanMod.BooleanTypeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FunctionComponent<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Boolean.BooleanTypeProps> & {serialize (value : boolean): string | null, deserialize (value : string | null): boolean} */
@js.native
trait FunctionComponentBooleanT extends StObject {
  
  def apply(props: BooleanTypeProps): Element | Null = js.native
  def apply(props: BooleanTypeProps, context: Any): Element | Null = js.native
  
  var contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
  
  var defaultProps: js.UndefOr[PartialBooleanTypeProps] = js.native
  
  def deserialize(): Boolean = js.native
  def deserialize(value: String): Boolean = js.native
  
  var displayName: js.UndefOr[String] = js.native
  
  var propTypes: js.UndefOr[WeakValidationMapBooleanT] = js.native
  
  def serialize(value: Boolean): String | Null = js.native
}
