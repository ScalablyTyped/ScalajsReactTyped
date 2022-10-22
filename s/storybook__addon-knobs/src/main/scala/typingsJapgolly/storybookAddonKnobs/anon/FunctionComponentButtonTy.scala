package typingsJapgolly.storybookAddonKnobs.anon

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.react.mod.ValidationMap
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesButtonMod.ButtonTypeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FunctionComponent<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Button.ButtonTypeProps> & {serialize (): undefined, deserialize (): undefined} */
@js.native
trait FunctionComponentButtonTy extends StObject {
  
  def apply(props: ButtonTypeProps): Element | Null = js.native
  def apply(props: ButtonTypeProps, context: Any): Element | Null = js.native
  
  var contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
  
  var defaultProps: js.UndefOr[PartialButtonTypeProps] = js.native
  
  def deserialize(): Unit = js.native
  
  var displayName: js.UndefOr[String] = js.native
  
  var propTypes: js.UndefOr[WeakValidationMapButtonTy] = js.native
  
  def serialize(): Unit = js.native
}
