package typingsJapgolly.terraSpacer.components

import typingsJapgolly.terraSpacer.libSpacerMod.SpacerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TerraSpacer {
  
  @JSImport("terra-spacer", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: TerraSpacer.type): SharedBuilder_SpacerProps_16984989 = new SharedBuilder_SpacerProps_16984989(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SpacerProps): SharedBuilder_SpacerProps_16984989 = new SharedBuilder_SpacerProps_16984989(js.Array(this.component, p.asInstanceOf[js.Any]))
}
