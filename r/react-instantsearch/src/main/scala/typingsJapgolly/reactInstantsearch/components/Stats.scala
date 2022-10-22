package typingsJapgolly.reactInstantsearch.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactInstantsearchDom.anon.Translations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Stats {
  
  @JSImport("react-instantsearch/dom", "Stats")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Stats.type): Default[typingsJapgolly.reactInstantsearch.domMod.Stats] = new Default[typingsJapgolly.reactInstantsearch.domMod.Stats](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Translations): Default[typingsJapgolly.reactInstantsearch.domMod.Stats] = new Default[typingsJapgolly.reactInstantsearch.domMod.Stats](js.Array(this.component, p.asInstanceOf[js.Any]))
}
