package typingsJapgolly.atlaskitVisuallyHidden

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.atlaskitVisuallyHidden.distTypesTypesMod.VisuallyHiddenProps
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesVisuallyHiddenMod extends Shortcut {
  
  /**
    * __Visually hidden__
    *
    * A composable element to apply a visually hidden effect to children.
    * Useful for accessibility compliance.
    *
    * @example
    * ```jsx
    * import VisuallyHidden from '@atlaskit/visually-hidden';
    *
    * export default () => (
    *   <div style={{ border: '1px solid black' }}>
    *      There is text hidden between the brackets [
    *      <VisuallyHidden>Can't see me!</VisuallyHidden>]
    *   </div>
    * );
    * ```
    */
  @JSImport("@atlaskit/visually-hidden/dist/types/visually-hidden", JSImport.Default)
  @js.native
  val default: FC[VisuallyHiddenProps] = js.native
  
  type _To = FC[VisuallyHiddenProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesVisuallyHiddenMod.foo` */
  override def _to: FC[VisuallyHiddenProps] = default
}
