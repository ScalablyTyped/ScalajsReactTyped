package typingsJapgolly.reactBulmaComponents

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.div
import typingsJapgolly.reactBulmaComponents.srcComponentsMod.BulmaComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcComponentsLoaderMod extends Shortcut {
  
  @JSImport("react-bulma-components/src/components/loader", JSImport.Default)
  @js.native
  val default: BulmaComponent[js.Object, div] = js.native
  
  type _To = BulmaComponent[js.Object, div]
  
  /* This means you don't have to write `default`, but can instead just say `srcComponentsLoaderMod.foo` */
  override def _to: BulmaComponent[js.Object, div] = default
}
